package ua.com.rialtotenders.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ua.com.rialtotenders.pageObjects.MainPage;
import ua.com.rialtotenders.pageObjects.SearchPage;

import java.util.Locale;

public class CategorySearchTest extends BaseTest {

    private SearchPage searchPage;
    private MainPage mainPage;

    @Before
    public void setUp() {
        getDriver().get("https://rialtotenders.com.ua");
    }

    @Test
    public void office_category_tender_test() throws InterruptedException {

        mainPage = new MainPage(getDriver());
        //LandingPage landingPage= new LandingPage(getDriver());
        //landingPage.clickTenderSearch();
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        searchPage.getCategorySelectBox().selectByVisibleText("Все для офісу");
        Thread.sleep(2000);
        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("CPV code is not correct", driver.findElement(By.cssSelector(".sb-table__text--small")).getText().contains("30000000-9"));

       /* WebElement category = driver.findElement(By.cssSelector(".select-category > select"));
        Select select = new Select(category);
        select.selectByVisibleText("Все для офісу");*/
    }

    @Test
    public void computer_category_tender_test() throws InterruptedException {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        searchPage.getCategorySelectBox().selectByVisibleText("Комп'ютери та програми");
        Thread.sleep(2000);
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
        Thread.sleep(2000);
        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("CPV code is not correct", driver.findElement(By.cssSelector(".sb-table__text--small")).getText().contains("15000000-8"));
    }

    @Test
    public void agro_products_tender_category_test() throws InterruptedException {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        searchPage.getCategorySelectBox().selectByVisibleText("Сільськогосподарська продукція");
        Thread.sleep(2000);
        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("CPV code is not correct", driver.findElement(By.cssSelector(".sb-table__text--small")).getText().contains("15000000-8"));
    }

    @Test
    public void agro_technic_tender_category_test() throws InterruptedException {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        searchPage.getCategorySelectBox().selectByVisibleText("Сільськогосподарська техніка");
        Thread.sleep(2000);
        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("CPV code is not correct", driver.findElement(By.cssSelector(".sb-table__text--small")).getText().contains("16700000-2"));
    }

    @Test
    public void office_category_plan_test() throws InterruptedException {
        mainPage = new MainPage(getDriver());
        mainPage.clickPlanSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.getCategorySelectBox().selectByVisibleText("Все для офісу");
Thread.sleep(2000);
        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("CPV code is not correct",driver.findElement(By.cssSelector(".sb-table__table-row--pt0")).getText().contains("39260000-2"));
    }

    @Test
    public void computers_category_plan_test() throws InterruptedException {
        mainPage = new MainPage(getDriver());
        mainPage.clickPlanSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.getCategorySelectBox().selectByVisibleText("Комп'ютери та програми");
        Thread.sleep(2000);
        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("CPV code is not correct",driver.findElement(By.cssSelector(".sb-table__table-row--pt0")).getText().contains("32551300-3"));
    }

    @Test
    public void products_category_plan_test() throws InterruptedException {
        mainPage = new MainPage(getDriver());
        mainPage.clickPlanSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.getCategorySelectBox().selectByVisibleText("Продукти харчування");
        Thread.sleep(2000);
        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("CPV code is not correct",driver.findElement(By.cssSelector(".sb-table__table-row--pt0")).getText().contains("15000000-8"));
    }

    @Test
    public void agro_products_category_plan_test() throws InterruptedException {
        mainPage = new MainPage(getDriver());
        mainPage.clickPlanSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.getCategorySelectBox().selectByVisibleText("Продукти харчування");
        Thread.sleep(2000);
        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("CPV code is not correct",driver.findElement(By.cssSelector(".sb-table__table-row--pt0")).getText().contains("15000000-8"));
    }


}