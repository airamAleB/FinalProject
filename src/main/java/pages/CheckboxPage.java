package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckboxPage extends BasePage {
    public CheckboxPage(WebDriver driver) {
        super(driver);
    }

    //Locators and methods for elements in Checkbox Page
    By SingleCheckboxButton = By.id("isAgeSelected");
    public void clickOnSingleCheckboxButton() { driver.findElement(SingleCheckboxButton).click();}

}