package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage extends BasePage {
    public KeyPressPage(WebDriver driver) {
        super(driver);
    }

    //Locators and methods for elements in Key Press Page
    By KeyField = By.id("my_field");
    public void verifyKeyField(){driver.findElement(KeyField).sendKeys(Keys.BACK_SPACE);}

}
