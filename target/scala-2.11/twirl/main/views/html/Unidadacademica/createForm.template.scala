
package views.html.Unidadacademica

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
object createForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Unidadacademica],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(unidadacademicaForm: Form[Unidadacademica]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.46*/("""

"""),format.raw/*4.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*4.46*/routes/*4.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*4.89*/(""""/> 

"""),format.raw/*6.77*/(""" 

"""),_display_(/*8.2*/main/*8.6*/ {_display_(Seq[Any](format.raw/*8.8*/("""
	"""),format.raw/*9.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li><a href="/unidadacademica">Unidades académicas</a></li>
					  <li class="active">Agregar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Agregar Unidad Académica</h3>
		        </div>
			</div>
			<div class="row">    
    			<div class="col-lg-12">
				    """),_display_(/*26.10*/form(CSRF(routes.UnidadacademicaController.save()), 'class->"form-inline", 'id->"frmCreate")/*26.102*/ {_display_(Seq[Any](format.raw/*26.104*/("""
					  """),format.raw/*27.8*/("""<div class="form-group">
				            """),_display_(/*28.18*/inputText(unidadacademicaForm("nombre"), 'labelAlterna -> "Nombre", '_help -> "", 'required->"required", 'size->"80em")),format.raw/*28.137*/("""
				            """),format.raw/*29.17*/("""<br>
                            <div class="form-group">
                              """),_display_(/*31.32*/inputCheckboxGroup(
                                 unidadacademicaForm("nivel"),
                                 options = options(models.Niveleducativo.options),                              
                                 '_label -> null                                                                                 
                              )),format.raw/*35.32*/("""
				           """),format.raw/*36.16*/("""</div>
				           <br><br>
                            <div class="form-group">
                              """),_display_(/*39.32*/inputCheckboxGroup(
                                 unidadacademicaForm("area"),
                                 options = options(models.Areaconocimiento.options),                              
                                 '_label -> null                                                                                 
                              )),format.raw/*43.32*/("""
                           """),format.raw/*44.28*/("""</div>				           
				           <br><br> 
    						<input type="submit" value="Agregar" class="btn btn-primary">				            
				       </div>
				     
			        """)))}),format.raw/*49.13*/("""
			        """),format.raw/*50.12*/("""<div class="actions">			            
			            <a href=""""),_display_(/*51.26*/routes/*51.32*/.UnidadacademicaController.list()),format.raw/*51.65*/("""" class="btn btn-default">Cancelar</a> 
			        </div>			        
				 </div>
		 </div>       
    </div>
    
    
""")))}),format.raw/*58.2*/("""

"""))}
  }

  def render(unidadacademicaForm:Form[Unidadacademica]): play.twirl.api.HtmlFormat.Appendable = apply(unidadacademicaForm)

  def f:((Form[Unidadacademica]) => play.twirl.api.HtmlFormat.Appendable) = (unidadacademicaForm) => apply(unidadacademicaForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Unidadacademica/createForm.scala.html
                  HASH: 5fd3cd6f0fd84958f2d060d03109ae8191e91d5b
                  MATRIX: 759->1|898->159|930->183|1011->45|1039->64|1110->109|1124->115|1181->152|1214->234|1243->238|1254->242|1292->244|1320->246|1857->756|1959->848|2000->850|2035->858|2104->900|2245->1019|2290->1036|2406->1125|2784->1482|2828->1498|2970->1613|3349->1971|3405->1999|3611->2174|3651->2186|3740->2248|3755->2254|3809->2287|3959->2407
                  LINES: 26->1|28->6|28->6|29->1|31->4|31->4|31->4|31->4|33->6|35->8|35->8|35->8|36->9|53->26|53->26|53->26|54->27|55->28|55->28|56->29|58->31|62->35|63->36|66->39|70->43|71->44|76->49|77->50|78->51|78->51|78->51|85->58
                  -- GENERATED --
              */
          