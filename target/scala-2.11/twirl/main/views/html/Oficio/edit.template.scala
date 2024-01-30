
package views.html.Oficio

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
object edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Oficio],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, forma : Form[Oficio]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*2.2*/implicitFieldConstructor/*2.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.34*/("""
"""),format.raw/*2.77*/(""" 

 """),format.raw/*4.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.47*/routes/*4.53*/.Assets.at("stylesheets/recurso.css")),format.raw/*4.90*/(""""/>
  <script src="/assets/javascripts/fullcalendar/moment.min.js" ></script>
"""),format.raw/*7.1*/("""


"""),_display_(/*10.2*/main/*10.6*/{_display_(Seq[Any](format.raw/*10.7*/("""
	"""),format.raw/*11.2*/("""<div class="container-fluid" style="background-color: white; padding: 10px;">
 
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
				  <li>Recursos</li>
				  <li><a href="/oficios">Solicitudes con oficio</a></li>
				  <li class="active">Editar</li>
				</ol>			
			</div>
		</div>	
		<div class="row">
			<div class="col-lg-12">		
				<h3>Edición de oficio</h3>
			</div>
		</div>
		<section id="oficioForm">
		 	"""),_display_(/*28.6*/form(CSRF(routes.OficioController.update(forma.field("recurso.id").value().toLong)), 'role -> "form", 'id -> "frmOficioEdit", 'enctype -> "multipart/form-data", 'role->"form")/*28.181*/ {_display_(Seq[Any](format.raw/*28.183*/("""
	 			"""),format.raw/*29.6*/("""<div class="form-group">		
					<div class="row">
						<div class="col-lg-12">
			
						 			<table class="table table-bordered tablaReporte">
						 				<tr>
						 					<td colspan="1">"""),_display_(/*35.30*/inputText(forma("numero"), '_label -> "Número de oficio", '_help -> "", 'size->"10", 'required->"required", 'class->"form-control" )),format.raw/*35.162*/("""</td>
											<td colspan="1">"""),_display_(/*36.29*/inputText(forma("folio"), '_label -> "Número de folio", '_help -> "", 'size->"10", 'required->"required", 'class->"form-control",'pattern->"[0-9]{1,6}" )),format.raw/*36.182*/("""</td> 					
						 				</tr>
						 				<tr>
						 					<td>"""),_display_(/*39.18*/inputText(forma("fechaoficio"), '_label -> "Fecha del oficio", '_help -> "", 'required->"required", 'placeholder->"dd/mm/aaaa", 'class->"form-control")),format.raw/*39.169*/("""</td>
						 					<td>"""),_display_(/*40.18*/inputText(forma("fecharecepcion"), '_label -> "Fecha de recepcion en el DII", '_help -> "", 'required->"required", 'placeholder->"dd/mm/aaaa", 'class->"form-control")),format.raw/*40.184*/("""</td>
						 				</tr>
						 				<tr>
						 					<td colspan="2">
												<label for="contenido" class="control-label">Oficio digitalizado</label> 					
						
												
												
												
												
										<div class="form-group" id="divContenido" style="display:none">
											<div class="clearfix">
												<div ></div>
												<input accept=".pdf" id="contenido" name="contenido" required="required" class="form-control" multiple="false" type="file" data-error="Elije un archivo de la lista">
											</div>
											<div class="help-block with-errors"></div>
										</div>						
												
												
												
												
												
												<div id="divNombreArchivo">						
													<table class="table">
														<tr>
												
															<td><a href=""""),_display_(/*66.30*/routes/*66.36*/.RecursoController.ver(id)),format.raw/*66.62*/("""" target="_blank">"""),_display_(/*66.81*/forma/*66.86*/.field("nombrearchivo").value()),format.raw/*66.117*/("""</a></td><td><input type="button" class="btn btn-danger" value="Eliminar archivo y subir otro" onclick="javascript:borrarYsubir()"></td>
														</tr>
													</table>
												</div>
																
						 					</td>
						 				</tr>
						 			</table> 		
			
					 	</div>
				 	</div>
				 	<div class="row">
				 		<div class="col-lg-12">
				 			<div style="width: 70%" class="center-block">
				 				<input type="submit" value="Actualizar la información del oficio" class="btn primary btn-primary btn-block btn-lg center-block">
				 			</div>				 			
				 		</div>
				 	</div>
 				</div>
			""")))}),format.raw/*85.5*/("""
		"""),format.raw/*86.3*/("""</section>

""")))}),format.raw/*88.2*/("""



"""),format.raw/*92.1*/("""<script type="text/javascript">

	$(function() """),format.raw/*94.15*/("""{"""),format.raw/*94.16*/("""
		"""),format.raw/*95.3*/("""$('#frmOficioEdit').attr("data-toggle","validator");
		
		$('#fechaoficio, #fecharecepcion').attr("data-provide","datepicker");
		$('#fechaoficio, #fecharecepcion').attr("data-date-format","dd/mm/yyyy");
		
		
		$('#fechaoficio, #fecharecepcion').datepicker("""),format.raw/*101.49*/("""{"""),format.raw/*101.50*/("""
		    """),format.raw/*102.7*/("""language: "es",
		    format: "dd/mm/yyyy",
			autoclose: true,
			todayBtn: true,
			todayHighlight: true	
		"""),format.raw/*107.3*/("""}"""),format.raw/*107.4*/(""");	
		var fo =""""),_display_(/*108.13*/forma/*108.18*/.field("fechaoficio").value()),format.raw/*108.47*/(""""; 
		var fr =""""),_display_(/*109.13*/forma/*109.18*/.field("fecharecepcion").value()),format.raw/*109.50*/("""";
		
		$('#fechaoficio').datepicker('update', moment(fo,"YYYY-MM-DD").format("DD/MM/YYYY")  );
		$('#fecharecepcion').datepicker('update', moment(fr,"YYYY-MM-DD").format("DD/MM/YYYY")   );
	"""),format.raw/*113.2*/("""}"""),format.raw/*113.3*/(""");
	
	function borrarYsubir()"""),format.raw/*115.25*/("""{"""),format.raw/*115.26*/("""
		"""),format.raw/*116.3*/("""if(confirm("¿Eliminar este archivo y seleccionar otro?"))"""),format.raw/*116.60*/("""{"""),format.raw/*116.61*/("""
			"""),format.raw/*117.4*/("""$("#divNombreArchivo").hide();
			$("#contenido").prop("required","required");
			$("#divContenido").show();
			$("#contenido").trigger("click");
		"""),format.raw/*121.3*/("""}"""),format.raw/*121.4*/("""
	"""),format.raw/*122.2*/("""}"""),format.raw/*122.3*/("""	


	
	
	"""),format.raw/*127.2*/("""$("#frmOficioEdit").submit(function()"""),format.raw/*127.39*/("""{"""),format.raw/*127.40*/("""

	"""),format.raw/*129.2*/("""}"""),format.raw/*129.3*/(""");	
	
	$('#frmOficioEdit').validator().on('submit', function (e) """),format.raw/*131.60*/("""{"""),format.raw/*131.61*/("""
		"""),format.raw/*132.3*/("""var fo = moment($('#fechaoficio').val(),"DD/MM/YYYY");
		var fr = moment($('#fecharecepcion').val(),"DD/MM/YYYY");
		var aux = true; 
		if (   (fo== null || !fo.isValid())      )"""),format.raw/*135.45*/("""{"""),format.raw/*135.46*/("""
			"""),format.raw/*136.4*/("""aux = false;
			$('#fechaoficio').parents().parents().addClass("error");
		"""),format.raw/*138.3*/("""}"""),format.raw/*138.4*/("""
		"""),format.raw/*139.3*/("""if (   (fr== null || !fr.isValid())      )"""),format.raw/*139.45*/("""{"""),format.raw/*139.46*/("""
			"""),format.raw/*140.4*/("""aux = false;
			$('#fecharecepcion').parents().parents().addClass("error");
		"""),format.raw/*142.3*/("""}"""),format.raw/*142.4*/("""		
		
		"""),format.raw/*144.3*/("""if (aux)"""),format.raw/*144.11*/("""{"""),format.raw/*144.12*/("""
			"""),format.raw/*145.4*/("""if ( fo.isAfter(fr) )"""),format.raw/*145.25*/("""{"""),format.raw/*145.26*/("""
				  """),format.raw/*146.7*/("""$('#fechaoficio').parents().parents().addClass("error");
				  $('#fecharecepcion').parents().parents().addClass("error");
				  alert("La fecha de oficio no puede ser posterior a la fecha de recepción en el DII");			  
				  e.preventDefault();
		    """),format.raw/*150.7*/("""}"""),format.raw/*150.8*/("""		
			
			"""),format.raw/*152.4*/("""if ( fr.isAfter(new Date())  )"""),format.raw/*152.34*/("""{"""),format.raw/*152.35*/("""
				"""),format.raw/*153.5*/("""alert("No se puede registrar la recepción de una fecha superior a la de hoy.");
				
			"""),format.raw/*155.4*/("""}"""),format.raw/*155.5*/("""
		"""),format.raw/*156.3*/("""}"""),format.raw/*156.4*/(""" """),format.raw/*156.5*/("""else """),format.raw/*156.10*/("""{"""),format.raw/*156.11*/("""
			"""),format.raw/*157.4*/("""e.preventDefault();
		"""),format.raw/*158.3*/("""}"""),format.raw/*158.4*/("""		
		
		
		  """),format.raw/*161.5*/("""if (e.isDefaultPrevented()) """),format.raw/*161.33*/("""{"""),format.raw/*161.34*/("""
		  """),format.raw/*162.5*/("""}"""),format.raw/*162.6*/(""" """),format.raw/*162.7*/("""else """),format.raw/*162.12*/("""{"""),format.raw/*162.13*/("""
				"""),format.raw/*163.5*/("""$('#fechaoficio, #fecharecepcion').removeAttr("pattern");

				$('#fechaoficio').val(    moment($('#fechaoficio').val(),"DD/MM/YYYY").format("YYYY-MM-DD")  );			
				$('#fecharecepcion').val( moment($('#fecharecepcion').val(),"DD/MM/YYYY").format("YYYY-MM-DD")  );
		  """),format.raw/*167.5*/("""}"""),format.raw/*167.6*/("""
		"""),format.raw/*168.3*/("""}"""),format.raw/*168.4*/(""");		
			
	
</script>	
<script src=""""),_display_(/*172.15*/routes/*172.21*/.Assets.at("javascripts/validator.min.js")),format.raw/*172.63*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*173.15*/routes/*173.21*/.Assets.at("jqueryDateTimePicker/js/bootstrap-datepicker.min.js")),format.raw/*173.86*/(""""></script>
<script src=""""),_display_(/*174.15*/routes/*174.21*/.Assets.at("jqueryDateTimePicker/locales/bootstrap-datepicker.es.min.js")),format.raw/*174.94*/("""" type="text/javascript"></script>
<link rel="stylesheet" media="screen" href=""""),_display_(/*175.46*/routes/*175.52*/.Assets.at("jqueryDateTimePicker/css/bootstrap-datepicker.standalone.min.css")),format.raw/*175.130*/(""""/>
"""))}
  }

  def render(id:Long,forma:Form[Oficio]): play.twirl.api.HtmlFormat.Appendable = apply(id,forma)

  def f:((Long,Form[Oficio]) => play.twirl.api.HtmlFormat.Appendable) = (id,forma) => apply(id,forma)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:36 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Oficio/edit.scala.html
                  HASH: 4d1ad40b274c16e618b1cf5f7cc02cf37037c78a
                  MATRIX: 740->1|867->35|899->59|980->33|1008->110|1038->114|1109->159|1123->165|1180->202|1284->297|1314->301|1326->305|1364->306|1393->308|1861->750|2046->925|2087->927|2120->933|2336->1122|2490->1254|2551->1288|2726->1441|2815->1503|2988->1654|3038->1677|3226->1843|4084->2674|4099->2680|4146->2706|4192->2725|4206->2730|4259->2761|4905->3377|4935->3380|4978->3393|5009->3397|5084->3444|5113->3445|5143->3448|5430->3706|5460->3707|5495->3714|5633->3824|5662->3825|5706->3841|5721->3846|5772->3875|5816->3891|5831->3896|5885->3928|6104->4119|6133->4120|6191->4149|6221->4150|6252->4153|6338->4210|6368->4211|6400->4215|6576->4363|6605->4364|6635->4366|6664->4367|6701->4376|6767->4413|6797->4414|6828->4417|6857->4418|6951->4483|6981->4484|7012->4487|7219->4665|7249->4666|7281->4670|7384->4745|7413->4746|7444->4749|7515->4791|7545->4792|7577->4796|7683->4874|7712->4875|7748->4883|7785->4891|7815->4892|7847->4896|7897->4917|7927->4918|7962->4925|8242->5177|8271->5178|8309->5188|8368->5218|8398->5219|8431->5224|8547->5312|8576->5313|8607->5316|8636->5317|8665->5318|8699->5323|8729->5324|8761->5328|8811->5350|8840->5351|8881->5364|8938->5392|8968->5393|9001->5398|9030->5399|9059->5400|9093->5405|9123->5406|9156->5411|9453->5680|9482->5681|9513->5684|9542->5685|9606->5721|9622->5727|9686->5769|9763->5818|9779->5824|9866->5889|9920->5915|9936->5921|10031->5994|10139->6074|10155->6080|10256->6158
                  LINES: 26->1|28->2|28->2|29->1|30->2|32->4|32->4|32->4|32->4|34->7|37->10|37->10|37->10|38->11|55->28|55->28|55->28|56->29|62->35|62->35|63->36|63->36|66->39|66->39|67->40|67->40|93->66|93->66|93->66|93->66|93->66|93->66|112->85|113->86|115->88|119->92|121->94|121->94|122->95|128->101|128->101|129->102|134->107|134->107|135->108|135->108|135->108|136->109|136->109|136->109|140->113|140->113|142->115|142->115|143->116|143->116|143->116|144->117|148->121|148->121|149->122|149->122|154->127|154->127|154->127|156->129|156->129|158->131|158->131|159->132|162->135|162->135|163->136|165->138|165->138|166->139|166->139|166->139|167->140|169->142|169->142|171->144|171->144|171->144|172->145|172->145|172->145|173->146|177->150|177->150|179->152|179->152|179->152|180->153|182->155|182->155|183->156|183->156|183->156|183->156|183->156|184->157|185->158|185->158|188->161|188->161|188->161|189->162|189->162|189->162|189->162|189->162|190->163|194->167|194->167|195->168|195->168|199->172|199->172|199->172|200->173|200->173|200->173|201->174|201->174|201->174|202->175|202->175|202->175
                  -- GENERATED --
              */
          