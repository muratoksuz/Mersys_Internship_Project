Feature: Student submits attendance excuse

  Background:
    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully

  Scenario: Submit a date range attendance excuse
    When Click on the Attendance from the Top Navigation Bar
    Then Click on the Attendance Excuses
    And Click on the add button
    And Write the excuse message
    And Upload a file and send
    And The student should view success message

