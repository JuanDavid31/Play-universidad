
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
                  DATE: Tue Oct 10 19:14:46 COT 2017
                  SOURCE: C:/Users/JuanDavid/Desktop/Play Java/Play-universidad/app/views/adicionarUsuario.scala.html
                  HASH: 437987238a8a2bc89655e84030e4572efeb9408e
                  MATRIX: 972->1|1078->37|1101->55|1160->34|1188->87|1226->117|1264->118|1296->124|1376->178|1390->184|1469->255|1507->256|1552->275|1595->298|1640->316|1757->402|1790->408
                  LINES: 28->1|31->2|32->3|35->1|36->4|36->4|36->4|37->5|39->7|39->7|39->7|39->7|40->8|40->8|41->9|42->10|43->11
                  -- GENERATED --
              */
          