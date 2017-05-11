
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object hw4_Scope0 {
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

class hw4 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, style: String = "java"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""

"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""

"""),format.raw/*5.1*/("""<P>"""),_display_(/*5.5*/message),format.raw/*5.12*/("""</P>
    <form action=""""),_display_(/*6.20*/routes/*6.26*/.EventFullController.search()),format.raw/*6.55*/("""" method="get">
        Search Event type/name/category etc...:
        <input type="text" name="Event">
        <br><br>
        <input type="submit" value="Submit">
    </form>
""")))}))
      }
    }
  }

  def render(message:String,style:String): play.twirl.api.HtmlFormat.Appendable = apply(message,style)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,style) => apply(message,style)

  def ref: this.type = this

}


}

/**/
object hw4 extends hw4_Scope0.hw4
              /*
                  -- GENERATED --
                  DATE: Tue May 02 16:50:49 EDT 2017
                  SOURCE: /home/paulk4ever/Desktop/play-java/app/views/hw4.scala.html
                  HASH: 9aacda4ccf1a48896e8beb2b2f9c870edcb397a1
                  MATRIX: 748->1|884->42|912->45|959->84|1009->97|1037->99|1066->103|1093->110|1143->134|1157->140|1206->169
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|37->6|37->6|37->6
                  -- GENERATED --
              */
          