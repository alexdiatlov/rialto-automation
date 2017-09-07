package ua.com.rialtotenders.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TermsOfUsePage extends BasePage {

    @FindBy(className = ("col-100"))
    private WebElement rootElement2;

    public TermsOfUsePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getDriver(), this);
    }

    @Deprecated
    public String getTitle() {
        return  rootElement2.findElement(By.tagName("h2")).getText();
    }

    public boolean isTitleEqual2 (String title) {
        boolean result = false;
        List<WebElement> webElementList = rootElement2.findElements(By.tagName("h2"));

        int x;
        for (x = 0; x < webElementList.size(); x++) {
            String currentText = webElementList.get(x).getText();
            if (currentText.equals(title)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
