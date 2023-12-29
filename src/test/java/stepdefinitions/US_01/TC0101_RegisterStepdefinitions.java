package stepdefinitions.US_01;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;


public class TC0101_RegisterStepdefinitions {
    HomePage homePage = new HomePage();
    Faker faker=new Faker();
    RegisterPage registerPage=new RegisterPage();
    String password="";


    @Given("The user goes to the website")
    public void the_user_goes_to_the_website() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

    }

    @Then("The user should close to cookies pop up")
    public void the_user_should_close_to_cookies_pop_up() {
        homePage.gehtKlarButton.click();

    }

    @When("The user waits on the Mein Konto button and clicks on the Starten Sie hier button")
    public void theUserWaitsOnTheMeinKontoButtonAndClicksOnTheStartenSieHierButton() {
        ReusableMethods.hover(homePage.meinKontoLink);
        ReusableMethods.waitForClickablility(homePage.startenSieHierLink, 2);
        homePage.startenSieHierLink.click();
        ReusableMethods.wait(2);
    }

    @When("The user sees the text CHECK24 Kundenkonto anlegen,user enters her or his valid e-mail address in the input field")
    public void the_user_sees_the_text_check24_kundenkonto_anlegen_user_enters_her_his_valid_e_mail_address_in_the_input_field() {
        driver.switchTo().frame(registerPage.emailIframe);
        registerPage.emailBox.sendKeys(faker.internet().emailAddress());
    }

    @Then("The user clicks weiter button")
    public void the_user_clicks_weiter_button() {
        registerPage.weiter.click();
        ReusableMethods.wait(2);

    }

    @Then("The user enters a name in the Vorname field")
    public void the_user_enters_a_name_in_the_vorname_field() {
        driver.switchTo().frame(registerPage.registerFormIframe);
        registerPage.weiterButtonRegisterForm.click();
       // registerPage.vorNameBox.sendKeys(faker.name().firstName());
    }

    @Then("The user enters a last name in the Nachname  field")
    public void the_user_enters_a_last_name_in_the_nachname_field() {
        registerPage.nachNameBox.sendKeys(faker.name().lastName());
    }

    @Then("The user enters a password in the Passwort field that consists of a minimum of {int} and a maximum of {int} characters.")
    public void the_user_enters_a_password_in_the_passwort_field_that_consists_of_a_minimum_of_and_a_maximum_of_characters(Integer int1, Integer int2) {
      password=faker.internet().password(8,50);
      registerPage.passwort.sendKeys(password);
    }

    @Then("The user enters the same password again in the Passwort wiederholen field.")
    public void the_user_enters_the_same_password_again_in_the_passwort_wiederholen_field() {
       registerPage.passwortWiederholen.sendKeys(password);
    }

    @Then("The user clicks on the weiter button")
    public void the_user_clicks_on_the_weiter_button() {
       registerPage.weiterButtonRegisterForm.click();
    }

    @Then("The should be sees the text on the page Überprüfen Ihrer Identität")
    public void the_should_be_sees_the_text_on_the_page_überprüfen_ihrer_identität() {

    }

}