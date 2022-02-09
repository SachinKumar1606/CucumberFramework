Feature: Login Action

  Scenario : Successful Login with Valid Credentials StdUser
    Given User is on Login Page
#    When User enter <username> and <password>
    When User enter invalid Username and Password
    And User click on login button
    Then User is on Inventory page

#    Examples:
#      |        username            |   password   |
#      |      standard_user         | secret_sauce |
#      |      problem_user          | secret_sauce |
#      |  performance_glitch_user   | secret_sauce |

  Scenario : Login with Invalid Credentials
    Given User is on Login Page
    When User enter Username and Password
    And User click on login button
    Then User is on same page
#
