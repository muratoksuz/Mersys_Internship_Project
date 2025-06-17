package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Utilities.GWD.getDriver;

public class TC_16_Steps {
    DialogContent dc = new DialogContent();
    WebDriverWait waitU = new WebDriverWait(getDriver(), Duration.ofSeconds(20));

    @When("Find the Grading Button And Click")
    public void findTheGradingButtonAndClick() {

        if (dc.gradingButton.isDisplayed()) {
            System.out.println("Grading link is visible");
            dc.myClick(dc.gradingButton);
        } else {
            System.out.println("Grading link is not visible");
        }
    }

    @And("Observe Course Grade and Reports Button")
    public void observeCourseGradeAndReportsButton() {

        waitU.until(ExpectedConditions.visibilityOf(dc.courseGradeButton));
        waitU.until(ExpectedConditions.visibilityOf(dc.reportButton));
        System.out.println(dc.courseGradeButton.getText() + " button is visible");
        System.out.println(dc.reportButton.getText() + " button is visible");
    }

    @And("Control the Transcript By Subject List")
    public void controlTheTranscriptBySubjectList() {
        dc.myClick(dc.courseListDrop);
        waitU.until(ExpectedConditions.visibilityOf(dc.courseButtonElements));
        for (int i = 0; i < dc.courseButtonList.size(); i++) {
            System.out.println("dc = " + dc.courseButtonList.get(i).getText());
            dc.myClick(dc.courseButtonList.get(i));
            GWD.wait(1);
            if (i == 8) {
                continue;
            } else {
                dc.myClick(dc.courseListDrop);
            }
        }
    }

    @Then("Click on the Reports Button and Observe Student Transcripts")
    public void clickOnTheReportsButtonAndObserveStudentTranscripts() {


        dc.myClick(dc.reportButton);
        GWD.wait(2);
        if (dc.studentTranscriptsSearch.size() > 0 && dc.studentReportSearch.size() > 0) {
            System.out.println("Reports and Student Transcripts are visible");
        } else {
            System.out.println("Reports and Student Transcripts are not visible");
        }
        dc.myClick(dc.courseGradeButton);
    }
}
