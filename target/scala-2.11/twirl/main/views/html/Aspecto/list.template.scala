
package views.html.Aspecto

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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Aspecto],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(as: List[Aspecto]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.21*/("""
"""),_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
	"""),format.raw/*4.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li class="active">Aspectos a evaluar</li>
					</ol>			
				</div>
			</div>

	
		    """),_display_(/*15.8*/if(flash.containsKey("success"))/*15.40*/ {_display_(Seq[Any](format.raw/*15.42*/("""
		        """),format.raw/*16.11*/("""<div class="alert alert-success" role="alert">
		            <strong>¡Correcto!</strong> El aspecto """),_display_(/*17.55*/flash/*17.60*/.get("success")),format.raw/*17.75*/("""
		        """),format.raw/*18.11*/("""</div>
		    """)))}),format.raw/*19.8*/("""
		    """),_display_(/*20.8*/if(flash.containsKey("warning"))/*20.40*/ {_display_(Seq[Any](format.raw/*20.42*/("""
		        """),format.raw/*21.11*/("""<div class="alert alert-warning" role="alert">
		            <strong>¡Precaución!</strong> El aspecto """),_display_(/*22.57*/flash/*22.62*/.get("warning")),format.raw/*22.77*/("""
		        """),format.raw/*23.11*/("""</div>
		    """)))}),format.raw/*24.8*/("""    """),_display_(/*24.13*/if(flash.containsKey("error"))/*24.43*/ {_display_(Seq[Any](format.raw/*24.45*/("""
		        """),format.raw/*25.11*/("""<div class="alert alert-danger" role="alert">
		            <strong>¡Error!</strong> El aspecto """),_display_(/*26.52*/flash/*26.57*/.get("error")),format.raw/*26.70*/("""
		        """),format.raw/*27.11*/("""</div>
		    """)))}),format.raw/*28.8*/(""" 
		
			"""),_display_(/*30.5*/if(as.isEmpty)/*30.19*/{_display_(Seq[Any](format.raw/*30.20*/("""
				"""),format.raw/*31.5*/("""<h1>No hay aspectos registrados</h1>
			""")))}/*32.6*/else/*32.11*/{_display_(Seq[Any](format.raw/*32.12*/("""
				"""),format.raw/*33.5*/("""<table class="tablaEncabezado">
					<tr>
						<td><h3>Aspectos a evaluar</h3></td>
						<td class="boton">
							<form action=""""),_display_(/*37.23*/routes/*37.29*/.AspectoController.create()),format.raw/*37.56*/("""">
								<input type="submit" value="Agregar aspecto" class="btn btn-success">
							</form>  
						</td>
					</tr>
				</table>
				
				<table class="table table-striped table-bordered table-hover">
					<thead>
						<tr>
							<th>Descripcion</th>
							<th></th>
						</tr>
					</thead>
				
					<tbody>
						"""),_display_(/*53.8*/for(e <- as) yield /*53.20*/ {_display_(Seq[Any](format.raw/*53.22*/("""
							"""),format.raw/*54.8*/("""<tr>
								<td><a href=""""),_display_(/*55.23*/routes/*55.29*/.AspectoController.edit(e.id)),format.raw/*55.58*/("""">   """),_display_(/*55.64*/e/*55.65*/.descripcion),format.raw/*55.77*/("""  """),format.raw/*55.79*/("""</a> </td>
								<td>
		
									"""),_display_(/*58.11*/form(CSRF(routes.AspectoController.delete(e.id)), 'class -> "topRight")/*58.82*/ {_display_(Seq[Any](format.raw/*58.84*/("""						
										"""),format.raw/*59.11*/("""<button type="button" class="btn btn-primary btn-sm" name="btn"""),_display_(/*59.74*/e/*59.75*/.id.toString),format.raw/*59.87*/("""">Eliminar</button>
										""")))}),format.raw/*60.12*/("""
									"""),format.raw/*61.10*/("""</form>
								</td>
							</tr>
						""")))}),format.raw/*64.8*/("""
					"""),format.raw/*65.6*/("""</tbody>
				</table>
			""")))}),format.raw/*67.5*/("""
	"""),format.raw/*68.2*/("""</div>
""")))}),format.raw/*69.2*/("""

"""),format.raw/*71.1*/("""<script type="text/javascript">
	$( document ).on( "click", "[name*='btn']", function() """),format.raw/*72.57*/("""{"""),format.raw/*72.58*/("""
		 """),format.raw/*73.4*/("""var num = $(this).attr('name').substring(3); 
		 if (confirm("¿Desea eliminar el aspecto?"))"""),format.raw/*74.47*/("""{"""),format.raw/*74.48*/("""
			 
			 """),format.raw/*76.5*/("""$(this).parent().submit();
		 """),format.raw/*77.4*/("""}"""),format.raw/*77.5*/("""		 
		 
		 
"""),format.raw/*80.1*/("""/*		  
		  if (confirm("¿Desea eliminar al evaluador?"))"""),format.raw/*81.50*/("""{"""),format.raw/*81.51*/("""
			  """),format.raw/*82.6*/("""$.ajax("""),format.raw/*82.13*/("""{"""),format.raw/*82.14*/("""
				  """),format.raw/*83.7*/("""method: "POST",
				  url: "/evaluador/"+num+"/delete"
	
				"""),format.raw/*86.5*/("""}"""),format.raw/*86.6*/(""")
				  .success(function( data ) """),format.raw/*87.33*/("""{"""),format.raw/*87.34*/("""
					"""),format.raw/*88.6*/("""window.location.assign('evaluadores');
				  """),format.raw/*89.7*/("""}"""),format.raw/*89.8*/(""")
				  
				  .error(function(data)"""),format.raw/*91.28*/("""{"""),format.raw/*91.29*/("""
				  	"""),format.raw/*92.8*/("""alert("error: "+data);
				  """),format.raw/*93.7*/("""}"""),format.raw/*93.8*/(""")		  
		  """),format.raw/*94.5*/("""}"""),format.raw/*94.6*/("""
		  """),format.raw/*95.5*/("""*/
	"""),format.raw/*96.2*/("""}"""),format.raw/*96.3*/(""");
</script>"""))}
  }

  def render(as:List[Aspecto]): play.twirl.api.HtmlFormat.Appendable = apply(as)

  def f:((List[Aspecto]) => play.twirl.api.HtmlFormat.Appendable) = (as) => apply(as)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:37 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Aspecto/list.scala.html
                  HASH: 887d2ce2dc59c66efe082facfc2cca2ffa11411c
                  MATRIX: 737->1|859->20|886->39|897->43|934->44|962->46|1263->321|1304->353|1344->355|1383->366|1511->467|1525->472|1561->487|1600->498|1644->512|1678->520|1719->552|1759->554|1798->565|1928->668|1942->673|1978->688|2017->699|2061->713|2093->718|2132->748|2172->750|2211->761|2335->858|2349->863|2383->876|2422->887|2466->901|2501->910|2524->924|2563->925|2595->930|2654->972|2667->977|2706->978|2738->983|2897->1115|2912->1121|2960->1148|3312->1474|3340->1486|3380->1488|3415->1496|3469->1523|3484->1529|3534->1558|3567->1564|3577->1565|3610->1577|3640->1579|3704->1616|3784->1687|3824->1689|3869->1706|3959->1769|3969->1770|4002->1782|4064->1813|4102->1823|4174->1865|4207->1871|4263->1897|4292->1899|4330->1907|4359->1909|4475->1997|4504->1998|4535->2002|4655->2094|4684->2095|4721->2105|4778->2135|4806->2136|4845->2148|4929->2204|4958->2205|4991->2211|5026->2218|5055->2219|5089->2226|5177->2287|5205->2288|5267->2322|5296->2323|5329->2329|5401->2374|5429->2375|5493->2411|5522->2412|5557->2420|5613->2449|5641->2450|5678->2460|5706->2461|5738->2466|5769->2470|5797->2471
                  LINES: 26->1|29->1|30->3|30->3|30->3|31->4|42->15|42->15|42->15|43->16|44->17|44->17|44->17|45->18|46->19|47->20|47->20|47->20|48->21|49->22|49->22|49->22|50->23|51->24|51->24|51->24|51->24|52->25|53->26|53->26|53->26|54->27|55->28|57->30|57->30|57->30|58->31|59->32|59->32|59->32|60->33|64->37|64->37|64->37|80->53|80->53|80->53|81->54|82->55|82->55|82->55|82->55|82->55|82->55|82->55|85->58|85->58|85->58|86->59|86->59|86->59|86->59|87->60|88->61|91->64|92->65|94->67|95->68|96->69|98->71|99->72|99->72|100->73|101->74|101->74|103->76|104->77|104->77|107->80|108->81|108->81|109->82|109->82|109->82|110->83|113->86|113->86|114->87|114->87|115->88|116->89|116->89|118->91|118->91|119->92|120->93|120->93|121->94|121->94|122->95|123->96|123->96
                  -- GENERATED --
              */
          