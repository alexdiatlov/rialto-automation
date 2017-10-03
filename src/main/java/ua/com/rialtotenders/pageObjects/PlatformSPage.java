package ua.com.rialtotenders.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PlatformSPage extends BasePage {
    @FindBy(className = "gpr")
    private WebElement Postach;

    @FindBy(className = "gpl")
    private WebElement Zamovn;

    @FindBy(className = "sb-bigbutton--bg-color")
    public WebElement registBuyersButton;


    @FindBy(className = "sb-bigbutton--bg-color")
    public WebElement registBiddersButton;


    public PlatformSPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getDriver(), this);
    }

    public boolean isPostachTitleEqual(String title) {
        return isTitleEqualFor(title, Postach, "h3");
    }

    public boolean isZamovnTitleEqual(String title) {
        return isTitleEqualFor(title, Zamovn, "h3");
    }

    public void clickRegistBuyersButton() {
        clickTo(registBuyersButton);
    }

    public void clickRegistBiddersButton() {
        clickTo(registBiddersButton);
    }


}
