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
     * Test del método validaRut
     * Valida el mínimo rut falso
     * Caso de prueba cp_val_rut01
     */
    @Test
    public void testValidaRut1() {
        System.out.println("validaRut1");
        String rut = "99.999-9";
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaRut(rut);
        assertEquals("El rut 99.999-9 debe ser falso",expResult, result);
    }
    
    /**
     * Test del método validaRut
     * Valida el máximo rut falso
     * Caso de prueba cp_val_rut02
     */
    @Test
    public void testValidaRut2() {
        System.out.println("validaRut2");
        String rut = "10.000.000.000-0";
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaRut(rut);
        assertEquals("El rut 10.000.000.000-0 debe ser falso",expResult, result);
    }
    
    /**
     * Test del método validaRut
     * Valida el mínimo rut verdadero
     * Caso de prueba cp_val_rut03
     */
    @Test
    public void testValidaRut3() {
        System.out.println("validaRut3");
        String rut = "000.000-0";
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaRut(rut);
        assertEquals("El rut 000.000-0 debe ser verdadero",expResult, result);
    }
    
    /**
     * Test del método validaRut
     * Valida el máximo rut verdadero
     * Caso de prueba cp_val_rut04
     */
    @Test
    public void testValidaRut4() {
        System.out.println("validaRut4");
        String rut = "99.999.999-9";
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaRut(rut);
        assertEquals("El rut 99.999.999-9 debe ser verdadero",expResult, result);
    }
    
    /**
     * Test del método validaMonto
     * Valida el minimo monto falso
     * Caso de prueba cp_val_mon01
     */    
    @Test
    public void testValidaMonto1() {
        System.out.println("validaMonto1");
        int monto = 506539;
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaMonto(monto);
        assertEquals("El monto 506539 debe ser falso",expResult, result);
    }
    
    /**
     * Test del método validaMonto
     * Valida el máximo monto falso
     * Caso de prueba cp_val_mon02
     */ 
    @Test
    public void testValidaMonto2() {
        System.out.println("validaMonto2");
        int monto = 39990001;
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaMonto(monto);
        assertEquals("El monto 39990001 debe ser falso",expResult, result);
    }
    
    /**
     * Test del método validaMonto
     * Valida el minimo monto verdadero
     * Caso de prueba cp_val_mon03
     */ 
    @Test
    public void testValidaMonto3() {
        System.out.println("validaMonto3");
        int monto = 506540;
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaMonto(monto);
        assertEquals("El monto 506540 debe ser verdadero",expResult, result);
    }
    
    /**
     * Test del método validaMonto
     * Valida el maximo monto verdadero
     * Caso de prueba cp_val_mon04
     */ 
    @Test
    public void testValidaMonto4() {
        System.out.println("validaMonto4");
        int monto = 39990000;
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaMonto(monto);
        assertEquals("El monto 39990000 debe ser verdadero",expResult, result);
    }
    
    /**
     * Test del método validaCuota
     * Valida la minima cuota falsa
     * Caso de prueba cp_val_pct01
     */ 
    @Test
    public void testValidaCuota1() {
        System.out.println("validaCuota1");
        int cuota = 11;
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaCuota(cuota);
        assertEquals("El numero de cuotas 11 debe ser falso",expResult, result);
    }
    
    /**
     * Test del método validaCuota
     * Valida la maxima cuota falsa
     * Caso de prueba cp_val_pct02
     */ 
    @Test
    public void testValidaCuota2() {
        System.out.println("validaCuota2");
        int cuota = 61;
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaCuota(cuota);
        assertEquals("El numero de cuotas 61 debe ser falso",expResult, result);
    }
    
    /**
     * Test del método validaCuota
     * Valida la minima cuota verdadera
     * Caso de prueba cp_val_pct03
     */ 
    @Test
    public void testValidaCuota3() {
        System.out.println("validaCuota3");
        int cuota = 12;
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaCuota(cuota);
        assertEquals("El numero de cuotas 12 debe ser verdadero",expResult, result);
    }
    
    /**
     * Test del método validaCuota
     * Valida la maxima cuota verdadera
     * Caso de prueba cp_val_pct04
     */ 
    @Test
    public void testValidaCuota4() {
        System.out.println("validaCuota4");
        int cuota = 60;
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaCuota(cuota);
        assertEquals("El numero de cuotas 60 debe ser verdadero",expResult, result);
    }
    
    /**
     * Test del método validaFechaPrimerVencimiento
     * Valida la minima fecha de primer vencimiento falsa
     * Caso de prueba cp_val_fpv01
     */ 
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
        assertEquals("La fecha despues de 27 días desde la fecha del sistema debe ser falso",expResult, result);
    }
    
    /**
     * Test del método validaFechaPrimerVencimiento
     * Valida la maxima fecha de primer vencimiento falsa
     * Caso de prueba cp_val_fpv02
     */ 
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
        assertEquals("La fecha despues de 92 días desde la fecha del sistema debe ser falso",expResult, result);
    }
    
    /**
     * Test del método validaFechaPrimerVencimiento
     * Valida la minima fecha de primer vencimiento verdadera
     * Caso de prueba cp_val_fpv03
     */ 
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
        assertEquals("La fecha despues de 28 días desde la fecha del sistema debe ser verdadero",expResult, result);
    }
    
    /**
     * Test del método validaFechaPrimerVencimiento
     * Valida la maxima fecha de primer vencimiento verdadera
     * Caso de prueba cp_val_fpv04
     */ 
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
        assertEquals("La fecha despues de 91 días desde la fecha del sistema debe ser verdadero",expResult, result);
    }
    
    /**
     * Test del método validaSeguro
     * Valida el nombre del seguro protegido
     * Caso de prueba cp_val_seg01
     */ 
    @Test
    public void testValidaSeguro1() {
        System.out.println("validaSeguro1");
        String seguro = "protegido";
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaSeguro(seguro);
        assertEquals("El nombre de seguro protegido debe ser verdadero",expResult, result);
    }
    
    /**
     * Test del método validaSeguro
     * Valida el nombre del seguro desgravemen
     * Caso de prueba cp_val_seg02
     */ 
    @Test
    public void testValidaSeguro2() {
        System.out.println("validaSeguro2");
        String seguro = "desgravemen";
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaSeguro(seguro);
        assertEquals("El nombre de seguro desgravemen debe ser verdadero",expResult, result);
    }
    
    /**
     * Test del método validaSeguro
     * Valida el nombre del seguro no es protegido ni desgravemen
     * Caso de prueba cp_val_seg03
     */ 
    @Test
    public void testValidaSeguro3() {
        System.out.println("validaSeguro3");
        String seguro = "ninguno";
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaSeguro(seguro);
        assertEquals("El nombre de otro seguro que no sea protegido o desgravemen debe ser falso",expResult, result);
    }
    
    /**
     * Test del método validaCaptcha
     * Valida que el captcha esta en estado falso
     * Caso de prueba cp_val_cap02
     */ 
    @Test
    public void testValidaCaptcha1() {
        System.out.println("validaCaptcha1");
        Boolean captcha = false;
        Validador instance = new Validador();
        boolean expResult = false;
        boolean result = instance.validaCaptcha(captcha);
        assertEquals("El captcha debe ser verdadero",expResult, result);
    }
    
    /**
     * Test del método validaCaptcha
     * Valida que el captcha esta en estado verdadero
     * Caso de prueba cp_val_cap01
     */     
    @Test
    public void testValidaCaptcha2() {
        System.out.println("validaCaptcha2");
        Boolean captcha = true;
        Validador instance = new Validador();
        boolean expResult = true;
        boolean result = instance.validaCaptcha(captcha);
        assertEquals("El captcha debe ser falso",expResult, result);
    }
    
}
