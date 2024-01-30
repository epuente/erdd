
package views.html.Clasificacion

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
object formClasificacion extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[Form[Clasificacion],Long,List[ClasificadorCriterio2],List[ClasificadorCriterio3],List[ClasificadorCancelable],List[ClasificadorNoevaluable],List[ClasificadorTiporecurso],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(forma:Form[Clasificacion], 
  id:Long,  
  clas2:List[ClasificadorCriterio2],  
  clas3:List[ClasificadorCriterio3], 
  cancelable:List[ClasificadorCancelable], 
  noevaluable:List[ClasificadorNoevaluable],
  tiposrecursos:List[ClasificadorTiporecurso]  ):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*9.2*/implicitFieldConstructor/*9.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*7.49*/("""
"""),format.raw/*9.77*/(""" 
		"""),format.raw/*10.3*/("""<div class="row">
			<div class="col-lg-6">
				<div class="panel panel-default">
                	<div class="panel-heading">Criterios</div>
               		<div class="panel-body">	
						"""),_display_(/*15.8*/inputText(forma("recurso.id").copy(value=Some(id.toString())), '_label -> "", 'class->"form-control", 'style->"display:none" )),format.raw/*15.134*/("""
						"""),_display_(/*16.8*/inputRadioGroup(
				          forma("criterio1.id"),
				          options = options(ClasificadorCriterio1.options),
				          'labelAlterna -> "Seleccione uno de los siguientes"
				          )),format.raw/*20.16*/("""	
               			"""),format.raw/*21.19*/("""<div class="row">
               				<div class="col-sm-6">
								"""),_display_(/*23.10*/select(
							         forma("criterio2.id"), 
							         options( ClasificadorCriterio2.options(2)),
				                     '_default -> "Seleccione criterio 2...",
					                 '_showConstraints -> false,
					                  'labelAlterna -> "Seleccione uno de los siguientes",
					                 'required->"required",'_label->""			          
						     	)),format.raw/*30.14*/("""			     	
						     	"""),format.raw/*31.13*/("""<div id="divDescripC2" style="height: 12em;"></div>               				
               				</div>
               				<div class="col-sm-6">
								"""),_display_(/*34.10*/select(
							         forma("criterio3.id"), 
							         options( ClasificadorCriterio3.options(2)),
				                     '_default -> "Seleccione criterio 3...",
					                 '_showConstraints -> false,		 
					                  'labelAlterna -> "Seleccione uno de los siguientes",                
					                 'required->"required", '_label->""			          
							     	)),format.raw/*41.15*/(""" 									
							     	"""),format.raw/*42.14*/("""<div id="divDescripC3" style="height: 12em;"></div>               				
               				</div>
               			</div>	
               			<div class="row" id="rowTipoRecurso">
               				<div class="col-sm-12">
								"""),_display_(/*47.10*/select(
							         forma("tiporecurso.id"), 
 							         options(), 
				                     '_default -> "Seleccione tipo de recurso...",
					                 '_showConstraints -> false,		 
					                  'labelAlterna -> "Seleccione uno de los siguientes",                
					                 'required->"required", '_label->""			          
							     	)),format.raw/*54.15*/(""" 									
							     	               				
               				"""),format.raw/*56.20*/("""</div>
           				</div>
	
               			<div class="row">
               				<div class="col-sm-12">
								<div id="divMensajes1" class="alert alert-danger" role="alert" style="display: none">Recurso cancelable por clasificación</div>								
								<div id="divMensajes2" class="alert alert-warning" role="alert" style="display: none">Recurso no evaluable por clasificación</div>               				
               				</div>
               			</div>
               			<div class="row">
               				<div clasS="col-sm-6">								               				
								<input type="submit" class="btn btn-primary center-block btn-block" value="Asignar clasificación">                 				
               				</div>
               				<div clasS="col-sm-6">
								<input type="button" class="btn btn-warning center-block btn-block" value="Cancelar solicitud" id="btnCancelar">
								"""),_display_(/*71.10*/textarea(forma("observacion.observacion"), '_label -> "Observación", 'class->"form-control", 'cols->"100%" )),format.raw/*71.118*/("""
								"""),format.raw/*72.9*/("""<input type="button" class="btn btn-danger center-block btn-block" value="Confirmar cancelación" id="btnConfirmarCancelar" style="display: none;" >               				
               				</div>
               			</div>
               				
					</div>
				</div>
			</div>
		
			<div class="col-lg-6">
				<div class="panel panel-default">
                	<div class="panel-heading">Ejemplos</div>
               		<div class="panel-body">			
						<div id="combina"></div>
						<div id="divEjemplos1" style="display: none"></div>						
						<div id="divEjemplos2" style="display: none"></div>
					</div>
				</div>
			</div>			
		</div>
		
		<div class="row"> 
			<div class="col-lg-12">
				<div class="panel panel-default">
                	<div class="panel-heading">Tabla de clasificación</div>
               		<div class="panel-body">
               			<div class="center-block">
							<table class="table table-bordered">
								<caption> <h3>Recurso Didáctico Digital</h3></caption>
								<thead>
									<tr>
										<td><h4>Categoría</h4></td>
										<td><h4>Curso completo: <small>Una especialidad o disciplina científica completa</small></h4></td>
										<td><h4>Unidad o módulo: <small>Dos o más temas secuenciados o relacionados</small></h4></td>
										<td><h4>Tema: <small>Un tema específico en extenso</small></h4></td>
										<td><h4>Concepto: <small>Solo un argumento o un registro de referencia</small></h4></td>
									</tr>
								</thead>
								<tr>
									<td><h4>Informativos:</h4>Integran documentos de autoría propia que contienen datos de utilidad y que explican o aclaran desde una teoría hasta datos específicos y concretos, pasando por conceptos clave. Su marco de referencia es temático.</td>
									<td>Ejemplos:<br>
										- Libro digital<br>
										- Apuntes<br>
										- Cuadernos<br>
										- Instructivos de talleres<br>
										- Multimedia<br>
										- Audiovisuales<br>
										- Podcast<br>
										- Blogs<br>
									</td>
									<td>Ejemplos:<br>
										- Multimedia<br>
										- Audiovisuales<br>
										- Podcasts<br>
										- Blogs<br>
									</td>
									<td style="background-color: yellow;">Ejemplos:<br>
										- Multimedia<br>
										- Audiovisuales<br>
										- Podcasts<br>
										- Blogs<br>
									</td>
									<td style="background-color: yellow;">Ejemplos:<br>
										- Multimedia<br>
										- Audiovisuales<br>
										- Podcasts<br>
										- Blogs<br>
										- Fotografías<br>
										- Diagramas<br>
										- Ilustraciones<br>
									</td>
								</tr>
								<tr>
									<td><h4>Apoyo educativo:</h4>Incluyen contenidos que favorecen la incorporación de conocimientos, cuentan con actividades para el estudiante y están encaminados a un grado y especialidad específicos.</td>
									<td>Ejemplos:<br>
										- Polilibros<br>
										- Libro digital interactivo<br>
										- Problemarios<br>
										- Prácticas de laboratorio<br>
										- Multimedia<br>
										- Blogs<br>
										- Webquests<br>
										- Wikis<br>
									</td>
									<td>Ejemplos:<br>
										- Multimedia<br>
										- Blogs<br>
										- Webquests<br>
										- Wikis<br>
									</td>
									<td>Ejemplos:<br>
										- Multimedia<br>
										- Blogs<br>
										- Webquests<br>
										- Wikis<br>
									</td>
									<td style="background-color: yellow;">Ejemplos:<br>
										- Multimedia<br>
										- Blogs<br>
										- Webquests<br>
										- Wikis<br>
									</td>									
								</tr>
								<tr>
									<td><h4>Tratamiento educativo:</h4>Incluyen contenidos que median el acceso a la información para procurar un aprendizaje formativo significativo con un lenguaje apropiado según el usuario al que va dirigido; cuentan con un diseño instruccional o didáctico implícito.</td>
									<td>Ejemplos:<br>
										- Polilibros<br>
										- Cursos en línea<br>
										- Objeto de aprendizaje<br>
									</td>
									<td>Ejemplos:<br>
										- Objeto de aprendizaje<br>
									</td>
									<td>Ejemplos:<br>
										- Objeto de aprendizaje<br>
									</td>
									<td>Ejemplos:<br>
										- Objeto de aprendizaje<br>
									</td>									
								</tr>
							</table>              			
               				Los Recursos Didácticos Digitales que se ubiquen en la categoría que en esta tabla aparece sombreada en color amarillo, no serán objeto de la evaluación técnico-pedagógica que realiza la UPEV.
               				
               				
							<table class="table table-bordered">
								<caption> <h3>Software educativo / Paquete de cómputo didáctico</h3></caption>
								<thead>
									<tr>
										<td><h4>Categoría</h4></td>
										<td><h4>Complejo e integrado: <small>Se constituye a través de módulos que interactúan y funcionan para el logro de objetivos funcionales y operativos en común.</small></h4></td>
										<td><h4>Modular o subsistema: <small>Es un componente autocontrolado con una interfaz bien definida, producto de la unión de varias partes que interactúan entre sí y que trabajan para alcanzar un objetivo.</small></h4></td>
									</tr>
								</thead>
								<tr>
									<td><h4>Tutorial interactivo o practicador:</h4>Aplicación de cómputo que enseña y/o ayuda al alumno a descubrir ciertos principios o conceptos preestablecidos. Además de entregar información, exige la intervención del estudiante, propiciando la comprensión, análisis, síntesis y evaluación realizados a través de la interacción con el software.</td>
									<td>Ejemplo:<br>
										- Tutorial completo para el manejo de una plataforma<br>
									</td>
									<td>Ejemplo:<br> 
										- Tutorial para la creación de una cuenta de correo electrónico<br>									
									</td>
								</tr>
								<tr>
									<td><h4>Simulador:</h4>Aplicación de cómputo que emula una situación de la realidad, permitiendo al alumno estudiar un proceso o fenómeno que estará en permanente cambio y que obligará al estudiante a actuar, de acuerdo a las diversas condiciones que se vayan presentando, en forma progresiva y de manera interactiva.</td>
									<td>Ejemplo:<br>
										- Videojuego en varios niveles<br>										
									</td>
									<td>Ejemplo:<br>
										- Videojuego<br>
										- Recorrido virtual en un museo<br>
									</td>
								</tr>
								<tr>
									<td><h4>Sistema:</h4>Desarrollo informático integral de carácter educativo basado en una estructura modular (a veces establecida con técnicas de inteligencia artificial), que permite a los usuarios llevar a cabo varias tareas específicas automatizadas o asistidas.</td>
									<td>Ejemplo:<br>
										- Plataforma educativa<br>
										- Sistema de administración de objetos de aprendizaje<br>
										- Agente educativo<br>
									</td>
									<td>Ejemplo:<br>
										- Programa de autoría<br>
										- Agente educativo<br>
									</td> 
								</tr>
							</table>               				
               			</div>
               		
               		"""),format.raw/*242.21*/("""
         			"""),format.raw/*243.13*/("""</div>
       			</div>
   			</div>
		</div>		
		
	





"""))}
  }

  def render(forma:Form[Clasificacion],id:Long,clas2:List[ClasificadorCriterio2],clas3:List[ClasificadorCriterio3],cancelable:List[ClasificadorCancelable],noevaluable:List[ClasificadorNoevaluable],tiposrecursos:List[ClasificadorTiporecurso]): play.twirl.api.HtmlFormat.Appendable = apply(forma,id,clas2,clas3,cancelable,noevaluable,tiposrecursos)

  def f:((Form[Clasificacion],Long,List[ClasificadorCriterio2],List[ClasificadorCriterio3],List[ClasificadorCancelable],List[ClasificadorNoevaluable],List[ClasificadorTiporecurso]) => play.twirl.api.HtmlFormat.Appendable) = (forma,id,clas2,clas3,cancelable,noevaluable,tiposrecursos) => apply(forma,id,clas2,clas3,cancelable,noevaluable,tiposrecursos)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 12:14:15 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Clasificacion/formClasificacion.scala.html
                  HASH: 7fc6b7895b5e4d5cfb31e475e00f2ec55522b97b
                  MATRIX: 912->1|1263->276|1295->300|1376->257|1404->351|1435->355|1653->547|1801->673|1835->681|2055->880|2103->900|2199->969|2602->1351|2652->1373|2827->1521|3251->1924|3303->1948|3561->2179|3961->2558|4052->2621|4973->3515|5103->3623|5139->3632|12291->10988|12333->11001
                  LINES: 26->1|34->9|34->9|35->7|36->9|37->10|42->15|42->15|43->16|47->20|48->21|50->23|57->30|58->31|61->34|68->41|69->42|74->47|81->54|83->56|98->71|98->71|99->72|265->242|266->243
                  -- GENERATED --
              */
          