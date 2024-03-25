@B32G13-167
Feature: Notes Module Functionality

  User story: As a user, I should be able to create/delete any note and see the details of the note.

  Acceptance Criteria:
  1.User can create a new note
  2.User can add any note to the favorites
  3.User can see the number of letters and words that the note includes under the note title when clicked on the details of the note
  4.User can delete any note

  Background: User is already in the log in page
    Given the user is on the login page
    And the user logged in with username as "Employee120" and password as "Employee123"
    Then user navigates to the "Notes" module

  @B32G13-168
  Scenario Outline: Verify user can create a new note
    When user clicks the "New notes" App Navigation button
    And user writes "<Note>" inside note area
    Then Today top App Navigation Entry Title is "<Note>"
    And user deletes the latest note entry

    Examples:
      | Note          |
      | Hello Mars!   |
      | Goodbye Mars! |

  @B32G13-169
  Scenario:Verify user can add any note to the favorites
    When user clicks the "New notes" App Navigation button
    And user writes "Hello World!" inside note area
    And user clicks on the App Navigation Latest Entry threeDots menu button
    And user clicks on Favorites button
    And user switch to the "Files" App Menu link
    And user clicks the "Favorites" App Navigation sublist button
    Then user should see newly added "Hello World!.txt" inside the file list
    And user deletes the latest note entry

  @B32G13-170
  Scenario: Verify user can see the number of letters and words that the note includes under the note title when clicked on the details of the note
    When user clicks the "New notes" App Navigation button
    And user writes "Good morning!" inside note area
    And user clicks on the Note Container "Action" menu button
    And user clicks on the "Details" menu button
    Then displayed word and char count match actual "Good morning!" message
    And user deletes the latest note entry

  @B32G13-171
  Scenario: Verify user can delete any note
    When user clicks the "New notes" App Navigation button
    And user writes "Good evening!" inside note area
    And user clicks on the App Navigation Latest Entry threeDots menu button
    And user clicks on the "Delete note" button
    Then the "Deleted Good evening!" message is displayed