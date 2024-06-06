package selenium.pages;

import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.base.MainTest;


public class HomePageTest extends MainTest {

    @Test
    public void testCreateProject() throws InterruptedException {
        LoginPage loginPage = new LoginPage(); //връзка с LoginPage
        HomePage homePage = new HomePage();
        loginPage.clickSignInButton();
        loginPage.setUsernameField("irmdnv@abv.bg");
        loginPage.setPasswordField("Ramadanov87");
        loginPage.clickInnerSignInButton();
        homePage.clickGlobalCreateMenu();
        homePage.waitForElementToBeClickable();
        homePage.clickCreateNewProjectButton();

        Assert.assertEquals("Welcome to projects", homePage.getWelcomeToProjectsMessage());
    }
    @Test
    public void testRenameProject() throws InterruptedException {
        LoginPage loginPage = new LoginPage(); //връзка с LoginPage
        HomePage homePage = new HomePage();
        loginPage.clickSignInButton();
        loginPage.setUsernameField("irmdnv@abv.bg");
        loginPage.setPasswordField("Ramadanov87");
        loginPage.clickInnerSignInButton();
        homePage.clickGlobalCreateMenu();
        homePage.waitForElementToBeClickable();
        homePage.clickCreateNewProjectButton();
        homePage.clickNewProjectButton();
        homePage.waitForTemplateDialogWindow();
        homePage.closeProjectTemplateDialog();
        homePage.clickSelectProject();
        homePage.clickProjectNameField();
        homePage.clearProjectNameField();
        homePage.waitProjectNameField();
        homePage.renameProject("TestProject1");
        homePage.clickSaveProjectButton();
    }
    @Test
    public void testDeleteProject() throws InterruptedException {
        LoginPage loginPage = new LoginPage(); //връзка с LoginPage
        HomePage homePage = new HomePage();
        loginPage.clickSignInButton();
        loginPage.setUsernameField("irmdnv@abv.bg");
        loginPage.setPasswordField("Ramadanov87");
        loginPage.clickInnerSignInButton();
        homePage.clickGlobalCreateMenu();
        homePage.waitForElementToBeClickable();
        homePage.clickCreateNewProjectButton();
        homePage.clickNewProjectButton();
        homePage.waitForTemplateDialogWindow();
        homePage.closeProjectTemplateDialog();
        homePage.clickSelectProject();
        homePage.clickProjectNameField();
        homePage.clearProjectNameField();
        homePage.waitProjectNameField();
        homePage.renameProject("TestProject1");
        homePage.clickSaveProjectButton();
        homePage.clickDeleteProjectButton();
        homePage.setConfirmDeleteInput("@irmdnv87's untitled projectTestProject1");
        homePage.clickDeleteCurrentProjectButton();

        Assert.assertEquals("Your project \"@irmdnv87's untitled projectTestProject1\" was successfully deleted.", homePage.getMessageContainerForDeleteProject());
    }
    @Test
    public void testCreateRenameDeleteRepo () {
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        loginPage.clickSignInButton();
        loginPage.setUsernameField("irmdnv@abv.bg");
        loginPage.setPasswordField("Ramadanov87");
        loginPage.clickInnerSignInButton();
        homePage.clickReppoNameField();
        homePage.renameReppo("test");
        homePage.clickCreateNewReppoButton();
        homePage.clickSettingsButton();
        homePage.clickDeleteRepoButton();
        homePage.clickRepoDeleteProceedButton();
        homePage.clickRepoDeleteProceedButton();
        homePage.setRepoDeleteConfirmationField("irmdnv87/test");
        homePage.clickRepoDeleteFinalButton();
        Assert.assertEquals("Your repository \"irmdnv87/test\" was successfully deleted.", homePage.getDeleteRepoMessageContainer());
    }
}
