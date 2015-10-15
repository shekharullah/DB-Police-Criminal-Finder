
package views.html.admin

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
object dashboardtem extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
  <head>
    <title>"""),_display_(/*5.13*/title),format.raw/*5.18*/("""</title>
     
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.at("css/admin.css")),format.raw/*7.87*/("""">
         <link rel="stylesheet" media="screen" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.at("bootstrap/font-awesome/css/font-awesome.min.css")),format.raw/*8.122*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png")),format.raw/*9.97*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.at("bootstrap/js/bootstrap.js")),format.raw/*10.68*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("javascripts/menu.js")),format.raw/*11.62*/("""" type="text/javascript"></script>
        
  </head>
  <body>
  """),_display_(/*15.4*/main(Messages("playauthenticate.navigation.restricted"), "restricted")/*15.74*/ {_display_(Seq[Any](format.raw/*15.76*/("""
  """),format.raw/*16.3*/("""<!-- Navigation -->
    <!-- Top Nav Start -->
        <div id='cssmenu'>
          <ul>
            <li class='active'>
              <a href='#'><i class="fa fa-dashboard"></i>Dashboards</a>
             
            </li>
            <li>
              <a href="">
                <i class="fa fa-align-justify"></i>
                Add Criminal
              </a>
            </li>
            
             <li>
              <a href=""""),_display_(/*32.25*/routes/*32.31*/.Admin.blank()),format.raw/*32.45*/("""">
                <i class="fa fa-align-justify"></i>
                Add User
              </a>
            </li>
            
           
          </ul>
        </div>
        <!-- Top Nav End -->
         <section class="content">"""),_display_(/*42.36*/content),format.raw/*42.43*/("""</section>
         """)))}),format.raw/*43.11*/("""
  """),format.raw/*44.3*/("""</body>
</html>

"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Oct 15 06:15:23 BDT 2015
                  SOURCE: F:/Shekhar/play project/bdbpcdb/bangladesh_db_police_criminal_database/app/views/admin/dashboardtem.scala.html
                  HASH: d0a1dc03fe189095cb84940fe7792e281d728f1d
                  MATRIX: 741->1|859->31|887->33|960->80|985->85|1081->155|1095->161|1142->188|1226->246|1240->252|1322->313|1410->375|1424->381|1476->413|1529->439|1544->445|1604->484|1689->542|1704->548|1758->581|1854->651|1933->721|1973->723|2004->727|2488->1184|2503->1190|2538->1204|2812->1451|2840->1458|2893->1480|2924->1484
                  LINES: 26->1|29->1|30->2|33->5|33->5|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|43->15|43->15|43->15|44->16|60->32|60->32|60->32|70->42|70->42|71->43|72->44
                  -- GENERATED --
              */
          