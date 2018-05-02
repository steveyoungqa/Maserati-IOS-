$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MaseratiIOS.feature");
formatter.feature({
  "line": 3,
  "name": "Maserati IOS Demo",
  "description": "",
  "id": "maserati-ios-demo",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ios"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Maserati IOS User Journey WIP",
  "description": "",
  "id": "maserati-ios-demo;maserati-ios-user-journey-wip",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I am using Appium for device \"\u003cDevice\u003e\" and IOS version \"\u003cVersion\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I am using IOS the app directory of \"\u003cDirectory\u003e\" and app \"\u003cAPP\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I launch the App on the IOS Device",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "the ISO Main Maserati opening scene is played",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "then I IOS swipe to the Left",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I IOS select the Book icon",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I IOS select the Create Account button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I IOS enter A First Name of \"\u003cFirstName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I IOS select Next",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I IOS enter a Surname of \"\u003cSurname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I IOS select Next",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I IOS enter a Unique Email Address",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I IOS select Next",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I IOS enter a Date of Birth of \"\u003cdob\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I IOS select Next",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I IOS enter a Phone Number of \"\u003cphone\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I IOS select Next",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 26,
      "value": "#    Then I IOS enter a PostCode of \"\u003cpostcode\u003e\""
    }
  ],
  "line": 28,
  "name": "I IOS select Use my current location",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I IOS Allow the device to use My Location",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I IOS select the \"Lancaster Colchester\" option",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I IOS select Next",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I IOS choose to Skip the Add Vin option",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 33,
      "value": "#    Then I IOS select the Direct Marketing switch to On"
    },
    {
      "line": 34,
      "value": "#    Then I IOS select the Collect Customer Data switch to On"
    }
  ],
  "line": 35,
  "name": "I IOS select Next",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 36,
      "value": "#"
    }
  ],
  "line": 37,
  "name": "I IOS create a Random password",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "I IOS Accept the Terms \u0026 Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I IOS Complete Registration",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "I close down the IOS simulator",
  "keyword": "Then "
});
formatter.examples({
  "line": 43,
  "name": "",
  "description": "",
  "id": "maserati-ios-demo;maserati-ios-user-journey-wip;",
  "rows": [
    {
      "cells": [
        "Device",
        "Version",
        "Directory",
        "APP",
        "FirstName",
        "Surname",
        "dob",
        "phone",
        "postcode"
      ],
      "line": 44,
      "id": "maserati-ios-demo;maserati-ios-user-journey-wip;;1"
    },
    {
      "comments": [
        {
          "line": 45,
          "value": "#      | iPhone 7 | 11.2    | /Users/steveyoung/Documents/Appium/ | Maserati.app | Ted       | Test    | 21041977 | 018121212121 | me206lb  |"
        }
      ],
      "cells": [
        "iPhone X",
        "11.2",
        "/Users/steveyoung/Documents/Appium/",
        "Maserati.app",
        "Ted",
        "Test",
        "21041977",
        "018121212121",
        "me206lb"
      ],
      "line": 46,
      "id": "maserati-ios-demo;maserati-ios-user-journey-wip;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 300628,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 45,
      "value": "#      | iPhone 7 | 11.2    | /Users/steveyoung/Documents/Appium/ | Maserati.app | Ted       | Test    | 21041977 | 018121212121 | me206lb  |"
    }
  ],
  "line": 46,
  "name": "Maserati IOS User Journey WIP",
  "description": "",
  "id": "maserati-ios-demo;maserati-ios-user-journey-wip;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@ios"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am using Appium for device \"iPhone X\" and IOS version \"11.2\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I am using IOS the app directory of \"/Users/steveyoung/Documents/Appium/\" and app \"Maserati.app\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I launch the App on the IOS Device",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "the ISO Main Maserati opening scene is played",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "then I IOS swipe to the Left",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I IOS select the Book icon",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I IOS select the Create Account button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I IOS enter A First Name of \"Ted\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I IOS select Next",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I IOS enter a Surname of \"Test\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I IOS select Next",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I IOS enter a Unique Email Address",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I IOS select Next",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I IOS enter a Date of Birth of \"21041977\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "I IOS select Next",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I IOS enter a Phone Number of \"018121212121\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I IOS select Next",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 26,
      "value": "#    Then I IOS enter a PostCode of \"\u003cpostcode\u003e\""
    }
  ],
  "line": 28,
  "name": "I IOS select Use my current location",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I IOS Allow the device to use My Location",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I IOS select the \"Lancaster Colchester\" option",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I IOS select Next",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I IOS choose to Skip the Add Vin option",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 33,
      "value": "#    Then I IOS select the Direct Marketing switch to On"
    },
    {
      "line": 34,
      "value": "#    Then I IOS select the Collect Customer Data switch to On"
    }
  ],
  "line": 35,
  "name": "I IOS select Next",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 36,
      "value": "#"
    }
  ],
  "line": 37,
  "name": "I IOS create a Random password",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "I IOS Accept the Terms \u0026 Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I IOS Complete Registration",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "I close down the IOS simulator",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "iPhone X",
      "offset": 30
    },
    {
      "val": "11.2",
      "offset": 57
    }
  ],
  "location": "iosStepdefs.iAmUsingAppiumForDeviceAndIOSVersion(String,String)"
});
formatter.result({
  "duration": 326991495,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/Users/steveyoung/Documents/Appium/",
      "offset": 37
    },
    {
      "val": "Maserati.app",
      "offset": 83
    }
  ],
  "location": "iosStepdefs.iAmUsingTheAppDirectoryOfAndApp(String,String)"
});
formatter.result({
  "duration": 170844,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iLaunchTheAppOnTheDevice()"
});
formatter.result({
  "duration": 41076600267,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.theISOMainMaseratiOpeningSceneIsPlayed()"
});
formatter.result({
  "duration": 30653,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.thenIIOSSwipeToTheLeft()"
});
formatter.result({
  "duration": 607011469,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iIOSSelectTheBookIcon()"
});
formatter.result({
  "duration": 11640300695,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iIOSSelectTheCreateAccountButton()"
});
formatter.result({
  "duration": 843544204,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ted",
      "offset": 29
    }
  ],
  "location": "iosStepdefs.iIOSEnterAFirstNameOf(String)"
});
formatter.result({
  "duration": 3116876314,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iIOSSelectNext()"
});
formatter.result({
  "duration": 1034363170,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test",
      "offset": 26
    }
  ],
  "location": "iosStepdefs.iIOSEnterASurnameOf(String)"
});
formatter.result({
  "duration": 2508951758,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iIOSSelectNext()"
});
formatter.result({
  "duration": 954163570,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iIOSEnterAUniqueEmailAddress()"
});
formatter.result({
  "duration": 3108806839,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iIOSSelectNext()"
});
formatter.result({
  "duration": 948124256,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "21041977",
      "offset": 32
    }
  ],
  "location": "iosStepdefs.iIOSEnterADateOfBirthOf(String)"
});
formatter.result({
  "duration": 4241239147,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iIOSSelectNext()"
});
formatter.result({
  "duration": 916002333,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "018121212121",
      "offset": 31
    }
  ],
  "location": "iosStepdefs.iIOSEnterAPhoneNumberOf(String)"
});
formatter.result({
  "duration": 2671267798,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iIOSSelectNext()"
});
formatter.result({
  "duration": 927520291,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iIOSSelectUseMyCurrentLocation()"
});
formatter.result({
  "duration": 1464573545,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iIOSAllowTheDeviceToUseMyLocation()"
});
formatter.result({
  "duration": 1106130739,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lancaster Colchester",
      "offset": 18
    }
  ],
  "location": "iosStepdefs.iIOSSelectTheOption(String)"
});
formatter.result({
  "duration": 6061455094,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iIOSSelectNext()"
});
formatter.result({
  "duration": 1266627319,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iIOSChooseToSkipTheAddVinOption()"
});
formatter.result({
  "duration": 988487430,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iIOSSelectNext()"
});
formatter.result({
  "duration": 1668340023,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iIOSCreateARandomPassword()"
});
formatter.result({
  "duration": 3645324930,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iIOSAcceptTheTermsConditions()"
});
formatter.result({
  "duration": 1051858951,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iIOSCompleteRegistration()"
});
formatter.result({
  "duration": 1081013970,
  "status": "passed"
});
formatter.match({
  "location": "iosStepdefs.iCloseDownTheSimulatorFor()"
});
formatter.result({
  "duration": 14058523,
  "status": "passed"
});
formatter.after({
  "duration": 47414733,
  "status": "passed"
});
});