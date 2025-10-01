package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SecureLogin {
// 1. Webdriver
    WebDriver driver;

// 2. Constractor
    public SecureLogin(WebDriver driver) {
        this.driver = driver;
    }

// 3. Actions

    public void validateLoginSuccessfully () {
        // Assert welcome message
        Assert.assertTrue(driver.findElement(By.className("subheader")).isDisplayed());
        //  Assert URL
        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/secure");
        //  Assert Text
        Assert.assertTrue(driver.findElement(By.className("subheader")).getText().contains("Welcome to the Secure Area. When you are done click logout below."));
        //  Assert Green text
        Assert.assertTrue(driver.findElement(By.id("flash")).getText().contains("You logged into a secure area!"));
    }

}
