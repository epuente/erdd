
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
object listarEvaluacionesPorRevisar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Recursoevaluador],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(re:List[Recursoevaluador], tipo:Int):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.39*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
	"""),format.raw/*3.2*/("""<div class="container-fluid" style="background-color: white; padding: 10px;">
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
					"""),_display_(/*7.7*/if( request.uri.substring(request.uri.length-1).compareTo("0") == 0  )/*7.77*/{_display_(Seq[Any](format.raw/*7.78*/("""					
				  		"""),format.raw/*8.9*/("""<li>Recursos</li>
				  		<li class="active">Evaluaciones por revisar</a></li>
			  		""")))}),format.raw/*10.9*/("""
					"""),_display_(/*11.7*/if( request.uri.substring(request.uri.length-1).compareTo("1") == 0  )/*11.77*/{_display_(Seq[Any](format.raw/*11.78*/("""
						"""),format.raw/*12.7*/("""<li>Detalle evaluaciones</li>
						<li class="active">Evaluaciones por revisar</li>
					""")))}),format.raw/*14.7*/("""	
				"""),format.raw/*15.5*/("""</ol>			
			</div>
		</div>	
		<div class="row">
			<div class="col-md-12">
				"""),_display_(/*20.6*/if( request.uri.substring(request.uri.length-1).compareTo("0") == 0  )/*20.76*/{_display_(Seq[Any](format.raw/*20.77*/("""	
					"""),format.raw/*21.6*/("""<h3>Evaluaciones por revisar</h3>
				""")))}),format.raw/*22.6*/("""
				"""),_display_(/*23.6*/if( request.uri.substring(request.uri.length-1).compareTo("1") == 0  )/*23.76*/{_display_(Seq[Any](format.raw/*23.77*/("""	
					"""),format.raw/*24.6*/("""<h3>Evaluaciones por revisar</h3>
				""")))}),format.raw/*25.6*/("""
				
			"""),format.raw/*27.4*/("""</div>
		</div>

		<div class="row">
			<div class="col-lg-12">
				"""),_display_(/*32.6*/comunListarEvaluaciones(re, tipo)),format.raw/*32.39*/("""
			"""),format.raw/*33.4*/("""</div>
		</div>
	</div>
""")))}),format.raw/*36.2*/("""

"""),format.raw/*38.1*/("""<script type="text/javascript">

$(function() """),format.raw/*40.14*/("""{"""),format.raw/*40.15*/("""

	"""),format.raw/*42.2*/("""if ("""),_display_(/*42.7*/tipo),format.raw/*42.11*/(""" """),format.raw/*42.12*/("""== 0)"""),format.raw/*42.17*/("""{"""),format.raw/*42.18*/("""				
		 """),format.raw/*43.4*/("""$('#tabla td:nth-child(5), #tabla td:nth-child(4), #tabla td:nth-child(3)').hide();
		 $('#tabla thead > tr > th:nth-child(5), #tabla thead > tr > th:nth-child(4), #tabla thead > tr > th:nth-child(3)').hide();
		 
	"""),format.raw/*46.2*/("""}"""),format.raw/*46.3*/("""
	"""),format.raw/*47.2*/("""combinarCeldas();
	$(".container-fluid").show();

"""),format.raw/*50.1*/("""}"""),format.raw/*50.2*/(""");

	// Agrupa celdas comunes
    function combinarCeldas()"""),format.raw/*53.30*/("""{"""),format.raw/*53.31*/("""
	    """),format.raw/*54.6*/("""origen = $('#tabla');
	
	    for (r=$("#tabla tr").length-1; r>0 ;r--)"""),format.raw/*56.47*/("""{"""),format.raw/*56.48*/("""
	      """),format.raw/*57.8*/("""for (c=$("#tabla tr:nth-child("+r+") td").length-1; c>=0 ;c--)"""),format.raw/*57.70*/("""{"""),format.raw/*57.71*/("""
	            """),format.raw/*58.14*/("""var corte=0;
	            if ($("#tabla tr:nth-child("+r+") td:nth-child("+c+")").text() == $("#tabla tr:nth-child("+(r-1)+") td:nth-child("+c+")").text())"""),format.raw/*59.143*/("""{"""),format.raw/*59.144*/("""
	            	"""),format.raw/*60.15*/("""var altura = parseInt($("#tabla tr:nth-child("+(r-1)+") td:nth-child("+c+")").attr('rowspan')) + parseInt($("#tabla tr:nth-child("+r+") td:nth-child("+c+")").attr('rowspan'));
	            	$("#tabla tr:nth-child("+(r-1)+") td:nth-child("+c+")").attr('rowspan',altura);
	            	$("#tabla tr:nth-child("+r+") td:nth-child("+c+")").remove();
				
	          """),format.raw/*64.12*/("""}"""),format.raw/*64.13*/("""
	        """),format.raw/*65.10*/("""}"""),format.raw/*65.11*/("""    
	    """),format.raw/*66.6*/("""}"""),format.raw/*66.7*/("""
    """),format.raw/*67.5*/("""}"""),format.raw/*67.6*/("""
"""),format.raw/*68.1*/("""</script>"""))}
  }

  def render(re:List[Recursoevaluador],tipo:Int): play.twirl.api.HtmlFormat.Appendable = apply(re,tipo)

  def f:((List[Recursoevaluador],Int) => play.twirl.api.HtmlFormat.Appendable) = (re,tipo) => apply(re,tipo)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recursoevaluador/listarEvaluacionesPorRevisar.scala.html
                  HASH: c6cc235b5855c39c4fe0b55780f8411a86d19e21
                  MATRIX: 783->1|908->38|935->40|946->44|983->45|1011->47|1195->206|1273->276|1311->277|1351->291|1468->378|1501->385|1580->455|1619->456|1653->463|1774->554|1807->560|1914->641|1993->711|2032->712|2066->719|2135->758|2167->764|2246->834|2285->835|2319->842|2388->881|2424->890|2519->959|2573->992|2604->996|2659->1021|2688->1023|2762->1069|2791->1070|2821->1073|2852->1078|2877->1082|2906->1083|2939->1088|2968->1089|3003->1097|3245->1312|3273->1313|3302->1315|3379->1365|3407->1366|3494->1425|3523->1426|3556->1432|3654->1502|3683->1503|3718->1511|3808->1573|3837->1574|3879->1588|4063->1743|4093->1744|4136->1759|4526->2121|4555->2122|4593->2132|4622->2133|4659->2143|4687->2144|4719->2149|4747->2150|4775->2151
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|35->7|35->7|35->7|36->8|38->10|39->11|39->11|39->11|40->12|42->14|43->15|48->20|48->20|48->20|49->21|50->22|51->23|51->23|51->23|52->24|53->25|55->27|60->32|60->32|61->33|64->36|66->38|68->40|68->40|70->42|70->42|70->42|70->42|70->42|70->42|71->43|74->46|74->46|75->47|78->50|78->50|81->53|81->53|82->54|84->56|84->56|85->57|85->57|85->57|86->58|87->59|87->59|88->60|92->64|92->64|93->65|93->65|94->66|94->66|95->67|95->67|96->68
                  -- GENERATED --
              */
          