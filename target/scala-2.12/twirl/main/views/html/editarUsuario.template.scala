
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

object editarUsuario extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UsuarioEntity],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formulario: Form[UsuarioEntity]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*3.2*/import views.html._formulario


Seq[Any](format.raw/*1.35*/("""
"""),_display_(/*4.2*/plantilla("Editar usuario")/*4.29*/{_display_(Seq[Any](format.raw/*4.30*/("""
    """),format.raw/*5.5*/("""<div id="div-editar">
        <h1>Editar usuario</h1>
        """),_display_(/*7.10*/helper/*7.16*/.form(action = helper.CSRF(routes.SuperController.actualizarUsuario(formulario.get().getcId())))/*7.112*/{_display_(Seq[Any](format.raw/*7.113*/("""
            """),_display_(/*8.14*/_formulario(formulario)),format.raw/*8.37*/("""
            """),format.raw/*9.13*/("""<input class="btn btn-primary btn-block" type="submit" value="Actualizar">
        """)))}),format.raw/*10.10*/("""
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
                  SOURCE: /home/juan/Documentos/Play Java/Play-universidad/app/views/editarUsuario.scala.html
                  HASH: 4bfb9068efdd0e17b194644e42228020f941d315
                  MATRIX: 969->1|1075->36|1098->53|1157->34|1184->84|1219->111|1257->112|1288->117|1377->180|1391->186|1496->282|1535->283|1575->297|1618->320|1658->333|1773->417|1805->422
                  LINES: 28->1|31->2|32->3|35->1|36->4|36->4|36->4|37->5|39->7|39->7|39->7|39->7|40->8|40->8|41->9|42->10|43->11
                  -- GENERATED --
              */
          