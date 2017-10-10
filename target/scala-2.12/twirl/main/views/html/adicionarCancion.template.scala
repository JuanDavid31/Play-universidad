
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
                  DATE: Wed Oct 11 02:31:08 COT 2017
                  SOURCE: C:/Users/JuanDavid/Desktop/Play Java/Play-universidad/app/views/adicionarCancion.scala.html
                  HASH: b693f5b8b6ea79aac3924aa20acd6d479244278f
                  MATRIX: 952->1|1027->6|1071->3|1099->24|1137->54|1175->55|1207->61|1285->113|1299->119|1409->220|1448->221|1493->239|1655->370|1688->376|1727->385
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|38->6|39->7|43->11|44->12|45->13
                  -- GENERATED --
              */
          