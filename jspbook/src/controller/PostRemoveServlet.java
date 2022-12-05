package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import manager.BoardManager;

@WebServlet("/PostRemoveServlet")
public class PostRemoveServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
	
    public PostRemoveServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		int idx = Integer.parseInt(request.getParameter("idx"));
		System.out.println("idx : " + idx);
		// 로그인 여부(세션)
		boolean check = BoardManager.getInstance().remove(idx);
		PrintWriter out = response.getWriter();	// html처럼 만듬
		if(check) {
			out.println("<script>alert(\"게시글 삭제 완료!\");</script>");
			out.println("<script>location.href=\"project/Main.jsp;\"</script>");
		}
		else {
			out.println("<script>alert(\"잘못된 접근입니다!\");</script>");
			out.println("<script>location.href=\"project/Main.jsp\";</script>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
