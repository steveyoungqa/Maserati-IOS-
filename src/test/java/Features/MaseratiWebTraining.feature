@web

  Feature: Automation Training
    Scenario: Internal Training

      Given I am using the "Chrome" browser
      Given I am on the landing page of "https://www.maserati.com/maserati/international/en"
      Then I dismiss the cookie link
      And I click on the Get In Touch link
      Then I select a Country of Residence of "Brazil"

      Then I choose a First Name of "Steve"

      And I choose a Current Car of "Ford Focus CC"