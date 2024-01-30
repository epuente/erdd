
package views.html.Tipodocumento

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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Tipodocumento],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(fe: List[Tipodocumento]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*4.2*/main/*4.6*/{_display_(Seq[Any](format.raw/*4.7*/("""
    """),format.raw/*5.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.50*/routes/*5.56*/.Assets.at("lib/datatables/css/dataTables.bootstrap.min.css")),format.raw/*5.117*/(""""/>
<style>
.filtrado, mark  """),format.raw/*7.18*/("""{"""),format.raw/*7.19*/("""
    """),format.raw/*8.5*/("""background-color:#ffffcc !important;  
"""),format.raw/*9.1*/("""}"""),format.raw/*9.2*/("""
"""),format.raw/*10.1*/("""</style>    
	<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li class="active">Tipos de documentos</li>
					</ol>			
				</div>
			</div>
                <div class="row">
                    <div class="col-md-12">
                        <h3>Tipos de documentos  <a href=""""),_display_(/*22.60*/routes/*22.66*/.TipodocumentoController.create()),format.raw/*22.99*/("""" title="Agregar Tipo de documento"><i class="fa fa-plus-circle text-success fa-lg" aria-hidden="true"></i></a></h3>
                    </div>
                </div>
	
		    """),_display_(/*26.8*/if(flash.containsKey("success"))/*26.40*/ {_display_(Seq[Any](format.raw/*26.42*/("""
		        """),format.raw/*27.11*/("""<div class="alert alert-success" role="alert">
		            <strong>¡Correcto!</strong> El tipo de documento """),_display_(/*28.65*/flash/*28.70*/.get("success")),format.raw/*28.85*/("""
		        """),format.raw/*29.11*/("""</div>
		    """)))}),format.raw/*30.8*/("""
		    """),_display_(/*31.8*/if(flash.containsKey("warning"))/*31.40*/ {_display_(Seq[Any](format.raw/*31.42*/("""
		        """),format.raw/*32.11*/("""<div class="alert alert-warning" role="alert">
		            <strong>¡Precaución!</strong> El tipo de documento """),_display_(/*33.67*/flash/*33.72*/.get("warning")),format.raw/*33.87*/("""
		        """),format.raw/*34.11*/("""</div>
		    """)))}),format.raw/*35.8*/("""    """),_display_(/*35.13*/if(flash.containsKey("error"))/*35.43*/ {_display_(Seq[Any](format.raw/*35.45*/("""
		        """),format.raw/*36.11*/("""<div class="alert alert-danger" role="alert">
		            <strong>¡Error!</strong> El tipo de documento """),_display_(/*37.62*/flash/*37.67*/.get("error")),format.raw/*37.80*/("""
		        """),format.raw/*38.11*/("""</div>
		    """)))}),format.raw/*39.8*/(""" 
		
			"""),_display_(/*41.5*/if(fe.isEmpty)/*41.19*/{_display_(Seq[Any](format.raw/*41.20*/("""
				"""),format.raw/*42.5*/("""<h1>No hay tipos de documentos registrados</h1>
			""")))}/*43.6*/else/*43.11*/{_display_(Seq[Any](format.raw/*43.12*/("""

				
				"""),format.raw/*46.5*/("""<table class="table table-striped table-bordered table-hover" id="tablaCatalogoTipoDoc">
					<thead>
						<tr>
							<th>Descripcion</th>
							<th>Estado</th>
							<th>Obligatorio</th>
							<th></th>
						</tr>
					</thead>
				
					<tbody>
						"""),_display_(/*57.8*/for(e <- fe) yield /*57.20*/ {_display_(Seq[Any](format.raw/*57.22*/("""
							"""),format.raw/*58.8*/("""<tr>
								<td><a href=""""),_display_(/*59.23*/routes/*59.29*/.TipodocumentoController.edit(e.id)),format.raw/*59.64*/("""">   """),_display_(/*59.70*/e/*59.71*/.descripcion),format.raw/*59.83*/("""  """),format.raw/*59.85*/("""</a> </td>
								<td>"""),_display_(/*60.14*/e/*60.15*/.estado.descripcion),format.raw/*60.34*/("""</td>
								<td>"""),_display_(/*61.14*/if(e.obligatorio==1)/*61.34*/{_display_(Seq[Any](format.raw/*61.35*/("""Si""")))}/*61.38*/else/*61.42*/{_display_(Seq[Any](format.raw/*61.43*/("""No""")))}),format.raw/*61.46*/("""</td>
								<td style="text-align: center;">
									"""),_display_(/*63.11*/form(CSRF(routes.TipodocumentoController.delete(e.id)), 'class -> "topRight")/*63.88*/ {_display_(Seq[Any](format.raw/*63.90*/("""						
										"""),format.raw/*64.11*/("""<button type="button" class="btn btn-danger btn-sm" name="btn"""),_display_(/*64.73*/e/*64.74*/.id.toString),format.raw/*64.86*/("""">Eliminar</button>
										""")))}),format.raw/*65.12*/("""									
								"""),format.raw/*66.9*/("""</td>
							</tr>
						""")))}),format.raw/*68.8*/("""
					"""),format.raw/*69.6*/("""</tbody>
				</table>
			""")))}),format.raw/*71.5*/("""
	"""),format.raw/*72.2*/("""</div>
""")))}),format.raw/*73.2*/("""

"""),format.raw/*75.1*/("""<script type="text/javascript">
	$(function()"""),format.raw/*76.14*/("""{"""),format.raw/*76.15*/("""
	    """),format.raw/*77.6*/("""laTablaDTSS = $('#tablaCatalogoTipoDoc').DataTable( """),format.raw/*77.58*/("""{"""),format.raw/*77.59*/("""
	        """),format.raw/*78.10*/("""pageLength: 10,
	        lengthMenu: [  [1,3, 5, 10, 25, 50, -1], [1,3, 5, 10, 25, 50, "Todos"]   ],    
	        language: """),format.raw/*80.20*/("""{"""),format.raw/*80.21*/("""
	            """),format.raw/*81.14*/("""url: """"),_display_(/*81.21*/routes/*81.27*/.Assets.at("Spanish.json")),format.raw/*81.53*/("""" 
	        """),format.raw/*82.10*/("""}"""),format.raw/*82.11*/(""",
	        mark: true,
	        stateSave: true,
	        fixedColumns: true,
	        columnDefs: [
	            """),format.raw/*87.14*/("""{"""),format.raw/*87.15*/(""" """),format.raw/*87.16*/("""sortable: false, targets: [ 3 ] """),format.raw/*87.48*/("""}"""),format.raw/*87.49*/(""",
	            """),format.raw/*88.14*/("""{"""),format.raw/*88.15*/(""" """),format.raw/*88.16*/("""width: "20%", targets: 3 """),format.raw/*88.41*/("""}"""),format.raw/*88.42*/("""
	          """),format.raw/*89.12*/("""],
	        "initComplete": function()"""),format.raw/*90.36*/("""{"""),format.raw/*90.37*/("""
	            """),format.raw/*91.14*/("""$("#tablaCatalogoTipoDoc_wrapper div.row div").removeClass("col-sm-6");
	            $("#tablaCatalogoTipoDoc_wrapper div.row div:eq(0)").addClass("col-sm-4");
	            $("#tablaCatalogoTipoDoc_wrapper div.row div:eq(2)").addClass("col-sm-8");
	            $(".dataTables_filter").css("width","auto");  
	            $("input[type='search'].form-control.input-sm").keyup(function()"""),format.raw/*95.78*/("""{"""),format.raw/*95.79*/("""
	                """),format.raw/*96.18*/("""if( $(this).val().length >0 )"""),format.raw/*96.47*/("""{"""),format.raw/*96.48*/("""
	                    """),format.raw/*97.22*/("""$(this).addClass("filtrado");
	                """),format.raw/*98.18*/("""}"""),format.raw/*98.19*/(""" """),format.raw/*98.20*/("""else """),format.raw/*98.25*/("""{"""),format.raw/*98.26*/("""
	                    """),format.raw/*99.22*/("""$(this).removeClass("filtrado");
	                """),format.raw/*100.18*/("""}"""),format.raw/*100.19*/("""
	            """),format.raw/*101.14*/("""}"""),format.raw/*101.15*/(""");   
	        """),format.raw/*102.10*/("""}"""),format.raw/*102.11*/("""
	    """),format.raw/*103.6*/("""}"""),format.raw/*103.7*/(""" """),format.raw/*103.8*/(""");        
	"""),format.raw/*104.2*/("""}"""),format.raw/*104.3*/(""");


	$( document ).on( "click", "[name*='btn']", function() """),format.raw/*107.57*/("""{"""),format.raw/*107.58*/("""
		 """),format.raw/*108.4*/("""if (confirm("¿Desea eliminar el tipo documento?"))"""),format.raw/*108.54*/("""{"""),format.raw/*108.55*/("""
			 """),format.raw/*109.5*/("""$(this).parent().submit();
		 """),format.raw/*110.4*/("""}"""),format.raw/*110.5*/("""
	"""),format.raw/*111.2*/("""}"""),format.raw/*111.3*/(""");
</script>


<script src=""""),_display_(/*115.15*/routes/*115.21*/.Assets.at("lib/datatables/js/jquery.dataTables.min.js")),format.raw/*115.77*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*116.15*/routes/*116.21*/.Assets.at("lib/datatables/js/dataTables.bootstrap.min.js")),format.raw/*116.80*/("""" type="text/javascript"></script>

<script src=""""),_display_(/*118.15*/routes/*118.21*/.Assets.at("mark.js/datatables.mark.min.js")),format.raw/*118.65*/(""""></script>
<script src=""""),_display_(/*119.15*/routes/*119.21*/.Assets.at("mark.js/jquery.mark.min.js")),format.raw/*119.61*/(""""></script>

"""))}
  }

  def render(fe:List[Tipodocumento]): play.twirl.api.HtmlFormat.Appendable = apply(fe)

  def f:((List[Tipodocumento]) => play.twirl.api.HtmlFormat.Appendable) = (fe) => apply(fe)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:36 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Tipodocumento/list.scala.html
                  HASH: 34029523194536f7e6a27e236effe266496fb74f
                  MATRIX: 749->1|877->26|905->46|916->50|953->51|984->56|1055->101|1069->107|1151->168|1207->197|1235->198|1266->203|1331->242|1358->243|1386->244|1830->661|1845->667|1899->700|2101->876|2142->908|2182->910|2221->921|2359->1032|2373->1037|2409->1052|2448->1063|2492->1077|2526->1085|2567->1117|2607->1119|2646->1130|2786->1243|2800->1248|2836->1263|2875->1274|2919->1288|2951->1293|2990->1323|3030->1325|3069->1336|3203->1443|3217->1448|3251->1461|3290->1472|3334->1486|3369->1495|3392->1509|3431->1510|3463->1515|3533->1568|3546->1573|3585->1574|3623->1585|3909->1845|3937->1857|3977->1859|4012->1867|4066->1894|4081->1900|4137->1935|4170->1941|4180->1942|4213->1954|4243->1956|4294->1980|4304->1981|4344->2000|4390->2019|4419->2039|4458->2040|4480->2043|4493->2047|4532->2048|4566->2051|4650->2108|4736->2185|4776->2187|4821->2204|4910->2266|4920->2267|4953->2279|5015->2310|5060->2328|5116->2354|5149->2360|5205->2386|5234->2388|5272->2396|5301->2398|5374->2443|5403->2444|5436->2450|5516->2502|5545->2503|5583->2513|5735->2637|5764->2638|5806->2652|5840->2659|5855->2665|5902->2691|5942->2703|5971->2704|6113->2818|6142->2819|6171->2820|6231->2852|6260->2853|6303->2868|6332->2869|6361->2870|6414->2895|6443->2896|6483->2908|6549->2946|6578->2947|6620->2961|7033->3346|7062->3347|7108->3365|7165->3394|7194->3395|7244->3417|7319->3464|7348->3465|7377->3466|7410->3471|7439->3472|7489->3494|7568->3544|7598->3545|7641->3559|7671->3560|7715->3575|7745->3576|7779->3582|7808->3583|7837->3584|7877->3596|7906->3597|7996->3658|8026->3659|8058->3663|8137->3713|8167->3714|8200->3719|8258->3749|8287->3750|8317->3752|8346->3753|8403->3782|8419->3788|8497->3844|8574->3893|8590->3899|8671->3958|8749->4008|8765->4014|8831->4058|8885->4084|8901->4090|8963->4130
                  LINES: 26->1|29->1|31->4|31->4|31->4|32->5|32->5|32->5|32->5|34->7|34->7|35->8|36->9|36->9|37->10|49->22|49->22|49->22|53->26|53->26|53->26|54->27|55->28|55->28|55->28|56->29|57->30|58->31|58->31|58->31|59->32|60->33|60->33|60->33|61->34|62->35|62->35|62->35|62->35|63->36|64->37|64->37|64->37|65->38|66->39|68->41|68->41|68->41|69->42|70->43|70->43|70->43|73->46|84->57|84->57|84->57|85->58|86->59|86->59|86->59|86->59|86->59|86->59|86->59|87->60|87->60|87->60|88->61|88->61|88->61|88->61|88->61|88->61|88->61|90->63|90->63|90->63|91->64|91->64|91->64|91->64|92->65|93->66|95->68|96->69|98->71|99->72|100->73|102->75|103->76|103->76|104->77|104->77|104->77|105->78|107->80|107->80|108->81|108->81|108->81|108->81|109->82|109->82|114->87|114->87|114->87|114->87|114->87|115->88|115->88|115->88|115->88|115->88|116->89|117->90|117->90|118->91|122->95|122->95|123->96|123->96|123->96|124->97|125->98|125->98|125->98|125->98|125->98|126->99|127->100|127->100|128->101|128->101|129->102|129->102|130->103|130->103|130->103|131->104|131->104|134->107|134->107|135->108|135->108|135->108|136->109|137->110|137->110|138->111|138->111|142->115|142->115|142->115|143->116|143->116|143->116|145->118|145->118|145->118|146->119|146->119|146->119
                  -- GENERATED --
              */
          