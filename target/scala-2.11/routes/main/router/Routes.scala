
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/krishna/Downloads/BankingServicesApp/conf/routes
// @DATE:Wed Mar 01 05:47:23 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Assets_1: controllers.Assets,
  // @LINE:10
  HomeController_0: controllers.HomeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Assets_1: controllers.Assets,
    // @LINE:10
    HomeController_0: controllers.HomeController
  ) = this(errorHandler, Assets_1, HomeController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_1, HomeController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer""", """controllers.HomeController.customer"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcustomer""", """controllers.HomeController.addcustomer"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customerlist""", """controllers.HomeController.customerlist"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """redirectcustform""", """controllers.HomeController.redirectcustform"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcustomer1""", """controllers.HomeController.addcustomer1"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updatecustomer""", """controllers.HomeController.updatecustomer"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customeraccountlist/$id<[^/]+>""", """controllers.HomeController.customeraccountlist(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcustomeraccount""", """controllers.HomeController.addcustomeraccount"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcustomeraccountpost""", """controllers.HomeController.addcustomeraccountpost"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customerlistpost""", """controllers.HomeController.customerlistpost"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """activeinactivecusaccount""", """controllers.HomeController.activeinactivecusaccount"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transactionsist/$accountId<[^/]+>""", """controllers.HomeController.transactionsist(accountId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """balancetransfer/$id<[^/]+>""", """controllers.HomeController.balancetransfer(id:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcustomeraccountpost1""", """controllers.HomeController.addcustomeraccountpost1"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """transactionsistpost""", """controllers.HomeController.transactionsistpost"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewhistory/$id<[^/]+>""", """controllers.HomeController.viewhistory(id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addamount""", """controllers.HomeController.addamount"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """withdrawamount""", """controllers.HomeController.withdrawamount"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_customer2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer")))
  )
  private[this] lazy val controllers_HomeController_customer2_invoker = createInvoker(
    HomeController_0.customer,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "customer",
      Nil,
      "GET",
      """""",
      this.prefix + """customer"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_addcustomer3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcustomer")))
  )
  private[this] lazy val controllers_HomeController_addcustomer3_invoker = createInvoker(
    HomeController_0.addcustomer,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addcustomer",
      Nil,
      "GET",
      """ for customer screen""",
      this.prefix + """addcustomer"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_customerlist4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customerlist")))
  )
  private[this] lazy val controllers_HomeController_customerlist4_invoker = createInvoker(
    HomeController_0.customerlist,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "customerlist",
      Nil,
      "GET",
      """""",
      this.prefix + """customerlist"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_redirectcustform5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("redirectcustform")))
  )
  private[this] lazy val controllers_HomeController_redirectcustform5_invoker = createInvoker(
    HomeController_0.redirectcustform,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "redirectcustform",
      Nil,
      "POST",
      """""",
      this.prefix + """redirectcustform"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_addcustomer16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcustomer1")))
  )
  private[this] lazy val controllers_HomeController_addcustomer16_invoker = createInvoker(
    HomeController_0.addcustomer1,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addcustomer1",
      Nil,
      "POST",
      """""",
      this.prefix + """addcustomer1"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_updatecustomer7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updatecustomer")))
  )
  private[this] lazy val controllers_HomeController_updatecustomer7_invoker = createInvoker(
    HomeController_0.updatecustomer,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updatecustomer",
      Nil,
      "POST",
      """""",
      this.prefix + """updatecustomer"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_customeraccountlist8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customeraccountlist/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_customeraccountlist8_invoker = createInvoker(
    HomeController_0.customeraccountlist(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "customeraccountlist",
      Seq(classOf[String]),
      "GET",
      """ for customeraccount screen""",
      this.prefix + """customeraccountlist/$id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_addcustomeraccount9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcustomeraccount")))
  )
  private[this] lazy val controllers_HomeController_addcustomeraccount9_invoker = createInvoker(
    HomeController_0.addcustomeraccount,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addcustomeraccount",
      Nil,
      "GET",
      """""",
      this.prefix + """addcustomeraccount"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_addcustomeraccountpost10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcustomeraccountpost")))
  )
  private[this] lazy val controllers_HomeController_addcustomeraccountpost10_invoker = createInvoker(
    HomeController_0.addcustomeraccountpost,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addcustomeraccountpost",
      Nil,
      "POST",
      """""",
      this.prefix + """addcustomeraccountpost"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_customerlistpost11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customerlistpost")))
  )
  private[this] lazy val controllers_HomeController_customerlistpost11_invoker = createInvoker(
    HomeController_0.customerlistpost,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "customerlistpost",
      Nil,
      "POST",
      """""",
      this.prefix + """customerlistpost"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HomeController_activeinactivecusaccount12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("activeinactivecusaccount")))
  )
  private[this] lazy val controllers_HomeController_activeinactivecusaccount12_invoker = createInvoker(
    HomeController_0.activeinactivecusaccount,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "activeinactivecusaccount",
      Nil,
      "POST",
      """""",
      this.prefix + """activeinactivecusaccount"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_HomeController_transactionsist13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transactionsist/"), DynamicPart("accountId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_transactionsist13_invoker = createInvoker(
    HomeController_0.transactionsist(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "transactionsist",
      Seq(classOf[String]),
      "GET",
      """ for customeraccount screen""",
      this.prefix + """transactionsist/$accountId<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HomeController_balancetransfer14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("balancetransfer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_balancetransfer14_invoker = createInvoker(
    HomeController_0.balancetransfer(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "balancetransfer",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """balancetransfer/$id<[^/]+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_HomeController_addcustomeraccountpost115_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcustomeraccountpost1")))
  )
  private[this] lazy val controllers_HomeController_addcustomeraccountpost115_invoker = createInvoker(
    HomeController_0.addcustomeraccountpost1,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addcustomeraccountpost1",
      Nil,
      "POST",
      """""",
      this.prefix + """addcustomeraccountpost1"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_HomeController_transactionsistpost16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("transactionsistpost")))
  )
  private[this] lazy val controllers_HomeController_transactionsistpost16_invoker = createInvoker(
    HomeController_0.transactionsistpost,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "transactionsistpost",
      Nil,
      "POST",
      """""",
      this.prefix + """transactionsistpost"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_HomeController_viewhistory17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewhistory/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_viewhistory17_invoker = createInvoker(
    HomeController_0.viewhistory(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "viewhistory",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """viewhistory/$id<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_HomeController_addamount18_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addamount")))
  )
  private[this] lazy val controllers_HomeController_addamount18_invoker = createInvoker(
    HomeController_0.addamount,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addamount",
      Nil,
      "PUT",
      """""",
      this.prefix + """addamount"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_HomeController_withdrawamount19_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("withdrawamount")))
  )
  private[this] lazy val controllers_HomeController_withdrawamount19_invoker = createInvoker(
    HomeController_0.withdrawamount,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "withdrawamount",
      Nil,
      "PUT",
      """""",
      this.prefix + """withdrawamount"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Assets_versioned0_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:10
    case controllers_HomeController_index1_route(params) =>
      call { 
        controllers_HomeController_index1_invoker.call(HomeController_0.index)
      }
  
    // @LINE:11
    case controllers_HomeController_customer2_route(params) =>
      call { 
        controllers_HomeController_customer2_invoker.call(HomeController_0.customer)
      }
  
    // @LINE:16
    case controllers_HomeController_addcustomer3_route(params) =>
      call { 
        controllers_HomeController_addcustomer3_invoker.call(HomeController_0.addcustomer)
      }
  
    // @LINE:17
    case controllers_HomeController_customerlist4_route(params) =>
      call { 
        controllers_HomeController_customerlist4_invoker.call(HomeController_0.customerlist)
      }
  
    // @LINE:19
    case controllers_HomeController_redirectcustform5_route(params) =>
      call { 
        controllers_HomeController_redirectcustform5_invoker.call(HomeController_0.redirectcustform)
      }
  
    // @LINE:21
    case controllers_HomeController_addcustomer16_route(params) =>
      call { 
        controllers_HomeController_addcustomer16_invoker.call(HomeController_0.addcustomer1)
      }
  
    // @LINE:22
    case controllers_HomeController_updatecustomer7_route(params) =>
      call { 
        controllers_HomeController_updatecustomer7_invoker.call(HomeController_0.updatecustomer)
      }
  
    // @LINE:25
    case controllers_HomeController_customeraccountlist8_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_customeraccountlist8_invoker.call(HomeController_0.customeraccountlist(id))
      }
  
    // @LINE:27
    case controllers_HomeController_addcustomeraccount9_route(params) =>
      call { 
        controllers_HomeController_addcustomeraccount9_invoker.call(HomeController_0.addcustomeraccount)
      }
  
    // @LINE:28
    case controllers_HomeController_addcustomeraccountpost10_route(params) =>
      call { 
        controllers_HomeController_addcustomeraccountpost10_invoker.call(HomeController_0.addcustomeraccountpost)
      }
  
    // @LINE:29
    case controllers_HomeController_customerlistpost11_route(params) =>
      call { 
        controllers_HomeController_customerlistpost11_invoker.call(HomeController_0.customerlistpost)
      }
  
    // @LINE:30
    case controllers_HomeController_activeinactivecusaccount12_route(params) =>
      call { 
        controllers_HomeController_activeinactivecusaccount12_invoker.call(HomeController_0.activeinactivecusaccount)
      }
  
    // @LINE:33
    case controllers_HomeController_transactionsist13_route(params) =>
      call(params.fromPath[String]("accountId", None)) { (accountId) =>
        controllers_HomeController_transactionsist13_invoker.call(HomeController_0.transactionsist(accountId))
      }
  
    // @LINE:34
    case controllers_HomeController_balancetransfer14_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_balancetransfer14_invoker.call(HomeController_0.balancetransfer(id))
      }
  
    // @LINE:35
    case controllers_HomeController_addcustomeraccountpost115_route(params) =>
      call { 
        controllers_HomeController_addcustomeraccountpost115_invoker.call(HomeController_0.addcustomeraccountpost1)
      }
  
    // @LINE:36
    case controllers_HomeController_transactionsistpost16_route(params) =>
      call { 
        controllers_HomeController_transactionsistpost16_invoker.call(HomeController_0.transactionsistpost)
      }
  
    // @LINE:37
    case controllers_HomeController_viewhistory17_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_viewhistory17_invoker.call(HomeController_0.viewhistory(id))
      }
  
    // @LINE:38
    case controllers_HomeController_addamount18_route(params) =>
      call { 
        controllers_HomeController_addamount18_invoker.call(HomeController_0.addamount)
      }
  
    // @LINE:39
    case controllers_HomeController_withdrawamount19_route(params) =>
      call { 
        controllers_HomeController_withdrawamount19_invoker.call(HomeController_0.withdrawamount)
      }
  }
}