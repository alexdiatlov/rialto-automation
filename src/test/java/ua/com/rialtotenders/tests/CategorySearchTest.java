package ua.com.rialtotenders.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import ua.com.rialtotenders.pageObjects.MainPage;
import ua.com.rialtotenders.pageObjects.SearchPage;
import ua.com.rialtotenders.pageObjects.TenderPage;

import java.util.Locale;

public class CategorySearchTest extends BaseTest {

    private SearchPage searchPage;
    private MainPage mainPage;
    private TenderPage tenderPage;
    private String[] cpvCodesOffice = {"79000000-1","79000000-2","79000000-3","79000000-43","79000000-5"};

    @Before
    public void setUp() {
        getDriver().get("https://rialtotenders.com.ua");
    }

    @Test
    public void office_category_test() {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        searchPage.selectCategoryByText("Все для офісу");
        searchPage.clickNameTrendByOrderNumber(0);
        tenderPage = new TenderPage(getDriver());
        Assert.assertTrue("CPV code is not correct", tenderPage.isCPVCodeMatchWith(cpvCodesOffice) );
    }

       /* WebElement category = driver.findElement(By.cssSelector(".select-category > select"));
        Select select = new Select(category);
        select.selectByVisibleText("Все для офісу");*/

    @Test
    public void computer_category_tender_test() {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        searchPage.getCategorySelectBox().selectByVisibleText("Комп'ютери та програми");

        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("CPV code is not correct", driver.findElement(By.cssSelector(".sb-table__text--small")).getText().contains("30200000-1"));
    }

    @Test
    public void products_tender_category() throws InterruptedException {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        searchPage.getCategorySelectBox().selectByVisibleText("Продукти харчування");
        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("CPV code is not correct", driver.findElement(By.cssSelector(".sb-table__text--small")).getText().contains("15000000-8"));
    }

    @Test
    public void agro_products_tender_category_test() {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        searchPage.getCategorySelectBox().selectByVisibleText("Сільськогосподарська продукція");

        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("CPV code is not correct", driver.findElement(By.cssSelector(".sb-table__text--small")).getText().contains("15000000-8"));
    }

    @Test
    public void agro_technic_tender_category_test() {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        searchPage.getCategorySelectBox().selectByVisibleText("Сільськогосподарська техніка");
        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("CPV code is not correct", driver.findElement(By.cssSelector(".sb-table__text--small")).getText().contains("16700000-2"));
    }
}