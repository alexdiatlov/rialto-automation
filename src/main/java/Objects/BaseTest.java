package Objects;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static java.util.concurrent.TimeUnit.SECONDS;


public class BaseTest {
    private static WebDriver driver;

    @BeforeClass
    public static void baseClassParent() {
        System.out.println("beforeClassParent");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
    }

    @AfterClass
    public static void afterClass() {
        driver.quit();
    }
}