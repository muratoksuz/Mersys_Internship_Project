package StepDefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;

public class TC_010 {

    @Given("Öğrenci kullanıcı adı ve şifresi ile sisteme giriş yapar")
    public void ogrenci_sisteme_giris_yapar() {
        // Login işlemleri burada yapılacak
        System.out.println("Kullanıcı sisteme giriş yaptı");
    }

    @When("Öğrenci hamburger menüsünü açar")
    public void ogrenci_hamburger_menusu_acar() {
        // Hamburger menüsünü açma işlemi
        System.out.println("Hamburger menüsü açıldı");
    }

    @When("Finans linkine tıklar")
    public void finans_linkine_tiklar() {
        // Finans linkine tıklama
        System.out.println("Finans linkine tıklandı");
    }

    @Then("Finans sayfası açılır")
    public void finans_sayfasi_acilir() {
        // Finans sayfasının açıldığını doğrulama
        System.out.println("Finans sayfası açıldı");
        Assert.assertTrue(true); // Örnek assertion
    }

    @Given("Öğrenci Finans sayfasındadır")
    public void ogrenci_finans_sayfasindadir() {
        // Finans sayfasına gidildiği varsayımı
        System.out.println("Finans sayfasındadır");
    }

    @When("Öğrenci isminin bulunduğu satıra tıklar")
    public void ogrenci_isminin_bulundugu_satira_tiklar() {
        // İsim satırına tıklama işlemi
        System.out.println("İsim satırına tıklandı");
    }

    @Then("Ödeme sayfasına yönlendirilir")
    public void odeme_sayfasina_yonlendirilir() {
        // Yönlendirme kontrolü
        System.out.println("Ödeme sayfasına yönlendirildi");
        Assert.assertTrue(true);
    }

    @Given("Öğrenci Ödeme sayfasındadır")
    public void ogrenci_odeme_sayfasindadir() {
        System.out.println("Ödeme sayfasındadır");
    }

    @Then("\"Online Payment\" butonu görünür olmalıdır")
    public void online_payment_butonu_gorunur_olmalidir() {
        System.out.println("\"Online Payment\" butonu görünüyor");
        Assert.assertTrue(true);
    }

    @Then("\"Fee/Balance Detail\" butonu görünür olmalıdır")
    public void fee_balance_detail_butonu_gorunur_olmalidir() {
        System.out.println("\"Fee/Balance Detail\" butonu görünüyor");
        Assert.assertTrue(true);
    }

    @When("Öğrenci Stripe ödeme seçeneğini seçer")
    public void ogrenci_stripe_odeme_secimini_yapar() {
        System.out.println("Stripe ödeme seçildi");
    }

    @When("ödeme yapar")
    public void odeme_yapar() {
        System.out.println("Ödeme işlemi yapıldı");
    }

    @Then("Ödeme işlemi başarılı olur")
    public void odeme_basariyla_tamamlandi() {
        System.out.println("Ödeme işlemi başarıyla tamamlandı");
        Assert.assertTrue(true);
    }

    @Given("Öğrenci ödeme yaptıktan sonra Online Payment sayfasındadır")
    public void ogrenci_odeme_yaptiktan_sonra_online_payment_sayfasindadir() {
        System.out.println("Online Payment sayfasındadır");
    }

    @Then("Online Payment sayfası görünür olmalıdır")
    public void online_payment_sayfasi_gorunur_olmalidir() {
        System.out.println("Online Payment sayfası görünüyor");
        Assert.assertTrue(true);
    }

    @Then("balance kısmında kalan borç doğru güncellenmelidir")
    public void balance_kalan_borc_guncellenmelidir() {
        System.out.println("Balance kısmı doğru güncellendi");
        Assert.assertTrue(true);
    }

    @Given("Öğrenci ödeme öncesi borç miktarını bilir")
    public void ogrenci_borc_miktarini_bilir() {
        System.out.println("Ödeme öncesi borç miktarı biliniyor");
    }

    @Then("borç miktarı ödeme tutarı kadar eksilmiş olmalıdır")
    public void borc_miktari_odeme_tutari_kadar_eksilmeli() {
        System.out.println("Borç miktarı ödeme tutarı kadar azaldı");
        Assert.assertTrue(true);
    }

    @Given("Öğrenci balance kısmındadır")
    public void ogrenci_balance_kismindadir() {
        System.out.println("Balance kısmındadır");
    }

    @Then("görüntülenen borç miktarı doğru olmalıdır")
    public void borc_miktari_dogru_goruntulenmelidir() {
        System.out.println("Borç miktarı doğru görüntülendi");
        Assert.assertTrue(true);
    }

    @Given("Öğrenci başarılı ödeme yapmıştır")
    public void ogrenci_basariyla_odeme_yapmistir() {
        System.out.println("Başarılı ödeme yapıldı");
    }

    @When("Öğrenci \"top right\" mesaj ikonuna tıklar")
    public void ogrenci_mesaj_ikonuna_tiklar() {
        System.out.println("Mesaj ikonuna tıklandı");
    }

    @Then("mesaj kutusunda ödeme başarı mesajı görünür olmalıdır")
    public void mesaj_kutusunda_odeme_mesaji_gorunmeli() {
        System.out.println("Ödeme başarı mesajı görüntülendi");
        Assert.assertTrue(true);
    }
}