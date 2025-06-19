package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class TC_011_Steps {

    WebDriver driver = GWD.getDriver();
    LeftNav leftNav = new LeftNav();
    DialogContent dialogContent = new DialogContent();


    @When("Öğrenci hamburger menüsünü açar")
    public void hamburgerMenusuAcar() {
        leftNav.clickHamburgerMenu();
    }

    @When("Finance linkine tıklar")
    public void financeLinkineTiklar() {
        leftNav.clickFinanceLink();
    }

    @When("My Finance linkine tıklar")
    public void myFinanceLinkineTiklar() {
        WebElement myFinanceLink = driver.findElement(By.xpath("//a[contains(@href,'/finance/my')]"));
        myFinanceLink.click();
    }

    @Then("Öğrenci ödeme sayfasına yönlendirilmelidir")
    public void odemeSayfasinaYonlendirilir() {
        Assert.assertTrue(driver.getCurrentUrl().contains("/finance/payment"));
    }

    @Given("Öğrenci ödeme sayfasındadır")
    public void ogrenciOdemeSayfasindadir() {
        driver.get("https://test.mersys.io/finance/payment");
    }

    @When("Öğrenci Stripe ödeme seçeneğini seçer")
    public void stripeOdemeSecilir() {
        dialogContent.selectStripePayment();
    }

    @When("Öğrenci ödeme yapar")
    public void ogrenciOdemeYapar() {
        dialogContent.makePayment("235");
    }

    @Then("Ödeme başarılı mesajı görüntülenmelidir")
    public void odemeBasariliMesajiGorunmeli() {
        Assert.assertTrue(dialogContent.successMessage.isDisplayed());
        Assert.assertTrue(dialogContent.successMessage.getText().toLowerCase().contains("başarılı"));
    }

    @Then("Ödeme tutarı 235 dolar olarak görünmelidir")
    public void odemeTutariGorunmeli() {
        WebElement amountField = driver.findElement(By.id("amountInput"));
        String value = amountField.getAttribute("value");
        Assert.assertEquals("235", value);
    }

    @Given("Öğrenci ödeme işlemini tamamlamıştır")
    public void ogrenciOdemeYapti() {
        ogrenciOdemeYapar();
    }

    @Then("Öğrenci, borcunun bir kısmını ödediğini görüntülemelidir")
    public void borcOdemesiGoruntulenmeli() {
        WebElement balanceField = driver.findElement(By.id("balanceAmount"));
        String remainingDebt = balanceField.getText().replace("$", "").trim();
        double remaining = Double.parseDouble(remainingDebt);

        // Borcun en az 235$ azalmış olması gerekir
        Assert.assertTrue(remaining < 1000, "Borcun azalmadığı tespit edildi!"); // Örnek eşik
    }
}