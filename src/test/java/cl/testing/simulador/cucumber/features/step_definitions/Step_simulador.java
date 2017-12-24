/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.testing.simulador.cucumber.features.step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Frances
 */
public class Step_simulador {

    WebDriver driver = null;

    @Given("Yo ingreso al simulador")
    public void yo_ingreso_al_simulador() {
        System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
        try {
            driver = new ChromeDriver();
            driver.get("http://localhost:8080/Simulador/simulador.htm");

        } catch (Exception e) {
            driver.close();
        }

    }

    @When("^Yo ingreso un rut \"([^\"]*)\"$")
    public void yo_ingreso_un_rut(String rut) throws Throwable {
        WebElement input = driver.findElement(By.id("rut"));
        input.sendKeys(rut);
        Thread.sleep(1000);
    }

    @And("^Yo ingreso un monto \"([^\"]*)\"$")
    public void yo_ingreso_un_monto_valido(String monto) {
        WebElement input = driver.findElement(By.id("monto"));
        input.sendKeys(monto);
    }

    @When("^Yo ingreso un plazo \"([^\"]*)\"$")
    public void yo_ingreso_un_plazo_valido(String plazo) throws Throwable {
        WebElement input = driver.findElement(By.id("cuotas"));
        input.sendKeys(plazo);
    }

    @When("^Yo ingreso una fecha valida \"([^\"]*)\"$")
    public void yo_ingreso_una_fecha_valida(String fecha) throws Throwable {
        WebElement input = driver.findElement(By.id("vencimiento"));
        input.sendKeys(fecha);
    }

    @When("^Yo selecciono un seguro \"([^\"]*)\"$")
    public void yo_selecciono_un_seguro(String seguro) throws Throwable {
        WebElement radio = driver.findElement(By.id(seguro));
        radio.click();
    }

    @When("^Yo oprimo el botón simular$")
    public void yo_oprimo_el_botón_simular() throws Throwable {
        WebElement botonSimular = driver.findElement(By.id("simular"));
        botonSimular.submit();
        Thread.sleep(5000);
    }

    @Then("^Simulo correctamente (\\d+)$")
    public void simulo_correctamente(int vCuota) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement cuota = driver.findElement(By.id("cuota"));
        wait.until(ExpectedConditions.visibilityOf(cuota));
        int valorCuota = Integer.parseInt(cuota.getText());
        Assert.assertEquals("La cuota dada:"+vCuota+" debe ser igual a: "+ valorCuota,vCuota, valorCuota);
    }
}
