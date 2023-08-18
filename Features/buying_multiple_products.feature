Feature: Buying Process
  Scenario Outline: A user should be able to buy multiple products and checkout successfully
    Given The user is on the landing page of sauce-demo website
    When The user types username "<username>"
    And The user types password "<password>"
    And The user clicks the login button
    And The user adds the first two products to the cart
    And The user clicks on the cart icon
    And The user clicks checkout button
    And The user types first-name
    And The user types last-name
    And The user types postal-code
    And The user clicks the continue button
    And The user clicks the finish button
    Then The user should be able to see order confirmation text "<text>"
    Examples:
      |username  |  password      |text                                                                                     |
      |standard_user| secret_sauce|Your order has been dispatched, and will arrive just as fast as the pony can get there!|


