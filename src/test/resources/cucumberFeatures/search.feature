Feature: permitted users can search the system


  Given Penelope Guiness is stored in the database
  And I have the required permission
  When I search for Penelope Guiness
  Then I will see a list of films with Penelope Guiness in then

  Given Penelope Guiness is not stored in the database
  And I have the required permission
  When I seacrh for Penelope Guiness
  Then I will receive the message "actor not found"

  Given I do not have Permission
  When I try to search for Penelope Guiness
  Then I will not be able to