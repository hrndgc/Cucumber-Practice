Feature: US1008_Koala Resort Negative Login

  @dip
  Scenario Outline: TC13_kullanici gecersiz bilgilerle giris yapamaz

    Given kullanici "kr_url" sayfasina gider
    Then Log in yazisina tiklar
    And kullanıcı ismi olarak "<wrong_username>" girer
    And kullnıcı password olarak "<wrong_password>" girer
    And Login butonuna basar
    Then sayfaya giris yapılmadigini kontrol eder
    And sayfayi kapatir

    Examples:
    |wrong_username|wrong_password|
    |kr_wrong_username5|kr_wrong_password5|
    |kr_wrong_username6|kr_wrong_password6|
    |kr_wrong_username7|kr_wrong_password7|
    |kr_wrong_username8|kr_wrong_password8|
    |kr_wrong_username9|kr_wrong_password9|