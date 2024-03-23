@tasks
Feature: Tasks Module Functionality

  Background: User is already logged in
    Given the user is on the login page
    And the user logged in with username as "Employee10" and password as "Employee123"


@san1
    Scenario: User creates a new task list
      When user navigates to the logoutButton module
      And user click the view profile  link
      And user click to edit profile
      And user enter full name
      Then user verify the user name and full name should be same


@san2
  Scenario: User creates a new task list
    And user navigates to the logoutButton module
    When user click the view profile  link
    And user click to edit profile
    And user enter email ID


@san3
  Scenario: User creates a new task list
    When user navigates to the logoutButton module
    And user click the view profile  link
    And user click to edit profile
    And user select language
    Then the mentioned language should be selected







