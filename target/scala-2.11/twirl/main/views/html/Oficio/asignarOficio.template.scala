
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
object asignarOficio extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Recurso],play.twirl.api.HtmlFormat.Appendable] {

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
				  <li><a href="/oficios">Solicitudes con oficio</a></li>
				  <li class="active">Asignar</li>
				</ol>			
			</div>
		</div>	
		<div class="row">				
			<div class="col-lg-12">
				<h3>Asignar oficio al recurso '"""),_display_(/*23.37*/rForm/*23.42*/.get().titulo),format.raw/*23.55*/("""'</h3>
				<blockquote>
				  <p>Se refiere al oficio que la Escuela envía a la UPEV para solcitar el registro del Recurso Didáctico Digital.</p>
				</blockquote>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12">		
			 	"""),_display_(/*31.7*/form(CSRF(routes.OficioController.save(id)), 'role -> "form", 'id -> "frmAsignaOficio", 'enctype -> "multipart/form-data", 'role->"form")/*31.144*/ {_display_(Seq[Any](format.raw/*31.146*/("""
			 		"""),format.raw/*32.7*/("""<div class="form-group">
			 			<table class="table table-bordered tablaReporte">
			 				<tr>
			 					<td colspan="1">"""),_display_(/*35.27*/inputText(rForm("oficio.numero"), 'labelAlterna -> "Número de oficio", '_help -> "", 'size->"10", 'required->"required", 'class->"form-control" )),format.raw/*35.172*/("""</td>
								<td colspan="1">"""),_display_(/*36.26*/inputText(rForm("oficio.folio"), 'labelAlterna -> "Número de folio", '_help -> "", 'size->"10", 'required->"required", 'class->"form-control",'pattern->"[0-9]{1,6}" )),format.raw/*36.192*/("""</td> 					
			 				</tr>
			 				<tr>
			 					<td>"""),_display_(/*39.15*/inputText(rForm("oficio.fechaoficio"), 'labelAlterna -> "Fecha del oficio", '_help -> "", 'required->"required", 'placeholder->"dd/mm/aaaa", 'class->"form-control" )),format.raw/*39.180*/("""</td>
			 					<td>"""),_display_(/*40.15*/inputText(rForm("oficio.fecharecepcion"), 'labelAlterna -> "Fecha de recepcion en el DII", '_help -> "", 'required->"required", 'placeholder->"dd/mm/aaaa", 'class->"form-control")),format.raw/*40.194*/("""</td>
			 				</tr>
			 				<tr>
			 					<td colspan="2">
									"""),_display_(/*44.11*/inputFile(rForm("oficio.contenido"),'size -> 10, 'labelAlterna->"Oficio digitalizado",'required -> "required", 'class->"form-control", 'accept->".pdf")),format.raw/*44.162*/("""								
			 					"""),format.raw/*45.10*/("""</td>
			 				</tr>			 				
			 				<tr>
			 					<td colspan="2">			 							
			 						<a href="javascript:pre()" class="btn primary btn-primary btn-block center-block" role="button" style="width: 70%">Asignar oficio</a>
			 					</td>
			 				</tr>
			 			</table> 		
					</div>
				""")))}),format.raw/*54.6*/("""
			"""),format.raw/*55.4*/("""</div>
		</div>
	</div>	
""")))}),format.raw/*58.2*/("""



"""),format.raw/*62.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*63.15*/("""{"""),format.raw/*63.16*/("""

		"""),format.raw/*65.3*/("""$('#oficio_fechaoficio, #oficio_fecharecepcion').datepicker("""),format.raw/*65.63*/("""{"""),format.raw/*65.64*/("""
		    """),format.raw/*66.7*/("""language: "es",
		    format: "dd/mm/yyyy",
			autoclose: true,
			todayBtn: true,
			todayHighlight: true,

			closeText: 'Cerrar',
			prevText: '<Ant',
			nextText: 'Sig>',
			currentText: 'Hoy',
			monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
			monthNamesShort: ['Ene', 'Feb', 'Mar', 'Abr', 'May', 'Jun', 'Jul', 'Ago', 'Sep', 'Oct', 'Nov', 'Dic'],
			dayNames: ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],
			dayNamesShort: ['Dom', 'Lun', 'Mar', 'Mié', 'Juv', 'Vie', 'Sáb'],
			dayNamesMin: ['Do', 'Lu', 'Ma', 'Mi', 'Ju', 'Vi', 'Sá'],
			weekHeader: 'Sm',
			dateFormat: 'dd/mm/yy',
			firstDay: 1,
			isRTL: false,
			showMonthAfterYear: false,
        	yearSuffix: ''
		"""),format.raw/*87.3*/("""}"""),format.raw/*87.4*/(""");	
		
		$('#frmAsignaOficio').attr("data-toggle","validator");
		$('#oficio_folio').attr("data-error","Solo números, máximo 6");
		$('#oficio_fechaoficio, #oficio_fecharecepcion').attr("pattern","([0-9]"""),format.raw/*91.74*/("""{"""),format.raw/*91.75*/("""2"""),format.raw/*91.76*/("""}"""),format.raw/*91.77*/("""/[0-9]"""),format.raw/*91.83*/("""{"""),format.raw/*91.84*/("""2"""),format.raw/*91.85*/("""}"""),format.raw/*91.86*/("""/[0-9]"""),format.raw/*91.92*/("""{"""),format.raw/*91.93*/("""4"""),format.raw/*91.94*/("""}"""),format.raw/*91.95*/(""")");
	"""),format.raw/*92.2*/("""}"""),format.raw/*92.3*/(""");

		  
	function pre()"""),format.raw/*95.16*/("""{"""),format.raw/*95.17*/("""

		"""),format.raw/*97.3*/("""console.log("* " + $('#oficio_fechaoficio').val() )
		console.log("* " + $('#oficio_fecharecepcion').val() )

		var fo = moment($('#oficio_fechaoficio').val(),"DD/MM/YYYY");
		var fr = moment($('#oficio_fecharecepcion').val(),"DD/MM/YYYY");

		console.log("fo * " + fo.format())
		console.log("fr * " + fr.format())

		console.log("fo "+$('#oficio_fechaoficio').val() +" - "+moment($('#oficio_fechaoficio').val(),"DD/MM/YYYY"))
		console.log("fr "+$('#oficio_fecharecepcion').val()+" - "+moment($('#oficio_fecharecepcion').val(),"DD/MM/YYYY"))
		var aux = true; 
		if (   (fo== null || !fo.isValid())      )"""),format.raw/*109.45*/("""{"""),format.raw/*109.46*/("""
			"""),format.raw/*110.4*/("""aux = false;
			$('#oficio_fechaoficio').parents().parents().addClass("error");
			console.log("fecha oficio con error")
		"""),format.raw/*113.3*/("""}"""),format.raw/*113.4*/("""
		"""),format.raw/*114.3*/("""console.log("fr null "+fr==null)
		console.log("fr isValid "+fr.isValid())
		console.log("fr isValid : "+fr.format("DD/MM/YYYY"))

		console.log("fr : "+(fr== null || !fr  .isValid()))

		if (   (fr== null || !fr.isValid())      )"""),format.raw/*120.45*/("""{"""),format.raw/*120.46*/("""
			"""),format.raw/*121.4*/("""aux = false;
			$('#oficio_fecharecepcion').parents().parents().addClass("error");
			console.log("fecha recepcion con error...")
		"""),format.raw/*124.3*/("""}"""),format.raw/*124.4*/("""		
		"""),format.raw/*125.3*/("""console.log("aux "+aux)
		if (aux)"""),format.raw/*126.11*/("""{"""),format.raw/*126.12*/("""
			"""),format.raw/*127.4*/("""if ( fo.isAfter( moment().add(1,'day')  )  )"""),format.raw/*127.48*/("""{"""),format.raw/*127.49*/("""
				"""),format.raw/*128.5*/("""alert("No se puede registrar la fecha del oficio con fecha superior a la de hoy.");
				return false;				
			"""),format.raw/*130.4*/("""}"""),format.raw/*130.5*/("""
			"""),format.raw/*131.4*/("""if ( fr.isAfter( moment().add(1,'day')  ))"""),format.raw/*131.46*/("""{"""),format.raw/*131.47*/("""
				"""),format.raw/*132.5*/("""alert("No se puede registrar la recepción en el DII con una fecha superior a la de hoy.");
				return false;				
			"""),format.raw/*134.4*/("""}"""),format.raw/*134.5*/("""			
			"""),format.raw/*135.4*/("""if ( fo.isAfter(fr,'day') )"""),format.raw/*135.31*/("""{"""),format.raw/*135.32*/("""
				  """),format.raw/*136.7*/("""$('#oficio_fechaoficio').parents().parents().addClass("error");
				  $('#oficio_fecharecepcion').parents().parents().addClass("error");
				  alert("La fecha de oficio no puede ser posterior a la fecha de recepción en el DII");			  
				  return false;
		    """),format.raw/*140.7*/("""}"""),format.raw/*140.8*/("""		
			

			"""),format.raw/*143.4*/("""$("#frmAsignaOficio").submit();	
		"""),format.raw/*144.3*/("""}"""),format.raw/*144.4*/(""" """),format.raw/*144.5*/("""else """),format.raw/*144.10*/("""{"""),format.raw/*144.11*/("""
			"""),format.raw/*145.4*/("""return false;
		"""),format.raw/*146.3*/("""}"""),format.raw/*146.4*/("""
	"""),format.raw/*147.2*/("""}"""),format.raw/*147.3*/("""
	
	
	"""),format.raw/*150.2*/("""$('#frmAsignaOficio').validator().on('submit', function (e) """),format.raw/*150.62*/("""{"""),format.raw/*150.63*/("""
		  """),format.raw/*151.5*/("""if (e.isDefaultPrevented()) """),format.raw/*151.33*/("""{"""),format.raw/*151.34*/("""
		  """),format.raw/*152.5*/("""}"""),format.raw/*152.6*/(""" """),format.raw/*152.7*/("""else """),format.raw/*152.12*/("""{"""),format.raw/*152.13*/("""
				"""),format.raw/*153.5*/("""$('#oficio_fechaoficio, #oficio_fecharecepcion').removeAttr("pattern");

				$('#oficio_fechaoficio').val(    moment($('#oficio_fechaoficio').val(),"DD/MM/YYYY").format("YYYY-MM-DD")  );			
				$('#oficio_fecharecepcion').val( moment($('#oficio_fecharecepcion').val(),"DD/MM/YYYY").format("YYYY-MM-DD")  );

		  """),format.raw/*158.5*/("""}"""),format.raw/*158.6*/("""
		"""),format.raw/*159.3*/("""}"""),format.raw/*159.4*/(""")	
	
</script>	
<script src=""""),_display_(/*162.15*/routes/*162.21*/.Assets.at("javascripts/validator.min.js")),format.raw/*162.63*/("""" type="text/javascript"></script>
<script src=""""),_display_(/*163.15*/routes/*163.21*/.Assets.at("jqueryDateTimePicker/js/bootstrap-datepicker.js")),format.raw/*163.82*/(""""></script>
<!--script src=""""),_display_(/*164.18*/routes/*164.24*/.Assets.at("jqueryDateTimePicker/locales/bootstrap-datepicker.es.min.js")),format.raw/*164.97*/("""" type="text/javascript"></script-->
<link rel="stylesheet" media="screen" href=""""),_display_(/*165.46*/routes/*165.52*/.Assets.at("jqueryDateTimePicker/css/bootstrap-datepicker.standalone.min.css")),format.raw/*165.130*/(""""/>

"""))}
  }

  def render(id:Long,rForm:Form[Recurso]): play.twirl.api.HtmlFormat.Appendable = apply(id,rForm)

  def f:((Long,Form[Recurso]) => play.twirl.api.HtmlFormat.Appendable) = (id,rForm) => apply(id,rForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 12:09:42 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Oficio/asignarOficio.scala.html
                  HASH: 1eb76e2bb313f486bc324e331ab6161eeec25b51
                  MATRIX: 750->1|878->36|910->60|991->34|1019->111|1049->115|1120->160|1134->166|1191->203|1236->222|1250->228|1308->266|1420->370|1431->374|1468->375|1498->378|1923->776|1937->781|1971->794|2235->1032|2382->1169|2423->1171|2457->1178|2605->1299|2772->1444|2830->1475|3018->1641|3098->1694|3285->1859|3332->1879|3533->2058|3629->2127|3802->2278|3848->2296|4165->2583|4196->2587|4252->2613|4283->2617|4357->2663|4386->2664|4417->2668|4505->2728|4534->2729|4568->2736|5396->3537|5424->3538|5655->3741|5684->3742|5713->3743|5742->3744|5776->3750|5805->3751|5834->3752|5863->3753|5897->3759|5926->3760|5955->3761|5984->3762|6017->3768|6045->3769|6097->3793|6126->3794|6157->3798|6793->4405|6823->4406|6855->4410|7006->4533|7035->4534|7066->4537|7325->4767|7355->4768|7387->4772|7547->4904|7576->4905|7609->4910|7672->4944|7702->4945|7734->4949|7807->4993|7837->4994|7870->4999|8007->5108|8036->5109|8068->5113|8139->5155|8169->5156|8202->5161|8346->5277|8375->5278|8410->5285|8466->5312|8496->5313|8531->5320|8819->5580|8848->5581|8887->5592|8950->5627|8979->5628|9008->5629|9042->5634|9072->5635|9104->5639|9148->5655|9177->5656|9207->5658|9236->5659|9270->5665|9359->5725|9389->5726|9422->5731|9479->5759|9509->5760|9542->5765|9571->5766|9600->5767|9634->5772|9664->5773|9697->5778|10037->6090|10066->6091|10097->6094|10126->6095|10184->6125|10200->6131|10264->6173|10341->6222|10357->6228|10440->6289|10497->6318|10513->6324|10608->6397|10718->6479|10734->6485|10835->6563
                  LINES: 26->1|28->2|28->2|29->1|30->2|32->4|32->4|32->4|32->4|33->5|33->5|33->5|35->8|35->8|35->8|37->10|50->23|50->23|50->23|58->31|58->31|58->31|59->32|62->35|62->35|63->36|63->36|66->39|66->39|67->40|67->40|71->44|71->44|72->45|81->54|82->55|85->58|89->62|90->63|90->63|92->65|92->65|92->65|93->66|114->87|114->87|118->91|118->91|118->91|118->91|118->91|118->91|118->91|118->91|118->91|118->91|118->91|118->91|119->92|119->92|122->95|122->95|124->97|136->109|136->109|137->110|140->113|140->113|141->114|147->120|147->120|148->121|151->124|151->124|152->125|153->126|153->126|154->127|154->127|154->127|155->128|157->130|157->130|158->131|158->131|158->131|159->132|161->134|161->134|162->135|162->135|162->135|163->136|167->140|167->140|170->143|171->144|171->144|171->144|171->144|171->144|172->145|173->146|173->146|174->147|174->147|177->150|177->150|177->150|178->151|178->151|178->151|179->152|179->152|179->152|179->152|179->152|180->153|185->158|185->158|186->159|186->159|189->162|189->162|189->162|190->163|190->163|190->163|191->164|191->164|191->164|192->165|192->165|192->165
                  -- GENERATED --
              */
          