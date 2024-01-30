
package views.html.Recursoevaluador

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
object comunListarEvaluaciones extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Recursoevaluador],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(re: List[Recursoevaluador], tipo:Int):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.40*/("""
"""),format.raw/*2.1*/("""<script src=""""),_display_(/*2.15*/routes/*2.21*/.Assets.at("javascripts/utilerias.js")),format.raw/*2.59*/(""""></script>

"""),format.raw/*5.1*/("""
	"""),_display_(/*6.3*/if(re.isEmpty)/*6.17*/{_display_(Seq[Any](format.raw/*6.18*/("""
		"""),format.raw/*7.3*/("""<div class="well">No se localizaron registros</div>
	""")))}/*8.4*/else/*8.9*/{_display_(Seq[Any](format.raw/*8.10*/("""

		"""),format.raw/*10.3*/("""<table class="table table-striped table-bordered" id="tabla">
			<thead>
				<tr>
					<th>Clave de control</th>
					<th>Título</th>
					"""),_display_(/*15.7*/if(tipo == 1)/*15.20*/{_display_(Seq[Any](format.raw/*15.21*/("""
						"""),format.raw/*16.7*/("""<th>Aspecto</th>
						<th>Evaluador</th>
					""")))}),format.raw/*18.7*/("""
					"""),format.raw/*19.6*/("""<th>Autor responsable</th>
					<th>Fecha límite</th>
					<th colspan="4"></th>	
					"""),_display_(/*22.7*/if(re(0).recurso.estado.id == 10 && tipo == 0)/*22.53*/{_display_(Seq[Any](format.raw/*22.54*/("""
						"""),format.raw/*23.7*/("""<th></th>
					""")))}),format.raw/*24.7*/("""					
				"""),format.raw/*25.5*/("""</tr>
			</thead>
			"""),_display_(/*27.5*/for((r,ii) <- re.zipWithIndex) yield /*27.35*/ {_display_(Seq[Any](format.raw/*27.37*/("""				
				"""),format.raw/*28.5*/("""<tr>
					<td rowspan="1"><a href="/reporte/cesoe/"""),_display_(/*29.47*/r/*29.48*/.recurso.id),format.raw/*29.59*/("""">"""),_display_(/*29.62*/r/*29.63*/.recurso.numcontrol),format.raw/*29.82*/("""  """),format.raw/*29.84*/("""</a> </td>
					<td rowspan="1">"""),_display_(/*30.23*/r/*30.24*/.recurso.titulo),format.raw/*30.39*/("""</td>		
  					"""),_display_(/*31.9*/if(tipo == 1)/*31.22*/{_display_(Seq[Any](format.raw/*31.23*/(""" 
						"""),format.raw/*32.7*/("""<td rowspan="1">"""),_display_(/*32.24*/r/*32.25*/.aspecto.descripcion),format.raw/*32.45*/("""</td>
						<td rowspan="1">"""),_display_(/*33.24*/r/*33.25*/.evaluador.personal.nombreCompleto),format.raw/*33.59*/("""</td>
					""")))}),format.raw/*34.7*/("""
					"""),format.raw/*35.6*/("""<td rowspan="1">"""),_display_(/*35.23*/r/*35.24*/.recurso.getResponsable().nombreCompleto()),format.raw/*35.66*/("""</td>
					<td rowspan="1">
						"""),_display_(/*37.8*/r/*37.9*/.recurso.evaluacionFecha.fechalimite.format("dd/MM/yyyy")),format.raw/*37.66*/("""
					"""),format.raw/*38.6*/("""</td>					
					<td rowspan="1">					
						"""),_display_(/*40.8*/if(r.estadoevaluacion.id==1L || r.estadoevaluacion.id == 2L)/*40.68*/{_display_(Seq[Any](format.raw/*40.69*/("""
							"""),_display_(/*41.9*/r/*41.10*/.aspecto.descripcion),format.raw/*41.30*/(""" """),format.raw/*41.31*/("""/ """),_display_(/*41.34*/r/*41.35*/.evaluador.personal.nombreCompleto),format.raw/*41.69*/("""
						""")))}),format.raw/*42.8*/("""					
						"""),_display_(/*43.8*/if(r.estadoevaluacion.id==3L)/*43.37*/{_display_(Seq[Any](format.raw/*43.38*/("""
							"""),format.raw/*44.8*/("""<a href="/revisar/"""),_display_(/*44.27*/r/*44.28*/.recurso.id),format.raw/*44.39*/("""/"""),_display_(/*44.41*/r/*44.42*/.aspecto.id),format.raw/*44.53*/("""" role="button" class="btn btn-primary btn-block center-block" style="width: 90%">Revisar</a>
						""")))}),format.raw/*45.8*/("""
						"""),_display_(/*46.8*/if(r.estadoevaluacion.id==4L)/*46.37*/{_display_(Seq[Any](format.raw/*46.38*/("""
							"""),format.raw/*47.8*/("""<a href="/revisar/"""),_display_(/*47.27*/r/*47.28*/.recurso.id),format.raw/*47.39*/("""/"""),_display_(/*47.41*/r/*47.42*/.aspecto.id),format.raw/*47.53*/("""" role="button" class="btn btn-primary btn-block center-block" style="width: 90%">Observaciones</a>
						""")))}),format.raw/*48.8*/("""
						"""),_display_(/*49.8*/if(r.estadoevaluacion.id==5L && tipo == 1)/*49.50*/{_display_(Seq[Any](format.raw/*49.51*/("""
							"""),format.raw/*50.8*/("""<a href='"""),_display_(/*50.18*/routes/*50.24*/.RecursoevaluadorController.evaluada(r.id, "1")),format.raw/*50.71*/("""' role="button" class="btn btn-primary btn-block center-block" style="width: 90%">Ev. """),_display_(/*50.158*/r/*50.159*/.aspecto.descripcion),format.raw/*50.179*/("""</a>						
						""")))}),format.raw/*51.8*/("""
						"""),_display_(/*52.8*/if( (r.recurso.estado.id == 10 || r.recurso.estado.id == 11 || r.recurso.estado.id == 110 || r.recurso.estado.id== 12)  && tipo == 0)/*52.141*/{_display_(Seq[Any](format.raw/*52.142*/("""
							"""),format.raw/*53.8*/("""<a href='"""),_display_(/*53.18*/routes/*53.24*/.RecursoevaluadorController.evaluadas(r.recurso.id)),format.raw/*53.75*/("""' role="button" class="btn btn-primary btn-block center-block" style="width: 90%">Evaluaciones</a>
						""")))}),format.raw/*54.8*/("""
						"""),_display_(/*55.8*/if(r.recurso.estado.id == 100)/*55.38*/{_display_(Seq[Any](format.raw/*55.39*/("""
							"""),_display_(/*56.9*/if(r.estadoevaluacion.id == 5)/*56.39*/{_display_(Seq[Any](format.raw/*56.40*/("""
								"""),format.raw/*57.9*/("""<a href='"""),_display_(/*57.19*/routes/*57.25*/.RecursoevaluadorController.evaluada(r.id)),format.raw/*57.67*/("""' role="button" class="btn btn-primary btn-block center-block" style="width: 90%">Ev. """),_display_(/*57.154*/r/*57.155*/.aspecto.descripcion),format.raw/*57.175*/("""</a>
							""")))}),format.raw/*58.9*/("""
						""")))}),format.raw/*59.8*/("""
					"""),format.raw/*60.6*/("""</td>
					"""),_display_(/*61.7*/if(  ( scala.List(10, 11, 12, 110).exists { x => x== r.recurso.estado.id })    && tipo == 0)/*61.99*/{_display_(Seq[Any](format.raw/*61.100*/("""

						 """),_display_(/*63.9*/if(r.recurso.oficiovaloracion == null)/*63.47*/{_display_(Seq[Any](format.raw/*63.48*/("""
							"""),format.raw/*64.8*/("""<td rowspan="1">
								<a href=""""),_display_(/*65.19*/routes/*65.25*/.OficioValoracionController.create(r.recurso.id)),format.raw/*65.73*/("""" role="button" class="btn btn-primary btn-block center-block" style="width: 90%">Asignar oficio de valoración</a>
							</td>						 
						 
						 """)))}/*68.10*/else/*68.15*/{_display_(Seq[Any](format.raw/*68.16*/("""
							"""),format.raw/*69.8*/("""<td rowspan="1">
								<a href=""""),_display_(/*70.19*/routes/*70.25*/.OficioValoracionController.create(r.recurso.id)),format.raw/*70.73*/("""" role="button" class="btn btn-primary btn-block center-block" style="width: 90%">Editar Oficio de valoración</a>
							</td>						 
						 """)))}),format.raw/*72.9*/("""
						"""),format.raw/*73.7*/("""<td rowspan="1">
							<a href="/admin/reporteEvaluacion/"""),_display_(/*74.43*/r/*74.44*/.recurso.id),format.raw/*74.55*/("""" role="button" class="btn btn-primary btn-block center-block" style="width: 90%" target="_blank">Reporte de evaluación</a>
						</td>
						 
					""")))}),format.raw/*77.7*/("""
					
					"""),format.raw/*83.9*/("""					
				"""),format.raw/*84.5*/("""</tr>
			""")))}),format.raw/*85.5*/("""

			
		"""),format.raw/*88.3*/("""</table>
		""")))}))}
  }

  def render(re:List[Recursoevaluador],tipo:Int): play.twirl.api.HtmlFormat.Appendable = apply(re,tipo)

  def f:((List[Recursoevaluador],Int) => play.twirl.api.HtmlFormat.Appendable) = (re,tipo) => apply(re,tipo)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recursoevaluador/comunListarEvaluaciones.scala.html
                  HASH: c70ae6c2a816738623aea26d1dabd195cf24d3dc
                  MATRIX: 778->1|919->39|946->40|986->54|1000->60|1058->98|1097->128|1125->131|1147->145|1185->146|1214->149|1285->204|1296->209|1334->210|1365->214|1531->354|1553->367|1592->368|1626->375|1704->423|1737->429|1851->517|1906->563|1945->564|1979->571|2025->587|2062->597|2110->619|2156->649|2196->651|2232->660|2310->711|2320->712|2352->723|2382->726|2392->727|2432->746|2462->748|2522->781|2532->782|2568->797|2610->813|2632->826|2671->827|2706->835|2750->852|2760->853|2801->873|2857->902|2867->903|2922->937|2964->949|2997->955|3041->972|3051->973|3114->1015|3175->1050|3184->1051|3262->1108|3295->1114|3366->1159|3435->1219|3474->1220|3509->1229|3519->1230|3560->1250|3589->1251|3619->1254|3629->1255|3684->1289|3722->1297|3761->1310|3799->1339|3838->1340|3873->1348|3919->1367|3929->1368|3961->1379|3990->1381|4000->1382|4032->1393|4163->1494|4197->1502|4235->1531|4274->1532|4309->1540|4355->1559|4365->1560|4397->1571|4426->1573|4436->1574|4468->1585|4605->1692|4639->1700|4690->1742|4729->1743|4764->1751|4801->1761|4816->1767|4884->1814|4999->1901|5010->1902|5052->1922|5100->1940|5134->1948|5277->2081|5317->2082|5352->2090|5389->2100|5404->2106|5476->2157|5612->2263|5646->2271|5685->2301|5724->2302|5759->2311|5798->2341|5837->2342|5873->2351|5910->2361|5925->2367|5988->2409|6103->2496|6114->2497|6156->2517|6199->2530|6237->2538|6270->2544|6308->2556|6409->2648|6449->2649|6485->2659|6532->2697|6571->2698|6606->2706|6668->2741|6683->2747|6752->2795|6922->2947|6935->2952|6974->2953|7009->2961|7071->2996|7086->3002|7155->3050|7327->3192|7361->3199|7447->3258|7457->3259|7489->3270|7669->3420|7708->3770|7745->3780|7785->3790|7820->3798
                  LINES: 26->1|29->1|30->2|30->2|30->2|30->2|32->5|33->6|33->6|33->6|34->7|35->8|35->8|35->8|37->10|42->15|42->15|42->15|43->16|45->18|46->19|49->22|49->22|49->22|50->23|51->24|52->25|54->27|54->27|54->27|55->28|56->29|56->29|56->29|56->29|56->29|56->29|56->29|57->30|57->30|57->30|58->31|58->31|58->31|59->32|59->32|59->32|59->32|60->33|60->33|60->33|61->34|62->35|62->35|62->35|62->35|64->37|64->37|64->37|65->38|67->40|67->40|67->40|68->41|68->41|68->41|68->41|68->41|68->41|68->41|69->42|70->43|70->43|70->43|71->44|71->44|71->44|71->44|71->44|71->44|71->44|72->45|73->46|73->46|73->46|74->47|74->47|74->47|74->47|74->47|74->47|74->47|75->48|76->49|76->49|76->49|77->50|77->50|77->50|77->50|77->50|77->50|77->50|78->51|79->52|79->52|79->52|80->53|80->53|80->53|80->53|81->54|82->55|82->55|82->55|83->56|83->56|83->56|84->57|84->57|84->57|84->57|84->57|84->57|84->57|85->58|86->59|87->60|88->61|88->61|88->61|90->63|90->63|90->63|91->64|92->65|92->65|92->65|95->68|95->68|95->68|96->69|97->70|97->70|97->70|99->72|100->73|101->74|101->74|101->74|104->77|106->83|107->84|108->85|111->88
                  -- GENERATED --
              */
          