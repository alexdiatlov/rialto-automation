package ua.com.rialtotenders.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.com.rialtotenders.pageObjects.AboutPage;
import ua.com.rialtotenders.pageObjects.ContactPage;
import ua.com.rialtotenders.pageObjects.HeaderPage;

public class MainPageContentTest extends BaseTest {

    private HeaderPage headerPage;

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

        AboutPage aboutPage = new AboutPage(getDriver());
        Assert.assertTrue("Header " + header + " is not matched",aboutPage.isTitleEqual(header));
        //ASSERT!!!!

    }

    @Test
    public void verifyContactPhoneTest() {
        String phone = "+38 (044) 499 1799";

        headerPage = new HeaderPage(getDriver());
        headerPage.clickContacts();

        Assert.assertTrue("Redirect URL is not correct",
                getDriver().getCurrentUrl().equals("https://rialtotenders.com.ua/contacts"));

        ContactPage contactPage = new ContactPage(getDriver());
        Assert.assertTrue("Phone " + phone + " is not matched",contactPage.isPhoneNumberExist(phone));
    }

}
