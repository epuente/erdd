
package views.html.EvaluacionObservacion

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
object edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Recurso,List[EvaluacionTabla],List[Evaluacion],List[EvaluacionObservacion],Long,EvaluacionObservacionGral,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recurso:Recurso, evt:List[EvaluacionTabla], evr:List[Evaluacion], eo:List[EvaluacionObservacion], evaluador:Long, eog:EvaluacionObservacionGral):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.147*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/System/*4.8*/.out.println("renderrrrrrrrrrrrrrrrrrrrrrrrrrr")),format.raw/*4.56*/("""
"""),_display_(/*5.2*/System/*5.8*/.out.println("evt "+evt.size())),format.raw/*5.39*/("""


"""),_display_(/*8.2*/main/*8.6*/{_display_(Seq[Any](format.raw/*8.7*/("""
	"""),format.raw/*9.2*/("""<div class=container-fluid style="background-color: white; padding: 10px; display:none">
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Recursos</li>
					  <li><a href="/mostrarEvaluacionesPorRevisar/1">Para revisar por el administrador</a></li>
					  <li class="active">Agregar observaciones</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Agregar observaciones al recurso """"),_display_(/*21.54*/recurso/*21.61*/.titulo),format.raw/*21.68*/("""", """),_display_(/*21.72*/recurso/*21.79*/.numcontrol),format.raw/*21.90*/(""" """),format.raw/*21.91*/("""<small>Aspecto: """),_display_(/*21.108*/evr(0)/*21.114*/.recursoevaluador.aspecto.descripcion),format.raw/*21.151*/("""</small></h3>
	  	          <h5>Clasificación: """),_display_(/*22.35*/recurso/*22.42*/.clasificacion.criterio1.descripcion),format.raw/*22.78*/(""" """),format.raw/*22.79*/("""/ """),_display_(/*22.82*/recurso/*22.89*/.clasificacion.criterio2.descripcion),format.raw/*22.125*/(""" """),format.raw/*22.126*/("""/ """),_display_(/*22.129*/recurso/*22.136*/.clasificacion.criterio3.catalogo.descripcion),format.raw/*22.181*/("""</h5>
		        </div>
			</div>	   
			<div class="row">
				<div class="col-lg-12">
					"""),_display_(/*27.7*/form(CSRF(routes.AdminEvaluacionController.saveObservaciones(recurso.id, evt(0).aspecto.id)), 'role -> "form", 'id -> "frmEvaluacion",'style->"background-color: white;")/*27.176*/ {_display_(Seq[Any](format.raw/*27.178*/("""
					    """),format.raw/*28.10*/("""<input type="hidden" name="terminado" value="no">				
						<table class="table table-bordered table-striped">	
							"""),_display_(/*30.9*/for(r <- evt) yield /*30.22*/{_display_(Seq[Any](format.raw/*30.23*/("""
								"""),format.raw/*31.9*/("""<tr>
									<td>
										"""),_display_(/*33.12*/r/*33.13*/.reactivo.id),format.raw/*33.25*/("""									
										"""),_display_(/*34.12*/r/*34.13*/.reactivo.descripcion),format.raw/*34.34*/("""
									"""),format.raw/*35.10*/("""</td>
					        		<td name="celdaCalifica" style="width: 15em;">
					        			<div>
						        			<input type="radio" name="califica"""),_display_(/*38.53*/r/*38.54*/.id),format.raw/*38.57*/("""" value="0" class="activo"> No cumple</br>
						        			<input type="radio" name="califica"""),_display_(/*39.53*/r/*39.54*/.id),format.raw/*39.57*/("""" value="1" class="activo"> Cumple parcialmente</br>
						        			<input type="radio" name="califica"""),_display_(/*40.53*/r/*40.54*/.id),format.raw/*40.57*/("""" value="2" class="activo"> Sí cumple	
					        			</div>
					        			<div name="divNA"""),_display_(/*42.34*/r/*42.35*/.id),format.raw/*42.38*/("""" style="display: none; text-align: center; vertical-align: middle; ">NO APLICA</div>		        			
				             		</td>
				             		<td style="width: 30%">
				             			<textarea name="observacion"""),_display_(/*45.49*/r/*45.50*/.id),format.raw/*45.53*/("""" rows="" cols="30%" style="display:none; min-width: 100%; background-color: #FFFDDD" class="form-control"></textarea>
				             			<br>
				             			<input type="button" name="btnObservacion"""),_display_(/*47.63*/r/*47.64*/.id),format.raw/*47.67*/("""" value="Agregar observación" class="btn btn-primary btn-block center-block" style="width: 70%">
				             			<div class="errorObservacion" style="color:red"></div> 
				             		</td>
								</tr>
							""")))}),format.raw/*51.9*/("""

								"""),format.raw/*53.9*/("""<tr>
									<td colspan="2">
										<label for="txtObservacionGral">Observación General</label>
										<textarea id="txtObservacionGral" name="txtObservacionGral" style="min-width:100%" class="form-control" rows="2" disabled="disabled">
											"""),_display_(/*57.13*/if(eog!=null)/*57.26*/{_display_(Seq[Any](format.raw/*57.27*/("""
												"""),_display_(/*58.14*/eog/*58.17*/.observacion),format.raw/*58.29*/("""
											""")))}),format.raw/*59.13*/("""
										"""),format.raw/*60.11*/("""</textarea>
									</td>
									<td colspan="2">
										<textarea name="observacionobservacionGral" rows="" cols="30%" style="display:none; min-width: 100%; background-color: #FFFDDD; class="form-control"></textarea>
										<br>
										<input type="button" name="btnObservacionobservacionGral" value="Agregar observación" class="btn btn-primary btn-block center-block" style="width: 70%">
										<div class="errorObservacion" style="color:red"></div> 
									</td>									
								</tr>

						</table>	
						<div class="center-block" style="width: 50%"> 
							<input type="submit" value="Correcto, sin observaciones" class="btn primary btn-success btn-block btn-lg"  id="btnObservar">
						</div>
					""")))}),format.raw/*74.7*/("""
				"""),format.raw/*75.5*/("""</div>
			</div>
	</div>

""")))}),format.raw/*79.2*/("""


"""),format.raw/*82.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*83.15*/("""{"""),format.raw/*83.16*/("""
		"""),format.raw/*84.3*/("""$("[name*='califica']").attr("readonly", true);
		$("[name*='califica']").prop("disabled", true);
		leer();		
		$("textarea[name*='observacion']").keyup();
		$(".container-fluid").show();
	"""),format.raw/*89.2*/("""}"""),format.raw/*89.3*/(""");
	
	$( document ).on( "click", "input[name*='btnObservacion']", function() """),format.raw/*91.73*/("""{"""),format.raw/*91.74*/("""	
		"""),format.raw/*92.3*/("""var id = this.name.substring(14);
		if ( $("[name='observacion"+id+"']")  .css("display") == "none"  )"""),format.raw/*93.69*/("""{"""),format.raw/*93.70*/("""
			"""),format.raw/*94.4*/("""$("[name='observacion"+id+"']").show();
			$("[name='btnObservacion"+id+"']").val("Quitar observación");
			$("[name='btnObservacion"+id+"']").removeClass("btn-primary").addClass("btn-danger");
			$(this).parent().find("div.errorObservacion").hide();

		"""),format.raw/*99.3*/("""}"""),format.raw/*99.4*/(""" """),format.raw/*99.5*/("""else """),format.raw/*99.10*/("""{"""),format.raw/*99.11*/("""
			"""),format.raw/*100.4*/("""$("[name='observacion"+id+"']").hide();	
			$("[name='observacion"+id+"']").val("");			
			$("[name='btnObservacion"+id+"']").val("Agregar observación");
			$("[name='btnObservacion"+id+"']").addClass("btn-primary").removeClass("btn-danger");
			$(this).parent().find("div.errorObservacion").hide();
		"""),format.raw/*105.3*/("""}"""),format.raw/*105.4*/("""
		"""),format.raw/*106.3*/("""$(this).parent().find("div.errorObservacion").removeClass("error");
		$("[name='observacion"+id+"']").css("border-color","");			
		
		$("textarea[name*='observacion']").keyup();
	"""),format.raw/*110.2*/("""}"""),format.raw/*110.3*/(""");	
	
	function leer()"""),format.raw/*112.17*/("""{"""),format.raw/*112.18*/("""

		"""),_display_(/*114.4*/for(resp <- evr) yield /*114.20*/{_display_(Seq[Any](format.raw/*114.21*/("""			
			"""),format.raw/*115.4*/("""// console.log("""),_display_(/*115.20*/resp/*115.24*/.respuesta),format.raw/*115.34*/(""")
			 console.log("""),_display_(/*116.18*/resp/*116.22*/.evaluaciontabla.id),format.raw/*116.41*/(""")
			 if ("""),_display_(/*117.10*/resp/*117.14*/.respuesta),format.raw/*117.24*/(""" """),format.raw/*117.25*/("""== -1)"""),format.raw/*117.31*/("""{"""),format.raw/*117.32*/("""
				 """),format.raw/*118.6*/("""$("input[name='califica"""),_display_(/*118.30*/resp/*118.34*/.evaluaciontabla.id),format.raw/*118.53*/("""']").parent().css("display",'none');
				 $("[name='divNA"""),_display_(/*119.22*/resp/*119.26*/.evaluaciontabla.id),format.raw/*119.45*/("""']").show();
			 """),format.raw/*120.5*/("""}"""),format.raw/*120.6*/(""" """),format.raw/*120.7*/("""else """),format.raw/*120.12*/("""{"""),format.raw/*120.13*/("""				 
			 	"""),format.raw/*121.6*/("""$("input[name='califica"""),_display_(/*121.30*/resp/*121.34*/.evaluaciontabla.id),format.raw/*121.53*/("""'][value='"""),_display_(/*121.64*/resp/*121.68*/.respuesta),format.raw/*121.78*/("""']").prop("checked",true);
			 """),format.raw/*122.5*/("""}"""),format.raw/*122.6*/("""
		""")))}),format.raw/*123.4*/("""
		"""),_display_(/*124.4*/for(observa <- eo) yield /*124.22*/{_display_(Seq[Any](format.raw/*124.23*/("""			
			"""),format.raw/*125.4*/("""$("[name='observacion"""),_display_(/*125.26*/observa/*125.33*/.respuesta.evaluaciontabla.id),format.raw/*125.62*/("""']").val(""""),_display_(/*125.73*/observa/*125.80*/.Observacion),format.raw/*125.92*/("""");
			$("[name='observacion"""),_display_(/*126.26*/observa/*126.33*/.respuesta.evaluaciontabla.id),format.raw/*126.62*/("""']").show()
			$("[name='btnObservacion"""),_display_(/*127.29*/observa/*127.36*/.respuesta.evaluaciontabla.id),format.raw/*127.65*/("""']").show()
			$("[name='observacion"""),_display_(/*128.26*/observa/*128.33*/.respuesta.evaluaciontabla.id),format.raw/*128.62*/("""']").prop("title",""""),_display_(/*128.82*/observa/*128.89*/.respuesta.id),format.raw/*128.102*/("""");
			$("[name='btnObservacion"""),_display_(/*129.29*/observa/*129.36*/.respuesta.evaluaciontabla.id),format.raw/*129.65*/("""']").val("Quitar observación");
			$("[name='btnObservacion"""),_display_(/*130.29*/observa/*130.36*/.respuesta.evaluaciontabla.id),format.raw/*130.65*/("""']").addClass("btn-danger").removeClass("btn-primary")
		""")))}),format.raw/*131.4*/("""
		
		"""),format.raw/*133.3*/("""// Observacion a la observación general  
		
		"""),_display_(/*135.4*/if(eog != null)/*135.19*/{_display_(Seq[Any](format.raw/*135.20*/("""
			"""),format.raw/*136.4*/("""//$("[name='txtObservacionGral']").val(""""),_display_(/*136.45*/eog/*136.48*/.observacion.filter(_ >= ' ')),format.raw/*136.77*/("""");
			
			"""),_display_(/*138.5*/if(eog.observacionobservaciongral != null)/*138.47*/{_display_(Seq[Any](format.raw/*138.48*/("""
				"""),_display_(/*139.6*/if(eog.observacionobservaciongral.observacion != null)/*139.60*/{_display_(Seq[Any](format.raw/*139.61*/("""
					"""),format.raw/*140.6*/("""$("[name='observacionobservacionGral']").val(""""),_display_(/*140.53*/eog/*140.56*/.observacionobservaciongral.observacion),format.raw/*140.95*/("""");
					$("[name='observacionobservacionGral']").show();
					$("[name='btnObservacionobservacionGral']").val("Quitar observación");
					$("[name='btnObservacionobservacionGral']").removeClass("btn-primary").addClass("btn-danger");			
				""")))}),format.raw/*144.6*/("""
			""")))}),format.raw/*145.5*/("""
		""")))}),format.raw/*146.4*/("""
		

	"""),format.raw/*149.2*/("""}"""),format.raw/*149.3*/("""
"""),format.raw/*150.1*/("""//	******************************************
	$("textarea[name*='observacion']").keyup(function() """),format.raw/*151.54*/("""{"""),format.raw/*151.55*/("""
		"""),format.raw/*152.3*/("""var conObservaciones = false;
		$("textarea[name*='observacion']").each(function()"""),format.raw/*153.53*/("""{"""),format.raw/*153.54*/("""		
			"""),format.raw/*154.4*/("""if ($(this).val().length != 0)"""),format.raw/*154.34*/("""{"""),format.raw/*154.35*/("""
				"""),format.raw/*155.5*/("""conObservaciones = true;
				return false;
			"""),format.raw/*157.4*/("""}"""),format.raw/*157.5*/("""
		"""),format.raw/*158.3*/("""}"""),format.raw/*158.4*/(""");
		
		if (conObservaciones)"""),format.raw/*160.24*/("""{"""),format.raw/*160.25*/("""
			"""),format.raw/*161.4*/("""$("#btnObservar").removeClass("btn-success").addClass("btn-primary");			
			$("#btnObservar").val("Guardar observaciones");
			$("input[name='terminado']").val("no");
			
		"""),format.raw/*165.3*/("""}"""),format.raw/*165.4*/(""" """),format.raw/*165.5*/("""else """),format.raw/*165.10*/("""{"""),format.raw/*165.11*/("""
			"""),format.raw/*166.4*/("""$("#btnObservar").removeClass("btn-primary").addClass("btn-success");
			$("#btnObservar").val("Correcto, sin observaciones");
			$("input[name='terminado']").val("si");
		"""),format.raw/*169.3*/("""}"""),format.raw/*169.4*/("""

	"""),format.raw/*171.2*/("""}"""),format.raw/*171.3*/(""");

	
	$("#frmEvaluacion").submit(function(event)"""),format.raw/*174.44*/("""{"""),format.raw/*174.45*/("""
	
		"""),format.raw/*176.3*/("""var x = $(".error");
		if (x.length != 0)"""),format.raw/*177.21*/("""{"""),format.raw/*177.22*/("""
			"""),format.raw/*178.4*/("""alert("Algunas observaciones tienen errores, se aceptan hasta 600 caracteres para cada observación");
			event.preventDefault();
		"""),format.raw/*180.3*/("""}"""),format.raw/*180.4*/(""" """),format.raw/*180.5*/("""else """),format.raw/*180.10*/("""{"""),format.raw/*180.11*/("""
			"""),format.raw/*181.4*/("""$("textarea[name='observacionobservacionGral']").keyup();
	 		
	 	"""),format.raw/*183.4*/("""}"""),format.raw/*183.5*/("""
	"""),format.raw/*184.2*/("""}"""),format.raw/*184.3*/(""");
	
	$(document).on("keydown change blur", "textarea", function(event)"""),format.raw/*186.67*/("""{"""),format.raw/*186.68*/("""
		"""),format.raw/*187.3*/("""var actual = 	$(this);
		var tam = actual.val().length;
		if (tam >= 600)"""),format.raw/*189.18*/("""{"""),format.raw/*189.19*/("""
			"""),format.raw/*190.4*/("""console.log("tam excedido");
			if ( (event.which != 8  && event.which != 46  ))
				event.preventDefault();
			actual.css("border-color","#FF0000");			
			actual.parent().find("div.errorObservacion").html("Este campo de observaciones ha excedido los 600 caracteres").show();
			actual.parent().find("div.errorObservacion").addClass("error");
			
		"""),format.raw/*197.3*/("""}"""),format.raw/*197.4*/(""" """),format.raw/*197.5*/("""else """),format.raw/*197.10*/("""{"""),format.raw/*197.11*/("""
			"""),format.raw/*198.4*/("""actual.css("border-color","");			
			actual.parent().find("div.errorObservacion").hide();	
			actual.parent().find("div.errorObservacion").removeClass("error");
		"""),format.raw/*201.3*/("""}"""),format.raw/*201.4*/("""
	"""),format.raw/*202.2*/("""}"""),format.raw/*202.3*/(""");	
	
	
	
</script>
"""))}
  }

  def render(recurso:Recurso,evt:List[EvaluacionTabla],evr:List[Evaluacion],eo:List[EvaluacionObservacion],evaluador:Long,eog:EvaluacionObservacionGral): play.twirl.api.HtmlFormat.Appendable = apply(recurso,evt,evr,eo,evaluador,eog)

  def f:((Recurso,List[EvaluacionTabla],List[Evaluacion],List[EvaluacionObservacion],Long,EvaluacionObservacionGral) => play.twirl.api.HtmlFormat.Appendable) = (recurso,evt,evr,eo,evaluador,eog) => apply(recurso,evt,evr,eo,evaluador,eog)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/EvaluacionObservacion/edit.scala.html
                  HASH: 8aa91ce7b9fd4f888128280c82073fc53bb79ce9
                  MATRIX: 843->1|1092->146|1119->164|1146->166|1159->172|1227->220|1254->222|1267->228|1318->259|1347->263|1358->267|1395->268|1423->270|1929->749|1945->756|1973->763|2004->767|2020->774|2052->785|2081->786|2126->803|2142->809|2201->846|2276->894|2292->901|2349->937|2378->938|2408->941|2424->948|2482->984|2512->985|2543->988|2560->995|2627->1040|2745->1132|2924->1301|2965->1303|3003->1313|3149->1433|3178->1446|3217->1447|3253->1456|3310->1486|3320->1487|3353->1499|3401->1520|3411->1521|3453->1542|3491->1552|3660->1694|3670->1695|3694->1698|3816->1793|3826->1794|3850->1797|3982->1902|3992->1903|4016->1906|4138->2001|4148->2002|4172->2005|4414->2220|4424->2221|4448->2224|4681->2430|4691->2431|4715->2434|4965->2654|5002->2664|5286->2921|5308->2934|5347->2935|5388->2949|5400->2952|5433->2964|5477->2977|5516->2988|6273->3715|6305->3720|6362->3747|6392->3750|6466->3796|6495->3797|6525->3800|6741->3989|6769->3990|6874->4067|6903->4068|6934->4072|7064->4174|7093->4175|7124->4179|7405->4433|7433->4434|7461->4435|7494->4440|7523->4441|7555->4445|7885->4747|7914->4748|7945->4751|8152->4930|8181->4931|8232->4953|8262->4954|8294->4959|8327->4975|8367->4976|8402->4983|8446->4999|8460->5003|8492->5013|8539->5032|8553->5036|8594->5055|8633->5066|8647->5070|8679->5080|8709->5081|8744->5087|8774->5088|8808->5094|8860->5118|8874->5122|8915->5141|9001->5199|9015->5203|9056->5222|9101->5239|9130->5240|9159->5241|9193->5246|9223->5247|9262->5258|9314->5282|9328->5286|9369->5305|9408->5316|9422->5320|9454->5330|9513->5361|9542->5362|9577->5366|9608->5370|9643->5388|9683->5389|9718->5396|9768->5418|9785->5425|9836->5454|9875->5465|9892->5472|9926->5484|9983->5513|10000->5520|10051->5549|10119->5589|10136->5596|10187->5625|10252->5662|10269->5669|10320->5698|10368->5718|10385->5725|10421->5738|10481->5770|10498->5777|10549->5806|10637->5866|10654->5873|10705->5902|10794->5960|10828->5966|10903->6014|10928->6029|10968->6030|11000->6034|11069->6075|11082->6078|11133->6107|11172->6119|11224->6161|11264->6162|11297->6168|11361->6222|11401->6223|11435->6229|11510->6276|11523->6279|11584->6318|11857->6560|11893->6565|11928->6569|11962->6575|11991->6576|12020->6577|12148->6676|12178->6677|12209->6680|12320->6762|12350->6763|12384->6769|12443->6799|12473->6800|12506->6805|12580->6851|12609->6852|12640->6855|12669->6856|12727->6885|12757->6886|12789->6890|12990->7063|13019->7064|13048->7065|13082->7070|13112->7071|13144->7075|13344->7247|13373->7248|13404->7251|13433->7252|13511->7301|13541->7302|13574->7307|13644->7348|13674->7349|13706->7353|13865->7484|13894->7485|13923->7486|13957->7491|13987->7492|14019->7496|14113->7562|14142->7563|14172->7565|14201->7566|14301->7637|14331->7638|14362->7641|14464->7714|14494->7715|14526->7719|14903->8068|14932->8069|14961->8070|14995->8075|15025->8076|15057->8080|15248->8243|15277->8244|15307->8246|15336->8247
                  LINES: 26->1|29->1|30->3|31->4|31->4|31->4|32->5|32->5|32->5|35->8|35->8|35->8|36->9|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|48->21|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|49->22|54->27|54->27|54->27|55->28|57->30|57->30|57->30|58->31|60->33|60->33|60->33|61->34|61->34|61->34|62->35|65->38|65->38|65->38|66->39|66->39|66->39|67->40|67->40|67->40|69->42|69->42|69->42|72->45|72->45|72->45|74->47|74->47|74->47|78->51|80->53|84->57|84->57|84->57|85->58|85->58|85->58|86->59|87->60|101->74|102->75|106->79|109->82|110->83|110->83|111->84|116->89|116->89|118->91|118->91|119->92|120->93|120->93|121->94|126->99|126->99|126->99|126->99|126->99|127->100|132->105|132->105|133->106|137->110|137->110|139->112|139->112|141->114|141->114|141->114|142->115|142->115|142->115|142->115|143->116|143->116|143->116|144->117|144->117|144->117|144->117|144->117|144->117|145->118|145->118|145->118|145->118|146->119|146->119|146->119|147->120|147->120|147->120|147->120|147->120|148->121|148->121|148->121|148->121|148->121|148->121|148->121|149->122|149->122|150->123|151->124|151->124|151->124|152->125|152->125|152->125|152->125|152->125|152->125|152->125|153->126|153->126|153->126|154->127|154->127|154->127|155->128|155->128|155->128|155->128|155->128|155->128|156->129|156->129|156->129|157->130|157->130|157->130|158->131|160->133|162->135|162->135|162->135|163->136|163->136|163->136|163->136|165->138|165->138|165->138|166->139|166->139|166->139|167->140|167->140|167->140|167->140|171->144|172->145|173->146|176->149|176->149|177->150|178->151|178->151|179->152|180->153|180->153|181->154|181->154|181->154|182->155|184->157|184->157|185->158|185->158|187->160|187->160|188->161|192->165|192->165|192->165|192->165|192->165|193->166|196->169|196->169|198->171|198->171|201->174|201->174|203->176|204->177|204->177|205->178|207->180|207->180|207->180|207->180|207->180|208->181|210->183|210->183|211->184|211->184|213->186|213->186|214->187|216->189|216->189|217->190|224->197|224->197|224->197|224->197|224->197|225->198|228->201|228->201|229->202|229->202
                  -- GENERATED --
              */
          