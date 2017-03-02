
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/krishna/Downloads/BankingServicesApp/conf/routes
// @DATE:Wed Mar 01 05:47:23 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:10
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:33
    def transactionsist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.transactionsist",
      """
        function(accountId) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "transactionsist/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("accountId", encodeURIComponent(accountId))})
        }
      """
    )
  
    // @LINE:25
    def customeraccountlist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.customeraccountlist",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "customeraccountlist/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
    // @LINE:37
    def viewhistory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.viewhistory",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewhistory/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
    // @LINE:28
    def addcustomeraccountpost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addcustomeraccountpost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcustomeraccountpost"})
        }
      """
    )
  
    // @LINE:30
    def activeinactivecusaccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.activeinactivecusaccount",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "activeinactivecusaccount"})
        }
      """
    )
  
    // @LINE:34
    def balancetransfer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.balancetransfer",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "balancetransfer/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
    // @LINE:39
    def withdrawamount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.withdrawamount",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "withdrawamount"})
        }
      """
    )
  
    // @LINE:16
    def addcustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addcustomer",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcustomer"})
        }
      """
    )
  
    // @LINE:17
    def customerlist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.customerlist",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "customerlist"})
        }
      """
    )
  
    // @LINE:35
    def addcustomeraccountpost1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addcustomeraccountpost1",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcustomeraccountpost1"})
        }
      """
    )
  
    // @LINE:29
    def customerlistpost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.customerlistpost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "customerlistpost"})
        }
      """
    )
  
    // @LINE:19
    def redirectcustform: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.redirectcustform",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "redirectcustform"})
        }
      """
    )
  
    // @LINE:21
    def addcustomer1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addcustomer1",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addcustomer1"})
        }
      """
    )
  
    // @LINE:36
    def transactionsistpost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.transactionsistpost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "transactionsistpost"})
        }
      """
    )
  
    // @LINE:38
    def addamount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addamount",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "addamount"})
        }
      """
    )
  
    // @LINE:27
    def addcustomeraccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addcustomeraccount",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcustomeraccount"})
        }
      """
    )
  
    // @LINE:10
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:22
    def updatecustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updatecustomer",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updatecustomer"})
        }
      """
    )
  
    // @LINE:11
    def customer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.customer",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "customer"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }


}