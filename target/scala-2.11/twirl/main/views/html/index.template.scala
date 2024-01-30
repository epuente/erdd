
package views.html

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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.3*/("""<style>
    section """),format.raw/*2.13*/("""{"""),format.raw/*2.14*/("""
        """),format.raw/*3.9*/("""border-radius: 1em;
        padding: 1em;
        position: absolute;
        top: 50%;
        left: 50%;
        margin-right: -50%;
        transform: translate(-50%, -50%) 
    """),format.raw/*10.5*/("""}"""),format.raw/*10.6*/("""
  """),format.raw/*11.3*/("""</style>


"""),_display_(/*14.2*/layoutIndex/*14.13*/{_display_(Seq[Any](format.raw/*14.14*/("""
	"""),format.raw/*15.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*15.47*/routes/*15.53*/.Assets.at("stylesheets/index.css")),format.raw/*15.88*/(""""/>
		<div class="container">
		  <section>
			  <h1>Bienvenido docente</h1>
			  <big>
				  <p>Al Sistema de Evaluación de Recursos Didácticos Digitales, mediante el cual podrá registrar los recursos que desea someter a evaluación técnico pedagógica.</p> 
				  <p>Para iniciar el proceso de registro, oprima el botón Continuar y complete la información que se solicita, anexando los documentos que se indican en el formulario.</p>
			  	  <p><a class="btn btn-success btn-lg" href=""""),_display_(/*22.53*/routes/*22.59*/.RecursoWebController.create),format.raw/*22.87*/("""" role="button">Continuar</a></p>
			  	  <p></p>	 
	 		  	  <br>
			  	  <p>Si usted ya cuenta con una clave de control y desea conocer el estado de su solicitud, escríbalo a continuación y oprima el botón Ingresar.</p>
		  	  </big>
					<form class="form-inline">
						<table id="tablaBuscaNC">
							<tr>
								<td >
									<div class="form-group">
										<label for="nc" class="sr-only control-label"></label>
										<input type="text" class="form-control" id="nc" placeholder="Clave de control">						
									</div>
									<a class="btn btn-success" href="javascript:bc()" role="button">Ingresar</a>
																
								</td>
								<td style="padding:20px">
									<div id="msgBuscarNc"></div>
								</td>
							</tr>
						</table>
					</form>
			</section>
		</div>
<script type="text/javascript">
	Modernizr.on( 'webp', function( result ) """),format.raw/*47.43*/("""{"""),format.raw/*47.44*/("""
		  """),format.raw/*48.5*/("""if ( result ) """),format.raw/*48.19*/("""{"""),format.raw/*48.20*/("""
		    """),format.raw/*49.7*/("""console.log(result); // true or false;
		  """),format.raw/*50.5*/("""}"""),format.raw/*50.6*/("""
		"""),format.raw/*51.3*/("""}"""),format.raw/*51.4*/(""");


	var bc = function()"""),format.raw/*54.21*/("""{"""),format.raw/*54.22*/("""
		"""),format.raw/*55.3*/("""$('#msgBuscarNc').html( "");
		var nc = $('#nc').val();		
		if(nc.length == 0 )"""),format.raw/*57.22*/("""{"""),format.raw/*57.23*/("""
			"""),format.raw/*58.4*/("""$('#msgBuscarNc').html( "Debe proporcionar el número de control" ).addClass("error");
			
			return false;
		"""),format.raw/*61.3*/("""}"""),format.raw/*61.4*/("""
		"""),format.raw/*62.3*/("""$.ajax("""),format.raw/*62.10*/("""{"""),format.raw/*62.11*/("""
		  """),format.raw/*63.5*/("""method: "GET",
		  url: "/buscarNC/"+nc,
		  dataType:"json"

		"""),format.raw/*67.3*/("""}"""),format.raw/*67.4*/(""")
		  .success(function( data ) """),format.raw/*68.31*/("""{"""),format.raw/*68.32*/("""
		  	"""),format.raw/*69.6*/("""if ( (data.estado == "error"))
		  		$('#msgBuscarNc').html( "El número de control no existe." ).addClass("error");
			else """),format.raw/*71.9*/("""{"""),format.raw/*71.10*/("""		  
				"""),format.raw/*72.5*/("""$('#msgBuscarNc').html(  "Correcto, ingresando... ").removeClass("error");			
				//$('form')[0].action = "/recursoweb/"+data;
				$('form')[0].action = "/recursowebAn";
				$('form')[0].submit();
			"""),format.raw/*76.4*/("""}"""),format.raw/*76.5*/("""
		  """),format.raw/*77.5*/("""}"""),format.raw/*77.6*/(""")
		  
		  .error(function(data)"""),format.raw/*79.26*/("""{"""),format.raw/*79.27*/("""
		  	"""),format.raw/*80.6*/("""$('#msgBuscarNc').html( "Error" );
		  """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/(""");
	"""),format.raw/*82.2*/("""}"""),format.raw/*82.3*/("""
"""),format.raw/*83.1*/("""</script>
""")))}),format.raw/*84.2*/("""

"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/index.scala.html
                  HASH: d035bd4a0ad1c65babcb7575fbadc33df3622de7
                  MATRIX: 798->2|845->22|873->23|908->32|1116->213|1144->214|1174->217|1212->229|1232->240|1271->241|1300->243|1372->288|1387->294|1443->329|1956->815|1971->821|2020->849|2925->1726|2954->1727|2986->1732|3028->1746|3057->1747|3091->1754|3161->1797|3189->1798|3219->1801|3247->1802|3300->1827|3329->1828|3359->1831|3466->1910|3495->1911|3526->1915|3662->2024|3690->2025|3720->2028|3755->2035|3784->2036|3816->2041|3907->2105|3935->2106|3995->2138|4024->2139|4057->2145|4208->2269|4237->2270|4273->2279|4500->2479|4528->2480|4560->2485|4588->2486|4648->2518|4677->2519|4710->2525|4776->2564|4804->2565|4835->2569|4863->2570|4891->2571|4932->2582
                  LINES: 29->1|30->2|30->2|31->3|38->10|38->10|39->11|42->14|42->14|42->14|43->15|43->15|43->15|43->15|50->22|50->22|50->22|75->47|75->47|76->48|76->48|76->48|77->49|78->50|78->50|79->51|79->51|82->54|82->54|83->55|85->57|85->57|86->58|89->61|89->61|90->62|90->62|90->62|91->63|95->67|95->67|96->68|96->68|97->69|99->71|99->71|100->72|104->76|104->76|105->77|105->77|107->79|107->79|108->80|109->81|109->81|110->82|110->82|111->83|112->84
                  -- GENERATED --
              */
          