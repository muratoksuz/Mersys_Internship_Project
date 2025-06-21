Feature: Deleting messages from the Outbox

  Background:
    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully

  Scenario: Student deletes a message from the Outbox

    Given The student clicks on Hamburger Menu > Messaging > Outbox click on the move the trash icon
    When The student clicks on the trash can icon next to a message and should see a confirm message
    Then A confirmation popup should be displayed
    And Once the student confirms the deletion, they should receive a “Success” message indicating that the message was successfully deleted.
