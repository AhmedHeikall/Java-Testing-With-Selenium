package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @AfterClass
    public void tearDown() {
        //  driver.quit();
    }

    @Test
    public void testLogin() {
      WebElement username =  driver.findElement(By.id("username"));
      username.sendKeys("tomsmith");

      WebElement password =  driver.findElement(By.id("password"));
      password.sendKeys("SuperSecretPassword!");

      WebElement button = driver.findElement(By.tagName("button"));
      button.click();

      try {
          Thread.sleep(2000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

      WebElement logoutBtn = driver.findElement(By.xpath("//a[@href=\"/logout\"]"));
      Assert.assertTrue(logoutBtn.isDisplayed(),"Login button is not displayed");
    }
}
