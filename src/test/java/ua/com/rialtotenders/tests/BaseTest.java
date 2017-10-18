package ua.com.rialtotenders.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    private static ChromeOptions options;

    @BeforeClass
    public static void beforeClassFather () {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        options = new ChromeOptions();
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void afterClass (){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
