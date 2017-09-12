package ua.com.rialtotenders.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "left")
    private WebElement biddersButton;

    public void clickBiddersButton() {
        clickTo(biddersButton);
    }

    @FindBy(className = "c-twoc__main-link")
    private WebElement buersButton;

    public void clickBuersButton(){
        clickTo(buersButton);
    }

}


