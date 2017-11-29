package ua.com.rialtotenders.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Alexander.
 */
public class TenderPage extends BasePage {

    @FindBy(className = "sb-table__text--small")
    private WebElement cpvCodeSection;

    public TenderPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(getDriver(), this);
    }

    public boolean isCPVCodeMatchWith(String[] expectedCpvCodeArray) {
        boolean result = false;
        String actualCPVCode = cpvCodeSection.getText();

        for (String cpvCode : expectedCpvCodeArray) {
            result = actualCPVCode.contains(cpvCode);
            if (result) {
                return result;
            }
        }

        return result;
    }
}
