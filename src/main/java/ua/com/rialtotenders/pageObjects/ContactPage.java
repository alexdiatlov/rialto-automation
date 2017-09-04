package ua.com.rialtotenders.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by Alexander.
 */
public class ContactPage extends BasePage {

    @FindBy(className = "col-100")
    private WebElement rootElement;

    public ContactPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getDriver(), this);
    }

    public boolean isPhoneNumberExist(String phone) {
        boolean result = false;
        List<WebElement> webElementList = rootElement.findElements(By.tagName("strong"));

        for(int i = 0; i < webElementList.size(); i++) {
            String currentText = webElementList.get(i).getText();
            if (currentText.contains(phone)) {
                result = true;
                break;
            }
        }

        return result;
    }
}
