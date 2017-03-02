
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object balancetransfer_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class balancetransfer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<hr>
    <div class="row">
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


    <div class="row">
        <div class="col-lg-12" >
            <table class="table table-bordered table-striped table-hover " >
                <thead>
                    <tr>
                        <th>Customer Name</th>
                        <th>A/C No</th>
                        <th>A/C Type</th>
                        <th>Available Balance</th>
                    </tr>
                </thead>
                <tbody>
                    <tr ng-repeat="custc in activetransactAcountList" class="clickable-row" value='"""),format.raw/*41.100*/("""{"""),format.raw/*41.101*/("""{"""),format.raw/*41.102*/("""custc.id"""),format.raw/*41.110*/("""}"""),format.raw/*41.111*/("""}"""),format.raw/*41.112*/("""' ng-click="selectcusttransfer(custc.id); ">
                        <td>"""),format.raw/*42.29*/("""{"""),format.raw/*42.30*/("""{"""),format.raw/*42.31*/("""custc.custName"""),format.raw/*42.45*/("""}"""),format.raw/*42.46*/("""}"""),format.raw/*42.47*/("""</td>
                        <td>"""),format.raw/*43.29*/("""{"""),format.raw/*43.30*/("""{"""),format.raw/*43.31*/("""custc.id"""),format.raw/*43.39*/("""}"""),format.raw/*43.40*/("""}"""),format.raw/*43.41*/("""</td>
                        <td>"""),format.raw/*44.29*/("""{"""),format.raw/*44.30*/("""{"""),format.raw/*44.31*/("""custc.name"""),format.raw/*44.41*/("""}"""),format.raw/*44.42*/("""}"""),format.raw/*44.43*/("""</td>
                        <td>"""),format.raw/*45.29*/("""{"""),format.raw/*45.30*/("""{"""),format.raw/*45.31*/("""custc.balance"""),format.raw/*45.44*/("""}"""),format.raw/*45.45*/("""}"""),format.raw/*45.46*/("""</td>
                    </tr>
                </tbody>
            </table>
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
object balancetransfer extends balancetransfer_Scope0.balancetransfer
              /*
                  -- GENERATED --
                  DATE: Wed Mar 01 05:47:24 IST 2017
                  SOURCE: C:/Users/krishna/Downloads/BankingServicesApp/app/views/balancetransfer.scala.html
                  HASH: b36c333a3c5355c74c3b7c5801ea5441b81f5340
                  MATRIX: 547->1|654->13|684->18|715->41|754->43|786->49|2295->1529|2325->1530|2355->1531|2392->1539|2422->1540|2452->1541|2554->1615|2583->1616|2612->1617|2654->1631|2683->1632|2712->1633|2775->1668|2804->1669|2833->1670|2869->1678|2898->1679|2927->1680|2990->1715|3019->1716|3048->1717|3086->1727|3115->1728|3144->1729|3207->1764|3236->1765|3265->1766|3306->1779|3335->1780|3364->1781
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|65->41|65->41|65->41|65->41|65->41|65->41|66->42|66->42|66->42|66->42|66->42|66->42|67->43|67->43|67->43|67->43|67->43|67->43|68->44|68->44|68->44|68->44|68->44|68->44|69->45|69->45|69->45|69->45|69->45|69->45
                  -- GENERATED --
              */
          