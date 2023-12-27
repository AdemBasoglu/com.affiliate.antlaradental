package utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.US_03_Elements_Homepage;

import java.time.Duration;
import java.util.List;

public class ReusableMethods {

    US_03_Elements_Homepage elements_homepage;

    public void waitUntilClickable(WebElement objElement){

        WebDriverWait wait= new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(objElement));
    }

    public void waitUntilVisible(WebElement objElement){

        WebDriverWait wait= new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(objElement));
    }

    public void listElementsIsclickable(List<WebElement> element){

        for (WebElement obj : element) {

            waitUntilClickable(obj);
            verifyContainsText(obj, obj.getText());
        }
    }

    public void hoverOverElement(WebElement element){

        Actions actions = new Actions(Driver.getDriver());
         actions.moveToElement(element).perform();

    }

    public void hoverElementandDropdownsMenuVisibility(List<WebElement> element){

        for (WebElement obj : element) {
            hoverOverElement(obj);
            waitUntilVisible(obj);
            Assert.assertTrue(obj.isDisplayed());

        }
    }

    public void verifyContainsText(WebElement element, String message) {

            clickFunction(element);
            Assert.assertTrue(Driver.driver.getCurrentUrl().toLowerCase().contains(message.toLowerCase()));


    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        element.click();
    }
}
