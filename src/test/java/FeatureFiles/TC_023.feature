Feature: Calendar Feature:COURSES AND COURSES STATUS IN THE CALENDAR

  Background:
    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully

  Scenario: STUDENT SHOULD SEE COURSES AND COURSES STATUS IN THE CALENDAR
    Given Navigate To Calendar
    When Click on Weekly Course Plan
    And Lesson Situations Should Be Seen As A Symbol
    And Student P-S-E-C Symbols Should Be Understood
      |Published|
      |Started|
      |Ended|
      |Cancelled|
    And Student WeeklyCoursPlan And Calendar Button Should Click
    And Student Should Be Able To See Icons To Navigate Back And Forth In The WeeklyCoursePlan
    Then Students Should Be Able To See The Classes They Are Responsible For On The WeeklyCoursePlan

