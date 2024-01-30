
package views.html.Cancelados

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
object canceladosClasificacionList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Recurso],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(r:List[Recurso]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
	"""),format.raw/*4.2*/("""<div style="background-color: white; padding: 10px; height: 100%">
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Recursos</li>
					  <li class="active">Cancelados en clasificacion</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Cancelados en clasificación</h3>
		        </div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					"""),_display_(/*20.7*/if(!r.isEmpty())/*20.23*/{_display_(Seq[Any](format.raw/*20.24*/("""
						"""),format.raw/*21.7*/("""<table class="table table-bordered table-condensed">
							<thead>
								<tr>
									<th>CLAVE DE CONTROL</th>
									<th>TÍTULO</th>
									<th>OBSERVACIÓN</th>
									<th>FECHA CANCELACIÓN</th>
								</tr>
							</thead>
							"""),_display_(/*30.9*/for(r<-r) yield /*30.18*/{_display_(Seq[Any](format.raw/*30.19*/("""
							"""),format.raw/*31.8*/("""<tr>
								<td style="vertical-align: middle;"><a href="/reporte/cesoe/"""),_display_(/*32.70*/r/*32.71*/.id),format.raw/*32.74*/("""">"""),_display_(/*32.77*/r/*32.78*/.numcontrol),format.raw/*32.89*/("""</a></td>
								<td style="vertical-align: middle;">"""),_display_(/*33.46*/r/*33.47*/.titulo),format.raw/*33.54*/("""</td>
								<td style="vertical-align: middle;">
									"""),_display_(/*35.11*/if(r.observacioncancelacion != null)/*35.47*/{_display_(Seq[Any](format.raw/*35.48*/("""
										"""),_display_(/*36.12*/r/*36.13*/.observacioncancelacion.observacion),format.raw/*36.48*/("""
									""")))}),format.raw/*37.11*/("""
								"""),format.raw/*38.9*/("""</td>
								<td style="vertical-align: middle;">
										"""),_display_(/*40.12*/for(z <- r.historialestados if z.estado.id == 401) yield /*40.62*/{_display_(Seq[Any](format.raw/*40.63*/("""
											"""),_display_(/*41.13*/z/*41.14*/.auditinsert.format("dd/MM/YYYY hh:mm:ss")),format.raw/*41.56*/("""
										""")))}),format.raw/*42.12*/("""
								
								"""),format.raw/*44.9*/("""</td>

							</tr>
							""")))}),format.raw/*47.9*/("""
						"""),format.raw/*48.7*/("""</table>				
					""")))}/*49.8*/else/*49.13*/{_display_(Seq[Any](format.raw/*49.14*/("""
						"""),format.raw/*50.7*/("""No hay registros.	
					""")))}),format.raw/*51.7*/("""
				
				"""),format.raw/*53.5*/("""</div>
			</div>		
	</div>
""")))}))}
  }

  def render(r:List[Recurso]): play.twirl.api.HtmlFormat.Appendable = apply(r)

  def f:((List[Recurso]) => play.twirl.api.HtmlFormat.Appendable) = (r) => apply(r)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Cancelados/canceladosClasificacionList.scala.html
                  HASH: 2b471ffdef80ae2377181f5e36f7736559c84eba
                  MATRIX: 763->1|868->18|896->21|907->25|944->26|972->28|1444->474|1469->490|1508->491|1542->498|1813->743|1838->752|1877->753|1912->761|2013->835|2023->836|2047->839|2077->842|2087->843|2119->854|2201->909|2211->910|2239->917|2327->978|2372->1014|2411->1015|2450->1027|2460->1028|2516->1063|2558->1074|2594->1083|2683->1145|2749->1195|2788->1196|2828->1209|2838->1210|2901->1252|2944->1264|2989->1282|3047->1310|3081->1317|3118->1337|3131->1342|3170->1343|3204->1350|3259->1375|3296->1385
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|48->20|48->20|48->20|49->21|58->30|58->30|58->30|59->31|60->32|60->32|60->32|60->32|60->32|60->32|61->33|61->33|61->33|63->35|63->35|63->35|64->36|64->36|64->36|65->37|66->38|68->40|68->40|68->40|69->41|69->41|69->41|70->42|72->44|75->47|76->48|77->49|77->49|77->49|78->50|79->51|81->53
                  -- GENERATED --
              */
          