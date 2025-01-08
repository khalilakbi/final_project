package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddRecruitmentCandidatePage extends Base {

    public AddRecruitmentCandidatePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Recruitment']")
    WebElement elementRecruitment;
    @FindBy(xpath = "//li[@class='oxd-topbar-body-nav-tab --visited']")
    WebElement elementCandidates;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")
    WebElement elementJobTitleDropDown;
    @FindBy(xpath ="//input[@placeholder='From']" )
    WebElement inputDate;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[3]/div/div[2]/div")
    WebElement nextButton;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[3]/div/div[2]/div")
    WebElement currentMonthYear;



    public void ClickOnRecruitment() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Recruitment']")));
        clickOnElement(elementRecruitment);
    }

    public void ClickOnCandidates() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='oxd-topbar-body-nav-tab --visited']")));
        clickOnElement(elementCandidates);
    }

    public void ClickOnSelectJobTitle() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")));
        clickOnElement(elementJobTitleDropDown);
    }
    public void ClickOnDateFrom(String givenMonthYear){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='From']")));
        inputDate.click();
        while (!givenMonthYear.equals(currentMonthYear.getText().contains("March 2025"))){
            nextButton.click();
        }
    }
}



