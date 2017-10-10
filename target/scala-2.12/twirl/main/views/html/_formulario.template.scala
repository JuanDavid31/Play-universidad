
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

object _formulario extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[UsuarioEntity],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formulario: Form[UsuarioEntity]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),_display_(/*3.2*/helper/*3.8*/.inputText(formulario("dNombre"))))
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
                  SOURCE: C:/Users/JuanDavid/Desktop/Play Java/Play-universidad/app/views/_formulario.scala.html
                  HASH: cd1315f0a6051a34337441fe8abecb0a8b531aaf
                  MATRIX: 967->1|1095->34|1125->39|1138->45
                  LINES: 28->1|33->1|35->3|35->3
                  -- GENERATED --
              */
          