package com.aa;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class UnitTest {

    @Test
    public void goToHomePage()
    {
        Pages.homePage().goTo();
        Assert.assertTrue(Pages.homePage().isAt());

    }

    @AfterTest
    public void  cleanUp()
    {
        Browser.close();
    }
}
