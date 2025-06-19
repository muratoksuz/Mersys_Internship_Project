Feature: User can compose and send a new message

  Background:
    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully

  Scenario: Compose and send a new message successfully
    Given Navigate to Hamburger Menu
    When Click on the Messaging button
    And User clicks on sendMessage in the Messaging Menu
    Then sendMessage page should be displayed
    And Click On The Receiver Button
    And User types at least three characters like Stu or Teac to search receiver
    And User selects a receiver from the list
    And User enters a subject for the message
    And User writes text in the editor
    And User can paste text, add image or create a table
      | Image...              |
      | Link...               |
      | Media...              |
      | Code sample...        |
      | Table                 |
      | Special character...  |
      | Emojis...             |
      | Horizontal line       |
      | Page break            |
      | Nonbreaking space     |
      | Anchor...             |
      | Date/time             |
    And User attaches a file to the message
    When User clicks the Send button
    Then A Success message should be displayed

  Scenario: Sent message appears in Outbox
    When User navigates to Hamburger Menu > Messaging > Outbox
    Then Send message should be listed in the Outbox
