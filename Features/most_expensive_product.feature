Feature: The most expensive product
  Scenario Outline: A user should be able to buy the most expensive product using the product filter
    Given The user is on the landing page of sauce-demo website
    When The user types username "<username>"
    And The user types password "<password>"
    And The user clicks the login button
    And The user adds the first product to the cart
    And The user adds the third product to the cart
    And The user removes the first added product
    And The user clicks on the cart icon
    And The user checks if the "<Your_Cart>" text is shown in the cart
    And The user clicks the continue shopping button
    And The user clicks on filter icon
    And The user selects price high to low option
    And The user adds the first most expensive product to the cart
    And The user clicks on the cart icon
    And The user checks if there are two products in the cart
    And The user clicks checkout button
    And The user types first-name
    And The user types last-name
    And The user types postal-code
    And The user clicks the continue button
    And The user clicks the finish button
    Then The user should be able to see thank you message "<text>"
    Examples:
      | username    | password   | Your_Cart | text                    |
      |standard_user|secret_sauce|Your Cart  |Thank you for your order!|
