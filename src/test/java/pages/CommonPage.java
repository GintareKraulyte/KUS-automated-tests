package pages;

import elements.CommonElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.DriverFactory;

import static org.junit.Assert.assertTrue;
import static utils.WaitUtils.waitUntilElementDisplayed;

public class CommonPage extends DriverFactory {

    private final CommonElements commonElements = new CommonElements();

    public void matomasModuliuValdymas(){
        WebElement element = commonElements.getMatomasModuliuValdymas();
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        boolean moduliuValdymas = commonElements.getMatomasModuliuValdymas().isDisplayed();
        assertTrue("Modulių valdymas nematomas", moduliuValdymas);
    }

    public void spaudžiamaAntTA(){
        WebElement element = commonElements.getModuliuValdymas();
        element.click();
    }

    public void matomasPuslapioPavadinimas(){
        boolean puslapioPavadinimas = commonElements.getPuslapioPavadinimas().isDisplayed();
        assertTrue("Puslapis nerodomas.", puslapioPavadinimas);
    }

    public void spaudziamaModulioApklausa(){
        WebElement apklausa = commonElements.getModulioApklausa();
        apklausa.click();
    }

    public void spaudziamaAntModulio() throws InterruptedException {
        waitUntilElementDisplayed(3000, commonElements.getModulis());
        WebElement modulis = commonElements.getModulis();
        modulis.click();
        Thread.sleep(3000);
    }

    public void spaudziamaUzpildyti(){
        WebElement uzpildyti = commonElements.getUzpildyti();
        uzpildyti.click();
    }

    public void supildytaAnketa(){
        WebElement klausimas1 = commonElements.getKlausimas1();
        WebElement klausimas2 = commonElements.getKlausimas2();
        WebElement klausimas3 = commonElements.getKlausimas3();
        WebElement klausimas4 = commonElements.getKlausimas4();
        WebElement klausimas5 = commonElements.getKlausimas5();
        klausimas1.click();
        WebElement element = commonElements.getKlausimas2();
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        klausimas2.click();
        WebElement element2 = commonElements.getKlausimas3();
        Actions actions2 = new Actions(driver);
        actions.moveToElement(element2);
        actions2.perform();
        klausimas3.click();
        WebElement element3 = commonElements.getKlausimas4();
        Actions actions3 = new Actions(driver);
        actions.moveToElement(element3);
        actions3.perform();
        klausimas4.sendKeys("Neturiu Jokių.");
        WebElement element4 = commonElements.getKlausimas5();
        Actions actions4 = new Actions(driver);
        actions.moveToElement(element4);
        actions4.perform();
        klausimas5.click();
    }

    public void spaudziamaSubmit(){
        WebElement submit = commonElements.getSubmit();
        submit.click();
    }

}
