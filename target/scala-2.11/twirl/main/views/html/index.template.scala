
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.19*/("""

"""),format.raw/*11.4*/("""

"""),_display_(/*13.2*/main("EVENTS")/*13.16*/ {_display_(Seq[Any](format.raw/*13.18*/("""

    """),format.raw/*18.8*/("""
    """),_display_(/*19.6*/hw4(message, style = "java")),format.raw/*19.34*/("""

""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Apr 13 16:32:44 EDT 2017
                  SOURCE: /home/paulk4ever/Desktop/play-java/app/views/index.scala.html
                  HASH: 08cff4c4e681b21dd6321399c826fe46ea86163a
                  MATRIX: 834->95|946->112|975->308|1004->311|1027->325|1067->327|1100->452|1132->458|1181->486|1214->489
                  LINES: 30->5|35->5|37->11|39->13|39->13|39->13|41->18|42->19|42->19|44->21
                  -- GENERATED --
              */
          