package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class TC_009 {

    DialogContent dialogContent = new DialogContent();
    LeftNav leftNav = new LeftNav();

    @Given("Öğrenci kullanıcı adı ve şifresi ile sisteme giriş yapar")
    public void ogrenci_kullanici_adi_ve_sifresi_ile_sisteme_giris_yapar() {
        GWD.getDriver().get("https://test.mersys.io/");
        dialogContent.mySendKeys(dialogContent.inputUserName, "student_username"); // gerçek kullanıcı adı
        dialogContent.mySendKeys(dialogContent.inputPassword, "student_password"); // gerçek şifre
        dialogContent.myClick(dialogContent.loginButton);
        // Giriş başarılı ise welcome text görünecek
        dialogContent.verifyMessageContainsText(dialogContent.welcomeStudentTxt, "Welcome, Student");
    }

    @When("Finans linkine tıklar")
    public void finans_linkine_tiklar() {
        leftNav.clickFunction("finans"); // LeftNav'deki finans locator’ı kullanılır
    }

    @Then("Finans sayfası görüntülenmelidir")
    public void finans_sayfasi_goruntulenmelidir() {
        // Finans sayfasına ait bir element görünür olmalı, örn: page title veya başka bir locator
        Assert.assertTrue(leftNav.finansPageBaslik.isDisplayed());
    }

    @Given("Öğrenci Finans sayfasında bulunur")
    public void ogrenci_finans_sayfasinda_bulunur() {
        // Direkt finans sayfasına gitmek için:
        GWD.getDriver().get("https://test.mersys.io/finans"); // URL örnek, gerçek url ile değiştir
        Assert.assertTrue(leftNav.finansPageBaslik.isDisplayed());
    }

    @When("Öğrenci kendi isminin yer aldığı satıra tıklar")
    public void ogrenci_kendi_isminin_yer_aldigi_satira_tiklar() {
        // Öğrencinin ismine ait satırın locator'ı PageObject içinde olmalı.
        dialogContent.myClick(dialogContent.ogrenciAdiSatiri); // bu WebElement'i eklememiz lazım DialogContent'e
    }

    @Then("Ödeme detayları sayfası görüntülenmelidir")
    public void odeme_detaylari_sayfasi_goruntulenmelidir() {
        Assert.assertTrue(dialogContent.odemeDetaylariSayfasiElementi.isDisplayed()); // ilgili locator eklenmeli
    }

    @When("Finans bağlantısına tıklar")
    public void finans_baglantiya_tiklar() {
        leftNav.clickFunction("finans");
    }

    @Then("Finans sayfasına erişilmelidir")
    public void finans_sayfasina_erisilmelidir() {
        Assert.assertTrue(leftNav.finansPageBaslik.isDisplayed());
    }

    @Given("Öğrenci Finans sayfasına gider")
    public void ogrenci_finans_sayfasina_gider() {
        GWD.getDriver().get("https://test.mersys.io/finans"); // URL örnek
        Assert.assertTrue(leftNav.finansPageBaslik.isDisplayed());
    }

    @Then("\"Fee/Balance Detail\" butonu görünür olmalıdır")
    public void fee_balance_detail_butonu_gorunur_olmalidir() {
        Assert.assertTrue(dialogContent.feeBalanceDetailButton.isDisplayed());
    }

    @When("Butona tıklar")
    public void butona_tiklar() {
        dialogContent.myClick(dialogContent.feeBalanceDetailButton);
    }

    @Then("İlgili detay sayfası açılmalıdır")
    public void ilgili_detay_sayfasi_acilmalidir() {
        Assert.assertTrue(dialogContent.detaySayfasiElementi.isDisplayed()); // locator eklenmeli
    }

    @Given("Öğrenci Finans sayfasındadır")
    public void ogrenci_finans_sayfasindadir() {
        GWD.getDriver().get("https://test.mersys.io/finans"); // URL örnek
        Assert.assertTrue(leftNav.finansPageBaslik.isDisplayed());
    }

    @When("\"Fee/Balance Detail\" butonuna tıklar")
    public void fee_balance_detail_butonuna_tiklar() {
        dialogContent.myClick(dialogContent.feeBalanceDetailButton);
    }

    @Then("Taksitlendirme tablosu görüntülenmelidir")
    public void taksitlendirme_tablosu_goruntulenmelidir() {
        Assert.assertTrue(dialogContent.taksitlendirmeTablosuElementi.isDisplayed()); // locator eklenmeli
    }
}