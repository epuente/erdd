
package views.html.AdminEvaluacionTabla

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
object reactivoCreate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[EvaluacionTablaReactivo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(forma:Form[EvaluacionTablaReactivo]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.39*/("""
"""),_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
	"""),format.raw/*4.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li><a href="/evaluacionReactivosList">Reactivos</a></li>
					  <li class="active">Editar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Reactivos</h3>
		        </div>
			</div>
			<div class="row">
				<div class="col-lg-12">
					"""),_display_(/*21.7*/form(CSRF(routes.AdminEvaluacionTablaController.saveReactivo()), 'class->"form-inline", 'id->"frmEdit"  )/*21.112*/ {_display_(Seq[Any](format.raw/*21.114*/("""
						  """),format.raw/*22.9*/("""<div class="form-group">
					    		"""),_display_(/*23.13*/inputText(forma("descripcion"), 'labelAlterna->"Descripcion", '_help -> "", 'size->"90px", 'required->"required")),format.raw/*23.126*/("""
						  """),format.raw/*24.9*/("""</div>
						  <button type="submit" class="btn btn-primary">Agregar</button>
						""")))}),format.raw/*26.8*/("""					

				"""),format.raw/*28.5*/("""</div>
			</div>
	</div>	
""")))}))}
  }

  def render(forma:Form[EvaluacionTablaReactivo]): play.twirl.api.HtmlFormat.Appendable = apply(forma)

  def f:((Form[EvaluacionTablaReactivo]) => play.twirl.api.HtmlFormat.Appendable) = (forma) => apply(forma)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:35 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/AdminEvaluacionTabla/reactivoCreate.scala.html
                  HASH: a896d5ab4b1ee6d83a4f6dd7de8e34c3e9763296
                  MATRIX: 776->1|916->38|943->57|954->61|991->62|1019->64|1527->546|1642->651|1683->653|1719->662|1783->699|1918->812|1954->821|2069->906|2107->917
                  LINES: 26->1|29->1|30->3|30->3|30->3|31->4|48->21|48->21|48->21|49->22|50->23|50->23|51->24|53->26|55->28
                  -- GENERATED --
              */
          