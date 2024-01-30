
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
object observaciones extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Long,Form[Recurso],Recurso,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, recursoForm: Form[Recurso], 
recurso: Recurso):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*2.18*/("""

"""),format.raw/*5.83*/("""

"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/(""" 
	"""),format.raw/*8.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Recursos</li>
					  <li><a href="/recursos/observarList">Solicitudes por revisar</a></li>
					  <li class="active">Agregar observaciones</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Agregar observaciones</h3>
		        </div>
			</div>	   
			<div class="row">
				<div class="col-lg-12">
				    """),_display_(/*25.10*/form(CSRF(routes.RecursoController.observacionessave()), 'id->"frmUno")/*25.81*/ {_display_(Seq[Any](format.raw/*25.83*/("""	    	    	
						"""),_display_(/*26.8*/masterForm(recursoForm, id, recurso)),format.raw/*26.44*/("""
				        """),format.raw/*27.13*/("""<div class="actions">
				            <a id ="btnForma" href="javascript:preValida()" class=" center-block btn primary btn-success btn-block btn-lg" style="width: 70%">Información correcta, validar y registrar</a>  	            
				        </div>			
				    """)))}),format.raw/*30.10*/("""
				"""),format.raw/*31.5*/("""</div>
			</div>
	</div>					  
    
""")))}),format.raw/*35.2*/("""


"""),format.raw/*38.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*39.15*/("""{"""),format.raw/*39.16*/("""
"""),format.raw/*40.1*/("""/* 		$('#elaboracion').datepicker("""),format.raw/*40.35*/("""{"""),format.raw/*40.36*/("""
		    """),format.raw/*41.7*/("""language: "es",
		    format: "dd/mm/yyyy",
			autoclose: true,
			todayBtn: true,
			todayHighlight: true			
		"""),format.raw/*46.3*/("""}"""),format.raw/*46.4*/(""");	 */
		
		
		$('#elaboracion').datetimepicker("""),format.raw/*49.36*/("""{"""),format.raw/*49.37*/("""
			 """),format.raw/*50.5*/("""locale: 'es',
			 format: 'L'
		"""),format.raw/*52.3*/("""}"""),format.raw/*52.4*/(""");	
		
		$("#elaboracion").prop("required", true);
		
		$("label[for='dirigidoa_id']:eq(1)").hide();
		leer();		
		quitarBotones();
		$("#ligaAgregarOtroAutor, #ligaAgregarOtraPalabra, #ligaAgregarDocto, [id^='btnQuitarDocto'], #btnQuitarAutor").hide();
		
		$("#alcancecurricularotro").parent().parent().toggle( $("#alcancecurricular_id option:selected").val()==99 );
		$("#formatoentregaotro").parent().toggle( $("input:radio[name='formatoentrega.id']:checked").val()==3 );
		$("#formatoentregaotro").parent().parent().toggle( $("input:radio[name='formatoentrega.id']:checked").val()==3 );
		
		
		
		$(':input').attr('disabled', true);	
	
		$(".observacion").prop("disabled",false);
		$(".btn-primary").attr("disabled",false);
		
		$('#elId').attr('disabled', false);
		
		$("[name*='btnObservacion_']").prop("disabled",false);
		$("[name*='btnObservacion_']").show();
		
		$("[name*='observacion_titulo']").change();

		$("#va_numcontrol").attr("readonly", false);
		$("#va_numcontrol").prop("disabled", false);		
		
		// Actualización, clave de control anterior
		if ( $("#version_id_2").prop("checked") == true   )"""),format.raw/*83.54*/("""{"""),format.raw/*83.55*/("""
			"""),format.raw/*84.4*/("""$("#divNumControl").show();
			$("#divVersion").show();
			$("#versionanterior_recursoanterior_id").attr("disabled",false);
		"""),format.raw/*87.3*/("""}"""),format.raw/*87.4*/("""
		"""),format.raw/*88.3*/("""if ( $("#version_id_1").prop("checked") == true   )"""),format.raw/*88.54*/("""{"""),format.raw/*88.55*/("""
			"""),format.raw/*89.4*/("""$("#divVersion").hide();
		"""),format.raw/*90.3*/("""}"""),format.raw/*90.4*/("""
		
		"""),format.raw/*92.3*/("""$("[name='btnObservacion_extra1'], [name='btnObservacion_va.numcontrol']").hide();
		
		$("[name*='btnObservacion_']").html("Agregar observación");
		// Observaciones
		"""),_display_(/*96.4*/if(recurso.observaciones.size > 0)/*96.38*/{_display_(Seq[Any](format.raw/*96.39*/(""" 
			"""),format.raw/*97.4*/("""$(".observacion").hide();

			// Muestra los campos de observaciones y habilita los correspondientes campos				
			"""),_display_(/*100.5*/for( (o,i)<-recurso.observaciones.zipWithIndex) yield /*100.52*/{_display_(Seq[Any](format.raw/*100.53*/("""			
				"""),format.raw/*101.5*/("""//Campos de observacion
				$("[name='observacion_"""),_display_(/*102.28*/o/*102.29*/.campo),format.raw/*102.35*/("""']").text('"""),_display_(/*102.47*/o/*102.48*/.observacion),format.raw/*102.60*/("""').show();
				$("[name='observacion_"""),_display_(/*103.28*/o/*103.29*/.campo),format.raw/*103.35*/("""']").addClass("alert-warning");
				
				$("[name='btnObservacion_"""),_display_(/*105.31*/o/*105.32*/.campo),format.raw/*105.38*/("""']").html('Quitar observación');
 				$("[name='btnObservacion_"""),_display_(/*106.32*/o/*106.33*/.campo),format.raw/*106.39*/("""']").removeClass("btn-primary").addClass("btn-danger");

			""")))}),format.raw/*108.5*/("""				
		""")))}),format.raw/*109.4*/("""			
		
		
		"""),format.raw/*112.3*/("""//Fecha elaboracion
	//	var fe =""""),_display_(/*113.15*/recursoForm/*113.26*/.field("elaboracion").value()),format.raw/*113.55*/(""""; 
		
		
		//console.log("fe:"+fe)
		//$('#elaboracion').datepicker('update', moment(fe,"YYYY-MM-DD").format("DD/MM/YYYY")  );			
		
		$("[name*='observacion_']").keyup();
	

	
	
		
	"""),format.raw/*125.2*/("""}"""),format.raw/*125.3*/(""");
	
	
	$( document ).on( "click", "[name*='btnObservacion_']", function() """),format.raw/*128.69*/("""{"""),format.raw/*128.70*/("""
		"""),format.raw/*129.3*/("""var nom = $(this).attr("name").substring(15);
		if (  $("[name='observacion_"+nom+"']").css("display") == "none"  )"""),format.raw/*130.70*/("""{"""),format.raw/*130.71*/("""
			"""),format.raw/*131.4*/("""$(this).html("Quitar observación");				   
			$(this).removeClass("btn-primary").addClass("btn-danger");
			$("[name='observacion_"+nom+"']").show();		
			
			$("[name='observacion_"+nom+"']").attr("readonly",false);
			$("[name='observacion_"+nom+"']").prop("disabled",false);
			
			$("[name='observacion_"+nom+"']").addClass("alert alert-warning");
			
		"""),format.raw/*140.3*/("""}"""),format.raw/*140.4*/(""" """),format.raw/*140.5*/("""else """),format.raw/*140.10*/("""{"""),format.raw/*140.11*/("""
			"""),format.raw/*141.4*/("""$(this).html("Agregar observación");
			$(this).removeClass("btn-danger").addClass("btn-primary");
			$("[name='observacion_"+nom+"']").val("").hide();
			$("[name='observacion_"+nom+"']").keydown();
			
			$("[name='observacion_"+nom+"']").attr("readonly",true);
			$("[name='observacion_"+nom+"']").prop("disabled",true);
			
			$("[name*='observacion_']").keyup();
		"""),format.raw/*150.3*/("""}"""),format.raw/*150.4*/("""			
	"""),format.raw/*151.2*/("""}"""),format.raw/*151.3*/(""");	
	
	
	$( document ).on( "keyup", "[name*='observacion_']", function() """),format.raw/*154.66*/("""{"""),format.raw/*154.67*/("""		
			"""),format.raw/*155.4*/("""var numObservaciones = 0;
			$("[name*='observacion_']").each(function()"""),format.raw/*156.47*/("""{"""),format.raw/*156.48*/("""
				"""),format.raw/*157.5*/("""if ( $(this).val().length !=0  )
					numObservaciones++;
			"""),format.raw/*159.4*/("""}"""),format.raw/*159.5*/(""");
			if ( numObservaciones ==0   )
				$("#btnForma").html("Información correcta, validar y registrar").addClass("btn-success").removeClass("btn-primary");
			else
				$("#btnForma").html("Grabar observaciones").addClass("btn-primary").removeClass("btn-success");
				
	"""),format.raw/*165.2*/("""}"""),format.raw/*165.3*/(""");		
	
	
		
	var preValida = function()"""),format.raw/*169.28*/("""{"""),format.raw/*169.29*/("""
		 	"""),format.raw/*170.5*/("""var numErrores = 0;
			$("input[name*='documento.nombrearchivo']").each(function(i)"""),format.raw/*171.64*/("""{"""),format.raw/*171.65*/(""" 
				"""),format.raw/*172.5*/("""$(this).attr("name", 'documento.nombrearchivo'+i);			
			"""),format.raw/*173.4*/("""}"""),format.raw/*173.5*/(""");		
			$("select[name*='documento.tipodocumento']").each(function(i)"""),format.raw/*174.65*/("""{"""),format.raw/*174.66*/(""" 
				"""),format.raw/*175.5*/("""$(this).prop("name", 'documento.tipodocumento'+i);				
			"""),format.raw/*176.4*/("""}"""),format.raw/*176.5*/(""");			 
		 
		   if ( $("version_id_2").attr("checked") == true)"""),format.raw/*178.53*/("""{"""),format.raw/*178.54*/("""
				"""),format.raw/*179.5*/("""var ant = $('#va_numcontrol').val();			
				if(ant.length == 0 )"""),format.raw/*180.25*/("""{"""),format.raw/*180.26*/("""
					"""),format.raw/*181.6*/("""alert("Debe proporcionar la clave de control anterior" );
					numErrores++;
				"""),format.raw/*183.5*/("""}"""),format.raw/*183.6*/(""" """),format.raw/*183.7*/("""else 
				"""),format.raw/*184.5*/("""{"""),format.raw/*184.6*/("""
					"""),format.raw/*185.6*/("""$.ajax("""),format.raw/*185.13*/("""{"""),format.raw/*185.14*/("""
					  """),format.raw/*186.8*/("""method: "GET",
					  async: false,
					  url: "/buscarNC/"+ant,
					   dataType: "json"			
					"""),format.raw/*190.6*/("""}"""),format.raw/*190.7*/(""")
					  .success(function( data ) """),format.raw/*191.34*/("""{"""),format.raw/*191.35*/(""" 		  
					  	"""),format.raw/*192.9*/("""if ( (data.estado == "error"))"""),format.raw/*192.39*/("""{"""),format.raw/*192.40*/("""
					  		"""),format.raw/*193.10*/("""alert("La clave de control anterior no existe!!!" );
					  		numErrores++;
					  	"""),format.raw/*195.9*/("""}"""),format.raw/*195.10*/("""
					  """),format.raw/*196.8*/("""}"""),format.raw/*196.9*/(""")		  
					  .error(function(data)"""),format.raw/*197.29*/("""{"""),format.raw/*197.30*/("""
					  	"""),format.raw/*198.9*/("""alert('Error ajax en la búsqueda de la clave de control anterior');
					  	numErrores++;
					  """),format.raw/*200.8*/("""}"""),format.raw/*200.9*/(""");	
				"""),format.raw/*201.5*/("""}"""),format.raw/*201.6*/("""
		   """),format.raw/*202.6*/("""}"""),format.raw/*202.7*/("""
		"""),format.raw/*203.3*/("""if (numErrores == 0) 
		
			var x = $(".error");
		if (x.length != 0)"""),format.raw/*206.21*/("""{"""),format.raw/*206.22*/("""
			"""),format.raw/*207.4*/("""alert("Algunas observaciones tienen errores, se aceptan hasta 600 caracteres para cada observación");
			return false;
		"""),format.raw/*209.3*/("""}"""),format.raw/*209.4*/(""" """),format.raw/*209.5*/("""else """),format.raw/*209.10*/("""{"""),format.raw/*209.11*/("""
	 		"""),format.raw/*210.5*/("""$('#frmUno').submit();
	 	"""),format.raw/*211.4*/("""}"""),format.raw/*211.5*/("""
	"""),format.raw/*212.2*/("""}"""),format.raw/*212.3*/("""	
		
	
	 """),format.raw/*215.3*/("""var leer = function()"""),format.raw/*215.24*/("""{"""),format.raw/*215.25*/("""
	"""),format.raw/*216.2*/("""//	 console.dir(""""),_display_(/*216.20*/recursoForm/*216.31*/.field("elaboracion").value()),format.raw/*216.60*/("""")
		 console.log("Num documentos """),_display_(/*217.33*/recurso/*217.40*/.documentos.size),format.raw/*217.56*/("""")
		 	$("input[name='modalidad.id'][value="""),_display_(/*218.42*/recurso/*218.49*/.modalidad.id),format.raw/*218.62*/("""]").prop("checked", true);
			"""),_display_(/*219.5*/if(recurso.estado.id == 1L)/*219.32*/{_display_(Seq[Any](format.raw/*219.33*/("""
				"""),format.raw/*220.5*/("""$("#alertEstado").removeClass("alert alert-default").addClass("alert alert-info").html( $("#alertEstado").html()+   " Reingrese mas tarde.");;
			""")))}),format.raw/*221.5*/("""
			"""),_display_(/*222.5*/if(recurso.estado.id == 2)/*222.31*/{_display_(Seq[Any](format.raw/*222.32*/("""		
				"""),format.raw/*223.5*/("""$("#alertEstado").removeClass("alert alert-default").addClass("alert alert-warning").html( $("#alertEstado").html()+   " Corrija las observaciones indicadas y envíe.");
			""")))}),format.raw/*224.5*/("""
			"""),_display_(/*225.5*/if(recurso.estado.id == 3L)/*225.32*/{_display_(Seq[Any](format.raw/*225.33*/("""
				"""),format.raw/*226.5*/("""$("#alertEstado").removeClass("alert alert-default").addClass("alert alert-success").html( $("#alertEstado").html()+   " Toda su información esta bien, los evaluadores procederan a revisar el contenido, reingrese mas tarde.");;
			""")))}),format.raw/*227.5*/("""
			"""),_display_(/*228.5*/if(recurso.autores.isEmpty)/*228.32*/{_display_(Seq[Any](format.raw/*228.33*/("""
				""")))}/*229.7*/else/*229.13*/{_display_(Seq[Any](format.raw/*229.14*/("""
				"""),format.raw/*230.5*/("""i=0;
				"""),_display_(/*231.6*/for(a <- recurso.autores) yield /*231.31*/{_display_(Seq[Any](format.raw/*231.32*/("""		
				  """),format.raw/*232.7*/("""agregarAutor();
				  $("input[name='autor.nombre"+i+"']").val(""""),_display_(/*233.50*/a/*233.51*/.nombre),format.raw/*233.58*/("""");
				  $("input[name='autor.paterno"+i+"']").val(""""),_display_(/*234.51*/a/*234.52*/.paterno),format.raw/*234.60*/("""");
				  $("input[name='autor.materno"+i+"']").val(""""),_display_(/*235.51*/a/*235.52*/.materno),format.raw/*235.60*/("""");
				  """),_display_(/*236.8*/if(a.correo != null)/*236.28*/{_display_(Seq[Any](format.raw/*236.29*/("""
				  	"""),format.raw/*237.8*/("""$("input[name='autor.correo"+i+"']").val(""""),_display_(/*237.51*/a/*237.52*/.correo.email),format.raw/*237.65*/("""");
				  	$("input[name='autor.telefono"+i+"']").val(""""),_display_(/*238.53*/a/*238.54*/.correo.telefono),format.raw/*238.70*/("""");
				  """)))}),format.raw/*239.8*/("""
				  """),format.raw/*240.7*/("""$("select[name='autor.autorfuncion"+i+"']").val(""""),_display_(/*240.57*/a/*240.58*/.autorfuncion.id),format.raw/*240.74*/("""");
				  i++;
				""")))}),format.raw/*242.6*/(""" 
			""")))}),format.raw/*243.5*/("""	
				
			"""),format.raw/*245.4*/("""if (formatoentrega_id_3 != null)
				if (formatoentrega_id_3.checked == false)
					$('#formatoentregaotro').parent().hide();
				else
					$('#formatoentregaotro').parent().show();
				
			$("#ligaAgregarOtroAutor, #btnQuitarAutor").hide();	
			

			// Documentos
			"""),_display_(/*255.5*/if( recurso.documentos.isEmpty)/*255.36*/{_display_(Seq[Any](format.raw/*255.37*/("""
			""")))}/*256.6*/else/*256.11*/{_display_(Seq[Any](format.raw/*256.12*/("""		
				"""),_display_(/*257.6*/for((d,ii) <- recurso.documentos.sortBy( x=>(x.tipodocumento.id, x.tipodocumento.obligatorio)).zipWithIndex) yield /*257.114*/{_display_(Seq[Any](format.raw/*257.115*/("""
				"""),format.raw/*258.5*/("""//  console.log("ii """),_display_(/*258.26*/(ii)),format.raw/*258.30*/("""  """),format.raw/*258.32*/("""estado  """),_display_(/*258.41*/recurso/*258.48*/.estado.id),format.raw/*258.58*/("""")					
				  agregarDocumento2();
				  $("select[name='documento.tipodocumento"""),_display_(/*260.47*/(ii)),format.raw/*260.51*/("""']").val(""""),_display_(/*260.62*/d/*260.63*/.tipodocumento.id),format.raw/*260.80*/("""");			 
				  """),_display_(/*261.8*/if(recurso.estado.id == 1  || recurso.estado.id == 2 || recurso.estado.id == 105)/*261.89*/{_display_(Seq[Any](format.raw/*261.90*/(""" 
					"""),format.raw/*262.6*/("""//  console.log("na"""),_display_(/*262.26*/(ii)),format.raw/*262.30*/(""" """),_display_(/*262.32*/d/*262.33*/.nombrearchivo),format.raw/*262.47*/("""")
				 	document.getElementById("documento.nombrearchivo"""),_display_(/*263.56*/(ii)),format.raw/*263.60*/("""").style.display='inline';				 	
				 	$("#na"""),_display_(/*264.14*/(ii)),format.raw/*264.18*/("""").html("<a href='/documento/verAn/"""),_display_(/*264.54*/d/*264.55*/.id),format.raw/*264.58*/("""' target='_blank'>"""),_display_(/*264.77*/d/*264.78*/.nombrearchivo),format.raw/*264.92*/("""</a>").show();
				 	$("#ta"""),_display_(/*265.14*/(ii)),format.raw/*265.18*/("""").html(""""),_display_(/*265.28*/d/*265.29*/.tipodocumento.descripcion),format.raw/*265.55*/("""");			 	
				 	$("#docId"""),_display_(/*266.17*/(ii)),format.raw/*266.21*/("""").html(""""),_display_(/*266.31*/d/*266.32*/.id),format.raw/*266.35*/("""").hide();
				 	$("#este").append($('<input type="text" name="aux2">').val("doctoAgregado"));			 	
				  """)))}),format.raw/*268.8*/("""
				""")))}),format.raw/*269.6*/(""" 
				
				"""),format.raw/*271.5*/("""$("input[name^='documento.nombrearchivo']").hide();
				$("select[name^='documento.tipodocumento']").hide();
				$("[id^='btnQuitarDocto'], #ligaAgregarDocto").hide();
		           // El select de tipo de documento no debe de llevar opciones de observación, solo el select de documento
	           // $("button[name^='btnObservacion_documento.tipodocumento']").hide();
			""")))}),format.raw/*276.5*/("""

			"""),format.raw/*278.4*/("""$("input[name='aux2']").hide();
			
				// Si el recurso esta en web
				"""),_display_(/*281.6*/if(recurso.recursosenweb.isEmpty)/*281.39*/{_display_(Seq[Any](format.raw/*281.40*/("""				
				""")))}/*282.7*/else/*282.12*/{_display_(Seq[Any](format.raw/*282.13*/("""
					"""),_display_(/*283.7*/for(tmp <- recurso.recursosenweb) yield /*283.40*/{_display_(Seq[Any](format.raw/*283.41*/("""
						"""),format.raw/*284.7*/("""$('#webUsuario').val(""""),_display_(/*284.30*/tmp/*284.33*/.usuario),format.raw/*284.41*/("""");
						$('#webPassword').val(""""),_display_(/*285.31*/tmp/*285.34*/.password),format.raw/*285.43*/("""");
					""")))}),format.raw/*286.7*/("""
				""")))}),format.raw/*287.6*/("""			
				
				"""),format.raw/*289.5*/("""// Observaciones		
				"""),_display_(/*290.6*/if(recurso.observaciones.size > 0)/*290.40*/{_display_(Seq[Any](format.raw/*290.41*/(""" 
					"""),format.raw/*291.6*/("""$(".observacion").hide();
					$(".observacion").attr("readonly",true);
					$("input[type='radio'], input[type='date'], input[type='text'], input[type='email'], input[type='tel'], input[type='file'], input[type='url'], textarea, select").attr("readonly",true);
					$("input[type='radio'], input[type='date'], input[type='text'], input[type='email'], input[type='tel'], input[type='file'], input[type='url'], textarea, select").prop('disabled', true);

					// Muestra los campos de observaciones y habilita los correspondientes campos
					
					"""),_display_(/*298.7*/for( (o,i)<-recurso.observaciones.zipWithIndex) yield /*298.54*/{_display_(Seq[Any](format.raw/*298.55*/("""						
						"""),format.raw/*299.7*/("""// Campos
						$("[name='"""),_display_(/*300.18*/o/*300.19*/.campo),format.raw/*300.25*/("""']").attr("readonly",false);
						$("[name='"""),_display_(/*301.18*/o/*301.19*/.campo),format.raw/*301.25*/("""']").prop("disabled",false);
						
						//Campos de observacion
						$("[name='observacion_"""),_display_(/*304.30*/o/*304.31*/.campo),format.raw/*304.37*/("""']").text('Observacion realizada: """),_display_(/*304.72*/o/*304.73*/.observacion),format.raw/*304.85*/("""').addClass("alert alert-warning").show();
						$("[name='observacion_"""),_display_(/*305.30*/o/*305.31*/.campo),format.raw/*305.37*/("""']").css('margin-bottom',"0px");
					
						$("[name='btnObservacion_"""),_display_(/*307.33*/o/*307.34*/.campo),format.raw/*307.40*/("""']").show();
						
						
						// Si se trata de coordinador, permitir escribir observaciones
						console.log("cveRoles",""""),_display_(/*311.32*/session/*311.39*/.get("cvesRoles")),format.raw/*311.56*/("""")
						 """),_display_(/*312.9*/if(session.get("cvesRoles").contains("3 "))/*312.52*/{_display_(Seq[Any](format.raw/*312.53*/("""
							 """),format.raw/*313.9*/("""$("[name='observacion_"""),_display_(/*313.32*/o/*313.33*/.campo),format.raw/*313.39*/("""']").attr("readonly",false);
							 $("[name='observacion_"""),_display_(/*314.32*/o/*314.33*/.campo),format.raw/*314.39*/("""']").prop("disabled",false);
						 """)))}),format.raw/*315.9*/("""
						
						"""),format.raw/*317.7*/("""$( document ).on( "click", "[name='btnObservacion_"""),_display_(/*317.58*/o/*317.59*/.campo),format.raw/*317.65*/("""']", function() """),format.raw/*317.81*/("""{"""),format.raw/*317.82*/("""
							"""),format.raw/*318.8*/("""$("[name='"""),_display_(/*318.19*/o/*318.20*/.campo),format.raw/*318.26*/("""']").focus();
						"""),format.raw/*319.7*/("""}"""),format.raw/*319.8*/(""");
						
						//Si se trata de un campo de autores, habilitar agregar y quitar autores
						if ( """),_display_(/*322.13*/o/*322.14*/.campo.startsWith("autor.")),format.raw/*322.41*/(""" """),format.raw/*322.42*/(""")"""),format.raw/*322.43*/("""{"""),format.raw/*322.44*/("""
							"""),format.raw/*323.8*/("""$("#ligaAgregarOtroAutor, #btnQuitarAutor").show();
						"""),format.raw/*324.7*/("""}"""),format.raw/*324.8*/("""
						
						"""),format.raw/*326.7*/("""//Si se trata de un campo de documentos, habilitar agregar y quitar documentos
						if ( """),_display_(/*327.13*/o/*327.14*/.campo.startsWith("documento.")),format.raw/*327.45*/(""" """),format.raw/*327.46*/(""")"""),format.raw/*327.47*/("""{"""),format.raw/*327.48*/("""
							"""),format.raw/*328.8*/("""var num = """"),_display_(/*328.20*/o/*328.21*/.campo),format.raw/*328.27*/("""".match(/\d/);
							$("[id='btnQuitarDocto"+""""),_display_(/*329.34*/o/*329.35*/.campo),format.raw/*329.41*/("""".substring(""""),_display_(/*329.55*/o/*329.56*/.campo),format.raw/*329.62*/("""".indexOf(num))+"']")
							    .prop('value','Eliminar y subir otro archivo')
							    .addClass('btn btn-primary')
							    .attr("onclick",
							    	    
							    	    'javascript:prueba(     """"),_display_(/*334.43*/o/*334.44*/.campo),format.raw/*334.50*/("""".substring(""""),_display_(/*334.64*/o/*334.65*/.campo),format.raw/*334.71*/("""".indexOf('+num+'))  )'  )
							    
							    .show();
							
							$("#documento.nombrearchivo"+""""),_display_(/*338.39*/o/*338.40*/.campo),format.raw/*338.46*/("""".substring(""""),_display_(/*338.60*/o/*338.61*/.campo),format.raw/*338.67*/("""".indexOf(num))).css("display","inline");
							
							
							
						//	$("#documento.nombrearchivo1").show();
						"""),format.raw/*343.7*/("""}"""),format.raw/*343.8*/("""	
					""")))}),format.raw/*344.7*/("""
				""")))}),format.raw/*345.6*/("""
			
				"""),format.raw/*347.5*/("""// Recurso: actualizado, Version anterior
				"""),_display_(/*348.6*/if(recurso.version.id == 2L)/*348.34*/{_display_(Seq[Any](format.raw/*348.35*/("""
					"""),format.raw/*349.6*/("""$("#divVersion").show();
					$("#versionanterior_recursoanterior_id").show();
					"""),_display_(/*351.7*/if(recurso.versionanterior == null)/*351.42*/{_display_(Seq[Any](format.raw/*351.43*/("""	
							"""),format.raw/*352.8*/("""$("#extra1_N").prop("checked",true);	
					""")))}/*353.8*/else/*353.13*/{_display_(Seq[Any](format.raw/*353.14*/("""
						"""),format.raw/*354.7*/("""$("#extra1_S").prop("checked",true);
						$("#va.numcontrol").val("""),_display_(/*355.32*/recurso/*355.39*/.versionanterior.recursoanterior.id),format.raw/*355.74*/(""");
					""")))}),format.raw/*356.7*/("""
				""")))}),format.raw/*357.6*/("""
				
				
				"""),format.raw/*360.5*/("""// Dirigido a
				"""),_display_(/*361.6*/for(da <- recurso.dirigidoa) yield /*361.34*/{_display_(Seq[Any](format.raw/*361.35*/("""
					"""),format.raw/*362.6*/("""$("#dirigidoa_id_"""),_display_(/*362.24*/(da.dirigidoa.id)),format.raw/*362.41*/("""").attr("checked", true);
				""")))}),format.raw/*363.6*/("""
				
				"""),format.raw/*365.5*/("""//Fecha elaboracion
				var fe =""""),_display_(/*366.15*/recursoForm/*366.26*/.field("elaboracion").value()),format.raw/*366.55*/(""""; 
			//	console.log("fe.:"+fe)
			//	console.log( moment(fe,"YYYY-MM-DD").format("DD/MM/YYYY")  )
				//$('#elaboracion').datepicker('update', moment(fe,"YYYY-MM-DD").format("DD/MM/YYYY")  );
				
				$('#elaboracion').val(  moment(fe,"YYYY-MM-DD").format("DD/MM/YYYY")  );
				
				$("#alcancecurricularotro, label[for='alcancecurricularotro']").toggle( $("#alcancecurricular_id").val()==99  );
				
				
				
				$("#documento.nombrearchivo1").css("display","inline");		
				$("#documento.nombrearchivo1").show();
				
				$("#unidadacademica_id option").remove();
				$("#unidadacademica_id").append($("<option></option>").attr("value", """),_display_(/*381.75*/recurso/*381.82*/.unidadacademica.id),format.raw/*381.101*/(""").text(""""),_display_(/*381.110*/recurso/*381.117*/.unidadacademica.nombre),format.raw/*381.140*/("""").attr("selected", true));
				
			"""),format.raw/*383.4*/("""}"""),format.raw/*383.5*/("""	
	
	
	 """),format.raw/*386.3*/("""function leerAnterior()"""),format.raw/*386.26*/("""{"""),format.raw/*386.27*/("""	
		    """),format.raw/*387.7*/("""$("input[name='modalidad.id'][value="""),_display_(/*387.44*/recurso/*387.51*/.modalidad.id),format.raw/*387.64*/("""]").prop("checked", true);
		 	"""),_display_(/*388.6*/if(!recurso.dirigidoa.isEmpty)/*388.36*/{_display_(Seq[Any](format.raw/*388.37*/("""	 		
		 		"""),_display_(/*389.7*/for(rd <- recurso.dirigidoa) yield /*389.35*/{_display_(Seq[Any](format.raw/*389.36*/("""
		 			"""),format.raw/*390.7*/("""$("#dirigidoa_id_"""),_display_(/*390.25*/(rd.dirigidoa.id)),format.raw/*390.42*/("""").attr("checked",true);
		 		""")))}),format.raw/*391.7*/("""
		 	""")))}),format.raw/*392.6*/("""
		 	"""),_display_(/*393.6*/if(recurso.recursosenweb.isEmpty)/*393.39*/{_display_(Seq[Any](format.raw/*393.40*/("""		 		
		 	""")))}/*394.7*/else/*394.12*/{_display_(Seq[Any](format.raw/*394.13*/("""
		 		"""),_display_(/*395.7*/for(rw <- recurso.recursosenweb) yield /*395.39*/{_display_(Seq[Any](format.raw/*395.40*/("""		
		 			"""),format.raw/*396.7*/("""$("#webUsuario").val(""""),_display_(/*396.30*/rw/*396.32*/.usuario),format.raw/*396.40*/("""");
		 			$("#webPassword").val(""""),_display_(/*397.31*/rw/*397.33*/.password),format.raw/*397.42*/("""");
		 		""")))}),format.raw/*398.7*/("""
		 	""")))}),format.raw/*399.6*/("""
			"""),_display_(/*400.5*/if(recurso.autores.isEmpty)/*400.32*/{_display_(Seq[Any](format.raw/*400.33*/("""
			""")))}/*401.6*/else/*401.11*/{_display_(Seq[Any](format.raw/*401.12*/("""
				"""),format.raw/*402.5*/("""i=0;
				"""),_display_(/*403.6*/for(a <- recurso.autores) yield /*403.31*/{_display_(Seq[Any](format.raw/*403.32*/("""		
				  """),format.raw/*404.7*/("""agregarAutor();
				  $("input[name='autor.nombre"+i+"']").val(""""),_display_(/*405.50*/a/*405.51*/.nombre),format.raw/*405.58*/("""");
				  $("input[name='autor.paterno"+i+"']").val(""""),_display_(/*406.51*/a/*406.52*/.paterno),format.raw/*406.60*/("""");
				  $("input[name='autor.materno"+i+"']").val(""""),_display_(/*407.51*/a/*407.52*/.materno),format.raw/*407.60*/("""");
				  """),_display_(/*408.8*/if(a.correo != null)/*408.28*/{_display_(Seq[Any](format.raw/*408.29*/("""
					  """),format.raw/*409.8*/("""$("input[name='autor.correo0']").val(""""),_display_(/*409.47*/a/*409.48*/.correo.email),format.raw/*409.61*/("""");
					  $("input[name='autor.telefono0']").val(""""),_display_(/*410.49*/a/*410.50*/.correo.telefono),format.raw/*410.66*/("""");
				  """)))}),format.raw/*411.8*/("""
				  """),format.raw/*412.7*/("""$("select[name='autor.autorfuncion"+i+"']").val(""""),_display_(/*412.57*/a/*412.58*/.autorfuncion.id),format.raw/*412.74*/("""");
				  i++;
				""")))}),format.raw/*414.6*/(""" 
			""")))}),format.raw/*415.5*/("""	
			"""),_display_(/*416.5*/if(recurso.documentos.isEmpty)/*416.35*/{_display_(Seq[Any](format.raw/*416.36*/("""
			""")))}/*417.6*/else/*417.11*/{_display_(Seq[Any](format.raw/*417.12*/("""
				"""),format.raw/*418.5*/("""i=0;
				"""),_display_(/*419.6*/for(a <- recurso.documentos.sortBy( x=>(x.tipodocumento.id, x.tipodocumento.obligatorio))) yield /*419.96*/{_display_(Seq[Any](format.raw/*419.97*/("""		
				  """),format.raw/*420.7*/("""agregarDocumento2();
				  $("input[name='documento.nombrearchivo"+i+"']").hide();							  
				  $("<div> <a href='/documento/ver/"""),_display_(/*422.41*/a/*422.42*/.id),format.raw/*422.45*/("""' target='_blank'   >"""),_display_(/*422.67*/a/*422.68*/.nombrearchivo),format.raw/*422.82*/("""</a></div>").insertAfter("input[name='documento.nombrearchivo"+i+"']");
				  $("select[name='documento.tipodocumento"+i+"']").val(""""),_display_(/*423.62*/a/*423.63*/.tipodocumento.id),format.raw/*423.80*/("""");
				  i++;
				""")))}),format.raw/*425.6*/(""" 
			""")))}),format.raw/*426.5*/("""	
			
			"""),format.raw/*428.4*/("""// Formato	
			if (formatoentrega_id_3.checked == false)
				$('#formatoentregaotro').parent().hide();
			else
				$('#formatoentregaotro').parent().show();
			

			"""),_display_(/*435.5*/if(recurso.versionanterior == null )/*435.41*/{_display_(Seq[Any](format.raw/*435.42*/("""				
			""")))}/*436.6*/else/*436.11*/{_display_(Seq[Any](format.raw/*436.12*/("""
				"""),format.raw/*437.5*/("""$("#versionanterior_recursoanterior_id").val(""""),_display_(/*437.52*/recurso/*437.59*/.versionanterior.recursoanterior.numcontrol),format.raw/*437.102*/("""");
				$("#extra1_S").prop("checked",true);	
				$("#divVersion, #extra1_S, #numcontrol, #va.numcontrol, #divNumControl").show();
			""")))}),format.raw/*440.5*/("""			
		
		"""),format.raw/*442.3*/("""}"""),format.raw/*442.4*/("""

	 
		"""),format.raw/*445.3*/("""$('#este').validator().on('submit', function (e) """),format.raw/*445.52*/("""{"""),format.raw/*445.53*/("""
			  """),format.raw/*446.6*/("""if (e.isDefaultPrevented()) """),format.raw/*446.34*/("""{"""),format.raw/*446.35*/("""
			  """),format.raw/*447.6*/("""}"""),format.raw/*447.7*/(""" """),format.raw/*447.8*/("""else """),format.raw/*447.13*/("""{"""),format.raw/*447.14*/("""
					"""),format.raw/*448.6*/("""$('#elaboracion').removeAttr("pattern");
					$('#elaboracion').val(    moment($('#elaboracion').val(),"DD/MM/YYYY").format("YYYY-MM-DD")  );			
			  """),format.raw/*450.6*/("""}"""),format.raw/*450.7*/("""
			"""),format.raw/*451.4*/("""}"""),format.raw/*451.5*/(""")		 
	 
	 
	 
	$(document).on("keydown change blur", "textarea", function(event)"""),format.raw/*455.67*/("""{"""),format.raw/*455.68*/("""
		"""),format.raw/*456.3*/("""var actual = 	$(this);
		var tam = actual.val().length;
		if (tam >= 600)"""),format.raw/*458.18*/("""{"""),format.raw/*458.19*/("""
			"""),format.raw/*459.4*/("""console.log("tam excedido");
			if ( (event.which != 8  && event.which != 46  ))
				event.preventDefault();
			actual.css("border-color","#FF0000");			
			actual.parent().find("div.errorObservacion").html("Este campo de observaciones ha excedido los 600 caracteres").show();
			actual.parent().find("div.errorObservacion").addClass("error");
			
		"""),format.raw/*466.3*/("""}"""),format.raw/*466.4*/(""" """),format.raw/*466.5*/("""else """),format.raw/*466.10*/("""{"""),format.raw/*466.11*/("""
			"""),format.raw/*467.4*/("""actual.css("border-color","");			
			actual.parent().find("div.errorObservacion").hide();	
			actual.parent().find("div.errorObservacion").removeClass("error");
		"""),format.raw/*470.3*/("""}"""),format.raw/*470.4*/("""
	"""),format.raw/*471.2*/("""}"""),format.raw/*471.3*/(""");	 
	 
		
	       function agregarDocumento2(insertarEn)"""),format.raw/*474.47*/("""{"""),format.raw/*474.48*/("""
	    	   """),format.raw/*475.10*/("""console.log("entrando a agregarDocumento2")
	            var nrenglon = ($("#tableDocumentos div.row").length);  
	            var arrString = [];
	            var 
	            renglon ='<div class="row">';
	            renglon+='  <div class="col-md-5">';
	            renglon+='      <div class="form-group clearfix">';
	            renglon+='          <div class="input input-group">';
	            renglon+='             <div id="docId'+nrenglon+'" style="display:none5"></div>';
	            renglon+='             <input type="file" accept=".pdf" id="documento.nombrearchivo'+nrenglon+'" name="documento.nombrearchivo'+nrenglon+'" required="required" class="form-control">';
	            renglon+='             <div id="na'+nrenglon+'" style="display:none5"></div>';
	            renglon+='             <div class="help-block with-errors"></div>';     
	            renglon+='          </div>';
	            renglon+='          <textarea placeholder="Escriba su observacion..." name="'+"observacion_documento.nombrearchivo"+nrenglon+'" class="observacion"></textarea>';
	            renglon+='          <button type="button" name="btnObservacion_documento.nombrearchivo'+nrenglon+'" class="btn btn-primary btn-xs form-control">Corregir</button>';
	            renglon+='          <div class="errorObservacion" style="color:red"></div>';
	            renglon+='      </div>';
	            renglon+='  </div>';
	            
	            renglon+='  <div class="col-md-5">'
	            renglon+='      <div class="form-group clearfix">';
	            renglon+='          <div class="input input-group">';
	            renglon+='              <select name="'+"documento.tipodocumento"+nrenglon+'" required class="form-control" >'+$('#auxDocto').html()+'</select>';       
	            renglon+='              <div id="ta'+nrenglon+'"></div>';
	            renglon+='              <span class="help-block with-errors"></span>';
	            renglon+='          </div>';
	            renglon+='          <textarea placeholder="Escriba su observacion..." name="'+"observacion_documento.tipodocumento"+nrenglon+'" class="observacion"></textarea>';
	            renglon+='          <button type="button" name="btnObservacion_documento.tipodocumento'+nrenglon+'" class="btn btn-primary btn-xs form-control">Corregir</button>';
	            renglon+='          <div class="errorObservacion" style="color:red"></div>';
	            renglon+='      </div>';
	            renglon+='  </div>';
	        //  renglon+='</div>';
	            
	            
	            renglon+='<div class="col-md-2">';
	            renglon+=   '<input type="button" value="Quitar documento" onclick="eliminarDocumento2('+nrenglon+')" id="btnQuitarDocto'+nrenglon+'">';        
	            renglon+='</div>';
	          //  console.log("insertarEn "+insertarEn)
	            if (insertarEn==undefined)"""),format.raw/*513.40*/("""{"""),format.raw/*513.41*/("""
	            	"""),format.raw/*514.15*/("""//console.log("dentro del if")
	        //    	console.log("renglon   "+renglon)
	                $('#tableDocumentos').append(renglon);
	                $("[name*='btnObservacion_documento.nombrearchivo"+((nrenglon)-0)+"']").hide();
	                $("[name*='btnObservacion_documento.tipodocumento"+((nrenglon)-0)+"']").hide();
	                $("select[name*='documento.tipodocumento']").css("font-size","85%");
	            """),format.raw/*520.14*/("""}"""),format.raw/*520.15*/(""" """),format.raw/*520.16*/("""else """),format.raw/*520.21*/("""{"""),format.raw/*520.22*/("""
	                """),format.raw/*521.18*/("""/*
	                $('#documento.nombrearchivo1').css("display","block");
	                $("#documento.nombrearchivo1").show();
	                $('#documento.nombrearchivo1').swap('[name="observacion_documento.nombrearchivo1"]');
	                */
	            """),format.raw/*526.14*/("""}"""),format.raw/*526.15*/("""
	            
	            
	            """),format.raw/*529.14*/("""//Cuando hay observaciones en documentos, en los selects visibles habilitar solo las options relacionadas al tipo de documento con observaciones
	            //$("select[name^='documento.tipodocumento'] option").attr("disabled","disabled");
	            //alert("se desactivaron!!!!!!");

	                $('#tableDocumentos div.row:even').css("background-color", "#f7f7f7");
	                
	                // Deshabilita o habilita los options del tipo de archivo dependiendo si es obligatorio   
	                """),_display_(/*536.19*/for(tdoc<-models.Tipodocumento.find.all()) yield /*536.61*/{_display_(Seq[Any](format.raw/*536.62*/("""
	                    """),format.raw/*537.22*/("""$("select[name^='documento.tipodocumento']:last option[value="""),_display_(/*537.84*/tdoc/*537.88*/.id),format.raw/*537.91*/("""]").prop("disabled", """),_display_(/*537.113*/tdoc/*537.117*/.obligatorio),format.raw/*537.129*/("""==1);
	                """)))}),format.raw/*538.19*/("""           
	        """),format.raw/*539.10*/("""}"""),format.raw/*539.11*/("""   
	       
	       
	       
	       
	 
"""),format.raw/*545.1*/("""</script>
<script src=""""),_display_(/*546.15*/routes/*546.21*/.Assets.at("javascripts/validator.min.js")),format.raw/*546.63*/("""" type="text/javascript"></script>

<script src=""""),_display_(/*548.15*/routes/*548.21*/.Assets.at("javascripts/recursos.js")),format.raw/*548.58*/(""""></script>
<link rel="stylesheet" media="screen" href=""""),_display_(/*549.46*/routes/*549.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*549.89*/(""""/>
<script src=""""),_display_(/*550.15*/routes/*550.21*/.Assets.at("javascripts/fullcalendar/moment.min.js")),format.raw/*550.73*/("""" ></script>  

<script src=""""),_display_(/*552.15*/routes/*552.21*/.Assets.at("lib/bootstrap/js/transition.js")),format.raw/*552.65*/("""" type="text/javascript" defer></script>
<script src=""""),_display_(/*553.15*/routes/*553.21*/.Assets.at("lib/bootstrap/js/collapse.js")),format.raw/*553.63*/("""" type="text/javascript" defer></script>
<script src=""""),_display_(/*554.15*/routes/*554.21*/.Assets.at("lib/Eonasdan-bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js")),format.raw/*554.107*/("""" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*555.62*/routes/*555.68*/.Assets.at("lib/Eonasdan-bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css")),format.raw/*555.156*/("""">
<script src=""""),_display_(/*556.15*/routes/*556.21*/.Assets.at("lib/moment/locale/es.js")),format.raw/*556.58*/("""" type="text/javascript"></script>

"""))}
  }

  def render(id:Long,recursoForm:Form[Recurso],recurso:Recurso): play.twirl.api.HtmlFormat.Appendable = apply(id,recursoForm,recurso)

  def f:((Long,Form[Recurso],Recurso) => play.twirl.api.HtmlFormat.Appendable) = (id,recursoForm,recurso) => apply(id,recursoForm,recurso)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:35 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/observaciones.scala.html
                  HASH: da3bae596622a19e01f6beef0effa0ab66eb879c
                  MATRIX: 759->1|911->78|943->102|1030->58|1059->159|1087->162|1098->166|1136->168|1165->171|1719->698|1799->769|1839->771|1884->790|1941->826|1982->839|2273->1099|2305->1104|2373->1142|2403->1145|2477->1191|2506->1192|2534->1193|2596->1227|2625->1228|2659->1235|2798->1347|2826->1348|2902->1396|2931->1397|2963->1402|3022->1434|3050->1435|4198->2555|4227->2556|4258->2560|4411->2686|4439->2687|4469->2690|4548->2741|4577->2742|4608->2746|4662->2773|4690->2774|4723->2780|4919->2950|4962->2984|5001->2985|5033->2990|5176->3106|5240->3153|5280->3154|5316->3162|5395->3213|5406->3214|5434->3220|5474->3232|5485->3233|5519->3245|5585->3283|5596->3284|5624->3290|5719->3357|5730->3358|5758->3364|5850->3428|5861->3429|5889->3435|5981->3496|6020->3504|6060->3516|6122->3550|6143->3561|6194->3590|6406->3774|6435->3775|6539->3850|6569->3851|6600->3854|6744->3969|6774->3970|6806->3974|7192->4332|7221->4333|7250->4334|7284->4339|7314->4340|7346->4344|7744->4714|7773->4715|7806->4720|7835->4721|7937->4794|7967->4795|8001->4801|8102->4873|8132->4874|8165->4879|8254->4940|8283->4941|8582->5212|8611->5213|8679->5252|8709->5253|8742->5258|8854->5341|8884->5342|8918->5348|9003->5405|9032->5406|9130->5475|9160->5476|9194->5482|9280->5540|9309->5541|9401->5604|9431->5605|9464->5610|9557->5674|9587->5675|9621->5681|9730->5762|9759->5763|9788->5764|9826->5774|9855->5775|9889->5781|9925->5788|9955->5789|9991->5797|10118->5896|10147->5897|10211->5932|10241->5933|10283->5947|10342->5977|10372->5978|10411->5988|10523->6072|10553->6073|10589->6081|10618->6082|10681->6116|10711->6117|10748->6126|10873->6223|10902->6224|10938->6232|10967->6233|11001->6239|11030->6240|11061->6243|11159->6312|11189->6313|11221->6317|11370->6438|11399->6439|11428->6440|11462->6445|11492->6446|11525->6451|11579->6477|11608->6478|11638->6480|11667->6481|11704->6490|11754->6511|11784->6512|11814->6514|11860->6532|11881->6543|11932->6572|11995->6607|12012->6614|12050->6630|12122->6674|12139->6681|12174->6694|12232->6725|12269->6752|12309->6753|12342->6758|12520->6905|12552->6910|12588->6936|12628->6937|12663->6944|12867->7117|12899->7122|12936->7149|12976->7150|13009->7155|13272->7387|13304->7392|13341->7419|13381->7420|13406->7427|13420->7433|13460->7434|13493->7439|13530->7449|13572->7474|13612->7475|13649->7484|13742->7549|13753->7550|13782->7557|13864->7611|13875->7612|13905->7620|13987->7674|13998->7675|14028->7683|14066->7694|14096->7714|14136->7715|14172->7723|14243->7766|14254->7767|14289->7780|14373->7836|14384->7837|14422->7853|14464->7864|14499->7871|14577->7921|14588->7922|14626->7938|14677->7958|14714->7964|14752->7974|15048->8243|15089->8274|15129->8275|15153->8281|15167->8286|15207->8287|15242->8295|15368->8403|15409->8404|15442->8409|15491->8430|15517->8434|15548->8436|15585->8445|15602->8452|15634->8462|15743->8543|15769->8547|15808->8558|15819->8559|15858->8576|15900->8591|15991->8672|16031->8673|16066->8680|16114->8700|16140->8704|16170->8706|16181->8707|16217->8721|16303->8779|16329->8783|16403->8829|16429->8833|16493->8869|16504->8870|16529->8873|16576->8892|16587->8893|16623->8907|16679->8935|16705->8939|16743->8949|16754->8950|16802->8976|16855->9001|16881->9005|16919->9015|16930->9016|16955->9019|17093->9126|17130->9132|17169->9143|17573->9516|17606->9521|17707->9595|17750->9628|17790->9629|17819->9640|17833->9645|17873->9646|17907->9653|17957->9686|17997->9687|18032->9694|18083->9717|18096->9720|18126->9728|18188->9762|18201->9765|18232->9774|18273->9784|18310->9790|18351->9803|18402->9827|18446->9861|18486->9862|18521->9869|19097->10418|19161->10465|19201->10466|19242->10479|19297->10506|19308->10507|19336->10513|19410->10559|19421->10560|19449->10566|19572->10661|19583->10662|19611->10668|19674->10703|19685->10704|19719->10716|19819->10788|19830->10789|19858->10795|19957->10866|19968->10867|19996->10873|20151->11000|20168->11007|20207->11024|20245->11035|20298->11078|20338->11079|20375->11088|20426->11111|20437->11112|20465->11118|20553->11178|20564->11179|20592->11185|20660->11222|20702->11236|20781->11287|20792->11288|20820->11294|20865->11310|20895->11311|20931->11319|20970->11330|20981->11331|21009->11337|21057->11357|21086->11358|21215->11459|21226->11460|21275->11487|21305->11488|21335->11489|21365->11490|21401->11498|21487->11556|21516->11557|21558->11571|21677->11662|21688->11663|21741->11694|21771->11695|21801->11696|21831->11697|21867->11705|21907->11717|21918->11718|21946->11724|22022->11772|22033->11773|22061->11779|22103->11793|22114->11794|22142->11800|22377->12007|22388->12008|22416->12014|22458->12028|22469->12029|22497->12035|22630->12140|22641->12141|22669->12147|22711->12161|22722->12162|22750->12168|22898->12288|22927->12289|22966->12297|23003->12303|23040->12312|23114->12359|23152->12387|23192->12388|23226->12394|23338->12479|23383->12514|23423->12515|23460->12524|23523->12569|23537->12574|23577->12575|23612->12582|23708->12650|23725->12657|23782->12692|23822->12701|23859->12707|23902->12722|23948->12741|23993->12769|24033->12770|24067->12776|24113->12794|24152->12811|24214->12842|24252->12852|24314->12886|24335->12897|24386->12926|25057->13569|25074->13576|25116->13595|25154->13604|25172->13611|25218->13634|25282->13670|25311->13671|25347->13679|25399->13702|25429->13703|25465->13711|25530->13748|25547->13755|25582->13768|25641->13800|25681->13830|25721->13831|25759->13842|25804->13870|25844->13871|25879->13878|25925->13896|25964->13913|26026->13944|26063->13950|26096->13956|26139->13989|26179->13990|26209->14002|26223->14007|26263->14008|26297->14015|26346->14047|26386->14048|26423->14057|26474->14080|26486->14082|26516->14090|26578->14124|26590->14126|26621->14135|26662->14145|26699->14151|26731->14156|26768->14183|26808->14184|26832->14190|26846->14195|26886->14196|26919->14201|26956->14211|26998->14236|27038->14237|27075->14246|27168->14311|27179->14312|27208->14319|27290->14373|27301->14374|27331->14382|27413->14436|27424->14437|27454->14445|27492->14456|27522->14476|27562->14477|27598->14485|27665->14524|27676->14525|27711->14538|27791->14590|27802->14591|27840->14607|27882->14618|27917->14625|27995->14675|28006->14676|28044->14692|28095->14712|28132->14718|28165->14724|28205->14754|28245->14755|28269->14761|28283->14766|28323->14767|28356->14772|28393->14782|28500->14872|28540->14873|28577->14882|28737->15014|28748->15015|28773->15018|28823->15040|28834->15041|28870->15055|29031->15188|29042->15189|29081->15206|29132->15226|29169->15232|29206->15241|29399->15407|29445->15443|29485->15444|29513->15454|29527->15459|29567->15460|29600->15465|29675->15512|29692->15519|29758->15562|29924->15697|29961->15706|29990->15707|30025->15714|30103->15763|30133->15764|30167->15770|30224->15798|30254->15799|30288->15805|30317->15806|30346->15807|30380->15812|30410->15813|30444->15819|30622->15969|30651->15970|30683->15974|30712->15975|30821->16055|30851->16056|30882->16059|30984->16132|31014->16133|31046->16137|31423->16486|31452->16487|31481->16488|31515->16493|31545->16494|31577->16498|31768->16661|31797->16662|31827->16664|31856->16665|31942->16722|31972->16723|32011->16733|34918->19611|34948->19612|34992->19627|35451->20057|35481->20058|35511->20059|35545->20064|35575->20065|35622->20083|35918->20350|35948->20351|36019->20393|36568->20914|36627->20956|36667->20957|36718->20979|36808->21041|36822->21045|36847->21048|36898->21070|36913->21074|36948->21086|37004->21110|37054->21131|37084->21132|37155->21175|37207->21199|37223->21205|37287->21247|37365->21297|37381->21303|37440->21340|37525->21397|37541->21403|37600->21440|37646->21458|37662->21464|37736->21516|37794->21546|37810->21552|37876->21596|37959->21651|37975->21657|38039->21699|38122->21754|38138->21760|38247->21846|38371->21942|38387->21948|38498->22036|38543->22053|38559->22059|38618->22096
                  LINES: 26->1|29->5|29->5|30->2|32->5|34->7|34->7|34->7|35->8|52->25|52->25|52->25|53->26|53->26|54->27|57->30|58->31|62->35|65->38|66->39|66->39|67->40|67->40|67->40|68->41|73->46|73->46|76->49|76->49|77->50|79->52|79->52|110->83|110->83|111->84|114->87|114->87|115->88|115->88|115->88|116->89|117->90|117->90|119->92|123->96|123->96|123->96|124->97|127->100|127->100|127->100|128->101|129->102|129->102|129->102|129->102|129->102|129->102|130->103|130->103|130->103|132->105|132->105|132->105|133->106|133->106|133->106|135->108|136->109|139->112|140->113|140->113|140->113|152->125|152->125|155->128|155->128|156->129|157->130|157->130|158->131|167->140|167->140|167->140|167->140|167->140|168->141|177->150|177->150|178->151|178->151|181->154|181->154|182->155|183->156|183->156|184->157|186->159|186->159|192->165|192->165|196->169|196->169|197->170|198->171|198->171|199->172|200->173|200->173|201->174|201->174|202->175|203->176|203->176|205->178|205->178|206->179|207->180|207->180|208->181|210->183|210->183|210->183|211->184|211->184|212->185|212->185|212->185|213->186|217->190|217->190|218->191|218->191|219->192|219->192|219->192|220->193|222->195|222->195|223->196|223->196|224->197|224->197|225->198|227->200|227->200|228->201|228->201|229->202|229->202|230->203|233->206|233->206|234->207|236->209|236->209|236->209|236->209|236->209|237->210|238->211|238->211|239->212|239->212|242->215|242->215|242->215|243->216|243->216|243->216|243->216|244->217|244->217|244->217|245->218|245->218|245->218|246->219|246->219|246->219|247->220|248->221|249->222|249->222|249->222|250->223|251->224|252->225|252->225|252->225|253->226|254->227|255->228|255->228|255->228|256->229|256->229|256->229|257->230|258->231|258->231|258->231|259->232|260->233|260->233|260->233|261->234|261->234|261->234|262->235|262->235|262->235|263->236|263->236|263->236|264->237|264->237|264->237|264->237|265->238|265->238|265->238|266->239|267->240|267->240|267->240|267->240|269->242|270->243|272->245|282->255|282->255|282->255|283->256|283->256|283->256|284->257|284->257|284->257|285->258|285->258|285->258|285->258|285->258|285->258|285->258|287->260|287->260|287->260|287->260|287->260|288->261|288->261|288->261|289->262|289->262|289->262|289->262|289->262|289->262|290->263|290->263|291->264|291->264|291->264|291->264|291->264|291->264|291->264|291->264|292->265|292->265|292->265|292->265|292->265|293->266|293->266|293->266|293->266|293->266|295->268|296->269|298->271|303->276|305->278|308->281|308->281|308->281|309->282|309->282|309->282|310->283|310->283|310->283|311->284|311->284|311->284|311->284|312->285|312->285|312->285|313->286|314->287|316->289|317->290|317->290|317->290|318->291|325->298|325->298|325->298|326->299|327->300|327->300|327->300|328->301|328->301|328->301|331->304|331->304|331->304|331->304|331->304|331->304|332->305|332->305|332->305|334->307|334->307|334->307|338->311|338->311|338->311|339->312|339->312|339->312|340->313|340->313|340->313|340->313|341->314|341->314|341->314|342->315|344->317|344->317|344->317|344->317|344->317|344->317|345->318|345->318|345->318|345->318|346->319|346->319|349->322|349->322|349->322|349->322|349->322|349->322|350->323|351->324|351->324|353->326|354->327|354->327|354->327|354->327|354->327|354->327|355->328|355->328|355->328|355->328|356->329|356->329|356->329|356->329|356->329|356->329|361->334|361->334|361->334|361->334|361->334|361->334|365->338|365->338|365->338|365->338|365->338|365->338|370->343|370->343|371->344|372->345|374->347|375->348|375->348|375->348|376->349|378->351|378->351|378->351|379->352|380->353|380->353|380->353|381->354|382->355|382->355|382->355|383->356|384->357|387->360|388->361|388->361|388->361|389->362|389->362|389->362|390->363|392->365|393->366|393->366|393->366|408->381|408->381|408->381|408->381|408->381|408->381|410->383|410->383|413->386|413->386|413->386|414->387|414->387|414->387|414->387|415->388|415->388|415->388|416->389|416->389|416->389|417->390|417->390|417->390|418->391|419->392|420->393|420->393|420->393|421->394|421->394|421->394|422->395|422->395|422->395|423->396|423->396|423->396|423->396|424->397|424->397|424->397|425->398|426->399|427->400|427->400|427->400|428->401|428->401|428->401|429->402|430->403|430->403|430->403|431->404|432->405|432->405|432->405|433->406|433->406|433->406|434->407|434->407|434->407|435->408|435->408|435->408|436->409|436->409|436->409|436->409|437->410|437->410|437->410|438->411|439->412|439->412|439->412|439->412|441->414|442->415|443->416|443->416|443->416|444->417|444->417|444->417|445->418|446->419|446->419|446->419|447->420|449->422|449->422|449->422|449->422|449->422|449->422|450->423|450->423|450->423|452->425|453->426|455->428|462->435|462->435|462->435|463->436|463->436|463->436|464->437|464->437|464->437|464->437|467->440|469->442|469->442|472->445|472->445|472->445|473->446|473->446|473->446|474->447|474->447|474->447|474->447|474->447|475->448|477->450|477->450|478->451|478->451|482->455|482->455|483->456|485->458|485->458|486->459|493->466|493->466|493->466|493->466|493->466|494->467|497->470|497->470|498->471|498->471|501->474|501->474|502->475|540->513|540->513|541->514|547->520|547->520|547->520|547->520|547->520|548->521|553->526|553->526|556->529|563->536|563->536|563->536|564->537|564->537|564->537|564->537|564->537|564->537|564->537|565->538|566->539|566->539|572->545|573->546|573->546|573->546|575->548|575->548|575->548|576->549|576->549|576->549|577->550|577->550|577->550|579->552|579->552|579->552|580->553|580->553|580->553|581->554|581->554|581->554|582->555|582->555|582->555|583->556|583->556|583->556
                  -- GENERATED --
              */
          