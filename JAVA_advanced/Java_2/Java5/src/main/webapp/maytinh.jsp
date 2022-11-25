<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="TestController" method="post">
       a= <input name="txta" type="number" value="<%=request.getAttribute("a")%>"> <br>
       b= <input name="txtb" type="number" value="<%=request.getAttribute("b")%>"> <br>
       kq= <input name="txtkq" disabled="disabled" type="number" value="<%=request.getAttribute("kq")%>"> <br>
       <input name="butc" type="submit" value="+"> 
       <input name="butt" type="submit" value="-">
       <input name="butn" type="submit" value="*">
       <input name="butchia" type="submit" value="/">
    </form>
</body>
</html>
