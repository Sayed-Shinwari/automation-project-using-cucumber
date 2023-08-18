Feature: Cheapest product
  Scenario Outline: A user should be able to find the cheapest product to buy using the product filter
    Given The user is on the landing page of sauce-demo website
    When The user types username "<username>"
    And The user types password "<password>"
    And The user clicks the login button
    And The user clicks on filter icon
    And The user selects price low to high option
    And The user adds the first cheapest product to the cart
    And The user clicks on the cart icon
    And The user checks if the cheapest product got added to the cart
    And The user clicks checkout button
    And The user types first-name
    And The user types last-name
    And The user types postal-code
    And The user clicks the continue button
    And The user clicks the finish button
    Then The user should be able to see thank you message "<text>"

    Examples:
      | username | password | text |
      |standard_user|secret_sauce|Thank you for your order!|