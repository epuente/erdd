
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
object reporteEvaluacion extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Recurso,List[Modalidad],List[Version],List[Formatoentrega],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recurso: Recurso, modalidad:List[Modalidad], version:List[Version], fe:List[Formatoentrega]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.95*/("""

  """),format.raw/*3.3*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*3.48*/routes/*3.54*/.Assets.at("stylesheets/recurso.css")),format.raw/*3.91*/(""""/> 	

"""),_display_(/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""

"""),format.raw/*7.1*/("""ESE NO SIRRRVEEEEEE
	<table class="table table-bordered tablaReporte">
		<tr>
			<td colspan="5"><div class="etiqueta">Título</div><div class="contenido">"""),_display_(/*10.78*/recurso/*10.85*/.titulo),format.raw/*10.92*/("""</div></td>
			<td colspan="1"><div class="etiqueta">Clave de control</div><div class="contenido">"""),_display_(/*11.88*/recurso/*11.95*/.numcontrol),format.raw/*11.106*/("""</div></td>
		</tr>
		<tr>
			<td colspan="2">
				<div class="etiqueta">Nivel académico</div><div class="contenido">"""),_display_(/*15.72*/recurso/*15.79*/.niveleducativo.descripcion),format.raw/*15.106*/("""</div>
			</td>
			<td colspan="4">
				<div class="etiqueta">Área del conocimiento</div><div class="contenido">"""),_display_(/*18.78*/recurso/*18.85*/.areaconocimiento.descripcion),format.raw/*18.114*/("""</div>
			</td>
		</tr>
		<tr>
			<td colspan="6">
				<div class="etiqueta">Unidad Académica</div><div class="contenido">"""),_display_(/*23.73*/recurso/*23.80*/.unidadacademica.nombre),format.raw/*23.103*/("""</div>
			</td>			
		</tr>
		<tr>
			<td>
				<div class="etiqueta">Programa Académico:</div><div class="contenido">"""),_display_(/*28.76*/recurso/*28.83*/.programaacad),format.raw/*28.96*/("""</div>
			</td>	
			<td>
				<div class="etiqueta">Modalidad</div><div class="contenido">"""),_display_(/*31.66*/{ if (recurso.modalidad != null)recurso.modalidad.descripcion}),format.raw/*31.128*/("""</div>
			</td>
		
			
			<td>
				<div class="etiqueta">Duración</div><div class="contenido">"""),_display_(/*36.65*/recurso/*36.72*/.duracion),format.raw/*36.81*/("""</div>
			</td>
			<td>
				<div class="etiqueta">Fecha elaboración</div><div class="contenido">"""),_display_(/*39.74*/recurso/*39.81*/.elaboracion.format("dd/MM/yyyy")),format.raw/*39.114*/("""</div>
			</td>	
			<td>
				<div class="etiqueta">Versión</div><div class="contenido">"""),_display_(/*42.64*/recurso/*42.71*/.version.descripcion),format.raw/*42.91*/("""</div>
				"""),_display_(/*43.6*/if(recurso.versionanterior != null)/*43.41*/{_display_(Seq[Any](format.raw/*43.42*/("""
					"""),format.raw/*44.6*/("""<div class="etiqueta">Clave control anterior</div><div class="contenido">"""),_display_(/*44.80*/recurso/*44.87*/.versionanterior.recursoanterior.numcontrol),format.raw/*44.130*/("""</div>
				""")))}),format.raw/*45.6*/("""
			"""),format.raw/*46.4*/("""</td>
			<td>
				<div class="etiqueta">Formato de entrega</div><div class="contenido">"""),_display_(/*48.75*/recurso/*48.82*/.formatoentrega.descripcion),format.raw/*48.109*/("""</div>
				"""),_display_(/*49.6*/if(recurso.formatoentrega.id == 3)/*49.40*/{_display_(Seq[Any](format.raw/*49.41*/("""
					"""),_display_(/*50.7*/recurso/*50.14*/.formatoentregaotro),format.raw/*50.33*/("""
				""")))}),format.raw/*51.6*/("""
			"""),format.raw/*52.4*/("""</td>			
		</tr>
		"""),_display_(/*54.4*/if(recurso.url.length != 0)/*54.31*/{_display_(Seq[Any](format.raw/*54.32*/("""
			"""),format.raw/*55.4*/("""<tr>
				<td>
					<div class="etiqueta">Dirección URL</div><div class="contenido">"""),_display_(/*57.71*/recurso/*57.78*/.url),format.raw/*57.82*/("""</div>					
				</td>
			"""),_display_(/*59.5*/for(rw <- recurso.recursosenweb) yield /*59.37*/ {_display_(Seq[Any](format.raw/*59.39*/("""
				"""),format.raw/*60.5*/("""<td>
					<div class="etiqueta">Usuario</div><div class="contenido">"""),_display_(/*61.65*/rw/*61.67*/.usuario),format.raw/*61.75*/("""</div>		
				</td>
				<td>
					<div class="etiqueta">Clave de acceso</div><div class="contenido">"""),_display_(/*64.73*/rw/*64.75*/.password),format.raw/*64.84*/("""</div>	
				</td>			
				""")))}),format.raw/*66.6*/("""
			"""),format.raw/*67.4*/("""</tr>
		""")))}),format.raw/*68.4*/("""		
		"""),format.raw/*69.3*/("""<tr>
			<td colspan="6">
				<div class="etiqueta">Sinópsis</div><div class="contenido">"""),_display_(/*71.65*/recurso/*71.72*/.sinopsis),format.raw/*71.81*/("""</div>
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
							"""),_display_(/*84.9*/for(pc <- recurso.palabrasclave) yield /*84.41*/ {_display_(Seq[Any](format.raw/*84.43*/("""
								"""),format.raw/*85.9*/("""<td>
									<div class="contenido">"""),_display_(/*86.34*/pc/*86.36*/.descripcion),format.raw/*86.48*/("""</div>
								</td>				
							""")))}),format.raw/*88.9*/("""
						"""),format.raw/*89.7*/("""</tr>
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
						"""),_display_(/*107.8*/for(as <- recurso.autores) yield /*107.34*/ {_display_(Seq[Any](format.raw/*107.36*/("""
							"""),format.raw/*108.8*/("""<tr>
								<td>
									<div class="contenido">"""),_display_(/*110.34*/as/*110.36*/.nombre),format.raw/*110.43*/(""" """),_display_(/*110.45*/as/*110.47*/.paterno),format.raw/*110.55*/("""  """),_display_(/*110.58*/as/*110.60*/.materno),format.raw/*110.68*/("""</div>
								</td>
								<td>
									<div class="contenido">"""),_display_(/*113.34*/as/*113.36*/.autorfuncion.descripcion),format.raw/*113.61*/("""</div>
									"""),_display_(/*114.11*/if(as.autorfuncion.id == 9)/*114.38*/{_display_(Seq[Any](format.raw/*114.39*/("""
										"""),format.raw/*115.11*/("""<div class="contenido">"""),_display_(/*115.35*/as/*115.37*/.otrafuncion),format.raw/*115.49*/("""</div>
									""")))}),format.raw/*116.11*/("""
								"""),format.raw/*117.9*/("""</td>
								<td>
									"""),_display_(/*119.11*/if(as.correo != null)/*119.32*/{_display_(Seq[Any](format.raw/*119.33*/("""
										"""),format.raw/*120.11*/("""<div class="contenido">"""),_display_(/*120.35*/as/*120.37*/.correo.telefono),format.raw/*120.53*/("""</div>
									""")))}),format.raw/*121.11*/("""							
								"""),format.raw/*122.9*/("""</td>
								<td>
									"""),_display_(/*124.11*/if(as.correo != null)/*124.32*/{_display_(Seq[Any](format.raw/*124.33*/("""
								  		"""),format.raw/*125.13*/("""<div class="contenido">"""),_display_(/*125.37*/as/*125.39*/.correo.email),format.raw/*125.52*/("""</div>
								  	""")))}),format.raw/*126.13*/("""
								"""),format.raw/*127.9*/("""</td>
							</tr>				
						""")))}),format.raw/*129.8*/("""
					"""),format.raw/*130.6*/("""</tr>
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
						"""),_display_(/*141.8*/for(ds <- recurso.documentos) yield /*141.37*/ {_display_(Seq[Any](format.raw/*141.39*/("""
						"""),format.raw/*142.7*/("""<tr>
							<td>
								<div class="contenido"><a href="/documento/ver/"""),_display_(/*144.57*/ds/*144.59*/.id),format.raw/*144.62*/("""">"""),_display_(/*144.65*/ds/*144.67*/.nombrearchivo),format.raw/*144.81*/("""</a></div>
							<td>	
								<div class="contenido">"""),_display_(/*146.33*/ds/*146.35*/.tipodocumento.descripcion),format.raw/*146.61*/("""</div>
							</td>
						</tr>				
						""")))}),format.raw/*149.8*/("""
					"""),format.raw/*150.6*/("""</tr>
				</table>
			</td>
		</tr>	
		<tr>
			<td colspan="6">
				<table class="table table-bordered tablaReporte">
					<tr>
						<td>
							<div class="etiqueta">Fecha y hora registro electrónico</div><div class="contenido">"""),_display_(/*159.93*/recurso/*159.100*/.auditinsert.format("dd/MM/YYYY hh:mm:ss")),format.raw/*159.142*/("""</div>
						</td>	
						<td>
							<div class="etiqueta">Estado actual:</div><div class="contenido">"""),_display_(/*162.74*/recurso/*162.81*/.estado.descripcion),format.raw/*162.100*/("""</div>
						</td>
					</tr>		
				</table>			
			</td>
		</tr>
		
		"""),_display_(/*169.4*/if(recurso.oficio != null)/*169.30*/{_display_(Seq[Any](format.raw/*169.31*/("""
		"""),format.raw/*170.3*/("""<tr>
			<td colspan="6">
				<table class="table table-bordered tablaReporte">
					<tr>
						<td><div class="etiqueta">Oficio número</div><div class="contenido">"""),_display_(/*174.76*/recurso/*174.83*/.oficio.numero),format.raw/*174.97*/("""</div></td>
						<td><div class="etiqueta">Folio</div><div class="contenido">"""),_display_(/*175.68*/recurso/*175.75*/.oficio.folio),format.raw/*175.88*/("""</div></td>
					</tr>
				</table>
			</td>
		</tr>
		""")))}),format.raw/*180.4*/("""

		"""),_display_(/*182.4*/if(recurso.clasificacion != null)/*182.37*/{_display_(Seq[Any](format.raw/*182.38*/("""
		"""),format.raw/*183.3*/("""<tr>
			<td colspan="6">
				<table class="table table-bordered tablaReporte">
					<tr>
						<td><div class="etiqueta">Clasificación</div><div class="contenido">"""),_display_(/*187.76*/recurso/*187.83*/.clasificacion.criterio1.descripcion),format.raw/*187.119*/(""" """),format.raw/*187.120*/("""/ """),_display_(/*187.123*/recurso/*187.130*/.clasificacion.criterio2.descripcion),format.raw/*187.166*/(""" """),format.raw/*187.167*/("""/ """),_display_(/*187.170*/recurso/*187.177*/.clasificacion.criterio3.catalogo.descripcion),format.raw/*187.222*/("""</div></td>
						"""),_display_(/*188.8*/if(recurso.clasificacion.tiporecurso != null)/*188.53*/{_display_(Seq[Any](format.raw/*188.54*/("""
							"""),format.raw/*189.8*/("""<td><div class="etiqueta">Tipo de recurso</div><div class="contenido">"""),_display_(/*189.79*/recurso/*189.86*/.clasificacion.tiporecurso.descripcion),format.raw/*189.124*/("""</div></td>						
						""")))}),format.raw/*190.8*/("""						
					"""),format.raw/*191.6*/("""</tr>
				</table>
			</td>
		</tr>				
		""")))}),format.raw/*195.4*/("""

		"""),_display_(/*197.4*/if(recurso.recursoevaluadores.size != 0)/*197.44*/{_display_(Seq[Any](format.raw/*197.45*/("""
			"""),format.raw/*198.4*/("""<tr>
				<td colspan="6">
					<table class="table table-bordered tablaReporte">
						<tr>
							<td><div class="etiqueta">Evaluador</div></td>
							<td><div class="etiqueta">Aspecto</div></td>
						</tr>
						"""),_display_(/*205.8*/for(re <- recurso.recursoevaluadores) yield /*205.45*/{_display_(Seq[Any](format.raw/*205.46*/("""
							"""),format.raw/*206.8*/("""<tr>											
								<td><div class="contenido">"""),_display_(/*207.37*/re/*207.39*/.evaluador.personal.nombreCompleto),format.raw/*207.73*/("""</div></td>
								<td><div class="contenido">"""),_display_(/*208.37*/re/*208.39*/.aspecto.descripcion),format.raw/*208.59*/("""</div></td>
							</tr>
						""")))}),format.raw/*210.8*/("""
					"""),format.raw/*211.6*/("""</table>
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
						"""),_display_(/*229.8*/for(re <- recurso.recursoevaluadores) yield /*229.45*/{_display_(Seq[Any](format.raw/*229.46*/("""
							"""),_display_(/*230.9*/for(sol <- re.prorrogas) yield /*230.33*/{_display_(Seq[Any](format.raw/*230.34*/("""
								"""),format.raw/*231.9*/("""<tr>
									<td>"""),_display_(/*232.15*/sol/*232.18*/.recursoevaluador.evaluador.personal.nombreCompleto),format.raw/*232.69*/("""</td>
									<td>"""),_display_(/*233.15*/sol/*233.18*/.recursoevaluador.aspecto.descripcion),format.raw/*233.55*/("""</td>
									
									<td>"""),_display_(/*235.15*/sol/*235.18*/.auditinsert.format("dd/MM/YYYY hh:mm:ss")),format.raw/*235.60*/("""</td>
									<td>"""),_display_(/*236.15*/sol/*236.18*/.ndias),format.raw/*236.24*/("""</td>
									<td>"""),_display_(/*237.15*/if(sol.autorizado)/*237.33*/{_display_(Seq[Any](format.raw/*237.34*/("""Si""")))}/*237.37*/else/*237.41*/{_display_(Seq[Any](format.raw/*237.42*/("""No""")))}),format.raw/*237.45*/(""" """),format.raw/*237.46*/("""</td>
								</tr>
							""")))}),format.raw/*239.9*/("""
						""")))}),format.raw/*240.8*/("""
					"""),format.raw/*241.6*/("""</table>
				</td>
			</tr>
					
		""")))}),format.raw/*245.4*/("""
		


			
		"""),format.raw/*250.3*/("""<tr>
			<td colspan="6">
				<table class="table table-bordered tablaReporte">
					<tr>
						<td  colspan=10 class="etiqueta">Historial de estados</td>
					</tr>
					<tr>
						<td class="etiqueta">Estado</td><td class="etiqueta">Fecha</td>
					</tr>
					"""),_display_(/*259.7*/for(hs<-recurso.historialestados) yield /*259.40*/{_display_(Seq[Any](format.raw/*259.41*/("""
						"""),format.raw/*260.7*/("""<tr>
							<td>
								<div class="contenido">"""),_display_(/*262.33*/hs/*262.35*/.estado.descripcion),format.raw/*262.54*/("""</div>
							</td>
							<td>
								<div class="contenido">"""),_display_(/*265.33*/hs/*265.35*/.auditinsert.format("dd/MM/YYYY hh:mm:ss")),format.raw/*265.77*/("""</div>
							</td>			
						</tr>
					""")))}),format.raw/*268.7*/("""
				"""),format.raw/*269.5*/("""</table>
				
				<table class="table table-bordered tablaReporte">	
					"""),_display_(/*272.7*/if(recurso.historialestadoevaluaciones.size!=0)/*272.54*/{_display_(Seq[Any](format.raw/*272.55*/("""
						"""),format.raw/*273.7*/("""<tr>
							<td  colspan=10 class="etiqueta">Detalle evaluaciones</td>
						</tr>
						<tr>
							<td class="etiqueta">Estado</td><td class="etiqueta">Fecha</td><td class="etiqueta">Evaluador</td><td class="etiqueta">Aspecto</td>
						</tr>					
						"""),_display_(/*279.8*/for(hee<-recurso.historialestadoevaluaciones) yield /*279.53*/{_display_(Seq[Any](format.raw/*279.54*/("""
							"""),format.raw/*280.8*/("""<tr>
								<td>
									<div class="contenido">"""),_display_(/*282.34*/hee/*282.37*/.estado.descripcion),format.raw/*282.56*/("""</div>
								</td>
								<td>
									<div class="contenido">"""),_display_(/*285.34*/hee/*285.37*/.auditinsert.format("dd/MM/YYYY hh:mm:ss")),format.raw/*285.79*/("""</div>
								</td>
								<td>
									<div class="contenido">"""),_display_(/*288.34*/hee/*288.37*/.recursoevaluador.evaluador.personal.nombreCompleto),format.raw/*288.88*/("""</div>
								</td>
								<td>
									<div class="contenido">"""),_display_(/*291.34*/hee/*291.37*/.recursoevaluador.aspecto.descripcion),format.raw/*291.74*/("""</div>
								</td>								
							</tr>						
						""")))}),format.raw/*294.8*/("""
					""")))}),format.raw/*295.7*/("""
				"""),format.raw/*296.5*/("""</table>
				
				<table class="table table-bordered tablaReporte">	
					"""),_display_(/*299.7*/if(recurso.historialestadoencuesta.size!=0)/*299.50*/{_display_(Seq[Any](format.raw/*299.51*/("""
						"""),format.raw/*300.7*/("""<tr>
							<td  colspan=10 class="etiqueta">Detalle encuestas</td>
						</tr>
						<tr>
							<td class="etiqueta">Estado</td><td class="etiqueta">Fecha</td>
						</tr>					
						"""),_display_(/*306.8*/for(heen<-recurso.historialestadoencuesta) yield /*306.50*/{_display_(Seq[Any](format.raw/*306.51*/("""
							"""),format.raw/*307.8*/("""<tr>
								<td>
									<div class="contenido">"""),_display_(/*309.34*/heen/*309.38*/.estado.descripcion),format.raw/*309.57*/("""</div>
								</td>
								<td>
									<div class="contenido">"""),_display_(/*312.34*/heen/*312.38*/.auditinsert.format("dd/MM/YYYY hh:mm:ss")),format.raw/*312.80*/("""</div>
								</td>
							</tr>						
						""")))}),format.raw/*315.8*/("""
					""")))}),format.raw/*316.7*/("""
				"""),format.raw/*317.5*/("""</table>
			</td>
		</tr>
		
		
		
				
	</table>
	

	

""")))}),format.raw/*329.2*/("""
"""),format.raw/*330.1*/("""<script type="text/javascript">
	$( document ).ready(function() """),format.raw/*331.33*/("""{"""),format.raw/*331.34*/("""	
		"""),format.raw/*332.3*/("""if ( $("#tablaSolProrroga tr").length != 2   )"""),format.raw/*332.49*/("""{"""),format.raw/*332.50*/("""
			"""),format.raw/*333.4*/("""$("#renglonSolProrroga").show();
		"""),format.raw/*334.3*/("""}"""),format.raw/*334.4*/(""" """),format.raw/*334.5*/("""else """),format.raw/*334.10*/("""{"""),format.raw/*334.11*/("""
			"""),format.raw/*335.4*/("""$("#renglonSolProrroga").hide();
		"""),format.raw/*336.3*/("""}"""),format.raw/*336.4*/("""
	"""),format.raw/*337.2*/("""}"""),format.raw/*337.3*/(""");


	$("#tablaPalabras tbody td").each(function (index) """),format.raw/*340.53*/("""{"""),format.raw/*340.54*/("""
	 	"""),format.raw/*341.4*/("""if ((index % 5) == 0) """),format.raw/*341.26*/("""{"""),format.raw/*341.27*/(""" 
	 		"""),format.raw/*342.5*/("""$("#tablaPalabras tbody").append($('<tr>')); 
	 	"""),format.raw/*343.4*/("""}"""),format.raw/*343.5*/(""" 
	 	"""),format.raw/*344.4*/("""$("#tablaPalabras tbody tr").last().append($(this)); 
	 """),format.raw/*345.3*/("""}"""),format.raw/*345.4*/(""");
	
	
	"""),_display_(/*348.3*/if(recurso.estado.id == 1L)/*348.30*/{_display_(Seq[Any](format.raw/*348.31*/("""
		"""),format.raw/*349.3*/("""$("#alertEstado").removeClass("alert alert-default").addClass("alert alert-info").html( $("#alertEstado").html()+   " Reingrese mas tarde.");;
	""")))}),format.raw/*350.3*/("""
	"""),_display_(/*351.3*/if(recurso.estado.id == 2)/*351.29*/{_display_(Seq[Any](format.raw/*351.30*/("""		
		"""),format.raw/*352.3*/("""$("#alertEstado").removeClass("alert alert-default").addClass("alert alert-warning").html( $("#alertEstado").html()+   " Corrija las observaciones indicadas y envíe.");
	""")))}),format.raw/*353.3*/("""
	"""),_display_(/*354.3*/if(recurso.estado.id == 3L)/*354.30*/{_display_(Seq[Any](format.raw/*354.31*/("""
		"""),format.raw/*355.3*/("""$("#alertEstado").removeClass("alert alert-default").addClass("alert alert-success").html( $("#alertEstado").html()+   " Toda su información esta bien, los evaluadores procederan a revisar el contenido, reingrese mas tarde.");
	""")))}),format.raw/*356.3*/("""
	
	

	
	
"""),format.raw/*362.1*/("""</script>


"""))}
  }

  def render(recurso:Recurso,modalidad:List[Modalidad],version:List[Version],fe:List[Formatoentrega]): play.twirl.api.HtmlFormat.Appendable = apply(recurso,modalidad,version,fe)

  def f:((Recurso,List[Modalidad],List[Version],List[Formatoentrega]) => play.twirl.api.HtmlFormat.Appendable) = (recurso,modalidad,version,fe) => apply(recurso,modalidad,version,fe)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Reporte/reporteEvaluacion.scala.html
                  HASH: 83f8281c19e49ccdd989cf2c962b7b3a3924630c
                  MATRIX: 795->1|976->94|1006->98|1077->143|1091->149|1148->186|1181->194|1192->198|1230->200|1258->202|1440->357|1456->364|1484->371|1610->470|1626->477|1659->488|1804->606|1820->613|1869->640|2009->753|2025->760|2076->789|2226->912|2242->919|2287->942|2431->1059|2447->1066|2481->1079|2598->1169|2682->1231|2804->1326|2820->1333|2850->1342|2974->1439|2990->1446|3045->1479|3160->1567|3176->1574|3217->1594|3255->1606|3299->1641|3338->1642|3371->1648|3472->1722|3488->1729|3553->1772|3595->1784|3626->1788|3741->1876|3757->1883|3806->1910|3844->1922|3887->1956|3926->1957|3959->1964|3975->1971|4015->1990|4051->1996|4082->2000|4128->2020|4164->2047|4203->2048|4234->2052|4345->2136|4361->2143|4386->2147|4438->2173|4486->2205|4526->2207|4558->2212|4654->2281|4665->2283|4694->2291|4821->2391|4832->2393|4862->2402|4918->2428|4949->2432|4988->2441|5020->2446|5136->2535|5152->2542|5182->2551|5477->2820|5525->2852|5565->2854|5601->2863|5666->2901|5677->2903|5710->2915|5773->2948|5807->2955|6256->3377|6299->3403|6340->3405|6376->3413|6455->3464|6467->3466|6496->3473|6526->3475|6538->3477|6568->3485|6599->3488|6611->3490|6641->3498|6736->3565|6748->3567|6795->3592|6840->3609|6877->3636|6917->3637|6957->3648|7009->3672|7021->3674|7055->3686|7104->3703|7141->3712|7198->3741|7229->3762|7269->3763|7309->3774|7361->3798|7373->3800|7411->3816|7460->3833|7504->3849|7561->3878|7592->3899|7632->3900|7674->3913|7726->3937|7738->3939|7773->3952|7824->3971|7861->3980|7922->4010|7956->4016|8200->4233|8246->4262|8287->4264|8322->4271|8423->4344|8435->4346|8460->4349|8491->4352|8503->4354|8539->4368|8623->4424|8635->4426|8683->4452|8757->4495|8791->4501|9050->4732|9068->4739|9133->4781|9265->4885|9282->4892|9324->4911|9422->4982|9458->5008|9498->5009|9529->5012|9721->5176|9738->5183|9774->5197|9881->5276|9898->5283|9933->5296|10020->5352|10052->5357|10095->5390|10135->5391|10166->5394|10358->5558|10375->5565|10434->5601|10465->5602|10497->5605|10515->5612|10574->5648|10605->5649|10637->5652|10655->5659|10723->5704|10769->5723|10824->5768|10864->5769|10900->5777|10999->5848|11016->5855|11077->5893|11133->5918|11173->5930|11247->5973|11279->5978|11329->6018|11369->6019|11401->6023|11645->6240|11699->6277|11739->6278|11775->6286|11855->6338|11867->6340|11923->6374|11999->6422|12011->6424|12053->6444|12116->6476|12150->6482|12747->7052|12801->7089|12841->7090|12877->7099|12918->7123|12958->7124|12995->7133|13042->7152|13055->7155|13128->7206|13176->7226|13189->7229|13248->7266|13306->7296|13319->7299|13383->7341|13431->7361|13444->7364|13472->7370|13520->7390|13548->7408|13588->7409|13611->7412|13625->7416|13665->7417|13700->7420|13730->7421|13789->7449|13828->7457|13862->7463|13930->7500|13970->7512|14259->7774|14309->7807|14349->7808|14384->7815|14461->7864|14473->7866|14514->7885|14606->7949|14618->7951|14682->7993|14754->8034|14787->8039|14889->8114|14946->8161|14986->8162|15021->8169|15305->8426|15367->8471|15407->8472|15443->8480|15522->8531|15535->8534|15576->8553|15671->8620|15684->8623|15748->8665|15843->8732|15856->8735|15929->8786|16024->8853|16037->8856|16096->8893|16182->8948|16220->8955|16253->8960|16355->9035|16408->9078|16448->9079|16483->9086|16696->9272|16755->9314|16795->9315|16831->9323|16910->9374|16924->9378|16965->9397|17060->9464|17074->9468|17138->9510|17216->9557|17254->9564|17287->9569|17375->9626|17404->9627|17497->9691|17527->9692|17559->9696|17634->9742|17664->9743|17696->9747|17759->9782|17788->9783|17817->9784|17851->9789|17881->9790|17913->9794|17976->9829|18005->9830|18035->9832|18064->9833|18150->9890|18180->9891|18212->9895|18263->9917|18293->9918|18327->9924|18404->9973|18433->9974|18466->9979|18550->10035|18579->10036|18615->10045|18652->10072|18692->10073|18723->10076|18899->10221|18929->10224|18965->10250|19005->10251|19038->10256|19240->10427|19270->10430|19307->10457|19347->10458|19378->10461|19638->10690|19676->10700
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|33->5|33->5|33->5|35->7|38->10|38->10|38->10|39->11|39->11|39->11|43->15|43->15|43->15|46->18|46->18|46->18|51->23|51->23|51->23|56->28|56->28|56->28|59->31|59->31|64->36|64->36|64->36|67->39|67->39|67->39|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|72->44|73->45|74->46|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|79->51|80->52|82->54|82->54|82->54|83->55|85->57|85->57|85->57|87->59|87->59|87->59|88->60|89->61|89->61|89->61|92->64|92->64|92->64|94->66|95->67|96->68|97->69|99->71|99->71|99->71|112->84|112->84|112->84|113->85|114->86|114->86|114->86|116->88|117->89|135->107|135->107|135->107|136->108|138->110|138->110|138->110|138->110|138->110|138->110|138->110|138->110|138->110|141->113|141->113|141->113|142->114|142->114|142->114|143->115|143->115|143->115|143->115|144->116|145->117|147->119|147->119|147->119|148->120|148->120|148->120|148->120|149->121|150->122|152->124|152->124|152->124|153->125|153->125|153->125|153->125|154->126|155->127|157->129|158->130|169->141|169->141|169->141|170->142|172->144|172->144|172->144|172->144|172->144|172->144|174->146|174->146|174->146|177->149|178->150|187->159|187->159|187->159|190->162|190->162|190->162|197->169|197->169|197->169|198->170|202->174|202->174|202->174|203->175|203->175|203->175|208->180|210->182|210->182|210->182|211->183|215->187|215->187|215->187|215->187|215->187|215->187|215->187|215->187|215->187|215->187|215->187|216->188|216->188|216->188|217->189|217->189|217->189|217->189|218->190|219->191|223->195|225->197|225->197|225->197|226->198|233->205|233->205|233->205|234->206|235->207|235->207|235->207|236->208|236->208|236->208|238->210|239->211|257->229|257->229|257->229|258->230|258->230|258->230|259->231|260->232|260->232|260->232|261->233|261->233|261->233|263->235|263->235|263->235|264->236|264->236|264->236|265->237|265->237|265->237|265->237|265->237|265->237|265->237|265->237|267->239|268->240|269->241|273->245|278->250|287->259|287->259|287->259|288->260|290->262|290->262|290->262|293->265|293->265|293->265|296->268|297->269|300->272|300->272|300->272|301->273|307->279|307->279|307->279|308->280|310->282|310->282|310->282|313->285|313->285|313->285|316->288|316->288|316->288|319->291|319->291|319->291|322->294|323->295|324->296|327->299|327->299|327->299|328->300|334->306|334->306|334->306|335->307|337->309|337->309|337->309|340->312|340->312|340->312|343->315|344->316|345->317|357->329|358->330|359->331|359->331|360->332|360->332|360->332|361->333|362->334|362->334|362->334|362->334|362->334|363->335|364->336|364->336|365->337|365->337|368->340|368->340|369->341|369->341|369->341|370->342|371->343|371->343|372->344|373->345|373->345|376->348|376->348|376->348|377->349|378->350|379->351|379->351|379->351|380->352|381->353|382->354|382->354|382->354|383->355|384->356|390->362
                  -- GENERATED --
              */
          