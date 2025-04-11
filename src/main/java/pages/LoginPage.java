package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By username = By.id("username");
    private By password = By.id("password");
    private By loginButton = By.cssSelector("button[type='submit']");
    private By flashMessage = By.id("flash");
    private By logoutButton = By.cssSelector("a[href='/logout']");

    public void enterUsername(String user) {
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getFlashMessage() {
        return driver.findElement(flashMessage).getText();
    }

    public void clickLogout() {
        driver.findElement(logoutButton).click();
    }

    public boolean isLoginButtonEnabled() {
        return driver.findElement(loginButton).isEnabled();
    }

    public boolean isUsernameFieldDisplayed() {
        return driver.findElement(username).isDisplayed();
    }

    public boolean isPasswordFieldDisplayed() {
        return driver.findElement(password).isDisplayed();
    }

    public boolean isFlashMessageDisplayed() {
        return driver.findElement(flashMessage).isDisplayed();
    }
}
