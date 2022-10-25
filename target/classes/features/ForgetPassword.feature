Feature: ForgetPassword
  Scenario: User Can load with valid name and Password
    Given User Open Browser Navigate the website Forget

    When user given password

    And user press for Forget

    Then user successfully Forget
