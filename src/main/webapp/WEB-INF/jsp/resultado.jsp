<%-- 
    Document   : resultado
    Created on : 02-oct-2017, 21:23:23
    Author     : Franco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
        <jsp:include page="common/bootstrap.jsp"/>
    </head>
    <body>
        
        <div class="container">
            <div class="row">
                <div class="col-lg-12">                    
                    <div class="alert alert-success" role="alert">
                        <br>
                        <h4>Resultado de Simulación</h4>
                        <hr>
                        <h1>${requestScope.simulador}</h1>
                        
                    </div>  
            </div>
        </div>
        </div>
    </body>
</html>
