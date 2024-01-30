
package views.html.Historial

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
object log extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Log],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(logs:List[Log]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.18*/("""


"""),_display_(/*4.2*/for((log,il)<-logs.zipWithIndex) yield /*4.34*/{_display_(Seq[Any](format.raw/*4.35*/("""

	 	"""),_display_(/*6.5*/if(log.tipo=="e")/*6.22*/{_display_(Seq[Any](format.raw/*6.23*/("""
					"""),format.raw/*7.6*/("""<div class="widget widget-stats bg-blue-lighter" >
					 	<small id="dif"""),_display_(/*8.23*/il),format.raw/*8.25*/("""" class="pull-right ml"></small>
					 	<small id="dt"""),_display_(/*9.22*/il),format.raw/*9.24*/("""" name="dt">"""),_display_(/*9.37*/log/*9.40*/.auditinsert.format("dd/MM/yyyy HH:mm:ss")),format.raw/*9.82*/("""</small>
			            <div class="stats-icon stats-icon-sm"><i class="fa fa fa-file-text-o fa-fw"></i></div>
			            <p>"""),_display_(/*11.20*/log/*11.23*/.recurso.numcontrol),format.raw/*11.42*/("""</p>
			             <p class='h6'>"""),_display_(/*12.32*/log/*12.35*/.recurso.titulo),format.raw/*12.50*/("""</p>";
						Estado: """),_display_(/*13.16*/log/*13.19*/.estado.descripcion),format.raw/*13.38*/("""					 							
		""")))}),format.raw/*14.4*/("""
	 	"""),_display_(/*15.5*/if(log.tipo=="ev")/*15.23*/{_display_(Seq[Any](format.raw/*15.24*/("""
					"""),format.raw/*16.6*/("""<div class="widget widget-stats bg-aqua-lighter">
					 	<small id="dif"""),_display_(/*17.23*/il),format.raw/*17.25*/("""" class="pull-right ml"></small>
					 	<small id="dt"""),_display_(/*18.22*/il),format.raw/*18.24*/("""" name="dt">"""),_display_(/*18.37*/log/*18.40*/.auditinsert.format("dd/MM/yyyy HH:mm:ss")),format.raw/*18.82*/("""</small>
			            <div class="stats-icon stats-icon-sm">
			            	<i class="fa fa-list-alt fa-fw"></i>
			            </div>
			            <p>"""),_display_(/*22.20*/log/*22.23*/.recurso.numcontrol),format.raw/*22.42*/("""</p>
			            <p class='h6'>"""),_display_(/*23.31*/log/*23.34*/.recurso.titulo),format.raw/*23.49*/("""</p>";
						Estado evaluación: """),_display_(/*24.27*/log/*24.30*/.estadoevaluacion.descripcion),format.raw/*24.59*/("""			 							
		""")))}),format.raw/*25.4*/("""
 		"""),_display_(/*26.5*/if(log.tipo=="en")/*26.23*/{_display_(Seq[Any](format.raw/*26.24*/("""
					"""),format.raw/*27.6*/("""<div class="widget widget-stats bg-purple-lighter">
						<small id="dif"""),_display_(/*28.22*/il),format.raw/*28.24*/("""" class="pull-right ml"></small>
	 					<small id="dt"""),_display_(/*29.22*/il),format.raw/*29.24*/("""" name="dt">"""),_display_(/*29.37*/log/*29.40*/.auditinsert.format("dd/MM/yyyy HH:mm:ss")),format.raw/*29.82*/("""</small>
			            <div class="stats-icon stats-icon-sm">
			            	<i class="fa fa-check-square-o fa-fw"></i>
			            </div>
			            <p>"""),_display_(/*33.20*/log/*33.23*/.recurso.numcontrol),format.raw/*33.42*/("""</p>
			            <p class='h6 mt-0 mb-1'>"""),_display_(/*34.41*/log/*34.44*/.recurso.titulo),format.raw/*34.59*/("""</p>";
	 				    Estado encuesta: """),_display_(/*35.29*/log/*35.32*/.estadoencuesta.descripcion),format.raw/*35.59*/("""		
		""")))}),format.raw/*36.4*/("""
			        """),format.raw/*37.12*/("""</div>
 
""")))}),format.raw/*39.2*/("""



"""),format.raw/*43.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*44.15*/("""{"""),format.raw/*44.16*/("""
		"""),format.raw/*45.3*/("""$("[name='dt']").each(function()"""),format.raw/*45.35*/("""{"""),format.raw/*45.36*/("""
			"""),format.raw/*46.4*/("""aux = moment($(this).html(),  "DD/MM/YYYY HH:mm:ss"  );
			diferencia = moment().diff(aux);
			$("#dif"+$(this).attr("id").substr(2)).html(  moment().diff(  aux,'seconds'  ) +' segundos'  );
			if (diferencia >= 60000)"""),format.raw/*49.28*/("""{"""),format.raw/*49.29*/("""
				"""),format.raw/*50.5*/("""$("#dif"+$(this).attr("id").substr(2)).html(  moment().diff(  aux , 'minutes' ) +' minutos'  );
			"""),format.raw/*51.4*/("""}"""),format.raw/*51.5*/("""
			"""),format.raw/*52.4*/("""if (diferencia >= 3600000)"""),format.raw/*52.30*/("""{"""),format.raw/*52.31*/("""
				"""),format.raw/*53.5*/("""$("#dif"+$(this).attr("id").substr(2)).html(  moment().diff(  aux , 'hours' ) +' horas'  );
			"""),format.raw/*54.4*/("""}"""),format.raw/*54.5*/("""
			"""),format.raw/*55.4*/("""if (diferencia >= 86400000)"""),format.raw/*55.31*/("""{"""),format.raw/*55.32*/("""
				"""),format.raw/*56.5*/("""$("#dif"+$(this).attr("id").substr(2)).html(  moment().diff(  aux , 'days' ) +' días'  );
			"""),format.raw/*57.4*/("""}"""),format.raw/*57.5*/("""
		"""),format.raw/*58.3*/("""}"""),format.raw/*58.4*/(""");
	"""),format.raw/*59.2*/("""}"""),format.raw/*59.3*/(""");

</script>"""))}
  }

  def render(logs:List[Log]): play.twirl.api.HtmlFormat.Appendable = apply(logs)

  def f:((List[Log]) => play.twirl.api.HtmlFormat.Appendable) = (logs) => apply(logs)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Historial/log.scala.html
                  HASH: ee2544b648c0c6d94e175148b6b4c20c9337e09e
                  MATRIX: 734->1|838->17|867->21|914->53|952->54|983->60|1008->77|1046->78|1078->84|1177->157|1199->159|1279->213|1301->215|1340->228|1351->231|1413->273|1570->403|1582->406|1622->425|1685->461|1697->464|1733->479|1782->501|1794->504|1834->523|1881->540|1912->545|1939->563|1978->564|2011->570|2110->642|2133->644|2214->698|2237->700|2277->713|2289->716|2352->758|2536->915|2548->918|2588->937|2650->972|2662->975|2698->990|2758->1023|2770->1026|2820->1055|2865->1070|2896->1075|2923->1093|2962->1094|2995->1100|3095->1173|3118->1175|3199->1229|3222->1231|3262->1244|3274->1247|3337->1289|3527->1452|3539->1455|3579->1474|3651->1519|3663->1522|3699->1537|3761->1572|3773->1575|3821->1602|3857->1608|3897->1620|3937->1630|3968->1634|4042->1680|4071->1681|4101->1684|4161->1716|4190->1717|4221->1721|4467->1939|4496->1940|4528->1945|4654->2044|4682->2045|4713->2049|4767->2075|4796->2076|4828->2081|4950->2176|4978->2177|5009->2181|5064->2208|5093->2209|5125->2214|5245->2307|5273->2308|5303->2311|5331->2312|5362->2316|5390->2317
                  LINES: 26->1|29->1|32->4|32->4|32->4|34->6|34->6|34->6|35->7|36->8|36->8|37->9|37->9|37->9|37->9|37->9|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|43->15|43->15|43->15|44->16|45->17|45->17|46->18|46->18|46->18|46->18|46->18|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|54->26|54->26|54->26|55->27|56->28|56->28|57->29|57->29|57->29|57->29|57->29|61->33|61->33|61->33|62->34|62->34|62->34|63->35|63->35|63->35|64->36|65->37|67->39|71->43|72->44|72->44|73->45|73->45|73->45|74->46|77->49|77->49|78->50|79->51|79->51|80->52|80->52|80->52|81->53|82->54|82->54|83->55|83->55|83->55|84->56|85->57|85->57|86->58|86->58|87->59|87->59
                  -- GENERATED --
              */
          