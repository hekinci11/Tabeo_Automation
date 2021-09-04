
@payments
Feature: Users should be able to monthly payment

  Background:
    Given the user signin with valid credentials

  Scenario: Pay 20 pounds Monthly payment

    When the user clicks on twenty pounds monthly button
    And the user Enters the card number as "4242424242424242"
    And the user Enters the card expiry date as "1121"
    And the user Enters the  card cvv number as "111"
    And the uer Enters the card holder name as "Harun Ekinci"
    And the user selects the country region as "Turkey"
    And the user clicks on submit button
    Then the user lands on success message page

  @payments2
  Scenario: Pay 20 pounds Monthly payment with complete authentication

    When the user clicks on twenty pounds monthly button
    And the user Enters the card number as "4000002760003184"
    And the user Enters the card expiry date as "1121"
    And the user Enters the  card cvv number as "111"
    And the uer Enters the card holder name as "Harun Ekinci"
    And the user selects the country region as "Turkey"
    And the user clicks on submit button
    And the user clicks on complete authentication button
    Then the user lands on success message page

