Feature: If an actor is on the database they can be searched for

  Scenario: A member can log in and see films available to rent
    Given I am a member of the rental company
    When I try log into the rental company website
    Then I will be able to log in
    And I will be able to see which films are available to rent

  Scenario: Non-members cannot log in
    Given I am not a member of the rental company
    When I try to log in to the rental company website
    Then I will not be able to log in