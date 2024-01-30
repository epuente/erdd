
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
object layoutCatalogos extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elCatalogo: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.20*/("""


"""),format.raw/*4.1*/("""<script type="text/javascript" src=""""),_display_(/*4.38*/routes/*4.44*/.Application.javascriptRoutes()),format.raw/*4.75*/(""""></script>

LAYAOUTCATALOGOS
"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""



	"""),format.raw/*11.2*/("""<div class='row'>
		<div class='col-sm-12'>Catálogo <Modelo> </div>
	</div>"
	
	<div class='row'>
		<div class='col-sm-9'>
			<div class="panel panel-default">
			  <div class="panel-heading">
			    <h3 class="panel-title">Panel title</h3>
			  </div>
			  <div class="panel-body">
			    Panel content
			  </div>
			  <div class="panel-footer">Panel footer
			  </div>			  
			</div>			
		</div>
		<aside class='col-sm-3'>
			<div class='panel panel-default'>
				<div class='panel-heading'>
					<span class='fa fa-history'></span>Filtros
				</div>
				<div id='filtro<Modelo>'>algoooo</div>
			</div>
		</aside>
	</div>	






""")))}),format.raw/*43.2*/("""



"""))}
  }

  def render(elCatalogo:Html): play.twirl.api.HtmlFormat.Appendable = apply(elCatalogo)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (elCatalogo) => apply(elCatalogo)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/layoutCatalogos.scala.html
                  HASH: 0f31b98bfbb2390fe9f4a58d8c098883e1361da2
                  MATRIX: 731->1|837->19|866->22|929->59|943->65|994->96|1050->127|1061->131|1099->133|1131->138|1795->772
                  LINES: 26->1|29->1|32->4|32->4|32->4|32->4|35->7|35->7|35->7|39->11|71->43
                  -- GENERATED --
              */
          