package ua.com.rialtotenders.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SearchPage extends BasePage {

    @FindBy(id = ("clear-filter"))
    private WebElement clear_filter;

    @FindBy(id = ("search_button_simple"))
    private WebElement search_button;

    @FindBy(id = ("query"))
    private WebElement search_input_field;

    // ID Search
    @FindBy(className = ("block-text-tender"))
    private WebElement tenderHeader;

    @FindBy(css = ("[href='/tender/R-UA-2017-09-22-000012/']"))
    private WebElement searchTenderResult;

    @FindBy(css = ("[href='/plan/R-UA-P-2017-09-04-000001/']"))
    private WebElement searchPlanResult;

    @FindBy(id = ("result"))
    private WebElement resultFind_1;

    // category
    @FindBy(css = (".select-category > select"))
    private WebElement categorySelectBox;

    @FindBy(id = ("result"))
    private WebElement resultTable;

    //checkbox
    @FindBy(xpath = ("//*[@id='statuses-filter']/div[2]/div[2]/div/div[1]/label/p"))
    //@FindBy(css = ("#statuses-filter > label > p"))
    private WebElement activeEnquiriesCheckbox;

    @FindBy(xpath = ("//*[@id='statuses-filter']/div[2]/div[2]/div/div[2]/label/p"))
    private WebElement activeTenderingCheckbox;

    @FindBy(xpath = ("//*[@id='statuses-filter']/div[2]/div[2]/div/div[3]/label/p"))
    private WebElement activeAuctionCheckbox;

    @FindBy(xpath = ("//*[@id='statuses-filter']/div[2]/div[2]/div/div[4]/label/p"))
    private WebElement activePreQualificationCheckbox;

    @FindBy(xpath = ("//*[@id='statuses-filter']/div[2]/div[2]/div/div[5]/label/p"))
    private WebElement activeQualificationCheckbox;

    @FindBy(xpath = ("//*[@id='statuses-filter']/div[2]/div[2]/div/div[6]/label/p"))
    private WebElement activeAwardedCheckbox;

    @FindBy(xpath = ("//*[@id='statuses-filter']/div[2]/div[2]/div/div[7]/label/p"))
    private WebElement unsuccessfulCheckbox;

    @FindBy(xpath = ("//*[@id='statuses-filter']/div[2]/div[2]/div/div[8]/label/p"))
    private WebElement cancelledCheckbox;

    @FindBy(xpath = ("//*[@id='statuses-filter']/div[2]/div[2]/div/div[9]/label/p"))
    private WebElement completeCheckbox;
    //buyers
    @FindBy(css = "#buyers-filter .sb-f__input-list-wrap")
    private WebElement buyersSelectList;

    @FindBy(xpath = ("//*[@id='buyers-filter']/div[2]/div[1]/div/input"))
    private WebElement buyersSearchFilterInputField;

    @FindBy(xpath = ("//*[@id='buyers-filter']/div[2]/div[1]/div/div/div/ul/div/li/span"))
    private WebElement tenderTestBuyer;

    @FindBy(xpath = ("//*[@id='buyers-filter']/div[2]/div[1]/div/div/div/ul/div/li/span"))
    private WebElement planTestBuyer;

    /*@FindBy(xpath = ("//*[@id='result']/div[2]/div/div[2]/p[1]/a"))
    private WebElement buyersMatchElement;*/


    public SearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickClearFilter() {
        clickTo(clear_filter);
    }

    public void clickSearchButton() {
        clickTo(search_button);
    }

    // ID Search
    public void fillSearchInputFieldTenderID() {
        fill(search_input_field, "R-UA-2017-09-22-000012");
    }

    public void fillSearchInputFieldPlanID() {
        fill(search_input_field, "R-UA-P-2017-09-04-000001");
    }

    public boolean isTitleEqualResult_only_one(String title) {
        return isTitleEqualFor(title, resultFind_1, "h3");
    }

    public void clickSearchTenderResult() {
        clickTo(searchTenderResult);
    }

    public boolean isTitleEqual2(String header) {
        return isTitleEqualFor(header, tenderHeader, "h1");
    }

    public void clickSearchPlanResult() {
        clickTo(searchPlanResult);
    }

    // checkbox
    public void clickActiveEnquiriesCheckbox() {
        clickTo(activeEnquiriesCheckbox);
    }

    public void clickActiveTenderingCheckbox() {
        clickTo(activeTenderingCheckbox);
    }

    public void clickActiveAuctionCheckbox() {
        clickTo(activeAuctionCheckbox);
    }

    public void clickActivePreQualificationCheckbox() {
        clickTo(activePreQualificationCheckbox);
    }

    public void clickActiveQualificationCheckbox() {
        clickTo(activeQualificationCheckbox);
    }

    public void clickActiveAwardedCheckbox() {
        clickTo(activeAwardedCheckbox);
    }

    public void clickUnsuccessfulCheckbox() {
        clickTo(unsuccessfulCheckbox);
    }

    public void clickCancelledCheckbox() {
        clickTo(cancelledCheckbox);
    }

    public void clickCompleteCheckbox() {
        clickTo(completeCheckbox);
    }

    //buyer
    public void clickTenderTestBuyer() {
        clickTo(tenderTestBuyer);
    }

    public void fillBuyersSearchFilterInputField(String text) {
        fill(buyersSearchFilterInputField, text);
    }

    public void clickPlanTestBuyer() {
        clickTo(planTestBuyer);
    }

    // category search
    public void selectCategoryByText(String category) {
        Select categorySelect = new Select(categorySelectBox);
        categorySelect.selectByVisibleText(category);
        waitLoadingProcess();
    }

    public Select getCategorySelectBox() {
        return new Select(categorySelectBox);
    }

    // chose from result table
    private WebElement getNameTrendByOrderNumber(int orderNumber) {
        waitLoadingProcess();
        return resultTable.findElements(By.className("sb-table-list-item__table"))
                .get(orderNumber).findElements(By.className("sb-table-list-item__cell"))
                //sorry for hardcode, not any uniqe locator here
                .get(0).findElement(By.cssSelector("a"));
    }


    public void clickNameTrendByOrderNumber(int orderNumber) {
        clickTo(getNameTrendByOrderNumber(orderNumber));
    }

    public void selectBuyersSearchFilter(String name) {
        List<WebElement> itemList = buyersSelectList.findElements(By.cssSelector(".buyers-item"));
        //for(int i=0;i < itemList.size(); i++)
        for (WebElement el : itemList) {
            if (el.getText().equals(name)) {
                el.click();
                break;
            }
        }
    }


    /*   public boolean is_buyer_equal(String title){return isTitleEqualFor(title,buyersMatchElement);
    }
*/
}













