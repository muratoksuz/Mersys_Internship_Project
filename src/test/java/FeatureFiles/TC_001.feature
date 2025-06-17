Feature: Login Functionality

  @Smoke @Regression

  Scenario: Negative Scenario

    Given Navigate to the website
    When Enter invalid username as "Student_11" and password as "S123455"
    And Click on Login button
    Then Student should see Invalid username or password message

  Scenario: Positive Scenario

    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully




