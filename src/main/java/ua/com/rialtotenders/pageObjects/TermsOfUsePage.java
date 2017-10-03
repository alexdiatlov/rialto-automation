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

<<<<<<< HEAD
=======
    @Deprecated
    public String getTitle() {
        return  rootElement.findElement(By.tagName("h2")).getText();
    }

>>>>>>> 49651ec2a2d60734f00c5be94245ab305a442559
    public boolean isTitleEqual(String title) {
        return isTitleEqualFor(title,rootElement,"h2");
    }
}
