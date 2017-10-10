
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/JuanDavid/Desktop/Play Java/Play-universidad/conf/routes
// @DATE:Tue Oct 10 19:17:43 COT 2017


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
