package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class DialogContent extends ParentPage{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
        this.wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
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

    @FindBy(xpath = "//div[@role='listbox']//mat-option")
    public List<WebElement> dropDownMenuItemsControl;
    //TC_15--------



    //TC16----------
    @FindBy(xpath = "//*[@page='GRADING']")
    public WebElement gradingButton;

    @FindBy(id = "mat-tab-group-0-label-0")
    public WebElement courseGradeButton;

    @FindBy(id = "mat-tab-group-0-label-1")
    public WebElement reportButton;


    @FindBy(xpath = "(//div[@class='mat-mdc-form-field-infix']/mat-select)[1]")
    public WebElement courseListDrop;

    @FindBy(xpath = "//div[@id='mat-select-0-panel']/mat-option")
    public List<WebElement> courseButtonList;

    @FindBy(xpath = "//div[@id='mat-select-0-panel']/mat-option")
    public WebElement courseButtonElements;

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

    // TC15

    @FindBy (xpath = "(//*[@aria-haspopup='menu'])[5]//fa-icon")
    public WebElement kebabMenu;

    @FindBy (xpath = "(//*[@class='mat-mdc-menu-item-text'])[1]")
    public WebElement excelExport;

    @FindBy (xpath = "(//*[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement pdfExport;

    // TC15

    //TC009

    @FindBy(xpath = "//tr[td[text()='Öğrenci Adı']]")
    public WebElement ogrenciAdiSatiri;

    @FindBy(xpath = "//h1[contains(text(),'Ödeme Detayları')]")
    public WebElement odemeDetaylariSayfasiElementi;

    @FindBy(xpath = "//button[contains(text(),'Fee/Balance Detail')]")
    public WebElement feeBalanceDetailButton;

    @FindBy(xpath = "//h1[contains(text(),'Detay Sayfası Başlığı')]")
    public WebElement detaySayfasiElementi;

    @FindBy(xpath = "//table[@id='taksitlendirmeTablosu']")
    public WebElement taksitlendirmeTablosuElementi;

    //TC009

    //TC10

    @FindBy(id = "onlinePaymentBtn")
    public WebElement onlinePaymentButton;


    @FindBy(xpath = "//button[contains(text(),'Stripe')]")
    public WebElement stripePaymentOption;

    @FindBy(xpath = "//button[@id='payButton']") // Ödeme yap butonu
    public WebElement payButton;

    @FindBy(xpath = "//div[contains(@class,'toast') and contains(text(),'Payment successful')]") // Ödeme başarı mesajı
    public WebElement successMessage;


    //TC10

    //TC011

    @FindBy(xpath = "//input[@id='amountInput']")
    public WebElement amountInput;

    // Stripe seçimi
    public void selectStripePayment() {
        stripePaymentOption.click();
    }

    // Ödeme işlemi
    public void makePayment(String amount) {
        amountInput.clear();
        amountInput.sendKeys(amount);
        payButton.click();
    }

    //TC011
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
           case "courseButtonElements": return this.courseButtonElements;

        }
        return null;
    }

    public void verifyMessageContainsText(WebElement element, String searchText){
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.getText().toLowerCase().contains(searchText.toLowerCase()),
                "Expected text not found! Actual: " + element.getText());

    }
}

