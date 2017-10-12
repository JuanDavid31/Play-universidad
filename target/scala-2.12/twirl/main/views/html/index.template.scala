
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<!-- http://paletton.com/#uid=52T0u0kkzlza5w8flqFpmgEuRbg -->
"""),_display_(/*3.2*/plantilla("App")/*3.18*/{_display_(Seq[Any](format.raw/*3.19*/("""
    """),format.raw/*4.5*/("""<div id="main">
        <a href=""""),_display_(/*5.19*/routes/*5.25*/.SuperController.mostrarUsuarios()),format.raw/*5.59*/("""">
            <div class="carta">
                <i class="fa fa-user fa-5x" ></i>
                <h1>Usuarios</h1>
            </div>
        </a>
        <a href=""""),_display_(/*11.19*/routes/*11.25*/.SuperController.mostrarCanciones()),format.raw/*11.60*/("""">
            <div class="carta">
                <i class="fa fa-music fa-5x" ></i>
                <h1>Canciones</h1>
            </div>
        </a>
    </div>
""")))}))
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
                  SOURCE: /home/juan/Documentos/Play Java/Play-universidad/app/views/index.scala.html
                  HASH: 8a02637e284a5c153afecb9f4b225bb4a49c47e8
                  MATRIX: 941->1|1037->3|1064->4|1152->67|1176->83|1214->84|1245->89|1305->123|1319->129|1373->163|1569->332|1584->338|1640->373
                  LINES: 28->1|33->1|34->2|35->3|35->3|35->3|36->4|37->5|37->5|37->5|43->11|43->11|43->11
                  -- GENERATED --
              */
          