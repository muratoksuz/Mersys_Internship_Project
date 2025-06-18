Feature: Assignments Submission Feature Functionality

  Background:
    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully
    And User clicks on the element in TopNav
      | assignment |



  Scenario:Submit homework and manage drafts
    When User clicks on the submit button
    Then User displays a editor
    And User sends the text and uploads the file
    And User clicks on the save button
    Then User should see the success message
    When User clicks on Submit button
    And User clicks on the yes button and displays the confirm message
    Then User should see the success message



  Scenario: Opening the text editor from New Submission
    Given The student is on the homework detail page
    When The student clicks New Submission
    Then The text editor should open

