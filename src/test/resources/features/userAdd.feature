Feature: Adding a new film
  As a user I want to add a new film to the database so that other users can see the film



Scenario: Users can add a new film to the database given they have all of the required information
Given I have all of the information required about the film
When I try to add the film with title "title", release year 2006, description "this is a film", length 132, rating "R"
Then The new film will be added to the database with title "title", release year 2006, description "this is a film", length 132, rating "R"


#Scenario: User cannot add a new film to the database if they don't have all the information
#Given I do not have all of the required information about the film
#When I input the information I do have
#Then The film will not be added to the database and I will be told "Error"