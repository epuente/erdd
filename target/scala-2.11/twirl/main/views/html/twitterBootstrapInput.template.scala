
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
object twitterBootstrapInput extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.53*/("""


"""),format.raw/*8.1*/("""<div class="clearfix """),_display_(/*8.23*/if(elements.hasErrors)/*8.45*/ {_display_(Seq[Any](format.raw/*8.47*/("""error""")))}),format.raw/*8.53*/("""">
    <label for=""""),_display_(/*9.18*/elements/*9.26*/.id),format.raw/*9.29*/("""">"""),_display_(/*9.32*/elements/*9.40*/.label),format.raw/*9.46*/("""</label>
    <div class="input">
        """),_display_(/*11.10*/elements/*11.18*/.input),format.raw/*11.24*/("""
        
        """),format.raw/*13.59*/("""
        """),format.raw/*16.11*/(""" 
    """),format.raw/*17.5*/("""</div>
</div>
"""))}
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/twitterBootstrapInput.scala.html
                  HASH: ab78fb9698803cb2e9dfc6f8b8f00f85d955b525
                  MATRIX: 753->1|873->33|902->193|931->196|979->218|1009->240|1048->242|1084->248|1130->268|1146->276|1169->279|1198->282|1214->290|1240->296|1309->338|1326->346|1353->352|1399->420|1436->514|1469->520
                  LINES: 26->1|29->1|31->5|34->8|34->8|34->8|34->8|34->8|35->9|35->9|35->9|35->9|35->9|35->9|37->11|37->11|37->11|39->13|40->16|41->17
                  -- GENERATED --
              */
          