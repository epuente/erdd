
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
object conOficio extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Recurso,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(r: Recurso):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.14*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
	"""),format.raw/*3.2*/("""<div class="jumbotron">
		<div class="container">
			<p>Se ha recibido el oficio con número """),_display_(/*5.44*/r/*5.45*/.oficio.numero),format.raw/*5.59*/(""" """),format.raw/*5.60*/("""y con folio """),_display_(/*5.73*/r/*5.74*/.oficio.folio),format.raw/*5.87*/("""</p>
		</div>
	</div>

""")))}))}
  }

  def render(r:Recurso): play.twirl.api.HtmlFormat.Appendable = apply(r)

  def f:((Recurso) => play.twirl.api.HtmlFormat.Appendable) = (r) => apply(r)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/conOficio.scala.html
                  HASH: b7cf9824724020ed1632aba4d51fb93a7d85d002
                  MATRIX: 736->1|836->13|863->15|874->19|911->20|939->22|1058->115|1067->116|1101->130|1129->131|1168->144|1177->145|1210->158
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|33->5|33->5|33->5|33->5|33->5|33->5|33->5
                  -- GENERATED --
              */
          