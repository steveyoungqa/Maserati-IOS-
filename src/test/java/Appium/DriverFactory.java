package Appium;

import StepDefinitions.iosStepdefs;
import io.appium.java_client.ios.IOSDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import static StepDefinitions.WebStepDefs.webDriver;

public class DriverFactory  {
    
    protected static IOSDriver driver;
    protected static WebDriver webDriver;

    public static IOSDriver createNewDriverInstance() throws IOException {

      driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), iosStepdefs.caps);

        return driver;
    }


    public static WebDriver createNewWebDriver(String browser) throws IOException {

        if (webDriver == null) {

            if (browser.equals("firefox")) {
                webDriver = new FirefoxDriver();
            }
            if (browser.equals("Chrome")) {
                webDriver = new ChromeDriver();
            } else {
                System.out.println("can't read browser type!");
            }
        }
        return webDriver;
    }


    public WebElement findElement(By by, int timeOutInSeconds) throws IOException {

        try {
            return (WebElement) (new WebDriverWait(webDriver, timeOutInSeconds)).until(ExpectedConditions.elementToBeClickable(by));
        } catch (Exception e) {
//            iTakeAScreenshot();
//            System.out.println("Test Failure Screenshot generated");
        }
        return null;
    }

    public void iTakeAScreenshot() throws IOException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-H:m");
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date = new Date();
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String localDir = System.getProperty("user.dir");
        FileUtils.copyFile(scrFile, new File(localDir + "/src/test/Screenshots/ios/" + " TestFailureScreenshot " + dateFormat.format(date) + ".png"));
//        System.out.println(localDir);
    }
}
