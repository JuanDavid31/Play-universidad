
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

object adicionarUsuario extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UsuarioEntity],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formulario: Form[UsuarioEntity]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*3.2*/import views.html._formulario


Seq[Any](format.raw/*1.35*/("""
"""),_display_(/*4.2*/plantilla("Adicionar usuario")/*4.32*/{_display_(Seq[Any](format.raw/*4.33*/("""
    """),format.raw/*5.5*/("""<div>
        <h1>Agregar usuario</h1>
            """),_display_(/*7.14*/helper/*7.20*/.form(action = helper.CSRF( routes.SuperController.guardarUsuario() ) )/*7.91*/{_display_(Seq[Any](format.raw/*7.92*/("""
                """),_display_(/*8.18*/_formulario(formulario)),format.raw/*8.41*/("""
                """),format.raw/*9.17*/("""<input class="btn btn-primary btn-block" type="submit" value="Guardar">
            """)))}),format.raw/*10.14*/("""
    """),format.raw/*11.5*/("""</div>
""")))}))
      }
    }
  }

  def render(formulario:Form[UsuarioEntity]): play.twirl.api.HtmlFormat.Appendable = apply(formulario)

  def f:((Form[UsuarioEntity]) => play.twirl.api.HtmlFormat.Appendable) = (formulario) => apply(formulario)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 11 23:33:52 COT 2017
                  SOURCE: /home/juan/Documentos/Play Java/Play-universidad/app/views/adicionarUsuario.scala.html
                  HASH: a54e4ef9629ab08bbc64bfc542f7bc3c0ddf0510
                  MATRIX: 972->1|1078->36|1101->53|1160->34|1187->84|1225->114|1263->115|1294->120|1372->172|1386->178|1465->249|1503->250|1547->268|1590->291|1634->308|1750->393|1782->398
                  LINES: 28->1|31->2|32->3|35->1|36->4|36->4|36->4|37->5|39->7|39->7|39->7|39->7|40->8|40->8|41->9|42->10|43->11
                  -- GENERATED --
              */
          