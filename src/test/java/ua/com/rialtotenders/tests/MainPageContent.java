package ua.com.rialtotenders.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.com.rialtotenders.pageObjects.*;

public class MainPageContent extends BaseTest {

    private HeaderPage headerPage;
    private FooterPage footerPage;
    private MainPage mainPage;

    @Before
    public void setUp() {
        getDriver().get("https://rialtotenders.com.ua");
    }

    @Test
    public void clickLogoTest() {
        getDriver().get("https://rialtotenders.com.ua/about");

        headerPage = new HeaderPage(getDriver());
        headerPage.clickLogo();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/"));
    }

    @Test
    public void openAboutPageTest() {
        String header = "Про систему";

        headerPage = new HeaderPage(getDriver());
        headerPage.clickAbout();


        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/about"));

        ua.com.rialtotenders.pageObjects.AboutPage aboutPage = new ua.com.rialtotenders.pageObjects.AboutPage(getDriver());
        Assert.assertTrue("Header " + header + " is not matched", aboutPage.isTitleEqual(header));
    }

    @Test
    public void openContactPageTest() {

        String phone = "+38 (044) 499 1799";

        headerPage = new HeaderPage(getDriver());
        headerPage.clickContacts();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/contacts"));

        ContactPage contactPage = new ContactPage(getDriver());

        Assert.assertTrue("Phone" + phone + "phone is not matched", contactPage.isPhoneNumberExist(phone));
    }

    @Test
    public void openTermsOfUsePage () {

        String header = "Регламент використання електронної системи закупівель RIALTO (у редакції від 23.05.2017)";

        headerPage = new HeaderPage(getDriver());
        headerPage.clickTermsOfUse();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/termsofuse"));

        TermsOfUsePage termsOfUsePage = new TermsOfUsePage(getDriver());

        Assert.assertTrue("Header " + header + " is not matched", termsOfUsePage.isTitleEqual2((header)));
    }

    @Test
    public void openPlatformSPage (){

        String header1 = "Постачальникам";
        String header2 = "Замовникам";

        footerPage = new FooterPage(getDriver());
        footerPage.clickregistFotter();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/platforms"));

        PlatformSPage platformSPage = new PlatformSPage(getDriver());

        Assert.assertTrue("Header " + header1 + " is not matched", PlatformSPage.isTitleEqual3((header1)));

        Assert.assertTrue("Header " + header2 + " is not matched", PlatformSPage.isTitleEqual4((header2)));
    }

    @Test
    public void openRegistBuyersButton (){

        String header1 = "Постачальникам";
        String header2 = "Замовникам";

        mainPage = new MainPage(getDriver());
        mainPage.clickBuersButton();

        PlatformSPage platformSPage = new PlatformSPage(getDriver());
        platformSPage.clickRegistBuyersButton();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/platforms"));

        Assert.assertTrue("Header " + header1 + " is not matched", PlatformSPage.isTitleEqual3((header1)));

        Assert.assertTrue("Header " + header2 + " is not matched", PlatformSPage.isTitleEqual4((header2)));
    }

    @Test
    public void openRegistBiddersButton (){

        String header1 = "Постачальникам";
        String header2 = "Замовникам";

        mainPage = new MainPage(getDriver());
        mainPage.clickBiddersButton();

        PlatformSPage platformSPage = new PlatformSPage(getDriver());
        platformSPage.clickRegistBiddersButton();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/platforms"));

        Assert.assertTrue("Header " + header1 + " is not matched", PlatformSPage.isTitleEqual3((header1)));

        Assert.assertTrue("Header " + header2 + " is not matched", PlatformSPage.isTitleEqual4((header2)));
    }

    @Test
    public void openBuyersPageTest (){
        headerPage = new HeaderPage(getDriver());
        headerPage.clickBuyers();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/buyers"));
    }

    @Test
    public void openBiddersPageTest(){
        headerPage = new HeaderPage(getDriver());
        headerPage.clickBidders();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/bidders"));
    }
@Test
    public void openPlatformPageTest(){

        String header3 = "Приєднатись до системи";

        headerPage = new HeaderPage(getDriver());
        headerPage.clickPlatform();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/platform"));

        PlatforMPage platforMPage = new PlatforMPage(getDriver());

        Assert.assertTrue("Header " + header3 + " is not matched", PlatforMPage.isTitleEqual5((header3)));
    }
}












