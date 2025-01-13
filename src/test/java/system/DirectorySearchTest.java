package system;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DirectorySearchPage;
import pages.HomePage;

import java.util.List;


public class DirectorySearchTest extends Base {
    String invalidEmployeeName = "abcd";

    @Test
    public void searchWithInvalidEmployeeName() throws InterruptedException {
        DirectorySearchPage directorySearchPage = new DirectorySearchPage();
        HomePage homePage = new HomePage();
        homePage.doLogin("Admin", "admin123");
        directorySearchPage.clickOnDirectory();
        directorySearchPage.enterEmployeeName(invalidEmployeeName);
        directorySearchPage.clickOnSearch();
        Assert.assertTrue(directorySearchPage.isInvalidMsgDisplay());
    }

    @Test
    public void verifySearchWithJobTitle() throws InterruptedException {
        DirectorySearchPage directorySearchPage = new DirectorySearchPage();
        HomePage homePage = new HomePage();
        homePage.doLogin("Admin", "admin123");
        directorySearchPage.clickOnDirectory();
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        WebElement clickJobTitle = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
        actions.moveToElement(clickJobTitle).perform();
        directorySearchPage.clickJobTitle();
        Thread.sleep(2000);
       //        Thread.sleep(3000);
        // WebElement option =driver.findElement(By.xpath("//div[text()='-- Select --'])[1]//div[text()='Chief Financial Officer']"));
////        directorySearchPage.jobTitleChiefFinancialOfficer();
        Thread.sleep(3000);
        directorySearchPage.clickOnSearch();
    }
    @Test
    public void verifySearchWithLocation(){
        DirectorySearchPage directorySearchPage = new DirectorySearchPage();
        HomePage homePage = new HomePage();
        homePage.doLogin("Admin", "admin123");
        directorySearchPage.clickOnDirectory();

    }

}
