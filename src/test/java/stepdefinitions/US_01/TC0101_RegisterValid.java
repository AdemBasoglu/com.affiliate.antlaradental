package stepdefinitions.US_01;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import static utilities.Driver.driver;


public class TC0101_RegisterValid {
    HomePage homePage = new HomePage();
    Faker faker = new Faker();
    RegisterPage registerPage = new RegisterPage();
    String password = "";


    @Given("The user goes to home page")
    public void theUserGoesToHomePage() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }
}
