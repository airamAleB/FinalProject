package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.KeyPressPage;
import pages.BasePage;

public class KeyPressTestCases extends BasePage {
    private KeyPressPage keyPressPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        keyPressPage = new KeyPressPage(driver);
    }

    @Test
    public void verifyKeyFieldWithBackspaceKey() throws InterruptedException {
        // Go to Key Press from the menu
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/ul/li[5]/a")).click();
        keyPressPage.verifyKeyField1();
        WebElement output = driver.findElement(By.id("result"));
        String expectedOutput = "You entered: BACK_SPACE";
        String actualOutput = output.getText();
        Assert.assertEquals(expectedOutput, actualOutput, "The result is incorrect.");
    }
    @Test
    public void verifyKeyFieldWithOneCharacter() throws InterruptedException {
        // Go to Key Press from the menu
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/ul/li[5]/a")).click();
        keyPressPage.verifyKeyField2("Y");
        WebElement output = driver.findElement(By.id("result"));
        String expectedOutput = "You entered: Y";
        String actualOutput = output.getText();
        Assert.assertEquals(expectedOutput, actualOutput, "The result is incorrect.");
    }
    @Test
    public void verifyKeyFieldWithOneDigitKey() throws InterruptedException {
        // Go to Key Press from the menu
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/ul/li[5]/a")).click();
        keyPressPage.verifyKeyField2("8");
        WebElement output = driver.findElement(By.id("result"));
        String expectedOutput = "You entered: 8";
        String actualOutput = output.getText();
        Assert.assertEquals(expectedOutput, actualOutput, "The result is incorrect.");
    }
    @Test
    public void verifyKeyFieldWithMoreLettersToReturnTheLastKey() throws InterruptedException {
        //The last letter should be returned
        // Go to Key Press from the menu
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/ul/li[5]/a")).click();
        keyPressPage.verifyKeyField2("RaTBV");
        WebElement output = driver.findElement(By.id("result"));
        String expectedOutput = "You entered: V";
        String actualOutput = output.getText();
        Assert.assertEquals(expectedOutput, actualOutput, "The result is incorrect.");
    }
}