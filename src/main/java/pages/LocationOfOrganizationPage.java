package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LocationOfOrganizationPage extends Base {
    public LocationOfOrganizationPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Admin']")
    WebElement AdminElement;
    @FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span")
    WebElement Oraganizations;
    @FindBy(xpath = "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[2]/a")
    WebElement Locations;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
    WebElement inputOrganizationName;
    @FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")
    WebElement enterCity;
    @FindBy(xpath = "//div[@class='oxd-select-text-input' ]")
    WebElement SelectCountry;
    @FindBy(xpath = "//div[text()='United States']")
    WebElement clickUnitedSates;
    @FindBy(xpath = "//button[text()=' Search ']")
    WebElement ClickSearchButton;



   public void ClickOnAdmin() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Admin']")));
        clickOnElement(AdminElement);
    }
    public void ClickOrganizations(){
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span")));
       clickOnElement(Oraganizations);
    }
    public void SelectLocations(){
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[2]/a")));
       clickOnElement(Locations);
    }
    public void InputOraganizationName(String name){
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")));
       inputOrganizationName.sendKeys("New York Sales Office");
   }
   public void InputCity(String name){
   enterCity.sendKeys("New York");
   }
   public void SelectCountry(){
       clickOnElement(SelectCountry);
   }
   public void ClickUnitedStates(){
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='United States']")));
       clickOnElement(clickUnitedSates);
   }
   public void ClickSearch(){
       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()=' Search ']")));
       clickOnElement(ClickSearchButton);
   }
}