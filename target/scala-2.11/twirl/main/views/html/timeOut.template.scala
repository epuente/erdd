
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
object timeOut extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(forma: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*4.83*/("""

"""),format.raw/*6.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*6.46*/routes/*6.52*/.Assets.at("stylesheets/index.css")),format.raw/*6.87*/(""""/> 
<link rel="stylesheet" media="screen" href=""""),_display_(/*7.46*/routes/*7.52*/.Assets.at("stylesheets/login.css")),format.raw/*7.87*/(""""/>

<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*9.62*/routes/*9.68*/.Assets.at("font-awesome-4.4.0/css/font-awesome.min.css")),format.raw/*9.125*/("""">

"""),_display_(/*11.2*/layoutIndex/*11.13*/{_display_(Seq[Any](format.raw/*11.14*/("""

"""),format.raw/*13.1*/("""<!DOCTYPE html>


  <style>
    section """),format.raw/*17.13*/("""{"""),format.raw/*17.14*/("""
        """),format.raw/*18.9*/("""border-radius: 1em;
        padding: 1em;
        position: absolute;
        top: 50%;
        left: 50%;
        margin-right: -50%;
        transform: translate(-50%, -50%) 
    """),format.raw/*25.5*/("""}"""),format.raw/*25.6*/("""
  """),format.raw/*26.3*/("""</style>
  <section>
    <h1>La sesión ha expirado</h1>
    <p>Vuelva a ingresar con su usuario y contraseña
    
        """),_display_(/*31.10*/form(   routes.Application.autentica(), 'role -> "form", 'id->"frmLogin", 'class->"form-inline")/*31.106*/ {_display_(Seq[Any](format.raw/*31.108*/("""
            
            """),format.raw/*33.13*/("""<div class="form-group">
                <label class="sr-only" for="usuario">Usuario</label>
                <input type="text" id="usuario" placeholder="Nombre de usuario" class="form-control">
            </div>
            <div class="form-group">
                <label class="sr-only" for="password">Clave de acceso</label>
                <input type="password" id="password" placeholder="Clave de acceso" class="form-control">
            </div>
            <div class="form-group">
                <input type="button" class="btn btn-primary btn-block" value="Entrar" id="btnLogin"">
            </div>
            
        """)))}),format.raw/*45.10*/("""
        """),format.raw/*46.9*/("""<div id="msgLogin"></div>    
    
    
  </section>
""")))}),format.raw/*50.2*/("""

"""),format.raw/*52.1*/("""<script type="text/javascript">
$(document).ready(function() """),format.raw/*53.30*/("""{"""),format.raw/*53.31*/("""  
    """),format.raw/*54.5*/("""$('#frmLogin').attr("data-toggle","validator");
    $('#usuario').focus();
"""),format.raw/*56.1*/("""}"""),format.raw/*56.2*/(""");

</script>

<script src=""""),_display_(/*60.15*/routes/*60.21*/.Assets.at("javascripts/login.js")),format.raw/*60.55*/("""" type="text/javascript"></script>


"""))}
  }

  def render(forma:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(forma)

  def f:((Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (forma) => apply(forma)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/timeOut.scala.html
                  HASH: d7370870e870082970492798088a34bad44ed0a0
                  MATRIX: 742->1|869->53|901->77|988->33|1017->134|1045->136|1116->181|1130->187|1185->222|1261->272|1275->278|1330->313|1422->379|1436->385|1514->442|1545->447|1565->458|1604->459|1633->461|1701->501|1730->502|1766->511|1974->692|2002->693|2032->696|2182->819|2288->915|2329->917|2383->943|3048->1577|3084->1586|3168->1640|3197->1642|3286->1703|3315->1704|3349->1711|3451->1786|3479->1787|3535->1816|3550->1822|3605->1856
                  LINES: 26->1|28->4|28->4|29->1|31->4|33->6|33->6|33->6|33->6|34->7|34->7|34->7|36->9|36->9|36->9|38->11|38->11|38->11|40->13|44->17|44->17|45->18|52->25|52->25|53->26|58->31|58->31|58->31|60->33|72->45|73->46|77->50|79->52|80->53|80->53|81->54|83->56|83->56|87->60|87->60|87->60
                  -- GENERATED --
              */
          