package StepDefinitions;

import Appium.DriverFactory;
import PageObjects.webPageObjects;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WebStepDefs extends DriverFactory {

    webPageObjects webPageObjects = new webPageObjects();

    @Given("^I am using the \"([^\"]*)\" browser$")
    public void iAmUsingTheBrowser(String browser) throws Throwable {
        createNewWebDriver(browser);
    }

    @Given("^I am on the landing page of \"([^\"]*)\"$")
    public void iAmOnTheLandingPageOf(String URL) throws Throwable {
        webDriver.get(URL);
    }

    @And("^I click on the Get In Touch link$")
    public void iClickOnTheGetInTouchLink() throws Throwable {
        webPageObjects.GetInTouch().click();
    }


    @Then("^I dismiss the cookie link$")
    public void iDismissTheCookieLink() throws Throwable {
        webPageObjects.CookieLink().click();
    }

    @Then("^I select a Country of Residence of \"([^\"]*)\"$")
    public void iSelectACountryOfResidenceOf(String country) throws Throwable {
        webPageObjects.CountryDropdownPicker(country).click();

        //Alternative using Select and two extra lines of code ???!!?!?

//        WebElement element = webPageObjects.CountryDropdown();
//        Select select = new Select(element);
//        select.selectByVisibleText(country);
    }

    @Then("^I choose a First Name of \"([^\"]*)\"$")
    public void iChooseAFirstNameOf(String firstName) throws Throwable {
        webPageObjects.FirstName().sendKeys(firstName);
    }

    @And("^I choose a Current Car of \"([^\"]*)\"$")
    public void iChooseACurrentCarOf(String car) throws Throwable {
        webPageObjects.currentCar().sendKeys(car);
        Thread.sleep(2000);
        webPageObjects.clickAwayToMainForm().click();
    }
}
