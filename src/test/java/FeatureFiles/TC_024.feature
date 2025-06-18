Feature: Calendar - Ders Durumuna Göre Erişim
  US-024: Bir öğrenci, Calendar sayfasında henüz başlamamış bir derse katılamamalıdır.

  Background:
    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully
    And User clicks on the element in TopNav

  Scenario: Öğrenci başlamamış derse tıkladığında bilgilendirme mesajı görmeli
    When Henüz başlamamış bir derse tıklar
    Then "Meeting henüz başlamadı" mesajını içeren bir pencere açılmalı
    And Dersin adı, öğretmen ismi, tarih ve saat bilgisi görünmeli

  Scenario: Öğrenci başlamış veya bitmiş derse tıkladığında bilgi ekranı görmeli
    When Yayınlanmış, başlamış veya bitmiş bir derse tıklar
    Then Açılır pencerede Information, Topic, Attachments ve Recent Events linkleri görünmeli
    And Bu linkler doğru çalışmalı 