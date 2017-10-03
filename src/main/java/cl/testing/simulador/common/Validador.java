/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.testing.simulador.common;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Franco
 */
public class Validador {
    
    public boolean validaRut(String rut){
        boolean validacion = false;
        try {
        rut =  rut.toUpperCase();
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");
        int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

        char dv = rut.charAt(rut.length() - 1);

        int m = 0, s = 1;
        for (; rutAux != 0; rutAux /= 10) {
        s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
        }
        if (dv == (char) (s != 0 ? s + 47 : 75)) {
        validacion = true;
        }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
    public boolean validaMonto(int monto){
        return monto >= 506540 && monto <= 39990000;
    }

    public boolean validaCuota(int cuota) {
        return cuota >= 12 && cuota <= 60;
    }
    
    public boolean validaFechaPrimerVencimiento(Date fecha) {
        Date hoy = new Date();
        int dias_min, dias_max;
        Calendar calendar_min, calendar_max ;
        dias_min = 27;
        dias_max = 92;        
        calendar_min =  Calendar.getInstance();
        calendar_max = Calendar.getInstance();
        calendar_min.setTime(hoy);            
        calendar_min.add(Calendar.DAY_OF_YEAR, dias_min);
        calendar_max.setTime(hoy);            
        calendar_max.add(Calendar.DAY_OF_YEAR, dias_max);
        return fecha.after(calendar_min.getTime()) && fecha.before(calendar_max.getTime());
    }
    
    public boolean validaSeguro(String seguro) {
        return seguro.equals("protegido") || seguro.equals("desgravemen");
    }
    
    public boolean validaCaptcha(boolean captcha) {
        return captcha;
    }
}
