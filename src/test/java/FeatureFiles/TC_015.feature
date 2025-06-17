Feature: Customization Functionality


  Background:
    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully

  Scenario: Page Theme Option Control
    And Click on the Profile Button
    And Click on the Settings Button
    Then Control the Theme Color Options



