package ua.com.rialtotenders.tests;

import org.junit.Before;
import org.junit.Test;
import ua.com.rialtotenders.pageObjects.SearchPage;

public class BuyersSearchTest extends BaseTest {

    private SearchPage searchPage;

    @Before
    public void setUp() {
        getDriver().get("https://rialtotenders.com.ua");
    }

    @Test
    public void buyers_search_test(){
        searchPage = new SearchPage(getDriver());
        searchPage.clickTenderSearch();

        searchPage.clickClearFilter();

        searchPage.fillBuyersSearchFilterInputField();

        searchPage.clickTenderTestBuyer();




    }
}
