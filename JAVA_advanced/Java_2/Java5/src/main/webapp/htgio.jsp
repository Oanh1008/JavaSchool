
<!DOCTYPE html>

<%@page import="java.util.Enumeration"%>
<%@page import="bo.GioHangBo"%>
<%@page import="bean.GioHangBean"%>
<%@page import="bean.LoaiBean"%>
<%@page import="bean.SachBean"%>
<%@page import="java.util.List"%>
<%@page import="bo.SachBo"%>
<%@page import="bo.LoaiBo"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<meta name="viewport" content="width=device-width" />
<title>Index</title>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Shop Homepage - Start Bootstrap Template</title>
<!-- Bootstrap Core CSS -->
<link href="Content/bootstrap.css" rel="stylesheet" />

<!-- Custom CSS -->
<link href="Content/shop-homepage.css" rel="stylesheet" />


<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>

	<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");

	// GioHang
	GioHangBo gh = null;
	if (session.getAttribute("gio") != null) {
		gh = (GioHangBo) session.getAttribute("gio");
	}
	
	List<LoaiBean> dsloai = (List<LoaiBean>) request.getAttribute("dsloai");
	

	%>
	<!-- Navigation -->
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Start Bootstrap</a>
			</div>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="HtSach">TRANG CHỦ</a></li>
					<li><a href="/Nguoidung/Dangky">ĐĂNG K&#221;</a></li>
					<li><a href="/Nguoidung/Dangnhap">ĐĂNG NHẬP</a></li>
					<li><a href="Giohang"
						style="color: white; font-weight: bold; text-decoration: none;">
							<img src="images/giohang.gif" />Giỏ Hàng (<%=gh.ds.size()%>)
					</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>
	<!-- Page Content -->
	<div class="container">
		<div class="row">
			<div class="col-md-3">

				<p class="lead">CHỦ ĐỀ SÁCH</p>
				<div class="list-group">
					<%
					for (LoaiBean l : dsloai) {
					%>

					<a class="list-group-item" href="HtSach?ml=<%=l.getMaloai()%>">
						<%=l.getTenloai()%>
					</a>
					<%
					}
					%>

				</div>


			</div>
			<div class="col-md-9">


				<div>

					<h2 style="text-align: center">THÔNG TIN GIỎ HÀNG</h2>
					<table align="center" border="1">
						<tbody>
							<tr style="text-align: center; font-weight: bold">
								<td>Mã sách</td>
								<td>Tên sách</td>
						
								<td>Số lượng</td>
								<td>Đơn giá</td>
								<td>Thành tiền</td>
								<td width="50px"></td>
								<td width="50px"></td>
								<td width="50px">Chọn</td>
							</tr>
							<form action="XuLyGio" method="get">
								<%
								for (GioHangBean g : gh.ds) {
								%>
							
							<tr style="text-align: center; font-weight: bold">
								<td><%=g.getMasach()%></td>
								<td><%=g.getTensach()%></td>
								

								<input type="hidden" name="ms" value=<%=g.getMasach()%>>
								<td><input type="number" min="1" name="txt<%=g.getMasach()%>"
									style="background-color: yellow" value=<%=g.getSoluong()%>></td>
								<td><%=g.getGia()%></td>
								<td><%=g.getThanhtien()%></td>
								<td><a href="XuLyGio?msx=<%=g.getMasach()%>">Xóa</a></td>
								<td>
									<button type="submit" name="butSua" value="<%=g.getMasach()%>">Cập nhật</button>
								</td>
								<td><input name="selected" value ="<%=g.getMasach()%>" type="checkbox"></td>

							</tr>
							<%
							}
							%>
							<button type="submit" name="butXoa" value="xoaChon" >Xóa chọn</button>
							</form>

							<tr style="font-weight: bold; text-align: right; color: red">
								<td colspan="4">Số lượng sách: <%=gh.TongSach()%></td>
								<td colspan="5">Tổng tiền: <%=gh.ThanhTien()%> VNĐ
								</td>
							</tr>
							<tr style="font-weight: bold; color: blue; text-align: right">
								<td colspan="9"><a href="XuLyGio?xoaAll=all">Xóa Giỏ
										Hàng</a></td>
							</tr>
							<tr style="font-weight: bold; color: blue; text-align: right">
								<td colspan="9" align="center"><a href="MuaHang">ĐẶT
										HÀNG</a></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	<!-- /.container -->
	<div class="container">
		<hr>
		<!-- Footer -->
		<footer>
			<div class="row">
				<div class="col-lg-12">
					<p>Copyright &copy; MVC 5</p>
				</div>
			</div>
		</footer>
	</div>
	<!-- /.container -->
	<!-- jQuery -->
	<script src="/Scripts/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="/Scripts/bootstrap.min.js"></script>
</body>
</html>
