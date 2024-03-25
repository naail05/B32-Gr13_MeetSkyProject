@us3
Feature:Deck Module Functionality

Background: User is already logged in
Given the user is on the login page
And the user logged in with username as "Employee60" and password as "Employee123"
And user navigates to the "Deck" module

@ac1
Scenario: User can create a new board
  Given user is on the Deck module
  Then user should see upcoming cards
  Then user should see add board
  And user clicks on add board
  Then user creat a "board name"

  @ac2
  Scenario: User can create a new list of card/task under any board
    Given user on the School
    When the user creates a new list "sprint2"
    Then the user should see the new list created

    @ac3
    Scenario: User can add a new card/task on any list on the current board
      And user opens the navigation board menu
      And user clicks on Add card button
      Then user types "card name"
      And user should see the card name created
      And user clicks on new card2
      Then successfully sees new card2 details

      @ac4
      Scenario: User can assign any card/task to himself/herself by using the three dots on the related card
       And user on board personal page
       And user clicks on he three dots
       And user clicks on Assign to me
       Then user sees his profile icons next the three dots







