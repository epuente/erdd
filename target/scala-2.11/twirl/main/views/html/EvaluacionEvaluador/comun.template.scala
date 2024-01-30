
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
object comun extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Recursoevaluador],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(re: List[Recursoevaluador], titulo:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.45*/("""
 """),format.raw/*2.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*2.47*/routes/*2.53*/.Assets.at("stylesheets/recurso.css")),format.raw/*2.90*/(""""/> 
"""),format.raw/*4.83*/(""" 
"""),_display_(/*5.2*/main/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""
"""),format.raw/*6.1*/("""<div style="background-color: white; padding: 10px;">
		<h3>"""),_display_(/*7.8*/titulo),format.raw/*7.14*/("""</h3>	
		"""),_display_(/*8.4*/flashes()),format.raw/*8.13*/("""	
		"""),_display_(/*9.4*/if(re.isEmpty)/*9.18*/{_display_(Seq[Any](format.raw/*9.19*/("""
			"""),format.raw/*10.4*/("""<div class="well well-lg">
				No se encontraron registros.
			</div>
		""")))}/*13.5*/else/*13.10*/{_display_(Seq[Any](format.raw/*13.11*/("""
			"""),format.raw/*14.4*/("""<form id="auc" style="background-color: white;">
				<table class="table table-bordered table-stripped" id="tabla">
					<thead>
						<tr>
							<th>Título</th>
							<th>Clave control</th>
							<th>Tipo recurso</th>
							<th>Aspecto</th>
							"""),_display_(/*22.9*/if(  Array(2, 3, 4, 5) contains re(0).estadoevaluacion.id )/*22.68*/{_display_(Seq[Any](format.raw/*22.69*/("""
								"""),format.raw/*23.9*/("""<th>Inicio evaluación</th>
							""")))}),format.raw/*24.9*/("""
							"""),_display_(/*25.9*/if(Array(3,4,5) contains re(0).estadoevaluacion.id)/*25.60*/{_display_(Seq[Any](format.raw/*25.61*/("""								
								"""),format.raw/*26.9*/("""<th>Última evaluación</th>
							""")))}),format.raw/*27.9*/("""
							"""),_display_(/*28.9*/if(Array(400) contains re(0).estadoevaluacion.id)/*28.58*/{_display_(Seq[Any](format.raw/*28.59*/("""								
								"""),format.raw/*29.9*/("""<th>Fecha solicitud cancelación</th>
								<th>Evaluador solicitante</th>
							""")))}),format.raw/*31.9*/("""
							"""),format.raw/*32.8*/("""<th></th>
						</tr>
					</thead>
					<tbody>
						"""),_display_(/*36.8*/for(r <- re ) yield /*36.21*/{_display_(Seq[Any](format.raw/*36.22*/("""
							"""),format.raw/*37.8*/("""<tr>
								<td> <a href=""""),_display_(/*38.24*/routes/*38.30*/.EvaluacionEvaluadorController.verDetalle(r.recurso.id)),format.raw/*38.85*/("""" > """),_display_(/*38.90*/r/*38.91*/.recurso.titulo),format.raw/*38.106*/(""" """),format.raw/*38.107*/("""</a>  </td>
								<td>"""),_display_(/*39.14*/r/*39.15*/.recurso.numcontrol),format.raw/*39.34*/("""</td>
								"""),_display_(/*40.10*/if(r.recurso.clasificacion.tiporecurso != null)/*40.57*/{_display_(Seq[Any](format.raw/*40.58*/("""
									"""),format.raw/*41.10*/("""<td>"""),_display_(/*41.15*/r/*41.16*/.recurso.clasificacion.tiporecurso.descripcion),format.raw/*41.62*/("""</td>
								""")))}/*42.11*/else/*42.16*/{_display_(Seq[Any](format.raw/*42.17*/("""
									"""),format.raw/*43.10*/("""<td></td>
								""")))}),format.raw/*44.10*/("""
								"""),format.raw/*45.9*/("""<td>"""),_display_(/*45.14*/r/*45.15*/.aspecto.descripcion),format.raw/*45.35*/("""</td>
								
								"""),_display_(/*47.10*/if(Array(2, 3, 4, 5) contains re(0).estadoevaluacion.id)/*47.66*/{_display_(Seq[Any](format.raw/*47.67*/("""
									"""),format.raw/*48.10*/("""<td>"""),_display_(/*48.15*/r/*48.16*/.auditinsert.format("dd/MM/yyyy  HH:mm")),format.raw/*48.56*/("""</td>
								""")))}),format.raw/*49.10*/("""
								"""),_display_(/*50.10*/if(Array(3, 4, 5) contains re(0).estadoevaluacion.id)/*50.63*/{_display_(Seq[Any](format.raw/*50.64*/("""
									"""),_display_(/*51.11*/if(r.auditlastupdate == null)/*51.40*/{_display_(Seq[Any](format.raw/*51.41*/("""
										"""),format.raw/*52.11*/("""<td></td>
									""")))}/*53.12*/else/*53.17*/{_display_(Seq[Any](format.raw/*53.18*/("""
										"""),format.raw/*54.11*/("""<td>"""),_display_(/*54.16*/r/*54.17*/.auditlastupdate.format("dd/MM/yyyy  HH:mm")),format.raw/*54.61*/("""  """),format.raw/*54.63*/("""</td>
									""")))}),format.raw/*55.11*/("""										
								""")))}),format.raw/*56.10*/("""								
								"""),_display_(/*57.10*/if(re(0).estadoevaluacion.id == 400)/*57.46*/{_display_(Seq[Any](format.raw/*57.47*/("""
									"""),format.raw/*58.10*/("""<td>
										<table>
											"""),_display_(/*60.13*/for(sc <- r.recurso.solicitudescancelacion ) yield /*60.57*/{_display_(Seq[Any](format.raw/*60.58*/("""
											"""),format.raw/*61.12*/("""<tr>
												<td>"""),_display_(/*62.18*/sc/*62.20*/.fechaSolicitud),format.raw/*62.35*/("""</td>
												<td>"""),_display_(/*63.18*/sc/*63.20*/.evaluador.personal.nombreCompleto),format.raw/*63.54*/("""</td>										
											</tr>
											""")))}),format.raw/*65.13*/("""
										"""),format.raw/*66.11*/("""</table>
									</td>
								""")))}),format.raw/*68.10*/("""
								
								
								"""),format.raw/*71.9*/("""<td>
									"""),_display_(/*72.11*/if(r.estadoevaluacion.id == 1)/*72.41*/{_display_(Seq[Any](format.raw/*72.42*/("""
										"""),format.raw/*73.11*/("""<a class="btn btn-primary btn-block center-block" href="/evCreate?id="""),_display_(/*73.81*/r/*73.82*/.recurso.id),format.raw/*73.93*/("""&idAspecto="""),_display_(/*73.105*/r/*73.106*/.aspecto.id),format.raw/*73.117*/("""" role="button">Iniciar evaluación</a>								
									""")))}),format.raw/*74.11*/("""
									"""),_display_(/*75.11*/if(r.estadoevaluacion.id == 2)/*75.41*/{_display_(Seq[Any](format.raw/*75.42*/("""									
										"""),format.raw/*76.11*/("""<a class="btn btn-primary btn-block center-block" href="/evEdit?id="""),_display_(/*76.79*/r/*76.80*/.recurso.id),format.raw/*76.91*/("""&idAspecto="""),_display_(/*76.103*/r/*76.104*/.aspecto.id),format.raw/*76.115*/("""" role="button">Continuar evaluación</a>
									""")))}),format.raw/*77.11*/("""
									"""),_display_(/*78.11*/if(r.estadoevaluacion.id == 4)/*78.41*/{_display_(Seq[Any](format.raw/*78.42*/("""
										"""),format.raw/*79.11*/("""<a class="btn btn-primary btn-block center-block" href="/evAtenderObservaciones/"""),_display_(/*79.92*/r/*79.93*/.recurso.id),format.raw/*79.104*/("""/"""),_display_(/*79.106*/r/*79.107*/.aspecto.id),format.raw/*79.118*/("""" role="button">Atender observaciones</a>								
									""")))}),format.raw/*80.11*/("""
									
								"""),format.raw/*82.9*/("""</td>

							</tr>
						""")))}),format.raw/*85.8*/("""
					"""),format.raw/*86.6*/("""</tbody>
				</table>
			</form>
		""")))}),format.raw/*89.4*/("""
"""),format.raw/*90.1*/("""</div>
""")))}),format.raw/*91.2*/("""



"""),format.raw/*95.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*96.15*/("""{"""),format.raw/*96.16*/("""
		"""),_display_(/*97.4*/if(!re.isEmpty)/*97.19*/{_display_(Seq[Any](format.raw/*97.20*/("""
			"""),format.raw/*98.4*/("""var numCols = $('#tabla tbody tr:first td').length;
			if ("""),_display_(/*99.9*/re(0)/*99.14*/.estadoevaluacion.id),format.raw/*99.34*/(""" """),format.raw/*99.35*/("""== 5)"""),format.raw/*99.40*/("""{"""),format.raw/*99.41*/("""
				"""),format.raw/*100.5*/("""$("#tabla tbody tr td:eq("+(numCols-1)+")").hide();
				$("#tabla thead tr th:eq("+(numCols-1)+")").hide();
			"""),format.raw/*102.4*/("""}"""),format.raw/*102.5*/("""
			"""),format.raw/*103.4*/("""if ("""),_display_(/*103.9*/re(0)/*103.14*/.recurso.estado.id),format.raw/*103.32*/(""" """),format.raw/*103.33*/("""== 400)"""),format.raw/*103.40*/("""{"""),format.raw/*103.41*/("""
				"""),format.raw/*104.5*/("""$("#tabla tbody tr td:eq("+(numCols-1)+")").hide();
				$("#tabla thead tr th:eq("+(numCols-1)+")").hide();
				
				$('#tabla thead tr').append("<th>Solicitante</th>");
				$('#tabla thead tr').append("<th>Fecha de solicitud</th>");    

				
				"""),_display_(/*111.6*/for( (re, ind)<-re(0).recurso.solicitudescancelacion.zipWithIndex) yield /*111.72*/{_display_(Seq[Any](format.raw/*111.73*/("""
					"""),format.raw/*112.6*/("""$('#tabla tr:eq("""),_display_(/*112.23*/(ind+1)),format.raw/*112.30*/(""")').each(function()"""),format.raw/*112.49*/("""{"""),format.raw/*112.50*/("""
					       """),format.raw/*113.13*/("""$(this).append('<td>"""),_display_(/*113.34*/re/*113.36*/.evaluador.personal.nombreCompleto),format.raw/*113.70*/("""</td>');
					       $(this).append('<td>"""),_display_(/*114.34*/re/*114.36*/.fechaSolicitud.format("dd/MM/yyyy hh:mm:ss")),format.raw/*114.81*/("""</td>');
					 """),format.raw/*115.7*/("""}"""),format.raw/*115.8*/(""");				
				""")))}),format.raw/*116.6*/("""
			"""),format.raw/*117.4*/("""}"""),format.raw/*117.5*/("""
			
			"""),format.raw/*119.4*/("""if ("""),_display_(/*119.9*/re(0)/*119.14*/.recurso.estado.id),format.raw/*119.32*/(""" """),format.raw/*119.33*/("""== 402)"""),format.raw/*119.40*/("""{"""),format.raw/*119.41*/("""
				"""),format.raw/*120.5*/("""$("#tabla tbody tr td:nth-child("+(numCols)+")").hide();
				$("#tabla thead tr th:eq("+(numCols-1)+")").hide();
				
				$('#tabla thead tr').append("<th></th>");
				$("#tabla tbody tr").append("<td></td>");
				"""),_display_(/*125.6*/for((e,ie)<-re.zipWithIndex) yield /*125.34*/{_display_(Seq[Any](format.raw/*125.35*/("""
					"""),format.raw/*126.6*/("""var texto = '<div style="display: table; width: 100%" class="table">';
					texto+='<div style="display: table-row;">';
					texto+='<div style="display:table-cell; border: 1px solid #999999; padding:5px;">Fecha cancelación</div>'					
					texto+='<div style="display:table-cell; border: 1px solid #999999; padding:5px;">Solicitante</div>'
					texto+='<div style="display:table-cell; border: 1px solid #999999; padding:5px;">Fecha solicitud</div>'
					texto+='<div style="display:table-cell; border: 1px solid #999999; padding:5px;">Fecha reactivación</div>'
					texto+='<div style="display:table-cell; border: 1px solid #999999; padding:5px;">Motivo cancelación</div>'
					texto+='</div>'
					"""),_display_(/*134.7*/for( f<-e.recurso.solicitudescancelacion) yield /*134.48*/{_display_(Seq[Any](format.raw/*134.49*/("""
						"""),format.raw/*135.7*/("""texto+='<div style="display: table-row;">';
						texto+='<div style="display:table-cell; border: 1px solid #999999; padding:5px;">"""),_display_(/*136.89*/if(f.fechaAceptacion != null)/*136.118*/{_display_(_display_(/*136.120*/f/*136.121*/.fechaAceptacion.format("dd/MM/yyyy hh:mm:ss")))}),format.raw/*136.168*/(""" """),format.raw/*136.169*/("""</div>'
						texto+='<div style="display:table-cell; border: 1px solid #999999; padding:5px;">"""),_display_(/*137.89*/f/*137.90*/.evaluador.personal.nombreCompleto),format.raw/*137.124*/("""</div>'						
						texto+='<div style="display:table-cell; border: 1px solid #999999; padding:5px;">"""),_display_(/*138.89*/f/*138.90*/.fechaSolicitud.format("dd/MM/yyyy hh:mm:ss")),format.raw/*138.135*/("""</div>';
						texto+='<div style="display:table-cell; border: 1px solid #999999; padding:5px;">"""),_display_(/*139.89*/if(f.fechaReactivacion!=null)/*139.118*/ {_display_(_display_(/*139.121*/f/*139.122*/.fechaReactivacion.format("dd/MM/yyyy hh:mm:ss")))}),format.raw/*139.171*/("""</div>';
						texto+='<div style="display:table-cell; border: 1px solid #999999; padding:5px;">"""),_display_(/*140.89*/f/*140.90*/.motivoCancelacion),format.raw/*140.108*/("""</div>';
						texto+="</div>";						
					""")))}),format.raw/*142.7*/("""
					"""),format.raw/*143.6*/("""texto+="</div>";
					$("#tabla tbody tr:eq("""),_display_(/*144.29*/ie),format.raw/*144.31*/(""") td:eq(5)").append(texto);
				""")))}),format.raw/*145.6*/("""
				
			"""),format.raw/*147.4*/("""}"""),format.raw/*147.5*/("""
		""")))}),format.raw/*148.4*/("""
	"""),format.raw/*149.2*/("""}"""),format.raw/*149.3*/(""");
</script>"""))}
  }

  def render(re:List[Recursoevaluador],titulo:String): play.twirl.api.HtmlFormat.Appendable = apply(re,titulo)

  def f:((List[Recursoevaluador],String) => play.twirl.api.HtmlFormat.Appendable) = (re,titulo) => apply(re,titulo)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/EvaluacionEvaluador/comun.scala.html
                  HASH: 9cb822ddbb045fccf94bef583017e4caf9ef514d
                  MATRIX: 766->1|904->157|936->181|1023->44|1051->46|1122->91|1136->97|1193->134|1225->238|1253->241|1264->245|1301->246|1328->247|1414->308|1440->314|1475->324|1504->333|1534->338|1556->352|1594->353|1625->357|1716->431|1729->436|1768->437|1799->441|2079->695|2147->754|2186->755|2222->764|2287->799|2322->808|2382->859|2421->860|2465->877|2530->912|2565->921|2623->970|2662->971|2706->988|2820->1072|2855->1080|2937->1136|2966->1149|3005->1150|3040->1158|3095->1186|3110->1192|3186->1247|3218->1252|3228->1253|3265->1268|3295->1269|3347->1294|3357->1295|3397->1314|3439->1329|3495->1376|3534->1377|3572->1387|3604->1392|3614->1393|3681->1439|3715->1455|3728->1460|3767->1461|3805->1471|3855->1490|3891->1499|3923->1504|3933->1505|3974->1525|4025->1549|4090->1605|4129->1606|4167->1616|4199->1621|4209->1622|4270->1662|4316->1677|4353->1687|4415->1740|4454->1741|4492->1752|4530->1781|4569->1782|4608->1793|4647->1814|4660->1819|4699->1820|4738->1831|4770->1836|4780->1837|4845->1881|4875->1883|4922->1899|4973->1919|5018->1937|5063->1973|5102->1974|5140->1984|5202->2019|5262->2063|5301->2064|5341->2076|5390->2098|5401->2100|5437->2115|5487->2138|5498->2140|5553->2174|5629->2219|5668->2230|5732->2263|5786->2290|5828->2305|5867->2335|5906->2336|5945->2347|6042->2417|6052->2418|6084->2429|6124->2441|6135->2442|6168->2453|6256->2510|6294->2521|6333->2551|6372->2552|6420->2572|6515->2640|6525->2641|6557->2652|6597->2664|6608->2665|6641->2676|6723->2727|6761->2738|6800->2768|6839->2769|6878->2780|6986->2861|6996->2862|7029->2873|7059->2875|7070->2876|7103->2887|7194->2947|7240->2966|7297->2993|7330->2999|7396->3035|7424->3036|7462->3044|7493->3048|7567->3094|7596->3095|7626->3099|7650->3114|7689->3115|7720->3119|7806->3179|7820->3184|7861->3204|7890->3205|7923->3210|7952->3211|7985->3216|8124->3327|8153->3328|8185->3332|8217->3337|8232->3342|8272->3360|8302->3361|8338->3368|8368->3369|8401->3374|8677->3623|8760->3689|8800->3690|8834->3696|8879->3713|8908->3720|8956->3739|8986->3740|9028->3753|9077->3774|9089->3776|9145->3810|9215->3852|9227->3854|9294->3899|9337->3914|9366->3915|9409->3927|9441->3931|9470->3932|9506->3940|9538->3945|9553->3950|9593->3968|9623->3969|9659->3976|9689->3977|9722->3982|9964->4197|10009->4225|10049->4226|10083->4232|10811->4933|10869->4974|10909->4975|10944->4982|11104->5114|11144->5143|11176->5145|11188->5146|11260->5193|11291->5194|11415->5290|11426->5291|11483->5325|11613->5427|11624->5428|11692->5473|11817->5570|11857->5599|11890->5602|11902->5603|11976->5652|12101->5749|12112->5750|12153->5768|12228->5812|12262->5818|12335->5863|12359->5865|12423->5898|12460->5907|12489->5908|12524->5912|12554->5914|12583->5915
                  LINES: 26->1|28->4|28->4|29->1|30->2|30->2|30->2|30->2|31->4|32->5|32->5|32->5|33->6|34->7|34->7|35->8|35->8|36->9|36->9|36->9|37->10|40->13|40->13|40->13|41->14|49->22|49->22|49->22|50->23|51->24|52->25|52->25|52->25|53->26|54->27|55->28|55->28|55->28|56->29|58->31|59->32|63->36|63->36|63->36|64->37|65->38|65->38|65->38|65->38|65->38|65->38|65->38|66->39|66->39|66->39|67->40|67->40|67->40|68->41|68->41|68->41|68->41|69->42|69->42|69->42|70->43|71->44|72->45|72->45|72->45|72->45|74->47|74->47|74->47|75->48|75->48|75->48|75->48|76->49|77->50|77->50|77->50|78->51|78->51|78->51|79->52|80->53|80->53|80->53|81->54|81->54|81->54|81->54|81->54|82->55|83->56|84->57|84->57|84->57|85->58|87->60|87->60|87->60|88->61|89->62|89->62|89->62|90->63|90->63|90->63|92->65|93->66|95->68|98->71|99->72|99->72|99->72|100->73|100->73|100->73|100->73|100->73|100->73|100->73|101->74|102->75|102->75|102->75|103->76|103->76|103->76|103->76|103->76|103->76|103->76|104->77|105->78|105->78|105->78|106->79|106->79|106->79|106->79|106->79|106->79|106->79|107->80|109->82|112->85|113->86|116->89|117->90|118->91|122->95|123->96|123->96|124->97|124->97|124->97|125->98|126->99|126->99|126->99|126->99|126->99|126->99|127->100|129->102|129->102|130->103|130->103|130->103|130->103|130->103|130->103|130->103|131->104|138->111|138->111|138->111|139->112|139->112|139->112|139->112|139->112|140->113|140->113|140->113|140->113|141->114|141->114|141->114|142->115|142->115|143->116|144->117|144->117|146->119|146->119|146->119|146->119|146->119|146->119|146->119|147->120|152->125|152->125|152->125|153->126|161->134|161->134|161->134|162->135|163->136|163->136|163->136|163->136|163->136|163->136|164->137|164->137|164->137|165->138|165->138|165->138|166->139|166->139|166->139|166->139|166->139|167->140|167->140|167->140|169->142|170->143|171->144|171->144|172->145|174->147|174->147|175->148|176->149|176->149
                  -- GENERATED --
              */
          