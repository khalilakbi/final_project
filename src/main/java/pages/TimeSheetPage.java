package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TimeSheetPage extends Base {

    public TimeSheetPage() {PageFactory.initElements(driver, this);}

@FindBy(xpath = "//span[text()='Time']")
    WebElement elementTime;
@FindBy(xpath = "//span[@class='oxd-topbar-body-nav-tab-item']")
    WebElement timesheets;
    @FindBy(xpath = "//a[text()='My Timesheets']")
    WebElement MyTimesheets;
@FindBy(xpath = "//input[@placeholder='yyyy-dd-mm']")
WebElement EnterDate;



public void ClickOnTime(){
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Time']")));
    clickOnElement(elementTime);
}
public void ClickOnTimeSheet(){
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item']")));
    clickOnElement(timesheets);
}
    public void SelectTimesheets() {
        wait.until((ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='My Timesheets']"))));
        clickOnElement(MyTimesheets);
    }
    public void ClickInInput(){
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='yyyy-dd-mm']")));
        clickOnElement(EnterDate);


    }
}
