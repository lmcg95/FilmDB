Feature: Users can delete films from the service

Scenario: A user can delete a film from the database if they provide the film ID
Given I have the film ID of a film in the database
When I delete a film from the database
Then I will be told "Film deleted"


Scenario: A user cannot delete a film if the film ID does not exist in the database
Given I have a film ID which is not in the database
When Whern I input that ID to delete
Then I should be told "Error"
