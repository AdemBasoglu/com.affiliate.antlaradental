package stepdefinitions.US_01;

import io.cucumber.java.en.Given;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC0101_RegisterStepdefinitions {
 HomePage homePage = new HomePage();



 @Given("user goes the check24 home page")
 public void user_goes_the_check24_home_page() {
  Driver.getDriver().get(ConfigReader.getProperty("toUrl"));  throw new io.cucumber.java.PendingException();
 }

}
