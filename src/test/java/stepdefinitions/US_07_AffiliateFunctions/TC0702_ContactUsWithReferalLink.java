package stepdefinitions.US_07_AffiliateFunctions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.ContactUsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC0702_ContactUsWithReferalLink {
    ContactUsPage contactUsPage = new ContactUsPage();
    Faker faker = new Faker();
    static String fakerUser;

    @Given("The user goes to Contact Us page with a referral link")
    public void the_user_goes_to_contact_us_page_with_a_referral_link() {
        Driver.driver.get(ConfigReader.getProperty("referUrl"));
        ReusableMethods.waitForPageToLoad(2);
    }

    @Given("The user writes name")
    public void the_user_writes_name() {
      //  Driver.driver.switchTo().frame(contactUsPage.contactInputIframe);
        ReusableMethods.wait(5);
        fakerUser = faker.name().firstName() + " " + faker.name().lastName();
        System.out.println("fakerUser = " + fakerUser);
        contactUsPage.nameInput.sendKeys(fakerUser);
    }

    @Given("The user writes a required email address")
    public void the_user_writes_a_required_email_address() {
        contactUsPage.emailInput.sendKeys(faker.internet().safeEmailAddress());
    }

    @Given("The user writes a valid phone number")
    public void the_user_writes_a_valid_phone_number() {
        ReusableMethods.wait(10);
        contactUsPage.belgiumFlag.click();
        contactUsPage.belgiumFlag.sendKeys("Belgium (België)");
        ReusableMethods.wait(10);

        contactUsPage.telNoInput.sendKeys(faker.phoneNumber().cellPhone());
        ReusableMethods.wait(10);

    }

    @Given("The user clicks submit button")
    public void the_user_clicks_submit_button() {
        contactUsPage.submitButton.submit();
    }

    @Given("The user verifies that entered Contact information has been successfully saved")
    public void the_user_verifies_that_entered_contact_information_has_been_successfully_saved() {
        ReusableMethods.waitForPageToLoad(10);
        Assert.assertTrue(contactUsPage.alertMessage.isDisplayed());
    }

}
