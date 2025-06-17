Feature: Grading Functionality


  Background:
    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully


  Scenario: Grade Examining

    And Find the Grading Button And Click
    And Observe Course Grade and Reports Button
    And Control the Transcript By Subject List
    Then Click on the Reports Button and Observe Student Transcripts
