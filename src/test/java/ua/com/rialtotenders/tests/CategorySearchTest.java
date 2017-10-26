package ua.com.rialtotenders.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ua.com.rialtotenders.pageObjects.SearchPage;

import java.util.Locale;

public class CategorySearchTest extends BaseTest {

    private SearchPage searchPage;

    @Before
    public void setUp() {
        getDriver().get("https://rialtotenders.com.ua");
    }

    @Test
    public void office_category_test() throws InterruptedException {
        searchPage = new SearchPage(getDriver());
        //LandingPage landingPage= new LandingPage(getDriver());
        //landingPage.clickTenderSearch();
        searchPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        searchPage.selectCategoryByText("Все для офісу");
        //Thread.sleep(2000);
        searchPage.clickNameTrendByOrderNumber(0);

       /* WebElement category = driver.findElement(By.cssSelector(".select-category > select"));
        Select select = new Select(category);
        select.selectByVisibleText("Все для офісу");*/
    }
}