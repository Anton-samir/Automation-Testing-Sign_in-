Feature: sign_in
  Background:
    Given User Open Browser Navigate the website Page Login
    When user Press Sign In user name and password
  Scenario: User Can load with Invalid  All Data scenario

    And user Input All InValid Data

    Then user Unsuccessfully Login
  Scenario: User Can load with valid  All Data scenario

    And user Input All Valid Data

    Then user successfully Login
