package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RadioButtonPage extends BasePage {
    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }

    //Locators and methods for elements in Radio Button Demo Page
    By MaleButton = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/label[1]");
    public void clickOnMaleButton(){driver.findElement(MaleButton).click();}
    By FemaleButton = By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div/div[1]/div/label[2]");
    public void clickOnFemaleButton(){driver.findElement(FemaleButton).click();}
    By GetValueButton = By.id("buttoncheck");
    public void clickOnGetValueButton(){driver.findElement(GetValueButton).click();}

    //Disabled Checkbox
    By Checkbox1Button = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div/div/div/div[1]/label/input");
    public void clickOnCheckbox1Button(){
        boolean Checkbox1ButtonIsEnabled = driver.findElement(Checkbox1Button).isEnabled();
        if (Checkbox1ButtonIsEnabled == true) {
            driver.findElement(Checkbox1Button).click();
            System.out.println("Checkbox 1 button is enabled.");
        } else { System.out.println("Checkbox 1 button is disabled.");}
    }
    By Checkbox2Button = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div/div/div/div[2]/label/input");
    public void clickOnCheckbox2Button(){
        boolean Checkbox2ButtonIsEnabled = driver.findElement(Checkbox2Button).isEnabled();
        if (Checkbox2ButtonIsEnabled == true) {
            driver.findElement(Checkbox2Button).click();
            System.out.println("Checkbox 2 button is enabled.");
        } else { System.out.println("Checkbox 2 button is disabled.");}
    }
    By Checkbox3Button = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[2]/div/div/div/div[3]/label/input");
    public void clickOnDisabledCheckboxButton(){
        boolean Checkbox3ButtonIsEnabled = driver.findElement(Checkbox3Button).isEnabled();
        if (Checkbox3ButtonIsEnabled == true) {
            driver.findElement(Checkbox3Button).click();
            System.out.println("Checkbox 3 button is enabled.");
        } else { System.out.println("Checkbox 3 button is disabled.");}
    }

    //Gender and Age values
    By GenderMaleButton = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[1]/input");
    public void clickOnGenderMaleButton(){driver.findElement(GenderMaleButton).click();}
    By GenderFemaleButton = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[2]/input");
    public void clickOnGenderFemaleButton(){driver.findElement(GenderFemaleButton).click();}
    By GenderOtherButton = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[1]/label[3]/input");
    public void clickOnGenderOtherButton(){driver.findElement(GenderOtherButton).click();}
    By Age0To5Button = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[1]/input");
    public void clickOnAge0To5Button(){driver.findElement(Age0To5Button).click();}
    By Age5To15Button = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[2]/input");
    public void clickOnAge5To15Button(){driver.findElement(Age5To15Button).click();}
    By Age15To50Button = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/div[2]/label[3]/input");
    public void clickOnAge15To50Button(){driver.findElement(Age15To50Button).click();}
    By GetGenderAndAgeValuesButton = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/button");
    public void clickOnGetGenderAndAgeValuesButton(){driver.findElement(GetGenderAndAgeValuesButton).click();}

}
