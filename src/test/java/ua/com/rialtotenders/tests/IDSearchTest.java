package ua.com.rialtotenders.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.com.rialtotenders.pageObjects.MainPage;
import ua.com.rialtotenders.pageObjects.SearchPage;

public class IDSearchTest extends BaseTest {

    private SearchPage searchPage;
    private MainPage mainPage;

    @Before
    public void setUp() {
        getDriver().get("https://rialtotenders.com.ua");
    }

    @Test
    public void search_tender_by_ID_Test(){
        String title = "Всього знайдено: 1";
        String header = "поставка партии миникомпьютеров на базе Gigabyte BRIX barebone GA-H110MSTX-HD3";

        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        searchPage.fill_Search_Input_Field("R-UA-2017-09-22-000012");

        searchPage.clickSearchButton();

        Assert.assertTrue("Title " + title + " is not matched", searchPage.isTitleEqualResult_only_one((title)));

        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("Header " + header + " is not matched", searchPage.isTitleEqual2((header)));

    }

    @Test
    public void search_plan_by_ID_Test() {
        String title = "Всього знайдено: 1";
        String header = "дарожностроительни работа";

        mainPage = new MainPage(getDriver());
        mainPage.clickPlanSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.fill_Search_Input_Field("R-UA-P-2017-09-04-000001");

        searchPage.clickSearchButton();

        Assert.assertTrue("Title " + title + " is not matched", searchPage.isTitleEqualResult_only_one((title)));

        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("Header " + header + " is not matched", searchPage.isTitleEqual2((header)));
        }
}

