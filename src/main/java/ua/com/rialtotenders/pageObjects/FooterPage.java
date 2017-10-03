package ua.com.rialtotenders.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage extends BasePage {

    @FindBy(className = ("c-part-button__main-link"))
    private WebElement registFotter;

    public FooterPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void clickregistFotter(){clickTo(registFotter);}

}
