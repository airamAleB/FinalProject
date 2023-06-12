package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressPage extends BasePage {
    public KeyPressPage(WebDriver driver) {
        super(driver);
    }

    //Locators and methods for elements in Key Press Page
    By KeyField1 = By.id("my_field");
    public void verifyKeyField1(){driver.findElement(KeyField1).sendKeys(Keys.BACK_SPACE);}
    By KeyField2 = By.id("my_field");
    public void verifyKeyField2(String char1){driver.findElement(KeyField2).sendKeys(char1);}

}
