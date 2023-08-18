Feature: An example

Scenario: Click on the Instructor
  Given   I am on the main page
  When    I click on Instructor
  Then    Our instructors header should appear


  Scenario: Test insert email
    Given   I am on the main page
    When    The email value of "tester@test.com" is inputted
    And     The submit button is clicked
    Then    the newsletter pop-up appears


  Scenario: Test button The Enrollment
    Given   I am on the main page
    When    The Enrollment button is clicked
    Then    Personal information is open

  Scenario: Test button Read More in Fundamentals page
    Given   I am on the main page
    When    The read more for the fundamentals is clicked
    Then    "Fundamentals" page is open


  Scenario: Test button Read More In Person
    Given   I am on the main page
    When    Button read more in person is clicked
    Then    "In Person" page is open


  Scenario: Test button Read More in Hybrid
    Given   I am on the main page
    When    The read more button for hybrid section is clicked
    Then    "Hybrid" page is open





  Scenario: Negative - There is no limit character
    Given   I am on the main page
    When    The email value of "AAAAbbbbcccccdddeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee@tester.com" is insert
    And     The button is clicked
    Then    the newsletter pop-up appears

    Scenario: Positive - Read More for Learn Selenium
      Given   I am on the main page
      When    Click button read more for learn selenium
      Then    "Learn Selenium" page is no the next page


  Scenario: The Personal Information
    Given   I am on the personal information
    When    The first name value of "Daniel" is insert
    And     The last name value of "Victor" is insert
    *       The user name value of "DANIEL10" is insert
    *       The password value of "Terminator2123" is insert
    *       The confirm password value of "Terminator2123" is insert
    And     Next for personal information is clicked
    Then    Contact information is open


  Scenario: Contact Information (CI)
    Given   I am on contact information
    When    The email for CI "dany@yahoo.com" is insert
    And     The phone for CI "0745233" is insert
    *       The country for CI "Uk" is insert
    *       The city for CI "London" is insert
    *       The pas code for CI "HA97LX" is insert
    *       Next for CI is clicked
    When    Select second button  for course option
    And     Next for course option
    Then    Payment Information is open


  Scenario: Payment Information
    Given   I am on Payment Information
    When    The holder name "Nicolae Daniel" insert in card
    And     The card number "1234-4567-8909" is insert
    *       Number cvc "098" is insert
    And     Select month
    And     Select year
    And     Next for payment information is clicked
    Then    Registration has been made successfully


  Scenario: Return In Main Page
    Given   I am on last class
    And     Return in main page
    Then    Main page is return









      






      


