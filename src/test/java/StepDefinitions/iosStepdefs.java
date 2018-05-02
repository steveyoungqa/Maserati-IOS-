package StepDefinitions;

import Appium.AppiumServer;
import Appium.DriverFactory;
import PageObjects.iosPageObjects;
import Utils.FileReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class iosStepdefs extends DriverFactory{

    public static DesiredCapabilities caps = new DesiredCapabilities();
    iosPageObjects iosPageObjects = new iosPageObjects();


    @Given("^I am using Appium for device \"([^\"]*)\" and IOS version \"([^\"]*)\"$")
    public void iAmUsingAppiumForDeviceAndIOSVersion(String Device, String IOS) throws Throwable {
        caps.setCapability("deviceName", Device);
        caps.setCapability("platformVersion", IOS);
        caps.setCapability("automationName", "XCUITest");
//        caps.setCapability("autoAcceptAlerts", "true");
    }

    @And("^I am using IOS the app directory of \"([^\"]*)\" and app \"([^\"]*)\"$")
    public void iAmUsingTheAppDirectoryOfAndApp(String dir, String app) throws Throwable {
        File appDir = new File(dir);
        File appPath = new File(appDir, app);
        caps.setCapability("app", appPath);
    }

    @Then("^I launch the App on the IOS Device$")
    public void iLaunchTheAppOnTheDevice() throws Throwable {
        caps.setCapability("useNewWDA", "true");
        caps.setCapability("waitForQuiescence", "false");
        caps.setCapability("shouldUseSingletonTestManager", "false");
        caps.setCapability("clearSystemFiles", "true");
        Runtime.getRuntime().exec("killall -9 node");
        appiumStartStop.appiumStop();
        appiumStartStop.appiumStart();
        createNewDriverInstance();
//        driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Then("^I close down the IOS simulator$")
    public void iCloseDownTheSimulatorFor() throws Throwable {
        appiumStartStop.appiumStop();
        Runtime.getRuntime().exec("killall iOS Simulator");
    }

    // Mobile browser caps and example
    @Given("^I am using Safari mobile browser to visit \"([^\"]*)\"$")
    public void iAmUsingSafariMobileBrowserToVisit(String url) throws Throwable {
        caps.setCapability("deviceName", "iPhone 6");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "11.2");
        caps.setCapability("browserName", "safari");

        driver.get(url);
    }


    @Then("^I Pause for (\\d+) seconds to debug$")
    public void iPauseForSecondsToDebug(int arg0) throws Throwable {
        Thread.sleep(arg0 * 1000);
    }


    @Then("^I IOS pull down and refresh the page$")
    public void iIOSPullDownAndRefreshThePage() throws Throwable {

        new TouchAction((MobileDriver) driver)
                .press(188, 70)
                .waitAction(Duration.ofSeconds(2))
                .moveTo(188, 670).release().perform();


//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        HashMap<String, String> scrollObject = new HashMap<String, String>();
//        scrollObject.put("direction", "down");
//        js.executeScript("mobile: swipe", scrollObject);


    }

    @Then("^the ISO Main Maserati opening scene is played$")
    public void theISOMainMaseratiOpeningSceneIsPlayed() throws Throwable {
//        driver.findElementByAccessibilityId(iosPageObjects.mainScreen()).isDisplayed();
    }

    @And("^then I IOS swipe to the Left$")
    public void thenIIOSSwipeToTheLeft() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("direction", "left");
        js.executeScript("mobile: swipe", scrollObject);
    }

    @When("^I IOS select the Book icon$")
    public void iIOSSelectTheBookIcon() throws Throwable {
        driver.findElementByXPath(iosPageObjects.bookIcon()).click();
    }

    @And("^I IOS select the Create Account button$")
    public void iIOSSelectTheCreateAccountButton() throws Throwable {
        driver.findElementByAccessibilityId(iosPageObjects.createAccountButton()).click();
    }

    @Then("^I IOS enter A First Name of \"([^\"]*)\"$")
    public void iIOSEnterAFirstNameOf(String firstname) throws Throwable {
//        System.out.println(driver.getPageSource());
        driver.findElementByXPath(iosPageObjects.firstName()).sendKeys(firstname);
    }

    @And("^I IOS select Next$")
    public void iIOSSelectNext() throws Throwable {
        driver.findElementByName(iosPageObjects.next()).click();
    }

    @Then("^I IOS enter a Surname of \"([^\"]*)\"$")
    public void iIOSEnterASurnameOf(String surname) throws Throwable {
        driver.findElementByXPath(iosPageObjects.surname()).sendKeys(surname);
    }

    @And("^I IOS enter a Unique Email Address$")
    public void iIOSEnterAUniqueEmailAddress() throws Throwable {
        String uniqueEmailAddress = "grapplemobilet+" + randomAlphabetic(3) + randomNumeric(2) + "@gmail.com";
        FileReader.addData("uniqueEmail", uniqueEmailAddress);

        driver.findElementByXPath(iosPageObjects.emailAddress()).sendKeys(uniqueEmailAddress);
    }


    @Then("^I IOS enter a Date of Birth of \"([^\"]*)\"$")
    public void iIOSEnterADateOfBirthOf(String dob) throws Throwable {
        driver.findElementByXPath(iosPageObjects.dateOfBirth()).sendKeys(dob);
    }

    @And("^I IOS enter a Phone Number of \"([^\"]*)\"$")
    public void iIOSEnterAPhoneNumberOf(String phone) throws Throwable {
        driver.findElementByXPath(iosPageObjects.phoneNumber()).sendKeys(phone);
    }

    @Then("^I IOS enter a PostCode of \"([^\"]*)\"$")
    public void iIOSEnterAPostCodeOf(String postcode) throws Throwable {
        driver.findElementByXPath(iosPageObjects.postcode()).sendKeys(postcode);
    }

    @Then("^I IOS select Use my current location$")
    public void iIOSSelectUseMyCurrentLocation() throws Throwable {
        driver.findElementByAccessibilityId(iosPageObjects.useMyLocation()).click();
    }

    @And("^I IOS select the \"([^\"]*)\" option$")
    public void iIOSSelectTheOption(String dealer) throws Throwable {
       driver.findElementByName(dealer).click();
    }

    @And("^I IOS choose to Skip the Add Vin option$")
    public void iIOSChooseToSkipTheAddVinOption() throws Throwable {
        driver.findElementByAccessibilityId(iosPageObjects.skipButton()).click();
    }

    @Then("^I IOS select the Direct Marketing switch to On$")
    public void iIOSSelectTheDirectMarketingSwitchToOn() throws Throwable {
        driver.findElementByAccessibilityId(iosPageObjects.directMarketingSwitch()).click();
    }

    @Then("^I IOS select the Collect Customer Data switch to On$")
    public void iIOSSelectTheCollectCustomerDataSwitchToOn() throws Throwable {
        driver.findElementByAccessibilityId(iosPageObjects.collectDataSwitch()).click();
    }

    @Then("^I IOS create a Random password$")
    public void iIOSCreateARandomPassword() throws Throwable {
        String randomPassword = "Qa9" + randomAlphabetic(3) + randomNumeric(2);
        FileReader.addData("randomPassword", randomPassword);
        driver.findElementByXPath(iosPageObjects.passwordField()).sendKeys(randomPassword);
        System.out.println("The framework has stored the random generated password which is " + randomPassword);
    }

    @And("^I IOS Accept the Terms & Conditions$")
    public void iIOSAcceptTheTermsConditions() throws Throwable {
        driver.findElementByAccessibilityId(iosPageObjects.acceptTerms()).click();
    }

    @Then("^I IOS Complete Registration$")
    public void iIOSCompleteRegistration() throws Throwable {
        driver.findElement(By.name(iosPageObjects.completeRegistration())).click();
    }

    @And("^I IOS Allow the device to use My Location$")
    public void iIOSAllowTheDeviceToUseMyLocation() throws Throwable {
        try { driver.findElement(By.name(iosPageObjects.allow())).click();

        } catch (NoSuchElementException | StaleElementReferenceException e) {
                //No Pop-up was displayed so skipping
        }
    }

    public class appiumStartStop extends AppiumServer {

    }

//    public class driverFactory extends DriverFactory {
//
//    }



}
