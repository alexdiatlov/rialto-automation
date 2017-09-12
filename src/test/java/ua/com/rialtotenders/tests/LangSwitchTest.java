package ua.com.rialtotenders.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.com.rialtotenders.pageObjects.HeaderPage;

public class  LangSwitchTest extends BaseTest {

    private HeaderPage headerPage;

    @Before
    public void setUp() {
        getDriver().get("https://rialtotenders.com.ua");
    }
}
