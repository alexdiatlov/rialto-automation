package ua.com.rialtotenders.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BiddersPage extends BasePage {
    @FindBy(className = "gpr")
    //from small letter
    private static WebElement Postach;
    @FindBy(className = "gpl")
    private static WebElement Zamovn;

    public BiddersPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getDriver(), this);
    }

    public static boolean isTitleEqual3(String title){
        boolean result = false;
        List<WebElement> webElementList = Postach.findElements(By.tagName("h3"));

        for(int i = 0; i < webElementList.size(); i++) {
            String currentText = webElementList.get(i).getText();
            if (currentText.equals(title)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isTitleEqual4(String title){
        boolean result = false;
        List<WebElement> webElementList = Zamovn.findElements(By.tagName("h3"));

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
