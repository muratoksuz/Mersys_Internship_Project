Feature: Calendar - Ders Durumuna Göre Erişim
  US-024: Bir öğrenci, Calendar sayfasında henüz başlamamış bir derse katılamamalıdır.

  Background:
    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully

  Scenario: Öğrenci başlamamış derse tıkladığında bilgilendirme mesajı görmeli
    Given Öğrenci Calendar sayfasında
    When Henüz başlamamış bir derse tıklar
    Then 'Meeting henüz başlamadı' mesajını içeren bir pencere açılmalı
    And Dersin adı, öğretmen ismi, tarih ve saat bilgisi görünmeli

  Scenario: Öğrenci başlamış veya bitmiş derse tıkladığında bilgi ekranı görmeli
    Given Öğrenci Calendar sayfasında
    When Yayınlanmış, başlamış veya bitmiş bir derse tıklar
    Then Açılır pencerede Information, Topic, Attachments ve Recent Events linkleri görünmeli
    And Bu linkler doğru çalışmalı