Feature: User selects a product


  Scenario Outline: Mobile & Desktop mode  functionalities

    Given browser size as "<Browser_Size>"
    And user on homepage
    And user accept cookies

    And user navigates to Cable page
    When user selects the 3 .th product
    And user clicks warenKorb
    And user clicks 3 .th option
    And user fills personal infos page
      | anrede     | Herr                     |
      | titel      | Dr.                      |
      | vorname    | Tutus Test               |
      | nachname   | User                     |
      | telefon    | 01771111111              |
      | e-Mail     | tutustest@tutusmedia.com |
      | pLZ        | 1234                     |
      | wohnort    | Bochum                   |
      | strasse    | Tutus Str                |
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

    And close the browser


    Examples:
      | Browser_Size |
      | 600x700      |
      | 1300x700     |




