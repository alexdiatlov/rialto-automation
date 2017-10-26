package ua.com.rialtotenders.pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class BasePage {

    private WebDriver driver;

    public BasePage (WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver(){
        return driver;
    }
// clicking on element
    public void clickTo(WebElement element){
        waitLoadingProcess();
        waitUntilElementAppearVisible(element);
        element.click();
    }

    // typing text in field
    public void fill(WebElement element, String text) {
        waitLoadingProcess();
        waitUntilElementAppearVisible(element);
        element.sendKeys(text);
    }

    //flexible method for waiting untill ekement will be visible
    public void waitUntilElementAppearVisible(WebElement webElement) {
        // @param timeOutInSeconds The timeout in seconds when an expectation is called
        // @param sleepInMillis The duration in milliseconds to sleep between polls.
        FluentWait<WebDriver> driverWait = new WebDriverWait(driver, 60, 500);
                //.ignoring(StaleElementReferenceException.class);
        driverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilElementClickable(WebElement webElement) {
        FluentWait<WebDriver> driverWait = new WebDriverWait(driver, 60, 500)
                .ignoring(StaleElementReferenceException.class);
        driverWait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void waitUntilElementStale(WebElement webElement) {
        FluentWait<WebDriver> driverWait = new WebDriverWait(driver, 60, 500)
                .ignoring(StaleElementReferenceException.class);
        driverWait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void waitUntilElementDisappear(By by) {
        WebDriverWait driverWait = new WebDriverWait(driver, 60, 500);
        driverWait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }


    public boolean isTitleEqualFor(String title, WebElement element, String tagName) {
        boolean result = false;
        List<WebElement> webElementList = element.findElements(By.tagName(tagName));

        for (int i = 0; i < webElementList.size(); i++) {
            String currentText = webElementList.get(i).getText();
            if (currentText.equals(title)) {
                result = true;
                break;
            }
        }

        return result;
    }

    public void waitLoadingProcess() {
        By by = By.id("overlay");
        if (isElementPresentNotWait(by)) {
           waitUntilElementDisappear(by);
        }
    }

    private boolean isElementPresentNotWait(By by) {
        //TODO add method to BASETEST
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try {
            getDriver().findElement(by).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        } catch (StaleElementReferenceException e) {
            return false;
        } finally {
            getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

    }
}
