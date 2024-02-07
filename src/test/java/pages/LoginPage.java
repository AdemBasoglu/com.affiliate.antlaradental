package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public static String username="adembas";


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
    @FindBy(xpath = "//a[normalize-space()='Register']")
    public WebElement registerLinkLoginPage;
    @FindBy(xpath = "//a[normalize-space()='Lost Password?']")
    public WebElement lostPasswordLink;
    @FindBy(xpath = "//h3[normalize-space()='Request a Password Reset']")
    public WebElement requestPasswordText;
    @FindBy(xpath = "//input[@id='esaf-user-or-email']")
    public WebElement requestPasswordInput;
    @FindBy(xpath = "//button[normalize-space()='Request Password Reset']")
    public WebElement requestPasswordResetButton;
    @FindBy(xpath = "//h3[normalize-space()='Successfully requested password reset']")
    public WebElement requestPasswordSuccesfullyText;








}
