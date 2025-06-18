package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TC_013 {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @When("Click on the Attendance from the Top Navigation Bar")
    public void clickOnTheAttendanceFromTheTopNavigationBar() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.AttendanceBtn));
        dc.AttendanceBtn.click();
    }

    @And("Click on the Attendance Excuses")
    public void clickOnTheAttendanceExcuses() {
        By waitPopup = By.xpath("//*[contains(text(), 'Please wait')]");
        try {
            dc.wait.until(ExpectedConditions.visibilityOfElementLocated(waitPopup));
            dc.wait.until(ExpectedConditions.invisibilityOfElementLocated(waitPopup));
        } catch (TimeoutException ignored) {
        }

        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.attendanceExcusesBtn));
        dc.attendanceExcusesBtn.click();
    }

    @And("Click on the add button")
    public void clickOnTheAddButton() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.addBtn));
        dc.addBtn.click();
    }

    @And("Write the excuse message")
    public void writeTheExcuseMessage() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.messageArea));
        dc.messageArea.sendKeys("Hasta olduğum için gelemeyeceğim.");

    }

    @And("Upload a file and send")
    public void uploadAFileAndSend() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.fileBtn));
        dc.fileBtn.click();
        dc.fromMyFilesBtn.click();

        try {
            Robot robot = new Robot();
            int number = 9;
            for (int i = 0; i <= number; i++) {
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
                GWD.wait(1);
            }
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        GWD.wait(2);
        dc.selectBtn.click();
        dc.closeBtn.click();
        dc.sendBtn.click();
        dc.sendBtn.click();
    }

    @And("The student should view success message")
    public void theStudentShouldViewSuccessMessage() {
        GWD.wait(2);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.successMessag));
        Assert.assertTrue(dc.successMessag.isDisplayed());
    }
}
