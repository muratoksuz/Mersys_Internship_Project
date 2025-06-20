package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.awt.*;

import static Utilities.GWD.getDriver;

public class TC_022_Steps {
    DialogContent dc = new DialogContent();



    @Given("Search Button Should Be Visible")
    public void searchButtonShouldBeVisible() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.searchButton));
        Assert.assertTrue(dc.searchButton.isDisplayed());
    }

    @And("Search Button Should Be Clickable")
    public void searchButtonShouldBeClickable() {
        dc.myClick(dc.searchButton);
    }

    @Then("Click on Search Button Without Text and List All Assignments")
    public void clickOnSearchButtonWithoutTextAndListAllAssignments() {

    }

    @Given("Filter The Results With Every Option")
    public void filterTheResultsWithEveryOption() {

        dc.myClick(dc.courseListDropA);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.courseButtonElementsA));
        for (int i = 0; i < dc.courseButtonListA.size(); i++) {
            dc.myClick(dc.courseButtonListA.get(i));
            GWD.wait(1);
            if (i == 8) {
                dc.myClick(dc.courseListDropA);
                dc.myClick(dc.courseButtonListA.get(0));
                continue;
            } else {
                dc.myClick(dc.courseListDropA);
            }
        }

        dc.myClick(dc.semesterListDropA);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.semesterButtonElementsA));
        for (int i = dc.semesterButtonListA.size()-1; i >-1 ; i--) {
            dc.myClick(dc.semesterButtonListA.get(i));
            GWD.wait(3);
            if (i == 0) {
                continue;
            } else {
                dc.myClick(dc.semesterListDropA);
            }

        }


        Actions action = new Actions(getDriver());

        dc.myClick(dc.statusListDropA);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.statusButtonElementsA));
        for (int i = 0; i <dc.statusButtonListA.size(); i++) {
            dc.myClick(dc.statusButtonListA.get(i));
            GWD.wait(3);
            if (i == 0) {
                continue;
            } else {
                action.keyDown(Keys.ESCAPE).keyUp(Keys.ESCAPE).perform();
            }
        }




    }

    @And("ShowBy Options Should Be Visible")
    public void showbyOptionsShouldBeVisible() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.showByButton));
        Assert.assertTrue(dc.showByButton.isDisplayed());
    }

    @Then("ShowBy The Results With Every Option")
    public void showbyTheResultsWithEveryOption() {


        dc.myClick(dc.showByButton);
        dc.wait.until(ExpectedConditions.visibilityOf(dc.showByButtonElement));
        for (int i = 0; i < dc.showByButtonList.size(); i++) {
            dc.myClick(dc.showByButtonList.get(i));
            GWD.wait(1);
            if (i == dc.showByButtonList.size()-1) {
                continue;
            } else {
                dc.myClick(dc.showByButton);
            }
        }




    }
}
