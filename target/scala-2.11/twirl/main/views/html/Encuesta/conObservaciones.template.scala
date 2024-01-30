
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
object conObservaciones extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[List[EncuestaReactivo],List[Unidadacademica],List[Niveleducativo],Form[EncuestaRespuesta],EncuestaRespuesta,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(reactivos:List[EncuestaReactivo], unidadacademica:List[Unidadacademica], nivel:List[Niveleducativo], forma:Form[EncuestaRespuesta], respuestas:EncuestaRespuesta):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.164*/("""
"""),format.raw/*3.83*/(""" 

"""),format.raw/*5.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.46*/routes/*5.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*5.89*/(""""/> 

 
"""),_display_(/*8.2*/main/*8.6*/{_display_(Seq[Any](format.raw/*8.7*/("""

	"""),format.raw/*10.2*/("""<div class=container-fluid style="background-color: white; padding: 10px; display: none;">
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
		
				"""),_display_(/*22.6*/form(CSRF(routes.EncuestaController.agregarObservaciones(respuestas.id)), 'role -> "form", 'style->"background-color: white;", 'id->"frmCreate")/*22.150*/ {_display_(Seq[Any](format.raw/*22.152*/("""
					"""),_display_(/*23.7*/encuestaForm(reactivos, unidadacademica, nivel, forma, respuestas)),format.raw/*23.73*/("""
					"""),format.raw/*24.6*/("""<div style="display: block;  margin-left: auto;   margin-right: auto; width: 70%">
						<input type="submit" class="btn btn-success btn-lg btn-block" id="btnForma"  value="Todo correcto, sin observaciones">
					</div>				
				""")))}),format.raw/*27.6*/("""
			"""),format.raw/*28.4*/("""</div>
		</div>
	
	

	</div>


""")))}),format.raw/*36.2*/("""



"""),format.raw/*40.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*41.15*/("""{"""),format.raw/*41.16*/("""
		"""),format.raw/*42.3*/("""$("[name='respuesta1[]'], [name='respuesta2'], [name='respuesta3'], [name='respuesta4'], #respuesta1Txt, #respuesta2Txt, #respuesta3Txt, #respuesta4Txt, #respuesta5Txt").attr("disabled",true);
		$("#frmCreate").validator();
		$("[name*='btnObservacion_']").html("Agregar observación");
		
		leer();
		
		$(".container-fluid").show();
		$("input[type='text']:required, textarea:required, input[type='date']:required").attr("data-error", "Complete este campo");
		$("select:required").attr("data-error", "Seleccione una opción de la lista");
		$("input[type='radio']:required").attr("data-error", "Seleccione una opción");
		
		$("label[for='respuesta1']").html("");	
		
		$("[name='respuesta1[]'], #respuesta1Txt,  [name='respuesta2'],   #respuesta2Txt,  [name='respuesta3'],   #respuesta3Txt, [name='respuesta4'],   #respuesta4Txt,  #respuesta5Txt").attr('disabled', true);
			
	"""),format.raw/*57.2*/("""}"""),format.raw/*57.3*/(""");
	
	$("#respuesta1_6").on( "click", function() """),format.raw/*59.45*/("""{"""),format.raw/*59.46*/("""
		"""),format.raw/*60.3*/("""if ($(this).prop("checked"))"""),format.raw/*60.31*/("""{"""),format.raw/*60.32*/("""
			"""),format.raw/*61.4*/("""$("#respuesta1Txt").parent().parent().parent().show();
		"""),format.raw/*62.3*/("""}"""),format.raw/*62.4*/("""	"""),format.raw/*62.5*/("""else """),format.raw/*62.10*/("""{"""),format.raw/*62.11*/("""
			"""),format.raw/*63.4*/("""$("#respuesta1Txt").parent().parent().parent().hide();
		"""),format.raw/*64.3*/("""}"""),format.raw/*64.4*/("""
	"""),format.raw/*65.2*/("""}"""),format.raw/*65.3*/(""");
	
	$("input[name='respuesta2']").on( "click", function() """),format.raw/*67.56*/("""{"""),format.raw/*67.57*/("""
		"""),format.raw/*68.3*/("""if ($(this).val()=="S")"""),format.raw/*68.26*/("""{"""),format.raw/*68.27*/("""
			"""),format.raw/*69.4*/("""$("#respuesta2Txt").parent().parent().parent().show();
		"""),format.raw/*70.3*/("""}"""),format.raw/*70.4*/("""	"""),format.raw/*70.5*/("""else """),format.raw/*70.10*/("""{"""),format.raw/*70.11*/("""
			"""),format.raw/*71.4*/("""$("#respuesta2Txt").parent().parent().parent().hide();
		"""),format.raw/*72.3*/("""}"""),format.raw/*72.4*/("""
	"""),format.raw/*73.2*/("""}"""),format.raw/*73.3*/(""");
	
	$("input[name='respuesta3']").on( "click", function() """),format.raw/*75.56*/("""{"""),format.raw/*75.57*/("""
		"""),format.raw/*76.3*/("""if ($(this).val()=="N")"""),format.raw/*76.26*/("""{"""),format.raw/*76.27*/("""
			"""),format.raw/*77.4*/("""$("#respuesta3Txt").parent().parent().parent().show();
		"""),format.raw/*78.3*/("""}"""),format.raw/*78.4*/("""	"""),format.raw/*78.5*/("""else """),format.raw/*78.10*/("""{"""),format.raw/*78.11*/("""
			"""),format.raw/*79.4*/("""$("#respuesta3Txt").parent().parent().parent().hide();
		"""),format.raw/*80.3*/("""}"""),format.raw/*80.4*/("""
	"""),format.raw/*81.2*/("""}"""),format.raw/*81.3*/(""");

	$("#frmCreate").submit(function(event)"""),format.raw/*83.40*/("""{"""),format.raw/*83.41*/("""
		"""),format.raw/*84.3*/("""if ($("input:radio[name='respuesta2']:checked").val() == 'S' && $("#respuesta2Txt").val().length == 0)"""),format.raw/*84.105*/("""{"""),format.raw/*84.106*/("""
			"""),format.raw/*85.4*/("""$("#respuesta2Txt").parent().parent().addClass("has-error");
		"""),format.raw/*86.3*/("""}"""),format.raw/*86.4*/(""" """),format.raw/*86.5*/("""else """),format.raw/*86.10*/("""{"""),format.raw/*86.11*/("""
			"""),format.raw/*87.4*/("""$("#respuesta2Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*88.3*/("""}"""),format.raw/*88.4*/("""

		"""),format.raw/*90.3*/("""if ($("input:radio[name='respuesta3']:checked").val() == 'N' && $("#respuesta3Txt").val().length == 0)"""),format.raw/*90.105*/("""{"""),format.raw/*90.106*/("""
			"""),format.raw/*91.4*/("""$("#respuesta3Txt").parent().parent().addClass("has-error");
		"""),format.raw/*92.3*/("""}"""),format.raw/*92.4*/(""" """),format.raw/*92.5*/("""else """),format.raw/*92.10*/("""{"""),format.raw/*92.11*/("""
			"""),format.raw/*93.4*/("""$("#respuesta3Txt").parent().parent().removeClass("has-error");
		"""),format.raw/*94.3*/("""}"""),format.raw/*94.4*/("""

		
		"""),format.raw/*97.3*/("""var r1 = [];
		$.each($("input:checkbox:checked"), function()"""),format.raw/*98.49*/("""{"""),format.raw/*98.50*/(""" 
			"""),format.raw/*99.4*/("""r1.push($(this).val());
		"""),format.raw/*100.3*/("""}"""),format.raw/*100.4*/(""");


		if ( r1.length == 0 )"""),format.raw/*103.24*/("""{"""),format.raw/*103.25*/("""			
			"""),format.raw/*104.4*/("""$("#divMsgResp1").html('<ul class="list-unstyled"><li>Seleccione al menos una de las opciones.</li></ul>');
			alert("Corrija los campos marcados con rojo");			
			event.preventDefault();	
		"""),format.raw/*107.3*/("""}"""),format.raw/*107.4*/("""
		"""),format.raw/*108.3*/("""if ( $(".has-error").length != 0 )"""),format.raw/*108.37*/("""{"""),format.raw/*108.38*/("""
			"""),format.raw/*109.4*/("""alert("Corrija los campos marcados con rojo");
			event.preventDefault();	
		"""),format.raw/*111.3*/("""}"""),format.raw/*111.4*/(""" 

	"""),format.raw/*113.2*/("""}"""),format.raw/*113.3*/(""");

	
	function leer()"""),format.raw/*116.17*/("""{"""),format.raw/*116.18*/("""
		
		"""),format.raw/*118.3*/("""var l = """"),_display_(/*118.13*/respuestas/*118.23*/.respuesta1),format.raw/*118.34*/("""".substring(1, """),_display_(/*118.50*/(respuestas.respuesta1.length()-1)),format.raw/*118.84*/("""  """),format.raw/*118.86*/(""").split(",");
		
		for(i=0;i<l.length;i++)"""),format.raw/*120.26*/("""{"""),format.raw/*120.27*/("""
			"""),format.raw/*121.4*/("""$("[name='respuesta1[]'][value="+l[i]+"]").attr("checked",true)
		"""),format.raw/*122.3*/("""}"""),format.raw/*122.4*/("""
		
		"""),format.raw/*124.3*/("""if ( $("#respuesta1_6").prop("checked")  )"""),format.raw/*124.45*/("""{"""),format.raw/*124.46*/("""
			"""),format.raw/*125.4*/("""$("[id='respuesta1Txt']").val(""""),_display_(/*125.36*/respuestas/*125.46*/.respuesta1txt),format.raw/*125.60*/("""");
			$("[id='respuesta1Txt']").parent().parent().parent().show();
		"""),format.raw/*127.3*/("""}"""),format.raw/*127.4*/("""
		
		
		"""),format.raw/*130.3*/("""$("[id='respuesta2_S']").prop("checked",  """"),_display_(/*130.47*/respuestas/*130.57*/.respuesta2),format.raw/*130.68*/("""" == "S"  );
		$("[id='respuesta2_N']").prop("checked",  """"),_display_(/*131.47*/respuestas/*131.57*/.respuesta2),format.raw/*131.68*/("""" == "N"  );
		
		if($("[id='respuesta2_S']").prop("checked"))"""),format.raw/*133.47*/("""{"""),format.raw/*133.48*/("""
			"""),format.raw/*134.4*/("""$("[id='respuesta2Txt']").val(""""),_display_(/*134.36*/respuestas/*134.46*/.respuesta2txt),format.raw/*134.60*/("""");
			$("[id='respuesta2Txt']").parent().parent().parent().show();			
		"""),format.raw/*136.3*/("""}"""),format.raw/*136.4*/("""
		
		
		"""),format.raw/*139.3*/("""$("[id='respuesta3_S']").prop("checked",  """"),_display_(/*139.47*/respuestas/*139.57*/.respuesta3),format.raw/*139.68*/("""" == "S"  );
		$("[id='respuesta3_N']").prop("checked",  """"),_display_(/*140.47*/respuestas/*140.57*/.respuesta3),format.raw/*140.68*/("""" == "N"  );

		if($("[id='respuesta3_N']").prop("checked"))"""),format.raw/*142.47*/("""{"""),format.raw/*142.48*/("""
			"""),format.raw/*143.4*/("""$("[id='respuesta3Txt']").val(""""),_display_(/*143.36*/respuestas/*143.46*/.respuesta3txt),format.raw/*143.60*/("""");
			$("[id='respuesta3Txt']").parent().parent().parent().show();			
		"""),format.raw/*145.3*/("""}"""),format.raw/*145.4*/("""		
		
		"""),format.raw/*147.3*/("""$("[id='respuesta4_1']").prop("checked",  """"),_display_(/*147.47*/respuestas/*147.57*/.respuesta4),format.raw/*147.68*/("""" == "1"  );
		$("[id='respuesta4_2']").prop("checked",  """"),_display_(/*148.47*/respuestas/*148.57*/.respuesta4),format.raw/*148.68*/("""" == "2"  );
		$("[id='respuesta4_3']").prop("checked",  """"),_display_(/*149.47*/respuestas/*149.57*/.respuesta4),format.raw/*149.68*/("""" == "3"  );
		$("[id='respuesta4_4']").prop("checked",  """"),_display_(/*150.47*/respuestas/*150.57*/.respuesta4),format.raw/*150.68*/("""" == "4"  );
		$("[id='respuesta4_5']").prop("checked",  """"),_display_(/*151.47*/respuestas/*151.57*/.respuesta4),format.raw/*151.68*/("""" == "5"  );


		$("[id='respuesta4Txt']").val(""""),_display_(/*154.35*/respuestas/*154.45*/.respuesta4txt),format.raw/*154.59*/("""");
					
		$("[id='respuesta5Txt']").val(""""),_display_(/*156.35*/respuestas/*156.45*/.respuesta5txt),format.raw/*156.59*/("""");
		
		/// LEER OBSERVACIONES
		
		"""),_display_(/*160.4*/for(observa<-respuestas.observaciones) yield /*160.42*/{_display_(Seq[Any](format.raw/*160.43*/("""
			"""),format.raw/*161.4*/("""$("[name='observacion_"""),_display_(/*161.27*/observa/*161.34*/.respuesta),format.raw/*161.44*/("""']").val(""""),_display_(/*161.55*/observa/*161.62*/.descripcion),format.raw/*161.74*/("""");
			$("[name='observacion_"""),_display_(/*162.27*/observa/*162.34*/.respuesta),format.raw/*162.44*/("""']").css("background-color","yellow");
			$("[name='observacion_"""),_display_(/*163.27*/observa/*163.34*/.respuesta),format.raw/*163.44*/("""']").show();
			$("[name='btnObservacion_"""),_display_(/*164.30*/observa/*164.37*/.respuesta),format.raw/*164.47*/("""']").html("Quitar observación");
			$("[name='btnObservacion_"""),_display_(/*165.30*/observa/*165.37*/.respuesta),format.raw/*165.47*/("""']").removeClass("btn-primary").addClass("btn-danger");
			
			$("[name*='"""),_display_(/*167.16*/observa/*167.23*/.respuesta),format.raw/*167.33*/("""']").prop("disabled",false);
			
			
		""")))}),format.raw/*170.4*/("""			
			
			
		
	"""),format.raw/*174.2*/("""}"""),format.raw/*174.3*/("""
	
	"""),format.raw/*176.2*/("""$("[name*='btnObservacion_respuesta']").on("click",function()"""),format.raw/*176.63*/("""{"""),format.raw/*176.64*/("""
		"""),format.raw/*177.3*/("""var nombre = $(this).attr("name").substr( "btnObservacion_respuesta".length   );
		if ( $("[name=observacion_respuesta"+nombre+"]").is(":visible") )"""),format.raw/*178.68*/("""{"""),format.raw/*178.69*/("""
			"""),format.raw/*179.4*/("""$("[name='observacion_respuesta"+nombre+"']").hide();
			$("[name='observacion_respuesta"+nombre+"']").val("");
			$(this).html("Agregar observación");
			$(this).addClass("btn-primary").removeClass("btn-danger");
		"""),format.raw/*183.3*/("""}"""),format.raw/*183.4*/(""" """),format.raw/*183.5*/("""else """),format.raw/*183.10*/("""{"""),format.raw/*183.11*/("""
			"""),format.raw/*184.4*/("""$("[name='observacion_respuesta"+nombre+"']").show();
			$(this).html("Quitar observación");
			$(this).removeClass("btn-primary").addClass("btn-danger");
		"""),format.raw/*187.3*/("""}"""),format.raw/*187.4*/("""
		"""),format.raw/*188.3*/("""$("[name*='observacion_respuesta']").keyup();
	"""),format.raw/*189.2*/("""}"""),format.raw/*189.3*/(""");

	$( document ).on( "keyup", "[name*='observacion_respuesta']", function() """),format.raw/*191.75*/("""{"""),format.raw/*191.76*/("""		
		"""),format.raw/*192.3*/("""var numObservaciones = 0;
		$("[name*='observacion_respuesta']").each(function()"""),format.raw/*193.55*/("""{"""),format.raw/*193.56*/("""
			"""),format.raw/*194.4*/("""if ( $(this).val().length !=0  )
				numObservaciones++;
		"""),format.raw/*196.3*/("""}"""),format.raw/*196.4*/(""");
		
		if ( numObservaciones ==0   )
			$("#btnForma").val("Correcto, sin observaciones").addClass("btn-success").removeClass("btn-primary");
		else
			$("#btnForma").val("Grabar observaciones").addClass("btn-primary").removeClass("btn-success");
		
"""),format.raw/*203.1*/("""}"""),format.raw/*203.2*/(""");
	
	
	
</script>
<script src=""""),_display_(/*208.15*/routes/*208.21*/.Assets.at("javascripts/validator.min.js")),format.raw/*208.63*/("""" type="text/javascript"></script>"""))}
  }

  def render(reactivos:List[EncuestaReactivo],unidadacademica:List[Unidadacademica],nivel:List[Niveleducativo],forma:Form[EncuestaRespuesta],respuestas:EncuestaRespuesta): play.twirl.api.HtmlFormat.Appendable = apply(reactivos,unidadacademica,nivel,forma,respuestas)

  def f:((List[EncuestaReactivo],List[Unidadacademica],List[Niveleducativo],Form[EncuestaRespuesta],EncuestaRespuesta) => play.twirl.api.HtmlFormat.Appendable) = (reactivos,unidadacademica,nivel,forma,respuestas) => apply(reactivos,unidadacademica,nivel,forma,respuestas)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:36 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Encuesta/conObservaciones.scala.html
                  HASH: 6950fa05238239dedc165699fd703b4239da1cad
                  MATRIX: 844->1|1101->182|1133->206|1221->163|1249->263|1278->266|1349->311|1363->317|1420->354|1454->363|1465->367|1502->368|1532->371|2419->1232|2573->1376|2614->1378|2647->1385|2734->1451|2767->1457|3026->1686|3057->1690|3119->1722|3150->1726|3224->1772|3253->1773|3283->1776|4189->2655|4217->2656|4294->2705|4323->2706|4353->2709|4409->2737|4438->2738|4469->2742|4553->2799|4581->2800|4609->2801|4642->2806|4671->2807|4702->2811|4786->2868|4814->2869|4843->2871|4871->2872|4959->2932|4988->2933|5018->2936|5069->2959|5098->2960|5129->2964|5213->3021|5241->3022|5269->3023|5302->3028|5331->3029|5362->3033|5446->3090|5474->3091|5503->3093|5531->3094|5619->3154|5648->3155|5678->3158|5729->3181|5758->3182|5789->3186|5873->3243|5901->3244|5929->3245|5962->3250|5991->3251|6022->3255|6106->3312|6134->3313|6163->3315|6191->3316|6262->3359|6291->3360|6321->3363|6452->3465|6482->3466|6513->3470|6603->3533|6631->3534|6659->3535|6692->3540|6721->3541|6752->3545|6845->3611|6873->3612|6904->3616|7035->3718|7065->3719|7096->3723|7186->3786|7214->3787|7242->3788|7275->3793|7304->3794|7335->3798|7428->3864|7456->3865|7490->3872|7579->3933|7608->3934|7640->3939|7694->3965|7723->3966|7780->3994|7810->3995|7845->4002|8064->4193|8093->4194|8124->4197|8187->4231|8217->4232|8249->4236|8354->4313|8383->4314|8415->4318|8444->4319|8495->4341|8525->4342|8559->4348|8597->4358|8617->4368|8650->4379|8694->4395|8750->4429|8781->4431|8852->4473|8882->4474|8914->4478|9008->4544|9037->4545|9071->4551|9142->4593|9172->4594|9204->4598|9264->4630|9284->4640|9320->4654|9418->4724|9447->4725|9484->4734|9556->4778|9576->4788|9609->4799|9696->4858|9716->4868|9749->4879|9840->4941|9870->4942|9902->4946|9962->4978|9982->4988|10018->5002|10119->5075|10148->5076|10185->5085|10257->5129|10277->5139|10310->5150|10397->5209|10417->5219|10450->5230|10539->5290|10569->5291|10601->5295|10661->5327|10681->5337|10717->5351|10818->5424|10847->5425|10883->5433|10955->5477|10975->5487|11008->5498|11095->5557|11115->5567|11148->5578|11235->5637|11255->5647|11288->5658|11375->5717|11395->5727|11428->5738|11515->5797|11535->5807|11568->5818|11645->5867|11665->5877|11701->5891|11773->5935|11793->5945|11829->5959|11894->5997|11949->6035|11989->6036|12021->6040|12072->6063|12089->6070|12121->6080|12160->6091|12177->6098|12211->6110|12269->6140|12286->6147|12318->6157|12411->6222|12428->6229|12460->6239|12530->6281|12547->6288|12579->6298|12669->6360|12686->6367|12718->6377|12821->6452|12838->6459|12870->6469|12941->6509|12985->6525|13014->6526|13046->6530|13136->6591|13166->6592|13197->6595|13374->6743|13404->6744|13436->6748|13680->6964|13709->6965|13738->6966|13772->6971|13802->6972|13834->6976|14019->7133|14048->7134|14079->7137|14154->7184|14183->7185|14290->7263|14320->7264|14353->7269|14462->7349|14492->7350|14524->7354|14611->7413|14640->7414|14919->7665|14948->7666|15009->7699|15025->7705|15089->7747
                  LINES: 26->1|28->3|28->3|29->1|30->3|32->5|32->5|32->5|32->5|35->8|35->8|35->8|37->10|49->22|49->22|49->22|50->23|50->23|51->24|54->27|55->28|63->36|67->40|68->41|68->41|69->42|84->57|84->57|86->59|86->59|87->60|87->60|87->60|88->61|89->62|89->62|89->62|89->62|89->62|90->63|91->64|91->64|92->65|92->65|94->67|94->67|95->68|95->68|95->68|96->69|97->70|97->70|97->70|97->70|97->70|98->71|99->72|99->72|100->73|100->73|102->75|102->75|103->76|103->76|103->76|104->77|105->78|105->78|105->78|105->78|105->78|106->79|107->80|107->80|108->81|108->81|110->83|110->83|111->84|111->84|111->84|112->85|113->86|113->86|113->86|113->86|113->86|114->87|115->88|115->88|117->90|117->90|117->90|118->91|119->92|119->92|119->92|119->92|119->92|120->93|121->94|121->94|124->97|125->98|125->98|126->99|127->100|127->100|130->103|130->103|131->104|134->107|134->107|135->108|135->108|135->108|136->109|138->111|138->111|140->113|140->113|143->116|143->116|145->118|145->118|145->118|145->118|145->118|145->118|145->118|147->120|147->120|148->121|149->122|149->122|151->124|151->124|151->124|152->125|152->125|152->125|152->125|154->127|154->127|157->130|157->130|157->130|157->130|158->131|158->131|158->131|160->133|160->133|161->134|161->134|161->134|161->134|163->136|163->136|166->139|166->139|166->139|166->139|167->140|167->140|167->140|169->142|169->142|170->143|170->143|170->143|170->143|172->145|172->145|174->147|174->147|174->147|174->147|175->148|175->148|175->148|176->149|176->149|176->149|177->150|177->150|177->150|178->151|178->151|178->151|181->154|181->154|181->154|183->156|183->156|183->156|187->160|187->160|187->160|188->161|188->161|188->161|188->161|188->161|188->161|188->161|189->162|189->162|189->162|190->163|190->163|190->163|191->164|191->164|191->164|192->165|192->165|192->165|194->167|194->167|194->167|197->170|201->174|201->174|203->176|203->176|203->176|204->177|205->178|205->178|206->179|210->183|210->183|210->183|210->183|210->183|211->184|214->187|214->187|215->188|216->189|216->189|218->191|218->191|219->192|220->193|220->193|221->194|223->196|223->196|230->203|230->203|235->208|235->208|235->208
                  -- GENERATED --
              */
          