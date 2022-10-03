<%@page import="bean.ClassBean"%>
<%@page import="bean.StudentBean"%>
<%@page import="bo.StudentBo"%>
<%@page import="bo.ClassBo"%>
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
<title>HUSC</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body >

	<div style="background:#ffc3a0;">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">HUSC</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Features</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Pricing</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#"
					id="navbarDropdownMenuLink" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false"> Dropdown link </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
						<a class="dropdown-item" href="#">Action</a> <a
							class="dropdown-item" href="#">Another action</a> <a
							class="dropdown-item" href="#">Something else here</a>
					</div></li>
			</ul>
		</div>
	</nav>

	<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	ClassBo lbo = new ClassBo();
	StudentBo sbo = new StudentBo();
	String tk = request.getParameter("txttk");
	String ml = request.getParameter("ml");
	String id = request.getParameter("id");
	List<StudentBean> dssv = sbo.getAllStudent();
	if (ml != null) {
		dssv = sbo.findByClass(ml);
	}
	if (tk != null) {
		dssv = sbo.findByNamOrAddress(tk);
	}
	if (id != null) {
		dssv = sbo.removeById(id);
	}
	%>
	<table width="100%" align="center">
		<tr>
			<td width="15%" valign="top">
				<table class="table table-hover">
					<%
					for (ClassBean l : lbo.getAllClass()) {
					%>
					<tr>
						<td><a href="showStudent.jsp?ml=<%=l.getId()%>"> <%=l.getName()%>
						</a></td>
					</tr>
					<%
					}
					%>
				</table>
			</td>
			<td width="60%" valign="top">
				<div class="container">

					<div class="row">
						<%
						int n = dssv.size();
						for (StudentBean s : dssv) {
						%>
						<div class="col-4">

							<div class="card" style="width: 18rem; margin-top: 20px">
								<img style ="height: 280px" class="card-img-top" src="<%=s.getImage()%>" alt="Card image cap">
								<div class="card-body">
									<h5 class="card-title"><%=s.getName()%></h5>
								</div>
								<ul class="list-group list-group-flush">
									<li class="list-group-item">Mã sinh viên: <%=s.getId() %></li>
									<li class="list-group-item">Email: <%=s.getEmail() %></li>
									<li class="list-group-item">Địa chỉ: <%=s.getAddress() %></li>
								</ul>
							</div>
						</div>
						<%
						}
						%>

					</div>
				</div>
			</td>
			<td width="20%" valign="top">
				<form action="showStudent.jsp" method="get">
					<input class="form-control" name="txttk" type="text"
						value="<%=tk == null ? "" : tk%>" placeholder="name,address,email"> <br>
					<input class="btn-primary"  type="submit" value="Search">
				</form>
			</td>
		</tr>
	</table>
	</div>

</body>
</html>