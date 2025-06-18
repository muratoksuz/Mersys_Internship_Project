Feature: Öğrencinin My Finance Üzerinden Ödeme Yapma İşlemi

  Background:
    Given Öğrenci kullanıcı adı ve şifresi ile sisteme giriş yapar

  Scenario: Öğrenci, Hamburger Menu > Finance > My Finance linkini takip ederek ödeme sayfasına ulaşabilmelidir
    When Öğrenci hamburger menüsünü açar
    And Finance linkine tıklar
    And My Finance linkine tıklar
    Then Öğrenci ödeme sayfasına yönlendirilmelidir

  Scenario: Öğrenci, Stripe'ı kullanarak ödeme yapabilmelidir
    Given Öğrenci ödeme sayfasındadır
    When Öğrenci Stripe ödeme seçeneğini seçer
    And Öğrenci ödeme yapar
    Then Ödeme başarılı mesajı görüntülenmelidir

  Scenario: Ödeme tutarı, doğru bir şekilde 235$ olarak belirlenmelidir
    Given Öğrenci ödeme sayfasındadır
    Then Ödeme tutarı 235 dolar olarak görünmelidir

  Scenario: Öğrenci, ödeme gerçekleştirdikten sonra borcunun bir taksidini ödemiş olduğunu doğrulamalıdır
    Given Öğrenci ödeme işlemini tamamlamıştır
    Then Öğrenci, borcunun bir kısmını ödediğini görüntülemelidir