package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utils.ScreenshotUtil;

import java.io.IOException;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            ScreenshotUtil.takeScreenshot(driver, scenario.getName());
        }
        driver.quit();
    }

    @Given("User is on the login page")
    public void user_is_on_login_page() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @When("User enters username {string} and password {string}")
    public void enter_credentials(String user, String pass) {
        loginPage.enterUsername(user);
        loginPage.enterPassword(pass);
        loginPage.clickLogin();
    }

    @Then("User should see message {string}")
    public void verify_flash_message(String expected) {
        String actual = loginPage.getFlashMessage();
        Assert.assertTrue(actual.contains(expected));
    }

    @And("User clicks on logout button")
    public void user_clicks_on_logout_button() {
        loginPage.clickLogout();
    }

    @Then("User should see logout success message {string}")
    public void verify_logout_message(String expected) {
        String actual = loginPage.getFlashMessage();
        Assert.assertTrue(actual.contains(expected));
    }

    @Then("Page title should be {string}")
    public void pageTitleShouldBe(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("URL should contain {string}")
    public void urlShouldContain(String expectedUrlPart) {
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrlPart));
    }

    @Then("Login button should be enabled")
    public void loginButtonShouldBeEnabled() {
        Assert.assertTrue(loginPage.isLoginButtonEnabled());
    }

    @Then("Username and password fields should be displayed")
    public void usernameAndPasswordFieldsShouldBeDisplayed() {
        Assert.assertTrue(loginPage.isUsernameFieldDisplayed());
        Assert.assertTrue(loginPage.isPasswordFieldDisplayed());
    }

    @Then("Flash message should be displayed")
    public void flashMessageShouldBeDisplayed() {
        Assert.assertTrue(loginPage.isFlashMessageDisplayed());
    }
}