package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By paragraph = By.className("jscroll-added");
    public InfiniteScrollPage (WebDriver driver){
        this.driver = driver;
    }

    /**
     *
     * @param index paragraph to scroll to
     */
    public void scrollIntoParagraph(int index) {
        org.openqa.selenium.JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "window.scrollTo(0,document.body.scrollHeight);";

        while (getNumberOfParagraph()<index){
            js.executeScript(script);
        }
    }
    public int getNumberOfParagraph(){
        return driver.findElements(paragraph).size();
    }
}
