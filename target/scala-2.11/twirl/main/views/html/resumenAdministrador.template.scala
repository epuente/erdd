
package views.html

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
object resumenAdministrador extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Map[String, Int],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registros:Map[String,Int]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main/*4.6*/ {_display_(Seq[Any](format.raw/*4.8*/("""
	"""),format.raw/*5.2*/("""Tablero de indicadores en construcción
""")))}))}
  }

  def render(registros:Map[String, Int]): play.twirl.api.HtmlFormat.Appendable = apply(registros)

  def f:((Map[String, Int]) => play.twirl.api.HtmlFormat.Appendable) = (registros) => apply(registros)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/resumenAdministrador.scala.html
                  HASH: 5976d2bb0cb58979f0cdf175beb1418c905d6e3b
                  MATRIX: 748->1|878->28|905->46|932->48|943->52|981->54|1009->56
                  LINES: 26->1|29->1|30->3|31->4|31->4|31->4|32->5
                  -- GENERATED --
              */
          