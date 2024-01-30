
package views.html.OficioValoracion

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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Recurso],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recurso:List[Recurso]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.25*/("""

"""),_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
	"""),format.raw/*4.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
				  <li>Recursos</li>
				  <li class="active">Evaluaciones con oficio de valoración</li>
				</ol>			
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
  	          <h3>Evaluaciones con oficio de valoración</h3>
	        </div>
		</div>
		
		"""),_display_(/*19.4*/if(recurso.isEmpty)/*19.23*/{_display_(Seq[Any](format.raw/*19.24*/("""
			"""),format.raw/*20.4*/("""<h1>	No hay registros</h1>
		""")))}/*21.5*/else/*21.10*/{_display_(Seq[Any](format.raw/*21.11*/("""
			"""),_display_(/*22.5*/flashes()),format.raw/*22.14*/("""		
		
		"""),format.raw/*24.3*/("""<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Clave de control</th>
					<th>Título</th>
					<th>Área del conoc.</th>
					<th>Nivel educativo</th>
					<th>Programa académico</th>
					<th>Oficio valoración</th>
				</tr>
			</thead>
		
			"""),_display_(/*36.5*/for(r <- recurso) yield /*36.22*/ {_display_(Seq[Any](format.raw/*36.24*/("""
				"""),format.raw/*37.5*/("""<tr>
					<td><a href=""""),_display_(/*38.20*/routes/*38.26*/.ReporteController.cesoe(r.id)),format.raw/*38.56*/("""">"""),_display_(/*38.59*/r/*38.60*/.numcontrol),format.raw/*38.71*/("""</a></td>
					<td>"""),_display_(/*39.11*/r/*39.12*/.titulo),format.raw/*39.19*/("""</td>
					<td>"""),_display_(/*40.11*/r/*40.12*/.areaconocimiento.descripcion),format.raw/*40.41*/("""</td>
					<td>"""),_display_(/*41.11*/r/*41.12*/.niveleducativo.descripcion),format.raw/*41.39*/("""</td>
					<td>"""),_display_(/*42.11*/r/*42.12*/.programaacad),format.raw/*42.25*/("""</td>			
					<td><a href=""""),_display_(/*43.20*/routes/*43.26*/.RecursoController.verOficioValoracion(r.oficiovaloracion.id)),format.raw/*43.87*/("""" target="blank">Ver oficio de valoración</a></td>
					
								
				</tr>
			""")))}),format.raw/*47.5*/("""
		"""),format.raw/*48.3*/("""</table>		
		""")))}),format.raw/*49.4*/("""
	"""),format.raw/*50.2*/("""</div>
""")))}),format.raw/*51.2*/("""
"""))}
  }

  def render(recurso:List[Recurso]): play.twirl.api.HtmlFormat.Appendable = apply(recurso)

  def f:((List[Recurso]) => play.twirl.api.HtmlFormat.Appendable) = (recurso) => apply(recurso)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/OficioValoracion/list.scala.html
                  HASH: 440905556f9cb219a69e964fb1fa8cfd5dd269a7
                  MATRIX: 746->1|857->24|885->27|896->31|933->32|961->34|1400->447|1428->466|1467->467|1498->471|1546->502|1559->507|1598->508|1629->513|1659->522|1694->530|1997->807|2030->824|2070->826|2102->831|2153->855|2168->861|2219->891|2249->894|2259->895|2291->906|2338->926|2348->927|2376->934|2419->950|2429->951|2479->980|2522->996|2532->997|2580->1024|2623->1040|2633->1041|2667->1054|2722->1082|2737->1088|2819->1149|2929->1229|2959->1232|3003->1246|3032->1248|3070->1256
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|47->19|47->19|47->19|48->20|49->21|49->21|49->21|50->22|50->22|52->24|64->36|64->36|64->36|65->37|66->38|66->38|66->38|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|75->47|76->48|77->49|78->50|79->51
                  -- GENERATED --
              */
          