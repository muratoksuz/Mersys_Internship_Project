package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC_014_Steps {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @And("Click on the Profile Picture Logo")
    public void clickOnTheProfilePictureLogo() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.profileLogo));
        dc.profileLogo.click();

    }

    @And("Click on the Upload Picture Button")
    public void clickOnTheUploadPictureButton() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.uploadPictureBtn));
        ((JavascriptExecutor) GWD.getDriver()).executeScript("arguments[0].click();", dc.uploadPictureBtn);

        GWD.wait(10);
    }

    @Then("Click on the Upload Button")
    public void clickOnTheUploadButton() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.uploadBtn));
        dc.uploadBtn.click();
    }

    @And("Click on the Save Button")
    public void clickOnTheSaveButton() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.saveBtn));
        ((JavascriptExecutor) GWD.getDriver()).executeScript("arguments[0].click();", dc.saveBtn);
    }

}
