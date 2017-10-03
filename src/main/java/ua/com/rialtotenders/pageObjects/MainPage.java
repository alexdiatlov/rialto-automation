package ua.com.rialtotenders.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(className = "left")
    private WebElement biddersButton;


    @FindBy(className = "c-twoc__main-link")
    private WebElement buersButton;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickBiddersButton() { clickTo(biddersButton); }

    public void clickBuersButton(){
        clickTo(buersButton);
    }

}


