
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/JuanDavid/Desktop/Play Java/Play-universidad/conf/routes
// @DATE:Tue Oct 10 19:17:43 COT 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers.javascript {

  // @LINE:8
  class ReverseSuperController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def cerrarSesion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.cerrarSesion",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cerrarSesion"})
        }
      """
    )
  
    // @LINE:16
    def editarUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.editarUsuario",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "editarUsuario" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:26
    def mostrarCanciones: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.mostrarCanciones",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "canciones"})
        }
      """
    )
  
    // @LINE:8
    def indice: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.indice",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:30
    def subirCancion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.subirCancion",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subirCancion"})
        }
      """
    )
  
    // @LINE:14
    def guardarUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.guardarUsuario",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "guardarUsuario"})
        }
      """
    )
  
    // @LINE:18
    def actualizarUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.actualizarUsuario",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "actualizarUsuario" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:28
    def adicionarCancion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.adicionarCancion",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adicionarCancion"})
        }
      """
    )
  
    // @LINE:24
    def eliminarUsuarios: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.eliminarUsuarios",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "eliminarUsuarios"})
        }
      """
    )
  
    // @LINE:10
    def mostrarUsuarios: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.mostrarUsuarios",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
        }
      """
    )
  
    // @LINE:22
    def agregarUsuariosRandom: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.agregarUsuariosRandom",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adicionarUsuariosRandom"})
        }
      """
    )
  
    // @LINE:34
    def iniciarSesion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.iniciarSesion",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "iniciarSesion" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:20
    def eliminarUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.eliminarUsuario",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "eliminarUsuario" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:32
    def eliminarCancion: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.eliminarCancion",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "eliminarCancion" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:12
    def adicionarUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SuperController.adicionarUsuario",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adicionarUsuario"})
        }
      """
    )
  
  }

  // @LINE:38
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
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
