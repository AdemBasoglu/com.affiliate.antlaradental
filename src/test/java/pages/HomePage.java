package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[text()='Geht klar'] ")
    public WebElement gehtKlarButton;

    @FindBy(xpath = "//span[@class='c24-customer-hover c24-header-hover'] ")
    public WebElement meinKontoLink;

    @FindBy(xpath = "//*[text()='Starten Sie hier.'] ")
    public WebElement startenSieHierLink;


}
