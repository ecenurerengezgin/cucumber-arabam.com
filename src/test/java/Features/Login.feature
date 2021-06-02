Feature: Website Header Login Feature

  @Login
  Scenario Outline: Header Basarili login
    Given Browser anasayfa kal
    When giris yap hyperlink tikla
    Then sayfanin title ve url kontrol et
    And kullanici bilgisi "<user>" gir
    And kullanici password "<password>" gir
    And beni hatirla checkbox tikla

    Examples:
      | user                      | password  |
      | habermerkezi@arabam.com   | Arb921!35 |
      | 5078107815                | qaz1234!  |
