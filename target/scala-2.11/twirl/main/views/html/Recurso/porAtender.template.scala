
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
object porAtender extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Recursoevaluador],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(re : List[Recursoevaluador]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.31*/("""

"""),_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
	"""),format.raw/*4.2*/("""<div class="container-fluid" style="background-color: white; padding: 10px">
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
				  <li>Recurso</li>
				  <li class="active">Para revisar por el administrador</li>
				</ol>			
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
  	          <h3>Para revisar por el administrador</h3>
	        </div>
		</div>

		<div class="row">
			<div class="col-lg-12">

				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>Título</th>
							<th>Aspecto</th>
							<th>Evaluador</th>
							<th>Fecha evaluación</th>
							<th>Ultima modificación</th>
							<th></th>
						</tr>
					</thead>
					"""),_display_(/*33.7*/for(e <- re) yield /*33.19*/{_display_(Seq[Any](format.raw/*33.20*/("""
						"""),format.raw/*34.7*/("""<tr>
							<td>"""),_display_(/*35.13*/e/*35.14*/.recurso.titulo),format.raw/*35.29*/("""</td>
							<td>"""),_display_(/*36.13*/e/*36.14*/.aspecto.descripcion),format.raw/*36.34*/("""</td>
							<td>"""),_display_(/*37.13*/e/*37.14*/.evaluador.personal.nombreCompleto),format.raw/*37.48*/("""</td>
							<td>"""),_display_(/*38.13*/e/*38.14*/.auditinsert.format("dd/MM/yyyy")),format.raw/*38.47*/("""</td>
							<td>"""),_display_(/*39.13*/e/*39.14*/.auditlastupdate.format("dd/MM/yyyy")),format.raw/*39.51*/("""</td>
							<td> <a href="/revisar/"""),_display_(/*40.32*/e/*40.33*/.recurso.id),format.raw/*40.44*/("""/"""),_display_(/*40.46*/e/*40.47*/.aspecto.id),format.raw/*40.58*/("""">Revisar</a>  </td>
						</tr>
					""")))}),format.raw/*42.7*/("""
				"""),format.raw/*43.5*/("""</table>
			</div>
		</div>
	</div>
""")))}))}
  }

  def render(re:List[Recursoevaluador]): play.twirl.api.HtmlFormat.Appendable = apply(re)

  def f:((List[Recursoevaluador]) => play.twirl.api.HtmlFormat.Appendable) = (re) => apply(re)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/porAtender.scala.html
                  HASH: 60e483507c8812b4b6cebe85c478ecb4aa720754
                  MATRIX: 752->1|869->30|897->33|908->37|945->38|973->40|1717->758|1745->770|1784->771|1818->778|1862->795|1872->796|1908->811|1953->829|1963->830|2004->850|2049->868|2059->869|2114->903|2159->921|2169->922|2223->955|2268->973|2278->974|2336->1011|2400->1048|2410->1049|2442->1060|2471->1062|2481->1063|2513->1074|2582->1113|2614->1118
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|61->33|61->33|61->33|62->34|63->35|63->35|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|68->40|68->40|68->40|70->42|71->43
                  -- GENERATED --
              */
          