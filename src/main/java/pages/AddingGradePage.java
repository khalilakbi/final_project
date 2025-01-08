package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddingGradePage extends Base {
    public AddingGradePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Admin']")
    WebElement AdminElement;
    @FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")
    WebElement Dropdown;
    @FindBy(xpath = "//a[text()='Pay Grades']")
    WebElement PayGrades;
    @FindBy(xpath = "//i[@class='oxd-icon bi-plus oxd-button-icon']")
    WebElement clickAdd;
    @FindBy(xpath = "//input[@class='oxd-input oxd-input--active']")
    WebElement enterGradeName;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickSave;

    public void ClickOnAdmin() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Admin']")));
        clickOnElement(AdminElement);
    }

    public void ClickDropDown() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")));
        clickOnElement(Dropdown);
    }

    public void SelectPayGrades() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Pay Grades']")));
        clickOnElement(PayGrades);
    }

    public void ClickAddButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")));
        clickOnElement(clickAdd);
    }

    public void InputGradeName(String name) throws InterruptedException {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='oxd-input oxd-input--active']")));
        enterGradeName.sendKeys("grade A");
    }

    public void ClickSaveButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
        clickOnElement(clickSave);
    }
}

