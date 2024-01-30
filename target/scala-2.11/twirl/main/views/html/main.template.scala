
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="es">
    <head>
        <title>ERDD</title>
        <script src=""""),_display_(/*7.23*/routes/*7.29*/.Assets.at("lib/jquery/jquery.min.js")),format.raw/*7.67*/("""" type="text/javascript"></script>
        <!-- <script src=""""),_display_(/*8.28*/routes/*8.34*/.Assets.at("jquery/jquery-2.2.4.min.js")),format.raw/*8.74*/("""" type="text/javascript"></script> -->
        <script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.at("lib/bootstrap/js/bootstrap.min.js")),format.raw/*9.76*/("""" type="text/javascript" defer></script>
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.at("lib/jquery-ui/jquery-ui.min.js")),format.raw/*10.73*/("""" type="text/javascript"  defer></script>
         
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*12.70*/routes/*12.76*/.Assets.at("lib/bootstrap/css/bootstrap.min.css")),format.raw/*12.125*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*13.70*/routes/*13.76*/.Assets.at("lib/bootstrap/css/bootstrap-theme.css")),format.raw/*13.127*/("""">   
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*14.70*/routes/*14.76*/.Assets.at("stylesheets/main.css")),format.raw/*14.110*/(""""/>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*15.70*/routes/*15.76*/.Assets.at("stylesheets/megamenu.css")),format.raw/*15.114*/(""""/>
        
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*17.70*/routes/*17.76*/.Assets.at("lib/jquery-ui/jquery-ui.css")),format.raw/*17.117*/("""">

	    <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">        
	    
	    <!-- librerías opcionales que activan el soporte de HTML5 para IE8 -->
	    <!--[if lt IE 9]>
	      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
	      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	    <![endif]-->   
	    <link rel="icon" type="image/png" href=""""),_display_(/*28.47*/routes/*28.53*/.Assets.at("images/favicon.png")),format.raw/*28.85*/("""">
	    
		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*30.64*/routes/*30.70*/.Assets.at("font-awesome-4.4.0/css/font-awesome.min.css")),format.raw/*30.127*/("""">	    

	    
		<script type="text/javascript" src='"""),_display_(/*33.40*/routes/*33.46*/.Application.javascriptRoutes()),format.raw/*33.77*/("""'></script>

	    
    </head>
    
<style>
.footer """),format.raw/*39.9*/("""{"""),format.raw/*39.10*/("""
  """),format.raw/*40.3*/("""position: absolute;
  bottom: 0;
  width: 100%;
  /* Set the fixed height of the footer here */
  height: auto;
  background-color: #f5f5f5;
"""),format.raw/*46.1*/("""}"""),format.raw/*46.2*/("""


"""),format.raw/*49.1*/("""/* Custom page CSS
-------------------------------------------------- */
/* Not required for template or sticky footer method. */

body > .container """),format.raw/*53.19*/("""{"""),format.raw/*53.20*/("""
  """),format.raw/*54.3*/("""padding: 0px 0px 0;
  margin: 0px;
"""),format.raw/*56.1*/("""}"""),format.raw/*56.2*/("""		

"""),format.raw/*58.1*/("""</style>    
    <body>
    	<div id="wrapper">
			<div class="header">
				<img src=""""),_display_(/*62.16*/routes/*62.22*/.Assets.at("images/escudoSEP-IPN.png")),format.raw/*62.60*/("""" class="img-responsive center-block" alt="Escudos" width="1920px" height="58px">
				<img src=""""),_display_(/*63.16*/routes/*63.22*/.Assets.at("images/indexEncabezado2.png")),format.raw/*63.63*/("""" class="img-responsive center-block" alt="Escudos" >
			</div>
			<div id="content">
				<div class="menu">"""),_display_(/*66.24*/megamenu()),format.raw/*66.34*/("""</div>
				<div class="contenido">
		            """),_display_(/*68.16*/content),format.raw/*68.23*/("""
		        """),format.raw/*69.11*/("""</div> 
			</div>
 			
			<div id="footer">
    			<div style="background-color: #6c1645; text-align: center;">
    				<img src=""""),_display_(/*74.20*/routes/*74.26*/.Assets.at("images/pie.png")),format.raw/*74.54*/(""""  class="img-responsive center-block" alt="Datos de la UPEV">
    			</div>			
			</div>
        </div> 
    </body>
</html>

"""))}
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/main.scala.html
                  HASH: 598a67f4ebd1bd394bfdb30524b02491ff07c1b4
                  MATRIX: 720->1|823->16|851->18|971->112|985->118|1043->156|1131->218|1145->224|1205->264|1292->325|1306->331|1373->378|1463->441|1478->447|1543->491|1691->612|1706->618|1777->667|1876->739|1891->745|1964->796|2066->871|2081->877|2137->911|2237->984|2252->990|2312->1028|2421->1110|2436->1116|2499->1157|3050->1681|3065->1687|3118->1719|3217->1791|3232->1797|3311->1854|3392->1908|3407->1914|3459->1945|3538->1997|3567->1998|3597->2001|3765->2142|3793->2143|3823->2146|4000->2295|4029->2296|4059->2299|4121->2334|4149->2335|4180->2339|4294->2426|4309->2432|4368->2470|4492->2567|4507->2573|4569->2614|4705->2723|4736->2733|4813->2783|4841->2790|4880->2801|5038->2932|5053->2938|5102->2966
                  LINES: 26->1|29->1|31->3|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|45->17|45->17|45->17|56->28|56->28|56->28|58->30|58->30|58->30|61->33|61->33|61->33|67->39|67->39|68->40|74->46|74->46|77->49|81->53|81->53|82->54|84->56|84->56|86->58|90->62|90->62|90->62|91->63|91->63|91->63|94->66|94->66|96->68|96->68|97->69|102->74|102->74|102->74
                  -- GENERATED --
              */
          