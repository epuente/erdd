
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
object notFoundPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(s:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.12*/("""

  """),format.raw/*3.3*/("""<style>
    section """),format.raw/*4.13*/("""{"""),format.raw/*4.14*/("""
        """),format.raw/*5.9*/("""border-radius: 1em;
        padding: 1em;
        position: absolute;
        top: 50%;
        left: 50%;
        margin-right: -50%;
        transform: translate(-50%, -50%) 
    """),format.raw/*12.5*/("""}"""),format.raw/*12.6*/("""
  """),format.raw/*13.3*/("""</style>


"""),_display_(/*16.2*/layoutIndex/*16.13*/{_display_(Seq[Any](format.raw/*16.14*/("""

"""),format.raw/*18.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*18.46*/routes/*18.52*/.Assets.at("stylesheets/index.css")),format.raw/*18.87*/(""""/>

        <div class="container">
          <section>
              <h1 class="error-number">Ocurrió un error</h1>
                  <h2>No existe la acción solicitada.</h2> 
                  <h2>No se encontró la página """),_display_(/*24.49*/s),format.raw/*24.50*/("""</h2>
            </section>
        </div>
""")))}),format.raw/*27.2*/("""
"""))}
  }

  def render(s:String): play.twirl.api.HtmlFormat.Appendable = apply(s)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (s) => apply(s)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/notFoundPage.scala.html
                  HASH: 2a738bcf9537fd6945405e5fbf2ce9c0152383aa
                  MATRIX: 730->1|828->11|858->15|905->35|933->36|968->45|1176->226|1204->227|1234->230|1272->242|1292->253|1331->254|1360->256|1432->301|1447->307|1503->342|1756->568|1778->569|1853->614
                  LINES: 26->1|29->1|31->3|32->4|32->4|33->5|40->12|40->12|41->13|44->16|44->16|44->16|46->18|46->18|46->18|46->18|52->24|52->24|55->27
                  -- GENERATED --
              */
          