
package views.html.Recursoevaluador

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
object listarEvaluacionesConObservaciones extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Recursoevaluador],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(re:List[Recursoevaluador], tipo:Int):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.39*/("""
"""),_display_(/*2.2*/main/*2.6*/{_display_(Seq[Any](format.raw/*2.7*/("""

	"""),format.raw/*4.2*/("""<div class="container-fluid" style="background-color: white; padding: 10px;">
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
					"""),_display_(/*8.7*/if( request.uri.substring(request.uri.length-1).compareTo("0") == 0  )/*8.77*/{_display_(Seq[Any](format.raw/*8.78*/("""	
				  		"""),format.raw/*9.9*/("""<li>Recursos</li>
				  		<li class="active">Evaluaciones con observaciones</li>
				  	""")))}),format.raw/*11.9*/("""
				  	"""),_display_(/*12.9*/if( request.uri.substring(request.uri.length-1).compareTo("1") == 0  )/*12.79*/{_display_(Seq[Any](format.raw/*12.80*/("""
				  		"""),format.raw/*13.9*/("""<li>Detalle evaluaciones</li>
				  		<li class="active">Evaluaciones con observaciones</li>
				  	""")))}),format.raw/*15.9*/("""
				"""),format.raw/*16.5*/("""</ol>			
			</div>
		</div>	
		<div class="row">
			<div class="col-md-12">
				"""),_display_(/*21.6*/if( request.uri.substring(request.uri.length-1).compareTo("0") == 0  )/*21.76*/{_display_(Seq[Any](format.raw/*21.77*/("""
					"""),format.raw/*22.6*/("""<h3>Evaluaciones con observaciones</h3>
				""")))}),format.raw/*23.6*/("""
				"""),_display_(/*24.6*/if( request.uri.substring(request.uri.length-1).compareTo("1") == 0  )/*24.76*/{_display_(Seq[Any](format.raw/*24.77*/("""
					"""),format.raw/*25.6*/("""<h3>Evaluaciones con observaciones</h3>
				""")))}),format.raw/*26.6*/("""
				
			"""),format.raw/*28.4*/("""</div>
		</div>

		<div class="row">
			<div class="col-lg-12">
				"""),_display_(/*33.6*/comunListarEvaluaciones(re, tipo)),format.raw/*33.39*/("""
			"""),format.raw/*34.4*/("""</div>
		</div>
	</div>
""")))}))}
  }

  def render(re:List[Recursoevaluador],tipo:Int): play.twirl.api.HtmlFormat.Appendable = apply(re,tipo)

  def f:((List[Recursoevaluador],Int) => play.twirl.api.HtmlFormat.Appendable) = (re,tipo) => apply(re,tipo)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recursoevaluador/listarEvaluacionesConObservaciones.scala.html
                  HASH: 5f19f3f958453876d2fb171a9d05396099108bf5
                  MATRIX: 789->1|914->38|941->40|952->44|989->45|1018->48|1202->207|1280->277|1318->278|1354->288|1473->377|1508->386|1587->456|1626->457|1662->466|1793->567|1825->572|1932->653|2011->723|2050->724|2083->730|2158->775|2190->781|2269->851|2308->852|2341->858|2416->903|2452->912|2547->981|2601->1014|2632->1018
                  LINES: 26->1|29->1|30->2|30->2|30->2|32->4|36->8|36->8|36->8|37->9|39->11|40->12|40->12|40->12|41->13|43->15|44->16|49->21|49->21|49->21|50->22|51->23|52->24|52->24|52->24|53->25|54->26|56->28|61->33|61->33|62->34
                  -- GENERATED --
              */
          