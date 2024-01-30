
package views.html.Recurso

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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[com.avaje.ebean.Page[Recurso],String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Recurso], currentSortBy: String, currentOrder: String, currentFilter: String, currentCampoFiltro: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*38.2*/header/*38.8*/(key:String, title:String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*38.38*/("""
    """),format.raw/*39.5*/("""<th class=""""),_display_(/*39.17*/key/*39.20*/.replace(".","_")),format.raw/*39.37*/(""" """),format.raw/*39.38*/("""header """),_display_(/*39.46*/if(currentSortBy == key){/*39.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}}),format.raw/*39.136*/(""""       >
        <a href=""""),_display_(/*40.19*/link(0, key, currentCampoFiltro)),format.raw/*40.51*/("""">"""),_display_(/*40.54*/title),format.raw/*40.59*/("""</a>
    </th>
""")))};implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};def /*8.2*/link/*8.6*/(newPage:Int, newSortBy:String,   newCampoFiltro:String) = {{
    
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
    routes.RecursoController.list(newPage, sortBy, order, currentFilter, currentCampoFiltro)
    
}};
Seq[Any](format.raw/*1.142*/("""
"""),format.raw/*3.83*/(""" 

"""),format.raw/*7.42*/("""
"""),format.raw/*33.2*/("""

"""),format.raw/*37.37*/("""
"""),format.raw/*42.2*/("""

"""),_display_(/*44.2*/main/*44.6*/ {_display_(Seq[Any](format.raw/*44.8*/("""
	"""),format.raw/*45.2*/("""<div class="container-fluid" style="background-color: white; padding: 10px">    
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
				  <li>Recursos</li>
				  <li class="active">Todas las solicitudes</li>
				</ol>			
			</div>
		</div>
   
    	<div class="row">
			<div class="col-lg-12">
    			<h3 id="homeTitle">"""),_display_(/*57.28*/Messages("recursos.list.titulo", currentPage.getTotalRowCount)),format.raw/*57.90*/("""</h3>
    			<div id="divFlash">
					"""),_display_(/*59.7*/flashes()),format.raw/*59.16*/("""
				"""),format.raw/*60.5*/("""</div>
			    <div id="actions">
			        <form action=""""),_display_(/*62.27*/link(0, "titulo", "titulo")),format.raw/*62.54*/("""" method="GET">       
			            <input type="search" id="searchbox" name="f" value=""""),_display_(/*63.69*/currentFilter),format.raw/*63.82*/("""" placeholder="Filtrar solicitud por ..."/>
			            <select name ="c" >
							<option value="">Campos de filtrado</option>
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

				<div id="retornoAjax">				
					"""),_display_(/*78.7*/ajaxListTabla(currentPage, currentSortBy, currentOrder, currentFilter, currentCampoFiltro)),format.raw/*78.97*/("""
				"""),format.raw/*79.5*/("""</div>


			    

		    </div>
	    </div>
    </div>        
""")))}),format.raw/*87.2*/("""

"""),format.raw/*89.1*/("""<script type="text/javascript">

	$(function () """),format.raw/*91.16*/("""{"""),format.raw/*91.17*/("""	
	  """),format.raw/*92.4*/("""if ("""),_display_(/*92.9*/currentCampoFiltro/*92.27*/.isEmpty),format.raw/*92.35*/(""")"""),format.raw/*92.36*/("""{"""),format.raw/*92.37*/("""  	
	  	"""),format.raw/*93.5*/("""$('select[name="c"]:eq(0)').prop('selected', true);
	  """),format.raw/*94.4*/("""}"""),format.raw/*94.5*/(""" """),format.raw/*94.6*/("""else """),format.raw/*94.11*/("""{"""),format.raw/*94.12*/("""	
	  	"""),format.raw/*95.5*/("""$('select[name="c"] option[value=""""),_display_(/*95.40*/currentCampoFiltro),format.raw/*95.58*/(""""]').prop('selected', true);
		"""),format.raw/*96.3*/("""}"""),format.raw/*96.4*/("""	  
	"""),format.raw/*97.2*/("""}"""),format.raw/*97.3*/(""");
	
	
	$( document ).on( "click", "[name*='btnEliminar']", function() """),format.raw/*100.65*/("""{"""),format.raw/*100.66*/("""
		 """),format.raw/*101.4*/("""var num = $(this).attr('name').substring(11);
		  if (confirm("¿Desea eliminar completamente la solicitud del recurso?"))"""),format.raw/*102.76*/("""{"""),format.raw/*102.77*/("""
			  """),format.raw/*103.6*/("""$.ajax("""),format.raw/*103.13*/("""{"""),format.raw/*103.14*/("""
				  """),format.raw/*104.7*/("""async: false,
				  method: "POST",
				  url: "/recursos/"+num+"/ajaxDelete"
				"""),format.raw/*107.5*/("""}"""),format.raw/*107.6*/(""")
				.success(function(data)"""),format.raw/*108.28*/("""{"""),format.raw/*108.29*/("""					
					"""),format.raw/*109.6*/("""$("#divFlash").html('<div class="alert alert-success" role="alert">Se eliminó el recurso.</div>');
					$("#retornoAjax").html(data);
				  """),format.raw/*111.7*/("""}"""),format.raw/*111.8*/(""")				
				  .error(function(data)"""),format.raw/*112.28*/("""{"""),format.raw/*112.29*/("""
				  	"""),format.raw/*113.8*/("""alert("error ajax: "+data);
				  """),format.raw/*114.7*/("""}"""),format.raw/*114.8*/(""")
				
		  """),format.raw/*116.5*/("""}"""),format.raw/*116.6*/("""		  
	"""),format.raw/*117.2*/("""}"""),format.raw/*117.3*/(""");
	
	
	$( document ).on( "click", "[name*='btnVer']", function() """),format.raw/*120.60*/("""{"""),format.raw/*120.61*/("""
		 """),format.raw/*121.4*/("""var num = $(this).attr('name').substring(6);	 
		 $("#aux").attr("action","/reporte/cesoe/"+num);	 
		 $("#aux").submit();	 
	"""),format.raw/*124.2*/("""}"""),format.raw/*124.3*/(""");


	$("form").submit(function(event)"""),format.raw/*127.34*/("""{"""),format.raw/*127.35*/("""
		"""),format.raw/*128.3*/("""if ( $("select[name='c']").val()==""  )"""),format.raw/*128.42*/("""{"""),format.raw/*128.43*/("""
			"""),format.raw/*129.4*/("""event.preventDefault();
		"""),format.raw/*130.3*/("""}"""),format.raw/*130.4*/(""" """),format.raw/*130.5*/("""else
			return true;
	"""),format.raw/*132.2*/("""}"""),format.raw/*132.3*/(""");


</script>

            

            """))}
  }

  def render(currentPage:com.avaje.ebean.Page[Recurso],currentSortBy:String,currentOrder:String,currentFilter:String,currentCampoFiltro:String): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,currentCampoFiltro)

  def f:((com.avaje.ebean.Page[Recurso],String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,currentCampoFiltro) => apply(currentPage,currentSortBy,currentOrder,currentFilter,currentCampoFiltro)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/list.scala.html
                  HASH: 6963a81dc70882a3bf191422c8459480b10aa651
                  MATRIX: 781->1|1008->1079|1022->1085|1129->1115|1161->1120|1200->1132|1212->1135|1250->1152|1279->1153|1314->1161|1348->1187|1435->1251|1490->1279|1543->1311|1573->1314|1599->1319|1646->160|1678->184|1748->371|1759->375|2382->141|2410->241|2440->369|2468->967|2498->1077|2526->1335|2555->1338|2567->1342|2606->1344|2635->1346|3007->1691|3090->1753|3155->1792|3185->1801|3217->1806|3303->1865|3351->1892|3469->1983|3503->1996|4320->2787|4431->2877|4463->2882|4556->2945|4585->2947|4661->2995|4690->2996|4722->3001|4753->3006|4780->3024|4809->3032|4838->3033|4867->3034|4902->3042|4984->3097|5012->3098|5040->3099|5073->3104|5102->3105|5135->3111|5197->3146|5236->3164|5294->3195|5322->3196|5354->3201|5382->3202|5482->3273|5512->3274|5544->3278|5694->3399|5724->3400|5758->3406|5794->3413|5824->3414|5859->3421|5969->3503|5998->3504|6056->3533|6086->3534|6125->3545|6293->3685|6322->3686|6384->3719|6414->3720|6450->3728|6512->3762|6541->3763|6580->3774|6609->3775|6643->3781|6672->3782|6767->3848|6797->3849|6829->3853|6983->3979|7012->3980|7079->4018|7109->4019|7140->4022|7208->4061|7238->4062|7270->4066|7324->4092|7353->4093|7382->4094|7432->4116|7461->4117
                  LINES: 26->1|28->38|28->38|30->38|31->39|31->39|31->39|31->39|31->39|31->39|31->39|31->39|32->40|32->40|32->40|32->40|34->3|34->3|34->8|34->8|60->1|61->3|63->7|64->33|66->37|67->42|69->44|69->44|69->44|70->45|82->57|82->57|84->59|84->59|85->60|87->62|87->62|88->63|88->63|103->78|103->78|104->79|112->87|114->89|116->91|116->91|117->92|117->92|117->92|117->92|117->92|117->92|118->93|119->94|119->94|119->94|119->94|119->94|120->95|120->95|120->95|121->96|121->96|122->97|122->97|125->100|125->100|126->101|127->102|127->102|128->103|128->103|128->103|129->104|132->107|132->107|133->108|133->108|134->109|136->111|136->111|137->112|137->112|138->113|139->114|139->114|141->116|141->116|142->117|142->117|145->120|145->120|146->121|149->124|149->124|152->127|152->127|153->128|153->128|153->128|154->129|155->130|155->130|155->130|157->132|157->132
                  -- GENERATED --
              */
          