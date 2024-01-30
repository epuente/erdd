
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
object editForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Tipodocumento],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, tdForm: Form[Tipodocumento]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.41*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.77*/("""


"""),format.raw/*7.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*7.46*/routes/*7.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*7.89*/(""""/> 


"""),_display_(/*10.2*/main/*10.6*/ {_display_(Seq[Any](format.raw/*10.8*/("""
	"""),format.raw/*11.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-sm-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li><a href="/tiposdocumentos">Tipos de documentos</a></li>
					  <li class="active">Editar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-sm-12">    
				    <h3>Editar tipo de documento</h3>
       			</div>
			</div>       			
			

			
				<div style="vertical-align: middle;"> 
					"""),_display_(/*30.7*/form(CSRF(routes.TipodocumentoController.update(id)), 'class->"form-inline5", 'id->"frmEdit"  )/*30.102*/ {_display_(Seq[Any](format.raw/*30.104*/("""
						"""),_display_(/*31.8*/tipodocumentoForm(tdForm)),format.raw/*31.33*/("""
					    """),format.raw/*32.10*/("""<button type="submit" class="btn btn-primary">Actualizar</button>
					""")))}),format.raw/*33.7*/("""
				"""),format.raw/*34.5*/("""</div>

				 """),_display_(/*36.7*/form(CSRF(routes.TipodocumentoController.delete(id)), 'class -> "topRight", 'id->"frmDelete")/*36.100*/ {_display_(Seq[Any](format.raw/*36.102*/("""
						"""),format.raw/*37.7*/("""<input type="submit" value="Eliminar" class="btn btn-danger">
						<a href=""""),_display_(/*38.17*/routes/*38.23*/.TipodocumentoController.list()),format.raw/*38.54*/("""" class="btn btn-default">Cancelar</a>
 					""")))}),format.raw/*39.8*/("""




    """),format.raw/*44.5*/("""</div>
""")))}),format.raw/*45.2*/("""
"""),_display_(/*46.2*/comunCatalogosJS("Edit", "tipo de documento")),format.raw/*46.47*/("""
"""))}
  }

  def render(id:Long,tdForm:Form[Tipodocumento]): play.twirl.api.HtmlFormat.Appendable = apply(id,tdForm)

  def f:((Long,Form[Tipodocumento]) => play.twirl.api.HtmlFormat.Appendable) = (id,tdForm) => apply(id,tdForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:36 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Tipodocumento/editForm.scala.html
                  HASH: 64d748b5eb1c7e9729efa14faed80c20ab2328af
                  MATRIX: 758->1|892->60|924->84|1005->40|1032->58|1060->135|1089->138|1160->183|1174->189|1231->226|1265->234|1277->238|1316->240|1345->242|1881->752|1986->847|2027->849|2061->857|2107->882|2145->892|2247->964|2279->969|2319->983|2422->1076|2463->1078|2497->1085|2602->1163|2617->1169|2669->1200|2745->1246|2781->1255|2819->1263|2847->1265|2913->1310
                  LINES: 26->1|28->4|28->4|29->1|30->3|31->4|34->7|34->7|34->7|34->7|37->10|37->10|37->10|38->11|57->30|57->30|57->30|58->31|58->31|59->32|60->33|61->34|63->36|63->36|63->36|64->37|65->38|65->38|65->38|66->39|71->44|72->45|73->46|73->46
                  -- GENERATED --
              */
          