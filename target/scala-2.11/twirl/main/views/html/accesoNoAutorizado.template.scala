
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
object accesoNoAutorizado extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mensaje:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.18*/("""

"""),_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
	"""),format.raw/*4.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >  	
		<div class=row>
			<div class="col-md-2"></div>
			<div class="col-md-8">
			
				<div class="panel panel-danger">
				  <div class="panel-heading">
				    <h3 class="panel-title">Ha incurrido en un error</h3>
				  </div>
				  <div class="panel-body">
				   """),_display_(/*14.9*/mensaje),format.raw/*14.16*/("""
				  """),format.raw/*15.7*/("""</div>
				   <div class="panel-footer">
				   <a class="btn btn-default" href="javascript:window.history.back();" role="button">Regresar</a>
				   </div>
				</div>			
			
			</div>
			<div class="col-md-2"></div>
		</div>
	</div>
""")))}))}
  }

  def render(mensaje:String): play.twirl.api.HtmlFormat.Appendable = apply(mensaje)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (mensaje) => apply(mensaje)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/accesoNoAutorizado.scala.html
                  HASH: 2dc3f8d6c9e0eba77ece8897a11595a7a9fa00eb
                  MATRIX: 736->1|840->17|868->20|879->24|916->25|944->27|1314->371|1342->378|1376->385
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|42->14|42->14|43->15
                  -- GENERATED --
              */
          