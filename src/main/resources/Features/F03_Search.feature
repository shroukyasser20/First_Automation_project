@Smoke
Feature: Search : The user can use the search function in the website

  Scenario: The user can search for products and returns the correct results
    When     User type a search word in the appropriate search field and click on the search icon
    And      The website returns some results
    And      The user click on advanced search and use it to narrow down the results
    Then     The final results should match the selected filter and search keywords


  Scenario: The user can search for products and returns the correct results
    When     User type a search word in the appropriate search field and click on the search icon
    And      The website returns some results
    And      The user click on advanced search and use it to narrow down the results
    Then     The final results No Result Found that matches your criteria