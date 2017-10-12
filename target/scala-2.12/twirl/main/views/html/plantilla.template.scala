
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

object plantilla extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(titulo: String)(cuerpo: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""


"""),format.raw/*4.1*/("""<html>
    <head>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*6.54*/routes/*6.60*/.Assets.versioned("stylesheets/font-awesome-4.7.0/css/font-awesome.min.css")),format.raw/*6.136*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("stylesheets/bootstrap-4.0.0-beta-dist/css/bootstrap.min.css")),format.raw/*7.140*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.versioned("javascripts/jquery-3.2.1.js")),format.raw/*9.77*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.versioned("javascripts/main.js")),format.raw/*10.69*/("""" type="text/javascript"></script>
        <title>"""),_display_(/*11.17*/titulo),format.raw/*11.23*/("""</title>
    </head>
    <body>
        <div class="alert alert-success">
            <Strong>"""),_display_(/*15.22*/SuperController/*15.37*/.darSesionActual()),format.raw/*15.55*/("""</Strong>
            <a href=""""),_display_(/*16.23*/routes/*16.29*/.SuperController.cerrarSesion()),format.raw/*16.60*/("""">
                <button type="button" class="close" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </a>
        </div>          
        """),_display_(/*22.10*/cuerpo),format.raw/*22.16*/("""
    """),format.raw/*23.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(titulo:String,cuerpo:Html): play.twirl.api.HtmlFormat.Appendable = apply(titulo)(cuerpo)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (titulo) => (cuerpo) => apply(titulo)(cuerpo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 12 01:00:06 COT 2017
                  SOURCE: /home/juan/Documentos/Play Java/Play-universidad/app/views/plantilla.scala.html
                  HASH: d96dbddd4ee2090104e5c3afce7a8413508aa5b4
                  MATRIX: 957->1|1082->31|1111->34|1208->105|1222->111|1319->187|1401->243|1415->249|1516->329|1598->385|1612->391|1674->432|1725->457|1739->463|1807->511|1891->568|1906->574|1967->614|2045->665|2072->671|2194->766|2218->781|2257->799|2316->831|2331->837|2383->868|2622->1080|2649->1086|2681->1091
                  LINES: 28->1|33->1|36->4|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|47->15|47->15|47->15|48->16|48->16|48->16|54->22|54->22|55->23
                  -- GENERATED --
              */
          