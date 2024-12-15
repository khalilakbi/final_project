package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddCustomFieldsPage extends Base {

    public AddCustomFieldsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='PIM']")
    WebElement elementPIM;
    @FindBy(xpath = "//span[@class='oxd-topbar-body-nav-tab-item']")
    WebElement configurationElement;
    @FindBy(xpath = "//i[@class = 'oxd-icon bi-chevron-down']")
    WebElement chevronDownElement;
    @FindBy(xpath = "//a[text()='Custom Fields']")
    WebElement customFields;
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
    WebElement addButton;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/input")
    WebElement inputFieldName;
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-select-text oxd-select-text--active']")
    WebElement dropdown;
    @FindBy(xpath = "//span[text()='Personal Details']")
    WebElement selectPersonalDetails;
    @FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters organization-name-container']//div[@class='oxd-select-text oxd-select-text--active']")
    WebElement dropDownType;
    @FindBy(xpath = "//span[text()='Text or Number']")
    WebElement selectTextOrNumber;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement saveButton;
    @FindBy(xpath = "//span[text()='Required']")
    WebElement requiredMSG;


    public void ClickOnPIM() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='PIM']")));
        clickOnElement(elementPIM);
    }

    public void ClickOnConfiguration() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item']")));
        clickOnElement(configurationElement);
    }

    public void ClickOnChevronDownElement() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[@class = 'oxd-icon bi-chevron-down']")));
        clickOnElement(chevronDownElement);

    }

    public void ClickOnCustomFields() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Custom Fields']")));
        clickOnElement(customFields);
    }

    public void ClickOnAddButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
        clickOnElement(addButton);
    }

    public void enterFieldName(String name) throws InterruptedException {

        // wait.until(ExpectedConditions.visibilityOf();
        Thread.sleep(3000);
        // enterText(inputFieldName,"Hobbies");
        inputFieldName.sendKeys("Hobbies");
    }

    // private void enterText(WebElement inputFieldName, String name) {


    //  }

    public void clickOnDropDown() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-select-text oxd-select-text--active']")));
        clickOnElement(dropdown);
    }

    public void clickOnPersonalDetails() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Personal Details']")));
        selectPersonalDetails.click();

    }

    public void clickOnTypeElement() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters organization-name-container']//div[@class='oxd-select-text oxd-select-text--active']")));
        clickOnElement(dropDownType);
    }

    public void clickOnTextOrNumber() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Text or Number']")));
        selectTextOrNumber.click();
    }

    public void clickOnSaveButton() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
        clickOnElement(saveButton);
    }

    public boolean isRequiredMSGDisplay() {
        wait.until(ExpectedConditions.visibilityOf(requiredMSG));
        return requiredMSG.isDisplayed();
    }
}





