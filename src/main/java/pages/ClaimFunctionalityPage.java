package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ClaimFunctionalityPage extends Base {

    public ClaimFunctionalityPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='oxd-main-menu-item active']")
    WebElement claimElement;
    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[11]")
    WebElement clickMyClaims;
    @FindBy(xpath = "//a[text()='Employee Claims']")
    WebElement employeeClaims;
    @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
    WebElement inputReferenceId;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchButton;
    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span'])[1]")
    WebElement oneRecordFoundMessage;
    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span'])[1]")
    WebElement noRecordFoundMessage;
    @FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[1]")
    WebElement inputFromDate;
    @FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[2]")
    WebElement inputToDate;
    @FindBy(xpath = "//span[text()='To date should be after from date']")
    WebElement toDateShouldBeAfterFromDateMessage;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement searchButtonDateVerification;
    @FindBy(xpath = "(//span[@class='oxd-text oxd-text--span'])[1]")
    WebElement recordFoundMessage;


    public void clickClaimFunction() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='oxd-main-menu-item active']")));
        clickOnElement(claimElement);
    }

    public void myClaims() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[11]")));
        clickOnElement(clickMyClaims);
    }

//    public void clickEmployeeClaims() {
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Employee Claims']")));
//        clickOnElement(employeeClaims);
//    }

    public void enterReferenceId(String referenceId) {
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(input[@placeholder='Type for hints...'])[1]")));
        typeText(inputReferenceId, referenceId);

    }

    public void clickSearchButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
        clickOnElement(searchButton);
    }

    public boolean isOneRecordFoundMessageDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(oneRecordFoundMessage));
        return oneRecordFoundMessage.isDisplayed();
    }

    public boolean isNoRecordFoundMessageDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(noRecordFoundMessage));
        return noRecordFoundMessage.isDisplayed();
    }
    public void enterFormDate(String formDate) {
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//(//input[@placeholder='yyyy-dd-mm'])[1]")));
        typeText(inputFromDate, formDate);
    }

    public void enterToDate(String toDate) {
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@placeholder='yyyy-dd-mm'])[2]")));
        typeText(inputToDate, toDate);
    }
    public boolean toDateShouldBeAfterFromDateDisplay(){
//        //wait.until(ExpectedConditions.visibilityOf(toDateShouldBeAfterFromDateMessage));
        return toDateShouldBeAfterFromDateMessage.isDisplayed();
    }
    public void clickSearchButtonDateVerification() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
        clickOnElement(searchButtonDateVerification);
    }
    public boolean isRecordFoundMessageDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(recordFoundMessage));
        return recordFoundMessage.isDisplayed();
    }

}

