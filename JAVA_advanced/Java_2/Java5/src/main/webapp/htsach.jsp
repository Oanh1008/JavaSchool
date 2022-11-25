<%@page import="bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.lang.reflect.Array"%>
<%@page import="java.util.stream.Collectors"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page import="bean.SachBean"%>
<%@page import="bean.LoaiBean"%>
<%@page import="bo.SachBo"%>
<%@page import="bo.LoaiBo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<%
request.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");
%>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<%
	UserBean user = (UserBean) session.getAttribute("dn");
	%>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">

			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Trang chủ</a></li>
				<li><a href="GioHang">Giỏ hàng</a></li>
				<li><a href="GioHang">Thanh toán</a></li>
				<li><a href="LichSuMuaHang">Lịch sử mua hàng</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">

				<%
				if (session.getAttribute("dn") == null) {
				%>
				<li><a href="SignUp"><span class="glyphicon glyphicon-user"></span>
						Sign up</a></li>
				<li><a href="KiemTraDangNhap"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
				<%
				} else {
				%>
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Xin chào: <%=user.getFullName()%></a></li>
				<li><a data-toggle="modal" data-target="#exampleModal"><span
						class="glyphicon glyphicon-user"></span> Logout</a></li>
				<!-- Modal -->
				<div class="modal fade" id="exampleModal" tabindex="-1"
					role="dialog" aria-labelledby="exampleModalLabel"
					aria-hidden="true">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">Cancel</button>
								<a href="Logout" type="button" class="btn btn-primary">OK</a>
							</div>
						</div>
					</div>
				</div>
				<%
				}
				%>

			</ul>
		</div>
	</nav>

	<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");

	List<SachBean> dssach = (List<SachBean>) request.getAttribute("dssach");

	List<LoaiBean> dsloai = (List<LoaiBean>) request.getAttribute("dsloai");
	%>
	<table width="100%" align="center">
		<tr>
			<td width="20%" valign="top">
				<table class="table table-hover">
					<%
					for (LoaiBean l : dsloai) {
					%>
					<tr>
						<td><a href="HtSach?ml=<%=l.getMaloai()%>"> <%=l.getTenloai()%>
						</a></td>
					</tr>
					<%
					}
					%>
				</table>
			</td>
			<td width="60%" valign="top">

			<h2><%=request.getAttribute("muatc")!=null?"Mua hang thanh cong !":"" %></h2>
				<div class="container" style="width: 80%">
					
					<div id="myCarousel" class="carousel slide" data-ride="carousel">
						<!-- Indicators -->
						<ol class="carousel-indicators">
							<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
							<li data-target="#myCarousel" data-slide-to="1"></li>
							<li data-target="#myCarousel" data-slide-to="2"></li>
						</ol>

						<!-- Wrapper for slides -->
						<div class="carousel-inner">
						<%for(int i=0;i<3;i++) {
							if(i == 0){%>
							<div class="item active">
								<img src="https://aphoto.vn/wp-content/uploads/2018/02/anh-chup-dien-thoai-dep.jpg" style="width:100%;height:300px;">
							</div>
							<% }else{%>
							<div class="item">
								<img src="https://aphoto.vn/wp-content/uploads/2018/02/anh-dep-chup-va-blend-bang-dien-thoai-7.jpg" style="width:100%;height:300px">
							</div>
							
							<%}} %>
						</div>

						<!-- Left and right controls -->
						<a class="left carousel-control" href="#myCarousel"
							data-slide="prev"> <span
							class="glyphicon glyphicon-chevron-left"></span> <span
							class="sr-only">Previous</span>
						</a> <a class="right carousel-control" href="#myCarousel"
							data-slide="next"> <span
							class="glyphicon glyphicon-chevron-right"></span> <span
							class="sr-only">Next</span>
						</a>
					</div>
				</div>
				<table class="table table-hover">
					<%
					int n = dssach.size();
					for (int i = 0; i < n; i++) {
						SachBean s = dssach.get(i);
					%>
					<tr>
						<td><img src="<%=s.getAnh()%>"><br> <%=s.getTensach()%>
							<br> <%=s.getTacgia()%> <br> <%=s.getGia()%> <br>
							Số lượng:<%=s.getSoluong() %><br>
							<a
							href="ThemGioHang?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&gia=<%=s.getGia()%>">
								<img src="buynow.jpg">
						</a></td>
						<%
						i++;
						if (i < n) {
							s = dssach.get(i);
						%>
						<td><img src="<%=s.getAnh()%>"><br> <%=s.getTensach()%>
							<br> <%=s.getTacgia()%> <br> <%=s.getGia()%> <br>
							Số lượng:<%=s.getSoluong() %><br>
							<a
							href="ThemGioHang?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&gia=<%=s.getGia()%>">
								<img src="buynow.jpg">
						</a></td>
						<%
						}
						%>
						<%
						i++;
						if (i < n) {
							s = dssach.get(i);
						%>
						<td><img src="<%=s.getAnh()%>"><br> <%=s.getTensach()%>
							<br> <%=s.getTacgia()%> <br> <%=s.getGia()%> <br>
							Số lượng:<%=s.getSoluong() %><br>
							<a
							href="ThemGioHang?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&gia=<%=s.getGia()%>">
								<img src="buynow.jpg">
						</a></td>
						<%
						}
						%>
					</tr>
					<%
					}
					%>
				</table>

			</td>
			<td width="20%" valign="top">
				<form action="HtSach" method="get">
					<input class="form-control" name="txttk" type="text"
						value="<%=request.getParameter("tk") == null ? "" : request.getParameter("tk")%>"
						placeholder="Nhap tt"> <br> <input
						class="btn-primary" name="butt" type="submit" value="Search">
				</form>
			</td>
		</tr>
	</table>

	<nav class="float-end" style="display: grid; justify-content: center;">
		<ul class="pagination">
			<%
			long totalPages = (long) request.getAttribute("totalPages");
			for (long i = 1; i <= totalPages; i++) {
			%>
			<li class="page-item"><a href="HtSach?page=<%=i%>"
				class="page-link"><%=i%></a></li>
			<%
			}
			%>

		</ul>
	</nav>

</body>
</html>