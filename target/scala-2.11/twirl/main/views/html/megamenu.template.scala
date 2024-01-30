
package views.html

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
object megamenu extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<style>
	.navbar"""),format.raw/*2.9*/("""{"""),format.raw/*2.10*/("""color:"#FF0000""""),format.raw/*2.25*/("""}"""),format.raw/*2.26*/("""
"""),format.raw/*3.1*/("""</style>

"""),_display_(/*5.2*/if(  session.get("cvesRoles") != null   )/*5.43*/ {_display_(Seq[Any](format.raw/*5.45*/("""

	"""),format.raw/*7.2*/("""<div class="navbar navbar-default yamm">
          <div class="navbar-header">
	          <button type="button" data-toggle="collapse" data-target="#navbar-collapse-grid" class="navbar-toggle">
	          <span class="icon-bar"></span>
	          <span class="icon-bar"></span>
	          <span class="icon-bar"></span>
	          </button>
	          """),_display_(/*14.13*/if(session.get("cvesRoles").contains("1 "))/*14.56*/{_display_(Seq[Any](format.raw/*14.57*/("""
	              """),format.raw/*15.16*/("""<a class="navbar-brand" href="/admin" style="font-size: 18px">Inicio <i class="fa fa-home"></i></a>
	          """)))}),format.raw/*16.13*/("""
   	       	  """),_display_(/*17.16*/if(session.get("cvesRoles").contains("2 "))/*17.59*/{_display_(Seq[Any](format.raw/*17.60*/("""
	      	      """),format.raw/*18.15*/("""<a class="navbar-brand" href="/evResumen" style="font-size: 18px">Inicio <i class="fa fa-home"></i></a>
			  """)))}),format.raw/*19.7*/("""
	          """),_display_(/*20.13*/if(session.get("cvesRoles").contains("3 "))/*20.56*/{_display_(Seq[Any](format.raw/*20.57*/("""
	              """),format.raw/*21.16*/("""<a class="navbar-brand" href="/coord" style="font-size: 18px">Inicio <i class="fa fa-home"></i></a>
	          """)))}),format.raw/*22.13*/("""			  
          """),format.raw/*23.11*/("""</div>
          <div id="navbar-collapse-grid" class="navbar-collapse collapse">
          	  """),_display_(/*25.15*/if(session.get("cvesRoles").contains("1 "))/*25.58*/{_display_(Seq[Any](format.raw/*25.59*/("""
	              """),format.raw/*26.16*/("""<ul class="nav navbar-nav">

				        <li class="dropdown">
				          <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false" style="font-size: 18px">Catálogos <span class="caret"></span></a>
				          <ul class="dropdown-menu" role="menu">
				            <li><a href="/unidadacademica">Unidades académicas</a></li>
				            
				            <li><a href="/nivelList">Niveles educativos</a></li>
				            <li><a href="/areaconocimientos">Áreas del conocimiento</a></li>
				            <li class="divider"></li>
				            <li><a href="/autorfuncion">Tipos de autorías</a></li>	
		
				            <li><a href="/formatosentrega">Formatos de entrega</a></li>
				            <li><a href="/tiposdocumentos">Tipos de documentos</a></li>
				            <li><a href="/dirigidoa">Dirigido a</a></li>

				          </ul>
				        </li>
				        <li class="dropdown">
				          <a href="/evaluadores" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false" style="font-size: 18px">Evaluadores <span class="caret"></span></a>
				          <ul class="dropdown-menu" role="menu">
				            <li><a href="/evaluadores">Listar</a></li>
				            <li><a href="/evaluador/new">Crear</a></li>            
				          </ul>
				        </li>
				        
				        <li class="dropdown">
				          <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false" style="font-size: 18px">Cuentas especiales <span class="caret"></span></a>
				          <ul class="dropdown-menu" role="menu">
				            <li><a href="/ctaAdminEdit">Administrador del sistema</a></li>
							<li><a href="/ctaCoordEdit">Coordinador de ERDD</a></li>
							<li class="divider"></li>
							<li class=""><a href="/ctaCorreo">Correo electrónico <span class="sr-only">(current)</span></a></li>            
				          </ul>
				        </li>				        
				        
				        
						
	              </ul>	 
              """)))}),format.raw/*65.16*/("""
			  """),_display_(/*66.7*/if(session.get("cvesRoles").contains("2 "))/*66.50*/{_display_(Seq[Any](format.raw/*66.51*/("""
			      """),format.raw/*67.10*/("""<ul class="nav navbar-nav" style="font-size: 18px">
			        <li class=dropdown">
			        	<a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Mis asignaciones <span class="caret"></span></a>
			        	<ul class="dropdown-menu" role="menu">
			        		<li><a href="/evList">Todas</a></li>
			        		<li><a href="/porEvaluar">Por atender</a></li>
			        		<li><a href="/enProceso">En proceso</a></li>
			        		<li><a href="/evPorAtenderAdmin">Para revisar por el administrador</a>		        		
			        		<li><a href="/evPorObservar">Con observaciones</a>
			        		<li><a href="/evConcluidas">Concluidas</a>		        		
			        		<li><a href="/evSolicitudesCancelacion">Con solicitudes de cancelación</a>
		        		</ul>
			        </li>		  
		          </ul>
			  """)))}),format.raw/*81.7*/("""
		  

          	  """),_display_(/*84.15*/if(session.get("cvesRoles").contains("3 "))/*84.58*/{_display_(Seq[Any](format.raw/*84.59*/("""
	              """),format.raw/*85.16*/("""<ul class="nav navbar-nav">
						<li class="dropdown yamm-fw"><a href="#" data-toggle="dropdown" class="dropdown-toggle" aria-expanded="false" style="font-size: 18px">En curso<b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li>
									<div class="row">
										<div id="equalheight">
											<div class="col-sm-1 visible-lg visible-md visible-sm  demo">
												<div class="lineaVertical5">&nbsp;</div>											
											</div>										
											<div class="col-sm-2 demo">	
													<h3>Solicitudes</h3>
													<a href="/recursos" class="ligaMegaMenu">Todas las solicitudes</a><br>
		        									<a href="/recursos/observarList" class="ligaMegaMenu">Solicitudes por revisar</a><br>
		        									<a href="/recursos/reObservarList" class="ligaMegaMenu">Solicitudes con observaciones</a><br>
		        									<a href="/recursos/completoList" class="ligaMegaMenu">Solicitudes aceptadas</a><br>
													<h3>Recursos</h3>
													<a href="/oficios" class="ligaMegaMenu">Recursos con oficio</a><br>
									        		<a href="/clasificacionList" class="ligaMegaMenu">Recursos clasificados</a><br>
									        		<a href="/asignarEvaluadores" class="ligaMegaMenu">Evaluadores asignados</a><br>											

											</div>
											<div class="col-sm-1 visible-lg visible-md visible-sm  demo">
												<div class="lineaVertical">&nbsp;</div>											
											</div>
											<div class="col-sm-2 demo" >
												<h3>Detalle de evaluaciones</h3>
												<a href="/mostrarEvaluacionesSinAtender/1" class="ligaMegaMenu">Evaluaciones por atender</a><br>
												<a href="/mostrarEvaluacionesEnProceso/1" class="ligaMegaMenu">Evaluaciones en proceso</a><br>
								        		<a href="/mostrarEvaluacionesPorRevisar/1" class="ligaMegaMenu">Evaluaciones para revisar por el administrador</a><br>
								        		<a href="/mostrarEvaluacionesConObservaciones/1" class="ligaMegaMenu">Evaluaciones con observaciones</a><br>
								        		<a href="/mostrarEvaluacionesConcluidas/1/lg" class="ligaMegaMenu">Evaluaciones concluidas (por cada uno de los aspectos) </a><br>
								        		<a href="/mostrarEvaluacionesConcluidas/0/lg" class="ligaMegaMenu">Evaluaciones concluidas (los 4 aspectos)</a><br>												
											</div>
											<div class="col-sm-1 visible-lg visible-md visible-sm  demo">
												<div class="lineaVertical">&nbsp;</div>											
											</div>										
											<div class="col-sm-2 demo">
												<h3>Cancelaciones</h3>
												<a href="/solicitudCanceladoList" class="ligaMegaMenu">Solicitudes de cancelación</a><br>
												<a href="/canceladoList" class="ligaMegaMenu">Canceladas</a><br>
												<h3>Detalle de encuestas</h3>
								        		<a href="/encuestasPorRevisarAdmin" class="ligaMegaMenu">Encuestas para revisión</a><br>
								        		<a href="/conObservacionesList" class="ligaMegaMenu">Encuestas con observaciones</a><br>
								        		<a href="/terminadasList" class="ligaMegaMenu">Encuestas concluidas</a><br>
											</div>
											<div class="col-sm-1 visible-lg visible-md visible-sm  demo">
												<div class="lineaVertical">&nbsp;</div>											
											</div>										
											<div class="col-sm-2 demo">
												<h3>Otros</h3>
		        								<a href="/actualizacionesList" class="ligaMegaMenu">Seguimiento a actualizaciones</a><br>												
		        								<a href="/prorrogaList" class="ligaMegaMenu">Prórrogas</a><br>													
											</div>
										</div>
									</div>								
								</li>								
							</ul>
						
						</li>


				        <li class="dropdown">
				          <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false" style="font-size: 18px">Catálogos <span class="caret"></span></a>
				          <ul class="dropdown-menu" role="menu">


		   	 				<li><a href="/evaluacionReactivosList">Reactivos</a></li>
		   	 				<li><a href="/evaluacionTablaEvaluacionList">Instrumento de evaluación</a></li>
			 				<li class="divider"></li>
				            <li><a href="/calendario">Calendario días inhábiles</a></li>		   	 				

</ul>
</li>




						<li class=""><a href="/autores" style="font-size: 18px">Autores<span class="sr-only" ></span></a></li>						
	              </ul>	 
              """)))}),format.raw/*164.16*/("""			  


		  """),format.raw/*167.5*/("""<ul class="nav navbar-nav" style="font-size: 18px">
		  	<li><a href=""""),_display_(/*168.20*/routes/*168.26*/.Application.Acerca()),format.raw/*168.47*/("""">Acerca de</a></li>
		  </ul>              
              
   	      <ul class="nav navbar-nav navbar-right">
            <li class="dropdown">
          <a href="#" style="font-size: 18px" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Mi cuenta <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li>
            	<table class="table">
            		<tr>
            			<td>Nombre real:</td>
            			<td>
							"""),_display_(/*180.9*/session/*180.16*/.get("nombre")),format.raw/*180.30*/("""
            			"""),format.raw/*181.16*/("""</td>
            		</tr>            		
            		<tr>
            			<td>Nombre usuario:</td>
            			<td>
            				"""),_display_(/*186.18*/if(session.get("cvesRoles").contains("1 "))/*186.61*/{_display_(_display_(/*186.63*/Usuario/*186.70*/.find.byId(session.get("idAdmin")).usuario))}),format.raw/*186.113*/("""
							"""),_display_(/*187.9*/if(session.get("cvesRoles").contains("2 "))/*187.52*/{_display_(_display_(/*187.54*/models/*187.60*/.Evaluador.getUsuario( Long.parseLong(session.get("idEvaluador"))  ).usuario))}),format.raw/*187.137*/("""
							"""),_display_(/*188.9*/if(session.get("cvesRoles").contains("3 "))/*188.52*/{_display_(_display_(/*188.54*/Usuario/*188.61*/.find.byId(session.get("idAdminProceso")).usuario))}),format.raw/*188.111*/("""            			
            			"""),format.raw/*189.16*/("""</td>            			
            		</tr>
            		<tr>            			
            			<td colspan="2">
            				<a class="btn btn-primary btn-block" role="button" id="btnCambiarPassword" data-toggle="modal" data-target="#modalMenu">Cambiar clave de acceso</a>
            			</td>
            		</tr>            		
            		<tr>
            			<td>Email:</td>
            			<td>            				
            				"""),_display_(/*199.18*/if(session.get("cvesRoles").contains("1 "))/*199.61*/{_display_(Seq[Any](format.raw/*199.62*/("""
            					"""),_display_(/*200.19*/Usuario/*200.26*/.find.byId(session.get("idAdmin")).personal.correo),format.raw/*200.76*/("""
            					
            				""")))}),format.raw/*202.18*/("""
            				"""),_display_(/*203.18*/if(session.get("cvesRoles").contains("2 "))/*203.61*/{_display_(Seq[Any](format.raw/*203.62*/("""
            					"""),_display_(/*204.19*/models/*204.25*/.Evaluador.getUsuario( Long.parseLong(session.get("idEvaluador"))  ).personal.correo),format.raw/*204.109*/("""
							""")))}),format.raw/*205.9*/("""
            				"""),_display_(/*206.18*/if(session.get("cvesRoles").contains("3 "))/*206.61*/{_display_(Seq[Any](format.raw/*206.62*/("""
            					"""),_display_(/*207.19*/Usuario/*207.26*/.find.byId(session.get("idAdminProceso")).personal.correo),format.raw/*207.83*/("""
            				""")))}),format.raw/*208.18*/("""							
            				"""),format.raw/*209.17*/("""<a class="btn btn-primary btn-block btn-xs" role="button" id="btnCambiarEmail" data-toggle="modal" data-target="#modalMenuCambiarEmail">Cambiar email</a>            			
            			</td>
            		</tr>
        		    <tr>
            			<td>Rol:</td>
            			<td>
            				"""),_display_(/*215.18*/session/*215.25*/.get("roles")),format.raw/*215.38*/("""      
           				"""),format.raw/*216.16*/("""</td>

           				"""),_display_(/*218.17*/if(session.get("cvesRoles").contains("2 "))/*218.60*/{_display_(Seq[Any](format.raw/*218.61*/("""
           			"""),format.raw/*219.15*/("""<tr>           				
           				<td>	
            				Aspectos:
            			</td>
            			<td>
           					<div style="display: table;">
   								"""),_display_(/*225.13*/for(a <- models.Evaluador.find.byId(Long.parseLong(session.get("idEvaluador"))).evaluadoraspectos  ) yield /*225.113*/{_display_(Seq[Any](format.raw/*225.114*/("""
   								"""),format.raw/*226.12*/("""<div style="display: table-row;">
   									<div style="display: table-cell;">
   										"""),_display_(/*228.15*/a/*228.16*/.aspecto.descripcion),format.raw/*228.36*/("""
   									"""),format.raw/*229.13*/("""</div>
   								</div>
   								""")))}),format.raw/*231.13*/("""
           					"""),format.raw/*232.17*/("""</div>            				
            			</td>
            		           			
            		</tr>

            		""")))}),format.raw/*237.16*/(""" 
            	"""),format.raw/*238.14*/("""</table>
            </li>
          </ul>
        </li>	        
	        
	        
	        <li><a href="/logout" style="font-size: 18px">Salir <i class="fa fa-sign-out"></i> </a></li>  	        
	      </ul>              
              

          </div>
        </div>


""")))}),format.raw/*252.2*/("""



	

	
	"""),format.raw/*259.2*/("""<!-- Modal Cambiar password -->
	<div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" id="modalMenu">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">Cambiar clave de acceso</h4>
	      </div>
	      <div class="modal-body">

			<form data-toggle="validator" role="form">
				<div class="row">
					<div class="col-sm-6">
						<label for="passActual" class="control-label">Clave de acceso actual</label>					
					</div>
					<div class="col-sm-6">
						<div class="form-group">
							<input type="password" name="passActual" id= "passActual" class="form-control" placeholder="Clave de acceso actual" required data-error="Este campo es obligatorio.">
							<span class="help-block with-errors"></span>
						</div>
					</div>		
				</div>
				<div class="row">
				
					<div class="col-sm-6">
						<label for="claveAcceso" class="control-label">Nueva clave de acceso</label>		
					</div>
					<div class="col-sm-6">
						<div class="form-group">
							<input type="password" name="claveAcceso" id="claveAcceso" pattern="[A-Za-z0-9]*" class="form-control"  placeholder="Clave de acceso" data-error="Este campo es obligatorio. Solo acepta numeros y letras, sin espacios ni caracteres especiales."  required>
							<div class="help-block with-errors"></div>
						</div>		
					</div>
				
				</div>
				<div class="row">
					<div class="col-sm-6">
						<label for="inputPasswordConfirm" class="control-label">Confirmar nueva clave de acceso</label>				
					</div>
					<div class="col-sm-6">
						<div class="form-group">
							<input type="password" pattern="[A-Za-z0-9]*" class="form-control" id="inputPasswordConfirm" data-match="#claveAcceso" data-error="Este campo es obligatorio." data-match-error="No coinciden la claves nuevas" placeholder="Volver a escribir clave de acceso" required>
							<div class="help-block with-errors"></div>
						</div>				
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div id="msgValidacion"></div>
					</div>
				</div>
			</form>	  
			
	        
	      </div>
	      <div class="modal-footer">
	      	<div class="form-group">
	        	<button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
	        	<button type="button" class="btn btn-primary"  id="btnAplicarCambiarPassword"  >Aplicar cambios</button>
        	</div>
	      </div>
	    </div>
	  </div>
	</div>







	<!-- Modal Cambiar email -->
	<div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" id="modalMenuCambiarEmail">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="">Cambiar email</h4>
	      </div>
	      <div class="modal-body">

			<form data-toggle="validator" role="form">
				<div class="row">
					<div class="col-sm-12">
						Por razones de seguridad, se le solicita ingrese su password
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">						<div class="help-block with-errors"></div>
						<label for="pass" class="control-label">Clave de acceso</label>					
					</div>
				</div>
				<div class="row">
					<div class="col-sm-12">
						<div class="form-group">
							<input type="password" name="pass" id= "pass" class="form-control" placeholder="Clave de acceso" required data-error="Este campo es obligatorio.">
							<span class="help-block with-errors"></span>
						</div>
					</div>
				</div>				
				<div class="row">
					<div class="col-sm-12">
						<label for="inputEmail" class="control-label">Correo electrónico</label>					
					</div>
				</div>				
				<div class="row">				
					<div class="col-sm-12">
						<div class="form-group">
						"""),_display_(/*367.8*/if(session.get("cvesRoles"))/*367.36*/{_display_(Seq[Any](format.raw/*367.37*/("""
							"""),_display_(/*368.9*/if(session.get("cvesRoles").contains("1 "))/*368.52*/{_display_(Seq[Any](format.raw/*368.53*/("""						
								"""),format.raw/*369.9*/("""<input type="email" class="form-control" id="inputEmail" data-pattern-error="No tiene la estructura de un correo electrónico" data-required-error="Este campo es obligatorio" placeholder="Correo electrónico" required value="""),_display_(/*369.232*/Usuario/*369.239*/.find.byId(session.get("idAdmin")).personal.correo),format.raw/*369.289*/(""">            					
	            			""")))}),format.raw/*370.18*/("""
	            			"""),_display_(/*371.18*/if(session.get("cvesRoles").contains("2 "))/*371.61*/{_display_(Seq[Any](format.raw/*371.62*/("""
	           					"""),format.raw/*372.18*/("""<input type="email" class="form-control" id="inputEmail" data-pattern-error="No tiene la estructura de un correo electrónico" data-required-error="Este campo es obligatorio" placeholder="Correo electrónico" required value="""),_display_(/*372.241*/models/*372.247*/.Evaluador.getUsuario( Long.parseLong(session.get("idEvaluador"))  ).personal.correo),format.raw/*372.331*/(""">
							   """)))}),format.raw/*373.12*/("""
							"""),_display_(/*374.9*/if(session.get("cvesRoles").contains("3 "))/*374.52*/{_display_(Seq[Any](format.raw/*374.53*/("""						
								"""),format.raw/*375.9*/("""<input type="email" class="form-control" id="inputEmail" data-pattern-error="No tiene la estructura de un correo electrónico" data-required-error="Este campo es obligatorio" placeholder="Correo electrónico" required value="""),_display_(/*375.232*/Usuario/*375.239*/.find.byId(session.get("idAdminProceso")).personal.correo),format.raw/*375.296*/(""">            					
	            			""")))}),format.raw/*376.18*/("""							   
           				""")))}),format.raw/*377.17*/("""

						"""),format.raw/*379.7*/("""</div>				
					</div>
				</div>

				<div class="row">
					<div class="col-sm-12">
						<div id="msg"></div>
					</div>
				</div>
			</form>	  
	        
	      </div>
	      <div class="modal-footer">
	      	<div class="form-group">
	        	<button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
	        	<button type="button" class="btn btn-primary"  id="btnAplicarCambiarEmail"  >Aplicar cambios</button>
        	</div>
	      </div>
	    </div>
	  </div>
	</div>






<script type="text/javascript">

	$(document).on('click', '.yamm .dropdown-menu', function(e) """),format.raw/*408.62*/("""{"""),format.raw/*408.63*/("""
	  """),format.raw/*409.4*/("""e.stopPropagation()
	"""),format.raw/*410.2*/("""}"""),format.raw/*410.3*/(""")

	$(".navbar").css("margin-bottom","0px");
	
	$("#btnAplicarCambiarPassword").on("click",function()"""),format.raw/*414.55*/("""{"""),format.raw/*414.56*/("""
		 """),format.raw/*415.4*/("""$("#msgValidacion").html("");
		
		$.ajax("""),format.raw/*417.10*/("""{"""),format.raw/*417.11*/("""
			  """),format.raw/*418.6*/("""url: """"),_display_(/*418.13*/routes/*418.19*/.Application.cambiarPassword),format.raw/*418.47*/("""",
			  method: "post",
			  data: """),format.raw/*420.12*/("""{"""),format.raw/*420.13*/("""
		        	"""),format.raw/*421.12*/("""'passActual': $("#passActual").val(), 
		        	'claveAcceso': $("#claveAcceso").val()
		    	  """),format.raw/*423.10*/("""}"""),format.raw/*423.11*/("""			  
			"""),format.raw/*424.4*/("""}"""),format.raw/*424.5*/(""").done(function(data) """),format.raw/*424.27*/("""{"""),format.raw/*424.28*/("""
			  """),format.raw/*425.6*/("""if (data.substring(0,6)  == "error:")"""),format.raw/*425.43*/("""{"""),format.raw/*425.44*/("""
				  """),format.raw/*426.7*/("""$("#msgValidacion").addClass("text-danger").removeClass("text-success");
				  $("#msgValidacion").html( data.substr(6) );
			  """),format.raw/*428.6*/("""}"""),format.raw/*428.7*/(""" """),format.raw/*428.8*/("""else """),format.raw/*428.13*/("""{"""),format.raw/*428.14*/("""
				  """),format.raw/*429.7*/("""$("#msgValidacion").removeClass("text-danger").addClass("text-success");
				  $("#msgValidacion").html( data );
				  setTimeout(function()"""),format.raw/*431.28*/("""{"""),format.raw/*431.29*/(""" """),format.raw/*431.30*/("""$("#modalMenu").modal("hide"); """),format.raw/*431.61*/("""}"""),format.raw/*431.62*/(""", 2000);
			  """),format.raw/*432.6*/("""}"""),format.raw/*432.7*/("""
			  
			"""),format.raw/*434.4*/("""}"""),format.raw/*434.5*/(""");
	"""),format.raw/*435.2*/("""}"""),format.raw/*435.3*/(""");
	
	

	$("#btnAplicarCambiarEmail").on("click",function()"""),format.raw/*439.52*/("""{"""),format.raw/*439.53*/("""
		 """),format.raw/*440.4*/("""$("#msg").html("");
		$.ajax("""),format.raw/*441.10*/("""{"""),format.raw/*441.11*/("""
			  """),format.raw/*442.6*/("""url: """"),_display_(/*442.13*/routes/*442.19*/.Application.cambiarEmail),format.raw/*442.44*/("""",
			  method: "post",
			  data: """),format.raw/*444.12*/("""{"""),format.raw/*444.13*/(""" 
		        	"""),format.raw/*445.12*/("""'pass': $("#pass").val(), 
		        	'email': $("#inputEmail").val()
		    	  """),format.raw/*447.10*/("""}"""),format.raw/*447.11*/("""			  
			"""),format.raw/*448.4*/("""}"""),format.raw/*448.5*/(""").done(function(data) """),format.raw/*448.27*/("""{"""),format.raw/*448.28*/("""
			  """),format.raw/*449.6*/("""if (data.substring(0,6)  == "error:")"""),format.raw/*449.43*/("""{"""),format.raw/*449.44*/("""
				  """),format.raw/*450.7*/("""$("#msg").addClass("text-danger").removeClass("text-success");
				  $("#msg").html( data.substr(6) );
			  """),format.raw/*452.6*/("""}"""),format.raw/*452.7*/(""" """),format.raw/*452.8*/("""else """),format.raw/*452.13*/("""{"""),format.raw/*452.14*/("""
				  """),format.raw/*453.7*/("""$("#msg").removeClass("text-danger").addClass("text-success");
				  $("#msg").html( data );
				  setTimeout(function()"""),format.raw/*455.28*/("""{"""),format.raw/*455.29*/(""" """),format.raw/*455.30*/("""$("#modalMenuCambiarEmail").modal("hide"); """),format.raw/*455.73*/("""}"""),format.raw/*455.74*/(""", 2000);
			  """),format.raw/*456.6*/("""}"""),format.raw/*456.7*/("""
			  
			"""),format.raw/*458.4*/("""}"""),format.raw/*458.5*/(""");
	"""),format.raw/*459.2*/("""}"""),format.raw/*459.3*/(""");	
	
	
</script>
<script src=""""),_display_(/*463.15*/routes/*463.21*/.Assets.at("javascripts/validator.min.js")),format.raw/*463.63*/("""" type="text/javascript"></script>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/megamenu.scala.html
                  HASH: 511030b093f8b96e27afdacf190a2b2a4b50b9a2
                  MATRIX: 801->0|843->16|871->17|913->32|941->33|968->34|1004->45|1053->86|1092->88|1121->91|1501->444|1553->487|1592->488|1636->504|1779->616|1822->632|1874->675|1913->676|1956->691|2096->801|2136->814|2188->857|2227->858|2271->874|2414->986|2458->1002|2581->1098|2633->1141|2672->1142|2716->1158|4793->3204|4826->3211|4878->3254|4917->3255|4955->3265|5822->4102|5870->4123|5922->4166|5961->4167|6005->4183|10422->8568|10462->8580|10561->8651|10577->8657|10620->8678|11157->9188|11174->9195|11210->9209|11255->9225|11419->9361|11472->9404|11503->9406|11520->9413|11588->9456|11624->9465|11677->9508|11708->9510|11724->9516|11826->9593|11862->9602|11915->9645|11946->9647|11963->9654|12038->9704|12098->9735|12555->10164|12608->10207|12648->10208|12695->10227|12712->10234|12784->10284|12852->10320|12898->10338|12951->10381|12991->10382|13038->10401|13054->10407|13161->10491|13201->10500|13247->10518|13300->10561|13340->10562|13387->10581|13404->10588|13483->10645|13533->10663|13586->10687|13909->10982|13926->10989|13961->11002|14012->11024|14063->11047|14116->11090|14156->11091|14200->11106|14394->11272|14512->11372|14553->11373|14594->11385|14717->11480|14728->11481|14770->11501|14812->11514|14881->11551|14927->11568|15068->11677|15112->11692|15420->11969|15458->11979|19628->16122|19666->16150|19706->16151|19742->16160|19795->16203|19835->16204|19878->16219|20130->16442|20148->16449|20221->16499|20289->16535|20335->16553|20388->16596|20428->16597|20475->16615|20727->16838|20744->16844|20851->16928|20896->16941|20932->16950|20985->16993|21025->16994|21068->17009|21320->17232|21338->17239|21418->17296|21486->17332|21545->17359|21581->17367|22218->17975|22248->17976|22280->17980|22329->18001|22358->18002|22488->18103|22518->18104|22550->18108|22621->18150|22651->18151|22685->18157|22720->18164|22736->18170|22786->18198|22850->18233|22880->18234|22921->18246|23048->18344|23078->18345|23115->18354|23144->18355|23195->18377|23225->18378|23259->18384|23325->18421|23355->18422|23390->18429|23546->18557|23575->18558|23604->18559|23638->18564|23668->18565|23703->18572|23872->18712|23902->18713|23932->18714|23992->18745|24022->18746|24064->18760|24093->18761|24131->18771|24160->18772|24192->18776|24221->18777|24309->18836|24339->18837|24371->18841|24429->18870|24459->18871|24493->18877|24528->18884|24544->18890|24591->18915|24655->18950|24685->18951|24727->18964|24835->19043|24865->19044|24902->19053|24931->19054|24982->19076|25012->19077|25046->19083|25112->19120|25142->19121|25177->19128|25313->19236|25342->19237|25371->19238|25405->19243|25435->19244|25470->19251|25619->19371|25649->19372|25679->19373|25751->19416|25781->19417|25823->19431|25852->19432|25890->19442|25919->19443|25951->19447|25980->19448|26040->19480|26056->19486|26120->19528
                  LINES: 29->1|30->2|30->2|30->2|30->2|31->3|33->5|33->5|33->5|35->7|42->14|42->14|42->14|43->15|44->16|45->17|45->17|45->17|46->18|47->19|48->20|48->20|48->20|49->21|50->22|51->23|53->25|53->25|53->25|54->26|93->65|94->66|94->66|94->66|95->67|109->81|112->84|112->84|112->84|113->85|192->164|195->167|196->168|196->168|196->168|208->180|208->180|208->180|209->181|214->186|214->186|214->186|214->186|214->186|215->187|215->187|215->187|215->187|215->187|216->188|216->188|216->188|216->188|216->188|217->189|227->199|227->199|227->199|228->200|228->200|228->200|230->202|231->203|231->203|231->203|232->204|232->204|232->204|233->205|234->206|234->206|234->206|235->207|235->207|235->207|236->208|237->209|243->215|243->215|243->215|244->216|246->218|246->218|246->218|247->219|253->225|253->225|253->225|254->226|256->228|256->228|256->228|257->229|259->231|260->232|265->237|266->238|280->252|287->259|395->367|395->367|395->367|396->368|396->368|396->368|397->369|397->369|397->369|397->369|398->370|399->371|399->371|399->371|400->372|400->372|400->372|400->372|401->373|402->374|402->374|402->374|403->375|403->375|403->375|403->375|404->376|405->377|407->379|436->408|436->408|437->409|438->410|438->410|442->414|442->414|443->415|445->417|445->417|446->418|446->418|446->418|446->418|448->420|448->420|449->421|451->423|451->423|452->424|452->424|452->424|452->424|453->425|453->425|453->425|454->426|456->428|456->428|456->428|456->428|456->428|457->429|459->431|459->431|459->431|459->431|459->431|460->432|460->432|462->434|462->434|463->435|463->435|467->439|467->439|468->440|469->441|469->441|470->442|470->442|470->442|470->442|472->444|472->444|473->445|475->447|475->447|476->448|476->448|476->448|476->448|477->449|477->449|477->449|478->450|480->452|480->452|480->452|480->452|480->452|481->453|483->455|483->455|483->455|483->455|483->455|484->456|484->456|486->458|486->458|487->459|487->459|491->463|491->463|491->463
                  -- GENERATED --
              */
          