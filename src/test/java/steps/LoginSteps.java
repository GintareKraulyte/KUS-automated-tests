package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.DriverFactory;

import static org.junit.Assert.assertTrue;


public class LoginSteps extends DriverFactory {

    LoginPage loginPage = new LoginPage();

    @Then("user clicks login button")
    public void clicksOnLoginButton() {
        loginPage.clickOnLogin();
    }

    @Then("user enters login name {string}")
    public void openHomePage(String username) {
        loginPage.enterLoginName(username);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String password){
        loginPage.enterLoginPassword(password);
    }

    @And("user clicks NO button in the do you want to stay logged in Modal")
    public void userClickNoStaySignIn(){
        loginPage.clickNoStaySignInButton();
    }

    @Then("user clicks Next 2 buttons")
    public void clicksOnNextButton() throws InterruptedException {
        loginPage.clickOnNext();
    }

    @And("user clicks Yes button in the do you want to stay logged in Modal")
    public void userClickYesStaySignIn(){
        loginPage.clickYesStaySignInButton();
    }

    @Then("user name error is displayed on login modal")
    public void usernameErrorIsDisplayedOnLoginModal() {
        boolean errorIsDisplayed = loginPage.usernameErrorIsDisplayed();
        assertTrue("Error was not displayed", errorIsDisplayed);
    }

    @Then("user password error is displayed on login modal")
    public void userPasswordErrorIsDisplayedOnLoginModal() {
        boolean errorIsDisplayed = loginPage.userPasswordErrorIsDisplayed();
        assertTrue("Error was not displayed", errorIsDisplayed);
    }
}
