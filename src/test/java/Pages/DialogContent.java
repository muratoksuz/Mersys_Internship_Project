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

    //tc05------------------------------
    @FindBy(xpath = "//button[@class='mdc-icon-button mat-mdc-icon-button mat-mdc-button-base mat-mdc-tooltip-trigger mat-badge mat-badge-secondary mat-secondary mat-badge-above mat-badge-after mat-badge-medium mat-badge-hidden']")
    public WebElement ReceiverButton;

    @FindBy(xpath = "//users-search//input[@class='mat-mdc-input-element mat-mdc-form-field-input-control mdc-text-field__input cdk-text-field-autofill-monitored']")
    public WebElement ReceiverField;

    @FindBy(xpath = "//tr[@_ngcontent-ng-c3768754809='']//td[3]")
    public List<WebElement> Receiverlist;

    @FindBy(xpath = "//tr[@_ngcontent-ng-c3768754809=''][1]//td[@class='mat-mdc-cell mdc-data-table__cell cdk-cell cdk-column-select mat-column-select ng-tns-c3768754809-1 ng-star-inserted']")
    public WebElement Receivercheked;

    @FindBy(xpath = "//span[text()='Add & Close']")
    public WebElement ReceiverAdd;

    @FindBy(xpath = "//input[@class='mat-mdc-input-element mat-mdc-form-field-input-control mdc-text-field__input cdk-text-field-autofill-monitored']")
    public WebElement Subject;

    @FindBy(xpath = "//iframe[@class='tox-edit-area__iframe']")
    public WebElement TextEditorIframe;

    @FindBy(xpath = "//body[@class='mce-content-body ']")
    public WebElement TextEditor;

    @FindBy(xpath = " //span[text()='Insert']")
    public WebElement Insertbutton;

    @FindBy(xpath = "//div[@class='tox-menu tox-collection tox-collection--list tox-selected-menu']//div[@role='menuitem']//div[@class='tox-collection__item-label']")
    public List<WebElement>InsertMenuList ;

    @FindBy(xpath = "//button[@class='mat-mdc-tooltip-trigger mat-badge mat-badge-secondary mat-mdc-button-base mdc-button mat-tonal-button basic mat-badge-above mat-badge-after mat-badge-medium mat-badge-hidden']")
    public WebElement AttachFilesButton;

    @FindBy(xpath = "//button[@class='mat-mdc-menu-item mat-focus-indicator']//span[text()=' From My Files ']")
    public WebElement MyFiles;

    @FindBy(xpath = "//tr[@class='mat-mdc-row mdc-data-table__row cdk-row ng-star-inserted item-draggable'][1]//td[1]")
    public WebElement MyFilesSelect;

    @FindBy(xpath = "//span[@class='ng-star-inserted']")
    public WebElement AttachFilesselect;

    @FindBy(xpath = "//span[text()='Send']")
    public WebElement MessageSendButton;

    @FindBy(xpath = "//span[text()='Outbox']")
    public WebElement Outbox;

    @FindBy(xpath = "//tr[@class='mat-mdc-row mdc-data-table__row cdk-row remove-background ng-tns-c3768754809-1 ng-star-inserted']//td[3]")
    public List<WebElement> OutboxSubjectList;

    //tc05------------------------------------------------------


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


    @FindBy(id = "stripePaymentOption")
    public WebElement stripePaymentOption;

    @FindBy(id = "payButton") // Ödeme yap butonu
    public WebElement payButton;

    @FindBy(id = "successMessage") // Ödeme başarı mesajı
    public WebElement successMessage;

    // Stripe ödeme seçimi için method
    public void selectStripePayment() {
        stripePaymentOption.click();
    }

    // Ödeme yap methodu
    public void makePayment(String amount) {
        WebElement amountInput = GWD.getDriver().findElement(By.id("amountInput"));
        amountInput.clear();
        amountInput.sendKeys(amount);
        payButton.click();
    }

    //TC10

        @FindBy(xpath = "(//ms-icon-button[@icon='file-import']//button)[3]")
    public WebElement firstSubmit;

    @FindBy(xpath = "//*[@title='Rich Text Area']")
    public WebElement textingArea;

    @FindBy(xpath = "//*[@id='tinymce']")
    public WebElement textArea;

    @FindBy(xpath = "//ms-button[@icon='paperclip']")
    public WebElement attachFileButton;

    @FindBy(xpath = "//*[text()=' From My Files ']")
    public WebElement fromMyFIlesButton;

    @FindBy(xpath = "//*[text()='Select']")
    public WebElement selectButton;

    @FindBy(xpath = "//*[text()='Save as Draft']")
    public WebElement saveDButton;

    @FindBy(xpath = "//div[text()='Successfully saved as a draft']")
    public WebElement draftSuccessMessage;

    @FindBy(xpath = "//mat-dialog-actions//*[@icon='file-import']/button")
    public WebElement submitButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    public WebElement yesButton;

    @FindBy(xpath = "//div[text()='Successfully submitted to review']")
    public WebElement submittedToReviewMessage;

    @FindBy(xpath = "//ms-icon-button[@icon='info']")
    public WebElement infoButton;

    @FindBy(xpath = "//span[text()='New Submission']")
    public WebElement newSubmissionButton;

    @FindBy(xpath = "//*[@aria-label='Open calendar']")
    public WebElement openCalenderButton;

    @FindBy(xpath = "//span[text()=' Last year ']")
    public WebElement lastYearButton;

    @FindBy(xpath = "//*[text()='Search']")
    public WebElement searchButton;

    @FindBy(xpath = "//button[@matbadgecolor='accent']")
    public List<WebElement> iconsList;

    @FindBy(xpath = "(//span[text()=' Due Date : '])[1]")
    public WebElement dueText;



    //TC24&TC025
    @FindBy(xpath = "((//tr)[5]//td)[6]")
    public WebElement notStartedCourse;

    @FindBy(xpath = "//mat-toolbar-row")
    public WebElement courseName;

    @FindBy(xpath = "( //user-image)[2]/following-sibling::span")
    public WebElement teacherName;

    @FindBy(xpath = "")
    public WebElement startTime;

    @FindBy(xpath = "")
    public WebElement endTime;

    @FindBy(xpath = "(//button[@mat-ripple-loader-class-name='mat-mdc-button-ripple'])[23]")
    public WebElement closeButton;

    @FindBy(xpath = "((//tr)[2]//td)[2]")
    public WebElement finishedCourse;
    //TC24&TC025





    //TC22 & TC 23
    @FindBy(xpath = "(//button[@matbutton='tonal'])[2]")
    public WebElement searchAssignmentButton;

    @FindBy(xpath = "(//div[@class='mat-mdc-form-field-infix']/mat-select)[1]")
    public WebElement courseListDropA;

    @FindBy(xpath = "//div[@role='listbox']/mat-option")
    public List<WebElement> courseButtonListA;

    @FindBy(xpath = "//div[@role='listbox']/mat-option")
    public WebElement courseButtonElementsA;

    @FindBy(xpath = "(//div[@class='mat-mdc-form-field-infix']/mat-select)[2]")
    public WebElement statusListDropA;

    @FindBy(xpath = "//div[@role='listbox']/mat-option")
    public List<WebElement> statusButtonListA;

    @FindBy(xpath = "//div[@role='listbox']/mat-option")
    public WebElement statusButtonElementsA;

    @FindBy(xpath = "(//div[@class='mat-mdc-form-field-infix']/mat-select)[3]")
    public WebElement semesterListDropA;

    @FindBy(xpath = "//div[@role='listbox']/mat-option")
    public List<WebElement> semesterButtonListA;

    @FindBy(xpath = "//div[@role='listbox']/mat-option")
    public WebElement semesterButtonElementsA;

    @FindBy(xpath = "(//button[@matbutton='tonal'])[1]")
    public WebElement showByButton;

    //TC22 & TC 23

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
           case "notstartedcourse" : return this.notStartedCourse;
           case "courseName" : return this.courseName;
           case "teacherName" : return this.teacherName;
           case "closeButton" : return this.closeButton;
           case "searchAssignmentButton" : return this.searchAssignmentButton;
           case "courseListDropA" : return this.courseListDropA;
           case "courseButtonElementsA" : return this.courseButtonElementsA;
           case "statusListDropA" : return this.statusListDropA;
           case "statusButtonElementsA" : return this.statusButtonElementsA;
           case "semesterListDropA" : return this.semesterListDropA;
           case "semesterButtonElementsA" : return this.semesterButtonElementsA;
           case "showByButton" : return this.showByButton;


        }
        return null;
    }

    public void verifyMessageContainsText(WebElement element, String searchText){
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.getText().toLowerCase().contains(searchText.toLowerCase()),
                "Expected text not found! Actual: " + element.getText());

    }
}

