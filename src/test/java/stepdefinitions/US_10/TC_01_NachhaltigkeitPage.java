package stepdefinitions.US_10;


    import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

    public class TC_01_NachhaltigkeitPage {
   HomePage homePage = new HomePage();


        @Given("Given user goes the check24 home page")
        public void given_user_goes_the_check24_home_page() {
            Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        }

        @Then("Der Nutzer klickt auf die Schaltfläche {string} oben rechts auf der Homepage")
        public void der_nutzer_klickt_auf_die_schaltfläche_oben_rechts_auf_der_homepage(String string) {
            homePage.Nachhaltigkeit.click();
            homePage.gehtKlarButton.click();

        }

        @Then("Der Nutzer scrollt zur Mitte der Seite und überprüft, ob der Text {string} sichtbar ist")
        public void der_nutzer_scrollt_zur_mitte_der_seite_und_überprüft_ob_der_text_sichtbar_ist(String string) {

            WebElement myElement = Driver.driver.findElement(By.cssSelector("div#c24-container-3 div:nth-child(4) > h5"));
            Assert.assertTrue("Text is not visible", myElement.isDisplayed());

        }
        @Then("Klickt dann auf den Button {string}")
        public void klickt_dann_auf_den_button(String string) {
            WebDriverWait wait = new WebDriverWait(Driver.driver, Duration.ofSeconds(10));
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div#c24-container-3 div:nth-child(2) > a")));
            button.click();
        }

        @Then("close  page")
        public void close_page() {
            Driver.driver.close();
        }


    }


