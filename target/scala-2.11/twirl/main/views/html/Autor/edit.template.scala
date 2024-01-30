
package views.html.Autor

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
object edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[RecursoAutor,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(autor:RecursoAutor):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.22*/("""

"""),format.raw/*4.83*/(""" 

"""),_display_(/*6.2*/main/*6.6*/{_display_(Seq[Any](format.raw/*6.7*/("""
	"""),format.raw/*7.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" > 
		"""),_display_(/*8.4*/form(CSRF(routes.AutorController.updateEmail(autor.id)), 'role -> "form", 'id -> "frmAutor")/*8.96*/ {_display_(Seq[Any](format.raw/*8.98*/("""	
				"""),format.raw/*9.5*/("""<div class="row">
					<div class="col-lg-12">
						<ol class="breadcrumb">
						  <li><a href="/autores">Autores responsables</a></li>
						  <li class="active">Editar</li>
						</ol>			
					</div>
				</div>
				<div class="row">
					<div class="col-lg-12">
						<h3>Autores responsables</h3>
						"""),_display_(/*20.8*/flashes()),format.raw/*20.17*/("""
						"""),format.raw/*21.7*/("""<table class="table table-striped table-bordered table-condensed">
							<tr>
								<td>Paterno</td>
								<td>Materno</td>
								<td>Nombre</td>
								<td>Teléfono</td>
								<td>Email</td>
							</tr>			
							<tr>
								<td>"""),_display_(/*30.14*/autor/*30.19*/.paterno),format.raw/*30.27*/("""</td>
								<td>"""),_display_(/*31.14*/autor/*31.19*/.materno),format.raw/*31.27*/("""</td>
								<td>"""),_display_(/*32.14*/autor/*32.19*/.nombre),format.raw/*32.26*/("""</td>
								<td>"""),_display_(/*33.14*/autor/*33.19*/.correo.telefono),format.raw/*33.35*/("""</td>
								<td>
									<input name="autor.correo" class="form-control" data-error="No es la estructura de un email" required="required" placeholder="correo electrónico" type="email" value=""""),_display_(/*35.177*/autor/*35.182*/.correo.email),format.raw/*35.195*/("""">
								</td>
							</tr>		
						</table>
					</div>
				</div>
				<div class=row">
					<div class="col-md-3"></div>
					<div class="col-md-3">
						
							<button type="submit" class="btn btn-success btn-block">Actualizar</button>
					</div>
					<div class="col-md-3">
						<button type="button" class="btn btn-default btn-block">Cancelar</button>
					</div>
					<div class="col-md-3"></div>
				</div>
		""")))}),format.raw/*52.4*/("""
	"""),format.raw/*53.2*/("""</div>
""")))}))}
  }

  def render(autor:RecursoAutor): play.twirl.api.HtmlFormat.Appendable = apply(autor)

  def f:((RecursoAutor) => play.twirl.api.HtmlFormat.Appendable) = (autor) => apply(autor)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Autor/edit.scala.html
                  HASH: 1ac4a413c01b3452882e4a3db3ea786e0b5cf233
                  MATRIX: 734->1|849->41|881->65|968->21|997->122|1026->126|1037->130|1074->131|1102->133|1207->213|1307->305|1346->307|1378->313|1713->622|1743->631|1777->638|2047->881|2061->886|2090->894|2136->913|2150->918|2179->926|2225->945|2239->950|2267->957|2313->976|2327->981|2364->997|2587->1192|2602->1197|2637->1210|3090->1633|3119->1635
                  LINES: 26->1|28->4|28->4|29->1|31->4|33->6|33->6|33->6|34->7|35->8|35->8|35->8|36->9|47->20|47->20|48->21|57->30|57->30|57->30|58->31|58->31|58->31|59->32|59->32|59->32|60->33|60->33|60->33|62->35|62->35|62->35|79->52|80->53
                  -- GENERATED --
              */
          