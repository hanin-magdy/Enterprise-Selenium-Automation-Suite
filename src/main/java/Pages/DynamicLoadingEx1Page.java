package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingEx1Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("div[id='start'] button");
    private By loadedText = By.id("finish");
//    private By loadingIndicator = By.id("loading");
    public DynamicLoadingEx1Page(WebDriver driver){
        this.driver = driver;
    }
    public void clickStartButton(){
        driver.findElement(startButton).click();
//        try {
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));

        FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(loadedText)));
    }
    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }
}
