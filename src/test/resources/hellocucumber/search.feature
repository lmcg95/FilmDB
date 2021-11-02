Feature: employees and members can search the system

  Scenario: an employee can seacrh for Penelope Guiness
    Given I am an employee of the rental company
    When I search for Penelope Guiness
    Then I will see a list of films with Penelope Guiness in them


  Scenario: Non-employee members can search for Penelope Guiness
    Given I am not an employee of the rental company
    And I am a member of the rental company
    When I search for Penelope Guiness
    Then I will see a list of films with Penelope Guiness in them

  Scenario: Non-employee non-members cannot search for Penelope Guiness
    Given I am not an employee of the rental company
    And I am not a member of the rental company
    When I try to search for Penelope Guiness
    Then I will not be allowed