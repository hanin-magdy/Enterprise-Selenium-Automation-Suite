package ModalsEntryAd;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EntryAdTests extends BaseTest {
    @Test
    public void testModals1(){
        var EntryAdPage =  homePage.clickEntryAd();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        EntryAdPage.closeModal();
        Assert.assertEquals(EntryAdPage.getHeaderText(),"Entry Ad",
                "Invalid Header");
    }

    @Test
    public void testModals2(){
        var EntryAdPage =  homePage.clickEntryAd();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//      EntryAdPage.closeModal();
        EntryAdPage.clickLink();
        Assert.assertEquals(EntryAdPage.getHeaderText(),"Entry Ad",
                "Invalid Header");
    }
}
