@Smoke
Feature: SignUp The guest user can create a new valid account
  # Background before test Precondition
  Background:
    Given    The user clicks on register


  Scenario: Valid Sign Up :The user create a valid account
    When User selects gender
    And user enter firstname  and last name and selects select date of birth
    And User enter a valid Email"test@example.com"
    And User enters company name
    And newsletter is selected
    And User enters password as "P@ssw0rd" and confirms it
    And user click the register button
    Then New account is created

  Scenario: InValid Sign Up :The user Cannot create a valid account
    When User selects gender
    And user enter firstname  and last name and selects select date of birth
    And User enter a invalid Email"email@test.com"
    And User enters company name
    And newsletter is selected
    And User enters password as "P@ssw0rd" and confirms it
    And user click the register button
    Then New account Dose not created

