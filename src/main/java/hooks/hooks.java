package hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;
import utils.BrowserUtils;

import static pages.BasePage.driver;

public class hooks {
    @Before
    public static void setUp() {
        String windowSize = System.getProperty("windowSize");
        if (windowSize != null){
            BrowserUtils.setWindowSize(driver,windowSize);
        } else {
            BrowserUtils.maximizeWindow(driver);
        }
    }
    @AfterStep
    public void screenshot(Scenario scenario){
        boolean fullSteps = Boolean.parseBoolean(System.getProperty("fullSteps"));
        if (scenario.isFailed() | fullSteps ) {
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
            System.out.println("Screenshot---------------------------------");
        }
    }

    @AfterAll
    public static void tearDown(){
        BasePage.closeBrowser();
    }

}
