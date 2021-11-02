Feature: employee can create new film



Scenario: Employees can add a new film to the database
Given I am an employee of the rental company
When I try to add a new film to the database
Then the movie will be available for customers to rent


Scenario: Non-employees cannot add a film to the database
Given I am not an employee of the rental company
When I try to add a new film to the database
Then I should not be allowed