
package views.html.Niveleducativo

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
object editForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Niveleducativo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id:Long, niveleducativoForm: Form[Niveleducativo]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.53*/("""
"""),format.raw/*3.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*3.46*/routes/*3.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*3.89*/(""""/> 
"""),format.raw/*4.77*/(""" 

"""),_display_(/*6.2*/main/*6.6*/ {_display_(Seq[Any](format.raw/*6.8*/("""
	"""),format.raw/*7.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li><a href="/nivelList">Nivel Educativo</a></li>
					  <li class="active">Editar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">    
    				<h3>Editar Nivel Educativo</h3>    				
				    """),_display_(/*20.10*/form(CSRF(routes.NiveleducativoController.update(id)), 'class->"form-inline", 'id->"frmEdit")/*20.103*/ {_display_(Seq[Any](format.raw/*20.105*/("""				        
				        """),format.raw/*21.13*/("""<div class="form-group">				        
				            """),_display_(/*22.18*/inputText(niveleducativoForm("descripcion"), 'labelAlterna -> "Descripción", '_help -> "", 'size->"40em", 'required->"required")),format.raw/*22.146*/("""
				        """),format.raw/*23.13*/("""</div>
				        <input type="submit" value="Actualizar nivel" class="btn btn-primary">  
				    """)))}),format.raw/*25.10*/("""				    
					 """),_display_(/*26.8*/form(CSRF(routes.NiveleducativoController.delete(id)), 'class -> "topRight", 'id->"frmDelete")/*26.102*/ {_display_(Seq[Any](format.raw/*26.104*/("""
							"""),format.raw/*27.8*/("""<input type="submit" value="Eliminar" class="btn btn-danger">
							<a href=""""),_display_(/*28.18*/routes/*28.24*/.NiveleducativoController.listDT()),format.raw/*28.58*/("""" class="btn btn-default">Cancelar</a>
	 				""")))}),format.raw/*29.8*/("""				    
			    """),format.raw/*30.8*/("""</div>
		    </div>
    </div>
    
""")))}),format.raw/*34.2*/("""

"""),_display_(/*36.2*/comunCatalogosJS("Edit","Nivel Educativo")),format.raw/*36.44*/("""



"""))}
  }

  def render(id:Long,niveleducativoForm:Form[Niveleducativo]): play.twirl.api.HtmlFormat.Appendable = apply(id,niveleducativoForm)

  def f:((Long,Form[Niveleducativo]) => play.twirl.api.HtmlFormat.Appendable) = (id,niveleducativoForm) => apply(id,niveleducativoForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:37 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Niveleducativo/editForm.scala.html
                  HASH: 28828374e3102db53964009a02a084f7c7d7268b
                  MATRIX: 760->1|906->164|938->188|1019->52|1046->70|1117->115|1131->121|1188->158|1220->239|1249->243|1260->247|1298->249|1326->251|1773->671|1876->764|1917->766|1970->791|2051->845|2201->973|2242->986|2374->1087|2416->1103|2520->1197|2561->1199|2596->1207|2702->1286|2717->1292|2772->1326|2848->1372|2891->1388|2958->1425|2987->1428|3050->1470
                  LINES: 26->1|28->4|28->4|29->1|30->3|30->3|30->3|30->3|31->4|33->6|33->6|33->6|34->7|47->20|47->20|47->20|48->21|49->22|49->22|50->23|52->25|53->26|53->26|53->26|54->27|55->28|55->28|55->28|56->29|57->30|61->34|63->36|63->36
                  -- GENERATED --
              */
          