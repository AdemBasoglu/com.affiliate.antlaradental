package stepdefinitions.US_04_SignUpPage;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.SignUpPage;

import static utilities.Driver.driver;

public class TC0405_ValidInformationButRequiredPayPalMail {
    SignUpPage signUpPage = new SignUpPage();
    Faker faker = new Faker();
    Actions actions;
    @Given("The user fill in the form with correct information but a required paypal email")
    public void the_user_fill_in_the_form_with_correct_information_but_a_required_paypal_email() {
        actions = new Actions(driver);
        actions.moveToElement(signUpPage.firstNameInput).click()
                .sendKeys("adem")
                .sendKeys(Keys.TAB)
                .sendKeys("basoglu")
                .sendKeys(Keys.TAB)
                .sendKeys("ademba")
                .sendKeys(Keys.TAB)
                .sendKeys("admbasog@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.finance().iban())
                .sendKeys(Keys.TAB)
                .sendKeys("123")
                .sendKeys(Keys.TAB)
                .sendKeys("admbasgmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .perform();
    }
    @Given("The user should receive the message Required and must be a valid paypal email address")
    public void the_user_should_receive_the_message_required_and_must_be_a_valid_paypal_email_address() {
        String errorText = signUpPage.requiredMailMessageText.getText();
        Assert.assertTrue(errorText.contains("Required and must be a valid email address"));
    }
}
