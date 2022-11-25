<%-- 
    Document   : hehe
    Created on : Nov 22, 2022, 3:45:35 PM
    Author     : Oanhpv1008
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>    <%-- start web service invocation --%><hr/>
      <%-- start web service invocation --%><hr/>
    <%
    try {
	a.DichBu_Service service = new a.DichBu_Service();
	a.DichBu port = service.getDichBuPort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = "ss";
	// TODO process result here
	java.lang.String result = port.hello(name);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>    <%-- start web service invocation --%><hr/>
    <%
    try {
	a.DichBu_Service service = new a.DichBu_Service();
	a.DichBu port = service.getDichBuPort();
	 // TODO initialize WS operation arguments here
	int a = 5;
	int b = 4;
	// TODO process result here
	java.lang.Integer result = port.nhan(a, b);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>    <%-- start web service invocation --%><hr/>
    <%
    try {
	a.DichBu_Service service = new a.DichBu_Service();
	a.DichBu port = service.getDichBuPort();
	 // TODO initialize WS operation arguments here
	int a = 23;
	int b = 634;
	// TODO process result here
	java.lang.Integer result = port.operation(a, b);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    <%-- end web service invocation --%><hr/>

    <%-- end web service invocation --%><hr/>

    <%-- end web service invocation --%><hr/>

    <%-- end web service invocation --%><hr/>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
