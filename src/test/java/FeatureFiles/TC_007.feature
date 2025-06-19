Feature: Deleting messages from the TrashBox

  Background:
    Given Navigate to the website
    When Enter valid username as "Student_5" and password as "S12345"
    And Click on Login button
    Then The student should login successfully

  Scenario: Student should be able to recover messages from trashbox or permanently delete them

    Given The student navigates to Messaging > Trash and sees deleted messages
    And The student will see restore and delete icons and should be able to click on it
    When The student should be able to see and click on restore to retrieve the deleted item from the trash
    And The student restores a deleted message by clicking the restore icon and gets success confirmation on the screen
    And The student clicks the delete icon and sees a confirmation popup
    Then The student confirms deletion and sees a Success message
    And The student sees a Success message and verifies