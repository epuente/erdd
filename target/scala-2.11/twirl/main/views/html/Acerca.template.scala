
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
object Acerca extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""

"""),format.raw/*5.1*/("""<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*5.62*/routes/*5.68*/.Assets.at("lib/animate.css/animate.min.css")),format.raw/*5.113*/("""">
    
    


	<div class="container-fluid" style="background-color: white; " >
		<div class="row">
			<div class="col-md-12">
				<h2 class="text-center">Sistema de Evaluación de Recursos Didácticos Digitales</h2>
			</div>
			
		<div class="row">
			<div class="col-md-1"></div>
			<div class="col-md-10 text-justify">
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut ut lacus in odio iaculis blandit. Mauris pellentesque sem id tellus dignissim dignissim. Mauris nec sodales odio. Maecenas sollicitudin, risus sit amet venenatis gravida, lacus urna pharetra massa, eget tempor tortor nisl ac ipsum. Morbi placerat consectetur velit, eget congue justo euismod convallis. Suspendisse potenti. Duis vehicula leo vitae massa efficitur lacinia. Nam ut aliquet dolor. Vivamus a euismod lectus. Mauris faucibus sem erat, vel varius velit varius ac. Nulla vitae convallis tellus. Aenean malesuada, purus quis tincidunt viverra, est urna viverra turpis, vel molestie ipsum nulla quis tellus.</p>
				
				<p>Maecenas libero sapien, tincidunt ac sem et, cursus laoreet erat. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Suspendisse aliquet magna ut lacus posuere vulputate. Proin sed mi fringilla, maximus velit et, ultrices turpis. Sed vitae nibh eu quam rutrum lobortis sed quis lorem. Fusce id blandit leo. In hac habitasse platea dictumst. Pellentesque condimentum condimentum lorem, vitae euismod enim lobortis ac. Nunc feugiat, tortor ac sagittis efficitur, felis velit ullamcorper purus, eu congue dolor massa quis purus. Vestibulum vel risus leo. Fusce nunc tortor, volutpat at elit in, rutrum efficitur lorem. Nunc eget enim laoreet, congue diam at, maximus risus.</p>
				
				<p>Morbi auctor enim purus, id dapibus enim egestas eu. Curabitur sit amet mollis leo. Quisque id dapibus risus. Mauris facilisis lectus vel lectus ullamcorper porttitor. Duis vulputate ac nulla eu molestie. Duis lobortis gravida neque, ac porttitor velit convallis at. Aenean eu dignissim nibh. Phasellus gravida mi id ligula ultrices, vel finibus ex pretium. Aliquam ac tincidunt massa, ut varius dui. Quisque in elit lacinia justo dignissim suscipit. Aenean pharetra sem mauris, ut tristique orci dictum sit amet. Pellentesque est velit, scelerisque ac elementum sit amet, molestie et lorem. Etiam vel dictum velit. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec pharetra aliquam posuere. Duis ac lorem lorem.</p>			
			</div>
			<div class="col-md-1"></div>
		</div>
			
		</div>
		
		<section class="seccion1">
			<div class="row" style="background-color: #5E163A;  color: #F0EBED;
				padding: 70px;">
				<div class="col-md-4 anima1 animated flipInX">
					<div class="row">
						<div class="col-sm-12">
							<h2>Instituto Politécnico Nacional</h2>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-1">
							<span class="glyphicon glyphicon-map-marker">
						</div>
						<div class="col-sm-11">
							Av. Luis Enrique Erro S/N, Unidad Profesional Adolfo López Mateos, <br>
							Colonia Zacatenco, Delegación Gustavo A. Madero, Ciudad de México, México,
						</div>
					</div>				
					<div class="row">
						<div class="col-sm-1">
							<span class="fa fa-envelope-o">
						</div>
						<div class="col-sm-11">
							C.P. 07738
						</div>
					</div>					
				</div>
				<div class="col-md-4 anima2 animated flipInX">
					<div class="row">
						<div class="col-sm-12">
							<h2>Secretaría Académica</h2>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-1">
							<span class="glyphicon glyphicon-map-marker"></span>
						</div>
						<div class="col-sm-11">
							Av. Luis Enrique Erro S/N esquina con Miguel Bernard, Unidad Profesional "Adolfo López Mateos"<br>
							Colonia Zacatenco, Delegación Gustavo A. Madero, Ciudad de México, México.
						</div>
					</div>
					<div class="row">
						<div class="col-sm-1">
							<span class="fa fa-building-o"></span>
						</div>
						<div class="col-sm-11">
							Edificio de la Secretaría Académica 2o. piso						
						</div>
					</div>					
					<div class="row">
						<div class="col-sm-1">
							<span class="fa fa-envelope-o"></span>
						</div>
						<div class="col-sm-11">
							C.P. 07738
						</div>
					</div>					
				</div>
				<div class="col-md-4 anima3 animated flipInX">
					<div class="row">
						<div class="col-sm-12">
							<h2>Unidad Politécnica para la Educación Virtual</h2>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-1">
							<span class="glyphicon glyphicon-map-marker"></span>
						</div>						
						<div class="col-sm-11">
							Unidad Profesional "Adolfo López Mateos",  Avenida Wilfrido Massieu S/N esquina Avenida Luis Enrique Erro<br>
							Delegación Gustavo A. Madero , Ciudad de México, México
						</div>
					</div>
					<div class="row">
						<div class="col-sm-1">
							<span class="fa fa-building-o"></span>
						</div>
						<div class="col-sm-11">
							Edificio "Adolfo Ruiz Cortines" (CGFIE-UPDCE-UPEV), Planta Baja
						</div>
					</div>					
					<div class="row">
						<div class="col-sm-1">
							<span class="fa fa-envelope-o"></span>
						</div>
						<div class="col-sm-11">
							C.P. 07738
						</div>
					</div>
					<div class="row">
						<div class="col-sm-1">
							 <span class="glyphicon glyphicon-earphone"></span>
						</div>
						<div class="col-sm-11">
							Tel. 57 29 60 00, extensiones 57401 y 57435
						</div>
					</div>					
					<div class="row">
						<div class="col-sm-1">
							<span class="fa fa-fax"></span>
						</div>
						<div class="col-sm-11">
							Fax: 57400
						</div>
					</div>

				</div>				
			</div>		
		</section>
		
	</div>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:32 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Acerca.scala.html
                  HASH: 05bebc81132642300392543a540dcac395632c69
                  MATRIX: 799->3|810->7|847->8|875->10|962->71|976->77|1042->122
                  LINES: 29->3|29->3|29->3|31->5|31->5|31->5|31->5
                  -- GENERATED --
              */
          