<%-- 
    Document   : otro
    Created on : 01-oct-2017, 23:49:03
    Author     : Franco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="common/bootstrap.jsp"/>
        <title>Simulador</title>
    </head>
    <body>
        
        
        
        <div class="container">
            <div class="row">
                <div class="col-lg-12">                    
                    <div class="alert alert-primary" role="alert">
                        <h1>Simulador de crédito</h1>
                        <hr>
                            <form action="simulador.htm" method="post">
                            <div class="form-group">
                                <label>Rut</label>
                                <input type="text" class="form-control" id="rut" name="rut" placeholder="Ej. 12345678-k" required>
                            </div>
                            <div class="form-group">
                                <label>Monto Solicitado</label>
                                <input type="number" class="form-control" id="monto" name="monto"  placeholder="Desde $506502" required>
                            </div>
                            <div class="form-group">
                                <label>Plazo cuotas</label>
                                <input type="number" class="form-control" id="cuotas" name="cuotas" placeholder="Entre 12 - 60 cuotas" required>
                            </div>
                            <div class="form-group">
                                <label>Primer Vencimiento</label>
                                <input type="date" class="form-control" id="vencimiento" name="vencimiento" placeholder="DD-MM-YYYY" required>
                            </div>
                            <label>Seguros que deseas incluir</label>
                            <div class="form-check form-check-inline">                                
                                <label class="form-check-label">
                                    <input class="form-check-input" type="radio" name="seguro" id="protegido"  value="protegido" checked="true"> Protegido
                                </label>
                            </div>
                            <div class="form-check form-check-inline">
                                <label class="form-check-label">
                                    <input class="form-check-input" type="radio" name="seguro" id="desgravemen"  value="desgravemen"> Desgravamen
                                </label>
                            </div>
                            <div class="form-check form-check-inline">
                                <label class="form-check-label">
                                    <input class="form-check-input" type="radio" name="seguro" id="ninguno" value="ninguno"> Ninguno
                                </label>
                            </div>
                            <br>
                            <button type="submit" class="btn btn-success" id="simular">Simular</button>
                        </form> 
                    </div>  
            </div>
        </div>
        </div>
    </body>
    <script>
        var Fn = {
			// Valida el rut con su cadena completa "XXXXXXXX-X"
			validaRut : function (rutCompleto) {
				if (!/^[0-9]+[-|‐]{1}[0-9kK]{1}$/.test( rutCompleto ))
					return false;
				var tmp 	= rutCompleto.split('-');
				var digv	= tmp[1]; 
				var rut 	= tmp[0];
				if ( digv == 'K' ) digv = 'k' ;
				return (Fn.dv(rut) == digv );
			},
			dv : function(T){
				var M=0,S=1;
				for(;T;T=Math.floor(T/10))
					S=(S+T%10*(9-M++%6))%11;
				return S?S-1:'k';
			}
		}
        $(document).ready(function() {
		    var a = $("#rut")[0].value;
		    
		    $("#rut").change(function(){
		    	if(!Fn.validaRut($("#rut")[0].value)){
		    		alert("El Rut ingresado no es válido");
		    		$("#rut")[0].value = a;
		    	}
			});
                    $(".form-check-label").click(function(e){
                        if($(this).checked == true){
                            alert("checkeado");
                            $(this).prop('checked', false);
                        }
                        
                    });
		});        
    </script>
</html>
</html>
