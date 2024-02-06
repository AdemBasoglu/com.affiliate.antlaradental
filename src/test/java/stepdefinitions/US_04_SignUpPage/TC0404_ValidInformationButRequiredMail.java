package stepdefinitions.US_04_SignUpPage;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.SignUpPage;

import static utilities.Driver.driver;

public class TC0404_ValidInformationButRequiredMail {
    SignUpPage signUpPage = new SignUpPage();
    Faker faker = new Faker();
    Actions actions;

    @Given("The user fill in the form with correct information and required email")
    public void the_user_fill_in_the_form_with_correct_information_and_required_email() {
        actions = new Actions(driver);
        actions.moveToElement(signUpPage.firstNameInput).click()
                .sendKeys("adem")
                .sendKeys(Keys.TAB)
                .sendKeys("basoglu")
                .sendKeys(Keys.TAB)
                .sendKeys("adembas")
                .sendKeys(Keys.TAB)
                .sendKeys("admbasoglu28gmail.com")
                .sendKeys(Keys.TAB)
                .perform();
    }
    @Given("The user should receive the message Required and must be a valid email address")
    public void the_user_should_receive_the_message_required_and_must_be_a_valid_email_address() {
        String errorText = signUpPage.requiredMailMessageText.getText();
        Assert.assertTrue(errorText.contains("Required and must be a valid email address"));
    }
}
