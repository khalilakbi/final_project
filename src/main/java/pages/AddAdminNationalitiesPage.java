package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddAdminNationalitiesPage extends Base {
    public AddAdminNationalitiesPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Admin']")
    WebElement AdminElement;
    @FindBy(xpath = "//a[text()='Nationalities']")
    WebElement NationalitiesElement;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addButton;
    @FindBy(xpath = "//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")
    WebElement inputNationalityName;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement SaveButtonElement;
    @FindBy(xpath = "//span[text()='Required']")
    WebElement requiredMSG;




    public void ClickOnAdminElement() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Admin']")));
        clickOnElement(AdminElement);
    }

    public void ClickOnNationalities() {
        // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='--active oxd-topbar-body-nav-tab --parent']//span[@class='oxd-topbar-body-nav-tab-item']")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Nationalities']")));
        clickOnElement(NationalitiesElement);
    }
    public void ClickOnAddButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
        clickOnElement(addButton);
    }
    public void enterNationalityName(String Nationality){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")));
        inputNationalityName.sendKeys("AlgeriaTest");
    }
    public void clickOnSaveButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
        clickOnElement(SaveButtonElement);
    }
    public boolean isRequiredMSGDisplay() {
        wait.until(ExpectedConditions.visibilityOf(requiredMSG));
        return requiredMSG.isDisplayed();
    }
}





