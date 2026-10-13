package JS;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class JavaScriptScrollTests extends BaseTest {
    @Test
    public void testScrollIntoTable(){
        var largeAndDeepDomPage = homePage.clickLargeAndDeepDomPage();
        largeAndDeepDomPage.scrolleToTable();
    }
    @Test
    public void testScrollToFifthParagraph(){
       homePage.clickInfiniteScroll().scrollIntoParagraph(5);
    }
}
