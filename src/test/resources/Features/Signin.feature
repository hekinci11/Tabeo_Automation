
@Signin @regression
Feature: Users should be able to Sign in

  Background:
      Given the user is on the Sign in page


  Scenario: Sign in with google account
    When the user clicks on Sign in button
    And  the user clicks on Sign in with Google button
    And  the user enters the email
    And  the user clicks the next button
    And  the user enters the password
    And  the user clicks the next button
    Then the user signs in


