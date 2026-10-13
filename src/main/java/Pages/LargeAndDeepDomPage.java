package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDomPage {
    private WebDriver driver;
    private By table = By.id("large-table");
    public LargeAndDeepDomPage (WebDriver driver){
        this.driver = driver;
    }
    public void scrolleToTable(){
         WebElement tableElement = driver.findElement(table);
         org.openqa.selenium.JavascriptExecutor js = (JavascriptExecutor)driver;
         String script = "arguments[0].scrollIntoView();";
         js.executeScript(script,tableElement);
    }

}
