
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
object create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[Form[Clasificacion],Long,List[ClasificadorCriterio2],List[ClasificadorCriterio3],List[ClasificadorCancelable],List[ClasificadorNoevaluable],List[ClasificadorTiporecurso],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(forma:Form[Clasificacion], 
  id:Long,  
  clas2:List[ClasificadorCriterio2],  
  clas3:List[ClasificadorCriterio3], 
  cancelable:List[ClasificadorCancelable], 
  noevaluable:List[ClasificadorNoevaluable],
  tiposrecursos:List[ClasificadorTiporecurso]  ):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*9.2*/implicitFieldConstructor/*9.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*7.49*/("""
"""),format.raw/*9.77*/("""
"""),_display_(/*10.2*/main/*10.6*/{_display_(Seq[Any](format.raw/*10.7*/("""
	"""),format.raw/*11.2*/("""<div class="container-fluid" style="background-color: white; padding: 10px;">
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
				  <li>Recursos</li>
				  <li>Clasificados</li>
				  <li class="active">Clasificar</li>
				</ol>			
			</div>
		</div>	
		<div class="row">
			<div class="col-lg-12">
  	          <h3>Clasificar recurso</h3>
	        </div>
		</div>		
		<div class="row">
			<div class="col-lg-12">		
				"""),_display_(/*28.6*/form(CSRF(routes.ClasificacionController.save()), 'id->"frmCreate")/*28.73*/ {_display_(Seq[Any](format.raw/*28.75*/("""				
					"""),_display_(/*29.7*/formClasificacion(forma, id, clas2, clas3, cancelable, noevaluable, tiposrecursos )),format.raw/*29.90*/("""			         
				""")))}),format.raw/*30.6*/("""
			"""),format.raw/*31.4*/("""</div>
		</div>
	</div>	
""")))}),format.raw/*34.2*/("""


"""),format.raw/*37.1*/("""<script type="text/javascript">
$(function() """),format.raw/*38.14*/("""{"""),format.raw/*38.15*/("""
	"""),format.raw/*39.2*/("""$(".observacion").hide();
	$('#frmCreate').attr("data-toggle","validator");
	$("#observacion_observacion").parent().parent().hide();
	$("#criterio2_id").children('option:not(:first)').remove();
	$("#criterio3_id").children('option:not(:first)').remove();
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/(""");



$( document ).on( "change", "[name='criterio1.id']", function() """),format.raw/*48.65*/("""{"""),format.raw/*48.66*/("""
	"""),format.raw/*49.2*/("""$("#criterio2_id").children('option:not(:first)').remove();
	$("#criterio3_id").children('option:not(:first)').remove();
	$("#tiporecurso_id").children('option:not(:first)').remove();
	$("#divEjemplos1, #divEjemplos2, #divDescripC1, #divDescripC2, #divDescripC3").html("");
	
	"""),_display_(/*54.3*/for(x<-clas2) yield /*54.16*/{_display_(Seq[Any](format.raw/*54.17*/("""
		"""),format.raw/*55.3*/("""if ( """"),_display_(/*55.10*/x/*55.11*/.criterio1.id),format.raw/*55.24*/("""" == $(this).val()  )"""),format.raw/*55.45*/("""{"""),format.raw/*55.46*/("""
			"""),format.raw/*56.4*/("""$("#criterio2_id").append('<option value=""""),_display_(/*56.47*/x/*56.48*/.id),format.raw/*56.51*/("""">"""),_display_(/*56.54*/x/*56.55*/.descripcion),format.raw/*56.67*/("""</option>');
		"""),format.raw/*57.3*/("""}"""),format.raw/*57.4*/("""
	""")))}),format.raw/*58.3*/("""

	"""),format.raw/*60.2*/("""$("#criterio2_id").change();	
	
	if ( $("[name='criterio1.id']:checked").val() == 20 )"""),format.raw/*62.55*/("""{"""),format.raw/*62.56*/("""
		"""),format.raw/*63.3*/("""$("#rowTipoRecurso").hide();
		$("#tiporecurso_id option:selected").attr("selected", false);
	"""),format.raw/*65.2*/("""}"""),format.raw/*65.3*/(""" """),format.raw/*65.4*/("""else """),format.raw/*65.9*/("""{"""),format.raw/*65.10*/("""
		"""),format.raw/*66.3*/("""$("#rowTipoRecurso").show();
	"""),format.raw/*67.2*/("""}"""),format.raw/*67.3*/("""
"""),format.raw/*68.1*/("""}"""),format.raw/*68.2*/(""");	


$( document ).on( "change", "#criterio2_id, #criterio3_id", function() """),format.raw/*71.72*/("""{"""),format.raw/*71.73*/("""
	"""),format.raw/*72.2*/("""var idCriterio = $(this).prop("id"); 
	if( idCriterio =="criterio2_id")"""),format.raw/*73.34*/("""{"""),format.raw/*73.35*/("""
		"""),format.raw/*74.3*/("""$("#criterio3_id option:gt(0)").remove();
		console.log($("[id^='criterio1_id_']:checked").val()+ "   -   "+$(this).val())
		"""),_display_(/*76.4*/for(x<-clas3) yield /*76.17*/{_display_(Seq[Any](format.raw/*76.18*/("""
			"""),format.raw/*77.4*/("""console.log(" - """),_display_(/*77.21*/x/*77.22*/.id),format.raw/*77.25*/(""" """),format.raw/*77.26*/("""-   """),_display_(/*77.31*/x/*77.32*/.criterio1.id),format.raw/*77.45*/("""    """),_display_(/*77.50*/x/*77.51*/.criterio2.id),format.raw/*77.64*/("""      """),_display_(/*77.71*/x/*77.72*/.catalogo.id),format.raw/*77.84*/("""   """),_display_(/*77.88*/x/*77.89*/.catalogo.descripcion),format.raw/*77.110*/("""")
			if ( """"),_display_(/*78.11*/x/*78.12*/.criterio1.id),format.raw/*78.25*/("""" == $("[id^='criterio1_id_']:checked").val()  &&   $(this).val() == """"),_display_(/*78.96*/x/*78.97*/.criterio2.id),format.raw/*78.110*/(""""  )"""),format.raw/*78.114*/("""{"""),format.raw/*78.115*/("""
				"""),format.raw/*79.5*/("""console.log("o k i")
			console.dir (
					"""),_display_(/*81.7*/models/*81.13*/.ClasificadorCriterio3.find.where().eq("criterio1.id", 1).eq("criterio2.id", 2).findList().size()),format.raw/*81.110*/("""
					"""),format.raw/*82.6*/(""")
				$("#criterio3_id").append('<option value=""""),_display_(/*83.48*/x/*83.49*/.id),format.raw/*83.52*/("""">"""),_display_(/*83.55*/x/*83.56*/.catalogo.descripcion),format.raw/*83.77*/("""</option>');
			"""),format.raw/*84.4*/("""}"""),format.raw/*84.5*/("""
		""")))}),format.raw/*85.4*/("""
	"""),format.raw/*86.2*/("""}"""),format.raw/*86.3*/("""

	"""),format.raw/*88.2*/("""$("#combina").html("");
	//$("#divMensajes1 ").toggle(false);
	$("#btnCancelar").show();
	$("#observacion_observacion").parent().parent().hide();
	var cadena ="";
//	$("#divMensajes1").html("");
	var num = $(this).prop("id").substring(8,9);
	var parId = $(this).val(); 
	if ($(this).val() != "")"""),format.raw/*96.26*/("""{"""),format.raw/*96.27*/("""
		"""),format.raw/*97.3*/("""var $descCriterio = llamadaAjaxDescripcionCriterio(num, parId);	
		$.when($descCriterio).done(function(data)"""),format.raw/*98.44*/("""{"""),format.raw/*98.45*/("""
			"""),format.raw/*99.4*/("""if(idCriterio=="criterio2_id")"""),format.raw/*99.34*/("""{"""),format.raw/*99.35*/("""
				"""),format.raw/*100.5*/("""$("#divDescripC2").html(data.descripcion);
			"""),format.raw/*101.4*/("""}"""),format.raw/*101.5*/("""
			"""),format.raw/*102.4*/("""if(idCriterio=="criterio3_id")"""),format.raw/*102.34*/("""{"""),format.raw/*102.35*/("""
				"""),format.raw/*103.5*/("""$("#divDescripC3").html(data.descripcion);
			"""),format.raw/*104.4*/("""}"""),format.raw/*104.5*/("""			
		"""),format.raw/*105.3*/("""}"""),format.raw/*105.4*/(""");
	"""),format.raw/*106.2*/("""}"""),format.raw/*106.3*/("""
	"""),format.raw/*107.2*/("""if ( $("select[name='criterio2.id']").val() != ""    &&    $("select[name='criterio3.id']").val() != ""  )"""),format.raw/*107.108*/("""{"""),format.raw/*107.109*/("""
		"""),format.raw/*108.3*/("""var $restricciones = llamadaAjaxRestricciones($("[name='criterio1.id']:checked").val(), $("#criterio2_id").val(), $("#criterio3_id").val());

		// Es cancelable y/o no evaluable?		
		$.when($restricciones).done(function(data)"""),format.raw/*111.45*/("""{"""),format.raw/*111.46*/("""
			"""),format.raw/*112.4*/("""console.dir(data)
			$("#divMensajes1").toggle( data.cancelable );
			$("#divMensajes2").toggle( data.noevaluable);
			$("#btnCancelar").toggle( !data.cancelable  );
		"""),format.raw/*116.3*/("""}"""),format.raw/*116.4*/(""");

		cadena = "<tr><td class='center-block'><h3>"+$("[name='criterio2.id'] option:selected").text() + " / "+$("[name='criterio3.id'] option:selected").text()+"</h3></td></tr>";		
		$("#combina").html("<table>"+cadena+"</table>");
		$.ajax("""),format.raw/*120.10*/("""{"""),format.raw/*120.11*/("""
				  """),format.raw/*121.7*/("""method: "GET",
				//  async: false,
				  url: "/ejemplosClasificador?c1="+$("[name='criterio1.id']:checked").val()+"&c2="+$("#criterio2_id").val()+"&c3="+$("#criterio3_id").val(),
				  dataType: "json",
				  beforeSend: function() """),format.raw/*125.30*/("""{"""),format.raw/*125.31*/("""
						"""),format.raw/*126.7*/("""$("#divEjemplos1").html("Buscando ejemplos...");
					"""),format.raw/*127.6*/("""}"""),format.raw/*127.7*/(""",
		"""),format.raw/*128.3*/("""}"""),format.raw/*128.4*/(""")
		  .success(function( data ) """),format.raw/*129.31*/("""{"""),format.raw/*129.32*/("""
		  	"""),format.raw/*130.6*/("""var retorno = data;
				var aux = "";		
				$("#tiporecurso_id option").remove();
				$("#tiporecurso_id").append("<option value=''>Seleccione tipo de recurso...</option>");  	
		  		$.each( retorno, function( index, e )"""),format.raw/*134.44*/("""{"""),format.raw/*134.45*/("""		  		
		  			"""),format.raw/*135.8*/("""$("#tiporecurso_id").append($('<option>', """),format.raw/*135.50*/("""{"""),format.raw/*135.51*/(""" 
				        """),format.raw/*136.13*/("""value: e.id,
				        text : e.descripcion 
				    """),format.raw/*138.9*/("""}"""),format.raw/*138.10*/("""));
					aux += "<tr><td> - "+e.descripcion+".</td></tr>";				    
		  		"""),format.raw/*140.7*/("""}"""),format.raw/*140.8*/(""");
		  		$("#divEjemplos1").show();
		  		$("#divEjemplos1").html("<b>Ejemplos</b><br><table>"+aux+"</table>");				    
		  """),format.raw/*143.5*/("""}"""),format.raw/*143.6*/(""")					
		  .error(function(data)"""),format.raw/*144.26*/("""{"""),format.raw/*144.27*/("""
			  """),format.raw/*145.6*/("""alert("error en ajax");
		  """),format.raw/*146.5*/("""}"""),format.raw/*146.6*/(""")				
	"""),format.raw/*147.2*/("""}"""),format.raw/*147.3*/(""" """),format.raw/*147.4*/("""else
		$("#combina").html("");
		
"""),format.raw/*150.1*/("""}"""),format.raw/*150.2*/(""");


	$("#btnCancelar").on("click",function()"""),format.raw/*153.41*/("""{"""),format.raw/*153.42*/("""
		"""),format.raw/*154.3*/("""$("#observacion_observacion").parent().parent().show();
		$("#btnConfirmarCancelar").show();
	"""),format.raw/*156.2*/("""}"""),format.raw/*156.3*/(""");

	$("#btnConfirmarCancelar").on("click", function()"""),format.raw/*158.51*/("""{"""),format.raw/*158.52*/("""
		"""),format.raw/*159.3*/("""if ($("#observacion_observacion").val() != "")"""),format.raw/*159.49*/("""{"""),format.raw/*159.50*/("""
			"""),format.raw/*160.4*/("""$.ajax("""),format.raw/*160.11*/("""{"""),format.raw/*160.12*/("""
				  """),format.raw/*161.7*/("""type: "POST",
				  url:"/cambio?id="+"""),_display_(/*162.26*/id),format.raw/*162.28*/("""+"&observacion="+$("#observacion_observacion").val(),
				  data: """),format.raw/*163.13*/("""{"""),format.raw/*163.14*/("""id:"""),_display_(/*163.18*/id),format.raw/*163.20*/(""", observacion: $("#observacion_observacion").val()"""),format.raw/*163.70*/("""}"""),format.raw/*163.71*/("""
				"""),format.raw/*164.5*/("""}"""),format.raw/*164.6*/(""")
			  .success(function( retorno ) """),format.raw/*165.35*/("""{"""),format.raw/*165.36*/("""
			  	"""),format.raw/*166.7*/("""if ( (retorno == "") || (retorno.length == 0) )"""),format.raw/*166.54*/("""{"""),format.raw/*166.55*/("""
			  		"""),format.raw/*167.8*/("""window.location = """"),_display_(/*167.28*/routes/*167.34*/.ClasificacionController.list()),format.raw/*167.65*/("""";
			  	"""),format.raw/*168.7*/("""}"""),format.raw/*168.8*/(""" 			  """),format.raw/*168.14*/("""}"""),format.raw/*168.15*/(""")					
			  .error(function(retorno)"""),format.raw/*169.30*/("""{"""),format.raw/*169.31*/("""
				  """),format.raw/*170.7*/("""alert("error en ajax");
			  """),format.raw/*171.6*/("""}"""),format.raw/*171.7*/(""")			
		"""),format.raw/*172.3*/("""}"""),format.raw/*172.4*/(""" """),format.raw/*172.5*/("""else """),format.raw/*172.10*/("""{"""),format.raw/*172.11*/("""
			"""),format.raw/*173.4*/("""alert("Debe proporcionar observación");
		"""),format.raw/*174.3*/("""}"""),format.raw/*174.4*/("""				
	"""),format.raw/*175.2*/("""}"""),format.raw/*175.3*/(""");

	
	
+function(a)"""),format.raw/*179.13*/("""{"""),format.raw/*179.14*/(""""use strict";function b(b)"""),format.raw/*179.40*/("""{"""),format.raw/*179.41*/("""return this.each(function()"""),format.raw/*179.68*/("""{"""),format.raw/*179.69*/("""var d=a(this),e=a.extend("""),format.raw/*179.94*/("""{"""),format.raw/*179.95*/("""}"""),format.raw/*179.96*/(""",c.DEFAULTS,d.data(),"object"==typeof b&&b),f=d.data("bs.validator");(f||"destroy"!=b)&&(f||d.data("bs.validator",f=new c(this,e)),"string"==typeof b&&f[b]())"""),format.raw/*179.254*/("""}"""),format.raw/*179.255*/(""")"""),format.raw/*179.256*/("""}"""),format.raw/*179.257*/("""var c=function(b,c)"""),format.raw/*179.276*/("""{"""),format.raw/*179.277*/("""this.$element=a(b),this.options=c,this.$element.attr("novalidate",!0),this.toggleSubmit(),this.$element.on("input.bs.validator change.bs.validator focusout.bs.validator",a.proxy(this.validateInput,this)),this.$element.on("submit.bs.validator",a.proxy(this.onSubmit,this)),this.$element.find("[data-match]").each(function()"""),format.raw/*179.599*/("""{"""),format.raw/*179.600*/("""var b=a(this),c=b.data("match");a(c).on("input.bs.validator",function()"""),format.raw/*179.671*/("""{"""),format.raw/*179.672*/("""b.val()&&b.trigger("input.bs.validator")"""),format.raw/*179.712*/("""}"""),format.raw/*179.713*/(""")"""),format.raw/*179.714*/("""}"""),format.raw/*179.715*/(""")"""),format.raw/*179.716*/("""}"""),format.raw/*179.717*/(""";c.DEFAULTS="""),format.raw/*179.729*/("""{"""),format.raw/*179.730*/("""delay:500,html:!1,disable:!0,errors:"""),format.raw/*179.766*/("""{"""),format.raw/*179.767*/("""match:"Does not match",minlength:"Not long enough""""),format.raw/*179.817*/("""}"""),format.raw/*179.818*/("""}"""),format.raw/*179.819*/(""",c.VALIDATORS="""),format.raw/*179.833*/("""{"""),format.raw/*179.834*/(""""native":function(a)"""),format.raw/*179.854*/("""{"""),format.raw/*179.855*/("""var b=a[0];return b.checkValidity?b.checkValidity():!0"""),format.raw/*179.909*/("""}"""),format.raw/*179.910*/(""",match:function(b)"""),format.raw/*179.928*/("""{"""),format.raw/*179.929*/("""var c=b.data("match");return!b.val()||b.val()===a(c).val()"""),format.raw/*179.987*/("""}"""),format.raw/*179.988*/(""",minlength:function(a)"""),format.raw/*179.1010*/("""{"""),format.raw/*179.1011*/("""var b=a.data("minlength");return!a.val()||a.val().length>=b"""),format.raw/*179.1070*/("""}"""),format.raw/*179.1071*/("""}"""),format.raw/*179.1072*/(""",c.prototype.validateInput=function(b)"""),format.raw/*179.1110*/("""{"""),format.raw/*179.1111*/("""var c=a(b.target),d=c.data("bs.validator.errors");if(c.is('[type="radio"]')&&(c=this.$element.find('input[name="'+c.attr("name")+'"]')),this.$element.trigger(b=a.Event("validate.bs.validator","""),format.raw/*179.1303*/("""{"""),format.raw/*179.1304*/("""relatedTarget:c[0]"""),format.raw/*179.1322*/("""}"""),format.raw/*179.1323*/(""")),!b.isDefaultPrevented())"""),format.raw/*179.1350*/("""{"""),format.raw/*179.1351*/("""var e=this;this.runValidators(c).done(function(f)"""),format.raw/*179.1400*/("""{"""),format.raw/*179.1401*/("""c.data("bs.validator.errors",f),f.length?e.showErrors(c):e.clearErrors(c),d&&f.toString()===d.toString()||(b=f.length?a.Event("invalid.bs.validator","""),format.raw/*179.1550*/("""{"""),format.raw/*179.1551*/("""relatedTarget:c[0],detail:f"""),format.raw/*179.1578*/("""}"""),format.raw/*179.1579*/("""):a.Event("valid.bs.validator","""),format.raw/*179.1610*/("""{"""),format.raw/*179.1611*/("""relatedTarget:c[0],detail:d"""),format.raw/*179.1638*/("""}"""),format.raw/*179.1639*/("""),e.$element.trigger(b)),e.toggleSubmit(),e.$element.trigger(a.Event("validated.bs.validator","""),format.raw/*179.1733*/("""{"""),format.raw/*179.1734*/("""relatedTarget:c[0]"""),format.raw/*179.1752*/("""}"""),format.raw/*179.1753*/("""))"""),format.raw/*179.1755*/("""}"""),format.raw/*179.1756*/(""")"""),format.raw/*179.1757*/("""}"""),format.raw/*179.1758*/("""}"""),format.raw/*179.1759*/(""",c.prototype.runValidators=function(b)"""),format.raw/*179.1797*/("""{"""),format.raw/*179.1798*/("""function d(a)"""),format.raw/*179.1811*/("""{"""),format.raw/*179.1812*/("""return b.data(a+"-error")||b.data("error")||"native"==a&&b[0].validationMessage||g.errors[a]"""),format.raw/*179.1904*/("""}"""),format.raw/*179.1905*/("""var e=[],f=([c.VALIDATORS.native],a.Deferred()),g=this.options;return b.data("bs.validator.deferred")&&b.data("bs.validator.deferred").reject(),b.data("bs.validator.deferred",f),a.each(c.VALIDATORS,a.proxy(function(a,c)"""),format.raw/*179.2124*/("""{"""),format.raw/*179.2125*/("""if((b.data(a)||"native"==a)&&!c.call(this,b))"""),format.raw/*179.2170*/("""{"""),format.raw/*179.2171*/("""var f=d(a);!~e.indexOf(f)&&e.push(f)"""),format.raw/*179.2207*/("""}"""),format.raw/*179.2208*/("""}"""),format.raw/*179.2209*/(""",this)),!e.length&&b.val()&&b.data("remote")?this.defer(b,function()"""),format.raw/*179.2277*/("""{"""),format.raw/*179.2278*/("""var c="""),format.raw/*179.2284*/("""{"""),format.raw/*179.2285*/("""}"""),format.raw/*179.2286*/(""";c[b.attr("name")]=b.val(),a.get(b.data("remote"),c).fail(function(a,b,c)"""),format.raw/*179.2359*/("""{"""),format.raw/*179.2360*/("""e.push(d("remote")||c)"""),format.raw/*179.2382*/("""}"""),format.raw/*179.2383*/(""").always(function()"""),format.raw/*179.2402*/("""{"""),format.raw/*179.2403*/("""f.resolve(e)"""),format.raw/*179.2415*/("""}"""),format.raw/*179.2416*/(""")"""),format.raw/*179.2417*/("""}"""),format.raw/*179.2418*/("""):f.resolve(e),f.promise()"""),format.raw/*179.2444*/("""}"""),format.raw/*179.2445*/(""",c.prototype.validate=function()"""),format.raw/*179.2477*/("""{"""),format.raw/*179.2478*/("""var a=this.options.delay;return this.options.delay=0,this.$element.find(':input:not([type="hidden"])').trigger("input.bs.validator"),this.options.delay=a,this"""),format.raw/*179.2636*/("""}"""),format.raw/*179.2637*/(""",c.prototype.showErrors=function(b)"""),format.raw/*179.2672*/("""{"""),format.raw/*179.2673*/("""var c=this.options.html?"html":"text";this.defer(b,function()"""),format.raw/*179.2734*/("""{"""),format.raw/*179.2735*/("""var d=b.closest(".form-group"),e=d.find(".help-block.with-errors"),f=d.find(".form-control-feedback"),g=b.data("bs.validator.errors");g.length&&(g=a("<ul/>").addClass("list-unstyled").append(a.map(g,function(b)"""),format.raw/*179.2945*/("""{"""),format.raw/*179.2946*/("""return a("<li/>")[c](b)"""),format.raw/*179.2969*/("""}"""),format.raw/*179.2970*/(""")),void 0===e.data("bs.validator.originalContent")&&e.data("bs.validator.originalContent",e.html()),e.empty().append(g),d.removeClass("has-success"),d.addClass("has-error"),f.removeClass("glyphicon-ok"),f.addClass("glyphicon-warning-sign"))"""),format.raw/*179.3210*/("""}"""),format.raw/*179.3211*/(""")"""),format.raw/*179.3212*/("""}"""),format.raw/*179.3213*/(""",c.prototype.clearErrors=function(a)"""),format.raw/*179.3249*/("""{"""),format.raw/*179.3250*/("""var b=a.closest(".form-group"),c=b.find(".help-block.with-errors"),d=b.find(".form-control-feedback");c.html(c.data("bs.validator.originalContent")),b.removeClass("has-error"),b.addClass("has-success"),d.removeClass("glyphicon-warning-sign"),d.addClass("glyphicon-ok")"""),format.raw/*179.3518*/("""}"""),format.raw/*179.3519*/(""",c.prototype.hasErrors=function()"""),format.raw/*179.3552*/("""{"""),format.raw/*179.3553*/("""function b()"""),format.raw/*179.3565*/("""{"""),format.raw/*179.3566*/("""return!!(a(this).data("bs.validator.errors")||[]).length"""),format.raw/*179.3622*/("""}"""),format.raw/*179.3623*/("""return!!this.$element.find(":input:enabled").filter(b).length"""),format.raw/*179.3684*/("""}"""),format.raw/*179.3685*/(""",c.prototype.isIncomplete=function()"""),format.raw/*179.3721*/("""{"""),format.raw/*179.3722*/("""function b()"""),format.raw/*179.3734*/("""{"""),format.raw/*179.3735*/("""return"checkbox"===this.type?!this.checked:"radio"===this.type?!a('[name="'+this.name+'"]:checked').length:""===a.trim(this.value)"""),format.raw/*179.3865*/("""}"""),format.raw/*179.3866*/("""return!!this.$element.find(":input[required]:enabled").filter(b).length"""),format.raw/*179.3937*/("""}"""),format.raw/*179.3938*/(""",c.prototype.onSubmit=function(a)"""),format.raw/*179.3971*/("""{"""),format.raw/*179.3972*/("""this.validate(),(this.isIncomplete()||this.hasErrors())&&a.preventDefault()"""),format.raw/*179.4047*/("""}"""),format.raw/*179.4048*/(""",c.prototype.toggleSubmit=function()"""),format.raw/*179.4084*/("""{"""),format.raw/*179.4085*/("""if(this.options.disable)"""),format.raw/*179.4109*/("""{"""),format.raw/*179.4110*/("""var a=this.$element.find('input[type="submit"], button[type="submit"]');a.toggleClass("disabled",this.isIncomplete()||this.hasErrors()).css("""),format.raw/*179.4250*/("""{"""),format.raw/*179.4251*/(""""pointer-events":"all",cursor:"pointer""""),format.raw/*179.4290*/("""}"""),format.raw/*179.4291*/(""")"""),format.raw/*179.4292*/("""}"""),format.raw/*179.4293*/("""}"""),format.raw/*179.4294*/(""",c.prototype.defer=function(a,b)"""),format.raw/*179.4326*/("""{"""),format.raw/*179.4327*/("""return this.options.delay?(window.clearTimeout(a.data("bs.validator.timeout")),void a.data("bs.validator.timeout",window.setTimeout(b,this.options.delay))):b()"""),format.raw/*179.4486*/("""}"""),format.raw/*179.4487*/(""",c.prototype.destroy=function()"""),format.raw/*179.4518*/("""{"""),format.raw/*179.4519*/("""return this.$element.removeAttr("novalidate").removeData("bs.validator").off(".bs.validator"),this.$element.find(":input").off(".bs.validator").removeData(["bs.validator.errors","bs.validator.deferred"]).each(function()"""),format.raw/*179.4738*/("""{"""),format.raw/*179.4739*/("""var b=a(this),c=b.data("bs.validator.timeout");window.clearTimeout(c)&&b.removeData("bs.validator.timeout")"""),format.raw/*179.4846*/("""}"""),format.raw/*179.4847*/("""),this.$element.find(".help-block.with-errors").each(function()"""),format.raw/*179.4910*/("""{"""),format.raw/*179.4911*/("""var b=a(this),c=b.data("bs.validator.originalContent");b.removeData("bs.validator.originalContent").html(c)"""),format.raw/*179.5018*/("""}"""),format.raw/*179.5019*/("""),this.$element.find('input[type="submit"], button[type="submit"]').removeClass("disabled"),this.$element.find(".has-error").removeClass("has-error"),this"""),format.raw/*179.5173*/("""}"""),format.raw/*179.5174*/(""";var d=a.fn.validator;a.fn.validator=b,a.fn.validator.Constructor=c,a.fn.validator.noConflict=function()"""),format.raw/*179.5278*/("""{"""),format.raw/*179.5279*/("""return a.fn.validator=d,this"""),format.raw/*179.5307*/("""}"""),format.raw/*179.5308*/(""",a(window).on("load",function()"""),format.raw/*179.5339*/("""{"""),format.raw/*179.5340*/("""a('form[data-toggle="validator"]').each(function()"""),format.raw/*179.5390*/("""{"""),format.raw/*179.5391*/("""var c=a(this);b.call(c,c.data())"""),format.raw/*179.5423*/("""}"""),format.raw/*179.5424*/(""")"""),format.raw/*179.5425*/("""}"""),format.raw/*179.5426*/(""")"""),format.raw/*179.5427*/("""}"""),format.raw/*179.5428*/("""(jQuery);
</script>



<script src=""""),_display_(/*184.15*/routes/*184.21*/.Assets.at("javascripts/clasificacion.js")),format.raw/*184.63*/(""""></script>

"""))}
  }

  def render(forma:Form[Clasificacion],id:Long,clas2:List[ClasificadorCriterio2],clas3:List[ClasificadorCriterio3],cancelable:List[ClasificadorCancelable],noevaluable:List[ClasificadorNoevaluable],tiposrecursos:List[ClasificadorTiporecurso]): play.twirl.api.HtmlFormat.Appendable = apply(forma,id,clas2,clas3,cancelable,noevaluable,tiposrecursos)

  def f:((Form[Clasificacion],Long,List[ClasificadorCriterio2],List[ClasificadorCriterio3],List[ClasificadorCancelable],List[ClasificadorNoevaluable],List[ClasificadorTiporecurso]) => play.twirl.api.HtmlFormat.Appendable) = (forma,id,clas2,clas3,cancelable,noevaluable,tiposrecursos) => apply(forma,id,clas2,clas3,cancelable,noevaluable,tiposrecursos)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:37 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Clasificacion/create.scala.html
                  HASH: f1165194177e804082f6b44a10433e3e4f259ce4
                  MATRIX: 901->1|1252->276|1284->300|1365->257|1393->351|1421->353|1433->357|1471->358|1500->360|1974->808|2050->875|2090->877|2127->888|2231->971|2279->989|2310->993|2366->1019|2396->1022|2469->1067|2498->1068|2527->1070|2809->1325|2837->1326|2935->1396|2964->1397|2993->1399|3297->1677|3326->1690|3365->1691|3395->1694|3429->1701|3439->1702|3473->1715|3522->1736|3551->1737|3582->1741|3652->1784|3662->1785|3686->1788|3716->1791|3726->1792|3759->1804|3801->1819|3829->1820|3862->1823|3892->1826|4006->1912|4035->1913|4065->1916|4186->2010|4214->2011|4242->2012|4274->2017|4303->2018|4333->2021|4390->2051|4418->2052|4446->2053|4474->2054|4579->2131|4608->2132|4637->2134|4736->2205|4765->2206|4795->2209|4947->2335|4976->2348|5015->2349|5046->2353|5090->2370|5100->2371|5124->2374|5153->2375|5185->2380|5195->2381|5229->2394|5261->2399|5271->2400|5305->2413|5339->2420|5349->2421|5382->2433|5413->2437|5423->2438|5466->2459|5506->2472|5516->2473|5550->2486|5648->2557|5658->2558|5693->2571|5726->2575|5756->2576|5788->2581|5858->2625|5873->2631|5992->2728|6025->2734|6101->2783|6111->2784|6135->2787|6165->2790|6175->2791|6217->2812|6260->2828|6288->2829|6322->2833|6351->2835|6379->2836|6409->2839|6732->3134|6761->3135|6791->3138|6927->3246|6956->3247|6987->3251|7045->3281|7074->3282|7107->3287|7181->3333|7210->3334|7242->3338|7301->3368|7331->3369|7364->3374|7438->3420|7467->3421|7501->3427|7530->3428|7562->3432|7591->3433|7621->3435|7757->3541|7788->3542|7819->3545|8073->3770|8103->3771|8135->3775|8331->3943|8360->3944|8629->4184|8659->4185|8694->4192|8958->4427|8988->4428|9023->4435|9105->4489|9134->4490|9166->4494|9195->4495|9256->4527|9286->4528|9320->4534|9569->4754|9599->4755|9641->4769|9712->4811|9742->4812|9785->4826|9868->4881|9898->4882|9999->4955|10028->4956|10180->5080|10209->5081|10270->5113|10300->5114|10334->5120|10390->5148|10419->5149|10454->5156|10483->5157|10512->5158|10574->5192|10603->5193|10677->5238|10707->5239|10738->5242|10860->5336|10889->5337|10972->5391|11002->5392|11033->5395|11108->5441|11138->5442|11170->5446|11206->5453|11236->5454|11271->5461|11338->5500|11362->5502|11457->5568|11487->5569|11519->5573|11543->5575|11622->5625|11652->5626|11685->5631|11714->5632|11779->5668|11809->5669|11844->5676|11920->5723|11950->5724|11986->5732|12034->5752|12050->5758|12103->5789|12140->5798|12169->5799|12204->5805|12234->5806|12299->5842|12329->5843|12364->5850|12421->5879|12450->5880|12485->5887|12514->5888|12543->5889|12577->5894|12607->5895|12639->5899|12709->5941|12738->5942|12772->5948|12801->5949|12850->5969|12880->5970|12935->5996|12965->5997|13021->6024|13051->6025|13105->6050|13135->6051|13165->6052|13353->6210|13384->6211|13415->6212|13446->6213|13495->6232|13526->6233|13878->6555|13909->6556|14010->6627|14041->6628|14111->6668|14142->6669|14173->6670|14204->6671|14235->6672|14266->6673|14308->6685|14339->6686|14405->6722|14436->6723|14516->6773|14547->6774|14578->6775|14622->6789|14653->6790|14703->6810|14734->6811|14818->6865|14849->6866|14897->6884|14928->6885|15016->6943|15047->6944|15100->6966|15132->6967|15222->7026|15254->7027|15286->7028|15355->7066|15387->7067|15610->7259|15642->7260|15691->7278|15723->7279|15781->7306|15813->7307|15893->7356|15925->7357|16105->7506|16137->7507|16195->7534|16227->7535|16289->7566|16321->7567|16379->7594|16411->7595|16536->7689|16568->7690|16617->7708|16649->7709|16682->7711|16714->7712|16746->7713|16778->7714|16810->7715|16879->7753|16911->7754|16955->7767|16987->7768|17110->7860|17142->7861|17392->8080|17424->8081|17500->8126|17532->8127|17599->8163|17631->8164|17663->8165|17762->8233|17794->8234|17831->8240|17863->8241|17895->8242|17999->8315|18031->8316|18084->8338|18116->8339|18166->8358|18198->8359|18241->8371|18273->8372|18305->8373|18337->8374|18394->8400|18426->8401|18489->8433|18521->8434|18710->8592|18742->8593|18808->8628|18840->8629|18932->8690|18964->8691|19205->8901|19237->8902|19291->8925|19323->8926|19594->9166|19626->9167|19658->9168|19690->9169|19757->9205|19789->9206|20088->9474|20120->9475|20184->9508|20216->9509|20259->9521|20291->9522|20378->9578|20410->9579|20502->9640|20534->9641|20601->9677|20633->9678|20676->9690|20708->9691|20869->9821|20901->9822|21003->9893|21035->9894|21099->9927|21131->9928|21237->10003|21269->10004|21336->10040|21368->10041|21423->10065|21455->10066|21626->10206|21658->10207|21728->10246|21760->10247|21792->10248|21824->10249|21856->10250|21919->10282|21951->10283|22141->10442|22173->10443|22235->10474|22267->10475|22517->10694|22549->10695|22687->10802|22719->10803|22813->10866|22845->10867|22983->10974|23015->10975|23200->11129|23232->11130|23367->11234|23399->11235|23458->11263|23490->11264|23552->11295|23584->11296|23665->11346|23697->11347|23760->11379|23792->11380|23824->11381|23856->11382|23888->11383|23920->11384|23985->11421|24001->11427|24065->11469
                  LINES: 26->1|34->9|34->9|35->7|36->9|37->10|37->10|37->10|38->11|55->28|55->28|55->28|56->29|56->29|57->30|58->31|61->34|64->37|65->38|65->38|66->39|71->44|71->44|75->48|75->48|76->49|81->54|81->54|81->54|82->55|82->55|82->55|82->55|82->55|82->55|83->56|83->56|83->56|83->56|83->56|83->56|83->56|84->57|84->57|85->58|87->60|89->62|89->62|90->63|92->65|92->65|92->65|92->65|92->65|93->66|94->67|94->67|95->68|95->68|98->71|98->71|99->72|100->73|100->73|101->74|103->76|103->76|103->76|104->77|104->77|104->77|104->77|104->77|104->77|104->77|104->77|104->77|104->77|104->77|104->77|104->77|104->77|104->77|104->77|104->77|105->78|105->78|105->78|105->78|105->78|105->78|105->78|105->78|106->79|108->81|108->81|108->81|109->82|110->83|110->83|110->83|110->83|110->83|110->83|111->84|111->84|112->85|113->86|113->86|115->88|123->96|123->96|124->97|125->98|125->98|126->99|126->99|126->99|127->100|128->101|128->101|129->102|129->102|129->102|130->103|131->104|131->104|132->105|132->105|133->106|133->106|134->107|134->107|134->107|135->108|138->111|138->111|139->112|143->116|143->116|147->120|147->120|148->121|152->125|152->125|153->126|154->127|154->127|155->128|155->128|156->129|156->129|157->130|161->134|161->134|162->135|162->135|162->135|163->136|165->138|165->138|167->140|167->140|170->143|170->143|171->144|171->144|172->145|173->146|173->146|174->147|174->147|174->147|177->150|177->150|180->153|180->153|181->154|183->156|183->156|185->158|185->158|186->159|186->159|186->159|187->160|187->160|187->160|188->161|189->162|189->162|190->163|190->163|190->163|190->163|190->163|190->163|191->164|191->164|192->165|192->165|193->166|193->166|193->166|194->167|194->167|194->167|194->167|195->168|195->168|195->168|195->168|196->169|196->169|197->170|198->171|198->171|199->172|199->172|199->172|199->172|199->172|200->173|201->174|201->174|202->175|202->175|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|206->179|211->184|211->184|211->184
                  -- GENERATED --
              */
          