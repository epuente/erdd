
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
object listarEvaluacionesConcluidas extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Recursoevaluador],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(re:List[Recursoevaluador], tipo:Int):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.39*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""

	"""),format.raw/*4.2*/("""<div class="container-fluid" style="background-color: white; padding: 10px; display: none;">
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
					"""),_display_(/*8.7*/if( request.uri contains "/0")/*8.37*/{_display_(Seq[Any](format.raw/*8.38*/("""				
					  """),format.raw/*9.8*/("""<li>Recursos</li>
					  <li class="active">Evaluaciones concluidas</a></li>
				    """)))}),format.raw/*11.10*/("""
					"""),_display_(/*12.7*/if( request.uri contains "/1")/*12.37*/{_display_(Seq[Any](format.raw/*12.38*/("""				
					  """),format.raw/*13.8*/("""<li>Detalle evaluaciones</li>
					  <li class="active">Evaluaciones concluidas</a></li>
				    """)))}),format.raw/*15.10*/("""				    
				"""),format.raw/*16.5*/("""</ol>			
			</div>
		</div>	
		<div class="row">
			<div class="col-md-12">
				<h3>Evaluaciones concluidas</h3>
			</div>
		</div>

		<div class="row">
			<div class="col-lg-12">
				"""),_display_(/*27.6*/comunListarEvaluaciones(re, tipo)),format.raw/*27.39*/("""
			"""),format.raw/*28.4*/("""</div>
		</div>
	</div>
""")))}),format.raw/*31.2*/("""
"""),format.raw/*32.1*/("""<div id="log"></div>

<script type="text/javascript">

$(function() """),format.raw/*36.14*/("""{"""),format.raw/*36.15*/("""	

	
	"""),format.raw/*39.2*/("""$(".btn:contains('Evaluación')").hide();
	if ("""),_display_(/*40.7*/tipo),format.raw/*40.11*/(""" """),format.raw/*40.12*/("""== 0)
		combinarCeldas( $('#tabla') );
	
	$(".container-fluid").show();
	
	
"""),format.raw/*46.1*/("""}"""),format.raw/*46.2*/(""");

$( window ).resize(function() """),format.raw/*48.31*/("""{"""),format.raw/*48.32*/("""
	  """),format.raw/*49.4*/("""$( "#log" ).append( "<div>Handler for .resize() called.</div>" );
	"""),format.raw/*50.2*/("""}"""),format.raw/*50.3*/(""");


</script>"""))}
  }

  def render(re:List[Recursoevaluador],tipo:Int): play.twirl.api.HtmlFormat.Appendable = apply(re,tipo)

  def f:((List[Recursoevaluador],Int) => play.twirl.api.HtmlFormat.Appendable) = (re,tipo) => apply(re,tipo)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recursoevaluador/listarEvaluacionesConcluidas.scala.html
                  HASH: 81cb70cecb410e38467420171800d1cf460d1c98
                  MATRIX: 783->1|908->38|935->40|946->44|983->45|1012->48|1211->222|1249->252|1287->253|1325->265|1442->351|1475->358|1514->388|1553->389|1592->401|1721->499|1761->512|1972->697|2026->730|2057->734|2112->759|2140->760|2236->828|2265->829|2298->835|2371->882|2396->886|2425->887|2528->963|2556->964|2618->998|2647->999|2678->1003|2772->1070|2800->1071
                  LINES: 26->1|29->1|30->2|30->2|30->2|32->4|36->8|36->8|36->8|37->9|39->11|40->12|40->12|40->12|41->13|43->15|44->16|55->27|55->27|56->28|59->31|60->32|64->36|64->36|67->39|68->40|68->40|68->40|74->46|74->46|76->48|76->48|77->49|78->50|78->50
                  -- GENERATED --
              */
          