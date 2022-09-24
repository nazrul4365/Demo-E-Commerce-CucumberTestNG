Feature: I want to verify that Add To Cart Button is working properly & Product is successfully store in the Cart page

  @alwaysRun @test-006
  Scenario: Product Add To Cart Validation
    Given Home page is presented
    When I click Add To Cart button
    And I click View Cart button
    Then Verify the product name in the Cart page
