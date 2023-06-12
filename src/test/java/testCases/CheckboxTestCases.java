package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.CheckboxPage;

public class CheckboxTestCases extends BasePage {
    private CheckboxPage checkboxPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkboxPage = new CheckboxPage(driver);
    }

    //Single Checkbox Demo
    @Test
    public void verifyTheSingleCheckboxButton() throws InterruptedException {
        // Go to Checkbox Demo from the menu
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnSingleCheckboxButton();
        Assert.assertTrue(driver.getPageSource().contains("Checked"));
    }

    //Disabled Checkbox Demo
    @Test
    public void verifyIfOption1CheckboxButtonIsEnabled() throws InterruptedException {
        // Go to Checkbox Demo from the menu
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.verifyOption1EnabledButton();
    }
    @Test
    public void verifyIfOption2CheckboxButtonIsEnabled() throws InterruptedException {
        // Go to Checkbox Demo from the menu
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.verifyOption2EnabledButton();
    }
    @Test
    public void verifyIfOption3CheckboxButtonIsEnabled() throws InterruptedException {
        // Go to Checkbox Demo from the menu
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.verifyOption3EnabledButton();
    }
    @Test
    public void verifyIfOption4CheckboxButtonIsEnabled() throws InterruptedException {
        // Go to Checkbox Demo from the menu
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.verifyOption4EnabledButton();
    }

    //Multiple Checkbox Demo
    @Test
    public void verifyIfOption1FromMultipleCheckboxIsEnabled() throws InterruptedException {
        // Go to Checkbox Demo from the menu
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.verifyOption1MultipleCheckbox();
    }
    @Test
    public void verifyIfOption2FromMultipleCheckboxIsEnabled() throws InterruptedException {
        // Go to Checkbox Demo from the menu
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.verifyOption2MultipleCheckbox();
    }
    @Test
    public void verifyIfOption3FromMultipleCheckboxIsEnabled() throws InterruptedException {
        // Go to Checkbox Demo from the menu
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.verifyOption3MultipleCheckbox();
    }
    @Test
    public void verifyIfOption4FromMultipleCheckboxIsEnabled() throws InterruptedException {
        // Go to Checkbox Demo from the menu
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.verifyOption4MultipleCheckbox();
    }
    @Test
    public void clickOnCheckAllButtonInMultipleCheckboxDemo() throws InterruptedException {
        // Go to Checkbox Demo from the menu
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnCheckAllButton();
        Assert.assertTrue(driver.getPageSource().contains("Uncheck All"));
    }

}
