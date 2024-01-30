
package views.html.OficioValoracion

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
object asignarOficioValoracion extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Recurso],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, rForm : Form[Recurso]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*2.2*/implicitFieldConstructor/*2.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.35*/("""
"""),format.raw/*2.77*/(""" 

 """),format.raw/*4.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.47*/routes/*4.53*/.Assets.at("stylesheets/recurso.css")),format.raw/*4.90*/(""""/>
 <script src=""""),_display_(/*5.16*/routes/*5.22*/.Assets.at("javascripts/utilerias.js")),format.raw/*5.60*/(""""></script> 
 <script src="/assets/javascripts/fullcalendar/moment.min.js" ></script>
"""),_display_(/*8.2*/main/*8.6*/{_display_(Seq[Any](format.raw/*8.7*/("""

	"""),format.raw/*10.2*/("""<div class="container-fluid" style="background-color: white; padding: 10px;">
 
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
				  <li>Recursos</li>
				  <li><a href=""""),_display_(/*16.21*/routes/*16.27*/.OficioValoracionController.list()),format.raw/*16.61*/("""">Recurso con oficio de valoración</a></li>
				  <li class="active">Asignar</li>
				</ol>			
			</div>
		</div>	
		<div class="row">				
			<div class="col-lg-12">
				<h3>Asignar oficio de valoración al recurso '"""),_display_(/*23.51*/rForm/*23.56*/.get().titulo),format.raw/*23.69*/("""'</h3>
			</div>
		</div>
		

		
		
		<div class="row">
			<div class="col-lg-12">		
			 	"""),_display_(/*32.7*/form(CSRF(routes.OficioValoracionController.save(id)), 'role -> "form", 'id -> "frmAsignaOficio", 'enctype -> "multipart/form-data", 'role->"form")/*32.154*/ {_display_(Seq[Any](format.raw/*32.156*/("""
			 		"""),format.raw/*33.7*/("""<div class="form-group">
			 			<table class="table table-bordered tablaReporte">
			 				<tr>
			 					<td colspan="1">"""),_display_(/*36.27*/inputText(rForm("oficiovaloracion.numero"), 'labelAlterna -> "Número de oficio de valoración", '_help -> "", 'size->"10", 'required->"required", 'class->"form-control" )),format.raw/*36.196*/("""</td>
			 				</tr>
			 				<tr>
			 					<td>"""),_display_(/*39.15*/inputText(rForm("oficiovaloracion.fechaoficio"), 'labelAlterna -> "Fecha del oficio", '_help -> "", 'required->"required", 'placeholder->"dd/mm/aaaa", 'class->"form-control" )),format.raw/*39.190*/("""</td>
			 				</tr>
			 				<tr>
			 					<td colspan="2">			 				
			 						
										"""),_display_(/*44.12*/inputFile(rForm("oficiovaloracion.contenido"),'size -> 10, 'labelAlterna->"Oficio digitalizado",'required -> "required", 'class->"form-control", 'accept->".pdf")),format.raw/*44.173*/("""							
				 					
				 					"""),_display_(/*46.12*/if(rForm.get().oficiovaloracion.id != null)/*46.55*/{_display_(Seq[Any](format.raw/*46.56*/("""
				 						"""),format.raw/*47.12*/("""<div class="row" id="rowElimina">
				 							<div class="col-sm-8">
				 								<a href=""""),_display_(/*49.24*/routes/*49.30*/.RecursoController.verOficioValoracion(rForm.get().oficiovaloracion.id)),format.raw/*49.101*/("""" target="blank"> """),_display_(/*49.120*/rForm/*49.125*/.get().oficiovaloracion.nombrearchivo),format.raw/*49.162*/("""</a>
				 							</div>
				 							<div class="col-sm-4">
				 								<button class="btn btn-primary center-block" onclick="elimina()">Eliminar y agregar otro</button>
				 							</div>
				 						</div>
				 					""")))}),format.raw/*55.12*/("""

			 					"""),format.raw/*57.10*/("""</td>			 					
			 				</tr>			 				
			 				<tr>
			 					<td colspan="2">			 							
			 						<a href="javascript:pre()" class="btn primary btn-primary btn-block center-block" role="button" style="width: 70%">Asignar oficio</a>
			 					</td>
			 				</tr>
			 			</table> 		
					</div>
				""")))}),format.raw/*66.6*/("""
			"""),format.raw/*67.4*/("""</div>
		</div>
	</div>	
""")))}),format.raw/*70.2*/("""



"""),format.raw/*74.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*75.15*/("""{"""),format.raw/*75.16*/("""
		"""),format.raw/*76.3*/("""$('#frmAsignaOficio').attr("data-toggle","validator");
		$('#oficio_folio').attr("data-error","Solo números, máximo 6");
		$('#oficio_fechaoficio, #oficio_fecharecepcion').attr("pattern","([0-9]"""),format.raw/*78.74*/("""{"""),format.raw/*78.75*/("""2"""),format.raw/*78.76*/("""}"""),format.raw/*78.77*/("""/[0-9]"""),format.raw/*78.83*/("""{"""),format.raw/*78.84*/("""2"""),format.raw/*78.85*/("""}"""),format.raw/*78.86*/("""/[0-9]"""),format.raw/*78.92*/("""{"""),format.raw/*78.93*/("""4"""),format.raw/*78.94*/("""}"""),format.raw/*78.95*/(""")");
		$('#oficiovaloracion_fechaoficio').datepicker("""),format.raw/*79.49*/("""{"""),format.raw/*79.50*/("""
		    """),format.raw/*80.7*/("""language: "es",
		    format: "dd/mm/yyyy",
			autoclose: true,
			todayBtn: true,
			todayHighlight: true
		"""),format.raw/*85.3*/("""}"""),format.raw/*85.4*/(""");		
//alert( '"""),_display_(/*86.12*/rForm("oficiovaloracion.fechaoficio")/*86.49*/.value),format.raw/*86.55*/("""'  );
		//$("#oficiovaloracion_fechaoficio").val( moment('"""),_display_(/*87.54*/rForm("oficiovaloracion.fechaoficio")/*87.91*/.value),format.raw/*87.97*/("""').format("DD/MM/YYYY") );
		//$('#oficiovaloracion_fechaoficio').datepicker('update', moment('"""),_display_(/*88.70*/rForm("oficiovaloracion.fechaoficio")/*88.107*/.value),format.raw/*88.113*/("""').format("DD/MM/YYYY"));
	
		//$("input[type='file']").parent().parent().append("<div>"""),_display_(/*90.61*/rForm/*90.66*/.get().oficiovaloracion.nombrearchivo),format.raw/*90.103*/("""</div>");
		
		
		
		
		"""),_display_(/*95.4*/if(rForm.get().oficiovaloracion.id != null)/*95.47*/{_display_(Seq[Any](format.raw/*95.48*/("""
			"""),format.raw/*96.4*/("""$("input[type='file']").parent().parent().hide();
			
		""")))}),format.raw/*98.4*/("""		

	"""),format.raw/*100.2*/("""}"""),format.raw/*100.3*/(""");

	function pre()"""),format.raw/*102.16*/("""{"""),format.raw/*102.17*/("""
		"""),format.raw/*103.3*/("""//var fo = moment($('#oficiovaloracion_fechaoficio').val(),"DD/MM/YYYY");
		var fo = moment( new Date($('#oficiovaloracion_fechaoficio').val())).format("DD/MM/YYYY");

		var fx = moment( new Date($('#oficiovaloracion_fechaoficio').val())).isValid();


		var fmom=moment( new Date($('#oficiovaloracion_fechaoficio').val()));
		alert(fo);
		alert( fx);
		alert(fmom);

		if (fo==null || !fx)"""),format.raw/*114.23*/("""{"""),format.raw/*114.24*/("""
			"""),format.raw/*115.4*/("""alert("No se ha especificado la fecha o esta en un formato erróneo");
			return false;			
		"""),format.raw/*117.3*/("""}"""),format.raw/*117.4*/(""" """),format.raw/*117.5*/("""else """),format.raw/*117.10*/("""{"""),format.raw/*117.11*/("""
			"""),format.raw/*118.4*/("""if ( fmom.isAfter( moment().add('day',1)  )  )"""),format.raw/*118.50*/("""{"""),format.raw/*118.51*/("""
				"""),format.raw/*119.5*/("""alert("No se puede registrar la fecha del oficio de valoración con fecha superior a la de hoy.");
				return false;
			"""),format.raw/*121.4*/("""}"""),format.raw/*121.5*/(""" """),format.raw/*121.6*/("""else """),format.raw/*121.11*/("""{"""),format.raw/*121.12*/("""
				"""),format.raw/*122.5*/("""$('#oficio_fechaoficio').parents().parents().removeClass("error");
				$("#oficiovaloracion_fechaoficio").val(fo);
				$("#frmAsignaOficio").submit();				
			"""),format.raw/*125.4*/("""}"""),format.raw/*125.5*/("""
		"""),format.raw/*126.3*/("""}"""),format.raw/*126.4*/("""

		
	"""),format.raw/*129.2*/("""}"""),format.raw/*129.3*/("""

	
	"""),format.raw/*132.2*/("""$('#frmAsignaOficio').validator().on('submit', function (e) """),format.raw/*132.62*/("""{"""),format.raw/*132.63*/("""
		  """),format.raw/*133.5*/("""if (e.isDefaultPrevented()) """),format.raw/*133.33*/("""{"""),format.raw/*133.34*/("""
		    """),format.raw/*134.7*/("""// handle the invalid form...
		  """),format.raw/*135.5*/("""}"""),format.raw/*135.6*/(""" """),format.raw/*135.7*/("""else """),format.raw/*135.12*/("""{"""),format.raw/*135.13*/("""
				"""),format.raw/*136.5*/("""$('#oficiovaloracion_fechaoficio').removeAttr("pattern");
				$('#oficiovaloracion_fechaoficio').val(    moment($('#oficiovaloracion_fechaoficio').val(),"DD/MM/YYYY").format("YYYY-MM-DD")  );				
		  """),format.raw/*138.5*/("""}"""),format.raw/*138.6*/("""
		"""),format.raw/*139.3*/("""}"""),format.raw/*139.4*/(""")	
	
	
	function elimina()"""),format.raw/*142.20*/("""{"""),format.raw/*142.21*/("""
		"""),format.raw/*143.3*/("""$("input[type='file']").parent().parent().show();
		$("#rowElimina").hide();
		
	"""),format.raw/*146.2*/("""}"""),format.raw/*146.3*/("""
	
	
"""),format.raw/*149.1*/("""</script>	
<script src=""""),_display_(/*150.15*/routes/*150.21*/.Assets.at("javascripts/validator.min.js")),format.raw/*150.63*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*151.15*/routes/*151.21*/.Assets.at("jqueryDateTimePicker/js/bootstrap-datepicker.min.js")),format.raw/*151.86*/(""""></script>
<script src=""""),_display_(/*152.15*/routes/*152.21*/.Assets.at("jqueryDateTimePicker/locales/bootstrap-datepicker.es.min.js")),format.raw/*152.94*/("""" type="text/javascript"></script>
<link rel="stylesheet" media="screen" href=""""),_display_(/*153.46*/routes/*153.52*/.Assets.at("jqueryDateTimePicker/css/bootstrap-datepicker.standalone.min.css")),format.raw/*153.130*/(""""/>


"""))}
  }

  def render(id:Long,rForm:Form[Recurso]): play.twirl.api.HtmlFormat.Appendable = apply(id,rForm)

  def f:((Long,Form[Recurso]) => play.twirl.api.HtmlFormat.Appendable) = (id,rForm) => apply(id,rForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/OficioValoracion/asignarOficioValoracion.scala.html
                  HASH: 800567f96d21ceeeef0d599e19060a5bca92695f
                  MATRIX: 770->1|898->36|930->60|1011->34|1039->111|1069->115|1140->160|1154->166|1211->203|1256->222|1270->228|1328->266|1440->370|1451->374|1488->375|1518->378|1744->577|1759->583|1814->617|2057->833|2071->838|2105->851|2222->942|2379->1089|2420->1091|2454->1098|2602->1219|2793->1388|2867->1435|3064->1610|3180->1699|3363->1860|3420->1890|3472->1933|3511->1934|3551->1946|3670->2038|3685->2044|3778->2115|3825->2134|3840->2139|3899->2176|4148->2394|4187->2405|4513->2701|4544->2705|4600->2731|4631->2735|4705->2781|4734->2782|4764->2785|4986->2979|5015->2980|5044->2981|5073->2982|5107->2988|5136->2989|5165->2990|5194->2991|5228->2997|5257->2998|5286->2999|5315->3000|5396->3053|5425->3054|5459->3061|5595->3170|5623->3171|5666->3187|5712->3224|5739->3230|5825->3289|5871->3326|5898->3332|6021->3428|6068->3465|6096->3471|6211->3559|6225->3564|6284->3601|6335->3626|6387->3669|6426->3670|6457->3674|6544->3731|6577->3736|6606->3737|6654->3756|6684->3757|6715->3760|7133->4149|7163->4150|7195->4154|7315->4246|7344->4247|7373->4248|7407->4253|7437->4254|7469->4258|7544->4304|7574->4305|7607->4310|7754->4429|7783->4430|7812->4431|7846->4436|7876->4437|7909->4442|8095->4600|8124->4601|8155->4604|8184->4605|8218->4611|8247->4612|8280->4617|8369->4677|8399->4678|8432->4683|8489->4711|8519->4712|8554->4719|8616->4753|8645->4754|8674->4755|8708->4760|8738->4761|8771->4766|8999->4966|9028->4967|9059->4970|9088->4971|9143->4997|9173->4998|9204->5001|9313->5082|9342->5083|9375->5088|9428->5113|9444->5119|9508->5161|9585->5210|9601->5216|9688->5281|9742->5307|9758->5313|9853->5386|9961->5466|9977->5472|10078->5550
                  LINES: 26->1|28->2|28->2|29->1|30->2|32->4|32->4|32->4|32->4|33->5|33->5|33->5|35->8|35->8|35->8|37->10|43->16|43->16|43->16|50->23|50->23|50->23|59->32|59->32|59->32|60->33|63->36|63->36|66->39|66->39|71->44|71->44|73->46|73->46|73->46|74->47|76->49|76->49|76->49|76->49|76->49|76->49|82->55|84->57|93->66|94->67|97->70|101->74|102->75|102->75|103->76|105->78|105->78|105->78|105->78|105->78|105->78|105->78|105->78|105->78|105->78|105->78|105->78|106->79|106->79|107->80|112->85|112->85|113->86|113->86|113->86|114->87|114->87|114->87|115->88|115->88|115->88|117->90|117->90|117->90|122->95|122->95|122->95|123->96|125->98|127->100|127->100|129->102|129->102|130->103|141->114|141->114|142->115|144->117|144->117|144->117|144->117|144->117|145->118|145->118|145->118|146->119|148->121|148->121|148->121|148->121|148->121|149->122|152->125|152->125|153->126|153->126|156->129|156->129|159->132|159->132|159->132|160->133|160->133|160->133|161->134|162->135|162->135|162->135|162->135|162->135|163->136|165->138|165->138|166->139|166->139|169->142|169->142|170->143|173->146|173->146|176->149|177->150|177->150|177->150|178->151|178->151|178->151|179->152|179->152|179->152|180->153|180->153|180->153
                  -- GENERATED --
              */
          