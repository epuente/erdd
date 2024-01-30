
package views.html.Evaluador

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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Personal],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(p: List[Personal]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._

Seq[Any](format.raw/*1.21*/("""
"""),format.raw/*3.1*/("""

"""),format.raw/*5.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.46*/routes/*5.52*/.Assets.at("stylesheets/rotating-card.css")),format.raw/*5.95*/(""""/> 
<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*6.62*/routes/*6.68*/.Assets.at("font-awesome-4.4.0/css/font-awesome.min.css")),format.raw/*6.125*/(""""> 

"""),_display_(/*8.2*/main/*8.6*/{_display_(Seq[Any](format.raw/*8.7*/("""

"""),format.raw/*10.1*/("""<div class=container-fluid style="background-color: white; padding: 10px;">
	<div class="row">
		<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			<ol class="breadcrumb">
			  <li>Evaluadores</li>
			  <li class="active">Listar</li>
			</ol>			
		</div>
	</div>
	<div class="row">
		<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
		          <h3>Listar evaluadores</h3>	  	           
	       </div>
	</div>
	<div class="row">
		<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			"""),_display_(/*26.5*/flashes()),format.raw/*26.14*/("""
		"""),format.raw/*27.3*/("""</div>
	</div>	   
	<div class="row">
		<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			"""),_display_(/*31.5*/if(p.isEmpty)/*31.18*/{_display_(Seq[Any](format.raw/*31.19*/("""
				"""),format.raw/*32.5*/("""<h1>No hay evaluadores registrados</h1>
			""")))}/*33.6*/else/*33.11*/{_display_(Seq[Any](format.raw/*33.12*/("""
				"""),format.raw/*34.5*/("""<table class="tablaEncabezado">
					<tr>
						<td class="boton">
							<form action=""""),_display_(/*37.23*/routes/*37.29*/.EvaluadorController.create()),format.raw/*37.58*/("""">
								<input type="submit" value="Agregar evaluador" class="btn primary btn-primary">
							</form>  
						</td>
					</tr>
				</table>
				<table class="table table-striped table-bordered table-hover">
					<thead>
						<tr>
							<th>Paterno</th>
							<th>Materno</th>
							<th>Nombre</th>							
							<th>Aspectos</th>
							<th>Estado</th>
							<th></th>
							<th></th>
						</tr>
					</thead>
				
					<tbody>
						"""),_display_(/*57.8*/for(p <- p) yield /*57.19*/ {_display_(Seq[Any](format.raw/*57.21*/("""
							"""),format.raw/*58.8*/("""<tr>
								<td>"""),_display_(/*59.14*/p/*59.15*/.paterno),format.raw/*59.23*/("""</td>
								<td>"""),_display_(/*60.14*/p/*60.15*/.materno),format.raw/*60.23*/("""</td>
								<td>"""),_display_(/*61.14*/p/*61.15*/.nombre),format.raw/*61.22*/("""</td>								
								<td>
								"""),_display_(/*63.10*/for(a <- p.evaluador.evaluadoraspectos) yield /*63.49*/{_display_(Seq[Any](format.raw/*63.50*/("""
									"""),format.raw/*64.10*/("""<div>"""),_display_(/*64.16*/a/*64.17*/.aspecto.descripcion),format.raw/*64.37*/("""</div>
								""")))}),format.raw/*65.10*/("""
								"""),format.raw/*66.9*/("""</td>
								<td>"""),_display_(/*67.14*/p/*67.15*/.activo.descripcion),format.raw/*67.34*/("""</td>
		 						<td><button type="button" class="btn btn-primary btn-sm" name="btnEdit"""),_display_(/*68.81*/p/*68.82*/.id.toString),format.raw/*68.94*/("""">Editar</button></td>
								<td>
									"""),_display_(/*70.11*/form(CSRF(routes.EvaluadorController.delete(p.id)), 'class -> "topRight")/*70.84*/ {_display_(Seq[Any](format.raw/*70.86*/("""						
										"""),format.raw/*71.11*/("""<button type="button" class="btn btn-primary btn-sm" name="btnDelete"""),_display_(/*71.80*/p/*71.81*/.id.toString),format.raw/*71.93*/("""">Eliminar</button>
										""")))}),format.raw/*72.12*/("""
								"""),format.raw/*73.9*/("""</td>								
							</tr>
						""")))}),format.raw/*75.8*/("""
					"""),format.raw/*76.6*/("""</tbody>
				</table>
				
				<div class="row" style="display:none">
				
                        """),_display_(/*81.26*/for(p <- p) yield /*81.37*/ {_display_(Seq[Any](format.raw/*81.39*/("""
                            """),format.raw/*82.29*/("""<div class="col-xs-12 col-sm-12 col-md-3 col-lg-3">
                            
					             <div class="card-container manual-flip">
					                     <div class="card">
					                       
					                         <div class="front">
					                             <div class="cover">
					                                 <img src="""),_display_(/*89.49*/routes/*89.55*/.Assets.at("images/rotating_card_thumb3.png")),format.raw/*89.100*/("""/>
					                             </div>
				                             
					                             <div class="user">
					                                 <img class="img-circle" src="""),_display_(/*93.68*/routes/*93.74*/.Assets.at("images/user.png")),format.raw/*93.103*/("""/>
					                             </div>
					                             <div class="content">
					                                 <div class="main">
					                                     <h3 class="name">"""),_display_(/*97.61*/(p.nombre+" "+p.paterno+" "+p.materno)),format.raw/*97.99*/("""</h3>
					                                     <p class="profession">Evaluador</p>
					            
					                                     <p class="text-center">Aspectos:</p>
					                                     
					                                     <div class="row">
					                                     
					                                     """),_display_(/*104.44*/for(ea<- models.Evaluador.find.fetch("evaluadoraspectos").where().eq("personal.id", p.id).findList()) yield /*104.145*/{_display_(Seq[Any](format.raw/*104.146*/("""
					                                       """),_display_(/*105.46*/for(a<-ea.evaluadoraspectos) yield /*105.74*/{_display_(Seq[Any](format.raw/*105.75*/("""
					                                           """),format.raw/*106.49*/("""<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">"""),_display_(/*106.99*/a/*106.100*/.aspecto.descripcion),format.raw/*106.120*/("""</div>					                                           
					                                       """)))}),format.raw/*107.46*/("""
					                                     """)))}),format.raw/*108.44*/("""
					                                     """),format.raw/*109.43*/("""</div>
					                                     </br>
					                                     
	                                                       <div class="social-links text-center">
	                                                           <a href="" name="btnDelete"""),_display_(/*113.88*/p/*113.89*/.id.toString),format.raw/*113.101*/("""" class=""><i class="fa fa-trash-o"></i></a>
	                                                           <a href="" name="btnEdit"""),_display_(/*114.86*/p/*114.87*/.id.toString),format.raw/*114.99*/("""" class=""><i class="fa fa-pencil"></i></a>
	                                                       </div>					                                     
					                                     
					                                 </div>
					                              </div>
				                                 <div class="footer">
					                                <button class="btn btn-simple" onclick="rotateCard(this)">
					                                    <i class="fa fa-mail-forward"></i> Recursos
					                                </button>
				                                 </div>
					                         </div> <!-- end front panel -->
					                         <div class="back">
					                             <div class="header">
					                                 <h5 class="motto">Recursos asignados</h5>
					                             </div>
					                             <div class="content">
					                                 <div class="main">					                                 
					                                   """),_display_(/*131.42*/for((r, ri)<-models.Recursoevaluador.find.where().eq("evaluador.id", p.id).findList().zipWithIndex) yield /*131.141*/{_display_(Seq[Any](format.raw/*131.142*/("""
					                                       """),format.raw/*132.45*/("""<div class="row" style="background-color:#"""),_display_(/*132.88*/if(ri%2 == 0)/*132.101*/{_display_(Seq[Any](format.raw/*132.102*/("""efefef""")))}/*132.109*/else/*132.113*/{_display_(Seq[Any](format.raw/*132.114*/("""cfcfcf""")))}),format.raw/*132.121*/("""">
					                                           <div class="col-xs-4">
					                                               """),_display_(/*134.54*/r/*134.55*/.recurso.numcontrol),format.raw/*134.74*/("""
					                                           """),format.raw/*135.49*/("""</div>
                                                               <div class="col-xs-4">
                                                                   """),_display_(/*137.69*/r/*137.70*/.recurso.titulo),format.raw/*137.85*/("""
                                                               """),format.raw/*138.64*/("""</div>					                                           
                                                               <div class="col-xs-4">
                                                                   """),_display_(/*140.69*/r/*140.70*/.aspecto.descripcion),format.raw/*140.90*/("""
                                                               """),format.raw/*141.64*/("""</div>                                                               
					                                       </div>
					                                       
					                                       
					                                   """)))}),format.raw/*145.42*/("""
					            
					                                 """),format.raw/*147.39*/("""</div>
					                             </div>
					                             <div class="footer">
						                            <button class="btn btn-simple" rel="tooltip" title="Flip Card" onclick="rotateCard(this)">
						                                <i class="fa fa-reply"></i> Regresar
						                            </button>
					                             
					                                 <div class="social-links text-center">
					                                     <a href="http://creative-tim.com" class="facebook"><i class="fa fa-facebook fa-fw"></i></a>
					                                     <a href="http://creative-tim.com" class="google"><i class="fa fa-google-plus fa-fw"></i></a>
					                                     <a href="http://creative-tim.com" class="twitter"><i class="fa fa-twitter fa-fw"></i></a>
					                                 </div>
					                             </div>
					                         </div> <!-- end back panel -->
					                     </div> <!-- end card -->
					                 </div> <!-- end card-container -->                             
                            
                            </div>
                        """)))}),format.raw/*165.26*/("""				
				
				"""),format.raw/*167.5*/("""</div>
			""")))}),format.raw/*168.5*/("""
			"""),format.raw/*169.4*/("""</div>
		</div>
		
		
		



		
		
		
		
</div>	
""")))}),format.raw/*182.2*/("""

"""),format.raw/*184.1*/("""<script type="text/javascript">
	$( document ).on( "click", "[name*='btnDelete']", function(e) """),format.raw/*185.64*/("""{"""),format.raw/*185.65*/("""
		"""),format.raw/*186.3*/("""e.preventDefault();
		 var num = $(this).attr('name').substring(9); 		  
		  if (confirm("¿Desea eliminar al evaluador?"))"""),format.raw/*188.50*/("""{"""),format.raw/*188.51*/("""
			"""),format.raw/*189.4*/("""$(this).parent().submit();	  
		  """),format.raw/*190.5*/("""}"""),format.raw/*190.6*/("""
		  
	"""),format.raw/*192.2*/("""}"""),format.raw/*192.3*/(""");
	
	
	$( document ).on( "click", "[name*='btnEdit']", function(e) """),format.raw/*195.62*/("""{"""),format.raw/*195.63*/("""
		"""),format.raw/*196.3*/("""e.preventDefault();
		 var num = $(this).attr('name').substring(7); 

		 $("form").get(0).setAttribute("action",'/evaluador/'+num+'/edit');
		 $("form").get(0).setAttribute("method","GET");
		 
		 $("form").get(0).submit();
		 
		 /*
		 
		 
			  $.ajax("""),format.raw/*207.13*/("""{"""),format.raw/*207.14*/("""                            """),format.raw/*207.42*/("""<button class="btn btn-simple" rel="tooltip" title="Flip Card" onclick="rotateCard(this)">
              <i class="fa fa-reply"></i> Back
              </button>

				  method: "GET",
				  url: "/evaluador/"+num+"/edit"
	
				"""),format.raw/*214.5*/("""}"""),format.raw/*214.6*/(""")
				  .success(function( data ) """),format.raw/*215.33*/("""{"""),format.raw/*215.34*/("""
					"""),format.raw/*216.6*/("""window.location.assign('/evaluador/'+num+'/edit');
				  """),format.raw/*217.7*/("""}"""),format.raw/*217.8*/(""")
				  
				  .error(function(data)"""),format.raw/*219.28*/("""{"""),format.raw/*219.29*/("""
				  	"""),format.raw/*220.8*/("""alert("error: "+data);
				  """),format.raw/*221.7*/("""}"""),format.raw/*221.8*/(""")		  

		  */
	"""),format.raw/*224.2*/("""}"""),format.raw/*224.3*/(""");	
	
    function rotateCard(btn)"""),format.raw/*226.29*/("""{"""),format.raw/*226.30*/("""
        """),format.raw/*227.9*/("""var $card = $(btn).closest('.card-container');
        console.log($card);
        if($card.hasClass('hover'))"""),format.raw/*229.36*/("""{"""),format.raw/*229.37*/("""
            """),format.raw/*230.13*/("""$card.removeClass('hover');
        """),format.raw/*231.9*/("""}"""),format.raw/*231.10*/(""" """),format.raw/*231.11*/("""else """),format.raw/*231.16*/("""{"""),format.raw/*231.17*/("""
            """),format.raw/*232.13*/("""$card.addClass('hover');
        """),format.raw/*233.9*/("""}"""),format.raw/*233.10*/("""
    """),format.raw/*234.5*/("""}"""),format.raw/*234.6*/("""
	
	
"""),format.raw/*237.1*/("""</script>
"""))}
  }

  def render(p:List[Personal]): play.twirl.api.HtmlFormat.Appendable = apply(p)

  def f:((List[Personal]) => play.twirl.api.HtmlFormat.Appendable) = (p) => apply(p)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Evaluador/list.scala.html
                  HASH: a42a64894ea33c6c9830d594b58bf93b5e2c50fb
                  MATRIX: 740->1|862->20|889->38|917->40|988->85|1002->91|1065->134|1157->200|1171->206|1249->263|1280->269|1291->273|1328->274|1357->276|1884->777|1914->786|1944->789|2068->887|2090->900|2129->901|2161->906|2223->951|2236->956|2275->957|2307->962|2423->1051|2438->1057|2488->1086|2960->1532|2987->1543|3027->1545|3062->1553|3107->1571|3117->1572|3146->1580|3192->1599|3202->1600|3231->1608|3277->1627|3287->1628|3315->1635|3378->1671|3433->1710|3472->1711|3510->1721|3543->1727|3553->1728|3594->1748|3641->1764|3677->1773|3723->1792|3733->1793|3773->1812|3886->1898|3896->1899|3929->1911|4002->1957|4084->2030|4124->2032|4169->2049|4265->2118|4275->2119|4308->2131|4370->2162|4406->2171|4470->2205|4503->2211|4630->2311|4657->2322|4697->2324|4754->2353|5147->2719|5162->2725|5229->2770|5454->2968|5469->2974|5520->3003|5764->3220|5823->3258|6221->3628|6340->3729|6381->3730|6455->3776|6500->3804|6540->3805|6618->3854|6696->3904|6708->3905|6751->3925|6883->4025|6959->4069|7031->4112|7339->4392|7350->4393|7385->4405|7543->4535|7554->4536|7588->4548|8704->5636|8821->5735|8862->5736|8936->5781|9007->5824|9031->5837|9072->5838|9100->5845|9115->5849|9156->5850|9196->5857|9351->5984|9362->5985|9403->6004|9481->6053|9670->6214|9681->6215|9718->6230|9811->6294|10048->6503|10059->6504|10101->6524|10194->6588|10478->6840|10564->6897|11829->8130|11871->8144|11913->8155|11945->8159|12025->8208|12055->8210|12179->8305|12209->8306|12240->8309|12391->8431|12421->8432|12453->8436|12515->8470|12544->8471|12579->8478|12608->8479|12705->8547|12735->8548|12766->8551|13049->8805|13079->8806|13136->8834|13391->9061|13420->9062|13483->9096|13513->9097|13547->9103|13632->9160|13661->9161|13726->9197|13756->9198|13792->9206|13849->9235|13878->9236|13921->9251|13950->9252|14013->9286|14043->9287|14080->9296|14219->9406|14249->9407|14291->9420|14355->9456|14385->9457|14415->9458|14449->9463|14479->9464|14521->9477|14582->9510|14612->9511|14645->9516|14674->9517|14707->9522
                  LINES: 26->1|29->1|30->3|32->5|32->5|32->5|32->5|33->6|33->6|33->6|35->8|35->8|35->8|37->10|53->26|53->26|54->27|58->31|58->31|58->31|59->32|60->33|60->33|60->33|61->34|64->37|64->37|64->37|84->57|84->57|84->57|85->58|86->59|86->59|86->59|87->60|87->60|87->60|88->61|88->61|88->61|90->63|90->63|90->63|91->64|91->64|91->64|91->64|92->65|93->66|94->67|94->67|94->67|95->68|95->68|95->68|97->70|97->70|97->70|98->71|98->71|98->71|98->71|99->72|100->73|102->75|103->76|108->81|108->81|108->81|109->82|116->89|116->89|116->89|120->93|120->93|120->93|124->97|124->97|131->104|131->104|131->104|132->105|132->105|132->105|133->106|133->106|133->106|133->106|134->107|135->108|136->109|140->113|140->113|140->113|141->114|141->114|141->114|158->131|158->131|158->131|159->132|159->132|159->132|159->132|159->132|159->132|159->132|159->132|161->134|161->134|161->134|162->135|164->137|164->137|164->137|165->138|167->140|167->140|167->140|168->141|172->145|174->147|192->165|194->167|195->168|196->169|209->182|211->184|212->185|212->185|213->186|215->188|215->188|216->189|217->190|217->190|219->192|219->192|222->195|222->195|223->196|234->207|234->207|234->207|241->214|241->214|242->215|242->215|243->216|244->217|244->217|246->219|246->219|247->220|248->221|248->221|251->224|251->224|253->226|253->226|254->227|256->229|256->229|257->230|258->231|258->231|258->231|258->231|258->231|259->232|260->233|260->233|261->234|261->234|264->237
                  -- GENERATED --
              */
          