
package views.html.Encuesta

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
object encuestaForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[List[EncuestaReactivo],List[Unidadacademica],List[Niveleducativo],Form[EncuestaRespuesta],EncuestaRespuesta,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(reactivos:List[EncuestaReactivo], unidadacademica:List[Unidadacademica], nivel:List[Niveleducativo], forma:Form[EncuestaRespuesta], respuestas:EncuestaRespuesta):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.164*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<div class="container-fluid">
		<div class="row">
			
				"""),_display_(/*7.6*/for(rea<-reactivos) yield /*7.25*/{_display_(Seq[Any](format.raw/*7.26*/("""
					"""),_display_(/*8.7*/if(rea.numreactivo != 5)/*8.31*/{_display_(Seq[Any](format.raw/*8.32*/("""
						"""),format.raw/*9.7*/("""<div class="col-md-6">
					""")))}/*10.7*/else/*10.11*/{_display_(Seq[Any](format.raw/*10.12*/("""
					    """),format.raw/*11.10*/("""<div class="col-md-12">
					""")))}),format.raw/*12.7*/("""		
						"""),format.raw/*13.7*/("""<div class="panel panel-default">
							<div class="panel-heading">
							    <h3 class="panel-title">"""),_display_(/*15.37*/if(rea.numreactivo != 5)/*15.61*/{_display_(Seq[Any](format.raw/*15.62*/(""" """),format.raw/*15.63*/("""* """)))}),format.raw/*15.66*/("""  """),_display_(/*15.69*/rea/*15.72*/.reactivo),format.raw/*15.81*/("""</h3>
							 </div>
							 <div class="panel-body">
							 	<div class="row">
							 	<div class="col-md-12">
							 	"""),_display_(/*20.11*/if(rea.numreactivo == 1)/*20.35*/{_display_(Seq[Any](format.raw/*20.36*/("""
						     			"""),_display_(/*21.16*/inputCheckboxGroup(
						         			forma("respuesta1"),
						         			options = options(
						         				"1"->"Obtener un estímulo académico",
						         				"2"->"Favorecer el proceso de aprendizaje",
						         				"3"->"Reforzar contenidos",
						         				"4"->"Hacer uso de las TIC en el aula",
						         				"5"->"Diseñar recursos atractivos",
						         				"6"->"Otro"
						         			)							         
						      			)),format.raw/*31.17*/("""
						      			"""),format.raw/*32.16*/("""<div class="help-block with-errors" style="color:red"></div>
									<div style="display: none">
										<div class="form-group">										    
										    <div class="form-group">
												<div>
								    				<textarea placeholder="Escriba su observacion..." name="observacion_respuesta1" class="observacion" maxlength="600" style="min-width: 100%; display: none;"></textarea>
								   					<button type="button" name="btnObservacion_respuesta1" class="btn btn-xs form-control btn-primary">Agregar observación</button>
													<div name="errorObservacion" style="color:red"></div>		    	
											    </div>					      						
											</div>					      						
				      					</div>
			      					</div>					      			
					      			
					      			
					      			

									<div style="display: none">
										<div class="form-group">	
											<label for="respuesta1txt" class="control-label">Describa</label>									    
										    <div class="form-group">	
					      						<textarea id="respuesta1Txt" name="respuesta1txt" style="-webkit-box-sizing: border-box; -moz-box-sizing: border-box; box-sizing: border-box;	width: 100%; " class="form-control" maxlength="600"></textarea>
					      						<div name='divErrorTextArea' style="color:red"></div>
												<div>
								    				<textarea placeholder="Escriba su observacion..." name="observacion_respuesta1txt" class="observacion" maxlength="600" style="min-width: 100%; display: none;"></textarea>
								   					<button type="button" name="btnObservacion_respuesta1txt" class="btn btn-xs form-control btn-danger">Quitar observación</button>
													<div name="errorObservacion" style="color:red"></div>		    	
											    </div>					      						
											</div>					      						
				      					</div>
			      					</div>		
			      					</span>				 	 	
							 	""")))}),format.raw/*63.11*/("""							
							 	 
							 	"""),_display_(/*65.11*/if(rea.numreactivo == 2)/*65.35*/{_display_(Seq[Any](format.raw/*65.36*/(""" 						 				
					     			"""),_display_(/*66.15*/inputRadioGroup(
					         			forma("respuesta2"),
					         			options = options("S"->"Si","N"->"No"), 'required->"required"							         
					      			)),format.raw/*69.16*/("""
					      			"""),format.raw/*70.15*/("""<div class="help-block with-errors" style="color:red"></div>
									<div style="display: none">
										<div class="form-group">										    
										    <div class="form-group">
												<div>
								    				<textarea placeholder="Escriba su observacion..." name="observacion_respuesta2" class="observacion" maxlength="600" style="min-width: 100%; display: none;"></textarea>
								   					<button type="button" name="btnObservacion_respuesta2" class="btn btn-xs form-control btn-primary">Agregar observación</button>
													<div name="errorObservacion" style="color:red"></div>		    	
											    </div>					      						
											</div>					      						
				      					</div>
			      					</div>						      			
					      			
									<div style="display: none">
										<div class="form-group">
										    <label for="respuesta2txt" class="control-label">¿Por que medios?</label>	
										    <div class="form-group">
												<textarea id="respuesta2Txt" name="respuesta2txt" style="-webkit-box-sizing: border-box; -moz-box-sizing: border-box; box-sizing: border-box;	min-width: 100%;" class="form-control" maxlength="600"></textarea>
												<div name='divErrorTextArea' style="color:red"></div>
												<div>
								    				<textarea placeholder="Escriba su observacion..." name="observacion_respuesta2txt" class="observacion" maxlength="600" style="min-width: 100%; display: none;"></textarea>
								   					<button type="button" name="btnObservacion_respuesta2txt" class="btn btn-xs form-control btn-danger">Quitar observación</button>
													<div name="errorObservacion" style="color:red"></div>		    	
											    </div>													
											</div>
										</div>									
									</div>
								""")))}),format.raw/*97.10*/("""

							 	"""),_display_(/*99.11*/if(rea.numreactivo == 3)/*99.35*/{_display_(Seq[Any](format.raw/*99.36*/("""
					     			"""),_display_(/*100.15*/inputRadioGroup(
					         			forma("respuesta3"),
					         			options = options("S"->"Si","N"->"No"), 'required->"required",
					         			'_error -> forma("respuesta3").error.map(_.withMessage("select one or more hobbies"))						         
					      			)),format.raw/*104.16*/("""
					      			"""),format.raw/*105.15*/("""<div class="help-block with-errors" style="color:red"></div>
									<div style="display: none">
										<div class="form-group">										    
										    <div class="form-group">
												<div>
								    				<textarea placeholder="Escriba su observacion..." name="observacion_respuesta3" class="observacion" maxlength="600" style="min-width: 100%; display: none;"></textarea>
								   					<button type="button" name="btnObservacion_respuesta3" class="btn btn-xs form-control btn-primary">Agregar observación</button>
													<div name="errorObservacion" style="color:red"></div>		    	
											    </div>					      						
											</div>					      						
				      					</div>
			      					</div>						      			
					      			
									<div style="display: none;">
										<div class="form-group">
											<label for="respuesta3txt" class="control-label">Compártanos sus razones.</label>
											<div class="form-group">											
												<textarea id="respuesta3Txt" name="respuesta3txt" style="-webkit-box-sizing: border-box; -moz-box-sizing: border-box; box-sizing: border-box;	width: 100%;" class="form-control" maxlength="600"></textarea>
												<div name='divErrorTextArea' style="color:red"></div>
												<div>
								    				<textarea placeholder="Escriba su observacion..." name="observacion_respuesta3txt" class="observacion" maxlength="600" style="min-width: 100%; display: none;"></textarea>
								   					<button type="button" name="btnObservacion_respuesta3txt" class="btn btn-xs form-control btn-danger">Quitar observación</button>
													<div name="errorObservacion" style="color:red"></div>														    	
											    </div>												
											</div>
										</div>
									</div>								 	
							 	""")))}),format.raw/*132.11*/(""" 		
							 	
							 	"""),_display_(/*134.11*/if(rea.numreactivo == 4)/*134.35*/{_display_(Seq[Any](format.raw/*134.36*/("""				 				
					     			"""),_display_(/*135.15*/inputRadioGroup(
					         			forma("respuesta4"),
					         			options = options("1"->"1","2"->"2","3"->"3","4"->"4","5"->"5"), 'required->"required"							         
					      			)),format.raw/*138.16*/("""
					      			"""),format.raw/*139.15*/("""<div class="help-block with-errors" style="color:red"></div>
					      			
									<div style="display: none">
										<div class="form-group">										    
										    <div class="form-group">
												<div>
								    				<textarea placeholder="Escriba su observacion..." name="observacion_respuesta4" class="observacion" maxlength="600" style="min-width: 100%; display: none;"></textarea>
								   					<button type="button" name="btnObservacion_respuesta4" class="btn btn-xs form-control btn-primary">Agregar observación</button>
													<div name="errorObservacion" style="color:red"></div>		    	
											    </div>					      						
											</div>					      						
				      					</div>
			      					</div>						      			
					      			
									<div>
										<div class="form-group">
											<label for="respuesta4txt" class="control-label">* Comparta con nosotros sus motivos.</label>
											<div class="form-group">					      			
								      			<textarea id="respuesta4Txt" name="respuesta4txt" style="-webkit-box-sizing: border-box; -moz-box-sizing: border-box; box-sizing: border-box;	width: 100%;" class="form-control" required="required" maxlength="600"></textarea>
								      			<div name='divErrorTextArea' style="color:red"></div>
												<div>
								    				<textarea placeholder="Escriba su observacion..." name="observacion_respuesta4txt" class="observacion" maxlength="600" style="min-width: 100%; display: none;"></textarea>
								   					<button type="button" name="btnObservacion_respuesta4txt" class="btn btn-xs form-control btn-danger">Quitar observación</button>
													<div name="errorObservacion" style="color:red"></div>
												</div>									      			
											</div>
										</div>
									</div>								      			
								""")))}),format.raw/*167.10*/("""
								
							 	"""),_display_(/*169.11*/if(rea.numreactivo == 5)/*169.35*/{_display_(Seq[Any](format.raw/*169.36*/("""
									"""),format.raw/*170.10*/("""<div>
										<div class="form-group">											
											<div class="form-group">								
												<textarea id="respuesta5Txt" name="respuesta5txt" style="-webkit-box-sizing: border-box; -moz-box-sizing: border-box; box-sizing: border-box;	width: 100%;" class="form-control" maxlength="600" ></textarea>
												<div name='divErrorTextArea' style="color:red"></div>
  												<div>
								    				<textarea placeholder="Escriba su observacion..." name="observacion_respuesta5txt" class="observacion" maxlength="600" style="min-width: 100%; display: none;"></textarea>
								   					<button type="button" name="btnObservacion_respuesta5txt" class="btn btn-xs form-control btn-danger">Quitar observación</button>
													<div name="errorObservacion" style="color:red"></div>													
												</div>
											</div>
										</div>
									</div>													
								""")))}),format.raw/*183.10*/("""
								"""),format.raw/*184.9*/("""</div>
								</div>
							</div>
						</div>
					</div>
					"""),_display_(/*189.7*/if( (rea.numreactivo%2 == 0)  &&  (rea.numreactivo != 5)  )/*189.66*/{_display_(Seq[Any](format.raw/*189.67*/("""
						"""),format.raw/*190.7*/("""</div>
						<div class="row">
								
					""")))}),format.raw/*193.7*/("""
				""")))}),format.raw/*194.6*/("""
					
		"""),format.raw/*196.3*/("""</div>
		</div>
					
					"""))}
  }

  def render(reactivos:List[EncuestaReactivo],unidadacademica:List[Unidadacademica],nivel:List[Niveleducativo],forma:Form[EncuestaRespuesta],respuestas:EncuestaRespuesta): play.twirl.api.HtmlFormat.Appendable = apply(reactivos,unidadacademica,nivel,forma,respuestas)

  def f:((List[EncuestaReactivo],List[Unidadacademica],List[Niveleducativo],Form[EncuestaRespuesta],EncuestaRespuesta) => play.twirl.api.HtmlFormat.Appendable) = (reactivos,unidadacademica,nivel,forma,respuestas) => apply(reactivos,unidadacademica,nivel,forma,respuestas)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:36 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Encuesta/encuestaForm.scala.html
                  HASH: 8ea6c59d0cb3ce8200b5ac2ccf733d22eb330907
                  MATRIX: 840->1|1106->163|1133->181|1160->182|1244->241|1278->260|1316->261|1348->268|1380->292|1418->293|1451->300|1498->329|1511->333|1550->334|1588->344|1648->374|1684->383|1816->488|1849->512|1888->513|1917->514|1951->517|1981->520|1993->523|2023->532|2174->656|2207->680|2246->681|2289->697|2770->1157|2814->1173|4708->3036|4764->3065|4797->3089|4836->3090|4890->3117|5076->3282|5119->3297|6918->5065|6957->5077|6990->5101|7029->5102|7072->5117|7362->5385|7406->5400|9228->7190|9280->7214|9314->7238|9354->7239|9406->7263|9618->7453|9662->7468|11511->9285|11559->9305|11593->9329|11633->9330|11672->9340|12608->10244|12645->10253|12739->10320|12808->10379|12848->10380|12883->10387|12960->10433|12997->10439|13034->10448
                  LINES: 26->1|29->1|30->3|31->4|34->7|34->7|34->7|35->8|35->8|35->8|36->9|37->10|37->10|37->10|38->11|39->12|40->13|42->15|42->15|42->15|42->15|42->15|42->15|42->15|42->15|47->20|47->20|47->20|48->21|58->31|59->32|90->63|92->65|92->65|92->65|93->66|96->69|97->70|124->97|126->99|126->99|126->99|127->100|131->104|132->105|159->132|161->134|161->134|161->134|162->135|165->138|166->139|194->167|196->169|196->169|196->169|197->170|210->183|211->184|216->189|216->189|216->189|217->190|220->193|221->194|223->196
                  -- GENERATED --
              */
          