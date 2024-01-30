
package views.html.admin

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

Seq[Any](_display_(/*1.2*/main/*1.6*/ {_display_(Seq[Any](format.raw/*1.8*/("""

	"""),format.raw/*3.2*/("""<table style="height: 200px; width: 80%;">
		<tr>
			<td style="padding: 50px">Bienvenido(a)<br><br>						
				"""),_display_(/*6.6*/if( session.get("cvesRoles").contains("1 "))/*6.50*/{_display_(Seq[Any](format.raw/*6.51*/("""
					"""),_display_(/*7.7*/session/*7.14*/.get("nombre")),format.raw/*7.28*/(""" """),format.raw/*7.29*/("""al m&oacute;dulo de administraci&oacute;n
				""")))}),format.raw/*8.6*/("""
				"""),_display_(/*9.6*/if( session.get("cvesRoles").contains("2 "))/*9.50*/{_display_(Seq[Any](format.raw/*9.51*/("""
					"""),_display_(/*10.7*/session/*10.14*/.get("nombre")),format.raw/*10.28*/(""" """),format.raw/*10.29*/("""al m&oacute;dulo de evaluación
				""")))}),format.raw/*11.6*/("""				
			"""),format.raw/*12.4*/("""</td>
		</tr>
	</table>

""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/admin/index.scala.html
                  HASH: caaec47d9b0833c51a287e158f415181b9bc7a44
                  MATRIX: 804->1|815->5|853->7|882->10|1019->122|1071->166|1109->167|1141->174|1156->181|1190->195|1218->196|1294->243|1325->249|1377->293|1415->294|1448->301|1464->308|1499->322|1528->323|1594->359|1629->367
                  LINES: 29->1|29->1|29->1|31->3|34->6|34->6|34->6|35->7|35->7|35->7|35->7|36->8|37->9|37->9|37->9|38->10|38->10|38->10|38->10|39->11|40->12
                  -- GENERATED --
              */
          