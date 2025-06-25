Feature: Make payment from finance department

  Background:
    Given Navigate to the website
    When Enter valid username as "Student_4" and password as "S12345"
    And Click on Login button
    Then The student should login successfully

  Scenario: Student should be able to click the finance menu

    Given Student should be able to click on the Finance from the Hamburger menu
    Then Student clicks on Finance in the Hamburger menu, they should be able to access the my finance page