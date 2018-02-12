import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClientBuilder
import org.specs2.mutable.SpecificationWithJUnit
import org.specs2.specification.BeforeAfterAll

import scala.sys.process._

class DockerIntegrationTest extends SpecificationWithJUnit with BeforeAfterAll {

  val dockerBin = "docker"
  val externalPort = "31337"

  "DockerIT" should {
    "run containerized web server and respond with 200" in {

      val client = HttpClientBuilder.create().build()
      val httpGet = new HttpGet("http://localhost:" + externalPort)
      val response = client.execute(httpGet)
      response.getStatusLine.getStatusCode must beEqualTo(200)
    }

    "run two containers that talk to each other" in {

      Process(s"$dockerBin run --rm --name curl --network my_test_network appropriate/curl curl http://httpd:80").!! must contain("It works!")
    }
  }

  def beforeAll: Unit = {

    Process(s"$dockerBin network create my_test_network").!!
    Process(s"$dockerBin run --rm -d -p $externalPort:80 --name httpd --network my_test_network httpd:alpine").!!
  }

  def afterAll: Unit = {
    Process(s"$dockerBin kill httpd").!!
    Process(s"$dockerBin network rm my_test_network").!!
  }
}
