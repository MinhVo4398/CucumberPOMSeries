Feature: Login Page

  Scenario: Login Page Title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Login - My Store"

  Scenario: Forgot Password link
    Given user is on login page
    Then forgot your password link should be displayed

  Scenario: Login with correct credentials
    Given user is on login page
    When user enters username "minhautomation@mail.com"
    And user enters password "123456"
    And user clicks on Login button
    Then user gets the title of the page
    And page title should be "My account - My Store"