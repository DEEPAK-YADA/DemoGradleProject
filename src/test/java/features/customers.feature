Feature: Customers

  Background: Below are the common steps for each scenario
    Given User Launch chrome browser new
    When User opens URL"https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then User can view Dashboard
    When User click on customers Menu
    And Click on customers Menu Item

    @sanity
  Scenario: Add a new customer
    
    And click on Add a new button
    Then user can view Add new customers page
    When user enters customer info
    And click on Save button
    Then User can view configuration message "The new customer has been added sucessfully"
    And close browser new

    @smoke
    Scenario: Search Customer by EmailID

      And Enters Customer Email
      When Click on search button
      Then User should found Email in the search table
      And close browser new

  @regression
    Scenario: Search Customer by Name

    And Enters Customer firstName
    And Enters Customer lastName
    When Click on search button
    Then User should found Name in the search table
    And close browser new