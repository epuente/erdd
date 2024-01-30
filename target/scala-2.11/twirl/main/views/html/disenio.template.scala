
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
object disenio extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(modelo:String, modelo_label:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.38*/("""

	"""),format.raw/*3.2*/("""<div class='row'>
		<div class='col-sm-12'>Catálogo """),_display_(/*4.36*/modelo_label),format.raw/*4.48*/(""" """),format.raw/*4.49*/("""con </div>
	</div>"
	
	<div class='row'>
		<div class='col-sm-9'>
			<div id='tabla"""),_display_(/*9.19*/modelo),format.raw/*9.25*/("""'></div>
		</div>
		<aside class='col-sm-3'>
			<div class='panel panel-default'>
				<div class='panel-heading'>
					<span class='fa fa-history'></span>Filtros
				</div>
				<div id='filtro"""),_display_(/*16.21*/modelo),format.raw/*16.27*/("""+"'>algoooo</div>
			</div>
		</aside>
	</div>	"""))}
  }

  def render(modelo:String,modelo_label:String): play.twirl.api.HtmlFormat.Appendable = apply(modelo,modelo_label)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (modelo,modelo_label) => apply(modelo,modelo_label)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/disenio.scala.html
                  HASH: 22ba0efca19dc0d3cbf5d23d8cdd307ebb4f7920
                  MATRIX: 732->1|856->37|885->40|964->93|996->105|1024->106|1134->190|1160->196|1380->389|1407->395
                  LINES: 26->1|29->1|31->3|32->4|32->4|32->4|37->9|37->9|44->16|44->16
                  -- GENERATED --
              */
          