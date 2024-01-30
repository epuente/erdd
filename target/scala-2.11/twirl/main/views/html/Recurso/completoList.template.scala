
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
object completoList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Recurso],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(rs: List[Recurso]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.21*/("""


"""),_display_(/*4.2*/main/*4.6*/ {_display_(Seq[Any](format.raw/*4.8*/("""
	"""),format.raw/*5.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Recursos</li>
					  <li class="active">Solicitudes aceptadas</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Solicitudes aceptadas</h3>
		        </div>
			</div>

			<form id="frm"></form>
			"""),_display_(/*21.5*/if(rs.isEmpty)/*21.19*/ {_display_(Seq[Any](format.raw/*21.21*/("""
			"""),format.raw/*22.4*/("""<h1>No hay registros.</h1>
			""")))}/*23.6*/else/*23.11*/{_display_(Seq[Any](format.raw/*23.12*/("""
			"""),format.raw/*24.4*/("""<h3>Se encontraron """),_display_(/*24.24*/rs/*24.26*/.length),format.raw/*24.33*/(""" """),format.raw/*24.34*/("""solicitudes aceptadas</h3>
			<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th>Clave de control</th>
						<th>Título</th>
						<th>Área del conoc.</th>
						<th>Nivel educativo</th>
						<th>Programa académico</th>
						<th>Modalidad</th>
						<th>Oficio</th>
					</tr>
				</thead>
			
				"""),_display_(/*38.6*/for(r <- rs) yield /*38.18*/ {_display_(Seq[Any](format.raw/*38.20*/("""
				"""),format.raw/*39.5*/("""<tr>
					<td><a href=""""),_display_(/*40.20*/routes/*40.26*/.ReporteController.cesoe(r.id)),format.raw/*40.56*/("""">"""),_display_(/*40.59*/r/*40.60*/.numcontrol),format.raw/*40.71*/("""</td></a>
					<td>"""),_display_(/*41.11*/r/*41.12*/.titulo),format.raw/*41.19*/("""</td>
					<td>"""),_display_(/*42.11*/r/*42.12*/.areaconocimiento.descripcion),format.raw/*42.41*/("""</td>
					<td>"""),_display_(/*43.11*/r/*43.12*/.niveleducativo.descripcion),format.raw/*43.39*/("""</td>
					<td>"""),_display_(/*44.11*/r/*44.12*/.programaacad),format.raw/*44.25*/("""</td>
					<td>"""),_display_(/*45.11*/{ if(r.modalidad!= null) r.modalidad.descripcion}),format.raw/*45.60*/("""</td>
					<td>
						"""),_display_(/*47.8*/if(r.oficio!= null)/*47.27*/{_display_(Seq[Any](format.raw/*47.28*/("""
							"""),_display_(/*48.9*/r/*48.10*/.oficio.numero),format.raw/*48.24*/("""
							"""),format.raw/*49.8*/("""<a class="btn btn-primary btn-block center-block" href="javascript:irAEditarOficio("""),_display_(/*49.92*/r/*49.93*/.id),format.raw/*49.96*/(""")" role="button">Editar oficio</a>
						""")))}/*50.9*/else/*50.14*/{_display_(Seq[Any](format.raw/*50.15*/("""
							"""),format.raw/*51.8*/("""<a class="btn btn-primary btn-block center-block" href=""""),_display_(/*51.65*/routes/*51.71*/.OficioController.create(r.id)),format.raw/*51.101*/("""" role="button">Registrar oficio</a>
						""")))}),format.raw/*52.8*/("""
					"""),format.raw/*53.6*/("""</td>
				</tr>
			
				""")))}),format.raw/*56.6*/("""
			"""),format.raw/*57.4*/("""</table>
			""")))}),format.raw/*58.5*/("""
	"""),format.raw/*59.2*/("""</div>
""")))}),format.raw/*60.2*/("""


"""),format.raw/*63.1*/("""<script type="text/javascript">
	function irAEditarOficio()"""),format.raw/*64.28*/("""{"""),format.raw/*64.29*/("""
		
	"""),format.raw/*66.2*/("""}"""),format.raw/*66.3*/("""
	

"""),format.raw/*69.1*/("""</script>
"""))}
  }

  def render(rs:List[Recurso]): play.twirl.api.HtmlFormat.Appendable = apply(rs)

  def f:((List[Recurso]) => play.twirl.api.HtmlFormat.Appendable) = (rs) => apply(rs)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/completoList.scala.html
                  HASH: cb82a0c3ac0f1614f793a7ab3530283d769963ae
                  MATRIX: 745->1|852->20|881->24|892->28|930->30|958->32|1403->451|1426->465|1466->467|1497->471|1546->503|1559->508|1598->509|1629->513|1676->533|1687->535|1715->542|1744->543|2103->876|2131->888|2171->890|2203->895|2254->919|2269->925|2320->955|2350->958|2360->959|2392->970|2439->990|2449->991|2477->998|2520->1014|2530->1015|2580->1044|2623->1060|2633->1061|2681->1088|2724->1104|2734->1105|2768->1118|2811->1134|2881->1183|2930->1206|2958->1225|2997->1226|3032->1235|3042->1236|3077->1250|3112->1258|3223->1342|3233->1343|3257->1346|3317->1389|3330->1394|3369->1395|3404->1403|3488->1460|3503->1466|3555->1496|3629->1540|3662->1546|3717->1571|3748->1575|3791->1588|3820->1590|3858->1598|3888->1601|3975->1660|4004->1661|4036->1666|4064->1667|4095->1671
                  LINES: 26->1|29->1|32->4|32->4|32->4|33->5|49->21|49->21|49->21|50->22|51->23|51->23|51->23|52->24|52->24|52->24|52->24|52->24|66->38|66->38|66->38|67->39|68->40|68->40|68->40|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|79->51|80->52|81->53|84->56|85->57|86->58|87->59|88->60|91->63|92->64|92->64|94->66|94->66|97->69
                  -- GENERATED --
              */
          