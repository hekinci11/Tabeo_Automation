@regression
Feature:Home Page UI/UX test cases

  @TB001
  Scenario: As a user, I should be able to click on Customer Reviews Button
    Given the user is on the Home Page
    When the user clicks the Reviews Button
    Then the user should be able to see Customer Reviews
  @TB002
  Scenario: As a user, I should be able to click on FAQ Button
    Given the user is on the Home Page
    When the user clicks the FAQ Button
    Then the user should be able to see FAQ
  @TB003
  Scenario: As a user, I should be able to click on License Button
    Given the user is on the Home Page
    When the user clicks the License Button
    Then the user should be able to see  License
  @TB004
  Scenario Outline: As a user, I should be able to share via Facebook, Instagram, Twitter
    Given the user is on the Home Page
    When the user clicks "<ButtonType>"
    Then the user should be able to share by using "<ButtonType>"


    Examples:
      | ButtonType      |
      | InstagramButton |
      | TwitterButton   |
      | FacebookButton  |
  @TB005
  Scenario: As a user, I should not be able to pay without sign in
    Given the user is on the Home Page
    When the user clicks Pay Button
    Then the user should not be able to pay without sign in


