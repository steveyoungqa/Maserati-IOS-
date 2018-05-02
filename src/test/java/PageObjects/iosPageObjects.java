package PageObjects;

import java.io.IOException;


public class iosPageObjects {


    public String mainScreen() throws IOException {
        return "Maserati Staging";
    }

    public String bookIcon() throws IOException {
        return "//XCUIElementTypeApplication[@name=\"Maserati Staging\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeTabBar/XCUIElementTypeButton[2]";
    }

    public String createAccountButton() throws IOException {
        return "CREATE ACCOUNT";
    }

    public String loginButton() throws IOException {
        return "LOG IN";
    }

    public String

    firstName() throws IOException {
        return "//XCUIElementTypeApplication[@name=\"Maserati Staging\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeTextField";
    }

    public String next() throws IOException {
        return "NEXT";
    }

    public String surname() throws IOException {
        return "//XCUIElementTypeApplication[@name=\"Maserati Staging\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeTextField";
    }

    public String emailAddress() throws IOException {
        return "//XCUIElementTypeApplication[@name=\"Maserati Staging\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeTextField";
    }

    public String dateOfBirth() throws IOException {
        return "//XCUIElementTypeApplication[@name=\"Maserati Staging\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeTextField";
    }

    public String phoneNumber() throws IOException {
        return "//XCUIElementTypeApplication[@name=\"Maserati Staging\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeTextField";
    }

    public String postcode() throws IOException {
        return "//XCUIElementTypeApplication[@name=\"Maserati Staging\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeTextField";
    }

    public String useMyLocation() throws IOException {
        return "Use my current location";
    }

    public String skipButton() throws IOException {
        return "Skip";
    }

    public String directMarketingSwitch() throws IOException {
        return "Direct marketing, I consent to the processing of my Personal Data for Marketing purposes";
    }

    public String collectDataSwitch() throws IOException {
        return "Allow Maserati to collect customer data?, I consent to the processing of my Personal Data for Profiling purposes";
    }

    public String passwordField() throws IOException {
        return "//XCUIElementTypeApplication[@name=\"Maserati Staging\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]";
    }

    public String acceptTerms() throws IOException {
        return "icSelectorInactive";
    }

    public String completeRegistration() throws IOException {
        return "COMPLETE REGISTRATION";
    }

    public String allow() throws IOException {
        return "Allow";
    }


}

