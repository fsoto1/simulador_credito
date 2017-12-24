/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.testing.simulador.cucumber;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 *
 * @author Frances
 */
@RunWith(Cucumber.class)
@CucumberOptions(
    //format = {"pretty", "json:target/"},
    format = {"pretty", "json:web/cucumber.json"},
    features = {"src/test/java/cl/testing/simulador/cucumber/features/simulador.feature"}
)
public class CucumberSimuladorTest {
    
}
