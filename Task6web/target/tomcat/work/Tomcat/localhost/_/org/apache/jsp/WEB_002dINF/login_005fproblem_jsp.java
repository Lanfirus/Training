/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-03-19 11:02:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005fproblem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Login_error Form</title>\r\n");
      out.write("    <style>\r\n");
      out.write("    *:focus {outline: none;}\r\n");
      out.write("\r\n");
      out.write("   ::-webkit-input-placeholder {\r\n");
      out.write("    color: blue;\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write("   body {font: 14px/21px \"Lucida Sans\", \"Lucida Grande\", \"Lucida Sans Unicode\", sans-serif;}\r\n");
      out.write(".contact_form h2, .contact_form label {font-family:Georgia, Times, \"Times New Roman\", serif;}\r\n");
      out.write(".form_hint, .required_notification {font-size: 11px;}\r\n");
      out.write("\r\n");
      out.write(".contact_form ul {\r\n");
      out.write(" width:750px;\r\n");
      out.write(" list-style-type:none;\r\n");
      out.write(" list-style-position:outside;\r\n");
      out.write(" margin:0px;\r\n");
      out.write(" padding:0px;\r\n");
      out.write("}\r\n");
      out.write(".contact_form li{\r\n");
      out.write(" padding:12px;\r\n");
      out.write(" border-bottom:1px solid #eee;\r\n");
      out.write(" position:relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".contact_form li:first-child, .contact_form li:last-child {\r\n");
      out.write(" border-bottom:1px solid #777;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".contact_form h2 {\r\n");
      out.write(" margin:0;\r\n");
      out.write(" display: inline;\r\n");
      out.write("}\r\n");
      out.write(".required_notification {\r\n");
      out.write(" color:#d45252;\r\n");
      out.write(" margin:5px 0 0 0;\r\n");
      out.write(" display:inline;\r\n");
      out.write(" float:right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".contact_form label {\r\n");
      out.write(" width:150px;\r\n");
      out.write(" margin-top: 3px;\r\n");
      out.write(" display:inline-block;\r\n");
      out.write(" float:left;\r\n");
      out.write(" padding:3px;\r\n");
      out.write("}\r\n");
      out.write(".contact_form input {\r\n");
      out.write(" height:20px;\r\n");
      out.write(" width:220px;\r\n");
      out.write(" padding:5px 8px;\r\n");
      out.write("}\r\n");
      out.write(".contact_form textarea {padding:8px; width:300px;}\r\n");
      out.write(".contact_form button {margin-left:156px;}\r\n");
      out.write("\r\n");
      out.write(".contact_form input, .contact_form textarea {\r\n");
      out.write(" border:1px solid #aaa;\r\n");
      out.write(" box-shadow: 0px 0px 3px #ccc, 0 10px 15px #eee inset;\r\n");
      out.write(" border-radius:2px;\r\n");
      out.write("}\r\n");
      out.write(".contact_form input:focus, .contact_form textarea:focus {\r\n");
      out.write(" background: #fff;\r\n");
      out.write(" border:1px solid #555;\r\n");
      out.write(" box-shadow: 0 0 3px #aaa;\r\n");
      out.write(" padding-right:70px;\r\n");
      out.write("  -moz-transition: padding .25s;\r\n");
      out.write(" -webkit-transition: padding .25s;\r\n");
      out.write(" -o-transition: padding .25s;\r\n");
      out.write(" transition: padding .25s;\r\n");
      out.write("}\r\n");
      out.write("/* Button Style */\r\n");
      out.write("button.submit {\r\n");
      out.write(" background-color: #68b12f;\r\n");
      out.write(" background: -webkit-gradient(linear, left top, left bottom, from(#68b12f), to(#50911e));\r\n");
      out.write(" background: -webkit-linear-gradient(top, #68b12f, #50911e);\r\n");
      out.write(" background: -moz-linear-gradient(top, #68b12f, #50911e);\r\n");
      out.write(" background: -ms-linear-gradient(top, #68b12f, #50911e);\r\n");
      out.write(" background: -o-linear-gradient(top, #68b12f, #50911e);\r\n");
      out.write(" background: linear-gradient(top, #68b12f, #50911e);\r\n");
      out.write(" border: 1px solid #509111;\r\n");
      out.write(" border-bottom: 1px solid #5b992b;\r\n");
      out.write(" border-radius: 3px;\r\n");
      out.write(" -webkit-border-radius: 3px;\r\n");
      out.write(" -moz-border-radius: 3px;\r\n");
      out.write(" -ms-border-radius: 3px;\r\n");
      out.write(" -o-border-radius: 3px;\r\n");
      out.write(" box-shadow: inset 0 1px 0 0 #9fd574;\r\n");
      out.write(" -webkit-box-shadow: 0 1px 0 0 #9fd574 inset ;\r\n");
      out.write(" -moz-box-shadow: 0 1px 0 0 #9fd574 inset;\r\n");
      out.write(" -ms-box-shadow: 0 1px 0 0 #9fd574 inset;\r\n");
      out.write(" -o-box-shadow: 0 1px 0 0 #9fd574 inset;\r\n");
      out.write(" color: white;\r\n");
      out.write(" font-weight: bold;\r\n");
      out.write(" padding: 6px 20px;\r\n");
      out.write(" text-align: center;\r\n");
      out.write(" text-shadow: 0 -1px 0 #396715;\r\n");
      out.write("}\r\n");
      out.write("button.submit:hover {\r\n");
      out.write(" opacity:.85;\r\n");
      out.write(" cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("button.submit:active {\r\n");
      out.write(" border: 1px solid #20911e;\r\n");
      out.write(" box-shadow: 0 0 10px 5px #356b0b inset;\r\n");
      out.write(" -webkit-box-shadow:0 0 10px 5px #356b0b inset ;\r\n");
      out.write(" -moz-box-shadow: 0 0 10px 5px #356b0b inset;\r\n");
      out.write(" -ms-box-shadow: 0 0 10px 5px #356b0b inset;\r\n");
      out.write(" -o-box-shadow: 0 0 10px 5px #356b0b inset;\r\n");
      out.write("}\r\n");
      out.write(".contact_form input, .contact_form textarea {\r\n");
      out.write(" padding-right:30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".contact_form input:focus:invalid, .contact_form textarea:focus:invalid { /* when a field is considered invalid by the browser */\r\n");
      out.write(" box-shadow: 0 0 5px #d45252;\r\n");
      out.write(" border-color: #b03535\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".contact_form input:required:valid, .contact_form textarea:required:valid { /* when a field is considered valid by the browser */\r\n");
      out.write(" box-shadow: 0 0 5px #5cd053;\r\n");
      out.write(" border-color: #28921f;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form_hint {\r\n");
      out.write(" background: #d45252;\r\n");
      out.write(" border-radius: 3px 3px 3px 3px;\r\n");
      out.write(" color: white;\r\n");
      out.write(" margin-left:8px;\r\n");
      out.write(" padding: 1px 6px;\r\n");
      out.write(" z-index: 999; /* hints stay above all other elements */\r\n");
      out.write(" position: absolute; /* allows proper formatting if hint is two lines */\r\n");
      out.write(" display: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form_hint::before {\r\n");
      out.write(" content: \"\\25C0\"; /* треугольник, указующий влево, в  escaped unicode */\r\n");
      out.write(" color:#d45252;\r\n");
      out.write(" position: absolute;\r\n");
      out.write(" top:1px;\r\n");
      out.write(" left:-6px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".contact_form input:focus + .form_hint {display: inline;}\r\n");
      out.write(".contact_form input:required:valid + .form_hint {background: #28921f;} /* change form hint color when valid */\r\n");
      out.write(".contact_form input:required:valid + .form_hint::before {color:#28921f;} /* change form hint arrow color when valid */\r\n");
      out.write("  </style>\r\n");
      out.write("    <link rel=\"stylesheet\" media=\"screen\" href=\"styles.css\" >\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form class=\"contact_form\" action=\"register\" method=\"post\" name=\"contact_form\">\r\n");
      out.write("\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li>\r\n");
      out.write("            <h2>Registration form</h2>\r\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${test}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("        </li>\r\n");
      out.write("<li>\r\n");
      out.write("            <h2>Problem with login</h2>\r\n");
      out.write("</li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <label for=\"surname\">Surname:</label>\r\n");
      out.write("            <input type=\"text\" name=\"surname\" placeholder=\"Ivan\" required value=");
      out.print( request.getAttribute("surnameUser"));
      out.write("\r\n");
      out.write("                            pattern=\"^(?!.*?([ `'\\-]{2,}|[A-Z]{2,}|[A-Z `'\\-]$))[A-Z]{1}[a-z\\- '`A-Z]+$\"/>\r\n");
      out.write("            <span class=\"form_hint\">Please, enter Surname. It should begin from capital letter and have at least one letter.\r\n");
      out.write("                                                Allowed characters: Latin alphabet and special characters [- ']. Surname can't begin from special\r\n");
      out.write("                                                character. It also can't end on special character or capital letter. Surname can't have two or more\r\n");
      out.write("                                                consecutive special characters or capital letters.</span>\r\n");
      out.write("\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("        <li>\r\n");
      out.write("            <label for=\"name\">Name:</label>\r\n");
      out.write("            <input type=\"text\" name=\"name\" placeholder=\"Ivan\" required value=");
      out.print( request.getAttribute("nameUser"));
      out.write("\r\n");
      out.write("                        pattern=\"^(?!.*?([ `'\\-]{2,}|[A-Z]{2,}|[A-Z `'\\-]$))[A-Z]{1}[a-z\\- '`A-Z]+$\"/>\r\n");
      out.write("            <span class=\"form_hint\">Please, enter Name. It should begin from capital letter and have at least one letter.\r\n");
      out.write("                                    Allowed characters: Latin alphabet and special characters [- ']. Name can't begin from special\r\n");
      out.write("                                    character. It also can't end on special character or capital letter. Name can't have two or more\r\n");
      out.write("                                    consecutive special characters or capital letters.</span>\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("        <li>\r\n");
      out.write("            <label for=\"patronymic\">Patronymic:</label>\r\n");
      out.write("            <input type=\"text\" name=\"patronymic\" placeholder=\"Ivanovich\" value=\"");
      out.print( request.getAttribute("patronymicUser"));
      out.write("\"\r\n");
      out.write("                    pattern=\"^(?!.*?([ `'\\-]{2,}|[A-Z]{2,}|[A-Z `'\\-]$))[A-Z]{1}[a-z\\- '`A-Z]+|$\"/>\r\n");
      out.write("            <span class=\"form_hint\">Please, enter Patronymic. It should begin from capital letter and have at least one letter.\r\n");
      out.write("                                    Allowed characters: Latin alphabet and special characters [- ']. Surname can't begin from special\r\n");
      out.write("                                    character. It also can't end on special character or capital letter. Surname can't have two or more\r\n");
      out.write("                                    consecutive special characters or capital letters. There could be no patronymic.</span>\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("        <li>\r\n");
      out.write("            <label for=\"login\">Login:</label>\r\n");
      out.write("            <input type=\"text\" name=\"login\" placeholder=\"login\" required value=");
      out.print( request.getAttribute("loginUser"));
      out.write("\r\n");
      out.write("                    pattern=\"^(?!");
      out.print( request.getAttribute("loginUser"));
      out.write(").+\"/>\r\n");
      out.write("            <span class=\"form_hint\">Please, enter login that is differ from this one!. This login has been already used\r\n");
      out.write("                    in our system by someone else. It should have at least one symbol. All symbols are allowed.</span>\r\n");
      out.write("                    <p>Warning: You have to choose another login!</p>\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("        <li>\r\n");
      out.write("            <label for=\"comment\">Comment:</label>\r\n");
      out.write("            <input type=\"text\" name=\"comment\" placeholder=\"Any comment\" required value=");
      out.print( request.getAttribute("commentUser"));
      out.write("\r\n");
      out.write("                    pattern=\".+\"/>\r\n");
      out.write("            <span class=\"form_hint\">Please, enter comment. It should have at least one symbol. All symbols are allowed.</span>\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("        <li>\r\n");
      out.write("            <label for=\"homephonenumber\">Home phone number:</label>\r\n");
      out.write("            <input type=\"text\" name=\"homephonenumber\" placeholder=\"380441234567\" required\r\n");
      out.write("            value=");
      out.print( request.getAttribute("homephonenumberUser"));
      out.write(" pattern=\"^(?:380\\d{9}|\\d{10,12})$\"/>\r\n");
      out.write("            <span class=\"form_hint\">Please, enter home phone number. It should be a set from 10, 11 or 12 digits.\r\n");
      out.write("                                    For example, 380441234567.</span>\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("        <li>\r\n");
      out.write("            <label for=\"mobilephonenumber\">Mobile phone number:</label>\r\n");
      out.write("            <input type=\"text\" name=\"mobilephonenumber\" placeholder=\"380501234567\" required\r\n");
      out.write("                    value=");
      out.print( request.getAttribute("mobilehonenumberUser"));
      out.write(" pattern=\"^(?:380\\d{9}|\\d{10,12})$\"/>\r\n");
      out.write("            <span class=\"form_hint\">Please, enter mobile phone number. It should be a set from 10, 11 or 12 digits.\r\n");
      out.write("                                    For example, 380501234567.</span>\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("        <li>\r\n");
      out.write("            <label for=\"email\">Email:</label>\r\n");
      out.write("            <input type=\"text\" name=\"email\" placeholder=\"email@email.com\" required value=");
      out.print( request.getAttribute("emailUser"));
      out.write("\r\n");
      out.write("                    pattern=\"^(?!.*?[._\\-]{2,})[a-zA-Z0-9]{1}[a-zA-Z0-9._\\-]{0,62}[a-zA-Z0-9]?@{1}(?!.{256,})([a-zA-Z0-9]{1}[a-zA-Z0-9._\\-]{1,254}[a-zA-Z0-9]{1}|\\[{1}\\d{1,3}\\.{1}\\d{1,3}\\.{1}\\d{1,3}\\.{1}\\d{1,3}\\]{1})$\"/>\r\n");
      out.write("            <span class=\"form_hint\">Please, enter email. First part (before @) could have length from 1 to 64 characters.\r\n");
      out.write("                                    It can consist of Latin alphabet's characters and special characters [._-]. This part can't begin or end\r\n");
      out.write("                                    from special character. Two or more consecutive special characters are not allowed.\r\n");
      out.write("                                    Second part (after @) could have length from 3 to 254 characters, consist of characters of Latin alphabet\r\n");
      out.write("                                    digits and special characters [.-]. This part can't begin or end from special character\r\n");
      out.write("                                    Two or more consecutive special characters are not allowed.\r\n");
      out.write("                                    It's allowed to use IP-address as a second part of email. For example, [128.0.0.1]</span>\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("        <li>\r\n");
      out.write("            <button class=\"submit\" type=\"submit\">Submit Form</button>\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
