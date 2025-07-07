package Pages;

import Utilities.GWD;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ParentPage {
    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    public void mySendKeys(WebElement e, String  text)
    {
        wait.until(ExpectedConditions.visibilityOf(e));
        scrollToElement(e);
        e.clear();
        e.sendKeys(text);
    }

    public void myClick(WebElement e)
    {
        wait.until(ExpectedConditions.elementToBeClickable(e));
        //scrollToElement(e);
        e.click();
    }

    //elemente kadar scroll yap
    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public static String random(int max){
        int number =  (int)(Math.random()* max);
        return String.valueOf(number);
    }


    public void selectByIndex(WebElement e, int a)
    {
        Select select = new Select(e);
        select.selectByIndex(a);
    }

    public boolean isElementVisible(WebElement e) {
        try {
            wait.until(ExpectedConditions.visibilityOf(e));
            return e.isDisplayed();
        } catch (Exception ex) {
            return false;
        }
    }

    public String getElementText(WebElement e) {
        wait.until(ExpectedConditions.visibilityOf(e));
        return e.getText();
    }

    public void myWait(int sn) {
        try {
            Thread.sleep(sn * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void jsClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].click();", element);
    }


    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertTrue(element.isDisplayed());

    }

    public void isElementClickable(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            if (element.isEnabled()) {
                element.isDisplayed();
            }
        } catch (Exception e) {
        }
    }

    public void waitForToastToDisappear() {
        By toastLocator = By.xpath("//div[contains(@class, 'hot-toast-message') and contains(., 'Please wait')]");

        WebDriverWait toastWait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(75));

        boolean toastGone = toastWait.until(driver -> {
            try {
                WebElement toast = driver.findElement(toastLocator);
                String visibility = toast.getCssValue("visibility");
                String display = toast.getCssValue("display");
                String opacity = toast.getCssValue("opacity");

                return visibility.equals("hidden") || display.equals("none") || opacity.equals("0");
            } catch (NoSuchElementException | StaleElementReferenceException e) {
                return true;
            }
        });

        if (!toastGone) {
            throw new TimeoutException("Toast mesajı 30 saniyede kaybolmadı.");
        }
    }



    public void hoverMethod(WebElement element) {
        Actions actions = new Actions(GWD.getDriver());
        actions.moveToElement(element)
                .pause(Duration.ofMillis(500))
                .build()
                .perform();
    }

}
