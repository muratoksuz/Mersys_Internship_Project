package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hooks {

    private static WebElement lastUsedElement;

    public static void setLastUsedElement(WebElement element) {
        lastUsedElement = element;
    }

    @Before
    public void beforeScenario() {
        System.out.println("Before Scenario");
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                WebDriver driver = GWD.getDriver();

                if (lastUsedElement != null) {
                    Thread.sleep(300);
                    highlightElement(lastUsedElement, driver);
                    Thread.sleep(300);
                }

                TakesScreenshot ts = (TakesScreenshot) driver;
                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Failure Screenshot");


                takeScreenshot(driver, scenario);

            } catch (Exception e) {
                System.out.println("Screenshot alma hatası: " + e.getMessage());
            }
        }

        GWD.quitDriver();
    }



    public static void highlightElement(WebElement element, WebDriver driver) {
        if (element != null) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript(
                    "arguments[0].setAttribute('style', arguments[0].getAttribute('style') + '; border: 3px solid red; box-shadow: 0 0 5px red;');",
                    element);
        }
    }

    public static void takeScreenshot(WebDriver driver, Scenario scenario) {
        try {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter folderFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            DateTimeFormatter fileFormat = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
            String dateFolder = now.format(folderFormat);
            String dateFile = now.format(fileFormat);
            String status = scenario.isFailed() ? "FAILED" : "PASSED";
            String featureName = scenario.getUri().getPath()
                    .replaceAll(".*/", "")
                    .replace(".feature", "");

            String scenarioName = scenario.getName().replaceAll("[^a-zA-Z0-9]", "_");
            if (scenarioName.length() > 50) {
                scenarioName = scenarioName.substring(0, 50) + "...";
            }

            String folderPath = System.getProperty("user.dir") + "\\src\\ScreenShots\\" + dateFolder + "\\" + status + "\\";
            File folder = new File(folderPath);
            if (!folder.exists()) folder.mkdirs();

            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String fileName = featureName + "_" + scenarioName + "_" + dateFile + ".png";
            File destinationFile = new File(folderPath + fileName);
            Files.copy(screenshot.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
