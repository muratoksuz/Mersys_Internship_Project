package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class _TC020_Steps {
    TopNav tn = new TopNav(GWD.getDriver());
    DialogContent dc = new DialogContent();
    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();

    @And("User clicks on the element in TopNav")
    public void userClicksOnTheElementInTopNav(DataTable linkler) {
        List<String> listLinkler = linkler.asList();
        for (int i = 0; i < listLinkler.size(); i++) {
            tn.myClick(tn.getWebElement(listLinkler.get(i)));
        }

    }


    @And("User select the date")
    public void userSelectTheDate() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.openCalenderButton)).click();
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.lastYearButton)).click();
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();

        js.executeScript("arguments[0].scrollIntoView(true);", dc.searchButton);
        js.executeScript("arguments[0].click();", dc.searchButton);
        js.executeScript("arguments[0].click();", dc.openCalenderButton);
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();


    }

    @Then("The Information, Submit, and Mark it icons work")
    public void theInformationSubmitAndMarkItIconsWork() {
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
        for (int i = 0; i < dc.iconsList.size(); i++) {
            Assert.assertTrue(dc.iconsList.get(i).isDisplayed());
        }
    }


    @And("User clicks outside of the icons area")
    public void userClicksOutsideOfTheIconsArea() {
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
        js.executeScript("arguments[0].click();", dc.dueText);
    }

    @Then("User navigates to the information page")
    public void userNavigatesToTheInformationPage() {
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
        dc.wait.until(ExpectedConditions.visibilityOf(dc.newSubmissionButton));
        Assert.assertTrue(dc.newSubmissionButton.isDisplayed());
        Assert.assertTrue(dc.newSubmissionButton.isEnabled());
    }


}
