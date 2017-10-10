
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
                """),format.raw/*9.17*/("""<div class="fila">
                    <a href=""""),_display_(/*10.31*/routes/*10.37*/.SuperController.iniciarSesion(usuario.getcId())),format.raw/*10.85*/("""">"""),_display_(/*10.88*/usuario/*10.95*/.getdNombre()),format.raw/*10.108*/("""</a>
                    <a class="btn btn-info" href=""""),_display_(/*11.52*/routes/*11.58*/.SuperController.editarUsuario(usuario.getcId())),format.raw/*11.106*/("""">Editar</a>
                    <a class="btn btn-danger" href=""""),_display_(/*12.54*/routes/*12.60*/.SuperController.eliminarUsuario(usuario.getcId())),format.raw/*12.110*/("""">Eliminar</a>
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
                  DATE: Tue Oct 10 19:14:46 COT 2017
                  SOURCE: C:/Users/JuanDavid/Desktop/Play Java/Play-universidad/app/views/usuarios.scala.html
                  HASH: bfb1a0b830b16a74419bd37e6871d01b14909dd8
                  MATRIX: 964->1|1090->32|1118->35|1147->56|1185->57|1217->63|1352->172|1366->178|1421->213|1528->294|1567->318|1605->319|1650->337|1727->387|1742->393|1811->441|1841->444|1857->451|1892->464|1976->521|1991->527|2061->575|2155->642|2170->648|2242->698|2326->751|2363->761
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|37->5|37->5|37->5|40->8|40->8|40->8|41->9|42->10|42->10|42->10|42->10|42->10|42->10|43->11|43->11|43->11|44->12|44->12|44->12|46->14|47->15
                  -- GENERATED --
              */
          