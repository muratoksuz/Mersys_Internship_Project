package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class TC_004_Steps {

    DialogContent dc = new DialogContent();
    List<String> actualMenuItems;


    @Given("Navigate to Hamburger Menu")
    public void navigateToHamburgerMenu() {
        dc.myClick(dc.hamburgerMenubutton);
    }

    @When("Click on the Messaging button")
    public void clickOnTheMessagingButton() {
        dc.myClick(dc.messaging);

    }

    @And("Get the Messaging Menu List")
    public void getTheMessagingMenuList() {
        actualMenuItems = new ArrayList<>();
        for (WebElement element : dc.MessagingMenuItems) {
            String text = element.getText().trim();
            if (!text.isEmpty()) {
                actualMenuItems.add(text);
            }
        }

        System.out.println("Alınan Menü Öğeleri: " + actualMenuItems);
    }

    @Then("In The Messaging Menu, User Should See the Following List")
    public void inTheMessagingMenuUserShouldSeeTheFollowingList(io.cucumber.datatable.DataTable dataTable) {
        List<String> expectedItems = dataTable.asList();
        System.out.println("Expected Items: " + expectedItems);


        Assert.assertEquals(expectedItems, actualMenuItems, "Menü öğeleri eşleşmiyor!");
    }

    @And("User clicks on sendMessage in the Messaging Menu")
    public void userClicksOnSendMessageInTheMessagingMenu() {
        dc.myClick(dc.sendmessage);
    }

    @Then("sendMessage page should be displayed")
    public void sendmessagePageShouldBeDisplayed() {
        dc.verifyMessageContainsText(dc.Messagenewpage, "New Message");
        Assert.assertTrue(dc.Messagenewpage.isDisplayed(),"sayfa bulunamadı");
    }
}
