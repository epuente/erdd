
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
object errorInicioSesion extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main/*1.6*/{_display_(Seq[Any](format.raw/*1.7*/("""
	"""),format.raw/*2.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >  	
		<div class=row>
			<div class="col-md-2"></div>
			<div class="col-md-8">
			
				<div class="panel panel-danger">
				  <div class="panel-heading">
				    <h3 class="panel-title">Ha incurrido en un error</h3>
				  </div>
				  <div class="panel-body">
                        <h1>Es necesario iniciar sesión con usuario y password</h1>
				  </div>
				   <div class="panel-footer">
				   <a class="btn btn-default" href="/login" role="button">Iniciar sesión</a>
				   </div>
				</div>			
			
			</div>
			<div class="col-md-2"></div>
		</div>
	</div>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/errorInicioSesion.scala.html
                  HASH: b1ab7d4c74ae104ab67a7469c7f7a76b580ec1bc
                  MATRIX: 810->1|821->5|858->6|886->8
                  LINES: 29->1|29->1|29->1|30->2
                  -- GENERATED --
              */
          