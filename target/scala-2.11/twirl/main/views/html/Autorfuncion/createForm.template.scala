
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
object createForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Autorfuncion],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(afForm: Form[Autorfuncion]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*4.89*/(""""/> 

"""),format.raw/*6.77*/(""" 

"""),_display_(/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""
	"""),format.raw/*9.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li><a href="/unidadacademica">Tipos de autorías</a></li>
					  <li class="active">Agregar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Agregar tipo de autoría</h3>
		        </div>
			</div>
			<div class="row">    
    			<div class="col-lg-12">
				    """),_display_(/*26.10*/form(CSRF(routes.AutorfuncionController.save()), 'class->"form-inline", 'id->"frmCreate")/*26.99*/ {_display_(Seq[Any](format.raw/*26.101*/("""
					  """),format.raw/*27.8*/("""<div class="form-group">
				            """),_display_(/*28.18*/inputText(afForm("descripcion"), 'labelAlterna -> "Descripción", '_help -> "", 'required->"required", 'size->"90em")),format.raw/*28.134*/("""
    						"""),format.raw/*29.11*/("""<input type="submit" value="Agregar" class="btn btn-primary">				            
				       </div>
				     
			        """)))}),format.raw/*32.13*/("""
			        """),format.raw/*33.12*/("""<div class="actions">			            
			            <a href=""""),_display_(/*34.26*/routes/*34.32*/.AutorfuncionController.list()),format.raw/*34.62*/("""" class="btn btn-default">Cancelar</a> 
			        </div>			        
				 </div>
		 </div>       
    </div>
    
    
""")))}),format.raw/*41.2*/("""

"""),_display_(/*43.2*/comunCatalogosJS("Create", "Tipo de autoría")),format.raw/*43.47*/("""

"""))}
  }

  def render(afForm:Form[Autorfuncion]): play.twirl.api.HtmlFormat.Appendable = apply(afForm)

  def f:((Form[Autorfuncion]) => play.twirl.api.HtmlFormat.Appendable) = (afForm) => apply(afForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:37 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Autorfuncion/createForm.scala.html
                  HASH: 0b975c91bcd91850396772fc36b0c986611293fa
                  MATRIX: 753->1|876->143|908->167|989->29|1017->48|1088->93|1102->99|1159->136|1192->218|1221->222|1232->226|1270->228|1298->230|1832->737|1930->826|1971->828|2006->836|2075->878|2213->994|2252->1005|2401->1123|2441->1135|2530->1197|2545->1203|2596->1233|2746->1353|2775->1356|2841->1401
                  LINES: 26->1|28->6|28->6|29->1|31->4|31->4|31->4|31->4|33->6|35->8|35->8|35->8|36->9|53->26|53->26|53->26|54->27|55->28|55->28|56->29|59->32|60->33|61->34|61->34|61->34|68->41|70->43|70->43
                  -- GENERATED --
              */
          