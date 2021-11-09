Feature: Employees can delete films from the service

Scenario: An employee can delete a film that exists in the database
Given I am an employee of the film database service
And the film Academy Dinosaur
When I delete a film from the database
Then it should no longer be available for customers to rent


Scenario: A non-employee cannot delete a film from the database
Given I am not an employee of the rental company
When I try to delete a film from the database
Then I should not be allowed
