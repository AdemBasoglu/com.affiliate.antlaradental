package utilities;

import io.qameta.allure.Allure;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Driver {
    //create a driver instance

    public static WebDriver driver;

    //to initialize the driver we create a static method
    public static WebDriver getDriver() {

        //create the driver if and only if it is null
        if (driver == null) {
            String browser = ConfigReader.getProperty("browser");
            if ("chrome".equals(browser)) {
                driver = new ChromeDriver();
            } else if ("firefox".equals(browser)) {
                driver = new FirefoxDriver();
            } else if ("ie".equals(browser)) {
                driver = new InternetExplorerDriver();
            } else if ("safari".equals(browser)) {
                driver = new SafariDriver();
            } else if ("chrome-headless".equals(browser)) {
            }
            logBrowserAndPlatformInfo();
        }
        driver.manage().window().maximize();
        return driver;
    }
    private static void logBrowserAndPlatformInfo() {
        if (driver != null) {
            Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();
            String browserName = capabilities.getBrowserName();
            String browserVersion = capabilities.getBrowserVersion();
            String platform = capabilities.getPlatformName().toString();

            String infoText = String.format("Tarayıcı: %s %s, Platform: %s", browserName, browserVersion, platform);

            // Allure raporlarına attachment (ek dosya) ekleyin
            Allure.addAttachment("Tarayıcı ve Platform Bilgileri", infoText);
        }
    }

    public static void closeDriver() {
        if (driver != null) {//if the driver is pointing chrome
            driver.quit();//quit the driver
            driver = null;//set it back to null to make sure driver is null

        }
    }

    public static void quitDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }

    }

    //    Driver.selectByVisibleText(dropdown element, "CHECKING-91303-116.98$")
    public static void selectByVisibleText(WebElement element, String text) {
        Select objSelect = new Select(element);
        objSelect.selectByVisibleText(text);
    }


    public static void selectByIndex(WebElement element, int index) {
        Select objSelect = new Select(element);
        objSelect.selectByIndex(index);
    }

    public static void selectByValue(WebElement element, String value) {
        Select objSelect = new Select(element);
        List<WebElement> elementCount = objSelect.getOptions();
        objSelect.selectByValue(value);
        System.out.println("number of elements: " + elementCount.size());
    }

}
