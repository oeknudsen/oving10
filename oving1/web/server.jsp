<%-- 
    Document   : server
    Created on : 25.aug.2016, 09:45:33
    Author     : OddErik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><p>Øving 1 - <%=request.getParameter("firstName")%> <%=request.getParameter("lastName")%></p></h1>
        <h3>Dagens dato er:</h3>
        <p><%out.println(new java.util.Date());%></p>
        <p><script>document.write(new Date());</script></p>
    </body>
</html>
