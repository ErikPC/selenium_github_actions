@orange
Feature: orange Login Test

  @orangeunsuccessful @orangeLoginunsuccessful
  Scenario: Unsuccessful login
    Given the user visits Orange page
    When the user clicks on the login button
    Then an error message is displayed

  @orangesuccessful @orangeLoginsuccessful
  Scenario Outline:  Successful login
    Given  the user visits Orange page
    When user use credentials '<user>' and '<password>'
    And the user clicks on the login button
    Then login successful

    Examples:
      | user  | password |
      | Admin | admin123 |

    @dashboard
    Scenario Outline: Click element of dashboard
      Given the user login with credentials '<user>' and '<password>'
      When click element of dashboard
      Then the element has been clicked

      Examples:
        | user  | password |
        | Admin | admin123 |