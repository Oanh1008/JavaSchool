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
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">

			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Trang chủ</a></li>
				<li><a href="htgio.jsp">Giỏ hàng</a></li>
				<li><a href="thanhtoan.jsp">Thanh toán</a></li>
				<li><a href="lichsu.jsp">Lịch sử mua hàng</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">

				<%
				if (session.getAttribute("dn") == null) {
				%>
				<li><a href="dangky.jsp"><span
						class="glyphicon glyphicon-user"></span> Sign up</a></li>
				<li><a href="dangnhap.jsp"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
				<%
				} else {
				%>
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Xin chào: <%=session.getAttribute("dn")%></a></li>
				<li><a  data-toggle="modal" data-target="#exampleModal"><span
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
								<a href="thoat.jsp" type="button" class="btn btn-primary">OK</a>
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
			<td width="60%" valign="top">
				<table class="table table-hover">
					<%
					int n = dssach.size();
					for (int i = 0; i < n; i++) {
						SachBean s = dssach.get(i);
					%>
					<tr>
						<td><img src="<%=s.getAnh()%>"><br> <%=s.getTensach()%>
							<br> <%=s.getTacgia()%> <br> <%=s.getGia()%> <br>
							<a href="giohang.jsp?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&gia=<%=s.getGia()%>"> <img src="buynow.jpg">
						</a></td>
						<%
						i++;
						if (i < n) {
							s = dssach.get(i);
						%>
						<td><img src="<%=s.getAnh()%>"><br> <%=s.getTensach()%>
							<br> <%=s.getTacgia()%> <br> <%=s.getGia()%> <br>
							<a href="giohang.jsp?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&gia=<%=s.getGia()%>"> <img src="buynow.jpg">
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
							<a href="giohang.jsp?ms=<%=s.getMasach()%>&ts=<%=s.getTensach()%>&gia=<%=s.getGia()%>"> <img src="buynow.jpg">
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