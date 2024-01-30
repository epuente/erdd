
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
object listarEvaluacionesSinAtender extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Recursoevaluador],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(re:List[Recursoevaluador], tipo:Int):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.39*/("""



"""),_display_(/*5.2*/main/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""
	"""),format.raw/*6.2*/("""<div class="container-fluid" style="background-color: white; padding: 10px; display: none" >
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
					"""),_display_(/*10.7*/if( request.uri.substring(request.uri.length-1).compareTo("0") == 0  )/*10.77*/{_display_(Seq[Any](format.raw/*10.78*/("""					
					  """),format.raw/*11.8*/("""<li>Recursos</li>
					  <li class="active">Evaluaciones sin atender</li>
					""")))}),format.raw/*13.7*/("""
					"""),_display_(/*14.7*/if( request.uri.substring(request.uri.length-1).compareTo("1") == 0  )/*14.77*/{_display_(Seq[Any](format.raw/*14.78*/("""
						"""),format.raw/*15.7*/("""<li>Detalle evaluaciones</li>
						<li class="active">Evaluaciones sin atender</li>	
					""")))}),format.raw/*17.7*/("""					
				"""),format.raw/*18.5*/("""</ol>			
			</div>
		</div>	
		<div class="row">
			<div class="col-md-12">
				"""),_display_(/*23.6*/if( request.uri.substring(request.uri.length-1).compareTo("1") == 0  )/*23.76*/{_display_(Seq[Any](format.raw/*23.77*/("""
					"""),format.raw/*24.6*/("""<h3>Evaluaciones sin atender</h3>
				""")))}),format.raw/*25.6*/("""
				"""),_display_(/*26.6*/if( request.uri.substring(request.uri.length-1).compareTo("0") == 0  )/*26.76*/{_display_(Seq[Any](format.raw/*26.77*/("""
					"""),format.raw/*27.6*/("""<h3>Evaluaciones sin atender</h3>
				""")))}),format.raw/*28.6*/("""
			"""),format.raw/*29.4*/("""</div>
		</div>

		<div class="row">
			<div class="col-lg-12">
				"""),_display_(/*34.6*/comunListarEvaluaciones(re, tipo)),format.raw/*34.39*/("""
			"""),format.raw/*35.4*/("""</div>
		</div>
	</div>
""")))}),format.raw/*38.2*/("""


"""),format.raw/*41.1*/("""<script type="text/javascript">

$(function() """),format.raw/*43.14*/("""{"""),format.raw/*43.15*/("""
	"""),format.raw/*44.2*/("""if ("""),_display_(/*44.7*/tipo),format.raw/*44.11*/(""" """),format.raw/*44.12*/("""== 0)"""),format.raw/*44.17*/("""{"""),format.raw/*44.18*/("""				
		 """),format.raw/*45.4*/("""//$('#tabla td:nth-child(2), #tabla thead > tr > th:nth-child(3)').hide();	
		// $('#tabla td:nth-child(3), #tabla thead > tr > th:nth-child(3)').hide();
		$('#tabla td:nth-child(6), #tabla td:nth-child(5), #tabla td:nth-child(4), #tabla td:nth-child(3)').hide();
		$('#tabla thead > tr > th:nth-child(6), #tabla thead > tr > th:nth-child(5), #tabla thead > tr > th:nth-child(4), #tabla thead > tr > th:nth-child(3)').hide();
		 
	"""),format.raw/*50.2*/("""}"""),format.raw/*50.3*/("""
	"""),format.raw/*51.2*/("""if ("""),_display_(/*51.7*/tipo),format.raw/*51.11*/(""" """),format.raw/*51.12*/("""== 1)"""),format.raw/*51.17*/("""{"""),format.raw/*51.18*/("""	
		"""),_display_(/*52.4*/if(!re.isEmpty())/*52.21*/{_display_(Seq[Any](format.raw/*52.22*/("""
			"""),format.raw/*53.4*/("""if("""),_display_(/*53.8*/re/*53.10*/.head.recurso.estado.id),format.raw/*53.33*/(""" """),format.raw/*53.34*/("""== 6)"""),format.raw/*53.39*/("""{"""),format.raw/*53.40*/("""
				"""),format.raw/*54.5*/("""$('#tabla td:nth-child(5)').show();
				 $('#tabla thead > tr > th:nth-child(5)').show();		
			"""),format.raw/*56.4*/("""}"""),format.raw/*56.5*/("""
		""")))}),format.raw/*57.4*/("""
	"""),format.raw/*58.2*/("""}"""),format.raw/*58.3*/("""
	"""),format.raw/*59.2*/("""combinarCeldas();
	$(".container-fluid").show();

"""),format.raw/*62.1*/("""}"""),format.raw/*62.2*/(""");

	// Agrupa celdas comunes
    function combinarCeldas()"""),format.raw/*65.30*/("""{"""),format.raw/*65.31*/("""
	    """),format.raw/*66.6*/("""origen = $('#tabla');
	
	    for (r=$("#tabla tr").length-1; r>0 ;r--)"""),format.raw/*68.47*/("""{"""),format.raw/*68.48*/("""
	      """),format.raw/*69.8*/("""for (c=$("#tabla tr:nth-child("+r+") td").length-1; c>=0 ;c--)"""),format.raw/*69.70*/("""{"""),format.raw/*69.71*/("""
	              """),format.raw/*70.16*/("""// Corte; se hace corte por la primer columna, forza a que se haga un corte cuando la primer columna es diferente, es decir, si las columnas 4 y 5  son iguales en todos los registros pero la columna 0 difiere; no se agrupan puesto que sus columnas primeras son diferentes.
	            var corte=0;
			//	alert(r+"   "+c);
			//	alert($("#tabla tr:nth-child("+r+") td:nth-child("+c+")").text());
	            if ($("#tabla tr:nth-child("+r+") td:nth-child("+c+")").text() == $("#tabla tr:nth-child("+(r-1)+") td:nth-child("+c+")").text())"""),format.raw/*74.143*/("""{"""),format.raw/*74.144*/("""
	            	"""),format.raw/*75.15*/("""var altura = parseInt($("#tabla tr:nth-child("+(r-1)+") td:nth-child("+c+")").attr('rowspan')) + parseInt($("#tabla tr:nth-child("+r+") td:nth-child("+c+")").attr('rowspan'));
	            	$("#tabla tr:nth-child("+(r-1)+") td:nth-child("+c+")").attr('rowspan',altura);
	            	$("#tabla tr:nth-child("+r+") td:nth-child("+c+")").remove();
				
	          """),format.raw/*79.12*/("""}"""),format.raw/*79.13*/("""
	        """),format.raw/*80.10*/("""}"""),format.raw/*80.11*/("""    
	    """),format.raw/*81.6*/("""}"""),format.raw/*81.7*/("""
    """),format.raw/*82.5*/("""}"""),format.raw/*82.6*/("""
"""),format.raw/*83.1*/("""</script>
"""))}
  }

  def render(re:List[Recursoevaluador],tipo:Int): play.twirl.api.HtmlFormat.Appendable = apply(re,tipo)

  def f:((List[Recursoevaluador],Int) => play.twirl.api.HtmlFormat.Appendable) = (re,tipo) => apply(re,tipo)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recursoevaluador/listarEvaluacionesSinAtender.scala.html
                  HASH: e173cdc30f0ae3f6534fff5bc357631c140383f3
                  MATRIX: 783->1|908->38|938->43|949->47|986->48|1014->50|1214->224|1293->294|1332->295|1372->308|1482->388|1515->395|1594->465|1633->466|1667->473|1789->565|1826->575|1933->656|2012->726|2051->727|2084->733|2153->772|2185->778|2264->848|2303->849|2336->855|2405->894|2436->898|2531->967|2585->1000|2616->1004|2671->1029|2701->1032|2775->1078|2804->1079|2833->1081|2864->1086|2889->1090|2918->1091|2951->1096|2980->1097|3015->1105|3473->1536|3501->1537|3530->1539|3561->1544|3586->1548|3615->1549|3648->1554|3677->1555|3708->1560|3734->1577|3773->1578|3804->1582|3834->1586|3845->1588|3889->1611|3918->1612|3951->1617|3980->1618|4012->1623|4134->1718|4162->1719|4196->1723|4225->1725|4253->1726|4282->1728|4359->1778|4387->1779|4474->1838|4503->1839|4536->1845|4634->1915|4663->1916|4698->1924|4788->1986|4817->1987|4861->2003|5428->2541|5458->2542|5501->2557|5891->2919|5920->2920|5958->2930|5987->2931|6024->2941|6052->2942|6084->2947|6112->2948|6140->2949
                  LINES: 26->1|29->1|33->5|33->5|33->5|34->6|38->10|38->10|38->10|39->11|41->13|42->14|42->14|42->14|43->15|45->17|46->18|51->23|51->23|51->23|52->24|53->25|54->26|54->26|54->26|55->27|56->28|57->29|62->34|62->34|63->35|66->38|69->41|71->43|71->43|72->44|72->44|72->44|72->44|72->44|72->44|73->45|78->50|78->50|79->51|79->51|79->51|79->51|79->51|79->51|80->52|80->52|80->52|81->53|81->53|81->53|81->53|81->53|81->53|81->53|82->54|84->56|84->56|85->57|86->58|86->58|87->59|90->62|90->62|93->65|93->65|94->66|96->68|96->68|97->69|97->69|97->69|98->70|102->74|102->74|103->75|107->79|107->79|108->80|108->80|109->81|109->81|110->82|110->82|111->83
                  -- GENERATED --
              */
          