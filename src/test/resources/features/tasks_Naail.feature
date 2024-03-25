@US13
Feature: Tasks Module Functionality

  Background: User is already logged in
    Given the user is on the login page
    And the user logged in with username as "Employee80" and password as "Employee123"
    And user navigates to the "Tasks" module


  @AC1
  Scenario: User creates a new task list
    When the user creates a new random task list
    Then the user should see the new task list  created

  @AC2
  Scenario: User creates a new task
    When user creates new tasks as follow:
      | smoke testing              |
      | regression testing         |
      | partial regression testing |
    Then the user should see the newly created tasks as follow
      | smoke testing              |
      | regression testing         |
      | partial regression testing |

  @AC3
  Scenario: User marks a task as completed
    Given the user is viewing a list of tasks
    When the user marks any random task as completed
    Then the task should be shown as completed in the details


    @AC4
  Scenario: User marks a task as important
    When the user marks a task as important
    Then the task should be marked as important

  @AC5
  Scenario: User views the number of uncompleted tasks next to the Current tab
    When the user checks the number of uncompleted tasks next to the Current tab
    #Then the user should see the correct number of uncompleted tasks
