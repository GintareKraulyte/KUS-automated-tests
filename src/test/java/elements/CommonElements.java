package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class CommonElements extends DriverFactory {

    public WebElement getMatomasModuliuValdymas(){
        return driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div"));
    }

    public WebElement getModuliuValdymas(){
        //return driver.findElement(By.xpath("#sidebar > div > div.sidebar-menu > ul > li:nth-child(11) > a"));
        return driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div[2]/ul/li[10]/a/span"));
    }

    public WebElement getPuslapioPavadinimas(){
        return driver.findElement(By.cssSelector("#main > div:nth-child(1) > h3"));
    }

    public WebElement getModulioApklausa() {
        return driver.findElement(By.cssSelector("#sidebar > div > div.sidebar-menu > ul > li:nth-child(2) > a > span"));
    }

    public WebElement getModulis(){
        //return driver.findElement(By.cssSelector("#flush-heading1 > button"));
        return driver.findElement(By.cssSelector("#flush-heading3 > button"));
    }

    public WebElement getUzpildyti(){
        return driver.findElement(By.cssSelector(".card-link"));
    }

    public WebElement getKlausimas1(){ return driver.findElement(By.id("25")); }

    public WebElement getKlausimas2(){ return driver.findElement(By.id("inlineRadio1")); }

    public WebElement getKlausimas3(){ return driver.findElement(By.id("inlineRadioExt")); }

    public WebElement getKlausimas4(){ return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[2]/form/div[4]/div[2]/div/textarea")); }

    public WebElement getKlausimas5(){ return driver.findElement(By.id("inlineRadioExt2")); }

    public WebElement getSubmit(){return driver.findElement(By.cssSelector("#main > div > div > div.page-content.formBody.col-12.justify-content-center > form > button"));}
}
