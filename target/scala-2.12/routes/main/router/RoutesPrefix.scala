
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/juan/Documentos/Play Java/Play-universidad/conf/routes
// @DATE:Thu Oct 12 11:03:36 COT 2017


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
