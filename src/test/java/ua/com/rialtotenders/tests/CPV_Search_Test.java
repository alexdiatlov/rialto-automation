package ua.com.rialtotenders.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import ua.com.rialtotenders.pageObjects.MainPage;
import ua.com.rialtotenders.pageObjects.SearchPage;

public class CPV_Search_Test extends BaseTest {

    private SearchPage searchPage;
    private MainPage mainPage;

    @Before
    public void setUp() {
        getDriver().get("https://rialtotenders.com.ua");
    }

    @Test
    public void tender_CPV_search_test(){
        mainPage = new MainPage(getDriver());
        mainPage.clickTenderSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        searchPage.fill_CPV_Search_Filter_Input_Field("30197644-2");
        searchPage.select_CPV_Search_Filter("30197644-2 Папір ксерографічний");
        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("CPV  code is not matched",
                driver.findElement(By.className("sb-table__text")).getText().contains("30197644-2"));
    }

    @Test
    public void plan_CPV_searc_test(){
        mainPage = new MainPage(getDriver());
        mainPage.clickPlanSearch();

        searchPage = new SearchPage(getDriver());
        searchPage.fill_CPV_Search_Filter_Input_Field("45300000-0");
        searchPage.select_CPV_Search_Filter("45300000-0 Роботи будівельні монтажні");
        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("CPV  code is not matched",
                driver.findElement(By.className("sb-table__text")).getText().contains("45300000-0"));
    }
}
