
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
object listRecursoevaluador extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Recurso],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(recurso: List[Recurso]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import models._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};
Seq[Any](format.raw/*1.26*/("""
 """),format.raw/*2.2*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*2.47*/routes/*2.53*/.Assets.at("stylesheets/recurso.css")),format.raw/*2.90*/(""""/> 
"""),format.raw/*5.83*/(""" 

"""),_display_(/*7.2*/main/*7.6*/{_display_(Seq[Any](format.raw/*7.7*/("""
"""),format.raw/*8.1*/("""<div style="background-color: white; padding: 10px;">

	<h3>Todas mis asignaciones</h3>
	"""),_display_(/*11.3*/flashes()),format.raw/*11.12*/("""
	"""),format.raw/*12.2*/("""<div class="table-responsive">
		<table class="table table-bordered table-strpped">
			<thead>
				<tr>
					<th>Título</th>
					<th>Clave control</th>
					<th>Tipo recurso</th>
					<th>Fecha límite para evaluar</th>
					<th>Aspecto / estado</th>
				</tr>
			</thead>
			<tbody>
				"""),_display_(/*24.6*/for(r <- recurso ) yield /*24.24*/{_display_(Seq[Any](format.raw/*24.25*/("""
				"""),format.raw/*25.5*/("""<tr>
					<td><a
						href=""""),_display_(/*27.14*/routes/*27.20*/.EvaluacionEvaluadorController.verDetalle(r.id)),format.raw/*27.67*/("""">
							"""),_display_(/*28.9*/r/*28.10*/.titulo),format.raw/*28.17*/(""" """),format.raw/*28.18*/("""</a></td>
					<td>"""),_display_(/*29.11*/r/*29.12*/.numcontrol),format.raw/*29.23*/("""</td>
					<td>"""),_display_(/*30.11*/if(r.clasificacion.tiporecurso !=null)/*30.49*/{_display_(_display_(/*30.51*/r/*30.52*/.clasificacion.tiporecurso.descripcion))}),format.raw/*30.91*/("""</td>
					<td>
					   """),_display_(/*32.10*/r/*32.11*/.evaluacionFecha.fechalimite.format("dd/MM/YYYY")),format.raw/*32.60*/("""
					   """),_display_(/*33.10*/for(reva<-r.recursoevaluadores) yield /*33.41*/{_display_(Seq[Any](format.raw/*33.42*/("""
					       """),_display_(/*34.14*/for(pr<-reva.prorrogas) yield /*34.37*/{_display_(Seq[Any](format.raw/*34.38*/("""
					           """),_display_(/*35.18*/if(pr.autorizado==true)/*35.41*/{_display_(Seq[Any](format.raw/*35.42*/("""
					               """),format.raw/*36.21*/("""<br>"""),_display_(/*36.26*/pr/*36.28*/.fecha.format("dd/MM/YYYY")),format.raw/*36.55*/(""" """),format.raw/*36.56*/("""prórroga<br>
					           """)))}),format.raw/*37.18*/("""
					       """)))}),format.raw/*38.14*/("""
					   """)))}),format.raw/*39.10*/("""
					"""),format.raw/*40.6*/("""</td>
					<td>
						<div style="display: table; width: 100%">

"""),_display_(/*44.2*/System/*44.8*/.out.println("* * * *")),format.raw/*44.31*/("""
							"""),_display_(/*45.9*/for(re <- r.recursoevaluadores) yield /*45.40*/{_display_(Seq[Any](format.raw/*45.41*/("""
							 """),format.raw/*46.9*/("""<div style="display: table-row;">
                                <div style="display:table-cell;">"""),_display_(/*47.67*/re/*47.69*/.aspecto.descripcion),format.raw/*47.89*/("""</div>
                                <div style="display:table-cell;">"""),_display_(/*48.67*/re/*48.69*/.estadoevaluacion.descripcion),format.raw/*48.98*/("""</div>
                                <div style="display:table-cell;">
                                    <!-- // No esta en solicitudes de cancelación ni en cancelados -->
                                    """),_display_(/*51.38*/if(   r.estado.id != 400 && r.estado.id != 401  && r.estado.id != 402)/*51.108*/{_display_(Seq[Any](format.raw/*51.109*/("""
                                        """),format.raw/*52.41*/("""<!-- Esta en tiempo y sin oficio de valoración y sin solicitudes de prórroga y (en estado evaluacion 1 o estado evaluacion 2)-->
                                        """),_display_(/*53.42*/if(!re.fueraDeTiempo && r.estado.id!=110 && re.prorrogas.isEmpty && (re.estadoevaluacion.id == 1L || re.estadoevaluacion.id == 2L))/*53.173*/{_display_(Seq[Any](format.raw/*53.174*/("""
                                            """),_display_(/*54.46*/if(re.estadoevaluacion.id == 1L)/*54.78*/{_display_(Seq[Any](format.raw/*54.79*/("""
                                                """),_display_(/*55.50*/if(re.evaluador.personal.activo.id == 1)/*55.90*/{_display_(Seq[Any](format.raw/*55.91*/("""
                                                    """),format.raw/*56.53*/("""Su cuenta esta deshabilitada para evaluar.
                                                """)))}/*57.50*/else/*57.54*/{_display_(Seq[Any](format.raw/*57.55*/("""
                                                    """),format.raw/*58.53*/("""<a class="btn btn-primary btn-block" href="/evCreate?id="""),_display_(/*58.110*/r/*58.111*/.id),format.raw/*58.114*/("""&idAspecto="""),_display_(/*58.126*/re/*58.128*/.aspecto.id),format.raw/*58.139*/("""" role="button">Iniciar evaluación</a>
                                                """)))}),format.raw/*59.50*/("""
                                            """)))}),format.raw/*60.46*/("""
                                            """),_display_(/*61.46*/if(re.estadoevaluacion.id == 2L)/*61.78*/{_display_(Seq[Any](format.raw/*61.79*/("""
                                                """),_display_(/*62.50*/if(re.evaluador.personal.activo.id == 1)/*62.90*/{_display_(Seq[Any](format.raw/*62.91*/("""
                                                    """),format.raw/*63.53*/("""Su cuenta esta deshabilitada para evaluar.
                                                """)))}/*64.50*/else/*64.54*/{_display_(Seq[Any](format.raw/*64.55*/(""" 
                                                    """),format.raw/*65.53*/("""<a class="btn btn-primary btn-block"  href="/evEdit?id="""),_display_(/*65.109*/r/*65.110*/.id),format.raw/*65.113*/("""&idAspecto="""),_display_(/*65.125*/re/*65.127*/.aspecto.id),format.raw/*65.138*/("""" role="button">Continuar evaluación</a>
                                                """)))}),format.raw/*66.50*/("""
                                            """)))}),format.raw/*67.46*/("""
                                        """)))}),format.raw/*68.42*/("""
                                        """),format.raw/*69.41*/("""<!-- Si esta fuera de tiempo y sin oficio de valoración y sin solicitudes de prórroga -->
                                        """),_display_(/*70.42*/if(re.fueraDeTiempo && r.estado.id!=110 && re.prorrogas.isEmpty && r.estado.id<10  && re.estadoevaluacion.id<5)/*70.153*/{_display_(Seq[Any](format.raw/*70.154*/("""
	                                        """),_display_(/*71.43*/form(CSRF(routes.EvaluacionEvaluadorController.solicitarProrroga(re.id, re.aspecto.id, 10)), 'rol->"form")/*71.149*/ {_display_(Seq[Any](format.raw/*71.151*/("""   
	                                            """),format.raw/*72.46*/("""<input type="submit" class="btn btn-warning" value="Solicitar prórroga">
	                                        """)))}),format.raw/*73.43*/("""                                        
                                        """)))}),format.raw/*74.42*/("""
                                        
"""),_display_(/*76.2*/System/*76.8*/.out.println(re.fueraDeTiempo+" .  "+r.estado.id+" . "+re.prorrogas.isEmpty)),format.raw/*76.84*/("""                                        
                                        """),format.raw/*77.41*/("""<!-- Si no esta fuera de tiempo y sin oficio de valoración y con solicitudes de prórroga sin autorizar-->
                                        """),_display_(/*78.42*/if(!re.fueraDeTiempo && r.estado.id!=110 && !re.prorrogas.isEmpty)/*78.108*/{_display_(Seq[Any](format.raw/*78.109*/("""                                        
                                            """),_display_(/*79.46*/if(re.prorrogas.last.autorizado == false)/*79.87*/{_display_(Seq[Any](format.raw/*79.88*/("""
                                                """),format.raw/*80.49*/("""Con solicitud de prórroga pendiente por aceptar
                                            """)))}),format.raw/*81.46*/("""
                                        """)))}),format.raw/*82.42*/("""
                                        
                                        """),format.raw/*84.41*/("""<!-- Si no esta fuera de tiempo y sin oficio de valoración y con solicitudes de prórroga autorizarada-->
                                        """),_display_(/*85.42*/if(!re.fueraDeTiempo && r.estado.id!=110 && !re.prorrogas.isEmpty)/*85.108*/{_display_(Seq[Any](format.raw/*85.109*/("""                                        
                                            """),_display_(/*86.46*/if(re.prorrogas.last.autorizado == true)/*86.86*/{_display_(Seq[Any](format.raw/*86.87*/("""
                                                """),_display_(/*87.50*/if(re.estadoevaluacion.id==1L)/*87.80*/{_display_(Seq[Any](format.raw/*87.81*/("""
                                                    """),_display_(/*88.54*/if(re.evaluador.personal.activo.id == 1)/*88.94*/{_display_(Seq[Any](format.raw/*88.95*/("""
                                                        """),format.raw/*89.57*/("""Su cuenta esta deshabilitada para evaluar.
                                                    """)))}/*90.54*/else/*90.58*/{_display_(Seq[Any](format.raw/*90.59*/(""" 
                                                        """),format.raw/*91.57*/("""<a class="btn btn-primary btn-block" href="/evCreate?id="""),_display_(/*91.114*/r/*91.115*/.id),format.raw/*91.118*/("""&idAspecto="""),_display_(/*91.130*/re/*91.132*/.aspecto.id),format.raw/*91.143*/("""" role="button">Iniciar evaluación</a>
                                                    """)))}),format.raw/*92.54*/("""
                                                """)))}),format.raw/*93.50*/("""
                                                """),_display_(/*94.50*/if(re.estadoevaluacion.id==2L)/*94.80*/{_display_(Seq[Any](format.raw/*94.81*/("""
                                                    """),_display_(/*95.54*/if(re.evaluador.personal.activo.id == 1)/*95.94*/{_display_(Seq[Any](format.raw/*95.95*/("""
                                                        """),format.raw/*96.57*/("""Su cuenta esta deshabilitada para evaluar.
                                                    """)))}/*97.54*/else/*97.58*/{_display_(Seq[Any](format.raw/*97.59*/(""" 
                                                        """),format.raw/*98.57*/("""<a class="btn btn-primary btn-block"  href="/evEdit?id="""),_display_(/*98.113*/r/*98.114*/.id),format.raw/*98.117*/("""&idAspecto="""),_display_(/*98.129*/re/*98.131*/.aspecto.id),format.raw/*98.142*/("""" role="button">Continuar evaluación</a>
                                                    """)))}),format.raw/*99.54*/("""
                                                """)))}),format.raw/*100.50*/("""                                                    
                                            """)))}),format.raw/*101.46*/("""
                                        """)))}),format.raw/*102.42*/("""                                        
                                    """)))}),format.raw/*103.38*/("""
                                """),format.raw/*104.33*/("""</div>							 
							 </div>
							""")))}),format.raw/*106.9*/("""
						"""),format.raw/*107.7*/("""</div>
					</td>
				</tr>
				""")))}),format.raw/*110.6*/("""
			"""),format.raw/*111.4*/("""</tbody>
		</table>
	</div>


</div>
""")))}),format.raw/*117.2*/("""



"""),format.raw/*121.1*/("""<script type="text/javascript">

</script>"""))}
  }

  def render(recurso:List[Recurso]): play.twirl.api.HtmlFormat.Appendable = apply(recurso)

  def f:((List[Recurso]) => play.twirl.api.HtmlFormat.Appendable) = (recurso) => apply(recurso)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/EvaluacionEvaluador/listRecursoevaluador.scala.html
                  HASH: a78ac1e43231b8b191f36fa4164e1e73ad33e636
                  MATRIX: 765->1|900->155|932->179|1019->25|1047->27|1118->72|1132->78|1189->115|1221->236|1250->240|1261->244|1298->245|1325->246|1441->336|1471->345|1500->347|1815->636|1849->654|1888->655|1920->660|1977->690|1992->696|2060->743|2097->754|2107->755|2135->762|2164->763|2211->783|2221->784|2253->795|2296->811|2343->849|2373->851|2383->852|2445->891|2497->916|2507->917|2577->966|2614->976|2661->1007|2700->1008|2741->1022|2780->1045|2819->1046|2864->1064|2896->1087|2935->1088|2984->1109|3016->1114|3027->1116|3075->1143|3104->1144|3165->1174|3210->1188|3251->1198|3284->1204|3376->1270|3390->1276|3434->1299|3469->1308|3516->1339|3555->1340|3591->1349|3718->1449|3729->1451|3770->1471|3870->1544|3881->1546|3931->1575|4171->1788|4251->1858|4291->1859|4360->1900|4557->2070|4698->2201|4738->2202|4811->2248|4852->2280|4891->2281|4968->2331|5017->2371|5056->2372|5137->2425|5248->2517|5261->2521|5300->2522|5381->2575|5466->2632|5477->2633|5502->2636|5542->2648|5554->2650|5587->2661|5706->2749|5783->2795|5856->2841|5897->2873|5936->2874|6013->2924|6062->2964|6101->2965|6182->3018|6293->3110|6306->3114|6345->3115|6427->3169|6511->3225|6522->3226|6547->3229|6587->3241|6599->3243|6632->3254|6753->3344|6830->3390|6903->3432|6972->3473|7130->3604|7251->3715|7291->3716|7361->3759|7477->3865|7518->3867|7595->3916|7741->4031|7854->4113|7923->4156|7937->4162|8034->4238|8143->4319|8317->4466|8393->4532|8433->4533|8546->4619|8596->4660|8635->4661|8712->4710|8836->4803|8909->4845|9019->4927|9192->5073|9268->5139|9308->5140|9421->5226|9470->5266|9509->5267|9586->5317|9625->5347|9664->5348|9745->5402|9794->5442|9833->5443|9918->5500|10033->5596|10046->5600|10085->5601|10171->5659|10256->5716|10267->5717|10292->5720|10332->5732|10344->5734|10377->5745|10500->5837|10581->5887|10658->5937|10697->5967|10736->5968|10817->6022|10866->6062|10905->6063|10990->6120|11105->6216|11118->6220|11157->6221|11243->6279|11327->6335|11338->6336|11363->6339|11403->6351|11415->6353|11448->6364|11573->6458|11655->6508|11785->6606|11859->6648|11969->6726|12031->6759|12100->6797|12135->6804|12199->6837|12231->6841|12300->6879|12332->6883
                  LINES: 26->1|29->5|29->5|30->1|31->2|31->2|31->2|31->2|32->5|34->7|34->7|34->7|35->8|38->11|38->11|39->12|51->24|51->24|51->24|52->25|54->27|54->27|54->27|55->28|55->28|55->28|55->28|56->29|56->29|56->29|57->30|57->30|57->30|57->30|57->30|59->32|59->32|59->32|60->33|60->33|60->33|61->34|61->34|61->34|62->35|62->35|62->35|63->36|63->36|63->36|63->36|63->36|64->37|65->38|66->39|67->40|71->44|71->44|71->44|72->45|72->45|72->45|73->46|74->47|74->47|74->47|75->48|75->48|75->48|78->51|78->51|78->51|79->52|80->53|80->53|80->53|81->54|81->54|81->54|82->55|82->55|82->55|83->56|84->57|84->57|84->57|85->58|85->58|85->58|85->58|85->58|85->58|85->58|86->59|87->60|88->61|88->61|88->61|89->62|89->62|89->62|90->63|91->64|91->64|91->64|92->65|92->65|92->65|92->65|92->65|92->65|92->65|93->66|94->67|95->68|96->69|97->70|97->70|97->70|98->71|98->71|98->71|99->72|100->73|101->74|103->76|103->76|103->76|104->77|105->78|105->78|105->78|106->79|106->79|106->79|107->80|108->81|109->82|111->84|112->85|112->85|112->85|113->86|113->86|113->86|114->87|114->87|114->87|115->88|115->88|115->88|116->89|117->90|117->90|117->90|118->91|118->91|118->91|118->91|118->91|118->91|118->91|119->92|120->93|121->94|121->94|121->94|122->95|122->95|122->95|123->96|124->97|124->97|124->97|125->98|125->98|125->98|125->98|125->98|125->98|125->98|126->99|127->100|128->101|129->102|130->103|131->104|133->106|134->107|137->110|138->111|144->117|148->121
                  -- GENERATED --
              */
          