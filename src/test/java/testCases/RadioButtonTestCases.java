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
        // Go to Radio Buttons Demo from Input Forms
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnFemaleButton();
        radioButtonPage.clickOnGetValueButton();
        Assert.assertTrue(driver.getPageSource().contains("Radio button 'Female' is checked"));
    }
    @Test
    public void verifyTheGetValueButtonWithNoOptionChecked() throws InterruptedException {
        // Go to Radio Buttons Demo from Input Forms
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonPage.clickOnGetValueButton();
        Assert.assertTrue(driver.getPageSource().contains("Radio button is Not checked"));
    }
}
