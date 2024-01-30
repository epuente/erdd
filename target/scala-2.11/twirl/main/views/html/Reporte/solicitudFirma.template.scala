
package views.html.Reporte

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
object solicitudFirma extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Recurso,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recurso: Recurso):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.20*/("""

  """),format.raw/*3.3*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*3.48*/routes/*3.54*/.Assets.at("stylesheets/solicitudFirma.css")),format.raw/*3.98*/(""""/> 
"""),_display_(/*4.2*/main/*4.6*/ {_display_(Seq[Any](format.raw/*4.8*/("""

"""),format.raw/*6.1*/("""<table class="table table-bordered tablaSolicitudFirma">
	<tr>
		<td>
			<image src=""""),_display_(/*9.17*/routes/*9.23*/.Assets.at("images/escudoPoli.png")),format.raw/*9.58*/("""">
		</td>
		<td>
			INSTITUTO POLITÉCNICO NACIONAL<br>
			SECRETARÍA ACADÉMICA<br>
			UNIDAD POLITÉCNICA PARA LA EDUCACIÓN VIRTUAL<br>
			CÉDULA DE SOLICITUD DE EVALUACIÓN TÉCNICO-PEDAGÓGICA DE RECURSO DIDÁCTICO DIGITAL<br>
			CESOE
		</td>
		<td>
			<image src=""""),_display_(/*19.17*/routes/*19.23*/.Assets.at("images/logoUPEV.png")),format.raw/*19.56*/("""">
		</td>
	</tr>
	<tr>
		<td colspan="5"><div class="etiqueta">Datos de identidad</div></td>
	</tr>
</table>
""")))}),format.raw/*26.2*/("""  """))}
  }

  def render(recurso:Recurso): play.twirl.api.HtmlFormat.Appendable = apply(recurso)

  def f:((Recurso) => play.twirl.api.HtmlFormat.Appendable) = (recurso) => apply(recurso)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Reporte/solicitudFirma.scala.html
                  HASH: 6e1119458567dc0c6a0690a79ca400c1fe64aea8
                  MATRIX: 741->1|847->19|877->23|948->68|962->74|1026->118|1057->124|1068->128|1106->130|1134->132|1246->218|1260->224|1315->259|1607->524|1622->530|1676->563|1817->674
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|32->4|32->4|32->4|34->6|37->9|37->9|37->9|47->19|47->19|47->19|54->26
                  -- GENERATED --
              */
          