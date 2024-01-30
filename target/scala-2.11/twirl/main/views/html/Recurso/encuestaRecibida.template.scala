
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
object encuestaRecibida extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Recurso,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(r: Recurso):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.14*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
	"""),format.raw/*3.2*/("""<div class="jumbotron">
		<div class="container">
			<p>Se ha recibido correctamente la encuesta.</p>
			
			<p>El administradador procederá a hacer la revisión correspondiente</p>
			
			
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
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/encuestaRecibida.scala.html
                  HASH: 4df4d6681c3ee0f1793d354c0065b3f1996ff8fd
                  MATRIX: 743->1|843->13|870->15|881->19|918->20|946->22
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3
                  -- GENERATED --
              */
          