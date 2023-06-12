package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.RadioButtonPage;

public class RadioButtonTestCases extends BasePage {
    private RadioButtonPage radioButtonPage;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        radioButtonPage = new RadioButtonPage(driver);
    }

    @Test
    public void verifyTheMaleButton() throws InterruptedException {
        // Go to Radio Buttons Demo from the menu
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnMaleButton();
        radioButtonPage.clickOnGetValueButton();
        Assert.assertTrue(driver.getPageSource().contains("Radio button 'Male' is checked"));
    }
    @Test
    public void verifyTheFemaleButton() throws InterruptedException {
        // Go to Radio Buttons Demo from the menu
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnFemaleButton();
        radioButtonPage.clickOnGetValueButton();
        Assert.assertTrue(driver.getPageSource().contains("Radio button 'Female' is checked"));
    }
    @Test
    public void verifyTheGetValueButtonWithNoOptionChecked() throws InterruptedException {
        // Go to Radio Buttons Demo from the menu
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnGetValueButton();
        Assert.assertTrue(driver.getPageSource().contains("Radio button is Not checked"));
    }

    //Disabled Checkbox
    @Test
    public void verifyIfCheckbox1ButtonIsEnabled() throws InterruptedException {
        // Go to Radio Buttons Demo from the menu
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnCheckbox1Button();
    }
    @Test
    public void verifyIfCheckbox2ButtonIsEnabled() throws InterruptedException {
        // Go to Radio Buttons Demo from the menu
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnCheckbox2Button();
    }
    @Test
    public void verifyTheDisabledCheckboxButton() throws InterruptedException {
        // Go to Radio Buttons Demo from the menu
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnDisabledCheckboxButton();
    }

    //Gender and Age values
    @Test
    public void clickOnGenderMaleAndAge5To15AndGetValuesButton() throws InterruptedException {
        // Go to Radio Buttons Demo from the menu
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnGenderMaleButton();
        radioButtonPage.clickOnAge5To15Button();
        radioButtonPage.clickOnGetGenderAndAgeValuesButton();
        WebElement genderOutput = driver.findElement(By.xpath("/html/body/div[1]" +
                "/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span"));
        String actualGenderOutput = genderOutput.getText();
        String expectedGenderOutput = "Male";
        Assert.assertEquals(expectedGenderOutput, actualGenderOutput, "The output for gender is incorrect.");
        WebElement ageOutput = driver.findElement(By.xpath("/html/body/div[1]" +
                "/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span"));
        String actualAgeOutput = ageOutput.getText();
        String expectedAgeOutput = "5 - 15";
        Assert.assertEquals(expectedAgeOutput, actualAgeOutput, "The output for age is incorrect.");
    }
    @Test
    public void clickOnGenderFemaleAndNoAgeAndGetValuesButton() throws InterruptedException {
        // Go to Radio Buttons Demo from the menu
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnGenderFemaleButton();
        radioButtonPage.clickOnGetGenderAndAgeValuesButton();
        WebElement genderOutput = driver.findElement(By.xpath("/html/body/div[1]" +
                "/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span"));
        String actualGenderOutput = genderOutput.getText();
        String expectedGenderOutput = "Female";
        Assert.assertEquals(expectedGenderOutput, actualGenderOutput, "The output for gender is incorrect.");
        WebElement ageOutput = driver.findElement(By.xpath("/html/body/div[1]" +
                "/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span"));
        String actualAgeOutput = ageOutput.getText();
        String expectedAgeOutput = "";
        Assert.assertEquals(expectedAgeOutput, actualAgeOutput, "The output for age should be empty.");
    }

    @Test
    public void clickOnGetValuesButtonWithNoGenderAndNoAgeSelected() throws InterruptedException {
        // Go to Radio Buttons Demo from the menu
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnGetGenderAndAgeValuesButton();
        WebElement genderOutput = driver.findElement(By.xpath("/html/body/div[1]" +
                "/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[1]/span"));
        String actualGenderOutput = genderOutput.getText();
        String expectedGenderOutput = "";
        Assert.assertEquals(expectedGenderOutput, actualGenderOutput, "The output for gender should be empty.");
        WebElement ageOutput = driver.findElement(By.xpath("/html/body/div[1]" +
                "/div/section[2]/div/div/div/div[3]/div/div/div[2]/p[2]/span"));
        String actualAgeOutput = ageOutput.getText();
        String expectedAgeOutput = "";
        Assert.assertEquals(expectedAgeOutput, actualAgeOutput, "The output for age should be empty.");
    }

}
