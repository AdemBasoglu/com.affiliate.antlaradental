package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ExamplePage;
import utilities.ConfigReader;
import utilities.Driver;

public class ExampleStepdefinitions {
 ExamplePage examplePage = new ExamplePage();



 @Given("user goes the check24 home page")
 public void user_goes_the_check24_home_page() {
  Driver.getDriver().get(ConfigReader.getProperty("toUrl"));  throw new io.cucumber.java.PendingException();

 }

 @Then("cookies accept")
 public void cookies_accept() {
   examplePage.cookiesAccept.click();
 }

 @Then("Click to Merkzettel")
 public void click_to_merkzettel() {
  examplePage.linkMerkzettel.click();
 }

 @Then("Merkzettel is displayed")
 public void merkzettel_is_displayed() {
  Assert.assertTrue(examplePage.linkNoteList.isDisplayed());

 }

 @Then("close page")
 public void close_page() {

 }



}
