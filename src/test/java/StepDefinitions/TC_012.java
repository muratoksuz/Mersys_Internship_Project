package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;

public class TC_012 {

    DialogContent dc=new DialogContent();
    LeftNav ln=new LeftNav();


    @When("Click on the Hamburger Menu")
    public void clickOnTheHamburgerMenu() {
        dc.wait.until(ExpectedConditions.visibilityOf(ln.hamburgerMenubutton));
        ln.hamburgerMenubutton.click();
    }

    @Then("Click on the Finance")
    public void clickOnTheFinance() {
        dc.wait.until(ExpectedConditions.elementToBeClickable(ln.financeButton));
        ln.financeButton.click();
    }

    @And("Click on the My Finance")
    public void clickOnTheMyFinance() {
        dc.wait.until(ExpectedConditions.visibilityOf(ln.myFinanceButton));
        ln.myFinanceButton.click();
        GWD.wait(5);
    }

    @And("Click on the Kebab Menu")
    public void clickOnTheKebabMenu() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.kebabMenu));
        ((JavascriptExecutor) GWD.getDriver()).executeScript("arguments[0].click();", dc.kebabMenu);
    }

    @And("Click on the Excel Export")
    public void clickOnTheExcelExport() {
        dc.wait.until(ExpectedConditions.visibilityOf(dc.excelExport));
        dc.myClick(dc.excelExport);

    }

    @And("Click on the PDF Export")
    public void clickOnThePDFExport() {
        String originalWindow = GWD.getDriver().getWindowHandle();
        dc.wait.until(ExpectedConditions.elementToBeClickable(dc.pdfExport));
        dc.pdfExport.click();
        dc.wait.until(driver -> driver.getWindowHandles().size() > 1);

        Set<String> allWindows = GWD.getDriver().getWindowHandles();

        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                GWD.getDriver().switchTo().window(windowHandle);
                break;
            }
        }

        Assert.assertNotEquals(GWD.getDriver().getWindowHandle(), originalWindow, "Yeni pencere açılamadı!");

    }

}
