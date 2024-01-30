
package views.html.Formatoentrega

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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Formatoentrega],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(fe: List[Formatoentrega]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.28*/("""

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
					  <li class="active">Formatos de entrega</li>
					</ol>			
				</div>
			</div>
            <div class="row">
                    <div class="col-md-12">
                        <h3>Formatos de entrega  <a href=""""),_display_(/*22.60*/routes/*22.66*/.FormatoentregaController.create()),format.raw/*22.100*/("""" title="Agregar Formato de Entrega"><i class="fa fa-plus-circle text-success fa-lg" aria-hidden="true"></i></a></h3>
                    </div>
            </div>
	
		    """),_display_(/*26.8*/if(flash.containsKey("success"))/*26.40*/ {_display_(Seq[Any](format.raw/*26.42*/("""
		        """),format.raw/*27.11*/("""<div class="alert alert-success" role="alert">
		            <strong>¡Correcto!</strong> El formato de entrega """),_display_(/*28.66*/flash/*28.71*/.get("success")),format.raw/*28.86*/("""
		        """),format.raw/*29.11*/("""</div>
		    """)))}),format.raw/*30.8*/("""
		    """),_display_(/*31.8*/if(flash.containsKey("warning"))/*31.40*/ {_display_(Seq[Any](format.raw/*31.42*/("""
		        """),format.raw/*32.11*/("""<div class="alert alert-warning" role="alert">
		            <strong>¡Precaución!</strong> El formato de entrega """),_display_(/*33.68*/flash/*33.73*/.get("warning")),format.raw/*33.88*/("""
		        """),format.raw/*34.11*/("""</div>
		    """)))}),format.raw/*35.8*/("""    """),_display_(/*35.13*/if(flash.containsKey("error"))/*35.43*/ {_display_(Seq[Any](format.raw/*35.45*/("""
		        """),format.raw/*36.11*/("""<div class="alert alert-danger" role="alert">
		            <strong>¡Error!</strong> El formato de entrega """),_display_(/*37.63*/flash/*37.68*/.get("error")),format.raw/*37.81*/("""
		        """),format.raw/*38.11*/("""</div>
		    """)))}),format.raw/*39.8*/(""" 

			"""),_display_(/*41.5*/if(fe.isEmpty)/*41.19*/{_display_(Seq[Any](format.raw/*41.20*/("""
				"""),format.raw/*42.5*/("""<h1>No hay formatos de entrega registrados</h1>
			""")))}/*43.6*/else/*43.11*/{_display_(Seq[Any](format.raw/*43.12*/("""

				
				"""),format.raw/*46.5*/("""<table class="table table-striped table-bordered table-hover" id="tablaCatalogoFormatos">
					<thead>
						<tr>
							<th>Descripcion</th>
							<th></th>
						</tr>
					</thead>
				
					<tbody>
						"""),_display_(/*55.8*/for(e <- fe) yield /*55.20*/ {_display_(Seq[Any](format.raw/*55.22*/("""
							"""),format.raw/*56.8*/("""<tr>
								<td><a href=""""),_display_(/*57.23*/routes/*57.29*/.FormatoentregaController.edit(e.id)),format.raw/*57.65*/("""">   """),_display_(/*57.71*/e/*57.72*/.descripcion),format.raw/*57.84*/("""  """),format.raw/*57.86*/("""</a> </td>
								<td style="text-align: center;">
									"""),_display_(/*59.11*/form(CSRF(routes.FormatoentregaController.delete(e.id)), 'class -> "topRight")/*59.89*/ {_display_(Seq[Any](format.raw/*59.91*/("""						
										"""),format.raw/*60.11*/("""<button type="button" class="btn btn-danger btn-sm" name="btn"""),_display_(/*60.73*/e/*60.74*/.id.toString),format.raw/*60.86*/("""">Eliminar</button>
										""")))}),format.raw/*61.12*/("""
								"""),format.raw/*62.9*/("""</td>
							</tr>
						""")))}),format.raw/*64.8*/("""
					"""),format.raw/*65.6*/("""</tbody>
				</table>
			""")))}),format.raw/*67.5*/("""
	"""),format.raw/*68.2*/("""</div>
""")))}),format.raw/*69.2*/("""

"""),format.raw/*71.1*/("""<script type="text/javascript">
	$(function()"""),format.raw/*72.14*/("""{"""),format.raw/*72.15*/("""
	    """),format.raw/*73.6*/("""laTablaDTSS = $('#tablaCatalogoFormatos').DataTable( """),format.raw/*73.59*/("""{"""),format.raw/*73.60*/("""
	        """),format.raw/*74.10*/("""pageLength: 10,
	        lengthMenu: [  [1,3, 5, 10, 25, 50, -1], [1,3, 5, 10, 25, 50, "Todos"]   ],    
	        language: """),format.raw/*76.20*/("""{"""),format.raw/*76.21*/("""
	            """),format.raw/*77.14*/("""url: """"),_display_(/*77.21*/routes/*77.27*/.Assets.at("Spanish.json")),format.raw/*77.53*/("""" 
	        """),format.raw/*78.10*/("""}"""),format.raw/*78.11*/(""",
	        mark: true,
	        stateSave: true,
	        fixedColumns: true,
	        columnDefs: [
	            """),format.raw/*83.14*/("""{"""),format.raw/*83.15*/(""" """),format.raw/*83.16*/("""sortable: false, targets: [ 1 ] """),format.raw/*83.48*/("""}"""),format.raw/*83.49*/(""",
	            """),format.raw/*84.14*/("""{"""),format.raw/*84.15*/(""" """),format.raw/*84.16*/("""width: "20%", targets: 1 """),format.raw/*84.41*/("""}"""),format.raw/*84.42*/("""
	          """),format.raw/*85.12*/("""],
	        "initComplete": function()"""),format.raw/*86.36*/("""{"""),format.raw/*86.37*/("""
	            """),format.raw/*87.14*/("""$("#tablaCatalogoFormatos_wrapper div.row div").removeClass("col-sm-6");
	            $("#tablaCatalogoFormatos_wrapper div.row div:eq(0)").addClass("col-sm-4");
	            $("#tablaCatalogoFormatos_wrapper div.row div:eq(2)").addClass("col-sm-8");
	            $(".dataTables_filter").css("width","auto");  
	            $("input[type='search'].form-control.input-sm").keyup(function()"""),format.raw/*91.78*/("""{"""),format.raw/*91.79*/("""
	                """),format.raw/*92.18*/("""if( $(this).val().length >0 )"""),format.raw/*92.47*/("""{"""),format.raw/*92.48*/("""
	                    """),format.raw/*93.22*/("""$(this).addClass("filtrado");
	                """),format.raw/*94.18*/("""}"""),format.raw/*94.19*/(""" """),format.raw/*94.20*/("""else """),format.raw/*94.25*/("""{"""),format.raw/*94.26*/("""
	                    """),format.raw/*95.22*/("""$(this).removeClass("filtrado");
	                """),format.raw/*96.18*/("""}"""),format.raw/*96.19*/("""
	            """),format.raw/*97.14*/("""}"""),format.raw/*97.15*/(""");   
	        """),format.raw/*98.10*/("""}"""),format.raw/*98.11*/("""
	    """),format.raw/*99.6*/("""}"""),format.raw/*99.7*/(""" """),format.raw/*99.8*/(""");        
	"""),format.raw/*100.2*/("""}"""),format.raw/*100.3*/(""");

	$( document ).on( "click", "[name*='btn']", function() """),format.raw/*102.57*/("""{"""),format.raw/*102.58*/("""
		 """),format.raw/*103.4*/("""var num = $(this).attr('name').substring(3); 
		 if (confirm("¿Desea eliminar el formato de entrega?"))"""),format.raw/*104.58*/("""{"""),format.raw/*104.59*/("""
			 """),format.raw/*105.5*/("""$(this).parent().submit();
		 """),format.raw/*106.4*/("""}"""),format.raw/*106.5*/("""		 
	"""),format.raw/*107.2*/("""}"""),format.raw/*107.3*/(""");
</script>

<script src=""""),_display_(/*110.15*/routes/*110.21*/.Assets.at("lib/datatables/js/jquery.dataTables.min.js")),format.raw/*110.77*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*111.15*/routes/*111.21*/.Assets.at("lib/datatables/js/dataTables.bootstrap.min.js")),format.raw/*111.80*/("""" type="text/javascript"></script>

<script src=""""),_display_(/*113.15*/routes/*113.21*/.Assets.at("mark.js/datatables.mark.min.js")),format.raw/*113.65*/(""""></script>
<script src=""""),_display_(/*114.15*/routes/*114.21*/.Assets.at("mark.js/jquery.mark.min.js")),format.raw/*114.61*/(""""></script>

"""))}
  }

  def render(fe:List[Formatoentrega]): play.twirl.api.HtmlFormat.Appendable = apply(fe)

  def f:((List[Formatoentrega]) => play.twirl.api.HtmlFormat.Appendable) = (fe) => apply(fe)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Formatoentrega/list.scala.html
                  HASH: 518efb299f64ca5fd7b2f5f5a89bd58383474e59
                  MATRIX: 751->1|880->27|908->47|919->51|956->52|983->53|1035->78|1063->79|1094->84|1159->123|1186->124|1213->125|1298->183|1313->189|1396->250|1827->654|1842->660|1898->694|2097->867|2138->899|2178->901|2217->912|2356->1024|2370->1029|2406->1044|2445->1055|2489->1069|2523->1077|2564->1109|2604->1111|2643->1122|2784->1236|2798->1241|2834->1256|2873->1267|2917->1281|2949->1286|2988->1316|3028->1318|3067->1329|3202->1437|3216->1442|3250->1455|3289->1466|3333->1480|3366->1487|3389->1501|3428->1502|3460->1507|3530->1560|3543->1565|3582->1566|3620->1577|3856->1787|3884->1799|3924->1801|3959->1809|4013->1836|4028->1842|4085->1878|4118->1884|4128->1885|4161->1897|4191->1899|4280->1961|4367->2039|4407->2041|4452->2058|4541->2120|4551->2121|4584->2133|4646->2164|4682->2173|4738->2199|4771->2205|4827->2231|4856->2233|4894->2241|4923->2243|4996->2288|5025->2289|5058->2295|5139->2348|5168->2349|5206->2359|5358->2483|5387->2484|5429->2498|5463->2505|5478->2511|5525->2537|5565->2549|5594->2550|5736->2664|5765->2665|5794->2666|5854->2698|5883->2699|5926->2714|5955->2715|5984->2716|6037->2741|6066->2742|6106->2754|6172->2792|6201->2793|6243->2807|6659->3195|6688->3196|6734->3214|6791->3243|6820->3244|6870->3266|6945->3313|6974->3314|7003->3315|7036->3320|7065->3321|7115->3343|7193->3393|7222->3394|7264->3408|7293->3409|7336->3424|7365->3425|7398->3431|7426->3432|7454->3433|7494->3445|7523->3446|7612->3506|7642->3507|7674->3511|7806->3614|7836->3615|7869->3620|7927->3650|7956->3651|7989->3656|8018->3657|8074->3685|8090->3691|8168->3747|8245->3796|8261->3802|8342->3861|8420->3911|8436->3917|8502->3961|8556->3987|8572->3993|8634->4033
                  LINES: 26->1|29->1|31->4|31->4|31->4|32->5|33->6|33->6|34->7|35->8|35->8|36->9|37->10|37->10|37->10|49->22|49->22|49->22|53->26|53->26|53->26|54->27|55->28|55->28|55->28|56->29|57->30|58->31|58->31|58->31|59->32|60->33|60->33|60->33|61->34|62->35|62->35|62->35|62->35|63->36|64->37|64->37|64->37|65->38|66->39|68->41|68->41|68->41|69->42|70->43|70->43|70->43|73->46|82->55|82->55|82->55|83->56|84->57|84->57|84->57|84->57|84->57|84->57|84->57|86->59|86->59|86->59|87->60|87->60|87->60|87->60|88->61|89->62|91->64|92->65|94->67|95->68|96->69|98->71|99->72|99->72|100->73|100->73|100->73|101->74|103->76|103->76|104->77|104->77|104->77|104->77|105->78|105->78|110->83|110->83|110->83|110->83|110->83|111->84|111->84|111->84|111->84|111->84|112->85|113->86|113->86|114->87|118->91|118->91|119->92|119->92|119->92|120->93|121->94|121->94|121->94|121->94|121->94|122->95|123->96|123->96|124->97|124->97|125->98|125->98|126->99|126->99|126->99|127->100|127->100|129->102|129->102|130->103|131->104|131->104|132->105|133->106|133->106|134->107|134->107|137->110|137->110|137->110|138->111|138->111|138->111|140->113|140->113|140->113|141->114|141->114|141->114
                  -- GENERATED --
              */
          