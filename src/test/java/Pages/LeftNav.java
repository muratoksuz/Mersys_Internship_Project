package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends ParentPage{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    // TC15
    @FindBy(xpath = "//button[@class='mdc-button mat-mdc-button-base mat-mdc-menu-trigger mat-mdc-button-wrapper mat-mdc-button mat-mdc-button-unchecked mat-unthemed']")
    public WebElement hamburgerMenubutton;

    @FindBy (xpath = "(//button[@mat-menu-item])[2]/span")
    public WebElement financeButton;

    @FindBy (xpath = "(//button[@mat-menu-item])[6]/span")
    public WebElement myFinanceButton;

    // TC15


    public WebElement getWebElement(String strElement)
    {
        switch (strElement)
        {

        }

        return null;
    }


}
