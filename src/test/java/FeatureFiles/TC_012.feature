Feature:

  Background:
    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully

  Scenario: Download Payment Information Version 1
    When Click on the Hamburger Menu
    Then Click on the Finance
    And Click on the My Finance
    And Click on the Kebab Menu
    And Click on the Excel Export


  Scenario: Download Payment Information Version 2
    When Click on the Hamburger Menu
    Then Click on the Finance
    And Click on the My Finance
    And Click on the Kebab Menu
    And Click on the PDF Export




