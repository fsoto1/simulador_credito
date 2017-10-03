/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.testing.simulador.controlador;

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
            @RequestParam("monto") int monto,
            @RequestParam("cuotas") int cuotas,
            @RequestParam("vencimiento") String vencimiento,
            @RequestParam("seguro") String seguro,
            Model model){
        Validador val = new Validador();
        String mensaje;
        /*MENSAJES*/
        System.out.println("rut "+ rut);
        System.out.println("monto "+monto);
        System.out.println("cuotas "+cuotas);
        System.out.println("vencimiento "+vencimiento);
        System.out.println("seguro "+seguro);
        /*MENSAJES*/
        try{
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = format.parse(vencimiento);
            System.out.println("try");
            if(!val.validaRut(rut)){
                System.out.println("RUT");
                mensaje = "Rut inválido";
                model.addAttribute("error",mensaje);
                return "error";
            } else if(!val.validaMonto(monto)){
                mensaje = "Monto inválido";
                model.addAttribute("error",mensaje);
                return "error";
            } else if(!val.validaCuota(cuotas)){
                mensaje = "Cuota inválida";
                model.addAttribute("error",mensaje);
                return "error";
            } else if(!val.validaFechaPrimerVencimiento(fecha)){
                mensaje = "Fecha inválida";
                model.addAttribute("error",mensaje);
                return "error";
            }else if(!val.validaSeguro(seguro)){
                mensaje = "Seguro inválido";
                model.addAttribute("error",mensaje);
                return "error";
            }else{
                return "index";
            }
        }catch(Exception e){
            model.addAttribute("error",e);
        }
        
        if(rut.trim().equals("")){
            mensaje = "Campos vacios";
            model.addAttribute("error",mensaje);
            return "error";
        }else{
            return "index";
        }
        
    }
}
