package utilities;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    public WindowManager(WebDriver driver){
        this.driver = driver;
    }
    public void goBack(){
        driver.navigate().back();
    }
    public void goForward(){
        driver.navigate().forward();
    }
    public void refresh(){
        driver.navigate().refresh();
    }
    public void goTo(String url){
        driver.navigate().to(url);
    }
    public void switchToTap(String tabTitle){
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Number Of Opened tabs :" +windowHandles.size());
        for(String windowHandle:windowHandles){
            System.out.println("Switching to window"+windowHandle);
            driver.switchTo().window(windowHandle);
            if(driver.getTitle().equals(tabTitle)){
                break;
            }
        }
    }
}
