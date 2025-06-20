Feature:Student initiates a discussion on the assignment page

  Background:
    Given Navigate to the website
    When Enter valid username as "Student_1" and password as "S12345"
    And Click on Login button
    Then The student should login successfully


  Scenario:Student starts a discussion and sends a message
    Given the student is on the assignments page
    Then they should see and be able to click the discussion button
    When the discussion window opens
    Then they should see and be able to click the chats icon
    And they should be able to select contact(s) to start a discussion
    And they should be able to attach files
    When they send a message
    Then they should see the message text, attached file name (if any), and the timestamp in a message stream


