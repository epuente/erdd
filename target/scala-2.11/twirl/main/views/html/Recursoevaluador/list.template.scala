
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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Recurso],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recurso:List[Recurso]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.25*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
	"""),format.raw/*3.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >  
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Recursos</li>
					  <li class="active">Evaluadores asignados</li>
					</ol>			
				</div>
			</div>
			
			<div class="row">
				<div class="col-lg-8">
					<h3>Evaluadores asignados</h3>
				</div>		

			</div>
			<div class="row">
				<div class="col-lg-12">
					"""),_display_(/*21.7*/if(recurso.isEmpty)/*21.26*/{_display_(Seq[Any](format.raw/*21.27*/("""
						"""),format.raw/*22.7*/("""<h1>No hay registros</h1>
					""")))}/*23.8*/else/*23.13*/{_display_(Seq[Any](format.raw/*23.14*/("""				
						"""),format.raw/*24.7*/("""<table class="table table-striped table-bordered">
								<thead>
									<tr>
										<th>Clave de control</th>
										<th>Título</th>
										<th>Nivel educativo</th>
										<th>Programa académico</th>
										<th>Oficio</th>
										<th>Evaluadores asignados</th>
										<th></th>
									</tr>
								</thead>
							
								"""),_display_(/*37.10*/for(r <- recurso) yield /*37.27*/{_display_(Seq[Any](format.raw/*37.28*/("""
									"""),_display_(/*38.11*/if( r.estado.id == 6 || r.estado.id==7 || r.estado.id==8 || r.estado.id==9 || r.estado.id==100 )/*38.107*/{_display_(Seq[Any](format.raw/*38.108*/("""
								"""),format.raw/*39.9*/("""<tr>
									<td><a href=""""),_display_(/*40.24*/routes/*40.30*/.ReporteController.cesoe(r.id)),format.raw/*40.60*/("""">"""),_display_(/*40.63*/r/*40.64*/.numcontrol),format.raw/*40.75*/("""</a></td>
									<td>"""),_display_(/*41.15*/r/*41.16*/.titulo),format.raw/*41.23*/("""</td>
									<td>"""),_display_(/*42.15*/r/*42.16*/.niveleducativo.descripcion),format.raw/*42.43*/("""</td>
									<td>"""),_display_(/*43.15*/r/*43.16*/.programaacad),format.raw/*43.29*/("""</td>			
									<td>"""),_display_(/*44.15*/r/*44.16*/.oficio.numero),format.raw/*44.30*/("""</td>
									<td>
						
										<div style="display: table; width: 100%;">
											"""),_display_(/*48.13*/for(re <- r.recursoevaluadores) yield /*48.44*/{_display_(Seq[Any](format.raw/*48.45*/("""
											"""),format.raw/*49.12*/("""<div style="display: table-row;">
													<div style="display: table-cell;">"""),_display_(/*50.49*/re/*50.51*/.evaluador.personal.nombreCompleto),format.raw/*50.85*/("""</div>
													<div style="display: table-cell;">"""),_display_(/*51.49*/re/*51.51*/.aspecto.descripcion),format.raw/*51.71*/("""</div>
											</div>
											""")))}),format.raw/*53.13*/("""
										"""),format.raw/*54.11*/("""</div>
									<td>										
										"""),_display_(/*56.12*/if(r.estado.id == 100)/*56.34*/{_display_(Seq[Any](format.raw/*56.35*/("""
											"""),format.raw/*57.12*/("""<div><a href=""""),_display_(/*57.27*/routes/*57.33*/.RecursoevaluadorController.asignarEvaluadoresCreate(r.id)),format.raw/*57.91*/("""" class="btn btn-danger btn-block center-block">Administrar evaluadores</a></div>
										""")))}/*58.13*/else/*58.18*/{_display_(Seq[Any](format.raw/*58.19*/("""
											"""),format.raw/*59.12*/("""<div><a href=""""),_display_(/*59.27*/routes/*59.33*/.RecursoevaluadorController.asignarEvaluadoresCreate(r.id)),format.raw/*59.91*/("""" class="btn btn-primary btn-block center-block">Administrar evaluadores</a></div>
										""")))}),format.raw/*60.12*/("""
									"""),format.raw/*61.10*/("""</td>	
										
									</td>			
								</tr>
							
								""")))}),format.raw/*66.10*/("""
								""")))}),format.raw/*67.10*/("""
							"""),format.raw/*68.8*/("""</table>		
					""")))}),format.raw/*69.7*/("""
				"""),format.raw/*70.5*/("""</div>
			</div>
	</div>
""")))}))}
  }

  def render(recurso:List[Recurso]): play.twirl.api.HtmlFormat.Appendable = apply(recurso)

  def f:((List[Recurso]) => play.twirl.api.HtmlFormat.Appendable) = (recurso) => apply(recurso)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recursoevaluador/list.scala.html
                  HASH: a59a06bb7a9fc3df95cf1ae626cd294f4874f298
                  MATRIX: 746->1|857->24|884->26|895->30|932->31|960->33|1422->469|1450->488|1489->489|1523->496|1573->529|1586->534|1625->535|1663->546|2042->898|2075->915|2114->916|2152->927|2258->1023|2298->1024|2334->1033|2389->1061|2404->1067|2455->1097|2485->1100|2495->1101|2527->1112|2578->1136|2588->1137|2616->1144|2663->1164|2673->1165|2721->1192|2768->1212|2778->1213|2812->1226|2862->1249|2872->1250|2907->1264|3026->1356|3073->1387|3112->1388|3152->1400|3261->1482|3272->1484|3327->1518|3409->1573|3420->1575|3461->1595|3529->1632|3568->1643|3637->1685|3668->1707|3707->1708|3747->1720|3789->1735|3804->1741|3883->1799|3995->1893|4008->1898|4047->1899|4087->1911|4129->1926|4144->1932|4223->1990|4348->2084|4386->2094|4484->2161|4525->2171|4560->2179|4607->2196|4639->2201
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|49->21|49->21|49->21|50->22|51->23|51->23|51->23|52->24|65->37|65->37|65->37|66->38|66->38|66->38|67->39|68->40|68->40|68->40|68->40|68->40|68->40|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|76->48|76->48|76->48|77->49|78->50|78->50|78->50|79->51|79->51|79->51|81->53|82->54|84->56|84->56|84->56|85->57|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|87->59|88->60|89->61|94->66|95->67|96->68|97->69|98->70
                  -- GENERATED --
              */
          