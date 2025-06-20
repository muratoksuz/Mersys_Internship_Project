package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
}
