Feature: As a Tester I want to verify that all functionality of Home Page is working properly

  @alwaysRun @test-001 @SmokeTest @RegressionTest
  Scenario: Verify the Home Page functionality
    Given Home page is presented
    Then Verify the Title of home page is "AskOmDch – Become a Selenium automation expert!"

  @alwaysRun @test-002 @SmokeTest
  Scenario: Verify that the Header Menu Link's are working properly
    Then verify that all the Header Menu Link's are working properly
      | LinkText    | Title       |
      | Store       | Store       |
      | Men         | Men         |
      | Women       | Women       |
      | Accessories | Accessories |
      | Account     | Account     |
      | About       | About Us    |
      | Contact Us  | Contact Us  |


  @alwaysRun @test-003
  Scenario: Verify that the Footer Link's are working properly
    When I click HomePageLink
    Then Verify that the Title of home page is "AskOmDch – Become a Selenium automation expert!"
    When I click HomePageLink
    And I click About Link
    Then Verify the Title of the About page is "About Us"
    When I click HomePageLink
    When I click My Account Link
    Then Verify the Title of the MyAccountPage is "Account"
    When I click HomePageLink
    When I click Cart Link
    Then Verify the Title of the CartPage is "Cart"
    When I click HomePageLink
    When I click Contact Us Link
    Then Verify the Title of the ContactUsPage is "Contact Us"
    When I click HomePageLink
    When I click Women page Link
    Then Verify that the Title of Men page is "Women"
    When I click HomePageLink
    When I click Women’s Jeans Link
    Then Verify the Title of the WomenJeansPage is "Women's Jeans"
    When I click HomePageLink
    When I click Women’s Shirts Link
    Then Verify the Title of the WomenShirtsPage is "Women's Shirts"
    When I click HomePageLink
    When I click Women’s Shoes Link
    Then Verify the Title of the WomenShoesPage is "Women's Shoes"
    When I click HomePageLink
    When I click Men page Link
    Then Verify that the Title of Men page is "Men"
    When I click HomePageLink
    When I click Men’s Jeans Link
    Then Verify the Title of the MenJeansPage is "Men's Jeans"
    When I click HomePageLink
    When I click Men’s Shirts Link
    Then Verify the Title of the MenShirtsPage is "Men's Shirts"
    When I click HomePageLink
    When I click Men’s Shoes Link
    Then Verify the Title of the MenShoesPage is "Men's Shoes"
    When I click HomePageLink
    And I click Accessories Page Link
    Then Verify that the Title of Accessories page is "Accessories"

  @alwaysRun @test-004
  Scenario: Verify that the Product Thumbnail is working properly
    Given Home page is presented
    When I click Product Thumbnail image
    Then Verify that the Title of the Product is "Blue Shoes"

  @alwaysRun @test-005
  Scenario: Verify that the App download link's are working properly
    Given Home page is presented
    When I click Apple App Store Link
    Then Verify the Title of the Apple App Store in the new browser window is "App Store - Apple (IN)"
    Given Home page is presented
    And I click Google Play Link
    Then Verify the Title of the Google Play Store in the new browser window is "Android Apps on Google Play(Nothing)"




