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
        String mensaje;
        double interesMensual = 1.02;
        int impuesto = 16000;
        int notario = 700;
        int ctc;
        int precioSeguro;
        int valorCuota;
        Date hoy = new Date();
        System.out.println(rut);
        System.out.println(monto);
        System.out.println(cuotas);
        System.out.println(vencimiento);
        System.out.println(seguro);
        try{
            if(rut.trim().equals("") || vencimiento.trim().equals("") || vencimiento.equals("vencimiento") || seguro.trim().equals("") || monto.trim().equals("") || cuotas.trim().equals("")){
                mensaje = "Campos vacios";
                model.addAttribute("error",mensaje);
                return "error";
            }
            int cuotasInt = Integer.parseInt(cuotas);
            int montoInt = Integer.parseInt(monto);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat dmyFormat = new SimpleDateFormat("dd-MM-yyyy");
            SimpleDateFormat dmyhmsFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
            Date fecha = format.parse(vencimiento);
            if(!val.validaRut(rut)){
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
                mensaje = "Fecha inválida";
                model.addAttribute("error",mensaje);
                return "error";
            }else{
                if (seguro.equals("protegido")) {
                    precioSeguro = 70000;  
                }else if (seguro.equals("desgravemen")) {
                    precioSeguro = 50000;
                }else{
                    precioSeguro = 0;
                } 
                valorCuota = simulador.calcular(montoInt, cuotasInt, interesMensual);
                ctc = valorCuota*12;
                model.addAttribute("hoy",dmyhmsFormat.format(hoy));
                model.addAttribute("rut",rut);
                model.addAttribute("monto",montoInt);
                model.addAttribute("cuotas",cuotasInt);
                model.addAttribute("fecha",dmyFormat.format(fecha));
                model.addAttribute("seguro",seguro);
                model.addAttribute("precioSeguro",precioSeguro);
                model.addAttribute("interesMensual",interesMensual);
                model.addAttribute("interesAnual",simulador.tasaAnual(interesMensual));
                model.addAttribute("impuesto",impuesto);
                model.addAttribute("notario",notario);
                model.addAttribute("mtc",montoInt+precioSeguro+notario+impuesto);
                model.addAttribute("ctc",ctc);
                model.addAttribute("valorCuota",valorCuota);
                return "resultado";
            }
        }catch(Exception e){
            model.addAttribute("error",e);
            return "error";
        }
        
        
        
    }
}
