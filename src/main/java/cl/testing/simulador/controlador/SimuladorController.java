/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.testing.simulador.controlador;

import cl.testing.simulador.common.Simulador;
import cl.testing.simulador.common.Validador;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Franco
 */
@Controller
@RequestMapping("/simulador.htm")
public class SimuladorController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String validar(){
            return "simulador";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String recibir(@RequestParam("rut") String rut, 
            @RequestParam("monto") String monto,
            @RequestParam("cuotas") String cuotas,
            @RequestParam("vencimiento") String vencimiento,
            @RequestParam("seguro") String seguro,
            Model model){
        Validador val = new Validador();
        Simulador simulador = new Simulador();
        String mensaje = null;
        
        /*MENSAJES*/
        System.out.println("rut "+ rut);
        System.out.println("monto "+monto);
        System.out.println("cuotas "+cuotas);
        System.out.println("vencimiento "+vencimiento);
        System.out.println("seguro "+seguro);
        

        /*MENSAJES*/
        try{
            if(rut.trim().equals("") || vencimiento.trim().equals("") || vencimiento.equals("vencimiento") || seguro.trim().equals("") || monto.trim().equals("") || cuotas.trim().equals("")){
                mensaje = "Campos vacios";
                model.addAttribute("error",mensaje);
                return "error";
            }
            int cuotasInt = Integer.parseInt(cuotas);
            int montoInt = Integer.parseInt(monto);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = format.parse(vencimiento);
            System.out.println("try");
            if(!val.validaRut(rut)){
                System.out.println("RUT");
                mensaje = "Rut inválido";
                model.addAttribute("error",mensaje);
                return "error";
            } else if(!val.validaMonto(montoInt)){
                mensaje = "Monto inválido";
                model.addAttribute("error",mensaje);
                return "error";
            } else if(!val.validaCuota(cuotasInt)){
                mensaje = "Cuota inválida";
                model.addAttribute("error",mensaje);
                return "error";
            } else if(!val.validaFechaPrimerVencimiento(fecha)){
                System.out.println(fecha);
                mensaje = "Fecha inválida";
                model.addAttribute("error",mensaje);
                return "error";
            }else if(!val.validaSeguro(seguro)){
                mensaje = "Seguro inválido";
                model.addAttribute("error",mensaje);
                return "error";
            }else{
                double sim = simulador.calcular();
                model.addAttribute("simulador",sim);
                return "resultado";
            }
        }catch(Exception e){
            model.addAttribute("error",e);
            return "error";
        }
        
        
        
    }
}
