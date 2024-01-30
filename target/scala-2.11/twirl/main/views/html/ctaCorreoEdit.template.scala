
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
object ctaCorreoEdit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Ctacorreo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ccForm: Form[Ctacorreo]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
	"""),format.raw/*8.2*/("""<div class=container-fluid style="background-color: white; padding: 10px;">
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li class="active">Correo electrónico</li>					  
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
				    <h3>Cuenta de correo de salida del sistema ERDD</h3>    
				    """),_display_(/*19.10*/if(flash.containsKey("success"))/*19.42*/ {_display_(Seq[Any](format.raw/*19.44*/("""
				        """),format.raw/*20.13*/("""<div class="alert alert-success" role="alert">
				             """),_display_(/*21.19*/flash/*21.24*/.get("success")),format.raw/*21.39*/("""
				        """),format.raw/*22.13*/("""</div>
				    """)))}),format.raw/*23.10*/("""
				    """),_display_(/*24.10*/form(CSRF(routes.CtacorreoController.update(1L)))/*24.59*/ {_display_(Seq[Any](format.raw/*24.61*/("""
				        
				        """),format.raw/*26.13*/("""<fieldset>
				            """),_display_(/*27.18*/inputText(ccForm("hostname"), '_label -> "Nombre del host", '_help -> "", 'size->"35px")),format.raw/*27.106*/("""
				            """),_display_(/*28.18*/inputText(ccForm("puerto"), '_label -> "Número de puerto", '_help -> "")),format.raw/*28.90*/("""
				            """),_display_(/*29.18*/inputText(ccForm("cuenta"), '_label -> "Cuenta", '_help -> "", 'size->"35px")),format.raw/*29.95*/("""
				        """),format.raw/*30.13*/("""</fieldset>
				        <div class="actions">
				            <input type="submit" value="Actualizar datos" class="btn btn-primary"> 
				            <a href=""""),_display_(/*33.27*/routes/*33.33*/.AdminController.index()),format.raw/*33.57*/("""" class="btn btn-default">Cancelar</a> 
				        </div>
				    """)))}),format.raw/*35.10*/("""
			    """),format.raw/*36.8*/("""</div>
		    </div>
    </div>       
""")))}),format.raw/*39.2*/("""
"""))}
  }

  def render(ccForm:Form[Ctacorreo]): play.twirl.api.HtmlFormat.Appendable = apply(ccForm)

  def f:((Form[Ctacorreo]) => play.twirl.api.HtmlFormat.Appendable) = (ccForm) => apply(ccForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/ctaCorreoEdit.scala.html
                  HASH: 21a2718f2077246394a9ebe6ffda33a3de207e89
                  MATRIX: 740->1|860->47|892->71|976->26|1004->45|1032->125|1061->129|1072->133|1110->135|1138->137|1534->506|1575->538|1615->540|1656->553|1748->618|1762->623|1798->638|1839->651|1886->667|1923->677|1981->726|2021->728|2075->754|2130->782|2240->870|2285->888|2378->960|2423->978|2521->1055|2562->1068|2749->1228|2764->1234|2809->1258|2908->1326|2943->1334|3012->1373
                  LINES: 26->1|28->5|28->5|29->1|31->4|32->5|34->7|34->7|34->7|35->8|46->19|46->19|46->19|47->20|48->21|48->21|48->21|49->22|50->23|51->24|51->24|51->24|53->26|54->27|54->27|55->28|55->28|56->29|56->29|57->30|60->33|60->33|60->33|62->35|63->36|66->39
                  -- GENERATED --
              */
          