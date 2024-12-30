package system;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddAdminQualificationPage;
import pages.AddRecruitmentCandidatePage;
import pages.HomePage;

public class AddAdminQualificationTest extends Base {
    HomePage homePage;
    AddAdminQualificationPage addAdminQualificationPage;
String EducationLevel ="(5) Records Found";
    // String validUsername = "Admin";
    // String validPassword = "admin123";
    @Test
    public void ValidAddQualificationTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.doLogin("Admin", "admin123");
        AddAdminQualificationPage addAdminQualificationPage = new AddAdminQualificationPage();
        logger.info("Click On Admin Element");

        addAdminQualificationPage.ClickOnAdminElement();
        logger.info("Click On Qualifications");
        Thread.sleep(3000);
        addAdminQualificationPage.ClickOnQualification();
        logger.info("Select Education");
        addAdminQualificationPage.ClickOnEducation();
        logger.info("Click On Add Button");
        addAdminQualificationPage.ClickOnAddButton();
        logger.info("Enter Education Level");
        String Education= "High School";
        Thread.sleep(3000);
        addAdminQualificationPage.enterEducationLevel("High School");
        logger.info("Click On Save Button");
        Thread.sleep(3000);
        addAdminQualificationPage.clickOnSaveButton();
        Thread.sleep(3000);
        Assert.assertEquals(EducationLevel,"(5) Records Found");
    }
    @Test
    public void InvalidAddQualificationEducationLevel() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.doLogin("Admin", "admin123");
        AddAdminQualificationPage addAdminQualificationPage = new AddAdminQualificationPage();
        logger.info("Click On Admin Element");
        addAdminQualificationPage.ClickOnAdminElement();
        logger.info("Click On Qualifications");
        Thread.sleep(3000);
        addAdminQualificationPage.ClickOnQualification();
        logger.info("Select Education");
        addAdminQualificationPage.ClickOnEducation();
        logger.info("Click On Add Button");
        addAdminQualificationPage.ClickOnAddButton();
       // logger.info("Enter Education Level");
//        String Education= "High School";
//        Thread.sleep(3000);
//        addAdminQualificationPage.enterEducationLevel("High School");
//        Thread.sleep(3000);
//        addAdminQualificationPage.enterEducationLevel("High School");
        logger.info("Click On Save Button");
        Thread.sleep(3000);
        addAdminQualificationPage.clickOnSaveButton();
        Thread.sleep(3000);
        Assert.assertTrue(homePage.isRequiredMSGDisplay());

    }
}
