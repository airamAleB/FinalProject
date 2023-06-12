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
    //Single Checkbox Demo
    By SingleCheckboxButton = By.id("isAgeSelected");
    public void clickOnSingleCheckboxButton() { driver.findElement(SingleCheckboxButton).click();}

    //Disabled Checkbox Demo
    By Option1EnabledButton = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[1]/input");
    public void verifyOption1EnabledButton() {
        boolean option1IsEnabled = driver.findElement(Option1EnabledButton).isEnabled();
        if (option1IsEnabled == true) {
            driver.findElement(Option1EnabledButton).click();
            System.out.println("Option 1 checkbox button is enabled.");
        } else { System.out.println("Option 1 checkbox button is disabled.");}
    }
    By Option2EnabledButton = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[2]/input");
    public void verifyOption2EnabledButton() {
        boolean option2IsEnabled = driver.findElement(Option2EnabledButton).isEnabled();
        if (option2IsEnabled == true) {
            driver.findElement(Option2EnabledButton).click();
            System.out.println("Option 2 checkbox button is enabled.");
        } else { System.out.println("Option 2 checkbox button is disabled.");}
    }
    By Option3EnabledButton = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[3]/input");
    public void verifyOption3EnabledButton() {
        boolean option3IsEnabled = driver.findElement(Option3EnabledButton).isEnabled();
        if (option3IsEnabled == true) {
            driver.findElement(Option3EnabledButton).click();
            System.out.println("Option 3 checkbox button is enabled.");
        } else { System.out.println("Option 3 checkbox button is disabled.");}
    }
    By Option4EnabledButton = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div[2]/div[3]/input");
    public void verifyOption4EnabledButton() {
        boolean option4IsEnabled = driver.findElement(Option4EnabledButton).isEnabled();
        if (option4IsEnabled == true) {
            driver.findElement(Option4EnabledButton).click();
            System.out.println("Option 4 checkbox button is enabled.");
        } else { System.out.println("Option 4 checkbox button is disabled.");}
    }

    //Multiple Checkbox Demo
    By Option1MultipleCheckbox = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[1]/input");
    public void verifyOption1MultipleCheckbox() {
        boolean option1MultipleIsEnabled = driver.findElement(Option1MultipleCheckbox).isEnabled();
        if (option1MultipleIsEnabled == true) {
            driver.findElement(Option1MultipleCheckbox).click();
            System.out.println("Option 1 button from multiple checkbox is enabled.");
        } else { System.out.println("Option 1 button from multiple checkbox is disabled.");}
    }
    By Option2MultipleCheckbox = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[2]/input");
    public void verifyOption2MultipleCheckbox() {
        boolean option2MultipleIsEnabled = driver.findElement(Option2MultipleCheckbox).isEnabled();
        if (option2MultipleIsEnabled == true) {
            driver.findElement(Option2MultipleCheckbox).click();
            System.out.println("Option 2 button from multiple checkbox is enabled.");
        } else { System.out.println("Option 2 button from multiple checkbox is disabled.");}
    }
    By Option3MultipleCheckbox = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[3]/input");
    public void verifyOption3MultipleCheckbox() {
        boolean option3MultipleIsEnabled = driver.findElement(Option3MultipleCheckbox).isEnabled();
        if (option3MultipleIsEnabled == true) {
            driver.findElement(Option3MultipleCheckbox).click();
            System.out.println("Option 3 button from multiple checkbox is enabled.");
        } else { System.out.println("Option 3 button from multiple checkbox is disabled.");}
    }
    By Option4MultipleCheckbox = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[4]/input");
    public void verifyOption4MultipleCheckbox() {
        boolean option4MultipleIsEnabled = driver.findElement(Option4MultipleCheckbox).isEnabled();
        if (option4MultipleIsEnabled == true) {
            driver.findElement(Option4MultipleCheckbox).click();
            System.out.println("Option 4 button from multiple checkbox is enabled.");
        } else { System.out.println("Option 4 button from multiple checkbox is disabled.");}
    }
    By CheckAllButton = By.id("box");
    public void clickOnCheckAllButton()  { driver.findElement(CheckAllButton).click();}

}