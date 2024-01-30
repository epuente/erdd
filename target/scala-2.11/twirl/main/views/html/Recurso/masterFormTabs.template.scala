
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
object masterFormTabs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Recurso],Long,Recurso,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(recursoForm: Form[Recurso], id: Long, recurso: Recurso ):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*3.59*/("""
"""),format.raw/*5.83*/(""" 

	"""),format.raw/*7.2*/("""<div class="row">
		<div class="col-xs-12 col-sm-12 col-md-12 col-ld-12">
			Los campos marcados con asterisco "*" son obligatorios.
		</div>
	</div>



	<div class="row">
    	<div class="col-sm-12">
                  <!-- Nav tabs -->
               <div class="card">
                  <ul class="nav nav-tabs nav-justified" role="tablist">
                      <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">Home</a></li>
                      <li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">Profile</a></li>
                      <li role="presentation"><a href="#messages" aria-controls="messages" role="tab" data-toggle="tab">Messages</a></li>
                      <li role="presentation"><a href="#settings" aria-controls="settings" role="tab" data-toggle="tab">Settings</a></li>
                  </ul>

                  <!-- Tab panes -->
                            <div class="tab-content">
                                <div role="tabpanel" class="tab-pane active" id="home">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</div>
                                <div role="tabpanel" class="tab-pane" id="profile">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.</div>
                                <div role="tabpanel" class="tab-pane" id="messages">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</div>
                                <div role="tabpanel" class="tab-pane" id="settings">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passage..</div>
                            </div>
</div>
       </div>
	</div>




	<div class="row">
		<div class="col-md-8">
			<div class="panel panel-default">
           		<div class="panel-heading"><span class="glyphicon glyphicon-list-alt"></span>DATOS DE IDENTIDAD</div>
       			<div class="panel-body">
     				<input type="hidden" name="elId" id="elId" value='"""),_display_(/*45.61*/id),format.raw/*45.63*/("""' >
					<div class="row">
						"""),_display_(/*47.8*/if(recurso == null)/*47.27*/{_display_(Seq[Any](format.raw/*47.28*/("""
							"""),format.raw/*48.8*/("""<div class="col-md-12 reqtitulo" id="reqtitulo">
								"""),_display_(/*49.10*/inputText(recursoForm("titulo"), '_label -> "Título del Recurso Didáctico Digital*", '_help -> "", 'size->"80", 'required->"required", 'class->"form-control validaRegExp", 'maxlength->"150", 'patron->"[a-z0-9àèìòùáéíóúñ_ \"'/*-+.,()ü{}=<>:;-]+")),format.raw/*49.255*/("""
							"""),format.raw/*50.8*/("""</div>							
       					""")))}/*51.15*/else/*51.20*/{_display_(Seq[Any](format.raw/*51.21*/("""
							"""),format.raw/*52.8*/("""<div class="col-md-8 reqtitulo">
								"""),_display_(/*53.10*/inputText(recursoForm("titulo"), '_label -> "Título del Recurso Didáctico Digital*", '_help -> "", 'size->"80", 'required->"required", 'class->"form-control validaRegExp", 'maxlength->"150", 'patron->"[a-z0-9àèìòùáéíóúñ_ \"'/*-+.,()ü{}=<>:;-]+")),format.raw/*53.255*/("""
							"""),format.raw/*54.8*/("""</div>        					
      						<div class="col-md-4 center-block">
      							Clave de control:
      							<div class="numControlNumero">"""),_display_(/*57.45*/recurso/*57.52*/.numcontrol),format.raw/*57.63*/("""</div>
      						</div>
       					""")))}),format.raw/*59.14*/("""
					"""),format.raw/*60.6*/("""</div>
					<div class="row">
				        <div id="reqniveleducativo_id" class="col-md-6 requerido">
		       				"""),_display_(/*63.15*/select(
			                recursoForm("niveleducativo.id"), 
			                options( models.Niveleducativo.options), 
			                '_label -> "Nivel educativo*", '_default -> "Seleccione nivel educativo...",
			                '_showConstraints -> false, 'required->"required", 'class->"form-control" 
			            	)),format.raw/*68.18*/("""
          				"""),format.raw/*69.15*/("""</div>
						<div id="reqareaconocimiento_id" class="col-md-6 requerido">
				            """),_display_(/*71.18*/select(
				                recursoForm("areaconocimiento.id"), 
				                options(models.Areaconocimiento.options), 
				                '_label -> "Área del conocimiento*", '_default -> "Seleccione área del conocimiento...",
				                '_showConstraints -> false, 'required->"required", 'class->"form-control"
				            )),format.raw/*76.18*/("""             		
		          		"""),format.raw/*77.15*/("""</div>
					</div>
					<div class="row">
						<div id="requnidadacademica_id" class="col-md-12 requerido">
						"""),format.raw/*88.19*/(""" 	        		
                            """),_display_(/*89.30*/select(
                                recursoForm("unidadacademica.id"),    
                                options(),            
                                '_label -> "Unidad académica*", '_default -> "Seleccione Nivel educativo y Área del conocimiento",
                                '_showConstraints -> false, 'required->"required", 'class->"form-control"
                            )),format.raw/*94.30*/("""				            
			       		"""),format.raw/*95.13*/("""</div>						
					</div>
					<div class="row">
							<div id="reqprogramaacad" class="col-md-8 requerido">
			       				"""),_display_(/*99.16*/inputText(recursoForm("programaacad"), '_label -> "Programa académico*", '_help -> "", 'required->"required", 'class->"form-control validaRegExp", 'size->50, 'maxlength->"80", 'patron->"[a-z0-99àèìòùáéíóúñ_ \"'/*-+.,()ü{}=<>:;-]+")),format.raw/*99.247*/("""
				       		"""),format.raw/*100.14*/("""</div>	
				       		
							<div id="reqmodalidad_id" class="col-md-4 requerido">
							
       							
"""),format.raw/*111.3*/("""					      			

								"""),format.raw/*113.9*/("""<div class="form-group clearfix">
									<label>Modalidad donde se usará el recurso*</label>
					      			"""),_display_(/*115.16*/for((k,v) <-models.Modalidad.options()) yield /*115.55*/{_display_(Seq[Any](format.raw/*115.56*/("""
					      				"""),format.raw/*116.16*/("""<label class="radio-inline">
					      					<input type="radio" name="modalidad.id" id="modalidad_id_"""),_display_(/*117.75*/k),format.raw/*117.76*/("""" value=""""),_display_(/*117.86*/k),format.raw/*117.87*/("""" required="required"> """),_display_(/*117.111*/v),format.raw/*117.112*/("""
				      					"""),format.raw/*118.16*/("""</label>
					      			""")))}),format.raw/*119.16*/("""
					      			
					      			"""),format.raw/*121.15*/("""<span class="help-block with-errors">
					      				
					      			</span>
									<div>
								    	
						    				<textarea placeholder="Escriba su observacion..." name="observacion_modalidad.id" class="observacion" maxlength="600" style="min-width: 100%"></textarea>
						   					<button type="button" name="btnObservacion_modalidad.id" class="btn btn-primary btn-xs form-control" style="display:none5">Agregar observación</button>
								    	
										<div class="errorObservacion" style="color:red"></div>		    	
								    </div>					      			
					      			
					      			
				      			</div>
					      			

           					</div>	        		
				       							
					</div>
					<div class="row">				
						<div id="reqalcancecurricular_id" class="col-md-4">
				            """),_display_(/*141.18*/select(
				                recursoForm("alcancecurricular.id"), 
				                options(models.AlcanceCurricular.options), 
				                '_label -> "Alcance curricular", '_default -> "Seleccione el alcance...",
				                '_showConstraints -> false, 'onchange->"javascript:clickAlcance(this)", 'class->"form-control"
				            )),format.raw/*146.18*/(""" 	        		
			       		"""),format.raw/*147.13*/("""</div>	
			       		<div class="col-md-4">
			       			"""),_display_(/*149.15*/inputText(recursoForm("alcancecurricularotro"), '_label -> "Describa:", '_help -> "", 'pattern->"[A-Za-z áéíóúÁÉÍÓÚñÑ-]*", 'class->"form-control", 'maxlength->"120")),format.raw/*149.180*/("""
			       		"""),format.raw/*150.13*/("""</div>
   						<div class="col-md-4">
                             <div>
                                """),_display_(/*153.34*/select(
                                    recursoForm("unidadmedida.id"), 
                                    options(models.UnidadMedida.options), 
                                    '_label -> "Unidad de medida", '_default -> "Seleccione la unidad de medida...",
                                    '_showConstraints -> false, 'class->"form-control"
                                )),format.raw/*158.34*/(""" 
                                """),_display_(/*159.34*/inputText(recursoForm("duracion"), '_label -> "Duración", '_help -> "", 'size->10, 'class->"form-control validaRegExp" , 'patron->"[0-9]", 'maxlength->5, 'placeholder->"Número entero" )),format.raw/*159.219*/("""
                            """),format.raw/*160.29*/("""</div>
                        </div>
   						
   						
					</div>
					<div class="row">
			       		<div id="reqelaboracion" class="col-md-4  requerido">
      							"""),_display_(/*167.15*/inputText(recursoForm("elaboracion"), '_label -> "Fecha de elaboración*", '_help -> "", 'required5->"required5",'class->"form-control", 'placeholder->"dd/mm/aaaa" )),format.raw/*167.179*/("""
      						"""),format.raw/*168.13*/("""</div>
      						<div id="reqversion_id" class="col-md-4 requerido">	        	
				     			"""),_display_(/*170.14*/inputRadioGroup(
							         recursoForm("version.id"),
							         options = options(models.Version.options),
							         'labelAlterna -> "Versión*", 'required->"required"
						      	)),format.raw/*174.15*/("""
			
					      		"""),format.raw/*176.14*/("""<div id="divVersion" style="display:none;" >
								      """),_display_(/*177.16*/inputRadioGroup(
								         recursoForm("extra1"),
								         options = options("S" -> "Si", "N" -> "No"),
								         'labelAlterna -> "¿Recuerda la clave de control anterior?")),format.raw/*180.77*/("""
						         """),format.raw/*181.16*/("""</div>
					         
								<div class="form-group clearfix " id="divNumControl" style="display: none;">
						         	<table border="0" style="width: 100%;">
						         		<tr>
						         			<td colspan="2">
						         				<label for="va_numcontrol" class="control-label">Clave de control anterior</label>
						         			</td>
						         		</tr>
						         		
						         		<tr>
						         			<td>
												<div class="input input-group">
												    <input type="text" id="versionanterior_recursoanterior_id" name="versionanterior.recursoanterior_id" value="" size="16" class="form-control" pattern="[A-Za-z0-9]*">
													<span class="help-block with-errors"></span>
													<div>
														<textarea placeholder="Escriba su observacion..." name="observacion_versionanterior.recursoanterior_id" class="observacion"></textarea>
														<button type="button" name="btnObservacion_versionanterior.recursoanterior_id" class="btn btn-primary btn-xs form-control" style="display: none;">Corregir</button>		    	
													</div>
												</div>									         			
						         			</td>
						         			<td><a class="btn btn-primary btn-xs" href="javascript:bnca()" role="button">Buscar clave de control</a></td>									         			
						         		</tr>
						         		<tr>
						         			<td colspan="2"><div id="msgBuscarNc"></div></td>
						         		</tr>
						         	</table>													
								</div>							         
		         		</div>	
		         		<div class="col-md-4">
								"""),_display_(/*211.10*/inputCheckboxGroup(
							         recursoForm("dirigidoa.id"),
							         options = options(models.Dirigidoa.options),'name->"dirigidoa.id",							         
							         'labelAlterna -> "Dirigido a*"
						      	)),format.raw/*215.15*/("""		         			
		         		"""),format.raw/*216.14*/("""</div>	      
			      </div>	
			      <div class="row">
        		  	<div id="reqsinopsis" class="col-md-12 requerido" >
       						"""),_display_(/*220.15*/textarea(recursoForm("sinopsis"), args = 'rows -> 8, 'cols -> 60, 'required->"required", 'class->"form-control validaRegExp", '_label->"Sinopsis*", 'maxlength->"250", 'style->"min-width:100%", 'patron->"[a-z0-99àèìòùáéíóúñ_ \"'/*-+.,()ü{}=<>:;-]+")),format.raw/*220.263*/("""
      			  	"""),format.raw/*221.13*/("""</div>
   			  	  </div>
       				<div class="row">  
						<div style="display:none">
							"""),_display_(/*225.9*/select(recursoForm("auxiliar"), options(models.Autorfuncion.options), '_label -> "Tipo de autoría", '_default -> "Seleccione tipo de autoría...", '_showConstraints -> false)),format.raw/*225.182*/("""
				  			"""),_display_(/*226.11*/select(
				              recursoForm("auxDocto"), 
				              options( models.Tipodocumento.optionsActivas), 
				              '_label -> "Tipo de documento", '_default -> "Seleccione el tipo...",
				              '_showConstraints -> false,
				              'required->"required"
				          	)),format.raw/*232.17*/(""" 
						"""),format.raw/*233.7*/("""</div>			
	
	
	
					</div>	   			  	  
       		    </div>
       	    </div>
			<div class="panel panel-default">
           		<div class="panel-heading"><span class="glyphicon glyphicon-list-alt"></span>AUTORES POR FUNCIÓN</div>
       			<div class="panel-body">
                  	<div class="row">
                  		<div class="col-md-12">
							Si usted es el único autor del recurso, registre los datos que a continuación se solicitan y automáticamente quedará registrado como responsable para todos los efectos administrativos relacionados con su proceso de solicitud.
							<br><br> 
							En caso de haber más autores, utilice la opción correspondiente para agregar a todos los que hayan participado en la producción del recurso, especificando el rol o función que cada uno de ellos asumió durante el proceso.								                  		
                  		</div>                  							                  	
                  	</div>
                  	<div class="row">
                  		<div class="col-xs-2">Nombre*</div>
                  		<div class="col-xs-2">Paterno*</div>
                  		<div class="col-xs-2">Materno*</div>
                  		<div class="col-xs-2">Tipo autoría*</div>
                  		<div class="col-xs-2">Correo*</div>
                  		<div class="col-xs-2">Teléfono*</div>
                  	</div>
       			
                  	<div id="tableAutor">
					</div>
					<div>
						<a href="javascript:agregarAutor()" id="ligaAgregarOtroAutor">Agregar otro autor</a>
					</div>

				</div>
			</div>
		</div>

   
        
		<div class="col-md-4">
			<div class="panel panel-default">
           		<div class="panel-heading"><span class="glyphicon glyphicon-list-alt"></span>PALABRAS CLAVE</div>
       			<div class="panel-body">     
	       			<div class="col-md-12   clearfix">
	        			<table id="tablaPalabras" class="tablaPalabras">
	        				<thead>
	        					<tr><td>Palabras clave*. Mínimo cinco palabras clave que permitan hacer una identificación del recurso acorde con su temática.<td></tr>
	        				</thead>
	        				<tbody>	
	        				   """),_display_(/*281.18*/if(recurso != null)/*281.37*/{_display_(Seq[Any](format.raw/*281.38*/("""	
		        				   """),_display_(/*282.19*/for(   (pc,i)<-recurso.palabrasclave.zipWithIndex   ) yield /*282.72*/ {_display_(Seq[Any](format.raw/*282.74*/("""
		        				   		"""),format.raw/*283.20*/("""<tr><td><div class="form-group has-success">
		        				   		<div class="input input-group" style="min-width:100%">
			        				   		<input type="text" name="palabra.descripcion"""),_display_(/*285.66*/i),format.raw/*285.67*/("""" value=""""),_display_(/*285.77*/pc/*285.79*/.descripcion),format.raw/*285.91*/("""" class="form-control" maxlength="35"  pattern="[a-z0-9ñ_áéíóúÁÉÍÓÚ \'/*-+.,()ü#$%&/!¿?¡"""),format.raw/*285.179*/("""{"""),format.raw/*285.180*/("""}"""),format.raw/*285.181*/("""=<>:;-]*"><div class="help-block with-errors"></div>      </div><textarea placeholder="Escriba su observacion..." name="observacion_palabra.descripcion"""),_display_(/*285.333*/i),format.raw/*285.334*/("""" class="observacion"></textarea>    <button type="button" name="btnObservacion_palabra.descripcion"""),_display_(/*285.434*/i),format.raw/*285.435*/("""" class="btn btn-primary btn-xs form-control">Corregir</button>
			        				   		<div class="errorObservacion" style="color:red"></div>  
										</div>		        				   		
		        				   		   </td><td><input type="button" value="Quitar palabra" onclick="eliminarPalabra(this)"></td></tr>
		        				   """)))}),format.raw/*289.19*/("""
	        				   """)))}),format.raw/*290.18*/("""
	        				"""),format.raw/*291.14*/("""</tbody>    
	        				<tfoot>
	        					<tr>
	        						<td><a href="javascript:agregarPalabra()" id="ligaAgregarOtraPalabra">Agregar otra palabra</a></td>
	        					</tr>
	        				</tfoot>    				
	        			</table>
	       			</div>       			
       			</div>
   			</div>
			<div class="panel panel-default">
           		<div class="panel-heading"><span class="glyphicon glyphicon-list-alt"></span>FORMATO DE ENTREGA</div>
       			<div class="panel-body">
       				<div class="row">   

	       				<div class="col-md-12">
							<div id="reqformatoentrega_id" class="requerido" >
								     """),_display_(/*308.15*/inputRadioGroup(
								         recursoForm("formatoentrega.id"),
								         options = options(models.Formatoentrega.options),
								         'labelAlterna -> "Formato de entrega*", 'onclick->"javascript:clickFormato(this)", 'required->"required"
								      )),format.raw/*312.16*/("""		
								      """),_display_(/*313.16*/inputText(recursoForm("formatoentregaotro"), '_label -> "Describa:", '_help -> "", 'patron->"[a-z àèìòùáéíóúñü.,()-]+", 'class->"form-control validaRegExp")),format.raw/*313.172*/("""			
							"""),format.raw/*314.8*/("""</div>       				
	       				</div>
       				</div>
   				</div>
			</div>
       				
			<div class="panel panel-default">
           		<div class="panel-heading"><span class="glyphicon glyphicon-list-alt"></span>RECURSO EN LÍNEA</div>
       			<div class="panel-body">
       				
       				<div class="row">
	       				<div class="col-md-12">
	       					Si su Recurso Didáctico Digital se encuentra en línea coloque en el siguiente espacio la página.
	       				</div>
       				</div>
       				<div class="row">
	       				<div class="col-md-12">
		       				"""),_display_(/*331.15*/inputText(recursoForm("url"), '_label -> "Dirección", '_help -> "", 'class->"form-control validaRegExp", 'size->"40" ,'placeholder->"Dirección del tipo http://", 'maxlength->"80", 'patron->"[a-z0-99àèìòùáéíóúñ_ \"'/*-+.,()ü#$%&/!¿?¡{}=<>:;-]")),format.raw/*331.258*/("""
	       				"""),format.raw/*332.13*/("""</div>
       				</div>
       				<div class="row">
       					<div class="col-md-12">
       						Si el Recurso Didáctico Digital está en un sitio web o plataforma y requiere autentificación, escriba a continuación el nombre de usuario y contraseña.
       					</div>
       				</div>       				
       				<div class="row">
	       				<div class="col-md-6">
	       					"""),_display_(/*341.15*/inputText(recursoForm("webUsuario"), '_label -> "Usuario", '_help -> "", 'class->"form-control validaRegExp", 'size->"20em" ,'placeholder->"Nombre de usuario", 'maxlength->"20", 'patron->"[a-z0-99àèìòùáéíóúñü ]+")),format.raw/*341.228*/("""
	       				"""),format.raw/*342.13*/("""</div>
	       				<div class="col-md-6">
		       				"""),_display_(/*344.15*/inputText(recursoForm("webPassword"), '_label -> "Clave de acceso", '_help -> "",  'class->"form-control validaRegExp", 'size->"20em" ,'placeholder->"Clave de acceso", 'maxlength->"50", 'patron->"[a-z0-99àèìòùáéíóúñü ]+")),format.raw/*344.236*/("""
	       				"""),format.raw/*345.13*/("""</div>
       				</div>
				</div>
   			</div>

			
		</div>
			
			
			

	
	</div>

	<div class="row">
		<div class="col-md-12">
			<div class="panel panel-default">
           		<div class="panel-heading"><span class="glyphicon glyphicon-list-alt"></span>DOCUMENTOS</div>
       			<div class="panel-body">
                  	<div class="row">
                  		<div class="col-md-12">
								A continuación deberá anexar los documentos escaneados en formato PDF que apliquen de acuerdo con el tipo de recurso que se va a evaluar.                  		
                  		</div>                  							                  	
                  	</div>
                  	<div class="row tablaIndicacionesDoctos2">
                  		<div class="col-md-12">
	                  		<ul>
								<li>Constancia de validación académica (con sello y firma) emitida por la Academia correspondiente.
								<li>Formato de estrategia didáctica para el uso del recurso en la modalidad que corresponda.
								<li>Manual de instalación, instructivo o guía para el usuario del recurso didáctico digital.
								<li>Carta de cesión de derechos a favor del IPN por cada uno de los autores y perfiles registrados en el apartado AUTORES de esta solicitud.
								<li>Registro de autoría en Creative Commons a nombre de los docentes registrados como AUTORES en esta solicitud.	                  			
							</ul>
                  		</div>
                  	</div>

                  	<div class="row ">
                  		<div class="col-md-5">
                  			Documento*
                  		</div>
                  		<div class="col-md-5">
                  			Tipo de documento*  Es necesario que el formato del archivo sea PDF
                  		</div>            
                  		<div class="col-md-2">
                  		</div>
                  	</div>
                  	<div class="row">
                  		<div class="col-md-12">
                  			&nbsp;
                  		</div>
                  	</div>
                  	<div class="row">
                  		<div class="col-lg-12" style="padding:2%">
                  		    <div style="padding: 2%;  border: 1px solid #e8e8e8;">
		                  	   <div id="tableDocumentos">  	</div>
		                  	</div>                  		
                  		</div>
                  	</div>
					<div class="row">
						<div class="col-lg-12"> <a href="javascript:agregarDocumento2()" id="ligaAgregarDocto">Agregar otro documento</a> </div>						
					</div>

			    	<input type="text" id="documentosBorrar" name="documentosBorrar" style="display:none"/>
			    	<input type="text" id="observacionesDocumentosBorrar" name="observacionesDocumentosBorrar" style="display:none"/>
				
               	</div>
           	</div>
       	</div>	
	</div>



"""))}
  }

  def render(recursoForm:Form[Recurso],id:Long,recurso:Recurso): play.twirl.api.HtmlFormat.Appendable = apply(recursoForm,id,recurso)

  def f:((Form[Recurso],Long,Recurso) => play.twirl.api.HtmlFormat.Appendable) = (recursoForm,id,recurso) => apply(recursoForm,id,recurso)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:35 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/masterFormTabs.scala.html
                  HASH: 9df8120ce87ed489d50e6344e4e8184876f01018
                  MATRIX: 760->3|912->79|944->103|1031->60|1059->160|1089->164|4713->3761|4736->3763|4796->3797|4824->3816|4863->3817|4898->3825|4983->3883|5250->4128|5285->4136|5331->4164|5344->4169|5383->4170|5418->4178|5487->4220|5754->4465|5789->4473|5959->4616|5975->4623|6007->4634|6077->4673|6110->4679|6252->4794|6603->5124|6646->5139|6764->5230|7133->5578|7191->5608|7334->6101|7403->6143|7824->6543|7881->6572|8032->6696|8285->6927|8328->6941|8462->7262|8514->7286|8652->7396|8708->7435|8748->7436|8793->7452|8924->7555|8947->7556|8985->7566|9008->7567|9061->7591|9085->7592|9130->7608|9186->7632|9245->7662|10064->8453|10442->8809|10496->8834|10581->8891|10769->9056|10811->9069|10946->9176|11357->9565|11420->9600|11628->9785|11686->9814|11887->9987|12074->10151|12116->10164|12238->10258|12460->10458|12507->10476|12595->10536|12812->10731|12857->10747|14458->12320|14705->12545|14762->12573|14927->12710|15198->12958|15240->12971|15364->13068|15560->13241|15599->13252|15929->13560|15965->13568|18128->15703|18157->15722|18197->15723|18245->15743|18315->15796|18356->15798|18405->15818|18617->16002|18640->16003|18678->16013|18690->16015|18724->16027|18842->16115|18873->16116|18904->16117|19085->16269|19109->16270|19238->16370|19262->16371|19607->16684|19657->16702|19700->16716|20353->17341|20647->17613|20693->17631|20872->17787|20911->17798|21518->18377|21784->18620|21826->18633|22235->19014|22471->19227|22513->19240|22597->19296|22841->19517|22883->19530
                  LINES: 26->3|28->5|28->5|29->3|30->5|32->7|70->45|70->45|72->47|72->47|72->47|73->48|74->49|74->49|75->50|76->51|76->51|76->51|77->52|78->53|78->53|79->54|82->57|82->57|82->57|84->59|85->60|88->63|93->68|94->69|96->71|101->76|102->77|106->88|107->89|112->94|113->95|117->99|117->99|118->100|123->111|125->113|127->115|127->115|127->115|128->116|129->117|129->117|129->117|129->117|129->117|129->117|130->118|131->119|133->121|153->141|158->146|159->147|161->149|161->149|162->150|165->153|170->158|171->159|171->159|172->160|179->167|179->167|180->168|182->170|186->174|188->176|189->177|192->180|193->181|223->211|227->215|228->216|232->220|232->220|233->221|237->225|237->225|238->226|244->232|245->233|293->281|293->281|293->281|294->282|294->282|294->282|295->283|297->285|297->285|297->285|297->285|297->285|297->285|297->285|297->285|297->285|297->285|297->285|297->285|301->289|302->290|303->291|320->308|324->312|325->313|325->313|326->314|343->331|343->331|344->332|353->341|353->341|354->342|356->344|356->344|357->345
                  -- GENERATED --
              */
          