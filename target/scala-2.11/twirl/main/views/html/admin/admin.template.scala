
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
object admin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[_],localUser: models.User = null):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._

Seq[Any](format.raw/*1.53*/("""

"""),_display_(/*5.2*/dashboardtem("Home")/*5.22*/{_display_(Seq[Any](format.raw/*5.23*/("""
	 """),format.raw/*6.3*/("""<div id="wrapper">

         <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Add User
                            <small>For administration</small>
                        </h1>
                        <ol class="breadcrumb">
                           <div class="row">
    <div class="span6">
      <h1>"""),_display_(/*22.12*/Messages("playauthenticate.signup.title")),format.raw/*22.53*/("""</h1>
    </div>
  </div>
<div id="signup" class="row">

    <div class="span3">
        """),format.raw/*28.45*/("""
    	"""),_display_(/*29.7*/helper/*29.13*/.form(routes.Application.doSignup)/*29.47*/ {_display_(Seq[Any](format.raw/*29.49*/("""
    	
            """),_display_(/*31.14*/if(signupForm.hasGlobalErrors)/*31.44*/ {_display_(Seq[Any](format.raw/*31.46*/(""" 
                """),format.raw/*32.17*/("""<p class="error">
		            <span class="label label-important">"""),_display_(/*33.52*/signupForm/*33.62*/.globalError.message),format.raw/*33.82*/("""</span>
		        </p>
            """)))}),format.raw/*35.14*/("""
            
             """),_display_(/*37.15*/inputText(
                signupForm("name"),
                '_label -> Messages("playauthenticate.signup.name")
             )),format.raw/*40.15*/("""
             
             """),_display_(/*42.15*/_emailPartial(signupForm)),format.raw/*42.40*/("""
             
             """),_display_(/*44.15*/_passwordPartial(signupForm)),format.raw/*44.43*/("""

            """),format.raw/*46.13*/("""<input type="submit" value=""""),_display_(/*46.42*/Messages("playauthenticate.signup.now")),format.raw/*46.81*/("""" class="btn btn-primary">
    	""")))}),format.raw/*47.7*/("""
    """),format.raw/*48.5*/("""</div>

    

  </div>

                        </ol>
                    </div>
                </div>
                <!-- /.row -->

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->
    </div>
    <!-- /#wrapper -->
	
   
""")))}))}
  }

  def render(signupForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},localUser:models.User): play.twirl.api.HtmlFormat.Appendable = apply(signupForm,localUser)

  def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},models.User) => play.twirl.api.HtmlFormat.Appendable) = (signupForm,localUser) => apply(signupForm,localUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Oct 15 06:43:37 BDT 2015
                  SOURCE: F:/Shekhar/play project/bdbpcdb/bangladesh_db_police_criminal_database/app/views/admin/admin.scala.html
                  HASH: 30b7ba5708024d4d70285f598487975cbd1796bc
                  MATRIX: 815->1|1002->52|1030->106|1058->126|1096->127|1125->130|1671->649|1733->690|1850->815|1883->822|1898->828|1941->862|1981->864|2028->884|2067->914|2107->916|2153->934|2249->1003|2268->1013|2309->1033|2376->1069|2431->1097|2581->1226|2637->1255|2683->1280|2739->1309|2788->1337|2830->1351|2886->1380|2946->1419|3009->1452|3041->1457
                  LINES: 28->1|32->1|34->5|34->5|34->5|35->6|51->22|51->22|57->28|58->29|58->29|58->29|58->29|60->31|60->31|60->31|61->32|62->33|62->33|62->33|64->35|66->37|69->40|71->42|71->42|73->44|73->44|75->46|75->46|75->46|76->47|77->48
                  -- GENERATED --
              */
          