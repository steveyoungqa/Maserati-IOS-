package Appium;

import PageObjects.iosPageObjects;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleTest {

    private AndroidDriver driver;
    iosPageObjects iosPageObjects = new iosPageObjects();

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "7.0");
        desiredCapabilities.setCapability("deviceName", "S7Edge");
        desiredCapabilities.setCapability("avd", "Galaxy_S7_Edge_API_22");
        desiredCapabilities.setCapability("app", "/Users/steveyoung/Documents/Appium/HLandroid.apk");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("noReset", "true");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }



        //SLIDER
//        findElementWithTimeout((By.id(appium.durationSlider())), 10).sendKeys("0.9");

//        //Picker element example using XCUI Test and JScript

//        driver.findElement(By.id(appium.backButton())).click();
//        driver.findElement(By.id(appium.pickers())).click();
//        RemoteWebElement elements = (RemoteWebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypePicker/XCUIElementTypePickerWheel[1]"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        HashMap<String, Object> params = new HashMap<String, Object>();
//        params.put("order", "next");
//        params.put("offset", 0.15);
//        params.put("element", ((RemoteWebElement) elements).getId());
//        js.executeScript("mobile: selectPickerWheelValue", params);

    //Scroll down whole page

//    JavascriptExecutor js = (JavascriptExecutor) driver;
//    HashMap<String, String> swipeObject = new HashMap<String, String>();
//
//        swipeObject.put("direction", "down"); //up for swipe
//        swipeObject.put("startX", "90");
//        swipeObject.put("startY", "400");
//        swipeObject.put("endX", "90"); //"90");
//        swipeObject.put("endY", "350"); //"200");
//        swipeObject.put("duration", "2000");
//        js.executeScript("mobile: scroll", swipeObject);

    public void setLocation(Integer Latitude, Integer Longitude, Integer Altitude) throws IOException {
        Location location = new Location(Latitude, Longitude, Altitude);
        driver.setLocation(location);
        System.out.println(location);
    }

    public void ouputSessionCapabilities() throws IOException {
        Map<String, Object> testCaps = driver.getSessionDetails();
        System.out.println(testCaps);
    }

    public void swipeDown() throws IOException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "down");
        js.executeScript("mobile: swipe", scrollObject);
    }

}

