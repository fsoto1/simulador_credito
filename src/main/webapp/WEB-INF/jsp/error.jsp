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
        
        
        <div class="container">
            <div class="row">
                <div class="col-lg-12">                    
                    <div class="alert alert-danger" role="alert">
                        <br>
                        <h1>Ha ocurrido un error</h1>
                        <hr>
                        <h4>${requestScope.error}</h4>
                        
                    </div>  
            </div>
        </div>
        </div>
        
    </body>
</html>
