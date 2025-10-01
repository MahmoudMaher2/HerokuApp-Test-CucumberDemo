package StepDefs;

import Pages.LoginPage;
import Pages.SecureLogin;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login_StepDef {
    // 1. Pages
        LoginPage loginPage_object;
        SecureLogin secureLogin_object;

    // 2. Constractor of definition pages
        public Login_StepDef() {
            loginPage_object = new LoginPage(Hooks.driver);
            secureLogin_object = new SecureLogin(Hooks.driver);
         }

    // 3. Steps
        @Given("User Navigate To Login Page")
        public void UserNavigateToLoginPage (){
            loginPage_object.navigateLoginPage();
        }

        @And("User Clicks login Button")
        public void userClicksLoginButton() {
            loginPage_object.clickLoginButton();
        }

        @Then("User Should Login Successfully")
        public void userShouldLoginSuccessfully() {
            secureLogin_object.validateLoginSuccessfully();
        }

        @When("User enters Username {string}")
        public void userEntersUsername(String username) {
            loginPage_object.enterUsername(username);
        }

        @And("User enters Password {string}")
        public void userEntersPassword(String password) {
            loginPage_object.enterPassword(password);
        }

        @Then("Error Message is appeared")
        public void errorMessageIsAppeared() {
            loginPage_object.errormessage();
        }

    @When("User Login with Credentials {string} {string}")
    public void userLoginWithCredentials(String username, String password) {
        loginPage_object.enterUsername(username);
        loginPage_object.enterPassword(password);
        loginPage_object.clickLoginButton();
    }

}
