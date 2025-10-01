@TestRunner
Feature: Test Login Page

  Scenario: Validate Successful Login Using valid Credentials
    Given User Navigate To Login Page
    When  User Login with Credentials "tomsmith" "SuperSecretPassword!"
    Then  User Should Login Successfully

  Scenario Outline: Validate Error message appearance when using invalid data
     Given User Navigate To Login Page
     When  User Login with Credentials "<username>" "<password>"
     Then  Error Message is appeared

    Examples:
    | username  | password              |
    | invalid   | SuperSecretPassword!  |
    | tomsmith  | invalid               |
    | invalid   | invalid               |
    |           |                       |
    | A         | A                     |
    | $#@$@#    | @$#$                  |

