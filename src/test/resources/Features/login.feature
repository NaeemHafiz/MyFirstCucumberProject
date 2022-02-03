# Author
# Date
# Description


Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given user is on page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the page

#  Scenario Outline: Check login is successful with valid credentials
#    Given user is on page
#    When user enters <username> and <password>
#    And clicks on login button
#    Then user is navigated to the page
#
#
#    Examples:
#      | username | password |
#      | user1    | pass1    |
#      | user2    | pass2