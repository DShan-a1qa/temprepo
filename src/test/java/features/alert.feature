Feature: Alert feature
  I am user
  I want to handle an alert
  Specifically to accept it

  Scenario: Alert feature
    Given User clicks on "JavaScript Alerts" link
    Then alert page should be displayed
    When user clicks on the alert button
    And user accepts the alert
    Then success message should be displayed
