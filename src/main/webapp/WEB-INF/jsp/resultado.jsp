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
                    <div class="alert alert-primary" role="alert">
                        <br>
                        <h4>Resultado de Simulación</h4>
                        <hr>
                        <table class="table table-striped">
                            <thead>
                              <tr>
                                <th>Fecha</th>
                                <th>${requestScope.hoy}</th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <th scope="row">Monto del Crédito</th>
                                <th>${requestScope.monto}</th>
                              </tr>
                              <tr>
                                 <th scope="row">Número de Cuotas</th>
                                 <th>${requestScope.cuotas}</th>
                              </tr>
                              <tr>
                                 <th>Pago Primera Cuota</th>
                                 <th>${requestScope.fecha}</th>
                              </tr>
                              <tr>
                                 <th>Valor Cuota Mensual</th>
                                 <th>$ <span id="cuota">${requestScope.valorCuota}</span></th>
                              </tr>
                              <tr>
                                 <th>Tasa de Interés Mensual(*)</th>
                                 <th>${requestScope.interesMensual} %</th>
                              </tr>
                              <tr>
                                 <th>Tasa de Interés Anual</th>
                                 <th>${requestScope.interesAnual} %</th>
                              </tr>
                              <tr>
                                 <th>Impuesto</th>
                                 <th>$ ${requestScope.notario}</th>
                              </tr>
                              <tr>
                                 <th>Notario</th>
                                 <th>$ ${requestScope.notario}</th>
                              </tr>
                              <tr>
                                 <th>Seguro ${requestScope.seguro}</th>
                                 <th>${requestScope.precioSeguro}</th>
                              </tr>
                              <tr>
                                 <th>Monto Total del Crédito</th>
                                 <th>$ ${requestScope.mtc}</th>
                              </tr>
                              <tr>
                                 <th>Costo total del Crédito (CTC)</th>
                                 <th>$ ${requestScope.ctc}</th>
                              </tr>
                            </tbody>
                        </table>
                    </div>  
            </div>
        </div>
        </div>
    </body>
</html>
