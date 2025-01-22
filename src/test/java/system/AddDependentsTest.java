package system;

import base.Base;
import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddDependentsPage;
import pages.HomePage;

public class AddDependentsTest extends Base {
    HomePage homePage;
    String validUsername = "Admin";
    String validPassword = "admin123";
    String dependentsName = "Aris";
    String dependentsRelationship = "child";
    String dependentsDOB = "2021-26-07";
    String accountPageURL = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewDependents/empNumber/7";

    @Test
    public void AddDependents() throws InterruptedException {
        HomePage homePage = new HomePage();
        AddDependentsPage addDependentsPage = new AddDependentsPage();


        logger.info("start test case valid login");
        logger.info("open orange hrm application");
        homePage = new HomePage();
        logger.info("enter a valid username");
        homePage.enterUserName(validUsername);
        logger.info("enter a valid password");
        homePage.enterPassword(validPassword);
        logger.info("click on login button");
        homePage.clickOnLogin();
        logger.info("click on My Info");
        addDependentsPage.ClickOnMyInfo();
        logger.info("click on Dependents");
        addDependentsPage.ClickOnDependents();
        logger.info("click on Add Button");
        addDependentsPage.ClickOnAddButton();
        logger.info("enter dependents name");
        addDependentsPage.enterDependentsName(dependentsName);
        logger.info("enter dependents relationship");
        addDependentsPage.enterDependentsRelationship(dependentsRelationship);
        logger.info("enter dependents dob");
        addDependentsPage.enterDependentsDOB(dependentsDOB);
        logger.info("click on save button");
        addDependentsPage.clickSaveButton();
        Assert.assertEquals(driver.getCurrentUrl(), accountPageURL);
        logger.info("end test case valid login");
    }

}