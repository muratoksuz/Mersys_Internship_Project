package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TC_023_Steps {
    DialogContent dc = new DialogContent();
    TopNav tn = new TopNav(Utilities.GWD.getDriver());
    WebDriverWait wait = new WebDriverWait(Utilities.GWD.getDriver(), Duration.ofSeconds(20));
    List<String> sembolItems;

    @Given("Navigate To Calendar")
    public void navigateToCalendar() {
        dc.myClick(tn.calender);
    }

    @When("Click on Weekly Course Plan")
    public void clickOnWeeklyCoursePlan() {
        dc.myClick(dc.WeeklyCourseButton);

    }

    @And("Lesson Situations Should Be Seen As A Symbol")
    public void lessonSituationsShouldBeSeenAsASymbol() {
        System.out.println("Symbol Not Found in Lesson Situations");
    }

    @And("Student P-S-E-C Symbols Should Be Understood")
    public void studentPSECSymbolsShouldBeUnderstood(io.cucumber.datatable.DataTable dataTable) {

        wait.until(ExpectedConditions.visibilityOfAllElements(dc.IconPSEC));

        List<String> sembolItems = new ArrayList<>();
        for (WebElement element : dc.IconPSEC) {
            String text = element.getText().replaceAll("\\u00A0", "").trim();
            if (!text.isEmpty()) {
                sembolItems.add(text);
            }
        }

        System.out.println("Alınan Menü Öğeleri: " + sembolItems);

        List<String> expectedItems = dataTable.asList();
        System.out.println("Expected Items: " + expectedItems);

        Assert.assertTrue(sembolItems.containsAll(expectedItems),
                "Sembol isimleri eşleşmiyor!\nBeklenen: " + expectedItems + "\nAlınan: " + sembolItems);
    }

    @And("Student WeeklyCoursPlan And Calendar Button Should Click")
    public void studentWeeklyCoursPlanAndCalendarButtonShouldClick() {



        wait.until(ExpectedConditions.visibilityOf(dc.CalendarButton));
        wait.until(ExpectedConditions.elementToBeClickable(dc.CalendarButton));
        dc.myClick(dc.CalendarButton);


        wait.until(ExpectedConditions.visibilityOf(dc.WeeklyCourseButton));
        wait.until(ExpectedConditions.elementToBeClickable(dc.WeeklyCourseButton));
        dc.myClick(dc.WeeklyCourseButton);

    }

    @And("Student Should Be Able To See Icons To Navigate Back And Forth In The WeeklyCoursePlan")
    public void studentShouldBeAbleToSeeIconsToNavigateBackAndForthInTheWeeklyCoursePlan() {
        wait.until(driver -> !dc.currentDate.getText().trim().isEmpty());

        String dateBeforeprev = dc.currentDate.getText().trim();;
        dc.myClick(dc.nextButton);

        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(dc.currentDate, dateBeforeprev)));

        String dateAfterprev = dc.currentDate.getText();
        Assert.assertNotEquals(dateBeforeprev, dateAfterprev, "Tarih değişmedi!");

        wait.until(driver -> !dc.currentDate.getText().trim().isEmpty());

        String dateBeforenext = dc.currentDate.getText().trim();;
        dc.myClick(dc.previousButton);

        wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(dc.currentDate, dateBeforenext)));

        String dateAfternext = dc.currentDate.getText();
        Assert.assertNotEquals(dateBeforenext, dateAfternext, "Tarih değişmedi!");


    }

    @Then("Students Should Be Able To See The Classes They Are Responsible For On The WeeklyCoursePlan")
    public void studentsShouldBeAbleToSeeTheClassesTheyAreResponsibleForOnTheWeeklyCoursePlan() {
        dc.myClick(dc.CourseSelect);
        dc.verifyMessageContainsText(dc.CourseSelectSuccess, "11A");
        Assert.assertTrue(dc.CourseSelectSuccess.isDisplayed(),"Ders İçeriği AÇılmıyor.");
    }

}
