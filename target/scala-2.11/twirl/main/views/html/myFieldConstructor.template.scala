
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
object myFieldConstructor extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.53*/("""

"""),format.raw/*7.1*/("""<div class="form-group clearfix """),_display_(/*7.34*/if(elements.hasErrors)/*7.56*/ {_display_(Seq[Any](format.raw/*7.58*/("""error""")))}),format.raw/*7.64*/("""">
	<label for=""""),_display_(/*8.15*/elements/*8.23*/.id),format.raw/*8.26*/("""" class="control-label">"""),_display_(/*8.51*/elements/*8.59*/.args.get('labelAlterna)),format.raw/*8.83*/("""</label>
	"""),_display_(/*9.3*/if(elements.toString.contains("<input type=\"radio\""))/*9.58*/{_display_(Seq[Any](format.raw/*9.59*/("""
	""")))}/*10.4*/else/*10.9*/{_display_(Seq[Any](format.raw/*10.10*/("""
		"""),_display_(/*11.4*/if(elements.args.get('label).nonEmpty  || (elements.args.get('label).isDefined) )/*11.85*/ {_display_(Seq[Any](format.raw/*11.87*/("""
			"""),_display_(/*12.5*/if(elements.label.toString.contains(".id"))/*12.48*/{_display_(Seq[Any](format.raw/*12.49*/("""
				"""),format.raw/*13.5*/("""<label for=""""),_display_(/*13.18*/elements/*13.26*/.id),format.raw/*13.29*/("""" class="control-label">"""),_display_(/*13.54*/elements/*13.62*/.label.toString.capitalize.dropRight(3)),format.raw/*13.101*/("""</label>
			""")))}/*14.6*/else/*14.11*/{_display_(Seq[Any](format.raw/*14.12*/("""
			"""),format.raw/*15.4*/("""<label for=""""),_display_(/*15.17*/elements/*15.25*/.id),format.raw/*15.28*/("""" class="control-label">"""),_display_(/*15.53*/elements/*15.61*/.label),format.raw/*15.67*/("""</label>
			""")))}),format.raw/*16.5*/("""
		""")))}),format.raw/*17.4*/("""
	""")))}),format.raw/*18.3*/("""
    """),format.raw/*19.5*/("""<div class="input input-group">		    
		    	"""),_display_(/*20.9*/elements/*20.17*/.input),format.raw/*20.23*/("""		    	
		    """),format.raw/*21.7*/("""<span class="help-block with-errors"></span>
	</div>
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
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/myFieldConstructor.scala.html
                  HASH: 33bc335d0562e02d61804a6a0be25cefb03f4011
                  MATRIX: 750->1|870->33|899->193|927->195|986->228|1016->250|1055->252|1091->258|1134->275|1150->283|1173->286|1224->311|1240->319|1284->343|1320->354|1383->409|1421->410|1442->414|1454->419|1493->420|1523->424|1613->505|1653->507|1684->512|1736->555|1775->556|1807->561|1847->574|1864->582|1888->585|1940->610|1957->618|2018->657|2049->671|2062->676|2101->677|2132->681|2172->694|2189->702|2213->705|2265->730|2282->738|2309->744|2352->757|2386->761|2419->764|2451->769|2523->815|2540->823|2567->829|2608->843
                  LINES: 26->1|29->1|31->5|33->7|33->7|33->7|33->7|33->7|34->8|34->8|34->8|34->8|34->8|34->8|35->9|35->9|35->9|36->10|36->10|36->10|37->11|37->11|37->11|38->12|38->12|38->12|39->13|39->13|39->13|39->13|39->13|39->13|39->13|40->14|40->14|40->14|41->15|41->15|41->15|41->15|41->15|41->15|41->15|42->16|43->17|44->18|45->19|46->20|46->20|46->20|47->21
                  -- GENERATED --
              */
          