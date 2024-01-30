
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
object atender extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Recurso,List[EvaluacionTabla],List[Evaluacion],List[EvaluacionObservacion],EvaluacionObservacionGral,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recurso:Recurso, evt:List[EvaluacionTabla], evr:List[Evaluacion], eo:List[EvaluacionObservacion], eog:EvaluacionObservacionGral):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.131*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.at("stylesheets/simple-sidebar.css")),format.raw/*4.96*/(""""/>

"""),_display_(/*6.2*/main/*6.6*/{_display_(Seq[Any](format.raw/*6.7*/("""
	"""),format.raw/*7.2*/("""<div class=container-fluid style="background-color: white; padding: 10px; display:none">
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Mis asignaciones</li>
					  <li class="active">Atender observaciones</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Atender observaciones del aspecto """),_display_(/*18.54*/evr(0)/*18.60*/.recursoevaluador.aspecto.descripcion),format.raw/*18.97*/(""" """),format.raw/*18.98*/("""al recurso """"),_display_(/*18.111*/recurso/*18.118*/.titulo),format.raw/*18.125*/(""""  -"""),_display_(/*18.130*/recurso/*18.137*/.numcontrol),format.raw/*18.148*/("""-</h3>
	  	          Clasificado como: """),_display_(/*19.34*/recurso/*19.41*/.clasificacion.criterio1.descripcion),format.raw/*19.77*/(""" """),format.raw/*19.78*/("""/ """),_display_(/*19.81*/recurso/*19.88*/.clasificacion.criterio2.descripcion),format.raw/*19.124*/(""" """),format.raw/*19.125*/("""/ """),_display_(/*19.128*/recurso/*19.135*/.clasificacion.criterio3.catalogo.descripcion),format.raw/*19.180*/("""<br>
	  	          Tipo de recurso: """),_display_(/*20.33*/recurso/*20.40*/.clasificacion.tiporecurso.descripcion),format.raw/*20.78*/(""" 
		        """),format.raw/*21.11*/("""</div>
			</div>	   
			
			<div class="row">
				<div class="col-lg-2">
					<br>
					<h3 style="display:none">
					<span class="badge" id="bdg"""),_display_(/*28.34*/evr(0)/*28.40*/.recursoevaluador.aspecto.id),format.raw/*28.68*/(""""  data-toggle="popover" data-title="Detalle de calificación" data-trigger="hover" title="Calificación" ></span>
					</h3>
					<div id="conteoAspecto"></div>				
				</div>
				<div class="col-lg-10">
					<div class="row">
						<div class="col-lg-12">
							"""),_display_(/*35.9*/form(CSRF(routes.EvaluacionEvaluadorController.saveObservaciones(recurso.id, evt(0).aspecto.id)), 'role -> "form", 'id -> "frmEvaluacion",'style->"background-color: white;")/*35.182*/ {_display_(Seq[Any](format.raw/*35.184*/("""
							    """),format.raw/*36.12*/("""<input type="text" name="terminado" value="no" style="display: none;">				
								<table class="table table-bordered table-striped">	
									"""),_display_(/*38.11*/for(r <- evt) yield /*38.24*/{_display_(Seq[Any](format.raw/*38.25*/("""
										"""),format.raw/*39.11*/("""<tr>
											<td>
												"""),_display_(/*41.14*/r/*41.15*/.reactivo.id),format.raw/*41.27*/(""" 
												"""),_display_(/*42.14*/r/*42.15*/.reactivo.descripcion),format.raw/*42.36*/("""
											"""),format.raw/*43.12*/("""</td>
							        		<td name="celdaCalifica" style="width: 15em;">
							        			<div>
							        			    <input type="radio" name="califica"""),_display_(/*46.58*/r/*46.59*/.id),format.raw/*46.62*/("""" value="-1" class="activo"> No aplica</br>
								        			<input type="radio" name="califica"""),_display_(/*47.55*/r/*47.56*/.id),format.raw/*47.59*/("""" value="0" class="activo"> No cumple</br>
								        			<input type="radio" name="califica"""),_display_(/*48.55*/r/*48.56*/.id),format.raw/*48.59*/("""" value="1" class="activo"> Cumple parcialmente</br>
								        			<input type="radio" name="califica"""),_display_(/*49.55*/r/*49.56*/.id),format.raw/*49.59*/("""" value="2" class="activo"> Sí cumple	
							        			</div>
							        			<div name="divNA"""),_display_(/*51.36*/r/*51.37*/.id),format.raw/*51.40*/("""" style="display: none; text-align: center; vertical-align: middle; ">NO APLICA</div>		        			
						             		</td>
						             		<td style="width: 30%"> 
						             			<textarea name="observacion"""),_display_(/*54.51*/r/*54.52*/.id),format.raw/*54.55*/("""" rows="" cols="30%" style="display: none; min-width: 100%; background-color: #FFFDDD" disabled="disabled" readonly="readonly" class="form-control"  ></textarea>
						             			<br>
						             			<input type="button" name="btnObservacion"""),_display_(/*56.65*/r/*56.66*/.id),format.raw/*56.69*/("""" value="Atender observación" style="display: none; width: 70%"  class="btn btn-primary btn-block center-block">
						             		</td>
										</tr>
									""")))}),format.raw/*59.11*/("""
									"""),format.raw/*60.10*/("""<tr>
										<td colspan="2">
											<textarea rows="" cols="" class="form-control" style="min-width: 100%" readonly="readonly" name="observacionGral">"""),_display_(/*62.127*/if(eog!=null)/*62.140*/{_display_(_display_(/*62.142*/eog/*62.145*/.observacion))}),format.raw/*62.158*/("""</textarea>
										</td>	
					             		<td style="width: 30%"> 
					             			<textarea name="observacionobservacionGral" rows="" cols="30%" style="display: none; min-width: 100%;  background-color: #FFFDDD" disabled="disabled" readonly="readonly" class="form-control"   >"""),_display_(/*65.217*/if(eog!=null)/*65.230*/{_display_(_display_(/*65.232*/if(eog.observacionobservaciongral!=null)/*65.272*/{_display_(_display_(/*65.274*/eog/*65.277*/.observacionobservaciongral.observacion))}))}),format.raw/*65.318*/("""</textarea>
					             			<br>
					             			<input type="button" name="btnObservacionGral" value="Atender observación" style="display: none; width: 70%"  class="btn btn-primary btn-block center-block">
					             		</td>
									</tr>
								</table>	
								<div class="center-block" style="width: 50%"> 
									<input type="submit" value="Enviar correciones" class="btn primary btn-primary btn-block"  id="btnObservar">
								</div>
							""")))}),format.raw/*74.9*/("""
						"""),format.raw/*75.7*/("""</div>
					</div>
				</div>
	</div>
</div>

""")))}),format.raw/*81.2*/("""


"""),format.raw/*84.1*/("""<script type="text/javascript">
	$(document).ready(function() """),format.raw/*85.31*/("""{"""),format.raw/*85.32*/("""
		"""),format.raw/*86.3*/("""$("[name*='califica']").attr("readonly", true);
		$("[name*='califica']").prop("disabled", true);
		leer();		
		$(".container-fluid").show();
		recuento();		
	"""),format.raw/*91.2*/("""}"""),format.raw/*91.3*/(""");
	
	$( document ).on( "click", "input[name^='btnObservacion']", function() """),format.raw/*93.73*/("""{"""),format.raw/*93.74*/("""	
		"""),format.raw/*94.3*/("""var id = this.name.substring(14);
		$("[name='califica"+id+"']").prop("disabled",false);
		$("[name='califica"+id+"']").prop("readonly",false);
		$("[name='califica"+id+"']").parent().show();
		
		// Observación general
		if ( $(this).attr("name")=="btnObservacionGral"  )"""),format.raw/*100.53*/("""{"""),format.raw/*100.54*/("""
			"""),format.raw/*101.4*/("""$("[name='observacionGral']").prop("disabled",false);
			$("[name='observacionGral']").prop("readonly",false);
			$("[name='observacionGral']").parent().show();		
			$("[name='observacionGral']").focus();
		"""),format.raw/*105.3*/("""}"""),format.raw/*105.4*/("""
	"""),format.raw/*106.2*/("""}"""),format.raw/*106.3*/(""");
	

	
	function leer()"""),format.raw/*110.17*/("""{"""),format.raw/*110.18*/("""
		"""),_display_(/*111.4*/for(resp <- evr) yield /*111.20*/{_display_(Seq[Any](format.raw/*111.21*/("""
			"""),format.raw/*112.4*/("""console.log("respuesta  """),_display_(/*112.29*/resp/*112.33*/.evaluaciontabla.id),format.raw/*112.52*/("""")
		 	$("input[name='califica"""),_display_(/*113.29*/resp/*113.33*/.evaluaciontabla.id),format.raw/*113.52*/("""'][value='"""),_display_(/*113.63*/resp/*113.67*/.respuesta),format.raw/*113.77*/("""']").prop("checked",true);
		""")))}),format.raw/*114.4*/("""
		"""),_display_(/*115.4*/for(observa <- eo) yield /*115.22*/{_display_(Seq[Any](format.raw/*115.23*/("""
			"""),format.raw/*116.4*/("""$("[name='observacion"""),_display_(/*116.26*/observa/*116.33*/.respuesta.evaluaciontabla.id),format.raw/*116.62*/("""']").val('"""),_display_(/*116.73*/observa/*116.80*/.Observacion.filter(_ >= ' ')),format.raw/*116.109*/(""" """),format.raw/*116.110*/("""');
			$("[name='observacion"""),_display_(/*117.26*/observa/*117.33*/.respuesta.evaluaciontabla.id),format.raw/*117.62*/("""']").show()
			$("[name='btnObservacion"""),_display_(/*118.29*/observa/*118.36*/.respuesta.evaluaciontabla.id),format.raw/*118.65*/("""']").show()
			$("[name='observacion"""),_display_(/*119.26*/observa/*119.33*/.respuesta.evaluaciontabla.id),format.raw/*119.62*/("""']").prop("title",""""),_display_(/*119.82*/observa/*119.89*/.respuesta.id),format.raw/*119.102*/("""")
		""")))}),format.raw/*120.4*/("""
		
		"""),_display_(/*122.4*/if(eog!=null )/*122.18*/{_display_(Seq[Any](format.raw/*122.19*/("""		
			"""),_display_(/*123.5*/if(eog.observacionobservaciongral!= null)/*123.46*/{_display_(Seq[Any](format.raw/*123.47*/("""
			"""),format.raw/*124.4*/("""/////	$("[name='observacionobservacionGral']").val(""""),_display_(/*124.57*/eog/*124.60*/.observacionobservaciongral.observacion.filter(_ >= ' ')),format.raw/*124.116*/("""");
				$("[name='observacionobservacionGral']").show();
				$("[name='btnObservacionGral']").show();
			""")))}),format.raw/*127.5*/("""
		""")))}),format.raw/*128.4*/("""
	"""),format.raw/*129.2*/("""}"""),format.raw/*129.3*/("""
	
	
	"""),format.raw/*132.2*/("""function recuento()"""),format.raw/*132.21*/("""{"""),format.raw/*132.22*/("""
		"""),format.raw/*133.3*/("""ac = null;
		noAplica = 0; 
		cal = null;
		ac = parseInt("0");
		$("input[type='radio'][name^='califica']:checked").each(function()"""),format.raw/*137.69*/("""{"""),format.raw/*137.70*/("""
			"""),format.raw/*138.4*/("""if ( $(this).val() != -1  )"""),format.raw/*138.31*/("""{"""),format.raw/*138.32*/("""
				"""),format.raw/*139.5*/("""ac+= parseInt($(this).val());
			"""),format.raw/*140.4*/("""}"""),format.raw/*140.5*/(""" """),format.raw/*140.6*/("""else """),format.raw/*140.11*/("""{"""),format.raw/*140.12*/("""
				"""),format.raw/*141.5*/("""noAplica++;
			"""),format.raw/*142.4*/("""}"""),format.raw/*142.5*/("""
		"""),format.raw/*143.3*/("""}"""),format.raw/*143.4*/(""");
		cal = Math.round((ac*25)/(   ($("input[type='radio'][name^='califica']:checked").length-noAplica)*2));			
	

		(cal!=null)?$("#bdg"""),_display_(/*147.23*/evr(0)/*147.29*/.recursoevaluador.aspecto.id),format.raw/*147.57*/("""").html(cal):"";
		
		if (cal != null)"""),format.raw/*149.19*/("""{"""),format.raw/*149.20*/("""
			"""),format.raw/*150.4*/("""$("#bdg"""),_display_(/*150.12*/evr(0)/*150.18*/.recursoevaluador.aspecto.id),format.raw/*150.46*/("""").html(cal);
			var activos = $("input[type='radio'][name*='califica']:checked").length - noAplica;
			var inactivos =          noAplica;
			var noCumple =           $("input[type='radio'][name*='califica'][value='0'].activo:checked").length;
			var parcialmenteCumple = $("input[type='radio'][name*='califica'][value='1'].activo:checked").length;
			var siCumple =           $("input[type='radio'][name*='califica'][value='2'].activo:checked ").length;
			
			$('[data-toggle="popover"]').attr("data-content","Total de reactivos: "+(activos+noAplica)+"<hr>"+
															 "No aplican: "+inactivos+"</br>"+
															 "No cumple: "+noCumple+"</br>"+
															 "Cumple parcialmente: "+parcialmenteCumple+"</br>"+
															 "Sí cumple: "+siCumple+"<hr>"+
															 "Calificación obtenida aspecto """),_display_(/*162.49*/evr(0)/*162.55*/.recursoevaluador.aspecto.descripcion),format.raw/*162.92*/(""": "+cal);				
		"""),format.raw/*163.3*/("""}"""),format.raw/*163.4*/("""
		"""),format.raw/*164.3*/("""$("#bdg"""),_display_(/*164.11*/evr(0)/*164.17*/.recursoevaluador.aspecto.id),format.raw/*164.45*/("""").toggle( cal != null );
		$("#conteoAspecto").html( $("#bdg"""),_display_(/*165.37*/evr(0)/*165.43*/.recursoevaluador.aspecto.id),format.raw/*165.71*/("""").attr('data-content')  );
	"""),format.raw/*166.2*/("""}"""),format.raw/*166.3*/("""	
	
	"""),format.raw/*168.2*/("""$( document ).on( "click", "input[name^='califica']", function() """),format.raw/*168.67*/("""{"""),format.raw/*168.68*/("""
		"""),format.raw/*169.3*/("""recuento();
	"""),format.raw/*170.2*/("""}"""),format.raw/*170.3*/(""");	
	
</script>
"""))}
  }

  def render(recurso:Recurso,evt:List[EvaluacionTabla],evr:List[Evaluacion],eo:List[EvaluacionObservacion],eog:EvaluacionObservacionGral): play.twirl.api.HtmlFormat.Appendable = apply(recurso,evt,evr,eo,eog)

  def f:((Recurso,List[EvaluacionTabla],List[Evaluacion],List[EvaluacionObservacion],EvaluacionObservacionGral) => play.twirl.api.HtmlFormat.Appendable) = (recurso,evt,evr,eo,eog) => apply(recurso,evt,evr,eo,eog)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/EvaluacionObservacion/atender.scala.html
                  HASH: 802d2c941a4c6ea0bb960d67c41c0d93dd9eb5ef
                  MATRIX: 841->1|1074->130|1101->148|1128->149|1199->194|1213->200|1277->244|1308->250|1319->254|1356->255|1384->257|1801->647|1816->653|1874->690|1903->691|1944->704|1961->711|1990->718|2023->723|2040->730|2073->741|2140->781|2156->788|2213->824|2242->825|2272->828|2288->835|2346->871|2376->872|2407->875|2424->882|2491->927|2555->964|2571->971|2630->1009|2670->1021|2844->1168|2859->1174|2908->1202|3198->1466|3381->1639|3422->1641|3462->1653|3634->1798|3663->1811|3702->1812|3741->1823|3802->1857|3812->1858|3845->1870|3887->1885|3897->1886|3939->1907|3979->1919|4157->2070|4167->2071|4191->2074|4316->2172|4326->2173|4350->2176|4474->2273|4484->2274|4508->2277|4642->2384|4652->2385|4676->2388|4802->2487|4812->2488|4836->2491|5085->2713|5095->2714|5119->2717|5399->2970|5409->2971|5433->2974|5630->3140|5668->3150|5854->3308|5877->3321|5908->3323|5921->3326|5958->3339|6276->3629|6299->3642|6330->3644|6380->3684|6411->3686|6424->3689|6491->3730|6993->4202|7027->4209|7104->4256|7134->4259|7224->4321|7253->4322|7283->4325|7469->4484|7497->4485|7602->4562|7631->4563|7662->4567|7963->4839|7993->4840|8025->4844|8260->5051|8289->5052|8319->5054|8348->5055|8401->5079|8431->5080|8462->5084|8495->5100|8535->5101|8567->5105|8620->5130|8634->5134|8675->5153|8734->5184|8748->5188|8789->5207|8828->5218|8842->5222|8874->5232|8935->5262|8966->5266|9001->5284|9041->5285|9073->5289|9123->5311|9140->5318|9191->5347|9230->5358|9247->5365|9299->5394|9330->5395|9387->5424|9404->5431|9455->5460|9523->5500|9540->5507|9591->5536|9656->5573|9673->5580|9724->5609|9772->5629|9789->5636|9825->5649|9862->5655|9896->5662|9920->5676|9960->5677|9994->5684|10045->5725|10085->5726|10117->5730|10198->5783|10211->5786|10290->5842|10427->5948|10462->5952|10492->5954|10521->5955|10555->5961|10603->5980|10633->5981|10664->5984|10825->6116|10855->6117|10887->6121|10943->6148|10973->6149|11006->6154|11067->6187|11096->6188|11125->6189|11159->6194|11189->6195|11222->6200|11265->6215|11294->6216|11325->6219|11354->6220|11518->6356|11534->6362|11584->6390|11651->6428|11681->6429|11713->6433|11749->6441|11765->6447|11815->6475|12665->7297|12681->7303|12740->7340|12784->7356|12813->7357|12844->7360|12880->7368|12896->7374|12946->7402|13036->7464|13052->7470|13102->7498|13159->7527|13188->7528|13221->7533|13315->7598|13345->7599|13376->7602|13417->7615|13446->7616
                  LINES: 26->1|29->1|30->3|31->4|31->4|31->4|31->4|33->6|33->6|33->6|34->7|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|45->18|46->19|46->19|46->19|46->19|46->19|46->19|46->19|46->19|46->19|46->19|46->19|47->20|47->20|47->20|48->21|55->28|55->28|55->28|62->35|62->35|62->35|63->36|65->38|65->38|65->38|66->39|68->41|68->41|68->41|69->42|69->42|69->42|70->43|73->46|73->46|73->46|74->47|74->47|74->47|75->48|75->48|75->48|76->49|76->49|76->49|78->51|78->51|78->51|81->54|81->54|81->54|83->56|83->56|83->56|86->59|87->60|89->62|89->62|89->62|89->62|89->62|92->65|92->65|92->65|92->65|92->65|92->65|92->65|101->74|102->75|108->81|111->84|112->85|112->85|113->86|118->91|118->91|120->93|120->93|121->94|127->100|127->100|128->101|132->105|132->105|133->106|133->106|137->110|137->110|138->111|138->111|138->111|139->112|139->112|139->112|139->112|140->113|140->113|140->113|140->113|140->113|140->113|141->114|142->115|142->115|142->115|143->116|143->116|143->116|143->116|143->116|143->116|143->116|143->116|144->117|144->117|144->117|145->118|145->118|145->118|146->119|146->119|146->119|146->119|146->119|146->119|147->120|149->122|149->122|149->122|150->123|150->123|150->123|151->124|151->124|151->124|151->124|154->127|155->128|156->129|156->129|159->132|159->132|159->132|160->133|164->137|164->137|165->138|165->138|165->138|166->139|167->140|167->140|167->140|167->140|167->140|168->141|169->142|169->142|170->143|170->143|174->147|174->147|174->147|176->149|176->149|177->150|177->150|177->150|177->150|189->162|189->162|189->162|190->163|190->163|191->164|191->164|191->164|191->164|192->165|192->165|192->165|193->166|193->166|195->168|195->168|195->168|196->169|197->170|197->170
                  -- GENERATED --
              */
          