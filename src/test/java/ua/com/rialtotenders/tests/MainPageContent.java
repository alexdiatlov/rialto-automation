package ua.com.rialtotenders.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.com.rialtotenders.pageObjects.HeaderPage;

public class MainPageContent extends BaseTest {

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




}
