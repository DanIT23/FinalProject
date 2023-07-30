Feature: An example

  Scenario: Positive - Test insert email
    Given   I am on the main page
    When    The email value of "tester@test.com" is inputted
    And     The submit button is clicked


  Scenario: Positive - Test button The Enrollment
    Given   I am on the main page
    When    The Enrollment button is clicked


  Scenario: Positive - Test button Read More in Fundamentals page
    Given   I am on the main page
    When    The read more for the fundamentals is clicked


  Scenario: Positive - Test button Read More In Person
    Given   I am on the main page
    When    Button read more in person is clicked


  Scenario: Positive - Test button Read More in Hybrid
    Given   I am on the main page
    When    The read more button for hybrid section is clicked


  Scenario: Positive - Test Class Personal Information
    Given   I am on personal information


  Scenario: Positive - The Personal Information"
    Given   I am on the personal information
    When    The first name value of "Daniel" is insert
    And     The last name value of "Victor" is insert
    *       The user name value of "DjANIEL" is insert
    *       The password value of "Terminator2" is insert
    *       The confirm password value of "Terminator2" is insert
    Given   Next for personal information is clicked



  Scenario: Positive - Contact Information (CI)
    Given   I am on contact information
    When    The email for CI "dany@yahoo.com" is insert
    And     The phone for CI "0745233" is insert
    *       The country for CI "Romania" is insert
    *       The city for CI "Brasov" is insert
    *       The pas code for CI "HA97LX" is insert
    Given   Next for CI is clicked
    When    Select button 2 for course option
    Given   Next for course option


  Scenario: Positive - Payment Information
    Given   I am on Payment Information
    When    The holder name "Nicolae Daniel" insert in card
    And     The card number "1234-4567-8909" is insert
    *       Number cvc "098" is insert
    When    Select month
    And     Select year
    Given   Next for payment information is clicked


  Scenario: Positive - Return In Main Page
    Given   I am on last class
    And     Return in main page







      






      


