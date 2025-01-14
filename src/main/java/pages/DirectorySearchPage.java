package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DirectorySearchPage extends Base {
    public DirectorySearchPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Directory']")
    WebElement directoryButton;
    @FindBy(css = "input[placeholder='Type for hints...']")
    WebElement inputEmployeeName;
    @FindBy(xpath = "//button[text()=' Search ']")
    WebElement searchButton;
    @FindBy(xpath = "//span[text()='Invalid']")
    WebElement invalidMessage;
    @FindBy(xpath = "(//div[text()='-- Select --'])[1]")
    WebElement clickOnJobTitle;
    @FindBy(xpath = "//div[text()='Chief Financial Officer']")
    WebElement optionChiefFinancialOfficer;
//    @FindBy(xpath = "//span[text()='(1) Record Found']")
//    WebElement oneRecordFoundMessage;

    public void clickOnDirectory() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Directory']")));
        clickOnElement(directoryButton);
    }

    public void enterEmployeeName(String employeeName) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[placeholder='Type for hints...']")));
        typeText(inputEmployeeName, employeeName);
    }

    public void clickOnSearch() {
        clickOnElement(searchButton);
    }


    //
//    public boolean isRecordFoundDisplayed() {
//        wait.until(ExpectedConditions.visibilityOf(oneRecordFoundMessage));
//        return oneRecordFoundMessage.isDisplayed();
//    }
    public boolean isInvalidMsgDisplay() {
        wait.until(ExpectedConditions.visibilityOf(invalidMessage));
        return invalidMessage.isDisplayed();
    }

    public void clickJobTitle() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[text()='-- Select --'])[1]")));
        clickOnJobTitle.click();
    }
//    public void jobTitleChiefFinancialOfficer(){
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='Chief Financial Officer']")));
//        optionChiefFinancialOfficer.click();
//
//    }

}



