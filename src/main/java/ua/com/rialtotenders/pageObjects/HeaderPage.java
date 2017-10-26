package ua.com.rialtotenders.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage extends BasePage {

    @FindBy(css = (".c-header__logo"))
    private WebElement logo;

    public void clickLogo() {
        clickTo(logo);
    }

    @FindBy(css = ("[href='/about']"))
    private WebElement aboutLink;

    public void clickAbout() {
        clickTo(aboutLink);
    }

    @FindBy(css = ("[href='/buyers']"))
    private WebElement buyers;

    public void clickBuyers() {
        clickTo(buyers);
    }

    @FindBy(css = ("[href='/bidders']"))
    private WebElement bidders;

    public void clickBidders(){
        clickTo(bidders);
    }

    @FindBy(css = ("[href='/platform']"))
    private WebElement platform;

    public void clickPlatform (){
        clickTo(platform);
    }

    @FindBy(css = ("[href='/termsofuse']"))
    private WebElement termsofuse;

    public void clickTermsOfUse (){
        clickTo(termsofuse);
    }

    @FindBy(css = ("[href='/contacts']"))
    private WebElement contacts;

    public void clickContacts (){
        clickTo(contacts);
    }

    @FindBy(className = ("jsLangListItemActive"))
    private WebElement lang;

    public HeaderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickLang (){
        clickTo(lang);
    }


}
