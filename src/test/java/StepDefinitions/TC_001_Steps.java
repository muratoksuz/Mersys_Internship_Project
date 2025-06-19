package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class TC_001_Steps {

    DialogContent dc = new DialogContent();

    @Given("Navigate to the website")
    public void navigateToTheWebsite() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter invalid username as {string} and password as {string}")
    public void enterInvalidUsernameAsAndPasswordAs(String invldUsername, String invldPassword) {
        dc.mySendKeys(dc.inputUserName, invldUsername);
        dc.mySendKeys(dc.inputPassword, invldPassword);
    }

    @And("Click on Login button")
    public void clickOnLoginButton() {
        dc.myClick(dc.loginButton);
    }

    @Then("Student should see Invalid username or password message")
    public void studentShouldSeeInvalidUsernameOrPasswordMessage() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.invalidTextClick));
        if (dc.invalidTextClick.getText().contains("Invalid")) {
            dc.wait.until(ExpectedConditions.visibilityOf(dc.invalidText));
            dc.invalidTextClick.click();
            Assert.assertTrue(dc.invalidText.isDisplayed());
        }
    }

    @When("Enter valid username as {string} and password as {string}")
    public void enterValidUsernameAsAndPasswordAs(String username, String password) {
        dc.mySendKeys(dc.inputUserName, username);
        dc.mySendKeys(dc.inputPassword, password);
    }

    @Then("The student should login successfully")
    public void theStudentShouldLoginSuccessfully() {
        dc.wait.until(ExpectedConditions.urlToBe("https://test.mersys.io/user-courses"));
        Assert.assertTrue(dc.welcomeStudentTxt.getText().contains("Welcome"));

    }
}
