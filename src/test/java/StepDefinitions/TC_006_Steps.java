package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class TC_006_Steps {
    DialogContent dc = new DialogContent();
    @Given("The student clicks on Hamburger Menu > Messaging > Outbox click on the move the trash icon")
    public void theStudentClicksOnHamburgerMenuMessagingOutboxClickOnTheMoveTheTrashIcon() {
        dc.myClick(dc.hamburgerMenu);
        dc.myClick(dc.messageButton);
        dc.myClick(dc.outboxButton);
    }

    @When("The student clicks on the trash can icon next to a message and should see a confirm message")
    public void theStudentClicksOnTheTrashCanIconNextToAMessageAndShouldSeeAConfirmMessage() {
        dc.wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//ms-confirm-button[contains(@id,'ms-button')]"),9));
        dc.myClick(dc.outboxIcon);
    }

    @Then("A confirmation popup should be displayed")
    public void aConfirmationPopupShouldBeDisplayed() {
        Assert.assertTrue(dc.confirmAssert.isDisplayed());
        dc.myClick(dc.confirmYes);
    }

    @And("Once the student confirms the deletion, they should receive a “Success” message indicating that the message was successfully deleted.")
    public void afterTheStudentCompletesTheDeletionProcessTheyShouldSeeAConfirmMessage() {
        dc.verifyMessageContainsText(dc.successMessage,"Message successfully moved to trash!");
    }
}