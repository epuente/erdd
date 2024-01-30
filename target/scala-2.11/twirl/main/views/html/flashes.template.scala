
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
object flashes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.6*/if(flash.containsKey("success"))/*1.38*/ {_display_(Seq[Any](format.raw/*1.40*/("""
        """),format.raw/*2.9*/("""<div class="alert alert-success" role="alert">
            <strong>"""),_display_(/*3.22*/flash/*3.27*/.get("success")),format.raw/*3.42*/("""</strong>
        </div>
    """)))}),format.raw/*5.6*/("""
    """),_display_(/*6.6*/if(flash.containsKey("warning"))/*6.38*/ {_display_(Seq[Any](format.raw/*6.40*/("""
        """),format.raw/*7.9*/("""<div class="alert alert-warning" role="alert">
            <strong>"""),_display_(/*8.22*/flash/*8.27*/.get("warning")),format.raw/*8.42*/("""</strong>
        </div>
    """)))}),format.raw/*10.6*/("""    """),_display_(/*10.11*/if(flash.containsKey("error"))/*10.41*/ {_display_(Seq[Any](format.raw/*10.43*/("""
        """),format.raw/*11.9*/("""<div class="alert alert-danger" role="alert">
            <strong>"""),_display_(/*12.22*/flash/*12.27*/.get("error")),format.raw/*12.40*/("""</strong>
        </div>
    """)))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/flashes.scala.html
                  HASH: 0902da88b2130145deaf809876bc3556bc4a3361
                  MATRIX: 800->5|840->37|879->39|914->48|1008->116|1021->121|1056->136|1115->166|1146->172|1186->204|1225->206|1260->215|1354->283|1367->288|1402->303|1462->333|1494->338|1533->368|1573->370|1609->379|1703->446|1717->451|1751->464
                  LINES: 29->1|29->1|29->1|30->2|31->3|31->3|31->3|33->5|34->6|34->6|34->6|35->7|36->8|36->8|36->8|38->10|38->10|38->10|38->10|39->11|40->12|40->12|40->12
                  -- GENERATED --
              */
          