Feature: Assignment Functionality

  Background:
    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully
    And User clicks on the element in TopNav
      | assignment |


    Scenario: Search and Sort Assignments
      Given Search Button Should Be Visible
      And Search Button Should Be Clickable
      Then Click on Search Button Without Text and List All Assignments

      Scenario: Filter Assignments And Show By Type
        Given Filter The Results With Every Option
        And ShowBy Options Should Be Visible
        Then ShowBy The Results With Every Option