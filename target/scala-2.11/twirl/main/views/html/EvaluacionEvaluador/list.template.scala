
package views.html.EvaluacionEvaluador

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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[com.avaje.ebean.Page[Recursoevaluador],String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Recursoevaluador], currentSortBy: String, currentOrder: String, currentFilter: String, currentCampoFiltro: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import models._
def /*38.2*/header/*38.8*/(key:String, title:String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*38.38*/("""
    """),format.raw/*39.5*/("""<th class=""""),_display_(/*39.17*/key/*39.20*/.replace(".","_")),format.raw/*39.37*/(""" """),format.raw/*39.38*/("""header """),_display_(/*39.46*/if(currentSortBy == key){/*39.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}}),format.raw/*39.136*/(""""       >
        <a href=""""),_display_(/*40.19*/link(0, key, currentCampoFiltro)),format.raw/*40.51*/("""">"""),_display_(/*40.54*/title),format.raw/*40.59*/("""</a>
    </th>
""")))};implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};def /*9.2*/link/*9.6*/(newPage:Int, newSortBy:String,   newCampoFiltro:String) = {{
    
    var sortBy = currentSortBy
    var order = currentOrder
    var campoFiltro = currentCampoFiltro
    
    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }


		
    // Generate the link
    routes.EvaluacionEvaluadorController.listado(newPage, sortBy, order, currentFilter, currentCampoFiltro)
    
}};
Seq[Any](format.raw/*1.151*/("""
"""),format.raw/*4.83*/(""" 

"""),format.raw/*8.42*/("""
"""),format.raw/*33.2*/("""

"""),format.raw/*37.37*/("""
"""),format.raw/*42.2*/("""

"""),_display_(/*44.2*/main/*44.6*/ {_display_(Seq[Any](format.raw/*44.8*/("""
    
    """),format.raw/*46.5*/("""<h1 id="homeTitle">Mis asignaciones</h1>

	"""),_display_(/*48.3*/flashes()),format.raw/*48.12*/(""" 

    """),format.raw/*50.5*/("""<div id="actions">
        <form action=""""),_display_(/*51.24*/link(0, "titulo", "titulo")),format.raw/*51.51*/("""" method="GET">       
            <input type="search" id="searchbox" name="f" value=""""),_display_(/*52.66*/currentFilter),format.raw/*52.79*/("""" placeholder="Filtrar solicitud por ..."/>
            <select name ="c" >
				<option value="titulo">Campos de filtrado</option>
            	<option value="titulo">Título</option>
            	<option value="numcontrol">Clave de control</option>
            	<option value="niveleducativo.descripcion">Nivel de conocimiento</option>
            	<option value="areaconocimiento.descripcion">Área del conocimiento</option>
            	<option value="unidadacademica.nombre">Unidad académica</option>
            	<option value="estado.descripcion">Estado</option>
            </select>
            <input type="submit" id="searchsubmit" value="Filtrar" class="btn btn-primary btn-xs">
        </form>        
    </div>

    
    """),_display_(/*67.6*/if(currentPage.getTotalRowCount == 0)/*67.43*/ {_display_(Seq[Any](format.raw/*67.45*/("""
        
        """),format.raw/*69.9*/("""<div class="well">getList()
            <em>No existen registros.</em>
        </div>
        
    """)))}/*73.7*/else/*73.12*/{_display_(Seq[Any](format.raw/*73.13*/("""
        
        """),format.raw/*75.9*/("""<div class="table-responsive">
			<table class="table table-striped table-bordered table-hover table-condensed">
				<thead>
					<tr>
   						"""),_display_(/*79.11*/header("titulo", "Título")),format.raw/*79.37*/("""					
						"""),_display_(/*80.8*/header("numcontrol", "Clave de control")),format.raw/*80.48*/("""
						"""),_display_(/*81.8*/header("areaconocimiento.descripcion","Área del conocimiento")),format.raw/*81.70*/("""
						"""),_display_(/*82.8*/header("niveleducativo.descripcion","Nivel de conocimiento")),format.raw/*82.68*/("""
						"""),_display_(/*83.8*/header("unidadacademica.nombre","Unidad académica")),format.raw/*83.59*/("""
						"""),_display_(/*84.8*/header("elaboracion","Fecha elaboración")),format.raw/*84.49*/("""
						"""),_display_(/*85.8*/header("auditinsert","Fecha registro web")),format.raw/*85.50*/("""
						"""),_display_(/*86.8*/header("estado.descripcion", "Estado")),format.raw/*86.46*/("""
						"""),_display_(/*87.8*/header("", "")),format.raw/*87.22*/("""
					"""),format.raw/*88.6*/("""</tr>
				</thead>
				<tbody>

					"""),_display_(/*92.7*/for(re <- currentPage.getList) yield /*92.37*/ {_display_(Seq[Any](format.raw/*92.39*/("""
					
						"""),format.raw/*94.7*/("""<tr>
							<td>
								"""),_display_(/*96.10*/if(re.estadoevaluacion.id ==  1L)/*96.43*/{_display_(Seq[Any](format.raw/*96.44*/("""
									"""),format.raw/*97.10*/("""<a href=""""),_display_(/*97.20*/routes/*97.26*/.EvaluacionEvaluadorController.create(re.recurso.id, re.aspecto.id)),format.raw/*97.93*/("""">
								""")))}),format.raw/*98.10*/("""
								"""),_display_(/*99.10*/if(re.estadoevaluacion.id == 2L)/*99.42*/{_display_(Seq[Any](format.raw/*99.43*/("""
									"""),format.raw/*100.10*/("""<a href=""""),_display_(/*100.20*/routes/*100.26*/.EvaluacionEvaluadorController.edit(re.recurso.id, re.aspecto.id)),format.raw/*100.91*/("""">
								""")))}),format.raw/*101.10*/("""						
								"""),_display_(/*102.10*/if(re.estadoevaluacion.id == 3L)/*102.42*/{_display_(Seq[Any](format.raw/*102.43*/("""
									"""),format.raw/*103.10*/("""<a href="">
								""")))}),format.raw/*104.10*/("""
								"""),_display_(/*105.10*/if(re.estadoevaluacion.id == 4L)/*105.42*/{_display_(Seq[Any](format.raw/*105.43*/("""
									"""),format.raw/*106.10*/("""<a href="">
								""")))}),format.raw/*107.10*/("""								
								"""),_display_(/*108.10*/if(re.estadoevaluacion.id == 5L)/*108.42*/{_display_(Seq[Any](format.raw/*108.43*/("""
									"""),format.raw/*109.10*/("""<a href="">
								""")))}),format.raw/*110.10*/("""
								"""),_display_(/*111.10*/if(re.estadoevaluacion.id == 402L)/*111.44*/{_display_(Seq[Any](format.raw/*111.45*/("""
									"""),format.raw/*112.10*/("""<a href=""""),_display_(/*112.20*/routes/*112.26*/.ReporteController.cesoe(re.recurso.id)),format.raw/*112.65*/("""">
								""")))}),format.raw/*113.10*/("""	
								"""),_display_(/*114.10*/re/*114.12*/.recurso.titulo),format.raw/*114.27*/("""</a>
							</td>
							<td>"""),_display_(/*116.13*/re/*116.15*/.recurso.numcontrol),format.raw/*116.34*/("""</td>                        
							<td>"""),_display_(/*117.13*/re/*117.15*/.recurso.areaconocimiento.descripcion),format.raw/*117.52*/("""</td>
							<td>"""),_display_(/*118.13*/re/*118.15*/.recurso.niveleducativo.descripcion),format.raw/*118.50*/("""</td>
							<td>"""),_display_(/*119.13*/re/*119.15*/.recurso.unidadacademica.nombre),format.raw/*119.46*/("""</td>
							
							
							
							<td>"""),_display_(/*123.13*/re/*123.15*/.recurso.elaboracion.format("dd/MM/yyyy")),format.raw/*123.56*/("""</td>
							<td>"""),_display_(/*124.13*/re/*124.15*/.recurso.auditinsert.format("dd/MM/yyyy")),format.raw/*124.56*/("""</td>
							<td>"""),_display_(/*125.13*/re/*125.15*/.estadoevaluacion.descripcion),format.raw/*125.44*/("""</td>		
							<td><button type="button" class="btn btn-primary btn-sm " name="btnVer"""),_display_(/*126.79*/re/*126.81*/.recurso.id.toString),format.raw/*126.101*/("""">Detalle</button></td>					
						</tr>
					""")))}),format.raw/*128.7*/("""

				"""),format.raw/*130.5*/("""</tbody>
			</table>
		</div>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(/*136.18*/if(currentPage.hasPrev)/*136.41*/ {_display_(Seq[Any](format.raw/*136.43*/("""
                    """),format.raw/*137.21*/("""<li class="prev">
                        <a href=""""),_display_(/*138.35*/link(currentPage.getPageIndex - 1, null, currentCampoFiltro)),format.raw/*138.95*/("""">&larr; Anterior</a>
                    </li>
                """)))}/*140.19*/else/*140.24*/{_display_(Seq[Any](format.raw/*140.25*/("""
                    """),format.raw/*141.21*/("""<li class="prev disabled">
                        <a>&larr; Anterior</a>
                    </li>
                """)))}),format.raw/*144.18*/("""
                """),format.raw/*145.17*/("""<li class="current">
                    <a>Mostrando registros del """),_display_(/*146.49*/currentPage/*146.60*/.getDisplayXtoYofZ(" al "," de un total de ")),format.raw/*146.105*/("""</a>
                </li>
                """),_display_(/*148.18*/if(currentPage.hasNext)/*148.41*/ {_display_(Seq[Any](format.raw/*148.43*/("""
                    """),format.raw/*149.21*/("""<li class="next">
                        <a href=""""),_display_(/*150.35*/link(currentPage.getPageIndex + 1, null, currentCampoFiltro)),format.raw/*150.95*/("""">Siguiente &rarr;</a>
                    </li>
                """)))}/*152.19*/else/*152.24*/{_display_(Seq[Any](format.raw/*152.25*/("""
                    """),format.raw/*153.21*/("""<li class="next disabled">
                        <a>Siguiente &rarr;</a>
                    </li>
                """)))}),format.raw/*156.18*/("""
            """),format.raw/*157.13*/("""</ul>
        </div>
     
     <form id="aux"></form>   
    """)))}),format.raw/*161.6*/("""
        
""")))}),format.raw/*163.2*/("""

"""),format.raw/*165.1*/("""<script type="text/javascript">

$(function () """),format.raw/*167.15*/("""{"""),format.raw/*167.16*/("""

  """),format.raw/*169.3*/("""if ("""),_display_(/*169.8*/currentCampoFiltro/*169.26*/.isEmpty),format.raw/*169.34*/(""")"""),format.raw/*169.35*/("""{"""),format.raw/*169.36*/("""  	
  	"""),format.raw/*170.4*/("""$('select[name="c"]:eq(0)').prop('selected', true);
  """),format.raw/*171.3*/("""}"""),format.raw/*171.4*/(""" """),format.raw/*171.5*/("""else """),format.raw/*171.10*/("""{"""),format.raw/*171.11*/("""	
  	"""),format.raw/*172.4*/("""$('select[name="c"] option[value=""""),_display_(/*172.39*/currentCampoFiltro),format.raw/*172.57*/(""""]').prop('selected', true);
	"""),format.raw/*173.2*/("""}"""),format.raw/*173.3*/("""  
  
"""),format.raw/*175.1*/("""}"""),format.raw/*175.2*/(""");


$( document ).on( "click", "[name*='btnVer']", function() """),format.raw/*178.59*/("""{"""),format.raw/*178.60*/("""
	 """),format.raw/*179.3*/("""var num = $(this).attr('name').substring(6);	 
	 $("#aux").attr("action","/evVerDetalle/"+num);	 
	 $("#aux").submit();	 
"""),format.raw/*182.1*/("""}"""),format.raw/*182.2*/(""");




</script>

            
"""))}
  }

  def render(currentPage:com.avaje.ebean.Page[Recursoevaluador],currentSortBy:String,currentOrder:String,currentFilter:String,currentCampoFiltro:String): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,currentCampoFiltro)

  def f:((com.avaje.ebean.Page[Recursoevaluador],String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,currentCampoFiltro) => apply(currentPage,currentSortBy,currentOrder,currentFilter,currentCampoFiltro)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/EvaluacionEvaluador/list.scala.html
                  HASH: cc23eb919b35bc4a0c86fe52808eb31216ec3159
                  MATRIX: 802->1|1054->1121|1068->1127|1175->1157|1207->1162|1246->1174|1258->1177|1296->1194|1325->1195|1360->1203|1394->1229|1481->1293|1536->1321|1589->1353|1619->1356|1645->1361|1692->186|1724->210|1794->397|1805->401|2444->150|2472->267|2502->395|2530->1009|2560->1119|2588->1377|2617->1380|2629->1384|2668->1386|2705->1396|2775->1440|2805->1449|2839->1456|2908->1498|2956->1525|3071->1613|3105->1626|3865->2360|3911->2397|3951->2399|3996->2417|4114->2518|4127->2523|4166->2524|4211->2542|4383->2687|4430->2713|4469->2726|4530->2766|4564->2774|4647->2836|4681->2844|4762->2904|4796->2912|4868->2963|4902->2971|4964->3012|4998->3020|5061->3062|5095->3070|5154->3108|5188->3116|5223->3130|5256->3136|5320->3174|5366->3204|5406->3206|5446->3219|5499->3245|5541->3278|5580->3279|5618->3289|5655->3299|5670->3305|5758->3372|5801->3384|5838->3394|5879->3426|5918->3427|5957->3437|5995->3447|6011->3453|6098->3518|6142->3530|6186->3546|6228->3578|6268->3579|6307->3589|6360->3610|6398->3620|6440->3652|6480->3653|6519->3663|6572->3684|6618->3702|6660->3734|6700->3735|6739->3745|6792->3766|6830->3776|6874->3810|6914->3811|6953->3821|6991->3831|7007->3837|7068->3876|7112->3888|7151->3899|7163->3901|7200->3916|7258->3946|7270->3948|7311->3967|7381->4009|7393->4011|7452->4048|7498->4066|7510->4068|7567->4103|7613->4121|7625->4123|7678->4154|7748->4196|7760->4198|7823->4239|7869->4257|7881->4259|7944->4300|7990->4318|8002->4320|8053->4349|8167->4435|8179->4437|8222->4457|8300->4504|8334->4510|8476->4624|8509->4647|8550->4649|8600->4670|8680->4722|8762->4782|8847->4848|8861->4853|8901->4854|8951->4875|9100->4992|9146->5009|9243->5078|9264->5089|9332->5134|9404->5178|9437->5201|9478->5203|9528->5224|9608->5276|9690->5336|9776->5403|9790->5408|9830->5409|9880->5430|10030->5548|10072->5561|10166->5624|10208->5635|10238->5637|10314->5684|10344->5685|10376->5689|10408->5694|10436->5712|10466->5720|10496->5721|10526->5722|10561->5729|10643->5783|10672->5784|10701->5785|10735->5790|10765->5791|10798->5796|10861->5831|10901->5849|10959->5879|10988->5880|11022->5886|11051->5887|11143->5950|11173->5951|11204->5954|11354->6076|11383->6077
                  LINES: 26->1|29->38|29->38|31->38|32->39|32->39|32->39|32->39|32->39|32->39|32->39|32->39|33->40|33->40|33->40|33->40|35->4|35->4|35->9|35->9|60->1|61->4|63->8|64->33|66->37|67->42|69->44|69->44|69->44|71->46|73->48|73->48|75->50|76->51|76->51|77->52|77->52|92->67|92->67|92->67|94->69|98->73|98->73|98->73|100->75|104->79|104->79|105->80|105->80|106->81|106->81|107->82|107->82|108->83|108->83|109->84|109->84|110->85|110->85|111->86|111->86|112->87|112->87|113->88|117->92|117->92|117->92|119->94|121->96|121->96|121->96|122->97|122->97|122->97|122->97|123->98|124->99|124->99|124->99|125->100|125->100|125->100|125->100|126->101|127->102|127->102|127->102|128->103|129->104|130->105|130->105|130->105|131->106|132->107|133->108|133->108|133->108|134->109|135->110|136->111|136->111|136->111|137->112|137->112|137->112|137->112|138->113|139->114|139->114|139->114|141->116|141->116|141->116|142->117|142->117|142->117|143->118|143->118|143->118|144->119|144->119|144->119|148->123|148->123|148->123|149->124|149->124|149->124|150->125|150->125|150->125|151->126|151->126|151->126|153->128|155->130|161->136|161->136|161->136|162->137|163->138|163->138|165->140|165->140|165->140|166->141|169->144|170->145|171->146|171->146|171->146|173->148|173->148|173->148|174->149|175->150|175->150|177->152|177->152|177->152|178->153|181->156|182->157|186->161|188->163|190->165|192->167|192->167|194->169|194->169|194->169|194->169|194->169|194->169|195->170|196->171|196->171|196->171|196->171|196->171|197->172|197->172|197->172|198->173|198->173|200->175|200->175|203->178|203->178|204->179|207->182|207->182
                  -- GENERATED --
              */
          