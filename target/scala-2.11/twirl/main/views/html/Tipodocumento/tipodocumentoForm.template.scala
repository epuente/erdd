
package views.html.Tipodocumento

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
object tipodocumentoForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Tipodocumento],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tdForm: Form[Tipodocumento]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*2.2*/implicitFieldConstructor/*2.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.31*/("""
"""),format.raw/*2.77*/("""
"""),format.raw/*4.1*/("""
	  """),format.raw/*5.4*/("""<div class="form-group">
	  	<div class="row">
	  		<div class="col-md-12">
	  			"""),_display_(/*8.8*/inputText(tdForm("descripcion"), 'labelAlterna -> "Descripción", '_help -> "", 'required->"required", 'size->"90em")),format.raw/*8.124*/("""
	  		"""),format.raw/*9.6*/("""</div>
	  	</div>
	  	<div class="row">
	  		<div class="col-sm-6">
	   			"""),_display_(/*13.9*/inputRadioGroup(
					         tdForm("obligatorio"),
					         options = options("0"->"No","1"->"Si"),
					         'labelAlterna -> "Obligatorio", 'required->"required"
				)),format.raw/*17.6*/(""" 	  		
	  		"""),format.raw/*18.6*/("""</div>
	  		<div class="col-sm-6">            
	    		"""),_display_(/*20.9*/inputRadioGroup(
							tdForm("estado.id"),
							options = options(models.EstadoActivo.options), 'required->"required", 'labelAlterna->"Estado"
						)),format.raw/*23.8*/("""	  		
	  		"""),format.raw/*24.6*/("""</div>
	  	</div>
       </div>

"""))}
  }

  def render(tdForm:Form[Tipodocumento]): play.twirl.api.HtmlFormat.Appendable = apply(tdForm)

  def f:((Form[Tipodocumento]) => play.twirl.api.HtmlFormat.Appendable) = (tdForm) => apply(tdForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:36 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Tipodocumento/tipodocumentoForm.scala.html
                  HASH: e6a0df60479a260692143a1e3c71d8261c6289ef
                  MATRIX: 762->1|886->32|918->56|999->30|1027->107|1054->125|1084->129|1192->212|1329->328|1361->334|1463->410|1664->591|1703->603|1784->658|1958->812|1996->823
                  LINES: 26->1|28->2|28->2|29->1|30->2|31->4|32->5|35->8|35->8|36->9|40->13|44->17|45->18|47->20|50->23|51->24
                  -- GENERATED --
              */
          