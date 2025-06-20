Feature: Download Course Grade and Transcript

    Background:
      Given Navigate to the website
      When Enter valid username as "Student_10" and password as "S12345"
      And Click on Login button
      Then The student should login successfully


  Scenario: Download the PDF file
    Given Navigate to Grading
    When  Click on Course Grade
    Then  Verify that user should see the Print icon
    And   Click on the Print icon
    When Click on the Download button

