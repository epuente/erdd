
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
object layoutIndex extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contenido: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="es" class="webp">
    <head>
        <title>ERDD</title>
        
     <!--    <link rel='stylesheet' href='"""),_display_(/*8.44*/routes/*8.50*/.Assets.at("lib/bootstrap/css/bootstrap.min.css")),format.raw/*8.99*/("""'>    -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css")),format.raw/*9.94*/(""""/> 
<!--         <link rel="stylesheet" media="screen" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.at("stylesheets/recurso.css")),format.raw/*10.102*/(""""/>   -->
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*11.70*/routes/*11.76*/.Assets.at("lib/bootstrap/css/bootstrap.css")),format.raw/*11.121*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*12.70*/routes/*12.76*/.Assets.at("lib/bootstrap/css/bootstrap-theme.css")),format.raw/*12.127*/("""">   
        
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.at("lib/jquery/jquery.js")),format.raw/*14.63*/("""" type="text/javascript"></script>
         
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.at("lib/bootstrap/js/bootstrap.js")),format.raw/*16.72*/("""" type="text/javascript"></script>        
        
        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.at("javascripts/modernizr-webp-custom.js")),format.raw/*18.79*/(""""></script>

	    <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">        
	    <!-- librerías opcionales que activan el soporte de HTML5 para IE8 -->
	    <!--[if lt IE 9]>
	      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
	      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	    <![endif]-->        

        

    </head>
    <body> 
    	<div id="wrapper">
			<div class="header">
				<img src=""""),_display_(/*35.16*/routes/*35.22*/.Assets.at("images/escudoSEP-IPN.png")),format.raw/*35.60*/("""" class="img-responsive center-block" alt="Escudos" width="1920px" height="58px">
				<img src=""""),_display_(/*36.16*/routes/*36.22*/.Assets.at("images/indexEncabezado2.png")),format.raw/*36.63*/("""" class="img-responsive center-block" alt="Escudos" >
			</div>
			<div id="content">
				<div class="menu5">"""),_display_(/*39.25*/megamenu()),format.raw/*39.35*/("""</div>
				<div class="contenido">
		            """),_display_(/*41.16*/contenido),format.raw/*41.25*/("""
		        """),format.raw/*42.11*/("""</div> 
			</div>
			<div id="footer">
    			<div style="background-color: #6c1645; text-align: center;">
    				<img src=""""),_display_(/*46.20*/routes/*46.26*/.Assets.at("images/pie.png")),format.raw/*46.54*/(""""  class="img-responsive   center-block" alt="Datos de la UPEV">
    			</div>			
			</div>
        </div>  
			
			



        
    </body>
</html>



"""))}
  }

  def render(contenido:Html): play.twirl.api.HtmlFormat.Appendable = apply(contenido)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (contenido) => apply(contenido)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/layoutIndex.scala.html
                  HASH: 1e73a8b750c44e49dcbf973f6b522cb0bb6bcdd1
                  MATRIX: 727->1|832->18|860->20|1023->157|1037->163|1106->212|1195->275|1209->281|1263->315|1353->378|1368->384|1427->421|1533->500|1548->506|1615->551|1714->623|1729->629|1802->680|1866->717|1881->723|1936->757|2030->824|2045->830|2109->873|2210->947|2225->953|2296->1003|2907->1587|2922->1593|2981->1631|3105->1728|3120->1734|3182->1775|3319->1885|3350->1895|3427->1945|3457->1954|3496->1965|3649->2091|3664->2097|3713->2125
                  LINES: 26->1|29->1|31->3|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|44->16|44->16|44->16|46->18|46->18|46->18|63->35|63->35|63->35|64->36|64->36|64->36|67->39|67->39|69->41|69->41|70->42|74->46|74->46|74->46
                  -- GENERATED --
              */
          