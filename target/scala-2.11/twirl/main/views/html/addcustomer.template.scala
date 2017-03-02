
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addcustomer_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class addcustomer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
<h3><b>Add Customer</b><h3>
<form role="form" name="frmcreate1" enctype="multipart/form-data" method="post" class="has-success" >
    <div   class="registerform col-md-offset-1 col-md-11 has-success" style="padding-top:30px;">

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
                <input type="button" ng-click="addCust(frmcreate1.$valid) ; getcustomerlist()"   value="SAVE" />
                <input type="button" ng-click="cancel1(0)"   data-dismiss="modal"  value="CANCEL" />
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
object addcustomer extends addcustomer_Scope0.addcustomer
              /*
                  -- GENERATED --
                  DATE: Wed Mar 01 05:47:24 IST 2017
                  SOURCE: C:/Users/krishna/Downloads/BankingServicesApp/app/views/addcustomer.scala.html
                  HASH: 000d3bf4b40231f5971260fa460f6ec4c19cce7b
                  MATRIX: 539->1|651->18|681->23|712->46|751->48|779->50
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4
                  -- GENERATED --
              */
          