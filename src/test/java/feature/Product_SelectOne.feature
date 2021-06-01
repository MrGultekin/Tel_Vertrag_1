Feature: User selects a product

  Scenario: cookies solution
    Given user on homepage
    And user accept cookies

  Scenario Outline: Cable page  functionality


    Given user navigates to Cable page
    When user selects the <productNumber> .th product
    And user clicks warenKorb
    And user clicks <extraTalk> .th option
    And user fills personal infos page
      | anrede     | Herr                     |
      | titel      | Dr.                      |
      | vorname    | Tutus Test               |
      | nachname   | User                     |
      | telefon    | 01771111111              |
      | e-Mail     | tutustest@tutusmedia.com |
      | pLZ        | 1234                     |
      | wohnort    | Bochum                   |
      | strasse    | Tutus Str                      |
      | hausnummer | 11                       |

    And user fills ID card infos

      | Ausweisart      | Deutscher Reisepass |
      | Ausstellungsort | New York            |
      | Geburtsdatum    | 11.11.2011          |
      | Geburtsort      | Londa               |
      | Gültigkeit      | 11.11.2051          |
      | Ausweisnummer   | 1223334444          |

    Then user fills Bank Infos
      | IBAN | DE89370400440532013000 |




    Examples:
      | productNumber | extraTalk |
      | 5             | 3         |
      | 1             | 1         |




