/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-12-01 10:02:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>시작화면</title>\r\n");
      out.write("<style>\r\n");
      out.write("div {\r\n");
      out.write("	float: left;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("<link\r\n");
      out.write("	rel=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\">\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Popper JS -->\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-light\"\r\n");
      out.write("		style=\"background-color: #e3f2fd;\">\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"#\">네이버 카페</a>\r\n");
      out.write("\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("			data-target=\"#collapsibleNavbar\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\r\n");
      out.write("			<ul class=\"navbar-nav\">\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"\r\n");
      out.write("					data-toggle=\"modal\" data-target=\"#login\"> 로그인 </a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"modal\" id=\"login\">\r\n");
      out.write("						<div class=\"modal-dialog\">\r\n");
      out.write("							<div class=\"modal-content\">\r\n");
      out.write("\r\n");
      out.write("								<!-- Modal Header -->\r\n");
      out.write("								<div class=\"modal-header\">\r\n");
      out.write("									<h4 class=\"modal-title\">로그인</h4>\r\n");
      out.write("								</div>\r\n");
      out.write("\r\n");
      out.write("								<!-- Modal body -->\r\n");
      out.write("								<div class=\"modal-body\">\r\n");
      out.write("									<form action=\"\" class=\"was-validated\">\r\n");
      out.write("										<div class=\"form-group\">\r\n");
      out.write("											<label for=\"userId\">아이디 </label> <input type=\"text\"\r\n");
      out.write("												class=\"form-control\" id=\"userId\" placeholder=\"Enter ID\"\r\n");
      out.write("												name=\"userId\" required>\r\n");
      out.write("											<div class=\"invalid-feedback\">필수 입력사항입니다.</div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"form-group\">\r\n");
      out.write("											<label for=\"userPw\">비밀번호 </label> <input type=\"password\"\r\n");
      out.write("												class=\"form-control\" id=\"userPw\"\r\n");
      out.write("												placeholder=\"Enter Password\" name=\"userPw\" required>\r\n");
      out.write("											<i class=\"fa fa-eye fa-lg\"></i>\r\n");
      out.write("											<div class=\"invalid-feedback\">필수 입력사항입니다.</div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"form-group form-check\">\r\n");
      out.write("											<label class=\"form-check-label\"> <input\r\n");
      out.write("												class=\"form-check-input\" type=\"checkbox\" name=\"remember\">\r\n");
      out.write("												Remember me\r\n");
      out.write("											</label>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"modal-footer\">\r\n");
      out.write("											<button class=\"btn btn-primary\" type=\"submit\">로그인</button>\r\n");
      out.write("											<button class=\"btn btn-secondary\" type=\"button\"\r\n");
      out.write("												style=\"float: right;\" data-dismiss=\"modal\">취소</button>\r\n");
      out.write("										</div>\r\n");
      out.write("									</form>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"\r\n");
      out.write("					data-toggle=\"modal\" data-target=\"#register\"> 회원가입 </a>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"modal\" id=\"register\">\r\n");
      out.write("						<div class=\"modal-dialog\">\r\n");
      out.write("							<div class=\"modal-content\">\r\n");
      out.write("\r\n");
      out.write("								<!-- Modal Header -->\r\n");
      out.write("								<div class=\"modal-header\">\r\n");
      out.write("									<h4 class=\"modal-title\">회원가입</h4>\r\n");
      out.write("								</div>\r\n");
      out.write("\r\n");
      out.write("								<!-- Modal body -->\r\n");
      out.write("								<div class=\"modal-body\">\r\n");
      out.write("									<form action=\"\" class=\"was-validated\">\r\n");
      out.write("										<div class=\"form-group\">\r\n");
      out.write("											<label for=\"registerName\">이름</label> <input type=\"text\"\r\n");
      out.write("												class=\"form-control\" id=\"registerName\"\r\n");
      out.write("												placeholder=\"Enter Name\" required>\r\n");
      out.write("											<div class=\"invalid-feedback\">필수 입력사항입니다.</div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"form-group\">\r\n");
      out.write("											<label for=\"registerId\">아이디</label> <input type=\"text\"\r\n");
      out.write("												class=\"form-control\" id=\"registerId\" placeholder=\"Enter ID\"\r\n");
      out.write("												required>\r\n");
      out.write("											<div class=\"invalid-feedback\">필수 입력사항입니다.</div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"form-group\">\r\n");
      out.write("											<label for=\"registerPw\">비밀번호</label> <input type=\"text\"\r\n");
      out.write("												class=\"form-control\" id=\"registerPw\"\r\n");
      out.write("												placeholder=\"Enter Password\" required> <i\r\n");
      out.write("												class=\"fa fa-eye fa-lg\"></i>\r\n");
      out.write("											<div class=\"invalid-feedback\">필수 입력사항입니다.</div>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div class=\"form-group\">\r\n");
      out.write("											<label for=\"registerPwCheck\">비밀번호 확인</label> <input\r\n");
      out.write("												type=\"text\" class=\"form-control\" id=\"registerPwCheck\"\r\n");
      out.write("												placeholder=\"Enter Password\" required> <i\r\n");
      out.write("												class=\"fa fa-eye fa-lg\"></i>\r\n");
      out.write("											<div class=\"invalid-feedback\">필수 입력사항입니다.</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</form>\r\n");
      out.write("								</div>\r\n");
      out.write("\r\n");
      out.write("								<!-- Modal footer -->\r\n");
      out.write("								<div class=\"modal-footer\">\r\n");
      out.write("									<button class=\"btn btn-primary\" type=\"submit\">회원가입</button>\r\n");
      out.write("									<button class=\"btn btn-secondary\" type=\"button\"\r\n");
      out.write("										style=\"float: right;\" data-dismiss=\"modal\">취소</button>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<div class=\"image\" style=\"text-align: center\">\r\n");
      out.write("		<img src=\"images/banner.png\" width=\"1080\" alt=\"배너\" />\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"layout\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<section class=\"featured-items\">\r\n");
      out.write("				<div class=\"featured-main\">\r\n");
      out.write("					<img src=\"images/lineYellow.png\" alt=\"배너\" />\r\n");
      out.write("					<div class=\"featured-sub\">\r\n");
      out.write("						<div class=\"nouserId\">로그인이 필요한 서비스입니다.</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"featured-sub\">전체 글 보기</div>\r\n");
      out.write("			</section>\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<table class=\"table table-striped\"\r\n");
      out.write("						style=\"text-align: center; border: 1px solid #dddddd\">\r\n");
      out.write("						<thead>\r\n");
      out.write("							<tr>\r\n");
      out.write("								<th style=\"background-color: #eeeeee; text-align: center;\">번호</th>\r\n");
      out.write("								<th style=\"background-color: #eeeeee; text-align: center;\">제목</th>\r\n");
      out.write("								<th style=\"background-color: #eeeeee; text-align: center;\">작성자</th>\r\n");
      out.write("								<th style=\"background-color: #eeeeee; text-align: center;\">작성일</th>\r\n");
      out.write("							</tr>\r\n");
      out.write("						</thead>\r\n");
      out.write("					</table>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
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
