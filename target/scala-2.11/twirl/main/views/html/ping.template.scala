
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
object ping extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""$(function() """),format.raw/*1.14*/("""{"""),format.raw/*1.15*/("""
    """),format.raw/*2.5*/("""var WS = window['MozWebSocket'] ? MozWebSocket : WebSocket
    var dateSocket = new WS(""""),_display_(/*3.31*/routes/*3.37*/.RecursoWebController.pingWs().webSocketURL(request)),format.raw/*3.89*/("""")

    var receiveEvent = function(event) """),format.raw/*5.40*/("""{"""),format.raw/*5.41*/("""
        """),format.raw/*6.9*/("""$("#ping").html("Last ping: "+event.data);
    """),format.raw/*7.5*/("""}"""),format.raw/*7.6*/("""

    """),format.raw/*9.5*/("""dateSocket.onmessage = receiveEvent
"""),format.raw/*10.1*/("""}"""),format.raw/*10.2*/(""")
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/ping.scala.html
                  HASH: 1c0cbdcc047aa00254b1cd655128ea545315fc76
                  MATRIX: 797->0|837->13|865->14|896->19|1011->108|1025->114|1097->166|1167->209|1195->210|1230->219|1303->266|1330->267|1362->273|1425->309|1453->310
                  LINES: 29->1|29->1|29->1|30->2|31->3|31->3|31->3|33->5|33->5|34->6|35->7|35->7|37->9|38->10|38->10
                  -- GENERATED --
              */
          