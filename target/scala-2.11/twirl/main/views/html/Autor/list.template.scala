
package views.html.Autor

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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[RecursoAutor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(autores:List[RecursoAutor]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.30*/("""



"""),_display_(/*5.2*/main/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""
	"""),format.raw/*6.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" > 
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Autores responsables</li>
					  <li class="active">Listar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					<h3>Autores responsables</h3>
					"""),_display_(/*18.7*/flashes()),format.raw/*18.16*/("""

					"""),_display_(/*20.7*/if(autores.isEmpty)/*20.26*/{_display_(Seq[Any](format.raw/*20.27*/("""
						"""),format.raw/*21.7*/("""No hay registros
					""")))}/*22.8*/else/*22.13*/{_display_(Seq[Any](format.raw/*22.14*/("""
						"""),format.raw/*23.7*/("""<table class="table table-striped table-bordered table-condensed">
							"""),_display_(/*24.9*/for(autor<-autores) yield /*24.28*/{_display_(Seq[Any](format.raw/*24.29*/("""
								"""),format.raw/*25.9*/("""<tr>
									<td>"""),_display_(/*26.15*/(autor.paterno+" "+autor.materno+" "+autor.nombre)),format.raw/*26.65*/("""</td>
									<td>"""),_display_(/*27.15*/autor/*27.20*/.recurso.numcontrol),format.raw/*27.39*/("""</td>
									<td>"""),_display_(/*28.15*/autor/*28.20*/.recurso.titulo),format.raw/*28.35*/("""</td>
									<td>"""),_display_(/*29.15*/autor/*29.20*/.recurso.estado.descripcion),format.raw/*29.47*/("""</td>
									<td>"""),_display_(/*30.15*/autor/*30.20*/.correo.telefono),format.raw/*30.36*/("""</td>
									<td><a href="/editarEmail/"""),_display_(/*31.37*/autor/*31.42*/.id),format.raw/*31.45*/("""">"""),_display_(/*31.48*/autor/*31.53*/.correo.email),format.raw/*31.66*/("""</a></td>
								</tr>
							""")))}),format.raw/*33.9*/("""
						"""),format.raw/*34.7*/("""</table>
					""")))}),format.raw/*35.7*/("""
				"""),format.raw/*36.5*/("""</div>
			</div>
	</div>
""")))}))}
  }

  def render(autores:List[RecursoAutor]): play.twirl.api.HtmlFormat.Appendable = apply(autores)

  def f:((List[RecursoAutor]) => play.twirl.api.HtmlFormat.Appendable) = (autores) => apply(autores)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Autor/list.scala.html
                  HASH: 5aef20f29987bdc704b256c8f6f2aee895eaa8fb
                  MATRIX: 740->1|856->29|886->34|897->38|934->39|962->41|1343->396|1373->405|1407->413|1435->432|1474->433|1508->440|1549->464|1562->469|1601->470|1635->477|1736->552|1771->571|1810->572|1846->581|1892->600|1963->650|2010->670|2024->675|2064->694|2111->714|2125->719|2161->734|2208->754|2222->759|2270->786|2317->806|2331->811|2368->827|2437->869|2451->874|2475->877|2505->880|2519->885|2553->898|2615->930|2649->937|2694->952|2726->957
                  LINES: 26->1|29->1|33->5|33->5|33->5|34->6|46->18|46->18|48->20|48->20|48->20|49->21|50->22|50->22|50->22|51->23|52->24|52->24|52->24|53->25|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|59->31|59->31|59->31|61->33|62->34|63->35|64->36
                  -- GENERATED --
              */
          