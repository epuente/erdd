
package views.html.Oficio

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
object oficioForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Oficio],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, forma: Form[Oficio] ):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.34*/("""
"""),format.raw/*3.83*/(""" 

 		"""),format.raw/*5.4*/("""<div class="form-group">
 			<table class="table table-bordered tablaReporte">
 				<tr>
 					<td colspan="1">"""),_display_(/*8.24*/inputText(forma("oficio.numero"), '_label -> "Número de oficio", '_help -> "", 'size->"10", 'required->"required", 'class->"form-control" )),format.raw/*8.163*/("""</td>
 					<td colspan="1">"""),_display_(/*9.24*/inputText(forma("oficio.folio"), '_label -> "Número de folio", '_help -> "", 'size->"10", 'required->"required", 'class->"form-control" )),format.raw/*9.161*/("""</td>
 				</tr>
 				<tr>
 					<td>"""),_display_(/*12.12*/inputDate(forma("oficio.fechaoficio"), '_label -> "Fecha del oficio", '_help -> "", 'required->"required", 'placeholder->"dd/mm/aaaa", 'class->"form-control")),format.raw/*12.170*/("""</td>
 					<td>"""),_display_(/*13.12*/inputDate(forma("oficio.fecharecepcion"), '_label -> "Fecha de recepcion en UPEV", '_help -> "", 'required->"required", 'placeholder->"dd/mm/aaaa", 'class->"form-control")),format.raw/*13.183*/("""</td>
 				</tr>
 				<tr>
 					<td colspan="2">
						<div class="input input-group clearfix">
							<label for="oficio.contenido" class="control-label">Oficio digitalizado</label>
							<input type="file" accept=".pdf" id="oficio.contenido" name="oficio.contenido" required="required" class="form-control" multiple=false >
						</div> 					
 					</td>
 				</tr>
 				<tr>
 					<td colspan="2">
 						<input type="submit" value="Asignar folio" class="btn primary btn-primary">	
 					</td>
 				</tr>
 			</table> 		
		</div>"""))}
  }

  def render(id:Long,forma:Form[Oficio]): play.twirl.api.HtmlFormat.Appendable = apply(id,forma)

  def f:((Long,Form[Oficio]) => play.twirl.api.HtmlFormat.Appendable) = (id,forma) => apply(id,forma)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:36 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Oficio/oficioForm.scala.html
                  HASH: cae204e7026daa0ec25844a8b827bf5083b343fd
                  MATRIX: 746->1|873->52|905->76|992->33|1020->133|1052->139|1190->251|1350->390|1405->419|1563->556|1628->594|1808->752|1852->769|2045->940
                  LINES: 26->1|28->3|28->3|29->1|30->3|32->5|35->8|35->8|36->9|36->9|39->12|39->12|40->13|40->13
                  -- GENERATED --
              */
          