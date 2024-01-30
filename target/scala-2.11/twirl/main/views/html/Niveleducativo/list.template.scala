
package views.html.Niveleducativo

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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Niveleducativo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(niveles : List[Niveleducativo]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
"""),format.raw/*4.1*/("""<style>
.filtrado, mark  """),format.raw/*5.18*/("""{"""),format.raw/*5.19*/("""
    """),format.raw/*6.5*/("""background-color:#ffffcc !important;  
"""),format.raw/*7.1*/("""}"""),format.raw/*7.2*/("""
"""),format.raw/*8.1*/("""</style>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.at("lib/datatables/css/dataTables.bootstrap.min.css")),format.raw/*9.117*/(""""/>
	<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li class="active">Niveles educativos</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
	  	          <h3>Niveles educativos  <a href=""""),_display_(/*21.49*/routes/*21.55*/.NiveleducativoController.create()),format.raw/*21.89*/("""" title="Agregar Nivel Educativo"><i class="fa fa-plus-circle text-success fa-lg" aria-hidden="true"></i></a></h3>
		        </div>
			</div>
		
		    """),_display_(/*25.8*/if(flash.containsKey("success"))/*25.40*/ {_display_(Seq[Any](format.raw/*25.42*/("""
		        """),format.raw/*26.11*/("""<div class="alert alert-success" role="alert">
		            <strong>¡Correcto!</strong> El nivel educativo """),_display_(/*27.63*/flash/*27.68*/.get("success")),format.raw/*27.83*/("""
		        """),format.raw/*28.11*/("""</div>
		    """)))}),format.raw/*29.8*/("""
		    """),_display_(/*30.8*/if(flash.containsKey("warning"))/*30.40*/ {_display_(Seq[Any](format.raw/*30.42*/("""
		        """),format.raw/*31.11*/("""<div class="alert alert-warning" role="alert">
		            <strong>¡Precaución!</strong> El nivel educativo """),_display_(/*32.65*/flash/*32.70*/.get("warning")),format.raw/*32.85*/("""
		        """),format.raw/*33.11*/("""</div>
		    """)))}),format.raw/*34.8*/("""    """),_display_(/*34.13*/if(flash.containsKey("error"))/*34.43*/ {_display_(Seq[Any](format.raw/*34.45*/("""
		        """),format.raw/*35.11*/("""<div class="alert alert-danger" role="alert">
		            <strong>¡Error!</strong> El nivel educativo """),_display_(/*36.60*/flash/*36.65*/.get("error")),format.raw/*36.78*/("""
		        """),format.raw/*37.11*/("""</div>
		    """)))}),format.raw/*38.8*/(""" 
		
            """),_display_(/*40.14*/if(niveles.size == 0)/*40.35*/ {_display_(Seq[Any](format.raw/*40.37*/("""              
                """),format.raw/*41.17*/("""<div class="well">
                    <em>No hay niveles educativos registrados.</em>
                </div>
                
            """)))}/*45.15*/else/*45.20*/{_display_(Seq[Any](format.raw/*45.21*/("""
		    

                """),format.raw/*48.17*/("""<table class="table table-bordered table-striped datatable" id="tablaCatalogoNiveles" style="width: 100%">               
                    <thead>
                        <tr>
                            <th>Nivel educativo</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        """),_display_(/*56.26*/for(n<-niveles) yield /*56.41*/{_display_(Seq[Any](format.raw/*56.42*/("""
                            """),format.raw/*57.29*/("""<tr>
                                <td><a href="/nivel/"""),_display_(/*58.54*/n/*58.55*/.id),format.raw/*58.58*/("""">"""),_display_(/*58.61*/n/*58.62*/.descripcion),format.raw/*58.74*/("""</a></td>
                                <td style="text-align: center;">
                                    """),_display_(/*60.38*/form(CSRF(routes.NiveleducativoController.delete(n.id)))/*60.94*/ {_display_(Seq[Any](format.raw/*60.96*/("""
                                      """),format.raw/*61.39*/("""<input type="submit" value="Eliminar" name="btn"""),_display_(/*61.87*/n/*61.88*/.id),format.raw/*61.91*/("""" class="btn btn-danger btn-sm">
                                    """)))}),format.raw/*62.38*/("""                       
                                """),format.raw/*63.33*/("""</td>
                            </tr>
                        """)))}),format.raw/*65.26*/("""
                    """),format.raw/*66.21*/("""</tbody>
                </table> 		        
		        """)))}),format.raw/*68.12*/("""
     
    """),format.raw/*70.5*/("""</div>   
""")))}),format.raw/*71.2*/("""


"""),format.raw/*74.1*/("""<script type="text/javascript">
    $(function()"""),format.raw/*75.17*/("""{"""),format.raw/*75.18*/("""
        """),format.raw/*76.9*/("""laTablaDTSS = $('#tablaCatalogoNiveles').DataTable( """),format.raw/*76.61*/("""{"""),format.raw/*76.62*/("""
            """),format.raw/*77.13*/("""pageLength: 10,
            lengthMenu: [  [1,3, 5, 10, 25, 50, -1], [1,3, 5, 10, 25, 50, "Todos"]   ],    
            language: """),format.raw/*79.23*/("""{"""),format.raw/*79.24*/("""
                """),format.raw/*80.17*/("""url: """"),_display_(/*80.24*/routes/*80.30*/.Assets.at("Spanish.json")),format.raw/*80.56*/("""" 
            """),format.raw/*81.13*/("""}"""),format.raw/*81.14*/(""",
            mark: true,
            stateSave: true,
            fixedColumns: true,
            columnDefs: [
                """),format.raw/*86.17*/("""{"""),format.raw/*86.18*/(""" """),format.raw/*86.19*/("""sortable: false, targets: [ 1 ] """),format.raw/*86.51*/("""}"""),format.raw/*86.52*/(""",
                """),format.raw/*87.17*/("""{"""),format.raw/*87.18*/(""" """),format.raw/*87.19*/("""width: "20%", targets: 1 """),format.raw/*87.44*/("""}"""),format.raw/*87.45*/("""
              """),format.raw/*88.15*/("""],
            "initComplete": function()"""),format.raw/*89.39*/("""{"""),format.raw/*89.40*/("""
                """),format.raw/*90.17*/("""$("#tablaCatalogoUA_wrapper div.row div").removeClass("col-sm-6");
                $("#tablaCatalogoUA_wrapper div.row div:eq(0)").addClass("col-sm-4");
                $("#tablaCatalogoUA_wrapper div.row div:eq(2)").addClass("col-sm-8");
                $(".dataTables_filter").css("width","auto");  
                $("input[type='search'].form-control.input-sm").keyup(function()"""),format.raw/*94.81*/("""{"""),format.raw/*94.82*/("""
                    """),format.raw/*95.21*/("""if( $(this).val().length >0 )"""),format.raw/*95.50*/("""{"""),format.raw/*95.51*/("""
                        """),format.raw/*96.25*/("""$(this).addClass("filtrado");
                    """),format.raw/*97.21*/("""}"""),format.raw/*97.22*/(""" """),format.raw/*97.23*/("""else """),format.raw/*97.28*/("""{"""),format.raw/*97.29*/("""
                        """),format.raw/*98.25*/("""$(this).removeClass("filtrado");
                    """),format.raw/*99.21*/("""}"""),format.raw/*99.22*/("""
                """),format.raw/*100.17*/("""}"""),format.raw/*100.18*/(""");   
            """),format.raw/*101.13*/("""}"""),format.raw/*101.14*/("""
        """),format.raw/*102.9*/("""}"""),format.raw/*102.10*/(""" """),format.raw/*102.11*/(""");        
    """),format.raw/*103.5*/("""}"""),format.raw/*103.6*/(""");

    
    $( document ).on( "click", "[name*='btn']", function() """),format.raw/*106.60*/("""{"""),format.raw/*106.61*/("""
        """),format.raw/*107.9*/("""var num = $(this).attr('name').substring(3); 
        if (confirm("¿Desea eliminar el nivel educativo?"))"""),format.raw/*108.60*/("""{"""),format.raw/*108.61*/("""
            
            """),format.raw/*110.13*/("""$(this).parent().submit();
        """),format.raw/*111.9*/("""}"""),format.raw/*111.10*/("""       
   """),format.raw/*112.4*/("""}"""),format.raw/*112.5*/(""");    
</script>
            
<script src=""""),_display_(/*115.15*/routes/*115.21*/.Assets.at("lib/datatables/js/jquery.dataTables.min.js")),format.raw/*115.77*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*116.15*/routes/*116.21*/.Assets.at("lib/datatables/js/dataTables.bootstrap.min.js")),format.raw/*116.80*/("""" type="text/javascript"></script>

<script src=""""),_display_(/*118.15*/routes/*118.21*/.Assets.at("mark.js/datatables.mark.min.js")),format.raw/*118.65*/(""""></script>
<script src=""""),_display_(/*119.15*/routes/*119.21*/.Assets.at("mark.js/jquery.mark.min.js")),format.raw/*119.61*/(""""></script>

"""))}
  }

  def render(niveles:List[Niveleducativo]): play.twirl.api.HtmlFormat.Appendable = apply(niveles)

  def f:((List[Niveleducativo]) => play.twirl.api.HtmlFormat.Appendable) = (niveles) => apply(niveles)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:37 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Niveleducativo/list.scala.html
                  HASH: 099289b33a2c51cddd31771e7a9fad9248d6903b
                  MATRIX: 751->1|886->33|913->52|924->56|962->58|989->59|1041->84|1069->85|1100->90|1165->129|1192->130|1219->131|1303->189|1317->195|1399->256|1793->623|1808->629|1863->663|2041->815|2082->847|2122->849|2161->860|2297->969|2311->974|2347->989|2386->1000|2430->1014|2464->1022|2505->1054|2545->1056|2584->1067|2722->1178|2736->1183|2772->1198|2811->1209|2855->1223|2887->1228|2926->1258|2966->1260|3005->1271|3137->1376|3151->1381|3185->1394|3224->1405|3268->1419|3313->1437|3343->1458|3383->1460|3442->1491|3601->1632|3614->1637|3653->1638|3706->1663|4115->2045|4146->2060|4185->2061|4242->2090|4327->2148|4337->2149|4361->2152|4391->2155|4401->2156|4434->2168|4573->2280|4638->2336|4678->2338|4745->2377|4820->2425|4830->2426|4854->2429|4955->2499|5039->2555|5135->2620|5184->2641|5271->2697|5309->2708|5350->2719|5380->2722|5456->2770|5485->2771|5521->2780|5601->2832|5630->2833|5671->2846|5829->2976|5858->2977|5903->2994|5937->3001|5952->3007|5999->3033|6042->3048|6071->3049|6228->3178|6257->3179|6286->3180|6346->3212|6375->3213|6421->3231|6450->3232|6479->3233|6532->3258|6561->3259|6604->3274|6673->3315|6702->3316|6747->3333|7157->3715|7186->3716|7235->3737|7292->3766|7321->3767|7374->3792|7452->3842|7481->3843|7510->3844|7543->3849|7572->3850|7625->3875|7706->3928|7735->3929|7781->3946|7811->3947|7858->3965|7888->3966|7925->3975|7955->3976|7985->3977|8028->3992|8057->3993|8154->4061|8184->4062|8221->4071|8355->4176|8385->4177|8440->4203|8503->4238|8533->4239|8572->4250|8601->4251|8673->4295|8689->4301|8767->4357|8844->4406|8860->4412|8941->4471|9019->4521|9035->4527|9101->4571|9155->4597|9171->4603|9233->4643
                  LINES: 26->1|29->1|30->3|30->3|30->3|31->4|32->5|32->5|33->6|34->7|34->7|35->8|36->9|36->9|36->9|48->21|48->21|48->21|52->25|52->25|52->25|53->26|54->27|54->27|54->27|55->28|56->29|57->30|57->30|57->30|58->31|59->32|59->32|59->32|60->33|61->34|61->34|61->34|61->34|62->35|63->36|63->36|63->36|64->37|65->38|67->40|67->40|67->40|68->41|72->45|72->45|72->45|75->48|83->56|83->56|83->56|84->57|85->58|85->58|85->58|85->58|85->58|85->58|87->60|87->60|87->60|88->61|88->61|88->61|88->61|89->62|90->63|92->65|93->66|95->68|97->70|98->71|101->74|102->75|102->75|103->76|103->76|103->76|104->77|106->79|106->79|107->80|107->80|107->80|107->80|108->81|108->81|113->86|113->86|113->86|113->86|113->86|114->87|114->87|114->87|114->87|114->87|115->88|116->89|116->89|117->90|121->94|121->94|122->95|122->95|122->95|123->96|124->97|124->97|124->97|124->97|124->97|125->98|126->99|126->99|127->100|127->100|128->101|128->101|129->102|129->102|129->102|130->103|130->103|133->106|133->106|134->107|135->108|135->108|137->110|138->111|138->111|139->112|139->112|142->115|142->115|142->115|143->116|143->116|143->116|145->118|145->118|145->118|146->119|146->119|146->119
                  -- GENERATED --
              */
          