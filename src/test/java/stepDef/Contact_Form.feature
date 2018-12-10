Feature: Using Contact Form
  To test the functionality of contact form

  Scenario : Filling contact form
    Given me on Home Page of "http://room5.trivago.com/contact/"
    And Dismiss cookies popup
    When I enter message as "some gibberish"
    And I enter full name as "My Name"
    And I enter email as "ashish@deshmukh.com"
    And I click on Submit button
    Then I see success message