
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
object encuestaPorRevisar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[List[EncuestaReactivo],List[Unidadacademica],List[Niveleducativo],Form[EncuestaRespuesta],EncuestaRespuesta,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(reactivos:List[EncuestaReactivo], unidadacademica:List[Unidadacademica], nivel:List[Niveleducativo], forma:Form[EncuestaRespuesta], respuestas:EncuestaRespuesta):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.164*/("""
"""),format.raw/*3.83*/(""" 

"""),format.raw/*5.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.46*/routes/*5.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*5.89*/(""""/> 
"""),_display_(/*6.2*/main/*6.6*/{_display_(Seq[Any](format.raw/*6.7*/("""
	"""),format.raw/*7.2*/("""<div class=container-fluid style="background-color: white; padding: 10px; display: none;">
		<div class="row">
			<div class="col-md-12">
				<h3>Encuesta de satisfacción del servicio de Evaluación TP-RDD</h3>
				<p>
					Estimado docente, queremos conocer su opinión acerca del servicio de Evaluación Técnico Pedagógica, por tanto, solicitamos su valioso apoyo para llenar esta encuesta. A través de este medio obtendremos información que nos permitirá mejorar el servicio que ofrecemos. Los datos que nos proporcione son anónimos y confidenciales.
					<br><br>
					<p style="font-weight: bold;">Instrucciones generales:</p><br>
					Lea cuidadosamente cada uno de los enunciados y responda lo que se le pide y/o marque la respuesta que mejor describa su opinión.
					<p>Las preguntas marcadas con asterisco (*) son obligatorias.</p> 				
				</p>
			
		
				"""),_display_(/*20.6*/form(CSRF(routes.EncuestaController.agregarObservaciones(respuestas.id)), 'role -> "form", 'style->"background-color: white;", 'id->"frmCreate")/*20.150*/ {_display_(Seq[Any](format.raw/*20.152*/("""
					"""),_display_(/*21.7*/encuestaForm(reactivos, unidadacademica, nivel, forma, respuestas)),format.raw/*21.73*/("""
					"""),format.raw/*22.6*/("""<div style="display: block;  margin-left: auto;   margin-right: auto; width: 70%">
						<input type="submit" class="btn btn-success btn-lg btn-block" id="btnForma"  value="Todo correcto, sin observaciones">
					</div>				
				""")))}),format.raw/*25.6*/("""
			"""),format.raw/*26.4*/("""</div>
		</div>
	</div>
""")))}),format.raw/*29.2*/("""



"""),format.raw/*33.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*34.15*/("""{"""),format.raw/*34.16*/("""
		"""),format.raw/*35.3*/("""$("[name='respuesta1[]'], [name='respuesta2'], [name='respuesta3'], [name='respuesta4'], #respuesta1Txt, #respuesta2Txt, #respuesta3Txt, #respuesta4Txt, #respuesta5Txt").attr("disabled",true);
		$("#frmCreate").validator();
		$("[name*='btnObservacion_']").html("Agregar observación");
		$("[name*='btnObservacion_']").addClass("btn-primary").removeClass("btn-danger");
		$("label[for='respuesta1'], label[for='respuesta2'], label[for='respuesta3'],  label[for='respuesta4']").html("");
		
		
		$(".container-fluid").show();
		$("input[type='text']:required, textarea:required, input[type='date']:required").attr("data-error", "Complete este campo");
		$("select:required").attr("data-error", "Seleccione una opción de la lista");
		$("input[type='radio']:required").attr("data-error", "Seleccione una opción");
		
		leer();
		
			
	"""),format.raw/*50.2*/("""}"""),format.raw/*50.3*/(""");
	
	$("#respuesta1_6").on( "click", function() """),format.raw/*52.45*/("""{"""),format.raw/*52.46*/("""
		"""),format.raw/*53.3*/("""if ($(this).prop("checked"))"""),format.raw/*53.31*/("""{"""),format.raw/*53.32*/("""
			"""),format.raw/*54.4*/("""$("#respuesta1Txt").parent().parent().parent().show();
		"""),format.raw/*55.3*/("""}"""),format.raw/*55.4*/("""	"""),format.raw/*55.5*/("""else """),format.raw/*55.10*/("""{"""),format.raw/*55.11*/("""
			"""),format.raw/*56.4*/("""$("#respuesta1Txt").parent().parent().parent().hide();
		"""),format.raw/*57.3*/("""}"""),format.raw/*57.4*/("""
	"""),format.raw/*58.2*/("""}"""),format.raw/*58.3*/(""");
	
	$("input[name='respuesta2']").on( "click", function() """),format.raw/*60.56*/("""{"""),format.raw/*60.57*/("""
		"""),format.raw/*61.3*/("""if ($(this).val()=="S")"""),format.raw/*61.26*/("""{"""),format.raw/*61.27*/("""
			"""),format.raw/*62.4*/("""$("#respuesta2Txt").parent().parent().parent().show();
		"""),format.raw/*63.3*/("""}"""),format.raw/*63.4*/("""	"""),format.raw/*63.5*/("""else """),format.raw/*63.10*/("""{"""),format.raw/*63.11*/("""
			"""),format.raw/*64.4*/("""$("#respuesta2Txt").parent().parent().parent().hide();
		"""),format.raw/*65.3*/("""}"""),format.raw/*65.4*/("""
	"""),format.raw/*66.2*/("""}"""),format.raw/*66.3*/(""");
	
	$("input[name='respuesta3']").on( "click", function() """),format.raw/*68.56*/("""{"""),format.raw/*68.57*/("""
		"""),format.raw/*69.3*/("""if ($(this).val()=="N")"""),format.raw/*69.26*/("""{"""),format.raw/*69.27*/("""
			"""),format.raw/*70.4*/("""$("#respuesta3Txt").parent().parent().parent().show();
		"""),format.raw/*71.3*/("""}"""),format.raw/*71.4*/("""	"""),format.raw/*71.5*/("""else """),format.raw/*71.10*/("""{"""),format.raw/*71.11*/("""
			"""),format.raw/*72.4*/("""$("#respuesta3Txt").parent().parent().parent().hide();
		"""),format.raw/*73.3*/("""}"""),format.raw/*73.4*/("""
	"""),format.raw/*74.2*/("""}"""),format.raw/*74.3*/(""");

	$("#frmCreate").submit(function(event)"""),format.raw/*76.40*/("""{"""),format.raw/*76.41*/("""
		"""),format.raw/*77.3*/("""if ($("input:radio[name='respuesta2']:checked").val() == 'S' && $("#respuesta2Txt").val().length == 0)"""),format.raw/*77.105*/("""{"""),format.raw/*77.106*/("""
			"""),format.raw/*78.4*/("""$("#respuesta2Txt").parent().parent().addClass("has-error");
		"""),format.raw/*79.3*/("""}"""),format.raw/*79.4*/(""" """),format.raw/*79.5*/("""else """),format.raw/*79.10*/("""{"""),format.raw/*79.11*/("""
			"""),format.raw/*80.4*/("""$("#respuesta2Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*81.3*/("""}"""),format.raw/*81.4*/("""

		"""),format.raw/*83.3*/("""if ($("input:radio[name='respuesta3']:checked").val() == 'N' && $("#respuesta3Txt").val().length == 0)"""),format.raw/*83.105*/("""{"""),format.raw/*83.106*/("""
			"""),format.raw/*84.4*/("""$("#respuesta3Txt").parent().parent().addClass("has-error");
		"""),format.raw/*85.3*/("""}"""),format.raw/*85.4*/(""" """),format.raw/*85.5*/("""else """),format.raw/*85.10*/("""{"""),format.raw/*85.11*/("""
			"""),format.raw/*86.4*/("""$("#respuesta3Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*87.3*/("""}"""),format.raw/*87.4*/("""

		
		"""),format.raw/*90.3*/("""var r1 = [];
		$.each($("input:checkbox:checked"), function()"""),format.raw/*91.49*/("""{"""),format.raw/*91.50*/(""" 
			"""),format.raw/*92.4*/("""r1.push($(this).val());
		"""),format.raw/*93.3*/("""}"""),format.raw/*93.4*/(""");


		if ( r1.length == 0 )"""),format.raw/*96.24*/("""{"""),format.raw/*96.25*/("""			
			"""),format.raw/*97.4*/("""$("#divMsgResp1").html('<ul class="list-unstyled"><li>Seleccione al menos una de las opciones.</li></ul>');
			alert("Corrija los campos marcados con rojo 1");			
			event.preventDefault();	
		"""),format.raw/*100.3*/("""}"""),format.raw/*100.4*/("""
		"""),format.raw/*101.3*/("""if ( $(".has-error").length != 0 )"""),format.raw/*101.37*/("""{"""),format.raw/*101.38*/("""
			"""),format.raw/*102.4*/("""alert("Corrija los campos marcados con rojo 2");
			event.preventDefault();	
		"""),format.raw/*104.3*/("""}"""),format.raw/*104.4*/(""" 
		"""),format.raw/*105.3*/("""if ( $(".error").length != 0 )"""),format.raw/*105.33*/("""{"""),format.raw/*105.34*/("""
			"""),format.raw/*106.4*/("""alert("Los campos de observaciones no pueden ser mayores a 600 caracteres");
			event.preventDefault();	
		"""),format.raw/*108.3*/("""}"""),format.raw/*108.4*/("""
	"""),format.raw/*109.2*/("""}"""),format.raw/*109.3*/(""");

	
	function leer()"""),format.raw/*112.17*/("""{"""),format.raw/*112.18*/("""
		"""),format.raw/*113.3*/("""var l = """"),_display_(/*113.13*/respuestas/*113.23*/.respuesta1),format.raw/*113.34*/("""".substring(1, """),_display_(/*113.50*/(respuestas.respuesta1.length()-1)),format.raw/*113.84*/("""  """),format.raw/*113.86*/(""").split(",");
		if(l!="")"""),format.raw/*114.12*/("""{"""),format.raw/*114.13*/("""		
			"""),format.raw/*115.4*/("""for(i=0;i<l.length;i++)"""),format.raw/*115.27*/("""{"""),format.raw/*115.28*/("""
				"""),format.raw/*116.5*/("""$("[name='respuesta1[]'][value="+l[i]+"]").attr("checked",true)
			"""),format.raw/*117.4*/("""}"""),format.raw/*117.5*/("""
		"""),format.raw/*118.3*/("""}"""),format.raw/*118.4*/("""
		
		"""),format.raw/*120.3*/("""// Muestra los botones 'Agregar Observación'
		for(i=1; i<=4; i++)"""),format.raw/*121.22*/("""{"""),format.raw/*121.23*/("""
			"""),format.raw/*122.4*/("""$("[name='observacion_respuesta"+i+"']").parent().parent().parent().parent().show();
		"""),format.raw/*123.3*/("""}"""),format.raw/*123.4*/("""
		
		
		
		"""),format.raw/*127.3*/("""if ( $("#respuesta1_6").prop("checked")  )"""),format.raw/*127.45*/("""{"""),format.raw/*127.46*/("""
			"""),format.raw/*128.4*/("""$("[id='respuesta1Txt']").val(""""),_display_(/*128.36*/respuestas/*128.46*/.respuesta1txt),format.raw/*128.60*/("""");
			$("[id='respuesta1Txt']").parent().parent().parent().show();

			$("[name='observacion_respuesta1txt']").parent().show();			
		"""),format.raw/*132.3*/("""}"""),format.raw/*132.4*/("""
		
		
		"""),format.raw/*135.3*/("""$("[id='respuesta2_S']").prop("checked",  """"),_display_(/*135.47*/respuestas/*135.57*/.respuesta2),format.raw/*135.68*/("""" == "S"  );
		$("[id='respuesta2_N']").prop("checked",  """"),_display_(/*136.47*/respuestas/*136.57*/.respuesta2),format.raw/*136.68*/("""" == "N"  );
		
		if($("[id='respuesta2_S']").prop("checked"))"""),format.raw/*138.47*/("""{"""),format.raw/*138.48*/("""
			"""),format.raw/*139.4*/("""$("[id='respuesta2Txt']").val(""""),_display_(/*139.36*/respuestas/*139.46*/.respuesta2txt),format.raw/*139.60*/("""");
			$("[id='respuesta2Txt']").parent().parent().parent().show();			
			$("[name='observacion_respuesta2txt']").parent().toggle("""),_display_(/*141.61*/respuestas/*141.71*/.respuesta2txt.length()),format.raw/*141.94*/("""!=0);
		"""),format.raw/*142.3*/("""}"""),format.raw/*142.4*/("""
		
		
		"""),format.raw/*145.3*/("""$("[id='respuesta3_S']").prop("checked",  """"),_display_(/*145.47*/respuestas/*145.57*/.respuesta3),format.raw/*145.68*/("""" == "S"  );
		$("[id='respuesta3_N']").prop("checked",  """"),_display_(/*146.47*/respuestas/*146.57*/.respuesta3),format.raw/*146.68*/("""" == "N"  );

		if($("[id='respuesta3_N']").prop("checked"))"""),format.raw/*148.47*/("""{"""),format.raw/*148.48*/("""
			"""),format.raw/*149.4*/("""$("[id='respuesta3Txt']").val(""""),_display_(/*149.36*/respuestas/*149.46*/.respuesta3txt),format.raw/*149.60*/("""");
			$("[id='respuesta3Txt']").parent().parent().parent().show();	
			$("[name='observacion_respuesta3txt']").parent().toggle("""),_display_(/*151.61*/respuestas/*151.71*/.respuesta3txt.length()),format.raw/*151.94*/("""!=0);		
		"""),format.raw/*152.3*/("""}"""),format.raw/*152.4*/("""		
		
		"""),format.raw/*154.3*/("""$("[id='respuesta4_1']").prop("checked",  """"),_display_(/*154.47*/respuestas/*154.57*/.respuesta4),format.raw/*154.68*/("""" == "1"  );
		$("[id='respuesta4_2']").prop("checked",  """"),_display_(/*155.47*/respuestas/*155.57*/.respuesta4),format.raw/*155.68*/("""" == "2"  );
		$("[id='respuesta4_3']").prop("checked",  """"),_display_(/*156.47*/respuestas/*156.57*/.respuesta4),format.raw/*156.68*/("""" == "3"  );
		$("[id='respuesta4_4']").prop("checked",  """"),_display_(/*157.47*/respuestas/*157.57*/.respuesta4),format.raw/*157.68*/("""" == "4"  );
		$("[id='respuesta4_5']").prop("checked",  """"),_display_(/*158.47*/respuestas/*158.57*/.respuesta4),format.raw/*158.68*/("""" == "5"  );


		$("[id='respuesta4Txt']").val(""""),_display_(/*161.35*/respuestas/*161.45*/.respuesta4txt),format.raw/*161.59*/("""");
		$("[name='observacion_respuesta4txt']").parent().toggle("""),_display_(/*162.60*/respuestas/*162.70*/.respuesta4txt.length()),format.raw/*162.93*/("""!=0);
					
		$("[id='respuesta5Txt']").val(""""),_display_(/*164.35*/respuestas/*164.45*/.respuesta5txt),format.raw/*164.59*/("""");
		$("[name='observacion_respuesta5txt']").parent().toggle("""),_display_(/*165.60*/respuestas/*165.70*/.respuesta5txt.length()),format.raw/*165.93*/("""!=0);
		
		
		/// Deshabilita los controles de las preguntas
		for(a=1;a<=5;a++)"""),format.raw/*169.20*/("""{"""),format.raw/*169.21*/("""
			"""),format.raw/*170.4*/("""$("[name='respuesta"+a+"'], [name='respuesta"+a+"Txt']").prop("disabled", true);			
		"""),format.raw/*171.3*/("""}"""),format.raw/*171.4*/("""		
		
		"""),format.raw/*173.3*/("""/// LEER OBSERVACIONES
		
		"""),_display_(/*175.4*/for(observa<-respuestas.observaciones) yield /*175.42*/{_display_(Seq[Any](format.raw/*175.43*/("""
			"""),format.raw/*176.4*/("""$("[name='observacion_"""),_display_(/*176.27*/observa/*176.34*/.respuesta),format.raw/*176.44*/("""']").val(""""),_display_(/*176.55*/observa/*176.62*/.descripcion),format.raw/*176.74*/("""");
			$("[name='observacion_"""),_display_(/*177.27*/observa/*177.34*/.respuesta),format.raw/*177.44*/("""']").css("background-color","#FFFDDD");
			$("[name='observacion_"""),_display_(/*178.27*/observa/*178.34*/.respuesta),format.raw/*178.44*/("""']").show();
			$("[name='btnObservacion_"""),_display_(/*179.30*/observa/*179.37*/.respuesta),format.raw/*179.47*/("""']").html("Quitar observación");
			$("[name='btnObservacion_"""),_display_(/*180.30*/observa/*180.37*/.respuesta),format.raw/*180.47*/("""']").removeClass("btn-primary").addClass("btn-danger");
		""")))}),format.raw/*181.4*/("""			
	"""),format.raw/*182.2*/("""}"""),format.raw/*182.3*/("""
	
	"""),format.raw/*184.2*/("""$("[name*='btnObservacion_respuesta']").on("click",function()"""),format.raw/*184.63*/("""{"""),format.raw/*184.64*/("""
		"""),format.raw/*185.3*/("""var nombre = $(this).attr("name").substr( "btnObservacion_respuesta".length   );
		if ( $("[name=observacion_respuesta"+nombre+"]").is(":visible") )"""),format.raw/*186.68*/("""{"""),format.raw/*186.69*/("""
			"""),format.raw/*187.4*/("""$("[name='observacion_respuesta"+nombre+"']").hide();
			$(this).parent().find("[name='errorObservacion']").html("");
			$("[name='observacion_respuesta"+nombre+"']").val("");
			$(this).html("Agregar observación");
			$(this).addClass("btn-primary").removeClass("btn-danger");
		"""),format.raw/*192.3*/("""}"""),format.raw/*192.4*/(""" """),format.raw/*192.5*/("""else """),format.raw/*192.10*/("""{"""),format.raw/*192.11*/("""
			"""),format.raw/*193.4*/("""$("[name='observacion_respuesta"+nombre+"']").show();
			$(this).html("Quitar observación");
			$(this).removeClass("btn-primary").addClass("btn-danger");
		"""),format.raw/*196.3*/("""}"""),format.raw/*196.4*/("""
		"""),format.raw/*197.3*/("""$("[name*='observacion_respuesta']").keyup();
	"""),format.raw/*198.2*/("""}"""),format.raw/*198.3*/(""");

	$( document ).on( "keyup", "[name*='observacion_respuesta']", function() """),format.raw/*200.75*/("""{"""),format.raw/*200.76*/("""		
		"""),format.raw/*201.3*/("""var numObservaciones = 0;
		$("[name*='observacion_respuesta']").each(function()"""),format.raw/*202.55*/("""{"""),format.raw/*202.56*/("""
			"""),format.raw/*203.4*/("""if ( $(this).val().length !=0  )
				numObservaciones++;
		"""),format.raw/*205.3*/("""}"""),format.raw/*205.4*/(""");
		
		if ( numObservaciones ==0   )
			$("#btnForma").val("Correcto, sin observaciones").addClass("btn-success").removeClass("btn-primary");
		else
			$("#btnForma").val("Grabar observaciones").addClass("btn-primary").removeClass("btn-success");
		
	"""),format.raw/*212.2*/("""}"""),format.raw/*212.3*/(""");
	
	$(document).on("keydown change blur", "textarea", function(event)"""),format.raw/*214.67*/("""{"""),format.raw/*214.68*/("""
		"""),format.raw/*215.3*/("""var actual = 	$(this);
		var tam = actual.val().length;
		if (tam >= 600)"""),format.raw/*217.18*/("""{"""),format.raw/*217.19*/("""
			"""),format.raw/*218.4*/("""console.log("tam excedido");
			if ( (event.which != 8  && event.which != 46  ))
				event.preventDefault();
			actual.css("border-color","#FF0000");			
			actual.parent().find("div[name='errorObservacion']").html("Este campo de observación ha excedido los 600 caracteres").show();
			actual.parent().find("div[name='errorObservacion']").addClass("error");			
		"""),format.raw/*224.3*/("""}"""),format.raw/*224.4*/(""" """),format.raw/*224.5*/("""else """),format.raw/*224.10*/("""{"""),format.raw/*224.11*/("""
			"""),format.raw/*225.4*/("""actual.css("border-color","");			
			actual.parent().find("div[name='errorObservacion']").hide();	
			actual.parent().find("div[name='errorObservacion']").removeClass("error");
		"""),format.raw/*228.3*/("""}"""),format.raw/*228.4*/("""
	"""),format.raw/*229.2*/("""}"""),format.raw/*229.3*/(""");		
	
	
	
</script>
<script src=""""),_display_(/*234.15*/routes/*234.21*/.Assets.at("javascripts/validator.min.js")),format.raw/*234.63*/("""" type="text/javascript"></script>"""))}
  }

  def render(reactivos:List[EncuestaReactivo],unidadacademica:List[Unidadacademica],nivel:List[Niveleducativo],forma:Form[EncuestaRespuesta],respuestas:EncuestaRespuesta): play.twirl.api.HtmlFormat.Appendable = apply(reactivos,unidadacademica,nivel,forma,respuestas)

  def f:((List[EncuestaReactivo],List[Unidadacademica],List[Niveleducativo],Form[EncuestaRespuesta],EncuestaRespuesta) => play.twirl.api.HtmlFormat.Appendable) = (reactivos,unidadacademica,nivel,forma,respuestas) => apply(reactivos,unidadacademica,nivel,forma,respuestas)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:37 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Encuesta/encuestaPorRevisar.scala.html
                  HASH: 973ac6b5db5fa5295f8df9954752eb8fbee8d785
                  MATRIX: 846->1|1103->182|1135->206|1223->163|1251->263|1280->266|1351->311|1365->317|1422->354|1453->360|1464->364|1501->365|1529->367|2420->1232|2574->1376|2615->1378|2648->1385|2735->1451|2768->1457|3027->1686|3058->1690|3113->1715|3144->1719|3218->1765|3247->1766|3277->1769|4137->2602|4165->2603|4242->2652|4271->2653|4301->2656|4357->2684|4386->2685|4417->2689|4501->2746|4529->2747|4557->2748|4590->2753|4619->2754|4650->2758|4734->2815|4762->2816|4791->2818|4819->2819|4907->2879|4936->2880|4966->2883|5017->2906|5046->2907|5077->2911|5161->2968|5189->2969|5217->2970|5250->2975|5279->2976|5310->2980|5394->3037|5422->3038|5451->3040|5479->3041|5567->3101|5596->3102|5626->3105|5677->3128|5706->3129|5737->3133|5821->3190|5849->3191|5877->3192|5910->3197|5939->3198|5970->3202|6054->3259|6082->3260|6111->3262|6139->3263|6210->3306|6239->3307|6269->3310|6400->3412|6430->3413|6461->3417|6551->3480|6579->3481|6607->3482|6640->3487|6669->3488|6700->3492|6793->3558|6821->3559|6852->3563|6983->3665|7013->3666|7044->3670|7134->3733|7162->3734|7190->3735|7223->3740|7252->3741|7283->3745|7376->3811|7404->3812|7438->3819|7527->3880|7556->3881|7588->3886|7641->3912|7669->3913|7725->3941|7754->3942|7788->3949|8009->4142|8038->4143|8069->4146|8132->4180|8162->4181|8194->4185|8301->4264|8330->4265|8362->4269|8421->4299|8451->4300|8483->4304|8618->4411|8647->4412|8677->4414|8706->4415|8757->4437|8787->4438|8818->4441|8856->4451|8876->4461|8909->4472|8953->4488|9009->4522|9040->4524|9094->4549|9124->4550|9158->4556|9210->4579|9240->4580|9273->4585|9368->4652|9397->4653|9428->4656|9457->4657|9491->4663|9586->4729|9616->4730|9648->4734|9763->4821|9792->4822|9832->4834|9903->4876|9933->4877|9965->4881|10025->4913|10045->4923|10081->4937|10243->5071|10272->5072|10309->5081|10381->5125|10401->5135|10434->5146|10521->5205|10541->5215|10574->5226|10665->5288|10695->5289|10727->5293|10787->5325|10807->5335|10843->5349|11002->5480|11022->5490|11067->5513|11103->5521|11132->5522|11169->5531|11241->5575|11261->5585|11294->5596|11381->5655|11401->5665|11434->5676|11523->5736|11553->5737|11585->5741|11645->5773|11665->5783|11701->5797|11858->5926|11878->5936|11923->5959|11961->5969|11990->5970|12026->5978|12098->6022|12118->6032|12151->6043|12238->6102|12258->6112|12291->6123|12378->6182|12398->6192|12431->6203|12518->6262|12538->6272|12571->6283|12658->6342|12678->6352|12711->6363|12788->6412|12808->6422|12844->6436|12935->6499|12955->6509|13000->6532|13074->6578|13094->6588|13130->6602|13221->6665|13241->6675|13286->6698|13395->6778|13425->6779|13457->6783|13571->6869|13600->6870|13636->6878|13692->6907|13747->6945|13787->6946|13819->6950|13870->6973|13887->6980|13919->6990|13958->7001|13975->7008|14009->7020|14067->7050|14084->7057|14116->7067|14210->7133|14227->7140|14259->7150|14329->7192|14346->7199|14378->7209|14468->7271|14485->7278|14517->7288|14607->7347|14640->7352|14669->7353|14701->7357|14791->7418|14821->7419|14852->7422|15029->7570|15059->7571|15091->7575|15399->7855|15428->7856|15457->7857|15491->7862|15521->7863|15553->7867|15738->8024|15767->8025|15798->8028|15873->8075|15902->8076|16009->8154|16039->8155|16072->8160|16181->8240|16211->8241|16243->8245|16330->8304|16359->8305|16639->8557|16668->8558|16768->8629|16798->8630|16829->8633|16931->8706|16961->8707|16993->8711|17383->9073|17412->9074|17441->9075|17475->9080|17505->9081|17537->9085|17744->9264|17773->9265|17803->9267|17832->9268|17895->9303|17911->9309|17975->9351
                  LINES: 26->1|28->3|28->3|29->1|30->3|32->5|32->5|32->5|32->5|33->6|33->6|33->6|34->7|47->20|47->20|47->20|48->21|48->21|49->22|52->25|53->26|56->29|60->33|61->34|61->34|62->35|77->50|77->50|79->52|79->52|80->53|80->53|80->53|81->54|82->55|82->55|82->55|82->55|82->55|83->56|84->57|84->57|85->58|85->58|87->60|87->60|88->61|88->61|88->61|89->62|90->63|90->63|90->63|90->63|90->63|91->64|92->65|92->65|93->66|93->66|95->68|95->68|96->69|96->69|96->69|97->70|98->71|98->71|98->71|98->71|98->71|99->72|100->73|100->73|101->74|101->74|103->76|103->76|104->77|104->77|104->77|105->78|106->79|106->79|106->79|106->79|106->79|107->80|108->81|108->81|110->83|110->83|110->83|111->84|112->85|112->85|112->85|112->85|112->85|113->86|114->87|114->87|117->90|118->91|118->91|119->92|120->93|120->93|123->96|123->96|124->97|127->100|127->100|128->101|128->101|128->101|129->102|131->104|131->104|132->105|132->105|132->105|133->106|135->108|135->108|136->109|136->109|139->112|139->112|140->113|140->113|140->113|140->113|140->113|140->113|140->113|141->114|141->114|142->115|142->115|142->115|143->116|144->117|144->117|145->118|145->118|147->120|148->121|148->121|149->122|150->123|150->123|154->127|154->127|154->127|155->128|155->128|155->128|155->128|159->132|159->132|162->135|162->135|162->135|162->135|163->136|163->136|163->136|165->138|165->138|166->139|166->139|166->139|166->139|168->141|168->141|168->141|169->142|169->142|172->145|172->145|172->145|172->145|173->146|173->146|173->146|175->148|175->148|176->149|176->149|176->149|176->149|178->151|178->151|178->151|179->152|179->152|181->154|181->154|181->154|181->154|182->155|182->155|182->155|183->156|183->156|183->156|184->157|184->157|184->157|185->158|185->158|185->158|188->161|188->161|188->161|189->162|189->162|189->162|191->164|191->164|191->164|192->165|192->165|192->165|196->169|196->169|197->170|198->171|198->171|200->173|202->175|202->175|202->175|203->176|203->176|203->176|203->176|203->176|203->176|203->176|204->177|204->177|204->177|205->178|205->178|205->178|206->179|206->179|206->179|207->180|207->180|207->180|208->181|209->182|209->182|211->184|211->184|211->184|212->185|213->186|213->186|214->187|219->192|219->192|219->192|219->192|219->192|220->193|223->196|223->196|224->197|225->198|225->198|227->200|227->200|228->201|229->202|229->202|230->203|232->205|232->205|239->212|239->212|241->214|241->214|242->215|244->217|244->217|245->218|251->224|251->224|251->224|251->224|251->224|252->225|255->228|255->228|256->229|256->229|261->234|261->234|261->234
                  -- GENERATED --
              */
          