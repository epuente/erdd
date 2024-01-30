
package views.html.Evaluaciones.ConEncuestasAceptadas

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

"""),_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
	"""),format.raw/*4.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
				  <li>Recursos</li>
				  <li class="active">Evaluaciones con encuestas aceptadas</li>
				</ol>			
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
  	          <h3>Evaluaciones con encuestas aceptadas</h3>
	        </div>
		</div>
		
		"""),_display_(/*19.4*/if(recurso.isEmpty)/*19.23*/{_display_(Seq[Any](format.raw/*19.24*/("""
			"""),format.raw/*20.4*/("""<h1>	No hay registros</h1>
		""")))}/*21.5*/else/*21.10*/{_display_(Seq[Any](format.raw/*21.11*/("""
			"""),_display_(/*22.5*/flashes()),format.raw/*22.14*/("""		
		
		"""),format.raw/*24.3*/("""<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Clave de control</th>
					<th>Título</th>
					<th>Área del conoc.</th>
					<th>Nivel educativo</th>
					<th>Programa académico</th>
					<th></th>
				</tr>
			</thead>
		
			"""),_display_(/*36.5*/for(r <- recurso) yield /*36.22*/ {_display_(Seq[Any](format.raw/*36.24*/("""
				"""),format.raw/*37.5*/("""<tr>
					<td><a href=""""),_display_(/*38.20*/routes/*38.26*/.ReporteController.cesoe(r.id)),format.raw/*38.56*/("""">"""),_display_(/*38.59*/r/*38.60*/.numcontrol),format.raw/*38.71*/("""</a></td>
					<td>"""),_display_(/*39.11*/r/*39.12*/.titulo),format.raw/*39.19*/("""</td>
					<td>"""),_display_(/*40.11*/r/*40.12*/.areaconocimiento.descripcion),format.raw/*40.41*/("""</td>
					<td>"""),_display_(/*41.11*/r/*41.12*/.niveleducativo.descripcion),format.raw/*41.39*/("""</td>
					<td>"""),_display_(/*42.11*/r/*42.12*/.programaacad),format.raw/*42.25*/("""</td>	
					<td>				
						<div class="row">
							<div class="col-md-6">
								<a href='"""),_display_(/*46.19*/routes/*46.25*/.RecursoevaluadorController.evaluadas(r.id,"lg")),format.raw/*46.73*/("""' role="button" class="btn btn-primary btn-block center-block">Evaluaciones</a>
							</div>
							<div class="col-md-6">
								<a href="/admin/reporteEvaluacion/"""),_display_(/*49.44*/r/*49.45*/.id),format.raw/*49.48*/("""" role="button" class="btn btn-primary btn-block center-block" >Reporte de evaluación</a>
							</div>							
						</div>		
						
					</td>

				</tr>
			""")))}),format.raw/*56.5*/("""
		"""),format.raw/*57.3*/("""</table>		
		""")))}),format.raw/*58.4*/("""
	"""),format.raw/*59.2*/("""</div>
""")))}),format.raw/*60.2*/("""

"""))}
  }

  def render(recurso:List[Recurso]): play.twirl.api.HtmlFormat.Appendable = apply(recurso)

  def f:((List[Recurso]) => play.twirl.api.HtmlFormat.Appendable) = (recurso) => apply(recurso)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Evaluaciones/ConEncuestasAceptadas/list.scala.html
                  HASH: 5e93949a810a711bc30baa3d506c685b713754bd
                  MATRIX: 764->1|875->24|903->27|914->31|951->32|979->34|1416->445|1444->464|1483->465|1514->469|1562->500|1575->505|1614->506|1645->511|1675->520|1710->528|1996->788|2029->805|2069->807|2101->812|2152->836|2167->842|2218->872|2248->875|2258->876|2290->887|2337->907|2347->908|2375->915|2418->931|2428->932|2478->961|2521->977|2531->978|2579->1005|2622->1021|2632->1022|2666->1035|2786->1128|2801->1134|2870->1182|3064->1349|3074->1350|3098->1353|3287->1512|3317->1515|3361->1529|3390->1531|3428->1539
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|47->19|47->19|47->19|48->20|49->21|49->21|49->21|50->22|50->22|52->24|64->36|64->36|64->36|65->37|66->38|66->38|66->38|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|74->46|74->46|74->46|77->49|77->49|77->49|84->56|85->57|86->58|87->59|88->60
                  -- GENERATED --
              */
          