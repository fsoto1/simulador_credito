/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.testing.simulador.common;

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
        if (monto >= 506540 && monto <= 39990000) {
            return true;
        }
        return false;
    }

    public boolean validaCuota(int couta) {
        if (couta >= 12 && couta <= 60) {
            return true;
        }
        return false;
    }
}
