Feature: Hamburger Menu Messaging

 # Background:
  #  Given Navigate to Campus
   # When Enter username and password and click login button
    #Then User should login successfully

  Scenario: Manage Messaging From Hamburger Menu
    Given Navigate to Hamburger Menu
    When Click on the Messaging button
    And Get the Messaging Menu List
    Then In The Messaging Menu, User Should See the Following List
      | Send Message |
      | Inbox        |
      | Outbox       |
      | Trash        |

  Scenario: Click on an item from Messaging Menu
    Given Navigate to Hamburger Menu
    When Click on the Messaging button
    And User clicks on sendMessage in the Messaging Menu
    Then sendMessage page should be displayed