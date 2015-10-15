
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
object dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(localUser: models.User = null):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/dashboardtem("Home")/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
	
    """),format.raw/*5.5*/("""<div id="wrapper">

         <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Blank Page
                            <small>Subheading</small>
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.html">Dashboard</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-file"></i> Blank Page
                            </li>
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

  def render(localUser:models.User): play.twirl.api.HtmlFormat.Appendable = apply(localUser)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (localUser) => apply(localUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Oct 15 07:28:12 BDT 2015
                  SOURCE: F:/Shekhar/play project/bdbpcdb/bangladesh_db_police_criminal_database/app/views/admin/dashboard.scala.html
                  HASH: f282ec95278a8f2027e78aae1e7d29098d438319
                  MATRIX: 738->1|857->32|885->35|913->55|951->56|984->63
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5
                  -- GENERATED --
              */
          