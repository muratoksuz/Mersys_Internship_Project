package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TC_015_Steps {

    DialogContent dc = new DialogContent();

    @And("Click on the Profile Button")
    public void clickOnTheProfileButton() {
        dc.myClick(dc.profileImage);
    }

    @And("Click on the Settings Button")
    public void clickOnTheSettingsButton() {

        dc.myClick(dc.settingsButton);
    }

    @Then("Control the Theme Color Options")
    public void controlTheThemeColorOptions() {
        dc.myClick(dc.openThemesButton);


        int themeOptionNumber = 0;
        for (int i = 1; i < dc.dropDownMenuItems.size(); i++) {
            for (int j = 2; j < dc.dropDownMenuItemsControl.size(); j++) {
                if (!dc.dropDownMenuItems.get(i).getText().equalsIgnoreCase(dc.dropDownMenuItemsControl.get(j).getText())) {
                    themeOptionNumber++;
                } else {
                    continue;
                }
            }
        }

        if (themeOptionNumber > 2) {
            System.out.println("Theme color options are more than 3");
        } else {
            System.out.println("Theme color options number=" + themeOptionNumber);
        }


    }
}
