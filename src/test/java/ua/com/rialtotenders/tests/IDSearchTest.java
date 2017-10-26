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

        searchPage.fillSearchInputFieldTenderID();

        searchPage.clickSearchButton();

        Assert.assertTrue("Title " + title + " is not matched", searchPage.isTitleEqualResult_only_one((title)));

        searchPage.clickSearchTenderResult();

        Assert.assertTrue("Header " + header + " is not matched", searchPage.isTitleEqual2((header)));

    }

    @Test
    public void search_plan_by_ID_Test() {
        String title = "Всього знайдено: 1";
        String header = "дарожностроительни работа";

        mainPage = new MainPage(getDriver());
        mainPage.clickPlanSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.fillSearchInputFieldPlanID();

        searchPage.clickSearchButton();

        Assert.assertTrue("Title " + title + " is not matched", searchPage.isTitleEqualResult_only_one((title)));

        searchPage.clickSearchPlanResult();

        Assert.assertTrue("Header " + header + " is not matched", searchPage.isTitleEqual2((header)));
        }
}

