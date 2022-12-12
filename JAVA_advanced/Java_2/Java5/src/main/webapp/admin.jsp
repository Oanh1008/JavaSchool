<%@page import="bean.LichSuMuaHang"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.stream.Collectors"%>
<%@page import="java.util.List"%>
<%@page import="bean.Temp"%>
<%@page import="bean.SachBean"%>
<%@page import="bean.DangNhapAdminBean"%>
<%@page import="bean.UserBean"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
</head>
<body>
	<%
	Map<Temp, List<LichSuMuaHang>> lsmh = (Map<Temp, List<LichSuMuaHang>>) request.getAttribute("lsmh");
	DangNhapAdminBean user = (DangNhapAdminBean) session.getAttribute("admin");
	%>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">

			<ul class="nav navbar-nav">
				<li class="active"><a href="XacnhanController">Trang chủ</a></li>
				<li><a href="SuaXoaSach">Thêm,Sửa, Xóa Sách</a></li>
				<li><a href="SuaXoaSach">Thêm,Sửa, Xóa Loại</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">

				<%
				if (session.getAttribute("admin") == null) {
				%>
				<li><a href="SignUp"><span class="glyphicon glyphicon-user"></span>
						Sign up</a></li>
				<li><a href="KiemTraDangNhap"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
				<%
				} else {
				%>
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Xin chào: <%=user.getTenDangNhap()%></a></li>
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
	<div class="col-sm-12">
		<table id="example1"
			class="table table-bordered table-striped dataTable dtr-inline"
			aria-describedby="example1_info">
			<thead>
				<tr>
					<th class="sorting sorting_asc" tabindex="0"
						aria-controls="example1" rowspan="1" colspan="1"
						aria-sort="ascending"
						aria-label="Rendering engine: activate to sort column descending">
						Mã hóa đơn</th>
					<th class="sorting" tabindex="0" aria-controls="example1"
						rowspan="1" colspan="1"
						aria-label="Browser: activate to sort column ascending">
						<h3 style="text-align: center; color: blue;">Danh sách sách</h3>
						
						<table align="center"  style="width: 100%">
						<tbody>
							<tr style="text-align: center; font-weight: bold">
								<td width="20%">Mã sách</td>
								<td width="50%">Tên sách</td>
								<td width="10%">Số lượng</td>
								<td width="10%">Đơn giá</td>
					
								
							</tr>
						</tbody>
						</table>
						</th>
					<th class="sorting" tabindex="0" aria-controls="example1"
						rowspan="1" colspan="1"
						aria-label="Platform(s): activate to sort column ascending">Thành
						tiền</th>
					<th class="sorting" tabindex="0" aria-controls="example1"
						rowspan="1" colspan="1"
						aria-label="Engine version: activate to sort column ascending">Ngày
						mua</th>
						<th>Xác nhận</th>

				</tr>
			</thead>
			<tbody>
				<%
				int a = 0;
				for (Temp key : lsmh.keySet()) {
					List<SachBean> sach = lsmh.get(key).stream().map(
					t -> new SachBean(t.getMaSach(), t.getTenSach(), t.getSoLuongMua(), (int) t.getGia(), t.getThanhTien()))
					.collect(Collectors.toList());
				%>
				<tr class="<%=a%2==0?"even":"odd"%>">
				<%a++; %>
					<td class="dtr-control sorting_1" tabindex="0"><%=key.getMhd()%></td>
					<td>
					<!--table start  -->
					<table align="left"  style="width: 100%">
						<tbody>
						<!-- 	<tr style="text-align: center; font-weight: bold">
								<td>Mã sách</td>
								<td>Tên sách</td>
						
								<td>Số lượng</td>
								<td>Đơn giá</td>
								<td>Thành tiền</td>
							</tr> -->
								<%
								for (SachBean g : sach) {
								%>
							
							<tr style="text-align: center; font-weight: bold">
								<td width="20%"><%=g.getMasach()%></td>
								<td width="50%" style="text-align: left;"><%=g.getTensach()%></td>
								<td width="10%"><%=g.getSoluong()%></td>
								<td width="10%"><%=g.getGia()%></td>
								<td width="10%"><%=g.getThanhtien()%></td>
								
							</tr>
							<%
							}
							%>
						</tbody>
					</table>
					<!--table end  -->
					</td>

					<td><%=key.getThanhtien()%></td>
					<td><%=key.getNgay()%></td>
					
					<td><a href="XacnhanController?mhd=<%=key.getMhd()%>" style="color: blue">Xác nhận</a></td>
				</tr>
				<%
				}
				%>



			</tbody>

		</table>
	</div>
</body>
</html>

