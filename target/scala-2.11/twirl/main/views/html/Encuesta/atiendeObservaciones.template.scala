
package views.html.Encuesta

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
object atiendeObservaciones extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[List[EncuestaReactivo],List[Unidadacademica],List[Niveleducativo],Form[EncuestaRespuesta],EncuestaRespuesta,List[EncuestaObservacion],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(reactivos:List[EncuestaReactivo], unidadacademica:List[Unidadacademica], nivel:List[Niveleducativo], forma:Form[EncuestaRespuesta], respuestas:EncuestaRespuesta, observaciones:List[EncuestaObservacion]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.205*/("""
"""),format.raw/*3.83*/(""" 

"""),format.raw/*5.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.46*/routes/*5.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*5.89*/(""""/> 
 
"""),_display_(/*7.2*/main/*7.6*/{_display_(Seq[Any](format.raw/*7.7*/("""
	"""),format.raw/*8.2*/("""<div class=container-fluid style="background-color: white; padding: 10px; display: none;">
		<div class="row">
			<div class="col-md-12">
				<h3>Encuesta de satisfacción del servicio de Evaluación TP-RDD</h3>
				<p>
					Estimado docente, queremos conocer su opinión acerca del servicio de Evaluación Técnico Pedagógica, por tanto solicitamos su valioso apoyo para llenar esta encuesta. A través de este medio obtendremos información que nos permitirá mejorar el servicio que ofrecemos
					<br>
				    Los datos que nos proporcione son anónimos y confidenciales.
					<br><br>
					<p style="font-weight: bold;">Instrucciones generales:</p><br>
					Lea cuidadosamente cada uno de los enunciados y responda lo que se le pide y/o marque la respuesta que mejor describa su opinión.
					<p>Las preguntas marcadas con asterisco (*) son obligatorias.</p> 				
				</p> 
				"""),_display_(/*21.6*/form(CSRF(routes.EncuestaWebController.update()), 'role -> "form", 'style->"background-color: white;", 'id->"frmCreate")/*21.126*/ {_display_(Seq[Any](format.raw/*21.128*/("""
					"""),_display_(/*22.7*/encuestaForm(reactivos, unidadacademica, nivel, forma, respuestas)),format.raw/*22.73*/("""
					"""),format.raw/*23.6*/("""<div style="display: block;  margin-left: auto;   margin-right: auto; width: 90%">
						<input type="submit" class="btn btn-success btn-lg btn-block" id="btnForma"  value="Enviar correciones">
					</div>				
				""")))}),format.raw/*26.6*/("""
			"""),format.raw/*27.4*/("""</div>
		</div>
	
	

	</div>


""")))}),format.raw/*35.2*/("""



"""),format.raw/*39.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*40.15*/("""{"""),format.raw/*40.16*/("""
		"""),format.raw/*41.3*/("""$("#frmCreate").validator();
		$("[name*='btnObservacion_']").hide();
		$(".container-fluid").show();
		$("input[type='text']:required, textarea:required, input[type='date']:required").attr("data-error", "Complete este campo");
		$("select:required").attr("data-error", "Seleccione una opción de la lista");
		$("input[type='radio']:required").attr("data-error", "Seleccione una opción");
		
		$("label[for='respuesta1'], label[for='respuesta2'], label[for='respuesta3'],  label[for='respuesta4']").html("");
		leer();
		
	"""),format.raw/*51.2*/("""}"""),format.raw/*51.3*/(""");
	
	$("#respuesta1_6").on( "click", function() """),format.raw/*53.45*/("""{"""),format.raw/*53.46*/("""
		"""),format.raw/*54.3*/("""if ($(this).prop("checked"))"""),format.raw/*54.31*/("""{"""),format.raw/*54.32*/("""
			"""),format.raw/*55.4*/("""$("#respuesta1Txt").parent().parent().parent().show();
		"""),format.raw/*56.3*/("""}"""),format.raw/*56.4*/("""	"""),format.raw/*56.5*/("""else """),format.raw/*56.10*/("""{"""),format.raw/*56.11*/("""
			"""),format.raw/*57.4*/("""$("#respuesta1Txt").parent().parent().parent().hide();
			$("#respuesta1Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*59.3*/("""}"""),format.raw/*59.4*/("""
	"""),format.raw/*60.2*/("""}"""),format.raw/*60.3*/(""");
	
	$("input[name='respuesta2']").on( "click", function() """),format.raw/*62.56*/("""{"""),format.raw/*62.57*/("""
		"""),format.raw/*63.3*/("""if ($(this).val()=="S")"""),format.raw/*63.26*/("""{"""),format.raw/*63.27*/("""
			"""),format.raw/*64.4*/("""$("#respuesta2Txt").parent().parent().parent().show();
		"""),format.raw/*65.3*/("""}"""),format.raw/*65.4*/("""	"""),format.raw/*65.5*/("""else """),format.raw/*65.10*/("""{"""),format.raw/*65.11*/("""
			"""),format.raw/*66.4*/("""$("#respuesta2Txt").parent().parent().parent().hide();
			$("#respuesta2Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*68.3*/("""}"""),format.raw/*68.4*/("""
	"""),format.raw/*69.2*/("""}"""),format.raw/*69.3*/(""");
	
	$("input[name='respuesta3']").on( "click", function() """),format.raw/*71.56*/("""{"""),format.raw/*71.57*/("""
		"""),format.raw/*72.3*/("""if ($(this).val()=="N")"""),format.raw/*72.26*/("""{"""),format.raw/*72.27*/("""
			"""),format.raw/*73.4*/("""$("#respuesta3Txt").parent().parent().parent().show();
		"""),format.raw/*74.3*/("""}"""),format.raw/*74.4*/("""	"""),format.raw/*74.5*/("""else """),format.raw/*74.10*/("""{"""),format.raw/*74.11*/("""
			"""),format.raw/*75.4*/("""$("#respuesta3Txt").parent().parent().parent().hide();
			$("#respuesta3Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*77.3*/("""}"""),format.raw/*77.4*/("""
	"""),format.raw/*78.2*/("""}"""),format.raw/*78.3*/(""");

	$("#frmCreate").submit(function(event)"""),format.raw/*80.40*/("""{"""),format.raw/*80.41*/("""
		"""),format.raw/*81.3*/("""$("[name='respuesta1[]']").change();
		$("[name='respuesta2']").change();
		$("[name='respuesta3']").change();
		$("[name='respuesta4']").change();
		
		if ($("[name='respuesta1[]'][value=6]:checked").length!=0 && $("#respuesta1Txt").val().length == 0)"""),format.raw/*86.102*/("""{"""),format.raw/*86.103*/("""
			"""),format.raw/*87.4*/("""$("#respuesta1Txt").parent().parent().addClass("has-error");
		"""),format.raw/*88.3*/("""}"""),format.raw/*88.4*/(""" """),format.raw/*88.5*/("""else """),format.raw/*88.10*/("""{"""),format.raw/*88.11*/("""
			"""),format.raw/*89.4*/("""$("#respuesta1Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*90.3*/("""}"""),format.raw/*90.4*/("""		

		"""),format.raw/*92.3*/("""if ($("input:radio[name='respuesta2']:checked").val() == 'S' && $("#respuesta2Txt").val().length == 0)"""),format.raw/*92.105*/("""{"""),format.raw/*92.106*/("""
			"""),format.raw/*93.4*/("""$("#respuesta2Txt").parent().parent().addClass("has-error");
		"""),format.raw/*94.3*/("""}"""),format.raw/*94.4*/(""" """),format.raw/*94.5*/("""else """),format.raw/*94.10*/("""{"""),format.raw/*94.11*/("""
			"""),format.raw/*95.4*/("""$("#respuesta2Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*96.3*/("""}"""),format.raw/*96.4*/("""

		"""),format.raw/*98.3*/("""if ($("input:radio[name='respuesta3']:checked").val() == 'N' && $("#respuesta3Txt").val().length == 0)"""),format.raw/*98.105*/("""{"""),format.raw/*98.106*/("""
			"""),format.raw/*99.4*/("""$("#respuesta3Txt").parent().parent().addClass("has-error");
		"""),format.raw/*100.3*/("""}"""),format.raw/*100.4*/(""" """),format.raw/*100.5*/("""else """),format.raw/*100.10*/("""{"""),format.raw/*100.11*/("""
			"""),format.raw/*101.4*/("""$("#respuesta3Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*102.3*/("""}"""),format.raw/*102.4*/("""

		"""),format.raw/*104.3*/("""if ($("#respuesta4Txt").val().length == 0)"""),format.raw/*104.45*/("""{"""),format.raw/*104.46*/("""
			"""),format.raw/*105.4*/("""$("#respuesta4Txt").parent().parent().addClass("has-error");
		"""),format.raw/*106.3*/("""}"""),format.raw/*106.4*/(""" """),format.raw/*106.5*/("""else """),format.raw/*106.10*/("""{"""),format.raw/*106.11*/("""
			"""),format.raw/*107.4*/("""$("#respuesta4Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*108.3*/("""}"""),format.raw/*108.4*/("""		
		
		"""),format.raw/*110.3*/("""var r1 = [];
		$.each($("input:checkbox:checked"), function()"""),format.raw/*111.49*/("""{"""),format.raw/*111.50*/(""" 
			"""),format.raw/*112.4*/("""r1.push($(this).val());
		"""),format.raw/*113.3*/("""}"""),format.raw/*113.4*/(""");

		if ( r1.length == 0 )"""),format.raw/*115.24*/("""{"""),format.raw/*115.25*/("""			
			"""),format.raw/*116.4*/("""$("#divMsgResp1").html('<ul class="list-unstyled"><li>Seleccione al menos una de las opciones.</li></ul>');
			alert("Corrija los campos marcados con rojo");			
			event.preventDefault();	
		"""),format.raw/*119.3*/("""}"""),format.raw/*119.4*/("""
		"""),format.raw/*120.3*/("""if ( $(".has-error").length != 0 )"""),format.raw/*120.37*/("""{"""),format.raw/*120.38*/("""
			"""),format.raw/*121.4*/("""alert("Corrija los campos marcados con rojo");
			event.preventDefault();	
		"""),format.raw/*123.3*/("""}"""),format.raw/*123.4*/(""" 

	"""),format.raw/*125.2*/("""}"""),format.raw/*125.3*/(""");

	$('#form').validator().on('submit', function (e) """),format.raw/*127.51*/("""{"""),format.raw/*127.52*/("""
		  """),format.raw/*128.5*/("""if (e.isDefaultPrevented()) """),format.raw/*128.33*/("""{"""),format.raw/*128.34*/("""
		    """),format.raw/*129.7*/("""// handle the invalid form...
		  """),format.raw/*130.5*/("""}"""),format.raw/*130.6*/(""" """),format.raw/*130.7*/("""else """),format.raw/*130.12*/("""{"""),format.raw/*130.13*/("""
		    """),format.raw/*131.7*/("""// everything looks good!
		  """),format.raw/*132.5*/("""}"""),format.raw/*132.6*/("""
		"""),format.raw/*133.3*/("""}"""),format.raw/*133.4*/(""")


	

	$(document).on("keydown change blur", "textarea", function(event)"""),format.raw/*138.67*/("""{"""),format.raw/*138.68*/("""
		"""),format.raw/*139.3*/("""var actual = 	$(this);
		var tam = actual.val().length;
		if (tam >= 600)"""),format.raw/*141.18*/("""{"""),format.raw/*141.19*/("""
			"""),format.raw/*142.4*/("""console.log("tam excedido");
			if ( (event.which != 8  && event.which != 46  ))
				event.preventDefault();
			actual.css("border-color","#FF0000");			
			actual.parent().find("div[name='divErrorTextArea']").html("Este campo ha excedido los 600 caracteres").show();
			actual.parent().find("div[name='divErrorTextArea']").addClass("error");
			
		"""),format.raw/*149.3*/("""}"""),format.raw/*149.4*/(""" """),format.raw/*149.5*/("""else """),format.raw/*149.10*/("""{"""),format.raw/*149.11*/("""
			"""),format.raw/*150.4*/("""actual.css("border-color","");			
			actual.parent().find("div[name='divErrorTextArea']").hide();	
			actual.parent().find("div[name='divErrorTextArea']").removeClass("error");
		"""),format.raw/*153.3*/("""}"""),format.raw/*153.4*/("""
	"""),format.raw/*154.2*/("""}"""),format.raw/*154.3*/(""");	 


	$("[name='respuesta1[]']").change(function()"""),format.raw/*157.46*/("""{"""),format.raw/*157.47*/("""
		"""),format.raw/*158.3*/("""if ($("[name='respuesta1[]']:checked").length == 0  )"""),format.raw/*158.56*/("""{"""),format.raw/*158.57*/("""
			"""),format.raw/*159.4*/("""$("#respuesta1").parent().parent().parent().parent().find(".help-block").html("Seleccione al menos un motivo");
			$("#respuesta1").parent().parent().parent().parent().find(".help-block").show();
			$("#respuesta1").parent().parent().parent().parent().find(".help-block").addClass("error");
		"""),format.raw/*162.3*/("""}"""),format.raw/*162.4*/("""else"""),format.raw/*162.8*/("""{"""),format.raw/*162.9*/("""
			"""),format.raw/*163.4*/("""$("#respuesta1").parent().parent().parent().parent().find(".help-block").html("");
			$("#respuesta1").parent().parent().parent().parent().find(".help-block").hide();
			$("#respuesta1").parent().parent().parent().parent().find(".help-block").removeClass("error");			
		"""),format.raw/*166.3*/("""}"""),format.raw/*166.4*/("""		
	"""),format.raw/*167.2*/("""}"""),format.raw/*167.3*/(""");

	$("[name='respuesta2']").change(function()"""),format.raw/*169.44*/("""{"""),format.raw/*169.45*/("""
		"""),format.raw/*170.3*/("""if ($("[name='respuesta2']:checked").val() == undefined  )"""),format.raw/*170.61*/("""{"""),format.raw/*170.62*/("""
			"""),format.raw/*171.4*/("""$("#respuesta2").parent().parent().parent().find(".help-block").html("Responda Si o No");
			$("#respuesta2").parent().parent().parent().find(".help-block").show();
			$("#respuesta2").parent().parent().parent().find(".help-block").addClass("error");
		"""),format.raw/*174.3*/("""}"""),format.raw/*174.4*/("""else"""),format.raw/*174.8*/("""{"""),format.raw/*174.9*/("""
			"""),format.raw/*175.4*/("""$("#respuesta2").parent().parent().parent().find(".help-block").html("");
			$("#respuesta2").parent().parent().parent().find(".help-block").hide();
			$("#respuesta2").parent().parent().parent().find(".help-block").removeClass("error");			
		"""),format.raw/*178.3*/("""}"""),format.raw/*178.4*/("""		
	"""),format.raw/*179.2*/("""}"""),format.raw/*179.3*/(""");

	$("[name='respuesta3']").change(function()"""),format.raw/*181.44*/("""{"""),format.raw/*181.45*/("""
		"""),format.raw/*182.3*/("""if ($("[name='respuesta3']:checked").val() == undefined  )"""),format.raw/*182.61*/("""{"""),format.raw/*182.62*/("""
			"""),format.raw/*183.4*/("""$("#respuesta3").parent().parent().parent().find(".help-block").html("Responda Si o No");
			$("#respuesta3").parent().parent().parent().find(".help-block").show();
			$("#respuesta3").parent().parent().parent().find(".help-block").addClass("error");
		"""),format.raw/*186.3*/("""}"""),format.raw/*186.4*/("""else"""),format.raw/*186.8*/("""{"""),format.raw/*186.9*/("""
			"""),format.raw/*187.4*/("""$("#respuesta3").parent().parent().parent().find(".help-block").html("");
			$("#respuesta3").parent().parent().parent().find(".help-block").hide();
			$("#respuesta3").parent().parent().parent().find(".help-block").removeClass("error");			
		"""),format.raw/*190.3*/("""}"""),format.raw/*190.4*/("""		
	"""),format.raw/*191.2*/("""}"""),format.raw/*191.3*/(""");

	$("[name='respuesta4']").change(function()"""),format.raw/*193.44*/("""{"""),format.raw/*193.45*/("""
		"""),format.raw/*194.3*/("""if ($("[name='respuesta4']:checked").val() == undefined  )"""),format.raw/*194.61*/("""{"""),format.raw/*194.62*/("""
			"""),format.raw/*195.4*/("""$("#respuesta4").parent().parent().parent().find(".help-block").html("Califique con valores del 1 al 5");
			$("#respuesta4").parent().parent().parent().find(".help-block").show();
			$("#respuesta4").parent().parent().parent().find(".help-block").addClass("error");
		"""),format.raw/*198.3*/("""}"""),format.raw/*198.4*/("""else"""),format.raw/*198.8*/("""{"""),format.raw/*198.9*/("""
			"""),format.raw/*199.4*/("""$("#respuesta4").parent().parent().parent().find(".help-block").html("");
			$("#respuesta4").parent().parent().parent().find(".help-block").hide();
			$("#respuesta4").parent().parent().parent().find(".help-block").removeClass("error");			
		"""),format.raw/*202.3*/("""}"""),format.raw/*202.4*/("""		
	"""),format.raw/*203.2*/("""}"""),format.raw/*203.3*/(""");
	


	function leer()"""),format.raw/*207.17*/("""{"""),format.raw/*207.18*/("""		
		"""),format.raw/*208.3*/("""var l = """"),_display_(/*208.13*/respuestas/*208.23*/.respuesta1),format.raw/*208.34*/("""".substring(1, """),_display_(/*208.50*/(respuestas.respuesta1.length()-1)),format.raw/*208.84*/("""  """),format.raw/*208.86*/(""").split(",");		
		for(i=0;i<l.length;i++)"""),format.raw/*209.26*/("""{"""),format.raw/*209.27*/("""
			"""),format.raw/*210.4*/("""$("[name='respuesta1[]'][value="+l[i]+"]").attr("checked",true)
		"""),format.raw/*211.3*/("""}"""),format.raw/*211.4*/("""
		
		"""),format.raw/*213.3*/("""if ( $("#respuesta1_6").prop("checked")  )"""),format.raw/*213.45*/("""{"""),format.raw/*213.46*/("""
			"""),format.raw/*214.4*/("""$("[id='respuesta1Txt']").val(""""),_display_(/*214.36*/respuestas/*214.46*/.respuesta1txt),format.raw/*214.60*/("""");
			$("[id='respuesta1Txt']").parent().parent().parent().show();
		"""),format.raw/*216.3*/("""}"""),format.raw/*216.4*/("""
		
		
		"""),format.raw/*219.3*/("""$("[id='respuesta2_S']").prop("checked",  """"),_display_(/*219.47*/respuestas/*219.57*/.respuesta2),format.raw/*219.68*/("""" == "S"  );
		$("[id='respuesta2_N']").prop("checked",  """"),_display_(/*220.47*/respuestas/*220.57*/.respuesta2),format.raw/*220.68*/("""" == "N"  );
		
		if($("[id='respuesta2_S']").prop("checked"))"""),format.raw/*222.47*/("""{"""),format.raw/*222.48*/("""
			"""),format.raw/*223.4*/("""$("[id='respuesta2Txt']").val(""""),_display_(/*223.36*/respuestas/*223.46*/.respuesta2txt),format.raw/*223.60*/("""");
			$("[id='respuesta2Txt']").parent().parent().parent().show();			
		"""),format.raw/*225.3*/("""}"""),format.raw/*225.4*/("""
		
		
		"""),format.raw/*228.3*/("""$("[id='respuesta3_S']").prop("checked",  """"),_display_(/*228.47*/respuestas/*228.57*/.respuesta3),format.raw/*228.68*/("""" == "S"  );
		$("[id='respuesta3_N']").prop("checked",  """"),_display_(/*229.47*/respuestas/*229.57*/.respuesta3),format.raw/*229.68*/("""" == "N"  );

		if($("[id='respuesta3_N']").prop("checked"))"""),format.raw/*231.47*/("""{"""),format.raw/*231.48*/("""
			"""),format.raw/*232.4*/("""$("[id='respuesta3Txt']").val(""""),_display_(/*232.36*/respuestas/*232.46*/.respuesta3txt),format.raw/*232.60*/("""");
			$("[id='respuesta3Txt']").parent().parent().parent().show();			
		"""),format.raw/*234.3*/("""}"""),format.raw/*234.4*/("""		
		
		"""),format.raw/*236.3*/("""$("[id='respuesta4_1']").prop("checked",  """"),_display_(/*236.47*/respuestas/*236.57*/.respuesta4),format.raw/*236.68*/("""" == "1"  );
		$("[id='respuesta4_2']").prop("checked",  """"),_display_(/*237.47*/respuestas/*237.57*/.respuesta4),format.raw/*237.68*/("""" == "2"  );
		$("[id='respuesta4_3']").prop("checked",  """"),_display_(/*238.47*/respuestas/*238.57*/.respuesta4),format.raw/*238.68*/("""" == "3"  );
		$("[id='respuesta4_4']").prop("checked",  """"),_display_(/*239.47*/respuestas/*239.57*/.respuesta4),format.raw/*239.68*/("""" == "4"  );
		$("[id='respuesta4_5']").prop("checked",  """"),_display_(/*240.47*/respuestas/*240.57*/.respuesta4),format.raw/*240.68*/("""" == "5"  );


			$("[id='respuesta4Txt']").val(""""),_display_(/*243.36*/respuestas/*243.46*/.respuesta4txt),format.raw/*243.60*/("""");
						
			$("[id='respuesta5Txt']").val(""""),_display_(/*245.36*/respuestas/*245.46*/.respuesta5txt),format.raw/*245.60*/("""");
			
			
		/// Deshabilita los controles de las preguntas
		for(a=1;a<=5;a++)"""),format.raw/*249.20*/("""{"""),format.raw/*249.21*/("""
			"""),format.raw/*250.4*/("""$("[name='respuesta"+a+"'], [name='respuesta"+a+"txt']").prop("disabled", true);			
		"""),format.raw/*251.3*/("""}"""),format.raw/*251.4*/("""	
		"""),format.raw/*252.3*/("""$("[name='respuesta1[]']").prop("disabled", true);	
		/// LEER OBSERVACIONES
		"""),_display_(/*254.4*/for(observa<-observaciones) yield /*254.31*/{_display_(Seq[Any](format.raw/*254.32*/("""
"""),format.raw/*255.1*/("""alert(""""),_display_(/*255.9*/observa/*255.16*/.respuesta),format.raw/*255.26*/(""""+"   "+""""),_display_(/*255.36*/observa/*255.43*/.descripcion),format.raw/*255.55*/("""");			
			$("[name='observacion_"""),_display_(/*256.27*/observa/*256.34*/.respuesta),format.raw/*256.44*/("""']").val("El administrador hizo la siguiente observación: """),_display_(/*256.103*/observa/*256.110*/.descripcion),format.raw/*256.122*/("""");
			$("[name='observacion_"""),_display_(/*257.27*/observa/*257.34*/.respuesta),format.raw/*257.44*/("""']").css("""),format.raw/*257.53*/("""{"""),format.raw/*257.54*/(""""background-color":"#FFFDDD",
					"-webkit-box-sizing": "border-box",
					"-moz-box-sizing": "border-box", 
					"box-sizing": "border-box",	
					"width": "100%"			
			"""),format.raw/*262.4*/("""}"""),format.raw/*262.5*/(""");
			$("[name='observacion_"""),_display_(/*263.27*/observa/*263.34*/.respuesta),format.raw/*263.44*/("""']").show();
			$("[name='observacion_"""),_display_(/*264.27*/observa/*264.34*/.respuesta),format.raw/*264.44*/("""']").parent().parent().parent().parent().show();
			
			$("[name='"""),_display_(/*266.15*/observa/*266.22*/.respuesta),format.raw/*266.32*/("""']").prop("disabled", false);
			
			
			
		""")))}),format.raw/*270.4*/("""
		
		
		
	"""),format.raw/*274.2*/("""}"""),format.raw/*274.3*/("""

	
"""),format.raw/*277.1*/("""</script>
<script src=""""),_display_(/*278.15*/routes/*278.21*/.Assets.at("javascripts/validator.min.js")),format.raw/*278.63*/("""" type="text/javascript"></script>"""))}
  }

  def render(reactivos:List[EncuestaReactivo],unidadacademica:List[Unidadacademica],nivel:List[Niveleducativo],forma:Form[EncuestaRespuesta],respuestas:EncuestaRespuesta,observaciones:List[EncuestaObservacion]): play.twirl.api.HtmlFormat.Appendable = apply(reactivos,unidadacademica,nivel,forma,respuestas,observaciones)

  def f:((List[EncuestaReactivo],List[Unidadacademica],List[Niveleducativo],Form[EncuestaRespuesta],EncuestaRespuesta,List[EncuestaObservacion]) => play.twirl.api.HtmlFormat.Appendable) = (reactivos,unidadacademica,nivel,forma,respuestas,observaciones) => apply(reactivos,unidadacademica,nivel,forma,respuestas,observaciones)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:37 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Encuesta/atiendeObservaciones.scala.html
                  HASH: 62e0af549cc7cd3c38e2f86ba89cfdbd28247951
                  MATRIX: 874->1|1172->223|1204->247|1292->204|1320->304|1349->307|1420->352|1434->358|1491->395|1524->403|1535->407|1572->408|1600->410|2501->1285|2631->1405|2672->1407|2705->1414|2792->1480|2825->1486|3070->1701|3101->1705|3163->1737|3194->1741|3268->1787|3297->1788|3327->1791|3877->2314|3905->2315|3982->2364|4011->2365|4041->2368|4097->2396|4126->2397|4157->2401|4241->2458|4269->2459|4297->2460|4330->2465|4359->2466|4390->2470|4541->2594|4569->2595|4598->2597|4626->2598|4714->2658|4743->2659|4773->2662|4824->2685|4853->2686|4884->2690|4968->2747|4996->2748|5024->2749|5057->2754|5086->2755|5117->2759|5268->2883|5296->2884|5325->2886|5353->2887|5441->2947|5470->2948|5500->2951|5551->2974|5580->2975|5611->2979|5695->3036|5723->3037|5751->3038|5784->3043|5813->3044|5844->3048|5995->3172|6023->3173|6052->3175|6080->3176|6151->3219|6180->3220|6210->3223|6491->3475|6521->3476|6552->3480|6642->3543|6670->3544|6698->3545|6731->3550|6760->3551|6791->3555|6884->3621|6912->3622|6945->3628|7076->3730|7106->3731|7137->3735|7227->3798|7255->3799|7283->3800|7316->3805|7345->3806|7376->3810|7469->3876|7497->3877|7528->3881|7659->3983|7689->3984|7720->3988|7811->4051|7840->4052|7869->4053|7903->4058|7933->4059|7965->4063|8059->4129|8088->4130|8120->4134|8191->4176|8221->4177|8253->4181|8344->4244|8373->4245|8402->4246|8436->4251|8466->4252|8498->4256|8592->4322|8621->4323|8657->4331|8747->4392|8777->4393|8810->4398|8864->4424|8893->4425|8949->4452|8979->4453|9014->4460|9233->4651|9262->4652|9293->4655|9356->4689|9386->4690|9418->4694|9523->4771|9552->4772|9584->4776|9613->4777|9696->4831|9726->4832|9759->4837|9816->4865|9846->4866|9881->4873|9943->4907|9972->4908|10001->4909|10035->4914|10065->4915|10100->4922|10158->4952|10187->4953|10218->4956|10247->4957|10349->5030|10379->5031|10410->5034|10512->5107|10542->5108|10574->5112|10950->5460|10979->5461|11008->5462|11042->5467|11072->5468|11104->5472|11311->5651|11340->5652|11370->5654|11399->5655|11480->5707|11510->5708|11541->5711|11623->5764|11653->5765|11685->5769|12006->6062|12035->6063|12067->6067|12096->6068|12128->6072|12426->6342|12455->6343|12487->6347|12516->6348|12592->6395|12622->6396|12653->6399|12740->6457|12770->6458|12802->6462|13083->6715|13112->6716|13144->6720|13173->6721|13205->6725|13476->6968|13505->6969|13537->6973|13566->6974|13642->7021|13672->7022|13703->7025|13790->7083|13820->7084|13852->7088|14133->7341|14162->7342|14194->7346|14223->7347|14255->7351|14526->7594|14555->7595|14587->7599|14616->7600|14692->7647|14722->7648|14753->7651|14840->7709|14870->7710|14902->7714|15199->7983|15228->7984|15260->7988|15289->7989|15321->7993|15592->8236|15621->8237|15653->8241|15682->8242|15734->8265|15764->8266|15797->8271|15835->8281|15855->8291|15888->8302|15932->8318|15988->8352|16019->8354|16089->8395|16119->8396|16151->8400|16245->8466|16274->8467|16308->8473|16379->8515|16409->8516|16441->8520|16501->8552|16521->8562|16557->8576|16655->8646|16684->8647|16721->8656|16793->8700|16813->8710|16846->8721|16933->8780|16953->8790|16986->8801|17077->8863|17107->8864|17139->8868|17199->8900|17219->8910|17255->8924|17356->8997|17385->8998|17422->9007|17494->9051|17514->9061|17547->9072|17634->9131|17654->9141|17687->9152|17776->9212|17806->9213|17838->9217|17898->9249|17918->9259|17954->9273|18055->9346|18084->9347|18120->9355|18192->9399|18212->9409|18245->9420|18332->9479|18352->9489|18385->9500|18472->9559|18492->9569|18525->9580|18612->9639|18632->9649|18665->9660|18752->9719|18772->9729|18805->9740|18883->9790|18903->9800|18939->9814|19013->9860|19033->9870|19069->9884|19178->9964|19208->9965|19240->9969|19354->10055|19383->10056|19415->10060|19522->10140|19566->10167|19606->10168|19635->10169|19670->10177|19687->10184|19719->10194|19757->10204|19774->10211|19808->10223|19869->10256|19886->10263|19918->10273|20006->10332|20024->10339|20059->10351|20117->10381|20134->10388|20166->10398|20204->10407|20234->10408|20433->10579|20462->10580|20519->10609|20536->10616|20568->10626|20635->10665|20652->10672|20684->10682|20779->10749|20796->10756|20828->10766|20904->10811|20943->10822|20972->10823|21004->10827|21056->10851|21072->10857|21136->10899
                  LINES: 26->1|28->3|28->3|29->1|30->3|32->5|32->5|32->5|32->5|34->7|34->7|34->7|35->8|48->21|48->21|48->21|49->22|49->22|50->23|53->26|54->27|62->35|66->39|67->40|67->40|68->41|78->51|78->51|80->53|80->53|81->54|81->54|81->54|82->55|83->56|83->56|83->56|83->56|83->56|84->57|86->59|86->59|87->60|87->60|89->62|89->62|90->63|90->63|90->63|91->64|92->65|92->65|92->65|92->65|92->65|93->66|95->68|95->68|96->69|96->69|98->71|98->71|99->72|99->72|99->72|100->73|101->74|101->74|101->74|101->74|101->74|102->75|104->77|104->77|105->78|105->78|107->80|107->80|108->81|113->86|113->86|114->87|115->88|115->88|115->88|115->88|115->88|116->89|117->90|117->90|119->92|119->92|119->92|120->93|121->94|121->94|121->94|121->94|121->94|122->95|123->96|123->96|125->98|125->98|125->98|126->99|127->100|127->100|127->100|127->100|127->100|128->101|129->102|129->102|131->104|131->104|131->104|132->105|133->106|133->106|133->106|133->106|133->106|134->107|135->108|135->108|137->110|138->111|138->111|139->112|140->113|140->113|142->115|142->115|143->116|146->119|146->119|147->120|147->120|147->120|148->121|150->123|150->123|152->125|152->125|154->127|154->127|155->128|155->128|155->128|156->129|157->130|157->130|157->130|157->130|157->130|158->131|159->132|159->132|160->133|160->133|165->138|165->138|166->139|168->141|168->141|169->142|176->149|176->149|176->149|176->149|176->149|177->150|180->153|180->153|181->154|181->154|184->157|184->157|185->158|185->158|185->158|186->159|189->162|189->162|189->162|189->162|190->163|193->166|193->166|194->167|194->167|196->169|196->169|197->170|197->170|197->170|198->171|201->174|201->174|201->174|201->174|202->175|205->178|205->178|206->179|206->179|208->181|208->181|209->182|209->182|209->182|210->183|213->186|213->186|213->186|213->186|214->187|217->190|217->190|218->191|218->191|220->193|220->193|221->194|221->194|221->194|222->195|225->198|225->198|225->198|225->198|226->199|229->202|229->202|230->203|230->203|234->207|234->207|235->208|235->208|235->208|235->208|235->208|235->208|235->208|236->209|236->209|237->210|238->211|238->211|240->213|240->213|240->213|241->214|241->214|241->214|241->214|243->216|243->216|246->219|246->219|246->219|246->219|247->220|247->220|247->220|249->222|249->222|250->223|250->223|250->223|250->223|252->225|252->225|255->228|255->228|255->228|255->228|256->229|256->229|256->229|258->231|258->231|259->232|259->232|259->232|259->232|261->234|261->234|263->236|263->236|263->236|263->236|264->237|264->237|264->237|265->238|265->238|265->238|266->239|266->239|266->239|267->240|267->240|267->240|270->243|270->243|270->243|272->245|272->245|272->245|276->249|276->249|277->250|278->251|278->251|279->252|281->254|281->254|281->254|282->255|282->255|282->255|282->255|282->255|282->255|282->255|283->256|283->256|283->256|283->256|283->256|283->256|284->257|284->257|284->257|284->257|284->257|289->262|289->262|290->263|290->263|290->263|291->264|291->264|291->264|293->266|293->266|293->266|297->270|301->274|301->274|304->277|305->278|305->278|305->278
                  -- GENERATED --
              */
          