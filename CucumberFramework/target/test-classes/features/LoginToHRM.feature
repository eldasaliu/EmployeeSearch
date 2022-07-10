Feature: Login Functionality

  @smoke @regression
  Scenario: Valid Login
    Given I navigated to the HRM website
    When I enter a valid username
    And I enter a valid password
    And I click on the login button
    Then I validate that I am logged in
    And I will quit the browser

  @regression
  Scenario: Invalid Password
    Given I navigated to the HRM website
    When I enter a valid username
    And I enter an invalid password
    And I click on the login button
    Then I validate that Invalid Credentials is displayed
    Then I will quit the browser

  @login1
  Scenario Outline: Login using Scenario Outline and Example Table
    When User enters login info "<username>" and "<password>"
    And I click on login button
    Then Welcome "<firstname>" message is displayed

    Examples: 
      | username | password    | firstname     |
      | Shannon1 | Shannon@123 | Shannon Triix |
      | Mia!65   | Miaa@789   | Mia Zein      |

  @login2
  Scenario: Login Datatable
    When users enter username,password,click on login button
      | username | password    | firstname     |
      | Shannon1 | Shannon@123 | Shannon Triix |
      | Mia!65   | Miaa@789   | Mia Zein      |
