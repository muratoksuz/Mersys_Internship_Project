package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class TC_017_Steps {
    DialogContent dc = new DialogContent();
    WebDriver driver;


    @Given("Navigate to Grading")
    public void navigateToGrading() {
        dc.myClick(dc.gradingButton);
    }

    @When("Click on Course Grade")
    public void clickOnCourseGradeOrStudentsTranscript() {
        dc.myClick(dc.courseGradeButton1);
    }

    @Then("Verify that user should see the Print icon")
    public void verifyThatUserShouldSeeThePrintIcon() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(dc.printIconButton));
        Assert.assertTrue(dc.printIconButton.isDisplayed());

    }
    @Given("Click on the Print icon")
    public void clickOnThePrintIcon() {
        dc.printIconButton.click();
        dc.myWait(5);
    }


    @And("Click on the Download button")
    public void clickOnTheDownloadButton() {
        try {
            Robot robot =new Robot();
            for (int i = 0; i <= 15; i++) {
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                dc.myWait(1);
            }
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            dc.myWait(3);
            for (int i = 0; i <= 2; i++) {
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                dc.myWait(1);
            }
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

    }



}
