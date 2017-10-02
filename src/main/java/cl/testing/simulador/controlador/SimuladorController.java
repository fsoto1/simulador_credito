/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.testing.simulador.controlador;

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
    public String recibir(@RequestParam("rut") String rut, Model model){
        System.out.println(rut);
        if(rut.trim().equals("")){
            String mensaje = "Campos vacios";
            model.addAttribute("error",mensaje);
            return "error";
        }else{
            return "index";
        }
        
    }
}
