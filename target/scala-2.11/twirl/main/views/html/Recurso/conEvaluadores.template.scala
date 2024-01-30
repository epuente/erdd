
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
object conEvaluadores extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Recurso,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(r: Recurso):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.14*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
	"""),format.raw/*3.2*/("""<div class="jumbotron">
		<div class="container">
			<p>Se han asignado los siguientes evaluadores</p>
			<p></p>
			
			<table>
				"""),_display_(/*9.6*/for(re<-r.recursoevaluadores) yield /*9.35*/{_display_(Seq[Any](format.raw/*9.36*/("""
					"""),format.raw/*10.6*/("""<tr>
						<td>"""),_display_(/*11.12*/re/*11.14*/.evaluador.personal.nombreCompleto()),format.raw/*11.50*/("""</td><td>"""),_display_(/*11.60*/re/*11.62*/.aspecto.descripcion),format.raw/*11.82*/("""</td>
					</tr>	
				""")))}),format.raw/*13.6*/("""
			"""),format.raw/*14.4*/("""</table>
			
		</div>
	</div>

""")))}))}
  }

  def render(r:Recurso): play.twirl.api.HtmlFormat.Appendable = apply(r)

  def f:((Recurso) => play.twirl.api.HtmlFormat.Appendable) = (r) => apply(r)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/conEvaluadores.scala.html
                  HASH: 69c1d0f305a3bdfc41d8b4983a8e57b7de531c2b
                  MATRIX: 741->1|841->13|868->15|879->19|916->20|944->22|1103->156|1147->185|1185->186|1218->192|1261->208|1272->210|1329->246|1366->256|1377->258|1418->278|1471->301|1502->305
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|37->9|37->9|37->9|38->10|39->11|39->11|39->11|39->11|39->11|39->11|41->13|42->14
                  -- GENERATED --
              */
          