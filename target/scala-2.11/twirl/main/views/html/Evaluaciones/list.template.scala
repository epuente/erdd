
package views.html.Evaluaciones

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
					  <li class="active">Todas las evaluaciones</li>
					</ol>			
				</div>
			</div>
			
			<div class="row">
				<div class="col-lg-8">
					<h3>Todas las evaluaciones</h3>
				</div>		
				<div class="col-lg-4" >
					<a class="btn btn-success" id="add" href="routesRecursoevaluadorController.asignarEvaluadoresCreate()">Agregar UA</a>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					"""),_display_(/*24.7*/if(recurso.isEmpty)/*24.26*/{_display_(Seq[Any](format.raw/*24.27*/("""
						"""),format.raw/*25.7*/("""<h1>No hay registros</h1>
					""")))}/*26.8*/else/*26.13*/{_display_(Seq[Any](format.raw/*26.14*/("""				
						"""),format.raw/*27.7*/("""<table class="table table-striped table-bordered">
								<thead>
									<tr>
										<th>Clave de control</th>
										<th>Título</th>
										<th>Nivel educativo</th>
										<th>Programa académico</th>
										<th>Oficio</th>
										<th>Evaluadores asignados</th>
									</tr>
								</thead>
							
								"""),_display_(/*39.10*/for(r <- recurso) yield /*39.27*/ {_display_(Seq[Any](format.raw/*39.29*/("""
								"""),format.raw/*40.9*/("""<tr>
									<td><a href=""""),_display_(/*41.24*/routes/*41.30*/.ReporteController.cesoe(r.id)),format.raw/*41.60*/("""">"""),_display_(/*41.63*/r/*41.64*/.numcontrol),format.raw/*41.75*/("""</a></td>
									<td>"""),_display_(/*42.15*/r/*42.16*/.titulo),format.raw/*42.23*/("""</td>
									<td>"""),_display_(/*43.15*/r/*43.16*/.niveleducativo.descripcion),format.raw/*43.43*/("""</td>
									<td>"""),_display_(/*44.15*/r/*44.16*/.programaacad),format.raw/*44.29*/("""</td>			
									<td>"""),_display_(/*45.15*/r/*45.16*/.oficio.numero),format.raw/*45.30*/("""</td>
									<td>
						
										<div style="display: table; width: 100%;">
											"""),_display_(/*49.13*/for(re <- r.recursoevaluadores) yield /*49.44*/{_display_(Seq[Any](format.raw/*49.45*/("""
											"""),format.raw/*50.12*/("""<div style="display: table-row;">
													<div style="display: table-cell;">"""),_display_(/*51.49*/re/*51.51*/.evaluador.personal.nombreCompleto),format.raw/*51.85*/("""</div>
													<div style="display: table-cell;">"""),_display_(/*52.49*/re/*52.51*/.aspecto.descripcion),format.raw/*52.71*/("""</div>
											</div>
											""")))}),format.raw/*54.13*/("""
										"""),format.raw/*55.11*/("""</div>
										
									</td>			
								</tr>
							
								""")))}),format.raw/*60.10*/("""
							"""),format.raw/*61.8*/("""</table>		
					""")))}),format.raw/*62.7*/("""
				"""),format.raw/*63.5*/("""</div>
			</div>
	</div>
""")))}))}
  }

  def render(recurso:List[Recurso]): play.twirl.api.HtmlFormat.Appendable = apply(recurso)

  def f:((List[Recurso]) => play.twirl.api.HtmlFormat.Appendable) = (recurso) => apply(recurso)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Evaluaciones/list.scala.html
                  HASH: 21c44463d41b3ec274dd8f99bd86bfd9cccf361e
                  MATRIX: 742->1|853->24|881->27|892->31|929->32|957->34|1582->633|1610->652|1649->653|1683->660|1733->693|1746->698|1785->699|1823->710|2182->1042|2215->1059|2255->1061|2291->1070|2346->1098|2361->1104|2412->1134|2442->1137|2452->1138|2484->1149|2535->1173|2545->1174|2573->1181|2620->1201|2630->1202|2678->1229|2725->1249|2735->1250|2769->1263|2819->1286|2829->1287|2864->1301|2983->1393|3030->1424|3069->1425|3109->1437|3218->1519|3229->1521|3284->1555|3366->1610|3377->1612|3418->1632|3486->1669|3525->1680|3623->1747|3658->1755|3705->1772|3737->1777
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|52->24|52->24|52->24|53->25|54->26|54->26|54->26|55->27|67->39|67->39|67->39|68->40|69->41|69->41|69->41|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|77->49|77->49|77->49|78->50|79->51|79->51|79->51|80->52|80->52|80->52|82->54|83->55|88->60|89->61|90->62|91->63
                  -- GENERATED --
              */
          