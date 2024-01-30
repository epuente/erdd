
package views.html.EvaluacionEvaluador

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
object resumen extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[Int,Int,Int,Int,Int,Int,Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(rs:Int, rs1: Int, rs2:Int, rs3:Int, rs4:Int, rs5:Int, c400:Int):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.66*/("""
"""),format.raw/*3.80*/(""" 


"""),_display_(/*6.2*/main/*6.6*/ {_display_(Seq[Any](format.raw/*6.8*/("""
	"""),format.raw/*7.2*/("""<script src=""""),_display_(/*7.16*/routes/*7.22*/.Assets.at("javascripts/highcharts/highcharts.js")),format.raw/*7.72*/("""" ></script>		
	<script src=""""),_display_(/*8.16*/routes/*8.22*/.Assets.at("javascripts/highcharts/highcharts-3d.js")),format.raw/*8.75*/("""" ></script>
	
	
<div style="background-color: white; padding: 10px;">
	<div id=wrapper >
		<div class="row">
			<div class="col-lg-12">
  	          <h1 class="page-header">Inicio</h1>
			  """),_display_(/*16.7*/flashes()),format.raw/*16.16*/("""
	        """),format.raw/*17.10*/("""</div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
	               	<div class="panel-heading"><span class="glyphicon glyphicon-list-alt"></span>Estado de asignaciones</div>
              		<div class="panel-body">
              			<div class="row"> 
	              			<div class="col-lg-4">
									<table class="table table-striped table-bordered table-responsive" id="tablaResumen">
										<tr>
											<td><a href="/evList">Todas las asignaciones</a></td><td><div class="center-block"> """),_display_(/*28.97*/rs),format.raw/*28.99*/("""</div> </td>
										</tr>
										<tr>
											<td><a href="/porEvaluar">Mis asignaciones por atender</a></td><td> """),_display_(/*31.81*/rs1),format.raw/*31.84*/("""</td>
										</tr>									
										<tr>
											<td><a href="/enProceso">Evaluaciones en proceso</a></td><td> """),_display_(/*34.75*/rs2),format.raw/*34.78*/("""   """),format.raw/*34.81*/("""</td>
										</tr>
										<tr>
											<td><a href="/evPorAtenderAdmin">Para revisar por el administrador</a></td><td> """),_display_(/*37.93*/rs3),format.raw/*37.96*/("""   """),format.raw/*37.99*/("""</td>
										</tr>							
										 <tr>
											<td><a href="/evPorObservar">Evaluaciones con observaciones</a></td><td> """),_display_(/*40.86*/rs4),format.raw/*40.89*/("""  """),format.raw/*40.91*/("""</td>
										</tr>
										 <tr>
											<td><a href="/evConcluidas">Evaluaciones concluidas</a></td><td> """),_display_(/*43.78*/rs5),format.raw/*43.81*/("""</td>
										</tr>
										<tr>
											<td><a href="/evSolicitudesCancelacion">Solicitudes de cancelación</a></td><td> """),_display_(/*46.93*/c400),format.raw/*46.97*/("""</td>
										</tr>

									</table>			
	              			</div>
              				<div class="col-lg-8">
	              				<div id="container"></div>
	              			</div>	              			
	              		</div>
              		</div>
           		</div>
       		</div>
   		</div>	              		
	</div>			
</div>



                    
                    
	                

""")))}),format.raw/*68.2*/("""


"""),format.raw/*71.1*/("""<script type="text/javascript">
$(function () """),format.raw/*72.15*/("""{"""),format.raw/*72.16*/("""
    """),format.raw/*73.5*/("""$('#container').highcharts("""),format.raw/*73.32*/("""{"""),format.raw/*73.33*/("""
        """),format.raw/*74.9*/("""chart: """),format.raw/*74.16*/("""{"""),format.raw/*74.17*/("""
            """),format.raw/*75.13*/("""type: 'pie',
            options3d: """),format.raw/*76.24*/("""{"""),format.raw/*76.25*/("""
                """),format.raw/*77.17*/("""enabled: true,
                alpha: 45
            """),format.raw/*79.13*/("""}"""),format.raw/*79.14*/("""
        """),format.raw/*80.9*/("""}"""),format.raw/*80.10*/(""",
        title: """),format.raw/*81.16*/("""{"""),format.raw/*81.17*/("""
            """),format.raw/*82.13*/("""text: ''
        """),format.raw/*83.9*/("""}"""),format.raw/*83.10*/(""",
        subtitle: """),format.raw/*84.19*/("""{"""),format.raw/*84.20*/("""
            """),format.raw/*85.13*/("""text: ''
        """),format.raw/*86.9*/("""}"""),format.raw/*86.10*/(""",
        legend: """),format.raw/*87.17*/("""{"""),format.raw/*87.18*/("""
            """),format.raw/*88.13*/("""enabled: false
        """),format.raw/*89.9*/("""}"""),format.raw/*89.10*/(""",
        plotOptions: """),format.raw/*90.22*/("""{"""),format.raw/*90.23*/("""
            """),format.raw/*91.13*/("""pie: """),format.raw/*91.18*/("""{"""),format.raw/*91.19*/("""
                """),format.raw/*92.17*/("""innerSize: 100,
                depth: 45,
                shadow: true,
                center: ['50%', '50%']
            """),format.raw/*96.13*/("""}"""),format.raw/*96.14*/("""              

        """),format.raw/*98.9*/("""}"""),format.raw/*98.10*/(""",
        series: ["""),format.raw/*99.18*/("""{"""),format.raw/*99.19*/("""
            """),format.raw/*100.13*/("""name: 'serieDatos',
            data: [   
                ['Por atender', """),_display_(/*102.34*/rs1),format.raw/*102.37*/("""],
                ['Evaluaciones en proceso', """),_display_(/*103.46*/rs2),format.raw/*103.49*/("""],
                ['A revisar por el admin', """),_display_(/*104.45*/rs3),format.raw/*104.48*/("""],
                ['Evaluaciones con observaciones', """),_display_(/*105.53*/rs4),format.raw/*105.56*/("""],
                ['Evaluaciones concluidas', """),_display_(/*106.46*/rs5),format.raw/*106.49*/("""],                
                ['Cancelaciones',"""),_display_(/*107.35*/c400),format.raw/*107.39*/("""]

            ]
        """),format.raw/*110.9*/("""}"""),format.raw/*110.10*/("""],
        tooltip: """),format.raw/*111.18*/("""{"""),format.raw/*111.19*/("""
            """),format.raw/*112.13*/("""shared: true,
            useHTML: false,
            formatter: function() """),format.raw/*114.35*/("""{"""),format.raw/*114.36*/("""
            	"""),format.raw/*115.14*/("""return this.key+" : "+this.y;
            """),format.raw/*116.13*/("""}"""),format.raw/*116.14*/("""
            
        """),format.raw/*118.9*/("""}"""),format.raw/*118.10*/(""",
        credits: """),format.raw/*119.18*/("""{"""),format.raw/*119.19*/("""
            """),format.raw/*120.13*/("""position: """),format.raw/*120.23*/("""{"""),format.raw/*120.24*/("""
                """),format.raw/*121.17*/("""align: 'left',
                verticalAlign: 'bottom',
                x: -1000,
                y: -1000
            """),format.raw/*125.13*/("""}"""),format.raw/*125.14*/("""    
        """),format.raw/*126.9*/("""}"""),format.raw/*126.10*/("""
        
        
    """),format.raw/*129.5*/("""}"""),format.raw/*129.6*/(""");	
    
    

    
    
    
    
"""),format.raw/*137.1*/("""}"""),format.raw/*137.2*/(""");	
</script>

"""))}
  }

  def render(rs:Int,rs1:Int,rs2:Int,rs3:Int,rs4:Int,rs5:Int,c400:Int): play.twirl.api.HtmlFormat.Appendable = apply(rs,rs1,rs2,rs3,rs4,rs5,c400)

  def f:((Int,Int,Int,Int,Int,Int,Int) => play.twirl.api.HtmlFormat.Appendable) = (rs,rs1,rs2,rs3,rs4,rs5,c400) => apply(rs,rs1,rs2,rs3,rs4,rs5,c400)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/EvaluacionEvaluador/resumen.scala.html
                  HASH: bb799cb3f83e6c5f079983ce049cdef67b424f97
                  MATRIX: 766->1|925->84|957->108|1041->65|1069->162|1099->167|1110->171|1148->173|1176->175|1216->189|1230->195|1300->245|1356->275|1370->281|1443->334|1661->526|1691->535|1729->545|2304->1093|2327->1095|2478->1219|2502->1222|2649->1342|2673->1345|2704->1348|2860->1477|2884->1480|2915->1483|3072->1613|3096->1616|3126->1618|3268->1733|3292->1736|3448->1865|3473->1869|3897->2263|3927->2266|4001->2312|4030->2313|4062->2318|4117->2345|4146->2346|4182->2355|4217->2362|4246->2363|4287->2376|4351->2412|4380->2413|4425->2430|4506->2483|4535->2484|4571->2493|4600->2494|4645->2511|4674->2512|4715->2525|4759->2542|4788->2543|4836->2563|4865->2564|4906->2577|4950->2594|4979->2595|5025->2613|5054->2614|5095->2627|5145->2650|5174->2651|5225->2674|5254->2675|5295->2688|5328->2693|5357->2694|5402->2711|5554->2835|5583->2836|5634->2860|5663->2861|5710->2880|5739->2881|5781->2894|5885->2970|5910->2973|5986->3021|6011->3024|6086->3071|6111->3074|6194->3129|6219->3132|6295->3180|6320->3183|6401->3236|6427->3240|6480->3265|6510->3266|6559->3286|6589->3287|6631->3300|6736->3376|6766->3377|6809->3391|6880->3433|6910->3434|6960->3456|6990->3457|7038->3476|7068->3477|7110->3490|7149->3500|7179->3501|7225->3518|7373->3637|7403->3638|7444->3651|7474->3652|7525->3675|7554->3676|7617->3711|7646->3712
                  LINES: 26->1|28->3|28->3|29->1|30->3|33->6|33->6|33->6|34->7|34->7|34->7|34->7|35->8|35->8|35->8|43->16|43->16|44->17|55->28|55->28|58->31|58->31|61->34|61->34|61->34|64->37|64->37|64->37|67->40|67->40|67->40|70->43|70->43|73->46|73->46|95->68|98->71|99->72|99->72|100->73|100->73|100->73|101->74|101->74|101->74|102->75|103->76|103->76|104->77|106->79|106->79|107->80|107->80|108->81|108->81|109->82|110->83|110->83|111->84|111->84|112->85|113->86|113->86|114->87|114->87|115->88|116->89|116->89|117->90|117->90|118->91|118->91|118->91|119->92|123->96|123->96|125->98|125->98|126->99|126->99|127->100|129->102|129->102|130->103|130->103|131->104|131->104|132->105|132->105|133->106|133->106|134->107|134->107|137->110|137->110|138->111|138->111|139->112|141->114|141->114|142->115|143->116|143->116|145->118|145->118|146->119|146->119|147->120|147->120|147->120|148->121|152->125|152->125|153->126|153->126|156->129|156->129|164->137|164->137
                  -- GENERATED --
              */
          