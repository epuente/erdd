
package views.html.Evaluaciones

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
object evaluada extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Recursoevaluador],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(re:List[Recursoevaluador], idAspecto:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*2.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*2.46*/routes/*2.52*/.Assets.at("stylesheets/lineasColoresPaneles.css")),format.raw/*2.102*/(""""/>


"""),_display_(/*5.2*/main/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""
	"""),format.raw/*6.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" id="div0" style="display:none">  
			<div class="row">
				<div class="col-md-12">
					<ol class="breadcrumb">
					  <li>Evaluaciones</li>
					  <li class="active">Evaluación</li>
					</ol>			
				</div>
			</div>

			<div class="row">
				<div class="col-md-2">
					<div class="panel panel-default">
					  <div class="panel-heading">
					    <div class="panel-title"><small>Detalle de evaluación</small></div>
				      </div>
					  <div class="panel-body">
							<div class="row">
					  			<div class="col-md-12">
									<div style="font-size: large;" class="text-center">
										"""),_display_(/*26.12*/re/*26.14*/.get(0).recurso.numcontrol),format.raw/*26.40*/("""
									"""),format.raw/*27.10*/("""</div>
								</div>
							</div>					  
					  	"""),_display_(/*30.10*/if(idAspecto == "0")/*30.30*/{_display_(Seq[Any](format.raw/*30.31*/("""
							"""),format.raw/*31.8*/("""<div class="row">
					  			<div class="col-md-12">
									<div style="font-size: large;" class="text-center">
										Calificación general<div></div>"""),_display_(/*34.43*/re/*34.45*/.get(0).recurso.calificacionPorcentajeGral),format.raw/*34.87*/("""
										"""),format.raw/*35.11*/("""<br>
					  					"""),_display_(/*36.14*/re/*36.16*/.get(0).recurso.calificacionLetraGral),format.raw/*36.53*/("""
				  					"""),format.raw/*37.12*/("""</div>
					  			</div>
				  			</div>		
			  			""")))}),format.raw/*40.10*/("""
  						"""),format.raw/*41.9*/("""<div class="row">
				  			<div class="col-md-12">
				  			<br>
				  			</div>
			  			</div>
					  	<div class="row">
					  		<div class="col-sm-12">
					  			"""),_display_(/*48.12*/for(r<-re) yield /*48.22*/{_display_(Seq[Any](format.raw/*48.23*/("""
					  				"""),format.raw/*49.12*/("""<div class="row">
					  					<div class="col-sm-12">
					  						<strong>Detalle aspecto """),_display_(/*51.39*/r/*51.40*/.aspecto.descripcion),format.raw/*51.60*/("""</strong>
					  					</div>
					  				</div>
				  					<div class="row">
				  						<div class="col-sm-9" >
				  							<div class="small">Calificación aspecto</div>
				  						</div>
				  						<div class="col-sm-3">
				  							<div id="calAspecto"""),_display_(/*59.34*/r/*59.35*/.aspecto.id),format.raw/*59.46*/("""" class="small pull-right"></div>
				  						</div>
			  						</div>	
				  					<div class="row">
				  						<div class="col-sm-12" style="height: 0.8em">
				  						
				  						</div>
				  					</div>			  										  				
					  				<div class="row">					  				
					  					<div class="col-sm-9 small">
					  						Total reactivos
					  					</div>
					  					<div class="col-sm-3">
					  						<div id="totalReactivos"""),_display_(/*72.38*/r/*72.39*/.aspecto.id),format.raw/*72.50*/("""" class="small pull-right"></div>
					  					</div>
				  					</div>
				  					<div class="row">
				  						<div class="col-sm-12" style="height: 0.8em"></div>
				  					</div>					  					
				  					<div class="row">
				  						<div class="col-sm-9">
											<div style="display:inline-block" class='refLineaColor2 small'></div>
				  							<div style="display:inline-block" class="small">Sí cumple</div>
				  						</div>
				  						<div class="col-sm-3">
								  			<div id="totalSi"""),_display_(/*84.31*/r/*84.32*/.aspecto.id),format.raw/*84.43*/("""" class="small pull-right"></div>
				  						</div>
				  					</div>
				  					<div class="row">
				  						<div class="col-sm-9">
											<div style="display:inline-block" class='refLineaColor0 small'></div>
				  							<div style="display:inline-block" class="small">No cumple</div>
				  						</div>
				  						<div class="col-sm-3">
				  							<div id="totalNo"""),_display_(/*93.31*/r/*93.32*/.aspecto.id),format.raw/*93.43*/("""" class="small pull-right"></div>					  						
				  						</div>
				  					</div>
				  					<div class="row">
				  						<div class="col-sm-9">
											<div style="display:inline-block" class='refLineaColor1 small'></div>
				  							<div style="display:inline-block"class="small">Parcialmente</div>
				  						</div>
				  						<div class="col-sm-3">
				  							<div id="totalParcial"""),_display_(/*102.36*/r/*102.37*/.aspecto.id),format.raw/*102.48*/("""" class="small pull-right"></div>					  						
				  						</div>
				  					</div>
				  					<div class="row">
				  						<div class="col-sm-9">
											<div style="display:inline-block" class='refLineaColorNA small'></div>
				  							<div style="display:inline-block"class="small">No aplica</div>
				  						</div>
				  						<div class="col-sm-3">
				  							<div id="totalNA"""),_display_(/*111.31*/r/*111.32*/.aspecto.id),format.raw/*111.43*/(""""class="small pull-right"></div>					  						
				  						</div>
				  					</div>
				  					<div class="row">
				  						<div class="col-sm-12 small"><hr></div>
			  						</div>
					  			""")))}),format.raw/*117.12*/("""
							"""),format.raw/*118.8*/("""</div>					  		
					  		
					  		
					  		
					  		




				  		</div>
			  		  </div>
				    </div>		


					
				</div>

				
				
				<div class="col-md-10">		  
  				    <ul id="tabs" class="nav nav-tabs nav-justified" data-tabs="tabs">
						"""),_display_(/*139.8*/for((r,ir) <- re.zipWithIndex) yield /*139.38*/{_display_(Seq[Any](format.raw/*139.39*/("""
							"""),format.raw/*140.8*/("""<li """),_display_(/*140.13*/if(ir==0)/*140.22*/{_display_(Seq[Any](format.raw/*140.23*/("""class="active"""")))}),format.raw/*140.38*/("""><a href="#divAspecto"""),_display_(/*140.60*/r/*140.61*/.aspecto.id),format.raw/*140.72*/("""" data-toggle="tab">Aspecto: """),_display_(/*140.102*/r/*140.103*/.aspecto.descripcion),format.raw/*140.123*/("""</a></li>
						""")))}),format.raw/*141.8*/("""        
				    """),format.raw/*142.9*/("""</ul>
				    <div style="padding: 10px; border-left: 1px solid #ddd; border-right: 1px solid #ddd; border-bottom: 1px solid #ddd">
			    
					    <div>
						    <div id="my-tab-content" class="tab-content" > 
						        """),_display_(/*147.16*/for((r,ir) <- re.zipWithIndex) yield /*147.46*/{_display_(Seq[Any](format.raw/*147.47*/("""
									"""),format.raw/*148.10*/("""<div id="divAspecto"""),_display_(/*148.30*/r/*148.31*/.aspecto.id),format.raw/*148.42*/("""" class="tab-pane fade """),_display_(/*148.66*/if(ir==0)/*148.75*/{_display_(Seq[Any](format.raw/*148.76*/(""" """),format.raw/*148.77*/("""in active""")))}),format.raw/*148.87*/("""">
										"""),_display_(/*149.12*/views/*149.17*/.html.EvaluacionEvaluador.evaluacionPanelesForm(r, models.EvaluacionTabla.searchByAspecto(r.id) )),format.raw/*149.114*/("""
									"""),format.raw/*150.10*/("""</div>
								""")))}),format.raw/*151.10*/("""
						    """),format.raw/*152.11*/("""</div>
					    </div>
				    </div>
				</div>
			</div>
	</div>



""")))}),format.raw/*161.2*/("""


"""),format.raw/*164.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*165.15*/("""{"""),format.raw/*165.16*/("""
    	"""),format.raw/*166.6*/("""$("#div0").hide();
        $('#tabs').tab();
        $('[data-toggle="popover"]').popover("""),format.raw/*168.46*/("""{"""),format.raw/*168.47*/("""html: true"""),format.raw/*168.57*/("""}"""),format.raw/*168.58*/(""");        
        navegacionPaneles();
    	leer();
    	$("#btnEvaluar, #btnCancelar, input:button[id^='btnNA']").hide();
    	$("input:radio[name^='califica'], textarea").prop("disabled",true);

    	$("textarea").prop("readonly",true);
    	
    	$("div[id^='divAspecto']").each(function(i,e)"""),format.raw/*176.51*/("""{"""),format.raw/*176.52*/("""
    			"""),format.raw/*177.8*/("""$(this).find("[name='cpPagina']:first").click();
    	"""),format.raw/*178.6*/("""}"""),format.raw/*178.7*/(""");
    	$("#div0").show();    	
    """),format.raw/*180.5*/("""}"""),format.raw/*180.6*/(""");
    



    function navegacionPaneles()"""),format.raw/*185.33*/("""{"""),format.raw/*185.34*/("""
        """),_display_(/*186.10*/for(r <- re) yield /*186.22*/{_display_(Seq[Any](format.raw/*186.23*/("""
			"""),format.raw/*187.4*/("""var aux = 1;
			var cadena ="";
			//Determina cuantas y cuales serán los saltos de paginación 
			for(l=1; l <= $("div.panel-title").length;l++ )"""),format.raw/*190.51*/("""{"""),format.raw/*190.52*/("""
				"""),format.raw/*191.5*/("""if(l%8==0)"""),format.raw/*191.15*/("""{"""),format.raw/*191.16*/("""
					"""),format.raw/*192.6*/("""cadena+="<td style='border-top:none'><div class='center-block'><a href='' data-target='#carouselId"""),_display_(/*192.105*/r/*192.106*/.aspecto.id),format.raw/*192.117*/("""' data-slide-to='"+(aux-1)+"' name='cpPagina'>"+aux+"</a></div></td>";
					aux++;
				"""),format.raw/*194.5*/("""}"""),format.raw/*194.6*/("""
			"""),format.raw/*195.4*/("""}"""),format.raw/*195.5*/("""
			"""),format.raw/*196.4*/("""if($("div.panel-title").length % 8 != 0)"""),format.raw/*196.44*/("""{"""),format.raw/*196.45*/("""
				    """),format.raw/*197.9*/("""cadena+="<td style='border-top:none'><a href='' class='center-block' data-target='#carouselId"""),_display_(/*197.103*/r/*197.104*/.aspecto.id),format.raw/*197.115*/("""' data-slide-to='"+(aux-1)+"' name='cpPagina'>"+aux+"</a></td>";
			"""),format.raw/*198.4*/("""}"""),format.raw/*198.5*/("""
		"""),format.raw/*199.3*/("""//	$("#tablaNavegaCarousel"""),_display_(/*199.30*/r/*199.31*/.aspecto.id),format.raw/*199.42*/("""").html("<tr><td style='border-top:none'><div class='pull-right'><!--a href='#carouselId"""),_display_(/*199.131*/r/*199.132*/.aspecto.id),format.raw/*199.143*/("""' role='button' data-slide='prev'>Anterior</a--></div></td>"+cadena+"<td class='pull-left' style='border-top:none'><!--a href='#carouselId"""),_display_(/*199.282*/r/*199.283*/.aspecto.id),format.raw/*199.294*/("""' role='button' data-slide='next'>Siguiente</a--></td></tr>");
			$("#tablaNavegaCarousel"""),_display_(/*200.28*/r/*200.29*/.aspecto.id),format.raw/*200.40*/("""").html("<tr><td style='border-top:none'><div class='pull-right'><a href='' id='carousel"""),_display_(/*200.129*/(r.aspecto.id)),format.raw/*200.143*/("""Anterior'>Anterior</a></div></td>"+cadena+"<td class='pull-left' style='border-top:none'><a href='#carouselId"""),_display_(/*200.253*/r/*200.254*/.aspecto.id),format.raw/*200.265*/("""' id='carousel"""),_display_(/*200.280*/(r.aspecto.id)),format.raw/*200.294*/("""Siguiente'>Siguiente</a></td></tr>");
        """)))}),format.raw/*201.10*/(""" 
        
        """),format.raw/*203.9*/("""/// Cuando estan terminadas las 4 evaluaciones
		"""),_display_(/*204.4*/for(r <- re) yield /*204.16*/{_display_(Seq[Any](format.raw/*204.17*/("""
			"""),format.raw/*205.4*/("""var aux = 1;
			var cadena ="";
			//Determina cuantos y cuales serán los saltos de paginación 
			for(l=1; l <= $("#divAspecto"""),_display_(/*208.33*/r/*208.34*/.aspecto.id),format.raw/*208.45*/(""" """),format.raw/*208.46*/("""div.panel-title").length;l++ )"""),format.raw/*208.76*/("""{"""),format.raw/*208.77*/("""
				"""),format.raw/*209.5*/("""if(l%8==0)"""),format.raw/*209.15*/("""{"""),format.raw/*209.16*/("""
					"""),format.raw/*210.6*/("""cadena+="<td style='border-top:none'><div class='center-block'><a href='' data-target='#carouselId"""),_display_(/*210.105*/r/*210.106*/.aspecto.id),format.raw/*210.117*/("""' data-slide-to='"+(aux-1)+"' name='cpPagina'>"+aux+"</a></div></td>";
					aux++;
				"""),format.raw/*212.5*/("""}"""),format.raw/*212.6*/("""
			"""),format.raw/*213.4*/("""}"""),format.raw/*213.5*/("""
			"""),format.raw/*214.4*/("""if($("#divAspecto"""),_display_(/*214.22*/r/*214.23*/.aspecto.id),format.raw/*214.34*/(""" """),format.raw/*214.35*/("""div.panel-title").length % 8 != 0)"""),format.raw/*214.69*/("""{"""),format.raw/*214.70*/("""
				    """),format.raw/*215.9*/("""cadena+="<td style='border-top:none'><a href='' class='center-block' data-target='#carouselId"""),_display_(/*215.103*/r/*215.104*/.aspecto.id),format.raw/*215.115*/("""' data-slide-to='"+(aux-1)+"' name='cpPagina'>"+aux+"</a></td>";
			"""),format.raw/*216.4*/("""}"""),format.raw/*216.5*/("""
			"""),format.raw/*217.4*/("""$("#tablaNavegaCarousel"""),_display_(/*217.28*/r/*217.29*/.aspecto.id),format.raw/*217.40*/("""").html("<tr><td style='border-top:none'><div class='pull-right'><a href=''  id='carousel"""),_display_(/*217.130*/(r.aspecto.id)),format.raw/*217.144*/("""Anterior'>Anterior</a></div></td>"+cadena+"<td class='pull-left' style='border-top:none'><a href='#carouselId"""),_display_(/*217.254*/r/*217.255*/.aspecto.id),format.raw/*217.266*/("""' id='carousel"""),_display_(/*217.281*/(r.aspecto.id)),format.raw/*217.295*/("""Siguiente'>Siguiente</a></td></tr>");
		""")))}),format.raw/*218.4*/("""         
    """),format.raw/*219.5*/("""}"""),format.raw/*219.6*/("""
    
    
	"""),format.raw/*222.2*/("""$(document).on("click", "[name='cpPagina']",function()"""),format.raw/*222.56*/("""{"""),format.raw/*222.57*/("""
		"""),format.raw/*223.3*/("""var ind = parseInt($(this).attr("data-slide-to"));
		
		// Obtener el máximo número de pags
		var maxPag = -1;
		$(this).closest("[id^='divAspecto'").find("[name='cpPagina']").each(function(i,e)"""),format.raw/*227.84*/("""{"""),format.raw/*227.85*/("""
			"""),format.raw/*228.4*/("""if (  parseInt($(e).attr('data-slide-to')) > maxPag  )"""),format.raw/*228.58*/("""{"""),format.raw/*228.59*/("""
				"""),format.raw/*229.5*/("""maxPag = $(e).attr('data-slide-to');
			"""),format.raw/*230.4*/("""}"""),format.raw/*230.5*/("""
		"""),format.raw/*231.3*/("""}"""),format.raw/*231.4*/(""");
		
		$(this).closest("[id^='divAspecto'").find("[name='divRowObservacionGral']").toggle(maxPag == ind );		
		
		$(this).closest("[id^='divAspecto'").find("[name='cpPagina']").each(function(i,e)"""),format.raw/*235.84*/("""{"""),format.raw/*235.85*/("""
			"""),format.raw/*236.4*/("""if(ind == i)"""),format.raw/*236.16*/("""{"""),format.raw/*236.17*/("""
				"""),format.raw/*237.5*/("""$(e).html("<span class='badge'>"+(ind+1)+"</span>");		
			"""),format.raw/*238.4*/("""}"""),format.raw/*238.5*/(""" """),format.raw/*238.6*/("""else """),format.raw/*238.11*/("""{"""),format.raw/*238.12*/("""
				"""),format.raw/*239.5*/("""$(e).html( parseInt($(e).attr("data-slide-to"))+1 );
			"""),format.raw/*240.4*/("""}"""),format.raw/*240.5*/("""
		"""),format.raw/*241.3*/("""}"""),format.raw/*241.4*/(""");
		
		var idAspecto = $(this).attr("data-target").substr(-1);
		$("#carousel"+idAspecto+"Anterior").toggle(parseInt(ind) >= 1 );
		$("#carousel"+idAspecto+"Siguiente").toggle(parseInt(maxPag) > parseInt(ind));	
				
	"""),format.raw/*247.2*/("""}"""),format.raw/*247.3*/(""");    
	
	function leer()"""),format.raw/*249.17*/("""{"""),format.raw/*249.18*/("""		
        """),_display_(/*250.10*/for(r <- re) yield /*250.22*/{_display_(Seq[Any](format.raw/*250.23*/("""		
			"""),format.raw/*251.4*/("""if ("""),_display_(/*251.9*/r/*251.10*/.estadoevaluacion.id),format.raw/*251.30*/(""" """),format.raw/*251.31*/("""!=1)"""),format.raw/*251.35*/("""{"""),format.raw/*251.36*/("""
				"""),_display_(/*252.6*/for(e <- r.evaluaciones) yield /*252.30*/{_display_(Seq[Any](format.raw/*252.31*/("""
					"""),format.raw/*253.6*/("""if ( """),_display_(/*253.12*/e/*253.13*/.respuesta),format.raw/*253.23*/(""" """),format.raw/*253.24*/("""== -1 )"""),format.raw/*253.31*/("""{"""),format.raw/*253.32*/("""
						"""),format.raw/*254.7*/("""$("#divAspecto"""),_display_(/*254.22*/r/*254.23*/.aspecto.id),format.raw/*254.34*/(""" """),format.raw/*254.35*/("""input[name='califica"""),_display_(/*254.56*/e/*254.57*/.evaluaciontabla.id),format.raw/*254.76*/("""']").prop("disabled",true);
						$("#divAspecto"""),_display_(/*255.22*/r/*255.23*/.aspecto.id),format.raw/*255.34*/(""" """),format.raw/*255.35*/("""input[name='califica"""),_display_(/*255.56*/e/*255.57*/.evaluaciontabla.id),format.raw/*255.76*/("""']").removeClass("activo").addClass("inactivo");	
						$("#divAspecto"""),_display_(/*256.22*/r/*256.23*/.aspecto.id),format.raw/*256.34*/("""  """),format.raw/*256.36*/("""#btnNA_"""),_display_(/*256.44*/e/*256.45*/.evaluaciontabla.id),format.raw/*256.64*/("""").attr("value","Volver a habilitar");
						$("#divAspecto"""),_display_(/*257.22*/r/*257.23*/.aspecto.id),format.raw/*257.34*/(""" """),format.raw/*257.35*/("""input[name='califica"""),_display_(/*257.56*/e/*257.57*/.evaluaciontabla.id),format.raw/*257.76*/("""'][value='"""),_display_(/*257.87*/e/*257.88*/.respuesta),format.raw/*257.98*/("""']").prop("checked",true);
					"""),format.raw/*258.6*/("""}"""),format.raw/*258.7*/(""" """),format.raw/*258.8*/("""else """),format.raw/*258.13*/("""{"""),format.raw/*258.14*/("""
						"""),format.raw/*259.7*/("""$("#divAspecto"""),_display_(/*259.22*/r/*259.23*/.aspecto.id),format.raw/*259.34*/(""" """),format.raw/*259.35*/("""input[name='califica"""),_display_(/*259.56*/e/*259.57*/.evaluaciontabla.id),format.raw/*259.76*/("""'][value='"""),_display_(/*259.87*/e/*259.88*/.respuesta),format.raw/*259.98*/("""']").prop("checked",true);
					"""),format.raw/*260.6*/("""}"""),format.raw/*260.7*/("""
					"""),_display_(/*261.7*/if(e.recursoevaluador.observacionEvaluacion != null)/*261.59*/{_display_(Seq[Any](format.raw/*261.60*/("""
						"""),format.raw/*262.7*/("""$("#divAspecto"""),_display_(/*262.22*/r/*262.23*/.aspecto.id),format.raw/*262.34*/(""" """),format.raw/*262.35*/("""textarea[name='observacionGral-"""),_display_(/*262.67*/e/*262.68*/.recursoevaluador.recurso.id),format.raw/*262.96*/("""-"""),_display_(/*262.98*/e/*262.99*/.evaluaciontabla.aspecto.id),format.raw/*262.126*/("""']").val(""""),_display_(/*262.137*/e/*262.138*/.recursoevaluador.observacionEvaluacion.observacion),format.raw/*262.189*/("""" );
					""")))}),format.raw/*263.7*/("""
				""")))}),format.raw/*264.6*/("""
			"""),format.raw/*265.4*/("""}"""),format.raw/*265.5*/("""
			
			
			"""),format.raw/*268.4*/("""// Muestra detalles de evaluación
	    	$("#totalReactivos"""),_display_(/*269.26*/r/*269.27*/.aspecto.id),format.raw/*269.38*/("""").html(($("#divAspecto"""),_display_(/*269.62*/r/*269.63*/.aspecto.id),format.raw/*269.74*/(""" """),format.raw/*269.75*/("""div.panel-title").length)  );
	    	$("#totalSi"""),_display_(/*270.19*/r/*270.20*/.aspecto.id),format.raw/*270.31*/("""").html(($("#divAspecto"""),_display_(/*270.55*/r/*270.56*/.aspecto.id),format.raw/*270.67*/(""" """),format.raw/*270.68*/("""input:radio[name^='califica'][value='2']:checked").length)  );
	    	//$("#totalNo"""),_display_(/*271.21*/r/*271.22*/.aspecto.id),format.raw/*271.33*/("""").html(($("#divAspecto"""),_display_(/*271.57*/r/*271.58*/.aspecto.id),format.raw/*271.69*/(""" """),format.raw/*271.70*/("""input:radio[name^='califica'][value='1']:checked").length)  );
	    	$("#totalNo"""),_display_(/*272.19*/r/*272.20*/.aspecto.id),format.raw/*272.31*/("""").html(($("#divAspecto"""),_display_(/*272.55*/r/*272.56*/.aspecto.id),format.raw/*272.67*/(""" """),format.raw/*272.68*/("""input:radio[name^='califica'][value='0']:checked").length) );
	    	$("#totalParcial"""),_display_(/*273.24*/r/*273.25*/.aspecto.id),format.raw/*273.36*/("""").html( ($("#divAspecto"""),_display_(/*273.61*/r/*273.62*/.aspecto.id),format.raw/*273.73*/(""" """),format.raw/*273.74*/("""input:radio[name^='califica'][value='1']:checked").length)  );
	    	$("#totalNA"""),_display_(/*274.19*/r/*274.20*/.aspecto.id),format.raw/*274.31*/("""").html(($("#divAspecto"""),_display_(/*274.55*/r/*274.56*/.aspecto.id),format.raw/*274.67*/(""" """),format.raw/*274.68*/("""input:radio[name^='califica'][value='-1']:checked").length)  );
	    	$("#calAspecto"""),_display_(/*275.22*/r/*275.23*/.aspecto.id),format.raw/*275.34*/("""").html("""),_display_(/*275.43*/r/*275.44*/.calificacionPorcentajeAspecto()),format.raw/*275.76*/(""");
			
			// Pone lineas de color
			$("#divAspecto"""),_display_(/*278.19*/r/*278.20*/.aspecto.id),format.raw/*278.31*/(""" """),format.raw/*278.32*/("""input:radio[name^='califica'][value='-1']:checked").closest(".panel-body").before("<div class='lineaColorNA'></div>")
	    	$("#divAspecto"""),_display_(/*279.22*/r/*279.23*/.aspecto.id),format.raw/*279.34*/(""" """),format.raw/*279.35*/("""input:radio[name^='califica'][value='2']:checked").closest(".panel-body").before("<div class='lineaColor2'></div>")
	    	$("#divAspecto"""),_display_(/*280.22*/r/*280.23*/.aspecto.id),format.raw/*280.34*/(""" """),format.raw/*280.35*/("""input:radio[name^='califica'][value='1']:checked").closest(".panel-body").before("<div class='lineaColor1'></div>")
			$("#divAspecto"""),_display_(/*281.19*/r/*281.20*/.aspecto.id),format.raw/*281.31*/(""" """),format.raw/*281.32*/("""input:radio[name^='califica'][value='0']:checked").closest(".panel-body").before("<div class='lineaColor0'></div>")
			
			// Homologa altura de paneles x aspecto
			var max=0;
			$("#divAspecto"""),_display_(/*285.19*/r/*285.20*/.aspecto.id),format.raw/*285.31*/(""" """),format.raw/*285.32*/(""".panel-body").each(function(i)"""),format.raw/*285.62*/("""{"""),format.raw/*285.63*/("""
				"""),format.raw/*286.5*/("""if($(this).height() > max)"""),format.raw/*286.31*/("""{"""),format.raw/*286.32*/("""
					"""),format.raw/*287.6*/("""max = $(this).height();	
				"""),format.raw/*288.5*/("""}"""),format.raw/*288.6*/("""
			"""),format.raw/*289.4*/("""}"""),format.raw/*289.5*/(""");
        """)))}),format.raw/*290.10*/("""
	"""),format.raw/*291.2*/("""}"""),format.raw/*291.3*/("""	
	

	"""),format.raw/*294.2*/("""$( document ).on( "click", "[id^='carousel'][id$='Anterior']", function(event) """),format.raw/*294.81*/("""{"""),format.raw/*294.82*/("""
		"""),format.raw/*295.3*/("""event.preventDefault();
		var idAspecto = $(this).prop("id").substr(8,1);
		var maxPag = $("#tablaNavegaCarousel"+idAspecto+" [name='cpPagina']").length;
		var pag = $("#tablaNavegaCarousel"+idAspecto+" [name='cpPagina'] span.badge").eq(0).parent().attr("data-slide-to");
		$("#tablaNavegaCarousel"+idAspecto+" [name='cpPagina']").eq( parseInt(pag)-1 ).click();
		$(this).toggle(parseInt(pag) > 1 );
		$("#carousel"+idAspecto+"Siguiente").toggle(parseInt(maxPag) != parseInt(pag));
	"""),format.raw/*302.2*/("""}"""),format.raw/*302.3*/(""");

	$( document ).on( "click", "[id^='carousel'][id$='Siguiente']", function(event) """),format.raw/*304.82*/("""{"""),format.raw/*304.83*/("""
		"""),format.raw/*305.3*/("""event.preventDefault();
		var idAspecto = $(this).prop("id").substr(8,1);
		var maxPag = $("#tablaNavegaCarousel"+idAspecto+" [name='cpPagina']").length;
		var pag = $("#tablaNavegaCarousel"+idAspecto+" [name='cpPagina'] span.badge").eq(0).parent().attr("data-slide-to"); 
		$("#tablaNavegaCarousel"+idAspecto+" [name='cpPagina']").eq( parseInt(pag)+1 ).click();		
		$(this).toggle(  (parseInt(maxPag)-2) != parseInt(pag));
		$("#carousel"+idAspecto+"Anterior").toggle(parseInt(pag) >= 0 );
		window.scrollTo(0, 0);
	"""),format.raw/*313.2*/("""}"""),format.raw/*313.3*/(""");	
</script>

<script src=""""),_display_(/*316.15*/routes/*316.21*/.Assets.at("javascripts/utilerias.js")),format.raw/*316.59*/(""""></script>

  """))}
  }

  def render(re:List[Recursoevaluador],idAspecto:String): play.twirl.api.HtmlFormat.Appendable = apply(re,idAspecto)

  def f:((List[Recursoevaluador],String) => play.twirl.api.HtmlFormat.Appendable) = (re,idAspecto) => apply(re,idAspecto)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Evaluaciones/evaluada.scala.html
                  HASH: c8228e67f0b39bf4707ad14004d3bae3a931bbe5
                  MATRIX: 762->1|895->46|922->47|993->92|1007->98|1078->148|1110->155|1121->159|1158->160|1186->162|1885->834|1896->836|1943->862|1981->872|2060->924|2089->944|2128->945|2163->953|2345->1108|2356->1110|2419->1152|2458->1163|2503->1181|2514->1183|2572->1220|2612->1232|2694->1283|2730->1292|2923->1458|2949->1468|2988->1469|3028->1481|3147->1573|3157->1574|3198->1594|3483->1852|3493->1853|3525->1864|3983->2295|3993->2296|4025->2307|4552->2807|4562->2808|4594->2819|4998->3196|5008->3197|5040->3208|5465->3605|5476->3606|5509->3617|5927->4007|5938->4008|5971->4019|6196->4212|6232->4220|6513->4474|6560->4504|6600->4505|6636->4513|6669->4518|6688->4527|6728->4528|6775->4543|6825->4565|6836->4566|6869->4577|6928->4607|6940->4608|6983->4628|7031->4645|7076->4662|7332->4890|7379->4920|7419->4921|7458->4931|7506->4951|7517->4952|7550->4963|7602->4987|7621->4996|7661->4997|7691->4998|7733->5008|7775->5022|7790->5027|7910->5124|7949->5134|7997->5150|8037->5161|8139->5232|8170->5235|8245->5281|8275->5282|8309->5288|8428->5378|8458->5379|8497->5389|8527->5390|8852->5686|8882->5687|8918->5695|9000->5749|9029->5750|9093->5786|9122->5787|9194->5830|9224->5831|9262->5841|9291->5853|9331->5854|9363->5858|9538->6004|9568->6005|9601->6010|9640->6020|9670->6021|9704->6027|9832->6126|9844->6127|9878->6138|9993->6225|10022->6226|10054->6230|10083->6231|10115->6235|10184->6275|10214->6276|10251->6285|10374->6379|10386->6380|10420->6391|10516->6459|10545->6460|10576->6463|10631->6490|10642->6491|10675->6502|10793->6591|10805->6592|10839->6603|11007->6742|11019->6743|11053->6754|11171->6844|11182->6845|11215->6856|11333->6945|11370->6959|11509->7069|11521->7070|11555->7081|11599->7096|11636->7110|11715->7157|11762->7176|11839->7226|11868->7238|11908->7239|11940->7243|12096->7371|12107->7372|12140->7383|12170->7384|12229->7414|12259->7415|12292->7420|12331->7430|12361->7431|12395->7437|12523->7536|12535->7537|12569->7548|12684->7635|12713->7636|12745->7640|12774->7641|12806->7645|12852->7663|12863->7664|12896->7675|12926->7676|12989->7710|13019->7711|13056->7720|13179->7814|13191->7815|13225->7826|13321->7894|13350->7895|13382->7899|13434->7923|13445->7924|13478->7935|13597->8025|13634->8039|13773->8149|13785->8150|13819->8161|13863->8176|13900->8190|13972->8231|14014->8245|14043->8246|14083->8258|14166->8312|14196->8313|14227->8316|14450->8510|14480->8511|14512->8515|14595->8569|14625->8570|14658->8575|14726->8615|14755->8616|14786->8619|14815->8620|15040->8816|15070->8817|15102->8821|15143->8833|15173->8834|15206->8839|15292->8897|15321->8898|15350->8899|15384->8904|15414->8905|15447->8910|15531->8966|15560->8967|15591->8970|15620->8971|15867->9190|15896->9191|15950->9216|15980->9217|16020->9229|16049->9241|16089->9242|16123->9248|16155->9253|16166->9254|16208->9274|16238->9275|16271->9279|16301->9280|16334->9286|16375->9310|16415->9311|16449->9317|16483->9323|16494->9324|16526->9334|16556->9335|16592->9342|16622->9343|16657->9350|16700->9365|16711->9366|16744->9377|16774->9378|16823->9399|16834->9400|16875->9419|16952->9468|16963->9469|16996->9480|17026->9481|17075->9502|17086->9503|17127->9522|17226->9593|17237->9594|17270->9605|17301->9607|17337->9615|17348->9616|17389->9635|17477->9695|17488->9696|17521->9707|17551->9708|17600->9729|17611->9730|17652->9749|17691->9760|17702->9761|17734->9771|17794->9803|17823->9804|17852->9805|17886->9810|17916->9811|17951->9818|17994->9833|18005->9834|18038->9845|18068->9846|18117->9867|18128->9868|18169->9887|18208->9898|18219->9899|18251->9909|18311->9941|18340->9942|18374->9949|18436->10001|18476->10002|18511->10009|18554->10024|18565->10025|18598->10036|18628->10037|18688->10069|18699->10070|18749->10098|18779->10100|18790->10101|18840->10128|18880->10139|18892->10140|18966->10191|19008->10202|19045->10208|19077->10212|19106->10213|19146->10225|19233->10284|19244->10285|19277->10296|19329->10320|19340->10321|19373->10332|19403->10333|19479->10381|19490->10382|19523->10393|19575->10417|19586->10418|19619->10429|19649->10430|19760->10513|19771->10514|19804->10525|19856->10549|19867->10550|19900->10561|19930->10562|20039->10643|20050->10644|20083->10655|20135->10679|20146->10680|20179->10691|20209->10692|20322->10777|20333->10778|20366->10789|20419->10814|20430->10815|20463->10826|20493->10827|20602->10908|20613->10909|20646->10920|20698->10944|20709->10945|20742->10956|20772->10957|20885->11042|20896->11043|20929->11054|20966->11063|20977->11064|21031->11096|21111->11148|21122->11149|21155->11160|21185->11161|21352->11300|21363->11301|21396->11312|21426->11313|21591->11450|21602->11451|21635->11462|21665->11463|21827->11597|21838->11598|21871->11609|21901->11610|22124->11805|22135->11806|22168->11817|22198->11818|22257->11848|22287->11849|22320->11854|22375->11880|22405->11881|22439->11887|22496->11916|22525->11917|22557->11921|22586->11922|22630->11934|22660->11936|22689->11937|22723->11943|22831->12022|22861->12023|22892->12026|23403->12509|23432->12510|23546->12595|23576->12596|23607->12599|24152->13116|24181->13117|24238->13146|24254->13152|24314->13190
                  LINES: 26->1|29->1|30->2|30->2|30->2|30->2|33->5|33->5|33->5|34->6|54->26|54->26|54->26|55->27|58->30|58->30|58->30|59->31|62->34|62->34|62->34|63->35|64->36|64->36|64->36|65->37|68->40|69->41|76->48|76->48|76->48|77->49|79->51|79->51|79->51|87->59|87->59|87->59|100->72|100->72|100->72|112->84|112->84|112->84|121->93|121->93|121->93|130->102|130->102|130->102|139->111|139->111|139->111|145->117|146->118|167->139|167->139|167->139|168->140|168->140|168->140|168->140|168->140|168->140|168->140|168->140|168->140|168->140|168->140|169->141|170->142|175->147|175->147|175->147|176->148|176->148|176->148|176->148|176->148|176->148|176->148|176->148|176->148|177->149|177->149|177->149|178->150|179->151|180->152|189->161|192->164|193->165|193->165|194->166|196->168|196->168|196->168|196->168|204->176|204->176|205->177|206->178|206->178|208->180|208->180|213->185|213->185|214->186|214->186|214->186|215->187|218->190|218->190|219->191|219->191|219->191|220->192|220->192|220->192|220->192|222->194|222->194|223->195|223->195|224->196|224->196|224->196|225->197|225->197|225->197|225->197|226->198|226->198|227->199|227->199|227->199|227->199|227->199|227->199|227->199|227->199|227->199|227->199|228->200|228->200|228->200|228->200|228->200|228->200|228->200|228->200|228->200|228->200|229->201|231->203|232->204|232->204|232->204|233->205|236->208|236->208|236->208|236->208|236->208|236->208|237->209|237->209|237->209|238->210|238->210|238->210|238->210|240->212|240->212|241->213|241->213|242->214|242->214|242->214|242->214|242->214|242->214|242->214|243->215|243->215|243->215|243->215|244->216|244->216|245->217|245->217|245->217|245->217|245->217|245->217|245->217|245->217|245->217|245->217|245->217|246->218|247->219|247->219|250->222|250->222|250->222|251->223|255->227|255->227|256->228|256->228|256->228|257->229|258->230|258->230|259->231|259->231|263->235|263->235|264->236|264->236|264->236|265->237|266->238|266->238|266->238|266->238|266->238|267->239|268->240|268->240|269->241|269->241|275->247|275->247|277->249|277->249|278->250|278->250|278->250|279->251|279->251|279->251|279->251|279->251|279->251|279->251|280->252|280->252|280->252|281->253|281->253|281->253|281->253|281->253|281->253|281->253|282->254|282->254|282->254|282->254|282->254|282->254|282->254|282->254|283->255|283->255|283->255|283->255|283->255|283->255|283->255|284->256|284->256|284->256|284->256|284->256|284->256|284->256|285->257|285->257|285->257|285->257|285->257|285->257|285->257|285->257|285->257|285->257|286->258|286->258|286->258|286->258|286->258|287->259|287->259|287->259|287->259|287->259|287->259|287->259|287->259|287->259|287->259|287->259|288->260|288->260|289->261|289->261|289->261|290->262|290->262|290->262|290->262|290->262|290->262|290->262|290->262|290->262|290->262|290->262|290->262|290->262|290->262|291->263|292->264|293->265|293->265|296->268|297->269|297->269|297->269|297->269|297->269|297->269|297->269|298->270|298->270|298->270|298->270|298->270|298->270|298->270|299->271|299->271|299->271|299->271|299->271|299->271|299->271|300->272|300->272|300->272|300->272|300->272|300->272|300->272|301->273|301->273|301->273|301->273|301->273|301->273|301->273|302->274|302->274|302->274|302->274|302->274|302->274|302->274|303->275|303->275|303->275|303->275|303->275|303->275|306->278|306->278|306->278|306->278|307->279|307->279|307->279|307->279|308->280|308->280|308->280|308->280|309->281|309->281|309->281|309->281|313->285|313->285|313->285|313->285|313->285|313->285|314->286|314->286|314->286|315->287|316->288|316->288|317->289|317->289|318->290|319->291|319->291|322->294|322->294|322->294|323->295|330->302|330->302|332->304|332->304|333->305|341->313|341->313|344->316|344->316|344->316
                  -- GENERATED --
              */
          