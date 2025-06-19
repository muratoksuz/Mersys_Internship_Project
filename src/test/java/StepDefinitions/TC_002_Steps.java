package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.Set;

public class TC_002_Steps {
    DialogContent dc = new DialogContent();
    private String mainWindowHandle;

    @When("The student clicks on the company logo")
    public void theStudentClicksOnTheCompanyLogo() {
        dc.CoursesBtn.click();
        mainWindowHandle = GWD.getDriver().getWindowHandle();
        dc.wait.until(ExpectedConditions.urlToBe("https://test.mersys.io/user-courses"));
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.logoTechnoStudy));
        dc.logoTechnoStudy.click();
    }

    @Then("The Student successfully accesses the website")
    public void theStudentSuccessfullyAccessesTheWebsite() {
        dc.wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> allWindows = GWD.getDriver().getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(mainWindowHandle)) {
                GWD.getDriver().switchTo().window(window);
                break;
            }
        }
        String expectedURL = "https://techno.study/";
        dc.wait.until(ExpectedConditions.urlToBe(expectedURL));

        String currentURL = GWD.getDriver().getCurrentUrl();
        Assert.assertEquals(currentURL, expectedURL, "URL does not match expected value");
    }

    @And("The student switch to the main website")
    public void theStudentNavigateToTheMainWebsite() {
        if (mainWindowHandle != null) {
            GWD.getDriver().switchTo().window(mainWindowHandle);
        }
    }
}