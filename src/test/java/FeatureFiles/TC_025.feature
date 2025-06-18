Feature: Calendar - Bitmiş Derse Erişim ve Kayıt İzleme
  US-025: Bir öğrenci olarak bitmiş bir dersin içeriklerine erişebilmeliyim.

  Scenario: Öğrenci bitmiş derse tıkladığında kayıt linkini görmeli ve videoyu izleyebilmeli
    Given Öğrenci Calendar sayfasında
    When Bitmiş (E) bir derse tıklar
    Then "Recording" linki görünmeli
    When Öğrenci Recording linkine tıklar
    Then Ders videosunda Play simgesi görünmeli
    When Öğrenci Play simgesine tıklar
    Then Video oynatılmaya başlanmalı 