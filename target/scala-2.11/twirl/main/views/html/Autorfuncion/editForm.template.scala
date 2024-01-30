
package views.html.Autorfuncion

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
object editForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Autorfuncion],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, afForm: Form[Autorfuncion]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*4.89*/(""""/> 

"""),format.raw/*6.77*/(""" 

"""),_display_(/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""
	"""),format.raw/*9.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li><a href="/unidadacademica">Tipos de autorías</a></li>
					  <li class="active">Editar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">    
				    <h3>Editar tipo de autoría</h3>
					<div style="vertical-align: middle;"> 
						"""),_display_(/*23.8*/form(CSRF(routes.AutorfuncionController.update(id)), 'class->"form-inline", 'id->"frmEdit"  )/*23.101*/ {_display_(Seq[Any](format.raw/*23.103*/("""
						  """),format.raw/*24.9*/("""<div class="form-group">
					    		"""),_display_(/*25.13*/inputText(afForm("descripcion"), 'labelAlterna->"Descripcion", '_help -> "", 'size->"90px", 'required->"required")),format.raw/*25.127*/("""
						  """),format.raw/*26.9*/("""</div>
						  <button type="submit" class="btn btn-primary">Actualizar</button>
						""")))}),format.raw/*28.8*/("""
					"""),format.raw/*29.6*/("""</div>

				 """),_display_(/*31.7*/form(CSRF(routes.AutorfuncionController.delete(id)), 'class -> "topRight", 'id->"frmDelete")/*31.99*/ {_display_(Seq[Any](format.raw/*31.101*/("""
						"""),format.raw/*32.7*/("""<input type="submit" value="Eliminar" class="btn btn-danger">
						<a href=""""),_display_(/*33.17*/routes/*33.23*/.AutorfuncionController.list()),format.raw/*33.53*/("""" class="btn btn-default">Cancelar</a>
 					""")))}),format.raw/*34.8*/("""


    			"""),format.raw/*37.8*/("""</div>
			</div>
    </div>
""")))}),format.raw/*40.2*/("""
"""),_display_(/*41.2*/comunCatalogosJS("Edit", "tipo de autoría")),format.raw/*41.45*/("""
"""))}
  }

  def render(id:Long,afForm:Form[Autorfuncion]): play.twirl.api.HtmlFormat.Appendable = apply(id,afForm)

  def f:((Long,Form[Autorfuncion]) => play.twirl.api.HtmlFormat.Appendable) = (id,afForm) => apply(id,afForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:37 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Autorfuncion/editForm.scala.html
                  HASH: 7a427c4095d5b395ac6e914dd66a02ef900c62d4
                  MATRIX: 756->1|889->153|921->177|1002->39|1030->58|1101->103|1115->109|1172->146|1205->228|1234->232|1245->236|1283->238|1311->240|1799->702|1902->795|1943->797|1979->806|2043->843|2179->957|2215->966|2333->1054|2366->1060|2406->1074|2507->1166|2548->1168|2582->1175|2687->1253|2702->1259|2753->1289|2829->1335|2866->1345|2925->1374|2953->1376|3017->1419
                  LINES: 26->1|28->6|28->6|29->1|31->4|31->4|31->4|31->4|33->6|35->8|35->8|35->8|36->9|50->23|50->23|50->23|51->24|52->25|52->25|53->26|55->28|56->29|58->31|58->31|58->31|59->32|60->33|60->33|60->33|61->34|64->37|67->40|68->41|68->41
                  -- GENERATED --
              */
          