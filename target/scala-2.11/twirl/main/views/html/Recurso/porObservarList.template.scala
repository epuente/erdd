
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
object porObservarList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Recurso],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(rs: List[Recurso], mensaje:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*4.83*/(""" 

"""),_display_(/*6.2*/main/*6.6*/ {_display_(Seq[Any](format.raw/*6.8*/("""
	"""),format.raw/*7.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
		<div class=container-fluid >    
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Recursos</li>
					  <li class="active">Solicitudes por revisar</li>
					</ol>			
				</div>
			</div>
			<h3>Solicitudes por revisar</h3>
			"""),_display_(/*18.5*/if(rs.isEmpty)/*18.19*/ {_display_(Seq[Any](format.raw/*18.21*/("""		
				"""),format.raw/*19.5*/("""<h1>No existen registros.</h1>
			""")))}/*20.6*/else/*20.11*/{_display_(Seq[Any](format.raw/*20.12*/("""	
			    """),_display_(/*21.9*/if(flash.containsKey("success"))/*21.41*/ {_display_(Seq[Any](format.raw/*21.43*/("""
			        """),format.raw/*22.12*/("""<div class="alert alert-success" role="alert">
			            """),_display_(/*23.17*/flash/*23.22*/.get("success")),format.raw/*23.37*/("""
			        """),format.raw/*24.12*/("""</div>
			    """)))}),format.raw/*25.9*/("""
			    """),_display_(/*26.9*/if(flash.containsKey("warning"))/*26.41*/ {_display_(Seq[Any](format.raw/*26.43*/("""
			        """),format.raw/*27.12*/("""<div class="alert alert-warning" role="alert">
			            <strong>"""),_display_(/*28.25*/flash/*28.30*/.get("warning")),format.raw/*28.45*/("""</strong>
			        </div>
			    """)))}),format.raw/*30.9*/("""    
			    """),_display_(/*31.9*/if(flash.containsKey("error"))/*31.39*/ {_display_(Seq[Any](format.raw/*31.41*/("""
			        """),format.raw/*32.12*/("""<div class="alert alert-danger" role="alert">
			            <strong>"""),_display_(/*33.25*/flash/*33.30*/.get("error")),format.raw/*33.43*/("""</strong>
			        </div>
			    """)))}),format.raw/*35.9*/("""		
			
				"""),_display_(/*37.6*/observar(rs, mensaje)),format.raw/*37.27*/("""
		
			""")))}),format.raw/*39.5*/("""
		"""),format.raw/*40.3*/("""</div>
	</div>
""")))}))}
  }

  def render(rs:List[Recurso],mensaje:String): play.twirl.api.HtmlFormat.Appendable = apply(rs,mensaje)

  def f:((List[Recurso],String) => play.twirl.api.HtmlFormat.Appendable) = (rs,mensaje) => apply(rs,mensaje)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/porObservarList.scala.html
                  HASH: aeb2e1e13c4d6ded9e7f8b83cef269c679813647
                  MATRIX: 755->1|885->56|917->80|1004->36|1033->137|1062->141|1073->145|1111->147|1139->149|1509->493|1532->507|1572->509|1606->516|1659->552|1672->557|1711->558|1747->568|1788->600|1828->602|1868->614|1958->677|1972->682|2008->697|2048->709|2093->724|2128->733|2169->765|2209->767|2249->779|2347->850|2361->855|2397->870|2463->906|2502->919|2541->949|2581->951|2621->963|2718->1033|2732->1038|2766->1051|2832->1087|2870->1099|2912->1120|2950->1128|2980->1131
                  LINES: 26->1|28->4|28->4|29->1|31->4|33->6|33->6|33->6|34->7|45->18|45->18|45->18|46->19|47->20|47->20|47->20|48->21|48->21|48->21|49->22|50->23|50->23|50->23|51->24|52->25|53->26|53->26|53->26|54->27|55->28|55->28|55->28|57->30|58->31|58->31|58->31|59->32|60->33|60->33|60->33|62->35|64->37|64->37|66->39|67->40
                  -- GENERATED --
              */
          