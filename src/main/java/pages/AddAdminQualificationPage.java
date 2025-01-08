package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddAdminQualificationPage extends Base {
    public AddAdminQualificationPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Admin']")
    WebElement AdminElement;
   // @FindBy(xpath = "//li[@class='--active oxd-topbar-body-nav-tab --parent']//span[@class='oxd-topbar-body-nav-tab-item']")
   @FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")
    WebElement QualificationsElement;
   @FindBy(xpath = "//a[text()='Education']")
   WebElement selectEducation;
   @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
   WebElement addButton;
   @FindBy(xpath = "//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")
   WebElement inputEducationLevel;
   @FindBy(xpath = "//button[@type='submit']")
   WebElement SaveButtonElement;
    @FindBy(xpath = "//span[text()='Required']")
    WebElement requiredMSG;





    public void ClickOnAdminElement(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Admin']")));
        clickOnElement(AdminElement);
    }
    public void ClickOnQualification(){
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='--active oxd-topbar-body-nav-tab --parent']//span[@class='oxd-topbar-body-nav-tab-item']")));
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")));
        clickOnElement(QualificationsElement);
    }
    public void ClickOnEducation(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Education']")));
        selectEducation.click();
    }
    public void ClickOnAddButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
        clickOnElement(addButton);
    }
    public void enterEducationLevel(String level){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-form-row']//input[@class='oxd-input oxd-input--active']")));
        inputEducationLevel.sendKeys("High School");
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
