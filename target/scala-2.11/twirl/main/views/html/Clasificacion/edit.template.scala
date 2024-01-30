
package views.html.Clasificacion

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
object edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[Long,Form[Clasificacion],List[ClasificadorCriterio2],List[ClasificadorCriterio3],List[ClasificadorCancelable],List[ClasificadorNoevaluable],List[ClasificadorTiporecurso],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id:Long, cForm:Form[Clasificacion],
  clas2:List[ClasificadorCriterio2],  
  clas3:List[ClasificadorCriterio3], 
  cancelable:List[ClasificadorCancelable], 
  noevaluable:List[ClasificadorNoevaluable],
  tiposrecursos:List [ClasificadorTiporecurso] 
  ):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*12.2*/implicitFieldConstructor/*12.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*7.4*/("""


"""),format.raw/*11.1*/("""
"""),format.raw/*12.77*/(""" 

"""),_display_(/*14.2*/main/*14.6*/{_display_(Seq[Any](format.raw/*14.7*/("""
	"""),format.raw/*15.2*/("""<div class="container-fluid" style="background-color: white; padding: 10px;">
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
				  <li>Recursos</li>
				  <li><a href="/clasificacionList">Clasificados</a></li>
				  <li class="active">Editar</li>
				</ol>			
			</div>
		</div>	
		<div class="row">
			<div class="col-lg-12">
  	          <h3 class="page-header">Editar clasificación</h3>
	        </div>
		</div>	
		<div class="row">
			<div class="col-lg-12">
				"""),_display_(/*32.6*/form(CSRF(routes.ClasificacionController.update(id)), 'id->"frmEdit")/*32.75*/ {_display_(Seq[Any](format.raw/*32.77*/("""	
					"""),_display_(/*33.7*/formClasificacion(cForm, id, clas2, clas3, cancelable, noevaluable, tiposrecursos)),format.raw/*33.89*/("""
					"""),format.raw/*34.6*/("""<div class="center-block">
						<input type="submit" class="btn btn-primary" value="Actualizar clasificación">
					</div>			
				""")))}),format.raw/*37.6*/("""
			"""),format.raw/*38.4*/("""</div>
		</div>
	</div>
""")))}),format.raw/*41.2*/("""

"""),format.raw/*43.1*/("""<script type="text/javascript">
$(function() """),format.raw/*44.14*/("""{"""),format.raw/*44.15*/("""
	"""),format.raw/*45.2*/("""$('#frmEdit').attr("data-toggle","validator");
	$("#observacion_observacion").parent().parent().hide();		
	$(".observacion").hide();
	

	
	leer();
"""),format.raw/*52.1*/("""}"""),format.raw/*52.2*/(""");

	function leer()"""),format.raw/*54.17*/("""{"""),format.raw/*54.18*/("""
		"""),format.raw/*55.3*/("""$("[name='criterio1.id']").change();
		$('#criterio2_id option[value="""),_display_(/*56.34*/cForm("criterio2.id")/*56.55*/.value),format.raw/*56.61*/("""]').attr('selected',true);
		$("#criterio2_id").change();
		$('#criterio3_id option[value="""),_display_(/*58.34*/cForm("criterio3.id")/*58.55*/.value),format.raw/*58.61*/("""]').attr('selected',true);
		$("#criterio3_id").change();
		
		if (""""),_display_(/*61.9*/cForm("observacion.observacion")/*61.41*/.value),format.raw/*61.47*/("""" == "")"""),format.raw/*61.55*/("""{"""),format.raw/*61.56*/("""
			"""),format.raw/*62.4*/("""$("#observacion_observacion").parent().parent().hide();
		"""),format.raw/*63.3*/("""}"""),format.raw/*63.4*/(""" """),format.raw/*63.5*/("""else """),format.raw/*63.10*/("""{"""),format.raw/*63.11*/("""
			"""),format.raw/*64.4*/("""$("#observacion_observacion").val( """),_display_(/*64.40*/cForm("observacion.observacion")/*64.72*/.value),format.raw/*64.78*/(""" """),format.raw/*64.79*/(""");
			$("#observacion_observacion").parent().parent().show();
		"""),format.raw/*66.3*/("""}"""),format.raw/*66.4*/("""

		"""),format.raw/*68.3*/("""setTimeout(function()"""),format.raw/*68.24*/("""{"""),format.raw/*68.25*/("""
			  """),format.raw/*69.6*/("""$('#tiporecurso_id option[value=""""),_display_(/*69.40*/cForm("tiporecurso.id")/*69.63*/.value),format.raw/*69.69*/(""""]').attr('selected',true);
			  $('#tiporecurso_id').change();
		"""),format.raw/*71.3*/("""}"""),format.raw/*71.4*/(""", 500);
		
	"""),format.raw/*73.2*/("""}"""),format.raw/*73.3*/("""


	"""),format.raw/*76.2*/("""$( document ).on( "change", "[name='criterio1.id']", function() """),format.raw/*76.66*/("""{"""),format.raw/*76.67*/("""		
		"""),format.raw/*77.3*/("""$("#criterio2_id").children('option:not(:first)').remove();
		$("#criterio3_id").children('option:not(:first)').remove();
		$("#divEjemplos1, #divEjemplos2").html("");
		"""),_display_(/*80.4*/for(x<-clas2) yield /*80.17*/{_display_(Seq[Any](format.raw/*80.18*/("""
			"""),format.raw/*81.4*/("""if ( """"),_display_(/*81.11*/x/*81.12*/.criterio1.id),format.raw/*81.25*/("""" == $("[name='criterio1.id']:checked").val()  )"""),format.raw/*81.73*/("""{"""),format.raw/*81.74*/("""
				"""),format.raw/*82.5*/("""$("#criterio2_id").append('<option value=""""),_display_(/*82.48*/x/*82.49*/.id),format.raw/*82.52*/("""">"""),_display_(/*82.55*/x/*82.56*/.descripcion),format.raw/*82.68*/("""</option>');
			"""),format.raw/*83.4*/("""}"""),format.raw/*83.5*/("""
		""")))}),format.raw/*84.4*/("""
		"""),_display_(/*85.4*/for(x<-clas3) yield /*85.17*/{_display_(Seq[Any](format.raw/*85.18*/("""
			"""),format.raw/*86.4*/("""if ( """"),_display_(/*86.11*/x/*86.12*/.criterio1.id),format.raw/*86.25*/("""" == $("[name='criterio1.id']:checked").val()  )"""),format.raw/*86.73*/("""{"""),format.raw/*86.74*/("""
				"""),format.raw/*87.5*/("""$("#criterio3_id").append('<option value=""""),_display_(/*87.48*/x/*87.49*/.id),format.raw/*87.52*/("""">"""),_display_(/*87.55*/x/*87.56*/.catalogo.descripcion),format.raw/*87.77*/("""</option>');
			"""),format.raw/*88.4*/("""}"""),format.raw/*88.5*/("""
		""")))}),format.raw/*89.4*/("""	
		"""),format.raw/*90.3*/("""$("#criterio2_id").change();	
	"""),format.raw/*91.2*/("""}"""),format.raw/*91.3*/(""");	


$( document ).on( "change", "#criterio2_id, #criterio3_id", function() """),format.raw/*94.72*/("""{"""),format.raw/*94.73*/("""
	"""),format.raw/*95.2*/("""var idCriterio = $(this).prop("id"); 
	if( idCriterio =="criterio2_id")"""),format.raw/*96.34*/("""{"""),format.raw/*96.35*/("""
		"""),format.raw/*97.3*/("""$("#criterio3_id option:gt(0)").remove();
		console.log($("[id^='criterio1_id_']:checked").val()+ "   -   "+$(this).val())
		"""),_display_(/*99.4*/for(x<-clas3) yield /*99.17*/{_display_(Seq[Any](format.raw/*99.18*/("""
			"""),format.raw/*100.4*/("""console.log(""""),_display_(/*100.18*/x/*100.19*/.criterio1.id),format.raw/*100.32*/("""    """),_display_(/*100.37*/x/*100.38*/.criterio2.id),format.raw/*100.51*/("""      """),_display_(/*100.58*/x/*100.59*/.catalogo.id),format.raw/*100.71*/("""   """),_display_(/*100.75*/x/*100.76*/.catalogo.descripcion),format.raw/*100.97*/("""")
			if ( """"),_display_(/*101.11*/x/*101.12*/.criterio1.id),format.raw/*101.25*/("""" == $("[id^='criterio1_id_']:checked").val()  &&   $(this).val() == """"),_display_(/*101.96*/x/*101.97*/.criterio2.id),format.raw/*101.110*/(""""  )"""),format.raw/*101.114*/("""{"""),format.raw/*101.115*/("""
				"""),format.raw/*102.5*/("""console.log("o k i")
				$("#criterio3_id").append('<option value=""""),_display_(/*103.48*/x/*103.49*/.id),format.raw/*103.52*/("""">"""),_display_(/*103.55*/x/*103.56*/.catalogo.descripcion),format.raw/*103.77*/("""</option>');
			"""),format.raw/*104.4*/("""}"""),format.raw/*104.5*/("""
		""")))}),format.raw/*105.4*/("""
	"""),format.raw/*106.2*/("""}"""),format.raw/*106.3*/("""

	"""),format.raw/*108.2*/("""$("#combina").html("");
	//$("#divMensajes1 ").toggle(false);
	$("#btnCancelar").show();
	$("#observacion_observacion").parent().parent().hide();
	var cadena ="";
//	$("#divMensajes1").html("");
	var num = $(this).prop("id").substring(8,9);
	var parId = $(this).val(); 
	if ($(this).val() != "")"""),format.raw/*116.26*/("""{"""),format.raw/*116.27*/("""
		"""),format.raw/*117.3*/("""var $descCriterio = llamadaAjaxDescripcionCriterio(num, parId);	
		$.when($descCriterio).done(function(data)"""),format.raw/*118.44*/("""{"""),format.raw/*118.45*/("""
			"""),format.raw/*119.4*/("""if(idCriterio=="criterio2_id")"""),format.raw/*119.34*/("""{"""),format.raw/*119.35*/("""
				"""),format.raw/*120.5*/("""$("#divDescripC2").html(data.descripcion);
			"""),format.raw/*121.4*/("""}"""),format.raw/*121.5*/("""
			"""),format.raw/*122.4*/("""if(idCriterio=="criterio3_id")"""),format.raw/*122.34*/("""{"""),format.raw/*122.35*/("""
				"""),format.raw/*123.5*/("""$("#divDescripC3").html(data.descripcion);
			"""),format.raw/*124.4*/("""}"""),format.raw/*124.5*/("""			
		"""),format.raw/*125.3*/("""}"""),format.raw/*125.4*/(""");
	"""),format.raw/*126.2*/("""}"""),format.raw/*126.3*/("""
	"""),format.raw/*127.2*/("""if ( $("select[name='criterio2.id']").val() != ""    &&    $("select[name='criterio3.id']").val() != ""  )"""),format.raw/*127.108*/("""{"""),format.raw/*127.109*/("""
		"""),format.raw/*128.3*/("""var $restricciones = llamadaAjaxRestricciones($("[name='criterio1.id']:checked").val(), $("#criterio2_id").val(), $("#criterio3_id").val());

		// Es cancelable y/o no evaluable?		
		$.when($restricciones).done(function(data)"""),format.raw/*131.45*/("""{"""),format.raw/*131.46*/("""
			"""),format.raw/*132.4*/("""console.dir(data)
			$("#divMensajes1").toggle( data.cancelable );
			$("#divMensajes2").toggle( data.noevaluable);
			$("#btnCancelar").toggle( !data.cancelable   );
		"""),format.raw/*136.3*/("""}"""),format.raw/*136.4*/(""");

		cadena = "<tr><td class='center-block'><h3>"+$("[name='criterio2.id'] option:selected").text() + " / "+$("[name='criterio3.id'] option:selected").text()+"</h3></td></tr>";		
		$("#combina").html("<table>"+cadena+"</table>");
		$.ajax("""),format.raw/*140.10*/("""{"""),format.raw/*140.11*/("""
				  """),format.raw/*141.7*/("""method: "GET",
				//  async: false,
				  url: "/ejemplosClasificador?c1="+$("[name='criterio1.id']:checked").val()+"&c2="+$("#criterio2_id").val()+"&c3="+$("#criterio3_id").val(),
				  dataType: "json",
				  beforeSend: function() """),format.raw/*145.30*/("""{"""),format.raw/*145.31*/("""
						"""),format.raw/*146.7*/("""$("#divEjemplos1").html("Buscando ejemplos...");
					"""),format.raw/*147.6*/("""}"""),format.raw/*147.7*/(""",
		"""),format.raw/*148.3*/("""}"""),format.raw/*148.4*/(""")
		  .success(function( data ) """),format.raw/*149.31*/("""{"""),format.raw/*149.32*/("""
		  	"""),format.raw/*150.6*/("""var retorno = data;
				var aux = "";		
				$("#tiporecurso_id option").remove();
				$("#tiporecurso_id").append("<option value=''>Seleccione tipo de recurso...</option>");  	
		  		$.each( retorno, function( index, e )"""),format.raw/*154.44*/("""{"""),format.raw/*154.45*/("""		  		
		  			"""),format.raw/*155.8*/("""$("#tiporecurso_id").append($('<option>', """),format.raw/*155.50*/("""{"""),format.raw/*155.51*/(""" 
				        """),format.raw/*156.13*/("""value: e.id,
				        text : e.descripcion 
				    """),format.raw/*158.9*/("""}"""),format.raw/*158.10*/("""));
					aux += "<tr><td> - "+e.descripcion+".</td></tr>";				    
		  		"""),format.raw/*160.7*/("""}"""),format.raw/*160.8*/(""");
		  		$("#divEjemplos1").show();
		  		$("#divEjemplos1").html("<b>Ejemplos</b><br><table>"+aux+"</table>");				    
		  """),format.raw/*163.5*/("""}"""),format.raw/*163.6*/(""")					
		  .error(function(data)"""),format.raw/*164.26*/("""{"""),format.raw/*164.27*/("""
			  """),format.raw/*165.6*/("""alert("error en ajax");
		  """),format.raw/*166.5*/("""}"""),format.raw/*166.6*/(""")				
	"""),format.raw/*167.2*/("""}"""),format.raw/*167.3*/(""" """),format.raw/*167.4*/("""else
		$("#combina").html("");
		
"""),format.raw/*170.1*/("""}"""),format.raw/*170.2*/(""");

+function(a)"""),format.raw/*172.13*/("""{"""),format.raw/*172.14*/(""""use strict";function b(b)"""),format.raw/*172.40*/("""{"""),format.raw/*172.41*/("""return this.each(function()"""),format.raw/*172.68*/("""{"""),format.raw/*172.69*/("""var d=a(this),e=a.extend("""),format.raw/*172.94*/("""{"""),format.raw/*172.95*/("""}"""),format.raw/*172.96*/(""",c.DEFAULTS,d.data(),"object"==typeof b&&b),f=d.data("bs.validator");(f||"destroy"!=b)&&(f||d.data("bs.validator",f=new c(this,e)),"string"==typeof b&&f[b]())"""),format.raw/*172.254*/("""}"""),format.raw/*172.255*/(""")"""),format.raw/*172.256*/("""}"""),format.raw/*172.257*/("""var c=function(b,c)"""),format.raw/*172.276*/("""{"""),format.raw/*172.277*/("""this.$element=a(b),this.options=c,this.$element.attr("novalidate",!0),this.toggleSubmit(),this.$element.on("input.bs.validator change.bs.validator focusout.bs.validator",a.proxy(this.validateInput,this)),this.$element.on("submit.bs.validator",a.proxy(this.onSubmit,this)),this.$element.find("[data-match]").each(function()"""),format.raw/*172.599*/("""{"""),format.raw/*172.600*/("""var b=a(this),c=b.data("match");a(c).on("input.bs.validator",function()"""),format.raw/*172.671*/("""{"""),format.raw/*172.672*/("""b.val()&&b.trigger("input.bs.validator")"""),format.raw/*172.712*/("""}"""),format.raw/*172.713*/(""")"""),format.raw/*172.714*/("""}"""),format.raw/*172.715*/(""")"""),format.raw/*172.716*/("""}"""),format.raw/*172.717*/(""";c.DEFAULTS="""),format.raw/*172.729*/("""{"""),format.raw/*172.730*/("""delay:500,html:!1,disable:!0,errors:"""),format.raw/*172.766*/("""{"""),format.raw/*172.767*/("""match:"Does not match",minlength:"Not long enough""""),format.raw/*172.817*/("""}"""),format.raw/*172.818*/("""}"""),format.raw/*172.819*/(""",c.VALIDATORS="""),format.raw/*172.833*/("""{"""),format.raw/*172.834*/(""""native":function(a)"""),format.raw/*172.854*/("""{"""),format.raw/*172.855*/("""var b=a[0];return b.checkValidity?b.checkValidity():!0"""),format.raw/*172.909*/("""}"""),format.raw/*172.910*/(""",match:function(b)"""),format.raw/*172.928*/("""{"""),format.raw/*172.929*/("""var c=b.data("match");return!b.val()||b.val()===a(c).val()"""),format.raw/*172.987*/("""}"""),format.raw/*172.988*/(""",minlength:function(a)"""),format.raw/*172.1010*/("""{"""),format.raw/*172.1011*/("""var b=a.data("minlength");return!a.val()||a.val().length>=b"""),format.raw/*172.1070*/("""}"""),format.raw/*172.1071*/("""}"""),format.raw/*172.1072*/(""",c.prototype.validateInput=function(b)"""),format.raw/*172.1110*/("""{"""),format.raw/*172.1111*/("""var c=a(b.target),d=c.data("bs.validator.errors");if(c.is('[type="radio"]')&&(c=this.$element.find('input[name="'+c.attr("name")+'"]')),this.$element.trigger(b=a.Event("validate.bs.validator","""),format.raw/*172.1303*/("""{"""),format.raw/*172.1304*/("""relatedTarget:c[0]"""),format.raw/*172.1322*/("""}"""),format.raw/*172.1323*/(""")),!b.isDefaultPrevented())"""),format.raw/*172.1350*/("""{"""),format.raw/*172.1351*/("""var e=this;this.runValidators(c).done(function(f)"""),format.raw/*172.1400*/("""{"""),format.raw/*172.1401*/("""c.data("bs.validator.errors",f),f.length?e.showErrors(c):e.clearErrors(c),d&&f.toString()===d.toString()||(b=f.length?a.Event("invalid.bs.validator","""),format.raw/*172.1550*/("""{"""),format.raw/*172.1551*/("""relatedTarget:c[0],detail:f"""),format.raw/*172.1578*/("""}"""),format.raw/*172.1579*/("""):a.Event("valid.bs.validator","""),format.raw/*172.1610*/("""{"""),format.raw/*172.1611*/("""relatedTarget:c[0],detail:d"""),format.raw/*172.1638*/("""}"""),format.raw/*172.1639*/("""),e.$element.trigger(b)),e.toggleSubmit(),e.$element.trigger(a.Event("validated.bs.validator","""),format.raw/*172.1733*/("""{"""),format.raw/*172.1734*/("""relatedTarget:c[0]"""),format.raw/*172.1752*/("""}"""),format.raw/*172.1753*/("""))"""),format.raw/*172.1755*/("""}"""),format.raw/*172.1756*/(""")"""),format.raw/*172.1757*/("""}"""),format.raw/*172.1758*/("""}"""),format.raw/*172.1759*/(""",c.prototype.runValidators=function(b)"""),format.raw/*172.1797*/("""{"""),format.raw/*172.1798*/("""function d(a)"""),format.raw/*172.1811*/("""{"""),format.raw/*172.1812*/("""return b.data(a+"-error")||b.data("error")||"native"==a&&b[0].validationMessage||g.errors[a]"""),format.raw/*172.1904*/("""}"""),format.raw/*172.1905*/("""var e=[],f=([c.VALIDATORS.native],a.Deferred()),g=this.options;return b.data("bs.validator.deferred")&&b.data("bs.validator.deferred").reject(),b.data("bs.validator.deferred",f),a.each(c.VALIDATORS,a.proxy(function(a,c)"""),format.raw/*172.2124*/("""{"""),format.raw/*172.2125*/("""if((b.data(a)||"native"==a)&&!c.call(this,b))"""),format.raw/*172.2170*/("""{"""),format.raw/*172.2171*/("""var f=d(a);!~e.indexOf(f)&&e.push(f)"""),format.raw/*172.2207*/("""}"""),format.raw/*172.2208*/("""}"""),format.raw/*172.2209*/(""",this)),!e.length&&b.val()&&b.data("remote")?this.defer(b,function()"""),format.raw/*172.2277*/("""{"""),format.raw/*172.2278*/("""var c="""),format.raw/*172.2284*/("""{"""),format.raw/*172.2285*/("""}"""),format.raw/*172.2286*/(""";c[b.attr("name")]=b.val(),a.get(b.data("remote"),c).fail(function(a,b,c)"""),format.raw/*172.2359*/("""{"""),format.raw/*172.2360*/("""e.push(d("remote")||c)"""),format.raw/*172.2382*/("""}"""),format.raw/*172.2383*/(""").always(function()"""),format.raw/*172.2402*/("""{"""),format.raw/*172.2403*/("""f.resolve(e)"""),format.raw/*172.2415*/("""}"""),format.raw/*172.2416*/(""")"""),format.raw/*172.2417*/("""}"""),format.raw/*172.2418*/("""):f.resolve(e),f.promise()"""),format.raw/*172.2444*/("""}"""),format.raw/*172.2445*/(""",c.prototype.validate=function()"""),format.raw/*172.2477*/("""{"""),format.raw/*172.2478*/("""var a=this.options.delay;return this.options.delay=0,this.$element.find(':input:not([type="hidden"])').trigger("input.bs.validator"),this.options.delay=a,this"""),format.raw/*172.2636*/("""}"""),format.raw/*172.2637*/(""",c.prototype.showErrors=function(b)"""),format.raw/*172.2672*/("""{"""),format.raw/*172.2673*/("""var c=this.options.html?"html":"text";this.defer(b,function()"""),format.raw/*172.2734*/("""{"""),format.raw/*172.2735*/("""var d=b.closest(".form-group"),e=d.find(".help-block.with-errors"),f=d.find(".form-control-feedback"),g=b.data("bs.validator.errors");g.length&&(g=a("<ul/>").addClass("list-unstyled").append(a.map(g,function(b)"""),format.raw/*172.2945*/("""{"""),format.raw/*172.2946*/("""return a("<li/>")[c](b)"""),format.raw/*172.2969*/("""}"""),format.raw/*172.2970*/(""")),void 0===e.data("bs.validator.originalContent")&&e.data("bs.validator.originalContent",e.html()),e.empty().append(g),d.removeClass("has-success"),d.addClass("has-error"),f.removeClass("glyphicon-ok"),f.addClass("glyphicon-warning-sign"))"""),format.raw/*172.3210*/("""}"""),format.raw/*172.3211*/(""")"""),format.raw/*172.3212*/("""}"""),format.raw/*172.3213*/(""",c.prototype.clearErrors=function(a)"""),format.raw/*172.3249*/("""{"""),format.raw/*172.3250*/("""var b=a.closest(".form-group"),c=b.find(".help-block.with-errors"),d=b.find(".form-control-feedback");c.html(c.data("bs.validator.originalContent")),b.removeClass("has-error"),b.addClass("has-success"),d.removeClass("glyphicon-warning-sign"),d.addClass("glyphicon-ok")"""),format.raw/*172.3518*/("""}"""),format.raw/*172.3519*/(""",c.prototype.hasErrors=function()"""),format.raw/*172.3552*/("""{"""),format.raw/*172.3553*/("""function b()"""),format.raw/*172.3565*/("""{"""),format.raw/*172.3566*/("""return!!(a(this).data("bs.validator.errors")||[]).length"""),format.raw/*172.3622*/("""}"""),format.raw/*172.3623*/("""return!!this.$element.find(":input:enabled").filter(b).length"""),format.raw/*172.3684*/("""}"""),format.raw/*172.3685*/(""",c.prototype.isIncomplete=function()"""),format.raw/*172.3721*/("""{"""),format.raw/*172.3722*/("""function b()"""),format.raw/*172.3734*/("""{"""),format.raw/*172.3735*/("""return"checkbox"===this.type?!this.checked:"radio"===this.type?!a('[name="'+this.name+'"]:checked').length:""===a.trim(this.value)"""),format.raw/*172.3865*/("""}"""),format.raw/*172.3866*/("""return!!this.$element.find(":input[required]:enabled").filter(b).length"""),format.raw/*172.3937*/("""}"""),format.raw/*172.3938*/(""",c.prototype.onSubmit=function(a)"""),format.raw/*172.3971*/("""{"""),format.raw/*172.3972*/("""this.validate(),(this.isIncomplete()||this.hasErrors())&&a.preventDefault()"""),format.raw/*172.4047*/("""}"""),format.raw/*172.4048*/(""",c.prototype.toggleSubmit=function()"""),format.raw/*172.4084*/("""{"""),format.raw/*172.4085*/("""if(this.options.disable)"""),format.raw/*172.4109*/("""{"""),format.raw/*172.4110*/("""var a=this.$element.find('input[type="submit"], button[type="submit"]');a.toggleClass("disabled",this.isIncomplete()||this.hasErrors()).css("""),format.raw/*172.4250*/("""{"""),format.raw/*172.4251*/(""""pointer-events":"all",cursor:"pointer""""),format.raw/*172.4290*/("""}"""),format.raw/*172.4291*/(""")"""),format.raw/*172.4292*/("""}"""),format.raw/*172.4293*/("""}"""),format.raw/*172.4294*/(""",c.prototype.defer=function(a,b)"""),format.raw/*172.4326*/("""{"""),format.raw/*172.4327*/("""return this.options.delay?(window.clearTimeout(a.data("bs.validator.timeout")),void a.data("bs.validator.timeout",window.setTimeout(b,this.options.delay))):b()"""),format.raw/*172.4486*/("""}"""),format.raw/*172.4487*/(""",c.prototype.destroy=function()"""),format.raw/*172.4518*/("""{"""),format.raw/*172.4519*/("""return this.$element.removeAttr("novalidate").removeData("bs.validator").off(".bs.validator"),this.$element.find(":input").off(".bs.validator").removeData(["bs.validator.errors","bs.validator.deferred"]).each(function()"""),format.raw/*172.4738*/("""{"""),format.raw/*172.4739*/("""var b=a(this),c=b.data("bs.validator.timeout");window.clearTimeout(c)&&b.removeData("bs.validator.timeout")"""),format.raw/*172.4846*/("""}"""),format.raw/*172.4847*/("""),this.$element.find(".help-block.with-errors").each(function()"""),format.raw/*172.4910*/("""{"""),format.raw/*172.4911*/("""var b=a(this),c=b.data("bs.validator.originalContent");b.removeData("bs.validator.originalContent").html(c)"""),format.raw/*172.5018*/("""}"""),format.raw/*172.5019*/("""),this.$element.find('input[type="submit"], button[type="submit"]').removeClass("disabled"),this.$element.find(".has-error").removeClass("has-error"),this"""),format.raw/*172.5173*/("""}"""),format.raw/*172.5174*/(""";var d=a.fn.validator;a.fn.validator=b,a.fn.validator.Constructor=c,a.fn.validator.noConflict=function()"""),format.raw/*172.5278*/("""{"""),format.raw/*172.5279*/("""return a.fn.validator=d,this"""),format.raw/*172.5307*/("""}"""),format.raw/*172.5308*/(""",a(window).on("load",function()"""),format.raw/*172.5339*/("""{"""),format.raw/*172.5340*/("""a('form[data-toggle="validator"]').each(function()"""),format.raw/*172.5390*/("""{"""),format.raw/*172.5391*/("""var c=a(this);b.call(c,c.data())"""),format.raw/*172.5423*/("""}"""),format.raw/*172.5424*/(""")"""),format.raw/*172.5425*/("""}"""),format.raw/*172.5426*/(""")"""),format.raw/*172.5427*/("""}"""),format.raw/*172.5428*/("""(jQuery);

</script>

<script src=""""),_display_(/*176.15*/routes/*176.21*/.Assets.at("javascripts/clasificacion.js")),format.raw/*176.63*/(""""></script>


"""))}
  }

  def render(id:Long,cForm:Form[Clasificacion],clas2:List[ClasificadorCriterio2],clas3:List[ClasificadorCriterio3],cancelable:List[ClasificadorCancelable],noevaluable:List[ClasificadorNoevaluable],tiposrecursos:List[ClasificadorTiporecurso]): play.twirl.api.HtmlFormat.Appendable = apply(id,cForm,clas2,clas3,cancelable,noevaluable,tiposrecursos)

  def f:((Long,Form[Clasificacion],List[ClasificadorCriterio2],List[ClasificadorCriterio3],List[ClasificadorCancelable],List[ClasificadorNoevaluable],List[ClasificadorTiporecurso]) => play.twirl.api.HtmlFormat.Appendable) = (id,cForm,clas2,clas3,cancelable,noevaluable,tiposrecursos) => apply(id,cForm,clas2,clas3,cancelable,noevaluable,tiposrecursos)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:37 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Clasificacion/edit.scala.html
                  HASH: 2c6deae332adf35b50bd03c38070d646078ff104
                  MATRIX: 899->1|1249->277|1282->301|1362->255|1392->275|1421->352|1451->356|1463->360|1501->361|1530->363|2052->859|2130->928|2170->930|2204->938|2307->1020|2340->1026|2502->1158|2533->1162|2588->1187|2617->1189|2690->1234|2719->1235|2748->1237|2922->1384|2950->1385|2998->1405|3027->1406|3057->1409|3154->1479|3184->1500|3211->1506|3329->1597|3359->1618|3386->1624|3481->1693|3522->1725|3549->1731|3585->1739|3614->1740|3645->1744|3730->1802|3758->1803|3786->1804|3819->1809|3848->1810|3879->1814|3942->1850|3983->1882|4010->1888|4039->1889|4130->1953|4158->1954|4189->1958|4238->1979|4267->1980|4300->1986|4361->2020|4393->2043|4420->2049|4513->2115|4541->2116|4580->2128|4608->2129|4639->2133|4731->2197|4760->2198|4792->2203|4989->2374|5018->2387|5057->2388|5088->2392|5122->2399|5132->2400|5166->2413|5242->2461|5271->2462|5303->2467|5373->2510|5383->2511|5407->2514|5437->2517|5447->2518|5480->2530|5523->2546|5551->2547|5585->2551|5615->2555|5644->2568|5683->2569|5714->2573|5748->2580|5758->2581|5792->2594|5868->2642|5897->2643|5929->2648|5999->2691|6009->2692|6033->2695|6063->2698|6073->2699|6115->2720|6158->2736|6186->2737|6220->2741|6251->2745|6309->2776|6337->2777|6442->2854|6471->2855|6500->2857|6599->2928|6628->2929|6658->2932|6810->3058|6839->3071|6878->3072|6910->3076|6952->3090|6963->3091|6998->3104|7031->3109|7042->3110|7077->3123|7112->3130|7123->3131|7157->3143|7189->3147|7200->3148|7243->3169|7284->3182|7295->3183|7330->3196|7429->3267|7440->3268|7476->3281|7510->3285|7541->3286|7574->3291|7670->3359|7681->3360|7706->3363|7737->3366|7748->3367|7791->3388|7835->3404|7864->3405|7899->3409|7929->3411|7958->3412|7989->3415|8313->3710|8343->3711|8374->3714|8511->3822|8541->3823|8573->3827|8632->3857|8662->3858|8695->3863|8769->3909|8798->3910|8830->3914|8889->3944|8919->3945|8952->3950|9026->3996|9055->3997|9089->4003|9118->4004|9150->4008|9179->4009|9209->4011|9345->4117|9376->4118|9407->4121|9661->4346|9691->4347|9723->4351|9920->4520|9949->4521|10218->4761|10248->4762|10283->4769|10547->5004|10577->5005|10612->5012|10694->5066|10723->5067|10755->5071|10784->5072|10845->5104|10875->5105|10909->5111|11158->5331|11188->5332|11230->5346|11301->5388|11331->5389|11374->5403|11457->5458|11487->5459|11588->5532|11617->5533|11769->5657|11798->5658|11859->5690|11889->5691|11923->5697|11979->5725|12008->5726|12043->5733|12072->5734|12101->5735|12163->5769|12192->5770|12237->5786|12267->5787|12322->5813|12352->5814|12408->5841|12438->5842|12492->5867|12522->5868|12552->5869|12740->6027|12771->6028|12802->6029|12833->6030|12882->6049|12913->6050|13265->6372|13296->6373|13397->6444|13428->6445|13498->6485|13529->6486|13560->6487|13591->6488|13622->6489|13653->6490|13695->6502|13726->6503|13792->6539|13823->6540|13903->6590|13934->6591|13965->6592|14009->6606|14040->6607|14090->6627|14121->6628|14205->6682|14236->6683|14284->6701|14315->6702|14403->6760|14434->6761|14487->6783|14519->6784|14609->6843|14641->6844|14673->6845|14742->6883|14774->6884|14997->7076|15029->7077|15078->7095|15110->7096|15168->7123|15200->7124|15280->7173|15312->7174|15492->7323|15524->7324|15582->7351|15614->7352|15676->7383|15708->7384|15766->7411|15798->7412|15923->7506|15955->7507|16004->7525|16036->7526|16069->7528|16101->7529|16133->7530|16165->7531|16197->7532|16266->7570|16298->7571|16342->7584|16374->7585|16497->7677|16529->7678|16779->7897|16811->7898|16887->7943|16919->7944|16986->7980|17018->7981|17050->7982|17149->8050|17181->8051|17218->8057|17250->8058|17282->8059|17386->8132|17418->8133|17471->8155|17503->8156|17553->8175|17585->8176|17628->8188|17660->8189|17692->8190|17724->8191|17781->8217|17813->8218|17876->8250|17908->8251|18097->8409|18129->8410|18195->8445|18227->8446|18319->8507|18351->8508|18592->8718|18624->8719|18678->8742|18710->8743|18981->8983|19013->8984|19045->8985|19077->8986|19144->9022|19176->9023|19475->9291|19507->9292|19571->9325|19603->9326|19646->9338|19678->9339|19765->9395|19797->9396|19889->9457|19921->9458|19988->9494|20020->9495|20063->9507|20095->9508|20256->9638|20288->9639|20390->9710|20422->9711|20486->9744|20518->9745|20624->9820|20656->9821|20723->9857|20755->9858|20810->9882|20842->9883|21013->10023|21045->10024|21115->10063|21147->10064|21179->10065|21211->10066|21243->10067|21306->10099|21338->10100|21528->10259|21560->10260|21622->10291|21654->10292|21904->10511|21936->10512|22074->10619|22106->10620|22200->10683|22232->10684|22370->10791|22402->10792|22587->10946|22619->10947|22754->11051|22786->11052|22845->11080|22877->11081|22939->11112|22971->11113|23052->11163|23084->11164|23147->11196|23179->11197|23211->11198|23243->11199|23275->11200|23307->11201|23371->11237|23387->11243|23451->11285
                  LINES: 26->1|34->12|34->12|35->7|38->11|39->12|41->14|41->14|41->14|42->15|59->32|59->32|59->32|60->33|60->33|61->34|64->37|65->38|68->41|70->43|71->44|71->44|72->45|79->52|79->52|81->54|81->54|82->55|83->56|83->56|83->56|85->58|85->58|85->58|88->61|88->61|88->61|88->61|88->61|89->62|90->63|90->63|90->63|90->63|90->63|91->64|91->64|91->64|91->64|91->64|93->66|93->66|95->68|95->68|95->68|96->69|96->69|96->69|96->69|98->71|98->71|100->73|100->73|103->76|103->76|103->76|104->77|107->80|107->80|107->80|108->81|108->81|108->81|108->81|108->81|108->81|109->82|109->82|109->82|109->82|109->82|109->82|109->82|110->83|110->83|111->84|112->85|112->85|112->85|113->86|113->86|113->86|113->86|113->86|113->86|114->87|114->87|114->87|114->87|114->87|114->87|114->87|115->88|115->88|116->89|117->90|118->91|118->91|121->94|121->94|122->95|123->96|123->96|124->97|126->99|126->99|126->99|127->100|127->100|127->100|127->100|127->100|127->100|127->100|127->100|127->100|127->100|127->100|127->100|127->100|128->101|128->101|128->101|128->101|128->101|128->101|128->101|128->101|129->102|130->103|130->103|130->103|130->103|130->103|130->103|131->104|131->104|132->105|133->106|133->106|135->108|143->116|143->116|144->117|145->118|145->118|146->119|146->119|146->119|147->120|148->121|148->121|149->122|149->122|149->122|150->123|151->124|151->124|152->125|152->125|153->126|153->126|154->127|154->127|154->127|155->128|158->131|158->131|159->132|163->136|163->136|167->140|167->140|168->141|172->145|172->145|173->146|174->147|174->147|175->148|175->148|176->149|176->149|177->150|181->154|181->154|182->155|182->155|182->155|183->156|185->158|185->158|187->160|187->160|190->163|190->163|191->164|191->164|192->165|193->166|193->166|194->167|194->167|194->167|197->170|197->170|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|199->172|203->176|203->176|203->176
                  -- GENERATED --
              */
          