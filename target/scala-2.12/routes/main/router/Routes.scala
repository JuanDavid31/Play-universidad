
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/juan/Documentos/Play Java/Play-universidad/conf/routes
// @DATE:Thu Oct 12 11:03:36 COT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  SuperController_1: controllers.SuperController,
  // @LINE:38
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    SuperController_1: controllers.SuperController,
    // @LINE:38
    Assets_0: controllers.Assets
  ) = this(errorHandler, SuperController_1, Assets_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, SuperController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.SuperController.indice()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios""", """controllers.SuperController.mostrarUsuarios()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adicionarUsuario""", """controllers.SuperController.adicionarUsuario()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """guardarUsuario""", """controllers.SuperController.guardarUsuario()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editarUsuario""", """controllers.SuperController.editarUsuario(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """actualizarUsuario""", """controllers.SuperController.actualizarUsuario(id:Int)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eliminarUsuario""", """controllers.SuperController.eliminarUsuario(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adicionarUsuariosRandom""", """controllers.SuperController.agregarUsuariosRandom()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eliminarUsuarios""", """controllers.SuperController.eliminarUsuarios()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """canciones""", """controllers.SuperController.mostrarCanciones()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adicionarCancion""", """controllers.SuperController.adicionarCancion()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subirCancion""", """controllers.SuperController.subirCancion()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eliminarCancion""", """controllers.SuperController.eliminarCancion(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """iniciarSesion""", """controllers.SuperController.iniciarSesion(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cerrarSesion""", """controllers.SuperController.cerrarSesion()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_SuperController_indice0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_SuperController_indice0_invoker = createInvoker(
    SuperController_1.indice(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "indice",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_SuperController_mostrarUsuarios1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios")))
  )
  private[this] lazy val controllers_SuperController_mostrarUsuarios1_invoker = createInvoker(
    SuperController_1.mostrarUsuarios(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "mostrarUsuarios",
      Nil,
      "GET",
      this.prefix + """usuarios""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_SuperController_adicionarUsuario2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adicionarUsuario")))
  )
  private[this] lazy val controllers_SuperController_adicionarUsuario2_invoker = createInvoker(
    SuperController_1.adicionarUsuario(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "adicionarUsuario",
      Nil,
      "GET",
      this.prefix + """adicionarUsuario""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_SuperController_guardarUsuario3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("guardarUsuario")))
  )
  private[this] lazy val controllers_SuperController_guardarUsuario3_invoker = createInvoker(
    SuperController_1.guardarUsuario(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "guardarUsuario",
      Nil,
      "POST",
      this.prefix + """guardarUsuario""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_SuperController_editarUsuario4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editarUsuario")))
  )
  private[this] lazy val controllers_SuperController_editarUsuario4_invoker = createInvoker(
    SuperController_1.editarUsuario(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "editarUsuario",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """editarUsuario""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_SuperController_actualizarUsuario5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("actualizarUsuario")))
  )
  private[this] lazy val controllers_SuperController_actualizarUsuario5_invoker = createInvoker(
    SuperController_1.actualizarUsuario(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "actualizarUsuario",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """actualizarUsuario""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_SuperController_eliminarUsuario6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eliminarUsuario")))
  )
  private[this] lazy val controllers_SuperController_eliminarUsuario6_invoker = createInvoker(
    SuperController_1.eliminarUsuario(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "eliminarUsuario",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """eliminarUsuario""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_SuperController_agregarUsuariosRandom7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adicionarUsuariosRandom")))
  )
  private[this] lazy val controllers_SuperController_agregarUsuariosRandom7_invoker = createInvoker(
    SuperController_1.agregarUsuariosRandom(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "agregarUsuariosRandom",
      Nil,
      "GET",
      this.prefix + """adicionarUsuariosRandom""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_SuperController_eliminarUsuarios8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eliminarUsuarios")))
  )
  private[this] lazy val controllers_SuperController_eliminarUsuarios8_invoker = createInvoker(
    SuperController_1.eliminarUsuarios(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "eliminarUsuarios",
      Nil,
      "GET",
      this.prefix + """eliminarUsuarios""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_SuperController_mostrarCanciones9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("canciones")))
  )
  private[this] lazy val controllers_SuperController_mostrarCanciones9_invoker = createInvoker(
    SuperController_1.mostrarCanciones(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "mostrarCanciones",
      Nil,
      "GET",
      this.prefix + """canciones""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_SuperController_adicionarCancion10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adicionarCancion")))
  )
  private[this] lazy val controllers_SuperController_adicionarCancion10_invoker = createInvoker(
    SuperController_1.adicionarCancion(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "adicionarCancion",
      Nil,
      "GET",
      this.prefix + """adicionarCancion""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_SuperController_subirCancion11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subirCancion")))
  )
  private[this] lazy val controllers_SuperController_subirCancion11_invoker = createInvoker(
    SuperController_1.subirCancion(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "subirCancion",
      Nil,
      "POST",
      this.prefix + """subirCancion""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_SuperController_eliminarCancion12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eliminarCancion")))
  )
  private[this] lazy val controllers_SuperController_eliminarCancion12_invoker = createInvoker(
    SuperController_1.eliminarCancion(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "eliminarCancion",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """eliminarCancion""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_SuperController_iniciarSesion13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("iniciarSesion")))
  )
  private[this] lazy val controllers_SuperController_iniciarSesion13_invoker = createInvoker(
    SuperController_1.iniciarSesion(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "iniciarSesion",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """iniciarSesion""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_SuperController_cerrarSesion14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cerrarSesion")))
  )
  private[this] lazy val controllers_SuperController_cerrarSesion14_invoker = createInvoker(
    SuperController_1.cerrarSesion(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "cerrarSesion",
      Nil,
      "GET",
      this.prefix + """cerrarSesion""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:8
    case controllers_SuperController_indice0_route(params) =>
      call { 
        controllers_SuperController_indice0_invoker.call(SuperController_1.indice())
      }
  
    // @LINE:10
    case controllers_SuperController_mostrarUsuarios1_route(params) =>
      call { 
        controllers_SuperController_mostrarUsuarios1_invoker.call(SuperController_1.mostrarUsuarios())
      }
  
    // @LINE:12
    case controllers_SuperController_adicionarUsuario2_route(params) =>
      call { 
        controllers_SuperController_adicionarUsuario2_invoker.call(SuperController_1.adicionarUsuario())
      }
  
    // @LINE:14
    case controllers_SuperController_guardarUsuario3_route(params) =>
      call { 
        controllers_SuperController_guardarUsuario3_invoker.call(SuperController_1.guardarUsuario())
      }
  
    // @LINE:16
    case controllers_SuperController_editarUsuario4_route(params) =>
      call(params.fromQuery[Integer]("id", None)) { (id) =>
        controllers_SuperController_editarUsuario4_invoker.call(SuperController_1.editarUsuario(id))
      }
  
    // @LINE:18
    case controllers_SuperController_actualizarUsuario5_route(params) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_SuperController_actualizarUsuario5_invoker.call(SuperController_1.actualizarUsuario(id))
      }
  
    // @LINE:20
    case controllers_SuperController_eliminarUsuario6_route(params) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_SuperController_eliminarUsuario6_invoker.call(SuperController_1.eliminarUsuario(id))
      }
  
    // @LINE:22
    case controllers_SuperController_agregarUsuariosRandom7_route(params) =>
      call { 
        controllers_SuperController_agregarUsuariosRandom7_invoker.call(SuperController_1.agregarUsuariosRandom())
      }
  
    // @LINE:24
    case controllers_SuperController_eliminarUsuarios8_route(params) =>
      call { 
        controllers_SuperController_eliminarUsuarios8_invoker.call(SuperController_1.eliminarUsuarios())
      }
  
    // @LINE:26
    case controllers_SuperController_mostrarCanciones9_route(params) =>
      call { 
        controllers_SuperController_mostrarCanciones9_invoker.call(SuperController_1.mostrarCanciones())
      }
  
    // @LINE:28
    case controllers_SuperController_adicionarCancion10_route(params) =>
      call { 
        controllers_SuperController_adicionarCancion10_invoker.call(SuperController_1.adicionarCancion())
      }
  
    // @LINE:30
    case controllers_SuperController_subirCancion11_route(params) =>
      call { 
        controllers_SuperController_subirCancion11_invoker.call(SuperController_1.subirCancion())
      }
  
    // @LINE:32
    case controllers_SuperController_eliminarCancion12_route(params) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_SuperController_eliminarCancion12_invoker.call(SuperController_1.eliminarCancion(id))
      }
  
    // @LINE:34
    case controllers_SuperController_iniciarSesion13_route(params) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_SuperController_iniciarSesion13_invoker.call(SuperController_1.iniciarSesion(id))
      }
  
    // @LINE:36
    case controllers_SuperController_cerrarSesion14_route(params) =>
      call { 
        controllers_SuperController_cerrarSesion14_invoker.call(SuperController_1.cerrarSesion())
      }
  
    // @LINE:38
    case controllers_Assets_versioned15_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
