Feature: Website Header Sign-up Feature

  @SignUp
  Scenario: Header Basarili Uyelik Ol
    When uye ol hyperlink tikla
    Then sayfanin title "Üye Ol" ve url "https://www.arabam.com/uye-ol?returnUrl=%2F" kontrol et
    And kullanici ad "testadi" gir
    And kullanici soyad "testsoyadi" gir
    And kullanici email "testarabam@c.com" gir
    And kullanici sifre "qaz123" gir
    And kullanici tekrar sifre "qaz123" gir
    And Kvk checkbox tikla
    And sozleşme checkbox tikla


