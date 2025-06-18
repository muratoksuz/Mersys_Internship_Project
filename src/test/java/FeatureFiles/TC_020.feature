Feature: Assignments Icons Feature Functionality

  Background:
    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully


  Scenario: Verifying assignment icons and discussion visibility

    And User clicks on the element in TopNav
      | assignment |
    And User select the date
    Then The Information, Submit, and Mark it icons work
    And User clicks outside of the icons area
    Then User navigates to the information page















