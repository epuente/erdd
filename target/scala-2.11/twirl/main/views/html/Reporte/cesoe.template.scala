
package views.html.Reporte

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
object cesoe extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Recurso,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recurso: Recurso):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.20*/("""

  """),format.raw/*3.3*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*3.48*/routes/*3.54*/.Assets.at("stylesheets/recurso.css")),format.raw/*3.91*/(""""/> 	

"""),_display_(/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""
	"""),_display_(/*6.3*/if(session.get("idRecurso")   )/*6.34*/{_display_(Seq[Any](format.raw/*6.35*/("""
		"""),format.raw/*7.3*/("""<div id="alertEstado" class="alert alert-default" role="alert">El estado de la solicitud es: '"""),_display_(/*7.98*/recurso/*7.105*/.estado.descripcion),format.raw/*7.124*/("""'.</div>    
  	""")))}),format.raw/*8.5*/("""
  	
	"""),format.raw/*10.2*/("""<table class="table table-bordered tablaReporte">
		<tr>
			<td colspan="5"><div class="etiqueta">Título</div><div class="contenido">"""),_display_(/*12.78*/recurso/*12.85*/.titulo),format.raw/*12.92*/("""</div></td>
			<td colspan="1"><div class="etiqueta">Clave de control</div><div class="contenido">"""),_display_(/*13.88*/recurso/*13.95*/.numcontrol),format.raw/*13.106*/("""</div></td>
		</tr>
		<tr>
			<td colspan="2">
				<div class="etiqueta">Nivel académico</div><div class="contenido">"""),_display_(/*17.72*/recurso/*17.79*/.niveleducativo.descripcion),format.raw/*17.106*/("""</div>
			</td>
			<td colspan="4">
				<div class="etiqueta">Área del conocimiento</div><div class="contenido">"""),_display_(/*20.78*/recurso/*20.85*/.areaconocimiento.descripcion),format.raw/*20.114*/("""</div>
			</td>
		</tr>
		<tr>
			<td colspan="6">
				<div class="etiqueta">Unidad Académica</div><div class="contenido">"""),_display_(/*25.73*/recurso/*25.80*/.unidadacademica.nombre),format.raw/*25.103*/("""</div>
			</td>			
		</tr>
		<tr>
			<td colspan="3>
				<div class="etiqueta">Programa Académico:</div><div class="contenido">"""),_display_(/*30.76*/recurso/*30.83*/.programaacad),format.raw/*30.96*/("""</div>
			</td>	
			<td>
				<div class="etiqueta">Modalidad</div><div class="contenido">"""),_display_(/*33.66*/{ if (recurso.modalidad != null)recurso.modalidad.descripcion}),format.raw/*33.128*/("""</div>
			</td>
		
			
			<td>
				<div class="etiqueta">Duración</div><div class="contenido">"""),_display_(/*38.65*/(recurso.duracion+" "+recurso.unidadmedida.descripcion)),format.raw/*38.120*/(""" """),format.raw/*38.121*/("""</div>
			</td>
			
			<td>
				<div class="etiqueta">Alcance Curricular</div>
				<div class="contenido">"""),_display_(/*43.29*/if(recurso.alcancecurricular!=null)/*43.64*/{_display_(Seq[Any](format.raw/*43.65*/("""
					 	 """),_display_(/*44.10*/recurso/*44.17*/.alcancecurricular.descripcion),_display_(/*44.48*/if(recurso.alcancecurricular.id ==99)/*44.85*/{_display_(Seq[Any](format.raw/*44.86*/(""": """),_display_(/*44.89*/recurso/*44.96*/.alcancecurricularotro)))}),format.raw/*44.119*/("""
					  """)))}),format.raw/*45.9*/("""
				"""),format.raw/*46.5*/("""</div>
			</td>
		
		</tr>
		<tr>
			<td>
				<div class="etiqueta">Fecha elaboración</div><div class="contenido">"""),_display_(/*52.74*/recurso/*52.81*/.elaboracion.format("dd/MM/yyyy")),format.raw/*52.114*/("""</div>
			</td>	
			<td>
				<div class="etiqueta">Versión</div><div class="contenido">"""),_display_(/*55.64*/recurso/*55.71*/.version.descripcion),format.raw/*55.91*/("""</div>
				"""),_display_(/*56.6*/if(recurso.versionanterior != null)/*56.41*/{_display_(Seq[Any](format.raw/*56.42*/("""
					"""),format.raw/*57.6*/("""<div class="etiqueta">Clave control anterior</div><div class="contenido">"""),_display_(/*57.80*/recurso/*57.87*/.versionanterior.recursoanterior.numcontrol),format.raw/*57.130*/("""</div>
				""")))}),format.raw/*58.6*/("""
			"""),format.raw/*59.4*/("""</td>		
			<td colspan="2">
				<div class="etiqueta">Dirigido a</div>
				"""),_display_(/*62.6*/for(dir <- recurso.dirigidoa) yield /*62.35*/{_display_(Seq[Any](format.raw/*62.36*/("""
					"""),format.raw/*63.6*/("""<div claa="contenido" style="float: left; padding-right: 15px">"""),_display_(/*63.70*/dir/*63.73*/.dirigidoa.descripcion),format.raw/*63.95*/("""</div>
				""")))}),format.raw/*64.6*/("""
			"""),format.raw/*65.4*/("""</td>
			<td colspan="2">
				<div class="etiqueta">Formato de entrega</div>
				<div class="contenido">"""),_display_(/*68.29*/recurso/*68.36*/.formatoentrega.descripcion),_display_(/*68.64*/if(recurso.formatoentrega.id == 3)/*68.98*/{_display_(Seq[Any](format.raw/*68.99*/(""": """),_display_(/*68.102*/recurso/*68.109*/.formatoentregaotro)))}),format.raw/*68.129*/("""</div>
			</td>			
		</tr>
		"""),_display_(/*71.4*/if(recurso.url.length != 0)/*71.31*/{_display_(Seq[Any](format.raw/*71.32*/("""
			"""),format.raw/*72.4*/("""<tr>
				<td colspan="2">
					<div class="etiqueta">Dirección URL</div><div class="contenido">"""),_display_(/*74.71*/recurso/*74.78*/.url),format.raw/*74.82*/("""</div>					
				</td>
			"""),_display_(/*76.5*/for(rw <- recurso.recursosenweb) yield /*76.37*/ {_display_(Seq[Any](format.raw/*76.39*/("""
				"""),format.raw/*77.5*/("""<td colspan="2">
					<div class="etiqueta">Usuario</div><div class="contenido">"""),_display_(/*78.65*/rw/*78.67*/.usuario),format.raw/*78.75*/("""</div>		
				</td>
				<td colspan="2">
					<div class="etiqueta">Clave de acceso</div><div class="contenido">"""),_display_(/*81.73*/rw/*81.75*/.password),format.raw/*81.84*/("""</div>	
				</td>			
			""")))}),format.raw/*83.5*/("""
			"""),format.raw/*84.4*/("""</tr>
		""")))}),format.raw/*85.4*/("""		
		"""),format.raw/*86.3*/("""<tr>
			<td colspan="6">
				<div class="etiqueta">Sinópsis</div><div class="contenido">"""),_display_(/*88.65*/recurso/*88.72*/.sinopsis),format.raw/*88.81*/("""</div>
			</td>		
		</tr>
		<tr>
			<td colspan=6>
				<table class="table table-bordered tablaReporte" id="tablaPalabras">
					<thead>
						<tr>
							<td  colspan=5 class="etiqueta">Palabras clave</td>
						</tr>	
					</thead>			
					<tbody>
						<tr>
							"""),_display_(/*101.9*/for(pc <- recurso.palabrasclave) yield /*101.41*/ {_display_(Seq[Any](format.raw/*101.43*/("""
								"""),format.raw/*102.9*/("""<td>
									<div class="contenido">"""),_display_(/*103.34*/pc/*103.36*/.descripcion),format.raw/*103.48*/("""</div>
								</td>				
							""")))}),format.raw/*105.9*/("""
						"""),format.raw/*106.7*/("""</tr>
					</tbody>
				</table>
			</td>
		</tr>
		<tr>
			<td colspan=6>
				<table class="table table-bordered tablaReporte" >
					<tr>
						<td  colspan=10 class="etiqueta">AUTORES</td>
					</tr>
					<tr>
						<td class="etiqueta"><div></div>Nombre</td>
						<td class="etiqueta">Tipo de autoría</td>
						<td class="etiqueta">Teléfono</td>
						<td class="etiqueta">Email</td>
					</tr>				
					<tr>
						"""),_display_(/*124.8*/for(as <- recurso.autores) yield /*124.34*/ {_display_(Seq[Any](format.raw/*124.36*/("""
							"""),format.raw/*125.8*/("""<tr>
								<td>
									<div class="contenido">"""),_display_(/*127.34*/as/*127.36*/.nombre),format.raw/*127.43*/(""" """),_display_(/*127.45*/as/*127.47*/.paterno),format.raw/*127.55*/("""  """),_display_(/*127.58*/as/*127.60*/.materno),format.raw/*127.68*/("""</div>
								</td>
								<td>
									<div class="contenido">"""),_display_(/*130.34*/as/*130.36*/.autorfuncion.descripcion),format.raw/*130.61*/("""</div>
									"""),_display_(/*131.11*/if(as.autorfuncion.id == 9)/*131.38*/{_display_(Seq[Any](format.raw/*131.39*/("""
										"""),format.raw/*132.11*/("""<div class="contenido">"""),_display_(/*132.35*/as/*132.37*/.otrafuncion),format.raw/*132.49*/("""</div>
									""")))}),format.raw/*133.11*/("""
								"""),format.raw/*134.9*/("""</td>
								<td>
									"""),_display_(/*136.11*/if(as.correo != null)/*136.32*/{_display_(Seq[Any](format.raw/*136.33*/("""
										"""),format.raw/*137.11*/("""<div class="contenido">"""),_display_(/*137.35*/as/*137.37*/.correo.telefono),format.raw/*137.53*/("""</div>
									""")))}),format.raw/*138.11*/("""							
								"""),format.raw/*139.9*/("""</td>
								<td>
									"""),_display_(/*141.11*/if(as.correo != null)/*141.32*/{_display_(Seq[Any](format.raw/*141.33*/("""
								  		"""),format.raw/*142.13*/("""<div class="contenido">"""),_display_(/*142.37*/as/*142.39*/.correo.email),format.raw/*142.52*/("""</div>
								  	""")))}),format.raw/*143.13*/("""
								"""),format.raw/*144.9*/("""</td>
							</tr>				
						""")))}),format.raw/*146.8*/("""
					"""),format.raw/*147.6*/("""</tr>
				</table>
			</td>
		</tr>		
		<tr>
			<td colspan="6">
				<table class="table table-bordered tablaReporte" >
					<tr>
						<td  colspan=10 class="etiqueta">Documentos</td>
					</tr>				
					<tr>
						"""),_display_(/*158.8*/for(ds <- recurso.documentos) yield /*158.37*/ {_display_(Seq[Any](format.raw/*158.39*/("""
						"""),format.raw/*159.7*/("""<tr>
							<td>
								"""),_display_(/*161.10*/if(session.get("idRecurso"))/*161.38*/{_display_(Seq[Any](format.raw/*161.39*/("""
									"""),format.raw/*162.10*/("""<div class="contenido"><a href=""""),_display_(/*162.43*/routes/*162.49*/.RecursoWebController.verAn(ds.id)),format.raw/*162.83*/("""" target="blank">"""),_display_(/*162.101*/ds/*162.103*/.nombrearchivo),format.raw/*162.117*/("""</a></div>
								""")))}),format.raw/*163.10*/("""
								"""),_display_(/*164.10*/if(session.get("cvesRoles"))/*164.38*/{_display_(Seq[Any](format.raw/*164.39*/("""
									"""),_display_(/*165.11*/if(session.get("cvesRoles").contains("1 "))/*165.54*/{_display_(Seq[Any](format.raw/*165.55*/("""
										"""),format.raw/*166.11*/("""<div class="contenido"><a href=""""),_display_(/*166.44*/routes/*166.50*/.RecursoController.ver(ds.id)),format.raw/*166.79*/("""" target="blank">"""),_display_(/*166.97*/ds/*166.99*/.nombrearchivo),format.raw/*166.113*/("""</a></div>
									""")))}),format.raw/*167.11*/("""								
								""")))}),format.raw/*168.10*/("""
							"""),format.raw/*169.8*/("""<td>	
								<div class="contenido">"""),_display_(/*170.33*/ds/*170.35*/.tipodocumento.descripcion),format.raw/*170.61*/("""</div>
							</td>
						</tr>				
						""")))}),format.raw/*173.8*/("""
					"""),format.raw/*174.6*/("""</tr>
				</table>
			</td>
		</tr>	
		<tr>
			<td colspan="6">
				<table class="table table-bordered tablaReporte">
					<tr>
						<td>
							<div class="etiqueta">Fecha y hora registro electrónico</div><div class="contenido">"""),_display_(/*183.93*/recurso/*183.100*/.auditinsert.format("dd/MM/YYYY hh:mm:ss")),format.raw/*183.142*/("""</div>
						</td>	
						<td>
							<div class="etiqueta">Estado actual:</div><div class="contenido">"""),_display_(/*186.74*/recurso/*186.81*/.estado.descripcion),format.raw/*186.100*/("""</div>
						</td>
					</tr>		
				</table>			
			</td>
		</tr>
		
		"""),_display_(/*193.4*/if(recurso.oficio != null)/*193.30*/{_display_(Seq[Any](format.raw/*193.31*/("""
		"""),format.raw/*194.3*/("""<tr>
			<td colspan="6">
				<table class="table table-bordered tablaReporte">
					<tr>
						<td><div class="etiqueta">Oficio número</div><div class="contenido">"""),_display_(/*198.76*/recurso/*198.83*/.oficio.numero),format.raw/*198.97*/("""</div></td>
						<td><div class="etiqueta">Folio</div><div class="contenido">"""),_display_(/*199.68*/recurso/*199.75*/.oficio.folio),format.raw/*199.88*/("""</div></td>
						<td><div class="etiqueta">Ver</div><div class="contenido">   <a href=""""),_display_(/*200.78*/routes/*200.84*/.OficioController.verOficio(recurso.id)),format.raw/*200.123*/("""" target="blank">Ver oficio</a>  </div></td>
					</tr>
				</table>
			</td>
		</tr>
		""")))}),format.raw/*205.4*/("""

		"""),_display_(/*207.4*/if(recurso.clasificacion != null)/*207.37*/{_display_(Seq[Any](format.raw/*207.38*/("""
		"""),format.raw/*208.3*/("""<tr>
			<td colspan="6">
				<table class="table table-bordered tablaReporte">
					<tr>
						<td><div class="etiqueta">Clasificación</div><div class="contenido">"""),_display_(/*212.76*/recurso/*212.83*/.clasificacion.criterio1.descripcion),format.raw/*212.119*/(""" """),format.raw/*212.120*/("""/ """),_display_(/*212.123*/recurso/*212.130*/.clasificacion.criterio2.descripcion),format.raw/*212.166*/(""" """),format.raw/*212.167*/("""/ """),_display_(/*212.170*/recurso/*212.177*/.clasificacion.criterio3.catalogo.descripcion),format.raw/*212.222*/("""</div></td>
						"""),_display_(/*213.8*/if(recurso.clasificacion.tiporecurso != null)/*213.53*/{_display_(Seq[Any](format.raw/*213.54*/("""
							"""),format.raw/*214.8*/("""<td><div class="etiqueta">Tipo de recurso</div><div class="contenido">"""),_display_(/*214.79*/recurso/*214.86*/.clasificacion.tiporecurso.descripcion),format.raw/*214.124*/("""</div></td>						
						""")))}),format.raw/*215.8*/("""						
					"""),format.raw/*216.6*/("""</tr>
				</table>
			</td>
		</tr>				
		""")))}),format.raw/*220.4*/("""

		"""),_display_(/*222.4*/if(recurso.recursoevaluadores.size != 0)/*222.44*/{_display_(Seq[Any](format.raw/*222.45*/("""
			"""),format.raw/*223.4*/("""<tr>
				<td colspan="6">
					<table class="table table-bordered tablaReporte">
						<tr>
							<td><div class="etiqueta">Evaluador</div></td>
							<td><div class="etiqueta">Aspecto</div></td>
						</tr>
						"""),_display_(/*230.8*/for(re <- recurso.recursoevaluadores) yield /*230.45*/{_display_(Seq[Any](format.raw/*230.46*/("""
							"""),format.raw/*231.8*/("""<tr>											
								<td><div class="contenido">"""),_display_(/*232.37*/re/*232.39*/.evaluador.personal.nombreCompleto),format.raw/*232.73*/("""</div></td>
								<td><div class="contenido">"""),_display_(/*233.37*/re/*233.39*/.aspecto.descripcion),format.raw/*233.59*/("""</div></td>
							</tr>
						""")))}),format.raw/*235.8*/("""
					"""),format.raw/*236.6*/("""</table>
				</td>
			</tr>	
		
		
		
		
		
		
		
			<tr id="renglonSolProrroga">
				<td colspan="6">
					<table class="table table-bordered tablaReporte" id="tablaSolProrroga">
						<tr>
							<td colspan="6" div class="etiqueta">SOLICITUDES DE PRÓRROGAS</td>
						</tr>
						<tr>
							<td><div class="etiqueta">Evaluador</div></td>
							<td><div class="etiqueta">Aspecto</div></td>
							<td><div class="etiqueta">Fecha solicitud</div></td>
							<td><div class="etiqueta">No. días</div></td>
							<td><div class="etiqueta">Aplicado</div></td>
						</tr>						
						"""),_display_(/*259.8*/for(re <- recurso.recursoevaluadores) yield /*259.45*/{_display_(Seq[Any](format.raw/*259.46*/("""
							"""),_display_(/*260.9*/for(sol <- re.prorrogas) yield /*260.33*/{_display_(Seq[Any](format.raw/*260.34*/("""
								"""),format.raw/*261.9*/("""<tr>
									<td>"""),_display_(/*262.15*/sol/*262.18*/.recursoevaluador.evaluador.personal.nombreCompleto),format.raw/*262.69*/("""</td>
									<td>"""),_display_(/*263.15*/sol/*263.18*/.recursoevaluador.aspecto.descripcion),format.raw/*263.55*/("""</td>
									
									<td>"""),_display_(/*265.15*/sol/*265.18*/.auditinsert.format("dd/MM/YYYY hh:mm:ss")),format.raw/*265.60*/("""</td>
									<td>"""),_display_(/*266.15*/sol/*266.18*/.ndias),format.raw/*266.24*/("""</td>
									<td>"""),_display_(/*267.15*/if(sol.autorizado)/*267.33*/{_display_(Seq[Any](format.raw/*267.34*/("""Si""")))}/*267.37*/else/*267.41*/{_display_(Seq[Any](format.raw/*267.42*/("""No""")))}),format.raw/*267.45*/(""" """),format.raw/*267.46*/("""</td>
								</tr>
							""")))}),format.raw/*269.9*/("""
						""")))}),format.raw/*270.8*/("""
					"""),format.raw/*271.6*/("""</table>
				</td>
			</tr>
					
		""")))}),format.raw/*275.4*/("""
		
		"""),_display_(/*277.4*/if(recurso.oficiovaloracion != null )/*277.41*/{_display_(Seq[Any](format.raw/*277.42*/("""
			"""),format.raw/*278.4*/("""<tr>
				<td colspan="6">
					<table class="table table-bordered tablaReporte">
						<tr>
							<td colspan="2"><div class="etiqueta">Oficio de valoración</div></td>
						</tr>
							<tr>											
								<td><div class="contenido">Número de oficio de valoración """),_display_(/*285.68*/recurso/*285.75*/.oficiovaloracion.numero),format.raw/*285.99*/("""</div></td>
								<td><div class="contenido"><a href=""""),_display_(/*286.46*/routes/*286.52*/.RecursoController.verOficioValoracion(recurso.oficiovaloracion.id)),format.raw/*286.119*/("""" target="blank">Ver Oficio de valoración</a></div></td>
							</tr>
					</table>
				</td>
			</tr>
		""")))}),format.raw/*291.4*/("""		
		
		
		
		"""),_display_(/*295.4*/if(recurso.estado.id == 400 || recurso.estado.id == 402)/*295.60*/{_display_(Seq[Any](format.raw/*295.61*/("""
			"""),format.raw/*296.4*/("""<tr>
				<td colspan="6">
					<table class="table table-bordered tablaReporte">
						<tr>
							<td><div class="etiqueta">Solicitud de cancelación</div></td>
							<td><div class="etiqueta">Solicitante</div></td>
							<td><div class="etiqueta">Motivo</div></td>
							<td><div class="etiqueta">Fecha aceptación</div></td>
							<td><div class="etiqueta">Fecha reactivación</div></td>
							
						</tr>
						"""),_display_(/*307.8*/for(sc <- recurso.solicitudescancelacion) yield /*307.49*/{_display_(Seq[Any](format.raw/*307.50*/("""
							"""),format.raw/*308.8*/("""<tr>											
								<td><div class="contenido">"""),_display_(/*309.37*/sc/*309.39*/.fechaSolicitud.format("dd/MM/YYYY hh:mm:ss")),format.raw/*309.84*/("""</div></td>
								<td><div class="contenido">"""),_display_(/*310.37*/sc/*310.39*/.evaluador.personal.nombreCompleto),format.raw/*310.73*/("""</div></td>
								<td><div class="contenido">"""),_display_(/*311.37*/sc/*311.39*/.motivoCancelacion),format.raw/*311.57*/("""</div></td>
								
									<td><div class="contenido">"""),_display_(/*313.38*/if(sc.fechaAceptacion!=null)/*313.66*/{_display_(_display_(/*313.68*/sc/*313.70*/.fechaAceptacion.format("dd/MM/YYYY hh:mm:ss")))}),format.raw/*313.117*/("""</div></td>
									<td><div class="contenido">"""),_display_(/*314.38*/if(sc.fechaReactivacion!=null)/*314.68*/{_display_(_display_(/*314.70*/sc/*314.72*/.fechaReactivacion.format("dd/MM/YYYY hh:mm:ss")))}),format.raw/*314.121*/("""</div></td>
								
							</tr>
						""")))}),format.raw/*317.8*/("""
					"""),format.raw/*318.6*/("""</table>
				</td>
			</tr>		
		""")))}),format.raw/*321.4*/("""

		"""),_display_(/*323.4*/if(recurso.estado.id == 401)/*323.32*/{_display_(Seq[Any](format.raw/*323.33*/("""
			"""),format.raw/*324.4*/("""<tr>
				<td colspan="6">
					<table class="table table-bordered tablaReporte">
						<tr>
							<td><div class="etiqueta">Cancelación en clasificación</div></td>
							<td><div class="etiqueta">Observación</div></td>
						</tr>
						<tr>											
							<td><div class="contenido">"""),_display_(/*332.36*/recurso/*332.43*/.auditlastupdate.format("dd/MM/YYYY hh:mm:ss")),format.raw/*332.89*/("""</div></td>
							    <td><div class="contenido">
							    """),_display_(/*334.13*/if(recurso.observacioncancelacion != null)/*334.55*/{_display_(Seq[Any](format.raw/*334.56*/("""
							       """),_display_(/*335.16*/recurso/*335.23*/.observacioncancelacion.observacion),format.raw/*335.58*/("""
							    """)))}),format.raw/*336.13*/("""
							    """),format.raw/*337.12*/("""</div></td>
					</table>
				</td>
			</tr>		
		""")))}),format.raw/*341.4*/("""

			
			
			
			
			
		"""),format.raw/*348.3*/("""<tr>
			<td colspan="6">
				<table class="table table-bordered tablaReporte">
					<tr>
						<td  colspan=10 class="etiqueta">Historial de estados</td>
					</tr>
					<tr>
						<td class="etiqueta">Estado</td><td class="etiqueta">Fecha</td>
					</tr>
					"""),_display_(/*357.7*/for(hs<-recurso.historialestados) yield /*357.40*/{_display_(Seq[Any](format.raw/*357.41*/("""
						"""),format.raw/*358.7*/("""<tr>
							<td>
								<div class="contenido">"""),_display_(/*360.33*/hs/*360.35*/.estado.descripcion),format.raw/*360.54*/("""</div>
							</td>
							<td>
								<div class="contenido">"""),_display_(/*363.33*/hs/*363.35*/.auditinsert.format("dd/MM/YYYY hh:mm:ss")),format.raw/*363.77*/("""</div>
							</td>			
						</tr>
					""")))}),format.raw/*366.7*/("""
				"""),format.raw/*367.5*/("""</table>
				
				<table class="table table-bordered tablaReporte">	
					"""),_display_(/*370.7*/if(recurso.historialestadoevaluaciones.size!=0)/*370.54*/{_display_(Seq[Any](format.raw/*370.55*/("""
						"""),format.raw/*371.7*/("""<tr>
							<td  colspan=10 class="etiqueta">Detalle evaluaciones</td>
						</tr>
						<tr>
							<td class="etiqueta">Estado</td><td class="etiqueta">Fecha</td><td class="etiqueta">Evaluador</td><td class="etiqueta">Aspecto</td>
						</tr>					
						"""),_display_(/*377.8*/for(hee<-recurso.historialestadoevaluaciones) yield /*377.53*/{_display_(Seq[Any](format.raw/*377.54*/("""
							"""),format.raw/*378.8*/("""<tr>
								<td>
									<div class="contenido">"""),_display_(/*380.34*/hee/*380.37*/.estado.descripcion),format.raw/*380.56*/("""</div>
								</td>
								<td>
									<div class="contenido">"""),_display_(/*383.34*/hee/*383.37*/.auditinsert.format("dd/MM/YYYY hh:mm:ss")),format.raw/*383.79*/("""</div>
								</td>
								<td>
									<div class="contenido">"""),_display_(/*386.34*/hee/*386.37*/.recursoevaluador.evaluador.personal.nombreCompleto),format.raw/*386.88*/("""</div>
								</td>
								<td>
									<div class="contenido">"""),_display_(/*389.34*/hee/*389.37*/.recursoevaluador.aspecto.descripcion),format.raw/*389.74*/("""</div>
								</td>								
							</tr>						
						""")))}),format.raw/*392.8*/("""
					""")))}),format.raw/*393.7*/("""
				"""),format.raw/*394.5*/("""</table>
				
				<table class="table table-bordered tablaReporte">	
					"""),_display_(/*397.7*/if(recurso.historialestadoencuesta.size!=0)/*397.50*/{_display_(Seq[Any](format.raw/*397.51*/("""
						"""),format.raw/*398.7*/("""<tr>
							<td  colspan=10 class="etiqueta">Detalle encuestas</td>
						</tr>
						<tr>
							<td class="etiqueta">Estado</td><td class="etiqueta">Fecha</td>
						</tr>					
						"""),_display_(/*404.8*/for(heen<-recurso.historialestadoencuesta) yield /*404.50*/{_display_(Seq[Any](format.raw/*404.51*/("""
							"""),format.raw/*405.8*/("""<tr>
								<td>
									<div class="contenido">"""),_display_(/*407.34*/heen/*407.38*/.estado.descripcion),format.raw/*407.57*/("""</div>
								</td>
								<td>
									<div class="contenido">"""),_display_(/*410.34*/heen/*410.38*/.auditinsert.format("dd/MM/YYYY hh:mm:ss")),format.raw/*410.80*/("""</div>
								</td>
							</tr>						
						""")))}),format.raw/*413.8*/("""
					""")))}),format.raw/*414.7*/("""
				"""),format.raw/*415.5*/("""</table>
			</td>
		</tr>
		
		
		
				
	</table>
	

	

""")))}),format.raw/*427.2*/("""
"""),format.raw/*428.1*/("""<script type="text/javascript">
	$( document ).ready(function() """),format.raw/*429.33*/("""{"""),format.raw/*429.34*/("""	
		"""),format.raw/*430.3*/("""if ( $("#tablaSolProrroga tr").length != 2   )"""),format.raw/*430.49*/("""{"""),format.raw/*430.50*/("""
			"""),format.raw/*431.4*/("""$("#renglonSolProrroga").show();
		"""),format.raw/*432.3*/("""}"""),format.raw/*432.4*/(""" """),format.raw/*432.5*/("""else """),format.raw/*432.10*/("""{"""),format.raw/*432.11*/("""
			"""),format.raw/*433.4*/("""$("#renglonSolProrroga").hide();
		"""),format.raw/*434.3*/("""}"""),format.raw/*434.4*/("""
	"""),format.raw/*435.2*/("""}"""),format.raw/*435.3*/(""");


	$("#tablaPalabras tbody td").each(function (index) """),format.raw/*438.53*/("""{"""),format.raw/*438.54*/("""
	 	"""),format.raw/*439.4*/("""if ((index % 5) == 0) """),format.raw/*439.26*/("""{"""),format.raw/*439.27*/(""" 
	 		"""),format.raw/*440.5*/("""$("#tablaPalabras tbody").append($('<tr>')); 
	 	"""),format.raw/*441.4*/("""}"""),format.raw/*441.5*/(""" 
	 	"""),format.raw/*442.4*/("""$("#tablaPalabras tbody tr").last().append($(this)); 
	 """),format.raw/*443.3*/("""}"""),format.raw/*443.4*/(""");
	
	
	"""),_display_(/*446.3*/if(recurso.estado.id == 1L)/*446.30*/{_display_(Seq[Any](format.raw/*446.31*/("""
		"""),format.raw/*447.3*/("""$("#alertEstado").removeClass("alert alert-default").addClass("alert alert-info").html( $("#alertEstado").html()+   " Reingrese mas tarde.");;
	""")))}),format.raw/*448.3*/("""
	"""),_display_(/*449.3*/if(recurso.estado.id == 2)/*449.29*/{_display_(Seq[Any](format.raw/*449.30*/("""		
		"""),format.raw/*450.3*/("""$("#alertEstado").removeClass("alert alert-default").addClass("alert alert-warning").html( $("#alertEstado").html()+   " Corrija las observaciones indicadas y envíe.");
	""")))}),format.raw/*451.3*/("""
	"""),_display_(/*452.3*/if(recurso.estado.id == 3L)/*452.30*/{_display_(Seq[Any](format.raw/*452.31*/("""
		"""),format.raw/*453.3*/("""$("#alertEstado").removeClass("alert alert-default").addClass("alert alert-success").html( $("#alertEstado").html()+   " Toda su información esta bien, los evaluadores procederan a revisar el contenido, reingrese mas tarde.");
	""")))}),format.raw/*454.3*/("""
	
	

	
	
"""),format.raw/*460.1*/("""</script>


"""))}
  }

  def render(recurso:Recurso): play.twirl.api.HtmlFormat.Appendable = apply(recurso)

  def f:((Recurso) => play.twirl.api.HtmlFormat.Appendable) = (recurso) => apply(recurso)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Reporte/cesoe.scala.html
                  HASH: 484450593b126b5f42407fdad094687e85068d20
                  MATRIX: 732->1|838->19|868->23|939->68|953->74|1010->111|1043->119|1054->123|1092->125|1120->128|1159->159|1197->160|1226->163|1347->258|1363->265|1403->284|1449->301|1482->307|1643->441|1659->448|1687->455|1813->554|1829->561|1862->572|2007->690|2023->697|2072->724|2212->837|2228->844|2279->873|2429->996|2445->1003|2490->1026|2645->1154|2661->1161|2695->1174|2812->1264|2896->1326|3018->1421|3095->1476|3125->1477|3259->1584|3303->1619|3342->1620|3379->1630|3395->1637|3446->1668|3492->1705|3531->1706|3561->1709|3577->1716|3625->1739|3664->1748|3696->1753|3838->1868|3854->1875|3909->1908|4024->1996|4040->2003|4081->2023|4119->2035|4163->2070|4202->2071|4235->2077|4336->2151|4352->2158|4417->2201|4459->2213|4490->2217|4592->2293|4637->2322|4676->2323|4709->2329|4800->2393|4812->2396|4855->2418|4897->2430|4928->2434|5060->2539|5076->2546|5124->2574|5167->2608|5206->2609|5237->2612|5254->2619|5299->2639|5355->2669|5391->2696|5430->2697|5461->2701|5584->2797|5600->2804|5625->2808|5677->2834|5725->2866|5765->2868|5797->2873|5905->2954|5916->2956|5945->2964|6084->3076|6095->3078|6125->3087|6180->3112|6211->3116|6250->3125|6282->3130|6398->3219|6414->3226|6444->3235|6740->3504|6789->3536|6830->3538|6867->3547|6933->3585|6945->3587|6979->3599|7043->3632|7078->3639|7527->4061|7570->4087|7611->4089|7647->4097|7726->4148|7738->4150|7767->4157|7797->4159|7809->4161|7839->4169|7870->4172|7882->4174|7912->4182|8007->4249|8019->4251|8066->4276|8111->4293|8148->4320|8188->4321|8228->4332|8280->4356|8292->4358|8326->4370|8375->4387|8412->4396|8469->4425|8500->4446|8540->4447|8580->4458|8632->4482|8644->4484|8682->4500|8731->4517|8775->4533|8832->4562|8863->4583|8903->4584|8945->4597|8997->4621|9009->4623|9044->4636|9095->4655|9132->4664|9193->4694|9227->4700|9471->4917|9517->4946|9558->4948|9593->4955|9647->4981|9685->5009|9725->5010|9764->5020|9825->5053|9841->5059|9897->5093|9944->5111|9957->5113|9994->5127|10046->5147|10084->5157|10122->5185|10162->5186|10201->5197|10254->5240|10294->5241|10334->5252|10395->5285|10411->5291|10462->5320|10508->5338|10520->5340|10557->5354|10610->5375|10660->5393|10696->5401|10762->5439|10774->5441|10822->5467|10896->5510|10930->5516|11189->5747|11207->5754|11272->5796|11404->5900|11421->5907|11463->5926|11561->5997|11597->6023|11637->6024|11668->6027|11860->6191|11877->6198|11913->6212|12020->6291|12037->6298|12072->6311|12189->6400|12205->6406|12267->6445|12387->6534|12419->6539|12462->6572|12502->6573|12533->6576|12725->6740|12742->6747|12801->6783|12832->6784|12864->6787|12882->6794|12941->6830|12972->6831|13004->6834|13022->6841|13090->6886|13136->6905|13191->6950|13231->6951|13267->6959|13366->7030|13383->7037|13444->7075|13500->7100|13540->7112|13614->7155|13646->7160|13696->7200|13736->7201|13768->7205|14012->7422|14066->7459|14106->7460|14142->7468|14222->7520|14234->7522|14290->7556|14366->7604|14378->7606|14420->7626|14483->7658|14517->7664|15129->8249|15183->8286|15223->8287|15259->8296|15300->8320|15340->8321|15377->8330|15424->8349|15437->8352|15510->8403|15558->8423|15571->8426|15630->8463|15688->8493|15701->8496|15765->8538|15813->8558|15826->8561|15854->8567|15902->8587|15930->8605|15970->8606|15993->8609|16007->8613|16047->8614|16082->8617|16112->8618|16171->8646|16210->8654|16244->8660|16312->8697|16346->8704|16393->8741|16433->8742|16465->8746|16764->9017|16781->9024|16827->9048|16912->9105|16928->9111|17018->9178|17155->9284|17197->9299|17263->9355|17303->9356|17335->9360|17781->9779|17839->9820|17879->9821|17915->9829|17995->9881|18007->9883|18074->9928|18150->9976|18162->9978|18218->10012|18294->10060|18306->10062|18346->10080|18432->10138|18470->10166|18501->10168|18513->10170|18585->10217|18662->10266|18702->10296|18733->10298|18745->10300|18819->10349|18891->10390|18925->10396|18989->10429|19021->10434|19059->10462|19099->10463|19131->10467|19449->10757|19466->10764|19534->10810|19625->10873|19677->10915|19717->10916|19761->10932|19778->10939|19835->10974|19880->10987|19921->10999|20002->11049|20054->11073|20343->11335|20393->11368|20433->11369|20468->11376|20545->11425|20557->11427|20598->11446|20690->11510|20702->11512|20766->11554|20838->11595|20871->11600|20973->11675|21030->11722|21070->11723|21105->11730|21389->11987|21451->12032|21491->12033|21527->12041|21606->12092|21619->12095|21660->12114|21755->12181|21768->12184|21832->12226|21927->12293|21940->12296|22013->12347|22108->12414|22121->12417|22180->12454|22266->12509|22304->12516|22337->12521|22439->12596|22492->12639|22532->12640|22567->12647|22780->12833|22839->12875|22879->12876|22915->12884|22994->12935|23008->12939|23049->12958|23144->13025|23158->13029|23222->13071|23300->13118|23338->13125|23371->13130|23459->13187|23488->13188|23581->13252|23611->13253|23643->13257|23718->13303|23748->13304|23780->13308|23843->13343|23872->13344|23901->13345|23935->13350|23965->13351|23997->13355|24060->13390|24089->13391|24119->13393|24148->13394|24234->13451|24264->13452|24296->13456|24347->13478|24377->13479|24411->13485|24488->13534|24517->13535|24550->13540|24634->13596|24663->13597|24699->13606|24736->13633|24776->13634|24807->13637|24983->13782|25013->13785|25049->13811|25089->13812|25122->13817|25324->13988|25354->13991|25391->14018|25431->14019|25462->14022|25722->14251|25760->14261
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|35->7|36->8|38->10|40->12|40->12|40->12|41->13|41->13|41->13|45->17|45->17|45->17|48->20|48->20|48->20|53->25|53->25|53->25|58->30|58->30|58->30|61->33|61->33|66->38|66->38|66->38|71->43|71->43|71->43|72->44|72->44|72->44|72->44|72->44|72->44|72->44|72->44|73->45|74->46|80->52|80->52|80->52|83->55|83->55|83->55|84->56|84->56|84->56|85->57|85->57|85->57|85->57|86->58|87->59|90->62|90->62|90->62|91->63|91->63|91->63|91->63|92->64|93->65|96->68|96->68|96->68|96->68|96->68|96->68|96->68|96->68|99->71|99->71|99->71|100->72|102->74|102->74|102->74|104->76|104->76|104->76|105->77|106->78|106->78|106->78|109->81|109->81|109->81|111->83|112->84|113->85|114->86|116->88|116->88|116->88|129->101|129->101|129->101|130->102|131->103|131->103|131->103|133->105|134->106|152->124|152->124|152->124|153->125|155->127|155->127|155->127|155->127|155->127|155->127|155->127|155->127|155->127|158->130|158->130|158->130|159->131|159->131|159->131|160->132|160->132|160->132|160->132|161->133|162->134|164->136|164->136|164->136|165->137|165->137|165->137|165->137|166->138|167->139|169->141|169->141|169->141|170->142|170->142|170->142|170->142|171->143|172->144|174->146|175->147|186->158|186->158|186->158|187->159|189->161|189->161|189->161|190->162|190->162|190->162|190->162|190->162|190->162|190->162|191->163|192->164|192->164|192->164|193->165|193->165|193->165|194->166|194->166|194->166|194->166|194->166|194->166|194->166|195->167|196->168|197->169|198->170|198->170|198->170|201->173|202->174|211->183|211->183|211->183|214->186|214->186|214->186|221->193|221->193|221->193|222->194|226->198|226->198|226->198|227->199|227->199|227->199|228->200|228->200|228->200|233->205|235->207|235->207|235->207|236->208|240->212|240->212|240->212|240->212|240->212|240->212|240->212|240->212|240->212|240->212|240->212|241->213|241->213|241->213|242->214|242->214|242->214|242->214|243->215|244->216|248->220|250->222|250->222|250->222|251->223|258->230|258->230|258->230|259->231|260->232|260->232|260->232|261->233|261->233|261->233|263->235|264->236|287->259|287->259|287->259|288->260|288->260|288->260|289->261|290->262|290->262|290->262|291->263|291->263|291->263|293->265|293->265|293->265|294->266|294->266|294->266|295->267|295->267|295->267|295->267|295->267|295->267|295->267|295->267|297->269|298->270|299->271|303->275|305->277|305->277|305->277|306->278|313->285|313->285|313->285|314->286|314->286|314->286|319->291|323->295|323->295|323->295|324->296|335->307|335->307|335->307|336->308|337->309|337->309|337->309|338->310|338->310|338->310|339->311|339->311|339->311|341->313|341->313|341->313|341->313|341->313|342->314|342->314|342->314|342->314|342->314|345->317|346->318|349->321|351->323|351->323|351->323|352->324|360->332|360->332|360->332|362->334|362->334|362->334|363->335|363->335|363->335|364->336|365->337|369->341|376->348|385->357|385->357|385->357|386->358|388->360|388->360|388->360|391->363|391->363|391->363|394->366|395->367|398->370|398->370|398->370|399->371|405->377|405->377|405->377|406->378|408->380|408->380|408->380|411->383|411->383|411->383|414->386|414->386|414->386|417->389|417->389|417->389|420->392|421->393|422->394|425->397|425->397|425->397|426->398|432->404|432->404|432->404|433->405|435->407|435->407|435->407|438->410|438->410|438->410|441->413|442->414|443->415|455->427|456->428|457->429|457->429|458->430|458->430|458->430|459->431|460->432|460->432|460->432|460->432|460->432|461->433|462->434|462->434|463->435|463->435|466->438|466->438|467->439|467->439|467->439|468->440|469->441|469->441|470->442|471->443|471->443|474->446|474->446|474->446|475->447|476->448|477->449|477->449|477->449|478->450|479->451|480->452|480->452|480->452|481->453|482->454|488->460
                  -- GENERATED --
              */
          