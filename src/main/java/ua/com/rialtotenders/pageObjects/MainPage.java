package ua.com.rialtotenders.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(className = "left")
    private WebElement biddersButton;

    @FindBy(className = "c-twoc__main-link")
    private WebElement buersButton;

    @FindBy(className = ("advanced_search"))
    private WebElement advanced_search;

    @FindBy(css = ("[href='/plan/search']"))
    private WebElement plan_search;

    @FindBy(css = ("[href='/tender/search?status=active.enquiries&status=active.tendering']"))
    private WebElement tender_search;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickBiddersButton() { clickTo(biddersButton); }

    public void clickBuersButton(){
        clickTo(buersButton);
    }

    public void clickAdvancedSearch() {
        clickTo(advanced_search);
    }

    public void clickPlanSearch() {
        clickTo(plan_search);
    }

    public void clickTenderSearch() { clickTo(tender_search); }

}


