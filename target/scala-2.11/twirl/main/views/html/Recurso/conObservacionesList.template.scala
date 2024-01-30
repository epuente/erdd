
package views.html.Recurso

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
object conObservacionesList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Recurso],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(rs: List[Recurso], mensaje:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*4.83*/(""" 

"""),_display_(/*6.2*/main/*6.6*/ {_display_(Seq[Any](format.raw/*6.8*/("""
	"""),format.raw/*7.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
    
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Recursos</li>
					  <li class="active">Solicitudes con observaciones</li>
					</ol>			
				</div>
			</div>
  
	
	
	<h3>Solicitudes con observaciones</h3>
	
	
	"""),_display_(/*23.3*/if(rs.isEmpty)/*23.17*/ {_display_(Seq[Any](format.raw/*23.19*/("""		
		"""),format.raw/*24.3*/("""<h1>No existen registros.</h1>
	""")))}/*25.4*/else/*25.9*/{_display_(Seq[Any](format.raw/*25.10*/("""
	
	    """),_display_(/*27.7*/if(flash.containsKey("success"))/*27.39*/ {_display_(Seq[Any](format.raw/*27.41*/("""
	        """),format.raw/*28.10*/("""<div class="alert alert-success" role="alert">
	            """),_display_(/*29.15*/flash/*29.20*/.get("success")),format.raw/*29.35*/("""
	        """),format.raw/*30.10*/("""</div>
	    """)))}),format.raw/*31.7*/("""
	    """),_display_(/*32.7*/if(flash.containsKey("warning"))/*32.39*/ {_display_(Seq[Any](format.raw/*32.41*/("""
	        """),format.raw/*33.10*/("""<div class="alert alert-warning" role="alert">
	            <strong>"""),_display_(/*34.23*/flash/*34.28*/.get("warning")),format.raw/*34.43*/("""</strong>
	        </div>
	    """)))}),format.raw/*36.7*/("""    """),_display_(/*36.12*/if(flash.containsKey("error"))/*36.42*/ {_display_(Seq[Any](format.raw/*36.44*/("""
	        """),format.raw/*37.10*/("""<div class="alert alert-danger" role="alert">
	            <strong>"""),_display_(/*38.23*/flash/*38.28*/.get("error")),format.raw/*38.41*/("""</strong>
	        </div>
	    """)))}),format.raw/*40.7*/("""		
	
		"""),_display_(/*42.4*/observar(rs, mensaje)),format.raw/*42.25*/("""

	""")))}),format.raw/*44.3*/("""
	"""),format.raw/*45.2*/("""</div>
""")))}))}
  }

  def render(rs:List[Recurso],mensaje:String): play.twirl.api.HtmlFormat.Appendable = apply(rs,mensaje)

  def f:((List[Recurso],String) => play.twirl.api.HtmlFormat.Appendable) = (rs,mensaje) => apply(rs,mensaje)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/conObservacionesList.scala.html
                  HASH: 9bfa5bcf87e63a659ff4f390d321da388ce9633a
                  MATRIX: 760->1|890->56|922->80|1009->36|1038->137|1067->141|1078->145|1116->147|1144->149|1503->482|1526->496|1566->498|1598->503|1649->537|1661->542|1700->543|1735->552|1776->584|1816->586|1854->596|1942->657|1956->662|1992->677|2030->687|2073->700|2106->707|2147->739|2187->741|2225->751|2321->820|2335->825|2371->840|2433->872|2465->877|2504->907|2544->909|2582->919|2677->987|2691->992|2725->1005|2787->1037|2821->1045|2863->1066|2897->1070|2926->1072
                  LINES: 26->1|28->4|28->4|29->1|31->4|33->6|33->6|33->6|34->7|50->23|50->23|50->23|51->24|52->25|52->25|52->25|54->27|54->27|54->27|55->28|56->29|56->29|56->29|57->30|58->31|59->32|59->32|59->32|60->33|61->34|61->34|61->34|63->36|63->36|63->36|63->36|64->37|65->38|65->38|65->38|67->40|69->42|69->42|71->44|72->45
                  -- GENERATED --
              */
          