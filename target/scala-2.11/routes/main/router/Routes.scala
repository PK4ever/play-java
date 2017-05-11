
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paulk4ever/Desktop/play-java/conf/routes
// @DATE:Fri Apr 28 01:42:17 EDT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HomeController_0: controllers.HomeController,
  // @LINE:7
  EventFullController_1: controllers.EventFullController,
  // @LINE:17
  RestfullController_2: controllers.RestfullController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_0: controllers.HomeController,
    // @LINE:7
    EventFullController_1: controllers.EventFullController,
    // @LINE:17
    RestfullController_2: controllers.RestfullController
  ) = this(errorHandler, HomeController_0, EventFullController_1, RestfullController_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, EventFullController_1, RestfullController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showEvents""", """controllers.EventFullController.search()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addEvents""", """controllers.EventFullController.addName()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete""", """controllers.EventFullController.delete()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateVote/""" + "$" + """title<[^/]+>""", """controllers.RestfullController.updateVote(title:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """postAllEvents/""" + "$" + """keyword<[^/]+>""", """controllers.RestfullController.postAllEvents(keyword:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteEntry/""" + "$" + """title<[^/]+>""", """controllers.RestfullController.deleteEntry(title:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_EventFullController_search1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showEvents")))
  )
  private[this] lazy val controllers_EventFullController_search1_invoker = createInvoker(
    EventFullController_1.search(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EventFullController",
      "search",
      Nil,
      "GET",
      """""",
      this.prefix + """showEvents"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_EventFullController_addName2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addEvents")))
  )
  private[this] lazy val controllers_EventFullController_addName2_invoker = createInvoker(
    EventFullController_1.addName(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EventFullController",
      "addName",
      Nil,
      "POST",
      """""",
      this.prefix + """addEvents"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_EventFullController_delete3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete")))
  )
  private[this] lazy val controllers_EventFullController_delete3_invoker = createInvoker(
    EventFullController_1.delete(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EventFullController",
      "delete",
      Nil,
      "POST",
      """""",
      this.prefix + """delete"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_RestfullController_updateVote4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateVote/"), DynamicPart("title", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestfullController_updateVote4_invoker = createInvoker(
    RestfullController_2.updateVote(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestfullController",
      "updateVote",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """updateVote/""" + "$" + """title<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_RestfullController_postAllEvents5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postAllEvents/"), DynamicPart("keyword", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestfullController_postAllEvents5_invoker = createInvoker(
    RestfullController_2.postAllEvents(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestfullController",
      "postAllEvents",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """postAllEvents/""" + "$" + """keyword<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_RestfullController_deleteEntry6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteEntry/"), DynamicPart("title", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RestfullController_deleteEntry6_invoker = createInvoker(
    RestfullController_2.deleteEntry(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestfullController",
      "deleteEntry",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """deleteEntry/""" + "$" + """title<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_EventFullController_search1_route(params) =>
      call { 
        controllers_EventFullController_search1_invoker.call(EventFullController_1.search())
      }
  
    // @LINE:11
    case controllers_EventFullController_addName2_route(params) =>
      call { 
        controllers_EventFullController_addName2_invoker.call(EventFullController_1.addName())
      }
  
    // @LINE:13
    case controllers_EventFullController_delete3_route(params) =>
      call { 
        controllers_EventFullController_delete3_invoker.call(EventFullController_1.delete())
      }
  
    // @LINE:17
    case controllers_RestfullController_updateVote4_route(params) =>
      call(params.fromPath[String]("title", None)) { (title) =>
        controllers_RestfullController_updateVote4_invoker.call(RestfullController_2.updateVote(title))
      }
  
    // @LINE:21
    case controllers_RestfullController_postAllEvents5_route(params) =>
      call(params.fromPath[String]("keyword", None)) { (keyword) =>
        controllers_RestfullController_postAllEvents5_invoker.call(RestfullController_2.postAllEvents(keyword))
      }
  
    // @LINE:23
    case controllers_RestfullController_deleteEntry6_route(params) =>
      call(params.fromPath[String]("title", None)) { (title) =>
        controllers_RestfullController_deleteEntry6_invoker.call(RestfullController_2.deleteEntry(title))
      }
  }
}
