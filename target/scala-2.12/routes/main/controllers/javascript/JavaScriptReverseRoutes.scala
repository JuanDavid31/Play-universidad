
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/JuanDavid/Desktop/Play Java/play-java-starter-example/conf/routes
// @DATE:Thu Sep 28 21:58:52 COT 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:14
package controllers.javascript {

  // @LINE:16
  class ReverseSuperController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def indice: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.indice",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:20
    def adicionarUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.adicionarUsuario",
      """
        function(id0,nombre1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "agregarUsuario/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("nombre", nombre1))})
        }
      """
    )
  
    // @LINE:26
    def eliminarUsuarios: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.eliminarUsuarios",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "eliminarUsuarios"})
        }
      """
    )
  
    // @LINE:18
    def mostrarUsuarios: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.mostrarUsuarios",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
        }
      """
    )
  
    // @LINE:24
    def agregarUsuariosRandom: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.agregarUsuariosRandom",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "agregarUsuariosRandom"})
        }
      """
    )
  
    // @LINE:22
    def eliminarUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.eliminarUsuario",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "eliminarUsuario/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
