package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

public class TC_16_Steps {
    DialogContent dc = new DialogContent();
    @And("Find the Grading Button And Click")
    public void findTheGradingButtonAndClick() {

        if (dc.gradingButton.isDisplayed()){
            System.out.println("Grading link is visible");
        } else {
            System.out.println("Grading link is not visible");
        }
    }

    @And("Observe Course Grade and Reports Button")
    public void observeCourseGradeAndReportsButton() {

        if (dc.courseGradeButtonSearch.size()>0 && dc.reportButtonSearch.size()>0){
            System.out.println("Course Grade and Student Transcript buttons are visible");
        }
    }

    @And("Control the Transcript By Subject List")
    public void controlTheTranscriptBySubjectList() {
        for (int i = 1; i < dc.courseButtonList.size(); i++){
            dc.myClick(dc.courseListDrop);
            dc.myClick(dc.courseButtonList.get(i));
            GWD.wait(2);
        }
    }

    @Then("Click on the Reports Button and Observe Student Transcripts")
    public void clickOnTheReportsButtonAndObserveStudentTranscripts() {
        dc.myClick(dc.reportButton);
        if (dc.studentTranscriptsSearch.size()>0 && dc.studentReportSearch.size()>0){
            System.out.println("Reports and Student Transcripts are visible");
        }
        GWD.wait(2);
        dc.myClick(dc.courseGradeButton);
    }
}
