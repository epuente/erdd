
package views.html.Calendario

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
object calendario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Calendario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(fechas:List[Calendario]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/main/*3.6*/{_display_(Seq[Any](format.raw/*3.7*/("""

"""),format.raw/*5.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*5.46*/routes/*5.52*/.Assets.at("stylesheets/fullcalendar.css")),format.raw/*5.94*/(""""/> 

		
<script src=""""),_display_(/*8.15*/routes/*8.21*/.Assets.at("javascripts/fullcalendar/moment.min.js")),format.raw/*8.73*/("""" ></script>
<script src=""""),_display_(/*9.15*/routes/*9.21*/.Assets.at("javascripts/fullcalendar/fullcalendar.min.js")),format.raw/*9.79*/("""" ></script>
<script src=""""),_display_(/*10.15*/routes/*10.21*/.Assets.at("javascripts/fullcalendar/es.js")),format.raw/*10.65*/("""" ></script>
<div id="fecha" class="hidden"></div> <script src="/assets/lib/jquery/jqueryui.js" type="text/javascript"></script>

<div class="container-fluid" style="background-color: white; padding: 10px;">
 
		<div class="row">
			<div class="col-lg-12">
				<ol class="breadcrumb">
				  <li>Catálogos</li>
				  <li class="active">Calendario días inhábiles</li>
				</ol>			
			</div>
		</div>	
		<div class="row">
			<div class="col-lg-12">
  	          <h3>Calendario días inhábiles</h3>
	        </div>
		</div>
		<div class="row">		
			<div class="col-lg-3">
					<div class="panel panel-default">
	                	<div class="panel-heading"><span class="glyphicon glyphicon-info-sign"></span>Instrucciones</div>
	               		<div class="panel-body">
							<div>
								Para agregar fechas:
								<ul>									
									<li>Arrastrar desde la fecha de inicio hasta la fecha del día de término</li>
									<li>Escribir un título descriptivo, por ejemplo 'Periodo vacacional', 'Fumigación del edificio', etc.</li>
									<li>Es obligatorio escribír el título descriptivo, en caso contrario no se agregará la fecha al calendario</li>
								</ul>
								<br>
								Para ampliar o reducir la fecha límite:
								<ul>
									<li>Situar el cursor sobre el último día de la fecha, al colocarlo en el borde izquierdo el cursor cambia a una flecha hacia la derecha. </li>
									<li>Arrastrar hasta la nueva fecha final.</li>
								</ul>
								Para cambiar bloques completos de rangos de fechas:
								<ul>
									<li>Arrastrar la fecha actual hasta la nueva posición.</li>
								</ul>
							</div>
							
							
						
							
	               		</div>                	
	               	</div>		
			</div>
			<div class="col-lg-9">
					<div class="panel panel-default">
	                	<div class="panel-heading"><span class="glyphicon glyphicon-calendar"></span>Calendario  <div id="divMsgCalendario" ></div>  </div>
	               		<div class="panel-body">
								<div id='calendar'></div>
	               		</div>                	
	               	</div>		
			</div>		
	</div>
	</div>


<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Detalle</h4>
      </div>
      <div class="modal-body">
      
		<div class="container-fluid">
          <div class="row">
            <div class="col-md-12">    <p id="cTitulo" class="lead"></p>   </div>
          </div>
          <div class="row">
            <div class="col-md-6">Desde: <div id="cDesde"></div></div>
            <div class="col-md-6">Hasta: <div id="cHasta"></div></div>
          </div>
          <div class="row">
          		<div id="cDuracion" class="col-md-12"></div>
          </div>
        </div>

      </div>
      <div class="modal-footer">      	
        <button type="button" class="btn btn-danger" >Borrar</button>
        <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
      </div>
    </div>
  </div>
</div>






""")))}),format.raw/*107.2*/("""






"""),format.raw/*114.1*/("""<script type="text/javascript">
$(document).ready(function() """),format.raw/*115.30*/("""{"""),format.raw/*115.31*/("""
	"""),format.raw/*116.2*/("""$('body').css('background', 'white');


	$('#calendar').fullCalendar("""),format.raw/*119.30*/("""{"""),format.raw/*119.31*/("""
		"""),format.raw/*120.3*/("""editable: true,
		eventLimit: true, // allow "more" link when too many events
		allDay: false,
		allDayDefault: true,
		selectable: true,
		selectHelper: true,
//		aspectRatio: 2,
        height: "auto",
		contentHeight: "auto",
		weekends: false,
		select: function(start, end) """),format.raw/*130.32*/("""{"""),format.raw/*130.33*/("""
			"""),format.raw/*131.4*/("""var title = prompt('Título descriptivo:');
			var eventData;
			if (title) """),format.raw/*133.15*/("""{"""),format.raw/*133.16*/("""
				"""),format.raw/*134.5*/("""eventData = """),format.raw/*134.17*/("""{"""),format.raw/*134.18*/("""
					"""),format.raw/*135.6*/("""title: title,
					start: start,
					end: end,
					tipo: 1
				"""),format.raw/*139.5*/("""}"""),format.raw/*139.6*/(""";
			//	$('#calendar').fullCalendar('renderEvent', eventData, true); // stick? = true
						
				$.ajax("""),format.raw/*142.12*/("""{"""),format.raw/*142.13*/("""					
					  """),format.raw/*143.8*/("""type: "POST",
					  url: '/agregarFechaCalendario?desde='+ $.fullCalendar.moment(eventData.start).format('YYYY-MM-DD HH:mm')+'&hasta='+$.fullCalendar.moment(eventData.end).format('YYYY-MM-DD HH:mm')+'&titulo='+eventData.title+"&id="
	  
					"""),format.raw/*146.6*/("""}"""),format.raw/*146.7*/(""")
				  .success(function( data ) """),format.raw/*147.33*/("""{"""),format.raw/*147.34*/("""
				  		"""),format.raw/*148.9*/("""eventData.id = data;
				  		$('#calendar').fullCalendar('renderEvent', eventData, true); // stick? = true
				  		$('#divMsgCalendario').html("Se agregó fecha inhábil.");		
				  """),format.raw/*151.7*/("""}"""),format.raw/*151.8*/(""")					
				  .error(function(data)"""),format.raw/*152.28*/("""{"""),format.raw/*152.29*/("""
					  """),format.raw/*153.8*/("""alert("error en ajax " +data);
				  """),format.raw/*154.7*/("""}"""),format.raw/*154.8*/(""")				
			"""),format.raw/*155.4*/("""}"""),format.raw/*155.5*/("""
			"""),format.raw/*156.4*/("""$('#calendar').fullCalendar('unselect');
		"""),format.raw/*157.3*/("""}"""),format.raw/*157.4*/(""",
		"""),format.raw/*162.8*/("""
	    """),format.raw/*163.6*/("""eventDrop: function(eventData, delta, revertFunc) """),format.raw/*163.56*/("""{"""),format.raw/*163.57*/("""
	        """),format.raw/*164.10*/("""if (confirm(eventData.title + " se moverá a " + eventData.start.format()+"\n\n¿Continuar?")) """),format.raw/*164.103*/("""{"""),format.raw/*164.104*/("""
				"""),format.raw/*165.5*/("""$.ajax("""),format.raw/*165.12*/("""{"""),format.raw/*165.13*/("""
					  """),format.raw/*166.8*/("""type: "POST",
					  url: '/agregarFechaCalendario?desde='+ $.fullCalendar.moment(eventData.start).format('YYYY-MM-DD HH:mm')+'&hasta='+$.fullCalendar.moment(eventData.end-1).format('YYYY-MM-DD HH:mm')+'&titulo='+eventData.title+"&id="+eventData.id
					"""),format.raw/*168.6*/("""}"""),format.raw/*168.7*/(""")
				  .success(function( data ) """),format.raw/*169.33*/("""{"""),format.raw/*169.34*/("""
					  """),format.raw/*170.8*/("""$('#divMsgCalendario').html("Se movió fecha inhábil.");					  
				  """),format.raw/*171.7*/("""}"""),format.raw/*171.8*/(""")					
				  .error(function(data)"""),format.raw/*172.28*/("""{"""),format.raw/*172.29*/("""
					  """),format.raw/*173.8*/("""alert("error en ajax " +data);
				  """),format.raw/*174.7*/("""}"""),format.raw/*174.8*/(""")	            
	        """),format.raw/*175.10*/("""}"""),format.raw/*175.11*/(""" """),format.raw/*175.12*/("""else """),format.raw/*175.17*/("""{"""),format.raw/*175.18*/("""
	        	"""),format.raw/*176.11*/("""revertFunc();
	        """),format.raw/*177.10*/("""}"""),format.raw/*177.11*/("""

	    """),format.raw/*179.6*/("""}"""),format.raw/*179.7*/(""",
		eventRender: function(event, element) """),format.raw/*180.41*/("""{"""),format.raw/*180.42*/("""
			"""),format.raw/*181.4*/("""if (event.tipo ==1)"""),format.raw/*181.23*/("""{"""),format.raw/*181.24*/("""
				"""),format.raw/*182.5*/("""var color = '#378006';
			"""),format.raw/*183.4*/("""}"""),format.raw/*183.5*/("""
			"""),format.raw/*184.4*/("""if (event.tipo ==2)"""),format.raw/*184.23*/("""{"""),format.raw/*184.24*/("""
				"""),format.raw/*185.5*/("""var color = 'red';
			"""),format.raw/*186.4*/("""}"""),format.raw/*186.5*/("""
			"""),format.raw/*187.4*/("""if (event.tipo ==3)"""),format.raw/*187.23*/("""{"""),format.raw/*187.24*/("""
				"""),format.raw/*188.5*/("""var color = 'grey';
			"""),format.raw/*189.4*/("""}"""),format.raw/*189.5*/("""		
			"""),format.raw/*190.4*/("""if (event.tipo ==4)"""),format.raw/*190.23*/("""{"""),format.raw/*190.24*/("""
				"""),format.raw/*191.5*/("""var color = 'blue';
			"""),format.raw/*192.4*/("""}"""),format.raw/*192.5*/("""
			"""),format.raw/*193.4*/("""if (event.tipo ==5)"""),format.raw/*193.23*/("""{"""),format.raw/*193.24*/("""
				"""),format.raw/*194.5*/("""var color = 'cyan';
			"""),format.raw/*195.4*/("""}"""),format.raw/*195.5*/("""			
			"""),format.raw/*196.4*/("""$(element).css('background-color', color );			
		"""),format.raw/*197.3*/("""}"""),format.raw/*197.4*/(""",
	    eventClick: function(eventData) """),format.raw/*198.38*/("""{"""),format.raw/*198.39*/("""	    	
	    	"""),format.raw/*199.7*/("""$("#cTitulo").html("Título: "+eventData.title);
	    	$("#cDesde").html($.fullCalendar.moment(eventData.start).format('DD/MM/YYYY HH:mm'));
	    	$("#cHasta").html($.fullCalendar.moment(eventData.end.subtract(1,'days')).format('DD/MM/YYYY HH:mm'));	
	    	$("#cDuracion").html("<br>Duración total: "+moment.duration(eventData.end.add(1,'days') - eventData.start).humanize()+" naturales.");
			$("#fecha").html(eventData.id);
	    	$("#myModal").modal('show');

	    """),format.raw/*206.6*/("""}"""),format.raw/*206.7*/(""",		
	    eventResize: function(eventData, delta, revertFunc) """),format.raw/*207.58*/("""{"""),format.raw/*207.59*/("""


	        
	        """),format.raw/*211.10*/("""if (!confirm(eventData.title + " ahora termina el " + eventData.end.format()+"\n¿Es correcto?")) """),format.raw/*211.107*/("""{"""),format.raw/*211.108*/("""
	            """),format.raw/*212.14*/("""revertFunc();
	        """),format.raw/*213.10*/("""}"""),format.raw/*213.11*/(""" """),format.raw/*213.12*/("""else """),format.raw/*213.17*/("""{"""),format.raw/*213.18*/("""	        
	        
					"""),format.raw/*215.6*/("""$.ajax("""),format.raw/*215.13*/("""{"""),format.raw/*215.14*/("""				
						  """),format.raw/*216.9*/("""type: "POST",
						  url: '/agregarFechaCalendario?desde='+ $.fullCalendar.moment(eventData.start).format('YYYY-MM-DD HH:mm')+'&hasta='+$.fullCalendar.moment(eventData.end).format('YYYY-MM-DD HH:mm')+'&titulo='+eventData.title+"&id="+eventData.id
		
						"""),format.raw/*219.7*/("""}"""),format.raw/*219.8*/(""")
					  .success(function( data ) """),format.raw/*220.34*/("""{"""),format.raw/*220.35*/("""
					  		"""),format.raw/*221.10*/("""eventData.id = data;
					  		$('#calendar').fullCalendar('renderEvent', eventData, true); // stick? = true
					  		$('#divMsgCalendario').html("Se modificó fecha inhábil.");		
					  """),format.raw/*224.8*/("""}"""),format.raw/*224.9*/(""")					
					  .error(function(data)"""),format.raw/*225.29*/("""{"""),format.raw/*225.30*/("""
						  """),format.raw/*226.9*/("""alert("error en ajax " +data);
					  """),format.raw/*227.8*/("""}"""),format.raw/*227.9*/(""")
	        """),format.raw/*228.10*/("""}"""),format.raw/*228.11*/("""
	    """),format.raw/*229.6*/("""}"""),format.raw/*229.7*/(""",	    
		events: [
				    """),_display_(/*231.10*/for((f,i) <- fechas.zipWithIndex) yield /*231.43*/{_display_(Seq[Any](format.raw/*231.44*/("""
				    	"""),format.raw/*232.10*/("""{"""),format.raw/*232.11*/("""
				    		"""),format.raw/*233.11*/("""id:    """"),_display_(/*233.20*/f/*233.21*/.id),format.raw/*233.24*/("""",
				    		title: """"),_display_(/*234.20*/f/*234.21*/.descripcion),format.raw/*234.33*/("""",
				    		start: """"),_display_(/*235.20*/f/*235.21*/.desde),format.raw/*235.27*/("""",
				    		end:   """"),_display_(/*236.20*/f/*236.21*/.hasta),format.raw/*236.27*/("""",
				    		tipo:  1
				    	"""),format.raw/*238.10*/("""}"""),format.raw/*238.11*/(""" """),_display_(/*238.13*/if( i != fechas.length-1)/*238.38*/{_display_(Seq[Any](format.raw/*238.39*/(""" """),format.raw/*238.40*/(""", """)))}),format.raw/*238.43*/("""		    	
				    """)))}),format.raw/*239.10*/("""
		"""),format.raw/*240.3*/("""]
	"""),format.raw/*241.2*/("""}"""),format.raw/*241.3*/(""");

	
	
	
	




"""),format.raw/*251.1*/("""}"""),format.raw/*251.2*/(""");



$(".btn-danger").on("click", function()"""),format.raw/*255.40*/("""{"""),format.raw/*255.41*/("""
	"""),format.raw/*256.2*/("""var eventData = $("#calendar").fullCalendar( 'clientEvents', $("#fecha").html()  )[0]; 
	if ( confirm("¿Desea eliminar la fecha?")  )"""),format.raw/*257.46*/("""{"""),format.raw/*257.47*/("""    		
		"""),format.raw/*258.3*/("""$.ajax("""),format.raw/*258.10*/("""{"""),format.raw/*258.11*/("""
			  """),format.raw/*259.6*/("""type: "POST",
			  url: "/eliminarFechaCalendario?id="+eventData.id
		
			"""),format.raw/*262.4*/("""}"""),format.raw/*262.5*/(""")
		.success(function( data ) """),format.raw/*263.29*/("""{"""),format.raw/*263.30*/("""
			"""),format.raw/*264.4*/("""$('#calendar').fullCalendar('removeEvents', eventData._id);
			$('#divMsgCalendario').html("Se eliminó fecha inhábil.");
			$("#myModal").modal('hide');
		"""),format.raw/*267.3*/("""}"""),format.raw/*267.4*/(""")					
		.error(function(data)"""),format.raw/*268.24*/("""{"""),format.raw/*268.25*/("""
			  """),format.raw/*269.6*/("""alert("error en ajax " +data);
		"""),format.raw/*270.3*/("""}"""),format.raw/*270.4*/(""")	    		
	"""),format.raw/*271.2*/("""}"""),format.raw/*271.3*/("""
"""),format.raw/*272.1*/("""}"""),format.raw/*272.2*/(""");
</script>

"""))}
  }

  def render(fechas:List[Calendario]): play.twirl.api.HtmlFormat.Appendable = apply(fechas)

  def f:((List[Calendario]) => play.twirl.api.HtmlFormat.Appendable) = (fechas) => apply(fechas)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:33 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Calendario/calendario.scala.html
                  HASH: 0172ac35aa54afa911737cfd27faf2bc340d8f87
                  MATRIX: 749->1|862->26|890->29|901->33|938->34|966->36|1037->81|1051->87|1113->129|1162->152|1176->158|1248->210|1301->237|1315->243|1393->301|1447->328|1462->334|1527->378|4887->3707|4922->3714|5012->3775|5042->3776|5072->3778|5170->3847|5200->3848|5231->3851|5539->4130|5569->4131|5601->4135|5705->4210|5735->4211|5768->4216|5809->4228|5839->4229|5873->4235|5966->4300|5995->4301|6128->4405|6158->4406|6199->4419|6470->4662|6499->4663|6562->4697|6592->4698|6629->4707|6837->4887|6866->4888|6929->4922|6959->4923|6995->4931|7060->4968|7089->4969|7126->4978|7155->4979|7187->4983|7258->5026|7287->5027|7319->5321|7353->5327|7432->5377|7462->5378|7501->5388|7624->5481|7655->5482|7688->5487|7724->5494|7754->5495|7790->5503|8072->5757|8101->5758|8164->5792|8194->5793|8230->5801|8327->5870|8356->5871|8419->5905|8449->5906|8485->5914|8550->5951|8579->5952|8632->5976|8662->5977|8692->5978|8726->5983|8756->5984|8796->5995|8848->6018|8878->6019|8913->6026|8942->6027|9013->6069|9043->6070|9075->6074|9123->6093|9153->6094|9186->6099|9240->6125|9269->6126|9301->6130|9349->6149|9379->6150|9412->6155|9462->6177|9491->6178|9523->6182|9571->6201|9601->6202|9634->6207|9685->6230|9714->6231|9748->6237|9796->6256|9826->6257|9859->6262|9910->6285|9939->6286|9971->6290|10019->6309|10049->6310|10082->6315|10133->6338|10162->6339|10197->6346|10274->6395|10303->6396|10371->6435|10401->6436|10442->6449|10936->6915|10965->6916|11055->6977|11085->6978|11136->7000|11263->7097|11294->7098|11337->7112|11389->7135|11419->7136|11449->7137|11483->7142|11513->7143|11566->7168|11602->7175|11632->7176|11673->7189|11958->7446|11987->7447|12051->7482|12081->7483|12120->7493|12333->7678|12362->7679|12426->7714|12456->7715|12493->7724|12559->7762|12588->7763|12628->7774|12658->7775|12692->7781|12721->7782|12777->7810|12827->7843|12867->7844|12906->7854|12936->7855|12976->7866|13013->7875|13024->7876|13049->7879|13099->7901|13110->7902|13144->7914|13194->7936|13205->7937|13233->7943|13283->7965|13294->7966|13322->7972|13382->8003|13412->8004|13442->8006|13477->8031|13517->8032|13547->8033|13582->8036|13631->8053|13662->8056|13693->8059|13722->8060|13766->8076|13795->8077|13869->8122|13899->8123|13929->8125|14091->8258|14121->8259|14158->8268|14194->8275|14224->8276|14258->8282|14360->8356|14389->8357|14448->8387|14478->8388|14510->8392|14693->8547|14722->8548|14781->8578|14811->8579|14845->8585|14906->8618|14935->8619|14973->8629|15002->8630|15031->8631|15060->8632
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|33->5|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|135->107|142->114|143->115|143->115|144->116|147->119|147->119|148->120|158->130|158->130|159->131|161->133|161->133|162->134|162->134|162->134|163->135|167->139|167->139|170->142|170->142|171->143|174->146|174->146|175->147|175->147|176->148|179->151|179->151|180->152|180->152|181->153|182->154|182->154|183->155|183->155|184->156|185->157|185->157|186->162|187->163|187->163|187->163|188->164|188->164|188->164|189->165|189->165|189->165|190->166|192->168|192->168|193->169|193->169|194->170|195->171|195->171|196->172|196->172|197->173|198->174|198->174|199->175|199->175|199->175|199->175|199->175|200->176|201->177|201->177|203->179|203->179|204->180|204->180|205->181|205->181|205->181|206->182|207->183|207->183|208->184|208->184|208->184|209->185|210->186|210->186|211->187|211->187|211->187|212->188|213->189|213->189|214->190|214->190|214->190|215->191|216->192|216->192|217->193|217->193|217->193|218->194|219->195|219->195|220->196|221->197|221->197|222->198|222->198|223->199|230->206|230->206|231->207|231->207|235->211|235->211|235->211|236->212|237->213|237->213|237->213|237->213|237->213|239->215|239->215|239->215|240->216|243->219|243->219|244->220|244->220|245->221|248->224|248->224|249->225|249->225|250->226|251->227|251->227|252->228|252->228|253->229|253->229|255->231|255->231|255->231|256->232|256->232|257->233|257->233|257->233|257->233|258->234|258->234|258->234|259->235|259->235|259->235|260->236|260->236|260->236|262->238|262->238|262->238|262->238|262->238|262->238|262->238|263->239|264->240|265->241|265->241|275->251|275->251|279->255|279->255|280->256|281->257|281->257|282->258|282->258|282->258|283->259|286->262|286->262|287->263|287->263|288->264|291->267|291->267|292->268|292->268|293->269|294->270|294->270|295->271|295->271|296->272|296->272
                  -- GENERATED --
              */
          