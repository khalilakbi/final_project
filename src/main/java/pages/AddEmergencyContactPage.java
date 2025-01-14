package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddEmergencyContactPage extends Base {
    public AddEmergencyContactPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[text()='My Info']")
    WebElement clickMyInfo;
    @FindBy(xpath = "//a[text()='Emergency Contacts']")
    WebElement clickEmergencyContacts;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")
    WebElement clickAddButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")
    WebElement inputEmergencyContactName;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")
    WebElement inputEmergencyContactRelationship;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")
    WebElement emergencyContactHomeTelephone;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnSaveButton;


    public void ClickOnMyInfo() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='My Info']")));
        clickOnElement(clickMyInfo);
    }

    public void ClickOnEmergencyContacts() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='Emergency Contacts']")));
        clickOnElement(clickEmergencyContacts);
    }

    public void ClickOnAddButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")));
        clickOnElement(clickAddButton);
    }

    public void enterEmergencyContactName(String emergencyContactName) {
        wait.until(ExpectedConditions.visibilityOfAllElements(inputEmergencyContactName));
        typeText(inputEmergencyContactName, emergencyContactName);
    }

    public void enterEmergencyContactRelationship(String emergencyContactRelationship) {
        wait.until(ExpectedConditions.visibilityOfAllElements(inputEmergencyContactRelationship));
        typeText(inputEmergencyContactRelationship, emergencyContactRelationship);
    }

    public void enterEmergencyContactHomeTelephone(String homeTelephone) {
        wait.until(ExpectedConditions.visibilityOfAllElements(emergencyContactHomeTelephone));
        typeText(emergencyContactHomeTelephone, homeTelephone);
    }

    public void clickSaveButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
        clickOnElement(clickOnSaveButton);
    }

}
