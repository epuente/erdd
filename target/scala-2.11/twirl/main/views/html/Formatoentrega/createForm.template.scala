
package views.html.Formatoentrega

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
object createForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Formatoentrega],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(feForm: Form[Formatoentrega]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*4.89*/(""""/> 

"""),format.raw/*6.77*/(""" 

"""),_display_(/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""
	"""),format.raw/*9.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li><a href="/unidadacademica">Formatos de entrega</a></li>
					  <li class="active">Agregar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Agregar formato de entrega</h3>
		        </div>
			</div>
			<div class="row">    
    			<div class="col-lg-12">
				    """),_display_(/*26.10*/form(CSRF(routes.FormatoentregaController.save()), 'class->"form-inline", 'id->"frmCreate")/*26.101*/ {_display_(Seq[Any](format.raw/*26.103*/("""
					  """),format.raw/*27.8*/("""<div class="form-group">
				            """),_display_(/*28.18*/inputText(feForm("descripcion"), 'labelAlterna -> "Descripción", '_help -> "", 'required->"required", 'size->"40em")),format.raw/*28.134*/("""
    						"""),format.raw/*29.11*/("""<input type="submit" value="Agregar" class="btn btn-primary">				            
				       </div>
				     
			        """)))}),format.raw/*32.13*/("""
			        """),format.raw/*33.12*/("""<div class="actions">			            
			            <a href=""""),_display_(/*34.26*/routes/*34.32*/.FormatoentregaController.list()),format.raw/*34.64*/("""" class="btn btn-default">Cancelar</a> 
			        </div>			        
				 </div>
		 </div>       
    </div>
    
    
""")))}),format.raw/*41.2*/("""

"""),_display_(/*43.2*/comunCatalogosJS("Create", "formato de entrega")),format.raw/*43.50*/("""

"""))}
  }

  def render(feForm:Form[Formatoentrega]): play.twirl.api.HtmlFormat.Appendable = apply(feForm)

  def f:((Form[Formatoentrega]) => play.twirl.api.HtmlFormat.Appendable) = (feForm) => apply(feForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Formatoentrega/createForm.scala.html
                  HASH: 579956a204207872d05c0fe29cb062f8e761a796
                  MATRIX: 757->1|882->145|914->169|995->31|1023->50|1094->95|1108->101|1165->138|1198->220|1227->224|1238->228|1276->230|1304->232|1843->744|1944->835|1985->837|2020->845|2089->887|2227->1003|2266->1014|2415->1132|2455->1144|2544->1206|2559->1212|2612->1244|2762->1364|2791->1367|2860->1415
                  LINES: 26->1|28->6|28->6|29->1|31->4|31->4|31->4|31->4|33->6|35->8|35->8|35->8|36->9|53->26|53->26|53->26|54->27|55->28|55->28|56->29|59->32|60->33|61->34|61->34|61->34|68->41|70->43|70->43
                  -- GENERATED --
              */
          