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

    @FindBy(css = (""))
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

    @FindBy(css = ("#statuses-filter .statuses-checkbox .statuses-complete > label > p"))
    private WebElement completeCheckbox;

    @FindBy(css = "#statuses-filter .sb-f__checkbox-wrap")
    private WebElement tenderStatusList;

    //buyers
    @FindBy(css = "#buyers-filter .sb-f__input-list-wrap")
    private WebElement buyersSelectList;

    @FindBy(xpath = ("//*[@id='buyers-filter']/div[2]/div[1]/div/input"))
    private WebElement buyersSearchFilterInputField;

    //CPV search
    @FindBy(xpath = ("//*[@id='categories-filter']/div[2]/div[1]/div/input"))
    private WebElement cpv_search_field;

    @FindBy(css = "#categories-filter .sb-f__input-search-wrap")
    private WebElement cpv_Select_List;

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

    public void fill_Search_Input_Field(String text) {
        fill(search_input_field, text);
    }

    public boolean isTitleEqualResult_only_one(String title) {
        return isTitleEqualFor(title, resultFind_1, "h3");
    }

    public boolean isTitleEqual2(String header) {
        return isTitleEqualFor(header, tenderHeader, "h1");
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

    public void clickCancelledCheckbox() { clickTo(cancelledCheckbox); }

    public void clickCompleteCheckbox() {
        clickTo(completeCheckbox);
    }

    public void selectStatusCheckboxByText (String status) {
        List<WebElement> checkboxList = tenderStatusList.findElements(By.cssSelector(".status"));
        for (WebElement checkbox : checkboxList) {
            if (checkbox.getText().equals(status)) {
                checkbox.findElement(By.tagName("input")).click();
                break;
            }
        }
    }


    //buyer
    public void fillBuyersSearchFilterInputField(String text) {
        fill(buyersSearchFilterInputField, text);
    }

    // choose result from buyers filter (plan working/ tender not)
    public void selectBuyersSearchFilter(String name) {
        List<WebElement> itemList = buyersSelectList.findElements(By.cssSelector(".buyers-item"));
        //for(int i=0;i < itemList.size(); i++){itemList.get(i)}
        for (WebElement el : itemList) {
            if (el.getText().equals(name)) {
                el.click();
                break;

            }
        }
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

    //CPV search
    public void fill_CPV_Search_Filter_Input_Field(String text){fill(cpv_search_field, text);}

    public void select_CPV_Search_Filter(String name) {
        List<WebElement> itemList = cpv_Select_List.findElements(By.cssSelector(".categories-item"));
        //for(int i=0;i < itemList.size(); i++){itemList.get(i)}
        for (WebElement el : itemList) {
            if (el.getText().equals(name)) {
                el.click();
                break;
            }
        }
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




    /*   public boolean is_buyer_equal(String title){return isTitleEqualFor(title,buyersMatchElement);
    }
*/
}













