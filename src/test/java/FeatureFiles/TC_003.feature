Feature: Top Menu Functionality

  Background:

    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully

  Scenario: Student clicks menu items and sees the expected result
    When The student clicks the pages and should be able to see expected results
      | page          | ignored | expectedElement          |
      | Courses       | -       | welcomeStudentTxt        |
      | Calendar      | -       | weeklyCoursePlan         |
      | Attendance    | -       | attendanceTxt            |
      | Assignments   | -       | assignmentsText          |
      | Grading       | -       | courseGradeText          |
      | Announcements | -       | announcementsTextVisible |
      | Messages      | -       | messagesTxtVisible       |


  Scenario: Student navigates through hamburger menu and clicks all submenus
    When The student clicks the hamburger menu
    Then The student should hover each main menu and click all visible submenus


  Scenario: Student navigates through the profile menu and verifies each section
    When The student clicks the Profile menu button
    Then The student should be able to access and verify each section under the profile menu
















