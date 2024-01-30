
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
object mostrarEvaluadores extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Recursoevaluador],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(re:List[Recursoevaluador]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.29*/("""

"""),_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
	"""),format.raw/*4.2*/("""<div class="container-fluid" style="background-color: white; padding: 10px"> 
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Título</th>
					<th>Clave de control</th>
					<th>Aspecto  -  Evaluador</th>	
					"""),_display_(/*11.7*/if(re.get(0).recurso.estado.id >= 6 && re.get(0).recurso.estado.id < 10)/*11.79*/{_display_(Seq[Any](format.raw/*11.80*/("""
						"""),format.raw/*12.7*/("""<td></td>
					""")))}),format.raw/*13.7*/("""
				"""),format.raw/*14.5*/("""</tr>
			</thead>
			<tr>
				<td rowspan=7>"""),_display_(/*17.20*/re/*17.22*/.get(0).recurso.titulo),format.raw/*17.44*/("""</td>
				<td>"""),_display_(/*18.10*/re/*18.12*/.get(0).recurso.numcontrol),format.raw/*18.38*/("""</td>
				<td>

					<div style="display: table; width: 100%;">											
						"""),_display_(/*22.8*/for((r,ii) <- re.zipWithIndex) yield /*22.38*/ {_display_(Seq[Any](format.raw/*22.40*/("""	
							"""),format.raw/*23.8*/("""<div style="display: table-row;">							
								<div style="display: table-cell;">"""),_display_(/*24.44*/r/*24.45*/.evaluador.evaluadoraspectos.get(0).aspecto.descripcion),format.raw/*24.100*/("""</div> 
								<div style="display: table-cell;">"""),_display_(/*25.44*/r/*25.45*/.evaluador.personal.nombreCompleto),format.raw/*25.79*/(""" """),format.raw/*25.80*/("""</div>
							</div>
						""")))}),format.raw/*27.8*/("""
					"""),format.raw/*28.6*/("""</div>
				</td>

				"""),_display_(/*31.6*/if(re.get(0).recurso.estado.id >= 6 && re.get(0).recurso.estado.id < 10)/*31.78*/{_display_(Seq[Any](format.raw/*31.79*/("""
					"""),format.raw/*32.6*/("""<td><a class="btn btn-primary btn-block" role="button" href="/asignarEvaluadores/"""),_display_(/*32.88*/re/*32.90*/.get(0).recurso.id),format.raw/*32.108*/("""">Administrar evaluadores</a></td>
				""")))}),format.raw/*33.6*/("""

			"""),format.raw/*35.4*/("""</tr>
		</table>
	</div>
""")))}))}
  }

  def render(re:List[Recursoevaluador]): play.twirl.api.HtmlFormat.Appendable = apply(re)

  def f:((List[Recursoevaluador]) => play.twirl.api.HtmlFormat.Appendable) = (re) => apply(re)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recursoevaluador/mostrarEvaluadores.scala.html
                  HASH: 71006e7181cceca3433b124f1573158c67c51a2f
                  MATRIX: 769->1|884->28|912->31|923->35|960->36|988->38|1260->284|1341->356|1380->357|1414->364|1460->380|1492->385|1564->430|1575->432|1618->454|1660->469|1671->471|1718->497|1826->579|1872->609|1912->611|1948->620|2059->704|2069->705|2146->760|2224->811|2234->812|2289->846|2318->847|2376->875|2409->881|2458->904|2539->976|2578->977|2611->983|2720->1065|2731->1067|2771->1085|2841->1125|2873->1130
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|39->11|39->11|39->11|40->12|41->13|42->14|45->17|45->17|45->17|46->18|46->18|46->18|50->22|50->22|50->22|51->23|52->24|52->24|52->24|53->25|53->25|53->25|53->25|55->27|56->28|59->31|59->31|59->31|60->32|60->32|60->32|60->32|61->33|63->35
                  -- GENERATED --
              */
          