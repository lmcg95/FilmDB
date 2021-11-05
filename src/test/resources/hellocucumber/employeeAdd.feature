Feature: employee can create new film



Scenario: Employees can add a new film to the database if they have all the information
Given I have all of the information required about the film
When I input all the information
Then The film will be added to the database and I will be told "Saved"


Scenario: Employees cannot add a new film to the database if they don't have all the information
Given I do not have all of the required information about the film
When I input the information I do have
Then The film will not be added to the database and I will be told "Error"