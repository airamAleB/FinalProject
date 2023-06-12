package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SimpleFormPage extends BasePage {
    public SimpleFormPage(WebDriver driver) {
        super(driver);
    }

    //Locators and methods for elements in Simple Form Demo Page

    //Single Input Field
    By SingleInputField = By.id("user-message");
    public void verifySingleInputField(String input1) { driver.findElement(SingleInputField).sendKeys(input1); }
    By GetCheckedValueButton = By.id("showInput");
    public void clickOnGetCheckedValueButton() {driver.findElement(GetCheckedValueButton).click();}

    //Two Input Fields
    By EnterFirstValueField = By.id("sum1");
    public void verifyEnterFirstValueField(String input2) {driver.findElement(EnterFirstValueField).sendKeys(input2);}
    By EnterSecondValueField = By.id("sum2");
    public void verifyEnterSecondValueField(String input3) {driver.findElement(EnterSecondValueField).sendKeys(input3);}
    By GetSumButton = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div/div[1]/form/button");
    public void clickOnGetSumButton() {driver.findElement(GetSumButton).click();}


}
