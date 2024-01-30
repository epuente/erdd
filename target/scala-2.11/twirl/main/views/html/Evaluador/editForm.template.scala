
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
object editForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Long,Form[Personal],Personal,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, pForm: Form[Personal], p:Personal):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*3.80*/(""" 

"""),_display_(/*5.2*/main/*5.6*/ {_display_(Seq[Any](format.raw/*5.8*/("""
	"""),format.raw/*6.2*/("""<div class=container-fluid style="background-color: white; padding: 10px;">	
	    <h1>Editar evaluador</h1>
	    """),_display_(/*8.7*/form(CSRF(routes.EvaluadorController.update2(id)), 'id->"frmEvaluador")/*8.78*/ {_display_(Seq[Any](format.raw/*8.80*/("""
	        """),format.raw/*9.10*/("""<fieldset>
	           	"""),_display_(/*10.15*/evaluadorForm(pForm, p)),format.raw/*10.38*/("""
	        """),format.raw/*11.10*/("""</fieldset>
	    """)))}),format.raw/*12.7*/("""
	    """),format.raw/*13.6*/("""<div class="actions">
	        <input type="submit" value="Actualizar" class="btn primary btn-primary" onclick="javascript:preValidar()">  
	        <a href=""""),_display_(/*15.20*/routes/*15.26*/.EvaluadorController.list()),format.raw/*15.53*/("""" class="btn btn-default">Cancelar</a> 
	    </div>
    </div>    
""")))}),format.raw/*18.2*/("""

"""),format.raw/*20.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*21.15*/("""{"""),format.raw/*21.16*/("""
		"""),format.raw/*22.3*/("""$('#frmEvaluador').attr("data-toggle","validator");
		$('#nombre').focus();
		
		$(".observacion").hide();
		$("[name*='btnObservacion_']").hide();
		$("[name='aspecto[]']").attr("data-error","Seleccione el o los aspectos");
		$("#usuario_usuario, #usuario_password").attr("data-error","Sólo letras y números, sin acéntos, espacios ni caracteres especiales.");
				
		leer();
	"""),format.raw/*31.2*/("""}"""),format.raw/*31.3*/(""");

	function leer()"""),format.raw/*33.17*/("""{"""),format.raw/*33.18*/("""
		"""),format.raw/*34.3*/("""if (""""),_display_(/*34.9*/p/*34.10*/.correo),format.raw/*34.17*/("""".length !=0)"""),format.raw/*34.30*/("""{"""),format.raw/*34.31*/("""
			"""),format.raw/*35.4*/("""$('[name="correo"]').val(""""),_display_(/*35.31*/p/*35.32*/.correo),format.raw/*35.39*/("""");
		"""),format.raw/*36.3*/("""}"""),format.raw/*36.4*/("""
		"""),format.raw/*37.3*/("""if (""""),_display_(/*37.9*/p/*37.10*/.usuario.password),format.raw/*37.27*/("""".length !=0)"""),format.raw/*37.40*/("""{"""),format.raw/*37.41*/("""
			"""),format.raw/*38.4*/("""$('[name="usuario.password"]').val(""""),_display_(/*38.41*/p/*38.42*/.usuario.password),format.raw/*38.59*/("""");
		"""),format.raw/*39.3*/("""}"""),format.raw/*39.4*/("""
		"""),format.raw/*40.3*/("""$('[name="activo.id"][value=""""),_display_(/*40.33*/p/*40.34*/.activo.id),format.raw/*40.44*/(""""]').prop('checked',true);
		
		"""),_display_(/*42.4*/for(ea <- p.evaluador.evaluadoraspectos) yield /*42.44*/{_display_(Seq[Any](format.raw/*42.45*/("""
			"""),format.raw/*43.4*/("""$('#aspecto_"""),_display_(/*43.17*/ea/*43.19*/.aspecto.id),format.raw/*43.30*/("""').prop('checked',true);
		""")))}),format.raw/*44.4*/("""

	"""),format.raw/*46.2*/("""}"""),format.raw/*46.3*/("""
	
	"""),format.raw/*48.2*/("""function preValidar()"""),format.raw/*48.23*/("""{"""),format.raw/*48.24*/("""
		"""),format.raw/*49.3*/("""$("#frmEvaluador").submit();
	"""),format.raw/*50.2*/("""}"""),format.raw/*50.3*/("""
	
	
	
"""),format.raw/*54.1*/("""</script>"""))}
  }

  def render(id:Long,pForm:Form[Personal],p:Personal): play.twirl.api.HtmlFormat.Appendable = apply(id,pForm,p)

  def f:((Long,Form[Personal],Personal) => play.twirl.api.HtmlFormat.Appendable) = (id,pForm,p) => apply(id,pForm,p)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Evaluador/editForm.scala.html
                  HASH: 1fba732089f56e9b5b0d7a598d5560588899a5d1
                  MATRIX: 758->1|898->65|930->89|1014->46|1042->143|1071->147|1082->151|1120->153|1148->155|1287->269|1366->340|1405->342|1442->352|1494->377|1538->400|1576->410|1624->428|1657->434|1843->593|1858->599|1906->626|2004->694|2033->696|2107->742|2136->743|2166->746|2570->1123|2598->1124|2646->1144|2675->1145|2705->1148|2737->1154|2747->1155|2775->1162|2816->1175|2845->1176|2876->1180|2930->1207|2940->1208|2968->1215|3001->1221|3029->1222|3059->1225|3091->1231|3101->1232|3139->1249|3180->1262|3209->1263|3240->1267|3304->1304|3314->1305|3352->1322|3385->1328|3413->1329|3443->1332|3500->1362|3510->1363|3541->1373|3600->1406|3656->1446|3695->1447|3726->1451|3766->1464|3777->1466|3809->1477|3867->1505|3897->1508|3925->1509|3956->1513|4005->1534|4034->1535|4064->1538|4121->1568|4149->1569|4183->1576
                  LINES: 26->1|28->3|28->3|29->1|30->3|32->5|32->5|32->5|33->6|35->8|35->8|35->8|36->9|37->10|37->10|38->11|39->12|40->13|42->15|42->15|42->15|45->18|47->20|48->21|48->21|49->22|58->31|58->31|60->33|60->33|61->34|61->34|61->34|61->34|61->34|61->34|62->35|62->35|62->35|62->35|63->36|63->36|64->37|64->37|64->37|64->37|64->37|64->37|65->38|65->38|65->38|65->38|66->39|66->39|67->40|67->40|67->40|67->40|69->42|69->42|69->42|70->43|70->43|70->43|70->43|71->44|73->46|73->46|75->48|75->48|75->48|76->49|77->50|77->50|81->54
                  -- GENERATED --
              */
          