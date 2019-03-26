Feature: Login Feature

  Scenario: Authentication
    Given Open Application and Enter url
    When enter username
    And  enter password
    Then verify Message
