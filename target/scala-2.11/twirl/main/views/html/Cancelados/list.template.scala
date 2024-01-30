
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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Recurso],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recurso:List[Recurso]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.25*/("""


"""),_display_(/*4.2*/main/*4.6*/{_display_(Seq[Any](format.raw/*4.7*/("""
	"""),format.raw/*5.2*/("""<h3>
	"""),_display_(/*6.3*/if(recurso.isEmpty)/*6.22*/{_display_(Seq[Any](format.raw/*6.23*/("""
		"""),format.raw/*7.3*/("""No hay registros
	""")))}/*8.4*/else/*8.9*/{_display_(Seq[Any](format.raw/*8.10*/("""
		"""),format.raw/*9.3*/("""Se encontraron """),_display_(/*9.19*/recurso/*9.26*/.size()),format.raw/*9.33*/(""" """),format.raw/*9.34*/("""recursos cancelados
	</h3>
<table class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>Clave de control</th>
				<th>Título</th>
				<th>Área del conoc.</th>
				<th>Nivel educativo</th>
				<th>Programa académico</th>
				<th>Tipo cancelación</th>
				<th>Observación</th>
			</tr>
		</thead>
	
		"""),_display_(/*24.4*/for(r <- recurso) yield /*24.21*/ {_display_(Seq[Any](format.raw/*24.23*/("""
		"""),format.raw/*25.3*/("""<tr>
			<td><a href=""""),_display_(/*26.18*/routes/*26.24*/.ReporteController.cesoe(r.id)),format.raw/*26.54*/("""">"""),_display_(/*26.57*/r/*26.58*/.numcontrol),format.raw/*26.69*/("""</a></td>
			<td>"""),_display_(/*27.9*/r/*27.10*/.titulo),format.raw/*27.17*/("""</td>
			<td>"""),_display_(/*28.9*/r/*28.10*/.areaconocimiento.descripcion),format.raw/*28.39*/("""</td>
			<td>"""),_display_(/*29.9*/r/*29.10*/.niveleducativo.descripcion),format.raw/*29.37*/("""</td>
			<td>"""),_display_(/*30.9*/r/*30.10*/.programaacad),format.raw/*30.23*/("""</td>
			"""),_display_(/*31.5*/if(r.estado.id==401)/*31.25*/{_display_(Seq[Any](format.raw/*31.26*/(""" 			
				"""),format.raw/*32.5*/("""<td>En clasificación</td>
			""")))}),format.raw/*33.5*/("""
			"""),_display_(/*34.5*/if(r.estado.id==402)/*34.25*/{_display_(Seq[Any](format.raw/*34.26*/(""" 			
				"""),format.raw/*35.5*/("""<td>En evaluación</td>
			""")))}),format.raw/*36.5*/("""
			"""),format.raw/*37.4*/("""<td>
				"""),_display_(/*38.6*/if(r.observacioncancelacion!=null)/*38.40*/{_display_(Seq[Any](format.raw/*38.41*/("""
						"""),_display_(/*39.8*/r/*39.9*/.observacioncancelacion.observacion),format.raw/*39.44*/("""
				""")))}),format.raw/*40.6*/("""
				"""),_display_(/*41.6*/if(r.solicitudescancelacion.size !=0)/*41.43*/{_display_(Seq[Any](format.raw/*41.44*/("""
					"""),_display_(/*42.7*/for( sc <- r.solicitudescancelacion ) yield /*42.44*/{_display_(Seq[Any](format.raw/*42.45*/("""
						"""),_display_(/*43.8*/sc/*43.10*/.observacion),format.raw/*43.22*/("""<br>
					""")))}),format.raw/*44.7*/("""
				""")))}),format.raw/*45.6*/("""
				
				"""),format.raw/*47.5*/("""</td>			
		</tr>
	
		""")))}),format.raw/*50.4*/("""
	"""),format.raw/*51.2*/("""</table>		
		
		
	""")))}),format.raw/*54.3*/("""
""")))}),format.raw/*55.2*/("""
"""))}
  }

  def render(recurso:List[Recurso]): play.twirl.api.HtmlFormat.Appendable = apply(recurso)

  def f:((List[Recurso]) => play.twirl.api.HtmlFormat.Appendable) = (recurso) => apply(recurso)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Cancelados/list.scala.html
                  HASH: 9992e64bdeca74ff18e9d1c64e735e40f23ecf92
                  MATRIX: 740->1|851->24|880->28|891->32|928->33|956->35|988->42|1015->61|1053->62|1082->65|1118->85|1129->90|1167->91|1196->94|1238->110|1253->117|1280->124|1308->125|1650->441|1683->458|1723->460|1753->463|1802->485|1817->491|1868->521|1898->524|1908->525|1940->536|1984->554|1994->555|2022->562|2062->576|2072->577|2122->606|2162->620|2172->621|2220->648|2260->662|2270->663|2304->676|2340->686|2369->706|2408->707|2444->716|2504->746|2535->751|2564->771|2603->772|2639->781|2696->808|2727->812|2763->822|2806->856|2845->857|2879->865|2888->866|2944->901|2980->907|3012->913|3058->950|3097->951|3130->958|3183->995|3222->996|3256->1004|3267->1006|3300->1018|3341->1029|3377->1035|3414->1045|3466->1067|3495->1069|3544->1088|3576->1090
                  LINES: 26->1|29->1|32->4|32->4|32->4|33->5|34->6|34->6|34->6|35->7|36->8|36->8|36->8|37->9|37->9|37->9|37->9|37->9|52->24|52->24|52->24|53->25|54->26|54->26|54->26|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|60->32|61->33|62->34|62->34|62->34|63->35|64->36|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|73->45|75->47|78->50|79->51|82->54|83->55
                  -- GENERATED --
              */
          