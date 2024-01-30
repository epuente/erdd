
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
object create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Recursoevaluador,List[Calendario],Int,play.twirl.api.HtmlFormat.Appendable] {

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

	<div class="container-fluid" style="background-color: white; padding: 10px;">
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
				  <li>Recursos</li>
				  <li class="active">Prórrogas</li>
				</ol>			
			</div>
		</div>	
		<div class="row">
			<div class="col-md-12">
				<h3>Asignación de prórrogas para el recurso</h3>
			</div>
		</div>

		<div class="row">
			<div class="col-lg-5">
				<div class="panel panel-default">
	              	<div class="panel-heading"><span class="glyphicon glyphicon-info-sign"></span>Fechas</div>
	           		<div class="panel-body">
	           			<div class="row">
	           				<div class="col-sm-12">
	           					
		           					<table class="table table-bordered table-condensed">
		           						<tr><td>Título</td><td>"""),_display_(/*36.44*/re/*36.46*/.recurso.titulo),format.raw/*36.61*/("""</td></tr>
		           						<tr><td>Clave control</td><td>"""),_display_(/*37.51*/re/*37.53*/.recurso.numcontrol),format.raw/*37.72*/("""</td></tr>
		           						<tr><td>Fecha registro web</td><td>"""),_display_(/*38.56*/re/*38.58*/.recurso.auditinsert.format("dd/MM/yyyy   hh:mm")),format.raw/*38.107*/("""</td></tr>
		           						<tr><td>Aspecto</td><td>"""),_display_(/*39.45*/re/*39.47*/.aspecto.descripcion),format.raw/*39.67*/("""</td></tr>
		           						<tr><td>Evaluador</td><td>"""),_display_(/*40.47*/re/*40.49*/.evaluador.personal.nombreCompleto),format.raw/*40.83*/("""</td></tr>
		           						<tr><td>Fecha asignacion evaluadores</td><td>"""),_display_(/*41.66*/re/*41.68*/.auditinsert.format("dd/MM/yyyy   hh:mm")),format.raw/*41.109*/("""</td></tr>
		           						<tr><td>Fecha inicio evaluación</td><td>"""),_display_(/*42.61*/re/*42.63*/.recurso.evaluacionFecha.fechainicio.format("dd/MM/yyyy")),format.raw/*42.120*/("""</td></tr>
		           						<tr><td>Número de días otorgados</td><td>"""),_display_(/*43.62*/re/*43.64*/.recurso.evaluacionFecha.ndias),format.raw/*43.94*/("""</td></tr>
		           						<tr><td>Fecha final evaluación</td><td><div id="divDesde">"""),_display_(/*44.79*/re/*44.81*/.recurso.evaluacionFecha.fechalimite.format("dd/MM/yyyy")),format.raw/*44.138*/("""</div></td></tr>
	           						</table>

           						
	           						"""),_display_(/*48.20*/if(re.prorrogas.size != 0)/*48.46*/{_display_(Seq[Any](format.raw/*48.47*/("""
	           							"""),format.raw/*49.20*/("""<h5>Prórrogas previamente otorgadas</h5>
			           					
		           						"""),_display_(/*51.21*/for(p <- re.prorrogas) yield /*51.43*/{_display_(Seq[Any](format.raw/*51.44*/("""
			           						"""),format.raw/*52.21*/("""<table class="table table-bordered table-condensed">
				           						<tr><td>Número de días otorgados</td><td>"""),_display_(/*53.64*/p/*53.65*/.ndias),format.raw/*53.71*/("""</td></tr>
                                                <tr><td>Prórroga al</td><td>"""),_display_(/*54.78*/p/*54.79*/.fecha.format("dd/MM/yyyy")),format.raw/*54.106*/("""</td></tr>				           						
			           						</table>
		           						""")))}),format.raw/*56.21*/("""
		           						           							
	           						""")))}),format.raw/*58.20*/("""
	           						
	           						
	           						"""),_display_(/*61.20*/form(CSRF(routes.ProrrogaController.save(re.id)), 'id->"frmCreate")/*61.87*/ {_display_(Seq[Any](format.raw/*61.89*/("""
		           						"""),format.raw/*62.20*/("""<table class="table table-bordered table-condensed">
			           						<tr>
			           							<td>Número de días</td>
			           							<td><input type="text" id="ndias" name="ndias" size="5" pattern="[0-9]"""),format.raw/*65.92*/("""{"""),format.raw/*65.93*/("""1,2"""),format.raw/*65.96*/("""}"""),format.raw/*65.97*/("""" class="form-control" required="required" data-error="Solo se permite hasta 2 dígitos." """),_display_(/*65.187*/if(ndias!=0)/*65.199*/{_display_(Seq[Any](format.raw/*65.200*/("""value="""),_display_(/*65.207*/ndias)))}),format.raw/*65.213*/(""" """),format.raw/*65.214*/("""/><span class="help-block with-errors"></span></td>
			           						</tr>
			           						<tr>
			           							<td>Último día para evaluar</td>
			           							<td><input type="text" id="fechalimite" name="fechalimite" required="required" placeholder="dd/mm/aaaa" readonly="readonly" class="form-control"></td>
			           						</tr>
										</table>
										<input type="submit" value="Asignar prórroga"  class="btn btn-primary">										
           							""")))}),format.raw/*73.20*/("""								
							"""),format.raw/*74.8*/("""</div>
	           			</div>
	           		</div>
           		</div>
           	</div>
			<div class="col-lg-7">
				<div class="panel panel-default">
	              	<div class="panel-heading"><span class="glyphicon glyphicon-info-sign"></span>Calendario</div>
	           		<div class="panel-body">
									<div class="col-lg-12">
										<div id='calendar'></div>
									</div>						           		
	           		</div>
	           	</div>
	       </div>	           	
        </div>
   </div>







""")))}),format.raw/*98.2*/("""


"""),format.raw/*101.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*102.15*/("""{"""),format.raw/*102.16*/("""
		"""),format.raw/*103.3*/("""$('#calendar').fullCalendar("""),format.raw/*103.31*/("""{"""),format.raw/*103.32*/("""		
			"""),format.raw/*104.4*/("""editable: false,
			allDaySlot: false,
			eventLimit: true, // allow "more" link when too many events
			//aspectRatio: 2,La solicitud del recurso
			allDayDefault: true,
			selectable: false,
			selectHelper: false,	
			weekends: false,
			eventRender: function(event, element) """),format.raw/*112.42*/("""{"""),format.raw/*112.43*/("""
				"""),format.raw/*113.5*/("""if (event.tipo ==1)"""),format.raw/*113.24*/("""{"""),format.raw/*113.25*/("""
					"""),format.raw/*114.6*/("""var color = '#C0C0C0';
				"""),format.raw/*115.5*/("""}"""),format.raw/*115.6*/("""
				"""),format.raw/*116.5*/("""if (event.tipo ==2)"""),format.raw/*116.24*/("""{"""),format.raw/*116.25*/("""
					"""),format.raw/*117.6*/("""var color = 'red';
				"""),format.raw/*118.5*/("""}"""),format.raw/*118.6*/("""
				"""),format.raw/*119.5*/("""if (event.tipo ==3)"""),format.raw/*119.24*/("""{"""),format.raw/*119.25*/("""
					"""),format.raw/*120.6*/("""var color = 'grey';Int:ndias
				"""),format.raw/*121.5*/("""}"""),format.raw/*121.6*/("""		
				"""),format.raw/*122.5*/("""if (event.tipo ==4)"""),format.raw/*122.24*/("""{"""),format.raw/*122.25*/("""
					"""),format.raw/*123.6*/("""var color = 'blue';
				"""),format.raw/*124.5*/("""}"""),format.raw/*124.6*/("""
				"""),format.raw/*125.5*/("""if (event.tipo ==5)"""),format.raw/*125.24*/("""{"""),format.raw/*125.25*/("""
					"""),format.raw/*126.6*/("""var color = 'cyan';
				"""),format.raw/*127.5*/("""}"""),format.raw/*127.6*/("""		
				"""),format.raw/*128.5*/("""$(element).css('background-color', color );			
			"""),format.raw/*129.4*/("""}"""),format.raw/*129.5*/(""",		
		
			events: [
			         
			    """),_display_(/*133.9*/for((f,i) <- inhabiles.zipWithIndex) yield /*133.45*/{_display_(Seq[Any](format.raw/*133.46*/("""
			    	"""),format.raw/*134.9*/("""{"""),format.raw/*134.10*/("""
			    		"""),format.raw/*135.10*/("""id:    """"),_display_(/*135.19*/f/*135.20*/.id),format.raw/*135.23*/("""",
			    		title: """"),_display_(/*136.19*/f/*136.20*/.descripcion),format.raw/*136.32*/("""",
			    		start: """"),_display_(/*137.19*/f/*137.20*/.desde),format.raw/*137.26*/("""",
			    		end:   moment(""""),_display_(/*138.26*/f/*138.27*/.hasta),format.raw/*138.33*/(""""),  
			    		tipo:  1,			    		
			    		rendering: 'background'
			    	"""),format.raw/*141.9*/("""}"""),format.raw/*141.10*/(""" """),_display_(/*141.12*/if( i != inhabiles.length-1)/*141.40*/{_display_(Seq[Any](format.raw/*141.41*/(""" """),format.raw/*141.42*/(""", """)))}),format.raw/*141.45*/("""		    	
			    """)))}),format.raw/*142.9*/("""
			    
			         
			"""),format.raw/*145.4*/("""],
		    eventMouseover: function( event, jsEvent, view ) """),format.raw/*146.56*/("""{"""),format.raw/*146.57*/(""" 
		    	"""),format.raw/*147.8*/("""alert("id:"+event.id+"\ntitle:"+event.title+"\ntipo:"+event.tipo+"\ncolor:"+event.eventColor+"desde: "+moment(event.start).format('DD/MM/YYYY')+"\nhasta:"+moment(event.end).format('DD/MM/YYYY'));
		    """),format.raw/*148.7*/("""}"""),format.raw/*148.8*/("""			



			
		"""),format.raw/*153.3*/("""}"""),format.raw/*153.4*/(""");
		
		
		if ( $("#ndias").val().length != 0 )"""),format.raw/*156.39*/("""{"""),format.raw/*156.40*/("""
			"""),format.raw/*157.4*/("""$("#ndias").trigger("input");
		"""),format.raw/*158.3*/("""}"""),format.raw/*158.4*/("""
		
		
		
	"""),format.raw/*162.2*/("""}"""),format.raw/*162.3*/(""");
	
	function calcular()"""),format.raw/*164.21*/("""{"""),format.raw/*164.22*/("""	
		"""),format.raw/*165.3*/("""var fecha = moment(""""),_display_(/*165.24*/re/*165.26*/.recurso.evaluacionFecha.fechalimite),format.raw/*165.62*/("""").format('YYYY-MM-DD');
		$.ajax("""),format.raw/*166.10*/("""{"""),format.raw/*166.11*/("""
			  """),format.raw/*167.6*/("""type: "GET",
			  url: '/fechaMasDias?nd='+$("#ndias").val()+'&fechainicio='+fecha
			"""),format.raw/*169.4*/("""}"""),format.raw/*169.5*/(""")
		  .success(function( data ) """),format.raw/*170.31*/("""{"""),format.raw/*170.32*/("""
			    """),format.raw/*171.8*/("""var fechaFinal = moment(data).format('DD/MM/YYYY');
		  		$("#fechalimite").val(fechaFinal);
		  		$('#calendar').fullCalendar('removeEvents', 'actual');	
		  		var eventObject = """),format.raw/*174.25*/("""{"""),format.raw/*174.26*/("""
		  				"""),format.raw/*175.9*/("""id: 'actual',
		  			    title: "Periodo",
		  			    start: moment(fecha).add(1,'days'),
		  			    end: moment(data).add(1,'days'),
		  			    tipo: 5,
		  			    rendering: 'background'

		  		"""),format.raw/*182.7*/("""}"""),format.raw/*182.8*/(""";

		  		$('#calendar').fullCalendar('renderEvent', eventObject, true);		  		
		  		
		  		
		  """),format.raw/*187.5*/("""}"""),format.raw/*187.6*/(""")
	"""),format.raw/*188.2*/("""}"""),format.raw/*188.3*/("""
	
	"""),format.raw/*190.2*/("""$("#ndias").on("input",function()"""),format.raw/*190.35*/("""{"""),format.raw/*190.36*/("""		
		"""),format.raw/*191.3*/("""calcular();
	"""),format.raw/*192.2*/("""}"""),format.raw/*192.3*/(""");
	
	
	+function(a)"""),format.raw/*195.14*/("""{"""),format.raw/*195.15*/(""""use strict";function b(b)"""),format.raw/*195.41*/("""{"""),format.raw/*195.42*/("""return this.each(function()"""),format.raw/*195.69*/("""{"""),format.raw/*195.70*/("""var d=a(this),e=a.extend("""),format.raw/*195.95*/("""{"""),format.raw/*195.96*/("""}"""),format.raw/*195.97*/(""",c.DEFAULTS,d.data(),"object"==typeof b&&b),f=d.data("bs.validator");(f||"destroy"!=b)&&(f||d.data("bs.validator",f=new c(this,e)),"string"==typeof b&&f[b]())"""),format.raw/*195.255*/("""}"""),format.raw/*195.256*/(""")"""),format.raw/*195.257*/("""}"""),format.raw/*195.258*/("""var c=function(b,c)"""),format.raw/*195.277*/("""{"""),format.raw/*195.278*/("""this.$element=a(b),this.options=c,this.$element.attr("novalidate",!0),this.toggleSubmit(),this.$element.on("input.bs.validator change.bs.validator focusout.bs.validator",a.proxy(this.validateInput,this)),this.$element.on("submit.bs.validator",a.proxy(this.onSubmit,this)),this.$element.find("[data-match]").each(function()"""),format.raw/*195.600*/("""{"""),format.raw/*195.601*/("""var b=a(this),c=b.data("match");a(c).on("input.bs.validator",function()"""),format.raw/*195.672*/("""{"""),format.raw/*195.673*/("""b.val()&&b.trigger("input.bs.validator")"""),format.raw/*195.713*/("""}"""),format.raw/*195.714*/(""")"""),format.raw/*195.715*/("""}"""),format.raw/*195.716*/(""")"""),format.raw/*195.717*/("""}"""),format.raw/*195.718*/(""";c.DEFAULTS="""),format.raw/*195.730*/("""{"""),format.raw/*195.731*/("""delay:500,html:!1,disable:!0,errors:"""),format.raw/*195.767*/("""{"""),format.raw/*195.768*/("""match:"Does not match",minlength:"Not long enough""""),format.raw/*195.818*/("""}"""),format.raw/*195.819*/("""}"""),format.raw/*195.820*/(""",c.VALIDATORS="""),format.raw/*195.834*/("""{"""),format.raw/*195.835*/(""""native":function(a)"""),format.raw/*195.855*/("""{"""),format.raw/*195.856*/("""var b=a[0];return b.checkValidity?b.checkValidity():!0"""),format.raw/*195.910*/("""}"""),format.raw/*195.911*/(""",match:function(b)"""),format.raw/*195.929*/("""{"""),format.raw/*195.930*/("""var c=b.data("match");return!b.val()||b.val()===a(c).val()"""),format.raw/*195.988*/("""}"""),format.raw/*195.989*/(""",minlength:function(a)"""),format.raw/*195.1011*/("""{"""),format.raw/*195.1012*/("""var b=a.data("minlength");return!a.val()||a.val().length>=b"""),format.raw/*195.1071*/("""}"""),format.raw/*195.1072*/("""}"""),format.raw/*195.1073*/(""",c.prototype.validateInput=function(b)"""),format.raw/*195.1111*/("""{"""),format.raw/*195.1112*/("""var c=a(b.target),d=c.data("bs.validator.errors");if(c.is('[type="radio"]')&&(c=this.$element.find('input[name="'+c.attr("name")+'"]')),this.$element.trigger(b=a.Event("validate.bs.validator","""),format.raw/*195.1304*/("""{"""),format.raw/*195.1305*/("""relatedTarget:c[0]"""),format.raw/*195.1323*/("""}"""),format.raw/*195.1324*/(""")),!b.isDefaultPrevented())"""),format.raw/*195.1351*/("""{"""),format.raw/*195.1352*/("""var e=this;this.runValidators(c).done(function(f)"""),format.raw/*195.1401*/("""{"""),format.raw/*195.1402*/("""c.data("bs.validator.errors",f),f.length?e.showErrors(c):e.clearErrors(c),d&&f.toString()===d.toString()||(b=f.length?a.Event("invalid.bs.validator","""),format.raw/*195.1551*/("""{"""),format.raw/*195.1552*/("""relatedTarget:c[0],detail:f"""),format.raw/*195.1579*/("""}"""),format.raw/*195.1580*/("""):a.Event("valid.bs.validator","""),format.raw/*195.1611*/("""{"""),format.raw/*195.1612*/("""relatedTarget:c[0],detail:d"""),format.raw/*195.1639*/("""}"""),format.raw/*195.1640*/("""),e.$element.trigger(b)),e.toggleSubmit(),e.$element.trigger(a.Event("validated.bs.validator","""),format.raw/*195.1734*/("""{"""),format.raw/*195.1735*/("""relatedTarget:c[0]"""),format.raw/*195.1753*/("""}"""),format.raw/*195.1754*/("""))"""),format.raw/*195.1756*/("""}"""),format.raw/*195.1757*/(""")"""),format.raw/*195.1758*/("""}"""),format.raw/*195.1759*/("""}"""),format.raw/*195.1760*/(""",c.prototype.runValidators=function(b)"""),format.raw/*195.1798*/("""{"""),format.raw/*195.1799*/("""function d(a)"""),format.raw/*195.1812*/("""{"""),format.raw/*195.1813*/("""return b.data(a+"-error")||b.data("error")||"native"==a&&b[0].validationMessage||g.errors[a]"""),format.raw/*195.1905*/("""}"""),format.raw/*195.1906*/("""var e=[],f=([c.VALIDATORS.native],a.Deferred()),g=this.options;return b.data("bs.validator.deferred")&&b.data("bs.validator.deferred").reject(),b.data("bs.validator.deferred",f),a.each(c.VALIDATORS,a.proxy(function(a,c)"""),format.raw/*195.2125*/("""{"""),format.raw/*195.2126*/("""if((b.data(a)||"native"==a)&&!c.call(this,b))"""),format.raw/*195.2171*/("""{"""),format.raw/*195.2172*/("""var f=d(a);!~e.indexOf(f)&&e.push(f)"""),format.raw/*195.2208*/("""}"""),format.raw/*195.2209*/("""}"""),format.raw/*195.2210*/(""",this)),!e.length&&b.val()&&b.data("remote")?this.defer(b,function()"""),format.raw/*195.2278*/("""{"""),format.raw/*195.2279*/("""var c="""),format.raw/*195.2285*/("""{"""),format.raw/*195.2286*/("""}"""),format.raw/*195.2287*/(""";c[b.attr("name")]=b.val(),a.get(b.data("remote"),c).fail(function(a,b,c)"""),format.raw/*195.2360*/("""{"""),format.raw/*195.2361*/("""e.push(d("remote")||c)"""),format.raw/*195.2383*/("""}"""),format.raw/*195.2384*/(""").always(function()"""),format.raw/*195.2403*/("""{"""),format.raw/*195.2404*/("""f.resolve(e)"""),format.raw/*195.2416*/("""}"""),format.raw/*195.2417*/(""")"""),format.raw/*195.2418*/("""}"""),format.raw/*195.2419*/("""):f.resolve(e),f.promise()"""),format.raw/*195.2445*/("""}"""),format.raw/*195.2446*/(""",c.prototype.validate=function()"""),format.raw/*195.2478*/("""{"""),format.raw/*195.2479*/("""var a=this.options.delay;return this.options.delay=0,this.$element.find(':input:not([type="hidden"])').trigger("input.bs.validator"),this.options.delay=a,this"""),format.raw/*195.2637*/("""}"""),format.raw/*195.2638*/(""",c.prototype.showErrors=function(b)"""),format.raw/*195.2673*/("""{"""),format.raw/*195.2674*/("""var c=this.options.html?"html":"text";this.defer(b,function()"""),format.raw/*195.2735*/("""{"""),format.raw/*195.2736*/("""var d=b.closest(".form-group"),e=d.find(".help-block.with-errors"),f=d.find(".form-control-feedback"),g=b.data("bs.validator.errors");g.length&&(g=a("<ul/>").addClass("list-unstyled").append(a.map(g,function(b)"""),format.raw/*195.2946*/("""{"""),format.raw/*195.2947*/("""return a("<li/>")[c](b)"""),format.raw/*195.2970*/("""}"""),format.raw/*195.2971*/(""")),void 0===e.data("bs.validator.originalContent")&&e.data("bs.validator.originalContent",e.html()),e.empty().append(g),d.removeClass("has-success"),d.addClass("has-error"),f.removeClass("glyphicon-ok"),f.addClass("glyphicon-warning-sign"))"""),format.raw/*195.3211*/("""}"""),format.raw/*195.3212*/(""")"""),format.raw/*195.3213*/("""}"""),format.raw/*195.3214*/(""",c.prototype.clearErrors=function(a)"""),format.raw/*195.3250*/("""{"""),format.raw/*195.3251*/("""var b=a.closest(".form-group"),c=b.find(".help-block.with-errors"),d=b.find(".form-control-feedback");c.html(c.data("bs.validator.originalContent")),b.removeClass("has-error"),b.addClass("has-success"),d.removeClass("glyphicon-warning-sign"),d.addClass("glyphicon-ok")"""),format.raw/*195.3519*/("""}"""),format.raw/*195.3520*/(""",c.prototype.hasErrors=function()"""),format.raw/*195.3553*/("""{"""),format.raw/*195.3554*/("""function b()"""),format.raw/*195.3566*/("""{"""),format.raw/*195.3567*/("""return!!(a(this).data("bs.validator.errors")||[]).length"""),format.raw/*195.3623*/("""}"""),format.raw/*195.3624*/("""return!!this.$element.find(":input:enabled").filter(b).length"""),format.raw/*195.3685*/("""}"""),format.raw/*195.3686*/(""",c.prototype.isIncomplete=function()"""),format.raw/*195.3722*/("""{"""),format.raw/*195.3723*/("""function b()"""),format.raw/*195.3735*/("""{"""),format.raw/*195.3736*/("""return"checkbox"===this.type?!this.checked:"radio"===this.type?!a('[name="'+this.name+'"]:checked').length:""===a.trim(this.value)"""),format.raw/*195.3866*/("""}"""),format.raw/*195.3867*/("""return!!this.$element.find(":input[required]:enabled").filter(b).length"""),format.raw/*195.3938*/("""}"""),format.raw/*195.3939*/(""",c.prototype.onSubmit=function(a)"""),format.raw/*195.3972*/("""{"""),format.raw/*195.3973*/("""this.validate(),(this.isIncomplete()||this.hasErrors())&&a.preventDefault()"""),format.raw/*195.4048*/("""}"""),format.raw/*195.4049*/(""",c.prototype.toggleSubmit=function()"""),format.raw/*195.4085*/("""{"""),format.raw/*195.4086*/("""if(this.options.disable)"""),format.raw/*195.4110*/("""{"""),format.raw/*195.4111*/("""var a=this.$element.find('input[type="submit"], button[type="submit"]');a.toggleClass("disabled",this.isIncomplete()||this.hasErrors()).css("""),format.raw/*195.4251*/("""{"""),format.raw/*195.4252*/(""""pointer-events":"all",cursor:"pointer""""),format.raw/*195.4291*/("""}"""),format.raw/*195.4292*/(""")"""),format.raw/*195.4293*/("""}"""),format.raw/*195.4294*/("""}"""),format.raw/*195.4295*/(""",c.prototype.defer=function(a,b)"""),format.raw/*195.4327*/("""{"""),format.raw/*195.4328*/("""return this.options.delay?(window.clearTimeout(a.data("bs.validator.timeout")),void a.data("bs.validator.timeout",window.setTimeout(b,this.options.delay))):b()"""),format.raw/*195.4487*/("""}"""),format.raw/*195.4488*/(""",c.prototype.destroy=function()"""),format.raw/*195.4519*/("""{"""),format.raw/*195.4520*/("""return this.$element.removeAttr("novalidate").removeData("bs.validator").off(".bs.validator"),this.$element.find(":input").off(".bs.validator").removeData(["bs.validator.errors","bs.validator.deferred"]).each(function()"""),format.raw/*195.4739*/("""{"""),format.raw/*195.4740*/("""var b=a(this),c=b.data("bs.validator.timeout");window.clearTimeout(c)&&b.removeData("bs.validator.timeout")"""),format.raw/*195.4847*/("""}"""),format.raw/*195.4848*/("""),this.$element.find(".help-block.with-errors").each(function()"""),format.raw/*195.4911*/("""{"""),format.raw/*195.4912*/("""var b=a(this),c=b.data("bs.validator.originalContent");b.removeData("bs.validator.originalContent").html(c)"""),format.raw/*195.5019*/("""}"""),format.raw/*195.5020*/("""),this.$element.find('input[type="submit"], button[type="submit"]').removeClass("disabled"),this.$element.find(".has-error").removeClass("has-error"),this"""),format.raw/*195.5174*/("""}"""),format.raw/*195.5175*/(""";var d=a.fn.validator;a.fn.validator=b,a.fn.validator.Constructor=c,a.fn.validator.noConflict=function()"""),format.raw/*195.5279*/("""{"""),format.raw/*195.5280*/("""return a.fn.validator=d,this"""),format.raw/*195.5308*/("""}"""),format.raw/*195.5309*/(""",a(window).on("load",function()"""),format.raw/*195.5340*/("""{"""),format.raw/*195.5341*/("""a('form[data-toggle="validator"]').each(function()"""),format.raw/*195.5391*/("""{"""),format.raw/*195.5392*/("""var c=a(this);b.call(c,c.data())"""),format.raw/*195.5424*/("""}"""),format.raw/*195.5425*/(""")"""),format.raw/*195.5426*/("""}"""),format.raw/*195.5427*/(""")"""),format.raw/*195.5428*/("""}"""),format.raw/*195.5429*/("""(jQuery);	
</script>"""))}
  }

  def render(re:Recursoevaluador,inhabiles:List[Calendario],ndias:Int): play.twirl.api.HtmlFormat.Appendable = apply(re,inhabiles,ndias)

  def f:((Recursoevaluador,List[Calendario],Int) => play.twirl.api.HtmlFormat.Appendable) = (re,inhabiles,ndias) => apply(re,inhabiles,ndias)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Prorrogas/create.scala.html
                  HASH: 0e6751d9b440beb2c90461b9177069f464ba80bc
                  MATRIX: 765->1|920->80|952->104|1033->61|1061->155|1090->159|1101->163|1138->164|1166->166|1237->211|1251->217|1313->259|1359->279|1373->285|1445->337|1499->365|1513->371|1591->429|1645->457|1659->463|1723->507|2609->1366|2620->1368|2656->1383|2744->1444|2755->1446|2795->1465|2888->1531|2899->1533|2970->1582|3052->1637|3063->1639|3104->1659|3188->1716|3199->1718|3254->1752|3357->1828|3368->1830|3431->1871|3529->1942|3540->1944|3619->2001|3718->2073|3729->2075|3780->2105|3896->2194|3907->2196|3986->2253|4095->2335|4130->2361|4169->2362|4217->2382|4325->2463|4363->2485|4402->2486|4451->2507|4594->2623|4604->2624|4631->2630|4746->2718|4756->2719|4805->2746|4917->2827|5006->2885|5091->2943|5167->3010|5207->3012|5255->3032|5497->3246|5526->3247|5557->3250|5586->3251|5704->3341|5726->3353|5766->3354|5801->3361|5832->3367|5862->3368|6378->3853|6421->3869|6960->4378|6991->4381|7066->4427|7096->4428|7127->4431|7184->4459|7214->4460|7248->4466|7556->4745|7586->4746|7619->4751|7667->4770|7697->4771|7731->4777|7786->4804|7815->4805|7848->4810|7896->4829|7926->4830|7960->4836|8011->4859|8040->4860|8073->4865|8121->4884|8151->4885|8185->4891|8246->4924|8275->4925|8310->4932|8358->4951|8388->4952|8422->4958|8474->4982|8503->4983|8536->4988|8584->5007|8614->5008|8648->5014|8700->5038|8729->5039|8764->5046|8842->5096|8871->5097|8939->5138|8992->5174|9032->5175|9069->5184|9099->5185|9138->5195|9175->5204|9186->5205|9211->5208|9260->5229|9271->5230|9305->5242|9354->5263|9365->5264|9393->5270|9449->5298|9460->5299|9488->5305|9591->5380|9621->5381|9651->5383|9689->5411|9729->5412|9759->5413|9794->5416|9841->5432|9894->5457|9981->5515|10011->5516|10048->5525|10278->5727|10307->5728|10348->5741|10377->5742|10453->5789|10483->5790|10515->5794|10575->5826|10604->5827|10643->5838|10672->5839|10726->5864|10756->5865|10788->5869|10837->5890|10849->5892|10907->5928|10970->5962|11000->5963|11034->5969|11148->6055|11177->6056|11238->6088|11268->6089|11304->6097|11512->6276|11542->6277|11579->6286|11803->6482|11832->6483|11956->6579|11985->6580|12016->6583|12045->6584|12077->6588|12139->6621|12169->6622|12202->6627|12243->6640|12272->6641|12321->6661|12351->6662|12406->6688|12436->6689|12492->6716|12522->6717|12576->6742|12606->6743|12636->6744|12824->6902|12855->6903|12886->6904|12917->6905|12966->6924|12997->6925|13349->7247|13380->7248|13481->7319|13512->7320|13582->7360|13613->7361|13644->7362|13675->7363|13706->7364|13737->7365|13779->7377|13810->7378|13876->7414|13907->7415|13987->7465|14018->7466|14049->7467|14093->7481|14124->7482|14174->7502|14205->7503|14289->7557|14320->7558|14368->7576|14399->7577|14487->7635|14518->7636|14571->7658|14603->7659|14693->7718|14725->7719|14757->7720|14826->7758|14858->7759|15081->7951|15113->7952|15162->7970|15194->7971|15252->7998|15284->7999|15364->8048|15396->8049|15576->8198|15608->8199|15666->8226|15698->8227|15760->8258|15792->8259|15850->8286|15882->8287|16007->8381|16039->8382|16088->8400|16120->8401|16153->8403|16185->8404|16217->8405|16249->8406|16281->8407|16350->8445|16382->8446|16426->8459|16458->8460|16581->8552|16613->8553|16863->8772|16895->8773|16971->8818|17003->8819|17070->8855|17102->8856|17134->8857|17233->8925|17265->8926|17302->8932|17334->8933|17366->8934|17470->9007|17502->9008|17555->9030|17587->9031|17637->9050|17669->9051|17712->9063|17744->9064|17776->9065|17808->9066|17865->9092|17897->9093|17960->9125|17992->9126|18181->9284|18213->9285|18279->9320|18311->9321|18403->9382|18435->9383|18676->9593|18708->9594|18762->9617|18794->9618|19065->9858|19097->9859|19129->9860|19161->9861|19228->9897|19260->9898|19559->10166|19591->10167|19655->10200|19687->10201|19730->10213|19762->10214|19849->10270|19881->10271|19973->10332|20005->10333|20072->10369|20104->10370|20147->10382|20179->10383|20340->10513|20372->10514|20474->10585|20506->10586|20570->10619|20602->10620|20708->10695|20740->10696|20807->10732|20839->10733|20894->10757|20926->10758|21097->10898|21129->10899|21199->10938|21231->10939|21263->10940|21295->10941|21327->10942|21390->10974|21422->10975|21612->11134|21644->11135|21706->11166|21738->11167|21988->11386|22020->11387|22158->11494|22190->11495|22284->11558|22316->11559|22454->11666|22486->11667|22671->11821|22703->11822|22838->11926|22870->11927|22929->11955|22961->11956|23023->11987|23055->11988|23136->12038|23168->12039|23231->12071|23263->12072|23295->12073|23327->12074|23359->12075|23391->12076
                  LINES: 26->1|28->3|28->3|29->1|30->3|32->5|32->5|32->5|33->6|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|63->36|63->36|63->36|64->37|64->37|64->37|65->38|65->38|65->38|66->39|66->39|66->39|67->40|67->40|67->40|68->41|68->41|68->41|69->42|69->42|69->42|70->43|70->43|70->43|71->44|71->44|71->44|75->48|75->48|75->48|76->49|78->51|78->51|78->51|79->52|80->53|80->53|80->53|81->54|81->54|81->54|83->56|85->58|88->61|88->61|88->61|89->62|92->65|92->65|92->65|92->65|92->65|92->65|92->65|92->65|92->65|92->65|100->73|101->74|125->98|128->101|129->102|129->102|130->103|130->103|130->103|131->104|139->112|139->112|140->113|140->113|140->113|141->114|142->115|142->115|143->116|143->116|143->116|144->117|145->118|145->118|146->119|146->119|146->119|147->120|148->121|148->121|149->122|149->122|149->122|150->123|151->124|151->124|152->125|152->125|152->125|153->126|154->127|154->127|155->128|156->129|156->129|160->133|160->133|160->133|161->134|161->134|162->135|162->135|162->135|162->135|163->136|163->136|163->136|164->137|164->137|164->137|165->138|165->138|165->138|168->141|168->141|168->141|168->141|168->141|168->141|168->141|169->142|172->145|173->146|173->146|174->147|175->148|175->148|180->153|180->153|183->156|183->156|184->157|185->158|185->158|189->162|189->162|191->164|191->164|192->165|192->165|192->165|192->165|193->166|193->166|194->167|196->169|196->169|197->170|197->170|198->171|201->174|201->174|202->175|209->182|209->182|214->187|214->187|215->188|215->188|217->190|217->190|217->190|218->191|219->192|219->192|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195|222->195
                  -- GENERATED --
              */
          