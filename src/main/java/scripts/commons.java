package scripts;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.BasePage;

import java.lang.reflect.Executable;

public class commons extends BasePage {

    public commons(WebDriver driver) {
        super(driver);
    }

    public commons() {
    }


    // NAVIGATE
    public static void navigateTo(String url) {
        driver.get(url);
    }

    //CLICK ELEMENT
    public static void click(String xpath) {
        try {
            findElementByXpath(xpath).click();

        } catch (Exception e) {
            Assert.fail("Failed to click elements: " + xpath);
        }
    }

    // FIND
    public static WebElement findElementByXpath(String locator) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        } catch (TimeoutException e) {
            throw new NoSuchElementException("Element not found: " + locator);
        }
    }

    //VERIFY
    public static boolean elementIsDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            System.err.println("Element not visible: " + element);
            return false;
        }
    }

    public static String getUrl() {
        return driver.getCurrentUrl();
    }

    public static void writeText(String xpath, String text) {
        try {
            commons.findElementByXpath(xpath).sendKeys(Keys.CONTROL,"A",Keys.BACK_SPACE);
            commons.findElementByXpath(xpath).sendKeys(text);
        } catch (Exception e) {
            Assert.fail("Failed to write text in xpath: " + xpath);
        }
    }
}
