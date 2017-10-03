package ua.com.rialtotenders.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.com.rialtotenders.pageObjects.SearchPage;

import java.util.Locale;

public class CategorySearchTest extends BaseTest {

    private SearchPage searchPage;

    @Before
    public void setUp() {
        getDriver().get("https://rialtotenders.com.ua");
    }

    /*@Test
    public void office_category_test() {
        searchPage = new SearchPage(getDriver());
        searchPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        WebElement category;
        category = driver.findElement(By.className("select-category")).click();

        getSelect(category);
        select.selectByVisibleText("Все для офісу");
    }*/
}