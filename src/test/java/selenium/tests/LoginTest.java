package selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.MainTest;
import selenium.pages.HomePage;
import selenium.pages.LoginPage;

public class LoginTest extends MainTest {

    @Test
    public void testEmailFieldWithMinSymbols() {
        LoginPage loginPage = new LoginPage();//връзка с LoginPage
        loginPage.clickSignUpButton();
        loginPage.setEmailInput("ir");
        loginPage.clickEmailContinueButton();

        Assert.assertEquals("Email is invalid or already taken", loginPage.getErrorMessageContainer());
    }
    @Test
    public void testEmailFieldWithInvalidSymbols() {
        LoginPage loginPage = new LoginPage();//връзка с LoginPage
        loginPage.clickSignUpButton();
        loginPage.setEmailInput("user@exa mple.com");
        loginPage.clickEmailContinueButton();

        Assert.assertEquals("Email is invalid or already taken", loginPage.getErrorMessageContainer());
    }
    @Test
    public void testEmailFieldWithoutDomain() {
        LoginPage loginPage = new LoginPage();//връзка с LoginPage
        loginPage.clickSignUpButton();
        loginPage.setEmailInput(" user@");
        loginPage.clickEmailContinueButton();

        Assert.assertEquals("Email is invalid or already taken", loginPage.getErrorMessageContainer());
    }
    @Test
    public void testPasswordFieldWithMinSymbols() throws InterruptedException {
        LoginPage loginPage = new LoginPage();//връзка с LoginPage
        loginPage.clickSignUpButton();
        loginPage.setEmailInput("user@mail.example.com");
        loginPage.waitForElementToBeVisible();
        loginPage.clickEmailContinueButton();
        loginPage.waitForPasswordFieldToBeVisible();
        loginPage.setPasswordInput("123");

        Assert.assertEquals("Password is too short", loginPage.getPasswordErrorMessageContainer());
    }
    @Test
    public void testPasswordFieldWithMaxSymbols() throws InterruptedException {
        LoginPage loginPage = new LoginPage();//връзка с LoginPage
        loginPage.clickSignUpButton();
        loginPage.setEmailInput("user@mail.example.com");
        loginPage.waitForElementToBeVisible();
        loginPage.clickEmailContinueButton();
        loginPage.waitForPasswordFieldToBeVisible();
        loginPage.setPasswordInput("123ksjdowerokswoirjdkeroslkdoeidkjfo1547865412365478965412lkasdfghjklmxncbeoksier");

        Assert.assertEquals("Password is too long", loginPage.getPasswordErrorMessageContainer());
    }
    @Test
    public void testPasswordFieldWithoutNumber() throws InterruptedException {
        LoginPage loginPage = new LoginPage();//връзка с LoginPage
        loginPage.clickSignUpButton();
        loginPage.setEmailInput("user@mail.example.com");
        loginPage.waitForElementToBeVisible();
        loginPage.clickEmailContinueButton();
        loginPage.waitForPasswordFieldToBeVisible();
        loginPage.setPasswordInput("asdfglka");

        Assert.assertEquals("Password needs a number and lowercase letter", loginPage.getPasswordMessageNeedNumber());
    }
    @Test
    public void testPasswordFieldWithCompromisedData() throws InterruptedException {
        LoginPage loginPage = new LoginPage();//връзка с LoginPage
        loginPage.clickSignUpButton();
        loginPage.setEmailInput("user@mail.example.com");
        loginPage.waitForElementToBeVisible();
        loginPage.clickEmailContinueButton();
        loginPage.waitForPasswordFieldToBeVisible();
        loginPage.setPasswordInput("asdfasd1");

        Assert.assertEquals("Password may be compromised", loginPage.getPasswordMessageNeedNumber());
    }
    @Test
    public void testUsernameFieldWithNotAvailableData() {
        LoginPage loginPage = new LoginPage();//връзка с LoginPage
        loginPage.clickSignUpButton();
        loginPage.setEmailInput("user@mail.example.com");
        loginPage.waitForElementToBeVisible();
        loginPage.clickEmailContinueButton();
        loginPage.waitForPasswordFieldToBeVisible();
        loginPage.setPasswordInput("iramadanov87");
        loginPage.waitForPasswordFieldContinueButton();
        loginPage.clickPasswordContinueButton();
        loginPage.setUsernameInput("a");

        Assert.assertEquals("Username a is not available.", loginPage.getUsernameErrorMessage());
    }
    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage(); //връзка с LoginPage
        HomePage homePage = new HomePage();
        loginPage.clickSignInButton();
        loginPage.setUsernameField("irmdnv@abv.bg");
        loginPage.setPasswordField("Ramadanov87");
        loginPage.clickInnerSignInButton();

        Assert.assertEquals("Home", homePage.getHomePageVerification());
    }

}

