Feature: Delete a film
  As a user I want to delete a film from the database so that other users can no longer see the film

  Scenario: Users can delete a film if they have the film ID

    Given The film with ID 50 is in the database
    When I try to delete the film with ID 50
    Then The film with ID 50 will no longer exist in the database