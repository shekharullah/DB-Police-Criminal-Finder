
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
object restricted extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(localUser: models.User = null):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import admin._

Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main(Messages("playauthenticate.navigation.restricted"), "restricted")/*5.72*/ {_display_(Seq[Any](format.raw/*5.74*/("""
    
   """),format.raw/*7.4*/("""<h1>Restricted Accessed</h1>
""")))}))}
  }

  def render(localUser:models.User): play.twirl.api.HtmlFormat.Appendable = apply(localUser)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (localUser) => apply(localUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Oct 15 04:18:05 BDT 2015
                  SOURCE: F:/Shekhar/play project/bdbpcdb/bangladesh_db_police_criminal_database/app/views/restricted.scala.html
                  HASH: 60bee7d8777594b0af24749890dade66000c7e67
                  MATRIX: 733->1|866->32|894->50|921->52|999->122|1038->124|1073->133
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|34->7
                  -- GENERATED --
              */
          