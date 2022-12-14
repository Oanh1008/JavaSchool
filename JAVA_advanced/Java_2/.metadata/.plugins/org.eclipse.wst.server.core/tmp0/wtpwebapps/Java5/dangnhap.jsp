<%@page import="java.util.stream.Collectors"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page import="bean.SachBean"%>
<%@page import="bean.LoaiBean"%>
<%@page import="bo.SachBo"%>
<%@page import="bo.LoaiBo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<!--Custom styles-->
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">

			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Trang chủ</a></li>
				<li><a href="htgio.jsp">Giỏ hàng</a></li>
				<li><a href="thanhtoan.jsp">Thanh toán</a></li>
				<li><a href="lichsu.jsp">Lịch sử mua hàng</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="thoat.jsp"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="dangnhap.jsp"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</ul>
		</div>
	</nav>

	<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	LoaiBo lbo = new LoaiBo();
	SachBo sbo = new SachBo();
	String tk = request.getParameter("txttk");
	String ml = request.getParameter("ml");
	List<SachBean> dssach = sbo.getSach();
	if (tk != null) {
		dssach = sbo.find(tk);
	}
	if (ml != null) {
		dssach = sbo.searchMl(ml);
	}
	%>
	<table width="100%" align="center">
		<tr>
			<td width="20%" valign="top">
				<table class="table table-hover">
					<%
					for (LoaiBean l : lbo.getLoai()) {
					%>
					<tr>
						<td><a href="htsach.jsp?ml=<%=l.getMaloai()%>"> <%=l.getTenloai()%>
						</a></td>
					</tr>
					<%
					}
					%>
				</table>
			</td>
			<td width="60%" valign="top"
				style="align-items: center; display: flex; justify-content: center; flex-wrap: 1; flex-direction: 1; margin-left: 200px;">
				<div class="container1">
					<div class="d-flex justify-content-center h-100">
						<div class="card">
							<div class="card-header">
								<h3>Sign In</h3>
								<h4 style="color: red">
									<%
									String kt = request.getParameter("kt");
									if (kt != null && kt.equals("1")) {
									%>
									Bad credentials !
									<%
									}
									if (request.getParameter("signup") != null) {
									%>
									Your acccount already created !
									<%
									}
									%>
									
									<%if (request.getParameter("captcha") != null) {
									%>
									Logined error greater than three times !
									<%
									}
									%>
									<%if (request.getParameter("captchakt") != null) {
									%>
									Error captcha, you are not a person !
									<%
									}
									%>

								</h4>
								<div class="d-flex justify-content-end social_icon">
									<span><i class="fab fa-facebook-square"></i></span> <span><i
										class="fab fa-google-plus-square"></i></span> <span><i
										class="fab fa-twitter-square"></i></span>
								</div>
							</div>
							<div class="card-body">
								<form action="KiemTraDangNhap" method="post">
									<div class="input-group form-group">
										<div class="input-group-prepend">
											<span class="input-group-text"><i class="fas fa-user"></i></span>
										</div>
										<input type="text" name="un" class="form-control"
											placeholder="username">

									</div>
									<div class="input-group form-group">
										<div class="input-group-prepend">
											<span class="input-group-text"><i class="fas fa-key"></i></span>
										</div>
										<input name="pw" type="password" class="form-control"
											placeholder="password">
									</div>
								
									
										<%if(request.getParameter("captcha") != null) {%>
										<img style="align-items: center;" src="simpleCaptcha.jpg" /> <a href="KiemTraDangNhap">Refresh</a>
										
										<input style="align-items: center; " name="cc" type="text" 
										class="form-control" placeholder="captcha">
										<%} %>
							
									
									<div class="row align-items-center remember">
										<input type="checkbox">Remember Me
									</div>
									<div class="form-group">
										<input type="submit" value="Login"
											class="btn float-right login_btn">
									</div>
								</form>
							</div>
							<div class="card-footer">
								<div class="d-flex justify-content-center links">
									Don't have an account?<a href="#">Sign Up</a>
								</div>
								<div class="d-flex justify-content-center">
									<a href="#">Forgot your password?</a>
								</div>
							</div>
						</div>
					</div>
				</div>

			</td>
			<td width="20%" valign="top">
				<form action="htsach.jsp" method="get">
					<input class="form-control" name="txttk" type="text"
						value="<%=tk == null ? "" : tk%>" placeholder="Nhap tt"> <br>
					<input class="btn-primary" name="butt" type="submit" value="Search">
				</form>
			</td>
		</tr>
	</table>

</body>
</html>