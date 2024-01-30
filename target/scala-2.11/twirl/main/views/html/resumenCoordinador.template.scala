
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
object resumenCoordinador extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Map[String, Int],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registros:Map[String,Int]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main/*4.6*/ {_display_(Seq[Any](format.raw/*4.8*/("""
	
	"""),format.raw/*6.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*6.47*/routes/*6.53*/.Assets.at("stylesheets/seantheme.css")),format.raw/*6.92*/(""""/>
	<script src=""""),_display_(/*7.16*/routes/*7.22*/.Assets.at("javascripts/highcharts/highcharts.js")),format.raw/*7.72*/("""" ></script>		
	<script src=""""),_display_(/*8.16*/routes/*8.22*/.Assets.at("javascripts/highcharts/highcharts-3d.js")),format.raw/*8.75*/("""" ></script>

	<script src=""""),_display_(/*10.16*/routes/*10.22*/.Assets.at("javascripts/fullcalendar/moment.min.js")),format.raw/*10.74*/("""" ></script>

	<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Inicio</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Inicio</h3>
		        </div>
			</div>
			
"""),format.raw/*38.3*/("""			
			"""),format.raw/*39.4*/("""<div class="row">
				<div class="col-lg-9">
					<div class="row">
						<div class="col-lg-12">
							<div class="panel panel-default">
			                	<div class="panel-heading"><span class="glyphicon glyphicon-list-alt"></span>Estado de solicitudes de evaluación</div>
			               		<div class="panel-body">
			               		
			               			<div class="row">
			               				<div class="col-lg-4">
											<table class="table table-striped table-bordered table-responsive" id="tablaResumen">
												<tr>
													<td><a href="/recursos">Todas las solicitudes</a></td><td><div class="center-block"> """),_display_(/*51.100*/registros/*51.109*/.get("rs")),format.raw/*51.119*/("""</div> </td>
												</tr>		
												<tr>
													<td colspan="1"><a href="/recursos/observarList">Solicitudes por revisar</a></td><td><div class="center-block"> """),_display_(/*54.127*/registros/*54.136*/.get("rs1")),format.raw/*54.147*/("""</div> </td>
												</tr>		
												<tr>
													<td><a href="/recursos/reObservarList">Solicitudes con observaciones</a></td><td> """),_display_(/*57.97*/(registros.get("rs2")+registros.get("rs105"))),format.raw/*57.142*/("""   """),format.raw/*57.145*/("""</td>
												</tr>
												 <tr>
													<td><a href="/recursos/completoList">Solicitudes aceptadas</a></td><td> """),_display_(/*60.87*/registros/*60.96*/.get("rs3")),format.raw/*60.107*/("""  """),format.raw/*60.109*/("""</td>
												</tr>
												 <tr>
													<td><a href="/oficios">Solicitudes con oficio</a></td><td> """),_display_(/*63.74*/registros/*63.83*/.get("rs4")),format.raw/*63.94*/("""</td>
												</tr>		
												 <tr>
													<td><a href="/clasificacionList">Recursos clasificados</a></td><td> """),_display_(/*66.83*/registros/*66.92*/.get("rs5")),format.raw/*66.103*/("""</td>
												</tr>
												 <tr>
													<td><a href="/asignarEvaluadores">Evaluadores asignados</a></td><td> """),_display_(/*69.84*/registros/*69.93*/.get("rs6")),format.raw/*69.104*/("""</td>
												</tr>
												 <tr>
													<td><a href="/asignarEvaluadores">Evaluadores asignados (parcialmente)</a></td><td> """),_display_(/*72.99*/registros/*72.108*/.get("rs6p")),format.raw/*72.120*/("""</td>
												</tr>
"""),format.raw/*89.3*/("""												
												 """),format.raw/*90.14*/("""<tr>
													<td><a href="/listarOficioValoracion">Recursos con oficio de valoración</a></td><td> """),_display_(/*91.100*/registros/*91.109*/.get("rs110")),format.raw/*91.122*/("""</td>
												</tr>

												 <tr>
													<td><a href="/conEncuestasAceptadas">Evaluaciones con encuestas aceptadas</a></td><td> """),_display_(/*95.102*/registros/*95.111*/.get("rs12")),format.raw/*95.123*/("""</td>
												</tr>
												 <tr>
													<td><a href="/solicitudCanceladoList">Solicitudes de cancelación</a></td><td> """),_display_(/*98.93*/registros/*98.102*/.get("c0")),format.raw/*98.112*/("""</td>
												</tr>
												 <tr>
													<td><a href="/canceladoList">Canceladas</a></td><td> """),_display_(/*101.68*/(registros.get("c1")+registros.get("c2"))),format.raw/*101.109*/("""</td>
												</tr>												
											</table>
			               				</div>
			               				<div class="col-lg-8">
			               					<div>
			               						<div id="container"></div>
			               					</div>
			               				</div>
			               			</div>
							
								</div>
							</div>
						</div>
					</div>



					<div class="row">
						<div class="col-lg-12">
							<div class="panel panel-default">
			                	<div class="panel-heading"><span class="glyphicon glyphicon-list-alt"></span>Detalle de evaluaciones (por cada uno de los aspectos)</div>
			               		<div class="panel-body">
			               			<div class="row" style="">
					               		<div class="col-lg-4">
					               			<div>
					               			<div id="centrar" style="">
											<table class="table table-striped table-bordered table-responsive">
												 <tr>
													<td><a href="/mostrarEvaluacionesSinAtender/1">Evaluaciones sin atender</a></td><td> """),_display_(/*130.100*/registros/*130.109*/.get("ev1")),format.raw/*130.120*/("""</td>
												</tr>								
												 <tr>
													<td><a href="/mostrarEvaluacionesEnProceso/1">Evaluaciones en proceso</a></td><td> """),_display_(/*133.98*/registros/*133.107*/.get("ev2")),format.raw/*133.118*/("""</td>
												</tr>
												<tr>    	
													<td><a href="/mostrarEvaluacionesPorRevisar/1">Evaluaciones para revisión</a></td><td>"""),_display_(/*136.101*/registros/*136.110*/.get("ev3")),format.raw/*136.121*/("""</td>
												 </tr>
												 <tr>
													<td><a href="/mostrarEvaluacionesConObservaciones/1">Evaluaciones con observaciones</a></td><td> """),_display_(/*139.112*/registros/*139.121*/.get("ev4")),format.raw/*139.132*/("""</td>
												</tr>
												 <tr>
													<td><a href="/mostrarEvaluacionesConcluidas/1/lg">Evaluaciones concluidas (por cada uno de los aspectos)</a></td><td> """),_display_(/*142.133*/registros/*142.142*/.get("ev5")),format.raw/*142.153*/("""</td>
												</tr>
												 <tr>
													<td><a href="/mostrarEvaluacionesConcluidas/0/lg">Evaluaciones concluidas (los 4 aspectos)</a></td><td> """),_display_(/*145.119*/registros/*145.128*/.get("rs10")),format.raw/*145.140*/("""</td>
												</tr>
												
											</table>
											</div>
											</div>
										</div>
										<div class="col-lg-8">
											<div id="containerEvaluaciones"></div>
										</div>							
								</div>
							</div>
							</div>
						</div>
					</div>     


					<div class="row">
						<div class="col-lg-12">
							<div class="panel panel-default">
			                	<div class="panel-heading"><span class="glyphicon glyphicon-list-alt"></span>Detalle de cancelaciones</div>
			               		<div class="panel-body">
			               			<div class="row" style="">
					               		<div class="col-lg-4">
											<table class="table table-striped table-bordered table-responsive" >
													<tr>
														<td><a href=""""),_display_(/*171.29*/routes/*171.35*/.RecursoController.canceladosClasificacionList()),format.raw/*171.83*/("""">Canceladas en clasificación</a></td><td><div class="center-block"> """),_display_(/*171.153*/registros/*171.162*/.get("c1")),format.raw/*171.172*/("""</div> </td>
													<tr>
														<td><a href=""""),_display_(/*173.29*/routes/*173.35*/.RecursoController.canceladosEvaluacionList()),format.raw/*173.80*/("""">Canceladas en evaluación</a></td><td> """),_display_(/*173.121*/registros/*173.130*/.get("c2")),format.raw/*173.140*/("""</td>
													</tr>
													<tr>
														<td><a href="/solicitudCanceladoList">Solicitudes de cancelación</a></td><td> """),_display_(/*176.94*/registros/*176.103*/.get("c0")),format.raw/*176.113*/("""</td>
													</tr>
													
											</table>  					               		
					               		
					               		</div>
										<div class="col-lg-8">
											<div id="container2"></div>
										</div>						               		
				               		</div>
			               		</div>
		               		</div> 
	               		</div>
               		</div>


					<div class="row">
						<div class="col-lg-12">
							<div class="panel panel-default">
			                	<div class="panel-heading"><span class="glyphicon glyphicon-list-alt"></span>Comparativo Recursos cerrados vs encuestas</div>
			               		<div class="panel-body">
			               			<div class="row" style="">
					               		<div class="col-lg-4">
											<table class="table table-striped table-bordered table-responsive" >
													<tr>
														<td><a href="mostrarEvaluacionesConcluidas/0/lg">Evaluaciones concluidas</a></td><td><div class="center-block"> """),_display_(/*201.128*/registros/*201.137*/.get("rs10")),format.raw/*201.149*/("""</div> </td>
													<tr>
														<td><a href="/encuestasPorRevisarAdmin">Encuestas por revisar</a></td><td> """),_display_(/*203.91*/registros/*203.100*/.get("en1")),format.raw/*203.111*/("""</td>
													</tr>
													<tr>
														<td><a href="/conObservacionesList">Encuestas con observaciones</a></td><td> """),_display_(/*206.93*/registros/*206.102*/.get("en2")),format.raw/*206.113*/("""</td>
													</tr>
													<tr>
														<td><a href="/terminadasList">Encuestas terminadas</a></td><td> """),_display_(/*209.80*/registros/*209.89*/.get("en3")),format.raw/*209.100*/("""</td>
													</tr>
													
											</table>  					               		
					               		
					               		</div>
										<div class="col-lg-8">
											<div id="container3"></div>
										</div>						               		
				               		</div>
			               		</div>
		               		</div>
	               		</div>
               		</div>

					
				</div>	
				
				
				<aside class="col-lg-3">
					<div class="panel panel-default">
			         	<div class="panel-heading"><span class="fa fa-history"></span>Últimos 10 movimientos</div>

							<div id="log"></div>

			        	
			        </div>				
				</aside>
			</div>
    </div>
""")))}),format.raw/*239.2*/("""


"""),format.raw/*242.1*/("""<script type="text/javascript">
$(function () """),format.raw/*243.15*/("""{"""),format.raw/*243.16*/("""
    """),format.raw/*244.5*/("""$('#container').highcharts("""),format.raw/*244.32*/("""{"""),format.raw/*244.33*/("""
        """),format.raw/*245.9*/("""chart: """),format.raw/*245.16*/("""{"""),format.raw/*245.17*/("""
            """),format.raw/*246.13*/("""type: 'pie',
            options3d: """),format.raw/*247.24*/("""{"""),format.raw/*247.25*/("""
                """),format.raw/*248.17*/("""enabled: true,
                alpha: 45
            """),format.raw/*250.13*/("""}"""),format.raw/*250.14*/("""
        """),format.raw/*251.9*/("""}"""),format.raw/*251.10*/(""",
        title: """),format.raw/*252.16*/("""{"""),format.raw/*252.17*/("""
            """),format.raw/*253.13*/("""text: ''
        """),format.raw/*254.9*/("""}"""),format.raw/*254.10*/(""",
        subtitle: """),format.raw/*255.19*/("""{"""),format.raw/*255.20*/("""
            """),format.raw/*256.13*/("""text: ''
        """),format.raw/*257.9*/("""}"""),format.raw/*257.10*/(""",
        legend: """),format.raw/*258.17*/("""{"""),format.raw/*258.18*/("""
            """),format.raw/*259.13*/("""enabled: false
        """),format.raw/*260.9*/("""}"""),format.raw/*260.10*/(""",
        plotOptions: """),format.raw/*261.22*/("""{"""),format.raw/*261.23*/("""
            """),format.raw/*262.13*/("""pie: """),format.raw/*262.18*/("""{"""),format.raw/*262.19*/("""
                """),format.raw/*263.17*/("""innerSize: 100,
                depth: 45,
                shadow: false,
                center: ['50%', '50%']
            """),format.raw/*267.13*/("""}"""),format.raw/*267.14*/("""              

        """),format.raw/*269.9*/("""}"""),format.raw/*269.10*/(""",
        series: ["""),format.raw/*270.18*/("""{"""),format.raw/*270.19*/("""
            """),format.raw/*271.13*/("""name: 'serieDatos',
            data: [   
                ['Por revisar', """),_display_(/*273.34*/registros/*273.43*/.get("rs1")),format.raw/*273.54*/("""],
                ['Con observaciones', """),_display_(/*274.40*/registros/*274.49*/.get("rs2")),format.raw/*274.60*/("""],
                ['Solicitudes aceptadas', """),_display_(/*275.44*/registros/*275.53*/.get("rs3")),format.raw/*275.64*/("""],
                ['Con oficio', """),_display_(/*276.33*/registros/*276.42*/.get("rs4")),format.raw/*276.53*/("""],
                ['Clasificados', """),_display_(/*277.35*/registros/*277.44*/.get("rs5")),format.raw/*277.55*/("""],
                ['Evaluadores asignados', """),_display_(/*278.44*/registros/*278.53*/.get("rs6")),format.raw/*278.64*/("""],
                ['Evaluadores asignados parcialmente', """),_display_(/*279.57*/registros/*279.66*/.get("rs6p")),format.raw/*279.78*/("""],

                ['Evaluaciones en proceso', """),_display_(/*281.46*/registros/*281.55*/.get("rs7")),format.raw/*281.66*/("""],
                ['Evaluaciones para revisión', """),_display_(/*282.49*/registros/*282.58*/.get("rs8")),format.raw/*282.69*/("""],
                ['Evaluación con observaciones', """),_display_(/*283.51*/registros/*283.60*/.get("rs9")),format.raw/*283.71*/("""],
                ['Evaluación concluida', """),_display_(/*284.43*/registros/*284.52*/.get("rs10")),format.raw/*284.64*/("""],
                ['Con oficio de valoración', """),_display_(/*285.47*/registros/*285.56*/.get("rs110")),format.raw/*285.69*/("""],
            ]
        """),format.raw/*287.9*/("""}"""),format.raw/*287.10*/("""],
        tooltip: """),format.raw/*288.18*/("""{"""),format.raw/*288.19*/("""
            """),format.raw/*289.13*/("""shared: true,
            useHTML: false,
            formatter: function() """),format.raw/*291.35*/("""{"""),format.raw/*291.36*/("""
            	"""),format.raw/*292.14*/("""return this.key+" : "+this.y;
            """),format.raw/*293.13*/("""}"""),format.raw/*293.14*/("""
            
        """),format.raw/*295.9*/("""}"""),format.raw/*295.10*/(""",
        credits: """),format.raw/*296.18*/("""{"""),format.raw/*296.19*/("""
            """),format.raw/*297.13*/("""position: """),format.raw/*297.23*/("""{"""),format.raw/*297.24*/("""
                """),format.raw/*298.17*/("""align: 'left',
                verticalAlign: 'bottom',
                x: -1000,
                y: -1000
            """),format.raw/*302.13*/("""}"""),format.raw/*302.14*/("""    
        """),format.raw/*303.9*/("""}"""),format.raw/*303.10*/("""
        
        
    """),format.raw/*306.5*/("""}"""),format.raw/*306.6*/(""");	
    

    $('#containerEvaluaciones').highcharts("""),format.raw/*309.44*/("""{"""),format.raw/*309.45*/("""
        """),format.raw/*310.9*/("""chart: """),format.raw/*310.16*/("""{"""),format.raw/*310.17*/("""
            """),format.raw/*311.13*/("""type: 'pie',
            options3d: """),format.raw/*312.24*/("""{"""),format.raw/*312.25*/("""
                """),format.raw/*313.17*/("""enabled: true,
                alpha: 45
            """),format.raw/*315.13*/("""}"""),format.raw/*315.14*/("""
        """),format.raw/*316.9*/("""}"""),format.raw/*316.10*/(""",
        title: """),format.raw/*317.16*/("""{"""),format.raw/*317.17*/("""
            """),format.raw/*318.13*/("""text: ''
        """),format.raw/*319.9*/("""}"""),format.raw/*319.10*/(""",
        subtitle: """),format.raw/*320.19*/("""{"""),format.raw/*320.20*/("""
            """),format.raw/*321.13*/("""text: ''
        """),format.raw/*322.9*/("""}"""),format.raw/*322.10*/(""",
        legend: """),format.raw/*323.17*/("""{"""),format.raw/*323.18*/("""
            """),format.raw/*324.13*/("""enabled: false
        """),format.raw/*325.9*/("""}"""),format.raw/*325.10*/(""",
        plotOptions: """),format.raw/*326.22*/("""{"""),format.raw/*326.23*/("""
            """),format.raw/*327.13*/("""pie: """),format.raw/*327.18*/("""{"""),format.raw/*327.19*/("""
                """),format.raw/*328.17*/("""innerSize: 100,
                depth: 45,
                shadow: true,
                center: ['50%', '50%']
            """),format.raw/*332.13*/("""}"""),format.raw/*332.14*/("""              

        """),format.raw/*334.9*/("""}"""),format.raw/*334.10*/(""",
        series: ["""),format.raw/*335.18*/("""{"""),format.raw/*335.19*/("""
            """),format.raw/*336.13*/("""name: 'serieDatos',
            data: [   
                ['Evaluaciones sin atender', """),_display_(/*338.47*/registros/*338.56*/.get("ev1")),format.raw/*338.67*/("""],
                ['Evaluaciones en proceso', """),_display_(/*339.46*/registros/*339.55*/.get("ev2")),format.raw/*339.66*/("""],
                ['Evaluaciones para revisión', """),_display_(/*340.49*/registros/*340.58*/.get("ev3")),format.raw/*340.69*/("""],
                ['Evaluación con observaciones', """),_display_(/*341.51*/registros/*341.60*/.get("ev4")),format.raw/*341.71*/("""],
                ['Evaluación concluida', """),_display_(/*342.43*/registros/*342.52*/.get("ev5")),format.raw/*342.63*/("""]
            ]
        """),format.raw/*344.9*/("""}"""),format.raw/*344.10*/("""],
        tooltip: """),format.raw/*345.18*/("""{"""),format.raw/*345.19*/("""
            """),format.raw/*346.13*/("""shared: true,
            useHTML: false,
            formatter: function() """),format.raw/*348.35*/("""{"""),format.raw/*348.36*/("""
            	"""),format.raw/*349.14*/("""return this.key+" : "+this.y;
            """),format.raw/*350.13*/("""}"""),format.raw/*350.14*/("""
            
        """),format.raw/*352.9*/("""}"""),format.raw/*352.10*/(""",
        credits: """),format.raw/*353.18*/("""{"""),format.raw/*353.19*/("""
            """),format.raw/*354.13*/("""position: """),format.raw/*354.23*/("""{"""),format.raw/*354.24*/("""
                """),format.raw/*355.17*/("""align: 'left',
                verticalAlign: 'bottom',
                x: -1000,
                y: -1000
            """),format.raw/*359.13*/("""}"""),format.raw/*359.14*/("""    
        """),format.raw/*360.9*/("""}"""),format.raw/*360.10*/("""
        
        
    """),format.raw/*363.5*/("""}"""),format.raw/*363.6*/(""");	    
    
    
    if ("""),_display_(/*366.10*/registros/*366.19*/.get("c0")),format.raw/*366.29*/(""" """),format.raw/*366.30*/("""!= 0  || """),_display_(/*366.40*/registros/*366.49*/.get("c1")),format.raw/*366.59*/(""" """),format.raw/*366.60*/("""!= 0  || """),_display_(/*366.70*/registros/*366.79*/.get("c2")),format.raw/*366.89*/(""" """),format.raw/*366.90*/("""!=0)"""),format.raw/*366.94*/("""{"""),format.raw/*366.95*/("""    
	    """),format.raw/*367.6*/("""$('#container2').highcharts("""),format.raw/*367.34*/("""{"""),format.raw/*367.35*/("""
	        """),format.raw/*368.10*/("""chart: """),format.raw/*368.17*/("""{"""),format.raw/*368.18*/("""
	            """),format.raw/*369.14*/("""type: 'pie',
	            options3d: """),format.raw/*370.25*/("""{"""),format.raw/*370.26*/("""
	                """),format.raw/*371.18*/("""enabled: true,
	                alpha: 45
	            """),format.raw/*373.14*/("""}"""),format.raw/*373.15*/("""
	        """),format.raw/*374.10*/("""}"""),format.raw/*374.11*/(""",
	        title: """),format.raw/*375.17*/("""{"""),format.raw/*375.18*/("""
	            """),format.raw/*376.14*/("""text: ''
	        """),format.raw/*377.10*/("""}"""),format.raw/*377.11*/(""",
	        subtitle: """),format.raw/*378.20*/("""{"""),format.raw/*378.21*/("""
	            """),format.raw/*379.14*/("""text: ''
	        """),format.raw/*380.10*/("""}"""),format.raw/*380.11*/(""",
	        legend: """),format.raw/*381.18*/("""{"""),format.raw/*381.19*/("""
	            """),format.raw/*382.14*/("""enabled: false
	        """),format.raw/*383.10*/("""}"""),format.raw/*383.11*/(""",
	        plotOptions: """),format.raw/*384.23*/("""{"""),format.raw/*384.24*/("""
	            """),format.raw/*385.14*/("""pie: """),format.raw/*385.19*/("""{"""),format.raw/*385.20*/("""
	                """),format.raw/*386.18*/("""innerSize: 100,
	                depth: 45,
	                shadow: true,
	                center: ['50%', '50%']
	            """),format.raw/*390.14*/("""}"""),format.raw/*390.15*/("""              
	
	        """),format.raw/*392.10*/("""}"""),format.raw/*392.11*/(""",
	        series: ["""),format.raw/*393.19*/("""{"""),format.raw/*393.20*/("""
	            """),format.raw/*394.14*/("""name: 'serieDatos',
	            data: [   
	                ['Canceladas en clasificación', """),_display_(/*396.51*/registros/*396.60*/.get("c1")),format.raw/*396.70*/("""],
	                ['Canceladas en evaluación', """),_display_(/*397.48*/registros/*397.57*/.get("c2")),format.raw/*397.67*/("""],
	                ['Otras cancelaciones', """),_display_(/*398.43*/registros/*398.52*/.get("c0")),format.raw/*398.62*/("""]
	
	            ]
	        """),format.raw/*401.10*/("""}"""),format.raw/*401.11*/("""],
	        tooltip: """),format.raw/*402.19*/("""{"""),format.raw/*402.20*/("""
	            """),format.raw/*403.14*/("""shared: true,
	            useHTML: false,
	            formatter: function() """),format.raw/*405.36*/("""{"""),format.raw/*405.37*/("""
	            	"""),format.raw/*406.15*/("""return this.key+" : "+this.y;
	            """),format.raw/*407.14*/("""}"""),format.raw/*407.15*/("""
	            
	        """),format.raw/*409.10*/("""}"""),format.raw/*409.11*/(""",
	        credits: """),format.raw/*410.19*/("""{"""),format.raw/*410.20*/("""
	            """),format.raw/*411.14*/("""position: """),format.raw/*411.24*/("""{"""),format.raw/*411.25*/("""
	                """),format.raw/*412.18*/("""align: 'left',
	                verticalAlign: 'bottom',
	                x: -1000,
	                y: -1000
	            """),format.raw/*416.14*/("""}"""),format.raw/*416.15*/("""    
	        """),format.raw/*417.10*/("""}"""),format.raw/*417.11*/("""
	        
	        
	    """),format.raw/*420.6*/("""}"""),format.raw/*420.7*/(""");	    
    """),format.raw/*421.5*/("""}"""),format.raw/*421.6*/("""    
    
    """),format.raw/*423.5*/("""var chart = new Highcharts.Chart("""),format.raw/*423.38*/("""{"""),format.raw/*423.39*/("""
        """),format.raw/*424.9*/("""chart: """),format.raw/*424.16*/("""{"""),format.raw/*424.17*/("""
            """),format.raw/*425.13*/("""renderTo: 'container3',
            type: 'column',
            margin: 75,
            options3d: """),format.raw/*428.24*/("""{"""),format.raw/*428.25*/("""
                """),format.raw/*429.17*/("""enabled: true,
                alpha: 15,
                beta: 15,
                depth: 50,
                viewDistance: 25
            """),format.raw/*434.13*/("""}"""),format.raw/*434.14*/("""
        """),format.raw/*435.9*/("""}"""),format.raw/*435.10*/(""",
        title: """),format.raw/*436.16*/("""{"""),format.raw/*436.17*/("""
            """),format.raw/*437.13*/("""text: ''
        """),format.raw/*438.9*/("""}"""),format.raw/*438.10*/(""",
        subtitle: """),format.raw/*439.19*/("""{"""),format.raw/*439.20*/("""
            """),format.raw/*440.13*/("""text: ''
        """),format.raw/*441.9*/("""}"""),format.raw/*441.10*/(""",
        plotOptions: """),format.raw/*442.22*/("""{"""),format.raw/*442.23*/("""
            """),format.raw/*443.13*/("""column: """),format.raw/*443.21*/("""{"""),format.raw/*443.22*/("""
                """),format.raw/*444.17*/("""depth: 75
            """),format.raw/*445.13*/("""}"""),format.raw/*445.14*/("""
        """),format.raw/*446.9*/("""}"""),format.raw/*446.10*/(""",
        xAxis: """),format.raw/*447.16*/("""{"""),format.raw/*447.17*/("""
        	"""),format.raw/*448.10*/("""categories: ["Ev. concluidas", "Enc. por revisar", "Enc. con observaciones","Enc. terminadas"]
        """),format.raw/*449.9*/("""}"""),format.raw/*449.10*/(""",  
        yAxis:"""),format.raw/*450.15*/("""{"""),format.raw/*450.16*/("""
            """),format.raw/*451.13*/("""title: """),format.raw/*451.20*/("""{"""),format.raw/*451.21*/("""
                """),format.raw/*452.17*/("""text: null
            """),format.raw/*453.13*/("""}"""),format.raw/*453.14*/("""        	
        """),format.raw/*454.9*/("""}"""),format.raw/*454.10*/(""",
        series: ["""),format.raw/*455.18*/("""{"""),format.raw/*455.19*/("""
        	"""),format.raw/*456.10*/("""name: 'Recursos cerrados / Encuestas',
            data:  ["""),format.raw/*457.21*/("""{"""),format.raw/*457.22*/("""
                """),format.raw/*458.17*/("""name: 'Cerradas',                
                y: """),_display_(/*459.21*/registros/*459.30*/.get("rs10")),format.raw/*459.42*/("""
            """),format.raw/*460.13*/("""}"""),format.raw/*460.14*/(""", """),format.raw/*460.16*/("""{"""),format.raw/*460.17*/("""
                """),format.raw/*461.17*/("""name: 'Encuestas por revisar',
                y: """),_display_(/*462.21*/registros/*462.30*/.get("en1")),format.raw/*462.41*/("""
            """),format.raw/*463.13*/("""}"""),format.raw/*463.14*/(""","""),format.raw/*463.15*/("""{"""),format.raw/*463.16*/("""
                """),format.raw/*464.17*/("""name: 'Encuestas con observaciones',
                y: """),_display_(/*465.21*/registros/*465.30*/.get("en2")),format.raw/*465.41*/("""
            """),format.raw/*466.13*/("""}"""),format.raw/*466.14*/(""","""),format.raw/*466.15*/("""{"""),format.raw/*466.16*/("""
                """),format.raw/*467.17*/("""name: 'Encuestas terminadas',
                y: """),_display_(/*468.21*/registros/*468.30*/.get("en3")),format.raw/*468.41*/("""
            """),format.raw/*469.13*/("""}"""),format.raw/*469.14*/("""]
        """),format.raw/*470.9*/("""}"""),format.raw/*470.10*/("""],
        credits: """),format.raw/*471.18*/("""{"""),format.raw/*471.19*/("""
            """),format.raw/*472.13*/("""position: """),format.raw/*472.23*/("""{"""),format.raw/*472.24*/("""
                """),format.raw/*473.17*/("""align: 'left',
                verticalAlign: 'bottom',
                x: -1000,
                y: -1000
            """),format.raw/*477.13*/("""}"""),format.raw/*477.14*/("""     
        """),format.raw/*478.9*/("""}"""),format.raw/*478.10*/(""",
        legend: """),format.raw/*479.17*/("""{"""),format.raw/*479.18*/("""
        	"""),format.raw/*480.10*/("""enable: true
        """),format.raw/*481.9*/("""}"""),format.raw/*481.10*/("""
    """),format.raw/*482.5*/("""}"""),format.raw/*482.6*/(""");  
    
    
    
	
	//Actualiza la info de 'movimientos recientes'
    actualiza();
    setInterval(actualiza, 60000);    
"""),format.raw/*490.1*/("""}"""),format.raw/*490.2*/(""");



	function actualiza()"""),format.raw/*494.22*/("""{"""),format.raw/*494.23*/("""
		"""),format.raw/*495.3*/("""$f = LlamadaActualiza();
		 $.when($f).done(
				function()"""),format.raw/*497.15*/("""{"""),format.raw/*497.16*/("""
					"""),format.raw/*498.6*/("""$("[name='dt']").each(function(d)"""),format.raw/*498.39*/("""{"""),format.raw/*498.40*/("""
						"""),format.raw/*499.7*/("""aux = moment($(this).html(),  "DD/MM/YYYY HH:mm:ss"  );
						diferencia = moment().diff(aux);
						$("#dif"+$(this).attr("id").substr(2)).html(  moment().diff(  aux,'seconds'  ) +' segundos'  );
						if (diferencia >= 60000)"""),format.raw/*502.31*/("""{"""),format.raw/*502.32*/("""
							"""),format.raw/*503.8*/("""$("#dif"+$(this).attr("id").substr(2)).html(  moment().diff(  aux , 'minutes' ) +' minutos'  );
						"""),format.raw/*504.7*/("""}"""),format.raw/*504.8*/("""
						"""),format.raw/*505.7*/("""if (diferencia >= 3600000)"""),format.raw/*505.33*/("""{"""),format.raw/*505.34*/("""
							"""),format.raw/*506.8*/("""$("#dif"+$(this).attr("id").substr(2)).html(  moment().diff(  aux , 'hours' ) +' horas'  );
						"""),format.raw/*507.7*/("""}"""),format.raw/*507.8*/("""
						"""),format.raw/*508.7*/("""if (diferencia >= 86400000)"""),format.raw/*508.34*/("""{"""),format.raw/*508.35*/("""
							"""),format.raw/*509.8*/("""$("#dif"+$(this).attr("id").substr(2)).html(  moment().diff(  aux , 'days' ) +' días'  );
						"""),format.raw/*510.7*/("""}"""),format.raw/*510.8*/("""					 
				 	"""),format.raw/*511.7*/("""}"""),format.raw/*511.8*/(""");
		 		"""),format.raw/*512.6*/("""}"""),format.raw/*512.7*/("""
		 """),format.raw/*513.4*/(""");
		
		
	"""),format.raw/*516.2*/("""}"""),format.raw/*516.3*/("""

	
	"""),format.raw/*519.2*/("""function LlamadaActualiza()"""),format.raw/*519.29*/("""{"""),format.raw/*519.30*/("""
		 """),format.raw/*520.4*/("""var d = $.Deferred();
	    	$.ajax("""),format.raw/*521.14*/("""{"""),format.raw/*521.15*/("""
	            """),format.raw/*522.14*/("""method: "GET",
	            url: "/ajaxActualizaLog/10"
	      """),format.raw/*524.8*/("""}"""),format.raw/*524.9*/(""")
	      .success(function( data ) """),format.raw/*525.34*/("""{"""),format.raw/*525.35*/("""
	    	  """),format.raw/*526.9*/("""console.dir(JSON.parse(data))
	    	  var cadena ="";
	    	  for(s=0; s<JSON.parse(data).length; s++ )"""),format.raw/*528.50*/("""{"""),format.raw/*528.51*/("""
	    		  """),format.raw/*529.10*/("""var obj = JSON.parse(data)[s];
	  	 		if(obj.tipo=="e")"""),format.raw/*530.25*/("""{"""),format.raw/*530.26*/("""
		  	 		"""),format.raw/*531.9*/("""cadena +="<div class='widget widget-stats bg-blue-lighter' >";
		  	 		cadena +="<small id='dif"+obj.consecutivo+"' class='pull-right ml'></small>";
		  	 		cadena +="<small id='dt"+obj.consecutivo+"' name='dt'>"+obj.auditinsert+"</small>";
		  	 		cadena +="    <div class='stats-icon stats-icon-sm'><i class='fa fa fa-file-text-o fa-fw'></i></div>";
		  	 		cadena +="    <p>"+obj.numerocontrol+"</p>";
		  	 		cadena +="    <p>"+obj.recurso+"</p>";
		  	 		cadena +="Estado: "+obj.estado;
		  	 		cadena +="</div>";
	  	 		"""),format.raw/*539.8*/("""}"""),format.raw/*539.9*/("""
	  		 	"""),format.raw/*540.8*/("""if(obj.tipo=="ev")"""),format.raw/*540.26*/("""{"""),format.raw/*540.27*/("""
					"""),format.raw/*541.6*/("""cadena+="<div class='widget widget-stats bg-aqua-lighter'>";
					cadena+="<small id='dif"+obj.consecutivo+"' class='pull-right ml'></small>";
					cadena+="<small id='dt"+obj.consecutivo+"' name='dt'>"+obj.auditinsert+"</small>";
			        cadena+="<div class='stats-icon stats-icon-sm'><i class='fa fa-list-alt fa-fw'></i></div>";
			        cadena+="<p>"+obj.numerocontrol+"</p>";
					cadena+="Estado evaluación: "+obj.estadoevaluacion
					cadena+="</div>";
				"""),format.raw/*548.5*/("""}"""),format.raw/*548.6*/("""
	  	 		"""),format.raw/*549.8*/("""if(obj.tipo=="en")"""),format.raw/*549.26*/("""{"""),format.raw/*549.27*/("""
					"""),format.raw/*550.6*/("""cadena+="<div class='widget widget-stats bg-purple-lighter'>";
					cadena+="<small id='dif"+obj.consecutivo+"' class='pull-right ml'></small>";
	 				cadena+="<small id='dt"+obj.consecutivo+"' name='dt'>"+obj.auditinsert+"</small>";
			        cadena+="<div class='stats-icon stats-icon-sm'><i class='fa fa-check-square-o fa-fw'></i></div>";
			        cadena+="<p>"+obj.numerocontrol+"</p>";
	 				cadena+="Estado encuesta: "+obj.estadoencuesta;		
	 				cadena+="</div>";
				"""),format.raw/*557.5*/("""}"""),format.raw/*557.6*/("""	  		 	
	    	"""),format.raw/*558.7*/("""}"""),format.raw/*558.8*/("""
	  	    """),format.raw/*559.9*/("""$( this ).addClass( "done" );
	  	 	$("#log").html(cadena);
	  	 	d.resolve();
	      """),format.raw/*562.8*/("""}"""),format.raw/*562.9*/(""")
	      .error(function(data)"""),format.raw/*563.29*/("""{"""),format.raw/*563.30*/("""
	          """),format.raw/*564.12*/("""alert("error ajax");
	          d.reject;
	      """),format.raw/*566.8*/("""}"""),format.raw/*566.9*/("""); 	
	    	return d.promise();
	"""),format.raw/*568.2*/("""}"""),format.raw/*568.3*/("""

"""),format.raw/*570.1*/("""</script>
<script src=""""),_display_(/*571.15*/routes/*571.21*/.Assets.at("javascripts/utilerias.js")),format.raw/*571.59*/(""""></script>
"""))}
  }

  def render(registros:Map[String, Int]): play.twirl.api.HtmlFormat.Appendable = apply(registros)

  def f:((Map[String, Int]) => play.twirl.api.HtmlFormat.Appendable) = (registros) => apply(registros)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/resumenCoordinador.scala.html
                  HASH: 257de2e585d21a1f3368d6ddbac139a2f37962ae
                  MATRIX: 746->1|876->28|903->46|930->48|941->52|979->54|1009->58|1080->103|1094->109|1153->148|1198->167|1212->173|1282->223|1338->253|1352->259|1425->312|1481->341|1496->347|1569->399|1933->1149|1967->1156|2636->1797|2655->1806|2687->1816|2891->1992|2910->2001|2943->2012|3116->2158|3183->2203|3215->2206|3370->2334|3388->2343|3421->2354|3452->2356|3594->2471|3612->2480|3644->2491|3797->2617|3815->2626|3848->2637|4000->2762|4018->2771|4051->2782|4218->2922|4237->2931|4271->2943|4322->3653|4376->3679|4508->3783|4527->3792|4562->3805|4734->3949|4753->3958|4787->3970|4948->4104|4967->4113|4999->4123|5136->4232|5200->4273|6257->5301|6277->5310|6311->5321|6486->5468|6506->5477|6540->5488|6715->5634|6735->5643|6769->5654|6952->5808|6972->5817|7006->5828|7209->6002|7229->6011|7263->6022|7452->6182|7472->6191|7507->6203|8313->6981|8329->6987|8399->7035|8498->7105|8518->7114|8551->7124|8638->7183|8654->7189|8721->7234|8791->7275|8811->7284|8844->7294|9008->7430|9028->7439|9061->7449|10073->8432|10093->8441|10128->8453|10277->8574|10297->8583|10331->8594|10494->8729|10514->8738|10548->8749|10698->8871|10717->8880|10751->8891|11460->9569|11491->9572|11566->9618|11596->9619|11629->9624|11685->9651|11715->9652|11752->9661|11788->9668|11818->9669|11860->9682|11925->9718|11955->9719|12001->9736|12083->9789|12113->9790|12150->9799|12180->9800|12226->9817|12256->9818|12298->9831|12343->9848|12373->9849|12422->9869|12452->9870|12494->9883|12539->9900|12569->9901|12616->9919|12646->9920|12688->9933|12739->9956|12769->9957|12821->9980|12851->9981|12893->9994|12927->9999|12957->10000|13003->10017|13157->10142|13187->10143|13239->10167|13269->10168|13317->10187|13347->10188|13389->10201|13493->10277|13512->10286|13545->10297|13615->10339|13634->10348|13667->10359|13741->10405|13760->10414|13793->10425|13856->10460|13875->10469|13908->10480|13973->10517|13992->10526|14025->10537|14099->10583|14118->10592|14151->10603|14238->10662|14257->10671|14291->10683|14368->10732|14387->10741|14420->10752|14499->10803|14518->10812|14551->10823|14632->10876|14651->10885|14684->10896|14757->10941|14776->10950|14810->10962|14887->11011|14906->11020|14941->11033|14994->11058|15024->11059|15073->11079|15103->11080|15145->11093|15250->11169|15280->11170|15323->11184|15394->11226|15424->11227|15474->11249|15504->11250|15552->11269|15582->11270|15624->11283|15663->11293|15693->11294|15739->11311|15887->11430|15917->11431|15958->11444|15988->11445|16039->11468|16068->11469|16150->11522|16180->11523|16217->11532|16253->11539|16283->11540|16325->11553|16390->11589|16420->11590|16466->11607|16548->11660|16578->11661|16615->11670|16645->11671|16691->11688|16721->11689|16763->11702|16808->11719|16838->11720|16887->11740|16917->11741|16959->11754|17004->11771|17034->11772|17081->11790|17111->11791|17153->11804|17204->11827|17234->11828|17286->11851|17316->11852|17358->11865|17392->11870|17422->11871|17468->11888|17621->12012|17651->12013|17703->12037|17733->12038|17781->12057|17811->12058|17853->12071|17970->12160|17989->12169|18022->12180|18098->12228|18117->12237|18150->12248|18229->12299|18248->12308|18281->12319|18362->12372|18381->12381|18414->12392|18487->12437|18506->12446|18539->12457|18591->12481|18621->12482|18670->12502|18700->12503|18742->12516|18847->12592|18877->12593|18920->12607|18991->12649|19021->12650|19071->12672|19101->12673|19149->12692|19179->12693|19221->12706|19260->12716|19290->12717|19336->12734|19484->12853|19514->12854|19555->12867|19585->12868|19636->12891|19665->12892|19720->12919|19739->12928|19771->12938|19801->12939|19839->12949|19858->12958|19890->12968|19920->12969|19958->12979|19977->12988|20009->12998|20039->12999|20072->13003|20102->13004|20140->13014|20197->13042|20227->13043|20266->13053|20302->13060|20332->13061|20375->13075|20441->13112|20471->13113|20518->13131|20602->13186|20632->13187|20671->13197|20701->13198|20748->13216|20778->13217|20821->13231|20868->13249|20898->13250|20948->13271|20978->13272|21021->13286|21068->13304|21098->13305|21146->13324|21176->13325|21219->13339|21272->13363|21302->13364|21355->13388|21385->13389|21428->13403|21462->13408|21492->13409|21539->13427|21696->13555|21726->13556|21781->13582|21811->13583|21860->13603|21890->13604|21933->13618|22055->13712|22074->13721|22106->13731|22184->13781|22203->13790|22235->13800|22308->13845|22327->13854|22359->13864|22416->13892|22446->13893|22496->13914|22526->13915|22569->13929|22676->14007|22706->14008|22750->14023|22822->14066|22852->14067|22905->14091|22935->14092|22984->14112|23014->14113|23057->14127|23096->14137|23126->14138|23173->14156|23325->14279|23355->14280|23398->14294|23428->14295|23482->14321|23511->14322|23551->14334|23580->14335|23622->14349|23684->14382|23714->14383|23751->14392|23787->14399|23817->14400|23859->14413|23987->14512|24017->14513|24063->14530|24232->14670|24262->14671|24299->14680|24329->14681|24375->14698|24405->14699|24447->14712|24492->14729|24522->14730|24571->14750|24601->14751|24643->14764|24688->14781|24718->14782|24770->14805|24800->14806|24842->14819|24879->14827|24909->14828|24955->14845|25006->14867|25036->14868|25073->14877|25103->14878|25149->14895|25179->14896|25218->14906|25349->15009|25379->15010|25426->15028|25456->15029|25498->15042|25534->15049|25564->15050|25610->15067|25662->15090|25692->15091|25738->15109|25768->15110|25816->15129|25846->15130|25885->15140|25973->15199|26003->15200|26049->15217|26131->15271|26150->15280|26184->15292|26226->15305|26256->15306|26287->15308|26317->15309|26363->15326|26442->15377|26461->15386|26494->15397|26536->15410|26566->15411|26596->15412|26626->15413|26672->15430|26757->15487|26776->15496|26809->15507|26851->15520|26881->15521|26911->15522|26941->15523|26987->15540|27065->15590|27084->15599|27117->15610|27159->15623|27189->15624|27227->15634|27257->15635|27306->15655|27336->15656|27378->15669|27417->15679|27447->15680|27493->15697|27641->15816|27671->15817|27713->15831|27743->15832|27790->15850|27820->15851|27859->15861|27908->15882|27938->15883|27971->15888|28000->15889|28154->16015|28183->16016|28239->16043|28269->16044|28300->16047|28388->16106|28418->16107|28452->16113|28514->16146|28544->16147|28579->16154|28835->16381|28865->16382|28901->16390|29031->16492|29060->16493|29095->16500|29150->16526|29180->16527|29216->16535|29342->16633|29371->16634|29406->16641|29462->16668|29492->16669|29528->16677|29652->16773|29681->16774|29722->16787|29751->16788|29787->16796|29816->16797|29848->16801|29886->16811|29915->16812|29948->16817|30004->16844|30034->16845|30066->16849|30130->16884|30160->16885|30203->16899|30294->16962|30323->16963|30387->16998|30417->16999|30454->17008|30586->17111|30616->17112|30655->17122|30739->17177|30769->17178|30806->17187|31360->17713|31389->17714|31425->17722|31472->17740|31502->17741|31536->17747|32032->18215|32061->18216|32097->18224|32144->18242|32174->18243|32208->18249|32714->18727|32743->18728|32785->18742|32814->18743|32851->18752|32965->18838|32994->18839|33053->18869|33083->18870|33124->18882|33201->18931|33230->18932|33290->18964|33319->18965|33349->18967|33401->18991|33417->18997|33477->19035
                  LINES: 26->1|29->1|30->3|31->4|31->4|31->4|33->6|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|37->10|37->10|37->10|53->38|54->39|66->51|66->51|66->51|69->54|69->54|69->54|72->57|72->57|72->57|75->60|75->60|75->60|75->60|78->63|78->63|78->63|81->66|81->66|81->66|84->69|84->69|84->69|87->72|87->72|87->72|89->89|90->90|91->91|91->91|91->91|95->95|95->95|95->95|98->98|98->98|98->98|101->101|101->101|130->130|130->130|130->130|133->133|133->133|133->133|136->136|136->136|136->136|139->139|139->139|139->139|142->142|142->142|142->142|145->145|145->145|145->145|171->171|171->171|171->171|171->171|171->171|171->171|173->173|173->173|173->173|173->173|173->173|173->173|176->176|176->176|176->176|201->201|201->201|201->201|203->203|203->203|203->203|206->206|206->206|206->206|209->209|209->209|209->209|239->239|242->242|243->243|243->243|244->244|244->244|244->244|245->245|245->245|245->245|246->246|247->247|247->247|248->248|250->250|250->250|251->251|251->251|252->252|252->252|253->253|254->254|254->254|255->255|255->255|256->256|257->257|257->257|258->258|258->258|259->259|260->260|260->260|261->261|261->261|262->262|262->262|262->262|263->263|267->267|267->267|269->269|269->269|270->270|270->270|271->271|273->273|273->273|273->273|274->274|274->274|274->274|275->275|275->275|275->275|276->276|276->276|276->276|277->277|277->277|277->277|278->278|278->278|278->278|279->279|279->279|279->279|281->281|281->281|281->281|282->282|282->282|282->282|283->283|283->283|283->283|284->284|284->284|284->284|285->285|285->285|285->285|287->287|287->287|288->288|288->288|289->289|291->291|291->291|292->292|293->293|293->293|295->295|295->295|296->296|296->296|297->297|297->297|297->297|298->298|302->302|302->302|303->303|303->303|306->306|306->306|309->309|309->309|310->310|310->310|310->310|311->311|312->312|312->312|313->313|315->315|315->315|316->316|316->316|317->317|317->317|318->318|319->319|319->319|320->320|320->320|321->321|322->322|322->322|323->323|323->323|324->324|325->325|325->325|326->326|326->326|327->327|327->327|327->327|328->328|332->332|332->332|334->334|334->334|335->335|335->335|336->336|338->338|338->338|338->338|339->339|339->339|339->339|340->340|340->340|340->340|341->341|341->341|341->341|342->342|342->342|342->342|344->344|344->344|345->345|345->345|346->346|348->348|348->348|349->349|350->350|350->350|352->352|352->352|353->353|353->353|354->354|354->354|354->354|355->355|359->359|359->359|360->360|360->360|363->363|363->363|366->366|366->366|366->366|366->366|366->366|366->366|366->366|366->366|366->366|366->366|366->366|366->366|366->366|366->366|367->367|367->367|367->367|368->368|368->368|368->368|369->369|370->370|370->370|371->371|373->373|373->373|374->374|374->374|375->375|375->375|376->376|377->377|377->377|378->378|378->378|379->379|380->380|380->380|381->381|381->381|382->382|383->383|383->383|384->384|384->384|385->385|385->385|385->385|386->386|390->390|390->390|392->392|392->392|393->393|393->393|394->394|396->396|396->396|396->396|397->397|397->397|397->397|398->398|398->398|398->398|401->401|401->401|402->402|402->402|403->403|405->405|405->405|406->406|407->407|407->407|409->409|409->409|410->410|410->410|411->411|411->411|411->411|412->412|416->416|416->416|417->417|417->417|420->420|420->420|421->421|421->421|423->423|423->423|423->423|424->424|424->424|424->424|425->425|428->428|428->428|429->429|434->434|434->434|435->435|435->435|436->436|436->436|437->437|438->438|438->438|439->439|439->439|440->440|441->441|441->441|442->442|442->442|443->443|443->443|443->443|444->444|445->445|445->445|446->446|446->446|447->447|447->447|448->448|449->449|449->449|450->450|450->450|451->451|451->451|451->451|452->452|453->453|453->453|454->454|454->454|455->455|455->455|456->456|457->457|457->457|458->458|459->459|459->459|459->459|460->460|460->460|460->460|460->460|461->461|462->462|462->462|462->462|463->463|463->463|463->463|463->463|464->464|465->465|465->465|465->465|466->466|466->466|466->466|466->466|467->467|468->468|468->468|468->468|469->469|469->469|470->470|470->470|471->471|471->471|472->472|472->472|472->472|473->473|477->477|477->477|478->478|478->478|479->479|479->479|480->480|481->481|481->481|482->482|482->482|490->490|490->490|494->494|494->494|495->495|497->497|497->497|498->498|498->498|498->498|499->499|502->502|502->502|503->503|504->504|504->504|505->505|505->505|505->505|506->506|507->507|507->507|508->508|508->508|508->508|509->509|510->510|510->510|511->511|511->511|512->512|512->512|513->513|516->516|516->516|519->519|519->519|519->519|520->520|521->521|521->521|522->522|524->524|524->524|525->525|525->525|526->526|528->528|528->528|529->529|530->530|530->530|531->531|539->539|539->539|540->540|540->540|540->540|541->541|548->548|548->548|549->549|549->549|549->549|550->550|557->557|557->557|558->558|558->558|559->559|562->562|562->562|563->563|563->563|564->564|566->566|566->566|568->568|568->568|570->570|571->571|571->571|571->571
                  -- GENERATED --
              */
          