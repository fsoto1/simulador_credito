/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.testing.simulador.common;

import java.util.Calendar;
import java.util.Date;
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
    public void testValidaCuota1() {
        System.out.println("validaCuota1");
        int cuota = 11;
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaCuota(cuota);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaCuota2() {
        System.out.println("validaCuota2");
        int cuota = 61;
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaCuota(cuota);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaCuota3() {
        System.out.println("validaCuota3");
        int cuota = 12;
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaCuota(cuota);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaCuota4() {
        System.out.println("validaCuota4");
        int cuota = 60;
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaCuota(cuota);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaFechaPrimerVencimiento1() {
        System.out.println("validaFechaPrimerVencimiento1");
        Date fecha = new Date();
        int dias = 27;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);            
        calendar.add(Calendar.DAY_OF_YEAR, dias);
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaFechaPrimerVencimiento(fecha);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaFechaPrimerVencimiento2() {
        System.out.println("validaFechaPrimerVencimiento2");
        Date fecha = new Date();
        int dias = 92;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);            
        calendar.add(Calendar.DAY_OF_YEAR, dias);
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaFechaPrimerVencimiento(calendar.getTime());
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaFechaPrimerVencimiento3() {
        System.out.println("validaFechaPrimerVencimiento3");
        Date fecha = new Date();
        int dias = 28;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);            
        calendar.add(Calendar.DAY_OF_YEAR, dias);
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaFechaPrimerVencimiento(calendar.getTime());
        System.out.println(fecha.toString());
        System.out.println(calendar.getTime().toString());
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaFechaPrimerVencimiento4() {
        System.out.println("validaFechaPrimerVencimiento4");
        Date fecha = new Date();
        int dias = 91;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);            
        calendar.add(Calendar.DAY_OF_YEAR, dias);
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaFechaPrimerVencimiento(calendar.getTime());
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaSeguro1() {
        System.out.println("validaSeguro1");
        String seguro = "protegido";
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaSeguro(seguro);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaSeguro2() {
        System.out.println("validaSeguro2");
        String seguro = "desgravemen";
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaSeguro(seguro);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaSeguro3() {
        System.out.println("validaSeguro3");
        String seguro = "ninguno";
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaSeguro(seguro);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaCaptcha1() {
        System.out.println("validaCaptcha1");
        Boolean captcha = false;
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaCaptcha(captcha);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidaCaptcha2() {
        System.out.println("validaCaptcha2");
        Boolean captcha = true;
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaCaptcha(captcha);
        assertEquals(expResult, result);
    }
    
}
