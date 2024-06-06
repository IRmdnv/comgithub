package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.base.BasePage;

public class HomePage extends BasePage {
    @FindBy(xpath = "//*[@data-target='feed-container.feedTitle']")
    private WebElement home;

    @FindBy(xpath = "//*[@id=\"global-create-menu-anchor\"]")
    private WebElement globalCreateMenu;

    @FindBy(xpath = "//*[contains(@id, ':ra:--label')]")
    private WebElement createNewProjectButton;

    @FindBy(xpath = "//*[contains(@class, 'mb-1 f2')]")
    private WebElement welcomeToProjectsMessage;

    @FindBy(xpath = "//*[@id=\"user-projects-list\"]/div[3]/form/div/button")
    private WebElement newProjectButton;
    @FindBy(xpath = "//*[contains(@class, 'types__StyledButton-sc-ws60qy-0 dMUxwi Dialog__DialogCloseButton-sc-uaxjsn-7 boGwmw')]")
    private WebElement prjectTemplateDialogCloseButton;

    @FindBy(xpath = "//*[contains(@class, 'Text-sc-17v1xeu-0 cwKGMJ')]")
    private WebElement selectProject;
    @FindBy(xpath = "//*[@id='settings-project-name']")
    private WebElement renameProjectField;
    @FindBy(xpath = "//*[@data-testid='save-project-settings-button']")
    private WebElement saveProjectButton;
    @FindBy(xpath = "//*[contains(@data-testid, 'delete-project-button')]")
    private WebElement deleteProjectButton;
    @FindBy(xpath = "//*[contains(@data-testid, 'confirm-delete-input')]")
    private WebElement confirmDeleteInput;
    @FindBy(xpath = "//*[contains(@class, 'types__StyledButton-sc-ws60qy-0 dJrpzm')]")
    private WebElement deleteCurrentProjectButton;
    @FindBy(xpath = "//*[contains(@class, 'js-flash-alert')]")
    private WebElement messageContainerForDeleteProject;
    public String getHomePageVerification() {
        return home.getText();
    }
    public void clickGlobalCreateMenu() {
        globalCreateMenu.click();
    }
    public void clickCreateNewProjectButton() {
        createNewProjectButton.click();
    }
    public void waitForElementToBeClickable() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id, ':ra:--label')]")));
    }
    public String getWelcomeToProjectsMessage() {
        return welcomeToProjectsMessage.getText();
    }
    public void clickNewProjectButton() {
        newProjectButton.click();
    }
    public void closeProjectTemplateDialog() {
        prjectTemplateDialogCloseButton.click();
    }
    public void waitForTemplateDialogWindow() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class, 'types__StyledButton-sc-ws60qy-0 dMUxwi Dialog__DialogCloseButton-sc-uaxjsn-7 boGwmw')]")));
    }
    public void clickSelectProject() {
        selectProject.click();
    }
    public void renameProject(String rename) {
        renameProjectField.sendKeys(rename);
    }
    public void waitProjectNameField() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='settings-project-name']")));
    }
    public void clickProjectNameField() {
        renameProjectField.click();
    }
    public void clearProjectNameField() {
        renameProjectField.clear();
    }
    public void clickSaveProjectButton() {
        saveProjectButton.click();
    }
    public void clickDeleteProjectButton() {
        deleteProjectButton.click();
    }
    public void setConfirmDeleteInput(String confirm) {
        confirmDeleteInput.sendKeys(confirm);
    }
    public void clickDeleteCurrentProjectButton() {
        deleteCurrentProjectButton.click();
    }
    public String getMessageContainerForDeleteProject() {
        return messageContainerForDeleteProject.getText();
    }
    @FindBy(xpath = "//*[contains(@name, 'repository[name]')]")
    private WebElement reppoNameField;
    @FindBy(xpath = "//*[contains(@class, 'FormField-input flex-self-start Button--primary Button--medium Button f6')]")
    private WebElement createNewReppoButton;
    @FindBy(xpath = "//*[contains(@id, 'settings-tab')]")
    private WebElement settingsButton;
    @FindBy(xpath = "//*[contains(@id, 'dialog-show-repo-delete-menu-dialog')]")
    private WebElement deleteRepoButton;
    @FindBy(xpath = "//*[contains(@id, 'repo-delete-proceed-button-container')]")
    private WebElement repoDeleteProceedButton;
    @FindBy(xpath = "//*[contains(@data-test-selector, 'repo-delete-proceed-confirmation')]")
    private WebElement repoDeleteConfirmationField;
    @FindBy(xpath = "//*[contains(@data-test-selector, 'repo-delete-proceed-button')]")
    private WebElement repoDeleteFinalButton;
    @FindBy(xpath = "//*[contains(@class, 'js-flash-alert')]")
    private WebElement deleteRepoMessageContainer;
    public void clickReppoNameField() {
        reppoNameField.click();
    }
    public void renameReppo(String rename) {
        reppoNameField.sendKeys(rename);
    }
    public void clickCreateNewReppoButton() {
        createNewReppoButton.click();
    }
    public void clickSettingsButton() {
        settingsButton.click();
    }
    public void clickDeleteRepoButton() {
        deleteRepoButton.click();
    }
    public void clickRepoDeleteProceedButton() {
        repoDeleteProceedButton.click();
    }
    public void setRepoDeleteConfirmationField(String confirm) {
        repoDeleteConfirmationField.sendKeys(confirm);
    }
    public void clickRepoDeleteFinalButton() {
        repoDeleteFinalButton.click();
    }
    public String getDeleteRepoMessageContainer() {
        return deleteRepoMessageContainer.getText();
    }
}
