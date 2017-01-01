package Helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

public class Helpers {

    public static boolean isElementPresent(WebDriver driver, By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static boolean isAlertPresent(WebDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
    public static void scrollToElement(WebElement element,WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void ExecuteJavaScript(WebDriver driver){
        ((JavascriptExecutor) driver).executeScript("alert('js alert');");
    }

    public static void waitForElementPresent(WebDriver driver,By by, int milliseconds) throws InterruptedException {
        Boolean elementFound = false;
        while (milliseconds > 0) {
            if (isElementPresent(driver, by)) {
                elementFound = true;
                break;
            }
            Thread.sleep(500);
            milliseconds -= 500;
        }
        if (!elementFound) {
            throw new NoSuchElementException("Element with locator " + by + " not found");
        }
    }

    public static void selectFromDropDown(WebElement e, String text) {
        Select select = new Select(e);
        select.selectByVisibleText(text);
    }

    public static void ClickTabByName(WebElement e, String tabName)throws Exception {
        boolean isElemenentFound = false;
        if (e.getText().equals(tabName)) {
            e.click();
            isElemenentFound = true;

        }
        if (!isElemenentFound) {
            throw new NoSuchElementException("Tab with name" + " "+ tabName + " " + "is not present on the page");
        }

    }

    public static void switchTab(WebDriver driver)
    {

        try {
            Set<String> windows = driver.getWindowHandles();
            Iterator<String> iter = windows.iterator();
            String[] winNames=new String[windows.size()];
            int i=0;
            while (iter.hasNext()){
                winNames[i]=iter.next();
                i++;
            }

            if(winNames.length > 1) {
                for(i=winNames.length;i>1;i--) {
                    driver.switchTo().window(winNames[i-1]);
                    driver.close();
                }
            }
            driver.switchTo().window(winNames[0]);

        }

        catch(Exception e){

            e.printStackTrace();}
    }




    public static String closeAlertAndGetItsText(WebDriver driver, boolean acceptNextAlert) {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}

