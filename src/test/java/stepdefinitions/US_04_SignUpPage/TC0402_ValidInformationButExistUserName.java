package stepdefinitions.US_04_SignUpPage;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.SignUpPage;
import static utilities.Driver.driver;

public class TC0402_ValidInformationButExistUserName {
    SignUpPage signUpPage = new SignUpPage();
    Faker faker = new Faker();
    Actions actions;

    @Given("The user fill in the form with correct information and exist username")
    public void the_user_fill_in_the_form_with_correct_information_and_exist_username() {
        actions = new Actions(driver);
        actions.moveToElement(signUpPage.firstNameInput).click()
                .sendKeys("adem")
                .sendKeys(Keys.TAB)
                .sendKeys("basoglu")
                .sendKeys(Keys.TAB)
                .sendKeys("adembas")
                .sendKeys(Keys.TAB)
                .sendKeys("admbasoglu28@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.finance().iban())
                .sendKeys(Keys.TAB)
                .sendKeys("123")
                .sendKeys(Keys.TAB)
                .sendKeys("admbasoglu28@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .sendKeys(Keys.TAB)
                .sendKeys("12345")
                .perform();
    }

    @Given("The user should receive the message Username is already taken.")
    public void the_user_should_receive_the_message_username_is_already_taken() {
        String errorText = signUpPage.signupErrorText.getText();
        Assert.assertTrue(errorText.contains(" Username is already taken"));
    }


}
