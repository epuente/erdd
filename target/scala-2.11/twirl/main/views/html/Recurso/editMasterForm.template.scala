
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
object editMasterForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Long,Form[Recurso],Recurso,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, recursoForm: Form[Recurso],   recurso: Recurso   ):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.63*/("""
"""),format.raw/*3.83*/("""

"""),format.raw/*5.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.46*/routes/*5.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*5.89*/(""""/> 


 
"""),_display_(/*9.2*/main/*9.6*/ {_display_(Seq[Any](format.raw/*9.8*/("""
	"""),format.raw/*10.2*/("""<div class=container-fluid style="background-color: white; padding: 10px">
	    <h3>Cédula de Solicitud de Evaluación Técnico-Pedagógica de Recurso Didáctico Digital. (CESOE)</h3>
	    <h4>Edición</h4>	
		<div id="alertEstado" class="alert alert-default" role="alert">El estado de la solicitud es: '"""),_display_(/*13.98*/recurso/*13.105*/.estado.descripcion),format.raw/*13.124*/("""'.</div>    
	    
		<section id="masterForm">
		    """),_display_(/*16.8*/form(CSRF(routes.RecursoWebController.masterupdate(id)), 'role -> "form", 'id -> "este", 'enctype -> "multipart/form-data")/*16.131*/ {_display_(Seq[Any](format.raw/*16.133*/("""
		    	
				"""),_display_(/*18.6*/masterForm(recursoForm, id, recurso)),format.raw/*18.42*/("""
				
				"""),format.raw/*20.5*/("""<div class="row">
					<div class="col-md-6">
		        		"""),_display_(/*22.14*/if(recurso.estado.id == 1)/*22.40*/{_display_(Seq[Any](format.raw/*22.41*/("""	        
			            	"""),format.raw/*23.17*/("""<input type="submit" value="Editar recurso" class="btn btn-success btn-lg center-block btn-block" style="width: 70%">
		            	""")))}),format.raw/*24.17*/("""
		        		"""),_display_(/*25.14*/if(recurso.estado.id == 2)/*25.40*/{_display_(Seq[Any](format.raw/*25.41*/("""
			            	"""),format.raw/*26.17*/("""<input type="submit" value="Enviar correcciones" class="btn btn-success btn-lg center-block btn-block" style="width: 70%">
		            	""")))}),format.raw/*27.17*/("""						
					"""),format.raw/*28.6*/("""</div>
					<div class="col-md-6">
						<a href=""""),_display_(/*30.17*/routes/*30.23*/.RecursoController.list()),format.raw/*30.48*/("""" class="btn btn-primary btn-lg center-block btn-block" style="width: 70%">Cancelar</a>
					</div>					
				</div>
		    """)))}),format.raw/*33.8*/("""
		"""),format.raw/*34.3*/("""</section>				
	</div>
	
	
	
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title modalTitleError" id="myModalLabel">Alerta</h4>
	      </div>
	      <div class="modal-body">
	
	      </div>
	      <div class="modal-footer">
	      		<div class="modalPie">Los campos marcados con * son obligatorios</div>
	        	<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
	      </div>
	    </div>
	  </div>
	</div>	
		
	
""")))}),format.raw/*59.2*/("""






"""),format.raw/*66.1*/("""<script type="text/javascript">


$(document).ready(function() """),format.raw/*69.30*/("""{"""),format.raw/*69.31*/("""
	"""),format.raw/*70.2*/("""$('#elaboracion').datetimepicker("""),format.raw/*70.35*/("""{"""),format.raw/*70.36*/("""
		 """),format.raw/*71.4*/("""locale: 'es',
		 format: 'L'
	"""),format.raw/*73.2*/("""}"""),format.raw/*73.3*/(""");		
		$('#labelModalidad').html("Modalidad");
		$("label[for='dirigidoa_id']:eq(1)").hide();
		$("input[type='checkbox']").attr("disabled",true);
		$("input[type='checkbox']").attr("readonly",true);
		$('#este').validator();
		$('#formatoentregaotro').parent().hide();
		$("[name*='btnObservacion_']").hide();
		
		
		$("input[type='checkbox'][name='dirigidoa.id']").attr("name","dirigidoa.id");
		$("textarea[name='observacion_dirigidoa.id']").attr("name","observacion_dirigidoa.id");
		$("button[name='btnObservacion_version.id']").attr("name","btnObservacion_version.id");
		
		$("input[type='checkbox'][name='dirigidoa.id[]']").attr("disabled",true);
		$("input[type='checkbox'][name='dirigidoa.id[]']").attr("readonly",true);
		
		leer();
		quitarBotones();

		$("input[type='text']:required, textarea:required").attr("data-error", "Complete este campo");
		$("select:required").attr("data-error", "Seleccione una opción de la lista");
		$("input[type='radio']:required").attr("data-error", "Seleccione una opción");	
		$("input[type='checkbox']:required").attr("data-error", "Seleccione al menos una opción de las disponibles");

		$(':input').each(function() """),format.raw/*98.31*/("""{"""),format.raw/*98.32*/(""" 
		    """),format.raw/*99.7*/("""$(this).data('initialValue', $(this).val()); 
		"""),format.raw/*100.3*/("""}"""),format.raw/*100.4*/("""); 		
		
		$("#elaboracion").prop("required", true);
		
		
		
        $("#documento.nombrearchivo1").css("display","inline");     
        $("#documento.nombrearchivo1").show();
        
        $(".form-control").css("height","initial");
	"""),format.raw/*110.2*/("""}"""),format.raw/*110.3*/(""");
	
	
	function prueba(num)"""),format.raw/*113.22*/("""{"""),format.raw/*113.23*/("""       
        """),format.raw/*114.9*/("""$("[name='documento.nombrearchivo"+num+"']").css("display","inline");
        $("[name='documento.nombrearchivo1"+num+"']").show();
        eliminarAgregarDocumento2(num);
        $("#na"+num).hide();
	"""),format.raw/*118.2*/("""}"""),format.raw/*118.3*/("""



	
	 """),format.raw/*123.3*/("""var leer = function()"""),format.raw/*123.24*/("""{"""),format.raw/*123.25*/("""
	 	"""),format.raw/*124.4*/("""$("input[name='modalidad.id'][value="""),_display_(/*124.41*/recurso/*124.48*/.modalidad.id),format.raw/*124.61*/("""]").prop("checked", true);
		"""),_display_(/*125.4*/if(recurso.estado.id == 1L)/*125.31*/{_display_(Seq[Any](format.raw/*125.32*/("""
			"""),format.raw/*126.4*/("""$("#alertEstado").removeClass("alert alert-default").addClass("alert alert-info").html( $("#alertEstado").html()+   " Reingrese mas tarde.");;
		""")))}),format.raw/*127.4*/("""
		"""),_display_(/*128.4*/if(recurso.estado.id == 2)/*128.30*/{_display_(Seq[Any](format.raw/*128.31*/("""		
			"""),format.raw/*129.4*/("""$("#alertEstado").removeClass("alert alert-default").addClass("alert alert-warning").html( $("#alertEstado").html()+   " Corrija las observaciones indicadas y envíe.");
		""")))}),format.raw/*130.4*/("""
		"""),_display_(/*131.4*/if(recurso.estado.id == 3L)/*131.31*/{_display_(Seq[Any](format.raw/*131.32*/("""
			"""),format.raw/*132.4*/("""$("#alertEstado").removeClass("alert alert-default").addClass("alert alert-success").html( $("#alertEstado").html()+   " Toda su información esta bien, los evaluadores procederan a revisar el contenido, reingrese mas tarde.");;
		""")))}),format.raw/*133.4*/("""
		"""),_display_(/*134.4*/if(recurso.autores.isEmpty)/*134.31*/{_display_(Seq[Any](format.raw/*134.32*/("""
			""")))}/*135.6*/else/*135.12*/{_display_(Seq[Any](format.raw/*135.13*/("""
			"""),format.raw/*136.4*/("""i=0;
			"""),_display_(/*137.5*/for(a <- recurso.autores) yield /*137.30*/{_display_(Seq[Any](format.raw/*137.31*/("""		
			  """),format.raw/*138.6*/("""agregarAutor();
			  $("input[name='autor.nombre"+i+"']").val(""""),_display_(/*139.49*/a/*139.50*/.nombre),format.raw/*139.57*/("""");
			  $("input[name='autor.paterno"+i+"']").val(""""),_display_(/*140.50*/a/*140.51*/.paterno),format.raw/*140.59*/("""");
			  $("input[name='autor.materno"+i+"']").val(""""),_display_(/*141.50*/a/*141.51*/.materno),format.raw/*141.59*/("""");
			  """),_display_(/*142.7*/if(a.correo != null)/*142.27*/{_display_(Seq[Any](format.raw/*142.28*/("""
			  	"""),format.raw/*143.7*/("""$("input[name='autor.correo"+i+"']").val(""""),_display_(/*143.50*/a/*143.51*/.correo.email),format.raw/*143.64*/("""");
			  	$("input[name='autor.telefono"+i+"']").val(""""),_display_(/*144.52*/a/*144.53*/.correo.telefono),format.raw/*144.69*/("""");
			  """)))}),format.raw/*145.7*/("""
			  """),format.raw/*146.6*/("""$("select[name='autor.autorfuncion"+i+"']").val(""""),_display_(/*146.56*/a/*146.57*/.autorfuncion.id),format.raw/*146.73*/("""");
			  i++;
			""")))}),format.raw/*148.5*/(""" 
		""")))}),format.raw/*149.4*/("""	
			
		"""),format.raw/*151.3*/("""if (formatoentrega_id_3 != null)
			if (formatoentrega_id_3.checked == false)
				$('#formatoentregaotro').parent().hide();
			else
				$('#formatoentregaotro').parent().show();
			
		$("#ligaAgregarOtroAutor, #btnQuitarAutor").hide();	
		

		// Documentos
		"""),_display_(/*161.4*/if( recurso.documentos.isEmpty)/*161.35*/{_display_(Seq[Any](format.raw/*161.36*/("""
		""")))}/*162.5*/else/*162.10*/{_display_(Seq[Any](format.raw/*162.11*/("""		
			"""),_display_(/*163.5*/for((d,ii) <- recurso.documentos.sortBy( x=>(x.tipodocumento.id, x.tipodocumento.obligatorio)).zipWithIndex) yield /*163.113*/{_display_(Seq[Any](format.raw/*163.114*/("""
			  """),format.raw/*164.6*/("""agregarDocumento2();			  
			  $("select[name='documento.tipodocumento"""),_display_(/*165.46*/(ii)),format.raw/*165.50*/("""']").val(""""),_display_(/*165.61*/d/*165.62*/.tipodocumento.id),format.raw/*165.79*/("""");
			  """),_display_(/*166.7*/if(recurso.estado.id == 1  || recurso.estado.id == 2 || recurso.estado.id == 105)/*166.88*/{_display_(Seq[Any](format.raw/*166.89*/(""" 
			 	"""),format.raw/*167.6*/("""document.getElementById("documento.nombrearchivo"""),_display_(/*167.55*/(ii)),format.raw/*167.59*/("""").style.display='inline';				 	
			 	$("#na"""),_display_(/*168.13*/(ii)),format.raw/*168.17*/("""").html("<a href='/documento/verAn/"""),_display_(/*168.53*/d/*168.54*/.id),format.raw/*168.57*/("""' target='_blank'>"""),_display_(/*168.76*/d/*168.77*/.nombrearchivo),format.raw/*168.91*/("""</a>").show();
			 	$("#ta"""),_display_(/*169.13*/(ii)),format.raw/*169.17*/("""").html(""""),_display_(/*169.27*/d/*169.28*/.tipodocumento.descripcion),format.raw/*169.54*/("""");			 	
			 	$("#docId"""),_display_(/*170.16*/(ii)),format.raw/*170.20*/("""").html(""""),_display_(/*170.30*/d/*170.31*/.id),format.raw/*170.34*/("""").hide();
			 	$("#este").append($('<input type="text" name="aux2">').val("doctoAgregado"));			 	
			  """)))}),format.raw/*172.7*/("""
			""")))}),format.raw/*173.5*/(""" 
			
			"""),format.raw/*175.4*/("""$("input[name^='documento.nombrearchivo']").hide();
			$("select[name^='documento.tipodocumento']").hide();
			$("[id^='btnQuitarDocto'], #ligaAgregarDocto").hide();
	           // El select de tipo de documento no debe de llevar opciones de observación, solo el select de documento
           // $("button[name^='btnObservacion_documento.tipodocumento']").hide();
		""")))}),format.raw/*180.4*/("""

		"""),format.raw/*182.3*/("""$("input[name='aux2']").hide();
		
			// Si el recurso esta en web
			"""),_display_(/*185.5*/if(recurso.recursosenweb.isEmpty)/*185.38*/{_display_(Seq[Any](format.raw/*185.39*/("""				
			""")))}/*186.6*/else/*186.11*/{_display_(Seq[Any](format.raw/*186.12*/("""
				"""),_display_(/*187.6*/for(tmp <- recurso.recursosenweb) yield /*187.39*/{_display_(Seq[Any](format.raw/*187.40*/("""
					"""),format.raw/*188.6*/("""$('#webUsuario').val(""""),_display_(/*188.29*/tmp/*188.32*/.usuario),format.raw/*188.40*/("""");
					$('#webPassword').val(""""),_display_(/*189.30*/tmp/*189.33*/.password),format.raw/*189.42*/("""");
				""")))}),format.raw/*190.6*/("""
			""")))}),format.raw/*191.5*/("""			
			
			"""),format.raw/*193.4*/("""// Observaciones		
			"""),_display_(/*194.5*/if(recurso.observaciones.size > 0)/*194.39*/{_display_(Seq[Any](format.raw/*194.40*/(""" 
				"""),format.raw/*195.5*/("""$(".observacion").hide();
				$(".observacion").attr("readonly",true);
				$("input[type='radio'], input[type='date'], input[type='text'], input[type='email'], input[type='tel'], input[type='file'], input[type='url'], textarea, select").attr("readonly",true);
				$("input[type='radio'], input[type='date'], input[type='text'], input[type='email'], input[type='tel'], input[type='file'], input[type='url'], textarea, select").prop('disabled', true);

				// Muestra los campos de observaciones y habilita los correspondientes campos
				
				"""),_display_(/*202.6*/for( (o,i)<-recurso.observaciones.zipWithIndex) yield /*202.53*/{_display_(Seq[Any](format.raw/*202.54*/("""						
					"""),format.raw/*203.6*/("""// Campos
					$("[name='"""),_display_(/*204.17*/o/*204.18*/.campo),format.raw/*204.24*/("""']").attr("readonly",false);
					$("[name='"""),_display_(/*205.17*/o/*205.18*/.campo),format.raw/*205.24*/("""']").prop("disabled",false);
					
					//Campos de observacion
					$("[name='observacion_"""),_display_(/*208.29*/o/*208.30*/.campo),format.raw/*208.36*/("""']").text('Observacion realizada: """),_display_(/*208.71*/o/*208.72*/.observacion),format.raw/*208.84*/("""').addClass("alert alert-warning").show();
					$("[name='observacion_"""),_display_(/*209.29*/o/*209.30*/.campo),format.raw/*209.36*/("""']").css('margin-bottom',"0px");
				
					$("[name='btnObservacion_"""),_display_(/*211.32*/o/*211.33*/.campo),format.raw/*211.39*/("""']").show();
					
					$( document ).on( "click", "[name='btnObservacion_"""),_display_(/*213.57*/o/*213.58*/.campo),format.raw/*213.64*/("""']", function() """),format.raw/*213.80*/("""{"""),format.raw/*213.81*/("""
						"""),format.raw/*214.7*/("""$("[name='"""),_display_(/*214.18*/o/*214.19*/.campo),format.raw/*214.25*/("""']").focus();
					"""),format.raw/*215.6*/("""}"""),format.raw/*215.7*/(""");
					
					//Si se trata de un campo de autores, habilitar agregar y quitar autores
					if ( """),_display_(/*218.12*/o/*218.13*/.campo.startsWith("autor.")),format.raw/*218.40*/(""" """),format.raw/*218.41*/(""")"""),format.raw/*218.42*/("""{"""),format.raw/*218.43*/("""
						"""),format.raw/*219.7*/("""$("#ligaAgregarOtroAutor, #btnQuitarAutor").show();
					"""),format.raw/*220.6*/("""}"""),format.raw/*220.7*/("""
					
					"""),format.raw/*222.6*/("""//Si se trata de un campo de documentos, habilitar agregar y quitar documentos
					if ( """),_display_(/*223.12*/o/*223.13*/.campo.startsWith("documento.")),format.raw/*223.44*/(""" """),format.raw/*223.45*/(""")"""),format.raw/*223.46*/("""{"""),format.raw/*223.47*/("""
						"""),format.raw/*224.7*/("""var num = """"),_display_(/*224.19*/o/*224.20*/.campo),format.raw/*224.26*/("""".match(/\d/);
						$("[id='btnQuitarDocto"+""""),_display_(/*225.33*/o/*225.34*/.campo),format.raw/*225.40*/("""".substring(""""),_display_(/*225.54*/o/*225.55*/.campo),format.raw/*225.61*/("""".indexOf(num))+"']")
						    .prop('value','Eliminar y subir otro archivo')
						    .addClass('btn btn-primary')
						    .attr("onclick",
						    	    
						    	    'javascript:prueba(     """"),_display_(/*230.42*/o/*230.43*/.campo),format.raw/*230.49*/("""".substring(""""),_display_(/*230.63*/o/*230.64*/.campo),format.raw/*230.70*/("""".indexOf('+num+'))  )'  )
						    
						    .show();
						
						$("#documento.nombrearchivo"+""""),_display_(/*234.38*/o/*234.39*/.campo),format.raw/*234.45*/("""".substring(""""),_display_(/*234.59*/o/*234.60*/.campo),format.raw/*234.66*/("""".indexOf(num))).css("display","inline");
						
						
						
					//	$("#documento.nombrearchivo1").show();
					"""),format.raw/*239.6*/("""}"""),format.raw/*239.7*/("""	
				""")))}),format.raw/*240.6*/("""
			""")))}),format.raw/*241.5*/("""
		
			"""),format.raw/*243.4*/("""// Recurso: actualizado, Version anterior
			"""),_display_(/*244.5*/if(recurso.version.id == 2L)/*244.33*/{_display_(Seq[Any](format.raw/*244.34*/("""
				"""),format.raw/*245.5*/("""$("#divVersion").show();
				$("#versionanterior_recursoanterior_id").show();
				"""),_display_(/*247.6*/if(recurso.versionanterior == null)/*247.41*/{_display_(Seq[Any](format.raw/*247.42*/("""	
						"""),format.raw/*248.7*/("""$("#extra1_N").prop("checked",true);	
				""")))}/*249.7*/else/*249.12*/{_display_(Seq[Any](format.raw/*249.13*/("""
					"""),format.raw/*250.6*/("""$("#extra1_S").prop("checked",true);
					$("#va.numcontrol").val("""),_display_(/*251.31*/recurso/*251.38*/.versionanterior.recursoanterior.id),format.raw/*251.73*/(""");
				""")))}),format.raw/*252.6*/("""
			""")))}),format.raw/*253.5*/("""
			
			
			"""),format.raw/*256.4*/("""// Dirigido a
			"""),_display_(/*257.5*/for(da <- recurso.dirigidoa) yield /*257.33*/{_display_(Seq[Any](format.raw/*257.34*/("""
				"""),format.raw/*258.5*/("""$("#dirigidoa_id_"""),_display_(/*258.23*/(da.dirigidoa.id)),format.raw/*258.40*/("""").attr("checked", true);
			""")))}),format.raw/*259.5*/("""
			
			"""),format.raw/*261.4*/("""//Fecha elaboracion
			var fe =""""),_display_(/*262.14*/recursoForm/*262.25*/.field("elaboracion").value()),format.raw/*262.54*/(""""; 
			console.log("fe:"+fe)
			//$('#elaboracion').datepicker('update', moment(fe,"YYYY-MM-DD").format("DD/MM/YYYY")  );
			
			$('#elaboracion').val(  moment(fe,"YYYY-MM-DD").format("DD/MM/YYYY")  );
			
			$("#alcancecurricularotro, label[for='alcancecurricularotro']").toggle( $("#alcancecurricular_id").val()==99  );
			
			
			
			$("#documento.nombrearchivo1").css("display","inline");		
			$("#documento.nombrearchivo1").show();
			
			$("#unidadacademica_id option").remove();
			$("#unidadacademica_id").append($("<option></option>").attr("value", """),_display_(/*276.74*/recurso/*276.81*/.unidadacademica.id),format.raw/*276.100*/(""").text(""""),_display_(/*276.109*/recurso/*276.116*/.unidadacademica.nombre),format.raw/*276.139*/("""").attr("selected", true));
			
		"""),format.raw/*278.3*/("""}"""),format.raw/*278.4*/("""


	 
		"""),format.raw/*282.3*/("""$( document ).on( "change", "[name*='documento.nombrearchivo']", function() """),format.raw/*282.79*/("""{"""),format.raw/*282.80*/("""	
			"""),format.raw/*283.4*/("""var num =  $(this).attr('name').substring("documento.nombrearchivo".length);			
			$("#na"+num).html($(this).val());
		"""),format.raw/*285.3*/("""}"""),format.raw/*285.4*/(""");
		
		$( document ).on( "change", "[name*='autor.autorfuncion']", function() """),format.raw/*287.74*/("""{"""),format.raw/*287.75*/("""
			"""),format.raw/*288.4*/("""var num =  $(this).attr('name').substring("autor.autorfuncion".length);		
			if ($(this).val() == 9)"""),format.raw/*289.27*/("""{"""),format.raw/*289.28*/("""
				"""),format.raw/*290.5*/("""$("input[name='autor.otroTipoAutoria"+num+"']").show();  
			"""),format.raw/*291.4*/("""}"""),format.raw/*291.5*/(""" """),format.raw/*291.6*/("""else """),format.raw/*291.11*/("""{"""),format.raw/*291.12*/("""
				"""),format.raw/*292.5*/("""$("input[name='autor.otroTipoAutoria"+num+"']").hide();			
			"""),format.raw/*293.4*/("""}"""),format.raw/*293.5*/("""
		"""),format.raw/*294.3*/("""}"""),format.raw/*294.4*/(""");	 
	 
		$( document ).on( "click", "[name='version.id']", function() """),format.raw/*296.64*/("""{"""),format.raw/*296.65*/("""			
			"""),format.raw/*297.4*/("""if ( $(this).val() == 2  )"""),format.raw/*297.30*/("""{"""),format.raw/*297.31*/("""
				"""),format.raw/*298.5*/("""$("#divVersion").show();
				$("input[type='radio'][name='extra1']").attr("disabled",false);
				$("input[type='radio'][name='extra1']").attr("readonly",false);
			"""),format.raw/*301.4*/("""}"""),format.raw/*301.5*/(""" """),format.raw/*301.6*/("""else """),format.raw/*301.11*/("""{"""),format.raw/*301.12*/("""
				"""),format.raw/*302.5*/("""$("#versionanterior_recursoanterior_id").val("");
				$("#msgBuscarNc").html("");			
				$("#divVersion").hide();
			"""),format.raw/*305.4*/("""}"""),format.raw/*305.5*/("""
		"""),format.raw/*306.3*/("""}"""),format.raw/*306.4*/(""");
		
		$( document ).on( "click", "[name='extra1']", function() """),format.raw/*308.60*/("""{"""),format.raw/*308.61*/("""
			"""),format.raw/*309.4*/("""if (   $(this).val() == "N" )"""),format.raw/*309.33*/("""{"""),format.raw/*309.34*/("""
				"""),format.raw/*310.5*/("""$("#versionanterior_recursoanterior_id").val("");
				$("#msgBuscarNc").html("");				
				$("#divNumControl").hide();			
			"""),format.raw/*313.4*/("""}"""),format.raw/*313.5*/("""
			"""),format.raw/*314.4*/("""if (   $(this).val() == "S" )"""),format.raw/*314.33*/("""{"""),format.raw/*314.34*/("""
				"""),format.raw/*315.5*/("""$("#versionanterior_recursoanterior_id").attr("disabled", false);
				$("#versionanterior_recursoanterior_id").attr("readonly", false);
				$("#divNumControl").show();			
			"""),format.raw/*318.4*/("""}"""),format.raw/*318.5*/("""		
		"""),format.raw/*319.3*/("""}"""),format.raw/*319.4*/(""");		

		
		$(document).on("keydown change blur", "textarea", function(event)"""),format.raw/*322.68*/("""{"""),format.raw/*322.69*/("""				
			"""),format.raw/*323.4*/("""var tam = $(this).val().length;
			if (tam >= 600 && (event.which != 8  && event.which != 46  ))"""),format.raw/*324.65*/("""{"""),format.raw/*324.66*/("""
				"""),format.raw/*325.5*/("""console.log("tam excedido");
				event.preventDefault();
				$(this).parent().find(".help-block").html('<ul class="list-unstyled"><li>Este campo ha excedido los 600 caracteres</li></ul>');
				$(this).parent().parent().addClass("has-error");
			"""),format.raw/*329.4*/("""}"""),format.raw/*329.5*/(""" """),format.raw/*329.6*/("""else """),format.raw/*329.11*/("""{"""),format.raw/*329.12*/("""
				"""),format.raw/*330.5*/("""$(this).parent().find(".help-block").html('');
				$(this).parent().parent().removeClass("has-error");			
			"""),format.raw/*332.4*/("""}"""),format.raw/*332.5*/("""
		"""),format.raw/*333.3*/("""}"""),format.raw/*333.4*/(""");		
		
		
		
	    $( document ).on( "change" ,"#unidadmedida_id", function(e)"""),format.raw/*337.65*/("""{"""),format.raw/*337.66*/("""
	        """),format.raw/*338.10*/("""var texto = $("#unidadmedida_id option:selected").text();
	        $("#duracion").prop("placeholder", "Número de "+ texto.toLowerCase());
	    """),format.raw/*340.6*/("""}"""),format.raw/*340.7*/(""");		
		


	
		$("#este").submit(function(event)"""),format.raw/*345.36*/("""{"""),format.raw/*345.37*/("""		
			"""),format.raw/*346.4*/("""console.log(".submit");
			if(!preValidar())"""),format.raw/*347.21*/("""{"""),format.raw/*347.22*/("""			
				"""),format.raw/*348.5*/("""return false;
			"""),format.raw/*349.4*/("""}"""),format.raw/*349.5*/(""" """),format.raw/*349.6*/("""else """),format.raw/*349.11*/("""{"""),format.raw/*349.12*/("""
	            """),format.raw/*350.14*/("""$('#elaboracion').removeAttr("pattern");
	            $('#elaboracion').val(    moment($('#elaboracion').val(),"DD/MM/YYYY").format("YYYY-MM-DD")  );
	            $("select[name^='documento.tipodocumento'] option").prop("disabled", false);
	            $("select[name^='documento.tipodocumento']").removeAttr("disabled");
	            $("select[name^='documento.tipodocumento']").removeAttr("required");
	            return true;    				
			"""),format.raw/*356.4*/("""}"""),format.raw/*356.5*/("""
		"""),format.raw/*357.3*/("""}"""),format.raw/*357.4*/(""");
		
		$('#este').validator().on('submit', function (e) """),format.raw/*359.52*/("""{"""),format.raw/*359.53*/("""
			"""),format.raw/*360.4*/("""console.log(".validator().on  submit");
			  if (e.isDefaultPrevented()) """),format.raw/*361.34*/("""{"""),format.raw/*361.35*/("""
			  """),format.raw/*362.6*/("""}"""),format.raw/*362.7*/(""" """),format.raw/*362.8*/("""else """),format.raw/*362.13*/("""{"""),format.raw/*362.14*/("""
				"""),format.raw/*363.5*/("""//	$('#elaboracion').removeAttr("pattern");
				//	$('#elaboracion').val(    moment($('#elaboracion').val(),"DD/MM/YYYY").format("YYYY-MM-DD")  );	
	                $("select[name^='documento.tipodocumento']:visible option").attr("disabled", false);
	               // e.preventDefault;
	                $("select[name^='documento.tipodocumento'] option").prop("disabled", false);
			  """),format.raw/*368.6*/("""}"""),format.raw/*368.7*/("""
			"""),format.raw/*369.4*/("""}"""),format.raw/*369.5*/(""")			
			
			
			
			
    
       function agregarDocumento2(insertarEn)"""),format.raw/*375.46*/("""{"""),format.raw/*375.47*/("""
            """),format.raw/*376.13*/("""var nrenglon = ($("#tableDocumentos div.row").length);  
            var arrString = [];
            var 
            renglon ='<div class="row">';
            renglon+='  <div class="col-md-5">';
            renglon+='      <div class="form-group clearfix">';
            renglon+='          <div class="input input-group">';
            renglon+='             <div id="docId'+nrenglon+'" style="display:none"></div>';
            renglon+='             <input type="file" accept=".pdf" id="documento.nombrearchivo'+nrenglon+'" name="documento.nombrearchivo'+nrenglon+'" required="required" class="form-control">';
            renglon+='             <div id="na'+nrenglon+'" style="display:none"></div>';
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
            
            if (insertarEn==undefined)"""),format.raw/*413.39*/("""{"""),format.raw/*413.40*/("""
                """),format.raw/*414.17*/("""$('#tableDocumentos').append(renglon);
                $("[name*='btnObservacion_documento.nombrearchivo"+((nrenglon)-0)+"']").hide();
                $("[name*='btnObservacion_documento.tipodocumento"+((nrenglon)-0)+"']").hide();
                $("select[name*='documento.tipodocumento']").css("font-size","85%");
            """),format.raw/*418.13*/("""}"""),format.raw/*418.14*/(""" """),format.raw/*418.15*/("""else """),format.raw/*418.20*/("""{"""),format.raw/*418.21*/("""
                """),format.raw/*419.17*/("""/*
                $('#documento.nombrearchivo1').css("display","block");
                $("#documento.nombrearchivo1").show();
                $('#documento.nombrearchivo1').swap('[name="observacion_documento.nombrearchivo1"]');
                */
            """),format.raw/*424.13*/("""}"""),format.raw/*424.14*/("""
            
            
            """),format.raw/*427.13*/("""//Cuando hay observaciones en documentos, en los selects visibles habilitar solo las options relacionadas al tipo de documento con observaciones
            //$("select[name^='documento.tipodocumento'] option").attr("disabled","disabled");
            //alert("se desactivaron!!!!!!");

                $('#tableDocumentos div.row:even').css("background-color", "#f7f7f7");
                
                // Deshabilita o habilita los options del tipo de archivo dependiendo si es obligatorio   
                """),_display_(/*434.18*/for(tdoc<-models.Tipodocumento.find.all()) yield /*434.60*/{_display_(Seq[Any](format.raw/*434.61*/("""
                    """),format.raw/*435.21*/("""$("select[name^='documento.tipodocumento']:last option[value="""),_display_(/*435.83*/tdoc/*435.87*/.id),format.raw/*435.90*/("""]").prop("disabled", """),_display_(/*435.112*/tdoc/*435.116*/.obligatorio),format.raw/*435.128*/("""==1);
                """)))}),format.raw/*436.18*/("""           
        """),format.raw/*437.9*/("""}"""),format.raw/*437.10*/("""   			
		
		
		
		"""),format.raw/*441.3*/("""// Dependientes de la observacion
		// Cuando se selecciona Unidad acadeḿica, cargar el catalogo 
		$(document).on("click", "[name='btnObservacion_unidadacademica.id']", function()"""),format.raw/*443.83*/("""{"""),format.raw/*443.84*/("""
			"""),format.raw/*444.4*/("""console.log(""""),_display_(/*444.18*/recurso/*444.25*/.unidadacademica.id),format.raw/*444.44*/("""")
			filtradoUnidadesAcademicas();		
			if ("""),_display_(/*446.9*/recurso/*446.16*/.unidadacademica.id),format.raw/*446.35*/(""" """),format.raw/*446.36*/("""!= undefined)"""),format.raw/*446.49*/("""{"""),format.raw/*446.50*/("""
				"""),format.raw/*447.5*/("""$('#unidadacademica_id option[value=""""),_display_(/*447.43*/recurso/*447.50*/.unidadacademica.id),format.raw/*447.69*/(""""]').prop("selected", true);
			"""),format.raw/*448.4*/("""}"""),format.raw/*448.5*/("""
		"""),format.raw/*449.3*/("""}"""),format.raw/*449.4*/(""");		
	
</script>
<script src=""""),_display_(/*452.15*/routes/*452.21*/.Assets.at("javascripts/validator.min.js")),format.raw/*452.63*/("""" type="text/javascript"></script>


<script src=""""),_display_(/*455.15*/routes/*455.21*/.Assets.at("javascripts/utilerias.js")),format.raw/*455.59*/(""""></script>
<script src=""""),_display_(/*456.15*/routes/*456.21*/.Assets.at("javascripts/fullcalendar/moment.min.js")),format.raw/*456.73*/("""" ></script>


<script src=""""),_display_(/*459.15*/routes/*459.21*/.Assets.at("javascripts/recursos.js")),format.raw/*459.58*/(""""></script>
    
<script src=""""),_display_(/*461.15*/routes/*461.21*/.Assets.at("lib/bootstrap/js/transition.js")),format.raw/*461.65*/("""" type="text/javascript" defer></script>
<script src=""""),_display_(/*462.15*/routes/*462.21*/.Assets.at("lib/bootstrap/js/collapse.js")),format.raw/*462.63*/("""" type="text/javascript" defer></script>
<script src=""""),_display_(/*463.15*/routes/*463.21*/.Assets.at("lib/Eonasdan-bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js")),format.raw/*463.107*/("""" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*464.62*/routes/*464.68*/.Assets.at("lib/Eonasdan-bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css")),format.raw/*464.156*/("""">
<script src=""""),_display_(/*465.15*/routes/*465.21*/.Assets.at("lib/moment/locale/es.js")),format.raw/*465.58*/("""" type="text/javascript"></script>    """))}
  }

  def render(id:Long,recursoForm:Form[Recurso],recurso:Recurso): play.twirl.api.HtmlFormat.Appendable = apply(id,recursoForm,recurso)

  def f:((Long,Form[Recurso],Recurso) => play.twirl.api.HtmlFormat.Appendable) = (id,recursoForm,recurso) => apply(id,recursoForm,recurso)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/editMasterForm.scala.html
                  HASH: 4c4a11d3f381d62d6a761cb7796391f2fb96b232
                  MATRIX: 760->1|916->81|948->105|1035->62|1063->162|1091->164|1162->209|1176->215|1233->252|1268->262|1279->266|1317->268|1346->270|1673->570|1690->577|1731->596|1811->650|1944->773|1985->775|2025->789|2082->825|2119->835|2205->894|2240->920|2279->921|2333->947|2498->1081|2539->1095|2574->1121|2613->1122|2658->1139|2828->1278|2867->1290|2945->1341|2960->1347|3006->1372|3159->1495|3189->1498|4011->2290|4045->2297|4136->2360|4165->2361|4194->2363|4255->2396|4284->2397|4315->2401|4372->2431|4400->2432|5595->3599|5624->3600|5659->3608|5735->3656|5764->3657|6032->3897|6061->3898|6118->3926|6148->3927|6192->3943|6422->4145|6451->4146|6487->4154|6537->4175|6567->4176|6599->4180|6664->4217|6681->4224|6716->4237|6773->4267|6810->4294|6850->4295|6882->4299|7059->4445|7090->4449|7126->4475|7166->4476|7200->4482|7403->4654|7434->4658|7471->4685|7511->4686|7543->4690|7805->4921|7836->4925|7873->4952|7913->4953|7937->4959|7951->4965|7991->4966|8023->4970|8059->4979|8101->5004|8141->5005|8177->5013|8269->5077|8280->5078|8309->5085|8390->5138|8401->5139|8431->5147|8512->5200|8523->5201|8553->5209|8590->5219|8620->5239|8660->5240|8695->5247|8766->5290|8777->5291|8812->5304|8895->5359|8906->5360|8944->5376|8985->5386|9019->5392|9097->5442|9108->5443|9146->5459|9195->5477|9231->5482|9267->5490|9554->5750|9595->5781|9635->5782|9658->5787|9672->5792|9712->5793|9746->5800|9872->5908|9913->5909|9947->5915|10046->5986|10072->5990|10111->6001|10122->6002|10161->6019|10198->6029|10289->6110|10329->6111|10364->6118|10441->6167|10467->6171|10540->6216|10566->6220|10630->6256|10641->6257|10666->6260|10713->6279|10724->6280|10760->6294|10815->6321|10841->6325|10879->6335|10890->6336|10938->6362|10990->6386|11016->6390|11054->6400|11065->6401|11090->6404|11226->6509|11262->6514|11299->6523|11698->6891|11730->6895|11828->6966|11871->6999|11911->7000|11939->7010|11953->7015|11993->7016|12026->7022|12076->7055|12116->7056|12150->7062|12201->7085|12214->7088|12244->7096|12305->7129|12318->7132|12349->7141|12389->7150|12425->7155|12464->7166|12514->7189|12558->7223|12598->7224|12632->7230|13202->7773|13266->7820|13306->7821|13346->7833|13400->7859|13411->7860|13439->7866|13512->7911|13523->7912|13551->7918|13671->8010|13682->8011|13710->8017|13773->8052|13784->8053|13818->8065|13917->8136|13928->8137|13956->8143|14053->8212|14064->8213|14092->8219|14195->8294|14206->8295|14234->8301|14279->8317|14309->8318|14344->8325|14383->8336|14394->8337|14422->8343|14469->8362|14498->8363|14624->8461|14635->8462|14684->8489|14714->8490|14744->8491|14774->8492|14809->8499|14894->8556|14923->8557|14963->8569|15081->8659|15092->8660|15145->8691|15175->8692|15205->8693|15235->8694|15270->8701|15310->8713|15321->8714|15349->8720|15424->8767|15435->8768|15463->8774|15505->8788|15516->8789|15544->8795|15774->8997|15785->8998|15813->9004|15855->9018|15866->9019|15894->9025|16023->9126|16034->9127|16062->9133|16104->9147|16115->9148|16143->9154|16286->9269|16315->9270|16353->9277|16389->9282|16424->9289|16497->9335|16535->9363|16575->9364|16608->9369|16718->9452|16763->9487|16803->9488|16839->9496|16901->9540|16915->9545|16955->9546|16989->9552|17084->9619|17101->9626|17158->9661|17197->9669|17233->9674|17273->9686|17318->9704|17363->9732|17403->9733|17436->9738|17482->9756|17521->9773|17582->9803|17618->9811|17679->9844|17700->9855|17751->9884|18338->10443|18355->10450|18397->10469|18435->10478|18453->10485|18499->10508|18561->10542|18590->10543|18626->10551|18731->10627|18761->10628|18794->10633|18941->10752|18970->10753|19078->10832|19108->10833|19140->10837|19269->10937|19299->10938|19332->10943|19421->11004|19450->11005|19479->11006|19513->11011|19543->11012|19576->11017|19666->11079|19695->11080|19726->11083|19755->11084|19855->11155|19885->11156|19920->11163|19975->11189|20005->11190|20038->11195|20230->11359|20259->11360|20288->11361|20322->11366|20352->11367|20385->11372|20530->11489|20559->11490|20590->11493|20619->11494|20713->11559|20743->11560|20775->11564|20833->11593|20863->11594|20896->11599|21048->11723|21077->11724|21109->11728|21167->11757|21197->11758|21230->11763|21432->11937|21461->11938|21494->11943|21523->11944|21628->12020|21658->12021|21694->12029|21819->12125|21849->12126|21882->12131|22155->12376|22184->12377|22213->12378|22247->12383|22277->12384|22310->12389|22447->12498|22476->12499|22507->12502|22536->12503|22643->12581|22673->12582|22712->12592|22883->12735|22912->12736|22988->12783|23018->12784|23052->12790|23125->12834|23155->12835|23191->12843|23236->12860|23265->12861|23294->12862|23328->12867|23358->12868|23401->12882|23870->13323|23899->13324|23930->13327|23959->13328|24045->13385|24075->13386|24107->13390|24209->13463|24239->13464|24273->13470|24302->13471|24331->13472|24365->13477|24395->13478|24428->13483|24842->13869|24871->13870|24903->13874|24932->13875|25032->13946|25062->13947|25104->13960|27876->16703|27906->16704|27952->16721|28309->17049|28339->17050|28369->17051|28403->17056|28433->17057|28479->17074|28770->17336|28800->17337|28868->17376|29411->17891|29470->17933|29510->17934|29560->17955|29650->18017|29664->18021|29689->18024|29740->18046|29755->18050|29790->18062|29845->18085|29893->18105|29923->18106|29969->18124|30178->18304|30208->18305|30240->18309|30282->18323|30299->18330|30340->18349|30413->18395|30430->18402|30471->18421|30501->18422|30543->18435|30573->18436|30606->18441|30672->18479|30689->18486|30730->18505|30790->18537|30819->18538|30850->18541|30879->18542|30938->18573|30954->18579|31018->18621|31097->18672|31113->18678|31173->18716|31227->18742|31243->18748|31317->18800|31374->18829|31390->18835|31449->18872|31508->18903|31524->18909|31590->18953|31673->19008|31689->19014|31753->19056|31836->19111|31852->19117|31961->19203|32085->19299|32101->19305|32212->19393|32257->19410|32273->19416|32332->19453
                  LINES: 26->1|28->3|28->3|29->1|30->3|32->5|32->5|32->5|32->5|36->9|36->9|36->9|37->10|40->13|40->13|40->13|43->16|43->16|43->16|45->18|45->18|47->20|49->22|49->22|49->22|50->23|51->24|52->25|52->25|52->25|53->26|54->27|55->28|57->30|57->30|57->30|60->33|61->34|86->59|93->66|96->69|96->69|97->70|97->70|97->70|98->71|100->73|100->73|125->98|125->98|126->99|127->100|127->100|137->110|137->110|140->113|140->113|141->114|145->118|145->118|150->123|150->123|150->123|151->124|151->124|151->124|151->124|152->125|152->125|152->125|153->126|154->127|155->128|155->128|155->128|156->129|157->130|158->131|158->131|158->131|159->132|160->133|161->134|161->134|161->134|162->135|162->135|162->135|163->136|164->137|164->137|164->137|165->138|166->139|166->139|166->139|167->140|167->140|167->140|168->141|168->141|168->141|169->142|169->142|169->142|170->143|170->143|170->143|170->143|171->144|171->144|171->144|172->145|173->146|173->146|173->146|173->146|175->148|176->149|178->151|188->161|188->161|188->161|189->162|189->162|189->162|190->163|190->163|190->163|191->164|192->165|192->165|192->165|192->165|192->165|193->166|193->166|193->166|194->167|194->167|194->167|195->168|195->168|195->168|195->168|195->168|195->168|195->168|195->168|196->169|196->169|196->169|196->169|196->169|197->170|197->170|197->170|197->170|197->170|199->172|200->173|202->175|207->180|209->182|212->185|212->185|212->185|213->186|213->186|213->186|214->187|214->187|214->187|215->188|215->188|215->188|215->188|216->189|216->189|216->189|217->190|218->191|220->193|221->194|221->194|221->194|222->195|229->202|229->202|229->202|230->203|231->204|231->204|231->204|232->205|232->205|232->205|235->208|235->208|235->208|235->208|235->208|235->208|236->209|236->209|236->209|238->211|238->211|238->211|240->213|240->213|240->213|240->213|240->213|241->214|241->214|241->214|241->214|242->215|242->215|245->218|245->218|245->218|245->218|245->218|245->218|246->219|247->220|247->220|249->222|250->223|250->223|250->223|250->223|250->223|250->223|251->224|251->224|251->224|251->224|252->225|252->225|252->225|252->225|252->225|252->225|257->230|257->230|257->230|257->230|257->230|257->230|261->234|261->234|261->234|261->234|261->234|261->234|266->239|266->239|267->240|268->241|270->243|271->244|271->244|271->244|272->245|274->247|274->247|274->247|275->248|276->249|276->249|276->249|277->250|278->251|278->251|278->251|279->252|280->253|283->256|284->257|284->257|284->257|285->258|285->258|285->258|286->259|288->261|289->262|289->262|289->262|303->276|303->276|303->276|303->276|303->276|303->276|305->278|305->278|309->282|309->282|309->282|310->283|312->285|312->285|314->287|314->287|315->288|316->289|316->289|317->290|318->291|318->291|318->291|318->291|318->291|319->292|320->293|320->293|321->294|321->294|323->296|323->296|324->297|324->297|324->297|325->298|328->301|328->301|328->301|328->301|328->301|329->302|332->305|332->305|333->306|333->306|335->308|335->308|336->309|336->309|336->309|337->310|340->313|340->313|341->314|341->314|341->314|342->315|345->318|345->318|346->319|346->319|349->322|349->322|350->323|351->324|351->324|352->325|356->329|356->329|356->329|356->329|356->329|357->330|359->332|359->332|360->333|360->333|364->337|364->337|365->338|367->340|367->340|372->345|372->345|373->346|374->347|374->347|375->348|376->349|376->349|376->349|376->349|376->349|377->350|383->356|383->356|384->357|384->357|386->359|386->359|387->360|388->361|388->361|389->362|389->362|389->362|389->362|389->362|390->363|395->368|395->368|396->369|396->369|402->375|402->375|403->376|440->413|440->413|441->414|445->418|445->418|445->418|445->418|445->418|446->419|451->424|451->424|454->427|461->434|461->434|461->434|462->435|462->435|462->435|462->435|462->435|462->435|462->435|463->436|464->437|464->437|468->441|470->443|470->443|471->444|471->444|471->444|471->444|473->446|473->446|473->446|473->446|473->446|473->446|474->447|474->447|474->447|474->447|475->448|475->448|476->449|476->449|479->452|479->452|479->452|482->455|482->455|482->455|483->456|483->456|483->456|486->459|486->459|486->459|488->461|488->461|488->461|489->462|489->462|489->462|490->463|490->463|490->463|491->464|491->464|491->464|492->465|492->465|492->465
                  -- GENERATED --
              */
          