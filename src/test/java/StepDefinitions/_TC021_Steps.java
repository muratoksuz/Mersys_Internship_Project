package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _TC021_Steps {
    WebDriver driver= GWD.getDriver();
    DialogContent dc = new DialogContent();
    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();


    @When("User clicks on the submit button")
    public void userClicksOnTheSubmitButton() {
        //dc.wait.until(ExpectedConditions.urlContains("assignment"));
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
        dc.myClick(dc.firstSubmit);
    }

    @Then("User displays a editor")
    public void userDisplaysAEditor() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.textingArea));
        Assert.assertTrue(dc.textingArea.isDisplayed());
    }

    @And("User sends the text and uploads the file")
    public void userSendsTheTextAndUploadsTheFile() {
        GWD.getDriver().switchTo().frame(0);
        dc.mySendKeys(dc.textArea, "qwerty");
        GWD.getDriver().switchTo().defaultContent();

        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.attachFileButton));
        dc.myClick(dc.attachFileButton);

        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.fromMyFIlesButton));
        dc.myClick(dc.fromMyFIlesButton);
        try {
            Robot robot = new Robot();
            for (int i = 0; i <= 9; i++) {
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                dc.myWait(1);
            }
            robot.keyPress(KeyEvent.VK_SPACE);
            robot.keyRelease(KeyEvent.VK_SPACE);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        dc.myWait(3);
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.selectButton));
        dc.selectButton.click();
        dc.myWait(3);

    }

    @And("User clicks on the save button")
    public void userClicksOnTheSaveButton() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.saveDButton));
        dc.myClick(dc.saveDButton);
        dc.myWait(3);
    }

    @Then("User should see the success message")
    public void userShouldSeeTheSuccessMessage() {
        dc.wait.until(ExpectedConditions.visibilityOfAllElements(dc.draftSuccessMessage));
        Assert.assertTrue(dc.draftSuccessMessage.isDisplayed());
    }

    @When("User clicks on Submit button")
    public void userClicksOnSubmitButton() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.submitButton));
        js.executeScript("arguments[0].click();", dc.submitButton);
    }

    @And("User clicks on the yes button and displays the confirm message")
    public void userClicksOnTheYesButtonAndDisplaysTheConfirmMessage() {
        dc.myWait(3);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.yesButton));
        dc.myClick(dc.yesButton);
        dc.myWait(3);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.submittedToReviewMessage));
        dc.verifyMessageContainsText(dc.submittedToReviewMessage, "submitted to review");
    }

    @Given("The student is on the homework detail page")
    public void theStudentIsOnTheHomeworkDetailPage() {
        dc.myClick(dc.infoButton);
        dc.wait.until(ExpectedConditions.urlContains("info"));

    }

    @When("The student clicks New Submission")
    public void theStudentClicksNewSubmission() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.newSubmissionButton));
        dc.myClick(dc.newSubmissionButton);
    }

    @Then("The text editor should open")
    public void theTextEditorShouldOpen() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.textingArea));
        Assert.assertTrue(dc.textingArea.isDisplayed());
    }


}
