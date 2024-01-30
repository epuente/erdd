
package views.html.Recurso

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object cancelado extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Recurso,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(r: Recurso, mensaje:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.30*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
	"""),format.raw/*3.2*/("""<div class="jumbotron">
		<div class="container">
			<p>"""),_display_(/*5.8*/mensaje),format.raw/*5.15*/("""</p> 
			<p>"""),_display_(/*6.8*/r/*6.9*/.numcontrol),format.raw/*6.20*/("""  """),_display_(/*6.23*/r/*6.24*/.titulo),format.raw/*6.31*/(""".</p>
			
		</div>
	</div>

""")))}))}
  }

  def render(r:Recurso,mensaje:String): play.twirl.api.HtmlFormat.Appendable = apply(r,mensaje)

  def f:((Recurso,String) => play.twirl.api.HtmlFormat.Appendable) = (r,mensaje) => apply(r,mensaje)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/cancelado.scala.html
                  HASH: 2e3f5a9e6095883db7e27c33ef52787a09243d13
                  MATRIX: 743->1|859->29|886->31|897->35|934->36|962->38|1044->95|1071->102|1109->115|1117->116|1148->127|1177->130|1186->131|1213->138
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|33->5|33->5|34->6|34->6|34->6|34->6|34->6|34->6
                  -- GENERATED --
              */
          