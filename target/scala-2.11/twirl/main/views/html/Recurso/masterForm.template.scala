
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
object masterForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Recurso],Long,Recurso,play.twirl.api.HtmlFormat.Appendable] {

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
		<div class="col-md-8">
			<div class="panel panel-default">
           		<div class="panel-heading"><span class="glyphicon glyphicon-list-alt"></span>DATOS DE IDENTIDAD</div>
       			<div class="panel-body">
     				<input type="hidden" name="elId" id="elId" value='"""),_display_(/*18.61*/id),format.raw/*18.63*/("""' >
					<div class="row">
						"""),_display_(/*20.8*/if(recurso == null)/*20.27*/{_display_(Seq[Any](format.raw/*20.28*/("""
							"""),format.raw/*21.8*/("""<div class="col-md-12 reqtitulo" id="reqtitulo">
								"""),_display_(/*22.10*/inputText(recursoForm("titulo"), '_label -> "Título del Recurso Didáctico Digital*", '_help -> "", 'size->"80", 'required->"required", 'class->"form-control validaRegExp", 'maxlength->"150", 'patron->"[a-z0-9àèìòùáéíóúñ_ \"'/*-+.,()ü{}=<>:;-]+")),format.raw/*22.255*/("""
							"""),format.raw/*23.8*/("""</div>							
       					""")))}/*24.15*/else/*24.20*/{_display_(Seq[Any](format.raw/*24.21*/("""
							"""),format.raw/*25.8*/("""<div class="col-md-8 reqtitulo">
								"""),_display_(/*26.10*/inputText(recursoForm("titulo"), '_label -> "Título del Recurso Didáctico Digital*", '_help -> "", 'size->"80", 'required->"required", 'class->"form-control validaRegExp", 'maxlength->"150", 'patron->"[a-z0-9àèìòùáéíóúñ_ \"'/*-+.,()ü{}=<>:;-]+")),format.raw/*26.255*/("""
							"""),format.raw/*27.8*/("""</div>        					
      						<div class="col-md-4 center-block">
      							Clave de control:
      							<div class="numControlNumero">"""),_display_(/*30.45*/recurso/*30.52*/.numcontrol),format.raw/*30.63*/("""</div>
      						</div>
       					""")))}),format.raw/*32.14*/("""
					"""),format.raw/*33.6*/("""</div>
					<div class="row">
				        <div id="reqniveleducativo_id" class="col-md-6 requerido">
		       				"""),_display_(/*36.15*/select(
			                recursoForm("niveleducativo.id"), 
			                options( models.Niveleducativo.options), 
			                '_label -> "Nivel educativo*", '_default -> "Seleccione nivel educativo...",
			                '_showConstraints -> false, 'required->"required", 'class->"form-control" 
			            	)),format.raw/*41.18*/("""
          				"""),format.raw/*42.15*/("""</div>
						<div id="reqareaconocimiento_id" class="col-md-6 requerido">
				            """),_display_(/*44.18*/select(
				                recursoForm("areaconocimiento.id"), 
				                options(models.Areaconocimiento.options), 
				                '_label -> "Área del conocimiento*", '_default -> "Seleccione área del conocimiento...",
				                '_showConstraints -> false, 'required->"required", 'class->"form-control"
				            )),format.raw/*49.18*/("""             		
		          		"""),format.raw/*50.15*/("""</div>
					</div>
					<div class="row">
						<div id="requnidadacademica_id" class="col-md-12 requerido">
						"""),format.raw/*61.19*/(""" 	        		
                            """),_display_(/*62.30*/select(
                                recursoForm("unidadacademica.id"),    
                                options(),            
                                '_label -> "Unidad académica*", '_default -> "Seleccione Nivel educativo y Área del conocimiento",
                                '_showConstraints -> false, 'required->"required", 'class->"form-control"
                            )),format.raw/*67.30*/("""				            
			       		"""),format.raw/*68.13*/("""</div>						
					</div>
					<div class="row">
							<div id="reqprogramaacad" class="col-md-8 requerido">
			       				"""),_display_(/*72.16*/inputText(recursoForm("programaacad"), '_label -> "Programa académico*", '_help -> "", 'required->"required", 'class->"form-control validaRegExp", 'size->50, 'maxlength->"80", 'patron->"[a-z0-99àèìòùáéíóúñ_ \"'/*-+.,()ü{}=<>:;-]+")),format.raw/*72.247*/("""
				       		"""),format.raw/*73.14*/("""</div>	
				       		
							<div id="reqmodalidad_id" class="col-md-4 requerido">
							
       							
"""),format.raw/*84.3*/("""					      			

								"""),format.raw/*86.9*/("""<div class="form-group clearfix">
									<label>Modalidad donde se usará el recurso*</label>
					      			"""),_display_(/*88.16*/for((k,v) <-models.Modalidad.options()) yield /*88.55*/{_display_(Seq[Any](format.raw/*88.56*/("""
					      				"""),format.raw/*89.16*/("""<label class="radio-inline">
					      					<input type="radio" name="modalidad.id" id="modalidad_id_"""),_display_(/*90.75*/k),format.raw/*90.76*/("""" value=""""),_display_(/*90.86*/k),format.raw/*90.87*/("""" required="required"> """),_display_(/*90.111*/v),format.raw/*90.112*/("""
				      					"""),format.raw/*91.16*/("""</label>
					      			""")))}),format.raw/*92.16*/("""
					      			
					      			"""),format.raw/*94.15*/("""<span class="help-block with-errors">
					      				
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
				            """),_display_(/*114.18*/select(
				                recursoForm("alcancecurricular.id"), 
				                options(models.AlcanceCurricular.options), 
				                '_label -> "Alcance curricular", '_default -> "Seleccione el alcance...",
				                '_showConstraints -> false, 'onchange->"javascript:clickAlcance(this)", 'class->"form-control"
				            )),format.raw/*119.18*/(""" 	        		
			       		"""),format.raw/*120.13*/("""</div>	
			       		<div class="col-md-4">
			       			"""),_display_(/*122.15*/inputText(recursoForm("alcancecurricularotro"), '_label -> "Describa:", '_help -> "", 'pattern->"[A-Za-z áéíóúÁÉÍÓÚñÑ-]*", 'class->"form-control", 'maxlength->"120")),format.raw/*122.180*/("""
			       		"""),format.raw/*123.13*/("""</div>
   						<div class="col-md-4">
                             <div>
                                """),_display_(/*126.34*/select(
                                    recursoForm("unidadmedida.id"), 
                                    options(models.UnidadMedida.options), 
                                    '_label -> "Unidad de medida", '_default -> "Seleccione la unidad de medida...",
                                    '_showConstraints -> false, 'class->"form-control"
                                )),format.raw/*131.34*/(""" 
                                """),_display_(/*132.34*/inputText(recursoForm("duracion"), '_label -> "Duración", '_help -> "", 'size->10, 'class->"form-control validaRegExp" , 'patron->"[0-9]", 'maxlength->5, 'placeholder->"Número entero" )),format.raw/*132.219*/("""
                            """),format.raw/*133.29*/("""</div>
                        </div>
   						
   						
					</div>
					<div class="row">
			       		<div id="reqelaboracion" class="col-md-4  requerido">
      							"""),_display_(/*140.15*/inputText(recursoForm("elaboracion"), '_label -> "Fecha de elaboración*", '_help -> "", 'required5->"required5",'class->"form-control", 'placeholder->"dd/mm/aaaa" )),format.raw/*140.179*/("""
      						"""),format.raw/*141.13*/("""</div>
      						<div id="reqversion_id" class="col-md-4 requerido">	        	
				     			"""),_display_(/*143.14*/inputRadioGroup(
							         recursoForm("version.id"),
							         options = options(models.Version.options),
							         'labelAlterna -> "Versión*", 'required->"required"
						      	)),format.raw/*147.15*/("""
			
					      		"""),format.raw/*149.14*/("""<div id="divVersion" style="display:none;" >
								      """),_display_(/*150.16*/inputRadioGroup(
								         recursoForm("extra1"),
								         options = options("S" -> "Si", "N" -> "No"),
								         'labelAlterna -> "¿Recuerda la clave de control anterior?")),format.raw/*153.77*/("""
						         """),format.raw/*154.16*/("""</div>
					         
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
								"""),_display_(/*184.10*/inputCheckboxGroup(
							         recursoForm("dirigidoa.id"),
							         options = options(models.Dirigidoa.options),'name->"dirigidoa.id",							         
							         'labelAlterna -> "Dirigido a*"
						      	)),format.raw/*188.15*/("""		         			
		         		"""),format.raw/*189.14*/("""</div>	      
			      </div>	
			      <div class="row">
        		  	<div id="reqsinopsis" class="col-md-12 requerido" >
       						"""),_display_(/*193.15*/textarea(recursoForm("sinopsis"), args = 'rows -> 8, 'cols -> 60, 'required->"required", 'class->"form-control validaRegExp", '_label->"Sinopsis*", 'maxlength->"250", 'style->"min-width:100%", 'patron->"[a-z0-99àèìòùáéíóúñ_ \"'/*-+.,()ü{}=<>:;-]+")),format.raw/*193.263*/("""
      			  	"""),format.raw/*194.13*/("""</div>
   			  	  </div>
       				<div class="row">  
						<div style="display:none">
							"""),_display_(/*198.9*/select(recursoForm("auxiliar"), options(models.Autorfuncion.options), '_label -> "Tipo de autoría", '_default -> "Seleccione tipo de autoría...", '_showConstraints -> false)),format.raw/*198.182*/("""
				  			"""),_display_(/*199.11*/select(
				              recursoForm("auxDocto"), 
				              options( models.Tipodocumento.optionsActivas), 
				              '_label -> "Tipo de documento", '_default -> "Seleccione el tipo...",
				              '_showConstraints -> false,
				              'required->"required"
				          	)),format.raw/*205.17*/(""" 
						"""),format.raw/*206.7*/("""</div>			
	
	
	
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
	        				   """),_display_(/*254.18*/if(recurso != null)/*254.37*/{_display_(Seq[Any](format.raw/*254.38*/("""	
		        				   """),_display_(/*255.19*/for(   (pc,i)<-recurso.palabrasclave.zipWithIndex   ) yield /*255.72*/ {_display_(Seq[Any](format.raw/*255.74*/("""
		        				   		"""),format.raw/*256.20*/("""<tr><td><div class="form-group has-success">
		        				   		<div class="input input-group" style="min-width:100%">

			        				   		<input type="text" name="palabra.descripcion"""),_display_(/*259.66*/i),format.raw/*259.67*/("""" value=""""),_display_(/*259.77*/pc/*259.79*/.descripcion),format.raw/*259.91*/("""" class="form-control validaRegExp" patron="[a-z0-9àèìòùáéíóúñ_ \'/*-+.,()ü#$%&/!¿?¡"""),format.raw/*259.175*/("""{"""),format.raw/*259.176*/("""}"""),format.raw/*259.177*/("""=<>:;-]+" , maxlength="40" style="min-width:100%"/>
			        				   		
			        				   		
			        				   		<div class="help-block with-errors"></div>      </div><textarea placeholder="Escriba su observacion..." name="observacion_palabra.descripcion"""),_display_(/*262.163*/i),format.raw/*262.164*/("""" class="observacion"></textarea>    <button type="button" name="btnObservacion_palabra.descripcion"""),_display_(/*262.264*/i),format.raw/*262.265*/("""" class="btn btn-primary btn-xs form-control">Corregir</button>
			        				   		<div class="errorObservacion" style="color:red"></div>  
										</div>		        				   		
		        				   		   </td><td><input type="button" value="Quitar palabra" onclick="eliminarPalabra(this)"></td></tr>
		        				   """)))}),format.raw/*266.19*/("""
	        				   """)))}),format.raw/*267.18*/("""
	        				"""),format.raw/*268.14*/("""</tbody>    
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
								     """),_display_(/*285.15*/inputRadioGroup(
								         recursoForm("formatoentrega.id"),
								         options = options(models.Formatoentrega.options),
								         'labelAlterna -> "Formato de entrega*", 'onclick->"javascript:clickFormato(this)", 'required->"required"
								      )),format.raw/*289.16*/("""		
								      """),_display_(/*290.16*/inputText(recursoForm("formatoentregaotro"), '_label -> "Describa:", '_help -> "", 'patron->"[a-z àèìòùáéíóúñü.,()-]+", 'class->"form-control validaRegExp")),format.raw/*290.172*/("""			
							"""),format.raw/*291.8*/("""</div>       				
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
		       				"""),_display_(/*308.15*/inputText(recursoForm("url"), '_label -> "Dirección", '_help -> "", 'class->"form-control validaRegExp", 'size->"40" ,'placeholder->"Dirección del tipo http://", 'maxlength->"80", 'patron->"[a-z0-99àèìòùáéíóúñ_ \"'/*-+.,()ü#$%&/!¿?¡{}=<>:;-]")),format.raw/*308.258*/("""
	       				"""),format.raw/*309.13*/("""</div>
       				</div>
       				<div class="row">
       					<div class="col-md-12">
       						Si el Recurso Didáctico Digital está en un sitio web o plataforma y requiere autentificación, escriba a continuación el nombre de usuario y contraseña.
       					</div>
       				</div>       				
       				<div class="row">
	       				<div class="col-md-6">
	       					"""),_display_(/*318.15*/inputText(recursoForm("webUsuario"), '_label -> "Usuario", '_help -> "", 'class->"form-control validaRegExp", 'size->"20em" ,'placeholder->"Nombre de usuario", 'maxlength->"20")),format.raw/*318.192*/("""
	       				"""),format.raw/*319.13*/("""</div>
	       				<div class="col-md-6">
		       				"""),_display_(/*321.15*/inputText(recursoForm("webPassword"), '_label -> "Clave de acceso", '_help -> "",  'class->"form-control validaRegExp", 'size->"20em" ,'placeholder->"Clave de acceso", 'maxlength->"50")),format.raw/*321.200*/("""
	       				"""),format.raw/*322.13*/("""</div>
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
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/masterForm.scala.html
                  HASH: 62a80e1bd620b4522741d964b7d5808526132c25
                  MATRIX: 756->3|908->79|940->103|1027->60|1055->160|1085->164|1554->606|1577->608|1637->642|1665->661|1704->662|1739->670|1824->728|2091->973|2126->981|2172->1009|2185->1014|2224->1015|2259->1023|2328->1065|2595->1310|2630->1318|2800->1461|2816->1468|2848->1479|2918->1518|2951->1524|3093->1639|3444->1969|3487->1984|3605->2075|3974->2423|4032->2453|4175->2946|4244->2988|4665->3388|4722->3417|4873->3541|5126->3772|5168->3786|5301->4107|5352->4131|5489->4241|5544->4280|5583->4281|5627->4297|5757->4400|5779->4401|5816->4411|5838->4412|5890->4436|5913->4437|5957->4453|6012->4477|6070->4507|6889->5298|7267->5654|7321->5679|7406->5736|7594->5901|7636->5914|7771->6021|8182->6410|8245->6445|8453->6630|8511->6659|8712->6832|8899->6996|8941->7009|9063->7103|9285->7303|9332->7321|9420->7381|9637->7576|9682->7592|11283->9165|11530->9390|11587->9418|11752->9555|12023->9803|12065->9816|12189->9913|12385->10086|12424->10097|12754->10405|12790->10413|14953->12548|14982->12567|15022->12568|15070->12588|15140->12641|15181->12643|15230->12663|15443->12848|15466->12849|15504->12859|15516->12861|15550->12873|15664->12957|15695->12958|15726->12959|16011->13215|16035->13216|16164->13316|16188->13317|16533->13630|16583->13648|16626->13662|17279->14287|17573->14559|17619->14577|17798->14733|17837->14744|18444->15323|18710->15566|18752->15579|19161->15960|19361->16137|19403->16150|19487->16206|19695->16391|19737->16404
                  LINES: 26->3|28->5|28->5|29->3|30->5|32->7|43->18|43->18|45->20|45->20|45->20|46->21|47->22|47->22|48->23|49->24|49->24|49->24|50->25|51->26|51->26|52->27|55->30|55->30|55->30|57->32|58->33|61->36|66->41|67->42|69->44|74->49|75->50|79->61|80->62|85->67|86->68|90->72|90->72|91->73|96->84|98->86|100->88|100->88|100->88|101->89|102->90|102->90|102->90|102->90|102->90|102->90|103->91|104->92|106->94|126->114|131->119|132->120|134->122|134->122|135->123|138->126|143->131|144->132|144->132|145->133|152->140|152->140|153->141|155->143|159->147|161->149|162->150|165->153|166->154|196->184|200->188|201->189|205->193|205->193|206->194|210->198|210->198|211->199|217->205|218->206|266->254|266->254|266->254|267->255|267->255|267->255|268->256|271->259|271->259|271->259|271->259|271->259|271->259|271->259|271->259|274->262|274->262|274->262|274->262|278->266|279->267|280->268|297->285|301->289|302->290|302->290|303->291|320->308|320->308|321->309|330->318|330->318|331->319|333->321|333->321|334->322
                  -- GENERATED --
              */
          