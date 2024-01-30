
package views.html.Areaconocimiento

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
object editForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Areaconocimiento],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, areaconocimientoForm: Form[Areaconocimiento]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.77*/(""" 
"""),format.raw/*6.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*6.46*/routes/*6.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*6.89*/(""""/> 

"""),_display_(/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""
	"""),format.raw/*9.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
				  <li>Catálogos</li>
				   <li><a href="/areaconocimientos">Áreas del Conocimiento</a></li>
				  <li class="active">Editar</li>
				</ol>			
			</div>
		</div>    
		<div class="row">
			<div class="col-lg-12">    
   				<h3>Editar área del conocimiento</h3>
   				<div style="vertical-align: middle;">    
				    """),_display_(/*23.10*/form(CSRF(routes.AreaconocimientoController.update(id)), 'class->"form-inline", 'id->"frmEdit")/*23.105*/ {_display_(Seq[Any](format.raw/*23.107*/("""        
						"""),format.raw/*24.7*/("""<div class="form-group">        
				            """),_display_(/*25.18*/inputText(areaconocimientoForm("descripcion"), '_label -> "Descripción", '_help -> "", 'size->"70em", 'required->"required")),format.raw/*25.142*/("""
				            """),format.raw/*26.17*/("""<input type="submit" value="Actualizar el área del conocimiento" class="btn btn-primary">
				        </div>
				    """)))}),format.raw/*28.10*/("""
   				"""),format.raw/*29.8*/("""</div>
			    """),_display_(/*30.9*/form(CSRF(routes.AreaconocimientoController.delete(id)), 'class -> "topRight", 'id->"frmDelete")/*30.105*/ {_display_(Seq[Any](format.raw/*30.107*/("""
			        """),format.raw/*31.12*/("""<input type="submit" value="Eliminar el área del conocimiento" class="btn btn-danger">
			        <a href=""""),_display_(/*32.22*/routes/*32.28*/.AreaconocimientoController.list()),format.raw/*32.62*/("""" class="btn btn-default">Cancelar</a> 
			    """)))}),format.raw/*33.9*/("""
		    """),format.raw/*34.7*/("""</div>
	    </div>
 	</div>   
""")))}),format.raw/*37.2*/("""
"""),_display_(/*38.2*/comunCatalogosJS("edit", "Área del conocimiento")))}
  }

  def render(id:Long,areaconocimientoForm:Form[Areaconocimiento]): play.twirl.api.HtmlFormat.Appendable = apply(id,areaconocimientoForm)

  def f:((Long,Form[Areaconocimiento]) => play.twirl.api.HtmlFormat.Appendable) = (id,areaconocimientoForm) => apply(id,areaconocimientoForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Areaconocimiento/editForm.scala.html
                  HASH: a5e8b58e3df7bf22ac1acc7f1fd33fd5f13ade7b
                  MATRIX: 764->1|915->78|947->102|1028->57|1056->76|1084->153|1112->155|1183->200|1197->206|1254->243|1286->250|1297->254|1335->256|1363->258|1865->733|1970->828|2011->830|2053->845|2130->895|2276->1019|2321->1036|2470->1154|2505->1162|2546->1177|2652->1273|2693->1275|2733->1287|2868->1395|2883->1401|2938->1435|3016->1483|3050->1490|3112->1522|3140->1524
                  LINES: 26->1|28->5|28->5|29->1|31->4|32->5|33->6|33->6|33->6|33->6|35->8|35->8|35->8|36->9|50->23|50->23|50->23|51->24|52->25|52->25|53->26|55->28|56->29|57->30|57->30|57->30|58->31|59->32|59->32|59->32|60->33|61->34|64->37|65->38
                  -- GENERATED --
              */
          