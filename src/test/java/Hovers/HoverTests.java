package Hovers;

import Pages.HomePage;
import Pages.HoversPage;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTests extends BaseTest {
    @Test
    public void testHoverOverFigure(){
       var hoversPage = homePage.clickHovers();
       int figureIndex = 1;
       var figureCaption = hoversPage.hoverOverFigure(figureIndex);
       Assert.assertTrue(figureCaption.isDisblayed(),"The caption is not displayed");
       Assert.assertEquals(figureCaption.getName(),"name: user"+figureIndex,
               "The name is incorrect");
       Assert.assertEquals(figureCaption.getLinkText(),"View profile",
               "The link text is incorrect");
       Assert.assertTrue(figureCaption.getLink().contains("/users/"+figureIndex),
               "The link is incorrect");
    }

}
