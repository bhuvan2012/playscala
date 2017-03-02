
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/krishna/Downloads/BankingServicesApp/conf/routes
// @DATE:Wed Mar 01 05:47:23 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
