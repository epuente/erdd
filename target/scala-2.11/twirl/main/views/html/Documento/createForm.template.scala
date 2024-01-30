
package views.html.Documento

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
object createForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Documento],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(documentoForm: Form[Documento]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.34*/("""
"""),format.raw/*3.83*/(""" 

"""),_display_(/*5.2*/main/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""


	"""),_display_(/*8.3*/form(action = routes.DocumentoController.upload, 'enctype -> "multipart/form-data", 'role -> "form")/*8.103*/ {_display_(Seq[Any](format.raw/*8.105*/("""
	    
	    """),format.raw/*10.6*/("""<div class="form-group">
		     <fieldset>
			            
			    """),_display_(/*13.9*/inputText(documentoForm("recurso.id"), '_label -> "Recurso", '_help -> "", 'required->"required", 'class->"form-control")),format.raw/*13.130*/("""
			    """),_display_(/*14.9*/inputFile(documentoForm("contenido"), '_label -> "Contenido", '_help -> "", 'required->"required", 'class->"form-control")),format.raw/*14.131*/("""
			    
	  			"""),_display_(/*16.8*/select(
	              documentoForm("tipodocumento.id"), 
	              options( models.Tipodocumento.optionsActivas), 
	              '_label -> "Tipo de documento", '_default -> "Seleccione el tipo...",
	              '_showConstraints -> false,
	              'required->"required"
	          	)),format.raw/*22.14*/("""    
			
			    
			    """),format.raw/*25.8*/("""<p>
			        <input type="submit">
			    </p>
			</fieldset>
		</div>    
	""")))}),format.raw/*30.3*/("""
 
""")))}),format.raw/*32.2*/("""



"""),format.raw/*36.1*/("""<script type="text/javascript">


</script>"""))}
  }

  def render(documentoForm:Form[Documento]): play.twirl.api.HtmlFormat.Appendable = apply(documentoForm)

  def f:((Form[Documento]) => play.twirl.api.HtmlFormat.Appendable) = (documentoForm) => apply(documentoForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Documento/createForm.scala.html
                  HASH: 68afa9172d3afae9ff4d6af71a46725615c727e8
                  MATRIX: 747->1|874->52|906->76|993->33|1021->133|1050->137|1061->141|1098->142|1128->147|1237->247|1277->249|1316->261|1409->328|1552->449|1587->458|1731->580|1773->596|2094->896|2145->920|2254->999|2288->1003|2319->1007
                  LINES: 26->1|28->3|28->3|29->1|30->3|32->5|32->5|32->5|35->8|35->8|35->8|37->10|40->13|40->13|41->14|41->14|43->16|49->22|52->25|57->30|59->32|63->36
                  -- GENERATED --
              */
          