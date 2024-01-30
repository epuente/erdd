
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
object evaluacionPanelesForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Recursoevaluador,List[EvaluacionTabla],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(re: Recursoevaluador, cr :List[EvaluacionTabla]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.51*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<input type="text" id="terminado" name="terminado" style="display:none"/>
<input type="text" name="id" value="""),_display_(/*5.37*/re/*5.39*/.id),format.raw/*5.42*/(""" """),format.raw/*5.43*/("""style="display:none" />


<div id="content">

	<div class="row">
		"""),_display_(/*11.4*/if(Array(1,2).contains(re.estadoevaluacion.id))/*11.51*/{_display_(Seq[Any](format.raw/*11.52*/("""
			"""),format.raw/*12.4*/("""<div class="col-xs-12 col-sm-12 col-md-2 col-lg-2">
				<br>
				<div id="conteoAspecto">
				
                    Total de reactivos: <div id='todos' style='display:inline-block'></div><hr>
        
                    <ul class='list-group'>
                        <li class='list-group-item'>                        
                            Sin contestar: <div id='sinContestar' style='display:inline-block'></div>
                            <a  data-toggle='collapse' href='#acordionSinContestar' aria-expanded='false' aria-controls='acordionSinContestar' class="pull-right"> <div class="fa fa-chevron-down" aria-hidden="true" name="flechaDetalle"></div></a><br>
                            <div class='collapse' id='acordionSinContestar'>
                                <div class='panel-body'><div id='divCadenaSinContestar'></div></div>
                            </div>                     
                        </li>
                        <li class='list-group-item'>
                            No aplican:<div id='noAplican' style='display:inline-block'></div>                        
                            <a  data-toggle='collapse' href='#acordionNoAplican' aria-expanded='false' aria-controls='acordionNoAplican' class="pull-right"> <div class="fa fa-chevron-down" aria-hidden="true" name="flechaDetalle"></div>  </a><br>
                            <div class='collapse' id='acordionNoAplican'>
                                <div class='panel-body'>  <div id='divCadenaNoAplican'></div>  </div>
                            </div>                     
                        </li>
                        <li class='list-group-item'>
                            No cumplen: <div id='noCumple' style='display:inline-block'></div>
                            <a  data-toggle='collapse' href='#acordionNoCumple' aria-expanded='false' aria-controls='acordionNoCumple' class="pull-right"> <div class="fa fa-chevron-down" aria-hidden="true" name="flechaDetalle"></div></a><br>
                            <div class='collapse' id='acordionNoCumple'>
                                <div class='panel-body'><div id='divCadenaNoCumple'></div></div>
                            </div>                      
                        </li>                    
                        <li class='list-group-item'>
                            Cumplen parcialmente: <div id='parcialmenteCumple' style='display:inline-block'></div>
                            <a  data-toggle='collapse' href='#acordionParcialmenteCumple' aria-expanded='false' aria-controls='acordionParcialmenteCumple' class="pull-right"> <div class="fa fa-chevron-down" aria-hidden="true" name="flechaDetalle"></div></a><br>
                            <div class='collapse' id='acordionParcialmenteCumple'>
                                <div class='panel-body'>  <div id='divCadenaParcialmenteCumple'></div></div>
                            </div>
                        </li>
                        <li class='list-group-item'>
                            Si cumplen:   <div id='siCumple' style='display:inline-block'></div>
                            <a  data-toggle='collapse' href='#acordionSiCumple' aria-expanded='false' aria-controls='acordionSiCumple' class="pull-right"> <div class="fa fa-chevron-down" aria-hidden="true" name="flechaDetalle"></div></a><br>
                            <div class='collapse' id='acordionSiCumple'>
                                <div class='panel-body'>  <div id='divCadenaSiCumple'></div>  </div>
                            </div>                     
                        </li>                    
                    </ul> 				
				</div>
			</div>
		""")))}),format.raw/*57.4*/("""
		"""),_display_(/*58.4*/if(Array(1,2).contains(re.estadoevaluacion.id))/*58.51*/{_display_(Seq[Any](format.raw/*58.52*/("""
		"""),format.raw/*59.3*/("""<div class="col-xs-12 col-sm-12 col-md-10 col-lg-10">
			<div class="row">
		""")))}),format.raw/*61.4*/("""
				"""),format.raw/*62.5*/("""<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
					<div id="carouselId"""),_display_(/*63.26*/re/*63.28*/.aspecto.id),format.raw/*63.39*/("""" class="carousel slide" data-ride="carousel" data-interval="false" data-wrap="false">
						<!-- Indicators -->
						
						<!-- Wrapper for slides -->
						<div class="carousel-inner" role="listbox">
							<div class="item active">
								<div class="row">			
									"""),_display_(/*70.11*/for((c,i) <- cr.zipWithIndex) yield /*70.40*/{_display_(Seq[Any](format.raw/*70.41*/("""
										"""),format.raw/*71.11*/("""<div class="col-xs-12 col-sm-12 col-md-3 col-lg-3">
											<div class="panel panel-default">
												<div class="panel-heading">
													<div class="panel-title"><small>Id reactivo: """),_display_(/*74.60*/c/*74.61*/.reactivo.id),format.raw/*74.73*/("""</small></div>
												</div>
												<div class="panel-body">
													<div class="row">
														<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
															"""),_display_(/*79.17*/c/*79.18*/.reactivo.descripcion),format.raw/*79.39*/("""
														"""),format.raw/*80.15*/("""</div>
													</div>
													<div class="row">
														<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12"><br></div>
													</div>
													<div class="row">
														<div class="col-xs-7 col-sm-7 col-md-7 col-lg-7">
															<input type="radio" name="califica"""),_display_(/*87.51*/c/*87.52*/.id),format.raw/*87.55*/("""" value="-1" style="display: none;">
															<input type="radio" name="califica"""),_display_(/*88.51*/c/*88.52*/.id),format.raw/*88.55*/("""" value="0" class="activo"> No cumple</br>
															<input type="radio" name="califica"""),_display_(/*89.51*/c/*89.52*/.id),format.raw/*89.55*/("""" value="1" class="activo"> Cumple parcialmente</br>
															<input type="radio" name="califica"""),_display_(/*90.51*/c/*90.52*/.id),format.raw/*90.55*/("""" value="2" class="activo"> Sí cumple
															<input type="text" name="respuesta"""),_display_(/*91.51*/c/*91.52*/.id),format.raw/*91.55*/("""" id="respuesta"""),_display_(/*91.71*/c/*91.72*/.id),format.raw/*91.75*/("""" style="display: none;">						  		
														</div>
														<div class="col-xs-5 col-sm-5 col-md-5 col-lg-5">
															<div>
																<input type="button" value="No aplica" class="btn btn-primary btn-block btn-xs" id="btnNA_"""),_display_(/*95.108*/c/*95.109*/.id),format.raw/*95.112*/("""">
															</div>
														</div>
													</div>
												</div>
											</div>				
										</div>
										"""),_display_(/*102.12*/if(i != 0)/*102.22*/{_display_(Seq[Any](format.raw/*102.23*/("""
											"""),_display_(/*103.13*/if( (  (i+1) % (4) )==0   )/*103.40*/ {_display_(Seq[Any](format.raw/*103.42*/("""
												"""),format.raw/*104.13*/("""</div>
												"""),_display_(/*105.14*/if(   (i+1)%(4*2)==0   )/*105.38*/{_display_(Seq[Any](format.raw/*105.39*/("""
													"""),format.raw/*106.14*/("""</div>
													<div class="item">
												""")))}),format.raw/*108.14*/("""							
												"""),format.raw/*109.13*/("""<div class="row">
											""")))}),format.raw/*110.13*/("""
										""")))}),format.raw/*111.12*/("""
				
									""")))}),format.raw/*113.11*/("""
								"""),format.raw/*114.9*/("""</div>
						</div>
						
						
						
						
						<div class="row" name="divRowObservacionGral">
							<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
								<textarea class="form-control" style="min-width: 100%" placeholder="Escriba una observación general (opcional)" name="observacionGral-"""),_display_(/*122.144*/re/*122.146*/.recurso.id),format.raw/*122.157*/("""-"""),_display_(/*122.159*/re/*122.161*/.aspecto.id),format.raw/*122.172*/("""" ></textarea>
							</div>
						</div>
							 
							 
						<div class="row">
							<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1"></div>
							<div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
								<table class="table" id="tablaNavegaCarousel"""),_display_(/*130.54*/re/*130.56*/.aspecto.id),format.raw/*130.67*/("""">	
								</table>
							</div>				
							<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1"></div>
						</div>				 
					 
					</div>
				</div>
			"""),_display_(/*138.5*/if(Array(1,2).contains(re.estadoevaluacion.id))/*138.52*/{_display_(Seq[Any](format.raw/*138.53*/("""
			"""),format.raw/*139.4*/("""</div>
			""")))}),format.raw/*140.5*/("""	
				
			"""),format.raw/*142.4*/("""<div class="row">
				<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
					<input type="submit" value="Guardar la evaluación y continuar más tarde" class="btn btn-primary btn-block btn-md center-block"  id="btnEvaluar" style="width:90%">		
				</div>
				<div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
					<input type="button" value="Solicitar la cancelación de este recurso" class="btn btn-danger btn-block btn-md center-block"  id="btnCancelar" style="width:90%">		
				</div>
				
			</div>	
			"""),_display_(/*151.5*/if(Array(1,2).contains(re.estadoevaluacion.id))/*151.52*/{_display_(Seq[Any](format.raw/*151.53*/("""
		"""),format.raw/*152.3*/("""</div>	
		""")))}),format.raw/*153.4*/("""
	"""),format.raw/*154.2*/("""</div>	



	


</div>



</div>




"""))}
  }

  def render(re:Recursoevaluador,cr:List[EvaluacionTabla]): play.twirl.api.HtmlFormat.Appendable = apply(re,cr)

  def f:((Recursoevaluador,List[EvaluacionTabla]) => play.twirl.api.HtmlFormat.Appendable) = (re,cr) => apply(re,cr)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/EvaluacionEvaluador/evaluacionPanelesForm.scala.html
                  HASH: 9f8e84371fdd3e51526e73606660527d623481cd
                  MATRIX: 791->1|943->50|970->68|997->69|1133->179|1143->181|1166->184|1194->185|1288->253|1344->300|1383->301|1414->305|5142->4003|5172->4007|5228->4054|5267->4055|5297->4058|5405->4136|5437->4141|5543->4220|5554->4222|5586->4233|5889->4509|5934->4538|5973->4539|6012->4550|6235->4746|6245->4747|6278->4759|6491->4945|6501->4946|6543->4967|6586->4982|6914->5283|6924->5284|6948->5287|7062->5374|7072->5375|7096->5378|7216->5471|7226->5472|7250->5475|7380->5578|7390->5579|7414->5582|7529->5670|7539->5671|7563->5674|7606->5690|7616->5691|7640->5694|7917->5943|7928->5944|7953->5947|8116->6082|8136->6092|8176->6093|8217->6106|8254->6133|8295->6135|8337->6148|8385->6168|8419->6192|8459->6193|8502->6207|8586->6259|8635->6279|8697->6309|8741->6321|8789->6337|8826->6346|9160->6651|9173->6653|9207->6664|9238->6666|9251->6668|9285->6679|9574->6940|9586->6942|9619->6953|9800->7107|9857->7154|9897->7155|9929->7159|9971->7170|10009->7180|10545->7689|10602->7736|10642->7737|10673->7740|10715->7751|10745->7753
                  LINES: 26->1|29->1|30->3|31->4|32->5|32->5|32->5|32->5|38->11|38->11|38->11|39->12|84->57|85->58|85->58|85->58|86->59|88->61|89->62|90->63|90->63|90->63|97->70|97->70|97->70|98->71|101->74|101->74|101->74|106->79|106->79|106->79|107->80|114->87|114->87|114->87|115->88|115->88|115->88|116->89|116->89|116->89|117->90|117->90|117->90|118->91|118->91|118->91|118->91|118->91|118->91|122->95|122->95|122->95|129->102|129->102|129->102|130->103|130->103|130->103|131->104|132->105|132->105|132->105|133->106|135->108|136->109|137->110|138->111|140->113|141->114|149->122|149->122|149->122|149->122|149->122|149->122|157->130|157->130|157->130|165->138|165->138|165->138|166->139|167->140|169->142|178->151|178->151|178->151|179->152|180->153|181->154
                  -- GENERATED --
              */
          