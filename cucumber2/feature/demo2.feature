Feature: login Action

Scenario Outline: Successfull Login with valid Credentials
  Given User is open the application
  When user enters "<username>" and "<password>"
  Then Message displayed Login Successfully
  
  
  Examples:
  | username | password    |
  | lalitha  | password123 |
  | Admin    | password456 |
