
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
object loginForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(forma: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.34*/("""
"""),format.raw/*3.83*/("""
        
    
                """),format.raw/*6.17*/("""<div class="panel panel-default">
                    <div class="panel-heading"><i class="fa fa-key"></i> Iniciar sesión</div>
                    <div class="center-block">
                        <table class="tablaLogin" border="0" style="width: 100%">
                            <tr>
                                <td colspan="2"></div></td>
                            </tr>
                            <tr>                        
                            <tr>
                                <td>Usuario:</td>
                                <td><label for="usuario" class="sr-only">Usuario</label><input type="text" id="usuario" placeholder="Nombre de usuario" class="form-control"></td>
                            </tr>
                            <tr>
                                <td>Contraseña:</td>
                                <td><label for="password" class="sr-only">Clave de acceso</label><input type="password" id="password" placeholder="Clave de acceso" class="form-control"></td>
                            </tr>
                            <tr>
                                <td colspan="2"><div id="msgLogin"></div></td>
                            </tr>
                            <tr>
                                <td colspan="12" style="margin-left: auto;    margin-right: auto;  width: 100%;">
                                    <div style="width: 60%" class="center-block">
                                        <input type="button" class="btn btn-primary btn-block" value="Entrar" id="btnLogin"">
                                    </div>
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>              
        
        """))}
  }

  def render(forma:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(forma)

  def f:((Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (forma) => apply(forma)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/loginForm.scala.html
                  HASH: 20e0bf488f1061a16ec8439bf13929cda4e11586
                  MATRIX: 744->1|871->52|903->76|990->33|1018->133|1076->164
                  LINES: 26->1|28->3|28->3|29->1|30->3|33->6
                  -- GENERATED --
              */
          