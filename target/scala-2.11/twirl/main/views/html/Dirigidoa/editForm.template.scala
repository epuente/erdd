
package views.html.Dirigidoa

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
object editForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Dirigidoa],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, daForm: Form[Dirigidoa]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*4.89*/(""""/> 

"""),format.raw/*6.77*/(""" 

"""),_display_(/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""
	"""),format.raw/*9.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li><a href="/dirigidoa">Dirigido a</a></li>
					  <li class="active">Editar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">    
				    <h3>Editar Dirigido a</h3>
					<div style="vertical-align: middle;"> 
						"""),_display_(/*23.8*/form(CSRF(routes.DirigidoaController.update(id)), 'class->"form-inline", 'id->"frmEdit"  )/*23.98*/ {_display_(Seq[Any](format.raw/*23.100*/("""
						  """),format.raw/*24.9*/("""<div class="form-group">
					    		"""),_display_(/*25.13*/inputText(daForm("descripcion"), 'labelAlterna->"Descripcion", '_help -> "", 'size->"90px", 'required->"required")),format.raw/*25.127*/("""
						  """),format.raw/*26.9*/("""</div>
						  <button type="submit" class="btn btn-primary">Actualizar</button>
						""")))}),format.raw/*28.8*/("""
					"""),format.raw/*29.6*/("""</div>

				 """),_display_(/*31.7*/form(CSRF(routes.DirigidoaController.delete(id)), 'class -> "topRight", 'id->"frmDelete")/*31.96*/ {_display_(Seq[Any](format.raw/*31.98*/("""
						"""),format.raw/*32.7*/("""<input type="submit" value="Eliminar" class="btn btn-danger">
						<a href=""""),_display_(/*33.17*/routes/*33.23*/.DirigidoaController.list()),format.raw/*33.50*/("""" class="btn btn-default">Cancelar</a>
 					""")))}),format.raw/*34.8*/("""


    			"""),format.raw/*37.8*/("""</div>
			</div>
    </div>
""")))}),format.raw/*40.2*/("""
"""),_display_(/*41.2*/comunCatalogosJS("Edit", "Dirigido a")),format.raw/*41.40*/("""
"""))}
  }

  def render(id:Long,daForm:Form[Dirigidoa]): play.twirl.api.HtmlFormat.Appendable = apply(id,daForm)

  def f:((Long,Form[Dirigidoa]) => play.twirl.api.HtmlFormat.Appendable) = (id,daForm) => apply(id,daForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Dirigidoa/editForm.scala.html
                  HASH: d0e095eff393000373340b38d27e1a94ad786bed
                  MATRIX: 750->1|880->150|912->174|993->36|1021->55|1092->100|1106->106|1163->143|1196->225|1225->229|1236->233|1274->235|1302->237|1772->681|1871->771|1912->773|1948->782|2012->819|2148->933|2184->942|2302->1030|2335->1036|2375->1050|2473->1139|2513->1141|2547->1148|2652->1226|2667->1232|2715->1259|2791->1305|2828->1315|2887->1344|2915->1346|2974->1384
                  LINES: 26->1|28->6|28->6|29->1|31->4|31->4|31->4|31->4|33->6|35->8|35->8|35->8|36->9|50->23|50->23|50->23|51->24|52->25|52->25|53->26|55->28|56->29|58->31|58->31|58->31|59->32|60->33|60->33|60->33|61->34|64->37|67->40|68->41|68->41
                  -- GENERATED --
              */
          