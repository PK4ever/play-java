
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paulk4ever/Desktop/play-java/conf/routes
// @DATE:Fri Apr 28 01:42:17 EDT 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:7
  class ReverseEventFullController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def delete(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "delete")
    }
  
    // @LINE:11
    def addName(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addEvents")
    }
  
    // @LINE:7
    def search(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "showEvents")
    }
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:17
  class ReverseRestfullController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def deleteEntry(title:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "deleteEntry/" + implicitly[PathBindable[String]].unbind("title", dynamicString(title)))
    }
  
    // @LINE:21
    def postAllEvents(keyword:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "postAllEvents/" + implicitly[PathBindable[String]].unbind("keyword", dynamicString(keyword)))
    }
  
    // @LINE:17
    def updateVote(title:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "updateVote/" + implicitly[PathBindable[String]].unbind("title", dynamicString(title)))
    }
  
  }


}
