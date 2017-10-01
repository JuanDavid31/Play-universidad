
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/JuanDavid/Desktop/Play Java/play-java-starter-example/conf/routes
// @DATE:Thu Sep 28 21:58:52 COT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:14
  Assets_0: controllers.Assets,
  // @LINE:16
  SuperController_1: controllers.SuperController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:14
    Assets_0: controllers.Assets,
    // @LINE:16
    SuperController_1: controllers.SuperController
  ) = this(errorHandler, Assets_0, SuperController_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Assets_0, SuperController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix, """controllers.SuperController.indice"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios""", """controllers.SuperController.mostrarUsuarios"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """agregarUsuario/""" + "$" + """id<[^/]+>/""" + "$" + """nombre<[^/]+>""", """controllers.SuperController.adicionarUsuario(id:Int, nombre:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eliminarUsuario/""" + "$" + """id<[^/]+>""", """controllers.SuperController.eliminarUsuario(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """agregarUsuariosRandom""", """controllers.SuperController.agregarUsuariosRandom"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """eliminarUsuarios""", """controllers.SuperController.eliminarUsuarios"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:14
  private[this] lazy val controllers_Assets_versioned0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned0_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_SuperController_indice1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_SuperController_indice1_invoker = createInvoker(
    SuperController_1.indice,
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

  // @LINE:18
  private[this] lazy val controllers_SuperController_mostrarUsuarios2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios")))
  )
  private[this] lazy val controllers_SuperController_mostrarUsuarios2_invoker = createInvoker(
    SuperController_1.mostrarUsuarios,
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

  // @LINE:20
  private[this] lazy val controllers_SuperController_adicionarUsuario3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("agregarUsuario/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("nombre", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SuperController_adicionarUsuario3_invoker = createInvoker(
    SuperController_1.adicionarUsuario(fakeValue[Int], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "adicionarUsuario",
      Seq(classOf[Int], classOf[String]),
      "GET",
      this.prefix + """agregarUsuario/""" + "$" + """id<[^/]+>/""" + "$" + """nombre<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_SuperController_eliminarUsuario4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eliminarUsuario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SuperController_eliminarUsuario4_invoker = createInvoker(
    SuperController_1.eliminarUsuario(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "eliminarUsuario",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """eliminarUsuario/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_SuperController_agregarUsuariosRandom5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("agregarUsuariosRandom")))
  )
  private[this] lazy val controllers_SuperController_agregarUsuariosRandom5_invoker = createInvoker(
    SuperController_1.agregarUsuariosRandom,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SuperController",
      "agregarUsuariosRandom",
      Nil,
      "GET",
      this.prefix + """agregarUsuariosRandom""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_SuperController_eliminarUsuarios6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("eliminarUsuarios")))
  )
  private[this] lazy val controllers_SuperController_eliminarUsuarios6_invoker = createInvoker(
    SuperController_1.eliminarUsuarios,
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


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:14
    case controllers_Assets_versioned0_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned0_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:16
    case controllers_SuperController_indice1_route(params) =>
      call { 
        controllers_SuperController_indice1_invoker.call(SuperController_1.indice)
      }
  
    // @LINE:18
    case controllers_SuperController_mostrarUsuarios2_route(params) =>
      call { 
        controllers_SuperController_mostrarUsuarios2_invoker.call(SuperController_1.mostrarUsuarios)
      }
  
    // @LINE:20
    case controllers_SuperController_adicionarUsuario3_route(params) =>
      call(params.fromPath[Int]("id", None), params.fromPath[String]("nombre", None)) { (id, nombre) =>
        controllers_SuperController_adicionarUsuario3_invoker.call(SuperController_1.adicionarUsuario(id, nombre))
      }
  
    // @LINE:22
    case controllers_SuperController_eliminarUsuario4_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_SuperController_eliminarUsuario4_invoker.call(SuperController_1.eliminarUsuario(id))
      }
  
    // @LINE:24
    case controllers_SuperController_agregarUsuariosRandom5_route(params) =>
      call { 
        controllers_SuperController_agregarUsuariosRandom5_invoker.call(SuperController_1.agregarUsuariosRandom)
      }
  
    // @LINE:26
    case controllers_SuperController_eliminarUsuarios6_route(params) =>
      call { 
        controllers_SuperController_eliminarUsuarios6_invoker.call(SuperController_1.eliminarUsuarios)
      }
  }
}
