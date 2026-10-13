package base;

import Pages.HomePage;
import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utilities.MyListener;
import utilities.WindowManager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class BaseTest {
    protected WebDriver driver;
//    private By linksLocator = By.tagName("a");
    protected HomePage homePage;
    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
//        driver = new ChromeDriver(getChromOptions());
//        driver.manage().window().maximize();
//        goHome();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @BeforeMethod
    public void goHome(){
        WebDriverListener listener = new MyListener();
        WebDriver decorated = new EventFiringDecorator<>(listener).decorate(driver);
        decorated.get("https://the-internet.herokuapp.com/");
        setCookie();
        homePage = new HomePage(decorated);

    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenShot = camera.getScreenshotAs(OutputType.FILE);
//            System.out.println("Screenshot taken at path"+ screenShot.getAbsolutePath());
            try {
                Files.move(screenShot, new File("resources/screenshots/"+result.getName()+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private ChromeOptions getChromOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.setExperimentalOption("exculdeSwitches", Arrays.asList("enable-automation"));
//        options.addArguments("--incognito");
//        options.addArguments("--headless");
//        options.addArguments("--disable-notifications");
        return options;
    }

    @AfterClass
    public void cleanUp(){

        driver.quit();
    }

    private void setCookie(){
        Cookie cookie = new Cookie("Route","123");
        driver.manage().addCookie(cookie);
    }


}
