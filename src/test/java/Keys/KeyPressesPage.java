package Keys;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyPressesPage extends BaseTest {
    @Test
    public void testKeyPresses(){
        var keyPressesPage = homePage.clickKeyPresses();

//        keyPressesPage.setText("a"+ Keys.BACK_SPACE);
        keyPressesPage.setText(Keys.chord(Keys.SHIFT,"a"));

//        Assert.assertEquals(keyPressesPage.getText(),"You entered: BACK_SPACE",
//                "The message is incorrect");
        Assert.assertEquals(keyPressesPage.getText(),"You entered: A",
                "The message is incorrect");


    }
}
