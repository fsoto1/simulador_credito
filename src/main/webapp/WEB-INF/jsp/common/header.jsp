<%-- 
    Document   : header
    Created on : 27-sep-2017, 12:30:24
    Author     : Franco
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

        <nav class="navbar navbar-expand-md navbar-light bg-light">
            <a class="navbar-brand" href="<c:url value = "/index.jsp"/>">Home</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                  <a class="nav-link" href="<c:url value = "/herramienta/listar.jsp"/>">Herramientas</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="<c:url value = "/empleado/listar.jsp"/>">Empleados</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="<c:url value = "/prestamo/devolucion.jsp"/>">Devolución</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="<c:url value = "/prestamo/consulta.jsp"/>">Consultas</a>
                </li>
              </ul>
            </div>
        </nav>
        <br>

