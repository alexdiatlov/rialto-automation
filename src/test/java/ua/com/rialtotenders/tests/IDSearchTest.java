package ua.com.rialtotenders.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.com.rialtotenders.pageObjects.SearchPage;

public class IDSearchTest extends BaseTest {

    private SearchPage searchPage;

    @Before
    public void setUp() {
        getDriver().get("https://rialtotenders.com.ua");
    }

    @Test
    public void search_tender_by_ID_Test(){
        String title = "Всього знайдено: 1";
        String header = "поставка партии миникомпьютеров на базе Gigabyte BRIX barebone GA-H110MSTX-HD3";

        searchPage = new SearchPage(getDriver());
        searchPage.clickTenderSearch();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/tender/search?status=active.enquiries&status=active.tendering"));

        searchPage.clickClearFilter();

        searchPage.fillSearchInputFieldTenderID();

        searchPage.clickSearchButton();

        Assert.assertTrue("Title " + title + " is not matched", searchPage.isTitleEqual1((title)));

        searchPage = new SearchPage(getDriver());
        searchPage.clickSearchTenderResult();

        Assert.assertTrue("Header " + header + " is not matched", searchPage.isTitleEqual2((header)));

    }

    /*@Test
    public void search_plan_by_ID_Test(){
        String title = "Всього знайдено: 1";
        String header = "дарожностроительни работа";

        searchPage = new SearchPage(getDriver());
        searchPage.clickPlanSearch();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/plan/search"));

        searchPage.fillSearchInputFieldPlanID();

        searchPage.clickSearchButton();

        Assert.assertTrue("Title " + title + " is not matched", searchPage.isTitleEqual3((title)));

        searchPage = new SearchPage(getDriver());
        searchPage.clickSearchPlanResult();

        Assert.assertTrue("Header " + header + " is not matched", searchPage.isTitleEqual2((header)));
        }*/
}

