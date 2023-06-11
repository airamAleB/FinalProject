package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BasePage {
    protected WebDriver driver;
    private String baseUrl = "https://www.lambdatest.com/selenium-playground/";
    public BasePage() {
        // Default constructor
    }
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    @BeforeClass
    public void setUp() {
        System.setProperty("web-driver.chrome.driver", "C:\\Users\\Alexandra\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }
    /*
    @AfterMethod //we use @AfterMethod to close the browser after each test case
    public void tearDown() {
        driver.quit();
    }
     */
}
