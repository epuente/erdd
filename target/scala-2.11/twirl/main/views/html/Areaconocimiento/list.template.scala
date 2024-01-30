
package views.html.Areaconocimiento

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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Areaconocimiento],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(areas:List[Areaconocimiento]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.32*/("""
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
					  <li class="active">Áreas del conociumiento</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
	  	          <h3>Áreas del conocimiento  <a href=""""),_display_(/*22.53*/routes/*22.59*/.AreaconocimientoController.create()),format.raw/*22.95*/("""" title="Agregar Área del Conocimiento"><i class="fa fa-plus-circle text-success fa-lg" aria-hidden="true"></i></a></h3>
		        </div>
			</div>    
    

		    """),_display_(/*27.8*/if(flash.containsKey("success"))/*27.40*/ {_display_(Seq[Any](format.raw/*27.42*/("""
		        """),format.raw/*28.11*/("""<div class="alert alert-success" role="alert">
		            <strong>¡Correcto!</strong> El área de conocimiento """),_display_(/*29.68*/flash/*29.73*/.get("success")),format.raw/*29.88*/("""
		        """),format.raw/*30.11*/("""</div>
		    """)))}),format.raw/*31.8*/("""
		    """),_display_(/*32.8*/if(flash.containsKey("warning"))/*32.40*/ {_display_(Seq[Any](format.raw/*32.42*/("""
		        """),format.raw/*33.11*/("""<div class="alert alert-warning" role="alert">
		            <strong>¡Precaución!</strong> El área de conocimiento """),_display_(/*34.70*/flash/*34.75*/.get("warning")),format.raw/*34.90*/("""
		        """),format.raw/*35.11*/("""</div>
		    """)))}),format.raw/*36.8*/("""    """),_display_(/*36.13*/if(flash.containsKey("error"))/*36.43*/ {_display_(Seq[Any](format.raw/*36.45*/("""
		        """),format.raw/*37.11*/("""<div class="alert alert-danger" role="alert">
		            <strong>¡Error!</strong> El área de conocimiento """),_display_(/*38.65*/flash/*38.70*/.get("error")),format.raw/*38.83*/("""
		        """),format.raw/*39.11*/("""</div>
		    """)))}),format.raw/*40.8*/(""" 
		
		    """),_display_(/*42.8*/if(areas.size == 0)/*42.27*/ {_display_(Seq[Any](format.raw/*42.29*/("""		        
		        """),format.raw/*43.11*/("""<div class="well">
		            <em>No hay áreas del conocimiento registradas.</em>
		        </div>
		        
		    """)))}/*47.9*/else/*47.14*/{_display_(Seq[Any](format.raw/*47.15*/("""
                """),format.raw/*48.17*/("""<table class="table table-bordered table-striped datatable" id="tablaCatalogoAreas" style="width: 100%">               
                    <thead>
                        <tr>
                            <th>Área del conocimiento</th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        """),_display_(/*56.26*/for(n<-areas) yield /*56.39*/{_display_(Seq[Any](format.raw/*56.40*/("""
                            """),format.raw/*57.29*/("""<tr>
                                <td><a href="/areaconocimientos/"""),_display_(/*58.66*/n/*58.67*/.id),format.raw/*58.70*/("""">"""),_display_(/*58.73*/n/*58.74*/.descripcion),format.raw/*58.86*/("""</a></td>
                                <td style="text-align: center;">
                                    """),_display_(/*60.38*/form(CSRF(routes.AreaconocimientoController.delete(n.id)))/*60.96*/ {_display_(Seq[Any](format.raw/*60.98*/("""
                                      """),format.raw/*61.39*/("""<input type="submit" value="Eliminar" name="btn"""),_display_(/*61.87*/n/*61.88*/.id),format.raw/*61.91*/(""""class="btn btn-danger btn-sm">
                                    """)))}),format.raw/*62.38*/("""                       
                                """),format.raw/*63.33*/("""</td>
                            </tr>
                        """)))}),format.raw/*65.26*/("""
                    """),format.raw/*66.21*/("""</tbody>
                </table>    
		    """)))}),format.raw/*68.8*/("""
    """),format.raw/*69.5*/("""</div>
        
""")))}),format.raw/*71.2*/("""
"""),format.raw/*72.1*/("""<script type="text/javascript">
    $(function()"""),format.raw/*73.17*/("""{"""),format.raw/*73.18*/("""
        """),format.raw/*74.9*/("""laTablaDTSS = $('#tablaCatalogoAreas').DataTable( """),format.raw/*74.59*/("""{"""),format.raw/*74.60*/("""
            """),format.raw/*75.13*/("""pageLength: 10,
            lengthMenu: [  [1,3, 5, 10, 25, 50, -1], [1,3, 5, 10, 25, 50, "Todos"]   ],    
            language: """),format.raw/*77.23*/("""{"""),format.raw/*77.24*/("""
                """),format.raw/*78.17*/("""url: """"),_display_(/*78.24*/routes/*78.30*/.Assets.at("Spanish.json")),format.raw/*78.56*/("""" 
            """),format.raw/*79.13*/("""}"""),format.raw/*79.14*/(""",
            mark: true,
            stateSave: true,
            fixedColumns: true,
            columnDefs: [
                """),format.raw/*84.17*/("""{"""),format.raw/*84.18*/(""" """),format.raw/*84.19*/("""sortable: false, targets: [ 1 ] """),format.raw/*84.51*/("""}"""),format.raw/*84.52*/(""",
                """),format.raw/*85.17*/("""{"""),format.raw/*85.18*/(""" """),format.raw/*85.19*/("""width: "20%", targets: 1 """),format.raw/*85.44*/("""}"""),format.raw/*85.45*/("""
              """),format.raw/*86.15*/("""],
            "initComplete": function()"""),format.raw/*87.39*/("""{"""),format.raw/*87.40*/("""
                """),format.raw/*88.17*/("""$("#tablaCatalogoAreas_wrapper div.row div").removeClass("col-sm-6");
                $("#tablaCatalogoAreas_wrapper div.row div:eq(0)").addClass("col-sm-4");
                $("#tablaCatalogoAreas_wrapper div.row div:eq(2)").addClass("col-sm-8");
                $(".dataTables_filter").css("width","auto");  
                $("input[type='search'].form-control.input-sm").keyup(function()"""),format.raw/*92.81*/("""{"""),format.raw/*92.82*/("""
                    """),format.raw/*93.21*/("""if( $(this).val().length >0 )"""),format.raw/*93.50*/("""{"""),format.raw/*93.51*/("""
                        """),format.raw/*94.25*/("""$(this).addClass("filtrado");
                    """),format.raw/*95.21*/("""}"""),format.raw/*95.22*/(""" """),format.raw/*95.23*/("""else """),format.raw/*95.28*/("""{"""),format.raw/*95.29*/("""
                        """),format.raw/*96.25*/("""$(this).removeClass("filtrado");
                    """),format.raw/*97.21*/("""}"""),format.raw/*97.22*/("""
                """),format.raw/*98.17*/("""}"""),format.raw/*98.18*/(""");   
            """),format.raw/*99.13*/("""}"""),format.raw/*99.14*/("""
        """),format.raw/*100.9*/("""}"""),format.raw/*100.10*/(""" """),format.raw/*100.11*/(""");        
    """),format.raw/*101.5*/("""}"""),format.raw/*101.6*/(""");

    $( document ).on( "click", "[name*='btn']", function() """),format.raw/*103.60*/("""{"""),format.raw/*103.61*/("""
        """),format.raw/*104.9*/("""var num = $(this).attr('name').substring(3); 
        if (confirm("¿Desea eliminar el área del conocimiento?"))"""),format.raw/*105.66*/("""{"""),format.raw/*105.67*/("""
            
            """),format.raw/*107.13*/("""$(this).parent().submit();
        """),format.raw/*108.9*/("""}"""),format.raw/*108.10*/("""       
   """),format.raw/*109.4*/("""}"""),format.raw/*109.5*/(""");    
    
</script>
            
<script src=""""),_display_(/*113.15*/routes/*113.21*/.Assets.at("lib/datatables/js/jquery.dataTables.min.js")),format.raw/*113.77*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*114.15*/routes/*114.21*/.Assets.at("lib/datatables/js/dataTables.bootstrap.min.js")),format.raw/*114.80*/("""" type="text/javascript"></script>

<script src=""""),_display_(/*116.15*/routes/*116.21*/.Assets.at("mark.js/datatables.mark.min.js")),format.raw/*116.65*/(""""></script>
<script src=""""),_display_(/*117.15*/routes/*117.21*/.Assets.at("mark.js/jquery.mark.min.js")),format.raw/*117.61*/(""""></script>
            
"""))}
  }

  def render(areas:List[Areaconocimiento]): play.twirl.api.HtmlFormat.Appendable = apply(areas)

  def f:((List[Areaconocimiento]) => play.twirl.api.HtmlFormat.Appendable) = (areas) => apply(areas)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Areaconocimiento/list.scala.html
                  HASH: 03d4eed3e7c1ff23dd54ebacb561246e466cc54d
                  MATRIX: 755->1|888->31|915->50|926->54|964->56|991->57|1043->82|1071->83|1102->88|1167->127|1194->128|1221->129|1307->188|1322->194|1405->255|1808->631|1823->637|1880->673|2071->838|2112->870|2152->872|2191->883|2332->997|2346->1002|2382->1017|2421->1028|2465->1042|2499->1050|2540->1082|2580->1084|2619->1095|2762->1211|2776->1216|2812->1231|2851->1242|2895->1256|2927->1261|2966->1291|3006->1293|3045->1304|3182->1414|3196->1419|3230->1432|3269->1443|3313->1457|3351->1469|3379->1488|3419->1490|3468->1511|3606->1632|3619->1637|3658->1638|3703->1655|4116->2041|4145->2054|4184->2055|4241->2084|4338->2154|4348->2155|4372->2158|4402->2161|4412->2162|4445->2174|4584->2286|4651->2344|4691->2346|4758->2385|4833->2433|4843->2434|4867->2437|4967->2506|5051->2562|5147->2627|5196->2648|5271->2693|5303->2698|5350->2715|5378->2716|5454->2764|5483->2765|5519->2774|5597->2824|5626->2825|5667->2838|5825->2968|5854->2969|5899->2986|5933->2993|5948->2999|5995->3025|6038->3040|6067->3041|6224->3170|6253->3171|6282->3172|6342->3204|6371->3205|6417->3223|6446->3224|6475->3225|6528->3250|6557->3251|6600->3266|6669->3307|6698->3308|6743->3325|7162->3716|7191->3717|7240->3738|7297->3767|7326->3768|7379->3793|7457->3843|7486->3844|7515->3845|7548->3850|7577->3851|7630->3876|7711->3929|7740->3930|7785->3947|7814->3948|7860->3966|7889->3967|7926->3976|7956->3977|7986->3978|8029->3993|8058->3994|8150->4057|8180->4058|8217->4067|8357->4178|8387->4179|8442->4205|8505->4240|8535->4241|8574->4252|8603->4253|8680->4302|8696->4308|8774->4364|8851->4413|8867->4419|8948->4478|9026->4528|9042->4534|9108->4578|9162->4604|9178->4610|9240->4650
                  LINES: 26->1|29->1|30->3|30->3|30->3|31->4|32->5|32->5|33->6|34->7|34->7|35->8|37->10|37->10|37->10|49->22|49->22|49->22|54->27|54->27|54->27|55->28|56->29|56->29|56->29|57->30|58->31|59->32|59->32|59->32|60->33|61->34|61->34|61->34|62->35|63->36|63->36|63->36|63->36|64->37|65->38|65->38|65->38|66->39|67->40|69->42|69->42|69->42|70->43|74->47|74->47|74->47|75->48|83->56|83->56|83->56|84->57|85->58|85->58|85->58|85->58|85->58|85->58|87->60|87->60|87->60|88->61|88->61|88->61|88->61|89->62|90->63|92->65|93->66|95->68|96->69|98->71|99->72|100->73|100->73|101->74|101->74|101->74|102->75|104->77|104->77|105->78|105->78|105->78|105->78|106->79|106->79|111->84|111->84|111->84|111->84|111->84|112->85|112->85|112->85|112->85|112->85|113->86|114->87|114->87|115->88|119->92|119->92|120->93|120->93|120->93|121->94|122->95|122->95|122->95|122->95|122->95|123->96|124->97|124->97|125->98|125->98|126->99|126->99|127->100|127->100|127->100|128->101|128->101|130->103|130->103|131->104|132->105|132->105|134->107|135->108|135->108|136->109|136->109|140->113|140->113|140->113|141->114|141->114|141->114|143->116|143->116|143->116|144->117|144->117|144->117
                  -- GENERATED --
              */
          