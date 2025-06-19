Feature: Company Logo Functionality

  Background:
    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully


  Scenario: Click on the Company logo

    When The student clicks on the company logo
    Then The Student successfully accesses the website
    And The student switch to the main website

