/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.testing.simulador.common;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Franco
 */
public class SimuladorTest {
    
    public SimuladorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test del método calcular
     * Calcula la cuota mensual del crédito según el monto, tasa de interes mensual y numero de cuotas ingresadas
     */
    @Test
    public void testCalcular1() {
        System.out.println("calcular1");
        int monto = 600000;
        int cuotas = 13;
        double interesMensual = 1.02;
        Simulador instance = new Simulador();
        int expResult = 49516;
        int result = instance.calcular(monto, cuotas, interesMensual);
        assertEquals("El monto 600000, numero de cuotas 13 e interes mensual 1.02 debe dar una cuota mensual de 49516",expResult, result);
    }
    
    /**
     * Test del método calcular
     * Calcula la cuota mensual del crédito según el monto, tasa de interes mensual y numero de cuotas ingresadas
     */
    @Test
    public void testCalcular2() {
        System.out.println("calcular2");
        int monto = 32500000;
        int cuotas = 57;
        double interesMensual = 1.02;
        Simulador instance = new Simulador();
        int expResult = 754719;
        int result = instance.calcular(monto, cuotas, interesMensual);
        assertEquals("El monto 32500000, numero de cuotas 57 e interes mensual 1.02 debe dar una cuota mensual de 754719",expResult, result);
    }
    
    /**
     * Test del método calcular
     * Calcula la tasa anual según el interes mensual ingresado
     */
    @Test
    public void testTasaAnual() {
        System.out.println("tasaAnual");
        double interesMensual = 1.02;
        Simulador instance = new Simulador();
        double expResult = 12.24;
        double result = instance.tasaAnual(interesMensual);
        assertEquals("El interes mensual 1.02 debe dar una tasa anual de 12.24",expResult, result, 0.0);
    }
    
}
