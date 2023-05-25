package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    public static WebDriver driver;
    protected  static WebDriverWait wait;

    public BasePage(WebDriver driver){

        BasePage.driver =  driver;
        PageFactory.initElements(driver, this);
    }
    static{
        switch (System.getProperty("webDriver")){
            case "chromeDriver":
                chromeDriver();
                break;
            case  "firefoxDriver":
                firefoxDriver();
                break;
        }

    }

    public BasePage() {
    }

    public static void chromeDriver(){
        Boolean headlessMode = Boolean.parseBoolean(System.getProperty("headlessMode"));
        ChromeOptions options =  new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        options.addArguments("--force-dark-mode");
        options.addArguments("--incognito");
        if (headlessMode){
            options.addArguments("--headless");
            System.out.println("Driver mode:Headless");
        }
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void firefoxDriver(){
        Boolean headlessMode = Boolean.parseBoolean(System.getProperty("headlessMode"));
        FirefoxOptions options =  new FirefoxOptions();
        options.addArguments("--start-maximized");
        if (headlessMode){
            options.addArguments("--headless");
            System.out.println("Driver mode:Headless");
        }
        driver = new FirefoxDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void closeBrowser(){
        driver.quit();
    }

}
