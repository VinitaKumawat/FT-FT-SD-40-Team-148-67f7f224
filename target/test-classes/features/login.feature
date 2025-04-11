Feature: Login Feature

  Scenario Outline: Login with valid and invalid credentials
    Given User is on the login page
    When User enters username "<username>" and password "<password>"
    Then User should see message "<message>"

    Examples:
      | username  | password              | message                             |
      | tomsmith  | SuperSecretPassword!  | You logged into a secure area!      |
      | tomsmith  | wrongpass             | Your password is invalid!           |
      | wronguser | SuperSecretPassword!  | Your username is invalid!           |
      |           |                       | Your username is invalid!           |

  Scenario: Verify page title, URL, and field visibility
    Given User is on the login page
    Then Page title should be "The Internet"
    Then URL should contain "/login"
    Then Username and password fields should be displayed
    Then Login button should be enabled

  Scenario: Successful login and logout
    Given User is on the login page
    When User enters username "tomsmith" and password "SuperSecretPassword!"
    Then User should see message "You logged into a secure area!"
    And User clicks on logout button
    Then User should see logout success message "You logged out of the secure area!"
