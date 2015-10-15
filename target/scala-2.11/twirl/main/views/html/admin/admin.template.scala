
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
object admin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[_]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap._

Seq[Any](format.raw/*1.23*/("""

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
}): play.twirl.api.HtmlFormat.Appendable = apply(signupForm)

  def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => play.twirl.api.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Oct 15 05:33:03 BDT 2015
                  SOURCE: F:/Shekhar/play project/bdbpcdb/bangladesh_db_police_criminal_database/app/views/admin/admin.scala.html
                  HASH: 0cb343374f0def0c258d0cfe638d5f8b6cdab310
                  MATRIX: 803->1|960->22|988->76|1016->96|1054->97|1083->100|1629->619|1691->660|1808->785|1841->792|1856->798|1899->832|1939->834|1986->854|2025->884|2065->886|2111->904|2207->973|2226->983|2267->1003|2334->1039|2389->1067|2539->1196|2595->1225|2641->1250|2697->1279|2746->1307|2788->1321|2844->1350|2904->1389|2967->1422|2999->1427
                  LINES: 28->1|32->1|34->5|34->5|34->5|35->6|51->22|51->22|57->28|58->29|58->29|58->29|58->29|60->31|60->31|60->31|61->32|62->33|62->33|62->33|64->35|66->37|69->40|71->42|71->42|73->44|73->44|75->46|75->46|75->46|76->47|77->48
                  -- GENERATED --
              */
          