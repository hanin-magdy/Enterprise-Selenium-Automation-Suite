package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowPage {
    private WebDriver driver;
    private By clickHereLink = By.linkText("Click Here");
    public MultipleWindowPage(WebDriver driver){
        this.driver = driver;
    }
    public NewWindowPage clickLink(){
        driver.findElement(clickHereLink).click();
        return new NewWindowPage(driver);
    }
}
