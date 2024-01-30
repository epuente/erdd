
package views.html.Autorfuncion

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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Autorfuncion],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(af: List[Autorfuncion]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.26*/("""
"""),_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
"""),format.raw/*4.1*/("""<style>
.filtrado, mark  """),format.raw/*5.18*/("""{"""),format.raw/*5.19*/("""
    """),format.raw/*6.5*/("""background-color:#ffffcc !important;  
"""),format.raw/*7.1*/("""}"""),format.raw/*7.2*/("""
"""),format.raw/*8.1*/("""</style>

    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.at("lib/datatables/css/dataTables.bootstrap.min.css")),format.raw/*10.117*/(""""/>

	<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li class="active">Tipos de autorias</li>
					</ol>			
				</div>
			</div>
            <div class="row">
                <div class="col-md-12"><h3>Tipos de autorías <a href=""""),_display_(/*22.72*/routes/*22.78*/.AutorfuncionController.create()),format.raw/*22.110*/("""" title="Agregar Área del Conocimiento"><i class="fa fa-plus-circle text-success fa-lg" aria-hidden="true"></i></a></h3></td>

                    </div>
                </div>			
	
		    """),_display_(/*27.8*/if(flash.containsKey("success"))/*27.40*/ {_display_(Seq[Any](format.raw/*27.42*/("""
		        """),format.raw/*28.11*/("""<div class="alert alert-success" role="alert">
		            <strong>¡Correcto!</strong> El tipo de autoría """),_display_(/*29.63*/flash/*29.68*/.get("success")),format.raw/*29.83*/("""
		        """),format.raw/*30.11*/("""</div>
		    """)))}),format.raw/*31.8*/("""
		    """),_display_(/*32.8*/if(flash.containsKey("warning"))/*32.40*/ {_display_(Seq[Any](format.raw/*32.42*/("""
		        """),format.raw/*33.11*/("""<div class="alert alert-warning" role="alert">
		            <strong>¡Precaución!</strong> El tipo de autoría """),_display_(/*34.65*/flash/*34.70*/.get("warning")),format.raw/*34.85*/("""
		        """),format.raw/*35.11*/("""</div>
		    """)))}),format.raw/*36.8*/("""    """),_display_(/*36.13*/if(flash.containsKey("error"))/*36.43*/ {_display_(Seq[Any](format.raw/*36.45*/("""
		        """),format.raw/*37.11*/("""<div class="alert alert-danger" role="alert">
		            <strong>¡Error!</strong> El tipo de autoría """),_display_(/*38.60*/flash/*38.65*/.get("error")),format.raw/*38.78*/("""
		        """),format.raw/*39.11*/("""</div>
		    """)))}),format.raw/*40.8*/(""" 
		
			"""),_display_(/*42.5*/if(af.isEmpty)/*42.19*/{_display_(Seq[Any](format.raw/*42.20*/("""
				"""),format.raw/*43.5*/("""<h1>No hay tipos de autorías registradas</h1>
			""")))}/*44.6*/else/*44.11*/{_display_(Seq[Any](format.raw/*44.12*/("""

				
				"""),format.raw/*47.5*/("""<table class="table table-striped table-bordered table-hover " id="tablaCatalogoAutorias">
					<thead>
						<tr>
							<th>Descripcion</th>
							<th></th>
						</tr>
					</thead>
				
					<tbody>
						"""),_display_(/*56.8*/for(e <- af) yield /*56.20*/ {_display_(Seq[Any](format.raw/*56.22*/("""
							"""),format.raw/*57.8*/("""<tr>
								<td><a href=""""),_display_(/*58.23*/routes/*58.29*/.AutorfuncionController.edit(e.id)),format.raw/*58.63*/("""">   """),_display_(/*58.69*/e/*58.70*/.descripcion),format.raw/*58.82*/("""  """),format.raw/*58.84*/("""</a> </td>
								<td style="text-align: center;">
		
									"""),_display_(/*61.11*/form(CSRF(routes.AutorfuncionController.delete(e.id)), 'class -> "topRight")/*61.87*/ {_display_(Seq[Any](format.raw/*61.89*/("""						
										"""),format.raw/*62.11*/("""<button type="button" class="btn btn-primary btn-danger btn-sm" name="btn"""),_display_(/*62.85*/e/*62.86*/.id.toString),format.raw/*62.98*/("""">Eliminar</button>
										""")))}),format.raw/*63.12*/("""
									"""),format.raw/*64.10*/("""</form>
								</td>
							</tr>
						""")))}),format.raw/*67.8*/("""
					"""),format.raw/*68.6*/("""</tbody>
				</table>
			""")))}),format.raw/*70.5*/("""
	"""),format.raw/*71.2*/("""</div>
""")))}),format.raw/*72.2*/("""

"""),format.raw/*74.1*/("""<script type="text/javascript">
	$(function()"""),format.raw/*75.14*/("""{"""),format.raw/*75.15*/("""
	    """),format.raw/*76.6*/("""laTablaDTSS = $('#tablaCatalogoAutorias').DataTable( """),format.raw/*76.59*/("""{"""),format.raw/*76.60*/("""
	        """),format.raw/*77.10*/("""pageLength: 10,
	        lengthMenu: [  [1,3, 5, 10, 25, 50, -1], [1,3, 5, 10, 25, 50, "Todos"]   ],    
	        language: """),format.raw/*79.20*/("""{"""),format.raw/*79.21*/("""
	            """),format.raw/*80.14*/("""url: """"),_display_(/*80.21*/routes/*80.27*/.Assets.at("Spanish.json")),format.raw/*80.53*/("""" 
	        """),format.raw/*81.10*/("""}"""),format.raw/*81.11*/(""",
	        mark: true,
	        stateSave: true,
	        fixedColumns: true,
	        columnDefs: [
	            """),format.raw/*86.14*/("""{"""),format.raw/*86.15*/(""" """),format.raw/*86.16*/("""sortable: false, targets: [ 1 ] """),format.raw/*86.48*/("""}"""),format.raw/*86.49*/(""",
	            """),format.raw/*87.14*/("""{"""),format.raw/*87.15*/(""" """),format.raw/*87.16*/("""width: "20%", targets: 1 """),format.raw/*87.41*/("""}"""),format.raw/*87.42*/("""
	          """),format.raw/*88.12*/("""],
	        "initComplete": function()"""),format.raw/*89.36*/("""{"""),format.raw/*89.37*/("""
	            """),format.raw/*90.14*/("""$("#tablaCatalogoAutorias_wrapper div.row div").removeClass("col-sm-6");
	            $("#tablaCatalogoAutorias_wrapper div.row div:eq(0)").addClass("col-sm-4");
	            $("#tablaCatalogoAutorias_wrapper div.row div:eq(2)").addClass("col-sm-8");
	            $(".dataTables_filter").css("width","auto");  
	            $("input[type='search'].form-control.input-sm").keyup(function()"""),format.raw/*94.78*/("""{"""),format.raw/*94.79*/("""
	                """),format.raw/*95.18*/("""if( $(this).val().length >0 )"""),format.raw/*95.47*/("""{"""),format.raw/*95.48*/("""
	                    """),format.raw/*96.22*/("""$(this).addClass("filtrado");
	                """),format.raw/*97.18*/("""}"""),format.raw/*97.19*/(""" """),format.raw/*97.20*/("""else """),format.raw/*97.25*/("""{"""),format.raw/*97.26*/("""
	                    """),format.raw/*98.22*/("""$(this).removeClass("filtrado");
	                """),format.raw/*99.18*/("""}"""),format.raw/*99.19*/("""
	            """),format.raw/*100.14*/("""}"""),format.raw/*100.15*/(""");   
	        """),format.raw/*101.10*/("""}"""),format.raw/*101.11*/("""
	    """),format.raw/*102.6*/("""}"""),format.raw/*102.7*/(""" """),format.raw/*102.8*/(""");        
	"""),format.raw/*103.2*/("""}"""),format.raw/*103.3*/(""");

	$( document ).on( "click", "[name*='btn']", function() """),format.raw/*105.57*/("""{"""),format.raw/*105.58*/("""
		 """),format.raw/*106.4*/("""var num = $(this).attr('name').substring(3); 
		 if (confirm("¿Desea eliminar el tipo de autoría?"))"""),format.raw/*107.55*/("""{"""),format.raw/*107.56*/("""
			 
			 """),format.raw/*109.5*/("""$(this).parent().submit();
		 """),format.raw/*110.4*/("""}"""),format.raw/*110.5*/("""		 
	"""),format.raw/*111.2*/("""}"""),format.raw/*111.3*/(""");
</script>
<script src=""""),_display_(/*113.15*/routes/*113.21*/.Assets.at("lib/datatables/js/jquery.dataTables.min.js")),format.raw/*113.77*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*114.15*/routes/*114.21*/.Assets.at("lib/datatables/js/dataTables.bootstrap.min.js")),format.raw/*114.80*/("""" type="text/javascript"></script>

<script src=""""),_display_(/*116.15*/routes/*116.21*/.Assets.at("mark.js/datatables.mark.min.js")),format.raw/*116.65*/(""""></script>
<script src=""""),_display_(/*117.15*/routes/*117.21*/.Assets.at("mark.js/jquery.mark.min.js")),format.raw/*117.61*/(""""></script>

"""))}
  }

  def render(af:List[Autorfuncion]): play.twirl.api.HtmlFormat.Appendable = apply(af)

  def f:((List[Autorfuncion]) => play.twirl.api.HtmlFormat.Appendable) = (af) => apply(af)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:37 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Autorfuncion/list.scala.html
                  HASH: b4ba4781d2b231d1a178f0a5949b373cae7619c5
                  MATRIX: 747->1|874->25|901->44|912->48|949->49|976->50|1028->75|1056->76|1087->81|1152->120|1179->121|1206->122|1292->181|1307->187|1390->248|1788->619|1803->625|1857->657|2072->846|2113->878|2153->880|2192->891|2328->1000|2342->1005|2378->1020|2417->1031|2461->1045|2495->1053|2536->1085|2576->1087|2615->1098|2753->1209|2767->1214|2803->1229|2842->1240|2886->1254|2918->1259|2957->1289|2997->1291|3036->1302|3168->1407|3182->1412|3216->1425|3255->1436|3299->1450|3334->1459|3357->1473|3396->1474|3428->1479|3496->1530|3509->1535|3548->1536|3586->1547|3823->1758|3851->1770|3891->1772|3926->1780|3980->1807|3995->1813|4050->1847|4083->1853|4093->1854|4126->1866|4156->1868|4248->1933|4333->2009|4373->2011|4418->2028|4519->2102|4529->2103|4562->2115|4624->2146|4662->2156|4734->2198|4767->2204|4823->2230|4852->2232|4890->2240|4919->2242|4992->2287|5021->2288|5054->2294|5135->2347|5164->2348|5202->2358|5354->2482|5383->2483|5425->2497|5459->2504|5474->2510|5521->2536|5561->2548|5590->2549|5732->2663|5761->2664|5790->2665|5850->2697|5879->2698|5922->2713|5951->2714|5980->2715|6033->2740|6062->2741|6102->2753|6168->2791|6197->2792|6239->2806|6655->3194|6684->3195|6730->3213|6787->3242|6816->3243|6866->3265|6941->3312|6970->3313|6999->3314|7032->3319|7061->3320|7111->3342|7189->3392|7218->3393|7261->3407|7291->3408|7335->3423|7365->3424|7399->3430|7428->3431|7457->3432|7497->3444|7526->3445|7615->3505|7645->3506|7677->3510|7806->3610|7836->3611|7874->3621|7932->3651|7961->3652|7994->3657|8023->3658|8078->3685|8094->3691|8172->3747|8249->3796|8265->3802|8346->3861|8424->3911|8440->3917|8506->3961|8560->3987|8576->3993|8638->4033
                  LINES: 26->1|29->1|30->3|30->3|30->3|31->4|32->5|32->5|33->6|34->7|34->7|35->8|37->10|37->10|37->10|49->22|49->22|49->22|54->27|54->27|54->27|55->28|56->29|56->29|56->29|57->30|58->31|59->32|59->32|59->32|60->33|61->34|61->34|61->34|62->35|63->36|63->36|63->36|63->36|64->37|65->38|65->38|65->38|66->39|67->40|69->42|69->42|69->42|70->43|71->44|71->44|71->44|74->47|83->56|83->56|83->56|84->57|85->58|85->58|85->58|85->58|85->58|85->58|85->58|88->61|88->61|88->61|89->62|89->62|89->62|89->62|90->63|91->64|94->67|95->68|97->70|98->71|99->72|101->74|102->75|102->75|103->76|103->76|103->76|104->77|106->79|106->79|107->80|107->80|107->80|107->80|108->81|108->81|113->86|113->86|113->86|113->86|113->86|114->87|114->87|114->87|114->87|114->87|115->88|116->89|116->89|117->90|121->94|121->94|122->95|122->95|122->95|123->96|124->97|124->97|124->97|124->97|124->97|125->98|126->99|126->99|127->100|127->100|128->101|128->101|129->102|129->102|129->102|130->103|130->103|132->105|132->105|133->106|134->107|134->107|136->109|137->110|137->110|138->111|138->111|140->113|140->113|140->113|141->114|141->114|141->114|143->116|143->116|143->116|144->117|144->117|144->117
                  -- GENERATED --
              */
          