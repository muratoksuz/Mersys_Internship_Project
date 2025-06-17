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

    //TC09

    @FindBy(xpath = "//button[@title='Toggle menu']")
    private WebElement hamburgerMenu;

    @FindBy(xpath = "//span[text()='Finans']")
    private WebElement financeLink;



    @FindBy(xpath = "//h1[contains(text(),'Finans')]")
    public WebElement finansPageBaslik;

    public void clickFunction(String elementName) {
        if (elementName.equalsIgnoreCase("finans")) {
            myClick(financeLink);
        } else {
            System.out.println("LeftNav'da tanımlı değil: " + elementName);
        }
    }

    //TC09

    //TC010

    @FindBy(xpath = "//button[@id='hamburgerMenu']")
    public WebElement hamburgerMenuButton;

    // Hamburger menü açma methodu
    public void clickHamburgerMenu() {
        hamburgerMenuButton.click();
    }

    // Finans linkine tıklama methodu
    public void clickFinanceLink() {
        financeLink.click();
    }

    //TC010

    public WebElement getWebElement(String strElement)
    {
        switch (strElement)
        {

        }

        return null;
    }


}
