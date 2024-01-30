
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
object createForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Tipodocumento],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tdForm: Form[Tipodocumento]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.31*/("""

"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*4.89*/(""""/> 

"""),format.raw/*6.77*/(""" 

"""),_display_(/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""
	"""),format.raw/*9.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li><a href="/tiposdocumentos">Tipos de documentos</a></li>
					  <li class="active">Agregar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Agregar tipo de documento</h3>
		        </div>
			</div>
			<div class="row">    
    			<div class="col-lg-12">
				    """),_display_(/*26.10*/form(CSRF(routes.TipodocumentoController.save()), 'class->"form-inline", 'id->"frmCreate")/*26.100*/ {_display_(Seq[Any](format.raw/*26.102*/("""
						"""),_display_(/*27.8*/tipodocumentoForm(tdForm)),format.raw/*27.33*/("""
				     """),format.raw/*28.10*/("""<input type="submit" value="Agregar" class="btn btn-primary">
			        """)))}),format.raw/*29.13*/("""
			        """),format.raw/*30.12*/("""<div class="actions">			            
			            <a href=""""),_display_(/*31.26*/routes/*31.32*/.TipodocumentoController.list()),format.raw/*31.63*/("""" class="btn btn-default">Cancelar</a> 
			        </div>			        
				 </div>
		 </div>       
    </div>
    
    
""")))}),format.raw/*38.2*/("""

"""),_display_(/*40.2*/comunCatalogosJS("Create", "tipo de documento")),format.raw/*40.49*/("""

"""))}
  }

  def render(tdForm:Form[Tipodocumento]): play.twirl.api.HtmlFormat.Appendable = apply(tdForm)

  def f:((Form[Tipodocumento]) => play.twirl.api.HtmlFormat.Appendable) = (tdForm) => apply(tdForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:36 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Tipodocumento/createForm.scala.html
                  HASH: cee42cd7b1594332acf02395cb805eba5a7870b8
                  MATRIX: 755->1|879->144|911->168|992->30|1020->49|1091->94|1105->100|1162->137|1195->219|1224->223|1235->227|1273->229|1301->231|1839->742|1939->832|1980->834|2014->842|2060->867|2098->877|2203->951|2243->963|2332->1025|2347->1031|2399->1062|2549->1182|2578->1185|2646->1232
                  LINES: 26->1|28->6|28->6|29->1|31->4|31->4|31->4|31->4|33->6|35->8|35->8|35->8|36->9|53->26|53->26|53->26|54->27|54->27|55->28|56->29|57->30|58->31|58->31|58->31|65->38|67->40|67->40
                  -- GENERATED --
              */
          