
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, nav: String = "")(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import be.objectify.deadbolt.java.views.html._
import be.objectify.deadbolt.core.utils.TemplateUtils._
import admin._

Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*6.1*/("""
"""),format.raw/*7.1*/("""<!DOCTYPE html>
<html lang=""""),_display_(/*8.14*/lang()/*8.20*/.code()),format.raw/*8.27*/("""">
  <head>
    <title>"""),_display_(/*10.13*/title),format.raw/*10.18*/("""</title>

    <!-- Le meta -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Play Authenticate - an authentication module for the Play! Framework 2.0">
    <meta name="author" content="The Play Authenticate Team">

    <!-- Le scripts -->
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script src=""""),_display_(/*20.16*/routes/*20.22*/.Assets.at("js/bootstrap.min.js")),format.raw/*20.55*/(""""></script>
	<script src=""""),_display_(/*21.16*/routes/*21.22*/.Application.jsRoutes),format.raw/*21.43*/("""" defer="defer"></script>

    <!-- Le styles -->
    <link href=""""),_display_(/*24.18*/routes/*24.24*/.Assets.at("css/main.css")),format.raw/*24.50*/("""" rel="stylesheet">
    <link href=""""),_display_(/*25.18*/routes/*25.24*/.Assets.at("css/bootstrap.min.css")),format.raw/*25.59*/("""" rel="stylesheet">


    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

  </head>

  <body>

    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href=""""),_display_(/*45.35*/routes/*45.41*/.Application.login()),format.raw/*45.61*/("""">Bangladesh DB Police Criminal Database</a>

          <div class="btn-group pull-right">
          """),_display_(/*48.12*/subjectPresentOr()/*48.30*/ {_display_(Seq[Any](format.raw/*48.32*/("""
          	"""),_display_(/*49.13*/defining(Application.getLocalUser(session()))/*49.58*/ { user =>_display_(Seq[Any](format.raw/*49.68*/("""
            """),format.raw/*50.13*/("""<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
              <i class="icon-user"></i> """),_display_(/*51.42*/user/*51.46*/.name),format.raw/*51.51*/("""
              """),format.raw/*52.15*/("""<span class="caret"></span>
            </a>
            <ul class="dropdown-menu">
              <li><a href=""""),_display_(/*55.29*/routes/*55.35*/.Application.profile()),format.raw/*55.57*/("""">"""),_display_(/*55.60*/Messages("playauthenticate.navigation.profile")),format.raw/*55.107*/("""</a></li>
              <li><a href=""""),_display_(/*56.29*/routes/*56.35*/.Account.link()),format.raw/*56.50*/("""">"""),_display_(/*56.53*/Messages("playauthenticate.navigation.link_more")),format.raw/*56.102*/("""</a></li>
              <li class="divider"></li>
              <li><a href=""""),_display_(/*58.29*/com/*58.32*/.feth.play.module.pa.controllers.routes.Authenticate.logout()),format.raw/*58.93*/(""""><i class="icon-off"></i> """),_display_(/*58.121*/Messages("playauthenticate.navigation.logout")),format.raw/*58.167*/("""</a></li>
            </ul>
            
            """)))}),format.raw/*61.14*/("""
          """)))}/*62.12*/{_display_(Seq[Any](format.raw/*62.13*/("""
            """),format.raw/*63.13*/("""<a href=""""),_display_(/*63.23*/routes/*63.29*/.Application.login()),format.raw/*63.49*/("""" class="btn btn-primary btn-mini """),_display_(/*63.84*/("disabled".when(nav == "login"))),format.raw/*63.117*/("""">"""),_display_(/*63.120*/Messages("playauthenticate.navigation.login")),format.raw/*63.165*/("""</a>
          """)))}),format.raw/*64.12*/("""
          """),format.raw/*65.11*/("""</div>


          <div class="nav-collapse">
           </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container">
	    """),_display_(/*75.7*/if(flash.contains(Application.FLASH_ERROR_KEY))/*75.54*/ {_display_(Seq[Any](format.raw/*75.56*/("""
	      """),format.raw/*76.8*/("""<div class="alert alert-error">
	      	"""),_display_(/*77.10*/flash()/*77.17*/.get(Application.FLASH_ERROR_KEY)),format.raw/*77.50*/("""
	      """),format.raw/*78.8*/("""</div>
	    """)))}),format.raw/*79.7*/("""
	    """),_display_(/*80.7*/if(flash.contains(Application.FLASH_MESSAGE_KEY))/*80.56*/ {_display_(Seq[Any](format.raw/*80.58*/("""
	      """),format.raw/*81.8*/("""<div class="alert alert-success">
	      	"""),_display_(/*82.10*/flash()/*82.17*/.get(Application.FLASH_MESSAGE_KEY)),format.raw/*82.52*/("""
	      """),format.raw/*83.8*/("""</div>
	    """)))}),format.raw/*84.7*/("""
		"""),_display_(/*85.4*/content),format.raw/*85.11*/("""

    """),format.raw/*87.5*/("""<hr>

      <footer>
        <p>&copy; 2012-2014 Play! Authenticate. Licensed under Apache License, Version 2.0. View details <a href="https://github.com/joscha/play-authenticate/blob/master/LICENSE">here</a>.</p>
        <p>
        <small>Styles by <a href="http://twitter.github.com/bootstrap/index.html" target="_blank">Twitter Bootstrap</a> &middot; Provider icons by <a href="https://github.com/paulrobertlloyd/socialmediaicons/" target="_blank">Paul Robert Lloyd</a></small></p>
      </footer>
    </div> <!-- /container -->

  </body>
</html>
"""))}
  }

  def render(title:String,nav:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,nav)(content)

  def f:((String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Oct 15 06:10:59 BDT 2015
                  SOURCE: F:/Shekhar/play project/bdbpcdb/bangladesh_db_police_criminal_database/app/views/main.scala.html
                  HASH: 1baf039d9a0e11c5def7510c41f4a8a615befdb3
                  MATRIX: 734->1|987->49|1015->172|1042->173|1097->202|1111->208|1138->215|1189->239|1215->244|1674->676|1689->682|1743->715|1797->742|1812->748|1854->769|1948->836|1963->842|2010->868|2074->905|2089->911|2145->946|2773->1547|2788->1553|2829->1573|2958->1675|2985->1693|3025->1695|3065->1708|3119->1753|3167->1763|3208->1776|3340->1881|3353->1885|3379->1890|3422->1905|3561->2017|3576->2023|3619->2045|3649->2048|3718->2095|3783->2133|3798->2139|3834->2154|3864->2157|3935->2206|4040->2284|4052->2287|4134->2348|4190->2376|4258->2422|4343->2476|4374->2488|4413->2489|4454->2502|4491->2512|4506->2518|4547->2538|4609->2573|4664->2606|4695->2609|4762->2654|4809->2670|4848->2681|5034->2841|5090->2888|5130->2890|5165->2898|5233->2939|5249->2946|5303->2979|5338->2987|5381->3000|5414->3007|5472->3056|5512->3058|5547->3066|5617->3109|5633->3116|5689->3151|5724->3159|5767->3172|5797->3176|5825->3183|5858->3189
                  LINES: 26->1|31->1|33->6|34->7|35->8|35->8|35->8|37->10|37->10|47->20|47->20|47->20|48->21|48->21|48->21|51->24|51->24|51->24|52->25|52->25|52->25|72->45|72->45|72->45|75->48|75->48|75->48|76->49|76->49|76->49|77->50|78->51|78->51|78->51|79->52|82->55|82->55|82->55|82->55|82->55|83->56|83->56|83->56|83->56|83->56|85->58|85->58|85->58|85->58|85->58|88->61|89->62|89->62|90->63|90->63|90->63|90->63|90->63|90->63|90->63|90->63|91->64|92->65|102->75|102->75|102->75|103->76|104->77|104->77|104->77|105->78|106->79|107->80|107->80|107->80|108->81|109->82|109->82|109->82|110->83|111->84|112->85|112->85|114->87
                  -- GENERATED --
              */
          