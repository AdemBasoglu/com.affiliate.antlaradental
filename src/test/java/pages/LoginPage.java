package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[normalize-space()='Log In']")
    public WebElement loginButton;
    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement userNameInput;
    @FindBy(xpath = "//input[@id='user_pass']")
    public WebElement passwordInput;
    @FindBy(xpath = "//input[@id='rememberme']")
    public WebElement rememberSelectBox;

    @FindBy(xpath = "//div[@class='esaf-errors']")
    public WebElement loginErrorText;














}
