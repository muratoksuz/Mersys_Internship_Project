package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNav;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class TC_025_Calendar_FinishedCourse_Steps {

    DialogContent dc = new DialogContent();
    TopNav tn = new TopNav(Utilities.GWD.getDriver());
    WebDriverWait wait = new WebDriverWait(Utilities.GWD.getDriver(), Duration.ofSeconds(20));


    @When("Bitmis -E- bir derse tiklar")
    public void bitmisDerseTiklar() {

        dc.myClick(dc.finishedCourse);
    }

    @Then("'Recording' linki görünmeli")
    public void recordingLinkiGorunmeli() {
        /*
        wait.until(ExpectedConditions.visibilityOf(dc.recordingLink));
        Assert.assertTrue(dc.recordingLink.isDisplayed(), "Recording linki görünmedi");

         */
    }

    @When("Öğrenci Recording linkine tıklar")
    public void ogrenciRecordingLinkineTiklar() {
        /*
        dc.myClick(dc.recordingLink);
        // Video sayfasına yönlendirme bekle
        wait.until(ExpectedConditions.visibilityOf(dc.videoPlayer));

         */
    }

    @Then("Ders videosunda Play simgesi görünmeli")
    public void dersVideosundaPlaySimgesiGorunmeli() {
        /*
        wait.until(ExpectedConditions.visibilityOf(dc.playButton));
        Assert.assertTrue(dc.playButton.isDisplayed(), "Play simgesi görünmedi");

         */
    }

    @When("Öğrenci Play simgesine tıklar")
    public void ogrenciPlaySimgesineTiklar() {
        /*
        dc.myClick(dc.playButton);

         */
    }

    @Then("Video oynatılmaya başlanmalı")
    public void videoOynatilmayaBaslanmali() {
        /*

        // Video oynatılmaya başladığını kontrol et
        wait.until(ExpectedConditions.attributeContains(dc.videoPlayer, "class", "playing"));
        Assert.assertTrue(dc.videoPlayer.getAttribute("class").contains("playing"), 
            "Video oynatılmaya başlamadı");
        
        // Alternatif olarak video süresinin değiştiğini kontrol et
        String initialTime = dc.videoCurrentTime.getText();
        dc.myWait(3); // 3 saniye bekle
        String currentTime = dc.videoCurrentTime.getText();
        Assert.assertNotEquals(initialTime, currentTime, "Video oynatılmıyor");

         */
    }


} 