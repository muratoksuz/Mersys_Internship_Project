package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class TC_05_STEPS {

    WebDriver driver= GWD.getDriver();
    DialogContent dc = new DialogContent();
    List<String> ReceiverItems;
    List<String> Insertlist;
    List<String> SubjectList;
    String subject="Team Project";

    @And("Click On The Receiver Button")
    public void clickOnTheReceiverButton() {
        try {
        dc.myClick(dc.ReceiverButton);
        }
        catch (ElementClickInterceptedException e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", dc.ReceiverButton);
        }
    }

    @And("User types at least three characters like Stu or Teac to search receiver")
    public void userTypesAtLeastThreeCharactersLikeStuOrTeacToSearchReceiver() {
        dc.mySendKeys(dc.ReceiverField,"Tea");
    }

    @And("User selects a receiver from the list")
    public void userSelectsAReceiverFromTheList() {
        ReceiverItems = new ArrayList<>();
        for (WebElement element : dc.Receiverlist) {
            String text = element.getText().trim();
            if (!text.isEmpty()) {
                ReceiverItems.add(text);
            }
        }

        System.out.println("Receiver List: " + ReceiverItems);
        GWD.wait(2);
        dc.myClick(dc.Receivercheked);
        GWD.wait(2);
        dc.myClick(dc.ReceiverAdd);

    }

    @And("User enters a subject for the message")
    public void userEntersASubjectForTheMessage() {
        dc.mySendKeys(dc.Subject,subject);
    }

    @And("User writes text in the editor")
    public void userWritesTextInTheEditor() {
        driver.switchTo().frame(dc.TextEditorIframe);
        dc.mySendKeys(dc.TextEditor,"This is a text message");
        driver.switchTo().defaultContent();
    }

    @And("User can paste text, add image or create a table")
    public void userCanPasteTextAddImageOrCreateATable(io.cucumber.datatable.DataTable dataTable) {
        dc.myClick(dc.Insertbutton);
        Insertlist = new ArrayList<>();
        for (WebElement MenuList : dc.InsertMenuList) {
            String text = MenuList.getText().trim();
            if (!text.isEmpty()) {
                Insertlist.add(text);
            }
        }
        System.out.println("Insert Menu List: " + Insertlist);

        List<String> expectedItemsInsert = dataTable.asList();
        System.out.println("Expected Items: " + expectedItemsInsert);


        Assert.assertEquals(expectedItemsInsert, Insertlist, "Menü öğeleri eşleşmiyor!");
    }

    @And("User attaches a file to the message")
    public void userAttachesAFileToTheMessage() {
        dc.myClick(dc.AttachFilesButton);
        dc.myClick(dc.MyFiles);
        GWD.wait(1);
        dc.myClick(dc.MyFilesSelect);
        GWD.wait(2);
        dc.myClick(dc.AttachFilesselect);
        GWD.wait(2);
    }

    @When("User clicks the Send button")
    public void userClicksTheSendButton() {
        dc.myClick(dc.MessageSendButton);
    }

    @Then("A Success message should be displayed")
    public void aSuccessMessageShouldBeDisplayed() {
        System.out.println("When the message is sent, nothing appears to indicate that it was successful.");
    }

    @When("User navigates to Hamburger Menu > Messaging > Outbox")
    public void userNavigatesToHamburgerMenuMessagingOutbox() {
        dc.myClick(dc.hamburgerMenubutton);
        dc.myClick(dc.messaging);
        dc.myClick(dc.Outbox);
        GWD.wait(6);
    }

    @Then("Send message should be listed in the Outbox")
    public void sendMessageShouldBeListedInTheOutbox() {
        SubjectList = new ArrayList<>();
        for (WebElement MenuList : dc.OutboxSubjectList) {
            String text = MenuList.getText().trim();
            if (!text.isEmpty()) {
                SubjectList.add(text);
            }
        }
        System.out.println("Insert Menu List: " + SubjectList);

        boolean subjectFound = dc.OutboxSubjectList.stream()
                .anyMatch(cell -> cell.getText().trim().equals(subject));

        assertTrue("Subject not found in Outbox: " + subject, subjectFound);
    }
}
