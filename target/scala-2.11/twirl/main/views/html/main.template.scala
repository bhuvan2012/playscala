
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en" data-ng-app="samples">
  <head>
    <meta charset="utf-8">
    <title>Banking Services</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <link rel="stylesheet" href=""""),_display_(/*9.35*/routes/*9.41*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*9.87*/("""" media="screen">
    <link rel="stylesheet" href=""""),_display_(/*10.35*/routes/*10.41*/.Assets.versioned("stylesheets/styles.css")),format.raw/*10.84*/("""">
      <script src=""""),_display_(/*11.21*/routes/*11.27*/.Assets.versioned("javascripts/jquery-1.10.2.min.js")),format.raw/*11.80*/(""""></script>
      <script src=""""),_display_(/*12.21*/routes/*12.27*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*12.76*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*13.16*/routes/*13.22*/.Assets.versioned("javascripts/angular.js")),format.raw/*13.65*/("""" type="text/javascript"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/angular.js/1.2.20/angular-route.min.js"></script>
      <script src=""""),_display_(/*15.21*/routes/*15.27*/.Assets.versioned("javascripts/dirPagination.js")),format.raw/*15.76*/(""""></script>
	<script src=""""),_display_(/*16.16*/routes/*16.22*/.Assets.versioned("javascripts/ui-bootstrap-tpls-1.3.2.min.js")),format.raw/*16.85*/("""" type="text/javascript"></script>
	<link rel="stylesheet" media="screen" href=""""),_display_(/*17.47*/routes/*17.53*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*17.103*/("""">        
	<link rel="stylesheet" href=""""),_display_(/*18.32*/routes/*18.38*/.Assets.versioned("stylesheets/custom.min.css")),format.raw/*18.85*/("""">
	<link rel="shortcut icon" type="image/png" href=""""),_display_(/*19.52*/routes/*19.58*/.Assets.versioned("images/favicon.png")),format.raw/*19.97*/("""">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
	  <script src="../bower_components/html5shiv/dist/html5shiv.js"></script>
	  <script src="../bower_components/respond/dest/respond.min.js"></script>
    <![endif]-->
 <script>

 var samplesApp = angular.module('samples', ['ngRoute','ui.bootstrap','angularUtils.directives.dirPagination']);

 samplesApp.config(function ($routeProvider) """),format.raw/*29.46*/("""{"""),format.raw/*29.47*/("""
            """),format.raw/*30.13*/("""$routeProvider.
            when('/customeraccountlist', """),format.raw/*31.42*/("""{"""),format.raw/*31.43*/("""
                """),format.raw/*32.17*/("""templateUrl: '/customeraccountlist',
                controller: 'samplesController',
                params: 'test'
            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/(""").
            when('/customerlist', """),format.raw/*36.35*/("""{"""),format.raw/*36.36*/("""
                """),format.raw/*37.17*/("""templateUrl: '/customerlist',
                controller: 'samplesController',
                params: 'test'
            """),format.raw/*40.13*/("""}"""),format.raw/*40.14*/(""").
            when('/transactionsist', """),format.raw/*41.38*/("""{"""),format.raw/*41.39*/("""
                """),format.raw/*42.17*/("""templateUrl: '/transactionsist',
                controller: 'samplesController',
                params: 'test'
            """),format.raw/*45.13*/("""}"""),format.raw/*45.14*/(""")

        """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/(""")

 samplesApp.controller('samplesController', function ($scope ,$rootScope, $q, $http, $window,$route, $location) """),format.raw/*49.113*/("""{"""),format.raw/*49.114*/("""
                """),format.raw/*50.17*/("""$scope.customers=[];
				$scope.customeraclist = [];
				$scope.name=[];

        // for cacel redirection
        $scope.add = true;
        var redirect = function (type) """),format.raw/*56.40*/("""{"""),format.raw/*56.41*/("""
            """),format.raw/*57.13*/("""switch (type) """),format.raw/*57.27*/("""{"""),format.raw/*57.28*/("""
                case 0:
                     window.location.href = "http://localhost:9000/customerlist";
                    break;
                case 1:
                     window.location.href = "http://localhost:9000/customeraccountlist";
                    break;
				case 2:
                     window.location.href = "http://localhost:9000/transactionsist";
                    break;	
					
            """),format.raw/*68.13*/("""}"""),format.raw/*68.14*/("""
        """),format.raw/*69.9*/("""}"""),format.raw/*69.10*/(""";

 $scope.cancel1 = function (type) """),format.raw/*71.35*/("""{"""),format.raw/*71.36*/("""
     """),format.raw/*72.6*/("""redirect(type);
    """),format.raw/*73.5*/("""}"""),format.raw/*73.6*/("""

"""),format.raw/*75.1*/("""// get list operation
     $scope.cusfirstid;
                        $http("""),format.raw/*77.31*/("""{"""),format.raw/*77.32*/(""" """),format.raw/*77.33*/("""method: 'GET', url: "http://localhost:9000/customer" """),format.raw/*77.86*/("""}"""),format.raw/*77.87*/(""")
                            .success(function (data1, status, headers, config) """),format.raw/*78.80*/("""{"""),format.raw/*78.81*/("""
                                 """),format.raw/*79.34*/("""if (status == '200') """),format.raw/*79.55*/("""{"""),format.raw/*79.56*/("""
                                """),format.raw/*80.33*/("""$scope.customers = data1;
                                     $scope.cusfirstid=$scope.customers[0].id;
                                """),format.raw/*82.33*/("""}"""),format.raw/*82.34*/("""
                            """),format.raw/*83.29*/("""}"""),format.raw/*83.30*/(""")
                            .error(function (html, status) """),format.raw/*84.60*/("""{"""),format.raw/*84.61*/("""

                            """),format.raw/*86.29*/("""}"""),format.raw/*86.30*/(""");
							


                $rootScope.getcus = function() """),format.raw/*90.48*/("""{"""),format.raw/*90.49*/("""

						"""),format.raw/*92.7*/("""$scope.submit = true;
                        $http("""),format.raw/*93.31*/("""{"""),format.raw/*93.32*/(""" """),format.raw/*93.33*/("""method: 'GET', url: "http://localhost:9000/customer" """),format.raw/*93.86*/("""}"""),format.raw/*93.87*/(""")
                            .success(function (data1, status, headers, config) """),format.raw/*94.80*/("""{"""),format.raw/*94.81*/("""
                                 """),format.raw/*95.34*/("""if (status == '200') """),format.raw/*95.55*/("""{"""),format.raw/*95.56*/("""
                                 """),format.raw/*96.34*/("""//console.log(data1);
                                $scope.customers = data1;


                                """),format.raw/*100.33*/("""}"""),format.raw/*100.34*/("""
                            """),format.raw/*101.29*/("""}"""),format.raw/*101.30*/(""")
                            .error(function (html, status) """),format.raw/*102.60*/("""{"""),format.raw/*102.61*/("""

                            """),format.raw/*104.29*/("""}"""),format.raw/*104.30*/(""");
                """),format.raw/*105.17*/("""}"""),format.raw/*105.18*/(""";
                $scope.customersaccountlist=[];
                $scope.cusfirstaccountid;
                $rootScope.getcusaccount = function(v) """),format.raw/*108.56*/("""{"""),format.raw/*108.57*/("""
                        """),format.raw/*109.25*/("""$scope.customerAcountList = [];
                        $http("""),format.raw/*110.31*/("""{"""),format.raw/*110.32*/(""" """),format.raw/*110.33*/("""method: 'POST', url: "http://localhost:9000/customerlistpost" """),format.raw/*110.95*/("""}"""),format.raw/*110.96*/(""")
                            .success(function (data1, status, headers, config) """),format.raw/*111.80*/("""{"""),format.raw/*111.81*/("""
							"""),format.raw/*112.8*/("""//$scope.customeraclist = data1;
							$scope.tempid = v;
							$scope.customersaccountlist = data1;
                                 if (status == '200') """),format.raw/*115.55*/("""{"""),format.raw/*115.56*/("""
                                     """),format.raw/*116.38*/("""angular.forEach(data1, function(e)"""),format.raw/*116.72*/("""{"""),format.raw/*116.73*/("""
                                     """),format.raw/*117.38*/("""angular.forEach($scope.customers, function(c)"""),format.raw/*117.83*/("""{"""),format.raw/*117.84*/("""

                                            """),format.raw/*119.45*/("""if(e.id == c.id)"""),format.raw/*119.61*/("""{"""),format.raw/*119.62*/("""
                                                """),format.raw/*120.49*/("""e.id = c.id;
                                                //e.status =c.status;
                                                e.name =c.name;
                                                e.address=c.address;
                                                $scope.customerAcountList.push(e);
                                                $scope.cusfirstaccountid=$scope.customerAcountList[0].id;

                                            """),format.raw/*127.45*/("""}"""),format.raw/*127.46*/("""
                                        """),format.raw/*128.41*/("""}"""),format.raw/*128.42*/(""");
                                     """),format.raw/*129.38*/("""}"""),format.raw/*129.39*/(""");
                                 """),format.raw/*130.34*/("""}"""),format.raw/*130.35*/("""
                                 """),format.raw/*131.34*/("""$scope.$apply();
                            """),format.raw/*132.29*/("""}"""),format.raw/*132.30*/(""")
                            .error(function (html, status) """),format.raw/*133.60*/("""{"""),format.raw/*133.61*/("""
                            """),format.raw/*134.29*/("""}"""),format.raw/*134.30*/(""");


                """),format.raw/*137.17*/("""}"""),format.raw/*137.18*/(""";

                // get account type

                    $scope.actype;
                    $scope.matchid;
                    $scope.matchname;
					/*$scope.getAccountType = function()"""),format.raw/*144.42*/("""{"""),format.raw/*144.43*/("""

					 """),format.raw/*146.7*/("""for (var i = 0; i < $scope.transactionsistresult.length ; i++) """),format.raw/*146.70*/("""{"""),format.raw/*146.71*/("""

                             """),format.raw/*148.30*/("""if($scope.transactionsistresult[i].id==$scope.Depositransact.id)
					        """),format.raw/*149.14*/("""{"""),format.raw/*149.15*/("""
					            """),format.raw/*150.18*/("""$scope.actype=$scope.transactionsistresult[i].name;
					            //$scope.selectedcust=$scope.transactionsistresult[i].name;
                                //break;
					        """),format.raw/*153.14*/("""}"""),format.raw/*153.15*/("""


                            """),format.raw/*156.29*/("""if($scope.transactionsistresult[i].id=$scope.customersaccountlist[i].accountId)
                             """),format.raw/*157.30*/("""{"""),format.raw/*157.31*/("""
                                """),format.raw/*158.33*/("""$scope.matchid=$scope.customersaccountlist[i].id;
                                if($scope.customers[i].id=$scope.matchid)
                                """),format.raw/*160.33*/("""{"""),format.raw/*160.34*/("""
                                    """),format.raw/*161.37*/("""$scope.matchname=$scope.customers[i].name;
                                """),format.raw/*162.33*/("""}"""),format.raw/*162.34*/("""
                             """),format.raw/*163.30*/("""}"""),format.raw/*163.31*/("""
                       """),format.raw/*164.24*/("""}"""),format.raw/*164.25*/("""
                   """),format.raw/*165.20*/("""}"""),format.raw/*165.21*/("""
"""),format.raw/*166.1*/("""*/

                $scope.transactionsistresult=[];
                $scope.activetransactAcountList=[];
                $rootScope.gettransactionlist = function() """),format.raw/*170.60*/("""{"""),format.raw/*170.61*/("""
                    """),format.raw/*171.21*/("""//$rootScope.getcusaccount();
                             $http("""),format.raw/*172.36*/("""{"""),format.raw/*172.37*/(""" """),format.raw/*172.38*/("""method: 'POST', url: "http://localhost:9000/transactionsistpost" """),format.raw/*172.103*/("""}"""),format.raw/*172.104*/(""")
                                .success(function (data1, status, headers, config) """),format.raw/*173.84*/("""{"""),format.raw/*173.85*/("""
                                """),format.raw/*174.33*/("""$scope.transactionsistresult = data1;

                                   // $scope.customersaccountlist = data1;
                                    if (status == '200') """),format.raw/*177.58*/("""{"""),format.raw/*177.59*/("""
                                        """),format.raw/*178.41*/("""for (var i = 0; i < $scope.customersaccountlist.length ; i++) """),format.raw/*178.103*/("""{"""),format.raw/*178.104*/("""
                                            """),format.raw/*179.45*/("""for (var j = 0; j < $scope.transactionsistresult.length ; j++) """),format.raw/*179.108*/("""{"""),format.raw/*179.109*/("""
                                                """),format.raw/*180.49*/("""if($scope.customersaccountlist[i].status=="active" && $scope.customersaccountlist[i].accountId==$scope.transactionsistresult[j].id )"""),format.raw/*180.181*/("""{"""),format.raw/*180.182*/("""
                                                    """),format.raw/*181.53*/("""$scope.transactionsistresult[j].custName=$scope.customersaccountlist[i].name;
                                                    $scope.activetransactAcountList.push($scope.transactionsistresult[j]);
                                                """),format.raw/*183.49*/("""}"""),format.raw/*183.50*/("""
                                            """),format.raw/*184.45*/("""}"""),format.raw/*184.46*/("""
                                        """),format.raw/*185.41*/("""}"""),format.raw/*185.42*/("""
                                    """),format.raw/*186.37*/("""}"""),format.raw/*186.38*/("""
                                """),format.raw/*187.33*/("""}"""),format.raw/*187.34*/(""")
                                .error(function (html, status) """),format.raw/*188.64*/("""{"""),format.raw/*188.65*/("""

                              """),format.raw/*190.31*/("""}"""),format.raw/*190.32*/(""");

                """),format.raw/*192.17*/("""}"""),format.raw/*192.18*/(""";

                // redirection for add operation
                $scope.addcustomerform = function() """),format.raw/*195.53*/("""{"""),format.raw/*195.54*/("""

                        """),format.raw/*197.25*/("""window.location.href = "http://localhost:9000//addcustomer";
                """),format.raw/*198.17*/("""}"""),format.raw/*198.18*/(""";

                $scope.addcustomeraccountform = function() """),format.raw/*200.60*/("""{"""),format.raw/*200.61*/("""

                        """),format.raw/*202.25*/("""window.location.href = "http://localhost:9000//addcustomeraccount";
                """),format.raw/*203.17*/("""}"""),format.raw/*203.18*/(""";

				// redirection for customer  list
                $scope.getcustomerlist = function() """),format.raw/*206.53*/("""{"""),format.raw/*206.54*/("""						

                        """),format.raw/*208.25*/("""window.location.href = "http://localhost:9000/customerlist";
                """),format.raw/*209.17*/("""}"""),format.raw/*209.18*/(""";

				// redirection for customer account list
                $scope.getcustomeraccountlist = function(e) """),format.raw/*212.61*/("""{"""),format.raw/*212.62*/("""
                        """),format.raw/*213.25*/("""$rootScope.tempid = e;
						window.location.href = "http://localhost:9000/customeraccountlist/"+e ;
						//$location.path("http://localhost:9000/customeraccountlist");
                """),format.raw/*216.17*/("""}"""),format.raw/*216.18*/(""";

                 $scope.addResearcTemplate = function () """),format.raw/*218.58*/("""{"""),format.raw/*218.59*/("""
                     """),format.raw/*219.22*/("""//$scope.IsVisible1 = true;
                     //$scope.IsVisible2 = true;
                 """),format.raw/*221.18*/("""}"""),format.raw/*221.19*/(""";

				// redirection for transaction list
				$scope.gettransactionsist = function(id) """),format.raw/*224.46*/("""{"""),format.raw/*224.47*/("""

                        """),format.raw/*226.25*/("""window.location.href = "http://localhost:9000/transactionsist/"+id;
                """),format.raw/*227.17*/("""}"""),format.raw/*227.18*/(""";

// update customer
$scope.upCust = function (valid) """),format.raw/*230.34*/("""{"""),format.raw/*230.35*/("""
                        """),format.raw/*231.25*/("""$scope.add = true;
                        $scope.update = false;
                        $scope.CustomerDetail;
                        data = $scope.CustomerDetail;
                        $scope.message = "";

                        if(valid==true)"""),format.raw/*237.40*/("""{"""),format.raw/*237.41*/("""
                            """),format.raw/*238.29*/("""$http("""),format.raw/*238.35*/("""{"""),format.raw/*238.36*/("""
                                """),format.raw/*239.33*/("""url: "/updatecustomer",
                                method: "POST",
                                data: data
                            """),format.raw/*242.29*/("""}"""),format.raw/*242.30*/(""").success(function (data1, status, headers, config) """),format.raw/*242.82*/("""{"""),format.raw/*242.83*/("""
                                """),format.raw/*243.33*/("""$scope.message = data1;
                                $scope.getcus();
                                alert(data1);
                                $window.location.reload();
                            """),format.raw/*247.29*/("""}"""),format.raw/*247.30*/(""")
                        """),format.raw/*248.25*/("""}"""),format.raw/*248.26*/("""
                        """),format.raw/*249.25*/("""else"""),format.raw/*249.29*/("""{"""),format.raw/*249.30*/("""
                             """),format.raw/*250.30*/("""return false;
                        """),format.raw/*251.25*/("""}"""),format.raw/*251.26*/("""
                        """),format.raw/*252.25*/("""$scope.$apply();
                    """),format.raw/*253.21*/("""}"""),format.raw/*253.22*/("""

           """),format.raw/*255.12*/("""$scope.activeInactiveCustAccount = function (cusaccount) """),format.raw/*255.69*/("""{"""),format.raw/*255.70*/("""

               """),format.raw/*257.16*/("""var toggleresult;
               if(cusaccount.status=="active")
               """),format.raw/*259.16*/("""{"""),format.raw/*259.17*/("""
                   """),format.raw/*260.20*/("""toggleresult="inactive"
               """),format.raw/*261.16*/("""}"""),format.raw/*261.17*/("""
               """),format.raw/*262.16*/("""else
               """),format.raw/*263.16*/("""{"""),format.raw/*263.17*/("""
                   """),format.raw/*264.20*/("""toggleresult="active"
               """),format.raw/*265.16*/("""}"""),format.raw/*265.17*/("""

               """),format.raw/*267.16*/("""data = """),format.raw/*267.23*/("""{"""),format.raw/*267.24*/(""""id":cusaccount.id,"accountId":cusaccount.accountId,"status":toggleresult"""),format.raw/*267.97*/("""}"""),format.raw/*267.98*/(""";
               $scope.message = "";

                   $http("""),format.raw/*270.26*/("""{"""),format.raw/*270.27*/("""
                       """),format.raw/*271.24*/("""url: "/activeinactivecusaccount",
                       method: "POST",
                       data: data
                   """),format.raw/*274.20*/("""}"""),format.raw/*274.21*/(""").success(function (data1, status, headers, config) """),format.raw/*274.73*/("""{"""),format.raw/*274.74*/("""
                       """),format.raw/*275.24*/("""$scope.message = data1;
                       alert(data1);
                       $window.location.reload();
                   """),format.raw/*278.20*/("""}"""),format.raw/*278.21*/(""")

               $scope.$apply();
           """),format.raw/*281.12*/("""}"""),format.raw/*281.13*/("""

"""),format.raw/*283.1*/("""// add operation
                //addcustomer
                $scope.custDetails = """),format.raw/*285.38*/("""{"""),format.raw/*285.39*/("""}"""),format.raw/*285.40*/(""";
                $scope.addCust = function (valid) """),format.raw/*286.51*/("""{"""),format.raw/*286.52*/("""

                        """),format.raw/*288.25*/("""$scope.submit = true;
                        $scope.CustomerDetail;
                        data = $scope.CustomerDetail;

                            if(valid==true)
                            """),format.raw/*293.29*/("""{"""),format.raw/*293.30*/("""
                              """),format.raw/*294.31*/("""$http("""),format.raw/*294.37*/("""{"""),format.raw/*294.38*/("""
                                """),format.raw/*295.33*/("""url: "http://localhost:9000/addcustomer1",
                                method: "POST",
                                data: data
                                """),format.raw/*298.33*/("""}"""),format.raw/*298.34*/(""").success(function (data1, status, headers, config) """),format.raw/*298.86*/("""{"""),format.raw/*298.87*/("""

                                    """),format.raw/*300.37*/("""for (var i = 0; i < 1 ; i++) """),format.raw/*300.66*/("""{"""),format.raw/*300.67*/("""
                                            """),format.raw/*301.45*/("""$scope.customers.push(data);

                                            console.log($scope.customers.length)
                                        """),format.raw/*304.41*/("""}"""),format.raw/*304.42*/("""
                                   """),format.raw/*305.36*/("""alert(data1);
                                  $window.location.reload();


                            """),format.raw/*309.29*/("""}"""),format.raw/*309.30*/(""")
                             $('#myModal').modal('hide');

                                $rootScope.getcustomerlist();
                            """),format.raw/*313.29*/("""}"""),format.raw/*313.30*/("""
                            """),format.raw/*314.29*/("""else
                            """),format.raw/*315.29*/("""{"""),format.raw/*315.30*/("""
                                 """),format.raw/*316.34*/("""return false;
                            """),format.raw/*317.29*/("""}"""),format.raw/*317.30*/("""

                    """),format.raw/*319.21*/("""}"""),format.raw/*319.22*/("""
					
           """),format.raw/*321.12*/("""$scope.selectcust = function(val)"""),format.raw/*321.45*/("""{"""),format.raw/*321.46*/("""

                   """),format.raw/*323.20*/("""$scope.update = true;
                   $scope.add = false;
                   $scope.message = "";
                   angular.forEach( $scope.customers, function(e)"""),format.raw/*326.66*/("""{"""),format.raw/*326.67*/("""
                       """),format.raw/*327.24*/("""if(e.id==val)"""),format.raw/*327.37*/("""{"""),format.raw/*327.38*/("""

                           """),format.raw/*329.28*/("""$scope.CustomerDetail = """),format.raw/*329.52*/("""{"""),format.raw/*329.53*/("""
                               """),format.raw/*330.32*/("""id:e.id,
                               name:e.name,
                               address:e.address,
                               emailId: e.emailId,
                               phoneNo: e.phoneNo
                           """),format.raw/*335.28*/("""}"""),format.raw/*335.29*/("""
                       """),format.raw/*336.24*/("""}"""),format.raw/*336.25*/("""
                   """),format.raw/*337.20*/("""}"""),format.raw/*337.21*/(""");

                     $('table').on('click', '.clickable-row', function(event) """),format.raw/*339.79*/("""{"""),format.raw/*339.80*/("""
                        """),format.raw/*340.25*/("""$(this).addClass('active').siblings().removeClass('active');
                      """),format.raw/*341.23*/("""}"""),format.raw/*341.24*/(""");

                    document.getElementById("id").disabled = true;

               """),format.raw/*345.16*/("""}"""),format.raw/*345.17*/("""
     """),format.raw/*346.6*/("""$scope.fromaccount =false;$scope.toaccount =false;
     $scope.selectaccount = function(type)"""),format.raw/*347.43*/("""{"""),format.raw/*347.44*/("""

         """),format.raw/*349.10*/("""if(type == 'fromacc')"""),format.raw/*349.31*/("""{"""),format.raw/*349.32*/("""$scope.fromaccount =true;$scope.toaccount = false; """),format.raw/*349.83*/("""}"""),format.raw/*349.84*/("""else if(type == 'toacc')"""),format.raw/*349.108*/("""{"""),format.raw/*349.109*/("""$scope.toaccount =true;$scope.fromaccount =false; """),format.raw/*349.159*/("""}"""),format.raw/*349.160*/("""


     """),format.raw/*352.6*/("""}"""),format.raw/*352.7*/("""
     """),format.raw/*353.6*/("""$scope.selectcusttransfer = function(val)"""),format.raw/*353.47*/("""{"""),format.raw/*353.48*/("""
         """),format.raw/*354.10*/("""angular.forEach( $scope.activetransactAcountList, function(e)"""),format.raw/*354.71*/("""{"""),format.raw/*354.72*/("""
             """),format.raw/*355.14*/("""if(e.id==val)"""),format.raw/*355.27*/("""{"""),format.raw/*355.28*/("""
                 """),format.raw/*356.18*/("""if($scope.fromaccount)"""),format.raw/*356.40*/("""{"""),format.raw/*356.41*/("""
                    """),format.raw/*357.21*/("""$scope.fromacc  =val; $scope.balanceamount = e.balance; $scope.fromaccNumber = e.id;
                     console.log($scope.balanceamount);
                 """),format.raw/*359.18*/("""}"""),format.raw/*359.19*/("""
                 """),format.raw/*360.18*/("""if($scope.toaccount)"""),format.raw/*360.38*/("""{"""),format.raw/*360.39*/("""
                     """),format.raw/*361.22*/("""$scope.toacc  =val; $scope.toaccNumber = e.id;
                 """),format.raw/*362.18*/("""}"""),format.raw/*362.19*/("""
             """),format.raw/*363.14*/("""}"""),format.raw/*363.15*/("""
         """),format.raw/*364.10*/("""}"""),format.raw/*364.11*/(""");

         $('table').on('click', '.clickable-row', function(event) """),format.raw/*366.67*/("""{"""),format.raw/*366.68*/("""
             """),format.raw/*367.14*/("""$(this).addClass('active').siblings().removeClass('active');
         """),format.raw/*368.10*/("""}"""),format.raw/*368.11*/(""");
     """),format.raw/*369.6*/("""}"""),format.raw/*369.7*/("""

     """),format.raw/*371.6*/("""$scope.tranferamount = function()"""),format.raw/*371.39*/("""{"""),format.raw/*371.40*/("""

         """),format.raw/*373.10*/("""if(angular.isUndefined($scope.fromacc))"""),format.raw/*373.49*/("""{"""),format.raw/*373.50*/("""
             """),format.raw/*374.14*/("""alert("Please select from account"); return false;
         """),format.raw/*375.10*/("""}"""),format.raw/*375.11*/("""


         """),format.raw/*378.10*/("""console.log(parseInt($scope.amountotransfer),parseInt($scope.balanceamount));

         if(parseInt($scope.amountotransfer) <= parseInt($scope.balanceamount))"""),format.raw/*380.80*/("""{"""),format.raw/*380.81*/("""

             """),format.raw/*382.14*/("""//$scope.fromaccNumber $scope.toaccNumber
             //$scope.amountotransfer
             //withdraw amount from from account
             data1 = """),format.raw/*385.22*/("""{"""),format.raw/*385.23*/(""""id":$scope.fromaccNumber,"amount":$scope.amountotransfer"""),format.raw/*385.80*/("""}"""),format.raw/*385.81*/(""";

             $http("""),format.raw/*387.20*/("""{"""),format.raw/*387.21*/("""
                 """),format.raw/*388.18*/("""url: "http://localhost:9000/withdrawamount",
                 method: "PUT",
                 data: data1
             """),format.raw/*391.14*/("""}"""),format.raw/*391.15*/(""").success(function (datares1, status, headers, config) """),format.raw/*391.70*/("""{"""),format.raw/*391.71*/("""
                 """),format.raw/*392.18*/("""console.log(datares1, status);
                 //$rootScope.gettransactionlist();
             """),format.raw/*394.14*/("""}"""),format.raw/*394.15*/(""");




             //deposit amount to to account
             toaccdata = """),format.raw/*400.26*/("""{"""),format.raw/*400.27*/(""""id":$scope.toaccNumber,"amount":$scope.amountotransfer"""),format.raw/*400.82*/("""}"""),format.raw/*400.83*/(""";

             $http("""),format.raw/*402.20*/("""{"""),format.raw/*402.21*/("""
                 """),format.raw/*403.18*/("""url: "http://localhost:9000/addamount",
                 method: "PUT",
                 data: toaccdata
             """),format.raw/*406.14*/("""}"""),format.raw/*406.15*/(""").success(function (toaccdata, status, headers, config) """),format.raw/*406.71*/("""{"""),format.raw/*406.72*/("""
                 """),format.raw/*407.18*/("""console.log(toaccdata, status);
             """),format.raw/*408.14*/("""}"""),format.raw/*408.15*/(""");

         """),format.raw/*410.10*/("""}"""),format.raw/*410.11*/("""else"""),format.raw/*410.15*/("""{"""),format.raw/*410.16*/("""

             """),format.raw/*412.14*/("""alert("Please enter amount less than or equal to the account balance");
             console.log($scope.amountotransfer); return false;
         """),format.raw/*414.10*/("""}"""),format.raw/*414.11*/("""

         """),format.raw/*416.10*/("""alert("Amount transferred succcessfully");

         $window.location.reload();

     """),format.raw/*420.6*/("""}"""),format.raw/*420.7*/("""

					"""),format.raw/*422.6*/("""// add customer account
           $scope.addCustAccount = function (valid) """),format.raw/*423.53*/("""{"""),format.raw/*423.54*/("""
                        """),format.raw/*424.25*/("""$scope.submit = true;
                        $scope.CustomerDetail1;
                            if(valid==true)
                            """),format.raw/*427.29*/("""{"""),format.raw/*427.30*/("""
                                    """),format.raw/*428.37*/("""data1 = """),format.raw/*428.45*/("""{"""),format.raw/*428.46*/(""""id":$scope.CustomerDetail1.id,"accountId":$scope.CustomerDetail1.accountId,"status":$scope.CustomerDetail1.status"""),format.raw/*428.160*/("""}"""),format.raw/*428.161*/(""";
                                   $http("""),format.raw/*429.42*/("""{"""),format.raw/*429.43*/("""
                                            """),format.raw/*430.45*/("""url: "http://localhost:9000/addcustomeraccountpost",
                                            method: "POST",
                                            data: data1
                                        """),format.raw/*433.41*/("""}"""),format.raw/*433.42*/(""").success(function (datares1, status, headers, config) """),format.raw/*433.97*/("""{"""),format.raw/*433.98*/("""
                                           """),format.raw/*434.44*/("""data2 = """),format.raw/*434.52*/("""{"""),format.raw/*434.53*/(""""id":$scope.CustomerDetail1.accountId,"name":$scope.CustomerDetail1.actype"""),format.raw/*434.127*/("""}"""),format.raw/*434.128*/(""";
                                            $http("""),format.raw/*435.51*/("""{"""),format.raw/*435.52*/("""
                                                """),format.raw/*436.49*/("""url: "http://localhost:9000/addcustomeraccountpost1",
                                                method: "POST",
                                                data: data2
                                            """),format.raw/*439.45*/("""}"""),format.raw/*439.46*/(""").success(function (datares2, status, headers, config) """),format.raw/*439.101*/("""{"""),format.raw/*439.102*/("""
                                                """),format.raw/*440.49*/("""angular.forEach( $scope.customerAcountList, function(e)"""),format.raw/*440.104*/("""{"""),format.raw/*440.105*/("""
                                                    """),format.raw/*441.53*/("""if(e.id==$scope.CustomerDetail1.id)"""),format.raw/*441.88*/("""{"""),format.raw/*441.89*/("""
                                                        """),format.raw/*442.57*/("""e.accountId = $scope.CustomerDetail1.accountId;
                                                        e.status =$scope.CustomerDetail1.status;

                                                    """),format.raw/*445.53*/("""}"""),format.raw/*445.54*/("""
                                                """),format.raw/*446.49*/("""}"""),format.raw/*446.50*/(""");
                                        """),format.raw/*447.41*/("""}"""),format.raw/*447.42*/(""");
                                       alert(data1);
                                       $window.location.reload();
                                    """),format.raw/*450.37*/("""}"""),format.raw/*450.38*/(""");
                                    $('#myModal').modal('hide');
                            """),format.raw/*452.29*/("""}"""),format.raw/*452.30*/("""
                            """),format.raw/*453.29*/("""else
                            """),format.raw/*454.29*/("""{"""),format.raw/*454.30*/("""
                                 """),format.raw/*455.34*/("""return false;
                            """),format.raw/*456.29*/("""}"""),format.raw/*456.30*/("""


                    """),format.raw/*459.21*/("""}"""),format.raw/*459.22*/("""
					
"""),format.raw/*461.1*/("""// add money

					$scope.Depositamount123;


					$scope.depositeamt = function (valid) """),format.raw/*466.44*/("""{"""),format.raw/*466.45*/("""
                        """),format.raw/*467.25*/("""$scope.submit = true;
                        data = $scope.Depositamount123;
                        if(valid==true)
					    """),format.raw/*470.10*/("""{"""),format.raw/*470.11*/("""
                            """),format.raw/*471.29*/("""data1 = """),format.raw/*471.37*/("""{"""),format.raw/*471.38*/(""""id":$scope.Depositamount123.id,"amount":$scope.Depositamount123.amount"""),format.raw/*471.109*/("""}"""),format.raw/*471.110*/(""";

                            $http("""),format.raw/*473.35*/("""{"""),format.raw/*473.36*/("""
                                """),format.raw/*474.33*/("""url: "http://localhost:9000/addamount",
                                method: "PUT",
                                data: data1
                            """),format.raw/*477.29*/("""}"""),format.raw/*477.30*/(""").success(function (datares1, status, headers, config) """),format.raw/*477.85*/("""{"""),format.raw/*477.86*/("""

                            """),format.raw/*479.29*/("""}"""),format.raw/*479.30*/(""");
                           $('#myModal').modal('hide');
                           $rootScope.gettransactionlist();
					    """),format.raw/*482.10*/("""}"""),format.raw/*482.11*/("""else
                    """),format.raw/*483.21*/("""{"""),format.raw/*483.22*/("""
                      """),format.raw/*484.23*/("""return false;
                    """),format.raw/*485.21*/("""}"""),format.raw/*485.22*/("""

                  """),format.raw/*487.19*/("""}"""),format.raw/*487.20*/("""


					"""),format.raw/*490.6*/("""$scope.withdrawamt = function (valid) """),format.raw/*490.44*/("""{"""),format.raw/*490.45*/("""
                        """),format.raw/*491.25*/("""$scope.submit = true;
                        data = $scope.Depositamount123;
                        if(valid==true)
					    """),format.raw/*494.10*/("""{"""),format.raw/*494.11*/("""
                        """),format.raw/*495.25*/("""data1 = """),format.raw/*495.33*/("""{"""),format.raw/*495.34*/(""""id":$scope.Depositamount123.id,"amount":$scope.Depositamount123.amount"""),format.raw/*495.105*/("""}"""),format.raw/*495.106*/(""";

                            $http("""),format.raw/*497.35*/("""{"""),format.raw/*497.36*/("""
                                """),format.raw/*498.33*/("""url: "http://localhost:9000/withdrawamount",
                                method: "PUT",
                                data: data1
                            """),format.raw/*501.29*/("""}"""),format.raw/*501.30*/(""").success(function (datares1, status, headers, config) """),format.raw/*501.85*/("""{"""),format.raw/*501.86*/("""
                             """),format.raw/*502.30*/("""$('#myModal').modal('hide');
                             $rootScope.gettransactionlist();
                            """),format.raw/*504.29*/("""}"""),format.raw/*504.30*/(""");
                        """),format.raw/*505.25*/("""}"""),format.raw/*505.26*/("""
                        """),format.raw/*506.25*/("""else
                        """),format.raw/*507.25*/("""{"""),format.raw/*507.26*/("""
                          """),format.raw/*508.27*/("""return false;
                        """),format.raw/*509.25*/("""}"""),format.raw/*509.26*/("""

                    """),format.raw/*511.21*/("""}"""),format.raw/*511.22*/("""




        """),format.raw/*516.9*/("""/*   $scope.historyList=[];
					$scope.viewhistory = function (id) """),format.raw/*517.41*/("""{"""),format.raw/*517.42*/("""
                       """),format.raw/*518.24*/("""$scope.submit = true;
                       // $scope.getAccountType();
                           // alert($scope.Depositransact.accountId);
                           $http("""),format.raw/*521.34*/("""{"""),format.raw/*521.35*/("""
                               """),format.raw/*522.32*/("""url: "http://localhost:9000/viewhistory/"+id,
                               method: "GET",
                               data: """),format.raw/*524.38*/("""{"""),format.raw/*524.39*/(""""id":id"""),format.raw/*524.46*/("""}"""),format.raw/*524.47*/("""
                               """),format.raw/*525.32*/("""}"""),format.raw/*525.33*/(""").success(function (data1, status, headers, config) """),format.raw/*525.85*/("""{"""),format.raw/*525.86*/("""
                               """),format.raw/*526.32*/("""$scope.historyList = JSON.parse(data1);
                               $scope.$apply();
                           """),format.raw/*528.28*/("""}"""),format.raw/*528.29*/(""")
                   """),format.raw/*529.20*/("""}"""),format.raw/*529.21*/("""

                   """),format.raw/*531.20*/("""*/

     $rootScope.historyList=[];
     $scope.viewhistory = function (id) """),format.raw/*534.41*/("""{"""),format.raw/*534.42*/("""
         """),format.raw/*535.10*/("""$scope.submit = true;
         // $scope.getAccountType();
         // alert($scope.Depositransact.accountId);
         $http("""),format.raw/*538.16*/("""{"""),format.raw/*538.17*/("""
             """),format.raw/*539.14*/("""url: "http://localhost:9000/viewhistory/"+id,
             method: "GET",
             data: """),format.raw/*541.20*/("""{"""),format.raw/*541.21*/(""""id":id"""),format.raw/*541.28*/("""}"""),format.raw/*541.29*/("""
         """),format.raw/*542.10*/("""}"""),format.raw/*542.11*/(""").success(function (data1, status, headers, config) """),format.raw/*542.63*/("""{"""),format.raw/*542.64*/("""

            """),format.raw/*544.13*/("""// $rootScope.historyList=[];
             angular.forEach( JSON.parse(data1), function(d)"""),format.raw/*545.61*/("""{"""),format.raw/*545.62*/("""
                 """),format.raw/*546.18*/("""e="""),format.raw/*546.20*/("""{"""),format.raw/*546.21*/("""}"""),format.raw/*546.22*/(""";
                 e.type = d.type;e.amount = d.amount;
                 e.at = d.at[0]+"-"+d.at[1]+"-"+d.at[2];
                 e.t=d.at[3]+":"+d.at[4]+":"+d.at[5]
                 $rootScope.historyList.push(e);
             """),format.raw/*551.14*/("""}"""),format.raw/*551.15*/(""");

             //$scope.historyList = JSON.parse(data1);
             $scope.$apply();
         """),format.raw/*555.10*/("""}"""),format.raw/*555.11*/(""")
     """),format.raw/*556.6*/("""}"""),format.raw/*556.7*/("""

             """),format.raw/*558.14*/("""$scope.toptenRecords="";$scope.todayval="";$scope.balance_transfer = false;
             $scope.today= function(customerID)"""),format.raw/*559.48*/("""{"""),format.raw/*559.49*/("""
                 """),format.raw/*560.18*/("""$scope.toptenRecords="";
                 var curDate = new Date();
                 var y = curDate.getFullYear();
                 var m = curDate.getMonth() + 1;
                 if (m < 10) """),format.raw/*564.30*/("""{"""),format.raw/*564.31*/("""
                     """),format.raw/*565.22*/("""//m = '0' + m;
                     m = m;
                 """),format.raw/*567.18*/("""}"""),format.raw/*567.19*/("""
                 """),format.raw/*568.18*/("""var d = curDate.getDate();
                 if (d < 10) """),format.raw/*569.30*/("""{"""),format.raw/*569.31*/("""
                     """),format.raw/*570.22*/("""d = '0' + d;
                 """),format.raw/*571.18*/("""}"""),format.raw/*571.19*/("""
                 """),format.raw/*572.18*/("""var h = curDate.getHours();
                 var mm = curDate.getMinutes();
                 var s = curDate.getSeconds();

                 //$scope.todayval = y + '-' + m + '-' + d;
                 $scope.todayval = y + '-' + m + '-' + d;
             """),format.raw/*578.14*/("""}"""),format.raw/*578.15*/("""

             """),format.raw/*580.14*/("""$scope.topten = function()"""),format.raw/*580.40*/("""{"""),format.raw/*580.41*/("""
                 """),format.raw/*581.18*/("""$scope.todayval="";$scope.balance_transfer = false;
                 $scope.toptenRecords =2
             """),format.raw/*583.14*/("""}"""),format.raw/*583.15*/("""


             """),format.raw/*586.14*/("""$scope.opendates = function()"""),format.raw/*586.43*/("""{"""),format.raw/*586.44*/("""
                 """),format.raw/*587.18*/("""$scope.balance_transfer = false;
                 $scope.selectrange = !$scope.selectrange;
             """),format.raw/*589.14*/("""}"""),format.raw/*589.15*/("""


             """),format.raw/*592.14*/("""$scope.converDate = function (inputDate)"""),format.raw/*592.54*/("""{"""),format.raw/*592.55*/("""

                 """),format.raw/*594.18*/("""var inputDateTemp = new Date(inputDate);
                 var y = inputDateTemp.getFullYear();
                 var m = inputDateTemp.getMonth();
                 var d = inputDateTemp.getDate();

                 return y+"-"+(m+1)+"-"+d;

             """),format.raw/*601.14*/("""}"""),format.raw/*601.15*/("""





           """),format.raw/*607.12*/("""var customerID = $location.$$absUrl.substring($location.$$absUrl.lastIndexOf("/")+1,$location.$$absUrl.length)
            if($location.$$absUrl.indexOf("transactionsist")!=-1)"""),format.raw/*608.66*/("""{"""),format.raw/*608.67*/("""
                """),format.raw/*609.17*/("""$scope.viewhistory(customerID);
            """),format.raw/*610.13*/("""}"""),format.raw/*610.14*/("""

"""),format.raw/*612.1*/("""$rootScope.gettransactionlist();
$rootScope.getcusaccount();

    $scope.Listfilter = $rootScope.historyList;
    console.log($rootScope.historyList);
     $scope.daterange = function(id)"""),format.raw/*617.37*/("""{"""),format.raw/*617.38*/("""
         """),format.raw/*618.10*/("""$scope.balance_transfer = false;
         //$scope.viewhistory(id);
         console.log($scope.startDate,$scope.endDate);
         if(angular.isUndefined($scope.startDate) || angular.isUndefined($scope.startDate)) """),format.raw/*621.93*/("""{"""),format.raw/*621.94*/("""
             """),format.raw/*622.14*/("""return false;
         """),format.raw/*623.10*/("""}"""),format.raw/*623.11*/("""
         """),format.raw/*624.10*/("""$scope.todayval="";
         var tempArray=[];
         $scope.toptenRecords="";
         var startTime = new Date($scope.converDate( $scope.startDate )).getTime();
         var endTime = new Date($scope.converDate( $scope.endDate )).getTime();
         // console.log(startTime);console.log(endTime);
         console.log($scope.historyList);

         angular.forEach($scope.historyList,function(data)"""),format.raw/*632.59*/("""{"""),format.raw/*632.60*/("""
             """),format.raw/*633.14*/("""//alert("sbdjshdjhsd");
             e="""),format.raw/*634.16*/("""{"""),format.raw/*634.17*/("""}"""),format.raw/*634.18*/(""";
             //console.log(data);
             var dateval = new Date(data.at).getTime();

             // console.log(dateval +" ---" + startTime);
             if(dateval >= startTime &&  dateval <= endTime)"""),format.raw/*639.61*/("""{"""),format.raw/*639.62*/("""
                 """),format.raw/*640.18*/("""//alert("Menka");
                 e.amount    = data.amount; e.name = data.name; e.at = data.at; e.t = data.t; e.type = data.type;
                 //  console.log(data.at);
                 tempArray.push(e);
             """),format.raw/*644.14*/("""}"""),format.raw/*644.15*/("""
             """),format.raw/*645.14*/("""console.log(tempArray);
             // $scope.historyList =tempArray;
         """),format.raw/*647.10*/("""}"""),format.raw/*647.11*/(""");

         $scope.Listfilter =tempArray;
         // console.log(tempArray);
     """),format.raw/*651.6*/("""}"""),format.raw/*651.7*/("""

   """),format.raw/*653.4*/("""}"""),format.raw/*653.5*/(""");

        </script>
	<style>.btn-glyphicon """),format.raw/*656.24*/("""{"""),format.raw/*656.25*/(""" """),format.raw/*656.26*/("""padding:10px; background:#ffffff; margin-right:4px; """),format.raw/*656.78*/("""}"""),format.raw/*656.79*/("""
	   """),format.raw/*657.5*/(""".icon-btn """),format.raw/*657.15*/("""{"""),format.raw/*657.16*/(""" """),format.raw/*657.17*/("""padding: 1px 10px 3px 2px; border-radius:20px;"""),format.raw/*657.63*/("""}"""),format.raw/*657.64*/("""
	"""),format.raw/*658.2*/("""</style>
  </head>
  <body ng-controller="samplesController">
	
    <div class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <a href="../" class="navbar-brand">Banking Services</a>
          <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
        </div>
        <div class="navbar-collapse collapse" id="navbar-main">
          <ul class="nav navbar-nav pull-right">
           <!-- <li class="dropdown">
              <a href="#">Home</a>
            </li>
			<li>
              <a href="#">Balance</a>
            </li>
            <li>
              <a href="#">Transfer</a>
            </li>-->
              <li><a ng-href="/customerlist"><span class="glyphicon btn-glyphicon glyphicon-user img-circle text-success"></span>Customers  </a></li>
              <li><a ng-href="/customeraccountlist/all"><span class="glyphicon btn-glyphicon glyphicon glyphicon-transfer img-circle text-success"></span>Accounts  </a></li>
              <li><a ng-href="/transactionsist/"""),format.raw/*685.48*/("""{"""),format.raw/*685.49*/("""{"""),format.raw/*685.50*/("""cusfirstaccountid"""),format.raw/*685.67*/("""}"""),format.raw/*685.68*/("""}"""),format.raw/*685.69*/(""""><span class="glyphicon btn-glyphicon glyphicon-usd img-circle text-success"></span>Transactions</a></li>
          </ul>

          <ul class="nav navbar-nav navbar-right">
            <li><a href="#" target="_blank"></a></li>
            <li><a href="#" target="_blank"></a></li>
          </ul>

        </div>
      </div>
    </div>

    <div class="container">
      <div class="">
		 <div class="row">
          <div class="col-lg-12">&nbsp;</div>
        </div>
		 
		 
		<div class="row">			
			<div class="col-md-12">
				<div class="col-md-3"></div>


               <!-- <button class="btn " ng-click="getcustomerlist()">
                    <span class="glyphicon btn-glyphicon glyphicon-user img-circle text-success"></span>Customers  </button>
                <button class="btn "  ng-click="getcustomeraccountlist()">
                    <span class="glyphicon btn-glyphicon glyphicon glyphicon-transfer img-circle text-success"></span>Accounts  </button>
                <button class="btn "  ng-click="gettransactionsist() ; getcusaccount();">
                    <span class="glyphicon btn-glyphicon glyphicon-usd img-circle text-success"></span>Transactions    </button>

                <a ng-href="/customerlist"><span class="glyphicon btn-glyphicon glyphicon-user img-circle text-success"></span>Customers  </a>
                <a ng-href="/customeraccountlist/all"><span class="glyphicon btn-glyphicon glyphicon glyphicon-transfer img-circle text-success"></span>Accounts  </a>
                <a ng-href="/transactionsist/"""),format.raw/*718.46*/("""{"""),format.raw/*718.47*/("""{"""),format.raw/*718.48*/("""cusfirstaccountid"""),format.raw/*718.65*/("""}"""),format.raw/*718.66*/("""}"""),format.raw/*718.67*/(""""><span class="glyphicon btn-glyphicon glyphicon-usd img-circle text-success"></span>Transactions</a>
               <!-- <a ng-href="/balancetransfer/"""),format.raw/*719.50*/("""{"""),format.raw/*719.51*/("""{"""),format.raw/*719.52*/("""cusfirstaccountid"""),format.raw/*719.69*/("""}"""),format.raw/*719.70*/("""}"""),format.raw/*719.71*/(""""><span class="glyphicon btn-glyphicon glyphicon-usd img-circle text-success"></span>Balance Transfer</a>-->

			</div>
		   
		</div>

		
		"""),_display_(/*726.4*/content),format.raw/*726.11*/("""
		
        
	"""),format.raw/*729.2*/("""<footer>
		<div class="row"><hr></div>
        <div class="row">		
          <div class="col-lg-12">			
            <ul class="list-unstyled">
              <li class="pull-right"><a href="#top">Back to top</a></li>
              <li><a href="#" onclick="pageTracker._link(this.href); return false;">About Us</a></li>
              <li><a href="#">Contact Us</a></li>
              <li><a href="#">Support</a></li>
            </ul>            
          </div>
        </div>
      </footer>

  </body>
</html>




"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Mar 01 05:47:27 IST 2017
                  SOURCE: C:/Users/krishna/Downloads/BankingServicesApp/app/views/main.scala.html
                  HASH: 75d0faa0742ab9246ae9628d2c4e55fa2ee03842
                  MATRIX: 530->1|655->31|682->32|1002->326|1016->332|1082->378|1161->430|1176->436|1240->479|1290->502|1305->508|1379->561|1438->593|1453->599|1523->648|1600->698|1615->704|1679->747|1858->899|1873->905|1943->954|1997->981|2012->987|2096->1050|2204->1131|2219->1137|2291->1187|2360->1229|2375->1235|2443->1282|2524->1336|2539->1342|2599->1381|3076->1830|3105->1831|3146->1844|3231->1901|3260->1902|3305->1919|3462->2048|3491->2049|3556->2086|3585->2087|3630->2104|3780->2226|3809->2227|3877->2267|3906->2268|3951->2285|4104->2410|4133->2411|4171->2422|4200->2423|4344->2538|4374->2539|4419->2556|4620->2729|4649->2730|4690->2743|4732->2757|4761->2758|5206->3175|5235->3176|5271->3185|5300->3186|5365->3223|5394->3224|5427->3230|5474->3250|5502->3251|5531->3253|5635->3329|5664->3330|5693->3331|5774->3384|5803->3385|5912->3466|5941->3467|6003->3501|6052->3522|6081->3523|6142->3556|6307->3693|6336->3694|6393->3723|6422->3724|6511->3785|6540->3786|6598->3816|6627->3817|6715->3877|6744->3878|6779->3886|6859->3938|6888->3939|6917->3940|6998->3993|7027->3994|7136->4075|7165->4076|7227->4110|7276->4131|7305->4132|7367->4166|7510->4280|7540->4281|7598->4310|7628->4311|7718->4372|7748->4373|7807->4403|7837->4404|7885->4423|7915->4424|8091->4571|8121->4572|8175->4597|8266->4659|8296->4660|8326->4661|8417->4723|8447->4724|8557->4805|8587->4806|8623->4814|8809->4971|8839->4972|8906->5010|8969->5044|8999->5045|9066->5083|9140->5128|9170->5129|9245->5175|9290->5191|9320->5192|9398->5241|9877->5691|9907->5692|9977->5733|10007->5734|10076->5774|10106->5775|10171->5811|10201->5812|10264->5846|10338->5891|10368->5892|10458->5953|10488->5954|10546->5983|10576->5984|10626->6005|10656->6006|10875->6196|10905->6197|10941->6205|11033->6268|11063->6269|11123->6300|11230->6378|11260->6379|11307->6397|11519->6580|11549->6581|11609->6612|11747->6721|11777->6722|11839->6755|12024->6911|12054->6912|12120->6949|12224->7024|12254->7025|12313->7055|12343->7056|12396->7080|12426->7081|12475->7101|12505->7102|12534->7103|12727->7267|12757->7268|12807->7289|12901->7354|12931->7355|12961->7356|13056->7421|13087->7422|13201->7507|13231->7508|13293->7541|13493->7712|13523->7713|13593->7754|13685->7816|13716->7817|13790->7862|13883->7925|13914->7926|13992->7975|14154->8107|14185->8108|14267->8161|14545->8410|14575->8411|14649->8456|14679->8457|14749->8498|14779->8499|14845->8536|14875->8537|14937->8570|14967->8571|15061->8636|15091->8637|15152->8669|15182->8670|15231->8690|15261->8691|15394->8795|15424->8796|15479->8822|15585->8899|15615->8900|15706->8962|15736->8963|15791->8989|15904->9073|15934->9074|16056->9167|16086->9168|16147->9200|16253->9277|16283->9278|16420->9386|16450->9387|16504->9412|16719->9598|16749->9599|16838->9659|16868->9660|16919->9682|17042->9776|17072->9777|17189->9865|17219->9866|17274->9892|17387->9976|17417->9977|17501->10032|17531->10033|17585->10058|17866->10310|17896->10311|17954->10340|17989->10346|18019->10347|18081->10380|18253->10523|18283->10524|18364->10576|18394->10577|18456->10610|18691->10816|18721->10817|18776->10843|18806->10844|18860->10869|18893->10873|18923->10874|18982->10904|19049->10942|19079->10943|19133->10968|19199->11005|19229->11006|19271->11019|19357->11076|19387->11077|19433->11094|19542->11174|19572->11175|19621->11195|19689->11234|19719->11235|19764->11251|19813->11271|19843->11272|19892->11292|19958->11329|19988->11330|20034->11347|20070->11354|20100->11355|20202->11428|20232->11429|20325->11493|20355->11494|20408->11518|20563->11644|20593->11645|20674->11697|20704->11698|20757->11722|20916->11852|20946->11853|21021->11899|21051->11900|21081->11902|21194->11986|21224->11987|21254->11988|21335->12040|21365->12041|21420->12067|21645->12263|21675->12264|21735->12295|21770->12301|21800->12302|21862->12335|22057->12501|22087->12502|22168->12554|22198->12555|22265->12593|22323->12622|22353->12623|22427->12668|22607->12819|22637->12820|22702->12856|22836->12961|22866->12962|23046->13113|23076->13114|23134->13143|23196->13176|23226->13177|23289->13211|23360->13253|23390->13254|23441->13276|23471->13277|23518->13295|23580->13328|23610->13329|23660->13350|23855->13516|23885->13517|23938->13541|23980->13554|24010->13555|24068->13584|24121->13608|24151->13609|24212->13641|24472->13872|24502->13873|24555->13897|24585->13898|24634->13918|24664->13919|24775->14001|24805->14002|24859->14027|24971->14110|25001->14111|25117->14198|25147->14199|25181->14205|25303->14298|25333->14299|25373->14310|25423->14331|25453->14332|25533->14383|25563->14384|25617->14408|25648->14409|25728->14459|25759->14460|25795->14468|25824->14469|25858->14475|25928->14516|25958->14517|25997->14527|26087->14588|26117->14589|26160->14603|26202->14616|26232->14617|26279->14635|26330->14657|26360->14658|26410->14679|26597->14837|26627->14838|26674->14856|26723->14876|26753->14877|26804->14899|26897->14963|26927->14964|26970->14978|27000->14979|27039->14989|27069->14990|27168->15060|27198->15061|27241->15075|27340->15145|27370->15146|27406->15154|27435->15155|27470->15162|27532->15195|27562->15196|27602->15207|27670->15246|27700->15247|27743->15261|27832->15321|27862->15322|27903->15334|28090->15492|28120->15493|28164->15508|28343->15658|28373->15659|28459->15716|28489->15717|28540->15739|28570->15740|28617->15758|28765->15877|28795->15878|28879->15933|28909->15934|28956->15952|29081->16048|29111->16049|29216->16125|29246->16126|29330->16181|29360->16182|29411->16204|29441->16205|29488->16223|29635->16341|29665->16342|29750->16398|29780->16399|29827->16417|29901->16462|29931->16463|29973->16476|30003->16477|30036->16481|30066->16482|30110->16497|30284->16642|30314->16643|30354->16654|30468->16740|30497->16741|30532->16748|30637->16824|30667->16825|30721->16850|30892->16992|30922->16993|30988->17030|31025->17038|31055->17039|31199->17153|31230->17154|31302->17197|31332->17198|31406->17243|31644->17452|31674->17453|31758->17508|31788->17509|31861->17553|31898->17561|31928->17562|32032->17636|32063->17637|32144->17689|32174->17690|32252->17739|32503->17961|32533->17962|32618->18017|32649->18018|32727->18067|32812->18122|32843->18123|32925->18176|32989->18211|33019->18212|33105->18269|33332->18467|33362->18468|33440->18517|33470->18518|33542->18561|33572->18562|33759->18720|33789->18721|33914->18817|33944->18818|34002->18847|34064->18880|34094->18881|34157->18915|34228->18957|34258->18958|34310->18981|34340->18982|34375->18989|34493->19078|34523->19079|34577->19104|34733->19231|34763->19232|34821->19261|34858->19269|34888->19270|34989->19341|35020->19342|35086->19379|35116->19380|35178->19413|35366->19572|35396->19573|35480->19628|35510->19629|35569->19659|35599->19660|35756->19788|35786->19789|35840->19814|35870->19815|35922->19838|35985->19872|36015->19873|36064->19893|36094->19894|36130->19902|36197->19940|36227->19941|36281->19966|36437->20093|36467->20094|36521->20119|36558->20127|36588->20128|36689->20199|36720->20200|36786->20237|36816->20238|36878->20271|37071->20435|37101->20436|37185->20491|37215->20492|37274->20522|37422->20641|37452->20642|37508->20669|37538->20670|37592->20695|37650->20724|37680->20725|37736->20752|37803->20790|37833->20791|37884->20813|37914->20814|37955->20827|38052->20895|38082->20896|38135->20920|38340->21096|38370->21097|38431->21129|38589->21258|38619->21259|38655->21266|38685->21267|38746->21299|38776->21300|38857->21352|38887->21353|38948->21385|39092->21500|39122->21501|39172->21522|39202->21523|39252->21544|39357->21620|39387->21621|39426->21631|39581->21757|39611->21758|39654->21772|39776->21865|39806->21866|39842->21873|39872->21874|39911->21884|39941->21885|40022->21937|40052->21938|40095->21952|40214->22042|40244->22043|40291->22061|40322->22063|40352->22064|40382->22065|40639->22293|40669->22294|40796->22392|40826->22393|40861->22400|40890->22401|40934->22416|41086->22539|41116->22540|41163->22558|41386->22752|41416->22753|41467->22775|41556->22835|41586->22836|41633->22854|41718->22910|41748->22911|41799->22933|41858->22963|41888->22964|41935->22982|42219->23237|42249->23238|42293->23253|42348->23279|42378->23280|42425->23298|42560->23404|42590->23405|42635->23421|42693->23450|42723->23451|42770->23469|42904->23574|42934->23575|42979->23591|43048->23631|43078->23632|43126->23651|43409->23905|43439->23906|43485->23923|43690->24099|43720->24100|43766->24117|43839->24161|43869->24162|43899->24164|44115->24351|44145->24352|44184->24362|44428->24577|44458->24578|44501->24592|44553->24615|44583->24616|44622->24626|45054->25029|45084->25030|45127->25044|45195->25083|45225->25084|45255->25085|45495->25296|45525->25297|45572->25315|45825->25539|45855->25540|45898->25554|46007->25634|46037->25635|46149->25719|46178->25720|46211->25725|46240->25726|46314->25771|46344->25772|46374->25773|46455->25825|46485->25826|46518->25831|46557->25841|46587->25842|46617->25843|46692->25889|46722->25890|46752->25892|48019->27130|48049->27131|48079->27132|48125->27149|48155->27150|48185->27151|49762->28699|49792->28700|49822->28701|49868->28718|49898->28719|49928->28720|50108->28871|50138->28872|50168->28873|50214->28890|50244->28891|50274->28892|50443->29034|50472->29041|50514->29055
                  LINES: 20->1|25->1|26->2|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|37->13|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|53->29|53->29|54->30|55->31|55->31|56->32|59->35|59->35|60->36|60->36|61->37|64->40|64->40|65->41|65->41|66->42|69->45|69->45|71->47|71->47|73->49|73->49|74->50|80->56|80->56|81->57|81->57|81->57|92->68|92->68|93->69|93->69|95->71|95->71|96->72|97->73|97->73|99->75|101->77|101->77|101->77|101->77|101->77|102->78|102->78|103->79|103->79|103->79|104->80|106->82|106->82|107->83|107->83|108->84|108->84|110->86|110->86|114->90|114->90|116->92|117->93|117->93|117->93|117->93|117->93|118->94|118->94|119->95|119->95|119->95|120->96|124->100|124->100|125->101|125->101|126->102|126->102|128->104|128->104|129->105|129->105|132->108|132->108|133->109|134->110|134->110|134->110|134->110|134->110|135->111|135->111|136->112|139->115|139->115|140->116|140->116|140->116|141->117|141->117|141->117|143->119|143->119|143->119|144->120|151->127|151->127|152->128|152->128|153->129|153->129|154->130|154->130|155->131|156->132|156->132|157->133|157->133|158->134|158->134|161->137|161->137|168->144|168->144|170->146|170->146|170->146|172->148|173->149|173->149|174->150|177->153|177->153|180->156|181->157|181->157|182->158|184->160|184->160|185->161|186->162|186->162|187->163|187->163|188->164|188->164|189->165|189->165|190->166|194->170|194->170|195->171|196->172|196->172|196->172|196->172|196->172|197->173|197->173|198->174|201->177|201->177|202->178|202->178|202->178|203->179|203->179|203->179|204->180|204->180|204->180|205->181|207->183|207->183|208->184|208->184|209->185|209->185|210->186|210->186|211->187|211->187|212->188|212->188|214->190|214->190|216->192|216->192|219->195|219->195|221->197|222->198|222->198|224->200|224->200|226->202|227->203|227->203|230->206|230->206|232->208|233->209|233->209|236->212|236->212|237->213|240->216|240->216|242->218|242->218|243->219|245->221|245->221|248->224|248->224|250->226|251->227|251->227|254->230|254->230|255->231|261->237|261->237|262->238|262->238|262->238|263->239|266->242|266->242|266->242|266->242|267->243|271->247|271->247|272->248|272->248|273->249|273->249|273->249|274->250|275->251|275->251|276->252|277->253|277->253|279->255|279->255|279->255|281->257|283->259|283->259|284->260|285->261|285->261|286->262|287->263|287->263|288->264|289->265|289->265|291->267|291->267|291->267|291->267|291->267|294->270|294->270|295->271|298->274|298->274|298->274|298->274|299->275|302->278|302->278|305->281|305->281|307->283|309->285|309->285|309->285|310->286|310->286|312->288|317->293|317->293|318->294|318->294|318->294|319->295|322->298|322->298|322->298|322->298|324->300|324->300|324->300|325->301|328->304|328->304|329->305|333->309|333->309|337->313|337->313|338->314|339->315|339->315|340->316|341->317|341->317|343->319|343->319|345->321|345->321|345->321|347->323|350->326|350->326|351->327|351->327|351->327|353->329|353->329|353->329|354->330|359->335|359->335|360->336|360->336|361->337|361->337|363->339|363->339|364->340|365->341|365->341|369->345|369->345|370->346|371->347|371->347|373->349|373->349|373->349|373->349|373->349|373->349|373->349|373->349|373->349|376->352|376->352|377->353|377->353|377->353|378->354|378->354|378->354|379->355|379->355|379->355|380->356|380->356|380->356|381->357|383->359|383->359|384->360|384->360|384->360|385->361|386->362|386->362|387->363|387->363|388->364|388->364|390->366|390->366|391->367|392->368|392->368|393->369|393->369|395->371|395->371|395->371|397->373|397->373|397->373|398->374|399->375|399->375|402->378|404->380|404->380|406->382|409->385|409->385|409->385|409->385|411->387|411->387|412->388|415->391|415->391|415->391|415->391|416->392|418->394|418->394|424->400|424->400|424->400|424->400|426->402|426->402|427->403|430->406|430->406|430->406|430->406|431->407|432->408|432->408|434->410|434->410|434->410|434->410|436->412|438->414|438->414|440->416|444->420|444->420|446->422|447->423|447->423|448->424|451->427|451->427|452->428|452->428|452->428|452->428|452->428|453->429|453->429|454->430|457->433|457->433|457->433|457->433|458->434|458->434|458->434|458->434|458->434|459->435|459->435|460->436|463->439|463->439|463->439|463->439|464->440|464->440|464->440|465->441|465->441|465->441|466->442|469->445|469->445|470->446|470->446|471->447|471->447|474->450|474->450|476->452|476->452|477->453|478->454|478->454|479->455|480->456|480->456|483->459|483->459|485->461|490->466|490->466|491->467|494->470|494->470|495->471|495->471|495->471|495->471|495->471|497->473|497->473|498->474|501->477|501->477|501->477|501->477|503->479|503->479|506->482|506->482|507->483|507->483|508->484|509->485|509->485|511->487|511->487|514->490|514->490|514->490|515->491|518->494|518->494|519->495|519->495|519->495|519->495|519->495|521->497|521->497|522->498|525->501|525->501|525->501|525->501|526->502|528->504|528->504|529->505|529->505|530->506|531->507|531->507|532->508|533->509|533->509|535->511|535->511|540->516|541->517|541->517|542->518|545->521|545->521|546->522|548->524|548->524|548->524|548->524|549->525|549->525|549->525|549->525|550->526|552->528|552->528|553->529|553->529|555->531|558->534|558->534|559->535|562->538|562->538|563->539|565->541|565->541|565->541|565->541|566->542|566->542|566->542|566->542|568->544|569->545|569->545|570->546|570->546|570->546|570->546|575->551|575->551|579->555|579->555|580->556|580->556|582->558|583->559|583->559|584->560|588->564|588->564|589->565|591->567|591->567|592->568|593->569|593->569|594->570|595->571|595->571|596->572|602->578|602->578|604->580|604->580|604->580|605->581|607->583|607->583|610->586|610->586|610->586|611->587|613->589|613->589|616->592|616->592|616->592|618->594|625->601|625->601|631->607|632->608|632->608|633->609|634->610|634->610|636->612|641->617|641->617|642->618|645->621|645->621|646->622|647->623|647->623|648->624|656->632|656->632|657->633|658->634|658->634|658->634|663->639|663->639|664->640|668->644|668->644|669->645|671->647|671->647|675->651|675->651|677->653|677->653|680->656|680->656|680->656|680->656|680->656|681->657|681->657|681->657|681->657|681->657|681->657|682->658|709->685|709->685|709->685|709->685|709->685|709->685|742->718|742->718|742->718|742->718|742->718|742->718|743->719|743->719|743->719|743->719|743->719|743->719|750->726|750->726|753->729
                  -- GENERATED --
              */
          