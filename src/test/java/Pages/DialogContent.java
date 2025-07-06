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

    // TC_001_Steps,TC_002_Steps,TC_003

    @FindBy(xpath="//*[@formcontrolname='username']")
    public WebElement inputUserName;

    @FindBy(xpath="//*[@formcontrolname='password']")
    public WebElement inputPassword;

    @FindBy(xpath="//*[@aria-label='LOGIN']")
    public WebElement loginButton;


    @FindBy(xpath = "//*[contains(text(),'Invalid username or password')]")
    public WebElement invalidTextClick;

    @FindBy(xpath = "//*[@class='hot-toast-bar-base-wrapper']")
    public WebElement invalidText;

    @FindBy(xpath = "//img[contains(@src,'data:image/png')]")
    public WebElement logoTechnoStudy;

    @FindBy(xpath = "//*[@page='COURSES']/button")
    public WebElement courses;

    @FindBy(xpath = "//*[@page='CALENDAR']")
    public WebElement calendar;

    @FindBy(xpath = "//*[@page='ATTENDANCE']")
    public WebElement attendance;

    @FindBy(xpath = "//*[@page='ASSIGNMENT']")
    public WebElement assignments;

    @FindBy(xpath = "//*[@page='GRADING']")
    public WebElement grading;

    // alternatif --- //user-announcement-bell//button
    @FindBy(xpath = "//user-announcement-bell//span[@class='mat-focus-indicator']")
    public WebElement announcements;

    // alternatif --- //user-message-bell//button
    @FindBy(xpath = "//user-message-bell//span[@class='mat-focus-indicator']")
    public WebElement messages;


    // HAMBURGER MENU VE İÇİNDEKİLER ****

    @FindBy(xpath = "(//button[@mat-menu-item])[2]/span")
    public WebElement finance;

    @FindBy(xpath = "(//button[@mat-menu-item])[3]")
    public WebElement attendanceHMenu;

    @FindBy(xpath = "(//button[@mat-menu-item])[4]")
    public WebElement videoConference;

    @FindBy(xpath = "(//button[@mat-menu-item])[5]")
    public WebElement surveys;



    @FindBy(xpath = "//*[text()=' New Message ']")
    public WebElement sendMessageTxt;

    @FindBy(xpath = "//*[text()=' Inbox ']")
    public WebElement inboxTxt;

    @FindBy(xpath = "//*[text()=' Outbox ']")
    public WebElement outboxTxt;

    @FindBy(xpath = "//*[text()=' Trash ']")
    public WebElement trashTxt;

    @FindBy(xpath = "//*[text()=' Students Fees ']")
    public WebElement studentFeeTxt;

    @FindBy(xpath = "//*[text()=' Attendance Excuses ']")
    public WebElement attendanceExcusesTxt;

    @FindBy(xpath = "//*[text()=' My Surveys ']")
    public WebElement mySurveysTxt;

    @FindBy(xpath = "//*[text()=' Video Meetings ']")
    public WebElement videoMeetingTxt;



    @FindBy(xpath = "//*[text()='Send Message']")
    public WebElement sendMessage;

    @FindBy(xpath = "//*[text()='Inbox']")
    public WebElement inbox;

    @FindBy(xpath = "//*[text()='Outbox']")
    public WebElement outbox;

    @FindBy(xpath = "//*[text()='Trash']")
    public WebElement trash;


    @FindBy(xpath = "//*[text()='My Finance']")
    public WebElement myFinanceInHMenu;

    @FindBy(xpath = "//*[text()='Attendance Excuses (Parents)']")
    public WebElement attendanceExcuses;

    @FindBy(xpath = "//*[text()='Video Meetings']")
    public WebElement videoMeetingsInHMenu;

    @FindBy(xpath = "//*[text()='My Surveys']")
    public WebElement mySurveysInHMenu;


    // HAMBURGER MENU VE İÇİNDEKİLER ****


    // PROFİL BUTONU VE İÇİNDEKİLER

    @FindBy(xpath = "//div[2]/button/span[2]/div")
    public WebElement profileBtn;

    @FindBy(xpath = "//*[contains(text(),'My Certificates')]")
    public WebElement myCertificatesBtn;

    @FindBy(xpath = "//*[contains(text(),'Search')]")
    public WebElement searchBtnInC;

    @FindBy(xpath = "//*[text()='My Files']")
    public WebElement myFilesBtn;

    @FindBy(xpath = "//*[text()='My Drive']")
    public WebElement myDriveTxt;

    @FindBy(xpath = "//*[@aria-label='Close dialog']")
    public WebElement closeBtnInMyFiles;

    @FindBy(xpath = "//*[text()='Change Password']")
    public WebElement changePasswordBtn;

    @FindBy(xpath = "//*[text()=' Change Password']")
    public WebElement changePasswordBtnTxt;

    @FindBy(xpath = "//*[@aria-label='Close dialog']")
    public WebElement changePasswordCloseBtn;

    @FindBy(xpath = "//*[text()='Settings']")
    public WebElement settingsBtn;

    @FindBy(xpath = "//*[text()=' Settings']")
    public WebElement settingsText;

    @FindBy(xpath = "//*[@aria-label='Close dialog']")
    public WebElement closeSettingsBtn;

    // PROFİL BUTONU VE İÇİNDEKİLER


    //  Text visible

    @FindBy(xpath = "//mat-tab-header//div[@role='tab'][@aria-posinset='1']")
    public WebElement weeklyCoursePlan;

    @FindBy(xpath = "//*[text()=' Attendance ']")
    public WebElement attendanceTxt;

    @FindBy(xpath = "//span[contains(@style,'font') and contains(text(),'Assignments')]")
    public WebElement assignmentsText;

    @FindBy(xpath = "//span[text()=' Announcements']")
    public WebElement announcementsTextVisible;

    @FindBy(xpath = "//*[text()=' Messages']")
    public WebElement messagesTxtVisible;

    @FindBy(xpath = "//*[contains(text(),'Welcome, Student')]")
    public WebElement welcomeStudentTxt;

    @FindBy(xpath = "//span[text()=' Course Grade ']")
    public WebElement courseGradeText;


    //  Text visible


    @FindBy(xpath="//*[@page='COURSES']")
    public WebElement CoursesBtn;


    @FindBy(xpath="//*[@page='ATTENDANCE']")
    public WebElement AttendanceBtn;



    // TC_001_Steps,TC_002_Steps,TC_003



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
    public WebElement studentTranscriptsSearch;

    @FindBy(xpath = "//*[text()='Report Cards']")
    public WebElement studentReportSearch;

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


    // TC12

    @FindBy (xpath = "(//*[@aria-haspopup='menu'])[5]//fa-icon")
    public WebElement kebabMenu;

    @FindBy (xpath = "(//*[@class='mat-mdc-menu-item-text'])[1]")
    public WebElement excelExport;

    @FindBy (xpath = "(//*[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement pdfExport;

    // TC12

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

    // TC13

    @FindBy (xpath = "(//div[ contains(@class, 'mdc-tab mat-mdc-tab') ])[3]")
    public WebElement attendanceExcusesBtn;

    @FindBy (xpath = "//*[@tooltip='ATTENDANCE_EXCUSE.TITLE.ADD']")
    public WebElement addBtn;

    @FindBy (xpath = "//textarea[@placeholder='Message']")
    public WebElement messageArea;

    @FindBy (xpath = "(//button[@matbadgecolor='secondary'])[2]")
    public WebElement fileBtn;

    @FindBy (xpath = "(//*[@class='mat-mdc-menu-content']/button)[2]")
    public WebElement fromMyFilesBtn;

    @FindBy (xpath = "(//*[@aria-label='Close dialog'])[2]")
    public WebElement closeBtn;

    @FindBy (xpath = "//*[@caption='GENERAL.BUTTON.SELECT']")
    public WebElement selectBtn;

    @FindBy (xpath = "//*[@caption='GENERAL.BUTTON.SEND']")
    public WebElement sendBtn;

    @FindBy(xpath = "//*[contains(text(), 'Successfully')]")
    public WebElement successMessag;

    // TC13

    // TC14

    @FindBy (xpath = "//*[@class='user-info']")
    public WebElement profileLogo;

    @FindBy (xpath = "//button[contains(@class, 'mdc-fab--mini mat-mdc-mini-fab ')]")
    public WebElement uploadPictureBtn;

    @FindBy (xpath = "(//*[@matbutton='tonal'])[2]")
    public WebElement uploadBtn;

    @FindBy (xpath = "//button[ contains(@class, ' mat-tonal-button primary ') ]/span")
    public WebElement saveBtn;

    // TC14


    // TC17

    @FindBy(xpath = "//*[text()=' Course Grade ']")
    public WebElement courseGradeButton1;

    @FindBy(xpath = "//ms-standard-button[@tooltip='GENERAL.BUTTON.DOWNLOAD']")
    public WebElement printIconButton;

    //TC18

    @FindBy (xpath = "//*[@page='ASSIGNMENT']")
    public WebElement assignmentLink;

    @FindBy(xpath = "//*[@class='mat-drawer-content']")
    public List<WebElement>assignmentList;



    @FindBy(css = "(//ms-icon-button[@icon='comments-alt']/button)[1]")
    public WebElement discussionButton;

    @FindBy(xpath = "//ms-icon-button[@icon='comments-alt']/button")
    public List<WebElement> discussionBtn;

    @FindBy(xpath = "//*[@id='mat-mdc-dialog-2']")
    public WebElement discussionWindow;

    @FindBy(xpath = "//*[@id='ms-standard-button-5']")
    public WebElement contactsButton;

    @FindBy(xpath = "//*[@id='ms-standard-button-7']")
    public WebElement chatsButton;

    @FindBy(xpath = "(//ms-icon-button[@icon='paperclip'])[2]")
    public WebElement paperclip;

    @FindBy(xpath = "(//*[@class='mat-mdc-selection-list mat-mdc-list-base mdc-list ng-tns-c1704585323-5' ])[2]")
    public List<WebElement>listbox;

    @FindBy(xpath="//*[@id='mat-input-25']")
    public WebElement discussionInput;

    @FindBy(xpath = "//button[.//svg[contains(@data-icon, 'paper-plane')]]")
    public WebElement sendButton;

    @FindBy(xpath = "//ms-icon-button[@icon='comments-alt']/button")
    public List<WebElement>IconsList;

    @FindBy(xpath = "(//span[text()=' Due Date : '])[1]")
    public WebElement dueText1;

    //TC22 & TC 23
    @FindBy(xpath = "(//button[@matbutton='tonal'])[2]")
    public WebElement searchAssignmentButton;

    @FindBy(xpath = "(//div[@class='mat-mdc-select-arrow-wrapper'])[1]")
    public WebElement courseListDropA;

    @FindBy(xpath = "//div[@role='listbox']/mat-option")
    public List<WebElement> courseButtonListA;

    @FindBy(xpath = "//div[@role='listbox']/mat-option")
    public WebElement courseButtonElementsA;

    @FindBy(xpath = "(//div[@class='mat-mdc-select-arrow-wrapper'])[2]")
    public WebElement statusListDropA;

    @FindBy(xpath = "//div[@role='listbox']/mat-option")
    public List<WebElement> statusButtonListA;

    @FindBy(xpath = "//div[@role='listbox']/mat-option")
    public WebElement statusButtonElementsA;

    @FindBy(xpath = "(//div[@class='mat-mdc-select-arrow-wrapper'])[3]")
    public WebElement semesterListDropA;

    @FindBy(xpath = "//div[@role='listbox']/mat-option")
    public List<WebElement> semesterButtonListA;

    @FindBy(xpath = "//div[@role='listbox']/mat-option")
    public WebElement semesterButtonElementsA;

    @FindBy(xpath = "(//button[@aria-haspopup='menu'])[4]")
    public WebElement showByButton;

    @FindBy(xpath = "//div[@class='mat-mdc-menu-content']//button")
    public List<WebElement> showByButtonList;

    @FindBy(xpath = "(//button[@aria-haspopup='menu'])[4]")
    public WebElement showByButtonElement;

    @FindBy(xpath = "//ms-icon-button[@icon='info']")
    public List<WebElement> assignmentDialogList;

    @FindBy(xpath = "//div[@class='assignment']")
    public WebElement assignmentDialogListElements;

    //TC22 & TC 23


    //TC_23
    @FindBy(xpath = "//span[@class='mdc-tab__content']//span[text()=' Weekly Course Plan ']")
    public WebElement WeeklyCourseButton;

    @FindBy(xpath = "//span[@class='mdc-tab__content']//span[text()=' Calendar ']")
    public WebElement CalendarButton;

    @FindBy(xpath = "//span[contains(text(),'Published') or contains(text(),'Started') or contains(text(),'Ended') or contains(text(),'Cancelled')]")
    public List<WebElement> IconPSEC;

    @FindBy(xpath = "//div[@_ngcontent-ng-c1425957329='']//button[1]")
    public WebElement previousButton;

    @FindBy(xpath = "//div[@_ngcontent-ng-c1425957329='']//button[3]")
    public WebElement nextButton;

    @FindBy(xpath = "//strong[@_ngcontent-ng-c1425957329='']")
    public WebElement currentDate;

    @FindBy(xpath = "//tr[@class='row100'][2]//td[3]")
    public WebElement CourseSelect;

    @FindBy(xpath = "//course-details-dialog[@class='mat-mdc-dialog-component-host']//span[contains(text(),' Course Meeting')]")
    public WebElement CourseSelectSuccess;


    //TC-23


    // TC06 - TC07 - TC08
    @FindBy(xpath="(//button[@aria-haspopup='menu']//fa-icon)[1]")
    public WebElement hamburgerMenu;

    @FindBy(xpath="//span[text()='Messaging']")
    public WebElement messageButton;

    @FindBy(xpath="//span[text()='Outbox']")
    public WebElement outboxButton;

    @FindBy(xpath="//ms-confirm-button[contains(@id,'ms-button')]")
    public WebElement outboxIcon;

    @FindBy(xpath="//ms-confirm-button[@id='ms-button-2']")
    public WebElement outboxIcon3;

    @FindBy(xpath="//*[text()='Confirm']")
    public WebElement confirmAssert;

    @FindBy(xpath="//button[@class='mdc-button mat-mdc-button-base secondary mat-tonal-button mat-unthemed']")
    public WebElement confirmYes;

    @FindBy(xpath="//span[text()='Trash']")
    public WebElement trashBoxButton;

    @FindBy(xpath="//ms-standard-button[@id='ms-standard-button-2']")
    public WebElement restoreIcon;

    @FindBy(xpath="//ms-delete-button[@id='ms-delete-button-0']")
    public WebElement deleteIcon;

    @FindBy(xpath="//ms-delete-button[@id='ms-delete-button-2']")
    public WebElement deleteIcon2;

    @FindBy(xpath="//ms-delete-button[@id='ms-delete-button-4']")
    public WebElement deleteIcon3;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement deleteIconYes;

    @FindBy(xpath="//mat-panel-description[@class='mat-expansion-panel-header-description ng-star-inserted']/div")
    public WebElement restoreAndDeleteSuccess;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessages;

    @FindBy(xpath="//span[text()='Finance']")
    public WebElement financeMenu;

    @FindBy(xpath="//span[text()='My Finance']")
    public WebElement myfinanceMenu;

    @FindBy(xpath="//input[@placeholder='Kullanıcı Adı']")
    public WebElement username;

    @FindBy(xpath="//input[@placeholder='Parola']")
    public WebElement password;



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
           case "showByButtonElement" : return this.showByButtonElement;
           case "assignmentDialogListElements" : return this.assignmentDialogListElements;
           case "studentTranscriptsSearch" : return this.studentTranscriptsSearch;
           case "studentReportSearch" : return this.studentReportSearch;


        }
        return null;
    }


    public WebElement getTopMenu(String topMenu) {
        switch (topMenu.toLowerCase()) {

            case "courses":
                return this.courses;
            case "calendar":
                return this.calendar;
            case "attendance":
                return this.attendance;
            case "assignments":
                return this.assignments;
            case "grading":
                return this.grading;
            case "announcements":
                return this.announcements;
            case "messages":
                return this.messages;
        }
        return null;
    }

    public WebElement getVisibleElement(String elements) {
        switch (elements) {
            case "welcomeStudentTxt":
                return this.welcomeStudentTxt;
            case "weeklyCoursePlan":
                return this.weeklyCoursePlan;
            case "attendanceTxt":
                return this.attendanceTxt;
            case "assignmentsText":
                return this.assignmentsText;
            case "courseGradeText":
                return this.courseGradeText;
            case "announcementsTextVisible":
                return this.announcementsTextVisible;
            case "messagesTxtVisible":
                return this.messagesTxtVisible;
        }
        return null;
    }

    public WebElement getSectionElement(String sectionName) {
        switch (sectionName) {
            case "messaging":
                return this.messaging;
            case "finance":
                return this.finance;
            case "attendanceHMenu":
                return this.attendanceHMenu;
            case "videoConference":
                return this.videoConference;
            case "surveys":
                return this.surveys;

        }
        return null;
    }

    public WebElement getSingleSubMenuElement(String subMenus) {
        switch (subMenus) {
            case "myFinanceInHMenu":
                return this.myFinanceInHMenu;
            case "attendanceExcuses":
                return this.attendanceExcuses;
            case "videoMeetingsInHMenu":
                return this.videoMeetingsInHMenu;
            case "mySurveysInHMenu":
                return this.mySurveysInHMenu;
        }
        return null;
    }

    public WebElement getMessagingSubMenu(String subMenus) {
        switch (subMenus) {
            case "sendMessage":
                return this.sendMessage;
            case "inbox":
                return this.inbox;
            case "outbox":
                return this.outbox;
            case "trash":
                return this.trash;
        }
        return null;
    }


    // DialogContent sınıfına eklenecek metod
    public String getSubMenuName(String sectionName) {
        switch (sectionName) {
            case "finance":
                return "myFinanceInHMenu";
            case "attendanceHMenu":
                return "attendanceExcuses";
            case "videoConference":
                return "videoMeetingsInHMenu";
            case "surveys":
                return "mySurveysInHMenu";
            default:
                return null;
        }
    }


    public WebElement getProfileSectionElement(String sectionName) {
        switch (sectionName) {
            case "My Certificates":
                return myCertificatesBtn;
            case "My Files":
                return myFilesBtn;
            case "Change Password":
                return changePasswordBtn;
            case "Settings":
                return settingsBtn;
            default:
                throw new IllegalArgumentException("Invalid Section: " + sectionName);
        }
    }

    public WebElement getProfileExpectedElement(String key) {
        switch (key) {
            case "searchBtnInC":
                return searchBtnInC;
            case "myDriveTxt":
                return myDriveTxt;
            case "changePasswordBtnTxt":
                return changePasswordBtnTxt;
            case "settingsText":
                return settingsText;
            default:
                throw new IllegalArgumentException("Undefined Expected Element: " + key);
        }
    }



















    public void verifyMessageContainsText(WebElement element, String searchText){
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.getText().toLowerCase().contains(searchText.toLowerCase()),
                "Expected text not found! Actual: " + element.getText());

    }
}

