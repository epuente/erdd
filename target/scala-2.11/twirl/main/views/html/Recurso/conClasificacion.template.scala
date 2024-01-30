
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
object conClasificacion extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Recurso,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(r: Recurso):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.14*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
	"""),format.raw/*3.2*/("""<div class="jumbotron">
		<div class="container">
			<p>El recurso ha sido clasificado como</p>
			<p></p>
			<p>"""),_display_(/*7.8*/r/*7.9*/.clasificacion.criterio1.descripcion),format.raw/*7.45*/(""" """),format.raw/*7.46*/("""/ """),_display_(/*7.49*/r/*7.50*/.clasificacion.criterio2.descripcion),format.raw/*7.86*/(""" """),format.raw/*7.87*/("""/ """),_display_(/*7.90*/r/*7.91*/.clasificacion.criterio3.catalogo.descripcion),format.raw/*7.136*/("""</p>
			<p>Tipo de recurso: """),_display_(/*8.25*/r/*8.26*/.clasificacion.tiporecurso.descripcion),format.raw/*8.64*/("""</p>
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
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/conClasificacion.scala.html
                  HASH: d1e5f72e983cca5dc585b28df2855a049569c8e8
                  MATRIX: 743->1|843->13|870->15|881->19|918->20|946->22|1085->136|1093->137|1149->173|1177->174|1206->177|1215->178|1271->214|1299->215|1328->218|1337->219|1403->264|1458->293|1467->294|1525->332
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|35->7|35->7|35->7|35->7|35->7|35->7|35->7|35->7|35->7|35->7|35->7|36->8|36->8|36->8
                  -- GENERATED --
              */
          