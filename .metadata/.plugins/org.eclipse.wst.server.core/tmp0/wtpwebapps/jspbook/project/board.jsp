@import url(https://fonts.googleapis.com/earlyaccess/gowundodum.css);
<%@page import="manager.BoardManager"%>
<%@page import="model.BoardBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel"stylesheet" href="resources/register/css" type="text/css"></link>
</head>
<script>
	
</script>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	model.UserBean user = (model.UserBean) session.getAttribute("user");
	BoardBean board = null;
	if (user != null) {
		System.out.println("이름 : " + user.getUsername());
	}
	if (user == null) {
	%>
		<script>
			alert("로그인이 필요합니다!");
			location.href = "jspbook/Main.jsp";
		</script>
		<%
	} else {
		Object t = request.getParameter("idx");
		System.out.println("test : " + t);
		if (t == null) {
		%>
		<script>
			alert("잘못된 접근입니다!");
			location.href = "jspbook/Main.jsp";
		</script>
		<%
		} 
		else {
			int idx = Integer.parseInt(t.toString());
			board = BoardManager.getInstance().getBoard(idx);

			if (board == null) {
			%>
			<script>
				alert("잘못된 접근입니다!");
				location.href = "jspbook/Main.jsp";
			</script>
			<%
			}
		}
	}
	%>

	<nav class="navbar navbar-expand-lg bg-light">
		<div class="container-fluid" style="padding: 0.4erm">
			<a class="navbar-brand" href="Main.jsp">Cafe</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<%
					if (user == null) {
					%>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="loginForm.jsp">로그인 </a></li>
					<li class="nav-item"><a class="nav-link" href="signup.jsp">|
							회원가입</a></li>
					<%
					} else {
					%>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="/jspbook/LogOutServlet">로그아웃</a></li>
					<%
					}
					%>

				</ul>
			</div>
		</div>
	</nav>
	<img src="./asset/banner.png" alt="banner"
		style="width: 100%; text-align: center;">
	<hr
		style="width: 100%; height: 10px; border: none; background-color: white;">
	<div style="display: flex">

		<div style="width: 30%; margin-left: 40px;">
			<div>
				<center>
					<hr
						style="width: 80%; height: 5px; border: none; background-color: yellow;">
				</center>
				<hr
					style="width: 100%; height: 10px; border: none; background-color: white;">
				<hr
					style="width: 100%; height: 10px; border: none; background-color: white;">
				<%
				if (user == null) {
				%>
				<div class="my-box"
					style="width: 90%; height: 500px; border-top: 5px solid #FFD400; padding: 10px;">
					<center style="margin-top: 50px; font-size: 30px;">로그인이
						필요한 서비스입니다.</center>
				</div>

				<%
				} else {
				%>
				<h2 style="">
					&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=user.getUsername()%>님
				</h2>
				<%
				}
				%>
				<!--   <hr
					style="width: 100%; height: 10px; border: none; background-color: white;">
				<hr
					style="width: 100%; height: 10px; border: none; background-color: white;">
				<center>
					<hr
						style="width: 80%; height: 5px; border: none; background-color: yellow;">
				</center> -->

			</div>
		</div>

		<div style="width: 70%;">
			<div style="width: 90%; margin-top: 20px; margin-bottom: 20px;">
				<button type="button" class="btn btn-outline-dark"
					onclick="location.href='write.jsp?idx='+<%=board.getBoardID()%>">수정</button>
					
				<button type="button" class="btn btn-outline-dark"
					onclick="location.href='/jspbook/PostRemoveServlet?idx='+<%=board.getBoardID()%>">삭제</button>
				
				<button type="button" class="btn btn-outline-dark"
					style="position: relative; float: right;" 
					onclick="location.href='Main.jsp'">목록</button>
				<!--  <hr
					style="width: 100%; height: 10px; border: none; background-color: white;">
				<hr
					style="width: 80%; height: 5px; border: none; background-color: yellow;"> -->
				<div style="width: 90%">

					<div class="form-floating" style="margin-bottom: 10px">
						<div
							style="border: 1px solid; border-top: 2px solid #FFD400; border-radius: 5px; padding: 10px; height: 100px; font-size: 20px"><%=board.getBoardTitle()%></div>
					</div>
					<div class="form-floating">
						<div
							style="border: 1px solid; border-radius: 5px; padding: 10px; height: 500px;"><%=board.getBoardContent()%></div>
					</div>
				</div>
			</div>
		</div>
</body>
</html>