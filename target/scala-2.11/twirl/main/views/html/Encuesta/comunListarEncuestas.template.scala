
package views.html.Encuesta

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
object comunListarEncuestas extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[EncuestaRespuesta],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(encres: List[EncuestaRespuesta]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.35*/("""
"""),format.raw/*3.1*/("""	"""),_display_(/*3.3*/if(encres.isEmpty())/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
		"""),format.raw/*4.3*/("""<div class="well">No se localizaron registros</div>
	""")))}/*5.4*/else/*5.9*/{_display_(Seq[Any](format.raw/*5.10*/("""

		"""),format.raw/*7.3*/("""<table class="table table-striped table-bordered" id="tabla">
			<thead>
				<tr>
					<th>Clave de control</th>
					<th>Título</th>
					<th>Fecha inicio de encuesta</th>
					<th>Oficio de valoración</th>
					<th></th>	
				</tr>
			</thead>
			"""),_display_(/*17.5*/for((r,ii) <- encres.zipWithIndex) yield /*17.39*/ {_display_(Seq[Any](format.raw/*17.41*/("""				
				"""),format.raw/*18.5*/("""<tr>
					<td rowspan="1"><a href="/reporte/cesoe/"""),_display_(/*19.47*/r/*19.48*/.recurso.id),format.raw/*19.59*/("""">"""),_display_(/*19.62*/r/*19.63*/.recurso.numcontrol),format.raw/*19.82*/("""  """),format.raw/*19.84*/("""</a> </td>
					<td rowspan="1">"""),_display_(/*20.23*/r/*20.24*/.recurso.titulo),format.raw/*20.39*/("""</td>					
					<td rowspan="1">"""),_display_(/*21.23*/r/*21.24*/.auditinsert.format("dd/MM/yyyy HH:mm:ss")),format.raw/*21.66*/("""</td>
					"""),_display_(/*22.7*/if(r.recurso.oficiovaloracion==null)/*22.43*/{_display_(Seq[Any](format.raw/*22.44*/("""
						"""),format.raw/*23.7*/("""<td rowspan="1">
							<a href=""""),_display_(/*24.18*/routes/*24.24*/.OficioValoracionController.create(r.recurso.id)),format.raw/*24.72*/("""" target="blank">Agregar oficio</a>
						</td>
					""")))}/*26.8*/else/*26.13*/{_display_(Seq[Any](format.raw/*26.14*/("""
						"""),format.raw/*27.7*/("""<td rowspan="1"
							><a href=""""),_display_(/*28.19*/routes/*28.25*/.RecursoController.verOficioValoracion(r.recurso.oficiovaloracion.id)),format.raw/*28.94*/("""" target="_blank">ver oficio """),_display_(/*28.124*/r/*28.125*/.recurso.oficiovaloracion.numero),format.raw/*28.157*/("""</a>
						</td>
					""")))}),format.raw/*30.7*/("""

					"""),_display_(/*32.7*/if(r.estado.id==1L)/*32.26*/{_display_(Seq[Any](format.raw/*32.27*/("""
						"""),format.raw/*33.7*/("""<td rowspan="1">
							<a href=""""),_display_(/*34.18*/routes/*34.24*/.EncuestaController.encuestaPorRevisar(r.id)),format.raw/*34.68*/("""" role="button" class="btn btn-primary btn-block center-block" style="width: 70%">Revisar</a>
						</td>
					""")))}),format.raw/*36.7*/("""
					"""),_display_(/*37.7*/if(r.estado.id==2L)/*37.26*/{_display_(Seq[Any](format.raw/*37.27*/("""
						"""),format.raw/*38.7*/("""<td rowspan="1">
							<a href=""""),_display_(/*39.18*/routes/*39.24*/.EncuestaController.conObservaciones(r.id)),format.raw/*39.66*/("""" role="button" class="btn btn-primary btn-block center-block" style="width: 70%">Observaciones</a>
						</td>
					""")))}),format.raw/*41.7*/("""	
					
					
					"""),_display_(/*44.7*/if(r.recurso.oficiovaloracion==null)/*44.43*/{_display_(Seq[Any](format.raw/*44.44*/("""
					""")))}),format.raw/*45.7*/("""
					
				"""),format.raw/*47.5*/("""</tr>
			""")))}),format.raw/*48.5*/("""

			
		"""),format.raw/*51.3*/("""</table>
		""")))}))}
  }

  def render(encres:List[EncuestaRespuesta]): play.twirl.api.HtmlFormat.Appendable = apply(encres)

  def f:((List[EncuestaRespuesta]) => play.twirl.api.HtmlFormat.Appendable) = (encres) => apply(encres)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:36 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Encuesta/comunListarEncuestas.scala.html
                  HASH: eaed79ac43154227960a569d31d211e7410ced06
                  MATRIX: 764->1|900->34|927->52|954->54|982->74|1020->75|1049->78|1120->133|1131->138|1169->139|1199->143|1475->393|1525->427|1565->429|1601->438|1679->489|1689->490|1721->501|1751->504|1761->505|1801->524|1831->526|1891->559|1901->560|1937->575|1997->608|2007->609|2070->651|2108->663|2153->699|2192->700|2226->707|2287->741|2302->747|2371->795|2443->850|2456->855|2495->856|2529->863|2590->897|2605->903|2695->972|2753->1002|2764->1003|2818->1035|2871->1058|2905->1066|2933->1085|2972->1086|3006->1093|3067->1127|3082->1133|3147->1177|3289->1289|3322->1296|3350->1315|3389->1316|3423->1323|3484->1357|3499->1363|3562->1405|3710->1523|3756->1543|3801->1579|3840->1580|3877->1587|3915->1598|3955->1608|3990->1616
                  LINES: 26->1|29->1|30->3|30->3|30->3|30->3|31->4|32->5|32->5|32->5|34->7|44->17|44->17|44->17|45->18|46->19|46->19|46->19|46->19|46->19|46->19|46->19|47->20|47->20|47->20|48->21|48->21|48->21|49->22|49->22|49->22|50->23|51->24|51->24|51->24|53->26|53->26|53->26|54->27|55->28|55->28|55->28|55->28|55->28|55->28|57->30|59->32|59->32|59->32|60->33|61->34|61->34|61->34|63->36|64->37|64->37|64->37|65->38|66->39|66->39|66->39|68->41|71->44|71->44|71->44|72->45|74->47|75->48|78->51
                  -- GENERATED --
              */
          