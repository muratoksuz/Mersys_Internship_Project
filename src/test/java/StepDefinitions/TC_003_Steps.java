package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TC_003_Steps {

    DialogContent dc = new DialogContent();
    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();

    @When("The student clicks the pages and should be able to see expected results")
    public void theStudentClicksThePagesAndShouldBeAbleToSeeExpectedResults(DataTable dataTable) {

        List<List<String>> list = dataTable.asLists();

        for (int i = 1; i < list.size(); i++) {
            String pageKey = list.get(i).get(0).trim();
            String expectedKey = list.get(i).get(2).trim();

            WebElement pageElement = dc.getTopMenu(pageKey);
            WebElement expectedElement = dc.getVisibleElement(expectedKey);

            dc.waitForToastToDisappear();

            try {
                dc.isElementClickable(pageElement);
                pageElement.click();
            } catch (Exception e) {
                dc.jsClick(pageElement);
            }
            dc.waitUntilVisible(expectedElement);

        }
    }


    @When("The student clicks the hamburger menu")
    public void theStudentClicksTheHamburgerMenu() {
        dc.isElementClickable(dc.hamburgerMenu);
        dc.myClick(dc.hamburgerMenu);
    }

    @Then("The student should hover each main menu and click all visible submenus")
    public void theStudentShouldHoverEachMainMenuAndClickAllVisibleSubmenus() {

        String[] mainSections = {"messaging", "finance", "attendanceHMenu", "videoConference", "surveys"};

        for (String section : mainSections) {

            if (section.equals("messaging")) {

                String[] messagingSubMenus = {"sendMessage", "inbox", "outbox", "trash"};

                for (String subMenu : messagingSubMenus) {

                    dc.hoverMethod(dc.getSectionElement("messaging"));

                    WebElement element = dc.getMessagingSubMenu(subMenu);
                    if (element != null) {
                        dc.myClick(element);

                        switch (subMenu) {
                            case "sendMessage":
                                dc.verifyMessageContainsText(dc.sendMessageTxt, "New Message");
                                break;
                            case "inbox":
                                dc.waitUntilVisible(dc.inboxTxt);
                                break;
                            case "outbox":
                                dc.waitUntilVisible(dc.outboxTxt);
                                break;
                            case "trash":
                                dc.waitUntilVisible(dc.trashTxt);
                                break;
                        }

                        dc.myWait(400);
                        dc.isElementClickable(dc.hamburgerMenu);
                        dc.myClick(dc.hamburgerMenu);
                    }
                }

            } else {
                dc.myClick(dc.getSectionElement(section));

                String subMenuName = dc.getSubMenuName(section);
                if (subMenuName != null) {
                    WebElement subMenuElement = dc.getSingleSubMenuElement(subMenuName);
                    if (subMenuElement != null) {
                        dc.myClick(subMenuElement);

                        switch (section) {
                            case "finance":
                                dc.waitUntilVisible(dc.studentFeeTxt);
                                break;
                            case "attendanceHMenu":
                                dc.waitUntilVisible(dc.attendanceExcusesTxt);
                                break;
                            case "videoConference":
                                dc.waitUntilVisible(dc.videoMeetingTxt);
                                break;
                            case "surveys":
                                dc.waitUntilVisible(dc.mySurveysTxt);
                                break;
                        }
                    }
                }
                if (!section.equals("surveys")) {
                    dc.myWait(300);
                    dc.isElementClickable(dc.hamburgerMenu);
                    dc.myClick(dc.hamburgerMenu);
                }
            }
        }
    }

    @When("The student clicks the Profile menu button")
    public void theStudentClicksTheProfileMenuButton() {
        dc.isElementClickable(dc.profileBtn);
        dc.myClick(dc.profileBtn);
    }

    @Then("The student should be able to access and verify each section under the profile menu")
    public void theStudentShouldBeAbleToAccessAndVerifyEachSectionUnderTheProfileMenu() {
        String[] profileSections = {"My Certificates", "My Files", "Change Password", "Settings"};
        String[] expectedElements = {"searchBtnInC", "myDriveTxt", "changePasswordBtnTxt", "settingsText"};

        for (int i = 0; i < profileSections.length; i++) {
            dc.myClick(dc.getProfileSectionElement(profileSections[i]));

            dc.waitUntilVisible(dc.getProfileExpectedElement(expectedElements[i]));

            if (profileSections[i].equals("My Certificates")) {
                dc.myClick(dc.profileBtn);
            }

            else if (profileSections[i].equals("My Files")) {
                dc.myClick(dc.closeBtnInMyFiles);
                if (i < profileSections.length - 1) {
                    dc.myClick(dc.profileBtn);
                }
            }

            else if (profileSections[i].equals("Change Password")) {
                dc.myClick(dc.changePasswordCloseBtn);
                if (i < profileSections.length - 1) {
                    dc.myClick(dc.profileBtn);
                }
            }

            else if (profileSections[i].equals("Settings")) {
                dc.myClick(dc.closeSettingsBtn);
            }
        }
    }
}