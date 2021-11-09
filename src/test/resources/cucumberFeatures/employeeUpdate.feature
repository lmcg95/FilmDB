Feature: Employees can update information on the database

Scenario: employees can change the release year of a film
Given I am an employee of the rental company
When I try to change the release year of a film
Then users should see the updated release year


Scenario: non-employees cannot change the release year of a film
Given I am not an employee of the rental company
When I try to change the release year of a film
Then I should not be allowed