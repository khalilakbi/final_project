package system;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddAdminNationalitiesPage;
import pages.HomePage;

public class AddAdminNationalitiesTest extends Base {
    HomePage homePage;
    AddAdminNationalitiesPage addAdminNationalitiesPage;
    String NationalityName ="(194) Records Found";

    @Test
    public void ValidAddNationalitiesTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.doLogin("Admin", "admin123");
    AddAdminNationalitiesPage addAdminNationalitiesPage =new AddAdminNationalitiesPage();
    logger.info("Click On Admin Element");
    addAdminNationalitiesPage.ClickOnAdminElement();
    logger.info("Click On Nationalities Element");
    addAdminNationalitiesPage.ClickOnNationalities();
    logger.info("Click On Add Button");
    addAdminNationalitiesPage.ClickOnAddButton();
        logger.info("Enter Nationality Name");
        String Nationality= "AlgeriaTest";
        Thread.sleep(3000);
        addAdminNationalitiesPage.enterNationalityName("AlgeriaTest");
        logger.info("Click On Save Button");
        Thread.sleep(3000);
        addAdminNationalitiesPage.clickOnSaveButton();
        Thread.sleep(3000);
        Assert.assertEquals(NationalityName,"(194) Records Found");
    }
    @Test
    public void InvalidAddNationalityTest() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.doLogin("Admin", "admin123");
        AddAdminNationalitiesPage addAdminNationalitiesPage =new AddAdminNationalitiesPage();
        logger.info("Click On Admin Element");
        addAdminNationalitiesPage.ClickOnAdminElement();
        logger.info("Click On Nationalities Element");
        addAdminNationalitiesPage.ClickOnNationalities();
        logger.info("Click On Add Button");
        addAdminNationalitiesPage.ClickOnAddButton();
//        logger.info("Enter Nationality Name");
//        String Nationality= "AlgeriaTest";
//        Thread.sleep(3000);
       // addAdminNationalitiesPage.enterNationalityName("AlgeriaTest");
        logger.info("Click On Save Button");
        Thread.sleep(3000);
        addAdminNationalitiesPage.clickOnSaveButton();
        Thread.sleep(3000);
        Assert.assertTrue(homePage.isRequiredMSGDisplay());

    }
}
