Feature: verifyErrorMessage
  Scenario Outline: A user with locked account should not be able to login
    Given The user is on the landing page of sauce-demo website
    When The user types username "<username>"
    And The user types password "<password>"
    And The user clicks the login button
    Then The user should see login error message "<error>"

    Examples:
      | username      | password   | error                                             |
      |locked_out_user|secret_sauce|Epic sadface: Sorry, this user has been locked out.|