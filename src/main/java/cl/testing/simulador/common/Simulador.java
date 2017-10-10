/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.testing.simulador.common;

import java.util.Date;

/**
 *
 * @author Franco
 */
public class Simulador {
    
    public int calcular(int monto, int cuotas, double interesMensual){
        return (int)(monto/((1/(interesMensual/100))*(1-1/Math.pow(1+(interesMensual/100),cuotas))));
    }
    
    
    public double tasaAnual(double interesMensual){
        return interesMensual*12;
    }
    
}
