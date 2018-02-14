import java.io.File

import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClientBuilder
import org.specs2.mutable.SpecificationWithJUnit
import org.specs2.specification.BeforeAfterAll
import org.eclipse.jetty.server.Server

import scala.sys.process._

class DockerIntegrationTest extends SpecificationWithJUnit with DockerITContext {

  "DockerIT" should {
    "run containerized web server and respond with 200" in {
      val client = HttpClientBuilder.create().build()
      val address = if(runningInDocker) "httpd" else s"localhost:$exposedPort"
      val httpGet = new HttpGet(s"http://$address")
      val response = client.execute(httpGet)
      response.getStatusLine.getStatusCode must beEqualTo(200)
    }

    "run two containers that talk to each other" in {
      Process(s"$dockerBin run --rm --name curl1 --network $network appropriate/curl curl httpd").!! must contain("It works!")
    }

    "run a container that connects back to test code" in {
      Process(s"$dockerBin run --rm --name curl2 --network $network appropriate/curl curl $localHostname:$localServerPort").!! must contain("<html>")
    }
  }
}

trait DockerITContext extends BeforeAfterAll {
  val dockerBin = "docker"
  val network = "cloudbuild"
  val localServerPort = 31337
  val exposedPort = 31338
  val localHostname: String = if(runningInDocker) Process("hostname").!!.trim else "localhost"
  var networkCreated = false

  val server = new Server(localServerPort)

  def runningInDocker: Boolean = {
    val cgroupFilePath = "/proc/self/cgroup"
    new File(cgroupFilePath).exists && Process(s"cat $cgroupFilePath").!!.contains("docker")
  }

  def beforeAll: Unit = {
    val netCreateExitCode = Process(s"$dockerBin network create $network").!
    if (netCreateExitCode == 0)
      networkCreated = true
    server.start()
    Process(s"$dockerBin run -p $exposedPort:80 --rm -d --name httpd --network $network httpd:alpine").!!
  }

  def afterAll: Unit = {
    Process(s"$dockerBin kill httpd").!!
    if (networkCreated)
      Process(s"$dockerBin network rm $network").!!
    server.stop()
  }


}
