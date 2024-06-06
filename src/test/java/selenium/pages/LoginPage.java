package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.base.BasePage;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//*[contains(@class, 'HeaderMenu-link HeaderMenu-link--sign-up flex-shrink-0 d-none d-lg-inline-block no-underline border color-border-default rounded px-2 py-1')]")
    private WebElement signUpButton;

    @FindBy(id="email")
    private WebElement emailInput;

    @FindBy(id="password")
    private WebElement passwordInput;

    @FindBy(id="login")
    private WebElement usernameInput;

    @FindBy(xpath = "//*[@id=\"email-container\"]/div[2]/button")
    private  WebElement emailContinueButton;

    @FindBy(xpath = "//*[contains(@data-continue-to, 'username-container')]")
    private WebElement passwordContinueButton;

    @FindBy(xpath = "//p[contains(@class, 'password-validity-summary password-validity-summary-fail mb-1')]")
    private WebElement passwordErrorMessageContainer;
    @FindBy(xpath = "//p[contains(@class, 'password-validity-summary password-validity-summary-close mb-1')]")
    private WebElement passwordMessageNeedNumber;

    @FindBy(xpath = "//*[contains(@class, 'mb-0')]")
    private WebElement errorMessageContainer;

    @FindBy(xpath = "//*[contains(@class, 'm-1')]")
    private WebElement usernameErrorMessage;

    public void setEmailInput(String email) {
        emailInput.sendKeys(email);
    }
    public void setPasswordInput(String password) {
        passwordInput.sendKeys(password);
    }

    public void setUsernameInput(String username) {
        usernameInput.sendKeys(username);
    }
    public void clickSignUpButton() {
        signUpButton.click();
    }
    public void clickEmailContinueButton() {
        emailContinueButton.click();
    }
    public String getErrorMessageContainer() {
        return errorMessageContainer.getText();
    }
    public String getPasswordErrorMessageContainer() {
        return passwordErrorMessageContainer.getText();
    }
    public String getPasswordMessageNeedNumber() {
        return passwordMessageNeedNumber.getText();
    }

    public String getUsernameErrorMessage() {
        return usernameErrorMessage.getText();
    }
    public void clickPasswordContinueButton() {
    passwordContinueButton.click();
    }

    public void waitForElementToBeVisible() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"email-container\"]/div[2]/button")));
    }
    public void waitForPasswordFieldToBeVisible() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
    }
    public void waitForPasswordFieldContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@data-continue-to, 'username-container')]")));
    }

    @FindBy(xpath = "//*[contains(@class, 'HeaderMenu-link HeaderMenu-link--sign-in flex-shrink-0 no-underline d-block d-lg-inline-block border border-lg-0 rounded rounded-lg-0 p-2 p-lg-0')]")
    private WebElement signInButton;
    @FindBy(id="login_field")
    private WebElement usernameField;
    @FindBy(id="password")
    private WebElement passwordField;
    @FindBy(xpath = "//*[@name='commit']")
    private WebElement innerSignInButton;
    public void waitForBurgerMenuToBeVisible() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id ='dialog-show-dialog-83183a0b-1777-49a8-af83-d8980c287b8c']")));
    }
    public void clickSignInButton() {
        signInButton.click();
    }
    public void setUsernameField(String username) {
        usernameField.sendKeys(username);
    }
    public void setPasswordField(String password) {
        passwordField.sendKeys(password);
    }
    public void clickInnerSignInButton() {
        innerSignInButton.click();
    }
}
