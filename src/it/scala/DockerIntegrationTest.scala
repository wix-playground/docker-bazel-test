import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.HttpClientBuilder
import org.specs2.mutable.SpecificationWithJUnit
import scala.sys.process._

class DockerIntegrationTest extends SpecificationWithJUnit {

  "DockerIT" should {
    "run containerized web server and respond with 200" in {

      val externalPort = "31337"
      Process("docker run -d -p " + externalPort + ":80 --name docker_it httpd:alpine").!!
      val client = HttpClientBuilder.create().build()
      val httpGet = new HttpGet("http://localhost:" + externalPort)
      val response = client.execute(httpGet)
      Process("docker rm -f docker_it").!!
      response.getStatusLine.getStatusCode must beEqualTo(200)
    }
  }
}
