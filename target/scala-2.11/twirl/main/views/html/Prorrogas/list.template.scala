
package views.html.Prorrogas

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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[com.avaje.ebean.Page[Recursoevaluador],String,String,String,String,Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Recursoevaluador], currentSortBy: String, currentOrder: String, currentFilter: String, currentCampoFiltro: String, rdioSolicitud:Int):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*36.2*/header/*36.8*/(key:String, title:String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*36.38*/("""
    """),format.raw/*37.5*/("""<th class=""""),_display_(/*37.17*/key/*37.20*/.replace(".","_")),format.raw/*37.37*/(""" """),format.raw/*37.38*/("""header """),_display_(/*37.46*/if(currentSortBy == key){/*37.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}}),format.raw/*37.136*/(""""       >
        <a href=""""),_display_(/*38.19*/link(0, key, currentCampoFiltro)),format.raw/*38.51*/("""">"""),_display_(/*38.54*/title),format.raw/*38.59*/("""</a>
    </th>
""")))};def /*7.2*/link/*7.6*/(newPage:Int, newSortBy:String,   newCampoFiltro:String) = {{
    
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
    routes.ProrrogaController.list(newPage, sortBy, order, currentFilter, currentCampoFiltro, rdioSolicitud)
    
}};
Seq[Any](format.raw/*1.170*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*6.42*/("""
"""),format.raw/*31.2*/("""

"""),format.raw/*35.37*/("""
"""),format.raw/*40.2*/("""


"""),_display_(/*43.2*/main/*43.6*/{_display_(Seq[Any](format.raw/*43.7*/("""
	"""),format.raw/*44.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" > 
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
					<ol class="breadcrumb">
					  <li>Recursos</li>
					  <li class="active">Prórrogas</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
					<h3>Prórrogas</h3>
									
					"""),_display_(/*57.7*/flashes()),format.raw/*57.16*/("""
					
				    """),format.raw/*59.9*/("""<div id="actions">
				        <form action=""""),_display_(/*60.28*/link(0, "recurso.titulo", "recurso.titulo")),format.raw/*60.71*/("""" method="GET" id="frmFiltro">       
				            <input type="search" id="searchbox" name="f" value=""""),_display_(/*61.70*/currentFilter),format.raw/*61.83*/("""" placeholder="Filtrar solicitud por ..."/>
				            <select name ="c" id="c" >
								<option value="algo">Campos de filtrado</option>
				            	<option value="recurso.titulo" """),_display_(/*64.50*/if(currentCampoFiltro=="recurso.titulo")/*64.90*/{_display_(Seq[Any](format.raw/*64.91*/("""selected""")))}),format.raw/*64.100*/(""">Título</option>
				            	<option value="numcontrol" """),_display_(/*65.46*/if(currentCampoFiltro=="numcontrol")/*65.82*/{_display_(Seq[Any](format.raw/*65.83*/("""selected""")))}),format.raw/*65.92*/(""">Clave de control</option>
				            	<option value="niveleducativo.descripcion" """),_display_(/*66.62*/if(currentCampoFiltro=="niveleducativo.descripcion")/*66.114*/{_display_(Seq[Any](format.raw/*66.115*/("""selected""")))}),format.raw/*66.124*/(""">Nivel de conocimiento</option>
				            	<option value="areaconocimiento.descripcion" """),_display_(/*67.64*/if(currentCampoFiltro=="areaconocimiento.descripcion")/*67.118*/{_display_(Seq[Any](format.raw/*67.119*/("""selected""")))}),format.raw/*67.128*/(""">Área del conocimiento</option>
				            	<option value="unidadacademica.nombre" """),_display_(/*68.58*/if(currentCampoFiltro=="unidadacademica.nombre")/*68.106*/{_display_(Seq[Any](format.raw/*68.107*/("""selected""")))}),format.raw/*68.116*/(""">Unidad académica</option>
				            	<option value="recurso.estado.descripcion" """),_display_(/*69.62*/if(currentCampoFiltro=="recurso.estado.descripcion")/*69.114*/{_display_(Seq[Any](format.raw/*69.115*/("""selected""")))}),format.raw/*69.124*/(""">Estado</option>
				            	<option value="recursoevaluadores.evaluador.personal.nombre" """),_display_(/*70.80*/if(currentCampoFiltro=="recursoevaluadores.evaluador.personal.nombre")/*70.150*/{_display_(Seq[Any](format.raw/*70.151*/("""selected""")))}),format.raw/*70.160*/(""">Evaluador</option>
				            </select>
				            
				            <input type="radio" name="rdioSolicitud" value=-1  """),_display_(/*73.69*/if(rdioSolicitud.toString=="-1")/*73.101*/{_display_(Seq[Any](format.raw/*73.102*/("""checked""")))}),format.raw/*73.110*/(""">Todos
				            <input type="radio" name="rdioSolicitud" value=0  """),_display_(/*74.68*/if(rdioSolicitud==0)/*74.88*/{_display_(Seq[Any](format.raw/*74.89*/("""checked""")))}),format.raw/*74.97*/(""">Sin solicitud de prórroga 
				            <input type="radio" name="rdioSolicitud" value=1  """),_display_(/*75.68*/if(rdioSolicitud==1)/*75.88*/{_display_(Seq[Any](format.raw/*75.89*/("""checked""")))}),format.raw/*75.97*/(""">Con solicitud de prórroga
				            
				            <input type="submit" id="searchsubmit" value="Filtrar" class="btn btn-primary btn-xs">
				        </form>        
				    </div>

				"""),_display_(/*81.6*/if(currentPage != null)/*81.29*/{_display_(Seq[Any](format.raw/*81.30*/("""	
					"""),_display_(/*82.7*/if(currentPage.getTotalRowCount == 0)/*82.44*/ {_display_(Seq[Any](format.raw/*82.46*/("""
						"""),format.raw/*83.7*/("""<div class="well">
							<em>No existen registros</em>
						</div>
						""")))}/*86.9*/else/*86.14*/{_display_(Seq[Any](format.raw/*86.15*/("""
					        """),format.raw/*87.14*/("""<div class="table-responsive">
								<table class="table table-striped table-bordered table-condensed">
									<thead>
										<tr>
											"""),_display_(/*91.13*/header("recurso.titulo", "Título")),format.raw/*91.47*/("""
											"""),_display_(/*92.13*/header("numcontrol", "Clave de control")),format.raw/*92.53*/("""                    
											"""),_display_(/*93.13*/header("auditinsert","Fecha registro web")),format.raw/*93.55*/("""
											"""),_display_(/*94.13*/header("auditinsert","Fecha límite inicial")),format.raw/*94.57*/("""
											"""),_display_(/*95.13*/header("recurso.estado.descripcion", "Estado")),format.raw/*95.59*/("""
											"""),format.raw/*96.12*/("""<th>Evaluador</th>
											<th>Aspecto</th>
											<th>Prórrogas</th>
											<th>Sol. pŕorroga</th>

										</tr>
									</thead>
									<tbody>
					
										"""),_display_(/*105.12*/for((re,ire) <- currentPage.getList.zipWithIndex) yield /*105.61*/ {_display_(Seq[Any](format.raw/*105.63*/("""
											"""),format.raw/*106.12*/("""<tr>
												<td><a href="/reporte/cesoe/"""),_display_(/*107.42*/re/*107.44*/.recurso.id),format.raw/*107.55*/("""">"""),_display_(/*107.58*/re/*107.60*/.recurso.titulo),format.raw/*107.75*/("""</a></td>
												<td>"""),_display_(/*108.18*/re/*108.20*/.recurso.numcontrol),format.raw/*108.39*/("""</td>                        
												<td>"""),_display_(/*109.18*/re/*109.20*/.recurso.auditinsert.format("dd/MM/yyyy")),format.raw/*109.61*/("""</td>
												<td>"""),_display_(/*110.18*/re/*110.20*/.recurso.evaluacionFecha.fechalimite.format("dd/MM/yyyy")),format.raw/*110.77*/("""</td>
												<td>"""),_display_(/*111.18*/re/*111.20*/.recurso.estado.descripcion),format.raw/*111.47*/("""</td>
												
												
												<td>"""),_display_(/*114.18*/re/*114.20*/.evaluador.personal.nombreCompleto),format.raw/*114.54*/("""</td>
												<td>"""),_display_(/*115.18*/re/*115.20*/.aspecto.descripcion),format.raw/*115.40*/("""</td>
												<td>
												"""),_display_(/*117.14*/if(re.prorrogas.isEmpty)/*117.38*/{_display_(Seq[Any](format.raw/*117.39*/("""
													"""),format.raw/*118.14*/("""<a class="btn btn-primary btn-block" href="javascript:editarProrroga("""),_display_(/*118.84*/re/*118.86*/.id),format.raw/*118.89*/(""", 0)" role="button">Agregar</a>
												""")))}/*119.15*/else/*119.20*/{_display_(Seq[Any](format.raw/*119.21*/("""
												    """),_display_(/*120.18*/if(re.prorrogas.last.autorizado==true)/*120.56*/{_display_(Seq[Any](format.raw/*120.57*/("""
														"""),_display_(/*121.16*/re/*121.18*/.prorrogas.last.fecha.format("dd/MM/YYYY")),format.raw/*121.60*/("""
														"""),format.raw/*122.15*/("""<a class="btn btn-primary btn-block" href="javascript:editarProrroga("""),_display_(/*122.85*/re/*122.87*/.id),format.raw/*122.90*/(""", 0)" role="button">Editar</a>
													""")))}),format.raw/*123.15*/("""
												""")))}),format.raw/*124.14*/("""												
												"""),format.raw/*125.13*/("""</td>
												
												<td>
													"""),_display_(/*128.15*/if(!re.prorrogas.isEmpty)/*128.40*/{_display_(Seq[Any](format.raw/*128.41*/("""
														"""),_display_(/*129.16*/for(x <- re.prorrogas) yield /*129.38*/{_display_(Seq[Any](format.raw/*129.39*/("""
															"""),_display_(/*130.17*/if(x.autorizado==false)/*130.40*/{_display_(Seq[Any](format.raw/*130.41*/("""
																"""),format.raw/*131.17*/("""<a class="btn btn-primary btn-warning" href="javascript:editarProrroga("""),_display_(/*131.89*/re/*131.91*/.id),format.raw/*131.94*/(""", """),_display_(/*131.97*/x/*131.98*/.ndias),format.raw/*131.104*/(""")" role="button">Solicitud</a><br>
															""")))}),format.raw/*132.17*/("""
														""")))}),format.raw/*133.16*/("""
													""")))}),format.raw/*134.15*/("""												
												"""),format.raw/*135.13*/("""</td>
												
												

											
											</tr>
											

											
											
										""")))}),format.raw/*145.12*/("""
					
									"""),format.raw/*147.10*/("""</tbody>
								</table>
							</div>
					        <div id="pagination" class="pagination">
					            <ul>
					                """),_display_(/*152.23*/if(currentPage.hasPrev)/*152.46*/ {_display_(Seq[Any](format.raw/*152.48*/("""
					                    """),format.raw/*153.26*/("""<li class="prev">
					                        <a href=""""),_display_(/*154.40*/link(currentPage.getPageIndex - 1, null, currentCampoFiltro)),format.raw/*154.100*/("""">&larr; Anterior</a>
					                    </li>
					                """)))}/*156.24*/else/*156.29*/{_display_(Seq[Any](format.raw/*156.30*/("""
					                    """),format.raw/*157.26*/("""<li class="prev disabled">
					                        <a>&larr; Anterior</a>
					                    </li>
					                """)))}),format.raw/*160.23*/("""
					                """),format.raw/*161.22*/("""<li class="current">
					                    <a>Mostrando registros del """),_display_(/*162.54*/currentPage/*162.65*/.getDisplayXtoYofZ(" al "," de un total de ")),format.raw/*162.110*/("""</a>
					                </li>
					                """),_display_(/*164.23*/if(currentPage.hasNext)/*164.46*/ {_display_(Seq[Any](format.raw/*164.48*/("""
					                    """),format.raw/*165.26*/("""<li class="next">
					                        <a href=""""),_display_(/*166.40*/link(currentPage.getPageIndex + 1, null, currentCampoFiltro)),format.raw/*166.100*/("""">Siguiente &rarr;</a>
					                    </li>
					                """)))}/*168.24*/else/*168.29*/{_display_(Seq[Any](format.raw/*168.30*/("""
					                    """),format.raw/*169.26*/("""<li class="next disabled">
					                        <a>Siguiente &rarr;</a>
					                    </li>
					                """)))}),format.raw/*172.23*/("""
					            """),format.raw/*173.18*/("""</ul>
					        </div>
						
					 		<form id="frmAux"></form> 	
						""")))}),format.raw/*177.8*/("""			
					""")))}),format.raw/*178.7*/("""	    
				"""),format.raw/*179.5*/("""</div>
			</div>
			
			
			

	
			
	</div>

""")))}),format.raw/*189.2*/("""

"""),format.raw/*191.1*/("""<script type="text/javascript">

	$("#frmFiltro").on("submit",function(accion)"""),format.raw/*193.46*/("""{"""),format.raw/*193.47*/("""
		"""),format.raw/*194.3*/("""if ($("#c option:selected").val() == "algo" && $("#searchbox").val()!="")"""),format.raw/*194.76*/("""{"""),format.raw/*194.77*/("""
			"""),format.raw/*195.4*/("""alert("Seleccione de la lista de valores");
			accion.preventDefault();
		"""),format.raw/*197.3*/("""}"""),format.raw/*197.4*/("""		
	"""),format.raw/*198.2*/("""}"""),format.raw/*198.3*/(""");
	
	
	function agregarProrroga(idRecEv, nd)"""),format.raw/*201.39*/("""{"""),format.raw/*201.40*/("""		
		"""),format.raw/*202.3*/("""$("#frmAux").attr("method","GET");		
		$("#frmAux").attr("action","/prorrogaCreate/"+idRecEv+"/"+nd);
		$("#frmAux").submit();
	"""),format.raw/*205.2*/("""}"""),format.raw/*205.3*/("""
	
	"""),format.raw/*207.2*/("""function editarProrroga(idRecEv, nd)"""),format.raw/*207.38*/("""{"""),format.raw/*207.39*/("""	
		"""),format.raw/*208.3*/("""$("#frmAux").attr("method","GET");
		$("#frmAux").attr("action","/prorrogaEdit/"+idRecEv+"/"+nd);
		$("#frmAux").submit();
	"""),format.raw/*211.2*/("""}"""),format.raw/*211.3*/("""
	
	
"""),format.raw/*214.1*/("""</script>
"""))}
  }

  def render(currentPage:com.avaje.ebean.Page[Recursoevaluador],currentSortBy:String,currentOrder:String,currentFilter:String,currentCampoFiltro:String,rdioSolicitud:Int): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,currentCampoFiltro,rdioSolicitud)

  def f:((com.avaje.ebean.Page[Recursoevaluador],String,String,String,String,Int) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,currentCampoFiltro,rdioSolicitud) => apply(currentPage,currentSortBy,currentOrder,currentFilter,currentCampoFiltro,rdioSolicitud)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Prorrogas/list.scala.html
                  HASH: c765305cb913bb8e1b67ffbf35106bc75cb53d46
                  MATRIX: 796->1|1051->1040|1065->1046|1172->1076|1204->1081|1243->1093|1255->1096|1293->1113|1322->1114|1357->1122|1391->1148|1478->1212|1533->1240|1586->1272|1616->1275|1642->1280|1680->315|1691->319|2331->169|2358->187|2386->313|2414->928|2444->1038|2472->1296|2502->1300|2514->1304|2552->1305|2581->1307|3012->1712|3042->1721|3084->1736|3157->1782|3221->1825|3355->1932|3389->1945|3609->2138|3658->2178|3697->2179|3738->2188|3827->2250|3872->2286|3911->2287|3951->2296|4066->2384|4128->2436|4168->2437|4209->2446|4331->2541|4395->2595|4435->2596|4476->2605|4592->2694|4650->2742|4690->2743|4731->2752|4846->2840|4908->2892|4948->2893|4989->2902|5112->2998|5192->3068|5232->3069|5273->3078|5431->3209|5473->3241|5513->3242|5553->3250|5654->3324|5683->3344|5722->3345|5761->3353|5883->3448|5912->3468|5951->3469|5990->3477|6212->3673|6244->3696|6283->3697|6317->3705|6363->3742|6403->3744|6437->3751|6531->3828|6544->3833|6583->3834|6625->3848|6802->3998|6857->4032|6897->4045|6958->4085|7018->4118|7081->4160|7121->4173|7186->4217|7226->4230|7293->4276|7333->4288|7541->4468|7607->4517|7648->4519|7689->4531|7763->4577|7775->4579|7808->4590|7839->4593|7851->4595|7888->4610|7943->4637|7955->4639|7996->4658|8071->4705|8083->4707|8146->4748|8197->4771|8209->4773|8288->4830|8339->4853|8351->4855|8400->4882|8477->4931|8489->4933|8545->4967|8596->4990|8608->4992|8650->5012|8714->5048|8748->5072|8788->5073|8831->5087|8929->5157|8941->5159|8966->5162|9031->5208|9045->5213|9085->5214|9131->5232|9179->5270|9219->5271|9263->5287|9275->5289|9339->5331|9383->5346|9481->5416|9493->5418|9518->5421|9595->5466|9641->5480|9695->5505|9773->5555|9808->5580|9848->5581|9892->5597|9931->5619|9971->5620|10016->5637|10049->5660|10089->5661|10135->5678|10235->5750|10247->5752|10272->5755|10303->5758|10314->5759|10343->5765|10426->5816|10474->5832|10521->5847|10575->5872|10717->5982|10762->5998|10928->6136|10961->6159|11002->6161|11057->6187|11142->6244|11225->6304|11320->6380|11334->6385|11374->6386|11429->6412|11593->6544|11644->6566|11746->6640|11767->6651|11835->6696|11917->6750|11950->6773|11991->6775|12046->6801|12131->6858|12214->6918|12310->6995|12324->7000|12364->7001|12419->7027|12584->7160|12631->7178|12738->7254|12779->7264|12817->7274|12894->7320|12924->7322|13031->7400|13061->7401|13092->7404|13194->7477|13224->7478|13256->7482|13358->7556|13387->7557|13419->7561|13448->7562|13522->7607|13552->7608|13585->7613|13741->7741|13770->7742|13802->7746|13867->7782|13897->7783|13929->7787|14081->7911|14110->7912|14143->7917
                  LINES: 26->1|28->36|28->36|30->36|31->37|31->37|31->37|31->37|31->37|31->37|31->37|31->37|32->38|32->38|32->38|32->38|34->7|34->7|59->1|60->3|61->6|62->31|64->35|65->40|68->43|68->43|68->43|69->44|82->57|82->57|84->59|85->60|85->60|86->61|86->61|89->64|89->64|89->64|89->64|90->65|90->65|90->65|90->65|91->66|91->66|91->66|91->66|92->67|92->67|92->67|92->67|93->68|93->68|93->68|93->68|94->69|94->69|94->69|94->69|95->70|95->70|95->70|95->70|98->73|98->73|98->73|98->73|99->74|99->74|99->74|99->74|100->75|100->75|100->75|100->75|106->81|106->81|106->81|107->82|107->82|107->82|108->83|111->86|111->86|111->86|112->87|116->91|116->91|117->92|117->92|118->93|118->93|119->94|119->94|120->95|120->95|121->96|130->105|130->105|130->105|131->106|132->107|132->107|132->107|132->107|132->107|132->107|133->108|133->108|133->108|134->109|134->109|134->109|135->110|135->110|135->110|136->111|136->111|136->111|139->114|139->114|139->114|140->115|140->115|140->115|142->117|142->117|142->117|143->118|143->118|143->118|143->118|144->119|144->119|144->119|145->120|145->120|145->120|146->121|146->121|146->121|147->122|147->122|147->122|147->122|148->123|149->124|150->125|153->128|153->128|153->128|154->129|154->129|154->129|155->130|155->130|155->130|156->131|156->131|156->131|156->131|156->131|156->131|156->131|157->132|158->133|159->134|160->135|170->145|172->147|177->152|177->152|177->152|178->153|179->154|179->154|181->156|181->156|181->156|182->157|185->160|186->161|187->162|187->162|187->162|189->164|189->164|189->164|190->165|191->166|191->166|193->168|193->168|193->168|194->169|197->172|198->173|202->177|203->178|204->179|214->189|216->191|218->193|218->193|219->194|219->194|219->194|220->195|222->197|222->197|223->198|223->198|226->201|226->201|227->202|230->205|230->205|232->207|232->207|232->207|233->208|236->211|236->211|239->214
                  -- GENERATED --
              */
          