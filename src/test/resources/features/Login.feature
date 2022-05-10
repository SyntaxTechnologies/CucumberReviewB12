#Author: asel@syntax.com
@login
Feature: Login feature
  
  Backgroud:
  Given user is navigated to HRMS application

  @smoke @ui @sprint3
  Scenario: Valid admin login
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in

	@regression @sprint4
  Scenario Outline: Invalid login
    When user enters "<username>" and "<password>"
    And user clicks on login button
    Then user see "<errorMessage>" on the screen

    Examples: 
      | username | password | errorMessage             |
      | Admin    | Test123  | Invalid credentials      |
      | Admin    |          | Password cannot be empty |
      |          | Test123  | Username cannot be empty |