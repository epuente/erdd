
package views.html.Recurso

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
object actualizadoMaster extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Recurso,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(r: Recurso):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import scala.collection.JavaConversions._
import helper._

Seq[Any](format.raw/*1.14*/(""" 
"""),format.raw/*3.1*/("""
"""),format.raw/*5.1*/("""

"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
	"""),format.raw/*8.2*/("""<div class="jumbotron">
		<div class="container">
			  <p>Los datos de su solicitud han sido registrados. En breve recibirá un aviso de actualización sobre el estado de su solicitud.</p>
		</div>
	</div>


""")))}),format.raw/*15.2*/("""
"""))}
  }

  def render(r:Recurso): play.twirl.api.HtmlFormat.Appendable = apply(r)

  def f:((Recurso) => play.twirl.api.HtmlFormat.Appendable) = (r) => apply(r)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/actualizadoMaster.scala.html
                  HASH: 634a2f79e1fda3e5d394f4fdddbdbd7bfcea34f5
                  MATRIX: 744->1|901->13|929->59|956->77|984->80|995->84|1033->86|1061->88|1298->295
                  LINES: 26->1|30->1|31->3|32->5|34->7|34->7|34->7|35->8|42->15
                  -- GENERATED --
              */
          