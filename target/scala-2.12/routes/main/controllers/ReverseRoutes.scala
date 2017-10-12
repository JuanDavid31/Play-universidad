
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/juan/Documentos/Play Java/Play-universidad/conf/routes
// @DATE:Thu Oct 12 11:03:36 COT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers {

  // @LINE:8
  class ReverseSuperController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def cerrarSesion(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cerrarSesion")
    }
  
    // @LINE:16
    def editarUsuario(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "editarUsuario" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("id", id)))))
    }
  
    // @LINE:26
    def mostrarCanciones(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "canciones")
    }
  
    // @LINE:8
    def indice(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:30
    def subirCancion(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "subirCancion")
    }
  
    // @LINE:14
    def guardarUsuario(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "guardarUsuario")
    }
  
    // @LINE:18
    def actualizarUsuario(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "actualizarUsuario" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:28
    def adicionarCancion(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adicionarCancion")
    }
  
    // @LINE:24
    def eliminarUsuarios(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "eliminarUsuarios")
    }
  
    // @LINE:10
    def mostrarUsuarios(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "usuarios")
    }
  
    // @LINE:22
    def agregarUsuariosRandom(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adicionarUsuariosRandom")
    }
  
    // @LINE:34
    def iniciarSesion(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "iniciarSesion" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:20
    def eliminarUsuario(id:Int): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "eliminarUsuario" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:32
    def eliminarCancion(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "eliminarCancion" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:12
    def adicionarUsuario(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adicionarUsuario")
    }
  
  }

  // @LINE:38
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
