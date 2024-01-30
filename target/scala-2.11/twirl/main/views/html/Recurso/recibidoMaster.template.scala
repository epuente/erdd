
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
object recibidoMaster extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Recurso,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(r: Recurso):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import scala.collection.JavaConversions._
import helper._

Seq[Any](format.raw/*1.14*/(""" 
"""),format.raw/*3.1*/("""
"""),format.raw/*5.1*/("""

"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""

	"""),format.raw/*9.2*/("""<div class="jumbotron">
		<div class="container">
		  <h1>Recepción correcta.</h1>
			  <p>Se ha generado con éxito la solicitud de evaluación para el recurso:</p>
			  <h3>"""),_display_(/*13.11*/r/*13.12*/.titulo),format.raw/*13.19*/("""</h3>
			  <p>con la clave de control:</p>
			  <h2>"""),_display_(/*15.11*/r/*15.12*/.numcontrol),format.raw/*15.23*/("""</h2>
			  <h5>"""),_display_(/*16.11*/r/*16.12*/.ncLetras()),format.raw/*16.23*/("""</h5>
			  <p>Anote y guarde esta clave confidencial, ya que le será requerida posteriormente para el seguimiento de su solicitud.</p>
			  
			  <br>
			  <p>Se le enviará de manera automática un correo electrónico, si después de 72 horas no lo ha recibido, por favor comuníquese a la extensión 57405.</p>
		  	  
		</div>
	</div>


""")))}))}
  }

  def render(r:Recurso): play.twirl.api.HtmlFormat.Appendable = apply(r)

  def f:((Recurso) => play.twirl.api.HtmlFormat.Appendable) = (r) => apply(r)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/recibidoMaster.scala.html
                  HASH: ad9f2ee68434b7975a0c664c88fd72dc823bbfa0
                  MATRIX: 741->1|898->13|926->59|953->77|981->80|992->84|1030->86|1059->89|1260->263|1270->264|1298->271|1378->324|1388->325|1420->336|1463->352|1473->353|1505->364
                  LINES: 26->1|30->1|31->3|32->5|34->7|34->7|34->7|36->9|40->13|40->13|40->13|42->15|42->15|42->15|43->16|43->16|43->16
                  -- GENERATED --
              */
          