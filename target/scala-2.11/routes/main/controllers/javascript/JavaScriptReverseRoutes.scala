
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paulk4ever/Desktop/play-java/conf/routes
// @DATE:Fri Apr 28 01:42:17 EDT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:7
  class ReverseEventFullController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EventFullController.delete",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete"})
        }
      """
    )
  
    // @LINE:11
    def addName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EventFullController.addName",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addEvents"})
        }
      """
    )
  
    // @LINE:7
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EventFullController.search",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showEvents"})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseRestfullController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def deleteEntry: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestfullController.deleteEntry",
      """
        function(title0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteEntry/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("title", encodeURIComponent(title0))})
        }
      """
    )
  
    // @LINE:21
    def postAllEvents: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestfullController.postAllEvents",
      """
        function(keyword0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "postAllEvents/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("keyword", encodeURIComponent(keyword0))})
        }
      """
    )
  
    // @LINE:17
    def updateVote: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestfullController.updateVote",
      """
        function(title0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "updateVote/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("title", encodeURIComponent(title0))})
        }
      """
    )
  
  }


}
