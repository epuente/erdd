
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
object create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[EncuestaReactivo],List[Unidadacademica],List[Niveleducativo],Form[EncuestaRespuesta],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(reactivos:List[EncuestaReactivo], unidadacademica:List[Unidadacademica], nivel:List[Niveleducativo], forma:Form[EncuestaRespuesta]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.134*/("""
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
			
			
				"""),_display_(/*20.6*/form(CSRF(routes.EncuestaWebController.save()),  'style->"background-color: white;", 'id->"frmCreate")/*20.108*/ {_display_(Seq[Any](format.raw/*20.110*/("""
				
					"""),_display_(/*22.7*/encuestaForm(reactivos, unidadacademica, nivel, forma, null)),format.raw/*22.67*/("""


					"""),format.raw/*25.6*/("""<div style="display: block;  margin-left: auto;   margin-right: auto;">
						<input type="submit" class="btn btn-success btn-lg btn-block center-block" value="Enviar encuesta" style="width: 70%">
					</div>				
				""")))}),format.raw/*28.6*/("""
			"""),format.raw/*29.4*/("""</div>
		</div>
	
	

	</div>


""")))}),format.raw/*37.2*/("""


"""),format.raw/*40.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*41.15*/("""{"""),format.raw/*41.16*/("""
		
		"""),format.raw/*43.3*/("""$("label[for^='respuesta1']").after("<br>");
		$("label[for^='respuesta2'],  label[for^='respuesta3'],  label[for^='respuesta4']").after("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		
		$("#frmCreate").validator();
		$("[name*='btnObservacion_']").hide();
		$(".container-fluid").show();
		$("input[type='text']:required, textarea:required, input[type='date']:required").attr("data-error", "Complete este campo");
		$("select:required").attr("data-error", "Seleccione una opción de la lista");
		$("input[type='radio']:required").attr("data-error", "Seleccione una opción");
		
		$("label[for='respuesta1'], label[for='respuesta2'], label[for='respuesta3'],  label[for='respuesta4']").html("");
	"""),format.raw/*54.2*/("""}"""),format.raw/*54.3*/(""");
	
	$("#respuesta1_6").on( "click", function() """),format.raw/*56.45*/("""{"""),format.raw/*56.46*/("""
		"""),format.raw/*57.3*/("""if ($(this).prop("checked"))"""),format.raw/*57.31*/("""{"""),format.raw/*57.32*/("""
			"""),format.raw/*58.4*/("""$("#respuesta1Txt").parent().parent().parent().show();
		"""),format.raw/*59.3*/("""}"""),format.raw/*59.4*/("""	"""),format.raw/*59.5*/("""else """),format.raw/*59.10*/("""{"""),format.raw/*59.11*/("""
			"""),format.raw/*60.4*/("""$("#respuesta1Txt").parent().parent().parent().hide();
			$("#respuesta1Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*62.3*/("""}"""),format.raw/*62.4*/("""
	"""),format.raw/*63.2*/("""}"""),format.raw/*63.3*/(""");
	
	$("input[name='respuesta2']").on( "click", function() """),format.raw/*65.56*/("""{"""),format.raw/*65.57*/("""
		"""),format.raw/*66.3*/("""if ($(this).val()=="S")"""),format.raw/*66.26*/("""{"""),format.raw/*66.27*/("""
			"""),format.raw/*67.4*/("""$("#respuesta2Txt").parent().parent().parent().show();
		"""),format.raw/*68.3*/("""}"""),format.raw/*68.4*/("""	"""),format.raw/*68.5*/("""else """),format.raw/*68.10*/("""{"""),format.raw/*68.11*/("""
			"""),format.raw/*69.4*/("""$("#respuesta2Txt").parent().parent().parent().hide();
			$("#respuesta2Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*71.3*/("""}"""),format.raw/*71.4*/("""
	"""),format.raw/*72.2*/("""}"""),format.raw/*72.3*/(""");
	
	$("input[name='respuesta3']").on( "click", function() """),format.raw/*74.56*/("""{"""),format.raw/*74.57*/("""
		"""),format.raw/*75.3*/("""if ($(this).val()=="N")"""),format.raw/*75.26*/("""{"""),format.raw/*75.27*/("""
			"""),format.raw/*76.4*/("""$("#respuesta3Txt").parent().parent().parent().show();
		"""),format.raw/*77.3*/("""}"""),format.raw/*77.4*/("""	"""),format.raw/*77.5*/("""else """),format.raw/*77.10*/("""{"""),format.raw/*77.11*/("""
			"""),format.raw/*78.4*/("""$("#respuesta3Txt").parent().parent().parent().hide();
			$("#respuesta3Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*80.3*/("""}"""),format.raw/*80.4*/("""
	"""),format.raw/*81.2*/("""}"""),format.raw/*81.3*/(""");

	$("#frmCreate").submit(function(event)"""),format.raw/*83.40*/("""{"""),format.raw/*83.41*/("""
		"""),format.raw/*84.3*/("""$("[name='respuesta1[]']").change();
		$("[name='respuesta2']").change();
		$("[name='respuesta3']").change();
		$("[name='respuesta4']").change();
		
		if ($("[name='respuesta1[]'][value=6]:checked").length!=0 && $("#respuesta1Txt").val().length == 0)"""),format.raw/*89.102*/("""{"""),format.raw/*89.103*/("""
			"""),format.raw/*90.4*/("""$("#respuesta1Txt").parent().parent().addClass("has-error");
		"""),format.raw/*91.3*/("""}"""),format.raw/*91.4*/(""" """),format.raw/*91.5*/("""else """),format.raw/*91.10*/("""{"""),format.raw/*91.11*/("""
			"""),format.raw/*92.4*/("""$("#respuesta1Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*93.3*/("""}"""),format.raw/*93.4*/("""		

		"""),format.raw/*95.3*/("""if ($("input:radio[name='respuesta2']:checked").val() == 'S' && $("#respuesta2Txt").val().length == 0)"""),format.raw/*95.105*/("""{"""),format.raw/*95.106*/("""
			"""),format.raw/*96.4*/("""$("#respuesta2Txt").parent().parent().addClass("has-error");
		"""),format.raw/*97.3*/("""}"""),format.raw/*97.4*/(""" """),format.raw/*97.5*/("""else """),format.raw/*97.10*/("""{"""),format.raw/*97.11*/("""
			"""),format.raw/*98.4*/("""$("#respuesta2Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*99.3*/("""}"""),format.raw/*99.4*/("""

		"""),format.raw/*101.3*/("""if ($("input:radio[name='respuesta3']:checked").val() == 'N' && $("#respuesta3Txt").val().length == 0)"""),format.raw/*101.105*/("""{"""),format.raw/*101.106*/("""
			"""),format.raw/*102.4*/("""$("#respuesta3Txt").parent().parent().addClass("has-error");
		"""),format.raw/*103.3*/("""}"""),format.raw/*103.4*/(""" """),format.raw/*103.5*/("""else """),format.raw/*103.10*/("""{"""),format.raw/*103.11*/("""
			"""),format.raw/*104.4*/("""$("#respuesta3Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*105.3*/("""}"""),format.raw/*105.4*/("""

		"""),format.raw/*107.3*/("""if ($("#respuesta4Txt").val().length == 0)"""),format.raw/*107.45*/("""{"""),format.raw/*107.46*/("""
			"""),format.raw/*108.4*/("""$("#respuesta4Txt").parent().parent().addClass("has-error");
		"""),format.raw/*109.3*/("""}"""),format.raw/*109.4*/(""" """),format.raw/*109.5*/("""else """),format.raw/*109.10*/("""{"""),format.raw/*109.11*/("""
			"""),format.raw/*110.4*/("""$("#respuesta4Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*111.3*/("""}"""),format.raw/*111.4*/("""		
		
		"""),format.raw/*113.3*/("""var r1 = [];
		$.each($("input:checkbox:checked"), function()"""),format.raw/*114.49*/("""{"""),format.raw/*114.50*/(""" 
			"""),format.raw/*115.4*/("""r1.push($(this).val());
		"""),format.raw/*116.3*/("""}"""),format.raw/*116.4*/(""");

		if ( r1.length == 0 )"""),format.raw/*118.24*/("""{"""),format.raw/*118.25*/("""			
			"""),format.raw/*119.4*/("""$("#divMsgResp1").html('<ul class="list-unstyled"><li>Seleccione al menos una de las opciones.</li></ul>');
			alert("Corrija los campos marcados con rojo");			
			event.preventDefault();	
		"""),format.raw/*122.3*/("""}"""),format.raw/*122.4*/("""
		"""),format.raw/*123.3*/("""if ( $(".has-error").length != 0 )"""),format.raw/*123.37*/("""{"""),format.raw/*123.38*/("""
			"""),format.raw/*124.4*/("""alert("Corrija los campos marcados con rojo");
			event.preventDefault();	
		"""),format.raw/*126.3*/("""}"""),format.raw/*126.4*/(""" 

	"""),format.raw/*128.2*/("""}"""),format.raw/*128.3*/(""");

	$('#form').validator().on('submit', function (e) """),format.raw/*130.51*/("""{"""),format.raw/*130.52*/("""
		  """),format.raw/*131.5*/("""if (e.isDefaultPrevented()) """),format.raw/*131.33*/("""{"""),format.raw/*131.34*/("""
		    """),format.raw/*132.7*/("""// handle the invalid form...
		  """),format.raw/*133.5*/("""}"""),format.raw/*133.6*/(""" """),format.raw/*133.7*/("""else """),format.raw/*133.12*/("""{"""),format.raw/*133.13*/("""
		    """),format.raw/*134.7*/("""// everything looks good!
		  """),format.raw/*135.5*/("""}"""),format.raw/*135.6*/("""
		"""),format.raw/*136.3*/("""}"""),format.raw/*136.4*/(""")


	

	$(document).on("keydown change blur", "textarea", function(event)"""),format.raw/*141.67*/("""{"""),format.raw/*141.68*/("""
		"""),format.raw/*142.3*/("""var actual = 	$(this);
		var tam = actual.val().length;
		if (tam >= 600)"""),format.raw/*144.18*/("""{"""),format.raw/*144.19*/("""
			"""),format.raw/*145.4*/("""console.log("tam excedido");
			if ( (event.which != 8  && event.which != 46  ))
				event.preventDefault();
			actual.css("border-color","#FF0000");			
			actual.parent().find("div[name='divErrorTextArea']").html("Este campo ha excedido los 600 caracteres").show();
			actual.parent().find("div[name='divErrorTextArea']").addClass("error");
			
		"""),format.raw/*152.3*/("""}"""),format.raw/*152.4*/(""" """),format.raw/*152.5*/("""else """),format.raw/*152.10*/("""{"""),format.raw/*152.11*/("""
			"""),format.raw/*153.4*/("""actual.css("border-color","");			
			actual.parent().find("div[name='divErrorTextArea']").hide();	
			actual.parent().find("div[name='divErrorTextArea']").removeClass("error");
		"""),format.raw/*156.3*/("""}"""),format.raw/*156.4*/("""
	"""),format.raw/*157.2*/("""}"""),format.raw/*157.3*/(""");	 


	$("[name='respuesta1[]']").change(function()"""),format.raw/*160.46*/("""{"""),format.raw/*160.47*/("""
		"""),format.raw/*161.3*/("""if ($("[name='respuesta1[]']:checked").length == 0  )"""),format.raw/*161.56*/("""{"""),format.raw/*161.57*/("""
			"""),format.raw/*162.4*/("""$("#respuesta1").parent().parent().parent().parent().find(".help-block").html("Seleccione al menos un motivo");
			$("#respuesta1").parent().parent().parent().parent().find(".help-block").show();
			$("#respuesta1").parent().parent().parent().parent().find(".help-block").addClass("error");
		"""),format.raw/*165.3*/("""}"""),format.raw/*165.4*/("""else"""),format.raw/*165.8*/("""{"""),format.raw/*165.9*/("""
			"""),format.raw/*166.4*/("""$("#respuesta1").parent().parent().parent().parent().find(".help-block").html("");
			$("#respuesta1").parent().parent().parent().parent().find(".help-block").hide();
			$("#respuesta1").parent().parent().parent().parent().find(".help-block").removeClass("error");			
		"""),format.raw/*169.3*/("""}"""),format.raw/*169.4*/("""		
	"""),format.raw/*170.2*/("""}"""),format.raw/*170.3*/(""");

	$("[name='respuesta2']").change(function()"""),format.raw/*172.44*/("""{"""),format.raw/*172.45*/("""
		"""),format.raw/*173.3*/("""if ($("[name='respuesta2']:checked").val() == undefined  )"""),format.raw/*173.61*/("""{"""),format.raw/*173.62*/("""
			"""),format.raw/*174.4*/("""$("#respuesta2").parent().parent().parent().find(".help-block").html("Responda Si o No");
			$("#respuesta2").parent().parent().parent().find(".help-block").show();
			$("#respuesta2").parent().parent().parent().find(".help-block").addClass("error");
		"""),format.raw/*177.3*/("""}"""),format.raw/*177.4*/("""else"""),format.raw/*177.8*/("""{"""),format.raw/*177.9*/("""
			"""),format.raw/*178.4*/("""$("#respuesta2").parent().parent().parent().find(".help-block").html("");
			$("#respuesta2").parent().parent().parent().find(".help-block").hide();
			$("#respuesta2").parent().parent().parent().find(".help-block").removeClass("error");			
		"""),format.raw/*181.3*/("""}"""),format.raw/*181.4*/("""		
	"""),format.raw/*182.2*/("""}"""),format.raw/*182.3*/(""");

	$("[name='respuesta3']").change(function()"""),format.raw/*184.44*/("""{"""),format.raw/*184.45*/("""
		"""),format.raw/*185.3*/("""if ($("[name='respuesta3']:checked").val() == undefined  )"""),format.raw/*185.61*/("""{"""),format.raw/*185.62*/("""
			"""),format.raw/*186.4*/("""$("#respuesta3").parent().parent().parent().find(".help-block").html("Responda Si o No");
			$("#respuesta3").parent().parent().parent().find(".help-block").show();
			$("#respuesta3").parent().parent().parent().find(".help-block").addClass("error");
		"""),format.raw/*189.3*/("""}"""),format.raw/*189.4*/("""else"""),format.raw/*189.8*/("""{"""),format.raw/*189.9*/("""
			"""),format.raw/*190.4*/("""$("#respuesta3").parent().parent().parent().find(".help-block").html("");
			$("#respuesta3").parent().parent().parent().find(".help-block").hide();
			$("#respuesta3").parent().parent().parent().find(".help-block").removeClass("error");			
		"""),format.raw/*193.3*/("""}"""),format.raw/*193.4*/("""		
	"""),format.raw/*194.2*/("""}"""),format.raw/*194.3*/(""");

	$("[name='respuesta4']").change(function()"""),format.raw/*196.44*/("""{"""),format.raw/*196.45*/("""
		"""),format.raw/*197.3*/("""if ($("[name='respuesta4']:checked").val() == undefined  )"""),format.raw/*197.61*/("""{"""),format.raw/*197.62*/("""
			"""),format.raw/*198.4*/("""$("#respuesta4").parent().parent().parent().find(".help-block").html("Califique con valores del 1 al 5");
			$("#respuesta4").parent().parent().parent().find(".help-block").show();
			$("#respuesta4").parent().parent().parent().find(".help-block").addClass("error");
		"""),format.raw/*201.3*/("""}"""),format.raw/*201.4*/("""else"""),format.raw/*201.8*/("""{"""),format.raw/*201.9*/("""
			"""),format.raw/*202.4*/("""$("#respuesta4").parent().parent().parent().find(".help-block").html("");
			$("#respuesta4").parent().parent().parent().find(".help-block").hide();
			$("#respuesta4").parent().parent().parent().find(".help-block").removeClass("error");			
		"""),format.raw/*205.3*/("""}"""),format.raw/*205.4*/("""		
	"""),format.raw/*206.2*/("""}"""),format.raw/*206.3*/(""");
	

</script>
<script src=""""),_display_(/*210.15*/routes/*210.21*/.Assets.at("javascripts/validator.min.js")),format.raw/*210.63*/("""" type="text/javascript"></script>"""))}
  }

  def render(reactivos:List[EncuestaReactivo],unidadacademica:List[Unidadacademica],nivel:List[Niveleducativo],forma:Form[EncuestaRespuesta]): play.twirl.api.HtmlFormat.Appendable = apply(reactivos,unidadacademica,nivel,forma)

  def f:((List[EncuestaReactivo],List[Unidadacademica],List[Niveleducativo],Form[EncuestaRespuesta]) => play.twirl.api.HtmlFormat.Appendable) = (reactivos,unidadacademica,nivel,forma) => apply(reactivos,unidadacademica,nivel,forma)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:36 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Encuesta/create.scala.html
                  HASH: 1478b2ba433b8dc89b626a33943423353da4c528
                  MATRIX: 816->1|1043->152|1075->176|1163->133|1191->233|1220->236|1291->281|1305->287|1362->324|1393->330|1404->334|1441->335|1469->337|2361->1203|2473->1305|2514->1307|2552->1319|2633->1379|2668->1387|2916->1605|2947->1609|3009->1641|3039->1644|3113->1690|3142->1691|3175->1697|3895->2390|3923->2391|4000->2440|4029->2441|4059->2444|4115->2472|4144->2473|4175->2477|4259->2534|4287->2535|4315->2536|4348->2541|4377->2542|4408->2546|4559->2670|4587->2671|4616->2673|4644->2674|4732->2734|4761->2735|4791->2738|4842->2761|4871->2762|4902->2766|4986->2823|5014->2824|5042->2825|5075->2830|5104->2831|5135->2835|5286->2959|5314->2960|5343->2962|5371->2963|5459->3023|5488->3024|5518->3027|5569->3050|5598->3051|5629->3055|5713->3112|5741->3113|5769->3114|5802->3119|5831->3120|5862->3124|6013->3248|6041->3249|6070->3251|6098->3252|6169->3295|6198->3296|6228->3299|6509->3551|6539->3552|6570->3556|6660->3619|6688->3620|6716->3621|6749->3626|6778->3627|6809->3631|6902->3697|6930->3698|6963->3704|7094->3806|7124->3807|7155->3811|7245->3874|7273->3875|7301->3876|7334->3881|7363->3882|7394->3886|7487->3952|7515->3953|7547->3957|7679->4059|7710->4060|7742->4064|7833->4127|7862->4128|7891->4129|7925->4134|7955->4135|7987->4139|8081->4205|8110->4206|8142->4210|8213->4252|8243->4253|8275->4257|8366->4320|8395->4321|8424->4322|8458->4327|8488->4328|8520->4332|8614->4398|8643->4399|8679->4407|8769->4468|8799->4469|8832->4474|8886->4500|8915->4501|8971->4528|9001->4529|9036->4536|9255->4727|9284->4728|9315->4731|9378->4765|9408->4766|9440->4770|9545->4847|9574->4848|9606->4852|9635->4853|9718->4907|9748->4908|9781->4913|9838->4941|9868->4942|9903->4949|9965->4983|9994->4984|10023->4985|10057->4990|10087->4991|10122->4998|10180->5028|10209->5029|10240->5032|10269->5033|10371->5106|10401->5107|10432->5110|10534->5183|10564->5184|10596->5188|10972->5536|11001->5537|11030->5538|11064->5543|11094->5544|11126->5548|11333->5727|11362->5728|11392->5730|11421->5731|11502->5783|11532->5784|11563->5787|11645->5840|11675->5841|11707->5845|12028->6138|12057->6139|12089->6143|12118->6144|12150->6148|12448->6418|12477->6419|12509->6423|12538->6424|12614->6471|12644->6472|12675->6475|12762->6533|12792->6534|12824->6538|13105->6791|13134->6792|13166->6796|13195->6797|13227->6801|13498->7044|13527->7045|13559->7049|13588->7050|13664->7097|13694->7098|13725->7101|13812->7159|13842->7160|13874->7164|14155->7417|14184->7418|14216->7422|14245->7423|14277->7427|14548->7670|14577->7671|14609->7675|14638->7676|14714->7723|14744->7724|14775->7727|14862->7785|14892->7786|14924->7790|15221->8059|15250->8060|15282->8064|15311->8065|15343->8069|15614->8312|15643->8313|15675->8317|15704->8318|15762->8348|15778->8354|15842->8396
                  LINES: 26->1|28->3|28->3|29->1|30->3|32->5|32->5|32->5|32->5|33->6|33->6|33->6|34->7|47->20|47->20|47->20|49->22|49->22|52->25|55->28|56->29|64->37|67->40|68->41|68->41|70->43|81->54|81->54|83->56|83->56|84->57|84->57|84->57|85->58|86->59|86->59|86->59|86->59|86->59|87->60|89->62|89->62|90->63|90->63|92->65|92->65|93->66|93->66|93->66|94->67|95->68|95->68|95->68|95->68|95->68|96->69|98->71|98->71|99->72|99->72|101->74|101->74|102->75|102->75|102->75|103->76|104->77|104->77|104->77|104->77|104->77|105->78|107->80|107->80|108->81|108->81|110->83|110->83|111->84|116->89|116->89|117->90|118->91|118->91|118->91|118->91|118->91|119->92|120->93|120->93|122->95|122->95|122->95|123->96|124->97|124->97|124->97|124->97|124->97|125->98|126->99|126->99|128->101|128->101|128->101|129->102|130->103|130->103|130->103|130->103|130->103|131->104|132->105|132->105|134->107|134->107|134->107|135->108|136->109|136->109|136->109|136->109|136->109|137->110|138->111|138->111|140->113|141->114|141->114|142->115|143->116|143->116|145->118|145->118|146->119|149->122|149->122|150->123|150->123|150->123|151->124|153->126|153->126|155->128|155->128|157->130|157->130|158->131|158->131|158->131|159->132|160->133|160->133|160->133|160->133|160->133|161->134|162->135|162->135|163->136|163->136|168->141|168->141|169->142|171->144|171->144|172->145|179->152|179->152|179->152|179->152|179->152|180->153|183->156|183->156|184->157|184->157|187->160|187->160|188->161|188->161|188->161|189->162|192->165|192->165|192->165|192->165|193->166|196->169|196->169|197->170|197->170|199->172|199->172|200->173|200->173|200->173|201->174|204->177|204->177|204->177|204->177|205->178|208->181|208->181|209->182|209->182|211->184|211->184|212->185|212->185|212->185|213->186|216->189|216->189|216->189|216->189|217->190|220->193|220->193|221->194|221->194|223->196|223->196|224->197|224->197|224->197|225->198|228->201|228->201|228->201|228->201|229->202|232->205|232->205|233->206|233->206|237->210|237->210|237->210
                  -- GENERATED --
              */
          