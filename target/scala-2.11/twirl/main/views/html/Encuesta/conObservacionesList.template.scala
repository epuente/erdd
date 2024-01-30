
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
object conObservacionesList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[EncuestaRespuesta],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(encres:List[EncuestaRespuesta]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""
	"""),format.raw/*3.2*/("""<div class="container-fluid" style="background-color: white; padding: 10px;">
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">					
				  		<li>Encuestas</li>
				  		<li class="active">Con observaciones</a></li>
				</ol>			
			</div>
		</div>	
		<div class="row">
			<div class="col-md-12">
					<h3>Encuestas con observaciones					</h3>			
			</div>
		</div>

		<div class="row">
			<div class="col-lg-12">
				"""),_display_(/*20.6*/comunListarEncuestas(encres)),format.raw/*20.34*/("""
			"""),format.raw/*21.4*/("""</div>
		</div>
	</div>
""")))}),format.raw/*24.2*/("""

"""),format.raw/*26.1*/("""<script type="text/javascript">


</script>"""))}
  }

  def render(encres:List[EncuestaRespuesta]): play.twirl.api.HtmlFormat.Appendable = apply(encres)

  def f:((List[EncuestaRespuesta]) => play.twirl.api.HtmlFormat.Appendable) = (encres) => apply(encres)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:36 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Encuesta/conObservacionesList.scala.html
                  HASH: e5529c98298e55096594035e29899a37666844b3
                  MATRIX: 764->1|884->33|911->35|922->39|959->40|987->42|1454->483|1503->511|1534->515|1589->540|1618->542
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|48->20|48->20|49->21|52->24|54->26
                  -- GENERATED --
              */
          