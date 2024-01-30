
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
object solicitudCancelacion extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[SolicitudCancelacion,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sc:SolicitudCancelacion):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*3.1*/("""  """),format.raw/*3.3*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*3.48*/routes/*3.54*/.Assets.at("stylesheets/recurso.css")),format.raw/*3.91*/(""""/>

"""),_display_(/*5.2*/main/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""
	"""),format.raw/*6.2*/("""<div style="background-color: white; padding: 10px; height: 100%">
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Recursos</li>
					  <li><a href=""""),_display_(/*11.22*/routes/*11.28*/.RecursoController.solicitudCanceladoList()),format.raw/*11.71*/("""">Solicitudes de cancelación</a></li>
					  <li class="active">Revisar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Revisar</h3>
		        </div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					"""),_display_(/*23.7*/if( sc != null)/*23.22*/{_display_(Seq[Any](format.raw/*23.23*/("""				
					
						"""),format.raw/*25.7*/("""<table class="table table-bordered tablaReporte">
								<tr>
									<td colspan="5"><div class="etiqueta">Título</div><div class="contenido">"""),_display_(/*27.84*/sc/*27.86*/.recurso.titulo),format.raw/*27.101*/("""</div></td>
									<td colspan="1"><div class="etiqueta">Clave de control</div><div class="contenido">"""),_display_(/*28.94*/sc/*28.96*/.recurso.numcontrol),format.raw/*28.115*/("""</div></td>
								</tr>
								<tr>
									<td colspan="2">
										<div class="etiqueta">Nivel académico</div><div class="contenido">"""),_display_(/*32.78*/sc/*32.80*/.recurso.niveleducativo.descripcion),format.raw/*32.115*/("""</div>
									</td>
									<td colspan="3">
										<div class="etiqueta">Área del conocimiento</div><div class="contenido">"""),_display_(/*35.84*/sc/*35.86*/.recurso.areaconocimiento.descripcion),format.raw/*35.123*/("""</div>
									</td>
									<td colspan="2">
										<div class="etiqueta">Unidad Académica</div><div class="contenido">"""),_display_(/*38.79*/sc/*38.81*/.recurso.unidadacademica.nombre),format.raw/*38.112*/("""</div>
									</td>									
								</tr>
								<tr>
									<td colspan="5">
										<div class="etiqueta">Programa Académico:</div><div class="contenido">"""),_display_(/*43.82*/sc/*43.84*/.recurso.programaacad),format.raw/*43.105*/("""</div>
									</td>	
									<td>
										<div class="etiqueta">Modalidad</div><div class="contenido">"""),_display_(/*46.72*/{ if (sc.recurso.modalidad != null)sc.recurso.modalidad.descripcion}),format.raw/*46.140*/("""</div>
									</td>
								</tr>
								<tr>
									<td colspan="7">
										<div class="etiqueta">Motivo de cancelación</div><div class="contenido">"""),_display_(/*51.84*/sc/*51.86*/.motivoCancelacion),format.raw/*51.104*/("""</div>
									</td>

								</tr>
								<tr>
									<td colspan="3">
										<div class="etiqueta">Fecha de solicitud</div><div class="contenido">"""),_display_(/*57.81*/sc/*57.83*/.fechaSolicitud.format("dd/MM/YYYY hh:mm:ss")),format.raw/*57.128*/("""</div>
									</td>
									<td colspan="4">
										<div class="etiqueta">Solicitante</div><div class="contenido">"""),_display_(/*60.74*/sc/*60.76*/.evaluador.personal.nombreCompleto),format.raw/*60.110*/("""</div>
									</td>

									
								</tr>
								
						</table>
						
						
						<div class="row">
							<div class="col-md-6">
								"""),_display_(/*71.10*/form(CSRF(routes.RecursoController.cancelarRecursoEvaluacion(sc.id)), 'id->"frmSolicitudCancelar")/*71.108*/ {_display_(Seq[Any](format.raw/*71.110*/("""
									"""),format.raw/*72.10*/("""<td><a class="btn btn-danger btn-block center-block" href="#" role="button" id="btnCancelar">Aceptar solicitud de cancelación, cancelar recurso</a></td>
								""")))}),format.raw/*73.10*/("""							
							"""),format.raw/*74.8*/("""</div>
							<div class="col-md-6">
								"""),_display_(/*76.10*/form(CSRF(routes.RecursoController.reactivarRecursoEvaluacion(sc.id)), 'id->"frmSolicitudReactivar")/*76.110*/ {_display_(Seq[Any](format.raw/*76.112*/("""
									"""),format.raw/*77.10*/("""<td><a class="btn btn-success btn-block center-block" href="#" role="button" id="btnReactivar">Revocar solicitud de cancelación, reactivar recurso</a></td>
								""")))}),format.raw/*78.10*/("""							
							"""),format.raw/*79.8*/("""</div>							
						</div>
					""")))}/*81.8*/else/*81.13*/{_display_(Seq[Any](format.raw/*81.14*/("""
						"""),format.raw/*82.7*/("""No hay registros.	
					""")))}),format.raw/*83.7*/("""
				
				"""),format.raw/*85.5*/("""</div>
			</div>		
	</div>
""")))}),format.raw/*88.2*/("""


"""),format.raw/*91.1*/("""<script type="text/javascript">

	$("#btnReactivar").on("click", function()"""),format.raw/*93.43*/("""{"""),format.raw/*93.44*/("""
		"""),format.raw/*94.3*/("""$("#frmSolicitudReactivar").submit();
	"""),format.raw/*95.2*/("""}"""),format.raw/*95.3*/(""");
	
	$("#btnCancelar").on("click", function()"""),format.raw/*97.42*/("""{"""),format.raw/*97.43*/("""
		"""),format.raw/*98.3*/("""$("#frmSolicitudCancelar").submit();
	"""),format.raw/*99.2*/("""}"""),format.raw/*99.3*/(""");	
</script>"""))}
  }

  def render(sc:SolicitudCancelacion): play.twirl.api.HtmlFormat.Appendable = apply(sc)

  def f:((SolicitudCancelacion) => play.twirl.api.HtmlFormat.Appendable) = (sc) => apply(sc)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Cancelados/solicitudCancelacion.scala.html
                  HASH: 3be3a052f5a0ef72a4db34f4fef747da7858a1bf
                  MATRIX: 763->1|891->26|918->44|946->46|1017->91|1031->97|1088->134|1119->140|1130->144|1167->145|1195->147|1413->338|1428->344|1492->387|1792->661|1816->676|1855->677|1899->694|2072->840|2083->842|2120->857|2252->962|2263->964|2304->983|2473->1125|2484->1127|2541->1162|2699->1293|2710->1295|2769->1332|2922->1458|2933->1460|2986->1491|3178->1656|3189->1658|3232->1679|3367->1787|3457->1855|3642->2013|3653->2015|3693->2033|3876->2189|3887->2191|3954->2236|4102->2357|4113->2359|4169->2393|4344->2541|4452->2639|4493->2641|4531->2651|4724->2813|4766->2828|4839->2874|4949->2974|4990->2976|5028->2986|5224->3151|5266->3166|5317->3200|5330->3205|5369->3206|5403->3213|5458->3238|5495->3248|5553->3276|5583->3279|5686->3354|5715->3355|5745->3358|5811->3397|5839->3398|5913->3444|5942->3445|5972->3448|6037->3486|6065->3487
                  LINES: 26->1|29->1|30->3|30->3|30->3|30->3|30->3|32->5|32->5|32->5|33->6|38->11|38->11|38->11|50->23|50->23|50->23|52->25|54->27|54->27|54->27|55->28|55->28|55->28|59->32|59->32|59->32|62->35|62->35|62->35|65->38|65->38|65->38|70->43|70->43|70->43|73->46|73->46|78->51|78->51|78->51|84->57|84->57|84->57|87->60|87->60|87->60|98->71|98->71|98->71|99->72|100->73|101->74|103->76|103->76|103->76|104->77|105->78|106->79|108->81|108->81|108->81|109->82|110->83|112->85|115->88|118->91|120->93|120->93|121->94|122->95|122->95|124->97|124->97|125->98|126->99|126->99
                  -- GENERATED --
              */
          