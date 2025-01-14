package system;

import base.Base;
import org.testng.annotations.Test;
import pages.AddEmergencyContactPage;
import pages.HomePage;

import static java.lang.Thread.sleep;

public class AddEmergencyContactTest extends Base {
    HomePage homePage;
    String validUsername = "Admin";
    String validPassword = "admin123";
    String emergencyContactName = "amine";
    String emergencyContactRelationship = "spouse";
    String emergencyContactHomeTelephone = "6105643781";

    @Test
    public void AddEmergencyContact() throws InterruptedException {
        HomePage homePage = new HomePage();
        AddEmergencyContactPage addEmergencyContactPage = new AddEmergencyContactPage();

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
        addEmergencyContactPage.ClickOnMyInfo();
        logger.info("click on Emergency Contacts");
        addEmergencyContactPage.ClickOnEmergencyContacts();

        logger.info("click on Add Button");
        addEmergencyContactPage.ClickOnAddButton();

        logger.info("enter emergency contact name");
        addEmergencyContactPage.enterEmergencyContactName(emergencyContactName);

        logger.info("enter emergency contact relationship");
        addEmergencyContactPage.enterEmergencyContactRelationship(emergencyContactRelationship);
        logger.info("enter emergency contact home telephone");
        addEmergencyContactPage.enterEmergencyContactHomeTelephone(emergencyContactHomeTelephone);
        logger.info("click on save button");
        addEmergencyContactPage.clickSaveButton();


    }


}
