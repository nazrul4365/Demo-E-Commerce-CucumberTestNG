Feature: As a User I want to purchase a product from Store menu Link's


  @alwaysRun @test-007
  Scenario: Verify that end to end Product purchasing process
    Given Home page is presented
    When I click StoreMenuLink
    And I enter text of Search item in the search field
    And I click SearchBtn
    And Verify Search text with partial Match
    And I click Add To Cart button
    When I click View Cart button
    And Verify the product name in the Cart page
    And I click checkOut button
    And Verify the title of the CheckOut Page with partial match
    When I click Click here to login link
    And I click LOGIN button with Login info
    And I fillUp Billing Details
    And I select Direct Bank transfer Radio button
    And I click PLACE ORDER button
    Then Verify the Product purchases success notice


