package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class DialogContent extends ParentPage{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }


    @FindBy(xpath="(//user-image)[1]")
    public WebElement profileImage;


    @FindBy(xpath="(//div[@class='mat-mdc-menu-content']//button)[4]")
    public WebElement settingsButton;

    @FindBy(xpath="(//div[@class='mat-mdc-select-arrow-wrapper'])[4]")
    public WebElement openThemesButton;

    @FindBy(xpath = "//div[@role='listbox']//mat-option")
    public List<WebElement> dropDownMenuItems;

    @FindBy(xpath = "//div[@role='listbox']//mat-option")
    public List<WebElement> dropDownMenuItemsControl;


    // tc04--------------

    @FindBy(xpath = "//button[@class='mdc-button mat-mdc-button-base mat-mdc-menu-trigger mat-mdc-button-wrapper mat-mdc-button mat-mdc-button-unchecked mat-unthemed']")
    public WebElement hamburgerMenubutton;

    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messaging;

    @FindBy(xpath = "//div[@id='mat-menu-panel-5']//button[@role='menuitem']//span[@class='mat-mdc-menu-item-text']/span")
    public List<WebElement> MessagingMenuItems;

    @FindBy(xpath = "//span[text()='Send Message']")
    public WebElement sendmessage;

    @FindBy(xpath = "//span[normalize-space()='New Message']")
    public WebElement Messagenewpage;

    //tc04------------------------------

    public WebElement getWebElement(String strElement)
    {
        switch (strElement)
        {
           case "profileImage": return this.profileImage;
           case "settingsButton": return this.settingsButton;
           case "openThemesButton": return this.openThemesButton;

        }
        return null;
    }

    public void verifyMessageContainsText(WebElement element, String searchText){
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.getText().toLowerCase().contains(searchText.toLowerCase()));

    }
}

