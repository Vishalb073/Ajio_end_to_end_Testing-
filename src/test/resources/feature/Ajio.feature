Feature: Login , Searching , Add To cart function Working fine

  Scenario: Login functionality working
    Given open webPage
    And redirect to Website
    And open signIn page and send "9766289696"
    When user clicks on countinue button
    And user Waits for otp and enters otp
    Then user redirect to homepage and validate username

  @SmokeTest
  Scenario: go to men section and check brands
    Given i am on homepage
    And i am click on mens section
    And go to brands select the brand
    When store the products in a list
    And get a product and its name

  @search
  Scenario Outline: Search for a product and add it to the cart
    Given user redirect to page
    And user go to search bar
    When user go to search user search for "<products>"
    And user search for products
    Examples:
      | products |
      |Denim geans|
      |Crocs      |
      |watches    |

  Scenario: add to cart
    Given user serched for the product
    And user go to product
    And user click on add to cart button
    Then go to cart


