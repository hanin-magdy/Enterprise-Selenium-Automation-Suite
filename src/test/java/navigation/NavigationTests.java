package navigation;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.WindowManager;

public class NavigationTests extends BaseTest {
    @Test
    public void testNavigation(){
        homePage.clickDynamicLoading().clickEx1Link();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://www.google.com/");
    }
    @Test
    public void testSwitchToTap(){
      var newWindowPage = homePage.clickMultipleWindow().clickLink();
      getWindowManager().switchToTap("New Window");
     Assert.assertEquals( newWindowPage.getHeaderText(),"New Window",
             "You are in the wrong context");
    }
}
