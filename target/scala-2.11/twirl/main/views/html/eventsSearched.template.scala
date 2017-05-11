
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object eventsSearched_Scope0 {
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

     object eventsSearched_Scope1 {
import com.evdb.javaapi.data.Event
import java.util

class eventsSearched extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.ArrayList[Event],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(list : util.ArrayList[Event]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.32*/("""

"""),format.raw/*8.33*/("""
"""),format.raw/*9.1*/("""<Ol>
"""),_display_(/*10.2*/for(event <- list) yield /*10.20*/ {_display_(Seq[Any](format.raw/*10.22*/("""
    """),format.raw/*11.5*/("""<form action=""""),_display_(/*11.20*/routes/*11.26*/.EventFullController.addName()),format.raw/*11.56*/("""" method="POST">
    <input type="hidden" name="name" value=""""),_display_(/*12.46*/event/*12.51*/.getTitle),format.raw/*12.60*/(""""/>
        <input type="hidden" name="venue" value=""""),_display_(/*13.51*/event/*13.56*/.getVenueAddress),format.raw/*13.72*/(""""/>
        <li>"""),_display_(/*14.14*/event/*14.19*/.getTitle),format.raw/*14.28*/(""" """),format.raw/*14.29*/("""<br>
        """),_display_(/*15.10*/event/*15.15*/.getVenueAddress),format.raw/*15.31*/("""
        """),format.raw/*16.9*/("""</li>

    <input type="submit" value="like"/>
    <br><br>
    </form>
""")))}),format.raw/*21.2*/("""
"""),format.raw/*22.1*/("""</Ol>
"""))
      }
    }
  }

  def render(list:util.ArrayList[Event]): play.twirl.api.HtmlFormat.Appendable = apply(list)

  def f:((util.ArrayList[Event]) => play.twirl.api.HtmlFormat.Appendable) = (list) => apply(list)

  def ref: this.type = this

}


}
}

/**/
object eventsSearched extends eventsSearched_Scope0.eventsSearched_Scope1.eventsSearched
              /*
                  -- GENERATED --
                  DATE: Thu Apr 27 02:03:07 EDT 2017
                  SOURCE: /home/paulk4ever/Desktop/play-java/app/views/eventsSearched.scala.html
                  HASH: 0de9a9315ecb480c3c24adb9f5bb42ea244a2c75
                  MATRIX: 867->58|992->88|1021->122|1048->123|1080->129|1114->147|1154->149|1186->154|1228->169|1243->175|1294->205|1383->267|1397->272|1427->281|1508->335|1522->340|1559->356|1603->373|1617->378|1647->387|1676->388|1717->402|1731->407|1768->423|1804->432|1907->505|1935->506
                  LINES: 31->6|36->6|38->8|39->9|40->10|40->10|40->10|41->11|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|44->14|45->15|45->15|45->15|46->16|51->21|52->22
                  -- GENERATED --
              */
          