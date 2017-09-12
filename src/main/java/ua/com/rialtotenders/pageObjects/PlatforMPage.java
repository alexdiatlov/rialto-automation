package ua.com.rialtotenders.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PlatforMPage extends BasePage {

    public PlatforMPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getDriver(), this);
    }

    @FindBy(className = "c-text__center")
    private static WebElement rootMaidanchiki;

    @Deprecated
    public String getTitle() {
        return  rootMaidanchiki.findElement(By.tagName("h2")).getText();
    }

    public static boolean isTitleEqual5(String title) {
        boolean result = false;
        List<WebElement> webElementList = rootMaidanchiki.findElements(By.tagName("h2"));

        for(int i = 0; i < webElementList.size(); i++) {
            String currentText = webElementList.get(i).getText();
            if (currentText.equals(title)) {
                result = true;
                break;
            }
        }

        return result;
    }


}
