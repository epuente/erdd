
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
object createForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Versionanterior],Recurso,List[Actualizacion],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(forma: Form[Versionanterior], 
  recurso:Recurso,  
  lac:List[Actualizacion]
):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*8.2*/implicitFieldConstructor/*8.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*4.2*/("""
  """),format.raw/*5.3*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.48*/routes/*5.54*/.Assets.at("stylesheets/recurso.css")),format.raw/*5.91*/(""""/> 
"""),format.raw/*7.1*/("""
"""),format.raw/*8.77*/(""" 

"""),_display_(/*10.2*/main/*10.6*/ {_display_(Seq[Any](format.raw/*10.8*/("""
	"""),format.raw/*11.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" id="div0" style="display:none">  
			<div class="row">
				<div class="col-md-12">
					<ol class="breadcrumb">
					  <li>Recursos</li>
					  <li><a href="/actualizacionesList">Seguimiento a actualizaciones</a></li>
					  <li class="active">Agregar</li>
					</ol>			
				</div>
			</div>
	"""),_display_(/*21.3*/flashes()),format.raw/*21.12*/("""
    """),_display_(/*22.6*/form(CSRF(routes.VersionanteriorController.save(recurso.id)), 'id->"frmCreate")/*22.85*/ {_display_(Seq[Any](format.raw/*22.87*/("""
        
        """),format.raw/*24.9*/("""<fieldset>
        	<table class="table table-bordered tablaReporte">
        		<tr class="etiqueta">
        			<td colspan="6" style="width: 50%" >
        				<div class="etiqueta" style="text-align: center;">OBRA NUEVA</div>        				
        			</td>
        			<td>
        				<div class="etiqueta" style="text-align: center;">ACTUALIZACIONES</div>
        			</td>
        		</tr>
				<tr>
					<td colspan="5"><div class="etiqueta">Título</div><div class="contenido">"""),_display_(/*35.80*/recurso/*35.87*/.titulo),format.raw/*35.94*/("""</div></td>
					<td colspan="1"><div class="etiqueta">Clave de control</div><div class="contenido">"""),_display_(/*36.90*/recurso/*36.97*/.numcontrol),format.raw/*36.108*/("""</div></td>
					<td rowspan="14" style="text-align: center; vertical-align: middle; padding: 5%" >
					"""),_display_(/*38.7*/for(r <- lac) yield /*38.20*/ {_display_(Seq[Any](format.raw/*38.22*/("""
						"""),_display_(/*39.8*/if(!r.getActualizacion.isEmpty)/*39.39*/{_display_(Seq[Any](format.raw/*39.40*/("""
							"""),format.raw/*40.8*/("""<table style="width: 100%" class="table table-bordered" id="tablaAct">
							<tr>
								<td class="etiqueta">Num. control</td>
								<td class="etiqueta">Fecha elaboración</td>
								<td class="etiqueta">Fecha y hora registro electrónico</td>
								<td class="etiqueta"></td>
							</tr>
							"""),_display_(/*47.9*/for(i <- r.getActualizacion   ) yield /*47.40*/{_display_(Seq[Any](format.raw/*47.41*/("""								
								"""),format.raw/*48.9*/("""<tr>
									<td style="display: none;">"""),_display_(/*49.38*/inputText(forma("aux").copy(value=Some(i.id+"")), '_label->"", 'style -> "display:none")),format.raw/*49.126*/("""</td>
									<td>"""),_display_(/*50.15*/i/*50.16*/.numcontrol),format.raw/*50.27*/("""</td>
									<td>"""),_display_(/*51.15*/i/*51.16*/.elaboracion.format("dd/MM/yyyy")),format.raw/*51.49*/("""</td>	
									<td>"""),_display_(/*52.15*/i/*52.16*/.auditinsert.format("dd/MM/YYYY hh:mm:ss")),format.raw/*52.58*/("""</td>	
									<td style="width: 10px; text-align: center; vertical-align: middle;"></td>							
								</tr>									
							""")))}),format.raw/*55.9*/("""
							"""),format.raw/*56.8*/("""</table>
						""")))}),format.raw/*57.8*/("""
					""")))}),format.raw/*58.7*/("""
					
						"""),_display_(/*60.8*/inputText(forma("recursoanterior.id"), '_label->"",  'style -> "display: none")),format.raw/*60.87*/("""
						"""),format.raw/*61.7*/("""Se muestran los recursos que han sido registrados como 'Actualización'.
			            """),_display_(/*62.17*/select(
			                forma("recurso.id"), 
			                options(models.Recurso.optionsSoloActualizaciones()), 
			                '_label -> "Recurso con versión 'Actualización'", '_default -> "Seleccione el recurso...",
			                '_showConstraints -> false, 
			                'required->"required"
			            )),format.raw/*68.17*/("""	
			            
			            """),format.raw/*70.16*/("""<input type="submit" value="Agregar actualización" class="btn btn-primary">
			            
			            				
					</td>
				</tr>
        		<tr>
        			<td>
						<div class="etiqueta">Versión</div><div class="contenido">"""),_display_(/*77.66*/recurso/*77.73*/.version.descripcion),format.raw/*77.93*/("""</div>
						"""),_display_(/*78.8*/if(recurso.versionanterior != null)/*78.43*/{_display_(Seq[Any](format.raw/*78.44*/("""
							"""),format.raw/*79.8*/("""<div class="etiqueta">Clave control anterior</div><div class="contenido">"""),_display_(/*79.82*/recurso/*79.89*/.versionanterior.recursoanterior),format.raw/*79.121*/("""</div>
						""")))}),format.raw/*80.8*/("""        				
        			"""),format.raw/*81.12*/("""</td>
        			<td colspan="5">
						<div class="etiqueta">Programa Académico:</div><div class="contenido">"""),_display_(/*83.78*/recurso/*83.85*/.programaacad),format.raw/*83.98*/("""</div>        			
        			</td>
       			</tr>
       			<tr>
        			<td colspan="6">
        				<div class="etiqueta">Sinópsis</div><div class="contenido">"""),_display_(/*88.73*/recurso/*88.80*/.sinopsis),format.raw/*88.89*/("""</div>
        			</td>
        		</tr>
        		<tr>
        			<td colspan="3">
        				<div class="etiqueta">Fecha elaboración</div><div class="contenido">"""),_display_(/*93.82*/recurso/*93.89*/.elaboracion.format("dd/MM/yyyy")),format.raw/*93.122*/("""</div>
        			</td>
        			<td colspan="3">
						<div class="etiqueta">Fecha y hora registro electrónico</div><div class="contenido">"""),_display_(/*96.92*/recurso/*96.99*/.auditinsert.format("dd/MM/YYYY hh:mm:ss")),format.raw/*96.141*/("""</div>        			
        			</td>
        		</tr>
        		<tr>
        			<td colspan="6"></td>
        		</tr>
        	</table>
        </fieldset>
    """)))}),format.raw/*104.6*/("""
    """),format.raw/*105.5*/("""</div>
""")))}),format.raw/*106.2*/("""

"""),format.raw/*108.1*/("""<script type="text/javascript">
$(function() """),format.raw/*109.14*/("""{"""),format.raw/*109.15*/("""

	"""),format.raw/*111.2*/("""var oid = $("#tablaAct tr:last td:first input").val();
	$("#tablaAct tr:last td:last").html('<input class="btn btn-primary btn-xs btn-danger" type="button" value="Eliminar actualización" onclick="javascript:eliminaAct('+oid+')">');
	
	
    $('form').submit(function() """),format.raw/*115.33*/("""{"""),format.raw/*115.34*/("""  
    	"""),format.raw/*116.6*/("""var anterior = $("#tablaAct tr:last td:first input").val();
    	if (anterior == undefined)
    		anterior = """),_display_(/*118.19*/recurso/*118.26*/.id),format.raw/*118.29*/("""; 
       	$("#recursoanterior_id").val( anterior );       
        return true; 
    """),format.raw/*121.5*/("""}"""),format.raw/*121.6*/(""");
"""),format.raw/*122.1*/("""}"""),format.raw/*122.2*/(""");	



function eliminaAct(recId)"""),format.raw/*126.27*/("""{"""),format.raw/*126.28*/("""
	"""),format.raw/*127.2*/("""if (confirm("¿Desea desasociar el recurso?"))
	$.ajax("""),format.raw/*128.9*/("""{"""),format.raw/*128.10*/("""
		  """),format.raw/*129.5*/("""method: "POST",
		  async: false,
		  url: "/actualizaciones/"+recId+"/delete"
		"""),format.raw/*132.3*/("""}"""),format.raw/*132.4*/(""")
		  .success(function( data ) """),format.raw/*133.31*/("""{"""),format.raw/*133.32*/("""
		  	"""),format.raw/*134.6*/("""if ( (data == null) || (data.length == 0) )"""),format.raw/*134.49*/("""{"""),format.raw/*134.50*/("""
		  		"""),format.raw/*135.7*/("""alert("No es posible eliminar la actualización" );
		  	"""),format.raw/*136.6*/("""}"""),format.raw/*136.7*/(""" """),format.raw/*136.8*/("""else """),format.raw/*136.13*/("""{"""),format.raw/*136.14*/("""
		  		"""),format.raw/*137.7*/("""location.reload();	
		  	"""),format.raw/*138.6*/("""}"""),format.raw/*138.7*/("""
		  """),format.raw/*139.5*/("""}"""),format.raw/*139.6*/(""")		  
		  .error(function(data)"""),format.raw/*140.26*/("""{"""),format.raw/*140.27*/("""
		  	"""),format.raw/*141.6*/("""alert('Error ajax en la búsqueda de la clave de control anterior');
		  	numErrores++;		  	
		  """),format.raw/*143.5*/("""}"""),format.raw/*143.6*/(""");
	"""),format.raw/*144.2*/("""}"""),format.raw/*144.3*/("""

"""),format.raw/*146.1*/("""</script>

"""))}
  }

  def render(forma:Form[Versionanterior],recurso:Recurso,lac:List[Actualizacion]): play.twirl.api.HtmlFormat.Appendable = apply(forma,recurso,lac)

  def f:((Form[Versionanterior],Recurso,List[Actualizacion]) => play.twirl.api.HtmlFormat.Appendable) = (forma,recurso,lac) => apply(forma,recurso,lac)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Versionanterior/createForm.scala.html
                  HASH: f7c8fb0c98643a3b0b09802186076c6942ac077b
                  MATRIX: 787->1|962->196|994->220|1074->81|1103->84|1174->129|1188->135|1245->172|1276->194|1304->271|1334->275|1346->279|1385->281|1414->283|1808->651|1838->660|1870->666|1958->745|1998->747|2043->765|2549->1244|2565->1251|2593->1258|2721->1359|2737->1366|2770->1377|2902->1483|2931->1496|2971->1498|3005->1506|3045->1537|3084->1538|3119->1546|3451->1852|3498->1883|3537->1884|3581->1901|3650->1943|3760->2031|3807->2051|3817->2052|3849->2063|3896->2083|3906->2084|3960->2117|4008->2138|4018->2139|4081->2181|4240->2310|4275->2318|4321->2334|4358->2341|4398->2355|4498->2434|4532->2441|4647->2529|5006->2867|5067->2900|5323->3129|5339->3136|5380->3156|5420->3170|5464->3205|5503->3206|5538->3214|5639->3288|5655->3295|5709->3327|5753->3341|5805->3365|5943->3476|5959->3483|5993->3496|6186->3662|6202->3669|6232->3678|6423->3842|6439->3849|6494->3882|6664->4025|6680->4032|6744->4074|6933->4232|6966->4237|7005->4245|7035->4247|7109->4292|7139->4293|7170->4296|7467->4564|7497->4565|7533->4573|7671->4683|7688->4690|7713->4693|7827->4779|7856->4780|7887->4783|7916->4784|7978->4817|8008->4818|8038->4820|8120->4874|8150->4875|8183->4880|8292->4961|8321->4962|8382->4994|8412->4995|8446->5001|8518->5044|8548->5045|8583->5052|8667->5108|8696->5109|8725->5110|8759->5115|8789->5116|8824->5123|8877->5148|8906->5149|8939->5154|8968->5155|9028->5186|9058->5187|9092->5193|9216->5289|9245->5290|9277->5294|9306->5295|9336->5297
                  LINES: 26->1|31->8|31->8|32->4|33->5|33->5|33->5|33->5|34->7|35->8|37->10|37->10|37->10|38->11|48->21|48->21|49->22|49->22|49->22|51->24|62->35|62->35|62->35|63->36|63->36|63->36|65->38|65->38|65->38|66->39|66->39|66->39|67->40|74->47|74->47|74->47|75->48|76->49|76->49|77->50|77->50|77->50|78->51|78->51|78->51|79->52|79->52|79->52|82->55|83->56|84->57|85->58|87->60|87->60|88->61|89->62|95->68|97->70|104->77|104->77|104->77|105->78|105->78|105->78|106->79|106->79|106->79|106->79|107->80|108->81|110->83|110->83|110->83|115->88|115->88|115->88|120->93|120->93|120->93|123->96|123->96|123->96|131->104|132->105|133->106|135->108|136->109|136->109|138->111|142->115|142->115|143->116|145->118|145->118|145->118|148->121|148->121|149->122|149->122|153->126|153->126|154->127|155->128|155->128|156->129|159->132|159->132|160->133|160->133|161->134|161->134|161->134|162->135|163->136|163->136|163->136|163->136|163->136|164->137|165->138|165->138|166->139|166->139|167->140|167->140|168->141|170->143|170->143|171->144|171->144|173->146
                  -- GENERATED --
              */
          