package pages;

import elements.LoginElements;
import org.openqa.selenium.Keys;

import static utils.WaitUtils.*;

public class LoginPage {
    LoginElements loginElements = new LoginElements();

    public void clickOnLogin(){
        loginElements.getLoginButton().click();
    }

    public void enterLoginName(String username) {
        //waitUntilElementIsClickable(3, loginElements.getLoginNameInputField());
        loginElements.getLoginNameInputField().sendKeys(username);
        loginElements.getLoginNameInputField().sendKeys(Keys.ENTER);
        //waitForElementRefresh(loginElements.getSignInButton(), 5);
    }

    public void enterLoginPassword(String password) {
        String expectedValue = "pagination-view animate has-identity-banner slide-in-next";
        waitForElementAttributeToBe(loginElements.getElement(), "class", expectedValue);
        //waitUntilElementIsClickable(3, loginElements.getPasswordInputField());
        loginElements.getPasswordInputField().sendKeys(password);
        //waitUntilElementIsClickable(3,loginElements.getSignInButton());
        loginElements.getSignInButton().click();
    }

    public void clickOnNext() throws InterruptedException {

        loginElements.getNext1Button().click();
        Thread.sleep(3000);
        loginElements.getNext2Button().click();
        Thread.sleep(5000);
    }

    public void clickNoStaySignInButton(){
        loginElements.getNoStaySignInButton().click();
    }

    public void clickYesStaySignInButton(){
        loginElements.getYesStaySignInButton().click();
    }

    public boolean usernameErrorIsDisplayed(){
        return loginElements.getUsernameError().isDisplayed();
    }

    public boolean userPasswordErrorIsDisplayed() {
        return loginElements.getPasswordError().isDisplayed();
    }

}
