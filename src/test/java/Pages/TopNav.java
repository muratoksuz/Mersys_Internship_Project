package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TopNav extends ParentPage{

    public TopNav(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//ms-layout-menu-button[@page='COURSES']")
    public WebElement courses;

    @FindBy(xpath = "//ms-layout-menu-button[@page='CALENDAR']")
    public WebElement calender;

    @FindBy(xpath = "//ms-layout-menu-button[@page='ATTENDANCE']")
    public WebElement attendance;

    @FindBy(xpath = "//ms-layout-menu-button[@page='ASSIGNMENT']")
    public WebElement assignment;

    @FindBy(xpath = "//ms-layout-menu-button[@page='GRADING']")
    public WebElement granding;

    @FindBy(xpath = "ms-layout-menu-button")
    public List<WebElement> topNavItems;

    @FindBy(xpath = "(//button[@aria-haspopup='menu']//fa-icon)[1]")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messaging;

    @FindBy(xpath = "//span[text()='Finance']")
    public WebElement finance;

@FindBy(xpath = "//span[text()='My Finance']")
    public WebElement myfinance;

    @FindBy(xpath = "//*[text()='Outbox']")
    public WebElement outBox;

    @FindBy(xpath = "//*[text()='Send Message']")
    public WebElement sendMessage;

    @FindBy(xpath = "//*[text()='Inbox']")
    public WebElement inBox;

    @FindBy(xpath = "//*[text()='Trash']")
    public WebElement trash;




    public WebElement getWebElement(String strElement)
    {
        switch (strElement.toLowerCase())
        {
            case "courses" : return this.courses;
            case "calender" : return this.calender;
            case "attendance" : return this.attendance;
            case "assignment" : return this.assignment;
            case "granding" : return this.granding;
            case "hamburgermenu" : return this.hamburgerMenu;
            case "messaging" : return this.messaging;
            case "outbox" : return this.outBox;
            case "sendmessage" : return this.sendMessage;
            case "inbox" : return this.inBox;
            case "trash" : return this.trash;
            case "finance" : return this.finance;
            case "myfinance" : return this.myfinance;
        }

        return null;
    }
}
