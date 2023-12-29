package pages;

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

    @FindBy(xpath = "iframe[cd_frame_id_='0fbd0d1a36e40fda227cede8fe15a17b']")
    public WebElement registerFormIframe;
    @FindBy(xpath = "//input[@class='c24-uli-input']")
    public WebElement vorNameBox;

    @FindBy(xpath = "//input[@id='cl_ul_lastname']")
    public WebElement nachNameBox;
    @FindBy(xpath = "//input[@id='cl_pw_register']")
    public WebElement passwort;
    @FindBy(xpath = "//input[@id='cl_ul_pw_register_repeat']")
    public WebElement passwortWiederholen;
    @FindBy(xpath = "//button[@id='c24-uli-register-btn']")
    public WebElement weiterButtonRegisterForm;



   




}
