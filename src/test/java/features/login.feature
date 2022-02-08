Feature: Login Action

  Scenario: Successful Login with Valid Credentials StdUser
    Given User is on Login Page
    When User enter username and password
    And User click on login button
    Then User is on Inventory page