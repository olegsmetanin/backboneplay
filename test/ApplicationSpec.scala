package test

import org.specs2.mutable._

import play.api.test._
import play.api.test.Helpers._

class ApplicationSpec extends Specification {
  
  "Application" should {
    
    "send 404 on a bad request" in {
      running(FakeApplication()) {
        routeAndCall(FakeRequest(GET, "/boum")) must beNone        
      }
    }

    "/todos is json" in {
      running(FakeApplication()) {
        val home = routeAndCall(FakeRequest(GET, "/todos")).get

        status(home) must equalTo(OK)
        contentType(home) must beSome.which(_ == "application/json")
      }
    }
    
  }
  
}