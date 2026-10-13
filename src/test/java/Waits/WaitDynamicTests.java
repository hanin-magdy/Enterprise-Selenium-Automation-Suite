package Waits;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitDynamicTests extends BaseTest {
    @Test

    public void testWait1(){
        var ex1Page = homePage.clickDynamicLoading().clickEx1Link();
        ex1Page.clickStartButton();
        Assert.assertEquals(ex1Page.getLoadedText(),"Hello World!",
                "The Text Is Incorrect");
    }


    public void testWait2(){
        var ex2Page = homePage.clickDynamicLoading().clickEx2Link();
        ex2Page.clickStartButton();
        Assert.assertEquals(ex2Page.getLoadedText(),"Hello World!",
                "The Text Is Incorrect");
    }
}
