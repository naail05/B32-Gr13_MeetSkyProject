@B32G13-160
Feature: Contact Group Functionality under Contacts Module

  User Story:
  As a user, I should be able to create a new group and under Contacts module.

  Background: User is already logged in
    Given the user is on the login page
    And the user logged in with username as "Employee40" and password as "Employee123"
    Then user navigates to the "Contacts" module

@B32G13-157
  Scenario: User creates a new group under Contacts Module
    When user click on add new group
    And user add "Cinema" for new group
    Then user should see "Cinema" under groups

  @B32G13-158
  Scenario: User can see all the available groups name through the group’s dropdown menu
  existing in the contact’s own info menu
    Given user created "Cinema" under groups
    When user go to new contact
    And user click on groups option
    Then list of group names should be matching with group's dropdown menu

    @B32G13-159
  Scenario: User can add a new property as “Anniversary” to the contact’s info page
  from the “Add new property” dropdown menu.
    When user go to new contact
    And user click on add new property
    And user add "Anniversary"
    Then user should see "Anniversary" in new contact properties.






