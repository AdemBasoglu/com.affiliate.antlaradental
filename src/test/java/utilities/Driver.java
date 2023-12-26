package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver == null){
            switch (ConfigReader.getProperty("browser")){
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    driver=new InternetExplorerDriver();
            }
        }
        return driver;
    }
    public static void closeDriver(){
        if (driver != null){
            driver.close();
            driver = null;
        }
    }
    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null;
        }
    }






// private Driver(){
        // POM'de Driver class'indaki getDriver() ve closeDriver()'in
        // static yolla kullanilmasi ongorulmustur.
        // obje olusturma ile bu method'larin kullanilmamasi
        // veya obje olusturularak farkli uygulamalarin
        // POM icinde kullanilmasini engellemek icin Singleton Pattern tercih edilmistir.
    }

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


