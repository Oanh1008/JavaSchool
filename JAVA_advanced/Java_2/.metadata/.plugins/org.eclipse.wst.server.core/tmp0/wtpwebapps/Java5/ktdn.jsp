<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String un =request.getParameter("un");
	  	String pass = request.getParameter("pw");
	  	if(un.equals("abc") && pass.equals("123")){
	  		session.setAttribute("dn", (String)"Phạm Văn Oanh");
	  		response.sendRedirect("htsach.jsp");
	  		
	  			
	  	}else{
	  		response.sendRedirect("dangnhap.jsp?kt=0");
	  	}
	%>
</body>
</html>	