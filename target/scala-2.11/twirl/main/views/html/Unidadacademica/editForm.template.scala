
package views.html.Unidadacademica

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
object editForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Unidadacademica],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, unidadacademicaForm: Form[Unidadacademica]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(myFieldConstructor.render) }};
Seq[Any](format.raw/*1.56*/("""
"""),format.raw/*3.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*3.46*/routes/*3.52*/.Assets.at("stylesheets/recurso.css")),format.raw/*3.89*/(""""/> 

"""),format.raw/*5.77*/(""" 

"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
	"""),format.raw/*8.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li><a href="/unidadacademica">Unidades académicas</a></li>
					  <li class="active">Editar</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">    
				    <h3>Editar Unidad Académica</h3>
					<div style="vertical-align: middle;"> 
						"""),_display_(/*22.8*/form(CSRF(routes.UnidadacademicaController.update(id)), 'class->"form-inline", 'id->"frmEdit"  )/*22.104*/ {_display_(Seq[Any](format.raw/*22.106*/("""
						  """),format.raw/*23.9*/("""<div class="form-group">
					    		"""),_display_(/*24.13*/inputText(unidadacademicaForm("nombre"), 'labelAlterna->"Nombre", '_help -> "", 'size->"80px", 'required->"required")),format.raw/*24.130*/("""
						  """),format.raw/*25.9*/("""</div>
						  <br>
                            <div class="form-group">
                              """),_display_(/*28.32*/inputCheckboxGroup(
                                 unidadacademicaForm("nivel"),
                                 options = options(models.Niveleducativo.options),                              
                                 '_label -> null                                                                                 
                              )),format.raw/*32.32*/("""
                           """),format.raw/*33.28*/("""</div>
                           <br><br>
                            <div class="form-group">
                              """),_display_(/*36.32*/inputCheckboxGroup(
                                 unidadacademicaForm("area"),
                                 options = options(models.Areaconocimiento.options),                              
                                 '_label -> null                                                                                 
                              )),format.raw/*40.32*/("""
                           """),format.raw/*41.28*/("""</div>                              
                           <br><br>						  
						  <button type="submit" class="btn btn-primary">Actualizar</button>
						""")))}),format.raw/*44.8*/("""
					"""),format.raw/*45.6*/("""</div>

				 """),_display_(/*47.7*/form(CSRF(routes.UnidadacademicaController.delete(id)), 'class -> "topRight", 'id->"frmDelete")/*47.102*/ {_display_(Seq[Any](format.raw/*47.104*/("""
						"""),format.raw/*48.7*/("""<input type="submit" value="Eliminar" class="btn btn-danger">
						<a href=""""),_display_(/*49.17*/routes/*49.23*/.UnidadacademicaController.list()),format.raw/*49.56*/("""" class="btn btn-default">Cancelar</a>
 					""")))}),format.raw/*50.8*/("""


    			"""),format.raw/*53.8*/("""</div>
			</div>
    </div>
""")))}),format.raw/*56.2*/("""
"""),_display_(/*57.2*/comunCatalogosJS("Edit", "Unidad académica")),format.raw/*57.46*/("""

"""),format.raw/*59.1*/("""<script type="text/javascript">
	"""),_display_(/*60.3*/for(ea <- unidadacademicaForm.get().niveles) yield /*60.47*/{_display_(Seq[Any](format.raw/*60.48*/("""
	    """),format.raw/*61.6*/("""$('#nivel_"""),_display_(/*61.17*/ea/*61.19*/.nivel.id),format.raw/*61.28*/("""').prop('checked',true);
	""")))}),format.raw/*62.3*/("""
    """),_display_(/*63.6*/for(ea <- unidadacademicaForm.get().areas) yield /*63.48*/{_display_(Seq[Any](format.raw/*63.49*/("""
        """),format.raw/*64.9*/("""$('#area_"""),_display_(/*64.19*/ea/*64.21*/.area.id),format.raw/*64.29*/("""').prop('checked',true);
    """)))}),format.raw/*65.6*/("""
"""),format.raw/*66.1*/("""</script>
"""))}
  }

  def render(id:Long,unidadacademicaForm:Form[Unidadacademica]): play.twirl.api.HtmlFormat.Appendable = apply(id,unidadacademicaForm)

  def f:((Long,Form[Unidadacademica]) => play.twirl.api.HtmlFormat.Appendable) = (id,unidadacademicaForm) => apply(id,unidadacademicaForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Unidadacademica/editForm.scala.html
                  HASH: 96b7f55ea7acd4ef9f39720a12bbf300a76ff400
                  MATRIX: 762->1|911->168|943->192|1024->55|1051->73|1122->118|1136->124|1193->161|1226->243|1255->247|1266->251|1304->253|1332->255|1823->720|1929->816|1970->818|2006->827|2070->864|2209->981|2245->990|2376->1094|2754->1451|2810->1479|2964->1606|3343->1964|3399->1992|3591->2154|3624->2160|3664->2174|3769->2269|3810->2271|3844->2278|3949->2356|3964->2362|4018->2395|4094->2441|4131->2451|4190->2480|4218->2482|4283->2526|4312->2528|4372->2562|4432->2606|4471->2607|4504->2613|4542->2624|4553->2626|4583->2635|4640->2662|4672->2668|4730->2710|4769->2711|4805->2720|4842->2730|4853->2732|4882->2740|4942->2770|4970->2771
                  LINES: 26->1|28->5|28->5|29->1|30->3|30->3|30->3|30->3|32->5|34->7|34->7|34->7|35->8|49->22|49->22|49->22|50->23|51->24|51->24|52->25|55->28|59->32|60->33|63->36|67->40|68->41|71->44|72->45|74->47|74->47|74->47|75->48|76->49|76->49|76->49|77->50|80->53|83->56|84->57|84->57|86->59|87->60|87->60|87->60|88->61|88->61|88->61|88->61|89->62|90->63|90->63|90->63|91->64|91->64|91->64|91->64|92->65|93->66
                  -- GENERATED --
              */
          