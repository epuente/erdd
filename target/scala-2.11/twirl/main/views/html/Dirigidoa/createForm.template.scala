
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
object createForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Dirigidoa],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(daForm: Form[Dirigidoa]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*4.89*/(""""/> 

"""),format.raw/*6.77*/(""" 

"""),_display_(/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""
	"""),format.raw/*9.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li><a href="/dirigidoa">Dirigido a</a></li>
					  <li class="active">Agregar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Agregar Dirigido a</h3>
		        </div>
			</div>
			<div class="row">    
    			<div class="col-lg-12">
				    """),_display_(/*26.10*/form(CSRF(routes.DirigidoaController.save()), 'class->"form-inline", 'id->"frmCreate")/*26.96*/ {_display_(Seq[Any](format.raw/*26.98*/("""
					  """),format.raw/*27.8*/("""<div class="form-group">
				            """),_display_(/*28.18*/inputText(daForm("descripcion"), 'labelAlterna -> "Descripción", '_help -> "", 'required->"required", 'size->"90em")),format.raw/*28.134*/("""
    						"""),format.raw/*29.11*/("""<input type="submit" value="Agregar" class="btn btn-primary">				            
				       </div>
				     
			        """)))}),format.raw/*32.13*/("""
			        """),format.raw/*33.12*/("""<div class="actions">			            
			            <a href=""""),_display_(/*34.26*/routes/*34.32*/.DirigidoaController.list()),format.raw/*34.59*/("""" class="btn btn-default">Cancelar</a> 
			        </div>			        
				 </div>
		 </div>       
    </div>
    
    
""")))}),format.raw/*41.2*/("""

"""),_display_(/*43.2*/comunCatalogosJS("Create", "Dirigido a")),format.raw/*43.42*/("""

"""))}
  }

  def render(daForm:Form[Dirigidoa]): play.twirl.api.HtmlFormat.Appendable = apply(daForm)

  def f:((Form[Dirigidoa]) => play.twirl.api.HtmlFormat.Appendable) = (daForm) => apply(daForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Dirigidoa/createForm.scala.html
                  HASH: eec45e4643021e21d5c2835daf28101a2cfd9720
                  MATRIX: 747->1|867->140|899->164|980->26|1008->45|1079->90|1093->96|1150->133|1183->215|1212->219|1223->223|1261->225|1289->227|1805->716|1900->802|1940->804|1975->812|2044->854|2182->970|2221->981|2370->1099|2410->1111|2499->1173|2514->1179|2562->1206|2712->1326|2741->1329|2802->1369
                  LINES: 26->1|28->6|28->6|29->1|31->4|31->4|31->4|31->4|33->6|35->8|35->8|35->8|36->9|53->26|53->26|53->26|54->27|55->28|55->28|56->29|59->32|60->33|61->34|61->34|61->34|68->41|70->43|70->43
                  -- GENERATED --
              */
          