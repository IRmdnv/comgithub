package selenium.tests;

import org.testng.annotations.Test;
import selenium.base.MainTest;
import selenium.pages.LoginPage;

public class SignInTest extends MainTest {


    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage();//връзка с LoginPage
       // SignInPage signInPage = new SignInPage();
        loginPage.clickSignInButton();
        loginPage.setUsernameField("irmdnv@abv.bg");
        loginPage.setPasswordField("Ramadanov87");
        loginPage.clickInnerSignInButton();
        loginPage.waitForBurgerMenuToBeVisible();
       // Assert.assertTrue(burgerMenuIcon.isDisplayed());




        // Assert.assertEquals("Username a is not available.", loginPage.getUsernameErrorMessage());
    }
}
