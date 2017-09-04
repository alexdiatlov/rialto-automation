package ua.com.rialtotenders.pageObjects;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;

    public BasePage (WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver(){
        return driver;
    }
// clicking on element
    public void clickTo(WebElement element) {
        element.click();
    }
    // typing text in field
    public void fill(WebElement element, String text) {
        waitUntilElementAppearVisible(element);
        element.sendKeys(text);
    }
    //flexible method for waiting untill ekement will be visible
    public WebElement waitUntilElementAppearVisible(WebElement webElement) {
        WebElement result;
        // @param timeOutInSeconds The timeout in seconds when an expectation is called
        // @param sleepInMillis The duration in milliseconds to sleep between polls.
        WebDriverWait driverWait = new WebDriverWait(driver, 60, 500);

        try {

            result = driverWait.until(ExpectedConditions.visibilityOf(webElement));

        } catch (TimeoutException timeException) {
            throw new TimeoutException(timeException.getMessage() +
                    "\nTimeOut while waitUntilElementAppearVisible " +
                    webElement.toString(), timeException.getCause());
        }
        return result;
    }

}