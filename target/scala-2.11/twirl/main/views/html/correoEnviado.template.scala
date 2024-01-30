
package views.html

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
object correoEnviado extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mensaje:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.18*/("""

"""),format.raw/*3.1*/("""<html lang="es">
	<body>
	"""),_display_(/*5.3*/mensaje),format.raw/*5.10*/("""
	"""),format.raw/*6.2*/("""</body>
</html>
"""))}
  }

  def render(mensaje:String): play.twirl.api.HtmlFormat.Appendable = apply(mensaje)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (mensaje) => apply(mensaje)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/correoEnviado.scala.html
                  HASH: b65a2338e16ecfb06ba038a28a88ab7c6057c603
                  MATRIX: 731->1|835->17|863->19|915->46|942->53|970->55
                  LINES: 26->1|29->1|31->3|33->5|33->5|34->6
                  -- GENERATED --
              */
          