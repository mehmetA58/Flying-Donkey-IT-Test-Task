@amazon
Feature:Amazon Search
  Scenario Outline: Searching
    Given Go to "amazonUrl"
    Then Search "<Product>"
    When Select the first product listed
    Then Verify that the title of the selected product includes "<ProductTitle>"
    And close to page
    Examples:
      | Product | ProductTitle |
      | Nutella | Nutella |






