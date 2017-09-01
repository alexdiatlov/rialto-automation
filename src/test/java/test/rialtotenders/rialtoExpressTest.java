import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static java.util.concurrent.TimeUnit.SECONDS;

public class rialtoExpressTest {

    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, SECONDS);
        driver.get("https://rialtotenders.com.ua/");
    }

    @Test
    public void checkTender() {

        WebElement tender = driver.findElement(By.className("active"));
        tender.click();

        WebElement clearFilter = driver.findElement(By.className("sb-f__clear-button"));
        clearFilter.click();

        WebElement searchInputField = driver.findElement(By.id("query"));
        searchInputField.sendKeys("R-UA-2017-08-11-000002");

        WebElement searchButton = driver.findElement(By.id("search_button_simple"));
        searchButton.click();

        WebElement testtender = driver.findElement(By.cssSelector("a[href='/tender/R-UA-2017-08-11-000002/']"));
        testtender.click();

    }

    @Test
    public void checkPlan() throws InterruptedException {

        WebElement plan = driver.findElement(By.cssSelector("a[href='/plan/search']"));
        plan.click();

        WebElement searchField = driver.findElement(By.id("query"));
        searchField.sendKeys("R-UA-P-2017-08-01-000001");

        WebElement searchB = driver.findElement(By.id("search_button_simple"));
        searchB.click();

        Thread.sleep(5000);
        WebElement testplan = driver.findElement(By.cssSelector("a[href='/plan/R-UA-P-2017-08-01-000001/']"));
        testplan.click();

        WebElement clickMainPage = driver.findElement(By.className("c-header__logo"));
        clickMainPage.click();
    }
}
























