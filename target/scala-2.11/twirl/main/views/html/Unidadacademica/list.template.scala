
package views.html.Unidadacademica

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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[com.avaje.ebean.Page[Unidadacademica],String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Unidadacademica], currentSortBy: String, currentOrder: String, currentFilter: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.122*/("""

"""),_display_(/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""
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
					  <li class="active">Unidades académicas</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Unidades académicas <a href=""""),_display_(/*22.49*/routes/*22.55*/.UnidadacademicaController.create()),format.raw/*22.90*/("""" title="Agregar Unidad académica"><i class="fa fa-plus-circle text-success fa-lg" aria-hidden="true"></i></a> </h3>
		        </div>
			</div>
		
		    """),_display_(/*26.8*/if(flash.containsKey("success"))/*26.40*/ {_display_(Seq[Any](format.raw/*26.42*/("""
		        """),format.raw/*27.11*/("""<div class="alert alert-success" role="alert">
		            <strong>¡Correcto!</strong> La Unidad académica """),_display_(/*28.64*/flash/*28.69*/.get("success")),format.raw/*28.84*/("""
		        """),format.raw/*29.11*/("""</div>
		    """)))}),format.raw/*30.8*/("""
		    """),_display_(/*31.8*/if(flash.containsKey("warning"))/*31.40*/ {_display_(Seq[Any](format.raw/*31.42*/("""
		        """),format.raw/*32.11*/("""<div class="alert alert-warning" role="alert">
		            <strong>¡Precaución!</strong> La Unidad académica """),_display_(/*33.66*/flash/*33.71*/.get("warning")),format.raw/*33.86*/("""
		        """),format.raw/*34.11*/("""</div>
		    """)))}),format.raw/*35.8*/("""    """),_display_(/*35.13*/if(flash.containsKey("error"))/*35.43*/ {_display_(Seq[Any](format.raw/*35.45*/("""
		        """),format.raw/*36.11*/("""<div class="alert alert-danger" role="alert">
		            <strong>¡Error!</strong> La Unidad académica """),_display_(/*37.61*/flash/*37.66*/.get("error")),format.raw/*37.79*/("""
		        """),format.raw/*38.11*/("""</div>
		    """)))}),format.raw/*39.8*/("""    
		    
		    
		    """),_display_(/*42.8*/if(currentPage.getTotalRowCount == 0)/*42.45*/ {_display_(Seq[Any](format.raw/*42.47*/("""
		        """),format.raw/*43.11*/("""<div class="well">
		            <em>No hay unidades académicas.</em>
		        </div>
		    """)))}/*46.9*/else/*46.14*/{_display_(Seq[Any](format.raw/*46.15*/("""
                """),format.raw/*47.17*/("""<table class="table table-bordered table-striped datatable" id="tablaCatalogoUA" style="width: 100%">               
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Nivel educativo</th>
                            <th>Área del conocimiento</th>
                            <th></th>
                        </tr>
                    </thead>
                </table> 		        
		    """)))}),format.raw/*57.8*/("""
    """),format.raw/*58.5*/("""</div>
""")))}),format.raw/*59.2*/("""


"""),format.raw/*62.1*/("""<script type="text/javascript">
	$(function()"""),format.raw/*63.14*/("""{"""),format.raw/*63.15*/("""
        """),format.raw/*64.9*/("""laTablaDTSS = $('#tablaCatalogoUA').DataTable( """),format.raw/*64.56*/("""{"""),format.raw/*64.57*/("""
            """),format.raw/*65.13*/("""pageLength: 10,
            lengthMenu: [  [1,3, 5, 10, 25, 50, -1], [1,3, 5, 10, 25, 50, "Todos"]   ],    
            language: """),format.raw/*67.23*/("""{"""),format.raw/*67.24*/("""
                """),format.raw/*68.17*/("""url: """"),_display_(/*68.24*/routes/*68.30*/.Assets.at("Spanish.json")),format.raw/*68.56*/("""" 
            """),format.raw/*69.13*/("""}"""),format.raw/*69.14*/(""",
            processing: false,
            serverSide: true,
            scrollCollapse: false,
            stateSave: true,
            scrollX: false,
            mark: true,
            fixedColumns: true,
            ajax: """),format.raw/*77.19*/("""{"""),format.raw/*77.20*/("""
                """),format.raw/*78.17*/("""url:  "/ajaxListaDTSS",
                contentType: "application/json; charset=utf-8",
                dataType: "json"
            """),format.raw/*81.13*/("""}"""),format.raw/*81.14*/(""",
            "columns": [
                """),format.raw/*83.17*/("""{"""),format.raw/*83.18*/(""""data": "nombre",
                    render: function ( data, type, row, meta ) """),format.raw/*84.64*/("""{"""),format.raw/*84.65*/("""
                            """),format.raw/*85.29*/("""data = '<a href="/unidadacademica/'+row.id+'">' + data +  '</a>';
                        return data;
                    """),format.raw/*87.21*/("""}"""),format.raw/*87.22*/("""                	
                """),format.raw/*88.17*/("""}"""),format.raw/*88.18*/(""",
                """),format.raw/*89.17*/("""{"""),format.raw/*89.18*/(""""data": "niveles", sortable: false"""),format.raw/*89.52*/("""}"""),format.raw/*89.53*/(""",
                """),format.raw/*90.17*/("""{"""),format.raw/*90.18*/(""""data": "areas", sortable: false"""),format.raw/*90.50*/("""}"""),format.raw/*90.51*/(""",
                """),format.raw/*91.17*/("""{"""),format.raw/*91.18*/(""""data": "null", "defaultContent": "<button class='btn btn-danger btn-block btn-xs'>Eliminar</button>", sortable: false"""),format.raw/*91.136*/("""}"""),format.raw/*91.137*/("""
              """),format.raw/*92.15*/("""],
            "initComplete": function()"""),format.raw/*93.39*/("""{"""),format.raw/*93.40*/("""
                """),format.raw/*94.17*/("""$("#tablaCatalogoUA_wrapper div.row div").removeClass("col-sm-6");
                $("#tablaCatalogoUA_wrapper div.row div:eq(0)").addClass("col-sm-4");
                $("#tablaCatalogoUA_wrapper div.row div:eq(2)").addClass("col-sm-8");
                $(".dataTables_filter").css("width","auto");  
                $("input[type='search'].form-control.input-sm").keyup(function()"""),format.raw/*98.81*/("""{"""),format.raw/*98.82*/("""
                    """),format.raw/*99.21*/("""if( $(this).val().length >0 )"""),format.raw/*99.50*/("""{"""),format.raw/*99.51*/("""
                        """),format.raw/*100.25*/("""$(this).addClass("filtrado");
                    """),format.raw/*101.21*/("""}"""),format.raw/*101.22*/(""" """),format.raw/*101.23*/("""else """),format.raw/*101.28*/("""{"""),format.raw/*101.29*/("""
                        """),format.raw/*102.25*/("""$(this).removeClass("filtrado");
                    """),format.raw/*103.21*/("""}"""),format.raw/*103.22*/("""
                """),format.raw/*104.17*/("""}"""),format.raw/*104.18*/(""");   
            """),format.raw/*105.13*/("""}"""),format.raw/*105.14*/("""
        """),format.raw/*106.9*/("""}"""),format.raw/*106.10*/(""" """),format.raw/*106.11*/(""");		
	"""),format.raw/*107.2*/("""}"""),format.raw/*107.3*/(""");

</script>


<script src=""""),_display_(/*112.15*/routes/*112.21*/.Assets.at("lib/datatables/js/jquery.dataTables.min.js")),format.raw/*112.77*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*113.15*/routes/*113.21*/.Assets.at("lib/datatables/js/dataTables.bootstrap.min.js")),format.raw/*113.80*/("""" type="text/javascript"></script>

<script src=""""),_display_(/*115.15*/routes/*115.21*/.Assets.at("mark.js/datatables.mark.min.js")),format.raw/*115.65*/(""""></script>
<script src=""""),_display_(/*116.15*/routes/*116.21*/.Assets.at("mark.js/jquery.mark.min.js")),format.raw/*116.61*/(""""></script>

            
"""))}
  }

  def render(currentPage:com.avaje.ebean.Page[Unidadacademica],currentSortBy:String,currentOrder:String,currentFilter:String): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)

  def f:((com.avaje.ebean.Page[Unidadacademica],String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Unidadacademica/list.scala.html
                  HASH: 9a475d2b28c483e9386a577aaa234b1b27d9b4a8
                  MATRIX: 790->1|999->121|1027->124|1038->128|1076->130|1103->131|1155->156|1183->157|1214->162|1279->201|1306->202|1333->203|1419->262|1434->268|1517->329|1912->697|1927->703|1983->738|2163->892|2204->924|2244->926|2283->937|2420->1047|2434->1052|2470->1067|2509->1078|2553->1092|2587->1100|2628->1132|2668->1134|2707->1145|2846->1257|2860->1262|2896->1277|2935->1288|2979->1302|3011->1307|3050->1337|3090->1339|3129->1350|3262->1456|3276->1461|3310->1474|3349->1485|3393->1499|3445->1525|3491->1562|3531->1564|3570->1575|3682->1670|3695->1675|3734->1676|3779->1693|4279->2163|4311->2168|4349->2176|4379->2179|4452->2224|4481->2225|4517->2234|4592->2281|4621->2282|4662->2295|4820->2425|4849->2426|4894->2443|4928->2450|4943->2456|4990->2482|5033->2497|5062->2498|5319->2727|5348->2728|5393->2745|5554->2878|5583->2879|5654->2922|5683->2923|5792->3004|5821->3005|5878->3034|6029->3157|6058->3158|6120->3192|6149->3193|6195->3211|6224->3212|6286->3246|6315->3247|6361->3265|6390->3266|6450->3298|6479->3299|6525->3317|6554->3318|6701->3436|6731->3437|6774->3452|6843->3493|6872->3494|6917->3511|7327->3893|7356->3894|7405->3915|7462->3944|7491->3945|7545->3970|7624->4020|7654->4021|7684->4022|7718->4027|7748->4028|7802->4053|7884->4106|7914->4107|7960->4124|7990->4125|8037->4143|8067->4144|8104->4153|8134->4154|8164->4155|8198->4161|8227->4162|8285->4192|8301->4198|8379->4254|8456->4303|8472->4309|8553->4368|8631->4418|8647->4424|8713->4468|8767->4494|8783->4500|8845->4540
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|33->5|33->5|34->6|35->7|35->7|36->8|38->10|38->10|38->10|50->22|50->22|50->22|54->26|54->26|54->26|55->27|56->28|56->28|56->28|57->29|58->30|59->31|59->31|59->31|60->32|61->33|61->33|61->33|62->34|63->35|63->35|63->35|63->35|64->36|65->37|65->37|65->37|66->38|67->39|70->42|70->42|70->42|71->43|74->46|74->46|74->46|75->47|85->57|86->58|87->59|90->62|91->63|91->63|92->64|92->64|92->64|93->65|95->67|95->67|96->68|96->68|96->68|96->68|97->69|97->69|105->77|105->77|106->78|109->81|109->81|111->83|111->83|112->84|112->84|113->85|115->87|115->87|116->88|116->88|117->89|117->89|117->89|117->89|118->90|118->90|118->90|118->90|119->91|119->91|119->91|119->91|120->92|121->93|121->93|122->94|126->98|126->98|127->99|127->99|127->99|128->100|129->101|129->101|129->101|129->101|129->101|130->102|131->103|131->103|132->104|132->104|133->105|133->105|134->106|134->106|134->106|135->107|135->107|140->112|140->112|140->112|141->113|141->113|141->113|143->115|143->115|143->115|144->116|144->116|144->116
                  -- GENERATED --
              */
          