package pageObjects;

import Objects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends BasePage {

    public HeaderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (css = ("c-header__logo"))
    private WebElement logo;

    public void clickLogo() {
        clickTo(logo);
    }

    @FindBy (css = ("a[href='/about']"))
    private WebElement about;

    public void clickAbout() {
        clickTo(about);
    }

    @FindBy (css = ("a[href='/buyers']"))
    private WebElement buyers;

    public void clickBuyers() {
        clickTo(buyers);
    }

    @FindBy (css = ("a[href='/bidders']"))
    private WebElement bidders;

    public void clickBidders() {
        clickTo(bidders);
    }

    @FindBy (css = ("a[href='/platform']"))
    private WebElement platform;

    public void clickPlatform() {
        clickTo(platform);
    }

    @FindBy (css = ("a[href='/termsofuse']"))
    private WebElement termsOfUse;

    public void clickTermsOfUse() {
        clickTo(termsOfUse);
    }

    @FindBy (css = ("a[href='/contacts']"))
    private WebElement contacts;

    public void clickContacts() {
        clickTo(contacts);
    }

}

