
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object usuarios extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[UsuarioEntity],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuarios: List[UsuarioEntity]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""
"""),_display_(/*2.2*/plantilla("Usuarios")/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
    """),format.raw/*3.5*/("""<div class="tabla">
        <div class="cabecera">
            <a class="btn btn-primary btn-block" href=""""),_display_(/*5.57*/routes/*5.63*/.SuperController.adicionarUsuario()),format.raw/*5.98*/("""">Agregar usuario</a>
        </div>
        <div class="filas">
            """),_display_(/*8.14*/for(usuario <- usuarios) yield /*8.38*/{_display_(Seq[Any](format.raw/*8.39*/("""
                """),format.raw/*9.17*/("""<div class="fila-usuario">
                    <a class="usuario" href=""""),_display_(/*10.47*/routes/*10.53*/.SuperController.iniciarSesion(usuario.getcId())),format.raw/*10.101*/("""">"""),_display_(/*10.104*/usuario/*10.111*/.getdNombre()),format.raw/*10.124*/("""</a>
                    <a class="btn btn-info" href=""""),_display_(/*11.52*/routes/*11.58*/.SuperController.editarUsuario(usuario.getcId())),format.raw/*11.106*/("""">Editar</a>
                    <a class="btn btn-danger" onclick="deleteRequest("""),_display_(/*12.71*/usuario/*12.78*/.getcId()),format.raw/*12.87*/(""")" href="#">Eliminar</a>
                </div>
            """)))}),format.raw/*14.14*/("""
        """),format.raw/*15.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(usuarios:List[UsuarioEntity]): play.twirl.api.HtmlFormat.Appendable = apply(usuarios)

  def f:((List[UsuarioEntity]) => play.twirl.api.HtmlFormat.Appendable) = (usuarios) => apply(usuarios)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 12 11:22:07 COT 2017
                  SOURCE: /home/juan/Documentos/Play Java/Play-universidad/app/views/usuarios.scala.html
                  HASH: 3cbe239877dfecbb3370654fec8422aab2de73a5
                  MATRIX: 964->1|1090->32|1117->34|1146->55|1184->56|1215->61|1348->168|1362->174|1417->209|1521->287|1560->311|1598->312|1642->329|1742->402|1757->408|1827->456|1858->459|1875->466|1910->479|1993->535|2008->541|2078->589|2188->672|2204->679|2234->688|2326->749|2362->758
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|37->5|37->5|37->5|40->8|40->8|40->8|41->9|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|46->14|47->15
                  -- GENERATED --
              */
          