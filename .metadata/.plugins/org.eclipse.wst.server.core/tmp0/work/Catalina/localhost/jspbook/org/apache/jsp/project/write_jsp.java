/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-12-02 13:55:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.project;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- CSS only -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<!-- JavaScript Bundle with Popper -->\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel\"stylesheet\" href=\"resources/register/css\" type=\"text/css\"></link>\r\n");
      out.write("</head>\r\n");
      out.write("<script>\r\n");
      out.write("	\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("	");
	
	request.setCharacterEncoding("UTF-8");
	model.UserBean user = (model.UserBean) session.getAttribute("user"); 
	if(user != null) { 
		System.out.println("이름 : " + user.getUsername());
	}
	
      out.write("\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg bg-light\">\r\n");
      out.write("		<div class=\"container-fluid\" style=\"padding: 0.4erm\">\r\n");
      out.write("			<a class=\"navbar-brand\" href=\"Main.jsp\">Cafe</a>\r\n");
      out.write("			<button class=\"navbar-toggler\" type=\"button\"\r\n");
      out.write("				data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\"\r\n");
      out.write("				aria-controls=\"navbarNav\" aria-expanded=\"false\"\r\n");
      out.write("				aria-label=\"Toggle navigation\">\r\n");
      out.write("				<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("			</button>\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("				<ul class=\"navbar-nav\">\r\n");
      out.write("					");
 if (user == null) { 
      out.write("\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link active\"\r\n");
      out.write("						aria-current=\"page\" href=\"loginForm.jsp\">로그인 </a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"signup.jsp\">|\r\n");
      out.write("							회원가입</a></li>\r\n");
      out.write("					");
 } else { 
      out.write("\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link active\"\r\n");
      out.write("						aria-current=\"page\" href=\"/jspbook/LogOutServlet\">로그아웃</a></li>\r\n");
      out.write("					");
 } 
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<img src=\"./asset/banner.png\" alt=\"banner\"\r\n");
      out.write("		style=\"width: 100%; text-align: center;\">\r\n");
      out.write("	<hr\r\n");
      out.write("		style=\"width: 100%; height: 10px; border: none; background-color: white;\">\r\n");
      out.write("	<div style=\"display: flex\">\r\n");
      out.write("\r\n");
      out.write("		<div style=\"width: 30%;\">\r\n");
      out.write("			<div>\r\n");
      out.write("				<center>\r\n");
      out.write("					<hr\r\n");
      out.write("						style=\"width: 80%; height: 5px; border: none; background-color: yellow;\">\r\n");
      out.write("				</center>\r\n");
      out.write("				<hr\r\n");
      out.write("					style=\"width: 100%; height: 10px; border: none; background-color: white;\">\r\n");
      out.write("				<hr\r\n");
      out.write("					style=\"width: 100%; height: 10px; border: none; background-color: white;\">\r\n");
      out.write("				<h2 style=\"\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(아이디)님</h2>\r\n");
      out.write("\r\n");
      out.write("				<hr\r\n");
      out.write("					style=\"width: 100%; height: 10px; border: none; background-color: white;\">\r\n");
      out.write("				<hr\r\n");
      out.write("					style=\"width: 100%; height: 10px; border: none; background-color: white;\">\r\n");
      out.write("				<center>\r\n");
      out.write("					<hr\r\n");
      out.write("						style=\"width: 80%; height: 5px; border: none; background-color: yellow;\">\r\n");
      out.write("				</center>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div style=\"width: 70%;\">\r\n");
      out.write("			<span style=\"font-size: 1.5em;\">카페 글쓰기</span>\r\n");
      out.write("\r\n");
      out.write("			<form action=\"/jspbook/PostServlet\" name=\"RegisterBoard\">\r\n");
      out.write("				<button type=\"submit\" class=\"btn btn-outline-dark\"\r\n");
      out.write("					style=\"margin-left: 650px\">등록</button>\r\n");
      out.write("				<hr\r\n");
      out.write("					style=\"width: 100%; height: 10px; border: none; background-color: white;\">\r\n");
      out.write("				<div style=\"width: 80%\">\r\n");
      out.write("					<div class=\"form-floating\">\r\n");
      out.write("						<textarea class=\"form-control\" placeholder=\"Leave a comment here\"\r\n");
      out.write("							id=\"floatingTextarea2\" name=\"title\" style=\"height: 100px\"></textarea>\r\n");
      out.write("						<label for=\"floatingTextarea2\">제목</label>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"form-floating\">\r\n");
      out.write("						<textarea class=\"form-control\" placeholder=\"Leave a comment here\"\r\n");
      out.write("							id=\"floatingTextarea2\" name=\"content\" style=\"height: 500px\"></textarea>\r\n");
      out.write("						<label for=\"floatingTextarea2\">내용</label>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
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
