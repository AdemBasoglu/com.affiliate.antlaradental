package utilities;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class Driver {
    //create a driver instance
    public static WebDriver driver;
    public static int timeout = 5;

    //What?=>It is just to create, initialize the driver instance.(Singleton driver)
    //Why?=>We don't want to create and initialize the driver when we don't need
    //We will create and initialize the driver when it is null
    //We can use Driver class with different browser(chrome,firefox,headless)
    private Driver() {
        //we don't want to create another abject. Singleton pattern
    }

    //to initialize the driver we create a static method
    public static WebDriver getDriver() {
        //create the driver if and only if it is null
        if (driver == null) {
            String browser = ConfigReader.getProperty("browser");
            if ("chrome".equals(browser)) {
                driver = new ChromeDriver();
                //driver.manage().window().maximize();

            } else if ("firefox".equals(browser)) {
                driver = new FirefoxDriver();
            } else if ("ie".equals(browser)) {
                driver = new InternetExplorerDriver();
            } else if ("safari".equals(browser)) {
                driver = new SafariDriver();
            } else if ("chrome-headless".equals(browser)) {
                //    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
            }
        }
        //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
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






// private Driver(){
        // POM'de Driver class'indaki getDriver() ve closeDriver()'in
        // static yolla kullanilmasi ongorulmustur.
        // obje olusturma ile bu method'larin kullanilmamasi
        // veya obje olusturularak farkli uygulamalarin
        // POM icinde kullanilmasini engellemek icin Singleton Pattern tercih edilmistir.


    /* cagrildigi yere bir WebDriver objesi dondurecek
       getDriver() olusturalim

        getDriver() her seferinde
        driver = new ChromeDriver(); satirini calistirirsa
        her kullanimda yeni bir webdriver objesi olusur

        biz ilk kullanimda (yani null iken)yeni webdriver olustursun
        sonraki kullanimlarda
        atanmis degeri kullansin
     */

   // static WebDriver driver; // null
//
   // public static WebDriver getDriver(){
//
   //     String browser = ConfigReader.getProperty("browser");
//
   //     if (driver == null){
//
   //         switch (browser){
//
   //             case "firefox" :
   //                 WebDriverManager.firefoxdriver().setup();
   //                 driver = new FirefoxDriver();
   //                 break;
   //             case "safari"   :
   //                 WebDriverManager.safaridriver().setup();
   //                 driver = new SafariDriver();
   //                 break;
   //             case "edge" :
   //                 WebDriverManager.edgedriver().setup();
   //                 driver = new EdgeDriver();
   //                 break;
   //             default:
   //                 WebDriverManager.chromedriver().setup();
   //                 driver = new ChromeDriver();
   //         }
//
   //         driver.manage().window().maximize();
   //         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   //     }
//
//
//
   //     return driver;
   // }
//
//
   // public static void closeDriver(){
//
   //     if (driver != null){
   //         driver.close();
   //         driver = null;
   //     }
   // }
//
   // public static void quitDriver(){
//
   //     if (driver != null){
   //         driver.quit();
   //         driver = null;
   //     }
   // }


