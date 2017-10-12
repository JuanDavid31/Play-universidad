
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

object adicionarCancion extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.4*/("""
"""),_display_(/*3.2*/plantilla("Adicionar usuario")/*3.32*/{_display_(Seq[Any](format.raw/*3.33*/("""
    """),format.raw/*4.5*/("""<div>
        <h1>Subir canción</h1>
            """),_display_(/*6.14*/helper/*6.20*/.form(action = helper.CSRF(routes.SuperController.subirCancion()), 'enctype -> "multipart/form-data")/*6.121*/{_display_(Seq[Any](format.raw/*6.122*/("""
                """),format.raw/*7.17*/("""<input type="file" name="cancion">
                <p>
                <input type="submit">
                </p>
            """)))}),format.raw/*11.14*/("""
    """),format.raw/*12.5*/("""</div>
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 11 23:33:52 COT 2017
                  SOURCE: /home/juan/Documentos/Play Java/Play-universidad/app/views/adicionarCancion.scala.html
                  HASH: 3c2c74715dc0debe81edccc697e40fbd4d9cef60
                  MATRIX: 952->1|1027->5|1071->3|1098->22|1136->52|1174->53|1205->58|1281->108|1295->114|1405->215|1444->216|1488->233|1646->360|1678->365|1716->373
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|38->6|39->7|43->11|44->12|45->13
                  -- GENERATED --
              */
          