Feature: Upload and change profile photo

  Background:
    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully

  Scenario: Upload a profile photo
    When Click on the Profile Button
    Then Click on the Settings Button
    And Click on the Profile Picture Logo
    And Click on the Upload Picture Button
    Then Click on the Upload Button
    And Click on the Save Button


  Scenario: Change the profile photo
    When Click on the Profile Button
    Then Click on the Settings Button
    And Click on the Profile Picture Logo
    And Click on the Upload Picture Button
    Then Click on the Upload Button
    And Click on the Save Button
