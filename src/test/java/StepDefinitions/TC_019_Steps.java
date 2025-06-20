package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Random;

public class TC_019_Steps {
    DialogContent dc=new DialogContent();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    Random random=new Random();


    @Given("the student is on the assignments page")
    public void theStudentIsOnTheAssignmentsPage() {
        dc.myClick(dc.assignmentLink);
        wait.until(ExpectedConditions.urlContains("/student-assignment"));
    }

    @When("they click on a random assignment")
    public void theyClickOnARandomAssignment() {
        //Actions actions = new Actions(GWD.getDriver());
     // actions.moveToElement(dc.randomAssingment).build().perform();

    }


    @Then("they should see and be able to click the discussion button")
    public void theyShouldSeeAndBeAbleToClickTheDiscussionButton() {
        dc.wait.until(ExpectedConditions.urlContains("assignment"));
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().contains("assignment"));
        dc.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ms-icon-button[@icon='comments-alt']/button)[1]")));
        dc.scrollToElement(dc.discussionButton);
        dc.jsClick(dc.discussionButton);
    }


    @When("the discussion window opens")
    public void theDiscussionWindowOpens() {
        wait.until(ExpectedConditions.visibilityOf(dc.discussionWindow));

    }
    @Then("they should see and be able to click the chats icon")
    public void theyShouldSeeAndBeAbleToClickTheChatsIcon() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.chatsButton));
        Assert.assertTrue(dc.chatsButton.isDisplayed());
        dc.myClick(dc.chatsButton);
    }



    @And("they should be able to select contact\\(s) to start a discussion")
    public void theyShouldBeAbleToSelectContactSToStartADiscussion() {
        for (int i = 0; i < Math.min(1,dc.listbox.size()); i++) {
            dc.listbox.get(i).click();
        }
    }

    @And("they should be able to attach files")
    public void theyShouldBeAbleToAttachFiles() {
        dc.myClick(dc.paperclip);

    }

    @When("they send a message")
    public void theySendAMessage() {
        dc.myClick(dc.discussionInput);
        String theMessage="Hello";
        dc.discussionButton.sendKeys(theMessage);
        dc.myClick(dc.sendButton);
    }

    @Then("they should see the message text, attached file name \\(if any), and the timestamp in a message stream")
    public void theyShouldSeeTheMessageTextAttachedFileNameIfAnyAndTheTimestampInAMessageStream() {


    }



}
