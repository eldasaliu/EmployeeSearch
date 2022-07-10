
Feature: Searching in Google

Scenario: Search by typing
 Given I navigate to Google
 When I type a something on the seach button
 And I click on the search button
 Then I can see the results of the search
 And I can count the number of the results
 
 
 
Scenario: Search by voice
 Given I navigate to Google
 When I say what I want to search
 
 Then I can see the results of the search
 And I can count the number of the results