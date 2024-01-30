
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
object createForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Niveleducativo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(niveleducativoForm: Form[Niveleducativo]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.44*/("""
"""),format.raw/*3.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*3.46*/routes/*3.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*3.89*/(""""/> 
"""),format.raw/*4.77*/(""" 

"""),_display_(/*6.2*/main/*6.6*/ {_display_(Seq[Any](format.raw/*6.8*/("""
	"""),format.raw/*7.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li><a href="/nivelList">Nivel Educativo</a></li>
					  <li class="active">Agregar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">    
					<h3>Agregar Nivel Educativo</h3>    				
				    """),_display_(/*20.10*/form(routes.NiveleducativoController.save(), 'class->"form-inline", 'id->"frmCreate")/*20.95*/ {_display_(Seq[Any](format.raw/*20.97*/("""
				     	"""),_display_(/*21.12*/CSRF/*21.16*/.formField),format.raw/*21.26*/("""				        
				        """),format.raw/*22.13*/("""<div class="form-group">				        
				            """),_display_(/*23.18*/inputText(niveleducativoForm("descripcion"), 'labelAlterna -> "Descripción", '_help -> "", 'size->"40em", 'required->"required")),format.raw/*23.146*/("""
				        """),format.raw/*24.13*/("""</div>
				        <input type="submit" value="Agregar nivel" class="btn btn-primary">  
				    """)))}),format.raw/*26.10*/("""
				    """),format.raw/*27.9*/("""<a href=""""),_display_(/*27.19*/routes/*27.25*/.NiveleducativoController.listDT()),format.raw/*27.59*/("""" class="btn btn-default">Cancelar</a>
				</div>
			</div>
    </div>    
""")))}),format.raw/*31.2*/("""
"""),_display_(/*32.2*/comunCatalogosJS("Create","Nivel Educativo")),format.raw/*32.46*/("""
"""))}
  }

  def render(niveleducativoForm:Form[Niveleducativo]): play.twirl.api.HtmlFormat.Appendable = apply(niveleducativoForm)

  def f:((Form[Niveleducativo]) => play.twirl.api.HtmlFormat.Appendable) = (niveleducativoForm) => apply(niveleducativoForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:37 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Niveleducativo/createForm.scala.html
                  HASH: 6aedc2bd80e7d548a8bdd6d7d18449665ac3d670
                  MATRIX: 757->1|894->155|926->179|1007->43|1034->61|1105->106|1119->112|1176->149|1208->230|1237->234|1248->238|1286->240|1314->242|1760->661|1854->746|1894->748|1933->760|1946->764|1977->774|2030->799|2111->853|2261->981|2302->994|2431->1092|2467->1101|2504->1111|2519->1117|2574->1151|2680->1227|2708->1229|2773->1273
                  LINES: 26->1|28->4|28->4|29->1|30->3|30->3|30->3|30->3|31->4|33->6|33->6|33->6|34->7|47->20|47->20|47->20|48->21|48->21|48->21|49->22|50->23|50->23|51->24|53->26|54->27|54->27|54->27|54->27|58->31|59->32|59->32
                  -- GENERATED --
              */
          