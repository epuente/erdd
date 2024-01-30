
package views.html.Versionanterior

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
object listaActualizaciones extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Actualizacion],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(actualizaciones : List[Actualizacion]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.41*/("""

"""),_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""
  """),format.raw/*4.3*/("""<div class=container-fluid style="background-color: white; padding: 10px" style="display:none">
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
				  <li>Recursos</li>
				  <li class="active">Seguimiento a actualizaciones</li>
				</ol>			
			</div>
		</div>
	
	"""),_display_(/*14.3*/flashes()),format.raw/*14.12*/("""


	"""),_display_(/*17.3*/if(actualizaciones.isEmpty)/*17.30*/{_display_(Seq[Any](format.raw/*17.31*/("""
		"""),format.raw/*18.3*/("""No hay registros
	""")))}/*19.4*/else/*19.9*/{_display_(Seq[Any](format.raw/*19.10*/("""
		"""),format.raw/*20.3*/("""Hay """),_display_(/*20.8*/actualizaciones/*20.23*/.size),format.raw/*20.28*/(""" """),format.raw/*20.29*/("""registros de recursos con tipo de versión 'Obra nueva'
		<table class="table table-bordered table-striped">
			<thead>
				<tr>
					<th colspan="2">Obras nuevas</th>
					<th rowspan="2">Claves de control anteriores</th>
					<th rowspan="2" style="width: 160px;"></th>
				</tr>
				<tr>
					<th colspan="1">Título</th>		
					<th colspan="1">Clave de control</th>					
				</tr>
			</thead>
			<tbody>
			"""),_display_(/*34.5*/for(r <- actualizaciones) yield /*34.30*/ {_display_(Seq[Any](format.raw/*34.32*/("""
				"""),format.raw/*35.5*/("""<tr>
					<td>"""),_display_(/*36.11*/r/*36.12*/.getRecurso.titulo),format.raw/*36.30*/("""</td>
					<td>"""),_display_(/*37.11*/r/*37.12*/.getRecurso.numcontrol),format.raw/*37.34*/("""</td>
					<td>
						"""),_display_(/*39.8*/if(!r.getActualizacion.isEmpty)/*39.39*/{_display_(Seq[Any](format.raw/*39.40*/("""
							"""),format.raw/*40.8*/("""<table style="width: 100%" name="tablaAct">
							"""),_display_(/*41.9*/for(i <- r.getActualizacion   ) yield /*41.40*/{_display_(Seq[Any](format.raw/*41.41*/("""
								"""),format.raw/*42.9*/("""<tr>
									<td>"""),_display_(/*43.15*/i/*43.16*/.numcontrol),format.raw/*43.27*/("""</td>
									<td style="width: 10px; text-align: center; vertical-align: middle;"></td>									
								</tr>									
							""")))}),format.raw/*46.9*/("""
							"""),format.raw/*47.8*/("""</table>
						""")))}),format.raw/*48.8*/("""
					"""),format.raw/*49.6*/("""</td>
					<td style="text-align: center; vertical-align: middle;">						
						<a href=""""),_display_(/*51.17*/routes/*51.23*/.VersionanteriorController.create(r.getRecurso.id)),format.raw/*51.73*/("""" class="btn btn-primary" role="button">Relacionar actualizaciones</a>					
					</td>
				</tr>			
			""")))}),format.raw/*54.5*/("""
			"""),format.raw/*55.4*/("""</tbody>
		</table>
		<form id="frmAux"></form>		
	""")))}),format.raw/*58.3*/("""
	"""),format.raw/*59.2*/("""</div>
""")))}),format.raw/*60.2*/("""


"""),format.raw/*63.1*/("""<script type="text/javascript">
	function eliminaAct(recId)"""),format.raw/*64.28*/("""{"""),format.raw/*64.29*/("""
		"""),format.raw/*65.3*/("""if (confirm("¿Desea desasociar el recurso?"))
		$.ajax("""),format.raw/*66.10*/("""{"""),format.raw/*66.11*/("""
			  """),format.raw/*67.6*/("""method: "POST",
			  async: false,
			  url: "/actualizaciones/"+recId+"/delete"
	
			"""),format.raw/*71.4*/("""}"""),format.raw/*71.5*/(""")
			  .success(function( data ) """),format.raw/*72.32*/("""{"""),format.raw/*72.33*/(""" 		  
			  	"""),format.raw/*73.7*/("""if ( (data == null) || (data.length == 0) )"""),format.raw/*73.50*/("""{"""),format.raw/*73.51*/("""
			  		"""),format.raw/*74.8*/("""alert("No es posible eliminar la actualización" );
			  	"""),format.raw/*75.7*/("""}"""),format.raw/*75.8*/(""" """),format.raw/*75.9*/("""else """),format.raw/*75.14*/("""{"""),format.raw/*75.15*/("""
			  		"""),format.raw/*76.8*/("""$("#frmAux").action="actualizacionesList";
			  		$("#frmAux").submit();
			  		$(".alert").html("Se eliminó la actualización");
			  		$(".alert").show();
			  	"""),format.raw/*80.7*/("""}"""),format.raw/*80.8*/("""
			  """),format.raw/*81.6*/("""}"""),format.raw/*81.7*/(""")		  
			  .error(function(data)"""),format.raw/*82.27*/("""{"""),format.raw/*82.28*/("""
			  	"""),format.raw/*83.7*/("""alert('Error ajax en la búsqueda de la clave de control anterior');
			  	numErrores++;
			  """),format.raw/*85.6*/("""}"""),format.raw/*85.7*/(""");
		"""),format.raw/*86.3*/("""}"""),format.raw/*86.4*/("""
"""),format.raw/*87.1*/("""</script>

"""))}
  }

  def render(actualizaciones:List[Actualizacion]): play.twirl.api.HtmlFormat.Appendable = apply(actualizaciones)

  def f:((List[Actualizacion]) => play.twirl.api.HtmlFormat.Appendable) = (actualizaciones) => apply(actualizaciones)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Versionanterior/listaActualizaciones.scala.html
                  HASH: 955ed60600f6d26298ff44fe44352632d9e70857
                  MATRIX: 767->1|894->40|922->43|933->47|970->48|999->51|1316->342|1346->351|1377->356|1413->383|1452->384|1482->387|1519->407|1531->412|1570->413|1600->416|1631->421|1655->436|1681->441|1710->442|2146->852|2187->877|2227->879|2259->884|2301->899|2311->900|2350->918|2393->934|2403->935|2446->957|2495->980|2535->1011|2574->1012|2609->1020|2687->1072|2734->1103|2773->1104|2809->1113|2855->1132|2865->1133|2897->1144|3057->1274|3092->1282|3138->1298|3171->1304|3288->1394|3303->1400|3374->1450|3508->1554|3539->1558|3621->1610|3650->1612|3688->1620|3718->1623|3805->1682|3834->1683|3864->1686|3947->1741|3976->1742|4009->1748|4122->1834|4150->1835|4211->1868|4240->1869|4279->1881|4350->1924|4379->1925|4414->1933|4498->1990|4526->1991|4554->1992|4587->1997|4616->1998|4651->2006|4840->2168|4868->2169|4901->2175|4929->2176|4989->2208|5018->2209|5052->2216|5172->2309|5200->2310|5232->2315|5260->2316|5288->2317
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|42->14|42->14|45->17|45->17|45->17|46->18|47->19|47->19|47->19|48->20|48->20|48->20|48->20|48->20|62->34|62->34|62->34|63->35|64->36|64->36|64->36|65->37|65->37|65->37|67->39|67->39|67->39|68->40|69->41|69->41|69->41|70->42|71->43|71->43|71->43|74->46|75->47|76->48|77->49|79->51|79->51|79->51|82->54|83->55|86->58|87->59|88->60|91->63|92->64|92->64|93->65|94->66|94->66|95->67|99->71|99->71|100->72|100->72|101->73|101->73|101->73|102->74|103->75|103->75|103->75|103->75|103->75|104->76|108->80|108->80|109->81|109->81|110->82|110->82|111->83|113->85|113->85|114->86|114->86|115->87
                  -- GENERATED --
              */
          