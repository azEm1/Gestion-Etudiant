package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import metier.Administrateur;

public final class gestionCours_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("            <style type=\"text/css\">\n");
      out.write("            \n");
      out.write("   \n");
      out.write("body {\n");
      out.write("    background-image: url('az.jpg');\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write("               .myButton {\n");
      out.write("\t-moz-box-shadow: 0px 0px 0px 2px #9fb4f2;\n");
      out.write("\t-webkit-box-shadow: 0px 0px 0px 2px #9fb4f2;\n");
      out.write("\tbox-shadow: 0px 0px 0px 2px #9fb4f2;\n");
      out.write("\tbackground:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #7892c2), color-stop(1, #476e9e));\n");
      out.write("\tbackground:-moz-linear-gradient(top, #7892c2 5%, #476e9e 100%);\n");
      out.write("\tbackground:-webkit-linear-gradient(top, #7892c2 5%, #476e9e 100%);\n");
      out.write("\tbackground:-o-linear-gradient(top, #7892c2 5%, #476e9e 100%);\n");
      out.write("\tbackground:-ms-linear-gradient(top, #7892c2 5%, #476e9e 100%);\n");
      out.write("\tbackground:linear-gradient(to bottom, #7892c2 5%, #476e9e 100%);\n");
      out.write("\tfilter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#7892c2', endColorstr='#476e9e',GradientType=0);\n");
      out.write("\tbackground-color:#7892c2;\n");
      out.write("\t-moz-border-radius:10px;\n");
      out.write("\t-webkit-border-radius:10px;\n");
      out.write("\tborder-radius:10px;\n");
      out.write("\tborder:1px solid #4e6096;\n");
      out.write("\tdisplay:inline-block;\n");
      out.write("\tcursor:pointer;\n");
      out.write("\tcolor:#ffffff;\n");
      out.write("\tfont-family:Arial;\n");
      out.write("\tfont-size:19px;\n");
      out.write("\tpadding:12px 37px;\n");
      out.write("\ttext-decoration:none;\n");
      out.write("\ttext-shadow:0px 1px 0px #283966;\n");
      out.write("}\n");
      out.write("  .fieldset-auto-width {\n");
      out.write("         display: inline-block;\n");
      out.write("          \n");
      out.write("    }\n");
      out.write("    .hide {\n");
      out.write("        display:none;\n");
      out.write("         }\n");
      out.write("         \n");
      out.write(".myButton:hover {\n");
      out.write("\tbackground:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #476e9e), color-stop(1, #7892c2));\n");
      out.write("\tbackground:-moz-linear-gradient(top, #476e9e 5%, #7892c2 100%);\n");
      out.write("\tbackground:-webkit-linear-gradient(top, #476e9e 5%, #7892c2 100%);\n");
      out.write("\tbackground:-o-linear-gradient(top, #476e9e 5%, #7892c2 100%);\n");
      out.write("\tbackground:-ms-linear-gradient(top, #476e9e 5%, #7892c2 100%);\n");
      out.write("\tbackground:linear-gradient(to bottom, #476e9e 5%, #7892c2 100%);\n");
      out.write("\tfilter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#476e9e', endColorstr='#7892c2',GradientType=0);\n");
      out.write("\tbackground-color:#476e9e;\n");
      out.write("}\n");
      out.write(".myButton:active {\n");
      out.write("\tposition:relative;\n");
      out.write("\ttop:1px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <title>Gestion de Cours </title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("  \n");
      out.write("        \n");
      out.write("\n");
      out.write("   \n");
      out.write("    <center><h1>  <font> \n");
      out.write("             <font color=\"#285c82\">\n");
      out.write("           Gestion des Cours      \n");
      out.write("           \n");
      out.write("      </font>\n");
      out.write("</h1>\n");
      out.write("      <br>\n");
      out.write("     \n");
      out.write("      <img src=\"book.png\" width=\"100\" height=\"100\"/>\n");
      out.write("    \n");
      out.write("    <br> <br> \n");
      out.write("      <input type=\"submit\"     value=\" Ajouter Cours \" class=\"myButton\" onclick=\"myfun2()\"/>\n");
      out.write("      <br> <br><input type=\"button\" value=\"Supprimer Cours\" class=\"myButton\" onclick=\"myfun1()\"/>\n");
      out.write("     \n");
      out.write("          <script>\n");
      out.write("          function myfun1(){\n");
      out.write("              \n");
      out.write("              document.getElementById(\"fieldset1\").className = \"fieldset-auto-width\";\n");
      out.write("              \n");
      out.write("          }\n");
      out.write("          \n");
      out.write("      </script>   <br> <br><input type=\"button\" value=\"Rechercher Cours\" class=\"myButton\" onclick=\"myfun()\" />\n");
      out.write("                    <br> <br>\n");
      out.write("           <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/BienAdmin.jsp\"  class=\"myButton\">Retour</a>\n");
      out.write("      <script>\n");
      out.write("          function myfun2(){\n");
      out.write("              \n");
      out.write("              document.getElementById(\"fieldset2\").className = \"fieldset-auto-width\";\n");
      out.write("              \n");
      out.write("          }\n");
      out.write("          \n");
      out.write("      </script> \n");
      out.write("           <script>\n");
      out.write("          function myfun(){\n");
      out.write("              \n");
      out.write("              document.getElementById(\"fieldset\").className = \"fieldset-auto-width\";\n");
      out.write("              \n");
      out.write("          }\n");
      out.write("          \n");
      out.write("      </script>  \n");
      out.write("      <br><br>\n");
      out.write("      <fieldset id=\"fieldset\" class=\"hide\">\n");
      out.write("   \n");
      out.write("          <legend id=\"legend\">Vous avez selectioné : Recherche Cours</legend>\n");
      out.write("    <div id=\"placeholder\">\n");
      out.write("        <div id=\"template\">\n");
      out.write("  <form Action=\"/tpp/rechercheCours\" method=\"post\">\n");
      out.write("            <p>Recherche Par Nom : &nbsp; <input type =\"text\" size=\"25\" name=\"nom\" /><br /></p>   \n");
      out.write("        </div> <!-- template -->\n");
      out.write("    </div> <!-- placeholder -->\n");
      out.write("\n");
      out.write("    <button type=\"Submit\">Rechercher</button></p>\n");
      out.write("   </form>\n");
      out.write("      </fieldset>\n");
      out.write("      <fieldset id=\"fieldset1\" class=\"hide\">\n");
      out.write("   \n");
      out.write("          <legend id=\"legend\">Vous avez selectioné : Supprimer Cours</legend>\n");
      out.write("    <div id=\"placeholder\">\n");
      out.write("        <div id=\"template\">\n");
      out.write("  <form Action=\"/tpp/Servletsuppc\" method=\"post\">\n");
      out.write("            <p>Entrer le Nom du Cours à Supprimer: &nbsp; <input type =\"text\" size=\"25\" name=\"id\" /><br /></p>   \n");
      out.write("        </div> <!-- template -->\n");
      out.write("    </div> <!-- placeholder -->\n");
      out.write("\n");
      out.write("    <button type=\"Submit\">Supprimer</button></p>\n");
      out.write("   </form>\n");
      out.write("      </fieldset>  \n");
      out.write("    <fieldset id=\"fieldset2\" class=\"hide\">\n");
      out.write("   \n");
      out.write("          <legend id=\"legend\">Vous avez selectioné : Ajouter Cours</legend>\n");
      out.write("    <div id=\"placeholder\">\n");
      out.write("        <div id=\"template\">\n");
      out.write("  <form Action=\"/tpp/AddCours\" method=\"post\">\n");
      out.write("            <p>Entrer le Nom du Cours : &nbsp; <input type =\"text\" size=\"25\" name=\"id\" /><br /></p>   \n");
      out.write("              <p>Entrer la matiere du Cours : &nbsp; <input type =\"text\" size=\"25\" name=\"mat\" /><br /></p>  \n");
      out.write("                <p>Entrer l'heure du Cours : &nbsp; <input type =\"text\" size=\"25\" name=\"h\" /><br /></p>  \n");
      out.write("                  <p>Entrer la Salle du Cours : &nbsp; <input type =\"text\" size=\"25\" name=\"salle\" /><br /></p>  \n");
      out.write("                    <p>Entrer le Nom du Professeur du Cours : &nbsp; <input type =\"text\" size=\"25\" name=\"prof\" /><br /></p>  \n");
      out.write("                \n");
      out.write("        </div> <!-- template -->\n");
      out.write("    </div> <!-- placeholder -->\n");
      out.write("\n");
      out.write("    <button type=\"Submit\">Ajouter</button></p>\n");
      out.write("   </form>\n");
      out.write("      </fieldset>       \n");
      out.write("     \n");
      out.write("</center> \n");
      out.write("  \n");
      out.write("\n");
      out.write("  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
