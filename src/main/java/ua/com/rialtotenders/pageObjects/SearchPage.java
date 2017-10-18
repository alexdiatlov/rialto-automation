package ua.com.rialtotenders.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends BasePage {

    @FindBy(className = ("advanced_search"))
    private WebElement advanced_search;

    @FindBy(css = ("[href='/plan/search']"))
    private WebElement plan_search;

    @FindBy(css = ("[href='/tender/search?status=active.enquiries&status=active.tendering']"))
    private WebElement tender_search;

    @FindBy(id = ("clear-filter"))
    private WebElement clear_filter;

    @FindBy(id = ("search_button_simple"))
    private WebElement search_button;

    @FindBy(id = ("query"))
    private WebElement search_input_field;

    @FindBy(id = ("result"))
    private WebElement resultTender;

    @FindBy(css = ("[href='/tender/R-UA-2017-09-22-000012/']"))
    private WebElement searchTenderResult;

    @FindBy(className = ("block-text-tender"))
    private WebElement tenderHeader;

    @FindBy(css = ("[href='/plan/R-UA-P-2017-09-04-000001/']"))
    private WebElement  searchPlanResult;

    @FindBy(id = ("filter-result"))
    private WebElement resultPlan;

    @FindBy(css = (".select-category > select"))
    private WebElement categorySelectBox;

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

    @FindBy(xpath = ("//*[@id='buyers-filter']/div[2]/div[1]/div/input"))
    private WebElement buyersSearchFilterInputField;

    @FindBy(xpath = ("//*[@id='buyers-filter']/div[2]/div[1]/div/div/div/ul/div/li/span"))
    private WebElement tenderTestBuyer;

    @FindBy(xpath = ("//*[@id='result']/div[2]/div/div[2]/p[1]/a"))
    private WebElement buyersMatchElement;

    @FindBy(id = ("result"))
    private WebElement resultTable;

    public SearchPage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickAdvancedSearch() {clickTo(advanced_search);}

    public void clickPlanSearch() {clickTo(plan_search);}

    public void clickTenderSearch(){clickTo(tender_search);}

    public void clickClearFilter () {clickTo(clear_filter);}

    public void clickSearchButton () {clickTo(search_button);}

    public void fillSearchInputFieldTenderID (){fill(search_input_field, "R-UA-2017-09-22-000012");}

    public void fillSearchInputFieldPlanID (){fill(search_input_field, "R-UA-P-2017-09-04-000001");}

    public boolean isTitleEqual1(String title) {
        return isTitleEqualFor(title,resultTender,"h3");
    }

    public void clickSearchTenderResult () {clickTo(searchTenderResult);}

    public boolean isTitleEqual2(String header) { return isTitleEqualFor(header,tenderHeader,"h1");}

    public void clickSearchPlanResult(){clickTo(searchPlanResult);}

    public boolean isTitleEqual3(String title) {
        return isTitleEqualFor(title,resultTender,"h3");
    }

    //public void clickCategory (){clickTo(Category);}

    public void clickActiveEnquiriesCheckbox(){clickTo(activeEnquiriesCheckbox);}

    public void clickActiveTenderingCheckbox(){clickTo(activeTenderingCheckbox);}

    public void clickActiveAuctionCheckbox(){clickTo(activeAuctionCheckbox);}

    public void clickActivePreQualificationCheckbox(){clickTo(activePreQualificationCheckbox);}

    public void clickActiveQualificationCheckbox(){clickTo(activeQualificationCheckbox);}

    public void clickActiveAwardedCheckbox(){clickTo(activeAwardedCheckbox);}

    public void clickUnsuccessfulCheckbox(){clickTo(unsuccessfulCheckbox);}

    public void clickCancelledCheckbox(){clickTo(cancelledCheckbox);}

    public void clickCompleteCheckbox(){clickTo(completeCheckbox);}

    public void fillBuyersSearchFilterInputField(){fill (buyersSearchFilterInputField, "Державне підприємство \"Укроборонсервіс\"");}

    public void clickTenderTestBuyer(){clickTo(tenderTestBuyer);}

    public void selectCategoryByText(String category) {
        Select categorySelect = new Select(categorySelectBox);
        categorySelect.selectByVisibleText(category);
        waitLoadingProcess();
    }

    private WebElement getNameTrendByOrderNumber(int orderNumber) {
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













