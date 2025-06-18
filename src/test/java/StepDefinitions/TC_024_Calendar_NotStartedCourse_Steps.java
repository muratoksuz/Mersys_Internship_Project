package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNav;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class TC_024_Calendar_NotStartedCourse_Steps {

    DialogContent dc = new DialogContent();
    TopNav tn = new TopNav(Utilities.GWD.getDriver());
    WebDriverWait wait = new WebDriverWait(Utilities.GWD.getDriver(), Duration.ofSeconds(20));

    @Given("Öğrenci Calendar sayfasında")
    public void ogrenciCalendarSayfasinda() {
        // Calendar sayfasına git
        dc.myClick(tn.getWebElement("calender"));
        wait.until(ExpectedConditions.visibilityOf(dc.calendarPageTitle));
    }

    @When("Henüz başlamamış bir derse tıklar")
    public void henuzBaslamamisDerseTiklar() {
        // Henüz başlamamış dersi bul ve tıkla
        WebElement notStartedCourse = findNotStartedCourse();
        if (notStartedCourse != null) {
            dc.myClick(notStartedCourse);
        } else {
            Assert.fail("Henüz başlamamış ders bulunamadı");
        }
    }

    @Then("\"Meeting henüz başlamadı\" mesajını içeren bir pencere açılmalı")
    public void meetingHenuzBaslamadiMesajiGorunmeli() {
        wait.until(ExpectedConditions.visibilityOf(dc.meetingNotStartedMessage));
        Assert.assertTrue(dc.meetingNotStartedMessage.isDisplayed(), 
            "Meeting henüz başlamadı mesajı görünmedi");
    }

    @And("Dersin adı, öğretmen ismi, tarih ve saat bilgisi görünmeli")
    public void dersBilgileriGorunmeli() {
        Assert.assertTrue(dc.courseNameInModal.isDisplayed(), "Ders adı görünmedi");
        Assert.assertTrue(dc.teacherNameInModal.isDisplayed(), "Öğretmen ismi görünmedi");
        Assert.assertTrue(dc.courseDateTimeInModal.isDisplayed(), "Tarih ve saat bilgisi görünmedi");
    }

    @When("Yayınlanmış, başlamış veya bitmiş bir derse tıklar")
    public void yayinlanmisBaslamisVeyaBitmisDerseTiklar() {
        // Yayınlanmış, başlamış veya bitmiş dersi bul ve tıkla
        WebElement activeCourse = findActiveCourse();
        if (activeCourse != null) {
            dc.myClick(activeCourse);
        } else {
            Assert.fail("Aktif ders bulunamadı");
        }
    }

    @Then("Açılır pencerede Information, Topic, Attachments ve Recent Events linkleri görünmeli")
    public void bilgiEkraniLinkleriGorunmeli() {
        wait.until(ExpectedConditions.visibilityOf(dc.informationLink));
        Assert.assertTrue(dc.informationLink.isDisplayed(), "Information linki görünmedi");
        Assert.assertTrue(dc.topicLink.isDisplayed(), "Topic linki görünmedi");
        Assert.assertTrue(dc.attachmentsLink.isDisplayed(), "Attachments linki görünmedi");
        Assert.assertTrue(dc.recentEventsLink.isDisplayed(), "Recent Events linki görünmedi");
    }

    @And("Bu linkler doğru çalışmalı")
    public void linklerDogruCalismali() {
        // Information linkini test et
        dc.myClick(dc.informationLink);
        wait.until(ExpectedConditions.visibilityOf(dc.informationContent));
        Assert.assertTrue(dc.informationContent.isDisplayed(), "Information içeriği görünmedi");

        // Topic linkini test et
        dc.myClick(dc.topicLink);
        wait.until(ExpectedConditions.visibilityOf(dc.topicContent));
        Assert.assertTrue(dc.topicContent.isDisplayed(), "Topic içeriği görünmedi");

        // Attachments linkini test et
        dc.myClick(dc.attachmentsLink);
        wait.until(ExpectedConditions.visibilityOf(dc.attachmentsContent));
        Assert.assertTrue(dc.attachmentsContent.isDisplayed(), "Attachments içeriği görünmedi");

        // Recent Events linkini test et
        dc.myClick(dc.recentEventsLink);
        wait.until(ExpectedConditions.visibilityOf(dc.recentEventsContent));
        Assert.assertTrue(dc.recentEventsContent.isDisplayed(), "Recent Events içeriği görünmedi");
    }

    // Helper methods
    private WebElement findNotStartedCourse() {
        // Henüz başlamamış dersleri bul (status: "Not Started" veya "N")
        List<WebElement> courses = dc.courseList;
        for (WebElement course : courses) {
            String status = course.getAttribute("data-status");
            if ("N".equals(status) || "Not Started".equals(status)) {
                return course;
            }
        }
        return null;
    }

    private WebElement findActiveCourse() {
        // Yayınlanmış, başlamış veya bitmiş dersleri bul (status: "P", "S", "E")
        List<WebElement> courses = dc.courseList;
        for (WebElement course : courses) {
            String status = course.getAttribute("data-status");
            if ("P".equals(status) || "S".equals(status) || "E".equals(status)) {
                return course;
            }
        }
        return null;
    }
} 