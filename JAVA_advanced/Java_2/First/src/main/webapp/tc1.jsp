<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<b> Doan code </b>
    <%for(int i=1;i<=100;i++){ %>
         <a href=""> Menu nu <%=i %></a> <br>
         <%} %>
</body>
</html>