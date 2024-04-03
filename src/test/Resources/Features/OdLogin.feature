Feature: Login

  Scenario:
    Given user is on OD Self serve login page
    When user enters the Mobile no
    And user enters the PAN
    And User clicks on the send OTP button
    And OTP field will be displayed
    And User enters the OTP
    And User clicks on the Submit Otp Button
    Then User lands on Sourcing page