Feature: employee can create new film



Scenario: Employees can add a new film to the database
Given I am an employee of the rental company
When I try to add a new film to the database
Then The film will be added to the database


Scenario: Non-employees cannot add a film to the database
Given I am not an employee of the rental company
When I try to add a new film to the database
Then I should not be allowed