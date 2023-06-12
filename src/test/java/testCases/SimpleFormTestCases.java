package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.RadioButtonPage;
import pages.SimpleFormPage;

public class SimpleFormTestCases extends BasePage {
    private SimpleFormPage simpleFormPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        simpleFormPage = new SimpleFormPage(driver);
    }

    // Single Input Field
    @Test
    public void verifyTheSingleInputFieldWithCharactersWithoutSpace() throws InterruptedException {
        // Go to Simple Form Demo from Input Forms
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.verifySingleInputField("America");
        simpleFormPage.clickOnGetCheckedValueButton();
        Assert.assertTrue(driver.getPageSource().contains("America"));
    }
    @Test
    public void verifyTheSingleInputFieldWithCharactersAndSpace() throws InterruptedException {
        // Go to Simple Form Demo from Input Forms
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.verifySingleInputField("South America is a continent");
        simpleFormPage.clickOnGetCheckedValueButton();
        Assert.assertTrue(driver.getPageSource().contains("South America is a continent"));
    }
    @Test
    public void verifyTheSingleInputFieldWithIntNumbers() throws InterruptedException {
        // Go to Simple Form Demo from Input Forms
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.verifySingleInputField("1997");
        simpleFormPage.clickOnGetCheckedValueButton();
        Assert.assertTrue(driver.getPageSource().contains("1997"));
    }
    @Test
    public void verifyTheSingleInputFieldWithDoubleNumbers() throws InterruptedException {
        // Go to Simple Form Demo from Input Forms
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.verifySingleInputField("19.97");
        simpleFormPage.clickOnGetCheckedValueButton();
        Assert.assertTrue(driver.getPageSource().contains("19.97"));
    }
    @Test
    public void verifyTheSingleInputFieldWithSpecialCharacters() throws InterruptedException {
        // Go to Simple Form Demo from Input Forms
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.verifySingleInputField("/@#!");
        simpleFormPage.clickOnGetCheckedValueButton();
        Assert.assertTrue(driver.getPageSource().contains("/@#!"));
    }
    @Test
    public void verifyTheSingleInputFieldWithCharactersAndNumbersAndSpecialCharacters() throws InterruptedException {
        // Go to Simple Form Demo from Input Forms
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.verifySingleInputField("@Hello there you 2!");
        simpleFormPage.clickOnGetCheckedValueButton();
        Assert.assertTrue(driver.getPageSource().contains("@Hello there you 2!"));
    }

    //Two Input Field
    @Test
    public void verifyTheTwoInputFieldWithTwoPositiveIntNumbers() throws InterruptedException {
        // Go to Simple Form Demo from Input Forms
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.verifyEnterFirstValueField("3");
        simpleFormPage.verifyEnterSecondValueField("2");
        simpleFormPage.clickOnGetSumButton();
        Assert.assertTrue(driver.getPageSource().contains("5"));
    }

    @Test
    public void verifyTheTwoInputFieldWithTwoNegativeIntNumbers() throws InterruptedException {
        // Go to Simple Form Demo from Input Forms
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.verifyEnterFirstValueField("-3");
        simpleFormPage.verifyEnterSecondValueField("-2");
        simpleFormPage.clickOnGetSumButton();
        Assert.assertTrue(driver.getPageSource().contains("-5"));
    }
    @Test
    public void verifyTheTwoInputFieldWithTwoPositiveDoubleNumbers() throws InterruptedException {
        // Go to Simple Form Demo from Input Forms
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.verifyEnterFirstValueField("10.5");
        simpleFormPage.verifyEnterSecondValueField("2.33");
        simpleFormPage.clickOnGetSumButton();
        Assert.assertFalse(driver.getPageSource().contains("12.83"));
    }
    @Test
    public void verifyTheTwoInputFieldWithTwoNegativeDoubleNumbers() throws InterruptedException {
        // Go to Simple Form Demo from Input Forms
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.verifyEnterFirstValueField("-3.7");
        simpleFormPage.verifyEnterSecondValueField("-2.22");
        simpleFormPage.clickOnGetSumButton();
        Assert.assertFalse(driver.getPageSource().contains("-5.92"));
    }

    @Test
    public void verifyTheTwoInputFieldWithTwoCharactersInsteadOfTwoNumbers() throws InterruptedException {
        // Go to Simple Form Demo from Input Forms
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.verifyEnterFirstValueField("B");
        simpleFormPage.verifyEnterSecondValueField("C");
        simpleFormPage.clickOnGetSumButton();
        Assert.assertTrue(driver.getPageSource().contains("Entered value is not a number"));
    }
    @Test
    public void verifyTheTwoInputFieldWithOneCharacterAndOneNumber() throws InterruptedException {
        // Go to Simple Form Demo from Input Forms
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.verifyEnterFirstValueField("B");
        simpleFormPage.verifyEnterSecondValueField("52");
        simpleFormPage.clickOnGetSumButton();
        Assert.assertTrue(driver.getPageSource().contains("Entered value is not a number"));
    }


    @Test
    public void verifyTheTwoInputFieldWithTwoSpecialCharactersInsteadOfTwoNumbers() throws InterruptedException {
        // Go to Simple Form Demo from the menu
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        simpleFormPage.verifyEnterFirstValueField("%");
        simpleFormPage.verifyEnterSecondValueField(",");
        simpleFormPage.clickOnGetSumButton();
        Assert.assertTrue(driver.getPageSource().contains("Entered value is not a number"));
    }
}