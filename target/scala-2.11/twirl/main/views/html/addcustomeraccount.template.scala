
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addcustomeraccount_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class addcustomeraccount extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
"""),format.raw/*4.1*/("""<html align="center">
<head></head>

<body align="center">
<div class="col-sm-12">
    <hr style="border:1px solid #fff"/>
</div>
<div  align="center">

    <button ng-click="getcustomerlist()" class="btn btn-sm btn-primary"><span class="glyphicon glyphicon-step-backward"></span>GetCustomer</button>
    <button ng-click="getcusaccount()" class="btn btn-sm btn-primary"><span class="glyphicon glyphicon-step-backward"></span>GetCustomerAccount</button>
    <button ng-click="myFunc()" class="btn btn-sm btn-primary"><span class="glyphicon glyphicon-step-backward"></span>GetBankAccount</button>
</div>
<hr>
<hr style="border:1px solid #fff"/>
<h3><b>Add Customer Account</b><h3>
    <form role="form" name="frmcreate1" enctype="multipart/form-data" method="post" class="has-success" >
        <div   class="registerform col-md-offset-1 col-md-11 has-success" style="padding-top:30px;">

            <div class="padding0 col-sm-5 btn-sm" style="padding-top:30px;">

                <div class="form-group" >
                    <label for="name" >Customer ID:</label>
                    <select name="id"  ng-model="CustomerDetail1.id" ng-options="cus.id as cus.name for cus in customers" >
                        <option value="">--Select Vendor Type--</option>

                    </select>
                   <!-- <input name="templatename" autofocus ng-model="CustomerDetail.id" type="text" id="id" />-->

                </div>
                <div class="form-group">
                    <label for="name"  >Customer A/C No:</label>
                    <input name="accountId" autofocus ng-model="CustomerDetail1.accountId" type="text"  id="accountId"/>

                </div>
                <div class="form-group">
                    <label for="name"  >Customer A/C Type:</label>
                    <input name="status" autofocus ng-model="CustomerDetail1.status" type="text"    id="status"/>
                </div>

                <div class="form-inline">
                    <input type="button" ng-click="addCustAccount(frmcreate1.$valid);"   value="SAVE" />
                    <input type="button" ng-click="cancel1(1)"    value="CANCEL" />
                </div>
            </div>
        </div>
    </form>


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
object addcustomeraccount extends addcustomeraccount_Scope0.addcustomeraccount
              /*
                  -- GENERATED --
                  DATE: Wed Mar 01 05:47:24 IST 2017
                  SOURCE: C:/Users/krishna/Downloads/BankingServicesApp/app/views/addcustomeraccount.scala.html
                  HASH: 9c6729c69dbc019341fae0918a40e151a4f7db8c
                  MATRIX: 553->1|665->18|695->23|726->46|765->48|793->50
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4
                  -- GENERATED --
              */
          