Feature: Öğrencinin Finans Sayfası Üzerindeki İşlemleri

  Background:
    Given Öğrenci kullanıcı adı ve şifresi ile sisteme giriş yapar

  Scenario: Hamburger menüsünden Finans linkine tıklayabilmeli
    When Öğrenci hamburger menüsünü açar
    And Finans linkine tıklar
    Then Finans sayfası açılır

  Scenario: Finans sayfasında isminin bulunduğu satıra tıklayınca ödeme sayfasına yönlendirilmelidir
    Given Öğrenci Finans sayfasındadır
    When Öğrenci isminin bulunduğu satıra tıklar
    Then Ödeme sayfasına yönlendirilir

  Scenario: Ödeme sayfasında "Online Payment" ve "Fee/Balance Detail" butonlarını görebilmelidir
    Given Öğrenci Ödeme sayfasındadır
    Then "Online Payment" butonu görünür olmalıdır
    And "Fee/Balance Detail" butonu görünür olmalıdır

  Scenario: Stripe seçerek ödeme yapabilmelidir
    Given Öğrenci Ödeme sayfasındadır
    When Öğrenci Stripe ödeme seçeneğini seçer
    And ödeme yapar
    Then Ödeme işlemi başarılı olur

  Scenario: Öğrenci Online Payment sayfasındadır
    Given Öğrenci ödeme yaptıktan sonra Online Payment sayfasındadır
    Then Online Payment sayfası görünür olmalıdır

  Scenario: Ödeme sonrası balance kısmında kalan borcun doğru güncellendiğini görmelidir
    Given Öğrenci Ödeme sayfasındadır
    When Öğrenci ödeme yapar
    Then balance kısmında kalan borç doğru güncellenmelidir

  Scenario: Kalan borç, ödeme tutarı kadar eksilmelidir
    Given Öğrenci ödeme öncesi borç miktarını bilir
    When Öğrenci ödeme yapar
    Then borç miktarı ödeme tutarı kadar eksilmiş olmalıdır

  Scenario: Borç miktarı doğru görüntülenmelidir
    Given Öğrenci balance kısmındadır
    Then görüntülenen borç miktarı doğru olmalıdır

  Scenario: Başarılı ödeme mesajı, mesaj ikonuna tıklandığında mesaj kutusunda görünmelidir
    Given Öğrenci başarılı ödeme yapmıştır
    When Öğrenci "top right" mesaj ikonuna tıklar
    Then mesaj kutusunda ödeme başarı mesajı görünür olmalıdır