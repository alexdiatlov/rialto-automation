package ua.com.rialtotenders.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    private static WebDriver driver;

    @BeforeClass

    public static void beforeClassFather () {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
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
