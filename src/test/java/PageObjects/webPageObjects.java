package PageObjects;

import Appium.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class webPageObjects extends DriverFactory {

    public WebElement GetInTouch () throws IOException {
        return findElement(By.xpath("//*[@href='/shoppingtool/wtl/international/en']"), 5);
    }

    public WebElement CookieLink () throws IOException {
        return findElement(By.xpath("//*[@id='cookieAlert']/span"), 5);
    }

    public WebElement CountryDropdown() throws IOException {
        return findElement(By.xpath("//*[@class='beautify required-field'][@name='country']"), 5);
    }

    public WebElement CountryDropdownPicker(String country) throws IOException {
        return findElement(By.xpath("//*[@class='beautify required-field'][@name='country']//*[contains(text(),'" + country + "')]"), 5);
    }

    public WebElement FirstName() throws IOException {
        return findElement(By.xpath("//*[@class='beautify required-field'][@name='first_name']"), 5);
    }

    public WebElement currentCar() throws IOException {
        return findElement(By.name("current_model"), 5);
    }

    public WebElement chooseCarOption(String car) throws IOException {
        return findElement(By.xpath("[@name='current_model']//*[contains(text(),'" + car + "')]"), 5);
    }
    public WebElement clickAwayToMainForm() throws IOException {
        return findElement(By.xpath("//*[@class='wtl-form wtl-active']"), 5);
    }

}
