
package views.html.AdminEvaluacionTabla

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
object reactivoListar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[com.avaje.ebean.Page[EvaluacionTablaReactivo],String,String,String,List[EvaluacionTablaVersion],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: com.avaje.ebean.Page[EvaluacionTablaReactivo], currentSortBy: String, currentOrder: String, currentFilter: String,
versiones:List[EvaluacionTablaVersion]
):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*36.2*/header/*36.8*/(key:String, title:String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*36.38*/("""
    """),format.raw/*37.5*/("""<th class=""""),_display_(/*37.17*/key/*37.20*/.replace(".","_")),format.raw/*37.37*/(""" """),format.raw/*37.38*/("""header """),_display_(/*37.46*/if(currentSortBy == key){/*37.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}}),format.raw/*37.136*/("""">
        <a href=""""),_display_(/*38.19*/link(0, key)),format.raw/*38.31*/("""">"""),_display_(/*38.34*/title),format.raw/*38.39*/("""</a>
    </th>
""")))};implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};def /*10.2*/link/*10.6*/(newPage:Int, newSortBy:String) = {{
    
    var sortBy = currentSortBy
    var order = currentOrder
    
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
    routes.AdminEvaluacionTablaController.listarReactivos(newPage, sortBy, order, currentFilter)
    
}};
Seq[Any](format.raw/*3.2*/("""
"""),format.raw/*5.77*/(""" 

"""),format.raw/*9.42*/("""
"""),format.raw/*31.2*/("""

"""),format.raw/*35.37*/("""
"""),format.raw/*40.2*/("""



"""),_display_(/*44.2*/main/*44.6*/{_display_(Seq[Any](format.raw/*44.7*/("""
	"""),format.raw/*45.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
				  <li>Catálogos</li>
				  <li class="active">Reactivos</li>
				</ol>			
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
  	          <h3>Reactivos</h3>
  	          <form id="frmAux">"""),_display_(/*57.33*/CSRF/*57.37*/.formField),format.raw/*57.47*/("""</form>  	           
 		      <div id="actions">		        
			        <form action=""""),_display_(/*59.27*/link(0, "descripcion")),format.raw/*59.49*/("""" method="GET">
			            <input type="search" id="searchbox" name="f" value=""""),_display_(/*60.69*/currentFilter),format.raw/*60.82*/("""" placeholder="Buscar por descripcion...">
			            <input type="submit" id="searchsubmit" value="Filtrar por descripción" class="btn btn-primary">
			        </form>
 					<a class="btn btn-success" id="btnAgregar" href=""""),_display_(/*63.57*/routes/*63.63*/.AdminEvaluacionTablaController.createReactivo()),format.raw/*63.111*/("""">Agregar reactivo</a>			        
			  </div>
  	          
			    """),_display_(/*66.9*/if(flash.containsKey("success"))/*66.41*/ {_display_(Seq[Any](format.raw/*66.43*/("""
			        """),format.raw/*67.12*/("""<div class="alert alert-success" role="alert">
			            """),_display_(/*68.17*/flash/*68.22*/.get("success")),format.raw/*68.37*/("""
			        """),format.raw/*69.12*/("""</div>
			    """)))}),format.raw/*70.9*/("""   	          
			    """),_display_(/*71.9*/if(flash.containsKey("error"))/*71.39*/ {_display_(Seq[Any](format.raw/*71.41*/("""
			        """),format.raw/*72.12*/("""<div class="alert alert-danger" role="alert">
			            """),_display_(/*73.17*/flash/*73.22*/.get("error")),format.raw/*73.35*/("""
			        """),format.raw/*74.12*/("""</div>
			    """)))}),format.raw/*75.9*/("""   	          
	        """),format.raw/*76.10*/("""</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
		    """),_display_(/*80.8*/if(currentPage.getTotalRowCount == 0)/*80.45*/ {_display_(Seq[Any](format.raw/*80.47*/("""
		        """),format.raw/*81.11*/("""<div class="well">
		            <em>No hay reactivos que cumplan con los criterios.</em>
		        </div>
		    """)))}/*84.9*/else/*84.14*/{_display_(Seq[Any](format.raw/*84.15*/("""
		        """),format.raw/*85.11*/("""<div class="table-responsive">
			        <table class="table table-striped table-bordered table-hover table-condensed"">
			            <thead>
			                <tr>
			                    """),_display_(/*89.25*/header("id", "id")),format.raw/*89.43*/("""
			                    """),_display_(/*90.25*/header("descripcion", "Descripción")),format.raw/*90.61*/("""
			                    """),_display_(/*91.25*/header("", "Editar")),format.raw/*91.45*/("""
			                    """),_display_(/*92.25*/header("", "Eliminar")),format.raw/*92.47*/("""
			                """),format.raw/*93.20*/("""</tr>
			            </thead>
			            <tbody>

				                """),_display_(/*97.22*/for(etr <- currentPage.getList) yield /*97.53*/ {_display_(Seq[Any](format.raw/*97.55*/("""
				                    """),format.raw/*98.25*/("""<tr>
				                    	<td>"""),_display_(/*99.31*/etr/*99.34*/.id),format.raw/*99.37*/("""</td>
				                        <td><a href=""""),_display_(/*100.43*/routes/*100.49*/.AdminEvaluacionTablaController.editReactivo(etr.id)),format.raw/*100.101*/("""">"""),_display_(/*100.104*/etr/*100.107*/.descripcion),format.raw/*100.119*/("""</a></td>
				                        <td><a href=""""),_display_(/*101.43*/routes/*101.49*/.AdminEvaluacionTablaController.editReactivo(etr.id)),format.raw/*101.101*/("""" role="button" class="btn btn-primary" id="btnEditar">Editar</a>  </td>
				                        <td>
				                        	"""),_display_(/*103.31*/form(CSRF(routes.AdminEvaluacionTablaController.deleteReactivo(etr.id)))/*103.103*/ {_display_(Seq[Any](format.raw/*103.105*/("""		
				                        		"""),format.raw/*104.31*/("""<input type="submit" value="Eliminar" class="btn btn-danger">
				                        	""")))}),format.raw/*105.31*/("""
				                        """),format.raw/*106.29*/("""</td>
				                    </tr>
				                """)))}),format.raw/*108.22*/("""

			            """),format.raw/*110.16*/("""</tbody>
			        </table>
				</div>
		        <div id="pagination" class="pagination">
		            <ul>
		                """),_display_(/*115.20*/if(currentPage.hasPrev)/*115.43*/ {_display_(Seq[Any](format.raw/*115.45*/("""
		                    """),format.raw/*116.23*/("""<li class="prev">
		                        <a href=""""),_display_(/*117.37*/link(currentPage.getPageIndex - 1, null)),format.raw/*117.77*/("""">&larr; Anterior</a>
		                    </li>
		                """)))}/*119.21*/else/*119.26*/{_display_(Seq[Any](format.raw/*119.27*/("""
		                    """),format.raw/*120.23*/("""<li class="prev disabled">
		                        <a>&larr; Anterior</a>
		                    </li>
		                """)))}),format.raw/*123.20*/("""
		                """),format.raw/*124.19*/("""<li class="current">
		                    <a>Mostrando registros del """),_display_(/*125.51*/currentPage/*125.62*/.getDisplayXtoYofZ(" al "," de un total de ")),format.raw/*125.107*/("""</a>
		                </li>
		                """),_display_(/*127.20*/if(currentPage.hasNext)/*127.43*/ {_display_(Seq[Any](format.raw/*127.45*/("""
		                    """),format.raw/*128.23*/("""<li class="next">
		                        <a href=""""),_display_(/*129.37*/link(currentPage.getPageIndex + 1, null)),format.raw/*129.77*/("""">Siguiente &rarr;</a>
		                    </li>
		                """)))}/*131.21*/else/*131.26*/{_display_(Seq[Any](format.raw/*131.27*/("""
		                    """),format.raw/*132.23*/("""<li class="next disabled">
		                        <a>Siguiente &rarr;</a>
		                    </li>
		                """)))}),format.raw/*135.20*/("""
		            """),format.raw/*136.15*/("""</ul>
		        </div>
		        
		    """)))}),format.raw/*139.8*/("""

		
			
			
			"""),format.raw/*144.4*/("""</div>
		</div>
	</div>


""")))}),format.raw/*149.2*/("""


"""),format.raw/*152.1*/("""<script type="text/javascript">


</script>"""))}
  }

  def render(currentPage:com.avaje.ebean.Page[EvaluacionTablaReactivo],currentSortBy:String,currentOrder:String,currentFilter:String,versiones:List[EvaluacionTablaVersion]): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,versiones)

  def f:((com.avaje.ebean.Page[EvaluacionTablaReactivo],String,String,String,List[EvaluacionTablaVersion]) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,versiones) => apply(currentPage,currentSortBy,currentOrder,currentFilter,versiones)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:35 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/AdminEvaluacionTabla/reactivoListar.scala.html
                  HASH: 0bf26f9ef17d7c0dd3de63a3636203b262488937
                  MATRIX: 842->1|1098->1041|1112->1047|1219->1077|1251->1082|1290->1094|1302->1097|1340->1114|1369->1115|1404->1123|1438->1149|1525->1213|1573->1234|1606->1246|1636->1249|1662->1254|1709->189|1741->213|1806->394|1818->398|2378->170|2406->264|2436->392|2464->929|2494->1039|2522->1270|2553->1275|2565->1279|2603->1280|2632->1282|3018->1641|3031->1645|3062->1655|3175->1741|3218->1763|3329->1847|3363->1860|3619->2089|3634->2095|3704->2143|3798->2211|3839->2243|3879->2245|3919->2257|4009->2320|4023->2325|4059->2340|4099->2352|4144->2367|4193->2390|4232->2420|4272->2422|4312->2434|4401->2496|4415->2501|4449->2514|4489->2526|4534->2541|4586->2565|4682->2635|4728->2672|4768->2674|4807->2685|4939->2800|4952->2805|4991->2806|5030->2817|5250->3010|5289->3028|5341->3053|5398->3089|5450->3114|5491->3134|5543->3159|5586->3181|5634->3201|5736->3276|5783->3307|5823->3309|5876->3334|5938->3369|5950->3372|5974->3375|6050->3423|6066->3429|6141->3481|6173->3484|6187->3487|6222->3499|6302->3551|6318->3557|6393->3609|6557->3745|6640->3817|6682->3819|6744->3852|6868->3944|6926->3973|7015->4030|7061->4047|7218->4176|7251->4199|7292->4201|7344->4224|7426->4278|7488->4318|7577->4388|7591->4393|7631->4394|7683->4417|7838->4540|7886->4559|7985->4630|8006->4641|8074->4686|8150->4734|8183->4757|8224->4759|8276->4782|8358->4836|8420->4876|8510->4947|8524->4952|8564->4953|8616->4976|8772->5100|8816->5115|8888->5156|8932->5172|8990->5199|9021->5202
                  LINES: 26->1|30->36|30->36|32->36|33->37|33->37|33->37|33->37|33->37|33->37|33->37|33->37|34->38|34->38|34->38|34->38|36->5|36->5|36->10|36->10|58->3|59->5|61->9|62->31|64->35|65->40|69->44|69->44|69->44|70->45|82->57|82->57|82->57|84->59|84->59|85->60|85->60|88->63|88->63|88->63|91->66|91->66|91->66|92->67|93->68|93->68|93->68|94->69|95->70|96->71|96->71|96->71|97->72|98->73|98->73|98->73|99->74|100->75|101->76|105->80|105->80|105->80|106->81|109->84|109->84|109->84|110->85|114->89|114->89|115->90|115->90|116->91|116->91|117->92|117->92|118->93|122->97|122->97|122->97|123->98|124->99|124->99|124->99|125->100|125->100|125->100|125->100|125->100|125->100|126->101|126->101|126->101|128->103|128->103|128->103|129->104|130->105|131->106|133->108|135->110|140->115|140->115|140->115|141->116|142->117|142->117|144->119|144->119|144->119|145->120|148->123|149->124|150->125|150->125|150->125|152->127|152->127|152->127|153->128|154->129|154->129|156->131|156->131|156->131|157->132|160->135|161->136|164->139|169->144|174->149|177->152
                  -- GENERATED --
              */
          