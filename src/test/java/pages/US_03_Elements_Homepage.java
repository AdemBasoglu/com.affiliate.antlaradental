package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_03_Elements_Homepage extends ReusableMethods {


    public US_03_Elements_Homepage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(css = "div[class*='c24-nav-ele c24-nav-']")
    private List<WebElement> elements;

    @FindBy(css = "a[class='js-product-chip c-product-chips__chip']")
    private List<WebElement> travelElements;

    @FindBy(xpath = "//div/h1")
    private WebElement travelHeadingElement;


    @FindBy(css = "div[class='c24-subnav-ele-wrapper clearfix']")
    private List<WebElement> elements_dropDownsMenu;




    public List<WebElement> getElements() {
        return elements;
    }

    public List<WebElement> getTravelElements() {return travelElements;}

    public WebElement getTravelHeadingElement() {  return travelHeadingElement;    }

    public List<WebElement> getElements_dropDownsMenu() {
        return elements_dropDownsMenu;
    }

}
