
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paulk4ever/Desktop/play-java/conf/routes
// @DATE:Fri Apr 28 01:42:17 EDT 2017


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
