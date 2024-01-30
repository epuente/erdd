
package views.html.Encuesta

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
object terminadasList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[EncuestaRespuesta],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(encter:List[EncuestaRespuesta]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
	"""),format.raw/*3.2*/("""<div class="container-fluid" style="background-color: white; padding: 10px;">
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">					
				  		<li>Encuestas</li>
				  		<li class="active">Terminadas</a></li>
				</ol>			
			</div>
		</div>	
		<div class="row">
			<div class="col-md-12">
					<h3>Encuestas terminadas				</h3>			
			</div>
		</div>

		<div class="row">
			<div class="col-lg-12">
				"""),_display_(/*20.6*/comunListarEncuestas(encter)),format.raw/*20.34*/("""
			"""),format.raw/*21.4*/("""</div>
		</div>
	</div>
""")))}),format.raw/*24.2*/("""

"""),format.raw/*26.1*/("""<script type="text/javascript">


</script>"""))}
  }

  def render(encter:List[EncuestaRespuesta]): play.twirl.api.HtmlFormat.Appendable = apply(encter)

  def f:((List[EncuestaRespuesta]) => play.twirl.api.HtmlFormat.Appendable) = (encter) => apply(encter)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:36 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Encuesta/terminadasList.scala.html
                  HASH: e21d5ca74fad97117f543f6d60ff41c162c85cc6
                  MATRIX: 758->1|878->33|905->35|916->39|953->40|981->42|1433->468|1482->496|1513->500|1568->525|1597->527
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|48->20|48->20|49->21|52->24|54->26
                  -- GENERATED --
              */
          