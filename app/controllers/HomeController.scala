package controllers

import javax.inject.{Inject, _}

import com.fasterxml.jackson.databind.JsonNode
import play.api.libs.json.{JsError, Json}
import play.api.libs.ws._
import play.api.mvc._

import scala.concurrent.Future
import play.api.data._
import play.api.data.Forms._
import play.api.data._
import play.api.data.Forms._

import scala.concurrent.forkjoin._
import play.api.libs.functional.syntax._
import play.api.libs.functional.syntax._

import scala.language.postfixOps
import play.api._
import play.api.mvc._
import play.api.libs.json._
import play.api.libs.functional.syntax._

import scala.collection.mutable._
import net.liftweb.json._
import net.liftweb.json.Serialization.write

import scala.concurrent.Future
import scala.concurrent.forkjoin._
import com.google.gson.Gson
import jdk.nashorn.internal.runtime.Source
import play.api.libs.json
import play.api.mvc.MultipartFormData.DataPart

import scala.collection.mutable._
//import net.liftweb.json._
//import net.liftweb.json.Serialization.write
/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class HomeController @Inject()(ws: WSClient) extends Controller {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  implicit val context = scala.concurrent.ExecutionContext.Implicits.global


  // home
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
// add operationform
  def addcustomer = Action {
    Ok(views.html.addcustomer(""))
  }

  def addcustomeraccount = Action {
    Ok(views.html.addcustomeraccount(""))
  }
//get customerlist
  def customerlist = Action {
    Ok(views.html.customerlist(""))
  }

  def customeraccountlist(id:String) = Action {
    if(id == "all" ){
      Ok(views.html.customeraccountlist(""))
    }else{
      Ok(views.html.customeraccountlist(id))
    }
  }
//get transactionsist view

def transactionsist(accountId:String) = Action {
    Ok(views.html.transactionsist(accountId))
  }

//
  def redirectcustform = Action {

   Redirect(routes.HomeController.addcustomer())
}


  def bankaccount = Action.async {
    ws.url("http://172.24.12.97:25399/api/bankaccount/123").get().map { response =>
      Ok(response.body)
    }
  }

  // fot get customerlist(GET)

  def customer = Action.async {
    import play.api.libs.json.Json
    ws.url("http://172.24.12.102:25543/api/customerService/getallcus/").get().map { response =>
      //Ok(views.html.customer(response.body))

      Ok(Json.toJson(response.json))
    }
  }

  // giving post request and getting All CustomerAccountList(POST)

  def customerlistpost = Action.async {
    import play.api.libs.json.Json
    ws.url("http://172.24.12.102:22957/api/customerService/getallcusaccount/").get().map { response =>
      Ok(Json.toJson(response.json))
    }
  }

  def transactionsistpost = Action.async {
    import play.api.libs.json.Json
    ws.url("http://172.24.12.102:25399/api/bankaccount/getalltransaction/").get().map { response =>
      Ok(Json.toJson(response.json))
    }
  }

  def balancetransfer(id:String) = Action {
    Ok(views.html.balancetransfer(id))
  }

  def updatecustomer = Action { request =>
    val json = request.body.asJson.get
    val futureResponse: Future[WSResponse] = ws.url("http://172.24.12.102:25543/api/customerService").put(json)
    Ok("Customer updated Sucessfully")
  }

  def activeinactivecusaccount = Action { request =>
    val json = request.body.asJson.get
    println(json);
    val futureResponse: Future[WSResponse] = ws.url("http://172.24.12.102:22957/api/customerAccountService").put(json)
    Ok("Account updated Sucessfully")
  }


  // for add customer (POST)
  import play.api.Play.current
  def addcustomer1 = Action { request =>
    //WS.url("http://172.24.12.97:25543//api/customerService").post(Map("key" -> Seq("value")))
    val json = request.body.asJson.get
     println(json);



    //val cust = json.as[Customer]
    // println(stock)
    //import play.api.libs.json._
    /*val data = Json.obj(
      "id" -> "value33",
      "name" -> "value2",
      "address" -> "value2",
      "PhoneNo" -> "value2",
      "emailId" -> "value2"
    )*/

     val futureResponse: Future[WSResponse] = ws.url("http://172.24.12.102:25543/api/customerService").post(json)
   // Redirect(routes.HomeController.index())
    //Redirect("/customerlist")
    // Redirect("/")
    Ok("Customer Added Sucessfully")
  }

  // for add customer Account (POST)
  def addcustomeraccountpost = Action { request =>
    val json = request.body.asJson.get
    println(json);
    val futureResponse: Future[WSResponse] = ws.url("http://172.24.12.102:22957/api/customerAccountService").post(json)
   Ok("CustomerAccount Added Sucessfully")
  }

  // for add customer Bank Account(POST)

  def addcustomeraccountpost1 = Action { request =>
    val json = request.body.asJson.get
    val futureResponse: Future[WSResponse] = ws.url("http://172.24.12.102:25399/api/bankaccount").post(json)
    Ok("CustomerAccount Added Sucessfully")
  }


  implicit val rds1 = (
    (__ \ 'id).read[String] and
      (__ \ 'saving).read[String]
    ) tupled


  //case class Depamt(name: String)
  object MyWriter {
    implicit val anyValWriter = Writes[Any] (a => a match {
      case v:String => Json.toJson(v)
      case v:Int => Json.toJson(v)
      case v:Any => Json.toJson(v.toString)
      // or, if you don't care about the value
      case _ => throw new RuntimeException("unserializeable type")
    })
  }



  def addamount = Action { request =>

    import play.api.libs.json._
    val json = request.body.asJson.get
    var a1="http://172.24.12.102:25399/api/bankaccount/"
    val id = (json \ "id").as[String]
    var amount = (json \ "amount").as[String]
    //var res1= (json \ "amount").asOpt[String]
    var urlpath=a1+id+"/depositmoney"
    import MyWriter.anyValWriter
    val a: Any = amount
    Json.toJson(a)
    val futureResponse: Future[WSResponse] =ws.url(urlpath).put(json)
    Ok( Json.toJson(a)+id+urlpath)
  }


  def withdrawamount = Action { request =>
    import play.api.libs.json._
    val json = request.body.asJson.get
    var a1="http://172.24.12.102:25399/api/bankaccount/"
    val id = (json \ "id").as[String]
    var amount = (json \ "amount").as[String]
    //var res1= (json \ "amount").asOpt[String]
    var urlpath=a1+id+"/withdrawmoney"
    import MyWriter.anyValWriter
    val a: Any = amount
    Json.toJson(a)
    val futureResponse: Future[WSResponse] =ws.url(urlpath).put(json)
    Ok( Json.toJson(a)+id+urlpath)
  }


  /*def addamount2 = Action(parse.json) { request =>

    import play.api.libs.json._
   // val json = request.body.asJson.get
    val data = Json.obj(
      "key1" -> "value1",
      "key2" -> "value2"
    )

    var a="http://172.24.12.97:25399/api/bankaccount/"
    //val gson = new Gson
    implicit val formats = DefaultFormats
    //val jsonString = write(p)
    request.body.validate[(String, String)].map{

      case (id, saving) => Ok("Hello saving " + saving + ", you're id "+id+write(saving))


    }.recoverTotal{
      e => BadRequest("Detected error:"+ JsError.toFlatJson(e))
    }
    //val futureResponse: Future[WSResponse] = ws.url(a+id+"/depositmoney").post({"amount"->"1000"})
  }
*/


  /*def sayHello = Action { request =>
    request.body.asJson.map { json =>
      json.validate[(String, Long)].map{
        case (name, age) => Ok("Hello " + name + ", you're "+age)
      }.recoverTotal{
        e => BadRequest("Detected error:"+ JsError.toFlatJson(e))
      }
    }.getOrElse {
      BadRequest("Expecting Json data")
    }
  }*/

 /* def addamount1 = Action { request =>


   val json = request.body.asJson.get
   // val futureResponse: Future[WSResponse] = ws.url("http://172.24.12.97:25399/api/bankaccount/7896547415/depositmoney").post(json)

    //Ok("Amount Added Sucessfully" +json+json.\("id"))

    request.body.asJson.map { json =>
      (json \ "id").asOpt[String].map { id =>


        Ok("Hello " + id)
      }.getOrElse {
        BadRequest("Missing parameter [name]")
      }
    }.getOrElse {
      BadRequest("Expecting Json data")
    }




    //val futureResponse: Future[WSResponse] = ws.url("http://172.24.12.97:25399/api/bankaccount/id/depositmoney").post()
  }*/



  def viewhistory(id: String) = Action.async {

    var a="http://172.24.12.102:25399/api/bankaccount/"
    import play.api.libs.json.Json

    var accId = id;
    ws.url(a+id+"/transactionhistory").get().map { response =>
      Ok(Json.toJson(response.body))
    }

  }

  /*def viewhistory1(id:String) = Action.async{request =>
    import play.api.libs.json.Json

    var accId = id;
    ws.url("http://172.24.12.97:25399/api/bankaccount/7896547415/transactionhistory").get().map { response =>
      Ok(Json.toJson(response.body))
    }
  }
*/
  /*def customeraccount = Action.async {
    ws.url("http://172.24.12.97:25543/api/customerService/1232").get().map { response =>
      Ok(response.body)
    }
  }*/

}
