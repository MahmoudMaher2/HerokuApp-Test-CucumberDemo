package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
// 1. Webdriver
        WebDriver driver;

// 2. construct
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

// 3. Actions

    // Navigate Login Page
    public void navigateLoginPage (){
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }

    // username
    public void enterUsername (String username){
        driver.findElement(By.id("username")).sendKeys(username);
    }
    // password
    public void enterPassword (String password){
        driver.findElement(By.id("password")).sendKeys(password);
    }
    // Login Button
    public void clickLoginButton (){
        driver.findElement(By.className("radius")).click();
    }
    // Error message
    public void errormessage (){
       Assert.assertTrue(driver.findElement(By.id("flash")).isDisplayed());
    }
}
