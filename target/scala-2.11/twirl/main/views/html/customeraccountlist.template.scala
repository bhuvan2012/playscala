
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object customeraccountlist_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class customeraccountlist extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
	
	"""),format.raw/*5.2*/("""<div class="row">
		<div class="col-md-6"><h3 id="forms">Customers Account List</h3></div>
		<div class="col-md-6"><!-- <h1 id="forms"><button data-toggle="modal" href="#" data-target="#myModal" class="btn btn-primary pull-right"><span class="glyphicon glyphicon-step-backward"></span>AddCustomerAccount</h1></button>-->
		</div>
		<div class="col-lg-12" style='height:230px!important'>
		<table class="table table-bordered table-striped table-hover ">
		  <thead>
			  <tr>
				  <td colspan="4"><label ><b>Search</b></label>
            <input type="text" ng-model="search123"  placeholder="Search">
				  </td></tr>
			<tr>
			  <th>Customer ID</th>
			  <th>Customer Name</th>
			  <!--<th>Customer Address</th>-->
			  <th>Customer A/C No</th>
			  <th>Customer Status </th>
			</tr>


		  </thead>
		  <tbody>

			<tr  dir-paginate="cus in customerAcountList |itemsPerPage:5 | filter : '"""),_display_(/*28.78*/(id)),format.raw/*28.82*/("""' |filter:search123 ">
			  <td>"""),format.raw/*29.10*/("""{"""),format.raw/*29.11*/("""{"""),format.raw/*29.12*/("""cus.id | uppercase"""),format.raw/*29.30*/("""}"""),format.raw/*29.31*/("""}"""),format.raw/*29.32*/("""</td>
			  <td>"""),format.raw/*30.10*/("""{"""),format.raw/*30.11*/("""{"""),format.raw/*30.12*/("""cus.name"""),format.raw/*30.20*/("""}"""),format.raw/*30.21*/("""}"""),format.raw/*30.22*/("""</td>
			  <td><a ng-href="http://localhost:9000/transactionsist/"""),format.raw/*31.60*/("""{"""),format.raw/*31.61*/("""{"""),format.raw/*31.62*/("""cus.accountId"""),format.raw/*31.75*/("""}"""),format.raw/*31.76*/("""}"""),format.raw/*31.77*/(""""  ng-disabled="cus.status == 'inactive'">"""),format.raw/*31.119*/("""{"""),format.raw/*31.120*/("""{"""),format.raw/*31.121*/("""cus.accountId"""),format.raw/*31.134*/("""}"""),format.raw/*31.135*/("""}"""),format.raw/*31.136*/("""</a></td>
			  <td><button style="padding: 0px! important;" type="button" class="btn btn-sm" style="" ng-class="(cus.status=='active') ? 'active' : 'inactive'" ng-click="activeInactiveCustAccount(cus);">"""),format.raw/*32.194*/("""{"""),format.raw/*32.195*/("""{"""),format.raw/*32.196*/("""cus.status"""),format.raw/*32.206*/("""}"""),format.raw/*32.207*/("""}"""),format.raw/*32.208*/("""</button></td>			</tr >



		  </tbody>
		</table>
		
			
			
		</div>
		 <div class="col-lg-12">
		<dir-pagination-controls
			max-size="3"
			direction-links="true"
			boundary-links="true" >
			</dir-pagination-controls>
			</div>

	</div>


	<div class="row">
          <div class="col-lg-12">
              <form role="form" style="border:1px solid #ecf0f1;" name="frmcreate1" enctype="multipart/form-data" method="post" novalidate class="has-sucess" >
                <fieldset>
				  <div class="form-group"><span></span>
                    <label for="inputEmail" class="col-lg-4 control-label"></label>
                    <div class="col-lg-8">
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="inputEmail" class="col-lg-4 control-label"><span class="pull-right">Customer ID:</span></label>
                    <div class="col-lg-6">
                      <select class="form-control" id="id" placeholder="ID" name="id"  ng-model="CustomerDetail1.id" ng-options="cus.id as cus.id for cus in customers">
					  <option value="">--Select Vendor Type--</option>
					  </select>
                    </div>
                  </div>

                  <div class="form-group">
                    <label for="inputPassword" class="col-lg-4 control-label"><span class="pull-right">Customer A/C No:</span></label>
                    <div class="col-lg-6">
                      <input name="accountId" class="form-control" autofocus ng-model="CustomerDetail1.accountId" id="phoneNo" placeholder="A/C No" required>
						<span style="color:red" ng-show="submit && frmcreate1.accountId.$error.required">Required Customer A/C No</span>
					</div>
                  </div>

					<div class="form-group">
						<label for="name" class="col-lg-4 control-label" ><span class="pull-right">Customer A/C Status:</span></label>
						<div class="col-lg-6">
							<input name="status" class="form-control" autofocus ng-model="CustomerDetail1.status" type="text" id="status" required/>
							<span style="color:red" ng-show="submit && frmcreate1.status.$error.required">Required Customer Status</span>
						</div>
					</div>


					<div class="form-group">
						<label for="actype" class="col-lg-4 control-label" ><span class="pull-right">Customer A/C Type:</span></label>
						<div class="col-lg-6">
							<input name="actype" class="form-control" autofocus ng-model="CustomerDetail1.actype" type="text" id="actype" required/>
							<span style="color:red" ng-show="submit && frmcreate1.actype.$error.required">Required Customer Status</span>
						</div>
					</div>

					<div class="form-group">
						<label for="name" class="col-lg-5 control-label" ></label>
						<div class="col-lg-5">&nbsp;</div>
					</div>
                  <div class="form-group">
                    <div class="col-lg-8 col-lg-offset-3">
                      <button type="reset" class="btn btn-default"data-dismiss="modal">Cancel</button>
                      <button type="submit" ng-click="addCustAccount(frmcreate1.$valid);" class="btn btn-primary">Submit</button>
                    </div>
                  </div>
                </fieldset>
              </form>
		</div>
	</div>
""")))}))
      }
    }
  }

  def render(id:String): play.twirl.api.HtmlFormat.Appendable = apply(id)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (id) => apply(id)

  def ref: this.type = this

}


}

/**/
object customeraccountlist extends customeraccountlist_Scope0.customeraccountlist
              /*
                  -- GENERATED --
                  DATE: Wed Mar 01 05:47:24 IST 2017
                  SOURCE: C:/Users/krishna/Downloads/BankingServicesApp/app/views/customeraccountlist.scala.html
                  HASH: 8d026e1fb56530e254c01fd45aeff6dd42fa3b14
                  MATRIX: 555->1|662->13|692->18|723->41|762->43|794->49|1738->966|1763->970|1824->1003|1853->1004|1882->1005|1928->1023|1957->1024|1986->1025|2030->1041|2059->1042|2088->1043|2124->1051|2153->1052|2182->1053|2276->1119|2305->1120|2334->1121|2375->1134|2404->1135|2433->1136|2504->1178|2534->1179|2564->1180|2606->1193|2636->1194|2666->1195|2899->1399|2929->1400|2959->1401|2998->1411|3028->1412|3058->1413
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|52->28|52->28|53->29|53->29|53->29|53->29|53->29|53->29|54->30|54->30|54->30|54->30|54->30|54->30|55->31|55->31|55->31|55->31|55->31|55->31|55->31|55->31|55->31|55->31|55->31|55->31|56->32|56->32|56->32|56->32|56->32|56->32
                  -- GENERATED --
              */
          