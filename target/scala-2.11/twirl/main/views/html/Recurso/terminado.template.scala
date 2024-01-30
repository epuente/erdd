
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
object terminado extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Recurso,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(r: Recurso):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.14*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
	"""),format.raw/*3.2*/("""<div class="jumbotron">
		<div class="container">
			<p>El recurso ha sido evaluado satisfactoriamente</p>
			
			<p>Conteste la siguiente <a href="/encuesta">encuesta</a> </p>
			
			
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
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/terminado.scala.html
                  HASH: 0680a612b6787fee5a3aebe031b40188d0628e05
                  MATRIX: 736->1|836->13|863->15|874->19|911->20|939->22
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3
                  -- GENERATED --
              */
          