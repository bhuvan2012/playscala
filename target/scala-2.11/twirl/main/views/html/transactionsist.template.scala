
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object transactionsist_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class transactionsist extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
	"""),format.raw/*4.2*/("""<!--account no----accountId(dropdown) account type----dropdown-->
<div class="row">
        <hr>
        <div class="col-lg-12" style="padding:0px;">
            <div class="col-lg-6"><h3 id="forms"><!--<b>Transactions</b></h3>--></div>
            <div class="col-lg-6 pull-right">
                <button type="button" ng-model="todayval" style="font-size:12px" ng-click="today("""),_display_(/*10.99*/(id)),format.raw/*10.103*/(""");" id="clickmeonce">Todays Transactions</button>
                <button type="button" ng-model="toptenrec" style="font-size:12px" ng-click="topten();" >Last 10 Transactions</button>
                <button type="button" ng-model="daterange" style="font-size:12px" ng-click="opendates();" >Select Date Range</button>
                <button type="button"  style="font-size:12px" ng-click="balance_transfer=!balance_transfer" >Balance Transfer</button>
            </div>

            <hr>
        </div>

        <div class="col-lg-12 " ng-show="selectrange">
            <span class="pull-right">
            <input type="date" name="startDate" id="startDate" ng-model="startDate" style="width:130px" >
            <input type="date" name="endDate" id="endDate" ng-model="endDate" style="width:130px">
            <button type="button" ng-click="daterange("""),_display_(/*23.56*/(id)),format.raw/*23.60*/(""");" >Filter</button>
            </span>
        </div>

		<div class="col-lg-12" style="padding: 0px !important;">
		<table class="table table-bordered table-striped table-hover " style="500px!important;">
		  <thead>
			<tr>
              <th>Customer Name</th>
			  <th>A/C No</th>
			  <th>A/C Type</th>
			  <th>Available Balance</th>
			</tr>
		  </thead>
		  <tbody>
			<tr ng-repeat="custc in activetransactAcountList | filter : """),_display_(/*38.65*/(id)),format.raw/*38.69*/("""">
			 <td>"""),format.raw/*39.9*/("""{"""),format.raw/*39.10*/("""{"""),format.raw/*39.11*/("""custc.custName"""),format.raw/*39.25*/("""}"""),format.raw/*39.26*/("""}"""),format.raw/*39.27*/("""</td>
			  <td>"""),format.raw/*40.10*/("""{"""),format.raw/*40.11*/("""{"""),format.raw/*40.12*/("""custc.id"""),format.raw/*40.20*/("""}"""),format.raw/*40.21*/("""}"""),format.raw/*40.22*/("""</td>
			  <td>"""),format.raw/*41.10*/("""{"""),format.raw/*41.11*/("""{"""),format.raw/*41.12*/("""custc.name"""),format.raw/*41.22*/("""}"""),format.raw/*41.23*/("""}"""),format.raw/*41.24*/("""</td>
              <td>"""),format.raw/*42.19*/("""{"""),format.raw/*42.20*/("""{"""),format.raw/*42.21*/("""custc.balance"""),format.raw/*42.34*/("""}"""),format.raw/*42.35*/("""}"""),format.raw/*42.36*/("""</td>
			</tr>
		  </tbody>
		</table>
		</div>
</div>

    <div class="row " ng-show="balance_transfer">
        <hr>
        <div class="row well">
            <div class="col-lg-4">
                <div class="form-group">
                    <label>From Account</label>
                    <input type="text" name="fromacc" ng-model="fromacc" disabled="true">
                    <button ng-click="selectaccount('fromacc')">SELECT</button>
                </div>
            </div>

            <div class="col-lg-4">
                <div class="form-group">
                    <label>To Account</label>
                    <input type="text" name="toacc" ng-model="toacc" disabled="true">
                    <button ng-click="selectaccount('toacc')">SELECT</button>
                </div>
            </div>
            <div class="col-lg-4"> <div class="form-group">
                <label>Amount</label>
                <input type="text" name="amountotransfer" ng-model="amountotransfer">
                <button ng-click="tranferamount();">TRANSFER</button>
            </div></div>
        </div>
        <hr>
        <div class="row well">
            <div class="col-lg-12 " >
                <table class="table table-bordered table-striped table-hover ">
                    <thead>
                        <tr>
                            <th>Customer Name</th>
                            <th>A/C No</th>
                            <th>A/C Type</th>
                            <th>Available Balance</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr ng-repeat="custc in activetransactAcountList" class="clickable-row" value='"""),format.raw/*86.104*/("""{"""),format.raw/*86.105*/("""{"""),format.raw/*86.106*/("""custc.id"""),format.raw/*86.114*/("""}"""),format.raw/*86.115*/("""}"""),format.raw/*86.116*/("""' ng-click="selectcusttransfer(custc.id); ">
                            <td>"""),format.raw/*87.33*/("""{"""),format.raw/*87.34*/("""{"""),format.raw/*87.35*/("""custc.custName"""),format.raw/*87.49*/("""}"""),format.raw/*87.50*/("""}"""),format.raw/*87.51*/("""</td>
                            <td>"""),format.raw/*88.33*/("""{"""),format.raw/*88.34*/("""{"""),format.raw/*88.35*/("""custc.id"""),format.raw/*88.43*/("""}"""),format.raw/*88.44*/("""}"""),format.raw/*88.45*/("""</td>
                            <td>"""),format.raw/*89.33*/("""{"""),format.raw/*89.34*/("""{"""),format.raw/*89.35*/("""custc.name"""),format.raw/*89.45*/("""}"""),format.raw/*89.46*/("""}"""),format.raw/*89.47*/("""</td>
                            <td>"""),format.raw/*90.33*/("""{"""),format.raw/*90.34*/("""{"""),format.raw/*90.35*/("""custc.balance"""),format.raw/*90.48*/("""}"""),format.raw/*90.49*/("""}"""),format.raw/*90.50*/("""</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

	<!--deposite form-->
    <div class="row">
        <div class="col-lg-12" style="padding:0px!important;"><div class="col-lg-4 padding0" style="padding:0px!important;"><h3 id="forms">Transactions</h3></div></div>
                <div class="col-lg-12" style="padding:0px" ng-if="viewhistory.length">
                    <table class="table table-bordered table-striped table-hover ">
                        <thead>
                            <tr>
                                <th>TRANSACTION MODE</th>
                                <th>AMOUNT</th>
                                <th>Time</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr dir-paginate="cus in Listfilter | itemsPerPage:5 | filter:todayval | limitTo:toptenRecords track by $index">
                                <td>"""),format.raw/*112.37*/("""{"""),format.raw/*112.38*/("""{"""),format.raw/*112.39*/("""cus.type | lowercase"""),format.raw/*112.59*/("""}"""),format.raw/*112.60*/("""}"""),format.raw/*112.61*/("""</td>
                                <td>"""),format.raw/*113.37*/("""{"""),format.raw/*113.38*/("""{"""),format.raw/*113.39*/("""cus.amount"""),format.raw/*113.49*/("""}"""),format.raw/*113.50*/("""}"""),format.raw/*113.51*/("""</td>
                                <td>"""),format.raw/*114.37*/("""{"""),format.raw/*114.38*/("""{"""),format.raw/*114.39*/("""cus.at"""),format.raw/*114.45*/("""}"""),format.raw/*114.46*/("""}"""),format.raw/*114.47*/(""" """),format.raw/*114.48*/("""{"""),format.raw/*114.49*/("""{"""),format.raw/*114.50*/("""cus.t"""),format.raw/*114.55*/("""}"""),format.raw/*114.56*/("""}"""),format.raw/*114.57*/("""</td>
                            </tr>
                        </tbody>
                   </table>
        <dir-pagination-controls max-size="4" direction-links="true" boundary-links="true" ></dir-pagination-controls>
        </div>
    </div>
    <!--deposite form-->

    <div class="row">
        <div class="col-lg-12 well">

                <form role="form" name="frmcreate1" enctype="multipart/form-data" method="post" class="has-sucess" >
                    <fieldset>
                        <div class="form-group">
                            <label for="inputEmail" class="col-lg-4 control-label"><span class="pull-right">Customer A/C No:</label>
                            <div class="col-lg-6">
                                <select class="form-control" id="id"  name="id"  ng-model="Depositamount123.id" ng-change="getAccountType()"  ng-options="custx.id as custx.id for custx in transactionsistresult" required>
                                    <option value="">--Select A/C NO--</option>
                                </select>
                                <span style="color:red" ng-show="submit && frmcreate1.id.$error.required">Required A/C No</span>
                            </div>
                        </div>



                        <div class="form-group">
                            <label for="inputPassword" class="col-lg-4 control-label"><span class="pull-right">Amount:</span></label>
                            <div class="col-lg-6">
                                <input name="deposite" class="form-control" autofocus ng-model="Depositamount123.amount" id="amount" required>
                                <span style="color:red" ng-show="submit && frmcreate1.deposite.$error.required">Required Amount</span>
                            </div>
                        </div>


                        <div class="form-group">
                            <label for="name" class="col-lg-4 control-label" ></label>
                            <div class="col-lg-6">&nbsp;</div>
                        </div>

                        <div class="form-group">
                            <div class="col-lg-8 col-lg-offset-3">
                                <button type="reset" class="btn btn-default"data-dismiss="modal">Cancel</button>
                                <button type="submit" ng-click="depositeamt(frmcreate1.$valid);" class="btn btn-primary">Deposite</button>
                                <button type="submit" ng-click="withdrawamt(frmcreate1.$valid);" class="btn btn-primary">Withdraw</button>
                            </div>
                        </div>
                    </fieldset>
                </form>
        </div>
    </div>



        <!--history-->
        <!--history-->
        <!--history-->

    <div class="row">
        <div class="col-lg-12">
            <div class="modal fade" id="myModalHistory" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content col-lg-12">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title" id="myModalLabel">Transactions</h4>
                        </div>

                        <div class="modal-body" >
                            <div class="well bs-component">
                                <form role="form" name="frmcreate1" enctype="multipart/form-data" method="get" class="has-sucess" >
                                    <fieldset>

                                        <div class="form-group">
                                            <label for="inputEmail" class="col-lg-4 control-label">Customer A/C No:</label>
                                            <div class="col-lg-8">
                                                <select class="form-control" id="accId"  name="accId"   ng-model="Depositransact.id" ng-options="custx.id as custx.id for custx in transactionsistresult">
                                                    <option value="">--Select A/C NO--</option>
                                                </select>

                                            </div>
                                        </div>
                                    </fieldset>
                                </form>
                            </div>

                            <div class="col-lg-12" style="padding:0px" ng-if="viewhistory.length">

                                <div class="col-lg-12">
                                    <div class="form-group">
                                        <label for="inputEmail" class="col-lg-3 control-label">Customer:</label>
                                        <div class="col-lg-2">
                                            <a href="#"><b> """),format.raw/*206.61*/("""{"""),format.raw/*206.62*/("""{"""),format.raw/*206.63*/("""matchname"""),format.raw/*206.72*/("""}"""),format.raw/*206.73*/("""}"""),format.raw/*206.74*/(""" """),format.raw/*206.75*/("""</b></a>

                                        </div>

                                        <label for="inputEmail" class="col-lg-3 control-label">AccountType:  </label>
                                        <div class="col-lg-2">
                                            <a href="#">  <b>  """),format.raw/*212.64*/("""{"""),format.raw/*212.65*/("""{"""),format.raw/*212.66*/("""actype"""),format.raw/*212.72*/("""}"""),format.raw/*212.73*/("""}"""),format.raw/*212.74*/("""  """),format.raw/*212.76*/("""</b></a>
                                        </div>
                                    </div>
                                </div>
                                <table class="table table-bordered table-striped table-hover ">
                                    <thead>
                                        <tr>
                                            <th>TRANSACTION MODE</th>

                                            <th>AMOUNT</th>
                                                <!--<th>Time</th>-->
                                        </tr>
                                    </thead>
                                    <tbody>

                                        <tr ng-repeat="cus in viewhistory">
                                            <td>"""),format.raw/*228.49*/("""{"""),format.raw/*228.50*/("""{"""),format.raw/*228.51*/("""cus.type | lowercase"""),format.raw/*228.71*/("""}"""),format.raw/*228.72*/("""}"""),format.raw/*228.73*/("""</td>
                                            <td>"""),format.raw/*229.49*/("""{"""),format.raw/*229.50*/("""{"""),format.raw/*229.51*/("""cus.amount"""),format.raw/*229.61*/("""}"""),format.raw/*229.62*/("""}"""),format.raw/*229.63*/("""</td>
                                                <!--   <td>"""),format.raw/*230.60*/("""{"""),format.raw/*230.61*/("""{"""),format.raw/*230.62*/("""cus.at"""),format.raw/*230.68*/("""}"""),format.raw/*230.69*/("""}"""),format.raw/*230.70*/("""</td>-->
                                        </tr>

                                    </tbody>
                                </table>
                            </div>

                            <div class="form-group centered" ng-if="!viewhistory">
                                <div class="col-lg-6 col-lg-offset-5">
                                    <button type="reset" class="btn btn-primary"data-dismiss="modal">Close</button>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
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
object transactionsist extends transactionsist_Scope0.transactionsist
              /*
                  -- GENERATED --
                  DATE: Wed Mar 01 05:47:27 IST 2017
                  SOURCE: C:/Users/krishna/Downloads/BankingServicesApp/app/views/transactionsist.scala.html
                  HASH: 24d3ccc2bfa4485bfbff971679eb778e51235e8b
                  MATRIX: 547->1|654->13|684->18|715->41|754->43|783->46|1197->433|1223->437|2122->1309|2147->1313|2627->1766|2652->1770|2691->1782|2720->1783|2749->1784|2791->1798|2820->1799|2849->1800|2893->1816|2922->1817|2951->1818|2987->1826|3016->1827|3045->1828|3089->1844|3118->1845|3147->1846|3185->1856|3214->1857|3243->1858|3296->1883|3325->1884|3354->1885|3395->1898|3424->1899|3453->1900|5240->3658|5270->3659|5300->3660|5337->3668|5367->3669|5397->3670|5503->3748|5532->3749|5561->3750|5603->3764|5632->3765|5661->3766|5728->3805|5757->3806|5786->3807|5822->3815|5851->3816|5880->3817|5947->3856|5976->3857|6005->3858|6043->3868|6072->3869|6101->3870|6168->3909|6197->3910|6226->3911|6267->3924|6296->3925|6325->3926|7389->4961|7419->4962|7449->4963|7498->4983|7528->4984|7558->4985|7630->5028|7660->5029|7690->5030|7729->5040|7759->5041|7789->5042|7861->5085|7891->5086|7921->5087|7956->5093|7986->5094|8016->5095|8046->5096|8076->5097|8106->5098|8140->5103|8170->5104|8200->5105|13307->10183|13337->10184|13367->10185|13405->10194|13435->10195|13465->10196|13495->10197|13832->10505|13862->10506|13892->10507|13927->10513|13957->10514|13987->10515|14018->10517|14846->11316|14876->11317|14906->11318|14955->11338|14985->11339|15015->11340|15099->11395|15129->11396|15159->11397|15198->11407|15228->11408|15258->11409|15353->11475|15383->11476|15413->11477|15448->11483|15478->11484|15508->11485
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|34->10|34->10|47->23|47->23|62->38|62->38|63->39|63->39|63->39|63->39|63->39|63->39|64->40|64->40|64->40|64->40|64->40|64->40|65->41|65->41|65->41|65->41|65->41|65->41|66->42|66->42|66->42|66->42|66->42|66->42|110->86|110->86|110->86|110->86|110->86|110->86|111->87|111->87|111->87|111->87|111->87|111->87|112->88|112->88|112->88|112->88|112->88|112->88|113->89|113->89|113->89|113->89|113->89|113->89|114->90|114->90|114->90|114->90|114->90|114->90|136->112|136->112|136->112|136->112|136->112|136->112|137->113|137->113|137->113|137->113|137->113|137->113|138->114|138->114|138->114|138->114|138->114|138->114|138->114|138->114|138->114|138->114|138->114|138->114|230->206|230->206|230->206|230->206|230->206|230->206|230->206|236->212|236->212|236->212|236->212|236->212|236->212|236->212|252->228|252->228|252->228|252->228|252->228|252->228|253->229|253->229|253->229|253->229|253->229|253->229|254->230|254->230|254->230|254->230|254->230|254->230
                  -- GENERATED --
              */
          