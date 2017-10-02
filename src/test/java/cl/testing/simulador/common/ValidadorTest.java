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
public class ValidadorTest {
    
    public ValidadorTest() {
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
     * Test of validaRut method, of class Validador.
     */
    @Test
    public void testValidaRut1() {
        System.out.println("validaRut1");
        String rut = "99.999-9";
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaRut(rut);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaRut2() {
        System.out.println("validaRut2");
        String rut = "10.000.000.000-0";
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaRut(rut);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaRut3() {
        System.out.println("validaRut3");
        String rut = "000.000-0";
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaRut(rut);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaRut4() {
        System.out.println("validaRut4");
        String rut = "99.999.999-9";
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaRut(rut);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaMonto1() {
        System.out.println("validaMonto1");
        int monto = 506539;
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaMonto(monto);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaMonto2() {
        System.out.println("validaMonto2");
        int monto = 39990001;
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaMonto(monto);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaMonto3() {
        System.out.println("validaMonto3");
        int monto = 506540;
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaMonto(monto);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaMonto4() {
        System.out.println("validaMonto4");
        int monto = 39990000;
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaMonto(monto);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaCouta1() {
        System.out.println("validaCouta1");
        int couta = 11;
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaCuota(couta);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaCouta2() {
        System.out.println("validaCouta2");
        int couta = 61;
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaCuota(couta);
        assertEquals(expResult, result);
    }
    
}
