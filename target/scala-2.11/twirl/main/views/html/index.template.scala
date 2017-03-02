
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

"""),format.raw/*5.1*/("""<!--<html align="center">
<head></head>

<body align="center">
<div class="col-sm-12">
    <hr style="border:1px solid #fff"/>
</div>
<div  align="center">
    <h3><b>Banking Services</b><h3>
    <button ng-click="getcustomerlist()"  id="getcus" class="btn btn-sm btn-primary"><span class="glyphicon glyphicon-step-backward"></span>GetCustomer</button>
    <button ng-click="getcustomeraccountlist();getcusaccount();" class="btn btn-sm btn-primary"><span class="glyphicon glyphicon-step-backward"></span>GetCustomerAccount</button>
    <button ng-click="myFunc()"  class="btn btn-sm btn-primary"><span class="glyphicon glyphicon-step-backward"></span>GetBankAccount</button>
</div>
<hr>
<hr style="border:1px solid #fff"/>
<div ng-show="IsVisible1">
    <div class="box">
        <div class="col-md-2"><b>Customer ID:</b></div>
        <div class="col-md-2"><b>Customer Name:</b>  </div>
        <div class="col-md-2"><b>Customer Address:</b>  </div>
        <div class="col-md-2"><b>Customer PhoneNo:</b> </div>
        <div class="col-md-2"><b>Customer EmailId:</b> </div>
        <div class="col-md-2"> <button ng-click="addcustomerform()" class="btn btn-sm btn-primary"><span class="glyphicon glyphicon-step-backward"></span>AddCustomer</button></div>

    </div>

    """),format.raw/*31.5*/("""{"""),format.raw/*31.6*/("""{"""),format.raw/*31.7*/("""customers.length"""),format.raw/*31.23*/("""}"""),format.raw/*31.24*/("""}"""),format.raw/*31.25*/("""

    """),format.raw/*33.5*/("""<div ng-repeat="cus in customers">

        <span class="col-md-2"><b>"""),format.raw/*35.35*/("""{"""),format.raw/*35.36*/("""{"""),format.raw/*35.37*/("""cus.id"""),format.raw/*35.43*/("""}"""),format.raw/*35.44*/("""}"""),format.raw/*35.45*/("""</b></span>
        <span class="col-md-2"><b>"""),format.raw/*36.35*/("""{"""),format.raw/*36.36*/("""{"""),format.raw/*36.37*/("""cus.name"""),format.raw/*36.45*/("""}"""),format.raw/*36.46*/("""}"""),format.raw/*36.47*/("""</b>  </span>
        <span class="col-md-2"><b>"""),format.raw/*37.35*/("""{"""),format.raw/*37.36*/("""{"""),format.raw/*37.37*/("""cus.address"""),format.raw/*37.48*/("""}"""),format.raw/*37.49*/("""}"""),format.raw/*37.50*/("""</b>  </span>
        <span class="col-md-2"><b>"""),format.raw/*38.35*/("""{"""),format.raw/*38.36*/("""{"""),format.raw/*38.37*/("""cus.phoneNo"""),format.raw/*38.48*/("""}"""),format.raw/*38.49*/("""}"""),format.raw/*38.50*/("""</b> </span>
        <span class="col-md-4"><b>"""),format.raw/*39.35*/("""{"""),format.raw/*39.36*/("""{"""),format.raw/*39.37*/("""cus.emailId"""),format.raw/*39.48*/("""}"""),format.raw/*39.49*/("""}"""),format.raw/*39.50*/("""</b> </span>

    </div>
</div>

<form role="form" name="frmcreate1" enctype="multipart/form-data" method="post" class="has-success">
    <div  ng-show="IsVisible2" class="registerform col-md-offset-1 col-md-11 has-success" style="padding-top:30px;">

        <div class="padding0 col-sm-5 btn-sm" style="padding-top:30px;">

            <div class="form-group">
                <label for="name" >Customer ID:</label>
                <input name="templatename" autofocus ng-model="CustomerDetail.id" type="text" id="id" />

            </div>
            <div class="form-group">
                <label for="name"  >Customer Name:</label>
                <input name="templatename" autofocus ng-model="CustomerDetail.name" type="text" id="name" />

            </div>
            <div class="form-group">
                <label for="name"  >Customer Address:</label>
                <input name="templatename" autofocus ng-model="CustomerDetail.address" type="text" id="address"/>

            </div>
            <div class="form-group">
                <label for="name"  >Customer PhoneNo:</label>
                <input name="templatename" autofocus ng-model="CustomerDetail.phoneNo" type="text"  id="phoneNo"/>

            </div>
            <div class="form-group">
                <label for="name"  >Customer EmailId:</label>
                <input name="templatename" autofocus ng-model="CustomerDetail.emailId" type="text"    id="emailId"/>

            </div>
            <div class="form-inline">
                <input type="button" ng-click="addCust(frmcreate1.$valid)"   value="SAVE" />
                <input type="button" ng-click="cancel1()"    value="CANCEL" />
            </div>
        </div>
    </div>
</form>
-->

</body>
</html>
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Mar 01 05:47:25 IST 2017
                  SOURCE: C:/Users/krishna/Downloads/BankingServicesApp/app/views/index.scala.html
                  HASH: b68c688e7ee8d21c5024323b8ba53d7ef61cc934
                  MATRIX: 527->1|639->18|667->21|698->44|737->46|765->48|2065->1321|2093->1322|2121->1323|2165->1339|2194->1340|2223->1341|2256->1347|2354->1417|2383->1418|2412->1419|2446->1425|2475->1426|2504->1427|2578->1473|2607->1474|2636->1475|2672->1483|2701->1484|2730->1485|2806->1533|2835->1534|2864->1535|2903->1546|2932->1547|2961->1548|3037->1596|3066->1597|3095->1598|3134->1609|3163->1610|3192->1611|3267->1658|3296->1659|3325->1660|3364->1671|3393->1672|3422->1673
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|55->31|55->31|55->31|55->31|55->31|55->31|57->33|59->35|59->35|59->35|59->35|59->35|59->35|60->36|60->36|60->36|60->36|60->36|60->36|61->37|61->37|61->37|61->37|61->37|61->37|62->38|62->38|62->38|62->38|62->38|62->38|63->39|63->39|63->39|63->39|63->39|63->39
                  -- GENERATED --
              */
          