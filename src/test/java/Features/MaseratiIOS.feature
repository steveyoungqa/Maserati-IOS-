@ios

Feature: Maserati IOS Demo

  Scenario Outline: Maserati IOS User Journey WIP
    Given I am using Appium for device "<Device>" and IOS version "<Version>"
    And I am using IOS the app directory of "<Directory>" and app "<APP>"
    Then I launch the App on the IOS Device

    Then the ISO Main Maserati opening scene is played
    And then I IOS swipe to the Left

    When I IOS select the Book icon
    And I IOS select the Create Account button

    Then I IOS enter A First Name of "<FirstName>"
    And I IOS select Next
    Then I IOS enter a Surname of "<Surname>"
    And I IOS select Next
    And I IOS enter a Unique Email Address
    And I IOS select Next
    Then I IOS enter a Date of Birth of "<dob>"
    And I IOS select Next
    And I IOS enter a Phone Number of "<phone>"
    And I IOS select Next
#    Then I IOS enter a PostCode of "<postcode>"

    Then I IOS select Use my current location
    And I IOS Allow the device to use My Location
    And I IOS select the "Lancaster Colchester" option
    Then I IOS select Next
    And I IOS choose to Skip the Add Vin option
#    Then I IOS select the Direct Marketing switch to On
#    Then I IOS select the Collect Customer Data switch to On
    Then I IOS select Next
#
    Then I IOS create a Random password
    And I IOS Accept the Terms & Conditions
    Then I IOS Complete Registration

    Then I close down the IOS simulator

    Examples:
      | Device   | Version | Directory                           | APP          | FirstName | Surname | dob      | phone        | postcode |
#      | iPhone 7 | 11.2    | /Users/steveyoung/Documents/Appium/ | Maserati.app | Ted       | Test    | 21041977 | 018121212121 | me206lb  |
      | iPhone X | 11.2    | /Users/steveyoung/Documents/Appium/ | Maserati.app | Ted       | Test    | 21041977 | 018121212121 | me206lb  |
#      | iPhone 8 | 11.2    | /Users/steveyoung/Documents/Appium/ | Maserati.app | Ted       | Test    | 21041977 | 018121212121 | me206lb  |

