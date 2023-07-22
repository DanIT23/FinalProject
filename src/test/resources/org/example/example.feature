Feature: An example

  Scenario: The example
    Given I am on the main page
    When the email value of "tester@test.com" is inputted
    And the submit button is clicked

  Scenario: Positive - Test enrollment button
    Given I am on the main page
    When the Enrollment button is clicked

  Scenario: Positive - Test the fundamentals section
    Given I am on the main page
    When the read more for the fundamentals is clicked




  Scenario: Positive - Test the in person read more button
    Given  I am on the main page
    When  button read more for in person is clicked

  Scenario: Read More Hybrid
    Given  I am on the main page
    When the read more button for hybrid section is clicked

  Scenario: Sign up for the Software Testing
    Given Sign the Software Testing

  Scenario: The Personal Information
    Given I am on the personal information