package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage {
    public ContactUsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//form[@id='forminator-module-269']")
    public WebElement contactInputIframe;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]")
    public WebElement nameInput;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/input[1]")
    public WebElement emailInput;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
    public WebElement telNoInput;
    @FindBy(xpath = "//button[normalize-space()='Submit']")
    public WebElement submitButton;
    @FindBy(xpath = "//div[@class='iti__selected-flag']")
    public WebElement belgiumFlag;
    @FindBy(xpath = "//div[@title='Belgium (België): +32']")
    public WebElement flagDropdown;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alertMessage;


//"Thank you for contacting us, we will be in touch shortly."

}
