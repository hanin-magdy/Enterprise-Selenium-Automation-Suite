package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private By securemessage = By.id("flash");
    private WebDriver driver;
    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }
    public String getText(){
       return driver.findElement(securemessage).getText();
//       String message = driver.findElement(securemessage).getText();
//       return message;
    }
}
