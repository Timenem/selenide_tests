

Feature: Testing Student Registration Form
  Scenario: entering valid data into the form
    Given go to form page
    And Name should be "tester"
    And Last name should be "testerLastName1"
    And Email should be "tester@mail.ru"
    And Gender should be Male
    And Mobile should be "+7111-84-56-651"
    And Date of birth should be 19 Feb 1994
    And Hobbies should be Sports and Reading
    And Picture should be downloaded
    And Current "#currentAddress" address should be "baker street 221 b"
    Then Click "#submit" button
