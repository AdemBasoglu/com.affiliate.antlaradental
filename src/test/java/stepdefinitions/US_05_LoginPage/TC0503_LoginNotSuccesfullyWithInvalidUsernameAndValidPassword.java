package stepdefinitions.US_05_LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.LoginPage;

public class TC0503_LoginNotSuccesfullyWithInvalidUsernameAndValidPassword {
    LoginPage loginPage=new LoginPage();
    @And("The user writes invalid username")
    public void theUserWritesInvalidUsername() {
        loginPage.userNameInput.sendKeys("newUser");
    }
    @And("The user writes valid password")
    public void theUserWritesValidPassword() {
        loginPage.passwordInput.sendKeys("As120619");

    }


}
