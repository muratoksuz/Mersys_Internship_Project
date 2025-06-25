package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class TC_007_Steps {
    DialogContent dc = new DialogContent();
    @Given("The student navigates to Messaging > Trash and sees deleted messages")
    public void theStudentNavigatesToMessagingTrashAndSeesDeletedMessages() {
        dc.myClick(dc.hamburgerMenu);
        dc.myClick(dc.messageButton);
        dc.myClick(dc.trashBoxButton);
    }
    @And("The student will see restore and delete icons and should be able to click on it")
    public void theStudentWillSeeRestoreAndDeleteIconsAndShouldBeAbleToClickOnIt() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.deleteIcon));
        Assert.assertTrue(dc.deleteIcon.isDisplayed());
        Assert.assertTrue(dc.deleteIcon.isEnabled());

    }
    @When("The student should be able to see and click on restore to retrieve the deleted item from the trash")
    public void theStudentShouldBeAbleToSeeAndClickOnRestoreToRetrieveTheDeletedItemFromTheTrash() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.restoreIcon));
        Assert.assertTrue(dc.restoreIcon.isDisplayed());
        Assert.assertTrue(dc.restoreIcon.isEnabled());

    }
    @And("The student restores a deleted message by clicking the restore icon and gets success confirmation on the screen")
    public void theStudentRestoresADeletedMessageByClickingTheRestoreIconAndGetsSuccessConfirmationOnTheScreen() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.restoreIcon));
        Assert.assertTrue(dc.restoreIcon.isDisplayed());
        Assert.assertTrue(dc.restoreIcon.isEnabled());
        dc.myClick(dc.restoreIcon);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.restoreAndDeleteSuccess));
        Assert.assertTrue(dc.restoreAndDeleteSuccess.isDisplayed());
    }
    @And("The student clicks the delete icon and sees a confirmation popup")
    public void theStudentClicksTheDeleteIconAndSeesAConfirmationPopup() {

        dc.myClick(dc.deleteIcon2);
        Assert.assertTrue(dc.deleteIconYes.isDisplayed());
        dc.myClick(dc.deleteIconYes);
    }

    @Then("The student confirms deletion and sees a Success message")
    public void theStudentConfirmsDeletionAndSeesASuccessMessage() {

        dc.wait.until(ExpectedConditions.visibilityOf(dc.deleteIcon3));
        dc.myClick(dc.deleteIcon3);
        dc.myClick(dc.deleteIconYes);
    }

    @And("The student sees a Success message and verifies")
    public void imamhatiplerkapatilsin() {
        dc.verifyMessageContainsText(dc.successMessages,"successfully");
    }
}

