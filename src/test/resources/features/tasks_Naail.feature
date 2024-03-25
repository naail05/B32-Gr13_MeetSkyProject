@tasks
Feature: Tasks Module Functionality

  Background: User is already logged in
    Given the user is on the login page
    And the user logged in with username as "Employee10" and password as "Employee123"
    And user navigates to the "Tasks" module

    @wip
    Scenario: User creates a new task list

