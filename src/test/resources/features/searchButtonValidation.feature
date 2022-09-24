Feature: I want to verify that Search Button is working properly


  @alwaysRun @test-008
  Scenario: Search button validation in the Store Page
    Given Home page is presented
    When I click StoreMenuLink
    And I enter text of Search item in the search field
    And I click SearchBtn
    Then Verify Search text with partial Match
