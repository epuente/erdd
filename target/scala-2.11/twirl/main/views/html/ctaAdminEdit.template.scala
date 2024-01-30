
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
object ctaAdminEdit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Personal],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pForm: Form[Personal]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
	"""),format.raw/*8.2*/("""<div class=container-fluid style="background-color: white; padding: 10px" >
			<div class="row">
				<div class="col-lg-12">
					<ol class="breadcrumb">
					  <li>Catálogos</li>
					  <li class="active">Administrador del sistema</li>
					</ol>			
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12">
	  	          <h3>Administrador del sistema</h3>
		        </div>
			</div>    

		    """),_display_(/*23.8*/if(flash.containsKey("success"))/*23.40*/ {_display_(Seq[Any](format.raw/*23.42*/("""
		        """),format.raw/*24.11*/("""<div class="alert alert-success" role="alert">
		             """),_display_(/*25.17*/flash/*25.22*/.get("success")),format.raw/*25.37*/("""
		        """),format.raw/*26.11*/("""</div>
		    """)))}),format.raw/*27.8*/("""
		    
		    
			    """),_display_(/*30.9*/form(CSRF(routes.PersonalController.AdminUpdate()))/*30.60*/ {_display_(Seq[Any](format.raw/*30.62*/("""
			        
			        """),format.raw/*32.12*/("""<fieldset>
			        	<div class="row">
			        		<div class="col-md-6">
								<div class="panel panel-default">
								  <div class="panel-heading">
								    <h3 class="panel-title">Generales</h3>
								  </div>
								  <div class="panel-body">
					        			"""),_display_(/*40.18*/inputText(pForm("nombre"), '_label -> "Nombre", '_help -> "", 'size->"25px")),format.raw/*40.94*/("""
					        			"""),_display_(/*41.18*/inputText(pForm("paterno"), '_label -> "Paterno", '_help -> "", 'size->"25px")),format.raw/*41.96*/("""
					        			"""),_display_(/*42.18*/inputText(pForm("materno"), '_label -> "Materno", '_help -> "", 'size->"25px")),format.raw/*42.96*/("""
								  """),format.raw/*43.11*/("""</div>
								</div>			        		
			        		</div>
			        		<div class="col-md-6">
								<div class="panel panel-default">
								  <div class="panel-heading">
								    <h3 class="panel-title">Email y cuenta del sistema</h3>
								  </div>
								  <div class="panel-body">
										"""),_display_(/*52.12*/inputText(pForm("correo"), '_label -> "Correo electrónico", '_help -> "", 'size->"35px")),format.raw/*52.100*/("""
										"""),_display_(/*53.12*/inputText(pForm("usuario.usuario"), '_label -> "Nombre de usuario", '_help -> "", 'size->"25px")),format.raw/*53.108*/("""
										"""),_display_(/*54.12*/inputPassword(pForm("usuario.password"), '_label -> "Clave de acceso", '_help -> "", 'size->"25px")),format.raw/*54.111*/("""
										
								  """),format.raw/*56.11*/("""</div>
								</div>			        		
			        		</div>			        		
			        	</div>
			        </fieldset>
			        <div class="actions">
			        	<div class="row">
			        		<div class="col-md-1"></div>
			        		<div class="col-md-5"><input type="submit" value="Actualizar datos" class="btn btn-primary btn-block"></div>
			        		<div class="col-md-5"><a href=""""),_display_(/*65.46*/routes/*65.52*/.AdminController.index()),format.raw/*65.76*/("""" class="btn btn-default btn-block">Cancelar</a></div>
			        		<div class="col-md-1-md"></div>
			        	</div>
			        </div>
			    """)))}),format.raw/*69.9*/("""   
		       
    """),format.raw/*71.5*/("""</div> 
""")))}),format.raw/*72.2*/("""

"""),format.raw/*74.1*/("""<script type="text/javascript">
	$(function() """),format.raw/*75.15*/("""{"""),format.raw/*75.16*/("""	
		"""),format.raw/*76.3*/("""if ("""),_display_(/*76.8*/pForm/*76.13*/.field("usuario.password").value.length),format.raw/*76.52*/(""" """),format.raw/*76.53*/("""!=0)"""),format.raw/*76.57*/("""{"""),format.raw/*76.58*/("""
			"""),format.raw/*77.4*/("""$('[name="usuario.password"]').val('"""),_display_(/*77.41*/pForm/*77.46*/.field("usuario.password").value),format.raw/*77.78*/("""');
		"""),format.raw/*78.3*/("""}"""),format.raw/*78.4*/("""		
	"""),format.raw/*79.2*/("""}"""),format.raw/*79.3*/(""");
</script>
"""))}
  }

  def render(pForm:Form[Personal]): play.twirl.api.HtmlFormat.Appendable = apply(pForm)

  def f:((Form[Personal]) => play.twirl.api.HtmlFormat.Appendable) = (pForm) => apply(pForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/ctaAdminEdit.scala.html
                  HASH: 603b34865b37cb87d368e49417c10088e8619cfa
                  MATRIX: 738->1|856->45|888->69|972->24|1000->43|1028->123|1057->127|1068->131|1106->133|1134->135|1569->544|1610->576|1650->578|1689->589|1779->652|1793->657|1829->672|1868->683|1912->697|1961->720|2021->771|2061->773|2113->797|2417->1074|2514->1150|2559->1168|2658->1246|2703->1264|2802->1342|2841->1353|3170->1655|3280->1743|3319->1755|3437->1851|3476->1863|3597->1962|3647->1984|4056->2366|4071->2372|4116->2396|4291->2541|4336->2559|4375->2568|4404->2570|4478->2616|4507->2617|4538->2621|4569->2626|4583->2631|4643->2670|4672->2671|4704->2675|4733->2676|4764->2680|4828->2717|4842->2722|4895->2754|4928->2760|4956->2761|4987->2765|5015->2766
                  LINES: 26->1|28->5|28->5|29->1|31->4|32->5|34->7|34->7|34->7|35->8|50->23|50->23|50->23|51->24|52->25|52->25|52->25|53->26|54->27|57->30|57->30|57->30|59->32|67->40|67->40|68->41|68->41|69->42|69->42|70->43|79->52|79->52|80->53|80->53|81->54|81->54|83->56|92->65|92->65|92->65|96->69|98->71|99->72|101->74|102->75|102->75|103->76|103->76|103->76|103->76|103->76|103->76|103->76|104->77|104->77|104->77|104->77|105->78|105->78|106->79|106->79
                  -- GENERATED --
              */
          