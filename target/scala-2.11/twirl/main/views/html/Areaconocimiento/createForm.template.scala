
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
object createForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Areaconocimiento],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(areaconocimientoForm: Form[Areaconocimiento]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.77*/(""" 
"""),format.raw/*6.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*6.46*/routes/*6.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*6.89*/(""""/> 
"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
	"""),format.raw/*8.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li><a href="/areaconocimientos">Áreas del Conocimiento</a></li>
					  <li class="active">Agregar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">        
				    <h3>Agregar Área del Conocimiento</h3>				    
				    """),_display_(/*21.10*/form(CSRF(routes.AreaconocimientoController.save()), 'class->"form-inline", 'id->"frmCreate")/*21.103*/ {_display_(Seq[Any](format.raw/*21.105*/("""	
   					  	"""),format.raw/*22.12*/("""<div class="form-group">			        			        
				            """),_display_(/*23.18*/inputText(areaconocimientoForm("descripcion"), 'labelAlterna -> "Descripción", '_help -> "", 'size->"40em")),format.raw/*23.125*/("""
				            """),format.raw/*24.17*/("""<input type="submit" value="Crear área del conocimiento." class="btn btn-primary">
			            </div> 
				    """)))}),format.raw/*26.10*/("""
				    """),format.raw/*27.9*/("""<div class="actions">				    
				    	<a href=""""),_display_(/*28.20*/routes/*28.26*/.AreaconocimientoController.list()),format.raw/*28.60*/("""" class="btn btn-default">Cancelar</a>
			    	</div>
			    </div>
		    </div>
    </div>
    
""")))}),format.raw/*34.2*/("""

"""),_display_(/*36.2*/comunCatalogosJS("Create", "Área del conocimiento")))}
  }

  def render(areaconocimientoForm:Form[Areaconocimiento]): play.twirl.api.HtmlFormat.Appendable = apply(areaconocimientoForm)

  def f:((Form[Areaconocimiento]) => play.twirl.api.HtmlFormat.Appendable) = (areaconocimientoForm) => apply(areaconocimientoForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Areaconocimiento/createForm.scala.html
                  HASH: 09b51b7555b72000333fab281f977ad7110a4f27
                  MATRIX: 761->1|902->68|934->92|1015->47|1043->66|1071->143|1099->145|1170->190|1184->196|1241->233|1272->239|1283->243|1321->245|1349->247|1823->694|1926->787|1967->789|2008->802|2099->866|2228->973|2273->990|2419->1105|2455->1114|2531->1163|2546->1169|2601->1203|2729->1301|2758->1304
                  LINES: 26->1|28->5|28->5|29->1|31->4|32->5|33->6|33->6|33->6|33->6|34->7|34->7|34->7|35->8|48->21|48->21|48->21|49->22|50->23|50->23|51->24|53->26|54->27|55->28|55->28|55->28|61->34|63->36
                  -- GENERATED --
              */
          