Feature: Calendar - Bitmiş Derse Erişim ve Kayıt İzleme
  US-025: Bir öğrenci olarak bitmiş bir dersin içeriklerine erişebilmeliyim.

  Background:
    Given Navigate to the website
    When Enter valid username as "Student_10" and password as "S12345"
    And Click on Login button
    Then The student should login successfully


  Scenario: Öğrenci bitmiş derse tıkladığında kayıt linkini görmeli ve videoyu izleyebilmeli
    Given Öğrenci Calendar sayfasında
    When Bitmis -E- bir derse tiklar
    Then 'Recording' linki görünmeli
    When Öğrenci Recording linkine tıklar
    Then Ders videosunda Play simgesi görünmeli
    When Öğrenci Play simgesine tıklar
    Then Video oynatılmaya başlanmalı 