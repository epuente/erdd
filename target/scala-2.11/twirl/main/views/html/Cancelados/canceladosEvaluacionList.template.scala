
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
object canceladosEvaluacionList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Recurso],play.twirl.api.HtmlFormat.Appendable] {

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
					  <li class="active">Cancelados en evaluación</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Cancelados en evaluación</h3>
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
									<th>FECHA SOLICITUD / SOLICITANTE</th>
									<th>FECHA CANCELACIÓN</th>
								</tr>
							</thead>
							"""),_display_(/*30.9*/for(r<-r) yield /*30.18*/{_display_(Seq[Any](format.raw/*30.19*/("""
								"""),format.raw/*31.9*/("""<tr>
									<td style="vertical-align: middle;"><a href="/reporte/cesoe/"""),_display_(/*32.71*/r/*32.72*/.id),format.raw/*32.75*/("""">"""),_display_(/*32.78*/r/*32.79*/.numcontrol),format.raw/*32.90*/("""</a></td>
									<td style="vertical-align: middle;">"""),_display_(/*33.47*/r/*33.48*/.titulo),format.raw/*33.55*/("""</td>									
									<td style="vertical-align: middle;">
										<table class="table">
										"""),_display_(/*36.12*/for(x<-r.solicitudescancelacion) yield /*36.44*/{_display_(Seq[Any](format.raw/*36.45*/("""
											"""),format.raw/*37.12*/("""<tr>									
												<td style="vertical-align: middle;">"""),_display_(/*38.50*/x/*38.51*/.fechaSolicitud.format("dd/MM/YYYY hh:mm:ss")),format.raw/*38.96*/("""</td>
												<td style="vertical-align: middle;">"""),_display_(/*39.50*/x/*39.51*/.evaluador.personal.nombreCompleto),format.raw/*39.85*/("""</td>
												<td style="vertical-align: middle;">"""),_display_(/*40.50*/x/*40.51*/.motivoCancelacion),format.raw/*40.69*/("""</td>
											</tr>
										""")))}),format.raw/*42.12*/("""
										"""),format.raw/*43.11*/("""</table>
									</td>
									<td style="vertical-align: middle;">
										"""),_display_(/*46.12*/for(z <- r.historialestados if z.estado.id == 402) yield /*46.62*/{_display_(Seq[Any](format.raw/*46.63*/("""
												"""),_display_(/*47.14*/z/*47.15*/.auditinsert.format("dd/MM/YYYY hh:mm:ss")),format.raw/*47.57*/("""
											""")))}),format.raw/*48.13*/("""
									
									"""),format.raw/*50.10*/("""</td>
								</tr>
							""")))}),format.raw/*52.9*/("""
						"""),format.raw/*53.7*/("""</table>				
					""")))}/*54.8*/else/*54.13*/{_display_(Seq[Any](format.raw/*54.14*/("""
						"""),format.raw/*55.7*/("""No hay registros.	
					""")))}),format.raw/*56.7*/("""
				
				"""),format.raw/*58.5*/("""</div>
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
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Cancelados/canceladosEvaluacionList.scala.html
                  HASH: f36ab8b99a29905dd30829dd2b798e3292fff000
                  MATRIX: 760->1|865->18|893->21|904->25|941->26|969->28|1435->468|1460->484|1499->485|1533->492|1822->755|1847->764|1886->765|1922->774|2024->849|2034->850|2058->853|2088->856|2098->857|2130->868|2213->924|2223->925|2251->932|2382->1036|2430->1068|2469->1069|2509->1081|2599->1144|2609->1145|2675->1190|2757->1245|2767->1246|2822->1280|2904->1335|2914->1336|2953->1354|3018->1388|3057->1399|3165->1480|3231->1530|3270->1531|3311->1545|3321->1546|3384->1588|3428->1601|3476->1621|3534->1649|3568->1656|3605->1676|3618->1681|3657->1682|3691->1689|3746->1714|3783->1724
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|48->20|48->20|48->20|49->21|58->30|58->30|58->30|59->31|60->32|60->32|60->32|60->32|60->32|60->32|61->33|61->33|61->33|64->36|64->36|64->36|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|70->42|71->43|74->46|74->46|74->46|75->47|75->47|75->47|76->48|78->50|80->52|81->53|82->54|82->54|82->54|83->55|84->56|86->58
                  -- GENERATED --
              */
          