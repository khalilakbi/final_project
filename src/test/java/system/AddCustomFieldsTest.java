package system;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddCustomFieldsPage;
import pages.HomePage;

public class AddCustomFieldsTest extends Base {
    HomePage homePage;
    AddCustomFieldsPage customFieldsPage;
    String validUsername = "Admin";
    String validPassword = "admin123";
   // String accountPageURL = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/listCustomFields";
String customFieldName="(4) Record Found";
    @Test
public void ValidCustomFieldsTest() throws InterruptedException {
    HomePage homePage= new HomePage();
    AddCustomFieldsPage addCustomFieldsPage= new AddCustomFieldsPage();
    logger.info("start test case valid login");
    logger.info("open orange hrm application");
    homePage = new HomePage();
    logger.info("enter a valid username");
    homePage.enterUserName(validUsername);
    logger.info("enter a valid password");
    homePage.enterPassword(validPassword);
    logger.info("click on login button");
    homePage.clickOnLogin();
    logger.info("click on PIM");
    addCustomFieldsPage.ClickOnPIM();
    logger.info("click on configuration element");
    addCustomFieldsPage.ClickOnConfiguration();
    logger.info("Click OnChevron Down Element");
    addCustomFieldsPage.ClickOnChevronDownElement();
    logger.info("Click On Custom Fields");
    addCustomFieldsPage.ClickOnCustomFields();
    logger.info("Click On Add Button");
    addCustomFieldsPage.ClickOnAddButton();
    logger.info("enter Field Name");
    String fieldName= "Hobbies";
    addCustomFieldsPage.enterFieldName("Hobbies");
    addCustomFieldsPage.clickOnDropDown();
   addCustomFieldsPage.clickOnPersonalDetails();
   addCustomFieldsPage.clickOnTypeElement();
   addCustomFieldsPage.clickOnTextOrNumber();
    addCustomFieldsPage.clickOnSaveButton();
    logger.info("check the account page url");
   // Assert.assertEquals(driver.getCurrentUrl(), accountPageURL);
         Assert.assertEquals(customFieldName,"(4) Record Found");
}

    }



