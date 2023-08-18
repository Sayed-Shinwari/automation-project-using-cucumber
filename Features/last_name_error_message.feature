Feature: Verify last name error
  Scenario Outline: A user should not be able to checkout without providing his last name in the checkout page
    Given The user is on the landing page of sauce-demo website
    When The user types username "<username>"
    And The user types password "<password>"
    And The user clicks the login button
    And The user adds the first product to the cart
    And The user clicks on the cart icon
    And The user clicks checkout button
    And The user types first-name
    And The user types last-name
    And The user types postal-code
    And The user clicks the continue button
    Then The user should see last name error message "<error>"

    Examples:
      | username   | password   | error                      |
      |problem_user|secret_sauce|Error: Last Name is required|
