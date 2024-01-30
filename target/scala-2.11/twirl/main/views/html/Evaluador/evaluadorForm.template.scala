
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
object evaluadorForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Personal],Personal,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(personalForm: Form[Personal], r:Personal):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.44*/("""
"""),format.raw/*3.83*/(""" 
"""),format.raw/*4.1*/("""<section id="personalForm">

	        <fieldset>
		        <table class="table">
		        	<tr>
		        		<td colspan=1  class="requerido">
		        			<div class="form-group">
		        				"""),_display_(/*11.16*/inputText(personalForm("nombre"), '_label -> "Nombre", 'required->"required", 'class->"form-control", 'pattern->"[A-Za-záéíóúñÁÉÍÓÚÑ ]*", 'placeholder->"Nombre" )),format.raw/*11.178*/("""
		        			"""),format.raw/*12.14*/("""</div>
	        			</td>
		        		<td colspan=1  class="requerido">
		        			"""),_display_(/*15.15*/inputText(personalForm("paterno"), '_label -> "Paterno", 'required->"required", 'class->"form-control", 'pattern->"[A-Za-záéíóúñÁÉÍÓÚÑ ]*", 'placeholder->"Paterno")),format.raw/*15.179*/("""
	        			"""),format.raw/*16.13*/("""</td>
		        		<td colspan=1  class="requerido">
		        			"""),_display_(/*18.15*/inputText(personalForm("materno"), '_label -> "Materno", 'required->"required", 'class->"form-control", 'pattern->"[A-Za-záéíóúñÁÉÍÓÚÑ ]*", 'placeholder->"Materno")),format.raw/*18.179*/("""
	        			"""),format.raw/*19.13*/("""</td>

	        			
		        		<td colspan=1  class="requerido">
 		        			"""),_display_(/*23.16*/inputText(personalForm("correo"), '_label -> "Correo", 'required->"required", 'class->"form-control",  'placeholder->"email del evaluador", 'type->"email")),format.raw/*23.171*/(""" 
	        			"""),format.raw/*24.13*/("""</td>
	        			
					</tr>
					<tr>
						<td colspan=1  class="requerido">
							"""),_display_(/*29.9*/inputText(personalForm("usuario.usuario"), '_label -> "Nombre de usuario", 'required->"required", 'class->"form-control", 'pattern->"[A-Za-z0-9]*", 'placeholder->"Nombre de usuario (sin caracteres especiales)" )),format.raw/*29.220*/("""
						"""),format.raw/*30.7*/("""</td>
						<td colspan=3  class="requerido">
							"""),_display_(/*32.9*/inputPassword(personalForm("usuario.password"), '_label -> "Clave de acceso", 'required->"required", 'class->"form-control", 'pattern->"[A-Za-z0-9]*", 'placeholder->"Clave de acceso (sin caracteres especiales)")),format.raw/*32.220*/("""							
						"""),format.raw/*33.7*/("""</td>
					</tr>
					<tr>
						<td colspan="2" style="border-top: 0px solid #ff0000;">
							<div id="divErrorUserPass" class="text-danger"></div>
						</td>
					</tr>
					
					<tr>
						<td colspan="4" class="requerido">
							"""),_display_(/*43.9*/inputRadioGroup(
								personalForm("activo.id"),
								options = options(models.EstadoActivo.options), 'required->"required"
							)),format.raw/*46.9*/("""								
						"""),format.raw/*47.7*/("""</td>
					</tr>
					
					<tr>
		        		<td  class="requerido" colspan="7">
						     """),_display_(/*52.13*/inputCheckboxGroup(
						         personalForm("aspecto"),
						         options = options(models.Aspecto.options),						         
						         '_label -> null						         										         
						      )),format.raw/*56.14*/("""
	            		"""),format.raw/*57.16*/("""</td>
		        	</tr>	        	
		        </table>
	        </fieldset>        


</section>



"""))}
  }

  def render(personalForm:Form[Personal],r:Personal): play.twirl.api.HtmlFormat.Appendable = apply(personalForm,r)

  def f:((Form[Personal],Personal) => play.twirl.api.HtmlFormat.Appendable) = (personalForm,r) => apply(personalForm,r)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Evaluador/evaluadorForm.scala.html
                  HASH: 7991e0d496a60c3fee382d33a6aecbe8d0ddb204
                  MATRIX: 758->1|895->62|927->86|1014->43|1042->143|1070->145|1293->341|1477->503|1519->517|1631->602|1817->766|1858->779|1951->845|2137->1009|2178->1022|2286->1103|2463->1258|2505->1272|2619->1360|2852->1571|2886->1578|2966->1632|3199->1843|3240->1857|3504->2095|3662->2233|3704->2248|3824->2341|4056->2552|4100->2568
                  LINES: 26->1|28->3|28->3|29->1|30->3|31->4|38->11|38->11|39->12|42->15|42->15|43->16|45->18|45->18|46->19|50->23|50->23|51->24|56->29|56->29|57->30|59->32|59->32|60->33|70->43|73->46|74->47|79->52|83->56|84->57
                  -- GENERATED --
              */
          