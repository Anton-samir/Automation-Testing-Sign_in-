Feature: Login
  Background:
    Given User Open Browser Navigate the website

  Scenario: User Can load with valid name and scenario
    When user given user name and password

    And user press for password

    Then user successfully Login

    Scenario: User Cant load with Invalid name and Invalid scenario
      When user given invalid user name or invalid password

      And user press for Submit Login

      Then user Cant successfully Login
