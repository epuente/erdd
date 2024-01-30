
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Recurso,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recurso:Recurso):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.19*/("""

"""),format.raw/*3.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*3.46*/routes/*3.52*/.Assets.at("stylesheets/timeline.css")),format.raw/*3.90*/(""""/>
"""),_display_(/*5.2*/main/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""


"""),format.raw/*8.1*/("""<style>
.glyphicon"""),format.raw/*9.11*/("""{"""),format.raw/*9.12*/("""
	"""),format.raw/*10.2*/("""top: 16px;
	left: 15px;
"""),format.raw/*12.1*/("""}"""),format.raw/*12.2*/("""

"""),format.raw/*14.1*/(""".btn-glyphicon """),format.raw/*14.16*/("""{"""),format.raw/*14.17*/("""
    """),format.raw/*15.5*/("""padding:8px;
    background:#ffffff;
    margin-right:4px;
	top: 0px;
	left: 0px;    
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""
"""),format.raw/*21.1*/(""".icon-btn """),format.raw/*21.11*/("""{"""),format.raw/*21.12*/("""
    """),format.raw/*22.5*/("""padding: 1px 15px 3px 2px;
    border-radius:50px;
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/("""
"""),format.raw/*25.1*/("""</style>


<div class=container-fluid style="background-color: white; padding: 10px;">

    <div class="page-header">
        <h1 id="timeline">Seguimiento</h1>
    </div>    
    """),_display_(/*33.6*/flashes()),format.raw/*33.15*/("""

	"""),format.raw/*35.2*/("""<div class="row">
		<div class="col-md-1"></div>
		<div class="col-md-10">
				<ul class="timeline">     
				    """),_display_(/*39.10*/for((estado,i)<-recurso.historialestados.zipWithIndex) yield /*39.64*/{_display_(Seq[Any](format.raw/*39.65*/("""			        
				          """),_display_(/*40.16*/if( (i % 2) != 0)/*40.33*/{_display_(Seq[Any](format.raw/*40.34*/("""
				          	"""),format.raw/*41.16*/("""<li class="timeline-inverted">
				          """)))}/*42.17*/else/*42.22*/{_display_(Seq[Any](format.raw/*42.23*/("""
				          	"""),format.raw/*43.16*/("""<li>
				          """)))}),format.raw/*44.16*/("""
				          
							"""),_display_(/*46.9*/estado/*46.15*/.estado.id.toInt/*46.31*/ match/*46.37*/ {/*47.10*/case 2 =>/*47.19*/{_display_(Seq[Any](format.raw/*47.20*/("""							  					
										"""),format.raw/*48.11*/("""<div class="timeline-badge info"><i class="glyphicon glyphicon-eye-open"></i>
						  				""")))}/*50.10*/case 12 =>/*50.20*/{_display_(Seq[Any](format.raw/*50.21*/("""							  					
										"""),format.raw/*51.11*/("""<div class="timeline-badge info"><i class="glyphicon glyphicon-certificate"></i>
						  				""")))}/*53.10*/case 400  =>/*53.22*/ {_display_(Seq[Any](format.raw/*53.24*/("""
							  					"""),format.raw/*54.15*/("""<div class="timeline-badge warning"><i class="glyphicon glyphicon-warning-sign"></i>
							  				""")))}/*56.10*/case 401  =>/*56.22*/ {_display_(Seq[Any](format.raw/*56.24*/("""<div class="timeline-badge danger"><i class="glyphicon glyphicon-remove"></i>""")))}/*57.10*/case 402  =>/*57.22*/ {_display_(Seq[Any](format.raw/*57.24*/("""<div class="timeline-badge danger"><i class="glyphicon glyphicon-remove"></i>""")))}/*58.10*/case whoa  =>/*58.23*/ {_display_(Seq[Any](format.raw/*58.25*/("""<div class="timeline-badge success"><i class="glyphicon glyphicon-ok"></i>""")))}}),format.raw/*59.9*/("""          
				          """),format.raw/*60.15*/("""</div>
				          <div class="timeline-panel">
				            <div class="timeline-heading">
				              <h4 class="timeline-title">"""),_display_(/*63.47*/estado/*63.53*/.estado.descripcion),format.raw/*63.72*/("""</h4>
				              <p><small class="text-muted"><i class="fa fa-calendar"></i> """),_display_(/*64.80*/estado/*64.86*/.auditinsert.format("dd/MM/yyyy HH:mm:ss")),format.raw/*64.128*/("""</small></p>
				            </div>
				            <div class="timeline-body">
				            	"""),_display_(/*67.19*/if(estado.estado.id == 1 )/*67.45*/{_display_(Seq[Any](format.raw/*67.46*/("""
				            		"""),format.raw/*68.19*/("""<hr>
				            		<p style="font-size: small;">
				            		Título: """),_display_(/*70.28*/estado/*70.34*/.recurso.titulo),format.raw/*70.49*/("""<br>
				            		Clave de control: """),_display_(/*71.38*/estado/*71.44*/.recurso.numcontrol),format.raw/*71.63*/("""<br>
				            		Autor responsable: """),_display_(/*72.39*/estado/*72.45*/.recurso.getResponsable.nombreCompleto),format.raw/*72.83*/("""
				            		"""),format.raw/*73.19*/("""</p>
				            		"""),_display_(/*74.20*/if(estado.recurso.estado.id == 1)/*74.53*/{_display_(Seq[Any](format.raw/*74.54*/("""
				            			"""),_display_(/*75.21*/form(   routes.RecursoWebController.verDatosEnviados(), 'role -> "form")/*75.93*/ {_display_(Seq[Any](format.raw/*75.95*/("""
				            				"""),format.raw/*76.21*/("""<input class="btn btn-primary center-block btn-block" type="submit" value="Ver datos enviados">
				            			""")))}),format.raw/*77.21*/("""
				            		""")))}),format.raw/*78.20*/("""
				            	""")))}),format.raw/*79.19*/("""
				            	"""),format.raw/*80.89*/("""
				            	"""),_display_(/*81.19*/if(estado.estado.id == 2)/*81.44*/{_display_(Seq[Any](format.raw/*81.45*/("""
				            		"""),format.raw/*82.19*/("""<hr>
				            		"""),_display_(/*83.20*/if(estado.recurso.estado.id == 2)/*83.53*/{_display_(Seq[Any](format.raw/*83.54*/("""
					            		"""),_display_(/*84.21*/form(   routes.RecursoWebController.conObservacionesAn(), 'role -> "form")/*84.95*/ {_display_(Seq[Any](format.raw/*84.97*/("""	
					            			"""),format.raw/*85.21*/("""<input class="btn btn-danger center-block btn-block" type="submit" value="Corrija las observaciones y envíe">
					            		""")))}),format.raw/*86.21*/("""
				            		""")))}),format.raw/*87.20*/("""
				            	""")))}),format.raw/*88.19*/("""				            	
				            	"""),_display_(/*89.19*/if(estado.estado.id >= 3 && estado.estado.id != 105)/*89.71*/{_display_(Seq[Any](format.raw/*89.72*/("""
					            	"""),_display_(/*90.20*/if(estado.recurso.estado.id >= 3)/*90.53*/{_display_(Seq[Any](format.raw/*90.54*/("""
					            		"""),format.raw/*91.20*/("""<div name="divImpSol">
						            		<hr>					            		
						            		"""),_display_(/*93.22*/form(  routes.RecursoWebController.imprimirSolicitudAceptada, 'role -> "form" )/*93.101*/ {_display_(Seq[Any](format.raw/*93.103*/("""	
						            			"""),format.raw/*94.22*/("""<input class="btn btn-success center-block btn-block"  type="submit" value="Ver e imprimir formato">
						            		""")))}),format.raw/*95.22*/("""
				            			"""),format.raw/*96.20*/("""</div>
					            	""")))}),format.raw/*97.20*/("""
				            	""")))}),format.raw/*98.19*/("""
				            	"""),_display_(/*99.19*/if(estado.estado.id == 4 )/*99.45*/{_display_(Seq[Any](format.raw/*99.46*/("""
				            		"""),format.raw/*100.19*/("""<hr>
				            		<p style="font-size: small;">
					            		Número de oficio: """),_display_(/*102.39*/estado/*102.45*/.recurso.oficio.numero),format.raw/*102.67*/("""<br>
					            		Número de folio: """),_display_(/*103.38*/estado/*103.44*/.recurso.oficio.folio),format.raw/*103.65*/("""
				            		"""),format.raw/*104.19*/("""</p>
				            	""")))}),format.raw/*105.19*/("""
				            	"""),_display_(/*106.19*/if(estado.estado.id == 5 )/*106.45*/{_display_(Seq[Any](format.raw/*106.46*/("""
				            		"""),format.raw/*107.19*/("""<hr>
				            		<p style="font-size: small;">
					            		Clasificación: """),_display_(/*109.36*/estado/*109.42*/.recurso.clasificacion.nombreCompletoClasificacion),format.raw/*109.92*/("""<br>
					            		"""),_display_(/*110.21*/if(estado.recurso.clasificacion.tiporecurso != null)/*110.73*/{_display_(Seq[Any](format.raw/*110.74*/("""
					            			"""),format.raw/*111.21*/("""Tipo de recurso: """),_display_(/*111.39*/estado/*111.45*/.recurso.clasificacion.tiporecurso.descripcion),format.raw/*111.91*/("""
					            		""")))}),format.raw/*112.21*/("""
				            		"""),format.raw/*113.19*/("""</p> 
				            	""")))}),format.raw/*114.19*/("""				            	
				             	"""),_display_(/*115.20*/if(estado.estado.id == 6  ||  estado.estado.id == 100)/*115.74*/{_display_(Seq[Any](format.raw/*115.75*/("""
				             		"""),format.raw/*116.20*/("""<hr>
				             		<div class=row>
				             			"""),_display_(/*118.22*/for(recev<-estado.recurso.recursoevaluadores) yield /*118.67*/{_display_(Seq[Any](format.raw/*118.68*/("""
				             			"""),format.raw/*119.21*/("""<div class="col-md-6" style="font-size: small;">
				             				"""),_display_(/*120.23*/recev/*120.28*/.aspecto.descripcion),format.raw/*120.48*/(""" """),format.raw/*120.49*/("""- """),_display_(/*120.52*/recev/*120.57*/.evaluador.personal.nombreCompleto),format.raw/*120.91*/("""	
				             			"""),format.raw/*121.21*/("""</div>
				             			""")))}),format.raw/*122.22*/("""
				             		"""),format.raw/*123.20*/("""</div>
				             	
				             	
				             		
				             		"""),_display_(/*127.21*/if(!estado.recurso.historialestadoevaluaciones.isEmpty)/*127.76*/{_display_(Seq[Any](format.raw/*127.77*/("""
				             			"""),format.raw/*128.21*/("""<hr>
				             			<div name="divDetalleEvaluaciones">
						             			<div style="display: block;  margin-left: auto;  margin-right: auto;">Detalle de evaluaciones</div> 
						             			<ul class="timeline"> 
												"""),_display_(/*132.14*/for((hev,iev) <- estado.recurso.historialestadoevaluaciones.zipWithIndex) yield /*132.87*/{_display_(Seq[Any](format.raw/*132.88*/("""
										          """),_display_(/*133.22*/if( (iev % 2) != 0)/*133.41*/{_display_(Seq[Any](format.raw/*133.42*/("""
										          	"""),format.raw/*134.22*/("""<li class="timeline-inverted">
										          """)))}/*135.23*/else/*135.28*/{_display_(Seq[Any](format.raw/*135.29*/("""
										          	"""),format.raw/*136.22*/("""<li>
										          """)))}),format.raw/*137.22*/("""	
										          """),_display_(/*138.22*/hev/*138.25*/.estado.id.toInt/*138.41*/ match/*138.47*/ {/*139.16*/case 400  =>/*139.28*/ {_display_(Seq[Any](format.raw/*139.30*/("""
													  					"""),format.raw/*140.21*/("""<div class="timeline-badge warning"><i class="glyphicon glyphicon-warning-sign"></i>
													  				""")))}/*142.16*/case whoa  =>/*142.29*/ {_display_(Seq[Any](format.raw/*142.31*/("""
													  					"""),_display_(/*143.22*/if(hev.estado.descripcion.contains("observa"))/*143.68*/{_display_(Seq[Any](format.raw/*143.69*/("""
													  						"""),format.raw/*144.22*/("""<div class="timeline-badge info"><i class="glyphicon glyphicon-eye-open"></i>
													  					
													  					""")))}/*146.23*/else/*146.28*/{_display_(Seq[Any](format.raw/*146.29*/("""
													  						"""),format.raw/*147.22*/("""<div class="timeline-badge success"><i class="glyphicon glyphicon-ok"></i>
													  					""")))}),format.raw/*148.22*/("""
													  				""")))}}),format.raw/*150.16*/("""
												  """),format.raw/*151.15*/("""</div>
										          <div class="timeline-panel">
										            <div class="timeline-heading">
										              <h4 class="timeline-title">"""),_display_(/*154.53*/hev/*154.56*/.estado.descripcion),format.raw/*154.75*/("""</h4>
										              <p><small class="text-muted"><i class="fa fa-calendar"></i> """),_display_(/*155.86*/hev/*155.89*/.auditinsert.format("dd/MM/yyyy HH:mm:ss")),format.raw/*155.131*/("""</small></p>
										            </div>
										            <div class="timeline-body">
										            	<hr>
										            	<p style="font-size: small;">
										            	Evaluador: """),_display_(/*160.36*/hev/*160.39*/.recursoevaluador.evaluador.personal.nombreCompleto),format.raw/*160.90*/("""
										            	"""),format.raw/*161.24*/("""</p>
										            	<p style="font-size: small;">
										            	Aspecto: """),_display_(/*163.34*/hev/*163.37*/.recursoevaluador.aspecto.descripcion),format.raw/*163.74*/("""
										            	"""),format.raw/*164.24*/("""</p>	
										            	
		
										            	
										            </div>
										          </div>										  
												""")))}),format.raw/*170.14*/("""
												"""),format.raw/*171.13*/("""</ul>
										</div>
									""")))}),format.raw/*173.11*/("""				             		
				             	""")))}),format.raw/*174.20*/("""
				             	
				             	
				             	"""),_display_(/*177.20*/if( estado.estado.id==10)/*177.45*/{_display_(Seq[Any](format.raw/*177.46*/("""
				             		"""),format.raw/*178.20*/("""<div name="divReporteEval">
			            				"""),_display_(/*179.21*/form(   routes.RecursoWebController.reporteEvaluacion(), 'role -> "form")/*179.94*/ {_display_(Seq[Any](format.raw/*179.96*/("""
			            					"""),format.raw/*180.21*/("""<input class="btn btn-success center-block btn-block" type="submit" value="Reporte de Evaluación Técnico Pedagógica">
			            				""")))}),format.raw/*181.21*/("""
				             		"""),format.raw/*182.20*/("""</div>
				             	""")))}),format.raw/*183.20*/("""

								"""),_display_(/*185.10*/if( estado.estado.id==10 || estado.recurso.id == 110)/*185.63*/{_display_(Seq[Any](format.raw/*185.64*/("""

				             			"""),_display_(/*187.22*/if(estado.recurso.encuesta == null)/*187.57*/{_display_(Seq[Any](format.raw/*187.58*/("""
				             				"""),format.raw/*188.22*/("""<hr>
				             				<p style="font-size: small;">
												Su opinión sobre el proceso de evaluación que la UPEV ha realizado en torno a su solicitud, es muy importante para nosotros. A continuación encontrará el botón de acceso a una breve encuesta de satisfacción que esperamos pueda responder para conocer su experiencia y mejorar nuestro servicio.<br><br>
												Agradecemos de antemano su tiempo y le informamos que si su encuesta es enviada y aprobada por el sistema, usted recibirá en un máximo de 48 horas hábiles una notificación por correo electrónico que le permitirá descargar en formato digital el oficio de valoración e informe de evaluación técnico pedagógica correspondientes a su solicitud, con sello y firmas de esta Unidad.<br><br>
											</p>				             				
				             				
				            				"""),_display_(/*194.22*/form(   routes.EncuestaWebController.create(), 'role -> "form")/*194.85*/ {_display_(Seq[Any](format.raw/*194.87*/("""
				            					"""),format.raw/*195.22*/("""<input class="btn btn-success center-block btn-block" type="submit" value="Responder encuesta">
				            				""")))}),format.raw/*196.22*/("""	
				             			""")))}/*197.23*/else/*197.28*/{_display_(Seq[Any](format.raw/*197.29*/("""
				             				"""),format.raw/*198.22*/("""<hr>
				             				<div style="display: block;  margin-left: auto;  margin-right: auto;">Detalle de encuesta</div>
					             			<ul class="timeline"> 
												"""),_display_(/*201.14*/for((hen,ien) <- estado.recurso.historialestadoencuesta.zipWithIndex) yield /*201.83*/{_display_(Seq[Any](format.raw/*201.84*/("""
											          """),_display_(/*202.23*/if( (ien % 2) != 0)/*202.42*/{_display_(Seq[Any](format.raw/*202.43*/("""
											          	"""),format.raw/*203.23*/("""<li class="timeline-inverted">
											          """)))}/*204.24*/else/*204.29*/{_display_(Seq[Any](format.raw/*204.30*/("""
											          	"""),format.raw/*205.23*/("""<li>
											          """)))}),format.raw/*206.23*/("""	
											          """),_display_(/*207.23*/if(hen.estado.id == 2L)/*207.46*/{_display_(Seq[Any](format.raw/*207.47*/("""
											          	"""),format.raw/*208.23*/("""<div class="timeline-badge warning"><i class="glyphicon glyphicon-eye-open"></i></div>
											          """)))}/*209.24*/else/*209.29*/{_display_(Seq[Any](format.raw/*209.30*/("""
											          	"""),format.raw/*210.23*/("""<div class="timeline-badge success"><i class="glyphicon glyphicon-ok"></i></div>
											          """)))}),format.raw/*211.23*/("""
											          
											          
											          """),format.raw/*214.22*/("""<i class=""></i>
											          <div class="timeline-panel">
											            <div class="timeline-heading">
											              <h4 class="timeline-title">"""),_display_(/*217.54*/hen/*217.57*/.estado.descripcion),format.raw/*217.76*/("""</h4>
											              <p><small class="text-muted"><i class="fa fa-calendar"></i> """),_display_(/*218.87*/hen/*218.90*/.auditinsert.format("dd/MM/yyyy HH:mm:ss")),format.raw/*218.132*/("""</small></p>
											            </div>
											            <div class="timeline-body">
											            	"""),_display_(/*221.26*/if(estado.recurso.encuesta.estado.descripcion.contains("observa") && hen.estado.id == 2L)/*221.115*/{_display_(Seq[Any](format.raw/*221.116*/("""
											            		"""),format.raw/*222.26*/("""<hr>
										            			"""),_display_(/*223.27*/form(   routes.EncuestaWebController.atiendeObservaciones(), 'role -> "form")/*223.104*/ {_display_(Seq[Any](format.raw/*223.106*/("""
										            				"""),format.raw/*224.27*/("""<input class="btn btn-danger center-block btn-block" type="submit" value="Corrija las observaciones y envíe">
										            			""")))}),format.raw/*225.27*/("""									            		
											            	""")))}),format.raw/*226.26*/("""								            	
											            """),format.raw/*227.24*/("""</div>
											          </div>										  
												""")))}),format.raw/*229.14*/("""
											"""),format.raw/*230.12*/("""</ul>
				             			""")))}),format.raw/*231.22*/("""

								""")))}),format.raw/*233.10*/("""
				            """),format.raw/*234.17*/("""</div>
				          </div>
				        </li>
				    """)))}),format.raw/*237.10*/("""
			    """),format.raw/*238.8*/("""</ul>
</div>
<div class="col-md-1"></div>
</div>

</div>
""")))}),format.raw/*244.2*/("""

"""),format.raw/*246.1*/("""<script type="text/javascript">
	$(function()"""),format.raw/*247.14*/("""{"""),format.raw/*247.15*/("""
		"""),format.raw/*248.3*/("""$("[name='divImpSol']:gt(0)").hide();
		$("[name='divDetalleEvaluaciones']:not(:last)").hide();
		$("[name='divReporteEval']:not(:last)").hide();
		
	"""),format.raw/*252.2*/("""}"""),format.raw/*252.3*/(""");
</script>
"""))}
  }

  def render(recurso:Recurso): play.twirl.api.HtmlFormat.Appendable = apply(recurso)

  def f:((Recurso) => play.twirl.api.HtmlFormat.Appendable) = (recurso) => apply(recurso)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Historial/index.scala.html
                  HASH: 6b84908d8ad0dcdba640cbd9f14ae9a3500746b7
                  MATRIX: 734->1|854->18|882->20|953->65|967->71|1025->109|1055->131|1066->135|1103->136|1132->139|1177->157|1205->158|1234->160|1285->184|1313->185|1342->187|1385->202|1414->203|1446->208|1559->294|1587->295|1615->296|1653->306|1682->307|1714->312|1792->363|1820->364|1848->365|2055->546|2085->555|2115->558|2257->673|2327->727|2366->728|2420->755|2446->772|2485->773|2529->789|2594->836|2607->841|2646->842|2690->858|2741->878|2791->902|2806->908|2831->924|2846->930|2857->942|2875->951|2914->952|2967->977|3077->1085|3096->1095|3135->1096|3188->1121|3301->1225|3322->1237|3362->1239|3405->1254|3523->1363|3544->1375|3584->1377|3681->1465|3702->1477|3742->1479|3839->1567|3861->1580|3901->1582|4007->1666|4060->1691|4230->1834|4245->1840|4285->1859|4397->1944|4412->1950|4476->1992|4601->2090|4636->2116|4675->2117|4722->2136|4829->2216|4844->2222|4880->2237|4949->2279|4964->2285|5004->2304|5074->2347|5089->2353|5148->2391|5195->2410|5246->2434|5288->2467|5327->2468|5375->2489|5456->2561|5496->2563|5545->2584|5692->2700|5743->2720|5793->2739|5839->2828|5885->2847|5919->2872|5958->2873|6005->2892|6056->2916|6098->2949|6137->2950|6185->2971|6268->3045|6308->3047|6358->3069|6519->3199|6570->3219|6620->3238|6683->3274|6744->3326|6783->3327|6830->3347|6872->3380|6911->3381|6959->3401|7074->3489|7163->3568|7204->3570|7255->3593|7408->3715|7456->3735|7513->3761|7563->3780|7609->3799|7644->3825|7683->3826|7731->3845|7850->3936|7866->3942|7910->3964|7980->4006|7996->4012|8039->4033|8087->4052|8142->4075|8189->4094|8225->4120|8265->4121|8313->4140|8429->4228|8445->4234|8517->4284|8570->4309|8632->4361|8672->4362|8722->4383|8768->4401|8784->4407|8852->4453|8905->4474|8953->4493|9009->4517|9074->4554|9138->4608|9178->4609|9227->4629|9316->4690|9378->4735|9418->4736|9468->4757|9567->4828|9582->4833|9624->4853|9654->4854|9685->4857|9700->4862|9756->4896|9807->4918|9867->4946|9916->4966|10029->5051|10094->5106|10134->5107|10184->5128|10454->5370|10544->5443|10584->5444|10634->5466|10663->5485|10703->5486|10754->5508|10826->5561|10840->5566|10880->5567|10931->5589|10989->5615|11040->5638|11053->5641|11079->5657|11095->5663|11107->5681|11129->5693|11170->5695|11220->5716|11345->5837|11368->5850|11409->5852|11459->5874|11515->5920|11555->5921|11606->5943|11746->6064|11760->6069|11800->6070|11851->6092|11979->6188|12033->6225|12077->6240|12266->6401|12279->6404|12320->6423|12439->6514|12452->6517|12517->6559|12753->6767|12766->6770|12839->6821|12892->6845|13011->6936|13024->6939|13083->6976|13136->7000|13306->7138|13348->7151|13413->7184|13484->7223|13570->7281|13605->7306|13645->7307|13694->7327|13770->7375|13853->7448|13894->7450|13944->7471|14114->7609|14163->7629|14221->7655|14260->7666|14323->7719|14363->7720|14414->7743|14459->7778|14499->7779|14550->7801|15423->8646|15496->8709|15537->8711|15588->8733|15737->8850|15780->8874|15794->8879|15834->8880|15885->8902|16092->9081|16178->9150|16218->9151|16269->9174|16298->9193|16338->9194|16390->9217|16463->9271|16477->9276|16517->9277|16569->9300|16628->9327|16680->9351|16713->9374|16753->9375|16805->9398|16934->9508|16948->9513|16988->9514|17040->9537|17175->9640|17270->9706|17472->9880|17485->9883|17526->9902|17646->9994|17659->9997|17724->10039|17871->10158|17971->10247|18012->10248|18067->10274|18126->10305|18214->10382|18256->10384|18312->10411|18480->10547|18561->10596|18635->10641|18727->10701|18768->10713|18827->10740|18870->10751|18916->10768|19003->10823|19039->10831|19128->10889|19158->10891|19232->10936|19262->10937|19293->10940|19471->11090|19500->11091
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|32->5|32->5|32->5|35->8|36->9|36->9|37->10|39->12|39->12|41->14|41->14|41->14|42->15|47->20|47->20|48->21|48->21|48->21|49->22|51->24|51->24|52->25|60->33|60->33|62->35|66->39|66->39|66->39|67->40|67->40|67->40|68->41|69->42|69->42|69->42|70->43|71->44|73->46|73->46|73->46|73->46|73->47|73->47|73->47|74->48|75->50|75->50|75->50|76->51|77->53|77->53|77->53|78->54|79->56|79->56|79->56|79->57|79->57|79->57|79->58|79->58|79->58|79->59|80->60|83->63|83->63|83->63|84->64|84->64|84->64|87->67|87->67|87->67|88->68|90->70|90->70|90->70|91->71|91->71|91->71|92->72|92->72|92->72|93->73|94->74|94->74|94->74|95->75|95->75|95->75|96->76|97->77|98->78|99->79|100->80|101->81|101->81|101->81|102->82|103->83|103->83|103->83|104->84|104->84|104->84|105->85|106->86|107->87|108->88|109->89|109->89|109->89|110->90|110->90|110->90|111->91|113->93|113->93|113->93|114->94|115->95|116->96|117->97|118->98|119->99|119->99|119->99|120->100|122->102|122->102|122->102|123->103|123->103|123->103|124->104|125->105|126->106|126->106|126->106|127->107|129->109|129->109|129->109|130->110|130->110|130->110|131->111|131->111|131->111|131->111|132->112|133->113|134->114|135->115|135->115|135->115|136->116|138->118|138->118|138->118|139->119|140->120|140->120|140->120|140->120|140->120|140->120|140->120|141->121|142->122|143->123|147->127|147->127|147->127|148->128|152->132|152->132|152->132|153->133|153->133|153->133|154->134|155->135|155->135|155->135|156->136|157->137|158->138|158->138|158->138|158->138|158->139|158->139|158->139|159->140|160->142|160->142|160->142|161->143|161->143|161->143|162->144|164->146|164->146|164->146|165->147|166->148|167->150|168->151|171->154|171->154|171->154|172->155|172->155|172->155|177->160|177->160|177->160|178->161|180->163|180->163|180->163|181->164|187->170|188->171|190->173|191->174|194->177|194->177|194->177|195->178|196->179|196->179|196->179|197->180|198->181|199->182|200->183|202->185|202->185|202->185|204->187|204->187|204->187|205->188|211->194|211->194|211->194|212->195|213->196|214->197|214->197|214->197|215->198|218->201|218->201|218->201|219->202|219->202|219->202|220->203|221->204|221->204|221->204|222->205|223->206|224->207|224->207|224->207|225->208|226->209|226->209|226->209|227->210|228->211|231->214|234->217|234->217|234->217|235->218|235->218|235->218|238->221|238->221|238->221|239->222|240->223|240->223|240->223|241->224|242->225|243->226|244->227|246->229|247->230|248->231|250->233|251->234|254->237|255->238|261->244|263->246|264->247|264->247|265->248|269->252|269->252
                  -- GENERATED --
              */
          