
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
object listMaster extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Recurso],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(rs: List[Recurso]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import scala.collection.JavaConversions._
import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.21*/(""" 
"""),format.raw/*4.80*/(""" 
"""),_display_(/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/(""" 
	"""),format.raw/*6.2*/("""Solicitudes de evaluación registradas	
	"""),_display_(/*7.3*/if(rs.isEmpty)/*7.17*/ {_display_(Seq[Any](format.raw/*7.19*/("""
	"""),format.raw/*8.2*/("""<h1>No hay registro de ningún recurso</h1>
	""")))}/*9.4*/else/*9.9*/{_display_(Seq[Any](format.raw/*9.10*/("""
	"""),format.raw/*10.2*/("""<h3>Se encontraron """),_display_(/*10.22*/rs/*10.24*/.length),format.raw/*10.31*/(""" """),format.raw/*10.32*/("""recursos</h3>
	"""),_display_(/*11.3*/flashes),format.raw/*11.10*/("""
	"""),format.raw/*12.2*/("""<table class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>Título</th>
				<th>Área del conoc.</th>
				<th>Nivel educativo</th>
				<th>Duración</th>
				<th>Unidad acaémica</th>
				<th>Fecha elaboración</th>
				<th>Programa académico</th>
				<th>Modalidad</th>
				<th>Versión</th>
				<th>Sinópsis</th>
				<th>Formato entrega</th>
				<th>Otro formato entrega</th>
				<th>Url</th>
			</tr>
		</thead>
	
		"""),_display_(/*31.4*/for(r <- rs) yield /*31.16*/ {_display_(Seq[Any](format.raw/*31.18*/("""
		"""),format.raw/*32.3*/("""<tr>
			<td><a href=""""),_display_(/*33.18*/routes/*33.24*/.ReporteController.cesoe(r.id)),format.raw/*33.54*/("""">"""),_display_(/*33.57*/r/*33.58*/.titulo),format.raw/*33.65*/("""</td></a>
			<td>"""),_display_(/*34.9*/r/*34.10*/.areaconocimiento.descripcion),format.raw/*34.39*/("""</td>
			<td>"""),_display_(/*35.9*/r/*35.10*/.niveleducativo.descripcion),format.raw/*35.37*/("""</td>
			<td>"""),_display_(/*36.9*/r/*36.10*/.duracion),format.raw/*36.19*/("""</td>
			<td>"""),_display_(/*37.9*/r/*37.10*/.unidadacademica.nombre),format.raw/*37.33*/("""</td>
			<td>"""),_display_(/*38.9*/r/*38.10*/.elaboracion),format.raw/*38.22*/("""</td>
			<td>"""),_display_(/*39.9*/r/*39.10*/.programaacad),format.raw/*39.23*/("""</td>
			<td>"""),_display_(/*40.9*/{ if(r.modalidad!= null) r.modalidad.descripcion}),format.raw/*40.58*/("""</td>
			<td>"""),_display_(/*41.9*/r/*41.10*/.version.descripcion),format.raw/*41.30*/("""</td>
			<td>"""),_display_(/*42.9*/r/*42.10*/.sinopsis),format.raw/*42.19*/("""</td>
			<td>"""),_display_(/*43.9*/r/*43.10*/.formatoentrega.descripcion),format.raw/*43.37*/("""</td>				
			<td>"""),_display_(/*44.9*/r/*44.10*/.formatoentregaotro),format.raw/*44.29*/("""</td>
			<td>"""),_display_(/*45.9*/r/*45.10*/.url),format.raw/*45.14*/("""</td>
		</tr>
	
		""")))}),format.raw/*48.4*/("""
	"""),format.raw/*49.2*/("""</table>
	
	""")))}),format.raw/*51.3*/("""
""")))}),format.raw/*52.2*/("""
"""))}
  }

  def render(rs:List[Recurso]): play.twirl.api.HtmlFormat.Appendable = apply(rs)

  def f:((List[Recurso]) => play.twirl.api.HtmlFormat.Appendable) = (rs) => apply(rs)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/listMaster.scala.html
                  HASH: 3b4367a869bd796e2ab17504845913b25a21395e
                  MATRIX: 743->1|899->84|931->108|1015->20|1044->162|1072->165|1083->169|1121->171|1150->174|1216->215|1238->229|1277->231|1305->233|1367->279|1378->284|1416->285|1445->287|1492->307|1503->309|1531->316|1560->317|1602->333|1630->340|1659->342|2117->774|2145->786|2185->788|2215->791|2264->813|2279->819|2330->849|2360->852|2370->853|2398->860|2442->878|2452->879|2502->908|2542->922|2552->923|2600->950|2640->964|2650->965|2680->974|2720->988|2730->989|2774->1012|2814->1026|2824->1027|2857->1039|2897->1053|2907->1054|2941->1067|2981->1081|3051->1130|3091->1144|3101->1145|3142->1165|3182->1179|3192->1180|3222->1189|3262->1203|3272->1204|3320->1231|3364->1249|3374->1250|3414->1269|3454->1283|3464->1284|3489->1288|3538->1307|3567->1309|3610->1322|3642->1324
                  LINES: 26->1|29->4|29->4|30->1|31->4|32->5|32->5|32->5|33->6|34->7|34->7|34->7|35->8|36->9|36->9|36->9|37->10|37->10|37->10|37->10|37->10|38->11|38->11|39->12|58->31|58->31|58->31|59->32|60->33|60->33|60->33|60->33|60->33|60->33|61->34|61->34|61->34|62->35|62->35|62->35|63->36|63->36|63->36|64->37|64->37|64->37|65->38|65->38|65->38|66->39|66->39|66->39|67->40|67->40|68->41|68->41|68->41|69->42|69->42|69->42|70->43|70->43|70->43|71->44|71->44|71->44|72->45|72->45|72->45|75->48|76->49|78->51|79->52
                  -- GENERATED --
              */
          