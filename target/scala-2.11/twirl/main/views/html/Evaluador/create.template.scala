
package views.html.Evaluador

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
object create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Personal],Personal,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(e: Form[Personal], r:Personal):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.33*/("""
"""),format.raw/*3.83*/(""" 

"""),_display_(/*5.2*/main/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""
	"""),format.raw/*6.2*/("""<div class=container-fluid style="background-color: white; padding: 10px;">
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
				  <li>Evaluadores</li>
				  <li class="active">Crear</li>
				</ol>			
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<h3>Agregar evaluador</h3>				
			    """),_display_(/*18.9*/form( CSRF(routes.EvaluadorController.save()), 'role -> "form", 'id -> "frmEvaluador", 'role->"form")/*18.110*/ {_display_(Seq[Any](format.raw/*18.112*/("""
					"""),_display_(/*19.7*/evaluadorForm(e,null)),format.raw/*19.28*/("""
				    """),format.raw/*20.9*/("""<div class="form-group">
				        <input type="submit" value="Agregar" class="btn btn-primary" >  
				        <a href=""""),_display_(/*22.23*/routes/*22.29*/.EvaluadorController.list()),format.raw/*22.56*/("""" class="btn btn-default">Cancelar</a> 
				    </div>
				""")))}),format.raw/*24.6*/("""
			"""),format.raw/*25.4*/("""</div>
		</div>
	</div>	
""")))}),format.raw/*28.2*/("""



"""),format.raw/*32.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*33.15*/("""{"""),format.raw/*33.16*/("""
		"""),format.raw/*34.3*/("""$('#frmEvaluador').validator();
		$("[name='aspecto[]']").attr("data-error","Seleccione el o los aspectos");
		$("input[type='email']").attr("data-error","No es la estructura de un email.");
		
		
		$("[name='correo']").attr("data-remote","/validarExistenciaEmail");
		$("[name='correo']").attr("data-remote-error","Ya esta registrado este email.");
		
		
		$("#usuario_usuario, #usuario_password").attr("data-error","Sólo letras y números, sin acéntos, espacios ni caracteres especiales.");
		$('#nombre').focus();
		$(".observacion").hide();
		$("[name*='btnObservacion_']").hide();
	"""),format.raw/*47.2*/("""}"""),format.raw/*47.3*/(""");
	
	
	$("#frmEvaluador").submit(function(event)"""),format.raw/*50.43*/("""{"""),format.raw/*50.44*/("""		
		"""),format.raw/*51.3*/("""var numErrores=0;
		var forma = $(this);
		if (  $("input[name='aspecto[]']:checked").length == 0  )"""),format.raw/*53.60*/("""{"""),format.raw/*53.61*/("""
			"""),format.raw/*54.4*/("""alert("Debe seleccionar al menos un aspecto");
			numErrores++;
		"""),format.raw/*56.3*/("""}"""),format.raw/*56.4*/(""" 		
		
		"""),format.raw/*58.3*/("""if ( $("#usuario_usuario").val().length ==0 || $("#usuario_password").val().length ==0  )"""),format.raw/*58.92*/("""{"""),format.raw/*58.93*/("""
			"""),format.raw/*59.4*/("""alert("Es obligatorio definir el nombre de usuario y su clave de acceso");
			numErrores++;
		"""),format.raw/*61.3*/("""}"""),format.raw/*61.4*/(""" """),format.raw/*61.5*/("""else """),format.raw/*61.10*/("""{"""),format.raw/*61.11*/("""
			"""),format.raw/*62.4*/("""var aux = "/validarExistenciaUserPass/"+$("#usuario_usuario").val()+"/"+$("#usuario_password").val();			
			$.ajax("""),format.raw/*63.11*/("""{"""),format.raw/*63.12*/("""
				  """),format.raw/*64.7*/("""url: aux,
				  async: false
				"""),format.raw/*66.5*/("""}"""),format.raw/*66.6*/(""").done(function(data) """),format.raw/*66.28*/("""{"""),format.raw/*66.29*/("""			
					"""),format.raw/*67.6*/("""if (data!="0")"""),format.raw/*67.20*/("""{"""),format.raw/*67.21*/("""					
						"""),format.raw/*68.7*/("""$("#usuario_usuario").parent().parent().addClass("has-error");
				  		$("#divErrorUserPass").html('Ya existe el usuario con el password que intenta agregar.');
				  		$("#divErrorUserPass").show();
				  		numErrores++;
					"""),format.raw/*72.6*/("""}"""),format.raw/*72.7*/("""
				"""),format.raw/*73.5*/("""}"""),format.raw/*73.6*/(""")
				.fail(function()"""),format.raw/*74.21*/("""{"""),format.raw/*74.22*/("""
					"""),format.raw/*75.6*/("""alert("error en AJAX");
				"""),format.raw/*76.5*/("""}"""),format.raw/*76.6*/(""");				
		"""),format.raw/*77.3*/("""}"""),format.raw/*77.4*/("""

		"""),format.raw/*79.3*/("""if (numErrores == 0)"""),format.raw/*79.23*/("""{"""),format.raw/*79.24*/("""
					
			"""),format.raw/*81.4*/("""$("#usuario_usuario, #usuario_password").parent().parent().removeClass("has-error");
	  		$("#divErrorUserPass").html('');
	  		$("#divErrorUserPass").hide();	
		"""),format.raw/*84.3*/("""}"""),format.raw/*84.4*/(""" """),format.raw/*84.5*/("""else """),format.raw/*84.10*/("""{"""),format.raw/*84.11*/("""
			"""),format.raw/*85.4*/("""event.preventDefault();		
		"""),format.raw/*86.3*/("""}"""),format.raw/*86.4*/(""" 
	"""),format.raw/*87.2*/("""}"""),format.raw/*87.3*/(""");
	
"""),format.raw/*114.3*/("""
"""),format.raw/*115.1*/("""</script>
<script src=""""),_display_(/*116.15*/routes/*116.21*/.Assets.at("javascripts/validator.min.js")),format.raw/*116.63*/("""" type="text/javascript"></script>
"""))}
  }

  def render(e:Form[Personal],r:Personal): play.twirl.api.HtmlFormat.Appendable = apply(e,r)

  def f:((Form[Personal],Personal) => play.twirl.api.HtmlFormat.Appendable) = (e,r) => apply(e,r)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Evaluador/create.scala.html
                  HASH: eb9b87153e2a19c9e015ff0c0726c6ef53b2f709
                  MATRIX: 751->1|877->51|909->75|996->32|1024->132|1053->136|1064->140|1101->141|1129->143|1491->479|1602->580|1643->582|1676->589|1718->610|1754->619|1905->743|1920->749|1968->776|2058->836|2089->840|2145->866|2176->870|2250->916|2279->917|2309->920|2922->1506|2950->1507|3027->1556|3056->1557|3088->1562|3216->1662|3245->1663|3276->1667|3369->1733|3397->1734|3433->1743|3550->1832|3579->1833|3610->1837|3731->1931|3759->1932|3787->1933|3820->1938|3849->1939|3880->1943|4023->2058|4052->2059|4086->2066|4146->2099|4174->2100|4224->2122|4253->2123|4289->2132|4331->2146|4360->2147|4399->2159|4653->2386|4681->2387|4713->2392|4741->2393|4791->2415|4820->2416|4853->2422|4908->2450|4936->2451|4972->2460|5000->2461|5031->2465|5079->2485|5108->2486|5145->2496|5334->2658|5362->2659|5390->2660|5423->2665|5452->2666|5483->2670|5538->2698|5566->2699|5596->2702|5624->2703|5657->3572|5686->3573|5738->3597|5754->3603|5818->3645
                  LINES: 26->1|28->3|28->3|29->1|30->3|32->5|32->5|32->5|33->6|45->18|45->18|45->18|46->19|46->19|47->20|49->22|49->22|49->22|51->24|52->25|55->28|59->32|60->33|60->33|61->34|74->47|74->47|77->50|77->50|78->51|80->53|80->53|81->54|83->56|83->56|85->58|85->58|85->58|86->59|88->61|88->61|88->61|88->61|88->61|89->62|90->63|90->63|91->64|93->66|93->66|93->66|93->66|94->67|94->67|94->67|95->68|99->72|99->72|100->73|100->73|101->74|101->74|102->75|103->76|103->76|104->77|104->77|106->79|106->79|106->79|108->81|111->84|111->84|111->84|111->84|111->84|112->85|113->86|113->86|114->87|114->87|116->114|117->115|118->116|118->116|118->116
                  -- GENERATED --
              */
          