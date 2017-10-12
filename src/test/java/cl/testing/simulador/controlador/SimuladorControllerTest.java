/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.testing.simulador.controlador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.ui.Model;

/**
 *
 * @author Franco
 */
public class SimuladorControllerTest {
    
    public SimuladorControllerTest() {
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
     * Test del validar de la clase SimuladorController.
     * Valida el ingreso por metodo GET.
     * Retorna la vista simulador.htm
     */
    @Test
    public void testValidar() {
        System.out.println("validar");
        SimuladorController instance = new SimuladorController();
        String expResult = "simulador";
        String result = instance.validar();
        assertEquals("El retorno por ingreso al sitio por metodo GET es simulador",expResult, result);
    }

}
