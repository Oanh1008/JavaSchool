<%@page import="bo.GioHangBo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String masach = request.getParameter("ms");
		String tensach = request.getParameter("ts");
		String giaTemp = request.getParameter("gia");
		long gia = 0 ;
		if( giaTemp != null){
			gia = Long.parseLong(giaTemp);
		}
		GioHangBo gh;
		if(session.getAttribute("gio")== null){
			gh= new GioHangBo();
			session.setAttribute("gio", gh);
		}
		// b1: luu session
		gh = (GioHangBo) session.getAttribute("gio");
		// b2: thay doi
		gh.Them(masach, tensach, gia, (long)1);
		// b3 : luu lai session
		session.setAttribute("gio", gh);
		
		// Hien thi gio
		response.sendRedirect("htgio.jsp");
	%>
</body>
</html>