Feature: Login Action
  Scenario Outline: Successful Login with Valid Credentials StdUser
    Given User is on Login Page
    When User enter "<username>" and "<password>"
    And User click on login button
    Then User is on Inventory page
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |