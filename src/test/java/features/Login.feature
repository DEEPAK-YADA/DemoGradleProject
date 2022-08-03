Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario: Login with valid credential
    Given User Launch chrome browser
    When user opens URL"http://demo.automationtesting.in/"
    And user enters Email as "deepaksel28@gmail.com" and password as "krishNA28"
    When click on login button
    Then page title should be "http://demo.automationtesting.in/Register.html"
    And close browser

    Scenario Outline: Login Data Driven
    Given User Launch chrome browser
    When user opens URL"http://demo.automationtesting.in/"
    And user enters Email as "<email>" and password as "<password>"
    When click on login button
    Then page title should be "http://demo.automationtesting.in/Register.html"
    And close browser
      Examples:
        |email  |password
        |deepaksel28@gmail.com  |krishNA28
        |deepaksel28@gmail.com  |krish123
