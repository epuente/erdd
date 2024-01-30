
package views.html.Recurso

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
object observar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Recurso],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(rs: List[Recurso], mensaje:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.37*/("""

	"""),format.raw/*3.2*/("""<table class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>Clave de control</th>
				<th>Título</th>
				<th>Área del conoc.</th>
				<th>Nivel educativo</th>

				<th>Programa académico</th>
				<th>Modalidad</th>
				<td></td>
			</tr>
		</thead>
	
		"""),_display_(/*17.4*/for(r <- rs) yield /*17.16*/ {_display_(Seq[Any](format.raw/*17.18*/("""
		"""),format.raw/*18.3*/("""<tr>
			<td><a href=""""),_display_(/*19.18*/routes/*19.24*/.ReporteController.cesoe(r.id)),format.raw/*19.54*/("""">"""),_display_(/*19.57*/r/*19.58*/.numcontrol),format.raw/*19.69*/("""</td></a>
			<td>"""),_display_(/*20.9*/r/*20.10*/.titulo),format.raw/*20.17*/("""</td>
			<td>"""),_display_(/*21.9*/r/*21.10*/.areaconocimiento.descripcion),format.raw/*21.39*/("""</td>
			<td>"""),_display_(/*22.9*/r/*22.10*/.niveleducativo.descripcion),format.raw/*22.37*/("""</td>
			<td>"""),_display_(/*23.9*/r/*23.10*/.programaacad),format.raw/*23.23*/("""</td>
			<td>"""),_display_(/*24.9*/{ if(r.modalidad!= null) r.modalidad.descripcion}),format.raw/*24.58*/("""</td>
			"""),_display_(/*25.5*/if(r.estado.id == 1)/*25.25*/{_display_(Seq[Any](format.raw/*25.26*/("""
				"""),format.raw/*26.5*/("""<td><a class="btn btn-primary btn-xs btn-block" href=""""),_display_(/*26.60*/routes/*26.66*/.RecursoController.observar(r.id)),format.raw/*26.99*/("""" role="button">Agregar observaciones</a></td>
			""")))}/*27.5*/else/*27.9*/{_display_(Seq[Any](format.raw/*27.10*/("""
				"""),format.raw/*28.5*/("""<td><a class="btn btn-primary btn-xs btn-block" href=""""),_display_(/*28.60*/routes/*28.66*/.RecursoController.observar(r.id)),format.raw/*28.99*/("""" role="button">Revisar observaciones</a></td>			
			""")))}),format.raw/*29.5*/("""
		"""),format.raw/*30.3*/("""</tr>
	
		""")))}),format.raw/*32.4*/("""
	"""),format.raw/*33.2*/("""</table>"""))}
  }

  def render(rs:List[Recurso],mensaje:String): play.twirl.api.HtmlFormat.Appendable = apply(rs,mensaje)

  def f:((List[Recurso],String) => play.twirl.api.HtmlFormat.Appendable) = (rs,mensaje) => apply(rs,mensaje)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:35 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/observar.scala.html
                  HASH: c207b0970a2116d18ffe66ffd8be94ac522427da
                  MATRIX: 748->1|871->36|900->39|1198->311|1226->323|1266->325|1296->328|1345->350|1360->356|1411->386|1441->389|1451->390|1483->401|1527->419|1537->420|1565->427|1605->441|1615->442|1665->471|1705->485|1715->486|1763->513|1803->527|1813->528|1847->541|1887->555|1957->604|1993->614|2022->634|2061->635|2093->640|2175->695|2190->701|2244->734|2313->785|2325->789|2364->790|2396->795|2478->850|2493->856|2547->889|2631->943|2661->946|2702->957|2731->959
                  LINES: 26->1|29->1|31->3|45->17|45->17|45->17|46->18|47->19|47->19|47->19|47->19|47->19|47->19|48->20|48->20|48->20|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|56->28|57->29|58->30|60->32|61->33
                  -- GENERATED --
              */
          