Feature: For Hillel

  Scenario: I as a customer can register, search music and turn it on.
    Given I access main page "music.i.ua"
    When I click at log in button
    And Enter login
    And Enter pass
    And Click at log in button
    Then I logged in
    When I click to the search button
    And Enter my lovely composition
    Then I can see my lovely song
    And  Play it
