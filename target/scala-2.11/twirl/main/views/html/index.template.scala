
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*2.2*/main(Messages("Bangladesh DB Police"))/*2.40*/ {_display_(Seq[Any](format.raw/*2.42*/("""
      """),format.raw/*3.7*/("""<!-- Main hero unit for a primary marketing message or call to action -->
      <div class="hero-unit">
        <h1>"""),_display_(/*5.14*/Messages("playauthenticate.index.intro")),format.raw/*5.54*/("""</h1>
        <p>"""),_display_(/*6.13*/Messages("playauthenticate.index.intro_2")),format.raw/*6.55*/(""" """),format.raw/*6.56*/("""<br/>"""),_display_(/*6.62*/Messages("playauthenticate.index.intro_3")),format.raw/*6.104*/("""</p>
      </div>

      <!-- Example row of columns -->
      <div class="row">
        <div class="span4">
          <h2>"""),_display_(/*12.16*/Messages("playauthenticate.index.heading")),format.raw/*12.58*/("""</h2>
           <p>Cupcake ipsum dolor sit amet. Pastry pie powder biscuit bear claw. Jelly-o chocolate bar sweet roll sugar plum chocolate. Biscuit brownie chupa chups macaroon ice cream halvah sugar plum oat cake ice cream.</p>
          <p><a class="btn" href="#">"""),_display_(/*14.39*/Messages("playauthenticate.index.details")),format.raw/*14.81*/(""" """),format.raw/*14.82*/("""&raquo;</a></p>
        </div>
        <div class="span4">
          <h2>Heading</h2>
           <p>Applicake macaroon caramels gummi bears pastry. Cake liquorice carrot cake chocolate lollipop dessert. Halvah fruitcake marshmallow pie gummi bears pie marzipan.</p>
          <p><a class="btn" href="#">"""),_display_(/*19.39*/Messages("playauthenticate.index.details")),format.raw/*19.81*/(""" """),format.raw/*19.82*/("""&raquo;</a></p>
       </div>
        <div class="span4">
          <h2>Heading</h2>
          <p>Wafer halvah jujubes lollipop liquorice jelly-o pastry. Pie halvah toffee. Candy canes donut sugar plum. Chocolate cake powder tart liquorice cotton candy pudding sweet.</p>
          <p><a class="btn" href="#">"""),_display_(/*24.39*/Messages("playauthenticate.index.details")),format.raw/*24.81*/(""" """),format.raw/*24.82*/("""&raquo;</a></p>
        </div>
      </div>
    """)))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Oct 15 02:52:19 BDT 2015
                  SOURCE: F:/Shekhar/play project/bdbpcdb/bangladesh_db_police_criminal_database/app/views/index.scala.html
                  HASH: 3fd13a27082736ec69fdbeda7a50a82fb64ca5b6
                  MATRIX: 798->2|844->40|883->42|916->49|1059->166|1119->206|1163->224|1225->266|1253->267|1285->273|1348->315|1499->439|1562->481|1858->750|1921->792|1950->793|2281->1097|2344->1139|2373->1140|2710->1450|2773->1492|2802->1493
                  LINES: 29->2|29->2|29->2|30->3|32->5|32->5|33->6|33->6|33->6|33->6|33->6|39->12|39->12|41->14|41->14|41->14|46->19|46->19|46->19|51->24|51->24|51->24
                  -- GENERATED --
              */
          