
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
        """),_display_(/*14.10*/cuerpo),format.raw/*14.16*/("""
    """),format.raw/*15.5*/("""</body>
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
                  DATE: Tue Oct 10 19:14:46 COT 2017
                  SOURCE: C:/Users/JuanDavid/Desktop/Play Java/Play-universidad/app/views/plantilla.scala.html
                  HASH: 1af2fdb1fb6f5eaa48891edaf2fceab6c10e6cf2
                  MATRIX: 957->1|1082->31|1114->37|1213->110|1227->116|1324->192|1407->249|1421->255|1522->335|1605->392|1619->398|1681->439|1733->465|1747->471|1815->519|1900->577|1915->583|1976->623|2055->675|2082->681|2153->725|2180->731|2213->737
                  LINES: 28->1|33->1|36->4|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|43->11|43->11|46->14|46->14|47->15
                  -- GENERATED --
              */
          