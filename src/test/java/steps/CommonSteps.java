package steps;

import elements.CommonElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class CommonSteps extends DriverFactory {

    private final CommonPage commonPage = new CommonPage();
    CommonElements commonElements = new CommonElements();

    @Given("I select {string}")
    public void iSelectBrowser(String browser) {
        setDriver(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://kitm-kus.herokuapp.com/");
    }

    @Given("Matomas modulių valdymas")
    public void matomasModuliuValdymas() {
        commonPage.matomasModuliuValdymas();
    }

    @When("Spaudžiama ant Modulių Valdymas")
    public void spaudžiamaAntTA() {
        commonPage.spaudžiamaAntTA();
    }

    @Then("Matomas puslapio pavadinimas")
    public void matomasPuslapioPavadinimas() {
        commonPage.matomasPuslapioPavadinimas();
    }

    @Given("paspaudžiama ant modulio apklausa")
    public void modulioApklausa() {
        commonPage.spaudziamaModulioApklausa();
    }

    @When("paspaudžiama ant pasirinkto modulio")
    public void spaudziamaAntModulio() throws InterruptedException {
        commonPage.spaudziamaAntModulio();
    }

    @Then("spaudžiama Užpildyti")
    public void spaudziamaUzpildyti() throws InterruptedException {
        commonPage.spaudziamaUzpildyti();
        Thread.sleep(4000);
    }

    @Then("supildoma dalinai anketa")
    public void supildytaAnketa(){
        commonPage.supildytaAnketa();
    }

    @Then("spaudžiama submit")
    public void spaudziamSubmit() {
        commonPage.spaudziamaSubmit();
    }
}


