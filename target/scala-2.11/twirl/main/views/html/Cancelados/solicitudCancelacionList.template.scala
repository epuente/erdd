
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
object solicitudCancelacionList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[SolicitudCancelacion],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sc:List[SolicitudCancelacion]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
	"""),format.raw/*4.2*/("""<div style="background-color: white; padding: 10px; height: 100%">
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Recursos</li>
					  <li class="active">Solicitudes de cancelación</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Solicitudes de cancelación</h3>
		        </div>
			</div>
			<div class="row">
				<div class="col-lg-12">
				
					"""),_display_(/*21.7*/flashes()),format.raw/*21.16*/("""
			
					"""),_display_(/*23.7*/if(!sc.isEmpty())/*23.24*/{_display_(Seq[Any](format.raw/*23.25*/("""
						"""),format.raw/*24.7*/("""<table class="table table-bordered table-condensed">
							<thead>
								<tr>
									<th>CLAVE DE CONTROL</th>
									<th>TÍTULO</th>
									<th>DESCRIPCIÓN</th>
									<th>FECHA SOLICITUD</th>
									<th>SOLICITANTE</th>
									<th></th>
		
								</tr>
							</thead>
							"""),_display_(/*36.9*/for(sc<-sc) yield /*36.20*/{_display_(Seq[Any](format.raw/*36.21*/("""
								"""),format.raw/*37.9*/("""<tr>
									<td style="vertical-align: middle;"><a href="/reporte/cesoe/"""),_display_(/*38.71*/sc/*38.73*/.id),format.raw/*38.76*/("""">"""),_display_(/*38.79*/sc/*38.81*/.recurso.numcontrol),format.raw/*38.100*/("""</a></td>
									<td style="vertical-align: middle;">"""),_display_(/*39.47*/sc/*39.49*/.recurso.titulo),format.raw/*39.64*/("""</td>
									<td style="vertical-align: middle;">"""),_display_(/*40.47*/sc/*40.49*/.recurso.areaconocimiento.descripcion),format.raw/*40.86*/("""</td>
									<td style="vertical-align: middle;">"""),_display_(/*41.47*/sc/*41.49*/.fechaSolicitud.format("dd/MM/YYYY hh:mm:ss")),format.raw/*41.94*/("""</td>
									<td style="vertical-align: middle;">"""),_display_(/*42.47*/sc/*42.49*/.evaluador.personal.nombreCompleto),format.raw/*42.83*/("""</td>
									<td style="vertical-align: middle;"><a class="btn btn-primary" href="/solicitudCancelado/"""),_display_(/*43.100*/sc/*43.102*/.recurso.id),format.raw/*43.113*/("""" role="button">Revisar</a></td>
								</tr>
							""")))}),format.raw/*45.9*/("""
						"""),format.raw/*46.7*/("""</table>				
					""")))}/*47.8*/else/*47.13*/{_display_(Seq[Any](format.raw/*47.14*/("""
						"""),format.raw/*48.7*/("""No hay registros.	
					""")))}),format.raw/*49.7*/("""
				
				"""),format.raw/*51.5*/("""</div>
			</div>		
	</div>
""")))}))}
  }

  def render(sc:List[SolicitudCancelacion]): play.twirl.api.HtmlFormat.Appendable = apply(sc)

  def f:((List[SolicitudCancelacion]) => play.twirl.api.HtmlFormat.Appendable) = (sc) => apply(sc)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Cancelados/solicitudCancelacionList.scala.html
                  HASH: 8965eef45c6da72f800345eb0aa33fce8d41f299
                  MATRIX: 773->1|892->32|920->35|931->39|968->40|996->42|1471->491|1501->500|1538->511|1564->528|1603->529|1637->536|1958->831|1985->842|2024->843|2060->852|2162->927|2173->929|2197->932|2227->935|2238->937|2279->956|2362->1012|2373->1014|2409->1029|2488->1081|2499->1083|2557->1120|2636->1172|2647->1174|2713->1219|2792->1271|2803->1273|2858->1307|2991->1412|3003->1414|3036->1425|3121->1480|3155->1487|3192->1507|3205->1512|3244->1513|3278->1520|3333->1545|3370->1555
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|49->21|49->21|51->23|51->23|51->23|52->24|64->36|64->36|64->36|65->37|66->38|66->38|66->38|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|73->45|74->46|75->47|75->47|75->47|76->48|77->49|79->51
                  -- GENERATED --
              */
          