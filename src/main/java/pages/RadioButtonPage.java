package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RadioButtonPage extends BasePage {
    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }

    //Locators and methods for elements in Radio Button Page
    By MaleButton = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/label[1]");
    public void clickOnMaleButton(){driver.findElement(MaleButton).click();}
    By FemaleButton = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/label[2]");
    public void clickOnFemaleButton(){driver.findElement(FemaleButton).click();}
    By GetValueButton = By.id("buttoncheck");
    public void clickOnGetValueButton(){driver.findElement(GetValueButton).click();}


}
