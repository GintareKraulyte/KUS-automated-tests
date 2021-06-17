package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils extends DriverFactory{

    public static void waitUntilElementPresent(int timeout, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public static void waitUntilElementDisplayed(int timeout, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilElementIsClickable(int timeout, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public static void waitForElementRefresh(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(element)));
    }

    public static void waitForElementAttributeToBe(WebElement element, String attribute, String expectedValue) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.attributeToBe(element, attribute, expectedValue));
    }
}