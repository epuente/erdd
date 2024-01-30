
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
object createMaster extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Recurso],List[RecursoAutor],Recurso,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recursoForm: Form[Recurso], autores: List[RecursoAutor], recurso: Recurso = null):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.84*/("""
"""),format.raw/*3.83*/(""" 
  
"""),format.raw/*5.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.46*/routes/*5.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*5.89*/(""""/>

"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
	    """),format.raw/*8.6*/("""<div class=container-fluid style="background-color: white; padding: 10px; display: none;">   
			<div class="row">
				<div class="col-md-12">
	    			<h3>Cédula de Solicitud de Evaluación Técnico-Pedagógica de Recurso Didáctico Digital</h3>			
				</div>			
			</div>    
			<section id="masterForm">
			    """),_display_(/*15.9*/form(CSRF(routes.RecursoWebController.mastersave()), 'role -> "form", 'id -> "este", 'enctype -> "multipart/form-data", 'class->"form")/*15.144*/ {_display_(Seq[Any](format.raw/*15.146*/("""	
					"""),_display_(/*16.7*/masterForm(recursoForm, null, recurso)),format.raw/*16.45*/("""
					"""),format.raw/*17.6*/("""<div class="row">
						<div class="col-md-12">
					        <div class="actions">
					        	<div class="row">
					        		<div class="col-sm-6">
						        		<input type="submit" value="Enviar solicitud" class="btn btn-success btn-lg center-block btn-block" style="width: 70%">
					        		</div>
					        		<div class="col-sm-6"> 
				            			<a href=""""),_display_(/*25.30*/routes/*25.36*/.RecursoWebController.index()),format.raw/*25.65*/("""" class="btn btn-primary btn-lg center-block btn-block" style="width: 70%">Cancelar</a>				        		
					        		</div>
					        	</div>
					              
		 
					        </div>
				        </div>
			        </div>			
			    """)))}),format.raw/*33.9*/("""
			"""),format.raw/*34.4*/("""</section>			
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
""")))}),format.raw/*55.2*/("""
"""),format.raw/*56.1*/("""<script type="text/javascript">
	$(document).ready(function() """),format.raw/*57.31*/("""{"""),format.raw/*57.32*/("""
		"""),format.raw/*58.3*/("""$('#este')[0].reset();
		$("[name*='btnObservacion_']").hide();
		$('#labelModalidad').html("Modalidad");
		$("label[for='dirigidoa_id']:eq(1)").hide();
		$('#este').validator();
		$('#formatoentregaotro').parent().hide();
		$("label[for='formatoentregaotro']").hide();
		$('#alcancecurricularotro,  label[for="alcancecurricularotro"]').hide();
		agregarAutor();
		$("select[name='autor.autorfuncion0'] option:eq(1)").attr("selected",true);	
		for ( i=0;i<=4;i++)"""),format.raw/*68.22*/("""{"""),format.raw/*68.23*/("""
			"""),format.raw/*69.4*/("""agregarPalabra();
			
		"""),format.raw/*71.3*/("""}"""),format.raw/*71.4*/("""


		"""),_display_(/*74.4*/for(tdoc<-models.Tipodocumento.find.all()) yield /*74.46*/{_display_(Seq[Any](format.raw/*74.47*/("""
			"""),_display_(/*75.5*/if(tdoc.obligatorio == 1)/*75.30*/{_display_(Seq[Any](format.raw/*75.31*/(""" 
	            """),format.raw/*76.14*/("""agregarDocumento2();
	            var num =  $("select[name^='documento.tipodocumento']:last").prop("name").substring(23);
	            $("select[name^='documento.tipodocumento']:last option[value="""),_display_(/*78.76*/tdoc/*78.80*/.id),format.raw/*78.83*/("""]").prop("selected", true);
	            $("select[name^='documento.tipodocumento']:last").prop("disabled", true);            
	            $("#btnQuitarDocto"+num).hide();
			""")))}),format.raw/*81.5*/("""
		""")))}),format.raw/*82.4*/("""
		
		
		"""),format.raw/*85.3*/("""$("select[name^='documento.tipodocumento'] option:selected").each(function()"""),format.raw/*85.79*/("""{"""),format.raw/*85.80*/("""
			"""),format.raw/*86.4*/("""var num = $(this).parent().prop('name').substr("documento.tipodocumento".length);
			if (""""),_display_(/*87.10*/models/*87.16*/.Tipodocumento.find.where().eq("obligatorio",1).findIds()),format.raw/*87.73*/("""".indexOf($(this).val()) != -1 )
				$("#btnQuitarDocto"+num).hide();
		"""),format.raw/*89.3*/("""}"""),format.raw/*89.4*/(""");
		
		
		
	//	agregarDocumento();
		
		
		$('#titulo').focus();
		$("select[name*='documento.tipodocumento']").css("font-size","85%");
		$('.container-fluid').show();
		$("#titulo").focus();
		
		$("input[type='text']:required, textarea:required").attr("data-error", "Complete este campo");
		$("select:required").attr("data-error", "Seleccione una opción de la lista");
		$("input[type='radio']:required").attr("data-error", "Seleccione una opción");
		$("input[type='file']:required").attr("data-error", "Seleccione un archivo.");

		
		
/* 		$('#elaboracion').datepicker("""),format.raw/*108.35*/("""{"""),format.raw/*108.36*/("""
		    """),format.raw/*109.7*/("""language: "es",
		    format: "dd/mm/yyyy",
			autoclose: true,
			todayBtn: true,
			todayHighlight: true			
		"""),format.raw/*114.3*/("""}"""),format.raw/*114.4*/(""");	 */
		
		
		$('#elaboracion').datetimepicker("""),format.raw/*117.36*/("""{"""),format.raw/*117.37*/("""
			 """),format.raw/*118.5*/("""locale: 'es',
			 format: 'L'
		"""),format.raw/*120.3*/("""}"""),format.raw/*120.4*/(""");		
		
		$("#elaboracion").prop("required", true);
		
		// Selecciona Horas como la unidad de medida para alcance curricular
		$("#unidadmedida option:eq(1)").prop("selected", true).change();

		$(".form-control").css("height","initial");
	"""),format.raw/*128.2*/("""}"""),format.raw/*128.3*/(""");
	
	$( document ).on( "change", "[name^='documento.nombrearchivo']", function(event) """),format.raw/*130.83*/("""{"""),format.raw/*130.84*/("""	
		"""),format.raw/*131.3*/("""var num =  $(this).attr('name').substring("documento.nombrearchivo".length);
		var extension = $(this).val().search(".pdf");
		$("#na"+num).html($(this).val());
		if (extension==-1)"""),format.raw/*134.21*/("""{"""),format.raw/*134.22*/("""
			"""),format.raw/*135.4*/("""///alert("El archivo no es pdf!!!!!");
			$(this).val('');
			$("#na"+num).html('');
			event.preventDefault();
		"""),format.raw/*139.3*/("""}"""),format.raw/*139.4*/("""
	"""),format.raw/*140.2*/("""}"""),format.raw/*140.3*/(""");
	
	$( document ).on( "change", "[name*='autor.autorfuncion']", function() """),format.raw/*142.73*/("""{"""),format.raw/*142.74*/("""
		"""),format.raw/*143.3*/("""var num =  $(this).attr('name').substring("autor.autorfuncion".length);		
		if ($(this).val() == 9)"""),format.raw/*144.26*/("""{"""),format.raw/*144.27*/("""
			"""),format.raw/*145.4*/("""$("input[name='autor.otroTipoAutoria"+num+"']").show();  
		"""),format.raw/*146.3*/("""}"""),format.raw/*146.4*/(""" """),format.raw/*146.5*/("""else """),format.raw/*146.10*/("""{"""),format.raw/*146.11*/("""
			"""),format.raw/*147.4*/("""$("input[name='autor.otroTipoAutoria"+num+"']").hide();			
		"""),format.raw/*148.3*/("""}"""),format.raw/*148.4*/("""
	"""),format.raw/*149.2*/("""}"""),format.raw/*149.3*/(""");
	
	$( document ).on( "click", "[name='version.id']", function() """),format.raw/*151.63*/("""{"""),format.raw/*151.64*/("""	
		"""),format.raw/*152.3*/("""if ( $(this).val() == 2  )"""),format.raw/*152.29*/("""{"""),format.raw/*152.30*/("""
			"""),format.raw/*153.4*/("""$("#divVersion").show();
		"""),format.raw/*154.3*/("""}"""),format.raw/*154.4*/(""" """),format.raw/*154.5*/("""else """),format.raw/*154.10*/("""{"""),format.raw/*154.11*/("""
			"""),format.raw/*155.4*/("""$("#va_numcontrol").val("");
			$("#msgBuscarNc").html("");			
			$("#divVersion").hide();
			$("#divNumControl").hide();
		"""),format.raw/*159.3*/("""}"""),format.raw/*159.4*/("""
	"""),format.raw/*160.2*/("""}"""),format.raw/*160.3*/(""");
	
	$( document ).on( "click", "[name='extra1']", function() """),format.raw/*162.59*/("""{"""),format.raw/*162.60*/("""
		"""),format.raw/*163.3*/("""if (   $(this).val() == "N" )"""),format.raw/*163.32*/("""{"""),format.raw/*163.33*/("""
			"""),format.raw/*164.4*/("""$("#va_numcontrol").val("");
			$("#msgBuscarNc").html("");
			$("#divNumControl").hide();			
		"""),format.raw/*167.3*/("""}"""),format.raw/*167.4*/("""
		"""),format.raw/*168.3*/("""if (   $(this).val() == "S" )"""),format.raw/*168.32*/("""{"""),format.raw/*168.33*/("""
			"""),format.raw/*169.4*/("""$("#divNumControl").show();			
		"""),format.raw/*170.3*/("""}"""),format.raw/*170.4*/("""		
	"""),format.raw/*171.2*/("""}"""),format.raw/*171.3*/(""");		
	


	$(document).on("keydown change blur", "textarea", function(event)"""),format.raw/*175.67*/("""{"""),format.raw/*175.68*/("""				
		"""),format.raw/*176.3*/("""var tam = $(this).val().length;
		if (tam >= 600 && (event.which != 8  && event.which != 46  ))"""),format.raw/*177.64*/("""{"""),format.raw/*177.65*/("""
			"""),format.raw/*178.4*/("""console.log("tam excedido");
			event.preventDefault();
			$(this).parent().find(".help-block").html('<ul class="list-unstyled"><li>Este campo ha excedido los 600 caracteres</li></ul>');
			$(this).parent().parent().addClass("has-error");
		"""),format.raw/*182.3*/("""}"""),format.raw/*182.4*/(""" """),format.raw/*182.5*/("""else """),format.raw/*182.10*/("""{"""),format.raw/*182.11*/("""
			"""),format.raw/*183.4*/("""$(this).parent().find(".help-block").html('');
			$(this).parent().parent().removeClass("has-error");			
		"""),format.raw/*185.3*/("""}"""),format.raw/*185.4*/("""
	"""),format.raw/*186.2*/("""}"""),format.raw/*186.3*/(""");

	
	
    $( document ).on( "change" ,"#unidadmedida_id", function(e)"""),format.raw/*190.64*/("""{"""),format.raw/*190.65*/("""
        """),format.raw/*191.9*/("""var texto = $("#unidadmedida_id option:selected").text();
        $("#duracion").prop("placeholder", "Número de "+ texto.toLowerCase());
    """),format.raw/*193.5*/("""}"""),format.raw/*193.6*/("""); 	
	
    
    $(document).on("change", "#niveleducativo_id", function(e)"""),format.raw/*196.63*/("""{"""),format.raw/*196.64*/("""
    	"""),format.raw/*197.6*/("""filtradoUnidadesAcademicas();
    """),format.raw/*198.5*/("""}"""),format.raw/*198.6*/(""");
    
	
	$("#este").submit(function(event)"""),format.raw/*201.35*/("""{"""),format.raw/*201.36*/("""
		"""),format.raw/*202.3*/("""if(!preValidar())"""),format.raw/*202.20*/("""{"""),format.raw/*202.21*/("""
			"""),format.raw/*203.4*/("""event.preventDefault();
		"""),format.raw/*204.3*/("""}"""),format.raw/*204.4*/(""" """),format.raw/*204.5*/("""else """),format.raw/*204.10*/("""{"""),format.raw/*204.11*/("""
			"""),format.raw/*205.4*/("""$('#elaboracion').removeAttr("pattern");
			$('#elaboracion').val(    moment($('#elaboracion').val(),"DD/MM/YYYY").format("YYYY-MM-DD")  );
			$("select[name^='documento.tipodocumento'] option").prop("disabled", false);
			$("select[name^='documento.tipodocumento']").removeAttr("disabled");
			$("select[name^='documento.tipodocumento']").removeAttr("required");
			return true;		
		"""),format.raw/*211.3*/("""}"""),format.raw/*211.4*/(""" 		
	"""),format.raw/*212.2*/("""}"""),format.raw/*212.3*/(""");
	
	$('#este').validator().on('submit', function (e) """),format.raw/*214.51*/("""{"""),format.raw/*214.52*/("""
		  """),format.raw/*215.5*/("""if (e.isDefaultPrevented()) """),format.raw/*215.33*/("""{"""),format.raw/*215.34*/("""
		  """),format.raw/*216.5*/("""}"""),format.raw/*216.6*/(""" """),format.raw/*216.7*/("""else """),format.raw/*216.12*/("""{"""),format.raw/*216.13*/("""
		    """),format.raw/*217.7*/("""// everything looks good!
		  """),format.raw/*218.5*/("""}"""),format.raw/*218.6*/("""
		"""),format.raw/*219.3*/("""}"""),format.raw/*219.4*/(""")	
	

	
	
	   function agregarDocumento2(insertarEn)"""),format.raw/*224.43*/("""{"""),format.raw/*224.44*/("""
	        """),format.raw/*225.10*/("""var nrenglon = ($("#tableDocumentos div.row").length);  
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
	        renglon+='              <select name="'+"documento.tipodocumento"+nrenglon+'" required="required" class="form-control" >'+$('#auxDocto').html()+'</select>';       
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
	        
	        if (insertarEn==undefined)"""),format.raw/*262.36*/("""{"""),format.raw/*262.37*/("""
	            """),format.raw/*263.14*/("""$('#tableDocumentos').append(renglon);
	            $("[name*='btnObservacion_documento.nombrearchivo"+((nrenglon)-0)+"']").hide();
	            $("[name*='btnObservacion_documento.tipodocumento"+((nrenglon)-0)+"']").hide();
	            $("select[name*='documento.tipodocumento']").css("font-size","85%");
	        """),format.raw/*267.10*/("""}"""),format.raw/*267.11*/(""" """),format.raw/*267.12*/("""else """),format.raw/*267.17*/("""{"""),format.raw/*267.18*/("""
	            """),format.raw/*268.14*/("""/*
	            $('#documento.nombrearchivo1').css("display","block");
	            $("#documento.nombrearchivo1").show();
	            $('#documento.nombrearchivo1').swap('[name="observacion_documento.nombrearchivo1"]');
	            */
	        """),format.raw/*273.10*/("""}"""),format.raw/*273.11*/("""
	        
	        
	        """),format.raw/*276.10*/("""//Cuando hay observaciones en documentos, en los selects visibles habilitar solo las options relacionadas al tipo de documento con observaciones
	        //$("select[name^='documento.tipodocumento'] option").attr("disabled","disabled");
	        //alert("se desactivaron!!!!!!");
	        /*
	        $("input[id^='btnQuitarDocto']:visible").each(function(ir, r)"""),format.raw/*280.71*/("""{"""),format.raw/*280.72*/("""          
	            """),format.raw/*281.14*/("""var num =  $(r).attr('id').substring('btnQuitarDocto'.length);
	            $("select[name^='documento.tipodocumento'] option").prop("disabled",true);
	            var texto =  $("div[id=ta"+num+"]").html();
	            arrString.push(texto);
	        """),format.raw/*285.10*/("""}"""),format.raw/*285.11*/(""");     
	        
	        alert(arrString);
	            $.each(arrString, function( index, value ) """),format.raw/*288.57*/("""{"""),format.raw/*288.58*/("""
	                
	                """),format.raw/*290.18*/("""alert("value "+value);
	                
	                if (value.length > 0)"""),format.raw/*292.39*/("""{"""),format.raw/*292.40*/("""
	                    """),format.raw/*293.22*/("""$("select[name^='documento.tipodocumento'] option:contains('"+value+"')").prop("disabled", false);
	                """),format.raw/*294.18*/("""}"""),format.raw/*294.19*/("""
	            """),format.raw/*295.14*/("""}"""),format.raw/*295.15*/(""");
	            */
	            $('#tableDocumentos div.row:even').css("background-color", "#f7f7f7");
	            
	            // Deshabilita o habilita los options del tipo de archivo dependiendo si es obligatorio   
	            """),_display_(/*300.15*/for(tdoc<-models.Tipodocumento.find.all()) yield /*300.57*/{_display_(Seq[Any](format.raw/*300.58*/("""
	                """),format.raw/*301.18*/("""$("select[name^='documento.tipodocumento']:last option[value="""),_display_(/*301.80*/tdoc/*301.84*/.id),format.raw/*301.87*/("""]").prop("disabled", """),_display_(/*301.109*/tdoc/*301.113*/.obligatorio),format.raw/*301.125*/("""==1);
	            """)))}),format.raw/*302.15*/("""           
	    """),format.raw/*303.6*/("""}"""),format.raw/*303.7*/("""   
"""),format.raw/*304.1*/("""</script>
<script src=""""),_display_(/*305.15*/routes/*305.21*/.Assets.at("javascripts/validator.min.js")),format.raw/*305.63*/("""" type="text/javascript" async"></script>

<script src=""""),_display_(/*307.15*/routes/*307.21*/.Assets.at("javascripts/recursos.js")),format.raw/*307.58*/("""" ></script>
<script src=""""),_display_(/*308.15*/routes/*308.21*/.Assets.at("javascripts/utilerias.js")),format.raw/*308.59*/(""""></script>
<script src=""""),_display_(/*309.15*/routes/*309.21*/.Assets.at("lib/moment/min/moment.min.js")),format.raw/*309.63*/(""""></script>

<script src=""""),_display_(/*311.15*/routes/*311.21*/.Assets.at("lib/bootstrap/js/transition.js")),format.raw/*311.65*/("""" type="text/javascript" defer></script>
<script src=""""),_display_(/*312.15*/routes/*312.21*/.Assets.at("lib/bootstrap/js/collapse.js")),format.raw/*312.63*/("""" type="text/javascript" defer></script>
<script src=""""),_display_(/*313.15*/routes/*313.21*/.Assets.at("lib/Eonasdan-bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js")),format.raw/*313.107*/("""" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*314.62*/routes/*314.68*/.Assets.at("lib/Eonasdan-bootstrap-datetimepicker/css/bootstrap-datetimepicker.min.css")),format.raw/*314.156*/("""">
<script src=""""),_display_(/*315.15*/routes/*315.21*/.Assets.at("lib/moment/locale/es.js")),format.raw/*315.58*/("""" type="text/javascript"></script>



"""))}
  }

  def render(recursoForm:Form[Recurso],autores:List[RecursoAutor],recurso:Recurso): play.twirl.api.HtmlFormat.Appendable = apply(recursoForm,autores,recurso)

  def f:((Form[Recurso],List[RecursoAutor],Recurso) => play.twirl.api.HtmlFormat.Appendable) = (recursoForm,autores,recurso) => apply(recursoForm,autores,recurso)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/createMaster.scala.html
                  HASH: bfcfb7f612de7fcf057cb4efcabf0ae87d8278e4
                  MATRIX: 772->1|949->102|981->126|1068->83|1096->183|1127->188|1198->233|1212->239|1269->276|1300->282|1311->286|1349->288|1381->294|1717->604|1862->739|1903->741|1937->749|1996->787|2029->793|2435->1172|2450->1178|2500->1207|2767->1444|2798->1448|3609->2229|3637->2230|3727->2292|3756->2293|3786->2296|4277->2759|4306->2760|4337->2764|4388->2788|4416->2789|4448->2795|4506->2837|4545->2838|4576->2843|4610->2868|4649->2869|4692->2884|4917->3082|4930->3086|4954->3089|5161->3266|5195->3270|5231->3279|5335->3355|5364->3356|5395->3360|5513->3451|5528->3457|5606->3514|5705->3586|5733->3587|6338->4163|6368->4164|6403->4171|6543->4283|6572->4284|6649->4332|6679->4333|6712->4338|6772->4370|6801->4371|7070->4612|7099->4613|7215->4700|7245->4701|7277->4705|7487->4886|7517->4887|7549->4891|7691->5005|7720->5006|7750->5008|7779->5009|7885->5086|7915->5087|7946->5090|8074->5189|8104->5190|8136->5194|8224->5254|8253->5255|8282->5256|8316->5261|8346->5262|8378->5266|8467->5327|8496->5328|8526->5330|8555->5331|8651->5398|8681->5399|8713->5403|8768->5429|8798->5430|8830->5434|8885->5461|8914->5462|8943->5463|8977->5468|9007->5469|9039->5473|9191->5597|9220->5598|9250->5600|9279->5601|9371->5664|9401->5665|9432->5668|9490->5697|9520->5698|9552->5702|9676->5798|9705->5799|9736->5802|9794->5831|9824->5832|9856->5836|9917->5869|9946->5870|9978->5874|10007->5875|10111->5950|10141->5951|10176->5958|10300->6053|10330->6054|10362->6058|10631->6299|10660->6300|10689->6301|10723->6306|10753->6307|10785->6311|10920->6418|10949->6419|10979->6421|11008->6422|11108->6493|11138->6494|11175->6503|11344->6644|11373->6645|11476->6719|11506->6720|11540->6726|11602->6760|11631->6761|11704->6805|11734->6806|11765->6809|11811->6826|11841->6827|11873->6831|11927->6857|11956->6858|11985->6859|12019->6864|12049->6865|12081->6869|12493->7253|12522->7254|12555->7259|12584->7260|12668->7315|12698->7316|12731->7321|12788->7349|12818->7350|12851->7355|12880->7356|12909->7357|12943->7362|12973->7363|13008->7370|13066->7400|13095->7401|13126->7404|13155->7405|13236->7457|13266->7458|13305->7468|15977->10111|16007->10112|16050->10126|16395->10442|16425->10443|16455->10444|16489->10449|16519->10450|16562->10464|16838->10711|16868->10712|16927->10742|17318->11104|17348->11105|17401->11129|17683->11382|17713->11383|17843->11484|17873->11485|17938->11521|18046->11600|18076->11601|18127->11623|18272->11739|18302->11740|18345->11754|18375->11755|18638->11990|18697->12032|18737->12033|18784->12051|18874->12113|18888->12117|18913->12120|18964->12142|18979->12146|19014->12158|19066->12178|19111->12195|19140->12196|19172->12200|19224->12224|19240->12230|19304->12272|19389->12329|19405->12335|19464->12372|19519->12399|19535->12405|19595->12443|19649->12469|19665->12475|19729->12517|19784->12544|19800->12550|19866->12594|19949->12649|19965->12655|20029->12697|20112->12752|20128->12758|20237->12844|20361->12940|20377->12946|20488->13034|20533->13051|20549->13057|20608->13094
                  LINES: 26->1|28->3|28->3|29->1|30->3|32->5|32->5|32->5|32->5|34->7|34->7|34->7|35->8|42->15|42->15|42->15|43->16|43->16|44->17|52->25|52->25|52->25|60->33|61->34|82->55|83->56|84->57|84->57|85->58|95->68|95->68|96->69|98->71|98->71|101->74|101->74|101->74|102->75|102->75|102->75|103->76|105->78|105->78|105->78|108->81|109->82|112->85|112->85|112->85|113->86|114->87|114->87|114->87|116->89|116->89|135->108|135->108|136->109|141->114|141->114|144->117|144->117|145->118|147->120|147->120|155->128|155->128|157->130|157->130|158->131|161->134|161->134|162->135|166->139|166->139|167->140|167->140|169->142|169->142|170->143|171->144|171->144|172->145|173->146|173->146|173->146|173->146|173->146|174->147|175->148|175->148|176->149|176->149|178->151|178->151|179->152|179->152|179->152|180->153|181->154|181->154|181->154|181->154|181->154|182->155|186->159|186->159|187->160|187->160|189->162|189->162|190->163|190->163|190->163|191->164|194->167|194->167|195->168|195->168|195->168|196->169|197->170|197->170|198->171|198->171|202->175|202->175|203->176|204->177|204->177|205->178|209->182|209->182|209->182|209->182|209->182|210->183|212->185|212->185|213->186|213->186|217->190|217->190|218->191|220->193|220->193|223->196|223->196|224->197|225->198|225->198|228->201|228->201|229->202|229->202|229->202|230->203|231->204|231->204|231->204|231->204|231->204|232->205|238->211|238->211|239->212|239->212|241->214|241->214|242->215|242->215|242->215|243->216|243->216|243->216|243->216|243->216|244->217|245->218|245->218|246->219|246->219|251->224|251->224|252->225|289->262|289->262|290->263|294->267|294->267|294->267|294->267|294->267|295->268|300->273|300->273|303->276|307->280|307->280|308->281|312->285|312->285|315->288|315->288|317->290|319->292|319->292|320->293|321->294|321->294|322->295|322->295|327->300|327->300|327->300|328->301|328->301|328->301|328->301|328->301|328->301|328->301|329->302|330->303|330->303|331->304|332->305|332->305|332->305|334->307|334->307|334->307|335->308|335->308|335->308|336->309|336->309|336->309|338->311|338->311|338->311|339->312|339->312|339->312|340->313|340->313|340->313|341->314|341->314|341->314|342->315|342->315|342->315
                  -- GENERATED --
              */
          