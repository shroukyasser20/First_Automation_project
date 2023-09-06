@Smoke
Feature: Login : The guest user can Login In Your Account

 # Background before test Precondition
  Background:
    Given  User click on Login From Home Page
    And    user go to login page

  Scenario: user could login with valid email and password
    When   user login with valid "test@example.com" and "P@ssw0rd"
    And    User Click on Remember me Check Box
    And    user press on login button
    Then   user login to the system successfully

  Scenario: user could not login with valid email and password
    When   user login with Invalid "Shrouk---.com" and "P@ssw0rd"
    And    User Click on Remember me Check Box
    And    user press on login button
    Then   user login to the system Failed