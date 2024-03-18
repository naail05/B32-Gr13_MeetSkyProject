@tasks
Feature: Contact Group Functionality under Contacts Module

  User Story:
  As a user, I should be able to create a new group and under Contacts module.

  Background: User is already logged in
    Given the user is on the login page
    And the user logged in with username as "Employee40" and password as "Employee123"
    Then user navigates to the "Contacts" module


  Scenario: User creates a new group under Contacts Module
    