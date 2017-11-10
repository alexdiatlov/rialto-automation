package ua.com.rialtotenders.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import ua.com.rialtotenders.pageObjects.MainPage;
import ua.com.rialtotenders.pageObjects.SearchPage;

public class TenderStatusTest extends BaseTest {

    private SearchPage searchPage;
    private MainPage mainPage;

    @Before
    public void setUp() {
        getDriver().get("https://rialtotenders.com.ua");
    }

    @Test
    public void tender_Status_active_enquiries_test() throws InterruptedException {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        Thread.sleep(2000);
        searchPage.clickActiveEnquiriesCheckbox();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/tender/search?status=active.enquiries"));
    }

    @Test
    public void tender_Status_active_tendering_test() throws InterruptedException {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        Thread.sleep(2000);
        searchPage.clickActiveTenderingCheckbox();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/tender/search?status=active.tendering"));
    }

    @Test
    public void tender_Status_active_auction_test() throws InterruptedException {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();
        searchPage = new SearchPage(getDriver());

        searchPage.clickClearFilter();

        Thread.sleep(2000);
        searchPage.clickActiveAuctionCheckbox();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/tender/search?status=active.auction"));
    }

    @Test
    public void tender_Status_active_pre_qualification_test() throws InterruptedException {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        Thread.sleep(2000);
        searchPage.clickActivePreQualificationCheckbox();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/tender/search?status=active.pre-qualification"));
    }

    @Test
    public void tender_Status_active_qualification_test() throws InterruptedException {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        Thread.sleep(2000);
        searchPage.clickActiveQualificationCheckbox();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/tender/search?status=active.qualification"));
    }

    @Test
    public void tender_Status_active_awarded_test() throws InterruptedException {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        Thread.sleep(2000);
        searchPage.clickActiveAwardedCheckbox();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/tender/search?status=active.awarded"));
    }

    @Test
    public void tender_Status_unsuccessful_test() throws InterruptedException {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        Thread.sleep(2000);
        searchPage.clickUnsuccessfulCheckbox();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/tender/search?status=unsuccessful"));
    }

    @Test
    public void tender_Status_cancelled_test() throws InterruptedException {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        Thread.sleep(2000);
        searchPage.clickCancelledCheckbox();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/tender/search?status=cancelled"));
    }

    @Test
    public void tender_Status_complete_test() throws InterruptedException {
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        Thread.sleep(2000);
        searchPage.clickCompleteCheckbox();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/tender/search?status=complete"));
    }
}
