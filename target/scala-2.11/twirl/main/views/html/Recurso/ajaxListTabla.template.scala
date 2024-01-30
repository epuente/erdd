
package views.html.Recurso

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
object ajaxListTabla extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[com.avaje.ebean.Page[Recurso],String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Recurso], currentSortBy: String, currentOrder: String, currentFilter: String, currentCampoFiltro: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
def /*38.2*/header/*38.8*/(key:String, title:String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*38.38*/("""
    """),format.raw/*39.5*/("""<th class=""""),_display_(/*39.17*/key/*39.20*/.replace(".","_")),format.raw/*39.37*/(""" """),format.raw/*39.38*/("""header """),_display_(/*39.46*/if(currentSortBy == key){/*39.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}}),format.raw/*39.136*/(""""       >
        <a href=""""),_display_(/*40.19*/link(0, key, currentCampoFiltro)),format.raw/*40.51*/("""">"""),_display_(/*40.54*/title),format.raw/*40.59*/("""</a>
    </th>
""")))};implicit def /*3.2*/implicitFieldConstructor/*3.26*/ = {{ FieldConstructor(personalFieldConstructor.render) }};def /*9.2*/link/*9.6*/(newPage:Int, newSortBy:String,   newCampoFiltro:String) = {{
    
    var sortBy = currentSortBy
    var order = currentOrder
    var campoFiltro = currentCampoFiltro
    
    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }


		
    // Generate the link
    routes.RecursoController.list(newPage, sortBy, order, currentFilter, currentCampoFiltro)
    
}};
Seq[Any](format.raw/*1.142*/("""			    
"""),format.raw/*3.83*/(""" 


"""),format.raw/*8.42*/("""
"""),format.raw/*33.2*/("""

"""),format.raw/*37.37*/("""
"""),format.raw/*42.2*/("""
		    
		    
		    
"""),format.raw/*46.1*/("""<style>

.btn-color1 """),format.raw/*48.13*/("""{"""),format.raw/*48.14*/("""
    """),format.raw/*49.5*/("""color: #f8f8f8;
    background-color: #F34235;
    border-color: #c3352b;
"""),format.raw/*52.1*/("""}"""),format.raw/*52.2*/("""
"""),format.raw/*53.1*/(""".btn-color1:hover """),format.raw/*53.19*/("""{"""),format.raw/*53.20*/("""
    """),format.raw/*54.5*/("""color: #fff;
    background-color: #c3352b;
    border-color: #c3352b;
"""),format.raw/*57.1*/("""}"""),format.raw/*57.2*/("""
"""),format.raw/*58.1*/(""".btn-lcolor1 """),format.raw/*58.14*/("""{"""),format.raw/*58.15*/("""
    """),format.raw/*59.5*/("""color: #F34235;
    background-color: transparent;
    border-color: #F34235;
"""),format.raw/*62.1*/("""}"""),format.raw/*62.2*/("""
"""),format.raw/*63.1*/(""".btn-lcolor1:hover """),format.raw/*63.20*/("""{"""),format.raw/*63.21*/("""
    """),format.raw/*64.5*/("""color: #fff;
    background-color: #F34235;
    border-color: #F34235;
"""),format.raw/*67.1*/("""}"""),format.raw/*67.2*/("""


"""),format.raw/*70.1*/(""".btn-color2 """),format.raw/*70.13*/("""{"""),format.raw/*70.14*/("""
    """),format.raw/*71.5*/("""color: #f8f8f8;
    background-color: #E81D62;
    border-color: #c51954;
"""),format.raw/*74.1*/("""}"""),format.raw/*74.2*/("""
"""),format.raw/*75.1*/(""".btn-color2:hover """),format.raw/*75.19*/("""{"""),format.raw/*75.20*/("""
    """),format.raw/*76.5*/("""color: #fff;
    background-color: #c51954;
    border-color: #c51954;
"""),format.raw/*79.1*/("""}"""),format.raw/*79.2*/("""
"""),format.raw/*80.1*/(""".btn-lcolor2 """),format.raw/*80.14*/("""{"""),format.raw/*80.15*/("""
    """),format.raw/*81.5*/("""color: #E81D62;
    background-color: transparent;
    border-color: #c51954;
"""),format.raw/*84.1*/("""}"""),format.raw/*84.2*/("""
"""),format.raw/*85.1*/(""".btn-lcolor2:hover """),format.raw/*85.20*/("""{"""),format.raw/*85.21*/("""
    """),format.raw/*86.5*/("""color: #fff;
    background-color: #E81D62;
    border-color: #E81D62;
"""),format.raw/*89.1*/("""}"""),format.raw/*89.2*/("""


"""),format.raw/*92.1*/(""".btn-color3 """),format.raw/*92.13*/("""{"""),format.raw/*92.14*/("""
    """),format.raw/*93.5*/("""color: #f8f8f8;
    background-color: #9B26AF;
    border-color: #89219b;
"""),format.raw/*96.1*/("""}"""),format.raw/*96.2*/("""
"""),format.raw/*97.1*/(""".btn-color3:hover """),format.raw/*97.19*/("""{"""),format.raw/*97.20*/("""
    """),format.raw/*98.5*/("""color: #fff;
    background-color: #89219b;
    border-color: #89219b;
"""),format.raw/*101.1*/("""}"""),format.raw/*101.2*/("""
"""),format.raw/*102.1*/(""".btn-lcolor3 """),format.raw/*102.14*/("""{"""),format.raw/*102.15*/("""
    """),format.raw/*103.5*/("""color: #9B26AF;
    background-color: transparent;
    border-color: #9B26AF;
"""),format.raw/*106.1*/("""}"""),format.raw/*106.2*/("""
"""),format.raw/*107.1*/(""".btn-lcolor3:hover """),format.raw/*107.20*/("""{"""),format.raw/*107.21*/("""
    """),format.raw/*108.5*/("""color: #fff;
    background-color: #9B26AF;
    border-color: #9B26AF;
"""),format.raw/*111.1*/("""}"""),format.raw/*111.2*/("""


"""),format.raw/*114.1*/(""".btn-color4 """),format.raw/*114.13*/("""{"""),format.raw/*114.14*/("""
    """),format.raw/*115.5*/("""color: #f8f8f8;
    background-color: #6639B6;
    border-color: #5e35a8;
"""),format.raw/*118.1*/("""}"""),format.raw/*118.2*/("""
"""),format.raw/*119.1*/(""".btn-color4:hover """),format.raw/*119.19*/("""{"""),format.raw/*119.20*/("""
    """),format.raw/*120.5*/("""color: #fff;
    background-color: #5e35a8;
    border-color: #5e35a8;
"""),format.raw/*123.1*/("""}"""),format.raw/*123.2*/("""
"""),format.raw/*124.1*/(""".btn-lcolor4 """),format.raw/*124.14*/("""{"""),format.raw/*124.15*/("""
    """),format.raw/*125.5*/("""color: #6639B6;
    background-color: transparent;
    border-color: #6639B6;
"""),format.raw/*128.1*/("""}"""),format.raw/*128.2*/("""
"""),format.raw/*129.1*/(""".btn-lcolor4:hover """),format.raw/*129.20*/("""{"""),format.raw/*129.21*/("""
    """),format.raw/*130.5*/("""color: #fff;
    background-color: #6639B6;
    border-color: #6639B6;
"""),format.raw/*133.1*/("""}"""),format.raw/*133.2*/("""


"""),format.raw/*136.1*/(""".btn-color5 """),format.raw/*136.13*/("""{"""),format.raw/*136.14*/("""
    """),format.raw/*137.5*/("""color: #f8f8f8;
    background-color: #3E50B4;
    border-color: #3949a2;
"""),format.raw/*140.1*/("""}"""),format.raw/*140.2*/("""
"""),format.raw/*141.1*/(""".btn-color5:hover """),format.raw/*141.19*/("""{"""),format.raw/*141.20*/("""
    """),format.raw/*142.5*/("""color: #fff;
    background-color: #3949a2;
    border-color: #3949a2;
"""),format.raw/*145.1*/("""}"""),format.raw/*145.2*/("""
"""),format.raw/*146.1*/(""".btn-lcolor5 """),format.raw/*146.14*/("""{"""),format.raw/*146.15*/("""
    """),format.raw/*147.5*/("""color: #3E50B4;
    background-color: transparent;
    border-color: #3E50B4;
"""),format.raw/*150.1*/("""}"""),format.raw/*150.2*/("""
"""),format.raw/*151.1*/(""".btn-lcolor5:hover """),format.raw/*151.20*/("""{"""),format.raw/*151.21*/("""
    """),format.raw/*152.5*/("""color: #fff;
    background-color: #3E50B4;
    border-color: #3E50B4;
"""),format.raw/*155.1*/("""}"""),format.raw/*155.2*/("""


"""),format.raw/*158.1*/(""".btn-color6 """),format.raw/*158.13*/("""{"""),format.raw/*158.14*/("""
    """),format.raw/*159.5*/("""color: #f8f8f8;
    background-color: #2095F2;
    border-color: #1a80d1;
"""),format.raw/*162.1*/("""}"""),format.raw/*162.2*/("""
"""),format.raw/*163.1*/(""".btn-color6:hover """),format.raw/*163.19*/("""{"""),format.raw/*163.20*/("""
    """),format.raw/*164.5*/("""color: #fff;
    background-color: #1a80d1;
    border-color: #1a80d1;
"""),format.raw/*167.1*/("""}"""),format.raw/*167.2*/("""
"""),format.raw/*168.1*/(""".btn-lcolor6 """),format.raw/*168.14*/("""{"""),format.raw/*168.15*/("""
    """),format.raw/*169.5*/("""color: #2095F2;
    background-color: transparent;
    border-color: #2095F2;
"""),format.raw/*172.1*/("""}"""),format.raw/*172.2*/("""
"""),format.raw/*173.1*/(""".btn-lcolor6:hover """),format.raw/*173.20*/("""{"""),format.raw/*173.21*/("""
    """),format.raw/*174.5*/("""color: #fff;
    background-color: #2095F2;
    border-color: #2095F2;
"""),format.raw/*177.1*/("""}"""),format.raw/*177.2*/("""


"""),format.raw/*180.1*/(""".btn-color7 """),format.raw/*180.13*/("""{"""),format.raw/*180.14*/("""
    """),format.raw/*181.5*/("""color: #f8f8f8;
    background-color: #02A8F3;
    border-color: #0396d8;
"""),format.raw/*184.1*/("""}"""),format.raw/*184.2*/("""
"""),format.raw/*185.1*/(""".btn-color7:hover """),format.raw/*185.19*/("""{"""),format.raw/*185.20*/("""
    """),format.raw/*186.5*/("""color: #fff;
    background-color: #0396d8;
    border-color: #0396d8;
"""),format.raw/*189.1*/("""}"""),format.raw/*189.2*/("""
"""),format.raw/*190.1*/(""".btn-color7 """),format.raw/*190.13*/("""{"""),format.raw/*190.14*/("""
    """),format.raw/*191.5*/("""color: #02A8F3;
    background-color: transparent;
    border-color: #02A8F3;
"""),format.raw/*194.1*/("""}"""),format.raw/*194.2*/("""
"""),format.raw/*195.1*/(""".btn-color7:hover """),format.raw/*195.19*/("""{"""),format.raw/*195.20*/("""
    """),format.raw/*196.5*/("""color: #fff;
    background-color: #02A8F3;
    border-color: #02A8F3;
"""),format.raw/*199.1*/("""}"""),format.raw/*199.2*/("""


"""),format.raw/*202.1*/(""".btn-color8 """),format.raw/*202.13*/("""{"""),format.raw/*202.14*/("""
    """),format.raw/*203.5*/("""color: #f8f8f8;
    background-color: #00BBD3;
    border-color: #009fb3;
"""),format.raw/*206.1*/("""}"""),format.raw/*206.2*/("""
"""),format.raw/*207.1*/(""".btn-color8:hover """),format.raw/*207.19*/("""{"""),format.raw/*207.20*/("""
    """),format.raw/*208.5*/("""color: #fff;
    background-color: #009fb3;
    border-color: #009fb3;
"""),format.raw/*211.1*/("""}"""),format.raw/*211.2*/("""
"""),format.raw/*212.1*/(""".btn-lcolor8 """),format.raw/*212.14*/("""{"""),format.raw/*212.15*/("""
    """),format.raw/*213.5*/("""color: #00BBD3;
    background-color: transparent;
    border-color: #00BBD3;
"""),format.raw/*216.1*/("""}"""),format.raw/*216.2*/("""
"""),format.raw/*217.1*/(""".btn-lcolor8:hover """),format.raw/*217.20*/("""{"""),format.raw/*217.21*/("""
    """),format.raw/*218.5*/("""color: #fff;
    background-color: #00BBD3;
    border-color: #00BBD3;
"""),format.raw/*221.1*/("""}"""),format.raw/*221.2*/("""


"""),format.raw/*224.1*/(""".btn-color9 """),format.raw/*224.13*/("""{"""),format.raw/*224.14*/("""
    """),format.raw/*225.5*/("""color: #f8f8f8;
    background-color: #009587;
    border-color: #018175;
"""),format.raw/*228.1*/("""}"""),format.raw/*228.2*/("""
"""),format.raw/*229.1*/(""".btn-color9:hover """),format.raw/*229.19*/("""{"""),format.raw/*229.20*/("""
    """),format.raw/*230.5*/("""color: #fff;
    background-color: #018175;
    border-color: #018175;
"""),format.raw/*233.1*/("""}"""),format.raw/*233.2*/("""
"""),format.raw/*234.1*/(""".btn-lteal """),format.raw/*234.12*/("""{"""),format.raw/*234.13*/("""
    """),format.raw/*235.5*/("""color: #009587;
    background-color: transparent;
    border-color: #009587;
"""),format.raw/*238.1*/("""}"""),format.raw/*238.2*/("""
"""),format.raw/*239.1*/(""".btn-lcolor9:hover """),format.raw/*239.20*/("""{"""),format.raw/*239.21*/("""
    """),format.raw/*240.5*/("""color: #fff;
    background-color: #009587;
    border-color: #009587;
"""),format.raw/*243.1*/("""}"""),format.raw/*243.2*/("""


"""),format.raw/*246.1*/(""".btn-color10 """),format.raw/*246.14*/("""{"""),format.raw/*246.15*/("""
    """),format.raw/*247.5*/("""color: #f8f8f8;
    background-color: #4BAE4F;
    border-color: #449d47;
"""),format.raw/*250.1*/("""}"""),format.raw/*250.2*/("""
"""),format.raw/*251.1*/(""".btn-color10:hover """),format.raw/*251.20*/("""{"""),format.raw/*251.21*/("""
    """),format.raw/*252.5*/("""color: #fff;
    background-color: #449d47;
    border-color: #449d47;
"""),format.raw/*255.1*/("""}"""),format.raw/*255.2*/("""
"""),format.raw/*256.1*/(""".btn-lcolor10 """),format.raw/*256.15*/("""{"""),format.raw/*256.16*/("""
    """),format.raw/*257.5*/("""color: #4BAE4F;
    background-color: transparent;
    border-color: #4BAE4F;
"""),format.raw/*260.1*/("""}"""),format.raw/*260.2*/("""
"""),format.raw/*261.1*/(""".btn-lcolor10:hover """),format.raw/*261.21*/("""{"""),format.raw/*261.22*/("""
    """),format.raw/*262.5*/("""color: #fff;
    background-color: #4BAE4F;
    border-color: #4BAE4F;
"""),format.raw/*265.1*/("""}"""),format.raw/*265.2*/("""



"""),format.raw/*269.1*/(""".btn-color11 """),format.raw/*269.14*/("""{"""),format.raw/*269.15*/("""
    """),format.raw/*270.5*/("""color: #f8f8f8;
    background-color: #8AC249;
    border-color: #78a83f;
"""),format.raw/*273.1*/("""}"""),format.raw/*273.2*/("""
"""),format.raw/*274.1*/(""".btn-color11:hover """),format.raw/*274.20*/("""{"""),format.raw/*274.21*/("""
    """),format.raw/*275.5*/("""color: #fff;
    background-color: #78a83f;
    border-color: #78a83f;
"""),format.raw/*278.1*/("""}"""),format.raw/*278.2*/("""
"""),format.raw/*279.1*/(""".btn-lcolor1 """),format.raw/*279.14*/("""{"""),format.raw/*279.15*/("""
    """),format.raw/*280.5*/("""color: #8AC249;
    background-color: transparent;
    border-color: #8AC249;
"""),format.raw/*283.1*/("""}"""),format.raw/*283.2*/("""
"""),format.raw/*284.1*/(""".btn-lcolor11:hover """),format.raw/*284.21*/("""{"""),format.raw/*284.22*/("""
    """),format.raw/*285.5*/("""color: #fff;
    background-color: #8AC249;
    border-color: #8AC249;
"""),format.raw/*288.1*/("""}"""),format.raw/*288.2*/("""


"""),format.raw/*291.1*/(""".btn-color12 """),format.raw/*291.14*/("""{"""),format.raw/*291.15*/("""
    """),format.raw/*292.5*/("""color: #f8f8f8;
    background-color: #a4b221;
    border-color: #bbc933;
"""),format.raw/*295.1*/("""}"""),format.raw/*295.2*/("""
"""),format.raw/*296.1*/(""".btn-color12:hover """),format.raw/*296.20*/("""{"""),format.raw/*296.21*/("""
    """),format.raw/*297.5*/("""color: #fff;
    background-color: #8c991b;
    border-color: #bbc933;
"""),format.raw/*300.1*/("""}"""),format.raw/*300.2*/("""
"""),format.raw/*301.1*/(""".btn-lcolor12 """),format.raw/*301.15*/("""{"""),format.raw/*301.16*/("""
    """),format.raw/*302.5*/("""color: #CCDB38;
    background-color: transparent;
    border-color: #;
"""),format.raw/*305.1*/("""}"""),format.raw/*305.2*/("""
"""),format.raw/*306.1*/(""".btn-lcolor12:hover """),format.raw/*306.21*/("""{"""),format.raw/*306.22*/("""
    """),format.raw/*307.5*/("""color: #fff;
    background-color: #CCDB38;
    border-color: #CCDB38;
"""),format.raw/*310.1*/("""}"""),format.raw/*310.2*/("""


"""),format.raw/*313.1*/(""".btn-color100 """),format.raw/*313.15*/("""{"""),format.raw/*313.16*/("""
    """),format.raw/*314.5*/("""color: #f8f8f8;
    background-color: #FEEA3A;
    border-color: #e4d235;
"""),format.raw/*317.1*/("""}"""),format.raw/*317.2*/("""
"""),format.raw/*318.1*/(""".btn-color100:hover """),format.raw/*318.21*/("""{"""),format.raw/*318.22*/("""
    """),format.raw/*319.5*/("""color: #fff;
    background-color: #e4d235;
    border-color: #e4d235;
"""),format.raw/*322.1*/("""}"""),format.raw/*322.2*/("""
"""),format.raw/*323.1*/(""".btn-lcolor100 """),format.raw/*323.16*/("""{"""),format.raw/*323.17*/("""
    """),format.raw/*324.5*/("""color: #FEEA3A;
    background-color: transparent;
    border-color: #FEEA3A;
"""),format.raw/*327.1*/("""}"""),format.raw/*327.2*/("""
"""),format.raw/*328.1*/(""".btn-lcolor100:hover """),format.raw/*328.22*/("""{"""),format.raw/*328.23*/("""
    """),format.raw/*329.5*/("""color: #fff;
    background-color: #FEEA3A;
    border-color: #FEEA3A;
"""),format.raw/*332.1*/("""}"""),format.raw/*332.2*/("""


"""),format.raw/*335.1*/(""".btn-color105 """),format.raw/*335.15*/("""{"""),format.raw/*335.16*/("""
    """),format.raw/*336.5*/("""color: #f8f8f8;
    background-color: #c69709;
    border-color: #e1aa05;
"""),format.raw/*339.1*/("""}"""),format.raw/*339.2*/("""
"""),format.raw/*340.1*/(""".btn-color105:hover """),format.raw/*340.21*/("""{"""),format.raw/*340.22*/("""
    """),format.raw/*341.5*/("""color: #fff;
    background-color: #ad8406;
    border-color: #e1aa05;
"""),format.raw/*344.1*/("""}"""),format.raw/*344.2*/("""
"""),format.raw/*345.1*/(""".btn-lcolor105 """),format.raw/*345.16*/("""{"""),format.raw/*345.17*/("""
    """),format.raw/*346.5*/("""color: #FEC006;
    background-color: transparent;
    border-color: #FEC006;
"""),format.raw/*349.1*/("""}"""),format.raw/*349.2*/("""
"""),format.raw/*350.1*/(""".btn-lcolor105:hover """),format.raw/*350.22*/("""{"""),format.raw/*350.23*/("""
    """),format.raw/*351.5*/("""color: #fff;
    background-color: #FEC006;
    border-color: #FEC006;
"""),format.raw/*354.1*/("""}"""),format.raw/*354.2*/("""


"""),format.raw/*357.1*/(""".btn-color110 """),format.raw/*357.15*/("""{"""),format.raw/*357.16*/("""
    """),format.raw/*358.5*/("""color: #f8f8f8;
    background-color: #FE9700;
    border-color: #e78a01;
"""),format.raw/*361.1*/("""}"""),format.raw/*361.2*/("""
"""),format.raw/*362.1*/(""".btn-color110:hover """),format.raw/*362.21*/("""{"""),format.raw/*362.22*/("""
    """),format.raw/*363.5*/("""color: #fff;
    background-color: #e78a01;
    border-color: #e78a01;
"""),format.raw/*366.1*/("""}"""),format.raw/*366.2*/("""
"""),format.raw/*367.1*/(""".btn-lcolor110 """),format.raw/*367.16*/("""{"""),format.raw/*367.17*/("""
    """),format.raw/*368.5*/("""color: #FE9700;
    background-color: transparent;
    border-color: #FE9700;
"""),format.raw/*371.1*/("""}"""),format.raw/*371.2*/("""
"""),format.raw/*372.1*/(""".btn-lcolor110:hover """),format.raw/*372.22*/("""{"""),format.raw/*372.23*/("""
    """),format.raw/*373.5*/("""color: #fff;
    background-color: #FE9700;
    border-color: #FE9700;
"""),format.raw/*376.1*/("""}"""),format.raw/*376.2*/("""


"""),format.raw/*379.1*/(""".btn-color400 """),format.raw/*379.15*/("""{"""),format.raw/*379.16*/("""
    """),format.raw/*380.5*/("""color: #f8f8f8;
    background-color: #FE5621;
    border-color: #d4481c;
"""),format.raw/*383.1*/("""}"""),format.raw/*383.2*/("""
"""),format.raw/*384.1*/(""".btn-color400:hover """),format.raw/*384.21*/("""{"""),format.raw/*384.22*/("""
    """),format.raw/*385.5*/("""color: #fff;
    background-color: #d4481c;
    border-color: #d4481c;
"""),format.raw/*388.1*/("""}"""),format.raw/*388.2*/("""
"""),format.raw/*389.1*/(""".btn-lcolor400 """),format.raw/*389.16*/("""{"""),format.raw/*389.17*/("""
    """),format.raw/*390.5*/("""color: #FE5621;
    background-color: transparent;
    border-color: #FE5621;
"""),format.raw/*393.1*/("""}"""),format.raw/*393.2*/("""
"""),format.raw/*394.1*/(""".btn-lcolor400:hover """),format.raw/*394.22*/("""{"""),format.raw/*394.23*/("""
    """),format.raw/*395.5*/("""color: #fff;
    background-color: #FE5621;
    border-color: #FE5621;
"""),format.raw/*398.1*/("""}"""),format.raw/*398.2*/("""


"""),format.raw/*401.1*/(""".btn-color17 """),format.raw/*401.14*/("""{"""),format.raw/*401.15*/("""
    """),format.raw/*402.5*/("""color: #f8f8f8;
    background-color: #785447;
    border-color: #65463b;
"""),format.raw/*405.1*/("""}"""),format.raw/*405.2*/("""
"""),format.raw/*406.1*/(""".btn-color17:hover """),format.raw/*406.20*/("""{"""),format.raw/*406.21*/("""
    """),format.raw/*407.5*/("""color: #fff;
    background-color: #65463b;
    border-color: #65463b;
"""),format.raw/*410.1*/("""}"""),format.raw/*410.2*/("""
"""),format.raw/*411.1*/(""".btn-lcolor17 """),format.raw/*411.15*/("""{"""),format.raw/*411.16*/("""
    """),format.raw/*412.5*/("""color: #785447;
    background-color: transparent;
    border-color: #785447;
"""),format.raw/*415.1*/("""}"""),format.raw/*415.2*/("""
"""),format.raw/*416.1*/(""".btn-color17:hover """),format.raw/*416.20*/("""{"""),format.raw/*416.21*/("""
    """),format.raw/*417.5*/("""color: #fff;
    background-color: #785447;
    border-color: #785447;
"""),format.raw/*420.1*/("""}"""),format.raw/*420.2*/("""


"""),format.raw/*423.1*/(""".btn-color401 """),format.raw/*423.15*/("""{"""),format.raw/*423.16*/("""
    """),format.raw/*424.5*/("""color: #f8f8f8;
    background-color: #9D9D9D;
    border-color: #888888;
"""),format.raw/*427.1*/("""}"""),format.raw/*427.2*/("""
"""),format.raw/*428.1*/(""".btn-color401:hover """),format.raw/*428.21*/("""{"""),format.raw/*428.22*/("""
    """),format.raw/*429.5*/("""color: #ffffff;
    background-color: #888888;
    border-color: #888888;
"""),format.raw/*432.1*/("""}"""),format.raw/*432.2*/("""
"""),format.raw/*433.1*/(""".btn-lcolor18 """),format.raw/*433.15*/("""{"""),format.raw/*433.16*/("""
    """),format.raw/*434.5*/("""color: #9D9D9D;
    background-color: transparent;
    border-color: #9D9D9D;
"""),format.raw/*437.1*/("""}"""),format.raw/*437.2*/("""
"""),format.raw/*438.1*/(""".btn-lcolor401:hover """),format.raw/*438.22*/("""{"""),format.raw/*438.23*/("""
    """),format.raw/*439.5*/("""color: #fff;
    background-color: #9D9D9D;
    border-color: #9D9D9D;
"""),format.raw/*442.1*/("""}"""),format.raw/*442.2*/("""


"""),format.raw/*445.1*/(""".btn-color402 """),format.raw/*445.15*/("""{"""),format.raw/*445.16*/("""
    """),format.raw/*446.5*/("""color: #f8f8f8;
    background-color: #5F7C8A;
    border-color: #516a76;
"""),format.raw/*449.1*/("""}"""),format.raw/*449.2*/("""
"""),format.raw/*450.1*/(""".btn-color402:hover """),format.raw/*450.21*/("""{"""),format.raw/*450.22*/("""
    """),format.raw/*451.5*/("""color: #fff;
    background-color: #516a76;
    border-color: #516a76;
"""),format.raw/*454.1*/("""}"""),format.raw/*454.2*/("""
"""),format.raw/*455.1*/(""".btn-lcolor402 """),format.raw/*455.16*/("""{"""),format.raw/*455.17*/("""
    """),format.raw/*456.5*/("""color: #5F7C8A;
    background-color: transparent;
    border-color: #5F7C8A;
"""),format.raw/*459.1*/("""}"""),format.raw/*459.2*/("""
"""),format.raw/*460.1*/(""".btn-lcolor402:hover """),format.raw/*460.22*/("""{"""),format.raw/*460.23*/("""
    """),format.raw/*461.5*/("""color: #fff;
    background-color: #5F7C8A;
    border-color: #5F7C8A;
"""),format.raw/*464.1*/("""}"""),format.raw/*464.2*/("""


"""),format.raw/*467.1*/(""".btn-black """),format.raw/*467.12*/("""{"""),format.raw/*467.13*/("""
    """),format.raw/*468.5*/("""color: #f8f8f8;
    background-color: #2d2d2d;
    border-color: #000000;
"""),format.raw/*471.1*/("""}"""),format.raw/*471.2*/("""
"""),format.raw/*472.1*/(""".btn-black:hover """),format.raw/*472.18*/("""{"""),format.raw/*472.19*/("""
    """),format.raw/*473.5*/("""color: #fff;
    background-color: #000000;
    border-color: #000000;
"""),format.raw/*476.1*/("""}"""),format.raw/*476.2*/("""
"""),format.raw/*477.1*/(""".btn-lblack """),format.raw/*477.13*/("""{"""),format.raw/*477.14*/("""
    """),format.raw/*478.5*/("""color: #2d2d2d;
    background-color: transparent;
    border-color: #2d2d2d;
"""),format.raw/*481.1*/("""}"""),format.raw/*481.2*/("""
"""),format.raw/*482.1*/(""".btn-lblack:hover """),format.raw/*482.19*/("""{"""),format.raw/*482.20*/("""
    """),format.raw/*483.5*/("""color: #fff;
    background-color: #2d2d2d;
    border-color: #2d2d2d;
"""),format.raw/*486.1*/("""}"""),format.raw/*486.2*/("""


"""),format.raw/*489.1*/(""".btn-white """),format.raw/*489.12*/("""{"""),format.raw/*489.13*/("""
    """),format.raw/*490.5*/("""color: #000000;
    background-color: #ffffff;
    border-color: #d3d3d3;
"""),format.raw/*493.1*/("""}"""),format.raw/*493.2*/("""
"""),format.raw/*494.1*/(""".btn-white:hover """),format.raw/*494.18*/("""{"""),format.raw/*494.19*/("""
    """),format.raw/*495.5*/("""color: #222222;
    background-color: #f7f7f7;
    border-color: #d3d3d3;
"""),format.raw/*498.1*/("""}"""),format.raw/*498.2*/("""


"""),format.raw/*501.1*/("""</style>		    
		    
			    """),_display_(/*503.9*/if(currentPage.getTotalRowCount == 0)/*503.46*/ {_display_(Seq[Any](format.raw/*503.48*/("""
			        """),format.raw/*504.12*/("""<div class="well">
			            <em>No existen registros.</em>
			        </div>
			        
			    """)))}/*508.10*/else/*508.15*/{_display_(Seq[Any](format.raw/*508.16*/("""
			        """),format.raw/*509.12*/("""<div class="table-responsive">
						<table class="table table-striped table-bordered table-hover table-condensed">
							<thead>
								<tr>
									"""),_display_(/*513.11*/header("titulo", "Título")),format.raw/*513.37*/("""
									"""),_display_(/*514.11*/header("numcontrol", "Clave de control")),format.raw/*514.51*/("""                    
									"""),_display_(/*515.11*/header("areaconocimiento.descripcion","Área del conocimiento")),format.raw/*515.73*/("""
									"""),_display_(/*516.11*/header("niveleducativo.descripcion","Nivel de conocimiento")),format.raw/*516.71*/("""
									"""),_display_(/*517.11*/header("auditinsert","Fecha registro web")),format.raw/*517.53*/("""
									"""),_display_(/*518.11*/header("estado.descripcion", "Estado")),format.raw/*518.49*/("""
									"""),_display_(/*519.11*/header("", "")),format.raw/*519.25*/("""
									"""),_display_(/*520.11*/header("", "")),format.raw/*520.25*/("""
								"""),format.raw/*521.9*/("""</tr>
							</thead>
							<tbody>
			
								"""),_display_(/*525.10*/for(recurso <- currentPage.getList) yield /*525.45*/ {_display_(Seq[Any](format.raw/*525.47*/("""
									"""),format.raw/*526.10*/("""<tr>
										<td style="display: table-cell; vertical-align: middle"><a href="/reporte/cesoe/"""),_display_(/*527.92*/recurso/*527.99*/.id),format.raw/*527.102*/("""">"""),_display_(/*527.105*/recurso/*527.112*/.titulo),format.raw/*527.119*/("""</a></td>
										<td style="display: table-cell; vertical-align: middle">"""),_display_(/*528.68*/recurso/*528.75*/.numcontrol),format.raw/*528.86*/("""</td>                        
										<td style="display: table-cell; vertical-align: middle">"""),_display_(/*529.68*/recurso/*529.75*/.areaconocimiento.descripcion),format.raw/*529.104*/("""</td>
										<td style="display: table-cell; vertical-align: middle">"""),_display_(/*530.68*/recurso/*530.75*/.niveleducativo.descripcion),format.raw/*530.102*/("""</td>
										<td style="display: table-cell; vertical-align: middle">"""),_display_(/*531.68*/recurso/*531.75*/.auditinsert.format("dd/MM/yyyy")),format.raw/*531.108*/("""</td>
										<td style="display: table-cell; vertical-align: middle">"""),_display_(/*532.68*/recurso/*532.75*/.estado.descripcion),format.raw/*532.94*/("""</td>
										<td style="display: table-cell; vertical-align: middle">
											"""),_display_(/*534.13*/if(recurso.estado.id ==1)/*534.38*/{_display_(Seq[Any](format.raw/*534.39*/("""
												"""),format.raw/*535.13*/("""<a class="btn btn-color"""),_display_(/*535.37*/recurso/*535.44*/.estado.id),format.raw/*535.54*/(""" """),format.raw/*535.55*/("""btn-block" role="button"
												href=""""),_display_(/*536.20*/routes/*536.26*/.RecursoController.edit(recurso.id)),format.raw/*536.61*/("""" >Agregar observaciones
												</a>
											""")))}),format.raw/*538.13*/("""
											"""),_display_(/*539.13*/if(recurso.estado.id ==2)/*539.38*/{_display_(Seq[Any](format.raw/*539.39*/("""
												"""),format.raw/*540.13*/("""<a class="btn btn-color"""),_display_(/*540.37*/recurso/*540.44*/.estado.id),format.raw/*540.54*/(""" """),format.raw/*540.55*/("""btn-block" role="button"
												href=""""),_display_(/*541.20*/routes/*541.26*/.RecursoController.edit(recurso.id)),format.raw/*541.61*/("""">Revisar observaciones
												</a>
											""")))}),format.raw/*543.13*/("""

											"""),_display_(/*545.13*/if(recurso.estado.id ==3)/*545.38*/{_display_(Seq[Any](format.raw/*545.39*/("""
												"""),format.raw/*546.13*/("""<a class="btn btn-color"""),_display_(/*546.37*/recurso/*546.44*/.estado.id),format.raw/*546.54*/(""" """),format.raw/*546.55*/("""btn-block" role="button"
												href=""""),_display_(/*547.20*/routes/*547.26*/.OficioController.create(recurso.id)),format.raw/*547.62*/("""">Asignar oficio
												</a>
											""")))}),format.raw/*549.13*/("""
											"""),_display_(/*550.13*/if(recurso.estado.id ==4)/*550.38*/{_display_(Seq[Any](format.raw/*550.39*/("""
												"""),format.raw/*551.13*/("""<a class="btn btn-color"""),_display_(/*551.37*/recurso/*551.44*/.estado.id),format.raw/*551.54*/(""" """),format.raw/*551.55*/("""btn-block" role="button"
												href=""""),_display_(/*552.20*/routes/*552.26*/.ClasificacionController.create(recurso.id)),format.raw/*552.69*/("""">Clasificar
												</a>
											""")))}),format.raw/*554.13*/("""								
											"""),_display_(/*555.13*/if(recurso.estado.id==5)/*555.37*/{_display_(Seq[Any](format.raw/*555.38*/("""
												"""),format.raw/*556.13*/("""<a class="btn btn-color"""),_display_(/*556.37*/recurso/*556.44*/.estado.id),format.raw/*556.54*/(""" """),format.raw/*556.55*/("""btn-block" role="button"
												href=""""),_display_(/*557.20*/routes/*557.26*/.RecursoevaluadorController.asignarEvaluadoresCreate(recurso.id)),format.raw/*557.90*/("""">Asignar evaluadores
												</a>
											""")))}),format.raw/*559.13*/("""
											"""),_display_(/*560.13*/if( recurso.estado.id==6 )/*560.39*/{_display_(Seq[Any](format.raw/*560.40*/("""
												"""),format.raw/*561.13*/("""<a class="btn btn-color"""),_display_(/*561.37*/recurso/*561.44*/.estado.id),format.raw/*561.54*/(""" """),format.raw/*561.55*/("""btn-block" role="button"
												Evaluadores asignados 
												href=""""),_display_(/*563.20*/routes/*563.26*/.RecursoevaluadorController.mostrarEvaluadores(recurso.id)),format.raw/*563.84*/("""">Ver evaluadores
												</a>
											""")))}),format.raw/*565.13*/("""

											"""),_display_(/*567.13*/if( recurso.estado.id==7  )/*567.40*/{_display_(Seq[Any](format.raw/*567.41*/("""
												"""),format.raw/*568.13*/("""<a class="btn btn-color"""),_display_(/*568.37*/recurso/*568.44*/.estado.id),format.raw/*568.54*/(""" """),format.raw/*568.55*/("""btn-block" role="button"
												href=""""),_display_(/*569.20*/routes/*569.26*/.ReporteController.cesoe(recurso.id)),format.raw/*569.62*/("""">Evaluación en proceso
												</a>
											""")))}),format.raw/*571.13*/("""
											"""),_display_(/*572.13*/if( recurso.estado.id==8  )/*572.40*/{_display_(Seq[Any](format.raw/*572.41*/("""
												"""),format.raw/*573.13*/("""<a class="btn btn-color"""),_display_(/*573.37*/recurso/*573.44*/.estado.id),format.raw/*573.54*/(""" """),format.raw/*573.55*/("""btn-block" role="button"
												href=""""),_display_(/*574.20*/routes/*574.26*/.ReporteController.cesoe(recurso.id)),format.raw/*574.62*/("""">Evaluaciones a ser revisadas por el admininstrador
												</a>
											""")))}),format.raw/*576.13*/("""	
											"""),_display_(/*577.13*/if( recurso.estado.id==9  )/*577.40*/{_display_(Seq[Any](format.raw/*577.41*/("""
												"""),format.raw/*578.13*/("""<a class="btn btn-color"""),_display_(/*578.37*/recurso/*578.44*/.estado.id),format.raw/*578.54*/(""" """),format.raw/*578.55*/("""btn-block" role="button"
												href=""""),_display_(/*579.20*/routes/*579.26*/.ReporteController.cesoe(recurso.id)),format.raw/*579.62*/("""">Evaluaciones con observaciones
												</a>
											""")))}),format.raw/*581.13*/("""
											"""),_display_(/*582.13*/if( scala.List(10, 11, 12, 110).exists ( x => x == recurso.estado.id ) )/*582.85*/{_display_(Seq[Any](format.raw/*582.86*/("""
												"""),format.raw/*583.13*/("""<a href='"""),_display_(/*583.23*/routes/*583.29*/.RecursoevaluadorController.evaluada(recurso.id,"0")),format.raw/*583.81*/("""' role="button" class="btn btn-color"""),_display_(/*583.118*/recurso/*583.125*/.estado.id),format.raw/*583.135*/(""" """),format.raw/*583.136*/("""btn-block center-block">Evaluación</a>
												
												
												<a class="btn btn-color"""),_display_(/*586.37*/recurso/*586.44*/.estado.id),format.raw/*586.54*/(""" """),format.raw/*586.55*/("""btn-block" role="button"
												href=""""),_display_(/*587.20*/routes/*587.26*/.RecursoevaluadorController.reporteEvaluacion(recurso.id)),format.raw/*587.83*/("""" target="blank">Reporte de evaluación
												</a>
											""")))}),format.raw/*589.13*/("""				
"""),_display_(/*590.2*/println(recurso.titulo+" "+recurso.estado.id)),format.raw/*590.47*/("""
											"""),_display_(/*591.13*/if( recurso.estado.id==11  )/*591.41*/{_display_(Seq[Any](format.raw/*591.42*/("""
												"""),format.raw/*592.13*/("""<a class="btn btn-color"""),_display_(/*592.37*/recurso/*592.44*/.estado.id),format.raw/*592.54*/(""" """),format.raw/*592.55*/("""btn-block" role="button"
												href=""""),_display_(/*593.20*/routes/*593.26*/.EncuestaController.encuestaPorRevisar(recurso.id)),format.raw/*593.76*/("""">Revisar encuesta
												</a>
											""")))}),format.raw/*595.13*/("""				
											"""),_display_(/*596.13*/if( recurso.estado.id == 100  )/*596.44*/{_display_(Seq[Any](format.raw/*596.45*/("""
												"""),format.raw/*597.13*/("""<a class="btn btn-color"""),_display_(/*597.37*/recurso/*597.44*/.estado.id),format.raw/*597.54*/(""" """),format.raw/*597.55*/("""btn-block" role="button"
												Administrar evaluadores
												href=""""),_display_(/*599.20*/routes/*599.26*/.RecursoevaluadorController.asignarEvaluadoresCreate(recurso.id)),format.raw/*599.90*/("""">Administrar evaluadores
												</a>
											""")))}),format.raw/*601.13*/("""											
											"""),_display_(/*602.13*/if(recurso.estado.id ==105)/*602.40*/{_display_(Seq[Any](format.raw/*602.41*/("""
												"""),format.raw/*603.13*/("""<a class="btn btn-color"""),_display_(/*603.37*/recurso/*603.44*/.estado.id),format.raw/*603.54*/(""" """),format.raw/*603.55*/("""btn-block" role="button"
												href=""""),_display_(/*604.20*/routes/*604.26*/.RecursoController.edit(recurso.id)),format.raw/*604.61*/("""">Correcciones a observaciones
												</a>
											""")))}),format.raw/*606.13*/("""											
											
											"""),_display_(/*608.13*/if( recurso.estado.id==110  )/*608.42*/{_display_(Seq[Any](format.raw/*608.43*/("""
												"""),format.raw/*609.13*/("""<a class="btn btn-color"""),_display_(/*609.37*/recurso/*609.44*/.estado.id),format.raw/*609.54*/(""" """),format.raw/*609.55*/("""btn-block" role="button"
												href=""""),_display_(/*610.20*/routes/*610.26*/.RecursoController.verOficioValoracion(recurso.oficiovaloracion.id)),format.raw/*610.93*/("""" target="blank">Ver oficio de valoración
												</a>
											""")))}),format.raw/*612.13*/("""											
											"""),_display_(/*613.13*/if(recurso.estado.id == 400 )/*613.42*/{_display_(Seq[Any](format.raw/*613.43*/("""
												"""),format.raw/*614.13*/("""<a class="btn btn-color"""),_display_(/*614.37*/recurso/*614.44*/.estado.id),format.raw/*614.54*/(""" """),format.raw/*614.55*/("""btn-block" role="button"
												href=""""),_display_(/*615.20*/routes/*615.26*/.RecursoController.solicitudCancelado(recurso.id)),format.raw/*615.75*/("""">Revisar
												</a>
											""")))}),format.raw/*617.13*/("""
											"""),_display_(/*618.13*/if(recurso.estado.id == 401)/*618.41*/{_display_(Seq[Any](format.raw/*618.42*/("""
												"""),format.raw/*619.13*/("""<a class="btn btn-color"""),_display_(/*619.37*/recurso/*619.44*/.estado.id),format.raw/*619.54*/(""" """),format.raw/*619.55*/("""btn-block" role="button"
												href=""""),_display_(/*620.20*/routes/*620.26*/.ReporteController.cesoe(recurso.id)),format.raw/*620.62*/("""">Cancelado en clasificación
												</a>
											""")))}),format.raw/*622.13*/("""
											"""),_display_(/*623.13*/if(recurso.estado.id == 402)/*623.41*/{_display_(Seq[Any](format.raw/*623.42*/("""
												"""),format.raw/*624.13*/("""<a class="btn btn-color"""),_display_(/*624.37*/recurso/*624.44*/.estado.id),format.raw/*624.54*/(""" """),format.raw/*624.55*/("""btn-block" role="button"
												href=""""),_display_(/*625.20*/routes/*625.26*/.ReporteController.cesoe(recurso.id)),format.raw/*625.62*/("""">Cancelado en evaluación
												</a>
											""")))}),format.raw/*627.13*/("""
											
			
						
										"""),format.raw/*631.11*/("""</td>
										<td style="display: table-cell; vertical-align: middle"><button type="button" class="btn btn-danger btn-block" name="btnEliminar"""),_display_(/*632.140*/recurso/*632.147*/.id.toString),format.raw/*632.159*/("""">Eliminar</button></td>
									</tr>
								""")))}),format.raw/*634.10*/("""
			
							"""),format.raw/*636.8*/("""</tbody>
						</table>
					</div>
			
			        <div id="pagination" class="pagination">
			            <ul>
			                """),_display_(/*642.21*/if(currentPage.hasPrev)/*642.44*/ {_display_(Seq[Any](format.raw/*642.46*/("""
			                    """),format.raw/*643.24*/("""<li class="prev">
			                        <a href=""""),_display_(/*644.38*/link(currentPage.getPageIndex - 1, null, currentCampoFiltro)),format.raw/*644.98*/("""">&larr; Anterior</a>
			                    </li>
			                """)))}/*646.22*/else/*646.27*/{_display_(Seq[Any](format.raw/*646.28*/("""
			                    """),format.raw/*647.24*/("""<li class="prev disabled">
			                        <a>&larr; Anterior</a>
			                    </li>
			                """)))}),format.raw/*650.21*/("""
			                """),format.raw/*651.20*/("""<li class="current">
			                    <a>Mostrando registros del """),_display_(/*652.52*/currentPage/*652.63*/.getDisplayXtoYofZ(" al "," de un total de ")),format.raw/*652.108*/("""</a>
			                </li>
			                """),_display_(/*654.21*/if(currentPage.hasNext)/*654.44*/ {_display_(Seq[Any](format.raw/*654.46*/("""
			                    """),format.raw/*655.24*/("""<li class="next">
			                        <a href=""""),_display_(/*656.38*/link(currentPage.getPageIndex + 1, null, currentCampoFiltro)),format.raw/*656.98*/("""">Siguiente &rarr;</a>
			                    </li>
			                """)))}/*658.22*/else/*658.27*/{_display_(Seq[Any](format.raw/*658.28*/("""
			                    """),format.raw/*659.24*/("""<li class="next disabled">
			                        <a>Siguiente &rarr;</a>
			                    </li>
			                """)))}),format.raw/*662.21*/("""
			            """),format.raw/*663.16*/("""</ul>
			        </div>
			    """)))}))}
  }

  def render(currentPage:com.avaje.ebean.Page[Recurso],currentSortBy:String,currentOrder:String,currentFilter:String,currentCampoFiltro:String): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,currentCampoFiltro)

  def f:((com.avaje.ebean.Page[Recurso],String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,currentCampoFiltro) => apply(currentPage,currentSortBy,currentOrder,currentFilter,currentCampoFiltro)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Jan 30 11:54:34 CST 2024
                  SOURCE: /home/epuente/playFramework/erdd2024/app/views/Recurso/ajaxListTabla.scala.html
                  HASH: 490a48bf5da722efd5e72230397948dc611a5181
                  MATRIX: 790->1|1017->1088|1031->1094|1138->1124|1170->1129|1209->1141|1221->1144|1259->1161|1288->1162|1323->1170|1357->1196|1444->1260|1499->1288|1552->1320|1582->1323|1608->1328|1655->167|1687->191|1757->379|1768->383|2392->141|2427->248|2458->377|2486->976|2516->1086|2544->1344|2593->1366|2642->1387|2671->1388|2703->1393|2804->1467|2832->1468|2860->1469|2906->1487|2935->1488|2967->1493|3065->1564|3093->1565|3121->1566|3162->1579|3191->1580|3223->1585|3328->1663|3356->1664|3384->1665|3431->1684|3460->1685|3492->1690|3590->1761|3618->1762|3648->1765|3688->1777|3717->1778|3749->1783|3850->1857|3878->1858|3906->1859|3952->1877|3981->1878|4013->1883|4111->1954|4139->1955|4167->1956|4208->1969|4237->1970|4269->1975|4374->2053|4402->2054|4430->2055|4477->2074|4506->2075|4538->2080|4636->2151|4664->2152|4694->2155|4734->2167|4763->2168|4795->2173|4896->2247|4924->2248|4952->2249|4998->2267|5027->2268|5059->2273|5158->2344|5187->2345|5216->2346|5258->2359|5288->2360|5321->2365|5427->2443|5456->2444|5485->2445|5533->2464|5563->2465|5596->2470|5695->2541|5724->2542|5755->2545|5796->2557|5826->2558|5859->2563|5961->2637|5990->2638|6019->2639|6066->2657|6096->2658|6129->2663|6228->2734|6257->2735|6286->2736|6328->2749|6358->2750|6391->2755|6497->2833|6526->2834|6555->2835|6603->2854|6633->2855|6666->2860|6765->2931|6794->2932|6825->2935|6866->2947|6896->2948|6929->2953|7031->3027|7060->3028|7089->3029|7136->3047|7166->3048|7199->3053|7298->3124|7327->3125|7356->3126|7398->3139|7428->3140|7461->3145|7567->3223|7596->3224|7625->3225|7673->3244|7703->3245|7736->3250|7835->3321|7864->3322|7895->3325|7936->3337|7966->3338|7999->3343|8101->3417|8130->3418|8159->3419|8206->3437|8236->3438|8269->3443|8368->3514|8397->3515|8426->3516|8468->3529|8498->3530|8531->3535|8637->3613|8666->3614|8695->3615|8743->3634|8773->3635|8806->3640|8905->3711|8934->3712|8965->3715|9006->3727|9036->3728|9069->3733|9171->3807|9200->3808|9229->3809|9276->3827|9306->3828|9339->3833|9438->3904|9467->3905|9496->3906|9537->3918|9567->3919|9600->3924|9706->4002|9735->4003|9764->4004|9811->4022|9841->4023|9874->4028|9973->4099|10002->4100|10033->4103|10074->4115|10104->4116|10137->4121|10239->4195|10268->4196|10297->4197|10344->4215|10374->4216|10407->4221|10506->4292|10535->4293|10564->4294|10606->4307|10636->4308|10669->4313|10775->4391|10804->4392|10833->4393|10881->4412|10911->4413|10944->4418|11043->4489|11072->4490|11103->4493|11144->4505|11174->4506|11207->4511|11309->4585|11338->4586|11367->4587|11414->4605|11444->4606|11477->4611|11576->4682|11605->4683|11634->4684|11674->4695|11704->4696|11737->4701|11843->4779|11872->4780|11901->4781|11949->4800|11979->4801|12012->4806|12111->4877|12140->4878|12171->4881|12213->4894|12243->4895|12276->4900|12378->4974|12407->4975|12436->4976|12484->4995|12514->4996|12547->5001|12646->5072|12675->5073|12704->5074|12747->5088|12777->5089|12810->5094|12916->5172|12945->5173|12974->5174|13023->5194|13053->5195|13086->5200|13185->5271|13214->5272|13246->5276|13288->5289|13318->5290|13351->5295|13453->5369|13482->5370|13511->5371|13559->5390|13589->5391|13622->5396|13721->5467|13750->5468|13779->5469|13821->5482|13851->5483|13884->5488|13990->5566|14019->5567|14048->5568|14097->5588|14127->5589|14160->5594|14259->5665|14288->5666|14319->5669|14361->5682|14391->5683|14424->5688|14526->5762|14555->5763|14584->5764|14632->5783|14662->5784|14695->5789|14794->5860|14823->5861|14852->5862|14895->5876|14925->5877|14958->5882|15058->5954|15087->5955|15116->5956|15165->5976|15195->5977|15228->5982|15327->6053|15356->6054|15387->6057|15430->6071|15460->6072|15493->6077|15595->6151|15624->6152|15653->6153|15702->6173|15732->6174|15765->6179|15864->6250|15893->6251|15922->6252|15966->6267|15996->6268|16029->6273|16135->6351|16164->6352|16193->6353|16243->6374|16273->6375|16306->6380|16405->6451|16434->6452|16465->6455|16508->6469|16538->6470|16571->6475|16673->6549|16702->6550|16731->6551|16780->6571|16810->6572|16843->6577|16942->6648|16971->6649|17000->6650|17044->6665|17074->6666|17107->6671|17213->6749|17242->6750|17271->6751|17321->6772|17351->6773|17384->6778|17483->6849|17512->6850|17543->6853|17586->6867|17616->6868|17649->6873|17751->6947|17780->6948|17809->6949|17858->6969|17888->6970|17921->6975|18020->7046|18049->7047|18078->7048|18122->7063|18152->7064|18185->7069|18291->7147|18320->7148|18349->7149|18399->7170|18429->7171|18462->7176|18561->7247|18590->7248|18621->7251|18664->7265|18694->7266|18727->7271|18829->7345|18858->7346|18887->7347|18936->7367|18966->7368|18999->7373|19098->7444|19127->7445|19156->7446|19200->7461|19230->7462|19263->7467|19369->7545|19398->7546|19427->7547|19477->7568|19507->7569|19540->7574|19639->7645|19668->7646|19699->7649|19741->7662|19771->7663|19804->7668|19906->7742|19935->7743|19964->7744|20012->7763|20042->7764|20075->7769|20174->7840|20203->7841|20232->7842|20275->7856|20305->7857|20338->7862|20444->7940|20473->7941|20502->7942|20550->7961|20580->7962|20613->7967|20712->8038|20741->8039|20772->8042|20815->8056|20845->8057|20878->8062|20980->8136|21009->8137|21038->8138|21087->8158|21117->8159|21150->8164|21252->8238|21281->8239|21310->8240|21353->8254|21383->8255|21416->8260|21522->8338|21551->8339|21580->8340|21630->8361|21660->8362|21693->8367|21792->8438|21821->8439|21852->8442|21895->8456|21925->8457|21958->8462|22060->8536|22089->8537|22118->8538|22167->8558|22197->8559|22230->8564|22329->8635|22358->8636|22387->8637|22431->8652|22461->8653|22494->8658|22600->8736|22629->8737|22658->8738|22708->8759|22738->8760|22771->8765|22870->8836|22899->8837|22930->8840|22970->8851|23000->8852|23033->8857|23135->8931|23164->8932|23193->8933|23239->8950|23269->8951|23302->8956|23401->9027|23430->9028|23459->9029|23500->9041|23530->9042|23563->9047|23669->9125|23698->9126|23727->9127|23774->9145|23804->9146|23837->9151|23936->9222|23965->9223|23996->9226|24036->9237|24066->9238|24099->9243|24201->9317|24230->9318|24259->9319|24305->9336|24335->9337|24368->9342|24470->9416|24499->9417|24530->9420|24587->9450|24634->9487|24675->9489|24716->9501|24839->9605|24853->9610|24893->9611|24934->9623|25116->9777|25164->9803|25203->9814|25265->9854|25324->9885|25408->9947|25447->9958|25529->10018|25568->10029|25632->10071|25671->10082|25731->10120|25770->10131|25806->10145|25845->10156|25881->10170|25918->10179|25996->10229|26048->10264|26089->10266|26128->10276|26252->10372|26269->10379|26295->10382|26327->10385|26345->10392|26375->10399|26480->10476|26497->10483|26530->10494|26655->10591|26672->10598|26724->10627|26825->10700|26842->10707|26892->10734|26993->10807|27010->10814|27066->10847|27167->10920|27184->10927|27225->10946|27338->11031|27373->11056|27413->11057|27455->11070|27507->11094|27524->11101|27556->11111|27586->11112|27658->11156|27674->11162|27731->11197|27817->11251|27858->11264|27893->11289|27933->11290|27975->11303|28027->11327|28044->11334|28076->11344|28106->11345|28178->11389|28194->11395|28251->11430|28336->11483|28378->11497|28413->11522|28453->11523|28495->11536|28547->11560|28564->11567|28596->11577|28626->11578|28698->11622|28714->11628|28772->11664|28850->11710|28891->11723|28926->11748|28966->11749|29008->11762|29060->11786|29077->11793|29109->11803|29139->11804|29211->11848|29227->11854|29292->11897|29366->11939|29415->11960|29449->11984|29489->11985|29531->11998|29583->12022|29600->12029|29632->12039|29662->12040|29734->12084|29750->12090|29836->12154|29919->12205|29960->12218|29996->12244|30036->12245|30078->12258|30130->12282|30147->12289|30179->12299|30209->12300|30316->12379|30332->12385|30412->12443|30491->12490|30533->12504|30570->12531|30610->12532|30652->12545|30704->12569|30721->12576|30753->12586|30783->12587|30855->12631|30871->12637|30929->12673|31014->12726|31055->12739|31092->12766|31132->12767|31174->12780|31226->12804|31243->12811|31275->12821|31305->12822|31377->12866|31393->12872|31451->12908|31565->12990|31607->13004|31644->13031|31684->13032|31726->13045|31778->13069|31795->13076|31827->13086|31857->13087|31929->13131|31945->13137|32003->13173|32097->13235|32138->13248|32220->13320|32260->13321|32302->13334|32340->13344|32356->13350|32430->13402|32496->13439|32514->13446|32547->13456|32578->13457|32707->13558|32724->13565|32756->13575|32786->13576|32858->13620|32874->13626|32953->13683|33053->13751|33086->13757|33153->13802|33194->13815|33232->13843|33272->13844|33314->13857|33366->13881|33383->13888|33415->13898|33445->13899|33517->13943|33533->13949|33605->13999|33685->14047|33730->14064|33771->14095|33811->14096|33853->14109|33905->14133|33922->14140|33954->14150|33984->14151|34092->14231|34108->14237|34194->14301|34281->14356|34333->14380|34370->14407|34410->14408|34452->14421|34504->14445|34521->14452|34553->14462|34583->14463|34655->14507|34671->14513|34728->14548|34820->14608|34884->14644|34923->14673|34963->14674|35005->14687|35057->14711|35074->14718|35106->14728|35136->14729|35208->14773|35224->14779|35313->14846|35416->14917|35468->14941|35507->14970|35547->14971|35589->14984|35641->15008|35658->15015|35690->15025|35720->15026|35792->15070|35808->15076|35879->15125|35950->15164|35991->15177|36029->15205|36069->15206|36111->15219|36163->15243|36180->15250|36212->15260|36242->15261|36314->15305|36330->15311|36388->15347|36478->15405|36519->15418|36557->15446|36597->15447|36639->15460|36691->15484|36708->15491|36740->15501|36770->15502|36842->15546|36858->15552|36916->15588|37003->15643|37066->15677|37240->15822|37258->15829|37293->15841|37374->15890|37414->15902|37574->16034|37607->16057|37648->16059|37701->16083|37784->16138|37866->16198|37957->16270|37971->16275|38011->16276|38064->16300|38222->16426|38271->16446|38371->16518|38392->16529|38460->16574|38538->16624|38571->16647|38612->16649|38665->16673|38748->16728|38830->16788|38922->16861|38936->16866|38976->16867|39029->16891|39188->17018|39233->17034
                  LINES: 26->1|28->38|28->38|30->38|31->39|31->39|31->39|31->39|31->39|31->39|31->39|31->39|32->40|32->40|32->40|32->40|34->3|34->3|34->9|34->9|59->1|60->3|63->8|64->33|66->37|67->42|71->46|73->48|73->48|74->49|77->52|77->52|78->53|78->53|78->53|79->54|82->57|82->57|83->58|83->58|83->58|84->59|87->62|87->62|88->63|88->63|88->63|89->64|92->67|92->67|95->70|95->70|95->70|96->71|99->74|99->74|100->75|100->75|100->75|101->76|104->79|104->79|105->80|105->80|105->80|106->81|109->84|109->84|110->85|110->85|110->85|111->86|114->89|114->89|117->92|117->92|117->92|118->93|121->96|121->96|122->97|122->97|122->97|123->98|126->101|126->101|127->102|127->102|127->102|128->103|131->106|131->106|132->107|132->107|132->107|133->108|136->111|136->111|139->114|139->114|139->114|140->115|143->118|143->118|144->119|144->119|144->119|145->120|148->123|148->123|149->124|149->124|149->124|150->125|153->128|153->128|154->129|154->129|154->129|155->130|158->133|158->133|161->136|161->136|161->136|162->137|165->140|165->140|166->141|166->141|166->141|167->142|170->145|170->145|171->146|171->146|171->146|172->147|175->150|175->150|176->151|176->151|176->151|177->152|180->155|180->155|183->158|183->158|183->158|184->159|187->162|187->162|188->163|188->163|188->163|189->164|192->167|192->167|193->168|193->168|193->168|194->169|197->172|197->172|198->173|198->173|198->173|199->174|202->177|202->177|205->180|205->180|205->180|206->181|209->184|209->184|210->185|210->185|210->185|211->186|214->189|214->189|215->190|215->190|215->190|216->191|219->194|219->194|220->195|220->195|220->195|221->196|224->199|224->199|227->202|227->202|227->202|228->203|231->206|231->206|232->207|232->207|232->207|233->208|236->211|236->211|237->212|237->212|237->212|238->213|241->216|241->216|242->217|242->217|242->217|243->218|246->221|246->221|249->224|249->224|249->224|250->225|253->228|253->228|254->229|254->229|254->229|255->230|258->233|258->233|259->234|259->234|259->234|260->235|263->238|263->238|264->239|264->239|264->239|265->240|268->243|268->243|271->246|271->246|271->246|272->247|275->250|275->250|276->251|276->251|276->251|277->252|280->255|280->255|281->256|281->256|281->256|282->257|285->260|285->260|286->261|286->261|286->261|287->262|290->265|290->265|294->269|294->269|294->269|295->270|298->273|298->273|299->274|299->274|299->274|300->275|303->278|303->278|304->279|304->279|304->279|305->280|308->283|308->283|309->284|309->284|309->284|310->285|313->288|313->288|316->291|316->291|316->291|317->292|320->295|320->295|321->296|321->296|321->296|322->297|325->300|325->300|326->301|326->301|326->301|327->302|330->305|330->305|331->306|331->306|331->306|332->307|335->310|335->310|338->313|338->313|338->313|339->314|342->317|342->317|343->318|343->318|343->318|344->319|347->322|347->322|348->323|348->323|348->323|349->324|352->327|352->327|353->328|353->328|353->328|354->329|357->332|357->332|360->335|360->335|360->335|361->336|364->339|364->339|365->340|365->340|365->340|366->341|369->344|369->344|370->345|370->345|370->345|371->346|374->349|374->349|375->350|375->350|375->350|376->351|379->354|379->354|382->357|382->357|382->357|383->358|386->361|386->361|387->362|387->362|387->362|388->363|391->366|391->366|392->367|392->367|392->367|393->368|396->371|396->371|397->372|397->372|397->372|398->373|401->376|401->376|404->379|404->379|404->379|405->380|408->383|408->383|409->384|409->384|409->384|410->385|413->388|413->388|414->389|414->389|414->389|415->390|418->393|418->393|419->394|419->394|419->394|420->395|423->398|423->398|426->401|426->401|426->401|427->402|430->405|430->405|431->406|431->406|431->406|432->407|435->410|435->410|436->411|436->411|436->411|437->412|440->415|440->415|441->416|441->416|441->416|442->417|445->420|445->420|448->423|448->423|448->423|449->424|452->427|452->427|453->428|453->428|453->428|454->429|457->432|457->432|458->433|458->433|458->433|459->434|462->437|462->437|463->438|463->438|463->438|464->439|467->442|467->442|470->445|470->445|470->445|471->446|474->449|474->449|475->450|475->450|475->450|476->451|479->454|479->454|480->455|480->455|480->455|481->456|484->459|484->459|485->460|485->460|485->460|486->461|489->464|489->464|492->467|492->467|492->467|493->468|496->471|496->471|497->472|497->472|497->472|498->473|501->476|501->476|502->477|502->477|502->477|503->478|506->481|506->481|507->482|507->482|507->482|508->483|511->486|511->486|514->489|514->489|514->489|515->490|518->493|518->493|519->494|519->494|519->494|520->495|523->498|523->498|526->501|528->503|528->503|528->503|529->504|533->508|533->508|533->508|534->509|538->513|538->513|539->514|539->514|540->515|540->515|541->516|541->516|542->517|542->517|543->518|543->518|544->519|544->519|545->520|545->520|546->521|550->525|550->525|550->525|551->526|552->527|552->527|552->527|552->527|552->527|552->527|553->528|553->528|553->528|554->529|554->529|554->529|555->530|555->530|555->530|556->531|556->531|556->531|557->532|557->532|557->532|559->534|559->534|559->534|560->535|560->535|560->535|560->535|560->535|561->536|561->536|561->536|563->538|564->539|564->539|564->539|565->540|565->540|565->540|565->540|565->540|566->541|566->541|566->541|568->543|570->545|570->545|570->545|571->546|571->546|571->546|571->546|571->546|572->547|572->547|572->547|574->549|575->550|575->550|575->550|576->551|576->551|576->551|576->551|576->551|577->552|577->552|577->552|579->554|580->555|580->555|580->555|581->556|581->556|581->556|581->556|581->556|582->557|582->557|582->557|584->559|585->560|585->560|585->560|586->561|586->561|586->561|586->561|586->561|588->563|588->563|588->563|590->565|592->567|592->567|592->567|593->568|593->568|593->568|593->568|593->568|594->569|594->569|594->569|596->571|597->572|597->572|597->572|598->573|598->573|598->573|598->573|598->573|599->574|599->574|599->574|601->576|602->577|602->577|602->577|603->578|603->578|603->578|603->578|603->578|604->579|604->579|604->579|606->581|607->582|607->582|607->582|608->583|608->583|608->583|608->583|608->583|608->583|608->583|608->583|611->586|611->586|611->586|611->586|612->587|612->587|612->587|614->589|615->590|615->590|616->591|616->591|616->591|617->592|617->592|617->592|617->592|617->592|618->593|618->593|618->593|620->595|621->596|621->596|621->596|622->597|622->597|622->597|622->597|622->597|624->599|624->599|624->599|626->601|627->602|627->602|627->602|628->603|628->603|628->603|628->603|628->603|629->604|629->604|629->604|631->606|633->608|633->608|633->608|634->609|634->609|634->609|634->609|634->609|635->610|635->610|635->610|637->612|638->613|638->613|638->613|639->614|639->614|639->614|639->614|639->614|640->615|640->615|640->615|642->617|643->618|643->618|643->618|644->619|644->619|644->619|644->619|644->619|645->620|645->620|645->620|647->622|648->623|648->623|648->623|649->624|649->624|649->624|649->624|649->624|650->625|650->625|650->625|652->627|656->631|657->632|657->632|657->632|659->634|661->636|667->642|667->642|667->642|668->643|669->644|669->644|671->646|671->646|671->646|672->647|675->650|676->651|677->652|677->652|677->652|679->654|679->654|679->654|680->655|681->656|681->656|683->658|683->658|683->658|684->659|687->662|688->663
                  -- GENERATED --
              */
          