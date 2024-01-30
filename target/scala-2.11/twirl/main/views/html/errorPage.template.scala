
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
object errorPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Throwable,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(t:Throwable):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.15*/("""


"""),format.raw/*4.1*/("""Ha ocurrido un error
"""),_display_(/*5.2*/t))}
  }

  def render(t:Throwable): play.twirl.api.HtmlFormat.Appendable = apply(t)

  def f:((Throwable) => play.twirl.api.HtmlFormat.Appendable) = (t) => apply(t)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/errorPage.scala.html
                  HASH: b330b9d43c57bd11bc4bc0bd88e168fda5b36489
                  MATRIX: 730->1|831->14|860->17|907->39
                  LINES: 26->1|29->1|32->4|33->5
                  -- GENERATED --
              */
          