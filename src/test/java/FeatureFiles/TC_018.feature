Feature: Assignment Feature

  Background:
    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully

  Scenario: Assignments link on the user courses page
    Given Verify that the assignment button is visible
    When user hovers over the Assignments link
    Then the student should see the total number of assigned tasks
    Then the student clicks the Assignments link
    And  the student should see a list of all assigned tasks
