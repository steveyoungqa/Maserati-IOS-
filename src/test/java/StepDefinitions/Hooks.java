package StepDefinitions;

import Appium.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.ios.IOSDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Hooks extends DriverFactory {

    @Before
    public void before() throws Exception {
    }

//    @After
//    public void after(Scenario scenario) throws Exception {
//        Runtime.getRuntime().exec("mvn test verify -DskipTests");
//        String localDir = System.getProperty("user.dir");
//        File reports = new File(localDir + "/target/site/cucumber-reports/");
//        Runtime.getRuntime().exec("open " + reports);
//
//        if (scenario.isFailed()) {
//            System.out.println("Test Failed");
//            iTakeAScreenshot();
//        }
//    }

    @After
    public void after () throws Exception {
        Thread.sleep(3000);
        webDriver.quit();
    }
}