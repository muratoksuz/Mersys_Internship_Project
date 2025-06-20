package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class TC_018_Steps {


    DialogContent dc = new DialogContent();

    @Given("Verify that the assignment button is visible")
    public void verifyThatTheAssignmentButtonIsVisible() {
        if (dc.assignmentLink.isDisplayed()) {
            System.out.println("Assignment link is visible.");
        } else {
            System.out.println("Assignment link is NOT visible.");
        }
    }
    @When("user hovers over the Assignments link")
    public void userHoversOverTheAssignmentsLink() {
        Actions actions = new Actions(GWD.getDriver());
        actions.moveToElement(dc.assignmentLink).perform();
    }


    @Then("the student should see the total number of assigned tasks")
    public void theStudentShouldSeeTheTotalNumberOfAssignedTasks() {
        for (int i = 0; i < dc.assignmentList.size(); i++) {
            System.out.println("Task " + (i + 1) + ": " + dc.assignmentList.get(i).getText());
        }
        System.out.println("Total number of tasks: " + dc.assignmentList.size());
    }

    @Then("the student clicks the Assignments link")
    public void theStudentClicksTheAssignmentsLink() {
        dc.myClick(dc.assignmentLink);
    }

    @And("the student should see a list of all assigned tasks")
    public void theStudentShouldSeeAListOfAllAssignedTasks() {
       if (dc.assignmentList.size()>0){
           System.out.println("The assignment list is visible. Total:"+dc.assignmentList.size());
       }else{
           System.out.println("The assignment list is empty or not visible. ");
       }

    }





}
