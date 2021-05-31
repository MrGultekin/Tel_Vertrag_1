Feature: User selects a product

  Scenario: cookies solution
    Given user on homepage
    And user accept cookies

  Scenario Outline: Cable page  functionality


    Given user navigates to Cable page
    When user selects the <productNumber> .th product
    And user clicks warenKorb
    And user clicks <extraTalk> .th option


    Examples:
      | productNumber | extraTalk |
      | 5             | 3         |
      | 1             | 1         |




