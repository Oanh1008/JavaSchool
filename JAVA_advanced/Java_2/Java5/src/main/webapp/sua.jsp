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
	<%SachBean s = (SachBean) request.getAttribute("ss"); %>
	<div >
		<div class="modal-dialog modal-dialog-centered" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalCenterTitle">Modal
						title</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<form action="ThemSach" method="post" enctype="multipart/form-data">
					<div class="modal-body">
						<div class="form-group row mt-4 mb-4">
							<label for="roomCode" class="col-sm-2 col-form-label">Mã
								sách :</label>
							<div class="col-sm-4">
								<input class="form-control" name="masach" value="<%=s.getMasach() %>" />
							</div>
						</div>

						<div class="form-group row mt-4 mb-4">
							<label for="min" class="col-sm-2 col-form-label">Tên sách
								:</label>
							<div class="col-sm-4">
								<input min=1 class="form-control" name="tensach"  value="<%=s.getTensach() %>"/>
							</div>
						</div>

						<div class="form-group row mt-4 mb-4">
							<label for="max" class="col-sm-2 col-form-label">Số
								lượng:</label>
							<div class="col-sm-4">
								<input min=1 class="form-control" type="number" name="soluong" value="<%=s.getSoluong() %>" />
							</div>
						</div>
						<div class="form-group row mt-4 mb-4">
							<label for="max" class="col-sm-2 col-form-label">Giá :</label>
							<div class="col-sm-4">
								<input min=1 class="form-control" type="number" name="gia" value="<%=s.getGia() %>" />
							</div>
						</div>
						<div class="form-group row mt-4 mb-4">
							<label for="max" class="col-sm-2 col-form-label">Số tập :</label>
							<div class="col-sm-4">
								<input min=1 class="form-control" type="number" name="sotap" value="<%=s.getGia() %>" />
							</div>
						</div>
						<div class="form-group row mt-4 mb-4">
							<label for="max" class="col-sm-2 col-form-label">Tác giả
								:</label>
							<div class="col-sm-4">
								<input min=1 class="form-control" type="text" name="tacgia" value="<%=s.getTacgia()%>" />
							</div>
						</div>

						<div class="form-group row mt-4 mb-4">
							<label class="col-sm-2 col-form-label">Loại sách :</label>
							<div class="col-sm-4">
								<select name="maloai" class="form-control">
									<%-- <%for (LoaiBean l : dsloai) { %>
												<option value="<%=l.getMaloai()%>"><%=l.getTenloai() %></option>
												<%} %> --%>
								</select>
							</div>
						</div>

						<div class="form-group row mt-4 mb-4">
							<label for="max" class="col-sm-2 col-form-label">Ảnh :</label>
							<div class="col-sm-4">
								<input type="file" name="txtfile">
							</div>
						</div>

					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
						<button type="submit" class="btn btn-primary">Save
							changes</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>