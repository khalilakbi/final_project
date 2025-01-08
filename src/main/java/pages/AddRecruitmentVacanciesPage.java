package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.naming.Name;

public class AddRecruitmentVacanciesPage extends Base {

    public AddRecruitmentVacanciesPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Recruitment']")
    WebElement elementRecruitment;
    @FindBy(xpath = "//a[text()='Vacancies']")
    WebElement elementVacancies;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addButton;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input")
    WebElement inputVacancyName;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div[2]/textarea")
    WebElement inputDescription;
    @FindBy(xpath = "//div[@class='oxd-select-text-input']")
    WebElement elementJobTitle;
    @FindBy(xpath = "//span[text()='Software Engineer']")
    WebElement selectAccountAssistant;
    @FindBy(xpath = "//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")
    WebElement inputHiringManager;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div[2]/div/div/div/div[2]/input")
    WebElement numberOfPosition;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/label/span")
    WebElement inputActiveButton;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div/label/span")
    WebElement inputPublishInRssAndWeb;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
    WebElement SaveButton;
    @FindBy(xpath = "//span[text()='Required']")
    WebElement requiredMSG;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div")
   WebElement JobTitleElement;

    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
    WebElement SearchButton;
    @FindBy(xpath = "//span[text()='Chief Executive Officer']")
    WebElement selectAutomatonTester;


    public void ClickOnRecruitment() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Recruitment']")));
        clickOnElement(elementRecruitment);
    }

    public void ClickOnVacanciesElement() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Vacancies']")));
        clickOnElement(elementVacancies);
    }

    public void ClickOnAddButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
        clickOnElement(addButton);
    }

    public void enterVacancyName(String name) throws InterruptedException {
        Thread.sleep(3000);
        inputVacancyName.sendKeys("Fozzi");
    }

    public void enterDescription(String text) throws InterruptedException {
        Thread.sleep(3000);
        inputDescription.sendKeys("doing all financial transactions");
    }

    public void ClickOnJobTitle() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-select-text-input']")));
        clickOnElement(elementJobTitle);
    }

    public void ClickOnAccountAssistant() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Software Engineer']")));
        selectAccountAssistant.click();
    }

    public void enterHiringManager(String name) throws InterruptedException {
        Thread.sleep(3000);
        inputHiringManager.isDisplayed();
        // sendKeys("Rahul Das");
    }

    public void enterNumberOfPosition(int n) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div[2]/div/div/div/div[2]/input")));
        clickOnElement(numberOfPosition);
    }

    public void ClickOnActiveCheckBox() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/label/span")));
        inputActiveButton.click();
    }

    public void ClickOnPublishRssAndWeb() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div/label/span")));
        inputPublishInRssAndWeb.click();
    }

    public void ClickOnSaveButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")));
        clickOnElement(SaveButton);
    }

    public boolean isRequiredMSGDisplay() {
        wait.until(ExpectedConditions.visibilityOf(requiredMSG));
        return requiredMSG.isDisplayed();
    }
    public void ClickOnSelectJobTitle(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div")));
        clickOnElement(JobTitleElement);
    }
    public void SelectAutomatonTester(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Chief Executive Officer']")));
        selectAutomatonTester.click();
    }

    public void ClickOnSearchButton() throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")));
        Thread.sleep(3000);
        clickOnElement(SearchButton);
    }
}




