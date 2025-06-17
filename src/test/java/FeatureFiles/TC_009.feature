Feature: Öğrencinin Finans Sayfası Üzerindeki İşlemleri

  Background:
    Given Öğrenci kullanıcı adı ve şifresi ile sisteme giriş yapar

  Scenario: Hamburger menüsünden Finans linkine tıklayabilmeli
    When Öğrenci hamburger menüsünü açar
    And Finans linkine tıklar
    Then Finans sayfası görüntülenmelidir

  Scenario: Finans sayfasında isminin bulunduğu satıra tıklayınca ödeme sayfasına yönlendirilmelidir
    Given Öğrenci Finans sayfasında bulunur
    When Öğrenci kendi isminin yer aldığı satıra tıklar
    Then Ödeme detayları sayfası görüntülenmelidir

  Scenario: Hamburger menüden Finans linkine tıklayarak finans sayfasına erişebilmeli
    When Öğrenci hamburger menüsünü açar
    And Finans bağlantısına tıklar
    Then Finans sayfasına erişilmelidir

  Scenario: Finans sayfasında "Fee/Balance Detail" butonunu görebilmeli ve tıklayabilmeli
    Given Öğrenci Finans sayfasına gider
    Then "Fee/Balance Detail" butonu görünür olmalıdır
    When Butona tıklar
    Then İlgili detay sayfası açılmalıdır

  Scenario: "Fee/Balance Detail" butonuna tıkladığında taksitlendirme tablosunu görebilmeli
    Given Öğrenci Finans sayfasındadır
    When "Fee/Balance Detail" butonuna tıklar
    Then Taksitlendirme tablosu görüntülenmelidir