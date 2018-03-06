import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClientBuilder
import org.eclipse.jetty.server.Server
import org.specs2.mutable.SpecificationWithJUnit
import org.specs2.specification.BeforeAfterAll

import scala.sys.process._

class DockerIntegrationTest extends SpecificationWithJUnit with DockerITContext {

  "DockerIT" should {
    "run containerized web server and respond with 200" in {
      val client = HttpClientBuilder.create().build()
      val address = s"localhost:$exposedPort"
      val httpGet = new HttpGet(s"http://$address")
      val response = client.execute(httpGet)
      response.getStatusLine.getStatusCode must beEqualTo(200)
    }

    "run two containers that talk to each other" in {
      Process(s"$dockerBin run --rm --name curl1 --network $network $curlContainer curl httpd").!! must contain("It works!")
    }

    "run a container that connects back to test code" in {
      Process(s"$dockerBin run --rm --network host --name curl2 $curlContainer curl localhost:$localServerPort").!! must contain("<html>")
    }
  }
}

trait DockerITContext extends BeforeAfterAll {
  val dockerBin = "docker"
  val network = "cloudbuild"
  val localServerPort = 31337
  val exposedPort = 31338
  var networkCreated = false

  val curlContainer = "bazel/src/it/scala:curl"
  val httpdContainer = "bazel/src/it/scala:httpd"

  val server = new Server(localServerPort)

  def beforeAll: Unit = {
    val netCreateExitCode = Process(s"$dockerBin network create $network").!
     if (netCreateExitCode == 0)
      networkCreated = true
    server.start()
    Process(s"$dockerBin load -i src/it/scala/curl.tar").!!
    Process(s"$dockerBin load -i src/it/scala/httpd.tar").!!
    Process(s"$dockerBin run -p $exposedPort:80 --rm -d --name httpd --network $network $httpdContainer").!!
  }

  def afterAll: Unit = {
    Process(s"$dockerBin kill httpd").!!
    if (networkCreated)
      Process(s"$dockerBin network rm $network").!!
    server.stop()
  }
}
