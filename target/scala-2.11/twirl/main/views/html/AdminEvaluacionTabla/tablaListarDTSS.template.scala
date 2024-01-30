
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
object tablaListarDTSS extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template9[TreeSet[Long],List[Aspecto],List[ClasificadorCriterio1],List[ClasificadorCriterio2],List[ClasificadorCriterio3],EvaluacionTablaVersion,List[EvaluacionTablaVersion],Int,List[ClasificadorEjemplo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(reactivos:TreeSet[Long], aspectos:List[Aspecto], 
c1:List[ClasificadorCriterio1], c2:List[ClasificadorCriterio2], c3:List[ClasificadorCriterio3], 
version:EvaluacionTablaVersion, versiones:List[EvaluacionTablaVersion],
registros:Int,
tiposrecursos:List[ClasificadorEjemplo]
):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import play.api.libs.json.Json
def /*10.2*/encabezadosTabla/*10.18*/():play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.22*/("""
                                 """),format.raw/*11.34*/("""<thead>
                                     <tr>
                                         <th rowspan="3" style="vertical-align:middle">Id</th>
                                         <th rowspan="3" style="vertical-align:middle">Reactivo</th>
                                         <th rowspan="3" style="vertical-align:middle">Aspecto</th>
                                     </tr>
                                     <tr>
                                         """),_display_(/*18.43*/for(tc1<-c1) yield /*18.55*/{_display_(Seq[Any](format.raw/*18.56*/("""
                                             """),format.raw/*19.46*/("""<th style="text-align:center" colspan=""""),_display_(/*19.86*/c2/*19.88*/.filter(_.criterio1.id == tc1.id).length),format.raw/*19.128*/("""">"""),_display_(/*19.131*/tc1/*19.134*/.descripcion),format.raw/*19.146*/("""</th>
                                         """)))}),format.raw/*20.43*/("""
                                         """),format.raw/*21.42*/("""<td></td>
                                     </tr> 
                                     <tr>
                                        """),_display_(/*24.42*/for(tc1<-c1) yield /*24.54*/{_display_(Seq[Any](format.raw/*24.55*/("""
                                             """),_display_(/*25.47*/for(tc2<-c2.filter(_.criterio1.id == tc1.id)) yield /*25.92*/{_display_(Seq[Any](format.raw/*25.93*/("""
                                                 """),format.raw/*26.50*/("""<th style="text-align:center; vertical-align: middle;">"""),_display_(/*26.106*/tc2/*26.109*/.descripcion),format.raw/*26.121*/("""</th>
                                             """)))}),format.raw/*27.47*/("""
                                         """)))}),format.raw/*28.43*/("""
                                      """),format.raw/*29.39*/("""<td></td>
                                     </tr>                                     
                                </thead>
""")))};
Seq[Any](format.raw/*6.2*/("""
"""),format.raw/*9.1*/("""
"""),format.raw/*32.2*/("""



"""),_display_(/*36.2*/main/*36.6*/{_display_(Seq[Any](format.raw/*36.7*/("""
	"""),format.raw/*37.2*/("""<style>
	.filtrado, mark  """),format.raw/*38.19*/("""{"""),format.raw/*38.20*/("""
	    """),format.raw/*39.6*/("""background-color:#ffffcc !important;  
	"""),format.raw/*40.2*/("""}"""),format.raw/*40.3*/("""
	"""),format.raw/*41.2*/("""</style>
	
    <link rel="stylesheet" media="screen" href=""""),_display_(/*43.50*/routes/*43.56*/.Assets.at("lib/datatables/css/dataTables.bootstrap.min.css")),format.raw/*43.117*/(""""/>
   <script src=""""),_display_(/*44.18*/routes/*44.24*/.Assets.at("jQuery-Selectric/public/jquery.selectric.min.js")),format.raw/*44.85*/("""" type="text/javascript"></script>   
	<link rel="stylesheet" media="screen" href=""""),_display_(/*45.47*/routes/*45.53*/.Assets.at("jQuery-Selectric/public/selectric.css")),format.raw/*45.104*/(""""/>
	
	<link rel="stylesheet" media="screen" href=""""),_display_(/*47.47*/routes/*47.53*/.Assets.at("lib/datatables-buttons/css/buttons.dataTables.min.css")),format.raw/*47.120*/(""""/>
    
    
    
	<div class=container-fluid style="background-color: white; padding: 10px; heigth: 100%;" >
			<div class="row" style="padding-bottom: 2px">
				<div class="col-lg-12">
					<ol class="breadcrumb">registros
					  <li>Catálogos</li>
					  <li class="active">Instrumento de evaluación</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12" style="height: 100%">
					<div id="mensaje" class="center-block" >
						<div >Cargando, por favor espere... <i class="fa fa-refresh fa-spin fa-lg" style="font-size: 30px"></i></div>						
					</div>				
					<div id="progreso"></div>
				
				    """),_display_(/*67.10*/flashes()),format.raw/*67.19*/("""				    

					"""),format.raw/*69.6*/("""<div style="display: none;" id="principal">



					<!-- Modal -->
					"""),_display_(/*74.7*/form(CSRF(routes.AdminEvaluacionTablaController.agregarReactivo()), 'id -> "frmModal2")/*74.94*/ {_display_(Seq[Any](format.raw/*74.96*/("""
						"""),format.raw/*75.7*/("""<input type="hidden" value=""""),_display_(/*75.36*/version/*75.43*/.id),format.raw/*75.46*/("""" name="version"></input>	
						<div class="modal fade modal-wide" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
						  <div class="modal-dialog">
						    <div class="modal-content">
						      <div class="modal-header">
						        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						        <h4 class="modal-title" >Agregar reactivo al instrumento de evaluación en la versión """),_display_(/*81.101*/version/*81.108*/.version),format.raw/*81.116*/("""</h4>
						      </div>
						      <div class="modal-body" id="modalBody2" style="height: 60em">
									<input type="hidden" value=""""),_display_(/*84.39*/version/*84.46*/.id),format.raw/*84.49*/("""" name="otro"></input>									
									<select  name="reactivo" id ="reactivo"></select>
									<div id="nuevoReactivo" style="display: none;">
										<label>Nuevo texto de reactivo</label>
										<textarea name="nuevoReactivo" style="min-width: 100%" rows="4"></textarea>
									</div>
									<div id="campos">
									   <table class="table table-bordered table-striped" id="tablaAgregarReactivo"  style="width: 100%">
			                                 <thead>
			                                     <tr>
			                                         <th rowspan="3" style="vertical-align:middle">Aspecto</th>
			                                     </tr>
			                                     <tr>
			                                         """),_display_(/*97.46*/for(tc1<-c1) yield /*97.58*/{_display_(Seq[Any](format.raw/*97.59*/("""
			                                             """),format.raw/*98.49*/("""<th style="text-align:center" colspan=""""),_display_(/*98.89*/c2/*98.91*/.filter(_.criterio1.id == tc1.id).length),format.raw/*98.131*/("""">"""),_display_(/*98.134*/tc1/*98.137*/.descripcion),format.raw/*98.149*/("""</th>
			                                         """)))}),format.raw/*99.46*/("""
			                                     """),format.raw/*100.41*/("""</tr> 
			                                     <tr>
			                                        """),_display_(/*102.45*/for(tc1<-c1) yield /*102.57*/{_display_(Seq[Any](format.raw/*102.58*/("""
			                                             """),_display_(/*103.50*/for(tc2<-c2.filter(_.criterio1.id == tc1.id)) yield /*103.95*/{_display_(Seq[Any](format.raw/*103.96*/("""
			                                                 """),format.raw/*104.53*/("""<th style="text-align:center; vertical-align: middle;">"""),_display_(/*104.109*/tc2/*104.112*/.descripcion),format.raw/*104.124*/("""</th>
			                                             """)))}),format.raw/*105.50*/("""
			                                         """)))}),format.raw/*106.46*/("""
			                                     """),format.raw/*107.41*/("""</tr>                                     
			                                </thead>
			                                <tbody></tbody>									   
								       </table>
									</div>								
						      </div>
						      <div class="modal-footer">							      	
						        <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
						        <button type="submit" class="btn btn-primary">Agregar reactivo</button>
						        
						        
						      </div>
						    </div>
						  </div>
						</div>	
					""")))}),format.raw/*122.7*/("""
						
						"""),_display_(/*124.8*/form(CSRF(routes.TablaEvaluacionVersionController.versionCreate()))/*124.75*/{_display_(Seq[Any](format.raw/*124.76*/("""	
							"""),format.raw/*125.8*/("""<div class="pull-right">						
								<table id="tablaVersiones" border="1" stye="table-layout: fixed">
									<tr>
										<td style="padding-left: 0.5em; padding-right: 0.5em;">Versiones</td>
											"""),_display_(/*129.13*/for(v <- versiones) yield /*129.32*/{_display_(Seq[Any](format.raw/*129.33*/("""
													"""),format.raw/*130.14*/("""<td align="center "style="padding-left: 0.5em;padding-right: 0.5em; min-width: 2.5em;">
														<a href=""""),_display_(/*131.25*/routes/*131.31*/.AdminEvaluacionTablaController.listarTabla(v.id)),format.raw/*131.80*/("""">
															"""),_display_(/*132.17*/v/*132.18*/.version),format.raw/*132.26*/("""														
														"""),format.raw/*133.15*/("""</a>
														<div id="divCandado"""),_display_(/*134.35*/v/*134.36*/.id),format.raw/*134.39*/("""">
														
															"""),_display_(/*136.17*/if(v.numEvaluacionRespuestas != 0)/*136.51*/{_display_(Seq[Any](format.raw/*136.52*/("""
																"""),format.raw/*137.17*/("""<a href="javascript:toggleTabla("""),_display_(/*137.50*/v/*137.51*/.id),format.raw/*137.54*/(""")" data-toggle="popover" role ="button" tabindex="0" title="Versión cerrada" data-content="No es posible agregar o eliminar reactivos en una versión cerrada. De click sobre el candado para abrir o cerrar esta versión." data-trigger="hover">														
																	<i class="fa fa-lock"></i>
																</a>
															
															""")))}/*141.18*/else/*141.23*/{_display_(Seq[Any](format.raw/*141.24*/("""
																"""),_display_(/*142.18*/if(v.terminado.compareTo("N")==0 )/*142.52*/{_display_(Seq[Any](format.raw/*142.53*/("""
																	"""),format.raw/*143.18*/("""<a href="javascript:toggleTabla("""),_display_(/*143.51*/v/*143.52*/.id),format.raw/*143.55*/(""")" data-toggle="popover" role ="button" tabindex="0" title="Versión abierta" data-content="No es posible agregar o eliminar reactivos en una versión cerrada. De click sobre el candado para abrir o cerrar esta versión." data-trigger="hover">														
																		<i class="fa fa-unlock"></i>
																	</a>															
																""")))}/*146.19*/else/*146.24*/{_display_(Seq[Any](format.raw/*146.25*/("""
																	"""),_display_(/*147.19*/if(v.terminado.compareTo("S")==0 )/*147.53*/{_display_(Seq[Any](format.raw/*147.54*/("""
																		"""),format.raw/*148.19*/("""<a href="javascript:toggleTabla("""),_display_(/*148.52*/v/*148.53*/.id),format.raw/*148.56*/(""")" data-toggle="popover" role ="button" tabindex="0" title="Versión cerrada" data-content="No es posible agregar o eliminar reactivos en una versión cerrada. De click sobre el candado para abrir o cerrar esta versión." data-trigger="hover">														
																			<i class="fa fa-lock"></i>
																		</a>
																	""")))}),format.raw/*151.19*/("""																
																""")))}),format.raw/*152.18*/("""
															""")))}),format.raw/*153.17*/("""
															


																
														"""),format.raw/*158.15*/("""</div>																									
													</td>								
											""")))}),format.raw/*160.13*/("""
										"""),format.raw/*161.11*/("""<td style="padding-left: 0.5em; padding-right: 0.5em;"><a class="btn btn-primary btn-block" onclick="muestraModal()" role="button">Agregar versión  <i class="fa fa-plus"></i></a></td>
									</tr>
								</table>
							</div>
							<!-- Modal -->
							<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
							  <div class="modal-dialog">
							    <div class="modal-content">
							      <div class="modal-header">
							        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							        <h4 class="modal-title" id="myModalLabel">Creacion de una nueva versión</h4>
							      </div>
							      <div class="modal-body">
									
										Se creará una nueva versión del instrumento de evaluación<br><br>
										Puede crear una versión a partir de cero, o a partir de una copia de la versión que actualmente esta mostradose, para lograrlo marque la casilla "Iniciar como una copia de la versión X".									
									
							      </div>
							      <div class="modal-footer">
							      	<div class="modalPie"> <input type="checkbox" name="cbxcopia" value="sí"></input>    Iniciar como una copia de la versión """),_display_(/*180.138*/version/*180.145*/.version),format.raw/*180.153*/("""</div>
							      	<input type="hidden" name="versionEnPantalla" value=""""),_display_(/*181.69*/version/*181.76*/.version),format.raw/*181.84*/("""" >
							        <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
							        <button type="submit" class="btn btn-primary">Agregar versión</button>
							      </div>
							    </div>
							  </div>
							</div>	

						""")))}),format.raw/*189.8*/("""						
					
						"""),format.raw/*191.7*/("""<h3>Instrumento de evaluación para la versión """),_display_(/*191.54*/version/*191.61*/.version),format.raw/*191.69*/("""</h3>


						<div class="btn-group" data-toggle="buttons" role="group">
						<label class="btn btn-default active">
							<input name="uno" type="radio" value="*" checked> Todos los aspectos
						</label>
						<label class="btn btn-default">
							<input name="uno" type="radio" value="1" > Pedagógicos
						</label>
						<label class="btn btn-default">
							<input name="uno" type="radio" value="2" > Editoriales
						</label>
						<label class="btn btn-default">
							<input name="uno" type="radio" value="3" > Técnicos
						</label>
						<label class="btn btn-default">
							<input name="uno" type="radio" value="4" > Diseño gráfico
						</label>
						</div>					


						"""),_display_(/*213.8*/form(CSRF(routes.AdminEvaluacionTablaController.editTablaEvaluacion(version.id)),  'id->"frmTE" )/*213.105*/ {_display_(Seq[Any](format.raw/*213.107*/("""		
							"""),format.raw/*214.8*/("""<table class="table table-bordered table-striped" id="tablaTabla"  style="width: 100%">
                                """),_display_(/*215.34*/encabezadosTabla()),format.raw/*215.52*/("""

							"""),format.raw/*217.8*/("""</table>
				        	<div class="row">
				        		<div class="col-sm-12">
						        	<div class="row">
						        		<div class="col-sm-4">
						        			<input type="button" onclick="agregarReactivo()" class="btn btn-default btn-block" id="btnAgregarReactivo" value="Agregar reactivo">
						        		<!-- 	
						        			<input type="button" onclick="botonTempo1()" class="btn btn-default btn-block" value="Marcar criterios">
						        			<input type="button" onclick="botonTempo2()" class="btn btn-default btn-block" value="Marcar tr">
						        			-->
						        			
				        				</div>


			        				</div>
					        	</div>
				        	</div>
					            

						""")))}),format.raw/*236.8*/("""
					"""),format.raw/*237.6*/("""</div>
			</div>
		</div>
	</div>
	

	
""")))}),format.raw/*244.2*/("""


"""),format.raw/*247.1*/("""<script type="text/javascript">
    laTablaDTSS = null;	

	$(function() """),format.raw/*250.15*/("""{"""),format.raw/*250.16*/("""
		"""),format.raw/*251.3*/("""$("#principal").hide();
		$('[data-toggle="popover"]').popover();	
		
        $("#mensaje").hide();
        $("#principal").show(); 
        

        
        $('#tablaTabla thead').find('tr:eq(1) th:eq(0), tr:eq(1) th:eq(1)').css("border-left","2px solid grey").css("border-top","2px solid grey");
        $('#tablaTabla thead').find('tr:eq(1) th:eq(1)').css("border-right","2px solid grey");
        
        $('#tablaTabla thead').find('tr:eq(2) th:eq(0), tr:eq(2) th:eq(3)').css("border-left","2px solid grey");
        $('#tablaTabla thead').find('tr:eq(2) th:eq(5)').css("border-right","2px solid grey");
        
        
        $('#tablaTabla tr').find('td:eq(3), td:eq(6)').css("border-left","2px solid grey");
        $('#tablaTabla tr').find('td:eq(9)').css("border-left","2px solid grey");
	
        
        laTablaDTSS = $('#tablaTabla').DataTable( """),format.raw/*270.51*/("""{"""),format.raw/*270.52*/("""
            """),format.raw/*271.13*/("""pageLength: 1,
            //lengthMenu: [  [1,3, 5, 10, 25, 50, -1], [1,3, 5, 10, 25, 50, "Todos"]   ],   
            lengthChange: false,
            language: """),format.raw/*274.23*/("""{"""),format.raw/*274.24*/("""
                """),format.raw/*275.17*/("""url: """"),_display_(/*275.24*/routes/*275.30*/.Assets.at("Spanish.json")),format.raw/*275.56*/("""" 
			"""),format.raw/*276.4*/("""}"""),format.raw/*276.5*/(""",
            processing: false,
            serverSide: true,
            scrollCollapse: false,
            stateSave: true,
            scrollX: false,
            mark: true,
            autoWidth: true,
            ajax: """),format.raw/*284.19*/("""{"""),format.raw/*284.20*/("""
                """),format.raw/*285.17*/("""url:  "/evaluacionTablaEvaluacionListDTSS",
				"data": function ( d ) """),format.raw/*286.28*/("""{"""),format.raw/*286.29*/("""
					"""),format.raw/*287.6*/("""d.version = """"),_display_(/*287.20*/version/*287.27*/.id),format.raw/*287.30*/("""";
					d.filtroAspecto = $("[name='uno']:checked").val();
 
					// d.custom = $('#myInput').val();
					// etc
            	"""),format.raw/*292.14*/("""}"""),format.raw/*292.15*/(""",				
                contentType: "application/json; charset=utf-8",
                dataType: "json"
            """),format.raw/*295.13*/("""}"""),format.raw/*295.14*/(""",
            rowId: 'reactivoId',
            "columns": [
                """),format.raw/*298.17*/("""{"""),format.raw/*298.18*/(""""data": "reactivoId", sortable: false, search:"""""),format.raw/*298.66*/("""}"""),format.raw/*298.67*/(""",
                """),format.raw/*299.17*/("""{"""),format.raw/*299.18*/(""""data": "reactivo", sortable: false,
					render: $.fn.dataTable.render.text()				
				"""),format.raw/*301.5*/("""}"""),format.raw/*301.6*/(""",
                """),format.raw/*302.17*/("""{"""),format.raw/*302.18*/(""""data": "aspectoId", 
                    "width": "6em",                
                    render: function ( data, type, row, meta ) """),format.raw/*304.64*/("""{"""),format.raw/*304.65*/("""
                    	"""),format.raw/*305.22*/("""data="";
                    	"""),_display_(/*306.23*/for(aspecto<-aspectos) yield /*306.45*/{_display_(Seq[Any](format.raw/*306.46*/("""
                    		"""),format.raw/*307.23*/("""data += '<input type="radio" name="aspecto'+row.reactivoId+'" value="""),_display_(/*307.92*/aspecto/*307.99*/.id),format.raw/*307.102*/(""" """),format.raw/*307.103*/("""required '
                    		if ("""),_display_(/*308.28*/aspecto/*308.35*/.id),format.raw/*308.38*/(""" """),format.raw/*308.39*/("""== row.aspectoId)"""),format.raw/*308.56*/("""{"""),format.raw/*308.57*/("""
                    			"""),format.raw/*309.24*/("""//data+='checked="checked" ';
                    		"""),format.raw/*310.23*/("""}"""),format.raw/*310.24*/("""
							"""),format.raw/*311.8*/("""if ( $("#divCandado"""),_display_(/*311.28*/version/*311.35*/.id),format.raw/*311.38*/(""" """),format.raw/*311.39*/("""> a > i").hasClass("fa-lock")==true )"""),format.raw/*311.76*/("""{"""),format.raw/*311.77*/("""
								"""),format.raw/*312.9*/("""data+=' disabled ';
							"""),format.raw/*313.8*/("""}"""),format.raw/*313.9*/("""
                    		"""),format.raw/*314.23*/("""data +=  '>'+' """),_display_(/*314.39*/aspecto/*314.46*/.descripcion),format.raw/*314.58*/("""<br>';
                    	""")))}),format.raw/*315.23*/("""
                        """),format.raw/*316.25*/("""return data;
                        data="";
                    """),format.raw/*318.21*/("""}"""),format.raw/*318.22*/("""                   
                """),format.raw/*319.17*/("""}"""),format.raw/*319.18*/(""",
                
                
                """),_display_(/*322.18*/for(loopC1 <- 1 to 6) yield /*322.39*/{_display_(Seq[Any](format.raw/*322.40*/("""
                    """),_display_(/*323.22*/if(loopC1 == 1)/*323.37*/{_display_(Seq[Any](format.raw/*323.38*/("""
                    	"""),format.raw/*324.22*/("""{"""),format.raw/*324.23*/(""""data":"reactivoId",
                    		"width": "10em",	
                            render: function ( data, type, row, meta ) """),format.raw/*326.72*/("""{"""),format.raw/*326.73*/("""
                            	"""),format.raw/*327.30*/("""data = enPantalla(row,1,1,1) + enPantalla(row,1,1,2);
                                return data;
                            """),format.raw/*329.29*/("""}"""),format.raw/*329.30*/("""                     
                    	"""),format.raw/*330.22*/("""}"""),format.raw/*330.23*/(""",
		                	//"""),format.raw/*331.22*/("""{"""),format.raw/*331.23*/(""""data": "null", "defaultContent": "<button class='btn btn-danger btn-block btn-xs'>?</button>", sortable: false"""),format.raw/*331.134*/("""}"""),format.raw/*331.135*/(""",
                    """)))}),format.raw/*332.22*/("""
                    """),_display_(/*333.22*/if(loopC1 == 2)/*333.37*/{_display_(Seq[Any](format.raw/*333.38*/("""
                        """),format.raw/*334.25*/("""{"""),format.raw/*334.26*/(""""data":"reactivoId", "width": "10em",
                            render: function ( data, type, row, meta ) """),format.raw/*335.72*/("""{"""),format.raw/*335.73*/("""
                                """),format.raw/*336.33*/("""//data = enPantalla(row,1,2,1) + enPantalla(row,1,2,2) + enPantalla(row,1,2,3);                                      
                                data = enPantalla(row,1,2,3) + enPantalla(row,1,2,4) + enPantalla(row,1,2,5);
                                return data;
                            """),format.raw/*339.29*/("""}"""),format.raw/*339.30*/("""
                        """),format.raw/*340.25*/("""}"""),format.raw/*340.26*/(""",
                    """)))}),format.raw/*341.22*/("""
                    """),_display_(/*342.22*/if(loopC1 == 3)/*342.37*/{_display_(Seq[Any](format.raw/*342.38*/("""
                        """),format.raw/*343.25*/("""{"""),format.raw/*343.26*/(""""data":"reactivoId", "width": "10em",
                            render: function ( data, type, row, meta ) """),format.raw/*344.72*/("""{"""),format.raw/*344.73*/("""
                                """),format.raw/*345.33*/("""data = '<input type="checkbox" id="criterio_'+row.reactivoId+'_1_3_1" name="criterio_'+row.reactivoId+'[]" value="1_3_1"> Curso completo <br>'
                                      +'<input type="checkbox" id="criterio_'+row.reactivoId+'_1_3_2" name="criterio_'+row.reactivoId+'[]" value="1_3_2"> Unidad o módulo <br>'
                                      +'<input type="checkbox" id="criterio_'+row.reactivoId+'_1_3_3" name="criterio_'+row.reactivoId+'[]" value="1_3_3"> Tema <br>'
                                      +'<input type="checkbox" id="criterio_'+row.reactivoId+'_1_3_4" name="criterio_'+row.reactivoId+'[]" value="1_3_4"> Concepto <br>';
                             // data = enPantalla(row,1,3,1) + enPantalla(row,1,3,2) + enPantalla(row,1,3,3) + enPantalla(row,1,3,4);
                                data = enPantalla(row,1,3,6) + enPantalla(row,1,3,7) + enPantalla(row,1,3,8) + enPantalla(row,1,3,9);
                                return data;
                            """),format.raw/*352.29*/("""}"""),format.raw/*352.30*/("""
                        """),format.raw/*353.25*/("""}"""),format.raw/*353.26*/(""",
                    """)))}),format.raw/*354.22*/("""                    
                    """),_display_(/*355.22*/if(loopC1 == 4)/*355.37*/{_display_(Seq[Any](format.raw/*355.38*/("""
                        """),format.raw/*356.25*/("""{"""),format.raw/*356.26*/(""""data":"reactivoId", "width": "10em",
                            render: function ( data, type, row, meta ) """),format.raw/*357.72*/("""{"""),format.raw/*357.73*/("""
                                """),format.raw/*358.33*/("""data = '<input type="checkbox" id="criterio_'+row.reactivoId+'_2_4_5" name="criterio_'+row.reactivoId+'[]" value="2_4_5"> Complejo e integrado<br>'
                                      +'<input type="checkbox" id="criterio_'+row.reactivoId+'_2_4_6" name="criterio_'+row.reactivoId+'[]" value="2_4_6"> Modular o subsistema <br>'
                              //  data = enPantalla(row,2,4,5) + enPantalla(row,2,4,6) ;                                      
                                data = enPantalla(row,2,4,10) + enPantalla(row,2,4,11) ;
                                return data;
                            """),format.raw/*363.29*/("""}"""),format.raw/*363.30*/("""
                        """),format.raw/*364.25*/("""}"""),format.raw/*364.26*/(""",
                    """)))}),format.raw/*365.22*/("""                     
                    """),_display_(/*366.22*/if(loopC1 == 5)/*366.37*/{_display_(Seq[Any](format.raw/*366.38*/("""
                        """),format.raw/*367.25*/("""{"""),format.raw/*367.26*/(""""data":"reactivoId", "width": "10em",
                            render: function ( data, type, row, meta ) """),format.raw/*368.72*/("""{"""),format.raw/*368.73*/("""
                                """),format.raw/*369.33*/("""data = '<input type="checkbox" id="criterio_'+row.reactivoId+'_2_5_5" name="criterio_'+row.reactivoId+'[]" value="2_5_5"> Complejo e integrado<br>'
                                      +'<input type="checkbox" id="criterio_'+row.reactivoId+'_2_5_6" name="criterio_'+row.reactivoId+'[]" value="2_5_6"> Modular o subsistema <br>'
                             //   data = enPantalla(row,2,5,5) + enPantalla(row,2,5,6) ;                                      
                                data = enPantalla(row,2,5,12) + enPantalla(row,2,5,13) ;
                                return data;
                            """),format.raw/*374.29*/("""}"""),format.raw/*374.30*/("""
                        """),format.raw/*375.25*/("""}"""),format.raw/*375.26*/(""",
                    """)))}),format.raw/*376.22*/("""                     
                    """),_display_(/*377.22*/if(loopC1 == 6)/*377.37*/{_display_(Seq[Any](format.raw/*377.38*/("""
                        """),format.raw/*378.25*/("""{"""),format.raw/*378.26*/(""""data":"reactivoId", "width": "10em",
                            render: function ( data, type, row, meta ) """),format.raw/*379.72*/("""{"""),format.raw/*379.73*/("""
                                """),format.raw/*380.33*/("""data = '<input type="checkbox" id="criterio_'+row.reactivoId+'_2_6_5" name="criterio_'+row.reactivoId+'[]" value="2_6_5"> Complejo e integrado<br>'
                                      +'<input type="checkbox" id="criterio_'+row.reactivoId+'_2_6_6" name="criterio_'+row.reactivoId+'[]" value="2_6_6"> Modular o subsistema <br>'
                              //  data = enPantalla(row,2,6,5) + enPantalla(row,2,6,6) ;                                      
                                data = enPantalla(row,2,6,14) + enPantalla(row,2,6,15) ;
                                return data;
                            """),format.raw/*385.29*/("""}"""),format.raw/*385.30*/("""
                        """),format.raw/*386.25*/("""}"""),format.raw/*386.26*/(""",
                    """)))}),format.raw/*387.22*/("""                      
                """)))}),format.raw/*388.18*/("""
				"""),format.raw/*389.5*/("""{"""),format.raw/*389.6*/(""""data":null	,
					render: function ( data, type, row, meta ) """),format.raw/*390.49*/("""{"""),format.raw/*390.50*/("""
						"""),format.raw/*391.7*/("""console.dir(row)
						data='<button type="button" class="btn btn-danger"  name="btnEliminarReactivo'+row.reactivoId+'"  ';
						if ($("#divCandado"""),_display_(/*393.26*/version/*393.33*/.id),format.raw/*393.36*/(""" """),format.raw/*393.37*/("""> a >i").hasClass("fa-lock")==true)"""),format.raw/*393.72*/("""{"""),format.raw/*393.73*/("""
						"""),format.raw/*394.7*/("""data+=" disabled";
						"""),format.raw/*395.7*/("""}"""),format.raw/*395.8*/("""							
						"""),format.raw/*396.7*/("""data+='   >Eliminar</button>';
						return data;		
					"""),format.raw/*398.6*/("""}"""),format.raw/*398.7*/("""	
					"""),format.raw/*399.6*/("""}"""),format.raw/*399.7*/("""
              
              """),format.raw/*401.15*/("""],
            "initComplete": function(e, settings, json)"""),format.raw/*402.56*/("""{"""),format.raw/*402.57*/("""
                """),format.raw/*403.17*/("""$("#tablaTablaUA_wrapper div.row div").removeClass("col-sm-6");
                $("#tablaTablaUA_wrapper div.row div:eq(0)").addClass("col-sm-4");
                $("#tablaTablaUA_wrapper div.row div:eq(2)").addClass("col-sm-8");
                $(".dataTables_filter").css("width","auto");  
                $("input[type='search'].form-control.input-sm").keyup(function()"""),format.raw/*407.81*/("""{"""),format.raw/*407.82*/("""
                    """),format.raw/*408.21*/("""if( $(this).val().length >0 )"""),format.raw/*408.50*/("""{"""),format.raw/*408.51*/("""
                        """),format.raw/*409.25*/("""$(this).addClass("filtrado");
                    """),format.raw/*410.21*/("""}"""),format.raw/*410.22*/(""" """),format.raw/*410.23*/("""else """),format.raw/*410.28*/("""{"""),format.raw/*410.29*/("""
                        """),format.raw/*411.25*/("""$(this).removeClass("filtrado");
                    """),format.raw/*412.21*/("""}"""),format.raw/*412.22*/("""
                """),format.raw/*413.17*/("""}"""),format.raw/*413.18*/(""");   
            """),format.raw/*414.13*/("""}"""),format.raw/*414.14*/("""        
        """),format.raw/*415.9*/("""}"""),format.raw/*415.10*/(""");
	
	





        laTablaDTSS.on( 'draw', function () """),format.raw/*423.45*/("""{"""),format.raw/*423.46*/("""
            """),format.raw/*424.13*/("""// Leer y marcar los radios y checkboxes
            laTablaDTSS.data().each(function(dato)"""),format.raw/*425.51*/("""{"""),format.raw/*425.52*/("""
            	"""),format.raw/*426.14*/("""$("input[type='radio'][name='aspecto"+dato.reactivoId+"'][value='"+dato.aspectoId+"']").prop("checked", true);
                dato.criterios.forEach(function(c)"""),format.raw/*427.51*/("""{"""),format.raw/*427.52*/("""
                	"""),format.raw/*428.18*/("""console.dir(c)
                    $("#criterio_"+dato.reactivoId+"_"+c.c1+"_"+c.c2+"_"+c.c3).prop("checked", true);
                    if(c.trecursos!=undefined)"""),format.raw/*430.47*/("""{"""),format.raw/*430.48*/("""
                    	"""),format.raw/*431.22*/("""c.trecursos.forEach(function(tr)"""),format.raw/*431.54*/("""{"""),format.raw/*431.55*/("""
                    		"""),format.raw/*432.23*/("""$("input[type='checkbox'][name='tiporecurso_"+dato.reactivoId+"_"+c.c1+"_"+c.c2+"_"+c.c3+"[]'][value="+tr.id+"]").prop("checked", true);
                    	"""),format.raw/*433.22*/("""}"""),format.raw/*433.23*/(""");
                    """),format.raw/*434.21*/("""}"""),format.raw/*434.22*/("""
                """),format.raw/*435.17*/("""}"""),format.raw/*435.18*/(""");
            """),format.raw/*436.13*/("""}"""),format.raw/*436.14*/(""");
            
            // Habilita / deshabilita tipos de recursos deacuerdo al c3 correspondiente


            $("[name^='criterio_'][name$='[]']").each(function(index)"""),format.raw/*441.70*/("""{"""),format.raw/*441.71*/("""
            	"""),format.raw/*442.14*/("""valores = $(this).prop("id").substring(9);
            	checado = $(this).prop("checked");   
				$(this).prop("disabled",  $("#divCandado"""),_display_(/*444.46*/version/*444.53*/.id),format.raw/*444.56*/(""" """),format.raw/*444.57*/("""> a >i").hasClass("fa-lock")  );   
				$("[name^='btnEliminarReactivo']").prop("disabled",   $("#divCandado"""),_display_(/*445.74*/version/*445.81*/.id),format.raw/*445.84*/(""" """),format.raw/*445.85*/("""> a >i").hasClass("fa-lock") );


				


				if( """),_display_(/*451.10*/registros),format.raw/*451.19*/(""">0  ||  $("#divCandado"""),_display_(/*451.42*/version/*451.49*/.id),format.raw/*451.52*/(""" """),format.raw/*451.53*/("""> a >i").hasClass("fa-lock")  )    """),format.raw/*451.88*/("""{"""),format.raw/*451.89*/("""      
				  	"""),format.raw/*452.8*/("""$("[name='tiporecurso_"+valores+"[]']").prop("disabled",  true );
					$(this).prop("disabled",  true );
				"""),format.raw/*454.5*/("""}"""),format.raw/*454.6*/("""else """),format.raw/*454.11*/("""{"""),format.raw/*454.12*/("""
            		"""),format.raw/*455.15*/("""$("[name='tiporecurso_"+valores+"[]']").prop("disabled",  !checado );
					$(this).prop("disabled",  false );
				"""),format.raw/*457.5*/("""}"""),format.raw/*457.6*/("""
				
            """),format.raw/*459.13*/("""}"""),format.raw/*459.14*/(""");
            
            
        """),format.raw/*462.9*/("""}"""),format.raw/*462.10*/(""" """),format.raw/*462.11*/(""");       
        
	"""),format.raw/*464.2*/("""}"""),format.raw/*464.3*/(""");
	

	
	
	
	
	function botonTempo1()"""),format.raw/*471.24*/("""{"""),format.raw/*471.25*/("""
		"""),format.raw/*472.3*/("""console.log("marcando todos los criterio3")
		$("[id^='criterio_']:enabled:not(:checked)").each(function()"""),format.raw/*473.63*/("""{"""),format.raw/*473.64*/("""
		"""),format.raw/*474.3*/("""//	$(this).prop('enabled', true);
		//	$(this).attr('selected', false);
			$(this).click();
			var numero = $(this).attr("id").split("_")[1];
			
//			$("[name^='tiporecurso_"+numero+"_']:enabled:not(:checked)").each(function()"""),format.raw/*479.82*/("""{"""),format.raw/*479.83*/("""
	"""),format.raw/*480.2*/("""//					$(this).click();
		//			"""),format.raw/*481.8*/("""}"""),format.raw/*481.9*/(""");
		"""),format.raw/*482.3*/("""}"""),format.raw/*482.4*/(""");

		
	"""),format.raw/*485.2*/("""}"""),format.raw/*485.3*/("""
	

	"""),format.raw/*488.2*/("""function botonTempo2()"""),format.raw/*488.24*/("""{"""),format.raw/*488.25*/("""
		"""),format.raw/*489.3*/("""$("[name^='tiporecurso_']:not(:checked)").each(function()"""),format.raw/*489.60*/("""{"""),format.raw/*489.61*/("""
			"""),format.raw/*490.4*/("""$(this).click();
		"""),format.raw/*491.3*/("""}"""),format.raw/*491.4*/(""");
		
	"""),format.raw/*493.2*/("""}"""),format.raw/*493.3*/("""
		
	
	
	"""),format.raw/*497.2*/("""// Genera el código de las columnas para las tablas
    function enPantalla(row, c1,c2,c3, esReactivoNuevo=false)"""),format.raw/*498.62*/("""{"""),format.raw/*498.63*/("""
        """),format.raw/*499.9*/("""data="";
        row.todosLosCriterios.forEach(function(cs)"""),format.raw/*500.51*/("""{"""),format.raw/*500.52*/("""
        	"""),format.raw/*501.10*/("""console.log(">>>")
        	console.dir(cs)
        	console.log("<<<")
            if ((cs.c1==c1) && (cs.c2==c2) && (cs.c3==c3))"""),format.raw/*504.59*/("""{"""),format.raw/*504.60*/("""
                """),format.raw/*505.17*/("""data+='<div class="checkbox">';   
                data+='<label>';
                if (esReactivoNuevo)"""),format.raw/*507.37*/("""{"""),format.raw/*507.38*/("""
                	"""),format.raw/*508.18*/("""data+= '<input type="checkbox" id="criterio_'+0+'_'+cs.c1+'_'+cs.c2+'_'+cs.c3+'" name="criterio_'+0+'[]" value="'+c1+'_'+c2+'_'+c3+'"';                	
                """),format.raw/*509.17*/("""}"""),format.raw/*509.18*/(""" """),format.raw/*509.19*/("""else """),format.raw/*509.24*/("""{"""),format.raw/*509.25*/("""
                    """),format.raw/*510.21*/("""data+= '<input type="checkbox" id="criterio_'+row.reactivoId+'_'+cs.c1+'_'+cs.c2+'_'+cs.c3+'" name="criterio_'+row.reactivoId+'[]" value="'+c1+'_'+c2+'_'+c3+'"';
                """),format.raw/*511.17*/("""}"""),format.raw/*511.18*/("""
                """),_display_(/*512.18*/if((registros>0) || (version.terminado == "S"))/*512.65*/{_display_(Seq[Any](format.raw/*512.66*/(""" 
                    """),format.raw/*513.21*/("""data+=' disabled="disabled" '; 
                """)))}),format.raw/*514.18*/("""                
                """),format.raw/*515.17*/("""data+='"><strong> '+cs.c3Descripcion+'</strong></label><br>';

                
                if (cs.ejemplos!=undefined)"""),format.raw/*518.44*/("""{"""),format.raw/*518.45*/("""
                	"""),format.raw/*519.18*/("""data+='<div class="form-group">';
	                cs.ejemplos.forEach(function(j)"""),format.raw/*520.49*/("""{"""),format.raw/*520.50*/("""
	                	
	                	"""),format.raw/*522.19*/("""data+='<div class="checkbox">';
	                    data+='<div class="small" style="padding-left: 1em">';
	                    if (esReactivoNuevo)"""),format.raw/*524.42*/("""{"""),format.raw/*524.43*/("""
	                    	"""),format.raw/*525.23*/("""data+='    <input type="checkbox" name="tiporecurso_'+0+"_"+cs.c1+"_"+cs.c2+"_"+cs.c3+'[]" value='+j.id+' ';
	                    """),format.raw/*526.22*/("""}"""),format.raw/*526.23*/(""" """),format.raw/*526.24*/("""else"""),format.raw/*526.28*/("""{"""),format.raw/*526.29*/("""
	                    	"""),format.raw/*527.23*/("""data+='    <input type="checkbox" name="tiporecurso_'+row.reactivoId+"_"+cs.c1+"_"+cs.c2+"_"+cs.c3+'[]" value='+j.id+' ';
	                    """),format.raw/*528.22*/("""}"""),format.raw/*528.23*/("""
		                    """),_display_(/*529.24*/if((registros!=0) || (version.terminado == "S"))/*529.72*/{_display_(Seq[Any](format.raw/*529.73*/(""" 
		                        """),format.raw/*530.27*/("""data+=' disabled="disabled" '; 
		                    """)))}),format.raw/*531.24*/(""" 
		                    """),format.raw/*532.23*/("""data+='/> '+j.tiporecurso;
	                    data+='</div>';
	                    data+='</div>';
	                    data+='<br>';
	                """),format.raw/*536.18*/("""}"""),format.raw/*536.19*/(""");
	                data+='</div>';

                """),format.raw/*539.17*/("""}"""),format.raw/*539.18*/("""
                """),format.raw/*540.17*/("""data+='</div>';   
                data+="<br/><br/>";
                data+='</div>';   
            """),format.raw/*543.13*/("""}"""),format.raw/*543.14*/("""        	
        """),format.raw/*544.9*/("""}"""),format.raw/*544.10*/(""");        
        return data;         	
    """),format.raw/*546.5*/("""}"""),format.raw/*546.6*/("""	

    

	
	"""),format.raw/*551.2*/("""// Cuando se seleccionan los radio de aspecto se graba o borra
    $(document).on("click", "input[type='radio'][name^='aspecto']", function()"""),format.raw/*552.79*/("""{"""),format.raw/*552.80*/("""
    	"""),format.raw/*553.6*/("""nombre = $(this).prop("name");
        numeroReactivo =  nombre.substring( nombre.indexOf("o")+1);   
        console.log(numeroReactivo+"????")
    	
        var o = new Object;   
        o.version = """),format.raw/*558.21*/("""{"""),format.raw/*558.22*/("""id: """"),_display_(/*558.28*/version/*558.35*/.id),format.raw/*558.38*/("""""""),format.raw/*558.39*/("""}"""),format.raw/*558.40*/(""";
        o.reactivo = """),format.raw/*559.22*/("""{"""),format.raw/*559.23*/(""""id": numeroReactivo """),format.raw/*559.44*/("""}"""),format.raw/*559.45*/(""";
        //o.aspecto = """),format.raw/*560.23*/("""{"""),format.raw/*560.24*/("""id: $("[name='aspecto"+numeroReactivo+"']:checked").val()"""),format.raw/*560.81*/("""}"""),format.raw/*560.82*/(""";
        o.aspecto = """),format.raw/*561.21*/("""{"""),format.raw/*561.22*/("""id: $(this).val()"""),format.raw/*561.39*/("""}"""),format.raw/*561.40*/(""";
		if (o.reactivo.id!=0)
        	LlamadaAjaxGrabaInstrumentoAspecto(o);
    """),format.raw/*564.5*/("""}"""),format.raw/*564.6*/(""");



	// Cuando se seleccionan los checkboxes de criterios se graba o borra
    $(document).on("click", "input:checkbox[name^='criterio_']", function()"""),format.raw/*569.76*/("""{"""),format.raw/*569.77*/("""
    	"""),format.raw/*570.6*/("""nombre = $(this).prop("name");
        numeroReactivo =  nombre.substring( nombre.indexOf("_")+1,  nombre.indexOf("[]") );   
        criterios = $(this).val();
        console.log(numeroReactivo)
        console.log(criterios)
        console.log("[name='tiporecurso_"+numeroReactivo+"_"+criterios+"[]']"+"  *   "+!$(this).prop("checked"))
    	$("[name='tiporecurso_"+numeroReactivo+"_"+criterios+"[]']").prop("disabled" ,  !$(this).prop("checked") );
    	if (!$(this).prop("checked"))"""),format.raw/*577.35*/("""{"""),format.raw/*577.36*/("""
    		"""),format.raw/*578.7*/("""$("[name='tiporecurso_"+numeroReactivo+"_"+criterios+"[]']").prop("checked" ,  false );
    	"""),format.raw/*579.6*/("""}"""),format.raw/*579.7*/("""
        """),format.raw/*580.9*/("""var o = new Object;   
        o.version = """),format.raw/*581.21*/("""{"""),format.raw/*581.22*/("""id: """"),_display_(/*581.28*/version/*581.35*/.id),format.raw/*581.38*/("""""""),format.raw/*581.39*/("""}"""),format.raw/*581.40*/(""";
        o.reactivo = """),format.raw/*582.22*/("""{"""),format.raw/*582.23*/(""""id": numeroReactivo """),format.raw/*582.44*/("""}"""),format.raw/*582.45*/(""";
        o.aspecto = """),format.raw/*583.21*/("""{"""),format.raw/*583.22*/("""id: $("[name='aspecto"+numeroReactivo+"']:checked").val()"""),format.raw/*583.79*/("""}"""),format.raw/*583.80*/(""";
        o.criterio1 = """),format.raw/*584.23*/("""{"""),format.raw/*584.24*/("""id:   criterios.split("_")[0]  """),format.raw/*584.55*/("""}"""),format.raw/*584.56*/(""";   
        o.criterio2 = """),format.raw/*585.23*/("""{"""),format.raw/*585.24*/("""id:   criterios.split("_")[1]  """),format.raw/*585.55*/("""}"""),format.raw/*585.56*/(""";
        o.criterio3 = """),format.raw/*586.23*/("""{"""),format.raw/*586.24*/("""id:   criterios.split("_")[2]  """),format.raw/*586.55*/("""}"""),format.raw/*586.56*/(""";
		o.borrado = !$(this).prop("checked");
		if (o.reactivo.id!=0)
        	LlamadaAjaxGrabaInstrumentoCriterio(o);
    """),format.raw/*590.5*/("""}"""),format.raw/*590.6*/(""");
    
    // Cuando se seleccionan los checkboxes de tipos de recursos se graba o borra
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

	$( document ).on( "click", "[name^='btnEliminarReactivo']", function() """),format.raw/*614.73*/("""{"""),format.raw/*614.74*/("""
		"""),format.raw/*615.3*/("""var num = $(this).attr("name").substring(19);		
		console.log("asdfsdfgsdfg")
		
		swal("""),format.raw/*618.8*/("""{"""),format.raw/*618.9*/("""
		  """),format.raw/*619.5*/("""title: '¿Desea eliminar el reactivo '+num+'?',
		  text: "",
		  type: 'warning',
		  showCancelButton: true,
		  confirmButtonColor: '#3085d6',
		  cancelButtonColor: '#d33',
		  confirmButtonText: 'Si<br>Eliminarlo en esta versión',
		  cancelButtonText: 'No<br>Deseo conservarlo',
		  confirmButtonClass: 'btn btn-success',
		  cancelButtonClass: 'btn btn-danger',
		  buttonsStyling: false,
		  reverseButtons: true
		"""),format.raw/*631.3*/("""}"""),format.raw/*631.4*/(""").then((result) => """),format.raw/*631.23*/("""{"""),format.raw/*631.24*/("""
		  """),format.raw/*632.5*/("""if (result.value) """),format.raw/*632.23*/("""{"""),format.raw/*632.24*/("""
		      """),format.raw/*633.9*/("""var o = new Object;   
		      o.version = """),format.raw/*634.21*/("""{"""),format.raw/*634.22*/("""id: """"),_display_(/*634.28*/version/*634.35*/.id),format.raw/*634.38*/("""""""),format.raw/*634.39*/("""}"""),format.raw/*634.40*/(""";
			  o.reactivo = """),format.raw/*635.19*/("""{"""),format.raw/*635.20*/(""""id": num """),format.raw/*635.30*/("""}"""),format.raw/*635.31*/(""";
			  pagActual =  laTablaDTSS.page.info().page;
			  $eliminar = LlamadaAjaxEliminaReactivo(o);
	          $.when($eliminar).done(
	        		  function(d)"""),format.raw/*639.25*/("""{"""),format.raw/*639.26*/("""
	        	            """),format.raw/*640.23*/("""swal(
	        	                    'Eliminado!',
	        	                    'Se eliminó el reacivo del instrumento en esta versión.',
	        	                    'success'
	        	                  );
							laTablaDTSS.ajax.reload(null, true);
							laTablaDTSS.page(pagActual-1).draw('page');
	        		  """),format.raw/*647.14*/("""}"""),format.raw/*647.15*/("""
       		  """),format.raw/*648.12*/(""");
			  
			  
			  

		  """),format.raw/*653.5*/("""}"""),format.raw/*653.6*/(""" """),format.raw/*653.7*/("""else if (
		    // Read more about handling dismissals
		    result.dismiss === swal.DismissReason.cancel
		  ) """),format.raw/*656.7*/("""{"""),format.raw/*656.8*/("""
		    """),format.raw/*657.7*/("""swal(
		      'Cancelado',
		      'Se conserva el reactivo',
		      'error'
		    )
		  """),format.raw/*662.5*/("""}"""),format.raw/*662.6*/("""
		"""),format.raw/*663.3*/("""}"""),format.raw/*663.4*/(""")
		
		
	"""),format.raw/*666.2*/("""}"""),format.raw/*666.3*/(""");

	// Genera las opciones del select	
	function agregarReactivo()"""),format.raw/*669.28*/("""{"""),format.raw/*669.29*/("""	
		"""),format.raw/*670.3*/("""var $listado = LlamadaAjaxListaReactivos();	
		$.when($listado).done(function(data)"""),format.raw/*671.39*/("""{"""),format.raw/*671.40*/("""
			"""),format.raw/*672.4*/("""console.dir(data)
	          document.getElementById("frmModal2").reset();
	          $("#myModal2").modal('show');
	          $("#reactivo").html(data);
	          $("#nuevoReactivo, #campos").hide();
	          $('#reactivo').selectric();			
		"""),format.raw/*678.3*/("""}"""),format.raw/*678.4*/(""");

	"""),format.raw/*680.2*/("""}"""),format.raw/*680.3*/("""
		

	

    """),format.raw/*685.5*/("""$(document).on("click", "[name^='tiporecurso_'][name$='[]']", function()"""),format.raw/*685.77*/("""{"""),format.raw/*685.78*/("""
    	"""),format.raw/*686.6*/("""if (  $(this).prop("checked") )
    	    $("[name='"+$(this).prop("name")+"']").closest(".form-group").removeClass("has-error");
    	
    	
        valores = $(this).prop("name");
        
        numeroReactivo =  valores.split("_")[1];
        c1 = valores.split("_")[2];
        c2 = valores.split("_")[3];
        c3 = valores.split("_")[4].substring(0,  valores.split("_")[4].length-2 );
        console.log("reactivo: "+numeroReactivo)
        console.log(c1+" "+c2+" "+c3)
        
        var o = new Object;   
        o.version = """),format.raw/*700.21*/("""{"""),format.raw/*700.22*/("""id: """"),_display_(/*700.28*/version/*700.35*/.id),format.raw/*700.38*/("""""""),format.raw/*700.39*/("""}"""),format.raw/*700.40*/(""";
        o.reactivo = """),format.raw/*701.22*/("""{"""),format.raw/*701.23*/(""""id": numeroReactivo """),format.raw/*701.44*/("""}"""),format.raw/*701.45*/(""";
        o.criterio1 = """),format.raw/*702.23*/("""{"""),format.raw/*702.24*/("""id:   c1  """),format.raw/*702.34*/("""}"""),format.raw/*702.35*/(""";   
        o.criterio2 = """),format.raw/*703.23*/("""{"""),format.raw/*703.24*/("""id:   c2  """),format.raw/*703.34*/("""}"""),format.raw/*703.35*/(""";
        o.criterio3 = """),format.raw/*704.23*/("""{"""),format.raw/*704.24*/("""id:   c3  """),format.raw/*704.34*/("""}"""),format.raw/*704.35*/(""";
        //o.criterio3ejemplo = """),format.raw/*705.32*/("""{"""),format.raw/*705.33*/("""id: $(this).val()"""),format.raw/*705.50*/("""}"""),format.raw/*705.51*/("""
        """),format.raw/*706.9*/("""o.tiporecurso= """),format.raw/*706.24*/("""{"""),format.raw/*706.25*/("""id: $(this).val()"""),format.raw/*706.42*/("""}"""),format.raw/*706.43*/("""
		"""),format.raw/*707.3*/("""o.borrado = !$(this).prop("checked");
		if (o.reactivo.id!=0)
        	LlamadaAjaxGrabaInstrumentoTipoRecurso(o);    	
    	
    	
    """),format.raw/*712.5*/("""}"""),format.raw/*712.6*/(""");	
	
	// Aplica los cambios para el nuevo reactivo
	$("#frmModal2").submit(function(e)"""),format.raw/*715.36*/("""{"""),format.raw/*715.37*/("""
		"""),format.raw/*716.3*/("""e.preventDefault();		
		/*
		if ($("#frmModal2 input[type='checkbox'][name^='criterio_'][name$='[]']:checked").length == 0)"""),format.raw/*718.97*/("""{"""),format.raw/*718.98*/("""
			"""),format.raw/*719.4*/("""e.preventDefault();
			alert("Debe seleccionar al menos un criterio de la tabla");
		"""),format.raw/*721.3*/("""}"""),format.raw/*721.4*/(""" """),format.raw/*721.5*/("""else """),format.raw/*721.10*/("""{"""),format.raw/*721.11*/("""
			"""),format.raw/*722.4*/("""return true;
		"""),format.raw/*723.3*/("""}"""),format.raw/*723.4*/("""
		"""),format.raw/*724.3*/("""*/
		console.clear();
		console.log($("#reactivo option:selected").val())
		console.log
		if (  $("#reactivo option:selected").val()==0  &&     $("textarea[name='nuevoReactivo']").val().length==0  )"""),format.raw/*728.111*/("""{"""),format.raw/*728.112*/("""
			"""),format.raw/*729.4*/("""alert("Debe escribir la redacción del reactivo");
			return false;			
		"""),format.raw/*731.3*/("""}"""),format.raw/*731.4*/("""

		"""),format.raw/*733.3*/("""var $agregar = null;

		var arrObj = new Array;

		$("#frmModal2 input[type='checkbox'][name^='criterio_']:checked").each(function(criterio)"""),format.raw/*737.92*/("""{"""),format.raw/*737.93*/("""
			"""),format.raw/*738.4*/("""var auxC = $(this).val(); 
			var obj = new Object;
			var c1 = auxC.split("_")[0];
			var c2 = auxC.split("_")[1];
			var c3 = auxC.split("_")[2];
			obj.version ="""),format.raw/*743.17*/("""{"""),format.raw/*743.18*/(""" """),format.raw/*743.19*/("""id: """),_display_(/*743.24*/version/*743.31*/.id),format.raw/*743.34*/(""" """),format.raw/*743.35*/("""}"""),format.raw/*743.36*/(""";
			obj.reactivo =  """),format.raw/*744.20*/("""{"""),format.raw/*744.21*/(""" """),format.raw/*744.22*/("""id : $("#reactivo option:selected").val() """),format.raw/*744.64*/("""}"""),format.raw/*744.65*/(""";
			obj.nuevoReactivo =  $("textarea[name='nuevoReactivo']").val();
			obj.aspecto = """),format.raw/*746.18*/("""{"""),format.raw/*746.19*/("""id : $("#frmModal2 input[type='radio'][name^='aspecto']:checked").val()"""),format.raw/*746.90*/("""}"""),format.raw/*746.91*/(""";
			obj.criterio1 = """),format.raw/*747.20*/("""{"""),format.raw/*747.21*/("""id: c1 """),format.raw/*747.28*/("""}"""),format.raw/*747.29*/(""";
			obj.criterio2 = """),format.raw/*748.20*/("""{"""),format.raw/*748.21*/("""id: c2 """),format.raw/*748.28*/("""}"""),format.raw/*748.29*/(""";
			obj.criterio3 = """),format.raw/*749.20*/("""{"""),format.raw/*749.21*/("""id: c3 """),format.raw/*749.28*/("""}"""),format.raw/*749.29*/(""";
			var arrTipos = new Array;

			

			console.log($("#frmModal2 input[type='checkbox'][name^='tiporecurso_']:checked").length)			

			$("#frmModal2 input[type='checkbox'][name^='tiporecurso_']:checked").each(function()"""),format.raw/*756.88*/("""{"""),format.raw/*756.89*/("""
				"""),format.raw/*757.5*/("""var obj2 = new Object;
				obj2.tiporecurso = """),format.raw/*758.24*/("""{"""),format.raw/*758.25*/("""id: $(this).val() """),format.raw/*758.43*/("""}"""),format.raw/*758.44*/(""";
				arrTipos.push(obj2);
			"""),format.raw/*760.4*/("""}"""),format.raw/*760.5*/(""");

			obj.tiposrecursos = arrTipos;
			arrObj.push( """),format.raw/*763.17*/("""{"""),format.raw/*763.18*/("""evaluacionTabla : obj"""),format.raw/*763.39*/("""}"""),format.raw/*763.40*/(""" """),format.raw/*763.41*/(""");
		 //   $agregar = LlamadaAjaxAgregarReactivo(obj);

		"""),format.raw/*766.3*/("""}"""),format.raw/*766.4*/(""");

   		$agregar = LlamadaAjaxAgregarReactivo(arrObj);

		$.when($agregar).done(function(a)"""),format.raw/*770.36*/("""{"""),format.raw/*770.37*/("""
			"""),format.raw/*771.4*/("""console.log("todos")
			console.dir(a)
			if (a.agregado)"""),format.raw/*773.19*/("""{"""),format.raw/*773.20*/("""
				"""),format.raw/*774.5*/("""$("#myModal2").modal('hide');
				laTablaDTSS.ajax.reload(null, false);
				$.notify("""),format.raw/*776.14*/("""{"""),format.raw/*776.15*/("""
					"""),format.raw/*777.6*/("""title: "Agregado:",
					message: "Se agregó el reactivo al instrumento"
				"""),format.raw/*779.5*/("""}"""),format.raw/*779.6*/(""", """),format.raw/*779.8*/("""{"""),format.raw/*779.9*/("""type: 'success'"""),format.raw/*779.24*/("""}"""),format.raw/*779.25*/(""");
			"""),format.raw/*780.4*/("""}"""),format.raw/*780.5*/(""" """),format.raw/*780.6*/("""else """),format.raw/*780.11*/("""{"""),format.raw/*780.12*/("""
				"""),format.raw/*781.5*/("""$.notify("""),format.raw/*781.14*/("""{"""),format.raw/*781.15*/("""
					"""),format.raw/*782.6*/("""title: "Error:",
					message: "No fue posible agregar el reactivo al instrumento"
				"""),format.raw/*784.5*/("""}"""),format.raw/*784.6*/(""", """),format.raw/*784.8*/("""{"""),format.raw/*784.9*/("""type: 'danger'"""),format.raw/*784.23*/("""}"""),format.raw/*784.24*/(""");				
			"""),format.raw/*785.4*/("""}"""),format.raw/*785.5*/("""
		"""),format.raw/*786.3*/("""}"""),format.raw/*786.4*/(""");
		
		
	"""),format.raw/*789.2*/("""}"""),format.raw/*789.3*/(""");
	
	
		
	var toggleTabla = function(idVersion)"""),format.raw/*793.39*/("""{"""),format.raw/*793.40*/("""
		"""),format.raw/*794.3*/("""$.post("/toggle/"+idVersion)
		  .done(function(data) """),format.raw/*795.26*/("""{"""),format.raw/*795.27*/("""
			  """),format.raw/*796.6*/("""if (data.terminado == "S" ||  data.registros > 0  )"""),format.raw/*796.57*/("""{"""),format.raw/*796.58*/("""
				  """),format.raw/*797.7*/("""$("#divCandado"+idVersion).html('<a href="javascript:toggleTabla('+idVersion+')" data-toggle="popover" title="Versión cerrada" data-content="No es posible agregar o eliminar reactivos en una versión cerrada. De click sobre el candado para abrir o cerrar esta versión." data-trigger="hover"><i class="fa fa-lock"></i></a>');
				  $("input[type='checkbox']").attr("disabled",true).attr("readonly",true);					  
				  $("input[type='radio']").attr("disabled",true).attr("readonly",true);
				  $("#btnAgregarReactivo").attr("disabled",true);
				  $("[name^='btnEliminarReactivo']").prop("disabled",  true);
			  """),format.raw/*802.6*/("""}"""),format.raw/*802.7*/("""
			  """),format.raw/*803.6*/("""if (data.terminado == "N" &&  (data.registros == 0) )"""),format.raw/*803.59*/("""{"""),format.raw/*803.60*/("""
				  """),format.raw/*804.7*/("""$("#divCandado"+idVersion).html('<a href="javascript:toggleTabla('+idVersion+')" data-toggle="popover" title="Versión abierta" data-content="No es posible agregar o eliminar reactivos en una versión cerrada. De click sobre el candado para abrir o cerrar esta versión." data-trigger="hover"><i class="fa fa-unlock"></i></a>');
				  $("input[type='checkbox']").attr("disabled",false).attr("readonly",false);					  
				  $("input[type='radio']").attr("disabled",false).attr("readonly",false);
				  $("#btnAgregarReactivo").attr("disabled",false);
				  $("[name^='btnEliminarReactivo']").prop("disabled",  false);
			  """),format.raw/*809.6*/("""}"""),format.raw/*809.7*/("""		

			  """),format.raw/*811.6*/("""$('[data-toggle="popover"]').popover();		
		  """),format.raw/*812.5*/("""}"""),format.raw/*812.6*/(""");		
	"""),format.raw/*813.2*/("""}"""),format.raw/*813.3*/("""		
		
	"""),format.raw/*815.2*/("""$("[name='c1[1]']").on("click", function()"""),format.raw/*815.44*/("""{"""),format.raw/*815.45*/("""
			"""),format.raw/*816.4*/("""$("[name='c2[1]'], [name='c2[2]'], [name='c2[3]']").prop("disabled",  !($(this).prop("checked"))  );
			$("[name='c3[1]'], [name='c3[2]'], [name='c3[3]'], [name='c3[4]']").prop("disabled",   !($(this).prop("checked"))    );
	"""),format.raw/*818.2*/("""}"""),format.raw/*818.3*/(""");
	$("[name='c1[2]']").on("click", function()"""),format.raw/*819.44*/("""{"""),format.raw/*819.45*/("""
		"""),format.raw/*820.3*/("""$("[name='c2[4]'], [name='c2[5]'], [name='c2[6]']").prop("disabled",  !($(this).prop("checked"))   );
		$("[name='c3[5]'], [name='c3[6]']").prop("disabled",  !($(this).prop("checked"))   );
"""),format.raw/*822.1*/("""}"""),format.raw/*822.2*/(""");
	
	

	
    var renglonEncabezados1=`
        <tr>            
            <td rowspan="1" colspan="2">Informativos</td>
            <td rowspan="1" colspan="3">Apoyo educativo</td>
            <td rowspan="1" colspan="4">Tratamiento educativo</td>
            <td rowspan="1" colspan="2">Tutorial interactivo o practicador</td>
            <td rowspan="1" colspan="2">Simulador</td>
            <td rowspan="1" colspan="2">Sistema</td>
        </tr>
        <tr>
            <td>Unidad o módulo</td><td>Curso completo</td>
            <td>Tema</td><td>Unidad o módulo</td><td>Curso completo</td>
            <td>Concepto</td><td>Tema</td><td>Unidad o módulo</td><td>Curso completo</td>
            <td>Modular o subsistema</td><td>Complejo e integrado</td>
            <td>Modular o subsistema</td><td>Complejo e integrado</td>
            <td>Modular o subsistema</td><td>Complejo e integrado</td>
        </tr>   `;
	
	
	
	$("#reactivo").on("change", function()"""),format.raw/*847.40*/("""{"""),format.raw/*847.41*/("""
	    """),format.raw/*848.6*/("""let numReactivo = $(this).val();   		
		if( numReactivo == 0)"""),format.raw/*849.24*/("""{"""),format.raw/*849.25*/("""
			"""),format.raw/*850.4*/("""$("#nuevoReactivo, #campos").show();
		"""),format.raw/*851.3*/("""}"""),format.raw/*851.4*/(""" """),format.raw/*851.5*/("""else """),format.raw/*851.10*/("""{"""),format.raw/*851.11*/("""
			"""),format.raw/*852.4*/("""$("#nuevoReactivo, #campos").hide();
		"""),format.raw/*853.3*/("""}"""),format.raw/*853.4*/("""
		
        """),format.raw/*855.9*/("""$("#nuevoReactivo, #campos").toggle( numReactivo != -1  );
        //Muestra / oculta label y textarea para el nuevo reactivo
        ($("textarea[name='nuevoReactivo']").toggle( numReactivo == 0  )).parent().find("label").toggle( numReactivo == 0  );
		
		//Mostrar los campos
		"""),format.raw/*862.5*/("""
		"""),format.raw/*863.3*/("""let linea = laTablaDTSS.data()[0];
        var cad = "";
        cad+="<tr>";
        cad+="     <td>";
        """),_display_(/*867.10*/for(aspecto<-aspectos) yield /*867.32*/{_display_(Seq[Any](format.raw/*867.33*/("""
            """),format.raw/*868.13*/("""cad += '<input type="radio" name="aspecto'+numReactivo+'" value="""),_display_(/*868.78*/aspecto/*868.85*/.id),format.raw/*868.88*/(""" """),format.raw/*868.89*/("""required '
            cad +=  '>'+' """),_display_(/*869.28*/aspecto/*869.35*/.descripcion),format.raw/*869.47*/("""<br>';
        """)))}),format.raw/*870.10*/("""                
        """),format.raw/*871.9*/("""cad+="     </td>";

		var boolNuevo =   (numReactivo ==0);
		"""),_display_(/*874.4*/for(loopC1 <- 1 to 6) yield /*874.25*/{_display_(Seq[Any](format.raw/*874.26*/("""
            """),format.raw/*875.13*/("""cad+="<td>";
			"""),_display_(/*876.5*/if(loopC1 == 1)/*876.20*/{_display_(Seq[Any](format.raw/*876.21*/("""
				"""),format.raw/*877.5*/("""cad+="    "+enPantalla(linea,1,1,1, boolNuevo) + enPantalla(linea,1,1,2, boolNuevo);
			""")))}),format.raw/*878.5*/("""				
			"""),_display_(/*879.5*/if(loopC1 == 2)/*879.20*/{_display_(Seq[Any](format.raw/*879.21*/("""
				"""),format.raw/*880.5*/("""cad+="    "+enPantalla(linea,1,2,3,boolNuevo) + enPantalla(linea,1,2,4, boolNuevo) + enPantalla(linea,1,2,5, boolNuevo);
			""")))}),format.raw/*881.5*/("""
            """),_display_(/*882.14*/if(loopC1 == 3)/*882.29*/{_display_(Seq[Any](format.raw/*882.30*/("""
				"""),format.raw/*883.5*/("""cad+="    "+enPantalla(linea,1,3,6,boolNuevo) + enPantalla(linea,1,3,7,boolNuevo) + enPantalla(linea,1,3,8,boolNuevo) + enPantalla(linea,1,3,9,boolNuevo);
			""")))}),format.raw/*884.5*/("""				
			"""),_display_(/*885.5*/if(loopC1 == 4)/*885.20*/{_display_(Seq[Any](format.raw/*885.21*/("""
				"""),format.raw/*886.5*/("""cad+="    "+enPantalla(linea,2,4,10,boolNuevo) + enPantalla(linea,2,4,11,boolNuevo) ;
			""")))}),format.raw/*887.5*/("""   		
            """),_display_(/*888.14*/if(loopC1 == 5)/*888.29*/{_display_(Seq[Any](format.raw/*888.30*/("""
				"""),format.raw/*889.5*/("""cad+="    "+enPantalla(linea,2,5,12,boolNuevo) + enPantalla(linea,2,5,13,boolNuevo) ;
			""")))}),format.raw/*890.5*/("""  			
			"""),_display_(/*891.5*/if(loopC1 == 6)/*891.20*/{_display_(Seq[Any](format.raw/*891.21*/("""
				"""),format.raw/*892.5*/("""cad+="    "+enPantalla(linea,2,6,14,boolNuevo) + enPantalla(linea,2,6,15,boolNuevo) ;
			""")))}),format.raw/*893.5*/(""" 	
			
			"""),format.raw/*895.4*/("""cad+="</td>";
		""")))}),format.raw/*896.4*/("""		


        """),format.raw/*899.9*/("""cad+="</tr>";
        $("#tablaAgregarReactivo tbody tr").remove();
		$("#tablaAgregarReactivo tbody").append(cad);
		

		if ( !$.fn.dataTable.isDataTable( '#tablaAgregarReactivo' ) ) """),format.raw/*904.65*/("""{"""),format.raw/*904.66*/("""
			"""),format.raw/*905.4*/("""$("#tablaAgregarReactivo").DataTable(
				"""),format.raw/*906.5*/("""{"""),format.raw/*906.6*/("""
				"""),format.raw/*907.5*/(""""paging":   false,
				"ordering": false,
				"info":     false,
				"searching": false			
				"""),format.raw/*911.5*/("""}"""),format.raw/*911.6*/("""
			"""),format.raw/*912.4*/(""");
		"""),format.raw/*913.3*/("""}"""),format.raw/*913.4*/("""
		
	"""),format.raw/*915.2*/("""}"""),format.raw/*915.3*/(""");
	
	
	function muestraModal()"""),format.raw/*918.25*/("""{"""),format.raw/*918.26*/("""
		"""),format.raw/*919.3*/("""$('#myModal').modal('show');
	"""),format.raw/*920.2*/("""}"""),format.raw/*920.3*/("""
	

	"""),format.raw/*923.2*/("""$("[name='uno']").change(function()"""),format.raw/*923.37*/("""{"""),format.raw/*923.38*/("""
		"""),format.raw/*924.3*/("""laTablaDTSS.column(0).search("");
		laTablaDTSS.column(1).search("");
		laTablaDTSS.column(2).search("");
		laTablaDTSS.column(3).search("");		
		laTablaDTSS.ajax.reload(null, true);
	"""),format.raw/*929.2*/("""}"""),format.raw/*929.3*/(""");




	
	function eliminarReactivo(versionId, ren)"""),format.raw/*935.43*/("""{"""),format.raw/*935.44*/("""
		"""),format.raw/*936.3*/("""if (confirm("¿Eliminar reactivo ?"))"""),format.raw/*936.39*/("""{"""),format.raw/*936.40*/("""
			
			"""),format.raw/*938.4*/("""$("#frmTE").prop("action", """"),_display_(/*938.33*/routes/*938.39*/.AdminEvaluacionTablaController),format.raw/*938.70*/(""""+"removeTablaEvaluacion?version="+"""),_display_(/*938.106*/version/*938.113*/.id),format.raw/*938.116*/("""+"&ren="+ren);
			$("#frmTE").submit();
			alert("eliminado....");
		"""),format.raw/*941.3*/("""}"""),format.raw/*941.4*/(""" """),format.raw/*941.5*/("""else """),format.raw/*941.10*/("""{"""),format.raw/*941.11*/("""
			"""),format.raw/*942.4*/("""alert("Sin eliminar");
		"""),format.raw/*943.3*/("""}"""),format.raw/*943.4*/("""
		
	"""),format.raw/*945.2*/("""}"""),format.raw/*945.3*/("""
	

	
	"""),format.raw/*949.2*/("""function LlamadaAjaxGrabaInstrumentoAspecto(evaluaciontabla)"""),format.raw/*949.62*/("""{"""),format.raw/*949.63*/("""
		"""),format.raw/*950.3*/("""var d = $.Deferred();
	    $.ajax("""),format.raw/*951.13*/("""{"""),format.raw/*951.14*/("""
	        """),format.raw/*952.10*/("""url: '/ajaxEditTablaEvaluacionAspecto',
	        method: 'POST',
	        data: JSON.stringify( """),format.raw/*954.32*/("""{"""),format.raw/*954.33*/("""evaluaciontabla"""),format.raw/*954.48*/("""}"""),format.raw/*954.49*/("""),
	        contentType: "application/json; charset=utf-8",
	        dataType: "json"
	    """),format.raw/*957.6*/("""}"""),format.raw/*957.7*/(""").success(function(data)"""),format.raw/*957.31*/("""{"""),format.raw/*957.32*/("""
	        """),format.raw/*958.10*/("""if (data.estado == "ok")"""),format.raw/*958.34*/("""{"""),format.raw/*958.35*/("""
	            """),format.raw/*959.14*/("""laTablaDTSS.ajax.reload(null, false);
	        """),format.raw/*960.10*/("""}"""),format.raw/*960.11*/(""" """),format.raw/*960.12*/("""else """),format.raw/*960.17*/("""{"""),format.raw/*960.18*/("""
"""),format.raw/*961.1*/("""alert("error hjk4");
	        """),format.raw/*962.10*/("""}"""),format.raw/*962.11*/("""
	        """),format.raw/*963.10*/("""d.resolve(data);
	    """),format.raw/*964.6*/("""}"""),format.raw/*964.7*/(""").error(function(xhr, status, error) """),format.raw/*964.44*/("""{"""),format.raw/*964.45*/("""
	          """),format.raw/*965.12*/("""d.reject;
	          alert("error rn ajax -  "+ xhr.responseText );
	          alert("error rn ajax -  "+ error );
	          alert("error rn ajax -  "+ xhr);
	        """),format.raw/*969.10*/("""}"""),format.raw/*969.11*/("""); 
	    return d.promise();
	"""),format.raw/*971.2*/("""}"""),format.raw/*971.3*/("""		
	
	
	"""),format.raw/*974.2*/("""function LlamadaAjaxGrabaInstrumentoCriterio(evaluaciontabla)"""),format.raw/*974.63*/("""{"""),format.raw/*974.64*/("""
		"""),format.raw/*975.3*/("""var d = $.Deferred();
	    $.ajax("""),format.raw/*976.13*/("""{"""),format.raw/*976.14*/("""
	        """),format.raw/*977.10*/("""url: '/ajaxEditTablaEvaluacionCriterio',
	        method: 'POST',
	        data: JSON.stringify( """),format.raw/*979.32*/("""{"""),format.raw/*979.33*/("""evaluaciontabla"""),format.raw/*979.48*/("""}"""),format.raw/*979.49*/("""),
	        contentType: "application/json; charset=utf-8",
	        dataType: "json"
	    """),format.raw/*982.6*/("""}"""),format.raw/*982.7*/(""").success(function(data)"""),format.raw/*982.31*/("""{"""),format.raw/*982.32*/("""
	        """),format.raw/*983.10*/("""if (data.estado == "ok")"""),format.raw/*983.34*/("""{"""),format.raw/*983.35*/("""
	            
	        """),format.raw/*985.10*/("""}"""),format.raw/*985.11*/(""" """),format.raw/*985.12*/("""else """),format.raw/*985.17*/("""{"""),format.raw/*985.18*/("""
"""),format.raw/*986.1*/("""alert("error hjk6");
	        """),format.raw/*987.10*/("""}"""),format.raw/*987.11*/("""
	        """),format.raw/*988.10*/("""d.resolve(data);
	    """),format.raw/*989.6*/("""}"""),format.raw/*989.7*/(""").error(function(xhr, status, error) """),format.raw/*989.44*/("""{"""),format.raw/*989.45*/("""
	          """),format.raw/*990.12*/("""d.reject;
	          alert("error rn ajax -  "+ xhr.responseText );
	          alert("error rn ajax -  "+ error );
	          alert("error rn ajax -  "+ xhr);
	        """),format.raw/*994.10*/("""}"""),format.raw/*994.11*/("""); 
	    return d.promise();
	"""),format.raw/*996.2*/("""}"""),format.raw/*996.3*/("""	

	
    """),format.raw/*999.5*/("""function LlamadaAjaxGrabaInstrumentoTipoRecurso(evaluaciontabla)"""),format.raw/*999.69*/("""{"""),format.raw/*999.70*/("""
        """),format.raw/*1000.9*/("""var d = $.Deferred();
        $.ajax("""),format.raw/*1001.16*/("""{"""),format.raw/*1001.17*/("""
            """),format.raw/*1002.13*/("""url: '/ajaxEditTablaEvaluacionTipoRecurso',
            method: 'POST',
            data: JSON.stringify( """),format.raw/*1004.35*/("""{"""),format.raw/*1004.36*/("""evaluaciontabla"""),format.raw/*1004.51*/("""}"""),format.raw/*1004.52*/("""),
            contentType: "application/json; charset=utf-8",
            dataType: "json"
        """),format.raw/*1007.9*/("""}"""),format.raw/*1007.10*/(""").success(function(data)"""),format.raw/*1007.34*/("""{"""),format.raw/*1007.35*/("""
            """),format.raw/*1008.13*/("""if (data.estado == "ok")"""),format.raw/*1008.37*/("""{"""),format.raw/*1008.38*/("""
                
            """),format.raw/*1010.13*/("""}"""),format.raw/*1010.14*/(""" """),format.raw/*1010.15*/("""else """),format.raw/*1010.20*/("""{"""),format.raw/*1010.21*/("""
"""),format.raw/*1011.1*/("""alert("error hjk6");
            """),format.raw/*1012.13*/("""}"""),format.raw/*1012.14*/("""
            """),format.raw/*1013.13*/("""d.resolve(data);
        """),format.raw/*1014.9*/("""}"""),format.raw/*1014.10*/(""").error(function(xhr, status, error) """),format.raw/*1014.47*/("""{"""),format.raw/*1014.48*/("""
              """),format.raw/*1015.15*/("""d.reject;
              alert("error rn ajax -  "+ xhr.responseText );
              alert("error rn ajax -  "+ error );
              alert("error rn ajax -  "+ xhr);
            """),format.raw/*1019.13*/("""}"""),format.raw/*1019.14*/("""); 
        return d.promise();
    """),format.raw/*1021.5*/("""}"""),format.raw/*1021.6*/("""   
    
    """),format.raw/*1023.5*/("""function LlamadaAjaxEliminaReactivo(evaluaciontabla)"""),format.raw/*1023.57*/("""{"""),format.raw/*1023.58*/("""
        """),format.raw/*1024.9*/("""var d = $.Deferred();
        $.ajax("""),format.raw/*1025.16*/("""{"""),format.raw/*1025.17*/("""
            """),format.raw/*1026.13*/("""url: '/ajaxEliminaReactivoTablaEvaluacion',
            method: 'POST',
            data: JSON.stringify( """),format.raw/*1028.35*/("""{"""),format.raw/*1028.36*/("""evaluaciontabla"""),format.raw/*1028.51*/("""}"""),format.raw/*1028.52*/("""),
            contentType: "application/json; charset=utf-8",
            dataType: "json"
        """),format.raw/*1031.9*/("""}"""),format.raw/*1031.10*/(""").success(function(data)"""),format.raw/*1031.34*/("""{"""),format.raw/*1031.35*/("""
        	"""),format.raw/*1032.10*/("""console.dir(data)
            if (data.eliminado)"""),format.raw/*1033.32*/("""{"""),format.raw/*1033.33*/("""
                
            """),format.raw/*1035.13*/("""}"""),format.raw/*1035.14*/(""" """),format.raw/*1035.15*/("""else """),format.raw/*1035.20*/("""{"""),format.raw/*1035.21*/("""
                """),format.raw/*1036.17*/("""alert("error ajax en LlamadaAjaxEliminaReactivo ");
            """),format.raw/*1037.13*/("""}"""),format.raw/*1037.14*/("""
            """),format.raw/*1038.13*/("""d.resolve(data);
        """),format.raw/*1039.9*/("""}"""),format.raw/*1039.10*/(""").error(function(xhr, status, error) """),format.raw/*1039.47*/("""{"""),format.raw/*1039.48*/("""
              """),format.raw/*1040.15*/("""d.reject;
              alert("error rn ajax -  "+ error );
            """),format.raw/*1042.13*/("""}"""),format.raw/*1042.14*/("""); 
        return d.promise();
    """),format.raw/*1044.5*/("""}"""),format.raw/*1044.6*/("""    
	
    
    """),format.raw/*1047.5*/("""function LlamadaAjaxListaReactivos(version)"""),format.raw/*1047.48*/("""{"""),format.raw/*1047.49*/("""
    	"""),format.raw/*1048.6*/("""var d = $.Deferred();  
    	$.ajax("""),format.raw/*1049.13*/("""{"""),format.raw/*1049.14*/("""
            """),format.raw/*1050.13*/("""method: "GET",
            url: "/listaReactivos/"+"""),_display_(/*1051.38*/version/*1051.45*/.id),format.raw/*1051.48*/("""
      """),format.raw/*1052.7*/("""}"""),format.raw/*1052.8*/(""")
      .success(function( data ) """),format.raw/*1053.33*/("""{"""),format.raw/*1053.34*/("""
          """),format.raw/*1054.11*/("""d.resolve(data);
      """),format.raw/*1055.7*/("""}"""),format.raw/*1055.8*/(""")
      .error(function(data)"""),format.raw/*1056.28*/("""{"""),format.raw/*1056.29*/("""
          """),format.raw/*1057.11*/("""alert("error ajax");
          d.reject;
      """),format.raw/*1059.7*/("""}"""),format.raw/*1059.8*/("""); 
      return d.promise();
    """),format.raw/*1061.5*/("""}"""),format.raw/*1061.6*/("""
    
    
    """),format.raw/*1064.5*/("""function LlamadaAjaxAgregarReactivo(evaluaciontabla)"""),format.raw/*1064.57*/("""{"""),format.raw/*1064.58*/("""
    	"""),format.raw/*1065.6*/("""var d = $.Deferred();    	
        $.ajax("""),format.raw/*1066.16*/("""{"""),format.raw/*1066.17*/("""
            """),format.raw/*1067.13*/("""method: "POST",
            url: "/ajaxAgregarReactivoTablaEvaluacion",
            data: JSON.stringify( evaluaciontabla),
            contentType: "application/json; charset=utf-8",
            dataType: "json"            
      """),format.raw/*1072.7*/("""}"""),format.raw/*1072.8*/(""")
      .success(function( data ) """),format.raw/*1073.33*/("""{"""),format.raw/*1073.34*/("""
          """),format.raw/*1074.11*/("""d.resolve(data);
      """),format.raw/*1075.7*/("""}"""),format.raw/*1075.8*/(""")
      .error(function(data)"""),format.raw/*1076.28*/("""{"""),format.raw/*1076.29*/("""
          """),format.raw/*1077.11*/("""alert("error ajax");
          d.reject;
      """),format.raw/*1079.7*/("""}"""),format.raw/*1079.8*/(""");    	
      return d.promise();
    """),format.raw/*1081.5*/("""}"""),format.raw/*1081.6*/("""
    
"""),format.raw/*1083.1*/("""</script>

<script src=""""),_display_(/*1085.15*/routes/*1085.21*/.Assets.at("lib/datatables/js/jquery.dataTables.min.js")),format.raw/*1085.77*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*1086.15*/routes/*1086.21*/.Assets.at("lib/datatables/js/dataTables.bootstrap.min.js")),format.raw/*1086.80*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*1087.15*/routes/*1087.21*/.Assets.at("lib/datatables-buttons/js/dataTables.buttons.min.js")),format.raw/*1087.86*/("""" type="text/javascript"></script>


<script src=""""),_display_(/*1090.15*/routes/*1090.21*/.Assets.at("mark.js/datatables.mark.min.js")),format.raw/*1090.65*/(""""></script>
<script src=""""),_display_(/*1091.15*/routes/*1091.21*/.Assets.at("mark.js/jquery.mark.min.js")),format.raw/*1091.61*/(""""></script>

<script src=""""),_display_(/*1093.15*/routes/*1093.21*/.Assets.at("sweetalert2/sweetalert2.all.js")),format.raw/*1093.65*/("""" type="text/javascript"></script>

<script src=""""),_display_(/*1095.15*/routes/*1095.21*/.Assets.at("lib/bootstrap-notify/bootstrap-notify.min.js")),format.raw/*1095.79*/("""" type="text/javascript"></script>


"""))}
  }

  def render(reactivos:TreeSet[Long],aspectos:List[Aspecto],c1:List[ClasificadorCriterio1],c2:List[ClasificadorCriterio2],c3:List[ClasificadorCriterio3],version:EvaluacionTablaVersion,versiones:List[EvaluacionTablaVersion],registros:Int,tiposrecursos:List[ClasificadorEjemplo]): play.twirl.api.HtmlFormat.Appendable = apply(reactivos,aspectos,c1,c2,c3,version,versiones,registros,tiposrecursos)

  def f:((TreeSet[Long],List[Aspecto],List[ClasificadorCriterio1],List[ClasificadorCriterio2],List[ClasificadorCriterio3],EvaluacionTablaVersion,List[EvaluacionTablaVersion],Int,List[ClasificadorEjemplo]) => play.twirl.api.HtmlFormat.Appendable) = (reactivos,aspectos,c1,c2,c3,version,versiones,registros,tiposrecursos) => apply(reactivos,aspectos,c1,c2,c3,version,versiones,registros,tiposrecursos)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:36 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/AdminEvaluacionTabla/tablaListarDTSS.scala.html
                  HASH: 00a3d4288f7f0e9377c1a59c33ad96388124023b
                  MATRIX: 941->1|1335->329|1360->345|1443->349|1505->383|2005->856|2033->868|2072->869|2146->915|2213->955|2224->957|2286->997|2317->1000|2330->1003|2364->1015|2443->1063|2513->1105|2677->1242|2705->1254|2744->1255|2818->1302|2879->1347|2918->1348|2996->1398|3080->1454|3093->1457|3127->1469|3210->1521|3284->1564|3351->1603|3521->277|3548->327|3576->1735|3607->1740|3619->1744|3657->1745|3686->1747|3740->1773|3769->1774|3802->1780|3869->1820|3897->1821|3926->1823|4013->1883|4028->1889|4111->1950|4159->1971|4174->1977|4256->2038|4367->2122|4382->2128|4455->2179|4534->2231|4549->2237|4638->2304|5308->2947|5338->2956|5380->2971|5479->3044|5575->3131|5615->3133|5649->3140|5705->3169|5721->3176|5745->3179|6285->3691|6302->3698|6332->3706|6496->3843|6512->3850|6536->3853|7327->4617|7355->4629|7394->4630|7471->4679|7538->4719|7549->4721|7611->4761|7642->4764|7655->4767|7689->4779|7771->4830|7841->4871|7965->4967|7994->4979|8034->4980|8112->5030|8174->5075|8214->5076|8296->5129|8381->5185|8395->5188|8430->5200|8517->5255|8595->5301|8665->5342|9252->5898|9294->5913|9371->5980|9411->5981|9448->5990|9687->6201|9723->6220|9763->6221|9806->6235|9946->6347|9962->6353|10033->6402|10080->6421|10091->6422|10121->6430|10179->6459|10246->6498|10257->6499|10282->6502|10344->6536|10388->6570|10428->6571|10474->6588|10535->6621|10546->6622|10571->6625|10943->6978|10957->6983|10997->6984|11043->7002|11087->7036|11127->7037|11174->7055|11235->7088|11246->7089|11271->7092|11647->7449|11661->7454|11701->7455|11748->7474|11792->7508|11832->7509|11880->7528|11941->7561|11952->7562|11977->7565|12351->7907|12417->7941|12466->7958|12545->8008|12648->8079|12688->8090|13996->9369|14014->9376|14045->9384|14148->9459|14165->9466|14195->9474|14493->9741|14540->9760|14615->9807|14632->9814|14662->9822|15385->10518|15493->10615|15535->10617|15573->10627|15722->10748|15762->10766|15799->10775|16543->11488|16577->11494|16648->11534|16679->11537|16780->11609|16810->11610|16841->11613|17735->12478|17765->12479|17807->12492|17999->12655|18029->12656|18075->12673|18110->12680|18126->12686|18174->12712|18208->12718|18237->12719|18492->12945|18522->12946|18568->12963|18668->13034|18698->13035|18732->13041|18774->13055|18791->13062|18816->13065|18971->13191|19001->13192|19145->13307|19175->13308|19280->13384|19310->13385|19387->13433|19417->13434|19464->13452|19494->13453|19609->13540|19638->13541|19685->13559|19715->13560|19881->13697|19911->13698|19962->13720|20021->13751|20060->13773|20100->13774|20152->13797|20249->13866|20266->13873|20292->13876|20323->13877|20389->13915|20406->13922|20431->13925|20461->13926|20507->13943|20537->13944|20590->13968|20671->14020|20701->14021|20737->14029|20785->14049|20802->14056|20827->14059|20857->14060|20923->14097|20953->14098|20990->14107|21045->14134|21074->14135|21126->14158|21170->14174|21187->14181|21221->14193|21282->14222|21336->14247|21431->14313|21461->14314|21526->14350|21556->14351|21637->14404|21675->14425|21715->14426|21765->14448|21790->14463|21830->14464|21881->14486|21911->14487|22072->14619|22102->14620|22161->14650|22317->14777|22347->14778|22419->14821|22449->14822|22501->14845|22531->14846|22672->14957|22703->14958|22758->14981|22808->15003|22833->15018|22873->15019|22927->15044|22957->15045|23095->15154|23125->15155|23187->15188|23517->15489|23547->15490|23601->15515|23631->15516|23686->15539|23736->15561|23761->15576|23801->15577|23855->15602|23885->15603|24023->15712|24053->15713|24115->15746|25139->16741|25169->16742|25223->16767|25253->16768|25308->16791|25378->16833|25403->16848|25443->16849|25497->16874|25527->16875|25665->16984|25695->16985|25757->17018|26404->17636|26434->17637|26488->17662|26518->17663|26573->17686|26644->17729|26669->17744|26709->17745|26763->17770|26793->17771|26931->17880|26961->17881|27023->17914|27670->18532|27700->18533|27754->18558|27784->18559|27839->18582|27910->18625|27935->18640|27975->18641|28029->18666|28059->18667|28197->18776|28227->18777|28289->18810|28936->19428|28966->19429|29020->19454|29050->19455|29105->19478|29177->19518|29210->19523|29239->19524|29330->19586|29360->19587|29395->19594|29572->19743|29589->19750|29614->19753|29644->19754|29708->19789|29738->19790|29773->19797|29826->19822|29855->19823|29897->19837|29982->19894|30011->19895|30046->19902|30075->19903|30134->19933|30221->19991|30251->19992|30297->20009|30699->20382|30729->20383|30779->20404|30837->20433|30867->20434|30921->20459|31000->20509|31030->20510|31060->20511|31094->20516|31124->20517|31178->20542|31260->20595|31290->20596|31336->20613|31366->20614|31413->20632|31443->20633|31488->20650|31518->20651|31603->20707|31633->20708|31675->20721|31795->20812|31825->20813|31868->20827|32058->20988|32088->20989|32135->21007|32327->21170|32357->21171|32408->21193|32469->21225|32499->21226|32551->21249|32738->21407|32768->21408|32820->21431|32850->21432|32896->21449|32926->21450|32970->21465|33000->21466|33204->21641|33234->21642|33277->21656|33444->21795|33461->21802|33486->21805|33516->21806|33653->21915|33670->21922|33695->21925|33725->21926|33803->21976|33834->21985|33885->22008|33902->22015|33927->22018|33957->22019|34021->22054|34051->22055|34093->22069|34230->22178|34259->22179|34293->22184|34323->22185|34367->22200|34509->22314|34538->22315|34585->22333|34615->22334|34680->22371|34710->22372|34740->22373|34788->22393|34817->22394|34883->22431|34913->22432|34944->22435|35079->22541|35109->22542|35140->22545|35396->22772|35426->22773|35456->22775|35515->22806|35544->22807|35577->22812|35606->22813|35642->22821|35671->22822|35704->22827|35755->22849|35785->22850|35816->22853|35902->22910|35932->22911|35964->22915|36011->22934|36040->22935|36075->22942|36104->22943|36141->22952|36283->23065|36313->23066|36350->23075|36438->23134|36468->23135|36507->23145|36666->23275|36696->23276|36742->23293|36875->23397|36905->23398|36952->23416|37150->23585|37180->23586|37210->23587|37244->23592|37274->23593|37324->23614|37531->23792|37561->23793|37607->23811|37664->23858|37704->23859|37755->23881|37836->23930|37898->23963|38050->24086|38080->24087|38127->24105|38238->24187|38268->24188|38335->24226|38513->24375|38543->24376|38595->24399|38754->24529|38784->24530|38814->24531|38847->24535|38877->24536|38929->24559|39101->24702|39131->24703|39183->24727|39241->24775|39281->24776|39338->24804|39425->24859|39478->24883|39660->25036|39690->25037|39772->25090|39802->25091|39848->25108|39979->25210|40009->25211|40055->25229|40085->25230|40159->25276|40188->25277|40228->25289|40398->25430|40428->25431|40462->25437|40693->25639|40723->25640|40757->25646|40774->25653|40799->25656|40829->25657|40859->25658|40911->25681|40941->25682|40991->25703|41021->25704|41074->25728|41104->25729|41190->25786|41220->25787|41271->25809|41301->25810|41347->25827|41377->25828|41483->25906|41512->25907|41693->26059|41723->26060|41757->26066|42274->26554|42304->26555|42339->26562|42460->26655|42489->26656|42526->26665|42598->26708|42628->26709|42662->26715|42679->26722|42704->26725|42734->26726|42764->26727|42816->26750|42846->26751|42896->26772|42926->26773|42977->26795|43007->26796|43093->26853|43123->26854|43176->26878|43206->26879|43266->26910|43296->26911|43352->26938|43382->26939|43442->26970|43472->26971|43525->26995|43555->26996|43615->27027|43645->27028|43792->27147|43821->27148|44113->27411|44143->27412|44174->27415|44290->27503|44319->27504|44352->27509|44802->27931|44831->27932|44879->27951|44909->27952|44942->27957|44989->27975|45019->27976|45056->27985|45128->28028|45158->28029|45192->28035|45209->28042|45234->28045|45264->28046|45294->28047|45343->28067|45373->28068|45412->28078|45442->28079|45628->28236|45658->28237|45710->28260|46056->28577|46086->28578|46127->28590|46181->28616|46210->28617|46239->28618|46379->28730|46408->28731|46443->28738|46561->28828|46590->28829|46621->28832|46650->28833|46687->28842|46716->28843|46812->28910|46842->28911|46874->28915|46986->28998|47016->28999|47048->29003|47322->29249|47351->29250|47384->29255|47413->29256|47453->29268|47554->29340|47584->29341|47618->29347|48188->29888|48218->29889|48252->29895|48269->29902|48294->29905|48324->29906|48354->29907|48406->29930|48436->29931|48486->29952|48516->29953|48569->29977|48599->29978|48638->29988|48668->29989|48724->30016|48754->30017|48793->30027|48823->30028|48876->30052|48906->30053|48945->30063|48975->30064|49037->30097|49067->30098|49113->30115|49143->30116|49180->30125|49224->30140|49254->30141|49300->30158|49330->30159|49361->30162|49524->30297|49553->30298|49669->30385|49699->30386|49730->30389|49882->30512|49912->30513|49944->30517|50057->30602|50086->30603|50115->30604|50149->30609|50179->30610|50211->30614|50254->30629|50283->30630|50314->30633|50542->30831|50573->30832|50605->30836|50705->30908|50734->30909|50766->30913|50935->31053|50965->31054|50997->31058|51190->31222|51220->31223|51250->31224|51283->31229|51300->31236|51325->31239|51355->31240|51385->31241|51435->31262|51465->31263|51495->31264|51566->31306|51596->31307|51711->31393|51741->31394|51841->31465|51871->31466|51921->31487|51951->31488|51987->31495|52017->31496|52067->31517|52097->31518|52133->31525|52163->31526|52213->31547|52243->31548|52279->31555|52309->31556|52558->31776|52588->31777|52621->31782|52696->31828|52726->31829|52773->31847|52803->31848|52861->31878|52890->31879|52972->31932|53002->31933|53052->31954|53082->31955|53112->31956|53198->32014|53227->32015|53348->32107|53378->32108|53410->32112|53496->32169|53526->32170|53559->32175|53673->32260|53703->32261|53737->32267|53842->32344|53871->32345|53901->32347|53930->32348|53974->32363|54004->32364|54038->32370|54067->32371|54096->32372|54130->32377|54160->32378|54193->32383|54231->32392|54261->32393|54295->32399|54410->32486|54439->32487|54469->32489|54498->32490|54541->32504|54571->32505|54609->32515|54638->32516|54669->32519|54698->32520|54736->32530|54765->32531|54842->32579|54872->32580|54903->32583|54986->32637|55016->32638|55050->32644|55130->32695|55160->32696|55195->32703|55834->33314|55863->33315|55897->33321|55979->33374|56009->33375|56044->33382|56691->34001|56720->34002|56757->34011|56831->34057|56860->34058|56894->34064|56923->34065|56958->34072|57029->34114|57059->34115|57091->34119|57344->34344|57373->34345|57448->34391|57478->34392|57509->34395|57727->34585|57756->34586|58751->35552|58781->35553|58815->35559|58905->35620|58935->35621|58967->35625|59034->35664|59063->35665|59092->35666|59126->35671|59156->35672|59188->35676|59255->35715|59284->35716|59324->35728|59632->36153|59663->36156|59804->36269|59843->36291|59883->36292|59925->36305|60018->36370|60035->36377|60060->36380|60090->36381|60156->36419|60173->36426|60207->36438|60255->36454|60308->36479|60397->36541|60435->36562|60475->36563|60517->36576|60561->36593|60586->36608|60626->36609|60659->36614|60779->36703|60815->36712|60840->36727|60880->36728|60913->36733|61069->36858|61111->36872|61136->36887|61176->36888|61209->36893|61399->37052|61435->37061|61460->37076|61500->37077|61533->37082|61654->37172|61701->37191|61726->37206|61766->37207|61799->37212|61920->37302|61957->37312|61982->37327|62022->37328|62055->37333|62176->37423|62214->37433|62262->37450|62303->37463|62516->37647|62546->37648|62578->37652|62648->37694|62677->37695|62710->37700|62833->37795|62862->37796|62894->37800|62927->37805|62956->37806|62989->37811|63018->37812|63078->37843|63108->37844|63139->37847|63197->37877|63226->37878|63259->37883|63323->37918|63353->37919|63384->37922|63596->38106|63625->38107|63705->38158|63735->38159|63766->38162|63831->38198|63861->38199|63897->38207|63954->38236|63970->38242|64023->38273|64088->38309|64106->38316|64132->38319|64229->38388|64258->38389|64287->38390|64321->38395|64351->38396|64383->38400|64436->38425|64465->38426|64498->38431|64527->38432|64562->38439|64651->38499|64681->38500|64712->38503|64775->38537|64805->38538|64844->38548|64969->38644|64999->38645|65043->38660|65073->38661|65192->38752|65221->38753|65274->38777|65304->38778|65343->38788|65396->38812|65426->38813|65469->38827|65545->38874|65575->38875|65605->38876|65639->38881|65669->38882|65698->38883|65757->38913|65787->38914|65826->38924|65876->38946|65905->38947|65971->38984|66001->38985|66042->38997|66239->39165|66269->39166|66327->39196|66356->39197|66392->39205|66482->39266|66512->39267|66543->39270|66606->39304|66636->39305|66675->39315|66801->39412|66831->39413|66875->39428|66905->39429|67024->39520|67053->39521|67106->39545|67136->39546|67175->39556|67228->39580|67258->39581|67311->39605|67341->39606|67371->39607|67405->39612|67435->39613|67464->39614|67523->39644|67553->39645|67592->39655|67642->39677|67671->39678|67737->39715|67767->39716|67808->39728|68005->39896|68035->39897|68093->39927|68122->39928|68159->39937|68252->40001|68282->40002|68320->40011|68387->40048|68418->40049|68461->40062|68597->40168|68628->40169|68673->40184|68704->40185|68833->40285|68864->40286|68918->40310|68949->40311|68992->40324|69046->40348|69077->40349|69137->40379|69168->40380|69199->40381|69234->40386|69265->40387|69295->40388|69358->40421|69389->40422|69432->40435|69486->40460|69517->40461|69584->40498|69615->40499|69660->40514|69870->40694|69901->40695|69966->40731|69996->40732|70038->40745|70120->40797|70151->40798|70189->40807|70256->40844|70287->40845|70330->40858|70466->40964|70497->40965|70542->40980|70573->40981|70702->41081|70733->41082|70787->41106|70818->41107|70858->41117|70937->41166|70968->41167|71028->41197|71059->41198|71090->41199|71125->41204|71156->41205|71203->41222|71297->41286|71328->41287|71371->41300|71425->41325|71456->41326|71523->41363|71554->41364|71599->41379|71701->41451|71732->41452|71797->41488|71827->41489|71872->41505|71945->41548|71976->41549|72011->41555|72077->41591|72108->41592|72151->41605|72232->41657|72250->41664|72276->41667|72312->41674|72342->41675|72406->41709|72437->41710|72478->41721|72530->41744|72560->41745|72619->41774|72650->41775|72691->41786|72767->41833|72797->41834|72860->41868|72890->41869|72934->41884|73016->41936|73047->41937|73082->41943|73154->41985|73185->41986|73228->41999|73488->42230|73518->42231|73582->42265|73613->42266|73654->42277|73706->42300|73736->42301|73795->42330|73826->42331|73867->42342|73943->42389|73973->42390|74040->42428|74070->42429|74105->42435|74159->42460|74176->42466|74255->42522|74333->42571|74350->42577|74432->42636|74510->42685|74527->42691|74615->42756|74695->42807|74712->42813|74779->42857|74834->42883|74851->42889|74914->42929|74970->42956|74987->42962|75054->43006|75133->43056|75150->43062|75231->43120
                  LINES: 26->1|34->10|34->10|36->10|37->11|44->18|44->18|44->18|45->19|45->19|45->19|45->19|45->19|45->19|45->19|46->20|47->21|50->24|50->24|50->24|51->25|51->25|51->25|52->26|52->26|52->26|52->26|53->27|54->28|55->29|59->6|60->9|61->32|65->36|65->36|65->36|66->37|67->38|67->38|68->39|69->40|69->40|70->41|72->43|72->43|72->43|73->44|73->44|73->44|74->45|74->45|74->45|76->47|76->47|76->47|96->67|96->67|98->69|103->74|103->74|103->74|104->75|104->75|104->75|104->75|110->81|110->81|110->81|113->84|113->84|113->84|126->97|126->97|126->97|127->98|127->98|127->98|127->98|127->98|127->98|127->98|128->99|129->100|131->102|131->102|131->102|132->103|132->103|132->103|133->104|133->104|133->104|133->104|134->105|135->106|136->107|151->122|153->124|153->124|153->124|154->125|158->129|158->129|158->129|159->130|160->131|160->131|160->131|161->132|161->132|161->132|162->133|163->134|163->134|163->134|165->136|165->136|165->136|166->137|166->137|166->137|166->137|170->141|170->141|170->141|171->142|171->142|171->142|172->143|172->143|172->143|172->143|175->146|175->146|175->146|176->147|176->147|176->147|177->148|177->148|177->148|177->148|180->151|181->152|182->153|187->158|189->160|190->161|209->180|209->180|209->180|210->181|210->181|210->181|218->189|220->191|220->191|220->191|220->191|242->213|242->213|242->213|243->214|244->215|244->215|246->217|265->236|266->237|273->244|276->247|279->250|279->250|280->251|299->270|299->270|300->271|303->274|303->274|304->275|304->275|304->275|304->275|305->276|305->276|313->284|313->284|314->285|315->286|315->286|316->287|316->287|316->287|316->287|321->292|321->292|324->295|324->295|327->298|327->298|327->298|327->298|328->299|328->299|330->301|330->301|331->302|331->302|333->304|333->304|334->305|335->306|335->306|335->306|336->307|336->307|336->307|336->307|336->307|337->308|337->308|337->308|337->308|337->308|337->308|338->309|339->310|339->310|340->311|340->311|340->311|340->311|340->311|340->311|340->311|341->312|342->313|342->313|343->314|343->314|343->314|343->314|344->315|345->316|347->318|347->318|348->319|348->319|351->322|351->322|351->322|352->323|352->323|352->323|353->324|353->324|355->326|355->326|356->327|358->329|358->329|359->330|359->330|360->331|360->331|360->331|360->331|361->332|362->333|362->333|362->333|363->334|363->334|364->335|364->335|365->336|368->339|368->339|369->340|369->340|370->341|371->342|371->342|371->342|372->343|372->343|373->344|373->344|374->345|381->352|381->352|382->353|382->353|383->354|384->355|384->355|384->355|385->356|385->356|386->357|386->357|387->358|392->363|392->363|393->364|393->364|394->365|395->366|395->366|395->366|396->367|396->367|397->368|397->368|398->369|403->374|403->374|404->375|404->375|405->376|406->377|406->377|406->377|407->378|407->378|408->379|408->379|409->380|414->385|414->385|415->386|415->386|416->387|417->388|418->389|418->389|419->390|419->390|420->391|422->393|422->393|422->393|422->393|422->393|422->393|423->394|424->395|424->395|425->396|427->398|427->398|428->399|428->399|430->401|431->402|431->402|432->403|436->407|436->407|437->408|437->408|437->408|438->409|439->410|439->410|439->410|439->410|439->410|440->411|441->412|441->412|442->413|442->413|443->414|443->414|444->415|444->415|452->423|452->423|453->424|454->425|454->425|455->426|456->427|456->427|457->428|459->430|459->430|460->431|460->431|460->431|461->432|462->433|462->433|463->434|463->434|464->435|464->435|465->436|465->436|470->441|470->441|471->442|473->444|473->444|473->444|473->444|474->445|474->445|474->445|474->445|480->451|480->451|480->451|480->451|480->451|480->451|480->451|480->451|481->452|483->454|483->454|483->454|483->454|484->455|486->457|486->457|488->459|488->459|491->462|491->462|491->462|493->464|493->464|500->471|500->471|501->472|502->473|502->473|503->474|508->479|508->479|509->480|510->481|510->481|511->482|511->482|514->485|514->485|517->488|517->488|517->488|518->489|518->489|518->489|519->490|520->491|520->491|522->493|522->493|526->497|527->498|527->498|528->499|529->500|529->500|530->501|533->504|533->504|534->505|536->507|536->507|537->508|538->509|538->509|538->509|538->509|538->509|539->510|540->511|540->511|541->512|541->512|541->512|542->513|543->514|544->515|547->518|547->518|548->519|549->520|549->520|551->522|553->524|553->524|554->525|555->526|555->526|555->526|555->526|555->526|556->527|557->528|557->528|558->529|558->529|558->529|559->530|560->531|561->532|565->536|565->536|568->539|568->539|569->540|572->543|572->543|573->544|573->544|575->546|575->546|580->551|581->552|581->552|582->553|587->558|587->558|587->558|587->558|587->558|587->558|587->558|588->559|588->559|588->559|588->559|589->560|589->560|589->560|589->560|590->561|590->561|590->561|590->561|593->564|593->564|598->569|598->569|599->570|606->577|606->577|607->578|608->579|608->579|609->580|610->581|610->581|610->581|610->581|610->581|610->581|610->581|611->582|611->582|611->582|611->582|612->583|612->583|612->583|612->583|613->584|613->584|613->584|613->584|614->585|614->585|614->585|614->585|615->586|615->586|615->586|615->586|619->590|619->590|643->614|643->614|644->615|647->618|647->618|648->619|660->631|660->631|660->631|660->631|661->632|661->632|661->632|662->633|663->634|663->634|663->634|663->634|663->634|663->634|663->634|664->635|664->635|664->635|664->635|668->639|668->639|669->640|676->647|676->647|677->648|682->653|682->653|682->653|685->656|685->656|686->657|691->662|691->662|692->663|692->663|695->666|695->666|698->669|698->669|699->670|700->671|700->671|701->672|707->678|707->678|709->680|709->680|714->685|714->685|714->685|715->686|729->700|729->700|729->700|729->700|729->700|729->700|729->700|730->701|730->701|730->701|730->701|731->702|731->702|731->702|731->702|732->703|732->703|732->703|732->703|733->704|733->704|733->704|733->704|734->705|734->705|734->705|734->705|735->706|735->706|735->706|735->706|735->706|736->707|741->712|741->712|744->715|744->715|745->716|747->718|747->718|748->719|750->721|750->721|750->721|750->721|750->721|751->722|752->723|752->723|753->724|757->728|757->728|758->729|760->731|760->731|762->733|766->737|766->737|767->738|772->743|772->743|772->743|772->743|772->743|772->743|772->743|772->743|773->744|773->744|773->744|773->744|773->744|775->746|775->746|775->746|775->746|776->747|776->747|776->747|776->747|777->748|777->748|777->748|777->748|778->749|778->749|778->749|778->749|785->756|785->756|786->757|787->758|787->758|787->758|787->758|789->760|789->760|792->763|792->763|792->763|792->763|792->763|795->766|795->766|799->770|799->770|800->771|802->773|802->773|803->774|805->776|805->776|806->777|808->779|808->779|808->779|808->779|808->779|808->779|809->780|809->780|809->780|809->780|809->780|810->781|810->781|810->781|811->782|813->784|813->784|813->784|813->784|813->784|813->784|814->785|814->785|815->786|815->786|818->789|818->789|822->793|822->793|823->794|824->795|824->795|825->796|825->796|825->796|826->797|831->802|831->802|832->803|832->803|832->803|833->804|838->809|838->809|840->811|841->812|841->812|842->813|842->813|844->815|844->815|844->815|845->816|847->818|847->818|848->819|848->819|849->820|851->822|851->822|876->847|876->847|877->848|878->849|878->849|879->850|880->851|880->851|880->851|880->851|880->851|881->852|882->853|882->853|884->855|889->862|890->863|894->867|894->867|894->867|895->868|895->868|895->868|895->868|895->868|896->869|896->869|896->869|897->870|898->871|901->874|901->874|901->874|902->875|903->876|903->876|903->876|904->877|905->878|906->879|906->879|906->879|907->880|908->881|909->882|909->882|909->882|910->883|911->884|912->885|912->885|912->885|913->886|914->887|915->888|915->888|915->888|916->889|917->890|918->891|918->891|918->891|919->892|920->893|922->895|923->896|926->899|931->904|931->904|932->905|933->906|933->906|934->907|938->911|938->911|939->912|940->913|940->913|942->915|942->915|945->918|945->918|946->919|947->920|947->920|950->923|950->923|950->923|951->924|956->929|956->929|962->935|962->935|963->936|963->936|963->936|965->938|965->938|965->938|965->938|965->938|965->938|965->938|968->941|968->941|968->941|968->941|968->941|969->942|970->943|970->943|972->945|972->945|976->949|976->949|976->949|977->950|978->951|978->951|979->952|981->954|981->954|981->954|981->954|984->957|984->957|984->957|984->957|985->958|985->958|985->958|986->959|987->960|987->960|987->960|987->960|987->960|988->961|989->962|989->962|990->963|991->964|991->964|991->964|991->964|992->965|996->969|996->969|998->971|998->971|1001->974|1001->974|1001->974|1002->975|1003->976|1003->976|1004->977|1006->979|1006->979|1006->979|1006->979|1009->982|1009->982|1009->982|1009->982|1010->983|1010->983|1010->983|1012->985|1012->985|1012->985|1012->985|1012->985|1013->986|1014->987|1014->987|1015->988|1016->989|1016->989|1016->989|1016->989|1017->990|1021->994|1021->994|1023->996|1023->996|1026->999|1026->999|1026->999|1027->1000|1028->1001|1028->1001|1029->1002|1031->1004|1031->1004|1031->1004|1031->1004|1034->1007|1034->1007|1034->1007|1034->1007|1035->1008|1035->1008|1035->1008|1037->1010|1037->1010|1037->1010|1037->1010|1037->1010|1038->1011|1039->1012|1039->1012|1040->1013|1041->1014|1041->1014|1041->1014|1041->1014|1042->1015|1046->1019|1046->1019|1048->1021|1048->1021|1050->1023|1050->1023|1050->1023|1051->1024|1052->1025|1052->1025|1053->1026|1055->1028|1055->1028|1055->1028|1055->1028|1058->1031|1058->1031|1058->1031|1058->1031|1059->1032|1060->1033|1060->1033|1062->1035|1062->1035|1062->1035|1062->1035|1062->1035|1063->1036|1064->1037|1064->1037|1065->1038|1066->1039|1066->1039|1066->1039|1066->1039|1067->1040|1069->1042|1069->1042|1071->1044|1071->1044|1074->1047|1074->1047|1074->1047|1075->1048|1076->1049|1076->1049|1077->1050|1078->1051|1078->1051|1078->1051|1079->1052|1079->1052|1080->1053|1080->1053|1081->1054|1082->1055|1082->1055|1083->1056|1083->1056|1084->1057|1086->1059|1086->1059|1088->1061|1088->1061|1091->1064|1091->1064|1091->1064|1092->1065|1093->1066|1093->1066|1094->1067|1099->1072|1099->1072|1100->1073|1100->1073|1101->1074|1102->1075|1102->1075|1103->1076|1103->1076|1104->1077|1106->1079|1106->1079|1108->1081|1108->1081|1110->1083|1112->1085|1112->1085|1112->1085|1113->1086|1113->1086|1113->1086|1114->1087|1114->1087|1114->1087|1117->1090|1117->1090|1117->1090|1118->1091|1118->1091|1118->1091|1120->1093|1120->1093|1120->1093|1122->1095|1122->1095|1122->1095
                  -- GENERATED --
              */
          