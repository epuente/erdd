
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
object index2 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main2("Welcome to Play")/*1.26*/ {_display_(Seq[Any](format.raw/*1.28*/("""

    """),format.raw/*3.5*/("""<strong>Stats</strong><br>
    <div id="ping"></div>



//******************
//HACER ESTO MISMO PERO CON AJAX
<button onclick="javascript:mensaje()">Enviar</button>


<script>
$(function() """),format.raw/*14.14*/("""{"""),format.raw/*14.15*/("""
    """),format.raw/*15.5*/("""var WS = window['MozWebSocket'] ? MozWebSocket : WebSocket;
console.log(""""),_display_(/*16.15*/routes/*16.21*/.RecursoWebController.pingWs().webSocketURL(request)),format.raw/*16.73*/("""")
    var dateSocket = new WS(""""),_display_(/*17.31*/routes/*17.37*/.RecursoWebController.pingWs().webSocketURL(request)),format.raw/*17.89*/("""");

    var receiveEvent = function(event) """),format.raw/*19.40*/("""{"""),format.raw/*19.41*/("""
        """),format.raw/*20.9*/("""$("#ping").html("Last ping: "+event.data);
    """),format.raw/*21.5*/("""}"""),format.raw/*21.6*/("""

    """),format.raw/*23.5*/("""dateSocket.onmessage = receiveEvent;
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/(""")


function mensaje()"""),format.raw/*27.19*/("""{"""),format.raw/*27.20*/("""

	"""),format.raw/*29.2*/("""$.ajax("""),format.raw/*29.9*/("""{"""),format.raw/*29.10*/("""					
		  """),format.raw/*30.5*/("""type: "GET",
		  url: """"),_display_(/*31.12*/routes/*31.18*/.RecursoWebController.pingWs()),format.raw/*31.48*/(""""

		"""),format.raw/*33.3*/("""}"""),format.raw/*33.4*/(""")
	  .success(function( data ) """),format.raw/*34.30*/("""{"""),format.raw/*34.31*/("""
		  """),format.raw/*35.5*/("""console.log("Ennviado mensaje");
	  """),format.raw/*36.4*/("""}"""),format.raw/*36.5*/(""")					
	  .error(function(data)"""),format.raw/*37.25*/("""{"""),format.raw/*37.26*/("""
		  """),format.raw/*38.5*/("""alert("error en ajax " +data);
	  """),format.raw/*39.4*/("""}"""),format.raw/*39.5*/(""")		
	
	
	
		
	
"""),format.raw/*45.1*/("""}"""),format.raw/*45.2*/("""



"""),format.raw/*49.1*/("""</script>






""")))}),format.raw/*56.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/index2.scala.html
                  HASH: c5236f16bb703485b083f4217ea5d6601a866390
                  MATRIX: 799->1|831->25|870->27|902->33|1119->222|1148->223|1180->228|1281->302|1296->308|1369->360|1429->393|1444->399|1517->451|1589->495|1618->496|1654->505|1728->552|1756->553|1789->559|1853->596|1881->597|1931->619|1960->620|1990->623|2024->630|2053->631|2090->641|2141->665|2156->671|2207->701|2239->706|2267->707|2326->738|2355->739|2387->744|2450->780|2478->781|2537->812|2566->813|2598->818|2659->852|2687->853|2729->868|2757->869|2788->873|2835->890
                  LINES: 29->1|29->1|29->1|31->3|42->14|42->14|43->15|44->16|44->16|44->16|45->17|45->17|45->17|47->19|47->19|48->20|49->21|49->21|51->23|52->24|52->24|55->27|55->27|57->29|57->29|57->29|58->30|59->31|59->31|59->31|61->33|61->33|62->34|62->34|63->35|64->36|64->36|65->37|65->37|66->38|67->39|67->39|73->45|73->45|77->49|84->56
                  -- GENERATED --
              */
          