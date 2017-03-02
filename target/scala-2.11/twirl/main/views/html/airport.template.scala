
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object airport_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class airport extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),_display_(/*2.2*/main(message)/*2.15*/{_display_(Seq[Any](format.raw/*2.16*/("""
"""),format.raw/*3.1*/("""<div class="container">
    <div class="row">
        <div class="col-sm-12 section">
            <div class="row">
                <div class="col-md-4">
                    <input type="text" ng-model="airport" id="airport_name" placeholder="Select Airport" uib-typeahead="airport as airport.name for airport in airports | filter:"""),format.raw/*8.178*/("""{"""),format.raw/*8.179*/("""name:$viewValue"""),format.raw/*8.194*/("""}"""),format.raw/*8.195*/("""" typeahead-template-url="airportTemplate.html" class="form-control" typeahead-show-hint="true" typeahead-min-length="0" >
                </div>

                <div class="col-md-3">
                    <p class="input-group">
                        <input type="text" class="form-control" uib-datepicker-popup=""""),format.raw/*13.87*/("""{"""),format.raw/*13.88*/("""{"""),format.raw/*13.89*/("""format"""),format.raw/*13.95*/("""}"""),format.raw/*13.96*/("""}"""),format.raw/*13.97*/("""" ng-model="startDate" is-open="popup1.opened" datepicker-options="dateOptions" ng-required="true" close-text="Close" alt-input-formats="altInputFormats" />
                        <span class="input-group-btn">
                            <button type="button" class="btn btn-default" ng-click="startDateOpen()"><i class="glyphicon glyphicon-calendar"></i></button>
                         </span>
                    </p>
                </div>
                <div class="col-md-3">
                    <p class="input-group">
                        <input type="text" class="form-control" uib-datepicker-popup ng-model="endDate" is-open="popup2.opened" datepicker-options="dateOptions" min-date="startDate" ng-required="true" close-text="Close" />
                        <span class="input-group-btn">
                            <button type="button" class="btn btn-default" ng-click="endDateOpen()"><i class="glyphicon glyphicon-calendar"></i></button>
                        </span>
                    </p>
                </div>
                <div class="col-md-2"><input type="button" class="btn btn-default" ng-click="loadFlights()" value="Search"/></div>
            </div>
            <div class="col-sm-12">
                <hr style="border:1px solid #fff"/>
            </div>
            
            <div class="col-sm-12" ng-repeat="ele in airports" ng-show="ele.name==test && !(test==false)" >                
                <div class="col-md-3"><b>Code:</b> """),format.raw/*34.52*/("""{"""),format.raw/*34.53*/("""{"""),format.raw/*34.54*/("""ele.faa"""),format.raw/*34.61*/("""}"""),format.raw/*34.62*/("""}"""),format.raw/*34.63*/("""</div>
                <div class="col-md-3"><b>Name:</b> """),format.raw/*35.52*/("""{"""),format.raw/*35.53*/("""{"""),format.raw/*35.54*/("""ele.name"""),format.raw/*35.62*/("""}"""),format.raw/*35.63*/("""}"""),format.raw/*35.64*/("""</div>
                <div class="col-md-2"><b>Latitude:</b> """),format.raw/*36.56*/("""{"""),format.raw/*36.57*/("""{"""),format.raw/*36.58*/("""ele.lat"""),format.raw/*36.65*/("""}"""),format.raw/*36.66*/("""}"""),format.raw/*36.67*/("""</div>
                <div class="col-md-4"><b>Longitude:</b> """),format.raw/*37.57*/("""{"""),format.raw/*37.58*/("""{"""),format.raw/*37.59*/("""ele.lon"""),format.raw/*37.66*/("""}"""),format.raw/*37.67*/("""}"""),format.raw/*37.68*/("""</div>  
                <div class="col-sm-12">
                <hr style="border:1px solid #fff"/>
            </div>              
            </div>
            
            <div class="col-sm-12">
                <div class="col-sm-6">Inbound Flights</div>
                <div class="col-sm-6">Outbound Flights</div>
            </div>
            <div class="col-sm-6">
                <table class="table">
                    <tr>
                        <th>To</th>
                        <th>Carrier</th>
                        <th>Dep Time</th>
                        <th>Arr Time</th>
                        <th>Air Time</th>
                        <th>Distance</th>
                        <th>Total Time</th>
                    </tr>
                    <tr ng-repeat="flight in inBoundFlight" ng-if="flight.dest != 'NA'">

                        <td>"""),format.raw/*60.29*/("""{"""),format.raw/*60.30*/("""{"""),format.raw/*60.31*/("""flight.dest"""),format.raw/*60.42*/("""}"""),format.raw/*60.43*/("""}"""),format.raw/*60.44*/("""</td>
                        <td>"""),format.raw/*61.29*/("""{"""),format.raw/*61.30*/("""{"""),format.raw/*61.31*/("""flight.carrier"""),format.raw/*61.45*/("""}"""),format.raw/*61.46*/("""}"""),format.raw/*61.47*/("""</td>
                        <td>"""),format.raw/*62.29*/("""{"""),format.raw/*62.30*/("""{"""),format.raw/*62.31*/("""flight.depTime"""),format.raw/*62.45*/("""}"""),format.raw/*62.46*/("""}"""),format.raw/*62.47*/("""</td>
                        <td>"""),format.raw/*63.29*/("""{"""),format.raw/*63.30*/("""{"""),format.raw/*63.31*/("""flight.arrTime"""),format.raw/*63.45*/("""}"""),format.raw/*63.46*/("""}"""),format.raw/*63.47*/("""</td>
                        <td>"""),format.raw/*64.29*/("""{"""),format.raw/*64.30*/("""{"""),format.raw/*64.31*/("""flight.airTime"""),format.raw/*64.45*/("""}"""),format.raw/*64.46*/("""}"""),format.raw/*64.47*/("""</td>
                        <td>"""),format.raw/*65.29*/("""{"""),format.raw/*65.30*/("""{"""),format.raw/*65.31*/("""flight.distance"""),format.raw/*65.46*/("""}"""),format.raw/*65.47*/("""}"""),format.raw/*65.48*/("""</td>
                        <td>"""),format.raw/*66.29*/("""{"""),format.raw/*66.30*/("""{"""),format.raw/*66.31*/("""flight.hour"""),format.raw/*66.42*/("""}"""),format.raw/*66.43*/("""}"""),format.raw/*66.44*/(""":"""),format.raw/*66.45*/("""{"""),format.raw/*66.46*/("""{"""),format.raw/*66.47*/("""flight.minute"""),format.raw/*66.60*/("""}"""),format.raw/*66.61*/("""}"""),format.raw/*66.62*/("""</td>
                    </tr>
                </table>
            </div>
            <div class="col-sm-6">
                <table class="table">
                    <tr>
                        <th>From</th>
                        <th>Carrier</th>
                        <th>Dep Time</th>
                        <th>Arr Time</th>
                        <th>Air Time</th>
                        <th>Distance</th>
                        <th>Total Time</th>
                    </tr>
                    <tr ng-repeat="flight in outBoundFlight" ng-if="flight.dest != 'NA'">
                        <td>"""),format.raw/*82.29*/("""{"""),format.raw/*82.30*/("""{"""),format.raw/*82.31*/("""flight.origin"""),format.raw/*82.44*/("""}"""),format.raw/*82.45*/("""}"""),format.raw/*82.46*/("""</td>
                       <!-- <td ><span ng-repeat="code in codes | filter:flight.carrier">"""),format.raw/*83.90*/("""{"""),format.raw/*83.91*/("""{"""),format.raw/*83.92*/("""code.description"""),format.raw/*83.108*/("""}"""),format.raw/*83.109*/("""}"""),format.raw/*83.110*/("""</span></td>-->
                        <td>"""),format.raw/*84.29*/("""{"""),format.raw/*84.30*/("""{"""),format.raw/*84.31*/("""flight.description"""),format.raw/*84.49*/("""}"""),format.raw/*84.50*/("""}"""),format.raw/*84.51*/("""</td>
                        <td>"""),format.raw/*85.29*/("""{"""),format.raw/*85.30*/("""{"""),format.raw/*85.31*/("""flight.depTime"""),format.raw/*85.45*/("""}"""),format.raw/*85.46*/("""}"""),format.raw/*85.47*/("""</td>
                        <td>"""),format.raw/*86.29*/("""{"""),format.raw/*86.30*/("""{"""),format.raw/*86.31*/("""flight.arrTime"""),format.raw/*86.45*/("""}"""),format.raw/*86.46*/("""}"""),format.raw/*86.47*/("""</td>
                        <td>"""),format.raw/*87.29*/("""{"""),format.raw/*87.30*/("""{"""),format.raw/*87.31*/("""flight.airTime"""),format.raw/*87.45*/("""}"""),format.raw/*87.46*/("""}"""),format.raw/*87.47*/("""</td>
                        <td>"""),format.raw/*88.29*/("""{"""),format.raw/*88.30*/("""{"""),format.raw/*88.31*/("""flight.distance"""),format.raw/*88.46*/("""}"""),format.raw/*88.47*/("""}"""),format.raw/*88.48*/("""</td>
                        <td>"""),format.raw/*89.29*/("""{"""),format.raw/*89.30*/("""{"""),format.raw/*89.31*/("""flight.hour"""),format.raw/*89.42*/("""}"""),format.raw/*89.43*/("""}"""),format.raw/*89.44*/(""":"""),format.raw/*89.45*/("""{"""),format.raw/*89.46*/("""{"""),format.raw/*89.47*/("""flight.minute"""),format.raw/*89.60*/("""}"""),format.raw/*89.61*/("""}"""),format.raw/*89.62*/("""</td>
                    </tr>


                </table>
            </div>
        </div>
    </div>
</div>
<script type="text/ng-template" id="airportTemplate.html">
    <a>
        <span ng-bind-html="match.label | uibTypeaheadHighlight:query"></span>
    </a>
</script>
""")))}),format.raw/*103.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object airport extends airport_Scope0.airport
              /*
                  -- GENERATED --
                  DATE: Wed Mar 01 05:47:24 IST 2017
                  SOURCE: C:/Users/krishna/Downloads/BankingServicesApp/app/views/airport.scala.html
                  HASH: 2018a3981533c20945e400b05cdaf0d8e0ce5c2b
                  MATRIX: 531->1|643->18|671->21|692->34|730->35|758->37|1123->374|1152->375|1195->390|1224->391|1573->712|1602->713|1631->714|1665->720|1694->721|1723->722|3259->2230|3288->2231|3317->2232|3352->2239|3381->2240|3410->2241|3497->2300|3526->2301|3555->2302|3591->2310|3620->2311|3649->2312|3740->2375|3769->2376|3798->2377|3833->2384|3862->2385|3891->2386|3983->2450|4012->2451|4041->2452|4076->2459|4105->2460|4134->2461|5058->3357|5087->3358|5116->3359|5155->3370|5184->3371|5213->3372|5276->3407|5305->3408|5334->3409|5376->3423|5405->3424|5434->3425|5497->3460|5526->3461|5555->3462|5597->3476|5626->3477|5655->3478|5718->3513|5747->3514|5776->3515|5818->3529|5847->3530|5876->3531|5939->3566|5968->3567|5997->3568|6039->3582|6068->3583|6097->3584|6160->3619|6189->3620|6218->3621|6261->3636|6290->3637|6319->3638|6382->3673|6411->3674|6440->3675|6479->3686|6508->3687|6537->3688|6566->3689|6595->3690|6624->3691|6665->3704|6694->3705|6723->3706|7376->4331|7405->4332|7434->4333|7475->4346|7504->4347|7533->4348|7657->4444|7686->4445|7715->4446|7760->4462|7790->4463|7820->4464|7893->4509|7922->4510|7951->4511|7997->4529|8026->4530|8055->4531|8118->4566|8147->4567|8176->4568|8218->4582|8247->4583|8276->4584|8339->4619|8368->4620|8397->4621|8439->4635|8468->4636|8497->4637|8560->4672|8589->4673|8618->4674|8660->4688|8689->4689|8718->4690|8781->4725|8810->4726|8839->4727|8882->4742|8911->4743|8940->4744|9003->4779|9032->4780|9061->4781|9100->4792|9129->4793|9158->4794|9187->4795|9216->4796|9245->4797|9286->4810|9315->4811|9344->4812|9666->5103
                  LINES: 20->1|25->1|26->2|26->2|26->2|27->3|32->8|32->8|32->8|32->8|37->13|37->13|37->13|37->13|37->13|37->13|58->34|58->34|58->34|58->34|58->34|58->34|59->35|59->35|59->35|59->35|59->35|59->35|60->36|60->36|60->36|60->36|60->36|60->36|61->37|61->37|61->37|61->37|61->37|61->37|84->60|84->60|84->60|84->60|84->60|84->60|85->61|85->61|85->61|85->61|85->61|85->61|86->62|86->62|86->62|86->62|86->62|86->62|87->63|87->63|87->63|87->63|87->63|87->63|88->64|88->64|88->64|88->64|88->64|88->64|89->65|89->65|89->65|89->65|89->65|89->65|90->66|90->66|90->66|90->66|90->66|90->66|90->66|90->66|90->66|90->66|90->66|90->66|106->82|106->82|106->82|106->82|106->82|106->82|107->83|107->83|107->83|107->83|107->83|107->83|108->84|108->84|108->84|108->84|108->84|108->84|109->85|109->85|109->85|109->85|109->85|109->85|110->86|110->86|110->86|110->86|110->86|110->86|111->87|111->87|111->87|111->87|111->87|111->87|112->88|112->88|112->88|112->88|112->88|112->88|113->89|113->89|113->89|113->89|113->89|113->89|113->89|113->89|113->89|113->89|113->89|113->89|127->103
                  -- GENERATED --
              */
          