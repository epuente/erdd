
package views.html.Dirigidoa

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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Dirigidoa],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(fe: List[Dirigidoa]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.23*/("""

"""),_display_(/*4.2*/main/*4.6*/{_display_(Seq[Any](format.raw/*4.7*/("""
"""),format.raw/*5.1*/("""<style>
.filtrado, mark  """),format.raw/*6.18*/("""{"""),format.raw/*6.19*/("""
    """),format.raw/*7.5*/("""background-color:#ffffcc !important;  
"""),format.raw/*8.1*/("""}"""),format.raw/*8.2*/("""
"""),format.raw/*9.1*/("""</style>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.at("lib/datatables/css/dataTables.bootstrap.min.css")),format.raw/*10.117*/(""""/>
	<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li class="active">Dirigido a</li>
					</ol>			
				</div>
			</div>
            <div class="row">
                <div class="col-md-12">
                    <h3>Dirigido a  <a href=""""),_display_(/*22.47*/routes/*22.53*/.DirigidoaController.create()),format.raw/*22.82*/("""" title="Agregar 'Dirigido a'"><i class="fa fa-plus-circle text-success fa-lg" aria-hidden="true"></i></a></h3>      
                </div>
                </div>
			"""),_display_(/*25.5*/flashes()),format.raw/*25.14*/("""
			"""),_display_(/*26.5*/if(fe.isEmpty)/*26.19*/{_display_(Seq[Any](format.raw/*26.20*/("""
				"""),format.raw/*27.5*/("""<h1>No existen registros</h1>
			""")))}/*28.6*/else/*28.11*/{_display_(Seq[Any](format.raw/*28.12*/("""

				
				"""),format.raw/*31.5*/("""<table class="table table-striped table-bordered table-hover" id="tablaCatalogoDirigidoa">
					<thead>
						<tr>
							<th>Descripcion</th>
							<th></th>
						</tr>
					</thead>
				
					<tbody>
						"""),_display_(/*40.8*/for(e <- fe) yield /*40.20*/ {_display_(Seq[Any](format.raw/*40.22*/("""
							"""),format.raw/*41.8*/("""<tr>
								<td><a href=""""),_display_(/*42.23*/routes/*42.29*/.DirigidoaController.edit(e.id)),format.raw/*42.60*/("""">   """),_display_(/*42.66*/e/*42.67*/.descripcion),format.raw/*42.79*/("""  """),format.raw/*42.81*/("""</a> </td>
								<td style="text-align: center;">
									"""),_display_(/*44.11*/form(CSRF(routes.DirigidoaController.delete(e.id)), 'class -> "topRight")/*44.84*/ {_display_(Seq[Any](format.raw/*44.86*/("""						
										"""),format.raw/*45.11*/("""<button type="button" class="btn btn-danger btn-sm" name="btn"""),_display_(/*45.73*/e/*45.74*/.id.toString),format.raw/*45.86*/("""">Eliminar</button>
										""")))}),format.raw/*46.12*/("""
									"""),format.raw/*47.10*/("""</form>
								</td>
							</tr>
						""")))}),format.raw/*50.8*/("""
					"""),format.raw/*51.6*/("""</tbody>
				</table>
			""")))}),format.raw/*53.5*/("""
	"""),format.raw/*54.2*/("""</div>
""")))}),format.raw/*55.2*/("""

"""),format.raw/*57.1*/("""<script type="text/javascript">
	$(function()"""),format.raw/*58.14*/("""{"""),format.raw/*58.15*/("""
	    """),format.raw/*59.6*/("""laTablaDTSS = $('#tablaCatalogoDirigidoa').DataTable( """),format.raw/*59.60*/("""{"""),format.raw/*59.61*/("""
	        """),format.raw/*60.10*/("""pageLength: 10,
	        lengthMenu: [  [1,3, 5, 10, 25, 50, -1], [1,3, 5, 10, 25, 50, "Todos"]   ],    
	        language: """),format.raw/*62.20*/("""{"""),format.raw/*62.21*/("""
	            """),format.raw/*63.14*/("""url: """"),_display_(/*63.21*/routes/*63.27*/.Assets.at("Spanish.json")),format.raw/*63.53*/("""" 
	        """),format.raw/*64.10*/("""}"""),format.raw/*64.11*/(""",
	        mark: true,
	        stateSave: true,
	        fixedColumns: true,
	        columnDefs: [
	            """),format.raw/*69.14*/("""{"""),format.raw/*69.15*/(""" """),format.raw/*69.16*/("""sortable: false, targets: [ 1 ] """),format.raw/*69.48*/("""}"""),format.raw/*69.49*/(""",
	            """),format.raw/*70.14*/("""{"""),format.raw/*70.15*/(""" """),format.raw/*70.16*/("""width: "20%", targets: 1 """),format.raw/*70.41*/("""}"""),format.raw/*70.42*/("""
	          """),format.raw/*71.12*/("""],
	        "initComplete": function()"""),format.raw/*72.36*/("""{"""),format.raw/*72.37*/("""
	            """),format.raw/*73.14*/("""$("#tablaCatalogoDirigidoa_wrapper div.row div").removeClass("col-sm-6");
	            $("#tablaCatalogoDirigidoa_wrapper div.row div:eq(0)").addClass("col-sm-4");
	            $("#tablaCatalogoDirigidoa_wrapper div.row div:eq(2)").addClass("col-sm-8");
	            $(".dataTables_filter").css("width","auto");  
	            $("input[type='search'].form-control.input-sm").keyup(function()"""),format.raw/*77.78*/("""{"""),format.raw/*77.79*/("""
	                """),format.raw/*78.18*/("""if( $(this).val().length >0 )"""),format.raw/*78.47*/("""{"""),format.raw/*78.48*/("""
	                    """),format.raw/*79.22*/("""$(this).addClass("filtrado");
	                """),format.raw/*80.18*/("""}"""),format.raw/*80.19*/(""" """),format.raw/*80.20*/("""else """),format.raw/*80.25*/("""{"""),format.raw/*80.26*/("""
	                    """),format.raw/*81.22*/("""$(this).removeClass("filtrado");
	                """),format.raw/*82.18*/("""}"""),format.raw/*82.19*/("""
	            """),format.raw/*83.14*/("""}"""),format.raw/*83.15*/(""");   
	        """),format.raw/*84.10*/("""}"""),format.raw/*84.11*/("""
	    """),format.raw/*85.6*/("""}"""),format.raw/*85.7*/(""" """),format.raw/*85.8*/(""");        
	"""),format.raw/*86.2*/("""}"""),format.raw/*86.3*/(""");

	$( document ).on( "click", "[name*='btn']", function() """),format.raw/*88.57*/("""{"""),format.raw/*88.58*/("""
		 """),format.raw/*89.4*/("""if (confirm("¿Desea eliminar?"))"""),format.raw/*89.36*/("""{"""),format.raw/*89.37*/("""
			 """),format.raw/*90.5*/("""$(this).parent().submit();
		 """),format.raw/*91.4*/("""}"""),format.raw/*91.5*/("""
	"""),format.raw/*92.2*/("""}"""),format.raw/*92.3*/(""");
</script>

<script src=""""),_display_(/*95.15*/routes/*95.21*/.Assets.at("lib/datatables/js/jquery.dataTables.min.js")),format.raw/*95.77*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*96.15*/routes/*96.21*/.Assets.at("lib/datatables/js/dataTables.bootstrap.min.js")),format.raw/*96.80*/("""" type="text/javascript"></script>

<script src=""""),_display_(/*98.15*/routes/*98.21*/.Assets.at("mark.js/datatables.mark.min.js")),format.raw/*98.65*/(""""></script>
<script src=""""),_display_(/*99.15*/routes/*99.21*/.Assets.at("mark.js/jquery.mark.min.js")),format.raw/*99.61*/(""""></script>


"""))}
  }

  def render(fe:List[Dirigidoa]): play.twirl.api.HtmlFormat.Appendable = apply(fe)

  def f:((List[Dirigidoa]) => play.twirl.api.HtmlFormat.Appendable) = (fe) => apply(fe)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Dirigidoa/list.scala.html
                  HASH: 4279bacdc5e71663c6cdbf3edd02f46d0eb1040a
                  MATRIX: 741->1|865->22|893->42|904->46|941->47|968->48|1020->73|1048->74|1079->79|1144->118|1171->119|1198->120|1283->178|1298->184|1381->245|1786->623|1801->629|1851->658|2045->826|2075->835|2106->840|2129->854|2168->855|2200->860|2252->895|2265->900|2304->901|2342->912|2579->1123|2607->1135|2647->1137|2682->1145|2736->1172|2751->1178|2803->1209|2836->1215|2846->1216|2879->1228|2909->1230|2998->1292|3080->1365|3120->1367|3165->1384|3254->1446|3264->1447|3297->1459|3359->1490|3397->1500|3469->1542|3502->1548|3558->1574|3587->1576|3625->1584|3654->1586|3727->1631|3756->1632|3789->1638|3871->1692|3900->1693|3938->1703|4090->1827|4119->1828|4161->1842|4195->1849|4210->1855|4257->1881|4297->1893|4326->1894|4468->2008|4497->2009|4526->2010|4586->2042|4615->2043|4658->2058|4687->2059|4716->2060|4769->2085|4798->2086|4838->2098|4904->2136|4933->2137|4975->2151|5394->2542|5423->2543|5469->2561|5526->2590|5555->2591|5605->2613|5680->2660|5709->2661|5738->2662|5771->2667|5800->2668|5850->2690|5928->2740|5957->2741|5999->2755|6028->2756|6071->2771|6100->2772|6133->2778|6161->2779|6189->2780|6228->2792|6256->2793|6344->2853|6373->2854|6404->2858|6464->2890|6493->2891|6525->2896|6582->2926|6610->2927|6639->2929|6667->2930|6722->2958|6737->2964|6814->3020|6890->3069|6905->3075|6985->3134|7062->3184|7077->3190|7142->3234|7195->3260|7210->3266|7271->3306
                  LINES: 26->1|29->1|31->4|31->4|31->4|32->5|33->6|33->6|34->7|35->8|35->8|36->9|37->10|37->10|37->10|49->22|49->22|49->22|52->25|52->25|53->26|53->26|53->26|54->27|55->28|55->28|55->28|58->31|67->40|67->40|67->40|68->41|69->42|69->42|69->42|69->42|69->42|69->42|69->42|71->44|71->44|71->44|72->45|72->45|72->45|72->45|73->46|74->47|77->50|78->51|80->53|81->54|82->55|84->57|85->58|85->58|86->59|86->59|86->59|87->60|89->62|89->62|90->63|90->63|90->63|90->63|91->64|91->64|96->69|96->69|96->69|96->69|96->69|97->70|97->70|97->70|97->70|97->70|98->71|99->72|99->72|100->73|104->77|104->77|105->78|105->78|105->78|106->79|107->80|107->80|107->80|107->80|107->80|108->81|109->82|109->82|110->83|110->83|111->84|111->84|112->85|112->85|112->85|113->86|113->86|115->88|115->88|116->89|116->89|116->89|117->90|118->91|118->91|119->92|119->92|122->95|122->95|122->95|123->96|123->96|123->96|125->98|125->98|125->98|126->99|126->99|126->99
                  -- GENERATED --
              */
          