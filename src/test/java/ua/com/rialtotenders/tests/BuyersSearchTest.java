package ua.com.rialtotenders.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import ua.com.rialtotenders.pageObjects.MainPage;
import ua.com.rialtotenders.pageObjects.SearchPage;

public class BuyersSearchTest extends BaseTest {

    private SearchPage searchPage;
    private MainPage mainPage;

    @Before
    public void setUp() {
        getDriver().get("https://rialtotenders.com.ua");
    }

    @Test
    public void buyers_tender_search_test() {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        searchPage.fillBuyersSearchFilterInputField("Державне підприємство \"Укроборонсервіс\"");
;
        searchPage.selectBuyersSearchFilter("Державне підприємство \"Укроборонсервіс\"");


        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("Buyer name is not matched",driver.findElement(By.className("sb-icon-and-text__item")).getText().contains("Державне підприємство \"Укроборонсервіс\""));
    }

    @Test
    public void buyers_plan_search_test() {
        mainPage = new MainPage(getDriver());
        mainPage.clickPlanSearch();

        searchPage = new SearchPage(getDriver());

        searchPage.fillBuyersSearchFilterInputField("ТОВ \"ТАС ЛІНК\"");
        searchPage.selectBuyersSearchFilter("ТОВ \"ТАС ЛІНК\"");

        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("Buyer name is not matched",driver.findElement(By.className("sb-icon-and-text__item")).getText().contains("ТОВ \"ТАС ЛІНК\""));

    }


}
