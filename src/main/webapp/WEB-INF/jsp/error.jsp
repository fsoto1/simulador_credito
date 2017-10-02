<%-- 
    Document   : error
    Created on : 02-oct-2017, 1:05:42
    Author     : Franco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
        <jsp:include page="common/bootstrap.jsp"/>
    </head>
    <body>
        <h1>Ha ocurrido un error</h1>
        <h4>${requestScope.error}</h4>
        <hr>
    </body>
</html>
