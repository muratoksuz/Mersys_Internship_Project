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

    // TC_001,TC_002,TC_003

    @FindBy(xpath="//*[@formcontrolname='username']")
    public WebElement inputUserName;

    @FindBy(xpath="//*[@formcontrolname='password']")
    public WebElement inputPassword;

    @FindBy(xpath="//*[@aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath="//*[contains(text(),'Invalid username or password')]")
    public WebElement invalidTextClick;

    @FindBy(xpath="//*[@class='hot-toast-bar-base-wrapper']")
    public WebElement invalidText;

    @FindBy(xpath="//*[contains(text(),'Welcome, Student')]")
    public WebElement welcomeStudentTxt;

    @FindBy(xpath="//img[contains(@src,'data:image/png')]")
    public WebElement logoTechnoStudy;

    @FindBy(xpath="//*[@page='COURSES']")
    public WebElement CoursesBtn;

    @FindBy(xpath="//*[@page='CALENDAR']")
    public WebElement CalendarBtn;

    @FindBy(xpath="//*[@page='ATTENDANCE']")
    public WebElement AttendanceBtn;

    @FindBy(xpath="//*[@page='ASSIGNMENT']")
    public WebElement AssignmentBtn;

    @FindBy(xpath="//*[@page='GRADING']")
    public WebElement GradingBtn;

    // TC_001,TC_002,TC_003



    //TC_15--------
    @FindBy(xpath="(//user-image)[1]")
    public WebElement profileImage;

    @FindBy(xpath="(//div[@class='mat-mdc-menu-content']//button)[4]")
    public WebElement settingsButton;

    @FindBy(xpath="(//div[@class='mat-mdc-select-arrow-wrapper'])[4]")
    public WebElement openThemesButton;

    @FindBy(xpath = "//div[@role='listbox']//mat-option")
    public List<WebElement> dropDownMenuItems;

    @FindBy(id = "//div[@role='listbox']//mat-option")
    public List<WebElement> dropDownMenuItemsControl;
    //TC_15--------



    //TC16----------
    @FindBy(xpath = "//*[@page='GRADING']")
    public WebElement gradingButton;

    @FindBy(xpath = "//*[text()=' Course Grade ']")
    public List<WebElement> courseGradeButtonSearch;

    @FindBy(id = " mat-tab-group-2-label-0")
    public WebElement courseGradeButton;

    @FindBy(xpath = "//*[text()=' Reports ']")
    public List<WebElement> reportButtonSearch;

    @FindBy(id = "mat-tab-group-2-label-1")
    public WebElement reportButton;


    @FindBy(xpath = "(//div[@class='mat-mdc-form-field-infix']/mat-select)[1]")
    public WebElement courseListDrop;

    @FindBy(xpath = "//div[@aria-labelledby='mat-mdc-form-field-label-0']/mat-option")
    public List<WebElement> courseButtonList;

    @FindBy(xpath = "//*[text()='Student Transcripts']")
    public List<WebElement> studentTranscriptsSearch;

    @FindBy(xpath = "//*[text()='Report Cards']")
    public List<WebElement> studentReportSearch;

    //TC16----------



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
           case "gradingButton": return this.gradingButton;
           case "courseGradeButton": return this.courseGradeButton;
           case "reportButton": return this.reportButton;
           case "courseListDrop": return this.courseListDrop;
           case "inputUserName": return this.inputUserName;
           case "inputPassword": return this.inputPassword;
           case "loginButton": return this.loginButton;

        }
        return null;
    }

    public void verifyMessageContainsText(WebElement element, String searchText){
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.getText().toLowerCase().contains(searchText.toLowerCase()));

    }
}

