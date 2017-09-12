package ua.com.rialtotenders.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TermsOfUsePage extends BasePage {

    @FindBy(className = ("col-100"))
    private WebElement rootElement;

    public TermsOfUsePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getDriver(), this);
    }

    @Deprecated
    public String getTitle() {
        return  rootElement.findElement(By.tagName("h2")).getText();
    }

    public boolean isTitleEqual(String title) {
        return isTitleEqualFor(title,rootElement,"h2");
    }
}
