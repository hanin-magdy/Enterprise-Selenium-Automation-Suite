package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import java.time.Duration;

public class EntryAdPage {
    private WebDriver driver;
    private By closeButton = By.xpath("//div[@class='modal-footer']//p");
    private By entryAdTitle = By.xpath("//h3[text()='Entry Ad']");
    private By clickHere = By.id("restart-ad");
    public EntryAdPage (WebDriver driver){
        this.driver = driver;
    }
    public void closeModal(){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(closeButton)).click();
        driver.findElement(closeButton).click();
    }
    public String getHeaderText(){
       return driver.findElement(entryAdTitle).getText();
    }
    public void clickLink(){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(closeButton)).click();
        driver.findElement(clickHere).click();
    }
}
