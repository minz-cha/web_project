/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.65
 * Generated at: 2022-12-05 05:28:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.project;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import manager.BoardManager;
import model.BoardBean;

public final class board_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.BoardBean");
    _jspx_imports_classes.add("manager.BoardManager");
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

      out.write("@import url(https://fonts.googleapis.com/earlyaccess/gowundodum.css);\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
	BoardBean board = null;
	if (user != null) {
		System.out.println("이름 : " + user.getUsername());
	}
	if (user == null) {
	
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("			alert(\"로그인이 필요합니다!\");\r\n");
      out.write("			location.href = \"jspbook/Main.jsp\";\r\n");
      out.write("		</script>\r\n");
      out.write("		");

	} else {
		Object t = request.getParameter("idx");
		System.out.println("test : " + t);
		if (t == null) {
		
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("			alert(\"잘못된 접근입니다!\");\r\n");
      out.write("			location.href = \"jspbook/Main.jsp\";\r\n");
      out.write("		</script>\r\n");
      out.write("		");

		} 
		else {
			int idx = Integer.parseInt(t.toString());
			board = BoardManager.getInstance().getBoard(idx);

			if (board == null) {
			
      out.write("\r\n");
      out.write("			<script>\r\n");
      out.write("				alert(\"잘못된 접근입니다!\");\r\n");
      out.write("				location.href = \"jspbook/Main.jsp\";\r\n");
      out.write("			</script>\r\n");
      out.write("			");

			}
		}
	}
	
      out.write("\r\n");
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
      out.write("		<div style=\"width: 30%; margin-left: 40px;\">\r\n");
      out.write("			<div>\r\n");
      out.write("				<center>\r\n");
      out.write("					<hr\r\n");
      out.write("						style=\"width: 80%; height: 5px; border: none; background-color: yellow;\">\r\n");
      out.write("				</center>\r\n");
      out.write("				<hr\r\n");
      out.write("					style=\"width: 100%; height: 10px; border: none; background-color: white;\">\r\n");
      out.write("				<hr\r\n");
      out.write("					style=\"width: 100%; height: 10px; border: none; background-color: white;\">\r\n");
      out.write("				");

				if (user == null) {
				
      out.write("\r\n");
      out.write("				<div class=\"my-box\"\r\n");
      out.write("					style=\"width: 90%; height: 500px; border-top: 5px solid #FFD400; padding: 10px;\">\r\n");
      out.write("					<center style=\"margin-top: 50px; font-size: 30px;\">로그인이\r\n");
      out.write("						필요한 서비스입니다.</center>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				");

				} else {
				
      out.write("\r\n");
      out.write("				<h2 style=\"\">\r\n");
      out.write("					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
      out.print(user.getUsername());
      out.write("님\r\n");
      out.write("				</h2>\r\n");
      out.write("				");

				}
				
      out.write("\r\n");
      out.write("				<!--   <hr\r\n");
      out.write("					style=\"width: 100%; height: 10px; border: none; background-color: white;\">\r\n");
      out.write("				<hr\r\n");
      out.write("					style=\"width: 100%; height: 10px; border: none; background-color: white;\">\r\n");
      out.write("				<center>\r\n");
      out.write("					<hr\r\n");
      out.write("						style=\"width: 80%; height: 5px; border: none; background-color: yellow;\">\r\n");
      out.write("				</center> -->\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div style=\"width: 70%;\">\r\n");
      out.write("			<div style=\"width: 90%; margin-top: 20px; margin-bottom: 20px;\">\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-outline-dark\"\r\n");
      out.write("					onclick=\"location.href='write.jsp?idx='+");
      out.print(board.getBoardID());
      out.write("\">수정</button>\r\n");
      out.write("					\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-outline-dark\"\r\n");
      out.write("					onclick=\"location.href='/jspbook/PostRemoveServlet?idx='+");
      out.print(board.getBoardID());
      out.write("\">삭제</button>\r\n");
      out.write("				\r\n");
      out.write("				<button type=\"button\" class=\"btn btn-outline-dark\"\r\n");
      out.write("					style=\"position: relative; float: right;\" \r\n");
      out.write("					onclick=\"location.href='Main.jsp'\">목록</button>\r\n");
      out.write("				<!--  <hr\r\n");
      out.write("					style=\"width: 100%; height: 10px; border: none; background-color: white;\">\r\n");
      out.write("				<hr\r\n");
      out.write("					style=\"width: 80%; height: 5px; border: none; background-color: yellow;\"> -->\r\n");
      out.write("				<div style=\"width: 90%\">\r\n");
      out.write("\r\n");
      out.write("					<div class=\"form-floating\" style=\"margin-bottom: 10px\">\r\n");
      out.write("						<div\r\n");
      out.write("							style=\"border: 1px solid; border-top: 2px solid #FFD400; border-radius: 5px; padding: 10px; height: 100px; font-size: 20px\">");
      out.print(board.getBoardTitle());
      out.write("</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"form-floating\">\r\n");
      out.write("						<div\r\n");
      out.write("							style=\"border: 1px solid; border-radius: 5px; padding: 10px; height: 500px;\">");
      out.print(board.getBoardContent());
      out.write("</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
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
