
package views.html.Aspecto

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
object editForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Aspecto],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, afForm: Form[Aspecto]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*4.89*/(""""/> 

"""),format.raw/*6.77*/(""" 

"""),_display_(/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""
	"""),format.raw/*9.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li><a href="/unidadacademica">Aspectos a evaluar</a></li>
					  <li class="active">Editar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">    
				    <h3>Editar aspecto a evaluar</h3>
					<div style="vertical-align: middle;"> 
						"""),_display_(/*23.8*/form(CSRF(routes.AspectoController.update(id)), 'class->"form-inline", 'id->"frmEdit"  )/*23.96*/ {_display_(Seq[Any](format.raw/*23.98*/("""
						  """),format.raw/*24.9*/("""<div class="form-group">
					    		"""),_display_(/*25.13*/inputText(afForm("descripcion"), 'labelAlterna->"Descripcion", '_help -> "", 'size->"90px", 'required->"required")),format.raw/*25.127*/("""
						  """),format.raw/*26.9*/("""</div>
						  <button type="submit" class="btn btn-primary">Actualizar</button>
						""")))}),format.raw/*28.8*/("""
					"""),format.raw/*29.6*/("""</div>

				 """),_display_(/*31.7*/form(CSRF(routes.AspectoController.delete(id)), 'class -> "topRight", 'id->"frmDelete")/*31.94*/ {_display_(Seq[Any](format.raw/*31.96*/("""
						"""),format.raw/*32.7*/("""<input type="submit" value="Eliminar" class="btn btn-danger">
						<a href=""""),_display_(/*33.17*/routes/*33.23*/.AspectoController.list()),format.raw/*33.48*/("""" class="btn btn-default">Cancelar</a>
 					""")))}),format.raw/*34.8*/("""


    			"""),format.raw/*37.8*/("""</div>
			</div>
    </div>
""")))}),format.raw/*40.2*/("""
"""),_display_(/*41.2*/comunCatalogosJS("Edit", "aspecto a evaluar")),format.raw/*41.47*/("""

"""))}
  }

  def render(id:Long,afForm:Form[Aspecto]): play.twirl.api.HtmlFormat.Appendable = apply(id,afForm)

  def f:((Long,Form[Aspecto]) => play.twirl.api.HtmlFormat.Appendable) = (id,afForm) => apply(id,afForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:37 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Aspecto/editForm.scala.html
                  HASH: 6cbc7d35d74ba64ce33e42992c5f280a34422d80
                  MATRIX: 746->1|874->148|906->172|987->34|1015->53|1086->98|1100->104|1157->141|1190->223|1219->227|1230->231|1268->233|1296->235|1787->700|1884->788|1924->790|1960->799|2024->836|2160->950|2196->959|2314->1047|2347->1053|2387->1067|2483->1154|2523->1156|2557->1163|2662->1241|2677->1247|2723->1272|2799->1318|2836->1328|2895->1357|2923->1359|2989->1404
                  LINES: 26->1|28->6|28->6|29->1|31->4|31->4|31->4|31->4|33->6|35->8|35->8|35->8|36->9|50->23|50->23|50->23|51->24|52->25|52->25|53->26|55->28|56->29|58->31|58->31|58->31|59->32|60->33|60->33|60->33|61->34|64->37|67->40|68->41|68->41
                  -- GENERATED --
              */
          