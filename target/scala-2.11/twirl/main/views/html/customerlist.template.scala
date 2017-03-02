
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object customerlist_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class customerlist extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

	"""),format.raw/*5.2*/("""<div class="row" >

		<div class="col-lg-6 padding0"><h3 id="forms">Customers</h3></div>
		<div class="col-lg-6 padding0"><h3 id="forms"><!--<button data-toggle="modal" href="#" data-target="#myModal" class="btn btn-primary btn-md pull-right">Add Customer</button>--></h3></div>

		<div class="col-lg-12" style='height:250px!important'>
		<table class="table table-bordered table-striped table-hover" >
		  <thead>
			  <tr>
				  <td colspan="5"> <label ><b>Search</b></label>
					  <input type="text" ng-model="search123"  placeholder="Search"></td></tr>
			<tr>
			  <th>Customer ID</th>
			  <th>Customer Name</th>
			  <th>Customer Address</th>
			  <th>Customer PhoneNo</th>
			  <th>Customer EmailId</th>
			</tr>
		  </thead>
		  <tbody>
		 
			<tr   dir-paginate="cus in customers |filter:search123 |itemsPerPage:5 " class="clickable-row" value='"""),format.raw/*26.106*/("""{"""),format.raw/*26.107*/("""{"""),format.raw/*26.108*/("""cus.id"""),format.raw/*26.114*/("""}"""),format.raw/*26.115*/("""}"""),format.raw/*26.116*/("""' ng-click="selectcust(cus.id); ">
              <td><a ng-href="http://localhost:9000/customeraccountlist/"""),format.raw/*27.73*/("""{"""),format.raw/*27.74*/("""{"""),format.raw/*27.75*/("""cus.id"""),format.raw/*27.81*/("""}"""),format.raw/*27.82*/("""}"""),format.raw/*27.83*/("""">"""),format.raw/*27.85*/("""{"""),format.raw/*27.86*/("""{"""),format.raw/*27.87*/("""cus.id"""),format.raw/*27.93*/("""}"""),format.raw/*27.94*/("""}"""),format.raw/*27.95*/("""</a></td>
              <td>"""),format.raw/*28.19*/("""{"""),format.raw/*28.20*/("""{"""),format.raw/*28.21*/("""cus.name"""),format.raw/*28.29*/("""}"""),format.raw/*28.30*/("""}"""),format.raw/*28.31*/("""</td>
              <td>"""),format.raw/*29.19*/("""{"""),format.raw/*29.20*/("""{"""),format.raw/*29.21*/("""cus.address"""),format.raw/*29.32*/("""}"""),format.raw/*29.33*/("""}"""),format.raw/*29.34*/("""</td>
              <td>"""),format.raw/*30.19*/("""{"""),format.raw/*30.20*/("""{"""),format.raw/*30.21*/("""cus.phoneNo"""),format.raw/*30.32*/("""}"""),format.raw/*30.33*/("""}"""),format.raw/*30.34*/("""</td>
              <td>"""),format.raw/*31.19*/("""{"""),format.raw/*31.20*/("""{"""),format.raw/*31.21*/("""cus.emailId"""),format.raw/*31.32*/("""}"""),format.raw/*31.33*/("""}"""),format.raw/*31.34*/("""</td>
            </tr>		
			
		  </tbody>
		</table>
			
		</div>
		 <div class="col-lg-12">
		<dir-pagination-controls
			max-size="1"
			direction-links="true"
			boundary-links="true" >
			</dir-pagination-controls>
			</div>
	</div>

	<div class="row">
          <div class="col-lg-12">		  
              <form role="form" name="frmcreate1" style="border:1px solid #ecf0f1;" enctype="multipart/form-data" method="post" class="has-sucess" novalidate>
                <fieldset>                  
                  <div class="form-group"><span>"""),format.raw/*51.49*/("""{"""),format.raw/*51.50*/("""{"""),format.raw/*51.51*/("""ids.checked.length"""),format.raw/*51.69*/("""}"""),format.raw/*51.70*/("""}"""),format.raw/*51.71*/("""</span>
                    <label for="inputEmail" class="col-lg-4 control-label"></label>
                    <div class="col-lg-8">						
                    </div>
                  </div>
				  <div class="form-group">
                    <label for="inputEmail" class="col-lg-4 control-label"><span class="pull-right">Customer ID :</span></label>
                    <div class="col-lg-6">
                      <input type="text" class="form-control" id="id" placeholder="Customer ID" name="cid" autofocus ng-model="CustomerDetail.id" required/>
						<span style="color:red" ng-show="frmcreate1.cid.$error.required && frmcreate1.$submitted">Required :Customer ID</span>
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="inputPassword" class="col-lg-4 control-label"><span class="pull-right">Customer Name :</span></label>
                    <div class="col-lg-6">
                      <input type="text" class="form-control" id="name" placeholder="Customer Name" name="cname" autofocus ng-model="CustomerDetail.name"  required>
					  <span style="color:red" ng-show="frmcreate1.cname.$error.required && frmcreate1.$submitted">Required :Customer Name</span>
                    </div>
                  </div>
				  
					<div class="form-group">
						<label for="name" class="col-lg-4 control-label" ><span class="pull-right">Customer Address :</span></label>
						<div class="col-lg-6">
							<input name="address" class="form-control" placeholder="Address"  autofocus ng-model="CustomerDetail.address" type="text" id="address" required/>
							<span style="color:red" ng-show="frmcreate1.address.$error.required && frmcreate1.$submitted">Required :Address</span>
						</div>
					</div>
					<div class="form-group">
						<label for="name"  class="col-lg-4 control-label"><span class="pull-right">Customer PhoneNo :</span></label>
						<div class="col-lg-6">
							<input name="phoneNo" class="form-control" placeholder="Phone Number" autofocus ng-model="CustomerDetail.phoneNo" type="text"  id="phoneNo" required/>
							<span style="color:red" ng-show="frmcreate1.phoneNo.$error.required && frmcreate1.$submitted">Required :Phone Number</span>
						</div>
					</div>
					<div class="form-group">
						<label for="name" class="col-lg-4 control-label" ><span class="pull-right">Customer EmailId :</span></label>
						<div class="col-lg-6">
							<input name="EmailId" class="form-control col-lg-6" placeholder="Email address" autofocus ng-model="CustomerDetail.emailId" type="text"    id="emailId" required/>
							<span style="color:red" ng-show="frmcreate1.EmailId.$error.required && frmcreate1.$submitted">Required :Email ID</span>
						</div>
					</div>
					<div class="form-group">
						<label for="name" class="col-lg-4 control-label" ></label>
						<div class="col-lg-8">&nbsp;</div>
					</div>

                  <div class="form-group">
                    <div class="col-lg-8 col-lg-offset-3">
                      <button type="reset" class="btn btn-default"  data-dismiss="modal">Cancel</button>
                      <button ng-show="add" ng-click="addCust(frmcreate1.$valid) ; " class="btn btn-primary">Submit</button>
                      <button ng-show="update" ng-click="upCust(frmcreate1.$valid) ; " class="btn btn-primary">Update</button>
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

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object customerlist extends customerlist_Scope0.customerlist
              /*
                  -- GENERATED --
                  DATE: Wed Mar 01 05:47:25 IST 2017
                  SOURCE: C:/Users/krishna/Downloads/BankingServicesApp/app/views/customerlist.scala.html
                  HASH: 32ac1821933094593ead756f5a9fb6e079bf2d53
                  MATRIX: 541->1|653->18|683->23|714->46|753->48|784->53|1690->930|1720->931|1750->932|1785->938|1815->939|1845->940|1981->1048|2010->1049|2039->1050|2073->1056|2102->1057|2131->1058|2161->1060|2190->1061|2219->1062|2253->1068|2282->1069|2311->1070|2368->1099|2397->1100|2426->1101|2462->1109|2491->1110|2520->1111|2573->1136|2602->1137|2631->1138|2670->1149|2699->1150|2728->1151|2781->1176|2810->1177|2839->1178|2878->1189|2907->1190|2936->1191|2989->1216|3018->1217|3047->1218|3086->1229|3115->1230|3144->1231|3740->1799|3769->1800|3798->1801|3844->1819|3873->1820|3902->1821
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|50->26|50->26|50->26|50->26|50->26|50->26|51->27|51->27|51->27|51->27|51->27|51->27|51->27|51->27|51->27|51->27|51->27|51->27|52->28|52->28|52->28|52->28|52->28|52->28|53->29|53->29|53->29|53->29|53->29|53->29|54->30|54->30|54->30|54->30|54->30|54->30|55->31|55->31|55->31|55->31|55->31|55->31|75->51|75->51|75->51|75->51|75->51|75->51
                  -- GENERATED --
              */
          