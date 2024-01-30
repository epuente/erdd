
package views.html.Clasificacion

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
					  <li class="active">Clasificados</li>
					</ol>			
				</div>
			</div>
			<h3>Clasificados</h3>
			<h1>
			"""),_display_(/*16.5*/if(recurso.isEmpty)/*16.24*/{_display_(Seq[Any](format.raw/*16.25*/("""
				"""),format.raw/*17.5*/("""No hay registros
			""")))}/*18.6*/else/*18.11*/{_display_(Seq[Any](format.raw/*18.12*/("""
				
			"""),format.raw/*20.4*/("""</h1>
			
		    """),_display_(/*22.8*/if(flash.containsKey("success"))/*22.40*/ {_display_(Seq[Any](format.raw/*22.42*/("""
		        """),format.raw/*23.11*/("""<div class="alert alert-success" role="alert">
		            <strong>¡Correcto!</strong>"""),_display_(/*24.43*/flash/*24.48*/.get("success")),format.raw/*24.63*/("""
		        """),format.raw/*25.11*/("""</div>
		    """)))}),format.raw/*26.8*/("""
		    """),_display_(/*27.8*/if(flash.containsKey("warning"))/*27.40*/ {_display_(Seq[Any](format.raw/*27.42*/("""
		        """),format.raw/*28.11*/("""<div class="alert alert-warning" role="alert">
		            <strong>¡Precaución!</strong> """),_display_(/*29.46*/flash/*29.51*/.get("warning")),format.raw/*29.66*/("""
		        """),format.raw/*30.11*/("""</div>
		    """)))}),format.raw/*31.8*/("""    """),_display_(/*31.13*/if(flash.containsKey("error"))/*31.43*/ {_display_(Seq[Any](format.raw/*31.45*/("""
		        """),format.raw/*32.11*/("""<div class="alert alert-danger" role="alert">
		            <strong>¡Error!</strong> """),_display_(/*33.41*/flash/*33.46*/.get("error")),format.raw/*33.59*/("""
		        """),format.raw/*34.11*/("""</div>
		    """)))}),format.raw/*35.8*/("""	
			
			
		"""),format.raw/*38.3*/("""<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th>Clave de control</th>
						<th>Título</th>
						<th>Área del conoc.</th>
						<th>Nivel educativo</th>
						<th>Oficio</th>
						<th>Clasificación</th>
						<th>Tipo de recurso</th>
						<th></th>
					</tr>
				</thead>
			
				"""),_display_(/*52.6*/for(r <- recurso) yield /*52.23*/ {_display_(Seq[Any](format.raw/*52.25*/("""
				"""),format.raw/*53.5*/("""<tr>
					<td><a href=""""),_display_(/*54.20*/routes/*54.26*/.ReporteController.cesoe(r.id)),format.raw/*54.56*/("""">"""),_display_(/*54.59*/r/*54.60*/.numcontrol),format.raw/*54.71*/("""</a></td>
					<td>"""),_display_(/*55.11*/r/*55.12*/.titulo),format.raw/*55.19*/("""</td>
					<td>"""),_display_(/*56.11*/r/*56.12*/.areaconocimiento.descripcion),format.raw/*56.41*/("""</td>
					<td>"""),_display_(/*57.11*/r/*57.12*/.niveleducativo.descripcion),format.raw/*57.39*/("""</td>
					<td>"""),_display_(/*58.11*/r/*58.12*/.oficio.numero),format.raw/*58.26*/("""</td>
					<td>
					   <a href=""""),_display_(/*60.19*/routes/*60.25*/.ClasificacionController.edit(r.id)),format.raw/*60.60*/("""">
					       """),_display_(/*61.14*/(r.clasificacion.criterio1.descripcion + " / "+r.clasificacion.criterio2.descripcion + " / "+ r.clasificacion.criterio3.catalogo.descripcion )),format.raw/*61.156*/("""
					   """),format.raw/*62.9*/("""</a>
					</td>
                    <td>
                      """),_display_(/*65.24*/(r.clasificacion.tiporecurso.descripcion)),format.raw/*65.65*/("""
                    """),format.raw/*66.21*/("""</td>					
					<td><a class="btn btn-primary btn-block centger-block" href=""""),_display_(/*67.68*/routes/*67.74*/.RecursoevaluadorController.asignarEvaluadoresCreate(r.id)),format.raw/*67.132*/("""" role="button">Asignar evaluadores</a></td>
		
				</tr>
			
				""")))}),format.raw/*71.6*/("""
			"""),format.raw/*72.4*/("""</table>		
				
				
			""")))}),format.raw/*75.5*/("""
	"""),format.raw/*76.2*/("""</div>
""")))}))}
  }

  def render(recurso:List[Recurso]): play.twirl.api.HtmlFormat.Appendable = apply(recurso)

  def f:((List[Recurso]) => play.twirl.api.HtmlFormat.Appendable) = (recurso) => apply(recurso)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:37 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Clasificacion/list.scala.html
                  HASH: 99d4d2e174ad76f73ff58573db1ef227d390d191
                  MATRIX: 743->1|854->24|883->28|894->32|931->33|959->35|1281->331|1309->350|1348->351|1380->356|1419->378|1432->383|1471->384|1507->393|1550->410|1591->442|1631->444|1670->455|1786->544|1800->549|1836->564|1875->575|1919->589|1953->597|1994->629|2034->631|2073->642|2192->734|2206->739|2242->754|2281->765|2325->779|2357->784|2396->814|2436->816|2475->827|2588->913|2602->918|2636->931|2675->942|2719->956|2758->968|3104->1288|3137->1305|3177->1307|3209->1312|3260->1336|3275->1342|3326->1372|3356->1375|3366->1376|3398->1387|3445->1407|3455->1408|3483->1415|3526->1431|3536->1432|3586->1461|3629->1477|3639->1478|3687->1505|3730->1521|3740->1522|3775->1536|3836->1570|3851->1576|3907->1611|3950->1627|4114->1769|4150->1778|4241->1842|4303->1883|4352->1904|4457->1982|4472->1988|4552->2046|4649->2113|4680->2117|4735->2142|4764->2144
                  LINES: 26->1|29->1|32->4|32->4|32->4|33->5|44->16|44->16|44->16|45->17|46->18|46->18|46->18|48->20|50->22|50->22|50->22|51->23|52->24|52->24|52->24|53->25|54->26|55->27|55->27|55->27|56->28|57->29|57->29|57->29|58->30|59->31|59->31|59->31|59->31|60->32|61->33|61->33|61->33|62->34|63->35|66->38|80->52|80->52|80->52|81->53|82->54|82->54|82->54|82->54|82->54|82->54|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57|86->58|86->58|86->58|88->60|88->60|88->60|89->61|89->61|90->62|93->65|93->65|94->66|95->67|95->67|95->67|99->71|100->72|103->75|104->76
                  -- GENERATED --
              */
          