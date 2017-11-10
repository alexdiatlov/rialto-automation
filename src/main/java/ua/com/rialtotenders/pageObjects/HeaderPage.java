package ua.com.rialtotenders.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HeaderPage extends BasePage {

    @FindBy(css = (".c-header__logo"))
    private WebElement logo;

    // upper menu
    @FindBy(css = ("[href='/about']"))
    private WebElement aboutLink;

    @FindBy(css = ("[href='/buyers']"))
    private WebElement buyers;

    @FindBy(css = ("[href='/bidders']"))
    private WebElement bidders;

    @FindBy(css = ("[href='/platform']"))
    private WebElement platform;

    @FindBy(css = ("[href='/termsofuse']"))
    private WebElement termsofuse;

    @FindBy(css = ("[href='/contacts']"))
    private WebElement contacts;

    // language
    @FindBy(className = ("sb-lang-selector"))
    private WebElement lang_selector;

    @FindBy(css = ("[href='/en']"))
    private WebElement Eng_language;

    @FindBy(css = ("[href='/ru']"))
    private WebElement Rus_language;

    //

    public HeaderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickLogo() {
        clickTo(logo);
    }

    // upper menu
    public void clickAbout() {
        clickTo(aboutLink);
    }

    public void clickBuyers() {
        clickTo(buyers);
    }

    public void clickBidders(){
        clickTo(bidders);
    }

    public void clickPlatform (){
        clickTo(platform);
    }

    public void clickTermsOfUse (){
        clickTo(termsofuse);
    }

    public void clickContacts (){
        clickTo(contacts);
    }

    //language
    public void clickLangBox(){clickTo(lang_selector);}

    public void clickEng(){clickTo(Eng_language);}

    public void clickRus(){clickTo(Rus_language);}







}
