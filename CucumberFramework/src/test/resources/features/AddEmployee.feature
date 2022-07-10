@homework
Feature: Add Employee
Background: #These are the same steps thats why we put in tag 
  #even if a put a * it will work
    Given user is logged in with valid credentials
     And user navigates to the add employee page
  Scenario: Add Employee with first and last Name
   
    When user enters valid first and last name
    And clicks on save button
    Then validate employee saved

  Scenario: Add Employee without employee id
   
    When user enters valid first and last name
    And user will delete employee id
    And clicks on save button
    Then validate employee saved

  Scenario: Add Employee and create login Credentials
    
    When user enters valid first and last name
    And user create login credentials
    And clicks on save button
    Then validate employee saved

  @task
  Scenario: Add Employee with parametrized first and last Name
    
    When user enters valid first name "Christiano" and last name "Ronaldo"
    And clicks on save button
    Then validate employee "Christiano Ronaldo" is saved
    
    @second
  Scenario: Add Employee without employee id
    When user enters employee first name and last name
    And user deletes employee id
    And user selects a location
    And user clicks on save button
    Then validate that employee is added successfully

  @third
  Scenario: Add Employee and create login Credentials
    When user enters employee first name and last name
    And user selects a location
    And user clicks on Create Login Details
    And user provides credentials
    And user clicks on save button
    Then validate that employee is added successfully

  #To perform DDT using Scenario Outline and Examples keyword
  @scenarioOutline
  Scenario Outline: Adding multiple employees with scenario outline
    When user enters employee "<FirstName>", "<MiddleName>" and "<LastName>"
    And user selects a location "<Location>"
    And user clicks on save button
    Then validate that "<FirstName>" and "<LastName>" is added successfully

    Examples: 
      | FirstName | MiddleName | LastName | Location                         |
      | Joe       | R          | Biden    | London Office                    |
      | Donald    | J          | Trump    | Chinese Development Center       |
      | Barack    | H          | Obama    | South African Development Center |

  #To perform DDT using Datatable
  @dataTable
  Scenario: Adding multiple employees with Datatable
    When user enters employee details and clicks on save and validates it is added
      | FirstName | MiddleName | LastName |
      | Ozer      | O          | Okten    |
      | Ozan      | A          | Tuncay   |
      | Daler     | M          | Mannonov |

  @excelDataTable
  Scenario: Add multiple employees from Excel
    When user enters employee data from "Employee" excel sheet then save

    
