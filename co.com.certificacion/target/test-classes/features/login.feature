#Author: Ivan Carpintero

Feature: Successful authentication in the portal

  Scenario Outline: Validate successful user authentication
    Given that a "User" enters the portal
    When the user enters their '<username>' and '<password>'

    Examples:
      | username | password |
      | pruebas  | testQA   |



