/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-12-02 13:25:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.project;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	function checkLogin() {\r\n");
      out.write("		var form = document.Signup;\r\n");
      out.write("		\r\n");
      out.write("		var id = form.id.value\r\n");
      out.write("		var name = form.name.value\r\n");
      out.write("		var pw = form.password.value\r\n");
      out.write("		var repw = form.repassword.value\r\n");
      out.write("	\r\n");
      out.write("		\r\n");
      out.write("		if (id === \"\") {\r\n");
      out.write("			alert(\"아이디 칸이 비어있습니다.\");\r\n");
      out.write("			form.id.select();\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		if (name === \"\") {\r\n");
      out.write("			alert(\"이름 칸이 비어있습니다.\");\r\n");
      out.write("			form.name.select();\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		if (pw === \"\") {\r\n");
      out.write("			alert(\"비밀번호 칸이 비어있습니다.\");\r\n");
      out.write("			form.password.select();\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		if (repw === \"\") {\r\n");
      out.write("			alert(\"비밀번호 확인 칸이 비어있습니다.\");\r\n");
      out.write("			form.repassword.select();\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		if (pw != repw) {\r\n");
      out.write("			alert(\"비밀번호와 확인 칸이 다릅니다.\");\r\n");
      out.write("			form.repassword.select();\r\n");
      out.write("			return;\r\n");
      out.write("		}\r\n");
      out.write("		form.submit();\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<body style=\"background-color: #ededed;\">\r\n");
      out.write("   <div class=\"loginbox\" style=\" width: 780px; height: 450px; margin: 0 auto; \">\r\n");
      out.write("      <h2 style=\"width: 100%; height: 100px; line-height: 100px; text-align: center; font-size: 30px; font-weight: normal;\">회원가입</h2>\r\n");
      out.write("      <form action=\"/jspbook/SignUpServlet\" name=\"Signup\" style=\" width: 100%; height: 700px; background-color: #fff;  padding: 50px; box-sizing: border-box; border-radius: 50px\">\r\n");
      out.write("         <fieldset style=\"border: none;\">\r\n");
      out.write("            <legend style=\"position: absolute; left: -999em; \">로그인 구역</legend>\r\n");
      out.write("            <label for=\"loginid\" style=\" display: block; font-size: 18px; color: #333; margin-bottom: 10px; margin-top: 25px\">이름</label>\r\n");
      out.write("            <input type=\"text\" id=\"name\" name=\"name\" placeholder=\"이름을 입력하시오.\" style=\"display: block; width: 100%; height: 50px; margin-bottom: 30px; border: none; background-color: #ededed; padding: 0 20px; box-sizing: border-box;\">\r\n");
      out.write("            <label for=\"loginid\" style=\" display: block; font-size: 18px; color: #333; margin-bottom: 10px; margin-top: 25px\">아이디</label>\r\n");
      out.write("            <input type=\"text\" id=\"id\" name=\"id\" placeholder=\"아이디를 입력하시오.\" style=\"display: block; width: 100%; height: 50px; margin-bottom: 30px; border: none; background-color: #ededed; padding: 0 20px; box-sizing: border-box;\">\r\n");
      out.write("            <label for=\"loginid\" style=\" display: block; font-size: 18px; color: #333; margin-bottom: 10px; margin-top: 25px\">비밀번호</label>\r\n");
      out.write("            <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"비밀번호를 입력하시오.\" style=\"display: block; width: 100%; height: 50px; margin-bottom: 30px; border: none; background-color: #ededed; padding: 0 20px; box-sizing: border-box;\">\r\n");
      out.write("            <label for=\"loginpw\" style=\"display: block; font-size: 18px; color: #333; margin-bottom: 10px;\">비밀번호 확인</label>\r\n");
      out.write("            <input type=\"password\" id=\"repassword\" name=\"repassword\" placeholder=\"비밀번호를 다시 한번 입력하시오.\" style=\"display: block; width: 100%; height: 50px; margin-bottom: 50px; border: none; background-color: #ededed; padding: 0 20px; box-sizing: border-box;\">\r\n");
      out.write("            <input type=\"button\" onclick=\"checkLogin()\" value=\"회원가입\"style=\"cursor: pointer; display: block; width: 220px; height: 50px; margin: 0 auto; border: none; border-radius: 30px; background-color: #ffd400; color: #000000; font-size: 14px; font-weight: bold;\">\r\n");
      out.write("            \r\n");
      out.write("         </fieldset>\r\n");
      out.write("      </form>\r\n");
      out.write("   </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
