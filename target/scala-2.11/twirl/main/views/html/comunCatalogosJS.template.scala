
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
object comunCatalogosJS extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tipo:String,  descripcion:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.36*/("""



"""),format.raw/*5.1*/("""<script type="text/javascript">
	"""),_display_(/*6.3*/if(tipo.toLowerCase()=="create")/*6.35*/{_display_(Seq[Any](format.raw/*6.36*/("""
		"""),format.raw/*7.3*/("""$(function() """),format.raw/*7.16*/("""{"""),format.raw/*7.17*/("""
			"""),format.raw/*8.4*/("""$('#frmCreate').attr("data-toggle","validator");
			$("input[type='text']:required").attr("data-error","Complete este campo.");
		"""),format.raw/*10.3*/("""}"""),format.raw/*10.4*/(""");		
	""")))}),format.raw/*11.3*/("""

	"""),_display_(/*13.3*/if(tipo.toLowerCase()=="edit")/*13.33*/{_display_(Seq[Any](format.raw/*13.34*/("""	
		"""),format.raw/*14.3*/("""$(function() """),format.raw/*14.16*/("""{"""),format.raw/*14.17*/("""
			"""),format.raw/*15.4*/("""$('#frmEdit').attr("data-toggle","validator");
			$("input[type='text']:required").attr("data-error","Complete este campo.");
		"""),format.raw/*17.3*/("""}"""),format.raw/*17.4*/(""");
		
		
		$('#frmDelete').on('submit', function(e)"""),format.raw/*20.43*/("""{"""),format.raw/*20.44*/("""
		    """),format.raw/*21.7*/("""e.preventDefault();    
		    if ( confirm("¿Desea eliminar """),_display_(/*22.38*/descripcion),format.raw/*22.49*/(""" """),format.raw/*22.50*/("""?")  )
		    	this.submit();    
		"""),format.raw/*24.3*/("""}"""),format.raw/*24.4*/(""");
	""")))}),format.raw/*25.3*/("""

"""),format.raw/*27.1*/("""</script>
<script src=""""),_display_(/*28.15*/routes/*28.21*/.Assets.at("javascripts/validator090.min.js")),format.raw/*28.66*/("""" type="text/javascript"></script>
"""))}
  }

  def render(tipo:String,descripcion:String): play.twirl.api.HtmlFormat.Appendable = apply(tipo,descripcion)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (tipo,descripcion) => apply(tipo,descripcion)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/comunCatalogosJS.scala.html
                  HASH: 26a223ee72dbcf30065dfa8a399abbe343042124
                  MATRIX: 741->1|863->35|893->39|952->73|992->105|1030->106|1059->109|1099->122|1127->123|1157->127|1314->257|1342->258|1379->265|1409->269|1448->299|1487->300|1518->304|1559->317|1588->318|1619->322|1774->450|1802->451|1881->502|1910->503|1944->510|2032->571|2064->582|2093->583|2155->618|2183->619|2218->624|2247->626|2298->650|2313->656|2379->701
                  LINES: 26->1|29->1|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|38->10|38->10|39->11|41->13|41->13|41->13|42->14|42->14|42->14|43->15|45->17|45->17|48->20|48->20|49->21|50->22|50->22|50->22|52->24|52->24|53->25|55->27|56->28|56->28|56->28
                  -- GENERATED --
              */
          