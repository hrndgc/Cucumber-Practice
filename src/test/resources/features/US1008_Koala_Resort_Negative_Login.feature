
Feature: US1008_Koala Resort Negative Login

@wip
Scenario: TC12 kullanici gecersiz bilgilerle giris yapamaz

Given kullanici "kr_url" sayfasina gider
Then Log in yazisina tiklar
And kullanıcı ismi olarak "kr_wrong_username" girer
And kullnıcı password olarak "kr_wrong_password" girer
And Login butonuna basar
Then sayfaya giris yapılmadigini kontrol eder
And sayfayi kapatir