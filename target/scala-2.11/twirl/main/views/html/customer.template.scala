
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object customer_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class customer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main(message)/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""

"""),format.raw/*5.1*/("""<div class="col-sm-8"  >

    <div class="col-md-2"><b>id:</b></div>
    <div class="col-md-2"><b>Name:</b>  </div>
    <div class="col-md-2"><b>Address:</b>  </div>
    <div class="col-md-2"><b>PhoneNo:</b> </div>
    <div class="col-md-2"><b>EaailId:</b> </div>
    <div class="col-sm-12">
        <hr style="border:1px solid #fff"/>
    </div>

</div>

<div class="col-sm-8">

    <div class="col-md-2"> """),format.raw/*20.28*/("""{"""),format.raw/*20.29*/("""{"""),format.raw/*20.30*/("""customers.id"""),format.raw/*20.42*/("""}"""),format.raw/*20.43*/("""}"""),format.raw/*20.44*/("""</div>
    <div class="col-md-2">"""),format.raw/*21.27*/("""{"""),format.raw/*21.28*/("""{"""),format.raw/*21.29*/("""customers.name"""),format.raw/*21.43*/("""}"""),format.raw/*21.44*/("""}"""),format.raw/*21.45*/("""</div>
    <div class="col-md-2">  """),format.raw/*22.29*/("""{"""),format.raw/*22.30*/("""{"""),format.raw/*22.31*/("""customers.address"""),format.raw/*22.48*/("""}"""),format.raw/*22.49*/("""}"""),format.raw/*22.50*/("""</div>
    <div class="col-md-2">  """),format.raw/*23.29*/("""{"""),format.raw/*23.30*/("""{"""),format.raw/*23.31*/("""customers.phoneNo"""),format.raw/*23.48*/("""}"""),format.raw/*23.49*/("""}"""),format.raw/*23.50*/("""</div>
    <div class="col-md-2">  """),format.raw/*24.29*/("""{"""),format.raw/*24.30*/("""{"""),format.raw/*24.31*/("""customers.emailId"""),format.raw/*24.48*/("""}"""),format.raw/*24.49*/("""}"""),format.raw/*24.50*/("""</div>
    <div class="col-sm-12">
        <hr style="border:1px solid #fff"/>
    </div>

</div>

""")))}))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object customer extends customer_Scope0.customer
              /*
                  -- GENERATED --
                  DATE: Wed Mar 01 05:47:24 IST 2017
                  SOURCE: C:/Users/krishna/Downloads/BankingServicesApp/app/views/customer.scala.html
                  HASH: 33b3630c7249dd2b5cfab7793a35fc5b6c8ac035
                  MATRIX: 533->1|645->18|675->23|696->36|735->38|765->42|1215->464|1244->465|1273->466|1313->478|1342->479|1371->480|1433->514|1462->515|1491->516|1533->530|1562->531|1591->532|1655->568|1684->569|1713->570|1758->587|1787->588|1816->589|1880->625|1909->626|1938->627|1983->644|2012->645|2041->646|2105->682|2134->683|2163->684|2208->701|2237->702|2266->703
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|44->20|44->20|44->20|44->20|44->20|44->20|45->21|45->21|45->21|45->21|45->21|45->21|46->22|46->22|46->22|46->22|46->22|46->22|47->23|47->23|47->23|47->23|47->23|47->23|48->24|48->24|48->24|48->24|48->24|48->24
                  -- GENERATED --
              */
          