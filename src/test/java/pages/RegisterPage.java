package pages;

import io.restassured.path.json.JsonPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {



    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@id='cl_login']")
    public WebElement emailBox;
    @FindBy(xpath = "//iframe[@class='c24-uli-loginlayer-iframe c24-nolazyload c24-ulill-connected']")
    public WebElement emailIframe;

    @FindBy(id = "c24-uli-login-btn")
    public WebElement weiter;

    @FindBy(xpath = "(//input[@placeholder='Vorname'])")
    public WebElement vorNameBox;

    @FindBy(xpath = "//input[@id='cl_ul_lastname']")
    public WebElement nachNameBox;
    @FindBy(xpath = "//input[@id='cl_pw_register']")
    public WebElement passwort;
    @FindBy(xpath = "//input[@id='cl_ul_pw_register_repeat']")
    public WebElement passwortWiederholen;
    @FindBy(id = "c24-uli-register-btn")
    public WebElement weiterButtonRegisterForm;

    @FindBy(xpath = "//*[text()='Überprüfen Ihrer Identität'] ")
    public WebElement codeSendText;

    @FindBy(xpath = "(//div[@class='c24-uli-error c24-uli-error-pw'])[1]")
    public WebElement invalidPasswordText;

    @FindBy(xpath = "//button[@id='c24-uli-pw-btn']")
    public WebElement anmeldenButton;
    @FindBy(xpath = "(//div[@class='c24-uli-error c24-uli-error-pw-repeat'])[1]")
    public WebElement longPasswordText;



   




}
