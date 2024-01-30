
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
object createForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Aspecto],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(afForm: Form[Aspecto]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*4.89*/(""""/> 

"""),format.raw/*6.77*/(""" 

"""),_display_(/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""
	"""),format.raw/*9.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li><a href="/unidadacademica">Aspectos a evaluar</a></li>
					  <li class="active">Agregar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Agregar un aspecto</h3>
		        </div>
			</div>
			<div class="row">    
    			<div class="col-lg-12">
				    """),_display_(/*26.10*/form(CSRF(routes.AspectoController.save()), 'class->"form-inline", 'id->"frmCreate")/*26.94*/ {_display_(Seq[Any](format.raw/*26.96*/("""
					  """),format.raw/*27.8*/("""<div class="form-group">
				            """),_display_(/*28.18*/inputText(afForm("descripcion"), 'labelAlterna -> "Descripción", '_help -> "", 'required->"required", 'size->"90em")),format.raw/*28.134*/("""
    						"""),format.raw/*29.11*/("""<input type="submit" value="Agregar" class="btn btn-primary">				            
				       </div>
				     
			        """)))}),format.raw/*32.13*/("""
			        """),format.raw/*33.12*/("""<div class="actions">			            
			            <a href=""""),_display_(/*34.26*/routes/*34.32*/.AspectoController.list()),format.raw/*34.57*/("""" class="btn btn-default">Cancelar</a> 
			        </div>			        
				 </div>
		 </div>       
    </div>
    
    
""")))}),format.raw/*41.2*/("""

"""),_display_(/*43.2*/comunCatalogosJS("Create", "aspecto a evaluar")),format.raw/*43.49*/("""


"""))}
  }

  def render(afForm:Form[Aspecto]): play.twirl.api.HtmlFormat.Appendable = apply(afForm)

  def f:((Form[Aspecto]) => play.twirl.api.HtmlFormat.Appendable) = (afForm) => apply(afForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:37 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Aspecto/createForm.scala.html
                  HASH: a0f0cb5db508edf1d236606fd7fc7af839d073ec
                  MATRIX: 743->1|861->138|893->162|974->24|1002->43|1073->88|1087->94|1144->131|1177->213|1206->217|1217->221|1255->223|1283->225|1813->728|1906->812|1946->814|1981->822|2050->864|2188->980|2227->991|2376->1109|2416->1121|2505->1183|2520->1189|2566->1214|2716->1334|2745->1337|2813->1384
                  LINES: 26->1|28->6|28->6|29->1|31->4|31->4|31->4|31->4|33->6|35->8|35->8|35->8|36->9|53->26|53->26|53->26|54->27|55->28|55->28|56->29|59->32|60->33|61->34|61->34|61->34|68->41|70->43|70->43
                  -- GENERATED --
              */
          