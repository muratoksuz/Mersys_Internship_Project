package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TC_008_Steps {
    DialogContent dc = new DialogContent();
    @Given("Student should be able to click on the Finance from the Hamburger menu")
    public void theStudentShouldBeAbleToClickOnTheFinanceFromTheHamburgerMenu() {
        dc.myClick(dc.hamburgerMenu);
        dc.myClick(dc.financeMenu);
    }
    @Then("Student clicks on Finance in the Hamburger menu, they should be able to access the my finance page")
    public void studentClicksOnFinanceInTheHamburgerMenuTheyShouldBeAbleToAccessTheMyFinancePage() {
        dc.myClick(dc.myfinanceMenu);
    }
}
