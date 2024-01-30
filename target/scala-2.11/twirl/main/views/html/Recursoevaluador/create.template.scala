
package views.html.Recursoevaluador

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
object create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[Recursoevaluador],Long,List[Calendario],List[Recursoevaluador],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(forma: Form[Recursoevaluador],  id : Long, inhabiles:List[Calendario], datos:List[Recursoevaluador] ):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.104*/("""
"""),format.raw/*3.77*/("""

"""),_display_(/*5.2*/main/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""
	"""),format.raw/*6.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*6.47*/routes/*6.53*/.Assets.at("stylesheets/fullcalendar.css")),format.raw/*6.95*/(""""/> 
	<script src=""""),_display_(/*7.16*/routes/*7.22*/.Assets.at("javascripts/fullcalendar/moment.min.js")),format.raw/*7.74*/("""" ></script>
	<script src=""""),_display_(/*8.16*/routes/*8.22*/.Assets.at("javascripts/fullcalendar/fullcalendar.min.js")),format.raw/*8.80*/("""" ></script>
	<script src=""""),_display_(/*9.16*/routes/*9.22*/.Assets.at("javascripts/fullcalendar/es.js")),format.raw/*9.66*/("""" ></script>
	<div id="fecha" class="hidden"></div>

	<div class="container-fluid" style="background-color: white; padding: 10px;">
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
				  <li>Recursos</li>
				  <li><a href="/asignarEvaluadores">Evaluadores asignados</a></li>
				  <li class="active">Asignar</li>
				</ol>			
			</div>
		</div>	
		<div class="row">
			<div class="col-md-12">
				<h3>Asignación de evaluadores para el recurso</h3>
			</div>
		</div>

		<div class="row">
			<div class="col-md-5">
				<div class="panel panel-default">
	              	<div class="panel-heading"><span class="glyphicon glyphicon-info-sign"></span>Evaluadores y fecha</div>
	           		<div class="panel-body">
          				"""),_display_(/*33.16*/form(CSRF(routes.RecursoevaluadorController.asignarEvaluadoresSave(id,"reasignar")), 'id->"frmCreate")/*33.118*/ {_display_(Seq[Any](format.raw/*33.120*/("""
							"""),format.raw/*34.8*/("""<div style="display: none;">	
										"""),_display_(/*35.12*/inputText(forma("aspecto1").copy(value=Some("1")), '_label->"",  'style -> "display: none")),format.raw/*35.103*/("""
										"""),_display_(/*36.12*/inputText(forma("aspecto2").copy(value=Some("2")), '_label->"",  'style -> "display: none")),format.raw/*36.103*/("""
										"""),_display_(/*37.12*/inputText(forma("aspecto3").copy(value=Some("3")), '_label->"",  'style -> "display: none")),format.raw/*37.103*/("""
										"""),_display_(/*38.12*/inputText(forma("aspecto4").copy(value=Some("4")), '_label->"",  'style -> "display: none")),format.raw/*38.103*/("""
										"""),_display_(/*39.12*/inputText(forma("sinCambio"), '_label->"",  'style -> "display: none")),format.raw/*39.82*/("""
							"""),format.raw/*40.8*/("""</div>
		           			<div class="row">
		           				<div class="col-md-12">
		           					<div class="row">
		           						<div class="col-md-6">
										    """),_display_(/*45.16*/select(
										        forma("evaluador1"), 
										        options(models.EvaluadorAspecto.optionsAspectoActivo(1)), 
										        'labelAlterna -> "Evaluadores para el aspecto Pedagógico", '_default -> "Seleccione el evaluador...",
										        '_showConstraints -> false
										   	)),format.raw/*50.16*/("""           						
		           						"""),format.raw/*51.20*/("""</div>
		           						<div class="col-md-6">
										    """),_display_(/*53.16*/select(
										        forma("evaluador2"), 
										        options(models.EvaluadorAspecto.optionsAspectoActivo(2)), 
										        'labelAlterna -> "Evaluadores para el aspecto Editorial", '_default -> "Seleccione el evaluador...",
										        '_showConstraints -> false
										   	)),format.raw/*58.16*/("""            						
		           						"""),format.raw/*59.20*/("""</div>
		           					</div>
		           					<div class="row">
		           						<div class="col-md-6">
										    """),_display_(/*63.16*/select(
										        forma("evaluador3"), 
										        options(models.EvaluadorAspecto.optionsAspectoActivo(3)), 
										        'labelAlterna -> "Evaluadores para el aspecto Técnico", '_default -> "Seleccione el evaluador...",
										        '_showConstraints -> false
										   	)),format.raw/*68.16*/("""           						
		           						"""),format.raw/*69.20*/("""</div>
		           						<div class="col-md-6">
										    """),_display_(/*71.16*/select(
										        forma("evaluador4"), 
										        options(models.EvaluadorAspecto.optionsAspectoActivo(4)), 
										        'labelAlterna -> "Evaluadores para el aspecto Diseño gráfico", '_default -> "Seleccione el evaluador...",
										        '_showConstraints -> false
										   	)),format.raw/*76.16*/("""            						
		           						"""),format.raw/*77.20*/("""</div>           						
		           					</div>
									<div class="row" id="divFechas">
										<div class="col-md-6">
											"""),_display_(/*81.13*/inputText(forma("ndias"), 'labelAlterna -> "Número de días para evaluar", '_help -> "", 'id->"este",'class->"form-control",'pattern->"[0-9]{1,2}" ,'required->"required", 'size->5, 'oninput->"calcular()", 'onkeyup->"calcular()")),format.raw/*81.240*/("""
										"""),format.raw/*82.11*/("""</div>
										<div class="col-md-6">											
											"""),_display_(/*84.13*/inputDate(forma("fechalimite"), 'labelAlterna -> "Último día para evaluar", '_help -> "", 'required->"required",'class->"form-control", 'placeholder->"dd/mm/aaaa", 'readonly->"readonly")),format.raw/*84.199*/("""										 
										"""),format.raw/*85.11*/("""</div>
									</div>
									"""),_display_(/*87.11*/if(datos.size!=0)/*87.28*/{_display_(Seq[Any](format.raw/*87.29*/("""
										"""),format.raw/*88.11*/("""<div class="row" id="divFechasLectura">
											<div class="col-md-6">
												Número de días para evaluar: """),_display_(/*90.43*/datos(0)/*90.51*/.recurso.evaluacionFecha.ndias),format.raw/*90.81*/("""
											"""),format.raw/*91.12*/("""</div>
											<div class="col-md-6">											
												Último día para evaluar: """),_display_(/*93.39*/datos(0)/*93.47*/.recurso.evaluacionFecha.fechalimite.format("dd/MM/yyyy")),format.raw/*93.104*/("""										 
											"""),format.raw/*94.12*/("""</div>
										</div>	
									""")))}),format.raw/*96.11*/("""								
									"""),format.raw/*97.10*/("""<div class="row">
										<div class="col-md-12">
											<div class="form-group clearfix  has-error">
												<div id="msgError" class="has-error control-label"></div>
											</div>
										</div>
										<div class="col-md-12">
											<!-- input type="submit" value="Asignar evaluadores"  class="btn btn-primary btn-block center-block" style="width: 70%"-->
											<input type="button" value="Asignar evaluadores"  class="btn btn-primary btn-block center-block" style="width:70%;" onclick="preValidar()">										

										</div>
									</div>		           					
		           				</div>
		           			</div>		  
		           		""")))}),format.raw/*111.17*/("""
		           		
		           		
		           		
		           		         			
	           		"""),format.raw/*116.15*/("""</div>
           		</div>
           	</div>
			<div class="col-md-7">
				<div class="panel panel-default">
	              	<div class="panel-heading"><span class="glyphicon glyphicon-info-sign"></span>Calendario</div>
	           		<div class="panel-body">
									<div class="col-md-12">
										<div id='calendar'></div>
									</div>						           		
	           		</div>
	           	</div>
	       </div>	           	
        </div>
    </div>
    
    
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title modalTitleError" id="myModalLabel">Advertencia</h4>
	      </div>
	      <div class="modal-body">
				Si esta intentando reemplazar un evaluador de un aspecto, al realizar esta operación se perderán las evaluaciones del aspecto realizadas por el evaluador anterior.<br><br>
				 
	      </div>
	      <div class="modal-footer">	      		
	        <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
	        <button type="button" class="btn btn-primary" id="btnContinuar">Continuar</button>
	      </div>
	    </div>
	  </div>
	</div>    

    
""")))}),format.raw/*154.2*/("""

"""),format.raw/*156.1*/("""<script type="text/javascript">
	var valAnteriores = null;
	$(function() """),format.raw/*158.15*/("""{"""),format.raw/*158.16*/("""
		"""),format.raw/*159.3*/("""$('#frmCreate').attr("data-toggle","validator");	
		$("#este").attr("data-error","Solo se permite hasta 2 dígitos.");
		leer();
		$('#calendar').fullCalendar("""),format.raw/*162.31*/("""{"""),format.raw/*162.32*/("""		
			"""),format.raw/*163.4*/("""editable: false,
			allDaySlot: false,
			eventLimit: true, // allow "more" link when too many events
			//aspectRatio: 2,
			allDayDefault: true,
			selectable: false,
			selectHelper: false,	
			weekends: false,
			eventRender: function(event, element) """),format.raw/*171.42*/("""{"""),format.raw/*171.43*/("""
				"""),format.raw/*172.5*/("""if (event.tipo ==1)"""),format.raw/*172.24*/("""{"""),format.raw/*172.25*/("""
					"""),format.raw/*173.6*/("""var color = '#C0C0C0';
				"""),format.raw/*174.5*/("""}"""),format.raw/*174.6*/("""
				"""),format.raw/*175.5*/("""if (event.tipo ==2)"""),format.raw/*175.24*/("""{"""),format.raw/*175.25*/("""
					"""),format.raw/*176.6*/("""var color = 'red';
				"""),format.raw/*177.5*/("""}"""),format.raw/*177.6*/("""
				"""),format.raw/*178.5*/("""if (event.tipo ==3)"""),format.raw/*178.24*/("""{"""),format.raw/*178.25*/("""
					"""),format.raw/*179.6*/("""var color = 'grey';
				"""),format.raw/*180.5*/("""}"""),format.raw/*180.6*/("""		
				"""),format.raw/*181.5*/("""if (event.tipo ==4)"""),format.raw/*181.24*/("""{"""),format.raw/*181.25*/("""
					"""),format.raw/*182.6*/("""var color = 'blue';
				"""),format.raw/*183.5*/("""}"""),format.raw/*183.6*/("""
				"""),format.raw/*184.5*/("""if (event.tipo ==5)"""),format.raw/*184.24*/("""{"""),format.raw/*184.25*/("""
					"""),format.raw/*185.6*/("""var color = 'cyan';
				"""),format.raw/*186.5*/("""}"""),format.raw/*186.6*/("""		
				"""),format.raw/*187.5*/("""$(element).css('background-color', color );			
			"""),format.raw/*188.4*/("""}"""),format.raw/*188.5*/(""",		
		
			events: [
			         
			    """),_display_(/*192.9*/for((f,i) <- inhabiles.zipWithIndex) yield /*192.45*/{_display_(Seq[Any](format.raw/*192.46*/("""
			    	"""),format.raw/*193.9*/("""{"""),format.raw/*193.10*/("""
			    		"""),format.raw/*194.10*/("""id:    """"),_display_(/*194.19*/f/*194.20*/.id),format.raw/*194.23*/("""",
			    		title: """"),_display_(/*195.19*/f/*195.20*/.descripcion),format.raw/*195.32*/("""",
			    		start: """"),_display_(/*196.19*/f/*196.20*/.desde),format.raw/*196.26*/("""",
			    	"""),format.raw/*197.56*/("""
			    		"""),format.raw/*198.10*/("""end:   moment(""""),_display_(/*198.26*/f/*198.27*/.hasta),format.raw/*198.33*/(""""),  
			    		tipo:  1,			    		
			    		rendering: 'background'
			    	"""),format.raw/*201.9*/("""}"""),format.raw/*201.10*/(""" """),_display_(/*201.12*/if( i != inhabiles.length-1)/*201.40*/{_display_(Seq[Any](format.raw/*201.41*/(""" """),format.raw/*201.42*/(""", """)))}),format.raw/*201.45*/("""		    	
			    """)))}),format.raw/*202.9*/("""
			    
			         
			"""),format.raw/*205.4*/("""],
		    eventMouseover: function( event, jsEvent, view ) """),format.raw/*206.56*/("""{"""),format.raw/*206.57*/(""" 
		    	"""),format.raw/*207.8*/("""//alert("id:"+event.id+"\ntitle:"+event.title+"\ntipo:"+event.tipo+"\ncolor:"+event.eventColor+"desde: "+moment(event.start).format('DD/MM/YYYY')+"\nhasta:"+moment(event.end).format('DD/MM/YYYY'));
		    """),format.raw/*208.7*/("""}"""),format.raw/*208.8*/("""			
		"""),format.raw/*209.3*/("""}"""),format.raw/*209.4*/(""");
		
		
		valAnteriores = [ $("#evaluador1").val(), $("#evaluador2").val(), $("#evaluador3").val(), $("#evaluador4").val()   ];
		
	"""),format.raw/*214.2*/("""}"""),format.raw/*214.3*/(""");
	
	function calcular()"""),format.raw/*216.21*/("""{"""),format.raw/*216.22*/("""		
		"""),format.raw/*217.3*/("""$.ajax("""),format.raw/*217.10*/("""{"""),format.raw/*217.11*/("""
			  """),format.raw/*218.6*/("""type: "GET",
			  url: '/hoyMasDias?nd='+$("#este").val()
			"""),format.raw/*220.4*/("""}"""),format.raw/*220.5*/(""")
		  .success(function( data ) """),format.raw/*221.31*/("""{"""),format.raw/*221.32*/("""
		  		"""),format.raw/*222.7*/("""$("#fechalimite").val(data);
		  		$('#calendar').fullCalendar('removeEvents', 'actual');	
		  		var eventObject = """),format.raw/*224.25*/("""{"""),format.raw/*224.26*/("""
		  				"""),format.raw/*225.9*/("""id: 'actual',
		  			    title: "Periodo",
		  			    start: moment().add(1,'days'),
		  			    end: moment(data).add(1,'days'),
		  			    tipo: 5,
		  			    rendering: 'background'

		  		"""),format.raw/*232.7*/("""}"""),format.raw/*232.8*/(""";

		  		$('#calendar').fullCalendar('renderEvent', eventObject, true);		  		
		  		
		  		
		  """),format.raw/*237.5*/("""}"""),format.raw/*237.6*/(""")
	"""),format.raw/*238.2*/("""}"""),format.raw/*238.3*/("""
	
	
			
	"""),format.raw/*242.2*/("""function preValidar()"""),format.raw/*242.23*/("""{"""),format.raw/*242.24*/("""		
		"""),format.raw/*243.3*/("""if ( $("#evaluador1").val() =="" &&  $("#evaluador2").val() =="" &&  $("#evaluador3").val() =="" && $("#evaluador4").val() ==""  )"""),format.raw/*243.133*/("""{"""),format.raw/*243.134*/("""
			"""),format.raw/*244.4*/("""$("#msgError").show();
			$("#msgError").html("No ha seleccionado ningún evaluador");
			event.preventDefault();
		"""),format.raw/*247.3*/("""}"""),format.raw/*247.4*/(""" """),format.raw/*247.5*/("""else """),format.raw/*247.10*/("""{"""),format.raw/*247.11*/("""
			"""),format.raw/*248.4*/("""$("#msgError").hide();
		"""),format.raw/*249.3*/("""}"""),format.raw/*249.4*/("""
		
		"""),format.raw/*251.3*/("""var valActuales = [ $("#evaluador1").val(), $("#evaluador2").val(), $("#evaluador3").val(), $("#evaluador4").val()   ];		

		var sinModificar = valAnteriores.length == valActuales.length && valAnteriores.every(function(element, index) """),format.raw/*253.113*/("""{"""),format.raw/*253.114*/("""
		        """),format.raw/*254.11*/("""return element === valActuales[index]; 
		    """),format.raw/*255.7*/("""}"""),format.raw/*255.8*/(""");		    

		$("#sinCambio").val(sinModificar);	
		if (!sinModificar) """),format.raw/*258.22*/("""{"""),format.raw/*258.23*/("""	
			"""),format.raw/*259.4*/("""if (""""),_display_(/*259.10*/datos/*259.15*/.isEmpty),format.raw/*259.23*/("""" == "false")"""),format.raw/*259.36*/("""{"""),format.raw/*259.37*/("""				
				"""),format.raw/*260.5*/("""$('#myModal').modal('show');
			"""),format.raw/*261.4*/("""}"""),format.raw/*261.5*/(""" """),format.raw/*261.6*/("""else """),format.raw/*261.11*/("""{"""),format.raw/*261.12*/("""				
				"""),format.raw/*262.5*/("""$("#frmCreate").submit();
			"""),format.raw/*263.4*/("""}"""),format.raw/*263.5*/("""
		"""),format.raw/*264.3*/("""}"""),format.raw/*264.4*/(""" """),format.raw/*264.5*/("""else """),format.raw/*264.10*/("""{"""),format.raw/*264.11*/("""
			"""),format.raw/*265.4*/("""alert("No ha modificado ninguna asignación");
		"""),format.raw/*266.3*/("""}"""),format.raw/*266.4*/("""
	"""),format.raw/*267.2*/("""}"""),format.raw/*267.3*/("""
	
	"""),format.raw/*269.2*/("""function leer()"""),format.raw/*269.17*/("""{"""),format.raw/*269.18*/("""
		"""),format.raw/*270.3*/("""if ("""),_display_(/*270.8*/datos/*270.13*/.size),format.raw/*270.18*/("""!=0)"""),format.raw/*270.22*/("""{"""),format.raw/*270.23*/("""
			"""),format.raw/*271.4*/("""$("#divFechas").hide();
		"""),format.raw/*272.3*/("""}"""),format.raw/*272.4*/("""
		"""),_display_(/*273.4*/for(d<-datos) yield /*273.17*/{_display_(Seq[Any](format.raw/*273.18*/("""
"""),_display_(/*274.2*/println(d.evaluador.id)),format.raw/*274.25*/("""			
			"""),format.raw/*275.4*/("""$("#evaluador"""),_display_(/*275.18*/d/*275.19*/.aspecto.id),format.raw/*275.30*/("""").val(""""),_display_(/*275.39*/d/*275.40*/.evaluador.id),format.raw/*275.53*/("""").prop('selected', true);			
		""")))}),format.raw/*276.4*/("""
	"""),format.raw/*277.2*/("""}"""),format.raw/*277.3*/("""

	"""),format.raw/*279.2*/("""$("#btnContinuar").on("click",function()"""),format.raw/*279.42*/("""{"""),format.raw/*279.43*/("""
		"""),format.raw/*280.3*/("""$("#frmCreate").submit();
	"""),format.raw/*281.2*/("""}"""),format.raw/*281.3*/(""");
	
	
	

	
</script>
<script src=""""),_display_(/*288.15*/routes/*288.21*/.Assets.at("javascripts/validator.min.js")),format.raw/*288.63*/("""" type="text/javascript"></script>"""))}
  }

  def render(forma:Form[Recursoevaluador],id:Long,inhabiles:List[Calendario],datos:List[Recursoevaluador]): play.twirl.api.HtmlFormat.Appendable = apply(forma,id,inhabiles,datos)

  def f:((Form[Recursoevaluador],Long,List[Calendario],List[Recursoevaluador]) => play.twirl.api.HtmlFormat.Appendable) = (forma,id,inhabiles,datos) => apply(forma,id,inhabiles,datos)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recursoevaluador/create.scala.html
                  HASH: 4d313ddd987ac40dfcad090f7caad80011e58a9b
                  MATRIX: 802->1|999->122|1031->146|1113->103|1141->197|1169->200|1180->204|1217->205|1245->207|1316->252|1330->258|1392->300|1438->320|1452->326|1524->378|1578->406|1592->412|1670->470|1724->498|1738->504|1802->548|2582->1301|2694->1403|2735->1405|2770->1413|2838->1454|2951->1545|2990->1557|3103->1648|3142->1660|3255->1751|3294->1763|3407->1854|3446->1866|3537->1936|3572->1944|3774->2119|4100->2424|4165->2461|4256->2525|4581->2829|4647->2867|4799->2992|5122->3294|5187->3331|5278->3395|5608->3704|5674->3742|5837->3878|6086->4105|6125->4116|6215->4179|6423->4365|6473->4387|6533->4420|6559->4437|6598->4438|6637->4449|6780->4565|6797->4573|6848->4603|6888->4615|7005->4705|7022->4713|7101->4770|7152->4793|7218->4828|7264->4846|7957->5507|8077->5598|9551->7041|9581->7043|9683->7116|9713->7117|9744->7120|9931->7278|9961->7279|9995->7285|10279->7540|10309->7541|10342->7546|10390->7565|10420->7566|10454->7572|10509->7599|10538->7600|10571->7605|10619->7624|10649->7625|10683->7631|10734->7654|10763->7655|10796->7660|10844->7679|10874->7680|10908->7686|10960->7710|10989->7711|11024->7718|11072->7737|11102->7738|11136->7744|11188->7768|11217->7769|11250->7774|11298->7793|11328->7794|11362->7800|11414->7824|11443->7825|11478->7832|11556->7882|11585->7883|11653->7924|11706->7960|11746->7961|11783->7970|11813->7971|11852->7981|11889->7990|11900->7991|11925->7994|11974->8015|11985->8016|12019->8028|12068->8049|12079->8050|12107->8056|12147->8114|12186->8124|12230->8140|12241->8141|12269->8147|12372->8222|12402->8223|12432->8225|12470->8253|12510->8254|12540->8255|12575->8258|12622->8274|12675->8299|12762->8357|12792->8358|12829->8367|13061->8571|13090->8572|13124->8578|13153->8579|13314->8712|13343->8713|13397->8738|13427->8739|13460->8744|13496->8751|13526->8752|13560->8758|13649->8819|13678->8820|13739->8852|13769->8853|13804->8860|13948->8975|13978->8976|14015->8985|14234->9176|14263->9177|14387->9273|14416->9274|14447->9277|14476->9278|14514->9288|14564->9309|14594->9310|14627->9315|14787->9445|14818->9446|14850->9450|14993->9565|15022->9566|15051->9567|15085->9572|15115->9573|15147->9577|15200->9602|15229->9603|15263->9609|15528->9844|15559->9845|15599->9856|15673->9902|15702->9903|15800->9972|15830->9973|15863->9978|15897->9984|15912->9989|15942->9997|15984->10010|16014->10011|16051->10020|16111->10052|16140->10053|16169->10054|16203->10059|16233->10060|16270->10069|16327->10098|16356->10099|16387->10102|16416->10103|16445->10104|16479->10109|16509->10110|16541->10114|16617->10162|16646->10163|16676->10165|16705->10166|16737->10170|16781->10185|16811->10186|16842->10189|16874->10194|16889->10199|16916->10204|16949->10208|16979->10209|17011->10213|17065->10239|17094->10240|17125->10244|17155->10257|17195->10258|17224->10260|17269->10283|17304->10290|17346->10304|17357->10305|17390->10316|17427->10325|17438->10326|17473->10339|17537->10372|17567->10374|17596->10375|17627->10378|17696->10418|17726->10419|17757->10422|17812->10449|17841->10450|17905->10486|17921->10492|17985->10534
                  LINES: 26->1|28->3|28->3|29->1|30->3|32->5|32->5|32->5|33->6|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|60->33|60->33|60->33|61->34|62->35|62->35|63->36|63->36|64->37|64->37|65->38|65->38|66->39|66->39|67->40|72->45|77->50|78->51|80->53|85->58|86->59|90->63|95->68|96->69|98->71|103->76|104->77|108->81|108->81|109->82|111->84|111->84|112->85|114->87|114->87|114->87|115->88|117->90|117->90|117->90|118->91|120->93|120->93|120->93|121->94|123->96|124->97|138->111|143->116|181->154|183->156|185->158|185->158|186->159|189->162|189->162|190->163|198->171|198->171|199->172|199->172|199->172|200->173|201->174|201->174|202->175|202->175|202->175|203->176|204->177|204->177|205->178|205->178|205->178|206->179|207->180|207->180|208->181|208->181|208->181|209->182|210->183|210->183|211->184|211->184|211->184|212->185|213->186|213->186|214->187|215->188|215->188|219->192|219->192|219->192|220->193|220->193|221->194|221->194|221->194|221->194|222->195|222->195|222->195|223->196|223->196|223->196|224->197|225->198|225->198|225->198|225->198|228->201|228->201|228->201|228->201|228->201|228->201|228->201|229->202|232->205|233->206|233->206|234->207|235->208|235->208|236->209|236->209|241->214|241->214|243->216|243->216|244->217|244->217|244->217|245->218|247->220|247->220|248->221|248->221|249->222|251->224|251->224|252->225|259->232|259->232|264->237|264->237|265->238|265->238|269->242|269->242|269->242|270->243|270->243|270->243|271->244|274->247|274->247|274->247|274->247|274->247|275->248|276->249|276->249|278->251|280->253|280->253|281->254|282->255|282->255|285->258|285->258|286->259|286->259|286->259|286->259|286->259|286->259|287->260|288->261|288->261|288->261|288->261|288->261|289->262|290->263|290->263|291->264|291->264|291->264|291->264|291->264|292->265|293->266|293->266|294->267|294->267|296->269|296->269|296->269|297->270|297->270|297->270|297->270|297->270|297->270|298->271|299->272|299->272|300->273|300->273|300->273|301->274|301->274|302->275|302->275|302->275|302->275|302->275|302->275|302->275|303->276|304->277|304->277|306->279|306->279|306->279|307->280|308->281|308->281|315->288|315->288|315->288
                  -- GENERATED --
              */
          