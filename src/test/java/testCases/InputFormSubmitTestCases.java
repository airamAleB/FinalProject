package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.InputFormSubmitPage;
import pages.RadioButtonPage;

public class InputFormSubmitTestCases extends BasePage {
    private InputFormSubmitPage inputFormSubmitPage;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        inputFormSubmitPage = new InputFormSubmitPage(driver);
    }
    /*
    @Test
    public void fillTheFormWithValidDataForAllInputs() throws InterruptedException {
        // Go to Input Form Submit from the menu
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/ul/li[4]/a")).click();
        inputFormSubmitPage.enterName("Danny Cad");
        inputFormSubmitPage.enterEmail("dannycad@mail.com");
        inputFormSubmitPage.enterPassword("dc12!");
        inputFormSubmitPage.enterCompany("Bluebird");
        inputFormSubmitPage.enterWebsite("bluebird.com");
        inputFormSubmitPage.clickOnCountryField();
        inputFormSubmitPage.selectCountry();
        inputFormSubmitPage.enterCity("Vienna");
        inputFormSubmitPage.enterAddress1("Poplar st.");
        inputFormSubmitPage.enterAddress2("Willow st.");
        inputFormSubmitPage.enterState("Austria");
        inputFormSubmitPage.enterZipCode("433224");
        inputFormSubmitPage.clickOnTheSubmitButton();
        Assert.assertTrue(driver.getPageSource().contains("Thanks for contacting us, we will get back to you shortly."));
    }*/

    @Test
    public void fillTheFormWithMissingAddressAndCity() throws InterruptedException {
        // Go to Input Form Submit from the menu
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/ul/li[4]/a")).click();
        inputFormSubmitPage.enterName("Danny Cad");
        inputFormSubmitPage.enterEmail("dannycad@mail.com");
        inputFormSubmitPage.enterPassword("dc12!");
        inputFormSubmitPage.enterCompany("Bluebird");
        inputFormSubmitPage.enterWebsite("bluebird.com");
        inputFormSubmitPage.clickOnCountryField();
        inputFormSubmitPage.selectCountry();
        inputFormSubmitPage.enterState("Austria");
        inputFormSubmitPage.enterZipCode("433224");
        inputFormSubmitPage.clickOnTheSubmitButton();
        Assert.assertTrue(driver.getPageSource().contains("Thanks for contacting us, we will get " +
                "back to you shortly."), "Missing address and city");
    }

}
