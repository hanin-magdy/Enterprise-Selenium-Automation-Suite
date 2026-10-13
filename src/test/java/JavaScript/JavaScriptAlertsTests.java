package JavaScript;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptAlertsTests extends BaseTest {
    @Test
    public void testAcceptAlert(){
       var JavaScriptAlertsPage = homePage.clickJavaScriptAlerts();
       JavaScriptAlertsPage.clickAlertButton();
       JavaScriptAlertsPage.alert_clickToAccept();
       Assert.assertEquals(JavaScriptAlertsPage.getResultText(),
               "You successfully clicked an alert","Incorrect Text");
    }
    @Test
    public void testDismissConfirm(){
        var JavaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        JavaScriptAlertsPage.clickConfirmButton();
        String confirmText= JavaScriptAlertsPage.alert_getText();
        JavaScriptAlertsPage.alert_clickToDismiss();
        Assert.assertEquals(confirmText,"I am a JS Confirm",
                "The Alert Text Is Incorrect");
    }
    @Test
    public void testPrompt(){
        var JavaScriptAlertsPage = homePage.clickJavaScriptAlerts();
        JavaScriptAlertsPage.clickPromptButton();
        JavaScriptAlertsPage.alert_setAlertText("Route");
        JavaScriptAlertsPage.alert_clickToAccept();
        Assert.assertEquals(JavaScriptAlertsPage.getResultText(),"You entered: Route",
                "Incorrect Message");
    }
}
