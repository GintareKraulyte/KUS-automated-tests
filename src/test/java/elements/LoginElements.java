package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class LoginElements extends DriverFactory {

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("//*[@id=\"auth-left\"]/a"));
    }

    public WebElement getLoginNameInputField() {
        return driver.findElement(By.name("loginfmt"));
    }

    public WebElement getPasswordInputField(){
        return driver.findElement(By.name("passwd"));
    }

    public WebElement getNext1Button(){
        return driver.findElement(By.cssSelector("#idSubmit_ProofUp_Redirect"));
    }
    public WebElement getNext2Button(){
        return driver.findElement(By.id("CancelLinkButton"));
    }

    public WebElement getSignInButton(){
        return driver.findElement(By.id("idSIButton9"));
//        return driver.findElement(By.cssSelector("input[value='Sign in']"));
    }

    public WebElement getNoStaySignInButton(){
        return driver.findElement(By.id("idBtn_Back"));
    }

    public WebElement getYesStaySignInButton(){
        return driver.findElement(By.id("idSIButton9"));
    }

    public WebElement getElement(){
        return driver.findElement(By.cssSelector(".pagination-view"));
    }

    public WebElement getUsernameError() {
        return driver.findElement(By.id("usernameError"));
    }

    public WebElement getPasswordError(){
        return driver.findElement(By.id("passwordError"));
    }
}
