package Login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTest;
import org.testng.Assert.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest {
    @Test
    public void testSuccessfulLogin(){
      LoginPage loginPage = homePage.clickFormAuthenticationLink();
      loginPage.setUserNameField("tomsmith");
      loginPage.setPasswordField("SuperSecretPassword!");
      SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
      assertTrue(secureAreaPage.getText().contains("You logged into a secure area!"),
              "The message is incorrect");
    }

}
