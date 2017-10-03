package ua.com.rialtotenders.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    public Select select;

    @BeforeClass

    public static void beforeClassFather () {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    //select method
    public Select getSelect(WebElement element) {
        select = new Select(element);
        return select;
    }

    //@AfterClass

    //public static void afterClass (){
        //driver.quit();
    //}

    public static WebDriver getDriver(){
        return driver;
    }

}
