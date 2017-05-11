
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object liked_Scope0 {
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

class liked extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[EventfulModel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(list: List[EventfulModel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.29*/("""
"""),format.raw/*3.1*/("""<Ol>
"""),_display_(/*4.2*/for(event <- list) yield /*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
    """),format.raw/*5.5*/("""<form action=""""),_display_(/*5.20*/routes/*5.26*/.EventFullController.delete()),format.raw/*5.55*/("""" method="POST">

        <input type="hidden" name="name" value=""""),_display_(/*7.50*/event/*7.55*/.getTitle),format.raw/*7.64*/(""""/>
        <li>"""),_display_(/*8.14*/event/*8.19*/.getTitle),format.raw/*8.28*/(""" """),format.raw/*8.29*/("""<br>
        """),_display_(/*9.10*/event/*9.15*/.getVenue()),format.raw/*9.26*/("""
        """),format.raw/*10.9*/("""</li>
        <input type="submit" value="delete"/>
        <br><br>
    </form>
""")))}),format.raw/*14.2*/("""
"""),format.raw/*15.1*/("""</Ol>
<form action=""""),_display_(/*16.16*/routes/*16.22*/.HomeController.index()),format.raw/*16.45*/("""" method="GET">
    <input type="submit" value="Back to home page"/>
    <br><br>
</form>"""))
      }
    }
  }

  def render(list:List[EventfulModel]): play.twirl.api.HtmlFormat.Appendable = apply(list)

  def f:((List[EventfulModel]) => play.twirl.api.HtmlFormat.Appendable) = (list) => apply(list)

  def ref: this.type = this

}


}

/**/
object liked extends liked_Scope0.liked
              /*
                  -- GENERATED --
                  DATE: Thu Apr 27 02:03:07 EDT 2017
                  SOURCE: /home/paulk4ever/Desktop/play-java/app/views/liked.scala.html
                  HASH: b619b3e5fd4501719d5184fe022a6b9d35db7943
                  MATRIX: 758->2|880->29|907->30|938->36|971->54|1010->56|1041->61|1082->76|1096->82|1145->111|1238->178|1251->183|1280->192|1323->209|1336->214|1365->223|1393->224|1433->238|1446->243|1477->254|1513->263|1625->345|1653->346|1701->367|1716->373|1760->396
                  LINES: 27->2|32->2|33->3|34->4|34->4|34->4|35->5|35->5|35->5|35->5|37->7|37->7|37->7|38->8|38->8|38->8|38->8|39->9|39->9|39->9|40->10|44->14|45->15|46->16|46->16|46->16
                  -- GENERATED --
              */
          