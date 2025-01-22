package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddDependentsPage extends Base {
    public AddDependentsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='My Info']")
    WebElement clickMyInfo;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[4]/a")
    WebElement clickDependents;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")
    WebElement clickAddButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
    WebElement inputDependentsName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")
    WebElement inputDependentsRelationship;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div/div/div[2]/div/div/input")
    WebElement inputDependentsDOB;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnSaveButton;
    @FindBy(xpath = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewDependents/empNumber/7")
    WebElement requiredMSG;


    public void ClickOnMyInfo() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='My Info']")));
        clickOnElement(clickMyInfo);
    }

    public void ClickOnDependents() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[4]/a")));
        clickOnElement(clickDependents);
    }

    public void ClickOnAddButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")));
        clickOnElement(clickAddButton);
    }

    public void enterDependentsName(String dependentsName) {
        wait.until(ExpectedConditions.visibilityOfAllElements(inputDependentsName));
        typeText(inputDependentsName, dependentsName);
    }

    public void enterDependentsRelationship(String dependentsRelationship) {
        wait.until(ExpectedConditions.visibilityOfAllElements(inputDependentsRelationship));
        typeText(inputDependentsRelationship, dependentsRelationship);
    }

    public void enterDependentsDOB(String dependentsDOB) {
        wait.until(ExpectedConditions.visibilityOfAllElements(inputDependentsDOB));
        typeText(inputDependentsDOB, dependentsDOB);
    }

    public void clickSaveButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
        clickOnElement(clickOnSaveButton);
    }

    public boolean isRequiredMSGDisplay() {
        wait.until(ExpectedConditions.visibilityOf(requiredMSG));
        return requiredMSG.isDisplayed();
    }
}
