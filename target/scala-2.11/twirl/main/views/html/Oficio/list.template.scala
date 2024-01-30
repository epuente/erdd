
package views.html.Oficio

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
	"""),format.raw/*5.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
				  <li>Recursos</li>
				  <li class="active">Solicitudes con oficio</li>
				</ol>			
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
  	          <h3>Solicitudes con oficio</h3>
	        </div>
		</div>


		
		"""),_display_(/*22.4*/if(recurso.isEmpty)/*22.23*/{_display_(Seq[Any](format.raw/*22.24*/("""
			"""),format.raw/*23.4*/("""<h1>	No hay registros</h1>
		""")))}/*24.5*/else/*24.10*/{_display_(Seq[Any](format.raw/*24.11*/("""
	    """),_display_(/*25.7*/if(flash.containsKey("success"))/*25.39*/ {_display_(Seq[Any](format.raw/*25.41*/("""
	        """),format.raw/*26.10*/("""<div class="alert alert-success" role="alert">
	            <strong>"""),_display_(/*27.23*/flash/*27.28*/.get("success")),format.raw/*27.43*/("""</strong>
	        </div>
	    """)))}),format.raw/*29.7*/("""
	    """),_display_(/*30.7*/if(flash.containsKey("warning"))/*30.39*/ {_display_(Seq[Any](format.raw/*30.41*/("""
	        """),format.raw/*31.10*/("""<div class="alert alert-warning" role="alert">
	            <strong>"""),_display_(/*32.23*/flash/*32.28*/.get("warning")),format.raw/*32.43*/("""</strong>
	        </div>
	    """)))}),format.raw/*34.7*/("""    """),_display_(/*34.12*/if(flash.containsKey("error"))/*34.42*/ {_display_(Seq[Any](format.raw/*34.44*/("""
	        """),format.raw/*35.10*/("""<div class="alert alert-danger" role="alert">
	            <strong>"""),_display_(/*36.23*/flash/*36.28*/.get("error")),format.raw/*36.41*/("""</strong>
	        </div>
	    """)))}),format.raw/*38.7*/("""			
		
		"""),format.raw/*40.3*/("""<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Clave de control</th>
					<th>Título</th>
					<th>Área del conoc.</th>
					<th>Nivel educativo</th>
					<th>Programa académico</th>
					<th>Oficio</th>
					<th></th>
				</tr>
			</thead>
		
			"""),_display_(/*53.5*/for(r <- recurso) yield /*53.22*/ {_display_(Seq[Any](format.raw/*53.24*/("""
			"""),format.raw/*54.4*/("""<tr>
				<td><a href=""""),_display_(/*55.19*/routes/*55.25*/.ReporteController.cesoe(r.id)),format.raw/*55.55*/("""">"""),_display_(/*55.58*/r/*55.59*/.numcontrol),format.raw/*55.70*/("""</a></td>
				<td>"""),_display_(/*56.10*/r/*56.11*/.titulo),format.raw/*56.18*/("""</td>
				<td>"""),_display_(/*57.10*/r/*57.11*/.areaconocimiento.descripcion),format.raw/*57.40*/("""</td>
				<td>"""),_display_(/*58.10*/r/*58.11*/.niveleducativo.descripcion),format.raw/*58.38*/("""</td>
				<td>"""),_display_(/*59.10*/r/*59.11*/.programaacad),format.raw/*59.24*/("""</td>			
				<td><a href=""""),_display_(/*60.19*/routes/*60.25*/.OficioController.edit(r.oficio.id)),format.raw/*60.60*/("""" title="Editar oficio">"""),_display_(/*60.85*/r/*60.86*/.oficio.numero),format.raw/*60.100*/("""</a></td>			
				<td><a class="btn btn-primary btn-block center-block" href=""""),_display_(/*61.66*/routes/*61.72*/.ClasificacionController.create(r.id)),format.raw/*61.109*/("""" role="button">Clasificar</a></td>
			</tr>
		
			""")))}),format.raw/*64.5*/("""
		"""),format.raw/*65.3*/("""</table>		
			
			
		""")))}),format.raw/*68.4*/("""
	"""),format.raw/*69.2*/("""</div>
""")))}),format.raw/*70.2*/("""
"""))}
  }

  def render(recurso:List[Recurso]): play.twirl.api.HtmlFormat.Appendable = apply(recurso)

  def f:((List[Recurso]) => play.twirl.api.HtmlFormat.Appendable) = (recurso) => apply(recurso)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:36 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Oficio/list.scala.html
                  HASH: 3ab9c884b8d847f4394c02e313ec952c335461a6
                  MATRIX: 736->1|847->24|876->28|887->32|924->33|952->35|1363->420|1391->439|1430->440|1461->444|1509->475|1522->480|1561->481|1594->488|1635->520|1675->522|1713->532|1809->601|1823->606|1859->621|1921->653|1954->660|1995->692|2035->694|2073->704|2169->773|2183->778|2219->793|2281->825|2313->830|2352->860|2392->862|2430->872|2525->940|2539->945|2573->958|2635->990|2671->999|2978->1280|3011->1297|3051->1299|3082->1303|3132->1326|3147->1332|3198->1362|3228->1365|3238->1366|3270->1377|3316->1396|3326->1397|3354->1404|3396->1419|3406->1420|3456->1449|3498->1464|3508->1465|3556->1492|3598->1507|3608->1508|3642->1521|3696->1548|3711->1554|3767->1589|3819->1614|3829->1615|3865->1629|3970->1707|3985->1713|4044->1750|4126->1802|4156->1805|4208->1827|4237->1829|4275->1837
                  LINES: 26->1|29->1|32->4|32->4|32->4|33->5|50->22|50->22|50->22|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|55->27|55->27|55->27|57->29|58->30|58->30|58->30|59->31|60->32|60->32|60->32|62->34|62->34|62->34|62->34|63->35|64->36|64->36|64->36|66->38|68->40|81->53|81->53|81->53|82->54|83->55|83->55|83->55|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|88->60|88->60|88->60|88->60|88->60|88->60|89->61|89->61|89->61|92->64|93->65|96->68|97->69|98->70
                  -- GENERATED --
              */
          