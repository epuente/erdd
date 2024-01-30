
package views.html.Prorrogas

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
object edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Recursoevaluador,List[Calendario],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(re:Recursoevaluador, inhabiles:List[Calendario], ndias:Int):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.77*/(""" 

"""),_display_(/*5.2*/main/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""
	"""),format.raw/*6.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*6.47*/routes/*6.53*/.Assets.at("stylesheets/fullcalendar.css")),format.raw/*6.95*/(""""/> 
	<script src=""""),_display_(/*7.16*/routes/*7.22*/.Assets.at("javascripts/fullcalendar/moment.min.js")),format.raw/*7.74*/("""" ></script>
	<script src=""""),_display_(/*8.16*/routes/*8.22*/.Assets.at("javascripts/fullcalendar/fullcalendar.min.js")),format.raw/*8.80*/("""" ></script>
	<script src=""""),_display_(/*9.16*/routes/*9.22*/.Assets.at("javascripts/fullcalendar/es.js")),format.raw/*9.66*/("""" ></script>
	<div id="fecha" class="hidden"></div>


	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">¿Eliminar prórroga?</h4>
	      </div>
	      <div class="modal-body" id="modalBody">	
	
	      </div>
	      <div class="modal-footer">      	
	        <button type="button" class="btn btn-danger" id="btnBorrar">Borrar</button>
	        <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
	      </div>
	    </div>
	  </div>
	</div>


	<div class="container-fluid" style="background-color: white; padding: 10px;">
		<div class="row">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
				<ol class="breadcrumb">
				  <li>Recursos</li>
				  <li> <a href="/prorrogaList"> Prórrogas</a></li>
				  <li class="active">Crear/Editar</li>
				</ol>			
			</div>
		</div>	
		<div class="row">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
				<h3>Asignación de prórrogas para el recurso</h3>
			</div>
		</div>

		<div class="row">
			<div class="col-xs-12 col-sm-12 col-md-5 col-lg-5">
				<div class="panel panel-default">
	              	<div class="panel-heading"><span class="glyphicon glyphicon-info-sign"></span>Fechas</div>
	           		<div class="panel-body">
	           			<div class="row">
	           				<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
	           					
		           					<table class="table table-bordered table-condensed">
		           						<tr><td>Título</td><td>"""),_display_(/*58.44*/re/*58.46*/.recurso.titulo),format.raw/*58.61*/("""</td></tr>
		           						<tr><td>Clave control</td><td>"""),_display_(/*59.51*/re/*59.53*/.recurso.numcontrol),format.raw/*59.72*/("""</td></tr>
		           						<tr><td>Fecha registro web</td><td>"""),_display_(/*60.56*/re/*60.58*/.recurso.auditinsert.format("dd/MM/yyyy   hh:mm")),format.raw/*60.107*/("""</td></tr>
		           						<tr><td>Aspecto</td><td>"""),_display_(/*61.45*/re/*61.47*/.aspecto.descripcion),format.raw/*61.67*/("""</td></tr>
		           						<tr><td>Evaluador</td><td>"""),_display_(/*62.47*/re/*62.49*/.evaluador.personal.nombreCompleto),format.raw/*62.83*/("""</td></tr>
		           						<tr><td>Fecha asignacion evaluadores</td><td>"""),_display_(/*63.66*/re/*63.68*/.auditinsert.format("dd/MM/yyyy   hh:mm")),format.raw/*63.109*/("""</td></tr>
		           						<tr><td>Fecha inicio evaluación</td><td>"""),_display_(/*64.61*/re/*64.63*/.recurso.evaluacionFecha.fechainicio.format("dd/MM/yyyy")),format.raw/*64.120*/("""</td></tr>
		           						<tr><td>Número de días otorgados</td><td>"""),_display_(/*65.62*/re/*65.64*/.recurso.evaluacionFecha.ndias),format.raw/*65.94*/("""</td></tr>
		           						<tr><td>Fecha final evaluación</td><td><div name="divFl">"""),_display_(/*66.78*/re/*66.80*/.recurso.evaluacionFecha.fechalimite.format("dd/MM/yyyy")),format.raw/*66.137*/("""</div></td></tr>
	           						</table>

           						
	           						"""),_display_(/*70.20*/if(re.prorrogas.size != 0)/*70.46*/{_display_(Seq[Any](format.raw/*70.47*/("""
	           							"""),format.raw/*71.20*/("""<div id="encTablas">
           									<h3>Prórrogas previamente otorgadas</h3>
			           					</div>
		           						"""),_display_(/*74.21*/for(p <- re.prorrogas) yield /*74.43*/{_display_(Seq[Any](format.raw/*74.44*/("""
		           						    """),_display_(/*75.25*/if(p.autorizado == true)/*75.49*/{_display_(Seq[Any](format.raw/*75.50*/("""
				           						"""),format.raw/*76.22*/("""<table class="table table-bordered table-condensed" name="tblProrrogasExistentes">
					           						<tr><td>Número de días otorgados</td><td>"""),_display_(/*77.65*/p/*77.66*/.ndias),format.raw/*77.72*/("""</td><td rowspan="2"><div class="center-block"><a name="btnEliminar" id ="id"""),_display_(/*77.149*/p/*77.150*/.id),format.raw/*77.153*/("""" class="btn btn-danger btn-sm btn-block" disabled="disabled" role="button">Eliminar  <i class="fa fa-trash-o"></i></a></div></td></tr>
	                                                <tr><td>Prórroga al</td><td><div name="divFl">"""),_display_(/*78.97*/p/*78.98*/.fecha.format("dd/MM/yyyy")),format.raw/*78.125*/("""</div></td></tr>
				           						</table>
			           						""")))}),format.raw/*80.22*/("""
		           						""")))}),format.raw/*81.21*/("""
		           						           							
	           						""")))}),format.raw/*83.20*/("""
	           						
	           						
	           						"""),_display_(/*86.20*/form(CSRF(routes.ProrrogaController.save(re.id)), 'id->"frmCreate")/*86.87*/ {_display_(Seq[Any](format.raw/*86.89*/("""
		           						"""),format.raw/*87.20*/("""<table class="table table-bordered table-condensed">
			           						<tr>
			           							<td>Número de días</td>
			           							<td><input type="text" id="ndias" name="ndias" size="5" pattern="[0-9]"""),format.raw/*90.92*/("""{"""),format.raw/*90.93*/("""1,2"""),format.raw/*90.96*/("""}"""),format.raw/*90.97*/("""" class="form-control" required="required" data-error="Solo se permite hasta 2 dígitos." """),_display_(/*90.187*/if(ndias!=0)/*90.199*/{_display_(Seq[Any](format.raw/*90.200*/("""value="""),_display_(/*90.207*/ndias)))}),format.raw/*90.213*/(""" """),format.raw/*90.214*/("""/><span class="help-block with-errors"></span></td>
			           						</tr>
			           						<tr>
			           							<td>Último día para evaluar</td>
			           							<td><input type="text" id="fechalimite" name="fechalimite" required="required" placeholder="dd/mm/aaaa" readonly="readonly" class="form-control"></td>
			           						</tr>
										</table>
										<input type="submit" value="Asignar prórroga"  class="btn btn-primary btn-block">										
           							""")))}),format.raw/*98.20*/("""								
							"""),format.raw/*99.8*/("""</div>
	           			</div>
	           		</div>
           		</div>
           	</div>
			<div class="col-xs-12 col-sm-12 col-md-7 col-lg-7">
				<div class="panel panel-default">
	              	<div class="panel-heading"><span class="glyphicon glyphicon-info-sign"></span>Calendario</div>
	           		<div class="panel-body">
									<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
										<div id='calendar'></div>
									</div>						           		
	           		</div>
	           	</div>
	       </div>	           	
        </div>
   </div>







""")))}),format.raw/*123.2*/("""


"""),format.raw/*126.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*127.15*/("""{"""),format.raw/*127.16*/("""
		"""),format.raw/*128.3*/("""$("[name='btnEliminar']:last").attr("disabled", false);
		$('#calendar').fullCalendar("""),format.raw/*129.31*/("""{"""),format.raw/*129.32*/("""		
			"""),format.raw/*130.4*/("""editable: false,
			allDaySlot: false,
			eventLimit: true, // allow "more" link when too many events
			//aspectRatio: 2,La solicitud del recurso
			allDayDefault: true,
			selectable: false,
			selectHelper: false,	
			weekends: false,
			eventRender: function(event, element) """),format.raw/*138.42*/("""{"""),format.raw/*138.43*/("""
				"""),format.raw/*139.5*/("""if (event.tipo ==1)"""),format.raw/*139.24*/("""{"""),format.raw/*139.25*/("""
					"""),format.raw/*140.6*/("""var color = '#C0C0C0';
				"""),format.raw/*141.5*/("""}"""),format.raw/*141.6*/("""
				"""),format.raw/*142.5*/("""if (event.tipo ==2)"""),format.raw/*142.24*/("""{"""),format.raw/*142.25*/("""
					"""),format.raw/*143.6*/("""var color = 'red';
				"""),format.raw/*144.5*/("""}"""),format.raw/*144.6*/("""
				"""),format.raw/*145.5*/("""if (event.tipo ==3)"""),format.raw/*145.24*/("""{"""),format.raw/*145.25*/("""
					"""),format.raw/*146.6*/("""var color = 'grey';
				"""),format.raw/*147.5*/("""}"""),format.raw/*147.6*/("""		
				"""),format.raw/*148.5*/("""if (event.tipo ==4)"""),format.raw/*148.24*/("""{"""),format.raw/*148.25*/("""
					"""),format.raw/*149.6*/("""var color = 'blue';
				"""),format.raw/*150.5*/("""}"""),format.raw/*150.6*/("""
				"""),format.raw/*151.5*/("""if (event.tipo ==5)"""),format.raw/*151.24*/("""{"""),format.raw/*151.25*/("""
					"""),format.raw/*152.6*/("""var color = 'cyan';
				"""),format.raw/*153.5*/("""}"""),format.raw/*153.6*/("""		
				"""),format.raw/*154.5*/("""$(element).css('background-color', color );			
			"""),format.raw/*155.4*/("""}"""),format.raw/*155.5*/(""",		
		
			events: [
			         
			    """),_display_(/*159.9*/for((f,i) <- inhabiles.zipWithIndex) yield /*159.45*/{_display_(Seq[Any](format.raw/*159.46*/("""
			    	"""),format.raw/*160.9*/("""{"""),format.raw/*160.10*/("""
			    		"""),format.raw/*161.10*/("""id:    """"),_display_(/*161.19*/f/*161.20*/.id),format.raw/*161.23*/("""",
			    		title: """"),_display_(/*162.19*/f/*162.20*/.descripcion),format.raw/*162.32*/("""",
			    		start: """"),_display_(/*163.19*/f/*163.20*/.desde),format.raw/*163.26*/("""",
"""),format.raw/*164.57*/("""
			    		"""),format.raw/*165.10*/("""end:   moment(""""),_display_(/*165.26*/f/*165.27*/.hasta),format.raw/*165.33*/(""""),   
			    		tipo:  1,			    		
			    		rendering: 'background'
			    	"""),format.raw/*168.9*/("""}"""),format.raw/*168.10*/(""" """),_display_(/*168.12*/if( i != inhabiles.length-1)/*168.40*/{_display_(Seq[Any](format.raw/*168.41*/(""" """),format.raw/*168.42*/(""", """)))}),format.raw/*168.45*/("""		    	
			    """)))}),format.raw/*169.9*/("""
			    
			         
			"""),format.raw/*172.4*/("""],
		    eventMouseover: function( event, jsEvent, view ) """),format.raw/*173.56*/("""{"""),format.raw/*173.57*/(""" 
		    	"""),format.raw/*174.8*/("""alert("id:"+event.id+"\ntitle:"+event.title+"\ntipo:"+event.tipo+"\ncolor:"+event.eventColor+"desde: "+moment(event.start).format('DD/MM/YYYY')+"\nhasta:"+moment(event.end).format('DD/MM/YYYY'));
		    """),format.raw/*175.7*/("""}"""),format.raw/*175.8*/("""			
			


			
		"""),format.raw/*180.3*/("""}"""),format.raw/*180.4*/(""");
		
		
		if ( $("#ndias").val().length != 0 )"""),format.raw/*183.39*/("""{"""),format.raw/*183.40*/("""
			"""),format.raw/*184.4*/("""$("#ndias").trigger("input");
		"""),format.raw/*185.3*/("""}"""),format.raw/*185.4*/("""		
		
		
		
	"""),format.raw/*189.2*/("""}"""),format.raw/*189.3*/(""");
	
	function calcular()"""),format.raw/*191.21*/("""{"""),format.raw/*191.22*/("""		
		"""),format.raw/*192.3*/("""var fecha = moment($("div[name='divFl']:last").html(),"DD/MM/YYYY");
		$.ajax("""),format.raw/*193.10*/("""{"""),format.raw/*193.11*/("""
			  """),format.raw/*194.6*/("""type: "GET",
			  url: '/fechaMasDias?nd='+$("#ndias").val()+'&fechainicio='+	fecha.format("YYYY-MM-DD")				  
			"""),format.raw/*196.4*/("""}"""),format.raw/*196.5*/(""")
		  .success(function( data ) """),format.raw/*197.31*/("""{"""),format.raw/*197.32*/("""
			    """),format.raw/*198.8*/("""var fechaFinal = moment(data).format('DD/MM/YYYY');
		  		$("#fechalimite").val(fechaFinal);
		  		$('#calendar').fullCalendar('removeEvents', 'actual');	
		  		var eventObject = """),format.raw/*201.25*/("""{"""),format.raw/*201.26*/("""
		  				"""),format.raw/*202.9*/("""id: 'actual',
		  			    title: "Periodo",
		  			    start: moment(fecha).add(1,'days'),
		  			    end: moment(data).add(1,'days'),
		  			    tipo: 5,
		  			    rendering: 'background'		  		"""),format.raw/*207.41*/("""}"""),format.raw/*207.42*/(""";
		  		$('#calendar').fullCalendar('renderEvent', eventObject, true);		
		  """),format.raw/*209.5*/("""}"""),format.raw/*209.6*/(""")
	"""),format.raw/*210.2*/("""}"""),format.raw/*210.3*/("""
	
	"""),format.raw/*212.2*/("""$("#ndias").on("input",function()"""),format.raw/*212.35*/("""{"""),format.raw/*212.36*/("""		
		"""),format.raw/*213.3*/("""calcular();
	"""),format.raw/*214.2*/("""}"""),format.raw/*214.3*/(""");
	

	
	$( document ).on( "click", "[name='btnEliminar']:last", function() """),format.raw/*218.69*/("""{"""),format.raw/*218.70*/("""		
		"""),format.raw/*219.3*/("""$("#modalBody").html("¿Desea continuar con la eliminación de la prórroga al día "+$("[name='divFl']:last").html()+"?");
		$("#myModal").modal('show');
	"""),format.raw/*221.2*/("""}"""),format.raw/*221.3*/(""");	
	
	
	$("#btnBorrar").on("click", function()"""),format.raw/*224.40*/("""{"""),format.raw/*224.41*/("""
		"""),format.raw/*225.3*/("""$.ajax("""),format.raw/*225.10*/("""{"""),format.raw/*225.11*/("""
			  """),format.raw/*226.6*/("""type: "POST",			  
			  url: '/prorrogaDelete/'+$("[name='btnEliminar']:last").attr("id").substring(2)
			  			
		"""),format.raw/*229.3*/("""}"""),format.raw/*229.4*/(""")
		.success(function( data ) """),format.raw/*230.29*/("""{"""),format.raw/*230.30*/("""
			"""),format.raw/*231.4*/("""$("[name='tblProrrogasExistentes']:last").remove();
			$("#myModal").modal('hide');			
			if ($("[name='tblProrrogasExistentes']").length == 0)"""),format.raw/*233.57*/("""{"""),format.raw/*233.58*/("""
				"""),format.raw/*234.5*/("""$("#encTablas").hide();
			"""),format.raw/*235.4*/("""}"""),format.raw/*235.5*/("""
			"""),format.raw/*236.4*/("""$("[name='btnEliminar']:last").attr("disabled",false);
		"""),format.raw/*237.3*/("""}"""),format.raw/*237.4*/(""")
		.error(function()"""),format.raw/*238.20*/("""{"""),format.raw/*238.21*/("""
			"""),format.raw/*239.4*/("""alert("error de ajax");
		"""),format.raw/*240.3*/("""}"""),format.raw/*240.4*/(""");
	"""),format.raw/*241.2*/("""}"""),format.raw/*241.3*/(""");
	
	
	
	+function(a)"""),format.raw/*245.14*/("""{"""),format.raw/*245.15*/(""""use strict";function b(b)"""),format.raw/*245.41*/("""{"""),format.raw/*245.42*/("""return this.each(function()"""),format.raw/*245.69*/("""{"""),format.raw/*245.70*/("""var d=a(this),e=a.extend("""),format.raw/*245.95*/("""{"""),format.raw/*245.96*/("""}"""),format.raw/*245.97*/(""",c.DEFAULTS,d.data(),"object"==typeof b&&b),f=d.data("bs.validator");(f||"destroy"!=b)&&(f||d.data("bs.validator",f=new c(this,e)),"string"==typeof b&&f[b]())"""),format.raw/*245.255*/("""}"""),format.raw/*245.256*/(""")"""),format.raw/*245.257*/("""}"""),format.raw/*245.258*/("""var c=function(b,c)"""),format.raw/*245.277*/("""{"""),format.raw/*245.278*/("""this.$element=a(b),this.options=c,this.$element.attr("novalidate",!0),this.toggleSubmit(),this.$element.on("input.bs.validator change.bs.validator focusout.bs.validator",a.proxy(this.validateInput,this)),this.$element.on("submit.bs.validator",a.proxy(this.onSubmit,this)),this.$element.find("[data-match]").each(function()"""),format.raw/*245.600*/("""{"""),format.raw/*245.601*/("""var b=a(this),c=b.data("match");a(c).on("input.bs.validator",function()"""),format.raw/*245.672*/("""{"""),format.raw/*245.673*/("""b.val()&&b.trigger("input.bs.validator")"""),format.raw/*245.713*/("""}"""),format.raw/*245.714*/(""")"""),format.raw/*245.715*/("""}"""),format.raw/*245.716*/(""")"""),format.raw/*245.717*/("""}"""),format.raw/*245.718*/(""";c.DEFAULTS="""),format.raw/*245.730*/("""{"""),format.raw/*245.731*/("""delay:500,html:!1,disable:!0,errors:"""),format.raw/*245.767*/("""{"""),format.raw/*245.768*/("""match:"Does not match",minlength:"Not long enough""""),format.raw/*245.818*/("""}"""),format.raw/*245.819*/("""}"""),format.raw/*245.820*/(""",c.VALIDATORS="""),format.raw/*245.834*/("""{"""),format.raw/*245.835*/(""""native":function(a)"""),format.raw/*245.855*/("""{"""),format.raw/*245.856*/("""var b=a[0];return b.checkValidity?b.checkValidity():!0"""),format.raw/*245.910*/("""}"""),format.raw/*245.911*/(""",match:function(b)"""),format.raw/*245.929*/("""{"""),format.raw/*245.930*/("""var c=b.data("match");return!b.val()||b.val()===a(c).val()"""),format.raw/*245.988*/("""}"""),format.raw/*245.989*/(""",minlength:function(a)"""),format.raw/*245.1011*/("""{"""),format.raw/*245.1012*/("""var b=a.data("minlength");return!a.val()||a.val().length>=b"""),format.raw/*245.1071*/("""}"""),format.raw/*245.1072*/("""}"""),format.raw/*245.1073*/(""",c.prototype.validateInput=function(b)"""),format.raw/*245.1111*/("""{"""),format.raw/*245.1112*/("""var c=a(b.target),d=c.data("bs.validator.errors");if(c.is('[type="radio"]')&&(c=this.$element.find('input[name="'+c.attr("name")+'"]')),this.$element.trigger(b=a.Event("validate.bs.validator","""),format.raw/*245.1304*/("""{"""),format.raw/*245.1305*/("""relatedTarget:c[0]"""),format.raw/*245.1323*/("""}"""),format.raw/*245.1324*/(""")),!b.isDefaultPrevented())"""),format.raw/*245.1351*/("""{"""),format.raw/*245.1352*/("""var e=this;this.runValidators(c).done(function(f)"""),format.raw/*245.1401*/("""{"""),format.raw/*245.1402*/("""c.data("bs.validator.errors",f),f.length?e.showErrors(c):e.clearErrors(c),d&&f.toString()===d.toString()||(b=f.length?a.Event("invalid.bs.validator","""),format.raw/*245.1551*/("""{"""),format.raw/*245.1552*/("""relatedTarget:c[0],detail:f"""),format.raw/*245.1579*/("""}"""),format.raw/*245.1580*/("""):a.Event("valid.bs.validator","""),format.raw/*245.1611*/("""{"""),format.raw/*245.1612*/("""relatedTarget:c[0],detail:d"""),format.raw/*245.1639*/("""}"""),format.raw/*245.1640*/("""),e.$element.trigger(b)),e.toggleSubmit(),e.$element.trigger(a.Event("validated.bs.validator","""),format.raw/*245.1734*/("""{"""),format.raw/*245.1735*/("""relatedTarget:c[0]"""),format.raw/*245.1753*/("""}"""),format.raw/*245.1754*/("""))"""),format.raw/*245.1756*/("""}"""),format.raw/*245.1757*/(""")"""),format.raw/*245.1758*/("""}"""),format.raw/*245.1759*/("""}"""),format.raw/*245.1760*/(""",c.prototype.runValidators=function(b)"""),format.raw/*245.1798*/("""{"""),format.raw/*245.1799*/("""function d(a)"""),format.raw/*245.1812*/("""{"""),format.raw/*245.1813*/("""return b.data(a+"-error")||b.data("error")||"native"==a&&b[0].validationMessage||g.errors[a]"""),format.raw/*245.1905*/("""}"""),format.raw/*245.1906*/("""var e=[],f=([c.VALIDATORS.native],a.Deferred()),g=this.options;return b.data("bs.validator.deferred")&&b.data("bs.validator.deferred").reject(),b.data("bs.validator.deferred",f),a.each(c.VALIDATORS,a.proxy(function(a,c)"""),format.raw/*245.2125*/("""{"""),format.raw/*245.2126*/("""if((b.data(a)||"native"==a)&&!c.call(this,b))"""),format.raw/*245.2171*/("""{"""),format.raw/*245.2172*/("""var f=d(a);!~e.indexOf(f)&&e.push(f)"""),format.raw/*245.2208*/("""}"""),format.raw/*245.2209*/("""}"""),format.raw/*245.2210*/(""",this)),!e.length&&b.val()&&b.data("remote")?this.defer(b,function()"""),format.raw/*245.2278*/("""{"""),format.raw/*245.2279*/("""var c="""),format.raw/*245.2285*/("""{"""),format.raw/*245.2286*/("""}"""),format.raw/*245.2287*/(""";c[b.attr("name")]=b.val(),a.get(b.data("remote"),c).fail(function(a,b,c)"""),format.raw/*245.2360*/("""{"""),format.raw/*245.2361*/("""e.push(d("remote")||c)"""),format.raw/*245.2383*/("""}"""),format.raw/*245.2384*/(""").always(function()"""),format.raw/*245.2403*/("""{"""),format.raw/*245.2404*/("""f.resolve(e)"""),format.raw/*245.2416*/("""}"""),format.raw/*245.2417*/(""")"""),format.raw/*245.2418*/("""}"""),format.raw/*245.2419*/("""):f.resolve(e),f.promise()"""),format.raw/*245.2445*/("""}"""),format.raw/*245.2446*/(""",c.prototype.validate=function()"""),format.raw/*245.2478*/("""{"""),format.raw/*245.2479*/("""var a=this.options.delay;return this.options.delay=0,this.$element.find(':input:not([type="hidden"])').trigger("input.bs.validator"),this.options.delay=a,this"""),format.raw/*245.2637*/("""}"""),format.raw/*245.2638*/(""",c.prototype.showErrors=function(b)"""),format.raw/*245.2673*/("""{"""),format.raw/*245.2674*/("""var c=this.options.html?"html":"text";this.defer(b,function()"""),format.raw/*245.2735*/("""{"""),format.raw/*245.2736*/("""var d=b.closest(".form-group"),e=d.find(".help-block.with-errors"),f=d.find(".form-control-feedback"),g=b.data("bs.validator.errors");g.length&&(g=a("<ul/>").addClass("list-unstyled").append(a.map(g,function(b)"""),format.raw/*245.2946*/("""{"""),format.raw/*245.2947*/("""return a("<li/>")[c](b)"""),format.raw/*245.2970*/("""}"""),format.raw/*245.2971*/(""")),void 0===e.data("bs.validator.originalContent")&&e.data("bs.validator.originalContent",e.html()),e.empty().append(g),d.removeClass("has-success"),d.addClass("has-error"),f.removeClass("glyphicon-ok"),f.addClass("glyphicon-warning-sign"))"""),format.raw/*245.3211*/("""}"""),format.raw/*245.3212*/(""")"""),format.raw/*245.3213*/("""}"""),format.raw/*245.3214*/(""",c.prototype.clearErrors=function(a)"""),format.raw/*245.3250*/("""{"""),format.raw/*245.3251*/("""var b=a.closest(".form-group"),c=b.find(".help-block.with-errors"),d=b.find(".form-control-feedback");c.html(c.data("bs.validator.originalContent")),b.removeClass("has-error"),b.addClass("has-success"),d.removeClass("glyphicon-warning-sign"),d.addClass("glyphicon-ok")"""),format.raw/*245.3519*/("""}"""),format.raw/*245.3520*/(""",c.prototype.hasErrors=function()"""),format.raw/*245.3553*/("""{"""),format.raw/*245.3554*/("""function b()"""),format.raw/*245.3566*/("""{"""),format.raw/*245.3567*/("""return!!(a(this).data("bs.validator.errors")||[]).length"""),format.raw/*245.3623*/("""}"""),format.raw/*245.3624*/("""return!!this.$element.find(":input:enabled").filter(b).length"""),format.raw/*245.3685*/("""}"""),format.raw/*245.3686*/(""",c.prototype.isIncomplete=function()"""),format.raw/*245.3722*/("""{"""),format.raw/*245.3723*/("""function b()"""),format.raw/*245.3735*/("""{"""),format.raw/*245.3736*/("""return"checkbox"===this.type?!this.checked:"radio"===this.type?!a('[name="'+this.name+'"]:checked').length:""===a.trim(this.value)"""),format.raw/*245.3866*/("""}"""),format.raw/*245.3867*/("""return!!this.$element.find(":input[required]:enabled").filter(b).length"""),format.raw/*245.3938*/("""}"""),format.raw/*245.3939*/(""",c.prototype.onSubmit=function(a)"""),format.raw/*245.3972*/("""{"""),format.raw/*245.3973*/("""this.validate(),(this.isIncomplete()||this.hasErrors())&&a.preventDefault()"""),format.raw/*245.4048*/("""}"""),format.raw/*245.4049*/(""",c.prototype.toggleSubmit=function()"""),format.raw/*245.4085*/("""{"""),format.raw/*245.4086*/("""if(this.options.disable)"""),format.raw/*245.4110*/("""{"""),format.raw/*245.4111*/("""var a=this.$element.find('input[type="submit"], button[type="submit"]');a.toggleClass("disabled",this.isIncomplete()||this.hasErrors()).css("""),format.raw/*245.4251*/("""{"""),format.raw/*245.4252*/(""""pointer-events":"all",cursor:"pointer""""),format.raw/*245.4291*/("""}"""),format.raw/*245.4292*/(""")"""),format.raw/*245.4293*/("""}"""),format.raw/*245.4294*/("""}"""),format.raw/*245.4295*/(""",c.prototype.defer=function(a,b)"""),format.raw/*245.4327*/("""{"""),format.raw/*245.4328*/("""return this.options.delay?(window.clearTimeout(a.data("bs.validator.timeout")),void a.data("bs.validator.timeout",window.setTimeout(b,this.options.delay))):b()"""),format.raw/*245.4487*/("""}"""),format.raw/*245.4488*/(""",c.prototype.destroy=function()"""),format.raw/*245.4519*/("""{"""),format.raw/*245.4520*/("""return this.$element.removeAttr("novalidate").removeData("bs.validator").off(".bs.validator"),this.$element.find(":input").off(".bs.validator").removeData(["bs.validator.errors","bs.validator.deferred"]).each(function()"""),format.raw/*245.4739*/("""{"""),format.raw/*245.4740*/("""var b=a(this),c=b.data("bs.validator.timeout");window.clearTimeout(c)&&b.removeData("bs.validator.timeout")"""),format.raw/*245.4847*/("""}"""),format.raw/*245.4848*/("""),this.$element.find(".help-block.with-errors").each(function()"""),format.raw/*245.4911*/("""{"""),format.raw/*245.4912*/("""var b=a(this),c=b.data("bs.validator.originalContent");b.removeData("bs.validator.originalContent").html(c)"""),format.raw/*245.5019*/("""}"""),format.raw/*245.5020*/("""),this.$element.find('input[type="submit"], button[type="submit"]').removeClass("disabled"),this.$element.find(".has-error").removeClass("has-error"),this"""),format.raw/*245.5174*/("""}"""),format.raw/*245.5175*/(""";var d=a.fn.validator;a.fn.validator=b,a.fn.validator.Constructor=c,a.fn.validator.noConflict=function()"""),format.raw/*245.5279*/("""{"""),format.raw/*245.5280*/("""return a.fn.validator=d,this"""),format.raw/*245.5308*/("""}"""),format.raw/*245.5309*/(""",a(window).on("load",function()"""),format.raw/*245.5340*/("""{"""),format.raw/*245.5341*/("""a('form[data-toggle="validator"]').each(function()"""),format.raw/*245.5391*/("""{"""),format.raw/*245.5392*/("""var c=a(this);b.call(c,c.data())"""),format.raw/*245.5424*/("""}"""),format.raw/*245.5425*/(""")"""),format.raw/*245.5426*/("""}"""),format.raw/*245.5427*/(""")"""),format.raw/*245.5428*/("""}"""),format.raw/*245.5429*/("""(jQuery);	
</script>"""))}
  }

  def render(re:Recursoevaluador,inhabiles:List[Calendario],ndias:Int): play.twirl.api.HtmlFormat.Appendable = apply(re,inhabiles,ndias)

  def f:((Recursoevaluador,List[Calendario],Int) => play.twirl.api.HtmlFormat.Appendable) = (re,inhabiles,ndias) => apply(re,inhabiles,ndias)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Prorrogas/edit.scala.html
                  HASH: 6e74f339589a0098a116eb1fbaa173d670eded9c
                  MATRIX: 763->1|918->80|950->104|1031->61|1059->155|1088->159|1099->163|1136->164|1164->166|1235->211|1249->217|1311->259|1357->279|1371->285|1443->337|1497->365|1511->371|1589->429|1643->457|1657->463|1721->507|3569->2328|3580->2330|3616->2345|3704->2406|3715->2408|3755->2427|3848->2493|3859->2495|3930->2544|4012->2599|4023->2601|4064->2621|4148->2678|4159->2680|4214->2714|4317->2790|4328->2792|4391->2833|4489->2904|4500->2906|4579->2963|4678->3035|4689->3037|4740->3067|4855->3155|4866->3157|4945->3214|5054->3296|5089->3322|5128->3323|5176->3343|5331->3471|5369->3493|5408->3494|5460->3519|5493->3543|5532->3544|5582->3566|5756->3713|5766->3714|5793->3720|5898->3797|5909->3798|5934->3801|6193->4033|6203->4034|6252->4061|6351->4129|6403->4150|6492->4208|6577->4266|6653->4333|6693->4335|6741->4355|6983->4569|7012->4570|7043->4573|7072->4574|7190->4664|7212->4676|7252->4677|7287->4684|7318->4690|7348->4691|7874->5186|7917->5202|8516->5770|8547->5773|8622->5819|8652->5820|8683->5823|8798->5909|8828->5910|8862->5916|9170->6195|9200->6196|9233->6201|9281->6220|9311->6221|9345->6227|9400->6254|9429->6255|9462->6260|9510->6279|9540->6280|9574->6286|9625->6309|9654->6310|9687->6315|9735->6334|9765->6335|9799->6341|9851->6365|9880->6366|9915->6373|9963->6392|9993->6393|10027->6399|10079->6423|10108->6424|10141->6429|10189->6448|10219->6449|10253->6455|10305->6479|10334->6480|10369->6487|10447->6537|10476->6538|10544->6579|10597->6615|10637->6616|10674->6625|10704->6626|10743->6636|10780->6645|10791->6646|10816->6649|10865->6670|10876->6671|10910->6683|10959->6704|10970->6705|10998->6711|11030->6770|11069->6780|11113->6796|11124->6797|11152->6803|11256->6879|11286->6880|11316->6882|11354->6910|11394->6911|11424->6912|11459->6915|11506->6931|11559->6956|11646->7014|11676->7015|11713->7024|11943->7226|11972->7227|12016->7243|12045->7244|12121->7291|12151->7292|12183->7296|12243->7328|12272->7329|12313->7342|12342->7343|12396->7368|12426->7369|12459->7374|12566->7452|12596->7453|12630->7459|12772->7573|12801->7574|12862->7606|12892->7607|12928->7615|13136->7794|13166->7795|13203->7804|13426->7998|13456->7999|13561->8076|13590->8077|13621->8080|13650->8081|13682->8085|13744->8118|13774->8119|13807->8124|13848->8137|13877->8138|13982->8214|14012->8215|14045->8220|14225->8372|14254->8373|14330->8420|14360->8421|14391->8424|14427->8431|14457->8432|14491->8438|14633->8552|14662->8553|14721->8583|14751->8584|14783->8588|14955->8731|14985->8732|15018->8737|15073->8764|15102->8765|15134->8769|15219->8826|15248->8827|15298->8848|15328->8849|15360->8853|15414->8879|15443->8880|15475->8884|15504->8885|15555->8907|15585->8908|15640->8934|15670->8935|15726->8962|15756->8963|15810->8988|15840->8989|15870->8990|16058->9148|16089->9149|16120->9150|16151->9151|16200->9170|16231->9171|16583->9493|16614->9494|16715->9565|16746->9566|16816->9606|16847->9607|16878->9608|16909->9609|16940->9610|16971->9611|17013->9623|17044->9624|17110->9660|17141->9661|17221->9711|17252->9712|17283->9713|17327->9727|17358->9728|17408->9748|17439->9749|17523->9803|17554->9804|17602->9822|17633->9823|17721->9881|17752->9882|17805->9904|17837->9905|17927->9964|17959->9965|17991->9966|18060->10004|18092->10005|18315->10197|18347->10198|18396->10216|18428->10217|18486->10244|18518->10245|18598->10294|18630->10295|18810->10444|18842->10445|18900->10472|18932->10473|18994->10504|19026->10505|19084->10532|19116->10533|19241->10627|19273->10628|19322->10646|19354->10647|19387->10649|19419->10650|19451->10651|19483->10652|19515->10653|19584->10691|19616->10692|19660->10705|19692->10706|19815->10798|19847->10799|20097->11018|20129->11019|20205->11064|20237->11065|20304->11101|20336->11102|20368->11103|20467->11171|20499->11172|20536->11178|20568->11179|20600->11180|20704->11253|20736->11254|20789->11276|20821->11277|20871->11296|20903->11297|20946->11309|20978->11310|21010->11311|21042->11312|21099->11338|21131->11339|21194->11371|21226->11372|21415->11530|21447->11531|21513->11566|21545->11567|21637->11628|21669->11629|21910->11839|21942->11840|21996->11863|22028->11864|22299->12104|22331->12105|22363->12106|22395->12107|22462->12143|22494->12144|22793->12412|22825->12413|22889->12446|22921->12447|22964->12459|22996->12460|23083->12516|23115->12517|23207->12578|23239->12579|23306->12615|23338->12616|23381->12628|23413->12629|23574->12759|23606->12760|23708->12831|23740->12832|23804->12865|23836->12866|23942->12941|23974->12942|24041->12978|24073->12979|24128->13003|24160->13004|24331->13144|24363->13145|24433->13184|24465->13185|24497->13186|24529->13187|24561->13188|24624->13220|24656->13221|24846->13380|24878->13381|24940->13412|24972->13413|25222->13632|25254->13633|25392->13740|25424->13741|25518->13804|25550->13805|25688->13912|25720->13913|25905->14067|25937->14068|26072->14172|26104->14173|26163->14201|26195->14202|26257->14233|26289->14234|26370->14284|26402->14285|26465->14317|26497->14318|26529->14319|26561->14320|26593->14321|26625->14322
                  LINES: 26->1|28->3|28->3|29->1|30->3|32->5|32->5|32->5|33->6|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|85->58|85->58|85->58|86->59|86->59|86->59|87->60|87->60|87->60|88->61|88->61|88->61|89->62|89->62|89->62|90->63|90->63|90->63|91->64|91->64|91->64|92->65|92->65|92->65|93->66|93->66|93->66|97->70|97->70|97->70|98->71|101->74|101->74|101->74|102->75|102->75|102->75|103->76|104->77|104->77|104->77|104->77|104->77|104->77|105->78|105->78|105->78|107->80|108->81|110->83|113->86|113->86|113->86|114->87|117->90|117->90|117->90|117->90|117->90|117->90|117->90|117->90|117->90|117->90|125->98|126->99|150->123|153->126|154->127|154->127|155->128|156->129|156->129|157->130|165->138|165->138|166->139|166->139|166->139|167->140|168->141|168->141|169->142|169->142|169->142|170->143|171->144|171->144|172->145|172->145|172->145|173->146|174->147|174->147|175->148|175->148|175->148|176->149|177->150|177->150|178->151|178->151|178->151|179->152|180->153|180->153|181->154|182->155|182->155|186->159|186->159|186->159|187->160|187->160|188->161|188->161|188->161|188->161|189->162|189->162|189->162|190->163|190->163|190->163|191->164|192->165|192->165|192->165|192->165|195->168|195->168|195->168|195->168|195->168|195->168|195->168|196->169|199->172|200->173|200->173|201->174|202->175|202->175|207->180|207->180|210->183|210->183|211->184|212->185|212->185|216->189|216->189|218->191|218->191|219->192|220->193|220->193|221->194|223->196|223->196|224->197|224->197|225->198|228->201|228->201|229->202|234->207|234->207|236->209|236->209|237->210|237->210|239->212|239->212|239->212|240->213|241->214|241->214|245->218|245->218|246->219|248->221|248->221|251->224|251->224|252->225|252->225|252->225|253->226|256->229|256->229|257->230|257->230|258->231|260->233|260->233|261->234|262->235|262->235|263->236|264->237|264->237|265->238|265->238|266->239|267->240|267->240|268->241|268->241|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245|272->245
                  -- GENERATED --
              */
          