
package views.html.EvaluacionEvaluador

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
object create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Recursoevaluador,List[EvaluacionTabla],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(re: Recursoevaluador, cr:List[EvaluacionTabla],  mensajes:String ):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.69*/("""
"""),format.raw/*3.83*/(""" 
"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*4.89*/(""""/>
"""),_display_(/*5.2*/re/*5.4*/.observacionEvaluacion),format.raw/*5.26*/("""
"""),_display_(/*6.2*/main/*6.6*/{_display_(Seq[Any](format.raw/*6.7*/("""
	"""),format.raw/*7.2*/("""<div style="background-color: white; padding: 10px" >  
		<div style="display: none;" id="divGral">
			<h3>Evaluación del aspecto  """),_display_(/*9.33*/re/*9.35*/.aspecto.descripcion),format.raw/*9.55*/("""  """),format.raw/*9.57*/("""del recurso: """),_display_(/*9.71*/re/*9.73*/.recurso.titulo),format.raw/*9.88*/(""" """),format.raw/*9.89*/("""&nbsp;<span class="badge" id="bdg"""),_display_(/*9.123*/re/*9.125*/.aspecto.id),format.raw/*9.136*/("""" data-toggle="popover" data-title="Detalle de calificación" data-trigger="hover" title="Calificación" style="display: none" ></span></h3>
			Clasificación:   """),_display_(/*10.22*/re/*10.24*/.recurso.clasificacion.criterio1.descripcion),format.raw/*10.68*/(""" """),format.raw/*10.69*/("""/ """),_display_(/*10.72*/re/*10.74*/.recurso.clasificacion.criterio2.descripcion),format.raw/*10.118*/(""" """),format.raw/*10.119*/("""/ """),_display_(/*10.122*/re/*10.124*/.recurso.clasificacion.criterio3.catalogo.descripcion),format.raw/*10.177*/("""
			"""),format.raw/*11.4*/("""<br>
			Tipo de recurso: """),_display_(/*12.22*/re/*12.24*/.recurso.clasificacion.tiporecurso.descripcion),format.raw/*12.70*/("""


			"""),format.raw/*15.4*/("""<!-- Modal -->
			"""),_display_(/*16.5*/form(routes.CancelacionController.solicitudCancelacion(re.recurso.id), 'role -> "form", 'style->"background-color: white;", 'id->"frmModal")/*16.145*/ {_display_(Seq[Any](format.raw/*16.147*/("""
				"""),_display_(/*17.6*/CSRF/*17.10*/.formField),format.raw/*17.20*/("""
				"""),format.raw/*18.5*/("""<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				  <div class="modal-dialog">
				    <div class="modal-content">
				      <div class="modal-header">
				        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				        <h4 class="modal-title" id="myModalTitle"></h4>
				      </div>
				      <div class="modal-body" id="modalBody">						
				      </div>
				      <div class="modal-footer">
				      	<div class="modalPie"> </div>
				        <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
				        <button type="submit" class="btn btn-danger" id="btnModalSolCancelacion">Solicitar la cancelación del recurso.</button>
				        <button type="button" class="btn btn-primary" id="btnModalSolProrroga">Solicitar prórroga.</button>				        
				      </div>
				    </div>
				  </div>
				</div>	
			""")))}),format.raw/*36.5*/("""

			"""),_display_(/*38.5*/if(!mensajes.isEmpty)/*38.26*/{_display_(Seq[Any](format.raw/*38.27*/("""
				"""),format.raw/*39.5*/("""<div class="alert alert-danger fade in" role="alert">
	        			"""),_display_(/*40.14*/form(CSRF(routes.EvaluacionEvaluadorController.save(re.recurso.id, re.aspecto.id)), 'role -> "form", 'id -> "frmEvaluacion")/*40.138*/ {_display_(Seq[Any](format.raw/*40.140*/("""
							"""),_display_(/*41.9*/mensajes),format.raw/*41.17*/("""
							"""),format.raw/*42.8*/("""<p>  		        			
					        <button type="button" class="btn btn-default" id="btnSolProrroga">Solicitar prórroga</button>
				        """)))}),format.raw/*44.14*/("""			        
			        """),format.raw/*45.12*/("""</p>					        
				</div>
			""")))}/*47.6*/else/*47.11*/{_display_(Seq[Any](format.raw/*47.12*/("""
				"""),_display_(/*48.6*/form(CSRF(routes.EvaluacionEvaluadorController.save(re.recurso.id, re.aspecto.id)), 'role -> "form", 'id -> "frmEvaluacion",'style->"background-color: white;")/*48.165*/ {_display_(Seq[Any](format.raw/*48.167*/("""
					"""),_display_(/*49.7*/evaluacionPanelesForm(re:Recursoevaluador, cr:List[EvaluacionTabla])),format.raw/*49.75*/("""
				""")))}),format.raw/*50.6*/("""
			""")))}),format.raw/*51.5*/("""
			"""),format.raw/*52.4*/("""<!-- 
			<a href='javascript: marcarTodos()'>marcar todos (prueba)</a>
			 -->        
		</div>
		
	</div>
""")))}),format.raw/*58.2*/("""


"""),format.raw/*61.1*/("""<script type="text/javascript">
	$(document).ready(function() """),format.raw/*62.31*/("""{"""),format.raw/*62.32*/("""
		"""),format.raw/*63.3*/("""var aux = 1;
		var cadena ="";
		//Determina cuantas y cuales serán los saltos de paginación 
		for(l=1; l <= $("div.panel-title").length;l++ )"""),format.raw/*66.50*/("""{"""),format.raw/*66.51*/("""
			"""),format.raw/*67.4*/("""if(l%8==0)"""),format.raw/*67.14*/("""{"""),format.raw/*67.15*/("""
				"""),format.raw/*68.5*/("""cadena+="<td style='border-top:none'><div class='center-block'><a href='' data-target='#carouselId"""),_display_(/*68.104*/re/*68.106*/.aspecto.id),format.raw/*68.117*/("""' data-slide-to='"+(aux-1)+"' name='cpPagina'>"+aux+"</a></div></td>";
				aux++;
			"""),format.raw/*70.4*/("""}"""),format.raw/*70.5*/("""
		"""),format.raw/*71.3*/("""}"""),format.raw/*71.4*/("""
		"""),format.raw/*72.3*/("""if($("div.panel-title").length % 8 != 0)"""),format.raw/*72.43*/("""{"""),format.raw/*72.44*/("""
			    """),format.raw/*73.8*/("""cadena+="<td style='border-top:none'><a href='' class='center-block' data-target='#carouselId"""),_display_(/*73.102*/re/*73.104*/.aspecto.id),format.raw/*73.115*/("""' data-slide-to='"+(aux-1)+"' name='cpPagina'>"+aux+"</a></td>";
		"""),format.raw/*74.3*/("""}"""),format.raw/*74.4*/("""
		
		"""),format.raw/*76.3*/("""$("#tablaNavegaCarousel"""),_display_(/*76.27*/re/*76.29*/.aspecto.id),format.raw/*76.40*/("""").html("<tr><td style='border-top:none'><div class='pull-right'><a href='' role='button5' data-slide='prev5' id='carousel"""),_display_(/*76.163*/(re.aspecto.id)),format.raw/*76.178*/("""Anterior'>Anterior</a></div></td>"+cadena+"<td class='pull-left' style='border-top:none'><a href='#carouselId"""),_display_(/*76.288*/re/*76.290*/.aspecto.id),format.raw/*76.301*/("""' id='carousel"""),_display_(/*76.316*/(re.aspecto.id)),format.raw/*76.331*/("""Siguiente'>Siguiente</a></td></tr>");
		
		
		
		
		//$("#tablaNavegaCarousel"""),_display_(/*81.29*/re/*81.31*/.aspecto.id),format.raw/*81.42*/("""").html("<tr><td>HOLA</td></tr>");
		$('[data-toggle="popover"]').popover("""),format.raw/*82.40*/("""{"""),format.raw/*82.41*/("""html: true"""),format.raw/*82.51*/("""}"""),format.raw/*82.52*/(""");
		
		$("[name='cpPagina']:first").click();
		
		$(".panel-default").removeClass("panel-default").addClass("panel-warning");
		leer();
		
		
		

				
		
       
		
		recuento();
	//	$(".badge").hide();
		$("#divGral").show();		
	"""),format.raw/*99.2*/("""}"""),format.raw/*99.3*/(""");



	
	$( document ).on( "click", "#carousel"""),_display_(/*104.40*/(re.aspecto.id)),format.raw/*104.55*/("""Anterior", function(event) """),format.raw/*104.82*/("""{"""),format.raw/*104.83*/("""
		"""),format.raw/*105.3*/("""event.preventDefault();
		var maxPag = $("#tablaNavegaCarousel"""),_display_(/*106.40*/re/*106.42*/.aspecto.id),format.raw/*106.53*/(""" """),format.raw/*106.54*/("""[name='cpPagina']").length;
		var pag = $("#tablaNavegaCarousel"""),_display_(/*107.37*/re/*107.39*/.aspecto.id),format.raw/*107.50*/(""" """),format.raw/*107.51*/("""[name='cpPagina'] span.badge").eq(0).parent().attr("data-slide-to");
		$("a[name='cpPagina']").eq( parseInt(pag)-1 ).click();
		
		$(this).toggle(parseInt(pag) > 1 );
		$("#carousel"""),_display_(/*111.16*/(re.aspecto.id)),format.raw/*111.31*/("""Siguiente").toggle(parseInt(maxPag) != parseInt(pag));
		
	"""),format.raw/*113.2*/("""}"""),format.raw/*113.3*/(""");

	$( document ).on( "click", "#carousel"""),_display_(/*115.40*/(re.aspecto.id)),format.raw/*115.55*/("""Siguiente", function(event) """),format.raw/*115.83*/("""{"""),format.raw/*115.84*/("""
		"""),format.raw/*116.3*/("""event.preventDefault();
		var pag = $("#tablaNavegaCarousel"""),_display_(/*117.37*/re/*117.39*/.aspecto.id),format.raw/*117.50*/(""" """),format.raw/*117.51*/("""[name='cpPagina'] span.badge").eq(0).parent().attr("data-slide-to"); 
		$("a[name='cpPagina']").eq( parseInt(pag)+1 ).click();
	    window.scrollTo(0, 0);
		
	"""),format.raw/*121.2*/("""}"""),format.raw/*121.3*/(""");	
	
	$( document ).on( "click", "input[name^='califica']", function() """),format.raw/*123.67*/("""{"""),format.raw/*123.68*/("""	
		"""),format.raw/*124.3*/("""total = $("input[name^='califica']").length/4 ;
		totalValor = $("input[name^='califica']:checked").length;
		if (  total == totalValor)"""),format.raw/*126.29*/("""{"""),format.raw/*126.30*/("""
			"""),format.raw/*127.4*/("""$("#btnEvaluar").attr("value","Enviar evaluación del recurso");
			$("#btnEvaluar").removeClass("btn-primary").addClass("btn-success");	
			$("#terminado").val("SI");
		"""),format.raw/*130.3*/("""}"""),format.raw/*130.4*/(""" """),format.raw/*130.5*/("""else """),format.raw/*130.10*/("""{"""),format.raw/*130.11*/("""
			"""),format.raw/*131.4*/("""$("#btnEvaluar").attr("value","Guardar la evaluación y continuar más tarde");
			$("#btnEvaluar").addClass("btn-primary").removeClass("btn-success");
			$("#terminado").val("NO");
		"""),format.raw/*134.3*/("""}"""),format.raw/*134.4*/("""
		"""),format.raw/*135.3*/("""toggleColorPanel( $(this).closest( ".panel-warning" )  );
		recuento();
	"""),format.raw/*137.2*/("""}"""),format.raw/*137.3*/(""");
	
	
	function toggleColorPanel(elPanel)"""),format.raw/*140.36*/("""{"""),format.raw/*140.37*/("""
		"""),format.raw/*141.3*/("""if ( $(elPanel).hasClass('panel-warning')  )"""),format.raw/*141.47*/("""{"""),format.raw/*141.48*/("""
			"""),format.raw/*142.4*/("""$(elPanel).removeClass("panel-warning").addClass("panel-success");	
		"""),format.raw/*143.3*/("""}"""),format.raw/*143.4*/(""" """),format.raw/*143.5*/("""else """),format.raw/*143.10*/("""{"""),format.raw/*143.11*/("""
			"""),format.raw/*144.4*/("""$(elPanel).removeClass("panel-success").addClass("panel-warning");
		"""),format.raw/*145.3*/("""}"""),format.raw/*145.4*/("""
	"""),format.raw/*146.2*/("""}"""),format.raw/*146.3*/("""
	
	"""),format.raw/*148.2*/("""$( document ).on( "click", "[id^='btnNA_']", function() """),format.raw/*148.58*/("""{"""),format.raw/*148.59*/("""
		"""),format.raw/*149.3*/("""num = $(this).attr("id").substring("btnNA_".length);		
		if ($(this).attr("value") == "No aplica")"""),format.raw/*150.44*/("""{"""),format.raw/*150.45*/("""		
			"""),format.raw/*151.4*/("""$("input[name='califica"+num+"'][value='-1']").prop("checked",true);
			$("input[name='califica"+num+"']").prop("disabled",true);
			$("input[name='califica"+num+"']").removeClass("activo").addClass("inactivo");
			$(this).attr("value","Volver a habilitar");
			//toggleColorPanel( $(this).closest( ".panel-warning" )  );
		"""),format.raw/*156.3*/("""}"""),format.raw/*156.4*/(""" """),format.raw/*156.5*/("""else """),format.raw/*156.10*/("""{"""),format.raw/*156.11*/("""
			"""),format.raw/*157.4*/("""$("input[name='califica"+num+"'][value='-1']").prop("checked",false);
			$("input[name='califica"+num+"']").prop("disabled",false);
			$("input[name='califica"+num+"']").addClass("activo").removeClass("inactivo");
			$(this).attr("value","No aplica");			
			//toggleColorPanel( $(this).closest( ".panel-success" )  );
			
		"""),format.raw/*163.3*/("""}"""),format.raw/*163.4*/("""
		"""),format.raw/*164.3*/("""toggleColorPanel( $(this).closest( ".panel-warning" )  );
        
        total = $("input[name^='califica']").length/4 ;
        totalValor = $("input[name^='califica']:checked").length;
        if (  total == totalValor)"""),format.raw/*168.35*/("""{"""),format.raw/*168.36*/("""
            """),format.raw/*169.13*/("""$("#btnEvaluar").attr("value","Enviar evaluación del recurso");
            $("#btnEvaluar").removeClass("btn-primary").addClass("btn-success");    
            $("#terminado").val("SI");
        """),format.raw/*172.9*/("""}"""),format.raw/*172.10*/(""" """),format.raw/*172.11*/("""else """),format.raw/*172.16*/("""{"""),format.raw/*172.17*/("""
            """),format.raw/*173.13*/("""$("#btnEvaluar").attr("value","Guardar la evaluación y continuar más tarde");
            $("#btnEvaluar").addClass("btn-primary").removeClass("btn-success");
            $("#terminado").val("NO");
        """),format.raw/*176.9*/("""}"""),format.raw/*176.10*/("""		
		"""),format.raw/*177.3*/("""recuento();
	"""),format.raw/*178.2*/("""}"""),format.raw/*178.3*/(""");
	
	$( document ).on( "click", "[id='btnCancelar']", function() """),format.raw/*180.62*/("""{"""),format.raw/*180.63*/("""
		"""),format.raw/*181.3*/("""$("#myModalTitle").html("Solicitud de cancelación");
		$("#modalBody").html("¿Desea solicitar sea cancelado este recurso?<br><br>En caso de que administrador revise y acepte la solicitud, el recurso pasará al estado 'Evaluación cancelada'.<br><br><table class='table'><tr><td>Motivo de cancelación</td><td><textarea name='motivo'></textarea></td></tr></table>");
		$("#btnModalSolProrroga").hide();
		$("#btnModalSolCancelacion").show();
		$("#myModal").modal('show');
		
	"""),format.raw/*187.2*/("""}"""),format.raw/*187.3*/(""");	
	
	$( document ).on( "click", "[id='btnSolProrroga']", function() """),format.raw/*189.65*/("""{"""),format.raw/*189.66*/("""
		"""),format.raw/*190.3*/("""$("#myModalTitle").html("Solicitud de prórroga");
		$("#modalBody").html("<table class='table'><tr><td>Número de días adicionales</td><td><input type='text' name='ndias' id='ndias' size='3' class='form-control' required></td></tr></table>");
		$("#btnModalSolCancelacion").hide();
		$("#btnModalSolProrroga").show();
		$("#myModal").modal('show');
		
	"""),format.raw/*196.2*/("""}"""),format.raw/*196.3*/(""");	
	
	
	$(document).on("click", "#btnModalSolProrroga", function()"""),format.raw/*199.60*/("""{"""),format.raw/*199.61*/("""
		"""),format.raw/*200.3*/("""var aux= $("#ndias").val();
		var x = jsRoutes.controllers.EvaluacionEvaluadorController.solicitarProrroga();
		var ruta = x.url.substr(0, x.url.substr(1).indexOf("/")+1); 
		$("#frmModal").attr("action", ruta+"/"""),_display_(/*203.41*/re/*203.43*/.recurso.id),format.raw/*203.54*/("""/"""),_display_(/*203.56*/re/*203.58*/.aspecto.id),format.raw/*203.69*/("""/"+aux);
		$("#frmModal").attr("method","POST");
		$("#frmModal").submit();
	"""),format.raw/*206.2*/("""}"""),format.raw/*206.3*/(""");
	
	function recuento()"""),format.raw/*208.21*/("""{"""),format.raw/*208.22*/("""
		"""),format.raw/*209.3*/("""texto = "";
		ac = null; 
		cal = null;
			ac = parseInt("0");
			$("input[type='radio'][name^='califica'].activo:checked").each(function()"""),format.raw/*213.77*/("""{"""),format.raw/*213.78*/("""
				"""),format.raw/*214.5*/("""ac+= parseInt($(this).val());
			"""),format.raw/*215.4*/("""}"""),format.raw/*215.5*/(""");
			cal = Math.round((ac*25)/( $("input[type='radio'][name^='califica'].activo:checked").length*2));			
		(cal!=null)?$("#bdg"""),_display_(/*217.23*/re/*217.25*/.aspecto.id),format.raw/*217.36*/("""").html(cal):"";
		
		if (cal != null)"""),format.raw/*219.19*/("""{"""),format.raw/*219.20*/("""
			"""),format.raw/*220.4*/("""$("#bdg"""),_display_(/*220.12*/re/*220.14*/.aspecto.id),format.raw/*220.25*/("""").html(cal);
			var todos = 				$("input[type='radio'][name^='califica']").length/4;	

			var noAplican = 			$("input[type='radio'][name^='califica'][value='-1'].inactivo:checked").length;
			var noCumple = 				$("input[type='radio'][name^='califica'][value='0'].activo:checked").length;
			var parcialmenteCumple = 	$("input[type='radio'][name^='califica'][value='1'].activo:checked").length;
			var siCumple = 				$("input[type='radio'][name^='califica'][value='2'].activo:checked ").length;
			var sinContestar=			todos - noAplican - noCumple - parcialmenteCumple - siCumple;

			var num= "cero";
		    var cadenaSinContestar="";
		    var cadenaNoAplican="";
		    var cadenaNoCumple="";
		    var cadenaParcialmenteCumple="";
		    var cadenaSiCumple="";
		    
		    
            $(".panel").each(function(i)"""),format.raw/*237.41*/("""{"""),format.raw/*237.42*/("""
                """),format.raw/*238.17*/("""num =   $(this).find(".panel-title").html().substring(20, $(this).find(".panel-title").html().length-8 );
                if ($(this).find("input[name^='califica']:checked").val()==undefined)"""),format.raw/*239.86*/("""{"""),format.raw/*239.87*/("""
                    """),format.raw/*240.21*/("""cadenaSinContestar+=num+"  ";
                """),format.raw/*241.17*/("""}"""),format.raw/*241.18*/("""  
                
                """),format.raw/*243.17*/("""if ($(this).find("input[name^='califica']:checked").val()==-1)"""),format.raw/*243.79*/("""{"""),format.raw/*243.80*/("""
                    """),format.raw/*244.21*/("""cadenaNoAplican+=num+"  ";
                """),format.raw/*245.17*/("""}"""),format.raw/*245.18*/("""                  
                
                """),format.raw/*247.17*/("""// No cumple (0)
                if ($(this).find("input[name^='califica']:checked").val()==0)"""),format.raw/*248.78*/("""{"""),format.raw/*248.79*/("""
                    """),format.raw/*249.21*/("""cadenaNoCumple+=num+"  ";
                """),format.raw/*250.17*/("""}"""),format.raw/*250.18*/("""                

                """),format.raw/*252.17*/("""// Parcialmente cumple (1)
                if ($(this).find("input[name^='califica']:checked").val()==1)"""),format.raw/*253.78*/("""{"""),format.raw/*253.79*/("""
                    """),format.raw/*254.21*/("""cadenaParcialmenteCumple+=num+"  ";
                """),format.raw/*255.17*/("""}"""),format.raw/*255.18*/("""
                
                """),format.raw/*257.17*/("""// Si cumple (2)
                if ($(this).find("input[name^='califica']:checked").val()==2)"""),format.raw/*258.78*/("""{"""),format.raw/*258.79*/("""
                    """),format.raw/*259.21*/("""cadenaSiCumple+=num+"  ";
                """),format.raw/*260.17*/("""}"""),format.raw/*260.18*/("""                  
                
              """),format.raw/*262.15*/("""}"""),format.raw/*262.16*/(""");			
			
            
			// Actualiza los valores en conteoAspecto
			$("#todos").html(todos);
			
			$("#sinContestar").html(sinContestar);
			$("#divCadenaSinContestar").html(cadenaSinContestar);
			
			$("#noAplican").html(noAplican);
			$("#divCadenaNoAplican").html(cadenaNoAplican);
			
            $("#noCumple").html(noCumple);
            $("#divCadenaNoCumple").html(cadenaNoCumple);
						
            $("#parcialmenteCumple").html(parcialmenteCumple);
            $("#divCadenaParcialmenteCumple").html(cadenaParcialmenteCumple);
            
            $("#siCumple").html(siCumple);
            $("#divCadenaSiCumple").html(cadenaSiCumple);
		"""),format.raw/*282.3*/("""}"""),format.raw/*282.4*/("""
	"""),format.raw/*283.2*/("""}"""),format.raw/*283.3*/("""
	
	"""),format.raw/*285.2*/("""$( document ).on( "submit", "#frmEvaluacion", function(event) """),format.raw/*285.64*/("""{"""),format.raw/*285.65*/("""
		"""),format.raw/*286.3*/("""recuento();
		if (  $("[name^='califica']:checked").length == 0   && ($("input[type='radio'][name^='califica'].inactivo").length/4) == 0   )"""),format.raw/*287.129*/("""{"""),format.raw/*287.130*/("""
			"""),format.raw/*288.4*/("""event.preventDefault();
			alert("Aún no ha evaluado.");			
		"""),format.raw/*290.3*/("""}"""),format.raw/*290.4*/("""
		"""),format.raw/*291.3*/("""else """),format.raw/*291.8*/("""{"""),format.raw/*291.9*/("""
			"""),format.raw/*292.4*/("""//event.preventDefault();
			$("input[type='radio'][name^='califica']:checked").each(function(i,e)"""),format.raw/*293.73*/("""{"""),format.raw/*293.74*/("""
				"""),format.raw/*294.5*/("""$(this).attr('disabled', false);
				var num = $(this).attr('name').substr(8);	
				var respuesta = $(this).val(); 
				$(this).attr('name', "evaluaciones["+ i+"].evaluaciontabla.id");
				$(this).val(num);
				$("input[type='text'][name='respuesta"+num+"']").attr('name', "evaluaciones["+i+"].respuesta").val(respuesta);	
			"""),format.raw/*300.4*/("""}"""),format.raw/*300.5*/(""");
			$("[name^='observacionGral-']").attr("name", "observacionEvaluacion.observacion");
			return;
		"""),format.raw/*303.3*/("""}"""),format.raw/*303.4*/("""
	"""),format.raw/*304.2*/("""}"""),format.raw/*304.3*/(""")
	
	
	function marcarTodos()"""),format.raw/*307.24*/("""{"""),format.raw/*307.25*/("""
		"""),format.raw/*308.3*/("""$("input[name^='califica'][value=2]").prop("checked",true);	
		$("#terminado").val("SI");
		recuento();
	"""),format.raw/*311.2*/("""}"""),format.raw/*311.3*/("""
	
	"""),format.raw/*313.2*/("""$(document).on("click", "[name='cpPagina']",function()"""),format.raw/*313.56*/("""{"""),format.raw/*313.57*/("""
		"""),format.raw/*314.3*/("""var ind = parseInt($(this).attr("data-slide-to"));
		
		// Obtener el máximo número de pags
		var maxPag = -1;
		$("[name='cpPagina']").each(function(i,e)"""),format.raw/*318.44*/("""{"""),format.raw/*318.45*/("""
			"""),format.raw/*319.4*/("""if (  parseInt($(e).attr('data-slide-to')) > maxPag  )"""),format.raw/*319.58*/("""{"""),format.raw/*319.59*/("""
				"""),format.raw/*320.5*/("""maxPag = $(e).attr('data-slide-to');
			"""),format.raw/*321.4*/("""}"""),format.raw/*321.5*/("""
		"""),format.raw/*322.3*/("""}"""),format.raw/*322.4*/(""");
		$("[name='divRowObservacionGral']").toggle(parseInt(maxPag) == parseInt(ind) );
		$("[name='cpPagina']").each(function(i,e)"""),format.raw/*324.44*/("""{"""),format.raw/*324.45*/("""
			"""),format.raw/*325.4*/("""if(ind == i)"""),format.raw/*325.16*/("""{"""),format.raw/*325.17*/("""
				"""),format.raw/*326.5*/("""$(e).html("<span class='badge'>"+(ind+1)+"</span>");		
			"""),format.raw/*327.4*/("""}"""),format.raw/*327.5*/(""" """),format.raw/*327.6*/("""else """),format.raw/*327.11*/("""{"""),format.raw/*327.12*/("""
				"""),format.raw/*328.5*/("""$(e).html( parseInt($(e).attr("data-slide-to"))+1 );
			"""),format.raw/*329.4*/("""}"""),format.raw/*329.5*/("""
		"""),format.raw/*330.3*/("""}"""),format.raw/*330.4*/(""");
		$("#carousel"""),_display_(/*331.16*/(re.aspecto.id)),format.raw/*331.31*/("""Anterior").toggle(parseInt(ind) >= 1 );
		$("#carousel"""),_display_(/*332.16*/(re.aspecto.id)),format.raw/*332.31*/("""Siguiente").toggle(parseInt(maxPag) > parseInt(ind));
		window.scrollTo(0, 0);
	"""),format.raw/*334.2*/("""}"""),format.raw/*334.3*/(""");
	
	
	function leer()"""),format.raw/*337.17*/("""{"""),format.raw/*337.18*/("""		
		"""),format.raw/*338.3*/("""if ("""),_display_(/*338.8*/re/*338.10*/.estadoevaluacion.id),format.raw/*338.30*/(""" """),format.raw/*338.31*/("""!=1)"""),format.raw/*338.35*/("""{"""),format.raw/*338.36*/("""
			"""),_display_(/*339.5*/for(e <- re.evaluaciones) yield /*339.30*/{_display_(Seq[Any](format.raw/*339.31*/("""
				"""),format.raw/*340.5*/("""if ( """),_display_(/*340.11*/e/*340.12*/.respuesta),format.raw/*340.22*/(""" """),format.raw/*340.23*/("""== -1 )"""),format.raw/*340.30*/("""{"""),format.raw/*340.31*/("""
					"""),format.raw/*341.6*/("""$("input[name='califica"""),_display_(/*341.30*/e/*341.31*/.evaluaciontabla.id),format.raw/*341.50*/("""'][value=-1]").prop("checked",true);
					$("input[name='califica"""),_display_(/*342.30*/e/*342.31*/.evaluaciontabla.id),format.raw/*342.50*/("""']").prop("disabled",true);
					$("input[name='califica"""),_display_(/*343.30*/e/*343.31*/.evaluaciontabla.id),format.raw/*343.50*/("""']").removeClass("activo").addClass("inactivo");	
					$("#btnNA_"""),_display_(/*344.17*/e/*344.18*/.evaluaciontabla.id),format.raw/*344.37*/("""").attr("value","Volver a habilitar");
				"""),format.raw/*345.5*/("""}"""),format.raw/*345.6*/(""" """),format.raw/*345.7*/("""else """),format.raw/*345.12*/("""{"""),format.raw/*345.13*/("""
					"""),format.raw/*346.6*/("""$("input[name='califica"""),_display_(/*346.30*/e/*346.31*/.evaluaciontabla.id),format.raw/*346.50*/("""'][value='"""),_display_(/*346.61*/e/*346.62*/.respuesta),format.raw/*346.72*/("""']").prop("checked",true);
				"""),format.raw/*347.5*/("""}"""),format.raw/*347.6*/("""		
				"""),format.raw/*348.5*/("""toggleColorPanel( $("input[name='califica"""),_display_(/*348.47*/e/*348.48*/.evaluaciontabla.id),format.raw/*348.67*/("""'][value='"""),_display_(/*348.78*/e/*348.79*/.respuesta),format.raw/*348.89*/("""']").closest( ".panel-warning" )  );
			""")))}),format.raw/*349.5*/("""
			"""),_display_(/*350.5*/if(re.observacionEvaluacion != null)/*350.41*/{_display_(Seq[Any](format.raw/*350.42*/("""
				"""),format.raw/*351.5*/("""$("textarea[name^='observacionGral-']").val(""""),_display_(/*351.51*/re/*351.53*/.observacionEvaluacion.observacion.filter(_ >= ' ')),format.raw/*351.104*/("""");
			""")))}),format.raw/*352.5*/("""
			
			"""),format.raw/*354.4*/("""recuento();
		"""),format.raw/*355.3*/("""}"""),format.raw/*355.4*/("""
	"""),format.raw/*356.2*/("""}"""),format.raw/*356.3*/("""	
	
	
	"""),format.raw/*359.2*/("""$("div[name='flechaDetalle']").click(function()"""),format.raw/*359.49*/("""{"""),format.raw/*359.50*/("""
		"""),format.raw/*360.3*/("""$(this).hasClass('fa-chevron-down')?  $(this).removeClass('fa-chevron-down').addClass('fa-chevron-up') : $(this).removeClass('fa-chevron-up').addClass('fa-chevron-down') ;
	"""),format.raw/*361.2*/("""}"""),format.raw/*361.3*/(""");
	
	
</script>"""))}
  }

  def render(re:Recursoevaluador,cr:List[EvaluacionTabla],mensajes:String): play.twirl.api.HtmlFormat.Appendable = apply(re,cr,mensajes)

  def f:((Recursoevaluador,List[EvaluacionTabla],String) => play.twirl.api.HtmlFormat.Appendable) = (re,cr,mensajes) => apply(re,cr,mensajes)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/EvaluacionEvaluador/create.scala.html
                  HASH: aaa2c7f9c8eae19ccf38cf3d5ef493e738c33eb8
                  MATRIX: 783->1|945->87|977->111|1064->68|1092->168|1120->170|1191->215|1205->221|1262->258|1292->263|1301->265|1343->287|1370->289|1381->293|1418->294|1446->296|1604->428|1614->430|1654->450|1683->452|1723->466|1733->468|1768->483|1796->484|1857->518|1868->520|1900->531|2087->691|2098->693|2163->737|2192->738|2222->741|2233->743|2299->787|2329->788|2360->791|2372->793|2447->846|2478->850|2531->876|2542->878|2609->924|2642->930|2687->949|2837->1089|2878->1091|2910->1097|2923->1101|2954->1111|2986->1116|4017->2117|4049->2123|4079->2144|4118->2145|4150->2150|4244->2217|4378->2341|4419->2343|4454->2352|4483->2360|4518->2368|4688->2507|4739->2530|4790->2564|4803->2569|4842->2570|4874->2576|5043->2735|5084->2737|5117->2744|5206->2812|5242->2818|5277->2823|5308->2827|5446->2935|5476->2938|5566->3000|5595->3001|5625->3004|5796->3147|5825->3148|5856->3152|5894->3162|5923->3163|5955->3168|6082->3267|6094->3269|6127->3280|6239->3365|6267->3366|6297->3369|6325->3370|6355->3373|6423->3413|6452->3414|6487->3422|6609->3516|6621->3518|6654->3529|6748->3596|6776->3597|6809->3603|6860->3627|6871->3629|6903->3640|7054->3763|7091->3778|7229->3888|7241->3890|7274->3901|7317->3916|7354->3931|7459->4009|7470->4011|7502->4022|7604->4096|7633->4097|7671->4107|7700->4108|7958->4339|7986->4340|8061->4387|8098->4402|8154->4429|8184->4430|8215->4433|8306->4496|8318->4498|8351->4509|8381->4510|8473->4574|8485->4576|8518->4587|8548->4588|8758->4770|8795->4785|8882->4844|8911->4845|8982->4888|9019->4903|9076->4931|9106->4932|9137->4935|9225->4995|9237->4997|9270->5008|9300->5009|9487->5168|9516->5169|9617->5241|9647->5242|9679->5246|9844->5382|9874->5383|9906->5387|10103->5556|10132->5557|10161->5558|10195->5563|10225->5564|10257->5568|10467->5750|10496->5751|10527->5754|10628->5827|10657->5828|10728->5870|10758->5871|10789->5874|10862->5918|10892->5919|10924->5923|11022->5993|11051->5994|11080->5995|11114->6000|11144->6001|11176->6005|11273->6074|11302->6075|11332->6077|11361->6078|11393->6082|11478->6138|11508->6139|11539->6142|11666->6240|11696->6241|11730->6247|12082->6571|12111->6572|12140->6573|12174->6578|12204->6579|12236->6583|12588->6907|12617->6908|12648->6911|12900->7134|12930->7135|12972->7148|13196->7344|13226->7345|13256->7346|13290->7351|13320->7352|13362->7365|13596->7571|13626->7572|13659->7577|13700->7590|13729->7591|13824->7657|13854->7658|13885->7661|14386->8134|14415->8135|14514->8205|14544->8206|14575->8209|14955->8561|14984->8562|15080->8629|15110->8630|15141->8633|15382->8846|15394->8848|15427->8859|15457->8861|15469->8863|15502->8874|15607->8951|15636->8952|15690->8977|15720->8978|15751->8981|15919->9120|15949->9121|15982->9126|16043->9159|16072->9160|16228->9288|16240->9290|16273->9301|16340->9339|16370->9340|16402->9344|16438->9352|16450->9354|16483->9365|17327->10180|17357->10181|17403->10198|17623->10389|17653->10390|17703->10411|17778->10457|17808->10458|17873->10494|17964->10556|17994->10557|18044->10578|18116->10621|18146->10622|18227->10674|18350->10768|18380->10769|18430->10790|18501->10832|18531->10833|18594->10867|18727->10971|18757->10972|18807->10993|18888->11045|18918->11046|18981->11080|19104->11174|19134->11175|19184->11196|19255->11238|19285->11239|19364->11289|19394->11290|20081->11949|20110->11950|20140->11952|20169->11953|20201->11957|20292->12019|20322->12020|20353->12023|20523->12163|20554->12164|20586->12168|20676->12230|20705->12231|20736->12234|20769->12239|20798->12240|20830->12244|20957->12342|20987->12343|21020->12348|21374->12674|21403->12675|21533->12777|21562->12778|21592->12780|21621->12781|21679->12810|21709->12811|21740->12814|21873->12919|21902->12920|21934->12924|22017->12978|22047->12979|22078->12982|22261->13136|22291->13137|22323->13141|22406->13195|22436->13196|22469->13201|22537->13241|22566->13242|22597->13245|22626->13246|22783->13374|22813->13375|22845->13379|22886->13391|22916->13392|22949->13397|23035->13455|23064->13456|23093->13457|23127->13462|23157->13463|23190->13468|23274->13524|23303->13525|23334->13528|23363->13529|23409->13547|23446->13562|23529->13617|23566->13632|23674->13712|23703->13713|23755->13736|23785->13737|23818->13742|23850->13747|23862->13749|23904->13769|23934->13770|23967->13774|23997->13775|24029->13780|24071->13805|24111->13806|24144->13811|24178->13817|24189->13818|24221->13828|24251->13829|24287->13836|24317->13837|24351->13843|24403->13867|24414->13868|24455->13887|24549->13953|24560->13954|24601->13973|24686->14030|24697->14031|24738->14050|24832->14116|24843->14117|24884->14136|24955->14179|24984->14180|25013->14181|25047->14186|25077->14187|25111->14193|25163->14217|25174->14218|25215->14237|25254->14248|25265->14249|25297->14259|25356->14290|25385->14291|25420->14298|25490->14340|25501->14341|25542->14360|25581->14371|25592->14372|25624->14382|25696->14423|25728->14428|25774->14464|25814->14465|25847->14470|25921->14516|25933->14518|26007->14569|26046->14577|26082->14585|26124->14599|26153->14600|26183->14602|26212->14603|26247->14610|26323->14657|26353->14658|26384->14661|26585->14834|26614->14835
                  LINES: 26->1|28->3|28->3|29->1|30->3|31->4|31->4|31->4|31->4|32->5|32->5|32->5|33->6|33->6|33->6|34->7|36->9|36->9|36->9|36->9|36->9|36->9|36->9|36->9|36->9|36->9|36->9|37->10|37->10|37->10|37->10|37->10|37->10|37->10|37->10|37->10|37->10|37->10|38->11|39->12|39->12|39->12|42->15|43->16|43->16|43->16|44->17|44->17|44->17|45->18|63->36|65->38|65->38|65->38|66->39|67->40|67->40|67->40|68->41|68->41|69->42|71->44|72->45|74->47|74->47|74->47|75->48|75->48|75->48|76->49|76->49|77->50|78->51|79->52|85->58|88->61|89->62|89->62|90->63|93->66|93->66|94->67|94->67|94->67|95->68|95->68|95->68|95->68|97->70|97->70|98->71|98->71|99->72|99->72|99->72|100->73|100->73|100->73|100->73|101->74|101->74|103->76|103->76|103->76|103->76|103->76|103->76|103->76|103->76|103->76|103->76|103->76|108->81|108->81|108->81|109->82|109->82|109->82|109->82|126->99|126->99|131->104|131->104|131->104|131->104|132->105|133->106|133->106|133->106|133->106|134->107|134->107|134->107|134->107|138->111|138->111|140->113|140->113|142->115|142->115|142->115|142->115|143->116|144->117|144->117|144->117|144->117|148->121|148->121|150->123|150->123|151->124|153->126|153->126|154->127|157->130|157->130|157->130|157->130|157->130|158->131|161->134|161->134|162->135|164->137|164->137|167->140|167->140|168->141|168->141|168->141|169->142|170->143|170->143|170->143|170->143|170->143|171->144|172->145|172->145|173->146|173->146|175->148|175->148|175->148|176->149|177->150|177->150|178->151|183->156|183->156|183->156|183->156|183->156|184->157|190->163|190->163|191->164|195->168|195->168|196->169|199->172|199->172|199->172|199->172|199->172|200->173|203->176|203->176|204->177|205->178|205->178|207->180|207->180|208->181|214->187|214->187|216->189|216->189|217->190|223->196|223->196|226->199|226->199|227->200|230->203|230->203|230->203|230->203|230->203|230->203|233->206|233->206|235->208|235->208|236->209|240->213|240->213|241->214|242->215|242->215|244->217|244->217|244->217|246->219|246->219|247->220|247->220|247->220|247->220|264->237|264->237|265->238|266->239|266->239|267->240|268->241|268->241|270->243|270->243|270->243|271->244|272->245|272->245|274->247|275->248|275->248|276->249|277->250|277->250|279->252|280->253|280->253|281->254|282->255|282->255|284->257|285->258|285->258|286->259|287->260|287->260|289->262|289->262|309->282|309->282|310->283|310->283|312->285|312->285|312->285|313->286|314->287|314->287|315->288|317->290|317->290|318->291|318->291|318->291|319->292|320->293|320->293|321->294|327->300|327->300|330->303|330->303|331->304|331->304|334->307|334->307|335->308|338->311|338->311|340->313|340->313|340->313|341->314|345->318|345->318|346->319|346->319|346->319|347->320|348->321|348->321|349->322|349->322|351->324|351->324|352->325|352->325|352->325|353->326|354->327|354->327|354->327|354->327|354->327|355->328|356->329|356->329|357->330|357->330|358->331|358->331|359->332|359->332|361->334|361->334|364->337|364->337|365->338|365->338|365->338|365->338|365->338|365->338|365->338|366->339|366->339|366->339|367->340|367->340|367->340|367->340|367->340|367->340|367->340|368->341|368->341|368->341|368->341|369->342|369->342|369->342|370->343|370->343|370->343|371->344|371->344|371->344|372->345|372->345|372->345|372->345|372->345|373->346|373->346|373->346|373->346|373->346|373->346|373->346|374->347|374->347|375->348|375->348|375->348|375->348|375->348|375->348|375->348|376->349|377->350|377->350|377->350|378->351|378->351|378->351|378->351|379->352|381->354|382->355|382->355|383->356|383->356|386->359|386->359|386->359|387->360|388->361|388->361
                  -- GENERATED --
              */
          