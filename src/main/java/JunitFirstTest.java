
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HeaderPage;
import static java.util.concurrent.TimeUnit.SECONDS;

public class JunitFirstTest {
    private static WebDriver driver;
    public HeaderPage headerPage;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        driver.get("https://rialtotenders.com.ua/");
    }

    @Test
    public void clickLogoTest() {
        headerPage.clickLogo();
    }

    @Test
    public void clickAboutTest() {
        headerPage.clickAbout();
    }

    @Test
    public void clickBuyersTest () {
        headerPage.clickBuyers();
    }

}



