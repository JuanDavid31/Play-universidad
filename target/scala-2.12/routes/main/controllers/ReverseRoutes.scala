
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/JuanDavid/Desktop/Play Java/play-java-starter-example/conf/routes
// @DATE:Thu Sep 28 21:58:52 COT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:14
package controllers {

  // @LINE:16
  class ReverseSuperController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def indice(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:20
    def adicionarUsuario(id:Int, nombre:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "agregarUsuario/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("nombre", nombre)))
    }
  
    // @LINE:26
    def eliminarUsuarios(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "eliminarUsuarios")
    }
  
    // @LINE:18
    def mostrarUsuarios(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "usuarios")
    }
  
    // @LINE:24
    def agregarUsuariosRandom(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "agregarUsuariosRandom")
    }
  
    // @LINE:22
    def eliminarUsuario(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "eliminarUsuario/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
