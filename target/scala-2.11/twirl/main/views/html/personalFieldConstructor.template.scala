
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
object personalFieldConstructor extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.53*/("""

"""),format.raw/*7.1*/("""<div class="form-group clearfix """),_display_(/*7.34*/if(elements.hasErrors)/*7.56*/ {_display_(Seq[Any](format.raw/*7.58*/("""error""")))}),format.raw/*7.64*/("""">




	<label for=""""),_display_(/*12.15*/elements/*12.23*/.id),format.raw/*12.26*/("""" class="control-label">"""),_display_(/*12.51*/elements/*12.59*/.args.get('labelAlterna)),format.raw/*12.83*/("""</label>
	"""),_display_(/*13.3*/if(elements.toString.contains("<input type=\"radio\""))/*13.58*/{_display_(Seq[Any](format.raw/*13.59*/("""
	""")))}/*14.4*/else/*14.9*/{_display_(Seq[Any](format.raw/*14.10*/("""
		"""),_display_(/*15.4*/if(elements.label != "" || elements.args.get('label)!="")/*15.61*/ {_display_(Seq[Any](format.raw/*15.63*/("""
			"""),_display_(/*16.5*/if(elements.label.toString.contains(".id"))/*16.48*/{_display_(Seq[Any](format.raw/*16.49*/("""
				"""),format.raw/*17.5*/("""<label for=""""),_display_(/*17.18*/elements/*17.26*/.id),format.raw/*17.29*/("""" class="control-label">"""),_display_(/*17.54*/elements/*17.62*/.label.toString.capitalize.dropRight(3)),format.raw/*17.101*/("""</label>
			""")))}/*18.6*/else/*18.11*/{_display_(Seq[Any](format.raw/*18.12*/("""
			"""),format.raw/*19.4*/("""<label for=""""),_display_(/*19.17*/elements/*19.25*/.id),format.raw/*19.28*/("""" class="control-label">"""),_display_(/*19.53*/elements/*19.61*/.label),format.raw/*19.67*/("""</label>
			""")))}),format.raw/*20.5*/("""
		""")))}),format.raw/*21.4*/("""
	""")))}),format.raw/*22.3*/("""
    """),format.raw/*23.5*/("""<div class="input input-group" style="min-width:100%">
		    	"""),_display_(/*24.9*/elements/*24.17*/.input),format.raw/*24.23*/("""
		    """),format.raw/*25.7*/("""<span class="help-block with-errors"></span>
		    <div>
		    	"""),_display_(/*27.9*/if(elements.name=="dirigidoa.id")/*27.42*/{_display_(Seq[Any](format.raw/*27.43*/("""
		    		"""),format.raw/*28.9*/("""<textarea placeholder="Escriba su observacion..." name="observacion_"""),_display_(/*28.78*/(elements.name)),format.raw/*28.93*/("""[]" class="observacion" maxlength="600" style="min-width: 100%"></textarea>
		    		<button type="button" name="btnObservacion_"""),_display_(/*29.53*/(elements.name)),format.raw/*29.68*/("""[]" class="btn btn-primary btn-xs form-control" style="display:none5" >Corregir</button>
		    	""")))}/*30.10*/else/*30.15*/{_display_(Seq[Any](format.raw/*30.16*/("""
    				"""),format.raw/*31.9*/("""<textarea placeholder="Escriba su observacion..." name="observacion_"""),_display_(/*31.78*/elements/*31.86*/.name),format.raw/*31.91*/("""" class="observacion" maxlength="600" style="min-width: 100%"></textarea>
   					<button type="button" name="btnObservacion_"""),_display_(/*32.53*/elements/*32.61*/.name),format.raw/*32.66*/("""" class="btn btn-primary btn-xs form-control" style="display:none5">Corregir</button>
		    	""")))}),format.raw/*33.9*/("""
				"""),format.raw/*34.5*/("""<div class="errorObservacion" style="color:red"></div>		    	
		    </div>
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
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/personalFieldConstructor.scala.html
                  HASH: e7d60e22fe60a2d8bb99a856ba1fd4789acc7f42
                  MATRIX: 756->1|876->33|905->193|933->195|992->228|1022->250|1061->252|1097->258|1145->279|1162->287|1186->290|1238->315|1255->323|1300->347|1337->358|1401->413|1440->414|1461->418|1473->423|1512->424|1542->428|1608->485|1648->487|1679->492|1731->535|1770->536|1802->541|1842->554|1859->562|1883->565|1935->590|1952->598|2013->637|2044->651|2057->656|2096->657|2127->661|2167->674|2184->682|2208->685|2260->710|2277->718|2304->724|2347->737|2381->741|2414->744|2446->749|2535->812|2552->820|2579->826|2613->833|2704->898|2746->931|2785->932|2821->941|2917->1010|2953->1025|3108->1153|3144->1168|3260->1266|3273->1271|3312->1272|3348->1281|3444->1350|3461->1358|3487->1363|3640->1489|3657->1497|3683->1502|3807->1596|3839->1601
                  LINES: 26->1|29->1|31->5|33->7|33->7|33->7|33->7|33->7|38->12|38->12|38->12|38->12|38->12|38->12|39->13|39->13|39->13|40->14|40->14|40->14|41->15|41->15|41->15|42->16|42->16|42->16|43->17|43->17|43->17|43->17|43->17|43->17|43->17|44->18|44->18|44->18|45->19|45->19|45->19|45->19|45->19|45->19|45->19|46->20|47->21|48->22|49->23|50->24|50->24|50->24|51->25|53->27|53->27|53->27|54->28|54->28|54->28|55->29|55->29|56->30|56->30|56->30|57->31|57->31|57->31|57->31|58->32|58->32|58->32|59->33|60->34
                  -- GENERATED --
              */
          