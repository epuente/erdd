
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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(forma: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.34*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.at("stylesheets/index.css")),format.raw/*4.87*/(""""/> 
<link rel="stylesheet" media="screen" href=""""),_display_(/*5.46*/routes/*5.52*/.Assets.at("stylesheets/login.css")),format.raw/*5.87*/(""""/>

<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*7.62*/routes/*7.68*/.Assets.at("font-awesome-4.4.0/css/font-awesome.min.css")),format.raw/*7.125*/("""">


  <style>
    section """),format.raw/*11.13*/("""{"""),format.raw/*11.14*/("""
        """),format.raw/*12.9*/("""border-radius: 1em;
        padding: 1em;
        position: absolute;
        top: 50%;
        left: 50%;
        margin-right: -50%;
        transform: translate(-50%, -50%) 
    """),format.raw/*19.5*/("""}"""),format.raw/*19.6*/("""
  """),format.raw/*20.3*/("""</style>


"""),_display_(/*23.2*/layoutIndex/*23.13*/{_display_(Seq[Any](format.raw/*23.14*/("""
    """),format.raw/*24.5*/("""<!DOCTYPE html>
    <section>
        """),_display_(/*26.10*/form(   routes.Application.autentica(), 'role -> "form", 'id->"frmLogin")/*26.83*/ {_display_(Seq[Any](format.raw/*26.85*/("""
            """),_display_(/*27.14*/loginForm(forma)),format.raw/*27.30*/("""
        """)))}),format.raw/*28.10*/("""
    """),format.raw/*29.5*/("""</section>

		
""")))}),format.raw/*32.2*/("""

"""),format.raw/*34.1*/("""<script type="text/javascript">
$(document).ready(function() """),format.raw/*35.30*/("""{"""),format.raw/*35.31*/("""	
	"""),format.raw/*36.2*/("""$('#frmLogin').attr("data-toggle","validator");
	$('#usuario').focus();
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/(""");




</script>
<script src=""""),_display_(/*44.15*/routes/*44.21*/.Assets.at("javascripts/login.js")),format.raw/*44.55*/("""" type="text/javascript"></script>
"""))}
  }

  def render(forma:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(forma)

  def f:((Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (forma) => apply(forma)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/login.scala.html
                  HASH: a11cd0fc5cc41feee8b2dc89a6fd3626eec6f911
                  MATRIX: 740->1|875->33|902->51|929->52|1000->97|1014->103|1069->138|1145->188|1159->194|1214->229|1306->295|1320->301|1398->358|1453->385|1482->386|1518->395|1726->576|1754->577|1784->580|1822->592|1842->603|1881->604|1913->609|1979->648|2061->721|2101->723|2142->737|2179->753|2220->763|2252->768|2298->784|2327->786|2416->847|2445->848|2475->851|2574->923|2602->924|2660->955|2675->961|2730->995
                  LINES: 26->1|29->1|30->3|31->4|31->4|31->4|31->4|32->5|32->5|32->5|34->7|34->7|34->7|38->11|38->11|39->12|46->19|46->19|47->20|50->23|50->23|50->23|51->24|53->26|53->26|53->26|54->27|54->27|55->28|56->29|59->32|61->34|62->35|62->35|63->36|65->38|65->38|71->44|71->44|71->44
                  -- GENERATED --
              */
          