package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    public DynamicLoadingPage (WebDriver driver){
        this.driver = driver;
    }
    public DynamicLoadingEx1Page clickEx1Link(){
        driver.findElement(By.partialLinkText("Example 1")).click();
        return new DynamicLoadingEx1Page(driver);
    }
    public DynamicLoadingEx2Page clickEx2Link(){
        driver.findElement(By.partialLinkText("Example 2")).click();
        return new DynamicLoadingEx2Page(driver);
    }
}
