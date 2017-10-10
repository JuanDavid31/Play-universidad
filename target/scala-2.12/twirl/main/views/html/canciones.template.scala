
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

object canciones extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[CancionEntity],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(canciones: List[CancionEntity]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*3.2*/plantilla("Canciones")/*3.24*/{_display_(Seq[Any](format.raw/*3.25*/("""
    """),format.raw/*4.5*/("""<div class="tabla">
        <div class="cabecera">
            <a class="btn btn-primary btn-block" href=""""),_display_(/*6.57*/routes/*6.63*/.SuperController.adicionarCancion()),format.raw/*6.98*/("""">Agregar cancion</a>
        </div>
        <div class="filas">
        """),_display_(/*9.10*/for(cancion <- canciones) yield /*9.35*/{_display_(Seq[Any](format.raw/*9.36*/("""
            """),format.raw/*10.13*/("""<div class="fila">
                <p>"""),_display_(/*11.21*/cancion/*11.28*/.getdNombre()),format.raw/*11.41*/("""</p>
                <audio src=""""),_display_(/*12.30*/cancion/*12.37*/.getdUri()),format.raw/*12.47*/("""" controls>
                    Your browser does not support audio.
                </audio>
                """),_display_(/*15.18*/helper/*15.24*/.form(action = helper.CSRF(routes.SuperController.eliminarCancion(cancion.getcId())))/*15.109*/{_display_(Seq[Any](format.raw/*15.110*/("""
                    """),format.raw/*16.21*/("""<input class="btn btn-danger" type="submit" value="Eliminar">
                """)))}),format.raw/*17.18*/("""
            """),format.raw/*18.13*/("""</div>
        """)))}),format.raw/*19.10*/("""
        """),format.raw/*20.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(canciones:List[CancionEntity]): play.twirl.api.HtmlFormat.Appendable = apply(canciones)

  def f:((List[CancionEntity]) => play.twirl.api.HtmlFormat.Appendable) = (canciones) => apply(canciones)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 11 02:31:08 COT 2017
                  SOURCE: C:/Users/JuanDavid/Desktop/Play Java/Play-universidad/app/views/canciones.scala.html
                  HASH: 731f0e9d1b47225cb84444d889dab1a89de3b8f9
                  MATRIX: 965->1|1070->36|1115->33|1143->54|1173->76|1211->77|1243->83|1378->192|1392->198|1447->233|1550->310|1590->335|1628->336|1670->350|1737->390|1753->397|1787->410|1849->445|1865->452|1896->462|2037->576|2052->582|2147->667|2187->668|2237->690|2348->770|2390->784|2438->801|2475->811
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|38->6|38->6|38->6|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|44->12|44->12|47->15|47->15|47->15|47->15|48->16|49->17|50->18|51->19|52->20
                  -- GENERATED --
              */
          