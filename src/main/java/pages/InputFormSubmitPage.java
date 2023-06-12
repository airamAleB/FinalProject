package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class InputFormSubmitPage extends BasePage {
    public InputFormSubmitPage(WebDriver driver) {
        super(driver);
    }

    // Locators for elements in Input Form Submit Page
    By NameField = By.id("name");
    By EmailField = By.id("inputEmail4");
    By PasswordField = By.id("inputPassword4");
    By CompanyField = By.id("company");
    By WebsiteField = By.id("websitename");
    By CountryField = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/form/div[3]/div[1]/select");
    By CountrySelected = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/form/div[3]/div[1]/select/option[16]");
    By CityField = By.id("inputCity");
    By AddressField1 = By.id("inputAddress1");
    By AddressField2 = By.id("inputAddress2");
    By StateField = By.id("inputState");
    By ZipCodeField = By.id("inputZip");
    By TheSubmitButton = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/form/div[6]/button");


    // Methods for elements in Input Form Submit Page

    public void enterName(String name){driver.findElement(NameField).sendKeys(name);}
    public void enterEmail(String email){driver.findElement(EmailField).sendKeys(email);}
    public void enterPassword(String password){driver.findElement(PasswordField).sendKeys(password);}
    public void enterCompany(String company){driver.findElement(CompanyField).sendKeys(company);}
    public void enterWebsite(String website){driver.findElement(WebsiteField).sendKeys(website);}
    public void clickOnCountryField(){driver.findElement(CountryField).click();}
    public void selectCountry(){driver.findElement(CountrySelected).click();}
    public void enterCity(String city){driver.findElement(CityField).sendKeys(city);}
    public void enterAddress1(String address1){driver.findElement(AddressField1).sendKeys(address1);}
    public void enterAddress2(String address2){driver.findElement(AddressField2).sendKeys(address2);}
    public void enterState(String state){driver.findElement(StateField).sendKeys(state);}
    public void enterZipCode(String zipcode){driver.findElement(ZipCodeField).sendKeys(zipcode);}
    public void clickOnTheSubmitButton(){driver.findElement(TheSubmitButton).click();}
}
