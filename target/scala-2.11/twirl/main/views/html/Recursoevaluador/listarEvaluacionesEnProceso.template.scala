
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
object listarEvaluacionesEnProceso extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Recursoevaluador],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(re:List[Recursoevaluador], tipo:Int):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.39*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""

	"""),format.raw/*4.2*/("""<div class="container-fluid" style="background-color: white; padding: 10px; display: none">
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">				
					"""),_display_(/*8.7*/if( request.uri.substring(request.uri.length-1).compareTo("0") == 0  )/*8.77*/{_display_(Seq[Any](format.raw/*8.78*/("""				
					  """),format.raw/*9.8*/("""<li>Recursos</li>
					  <li class="active">Evaluaciones en proceso</li>
				  	""")))}),format.raw/*11.9*/("""
					"""),_display_(/*12.7*/if( request.uri.substring(request.uri.length-1).compareTo("1") == 0  )/*12.77*/{_display_(Seq[Any](format.raw/*12.78*/("""				
					  """),format.raw/*13.8*/("""<li>Detalle evaluaciones</li>
					  <li class="active">Evaluaciones en proceso</li>
				  	""")))}),format.raw/*15.9*/("""				  	
				"""),format.raw/*16.5*/("""</ol>			
			</div>
		</div>	
		<div class="row">
			<div class="col-md-12">
				"""),_display_(/*21.6*/if( request.uri.substring(request.uri.length-1).compareTo("0") == 0  )/*21.76*/{_display_(Seq[Any](format.raw/*21.77*/("""
					"""),format.raw/*22.6*/("""<h3>Evaluaciones en proceso</h3>
				""")))}),format.raw/*23.6*/("""
				"""),_display_(/*24.6*/if( request.uri.substring(request.uri.length-1).compareTo("1") == 0  )/*24.76*/{_display_(Seq[Any](format.raw/*24.77*/("""
					"""),format.raw/*25.6*/("""<h3>Evaluaciones en proceso</h3>
				""")))}),format.raw/*26.6*/("""				
			"""),format.raw/*27.4*/("""</div>
		</div>

		<div class="row">
			<div class="col-lg-12">
				"""),_display_(/*32.6*/comunListarEvaluaciones(re, tipo)),format.raw/*32.39*/("""
			"""),format.raw/*33.4*/("""</div>
		</div>
	</div>
""")))}),format.raw/*36.2*/("""


"""),format.raw/*39.1*/("""<script type="text/javascript">

$(function() """),format.raw/*41.14*/("""{"""),format.raw/*41.15*/("""

	"""),format.raw/*43.2*/("""if ("""),_display_(/*43.7*/tipo),format.raw/*43.11*/(""" """),format.raw/*43.12*/("""== 0)"""),format.raw/*43.17*/("""{"""),format.raw/*43.18*/("""				
		 """),format.raw/*44.4*/("""$('#tabla td:nth-child(5), #tabla td:nth-child(4), #tabla td:nth-child(3)').hide();
		 $('#tabla thead > tr > th:nth-child(5), #tabla thead > tr > th:nth-child(4), #tabla thead > tr > th:nth-child(3)').hide();
		 
	"""),format.raw/*47.2*/("""}"""),format.raw/*47.3*/("""
	"""),format.raw/*48.2*/("""combinarCeldas();
	$(".container-fluid").show();

"""),format.raw/*51.1*/("""}"""),format.raw/*51.2*/(""");

	// Agrupa celdas comunes
    function combinarCeldas()"""),format.raw/*54.30*/("""{"""),format.raw/*54.31*/("""
	    """),format.raw/*55.6*/("""origen = $('#tabla');
	
	    for (r=$("#tabla tr").length-1; r>0 ;r--)"""),format.raw/*57.47*/("""{"""),format.raw/*57.48*/("""
	      """),format.raw/*58.8*/("""for (c=$("#tabla tr:nth-child("+r+") td").length-1; c>=0 ;c--)"""),format.raw/*58.70*/("""{"""),format.raw/*58.71*/("""
	            """),format.raw/*59.14*/("""var corte=0;
	            if ($("#tabla tr:nth-child("+r+") td:nth-child("+c+")").text() == $("#tabla tr:nth-child("+(r-1)+") td:nth-child("+c+")").text())"""),format.raw/*60.143*/("""{"""),format.raw/*60.144*/("""
	            	"""),format.raw/*61.15*/("""var altura = parseInt($("#tabla tr:nth-child("+(r-1)+") td:nth-child("+c+")").attr('rowspan')) + parseInt($("#tabla tr:nth-child("+r+") td:nth-child("+c+")").attr('rowspan'));
	            	$("#tabla tr:nth-child("+(r-1)+") td:nth-child("+c+")").attr('rowspan',altura);
	            	$("#tabla tr:nth-child("+r+") td:nth-child("+c+")").remove();
				
	          """),format.raw/*65.12*/("""}"""),format.raw/*65.13*/("""
	        """),format.raw/*66.10*/("""}"""),format.raw/*66.11*/("""    
	    """),format.raw/*67.6*/("""}"""),format.raw/*67.7*/("""
    """),format.raw/*68.5*/("""}"""),format.raw/*68.6*/("""
"""),format.raw/*69.1*/("""</script>"""))}
  }

  def render(re:List[Recursoevaluador],tipo:Int): play.twirl.api.HtmlFormat.Appendable = apply(re,tipo)

  def f:((List[Recursoevaluador],Int) => play.twirl.api.HtmlFormat.Appendable) = (re,tipo) => apply(re,tipo)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recursoevaluador/listarEvaluacionesEnProceso.scala.html
                  HASH: f0e78b4816380c42a2ce21667eb0ba48550e34a9
                  MATRIX: 782->1|907->38|934->40|945->44|982->45|1011->48|1213->225|1291->295|1329->296|1367->308|1478->389|1511->396|1590->466|1629->467|1668->479|1791->572|1830->584|1937->665|2016->735|2055->736|2088->742|2156->780|2188->786|2267->856|2306->857|2339->863|2407->901|2442->909|2537->978|2591->1011|2622->1015|2677->1040|2707->1043|2781->1089|2810->1090|2840->1093|2871->1098|2896->1102|2925->1103|2958->1108|2987->1109|3022->1117|3264->1332|3292->1333|3321->1335|3398->1385|3426->1386|3513->1445|3542->1446|3575->1452|3673->1522|3702->1523|3737->1531|3827->1593|3856->1594|3898->1608|4082->1763|4112->1764|4155->1779|4545->2141|4574->2142|4612->2152|4641->2153|4678->2163|4706->2164|4738->2169|4766->2170|4794->2171
                  LINES: 26->1|29->1|30->2|30->2|30->2|32->4|36->8|36->8|36->8|37->9|39->11|40->12|40->12|40->12|41->13|43->15|44->16|49->21|49->21|49->21|50->22|51->23|52->24|52->24|52->24|53->25|54->26|55->27|60->32|60->32|61->33|64->36|67->39|69->41|69->41|71->43|71->43|71->43|71->43|71->43|71->43|72->44|75->47|75->47|76->48|79->51|79->51|82->54|82->54|83->55|85->57|85->57|86->58|86->58|86->58|87->59|88->60|88->60|89->61|93->65|93->65|94->66|94->66|95->67|95->67|96->68|96->68|97->69
                  -- GENERATED --
              */
          