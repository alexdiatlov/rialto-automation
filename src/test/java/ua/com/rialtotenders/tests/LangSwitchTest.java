package ua.com.rialtotenders.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import ua.com.rialtotenders.pageObjects.HeaderPage;
import ua.com.rialtotenders.pageObjects.MainPage;
import ua.com.rialtotenders.pageObjects.SearchPage;

public class  LangSwitchTest extends BaseTest {

    private HeaderPage headerPage;
    private MainPage mainPage;
    private SearchPage searchPage;

    @Before
    public void setUp() {
        getDriver().get("https://rialtotenders.com.ua");
    }

@Test
    public void change_lang_ENG_test () {
        headerPage = new HeaderPage(getDriver());

        headerPage.clickLangBox();

        headerPage.clickEng();

    Assert.assertTrue("About is not matched",
            driver.findElement(By.className("sb-nav__center")).getText().contains("About"));

    Assert.assertTrue("Procuring entities is not matched",
            driver.findElement(By.className("sb-nav__center")).getText().contains("Procuring entities"));

    Assert.assertTrue("Economic operators is not matched",
            driver.findElement(By.className("sb-nav__center")).getText().contains("Economic operators"));

    Assert.assertTrue("ePlatforms is not matched",
            driver.findElement(By.className("sb-nav__center")).getText().contains("ePlatforms"));

    Assert.assertTrue("Terms of use is not matched",
            driver.findElement(By.className("sb-nav__center")).getText().contains("Terms of use"));

    Assert.assertTrue("Contacts is not matched",
            driver.findElement(By.className("sb-nav__center")).getText().contains("Contacts"));

    /*Assert.assertTrue("Procedures is not matched",
            driver.findElement(By.className("sb-nav__center")).getText().contains("Procedures"));*/

    Assert.assertTrue("Main header is not matched",
            driver.findElement(By.className("c-main__cell")).getText().contains("Open eTendering system"));

    Assert.assertTrue("Tenders is not matched",
            driver.findElement(By.className("c-main__cell")).getText().contains("Tenders"));

    Assert.assertTrue("Plans is not matched",
            driver.findElement(By.className("c-main__cell")).getText().contains("Plans"));

    Assert.assertTrue("Advanced search is not matched",
            driver.findElement(By.className("c-main__cell")).getText().contains("Advanced search"));

    Assert.assertTrue("Economic operators is not matched",
            driver.findElement(By.className("c-twoc__table")).getText().contains("Economic operators"));

    Assert.assertTrue("Description of Economic operators is not matched",
            driver.findElement(By.className("c-twoc__table")).getText().contains("Willing to expand your " +
                    "sales without spendings on client attraction? Participation in tenders of the big companies in the " +
                    "RIALTO system - openly and transparently. In order to start, please register on one of the ePlatforms " +
                    "and get full access to the tenders  "));


    /*Assert.assertTrue("Procuring Entitites is not matched",
            driver.findElement(By.cssSelector(".c-twoc__cell.c-twoc__cell--description']")).getText().contains("Procuring Entitites"));*/

    /*Assert.assertTrue("Description of Procuring Entitites is not matched",
            driver.findElement(By.className("c-twoc__table")).getText().contains("Conduct tenders professionally in the " +
                    "RIALTO system - announce your tenders and they will be available for economic operators on all of the ePlatforms. " +
                    "Choose the best proposal and save your money and time. In order to start, choose an ePlatform and register  "));*/

    Assert.assertTrue(" Choose an ePlatform is not matched",
            driver.findElement(By.className("b-left")).getText().contains("Choose an ePlatform"));

    Assert.assertTrue("RIALTO describe is not matched",
            driver.findElement(By.className("c-text__wrap")).getText().contains("RIALTO system consists from the Central Data " +
                    "Base and ePlatforms, on which Procuring entities and Economic operators work. Through synchronization " +
                    "between the ePlatforms, all tenders and other information is available on each of them in the system, " +
                    "no matter on which the tender was announced. In order to start your work, please choose one of the ePlatforms " +
                    "and register on it. You will be able to conduct tenders or take part in them afterwards"));

    Assert.assertTrue("ЗАРЕГИСТРИРОВАТЬСЯ is not matched",
            driver.findElement(By.className("c-part-button__center")).getText().contains("ЗАРЕГИСТРИРОВАТЬСЯ"));

    mainPage = new MainPage(getDriver());

    mainPage.clickAdvancedSearch();

    Assert.assertTrue("Search is not matched",
            driver.findElement(By.id("search_button_simple")).getText().contains("Search"));

    Assert.assertTrue("Selected filters is not matched",
            driver.findElement(By.className("col-25 ")).getText().contains("Selected filters"));

    Assert.assertTrue("Common procurement vocabulary is not matched",
            driver.findElement(By.className("col-25 ")).getText().contains("Common procurement vocabulary"));

    Assert.assertTrue("Procuring entity  is not matched",
            driver.findElement(By.className("col-25 ")).getText().contains("Procuring entity"));

    Assert.assertTrue("Status of the tender is not matched",
            driver.findElement(By.className("col-25 ")).getText().contains("Status of the tender"));

    Assert.assertTrue("Enquiry period is not matched",
            driver.findElement(By.className("sb-f__checkbox-wrap")).getText().contains("Enquiry period"));

    Assert.assertTrue("Auction is not matched",
            driver.findElement(By.className("sb-f__checkbox-wrap")).getText().contains("Auction"));

    searchPage = new SearchPage(getDriver());
    searchPage.clickClearFilter();

    searchPage.fill_Search_Input_Field("R-UA-2017-10-23-000003");

    searchPage.clickSearchButton();

    searchPage.clickNameTrendByOrderNumber(0);

    Assert.assertTrue("Procuring Entity  is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Procuring Entity"));

    Assert.assertTrue("Procuring Entity  is not matched",
            driver.findElement(By.className("mobile-table")).getText().contains("Procuring Entity"));

    Assert.assertTrue("Code  is not matched",
            driver.findElement(By.className("mobile-table")).getText().contains("Code"));

    Assert.assertTrue("Website  is not matched",
            driver.findElement(By.className("mobile-table")).getText().contains("Website"));

    Assert.assertTrue("Address  is not matched",
            driver.findElement(By.className("mobile-table")).getText().contains("Address"));

    Assert.assertTrue("Procuring Entity's contact point  is not matched",
    driver.findElement(By.className("block-text-tender")).getText().contains("Procuring Entity's contact point"));

    Assert.assertTrue("Contact point  is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Contact point"));

    Assert.assertTrue("Telephone  is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Telephone"));

    Assert.assertTrue("Email  is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Email"));

    Assert.assertTrue("Milestones  is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Milestones"));

    Assert.assertTrue("Start of the enquiry period  is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Start of the enquiry period"));

    Assert.assertTrue("Enquiries until  is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Enquiries until"));

    Assert.assertTrue("Start of the tendering period is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Start of the tendering period"));

    Assert.assertTrue("Proposal submissions till is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Proposal submissions till"));

    Assert.assertTrue("Tender ID is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Tender ID"));

    Assert.assertTrue("ID is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("ID"));

    Assert.assertTrue("Tender ID is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Tender ID"));

    Assert.assertTrue("Tender documents is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Tender documents"));

    Assert.assertTrue("General information is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("General information"));

    Assert.assertTrue("Questions is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Questions"));

    Assert.assertTrue("Information regarding the tender is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Information regarding the tender"));

    Assert.assertTrue("Minimal reduction step is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Minimal reduction step"));

    Assert.assertTrue("Guarantee amount is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Guarantee amount"));

    Assert.assertTrue("Estimated value is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Estimated value"));

    Assert.assertTrue("Scope of procurement is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Scope of procurement"));

    Assert.assertTrue("Participants proposals is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Participants proposals"));

    Assert.assertTrue("Participant is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Participant"));

    Assert.assertTrue("Proposal is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Proposal"));

    Assert.assertTrue("Documents is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Documents"));

    Assert.assertTrue("Contract is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Contract"));

    Assert.assertTrue("Activation date is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Activation date"));

    Assert.assertTrue("Contract Number is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Contract Number"));

    Assert.assertTrue("Date Singed is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Date Singed"));

    Assert.assertTrue("Duration period is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Duration period"));
}

@Test
    public void change_lang_RUS_test(){
    headerPage = new HeaderPage(getDriver());

    headerPage.clickLangBox();

    headerPage.clickRus();

    Assert.assertTrue("О системе is not matched",
            driver.findElement(By.className("sb-nav__center")).getText().contains("О системе"));

    Assert.assertTrue("Заказчикам is not matched",
            driver.findElement(By.className("sb-nav__center")).getText().contains("Заказчикам"));

    Assert.assertTrue("Поставщикам is not matched",
            driver.findElement(By.className("sb-nav__center")).getText().contains("Поставщикам"));

    Assert.assertTrue("Площадкам is not matched",
            driver.findElement(By.className("sb-nav__center")).getText().contains("Площадкам"));

    Assert.assertTrue("Регламент is not matched",
            driver.findElement(By.className("sb-nav__center")).getText().contains("Регламент"));

    Assert.assertTrue("Контакты is not matched",
            driver.findElement(By.className("sb-nav__center")).getText().contains("Контакты"));

    /*Assert.assertTrue("Procedures is not matched",
            driver.findElement(By.className("sb-nav__center")).getText().contains("Procedures"));*/

    Assert.assertTrue("Main header is not matched",
            driver.findElement(By.className("c-main__cell")).getText().contains("Открытая система коммерческих закупок"));

    Assert.assertTrue("Тендеры is not matched",
            driver.findElement(By.className("c-main__cell")).getText().contains("Тендеры"));

    Assert.assertTrue("Планы is not matched",
            driver.findElement(By.className("c-main__cell")).getText().contains("Планы"));

    Assert.assertTrue("Расширенный поиск is not matched",
            driver.findElement(By.className("c-main__cell")).getText().contains("Расширенный поиск"));

    Assert.assertTrue("Поставщикам is not matched",
            driver.findElement(By.className("c-twoc__table")).getText().contains("Поставщикам"));

    Assert.assertTrue("Description of Economic operators is not matched",
            driver.findElement(By.className("c-twoc__table")).getText().contains("Хотите увеличить продажи без затрат на " +
                    "привлечение клиентов? Участие в тендерах крупного бизнеса в Системе Rialto - без коррупции, открыто " +
                    "и прозрачно. Чтобы начать, выберите площадку для работы, регистрируйтесь и получайте доступ ко всем " +
                    "тендерам."));


    /*Assert.assertTrue("Procuring Entitites is not matched",
            driver.findElement(By.cssSelector(".c-twoc__cell.c-twoc__cell--description']")).getText().contains("Procuring Entitites"));*/

    /*Assert.assertTrue("Description of Procuring Entitites is not matched",
            driver.findElement(By.className("c-twoc__table")).getText().contains("Conduct tenders professionally in the " +
                    "RIALTO system - announce your tenders and they will be available for economic operators on all of the ePlatforms. " +
                    "Choose the best proposal and save your money and time. In order to start, choose an ePlatform and register  "));*/

    Assert.assertTrue("Выбрать площадку is not matched",
            driver.findElement(By.className("b-left")).getText().contains("Выбрать площадку"));

    Assert.assertTrue("RIALTO describe is not matched",
            driver.findElement(By.className("c-text__wrap")).getText().contains("Система Риальто состоит из Центральной " +
                    "базы данных и площадок для работы поставщиков и заказчиков. Благодаря синхронизации все тендеры " +
                    "доступны к участию на всех площадках, независимо от того, на какой площадке заказчик объявил тендер."));

    Assert.assertTrue("ЗАРЕГИСТРИРОВАТЬСЯ is not matched",
            driver.findElement(By.className("c-part-button__center")).getText().contains("ЗАРЕГИСТРИРОВАТЬСЯ"));

    mainPage = new MainPage(getDriver());

    mainPage.clickAdvancedSearch();

    Assert.assertTrue("Поиск is not matched",
            driver.findElement(By.id("search_button_simple")).getText().contains("Поиск"));

    Assert.assertTrue("Выбранные фильтры is not matched",
            driver.findElement(By.className("col-25 ")).getText().contains("Выбранные фильтры"));

    Assert.assertTrue("Классификатор товаров и услуг is not matched",
            driver.findElement(By.className("col-25 ")).getText().contains("Классификатор товаров и услуг"));

    Assert.assertTrue("Наименование заказчика  is not matched",
            driver.findElement(By.className("col-25 ")).getText().contains("Наименование заказчика"));

    Assert.assertTrue("Статус тендера is not matched",
            driver.findElement(By.className("col-25 ")).getText().contains("Статус тендера"));

    Assert.assertTrue("Период уточнений is not matched",
            driver.findElement(By.className("sb-f__checkbox-wrap")).getText().contains("Период уточнений"));

    Assert.assertTrue("Аукцион is not matched",
            driver.findElement(By.className("sb-f__checkbox-wrap")).getText().contains("Аукцион"));

    searchPage = new SearchPage(getDriver());
    searchPage.clickClearFilter();

    searchPage.fill_Search_Input_Field("R-UA-2017-10-23-000003");

    searchPage.clickSearchButton();

    searchPage.clickNameTrendByOrderNumber(0);

    Assert.assertTrue("Заказчик  is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Заказчик"));

    Assert.assertTrue("Название заказчика  is not matched",
            driver.findElement(By.className("mobile-table")).getText().contains("Название заказчика"));

    Assert.assertTrue("Код  is not matched",
            driver.findElement(By.className("mobile-table")).getText().contains("Код"));

    Assert.assertTrue("Веб-сайт  is not matched",
            driver.findElement(By.className("mobile-table")).getText().contains("Веб-сайт"));

    Assert.assertTrue("Адрес  is not matched",
            driver.findElement(By.className("mobile-table")).getText().contains("Адрес"));

    Assert.assertTrue("Контактное лицо заказчика  is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Контактное лицо заказчика"));

    Assert.assertTrue("Контактное лицо is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Контактное лицо"));

    Assert.assertTrue("Телефон is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Телефон"));

    Assert.assertTrue("E-mail контактного лица is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("E-mail контактного лица"));

    Assert.assertTrue("Сроки is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Сроки"));

    Assert.assertTrue("Начало периода уточнений is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Начало периода уточнений"));

    Assert.assertTrue("Период уточнений до is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Период уточнений до"));

    Assert.assertTrue("Подача предложений is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Подача предложений"));

    Assert.assertTrue("Подача предложений до is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Подача предложений до"));

    Assert.assertTrue("ID тендера is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("ID тендера"));

    Assert.assertTrue("ID is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("ID"));

    Assert.assertTrue("ID тендера is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("ID тендера"));

    Assert.assertTrue("Документация is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Документация"));

    Assert.assertTrue("Общая информация is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Общая информация"));

    Assert.assertTrue("Вопросы и ответы is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Вопросы и ответы"));

    Assert.assertTrue("Информация о закупке is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Информация о закупке"));

    Assert.assertTrue("Минимальный шаг is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Минимальный шаг"));

    Assert.assertTrue("Гарантия amount is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Гарантия"));

    Assert.assertTrue("Ожидаемая стоимость is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Ожидаемая стоимость"));

    Assert.assertTrue("Предмет закупки is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Предмет закупки"));

    Assert.assertTrue("Предложения участников is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Предложения участников"));

    Assert.assertTrue("Участник is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Участник"));

    Assert.assertTrue("Цена is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Цена"));

    Assert.assertTrue("Документы is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Документы"));

    Assert.assertTrue("Договор is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Договор"));

    Assert.assertTrue("Дата активации is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Дата активации"));

    Assert.assertTrue("Номер договора is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Номер договора"));

    Assert.assertTrue("Дата подписания is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Дата подписания"));

    Assert.assertTrue("Срок дейсвтия is not matched",
            driver.findElement(By.className("block-text-tender")).getText().contains("Срок дейсвтия"));
}

    @Test
    public void lang_UKR_test(){
        headerPage = new HeaderPage(getDriver());

        Assert.assertTrue("Про систему is not matched",
                driver.findElement(By.className("sb-nav__center")).getText().contains("Про систему"));

        Assert.assertTrue("Замовникам is not matched",
                driver.findElement(By.className("sb-nav__center")).getText().contains("Замовникам"));

        Assert.assertTrue("Постачальникам is not matched",
                driver.findElement(By.className("sb-nav__center")).getText().contains("Постачальникам"));

        Assert.assertTrue("Майданчикам is not matched",
                driver.findElement(By.className("sb-nav__center")).getText().contains("Майданчикам"));

        Assert.assertTrue("Регламент is not matched",
                driver.findElement(By.className("sb-nav__center")).getText().contains("Регламент"));

        Assert.assertTrue("Контакти is not matched",
                driver.findElement(By.className("sb-nav__center")).getText().contains("Контакти"));

    Assert.assertTrue("Процедури is not matched",
            driver.findElement(By.className("sb-nav__center")).getText().contains("Процедури"));

        Assert.assertTrue("Main header is not matched",
                driver.findElement(By.className("c-main__cell")).getText().contains("Відкрита система комерційних закупівель"));

        Assert.assertTrue("Тендери is not matched",
                driver.findElement(By.className("c-main__cell")).getText().contains("Тендери"));

        Assert.assertTrue("Плани is not matched",
                driver.findElement(By.className("c-main__cell")).getText().contains("Плани"));

        //Assert.assertTrue("Розширений пошук is not matched",
                //driver.findElement(By.className("sb-search-input__center")).getText().contains("Розширений пошук "));

        Assert.assertTrue("Постачальникам is not matched",
                driver.findElement(By.className("c-twoc__table")).getText().contains("Постачальникам"));

        Assert.assertTrue("Description of Economic operators is not matched",
                driver.findElement(By.className("c-twoc__table")).getText().contains("Бажаєте збільшити продажі без " +
                        "витрат на залучення клієнтів? Участь в тендерах великого бізнесу в системі Rialto – без " +
                        "особистих зв'язків, відкрито і прозоро. Для того, щоб почати, реєструйтесь і отримуйте " +
                        "доступ до тендерів."));


    /*Assert.assertTrue("Procuring Entitites is not matched",
            driver.findElement(By.cssSelector(".c-twoc__cell.c-twoc__cell--description']")).getText().contains("Procuring Entitites"));*/

    /*Assert.assertTrue("Description of Procuring Entitites is not matched",
            driver.findElement(By.className("c-twoc__table")).getText().contains("Conduct tenders professionally in the " +
                    "RIALTO system - announce your tenders and they will be available for economic operators on all of the ePlatforms. " +
                    "Choose the best proposal and save your money and time. In order to start, choose an ePlatform and register  "));*/

        Assert.assertTrue("Обрати майданчик is not matched",
                driver.findElement(By.className("b-left")).getText().contains("Обрати майданчик"));

        Assert.assertTrue("RIALTO describe is not matched",
                driver.findElement(By.className("c-text__wrap")).getText().contains("Система Rialto складається з " +
                        "Центральної бази даних та майданчиків для роботи постачальників та замовників. Завдяки " +
                        "синхронізації всі тендери доступні постачальникам, зареєстрованим на всіх майданчиках системи, " +
                        "незалежно від того, на якому майданчику цей тендер був оголошений. Щоб почати роботу, необхідно " +
                        "обрати один з майданчиків та зареєструватись на ньому. Після цього ви зможете проводити закупівлі " +
                        "і приймати в них участь."));

        Assert.assertTrue("ЗАРЕЄСТРУВАТИСЯ is not matched",
                driver.findElement(By.className("c-part-button__center")).getText().contains("ЗАРЕЄСТРУВАТИСЯ"));

        mainPage = new MainPage(getDriver());

        mainPage.clickAdvancedSearch();

        Assert.assertTrue("Пошук is not matched",
                driver.findElement(By.id("search_button_simple")).getText().contains("Пошук"));

        /*Assert.assertTrue("Обрані фільтри is not matched",
                driver.findElement(By.className("sb-f__title")).getText().contains("Selected filters"));

        Assert.assertTrue("Класифікатор товарів та послуг is not matched",
                driver.findElement(By.className("sb-f__title")).getText().contains(" Класифікатор товарів та послуг"));

        Assert.assertTrue("Замовник  is not matched",
                driver.findElement(By.className("sb-f__title")).getText().contains("Замовник"));

        Assert.assertTrue("Статус тендеру is not matched",
                driver.findElement(By.className("sb-f__title")).getText().contains("Статус тендеру"));

        Assert.assertTrue("Період уточнень is not matched",
                driver.findElement(By.className("sb-f__checkbox-wrap")).getText().contains("Період уточнень"));

        Assert.assertTrue("Аукціон is not matched",
                driver.findElement(By.className("sb-f__checkbox-wrap")).getText().contains("Аукціон"));*/

        searchPage = new SearchPage(getDriver());
        searchPage.clickClearFilter();

        searchPage.fill_Search_Input_Field("R-UA-2017-10-23-000003");

        searchPage.clickSearchButton();

        searchPage.clickNameTrendByOrderNumber(0);

        Assert.assertTrue("Замовник  is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Замовник"));

        Assert.assertTrue("Назва замовника is not matched",
                driver.findElement(By.className("mobile-table")).getText().contains("Назва замовника"));

        Assert.assertTrue("Код is not matched",
                driver.findElement(By.className("mobile-table")).getText().contains("Код"));

        Assert.assertTrue("Веб-сайт is not matched",
                driver.findElement(By.className("mobile-table")).getText().contains("Веб-сайт"));

        Assert.assertTrue("Адреса is not matched",
                driver.findElement(By.className("mobile-table")).getText().contains("Адреса"));

        Assert.assertTrue("Контактна особа замовника is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Контактна особа замовника"));

        Assert.assertTrue("Контактна особа is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Контактна особа"));

        Assert.assertTrue("Телефон is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Телефон"));

        Assert.assertTrue("E-mail контактної особи is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("E-mail контактної особи"));

        Assert.assertTrue("Строки is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Строки"));

        Assert.assertTrue("Початок періоду уточнень is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Початок періоду уточнень"));

        Assert.assertTrue("Період уточнень до is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Період уточнень"));

        Assert.assertTrue("Початок прийому пропозицій is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Початок прийому пропозицій"));

        Assert.assertTrue("Подання пропозицій до is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Подання пропозицій до"));

        Assert.assertTrue("ID тендеру is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("ID тендеру"));

        Assert.assertTrue("ID is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("ID"));

        Assert.assertTrue("ID тендеру is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("ID тендеру"));

        Assert.assertTrue("Документація is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Документація"));

        Assert.assertTrue("Загальна інформація is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Загальна інформація"));

        Assert.assertTrue("Питання і відповіді is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Питання і відповіді"));

        Assert.assertTrue("Інформація про закупівлю is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Інформація про закупівлю"));

        Assert.assertTrue("Мінімальний крок is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Мінімальний крок"));

        Assert.assertTrue("Гарантійне забезпечення is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Гарантійне забезпечення"));

        Assert.assertTrue("Сума гарантії is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Сума гарантії"));

        Assert.assertTrue("Предмет закупівлі is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Предмет закупівлі"));

        Assert.assertTrue("Пропозиції учасників is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Пропозиції учасників"));

        Assert.assertTrue("Учасник is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Учасник"));

        Assert.assertTrue("Пропозиція is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Пропозиція"));

        Assert.assertTrue("Документи is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Документи"));

        Assert.assertTrue("Договір is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Договір"));

        Assert.assertTrue("Дата активації is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Дата активації"));

        Assert.assertTrue("Номер договору is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Номер договору"));

        Assert.assertTrue("Дата підписання is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Дата підписання"));

        Assert.assertTrue("Строк дії is not matched",
                driver.findElement(By.className("block-text-tender")).getText().contains("Строк дії"));
    }

}
