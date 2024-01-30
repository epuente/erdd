
package views.html.Formatoentrega

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
object editForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Formatoentrega],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, feForm: Form[Formatoentrega]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*4.89*/(""""/> 

"""),format.raw/*6.77*/(""" 

"""),_display_(/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""
	"""),format.raw/*9.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li><a href="/unidadacademica">Formatos de entrega</a></li>
					  <li class="active">Editar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">    
				    <h3>Editar formato de entrega</h3>
					<div style="vertical-align: middle;"> 
						"""),_display_(/*23.8*/form(CSRF(routes.FormatoentregaController.update(id)), 'class->"form-inline", 'id->"frmEdit"  )/*23.103*/ {_display_(Seq[Any](format.raw/*23.105*/("""
						  """),format.raw/*24.9*/("""<div class="form-group">
					    		"""),_display_(/*25.13*/inputText(feForm("descripcion"), 'labelAlterna->"Descripcion", '_help -> "", 'size->"90px", 'required->"required")),format.raw/*25.127*/("""
						  """),format.raw/*26.9*/("""</div>
						  <button type="submit" class="btn btn-primary">Actualizar</button>
						""")))}),format.raw/*28.8*/("""
					"""),format.raw/*29.6*/("""</div>

				 """),_display_(/*31.7*/form(CSRF(routes.FormatoentregaController.delete(id)), 'class -> "topRight", 'id->"frmDelete")/*31.101*/ {_display_(Seq[Any](format.raw/*31.103*/("""
						"""),format.raw/*32.7*/("""<input type="submit" value="Eliminar" class="btn btn-danger">
						<a href=""""),_display_(/*33.17*/routes/*33.23*/.FormatoentregaController.list()),format.raw/*33.55*/("""" class="btn btn-default">Cancelar</a>
 					""")))}),format.raw/*34.8*/("""


    			"""),format.raw/*37.8*/("""</div>
			</div>
    </div>
""")))}),format.raw/*40.2*/("""
"""),_display_(/*41.2*/comunCatalogosJS("Edit", "formato de entrega")),format.raw/*41.48*/("""
"""))}
  }

  def render(id:Long,feForm:Form[Formatoentrega]): play.twirl.api.HtmlFormat.Appendable = apply(id,feForm)

  def f:((Long,Form[Formatoentrega]) => play.twirl.api.HtmlFormat.Appendable) = (id,feForm) => apply(id,feForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Formatoentrega/editForm.scala.html
                  HASH: 4ff3a1139915e790864756d5a411cae7dbee06c9
                  MATRIX: 760->1|895->155|927->179|1008->41|1036->60|1107->105|1121->111|1178->148|1211->230|1240->234|1251->238|1289->240|1317->242|1810->709|1915->804|1956->806|1992->815|2056->852|2192->966|2228->975|2346->1063|2379->1069|2419->1083|2523->1177|2564->1179|2598->1186|2703->1264|2718->1270|2771->1302|2847->1348|2884->1358|2943->1387|2971->1389|3038->1435
                  LINES: 26->1|28->6|28->6|29->1|31->4|31->4|31->4|31->4|33->6|35->8|35->8|35->8|36->9|50->23|50->23|50->23|51->24|52->25|52->25|53->26|55->28|56->29|58->31|58->31|58->31|59->32|60->33|60->33|60->33|61->34|64->37|67->40|68->41|68->41
                  -- GENERATED --
              */
          